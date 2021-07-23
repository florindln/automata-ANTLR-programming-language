
grammar MyGrammar;

myStart :  stat+ EOF;

// rules
stat:   expr     #otherExpr
    |   ID '=' expr  # assign
    |   'print' expr # printExpr 
    ;
expr:   expr op=(MUL|DIV) expr #  MulDiv
    |   expr op=(ADD|SUB) expr #  AddSub
    |   '(' expr ')'        # parens
    |   INT         # int
    |   ID          # id
    ;

// tokens
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
ID:  [_A-Za-z][A-Za-z_!0-9.]* ; 
INT     : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;