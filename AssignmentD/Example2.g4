
grammar Example2;

start2 :  (main|functionDef) + EOF;

// rules
stat		:   loop  	
			| funcCall        
			|   expr    
    			|   assign
    			|   print
			|   ifStat
			|   rtrn
			
   			 ;
main		:   MAIN BEGINFunc stat(stat)* ENDFunc;
functionDef     :   FUNC ID BEGINPAREN formalPars ENDPAREN block;
block		:   BEGINFunc stat(stat)* ENDFunc;
formalPars	:    ID*(COMMA ID)* ;
actualPars	:   expr*(COMMA expr)*;
loop		:   WHILE expr DO BEGINFunc stat(stat)* ENDFunc;
ifStat		:   IF expr THEN thenBlock (ELSE elseBlock)? FI;
thenBlock	:   BEGINFunc* stat(stat)* ENDFunc*;
elseBlock	:   BEGINFunc* stat(stat)* ENDFunc*;
print		:   PRINT  expr;
assign		:   ID EQUAL expr;
rtrn		:   RETURN expr;
funcCall	:	ID BEGINPAREN actualPars ENDPAREN;
expr		:   funcCall					#  FunctionCall			
			|   expr op=(MUL|DIV) expr         			        #  MulDiv
    			|   expr op=(ADD|SUB) expr 	        			#  AddSub
    			|   BEGINPAREN  expr ENDPAREN      				#  parens                     
			|   expr op=( GTEquals | LTEquals | BIGGER | SMALLER ) expr   	#  compareExpr
 			|   expr op=( Equals | NEquals ) expr                  		#  equalCheckExpr		
			|   expr AND expr           					#  andExpr
 			|   expr OR expr            					#  orExpr
    			|   INT        						        #  int
			|   TRUE							#  true
			|   FALSE							#  false
			|   TEXT 							#  text
    			|   ID           						#  id
   			;

// tokens
FUNC	   : 'func';
BEGINFunc  : '{';
ENDFunc    : '}';
RETURN	   : 'return';
MAIN	   : 'Main()';	
COMMA	   : ',';
PRINT	   : 'print';
WHILE	   : 'while';
IF	   : 'if';
THEN	   : 'then';
ELSE	   : 'else';
FI	   : 'fi';
DO	   : 'do';
MUL        : '*';
DIV        : '/';
ADD        : '+';
SUB	   : '-';
TRUE       : 'true';
FALSE      : 'false';
BEGINPAREN : '(';
ENDPAREN   : ')';
EQUAL      : '=';
ID	   :  [_A-Za-z][A-Za-z_!0-9.]* ; 
INT        : [0-9]+ ;
WS         : [ \t\r\n]+ -> skip;
Equals     : '==';
NEquals    : '!=';
GTEquals   : '>=';
LTEquals   : '<=';
OR         : '||';
AND        : '&&';
BIGGER     : '>';
SMALLER    : '<';
TEXT	   : '"' ~('\r' | '\n' | '"')* '"';


