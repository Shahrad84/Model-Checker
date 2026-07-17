grammar Hash;

program: (statement)* EOF;

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
    : 'adad'
    | 'boole'
    ;

ifStatement
    : 'age' '(' expression ')' 'bood' '{' statement* '}' 
      ('vagarna' '{' statement* '}')?
    ;

whileLoop
    : 'ta' '(' expression ')' '{' statement* '}'
    ;

edameStatement
    : 'edame'
    ;

shekanStatement
    : 'shekan'
    ;

printStatement
    : 'print' '(' expression ')'
    ;

expression
    : IDENTIFIER
    | NUMBER
    | expression op=('*'|'/') expression
    | expression op=('+'|'-') expression
    | expression op=('<'|'>'|'=='|'!=') expression
    | '(' expression ')'
    ;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;