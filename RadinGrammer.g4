grammar RadinGrammer;

// Parser Rules

//program : compilationUnit;

compilationUnit : (ghalamroDeclaration)? (biyavarDeclaration)* topLevelDeclaration* EOF;

ghalamroDeclaration : GHALAMRO packageName SEMICOLON;

packageName : IDENTIFIER (DOT IDENTIFIER)*;

biyavarDeclaration : BIYAVAR importPath SEMICOLON;

importPath : IDENTIFIER (DOT IDENTIFIER)* (DOT MULT)?;

topLevelDeclaration : variableDeclaration | functionDeclaration | classDeclaration;


// Variables

variableDeclaration : type IDENTIFIER (ASSIGN expression)? SEMICOLON;

type
    : SHOMAREH
    | MATN
    | ASHARI
    | BOOLEAN
    | KARAT
    | HARF
    | KHALI
    | VOID
    | IDENTIFIER  // class type
    ;

// Functions

functionDeclaration : BEBIN returnType IDENTIFIER LPAREN parameterList? RPAREN block;
returnType : type | VOID;
parameterList : parameter (COMMA parameter)*;
parameter : type IDENTIFIER;

// Class

classDeclaration : SAKHTAR classBody;
classBody : LBRACE classMember* RBRACE;
classMember : variableDeclaration | methodDeclaration;
methodDeclaration : functionDeclaration;

// Statements

block : LBRACE statement* RBRACE;

statement
    : variableDeclaration
    | assignmentStatement
    | ifStatement
    | whileStatement
    | forStatement
    | switchStatement
    | tryStatement
    | returnStatement
    | breakStatement
    | continueStatement
    | throwStatement
    | ioStatement
    | expressionStatement
    | block
    ;

assignmentStatement : leftHandSide assignmentOperator expression SEMICOLON;

leftHandSide : primary;

assignmentOperator
    : ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    | MULT_ASSIGN
    | DIV_ASSIGN
    ;


ifStatement : AGE LPAREN expression RPAREN BOOD statement (VAGARNA statement)?;


whileStatement : TA_VAGTI LPAREN expression RPAREN statement;


forStatement : GAH LPAREN forInit? SEMICOLON expression? SEMICOLON forUpdate? RPAREN statement;
forInit : variableDeclaration | expressionList;
forUpdate : expressionList;


switchStatement : VAZIYAT LPAREN expression RPAREN LBRACE switchCase* defaultCase? RBRACE;
switchCase : GOZINESH expression COLON statement*;
defaultCase : GHAIR_AZ_IN COLON statement*;


tryStatement : AZMOON block catchClause* finallyClause?;
catchClause : SHIKAR LPAREN exceptionType IDENTIFIER RPAREN block;
exceptionType
    : KHATA_SEFR
    | BIRON_AZ_MARZ
    | POCH_ANDESH
    | KARDAR_NARO
    | IDENTIFIER
    ;
finallyClause : SARANYAM block;


returnStatement : PAS_BEDEH expression? SEMICOLON;

breakStatement : GUZAR SEMICOLON;

continueStatement : GOSTASHT SEMICOLON;

throwStatement : SHALAQ expression SEMICOLON;

ioStatement : printStatement | inputStatement;
printStatement : BENEZIS LPAREN expression RPAREN SEMICOLON;
inputStatement : BEGIR LPAREN type COMMA IDENTIFIER RPAREN SEMICOLON;


expressionStatement : expression SEMICOLON;
// Expressions (with precedence)

expression : assignment;

assignment : leftHandSide assignmentOperator assignment | logicalOr;

logicalOr : logicalAnd (OR logicalAnd)*;

logicalAnd : equality (AND equality)*;

equality : comparison ((EQ | NEQ) comparison)*;

comparison : addition ((LT | GT | LE | GE) addition)*;

addition : multiplication ((PLUS | MINUS) multiplication)*;

multiplication : exponentiation ((MULT | DIV | MOD) exponentiation)*;

exponentiation : unary (POW exponentiation)?;

unary : (PLUS | MINUS) unary | postfix;

postfix : primary (DOT IDENTIFIER | LPAREN argumentList? RPAREN)*;

primary : literal | IDENTIFIER | LPAREN expression RPAREN | objectCreation;

objectCreation : TAZE IDENTIFIER LPAREN argumentList? RPAREN;

argumentList : expression (COMMA expression)*;

expressionList : expression (COMMA expression)*;

literal
    : IntegerLiteral
    | FloatingPointLiteral
    | StringLiteral
    | CharLiteral
    | booleanLiteral
    | KHALI
    ;

booleanLiteral : DOROST | GHALAT;

// Lexer Rules (Tokens)

// ----- Keywords
PAS_BEDEH   : 'pas_bedeh';
BEBIN       : 'bebin';
TAZE        : 'taze';
KHOD        : 'khod';
SAKHTAR     : 'sakhtar';
BIYAVAR     : 'biyavar';
GHALAMRO    : 'ghalamro';
KHALI       : 'khali';
KARAT       : 'karat';
HARF        : 'harf';
MATN        : 'matn';
BOOLEAN     : 'boolean';
ASHARI      : 'ashari';
SHOMAREH    : 'shomareh';
GUZAR       : 'guzar';
GOSTASHT    : 'gostasht';
GAH         : 'gah';
TA_VAGTI    : 'ta_vagti';
VAGARNA     : 'vagarna';
BOOD        : 'bood';
AGE         : 'age';
SHALAQ      : 'shalaq';
SARANYAM    : 'saranyam';
SHIKAR      : 'shikar';
AZMOON      : 'azmoon';
GHAIR_AZ_IN : 'ghair_az_in';
VAZIYAT     : 'vaziyat';
GOZINESH    : 'gozinesh';
BEGIR       : 'begir';
BENEZIS     : 'benezis';
VOID        : 'void';

// Exception type keywords
KHATA_SEFR     : 'KhataSefr';
BIRON_AZ_MARZ  : 'BironAzMarz';
POCH_ANDESH    : 'PochAndesh';
KARDAR_NARO    : 'KardarNaro';

// Boolean literals
DOROST  : 'dorost';
GHALAT  : 'ghalat';

// Logical operators
AND : 'AND';
OR  : 'OR';

// Assignment operators
ASSIGN       : '=';
PLUS_ASSIGN  : '+=';
MINUS_ASSIGN : '-=';
MULT_ASSIGN  : '*=';
DIV_ASSIGN   : '/=';

// Equality and comparison
EQ : '==';
NEQ: '!=';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';

// Arithmetic
PLUS  : '+';
MINUS : '-';
MULT  : '*';
DIV   : '/';
MOD   : '%';
POW   : '**';

// Separators
DOT      : '.';
COMMA    : ',';
SEMICOLON: ';';
COLON    : ':';
LPAREN   : '(';
RPAREN   : ')';
LBRACE   : '{';
RBRACE   : '}';
LBRACK   : '[';
RBRACK   : ']';

// Literals
IntegerLiteral : [0-9]+;

FloatingPointLiteral : [0-9]+ '.' [0-9]+;

StringLiteral : '"' (~["\\\r\n] | '\\' .)* '"';

CharLiteral : '\'' (~['\\\r\n] | '\\' .) '\'';

// Identifiers 
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;

// Comments (skipped)
LINE_COMMENT : '//' ~[\r\n]* -> skip;

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

// Whitespace (skipped)
WS : [ \t\r\n]+ -> skip;

// Catch-all for illegal characters (optional)
ERROR : . -> skip;