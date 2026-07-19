grammar Hash;

program
    : statement* EOF
    ;

statement
    : assignment
    | reassignment
    | ifStatement
    | whileLoop
    | printStatement
    | edameStatement
    | shekanStatement
    ;

assignment
    : type IDENTIFIER '=' expression
    ;

reassignment
    : IDENTIFIER '=' expression
    ;

type
    : ADAD
    | BOOLE
    ;

ifStatement
    : AGE '(' expression ')' BOOD '{' statement* '}'
      (VAGARNA '{' statement* '}')?
    ;

whileLoop
    : TA '(' expression ')' '{' statement* '}'
    ;

edameStatement
    : EDAME
    ;

shekanStatement
    : SHEKAN
    ;

printStatement
    : PRINT '(' expression ')'
    ;


 // Expressions

expression
    : comparison
    ;

comparison
    : addition ( (LT | GT | LE | GE | EQ | NEQ) addition )*
    ;

addition
    : multiplication ( (PLUS | MINUS) multiplication )*
    ;

multiplication
    : primary ( (MUL | DIV) primary )*
    ;

primary
    : NUMBER
    | TRUE
    | FALSE
    | IDENTIFIER
    | '(' expression ')'
    ;

 // Keywords

ADAD      : 'adad';
BOOLE     : 'boole';

AGE       : 'age';
BOOD      : 'bood';
VAGARNA   : 'vagarna';

TA        : 'ta';

EDAME     : 'edame';
SHEKAN    : 'shekan';

PRINT     : 'print';

TRUE      : 'dorost';
FALSE     : 'ghalat';

 // Operators

PLUS : '+';
MINUS: '-';
MUL  : '*';
DIV  : '/';

LT   : '<';
GT   : '>';
LE   : '<=';
GE   : '>=';
EQ   : '==';
NEQ  : '!=';

 // Tokens

IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

NUMBER
    : [0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;