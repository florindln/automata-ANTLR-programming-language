
grammar MyGrammar;

myStart:  checkSatResponse checkModelResponse EOF;

// rules


checkSatResponse    : SAT | UNSAT;
checkModelResponse  : BEGINPARENS MODEL modelResponse* ENDPARENS;
modelResponse       : BEGINPARENS DEFINE_FUN functionDef ENDPARENS #funcModResp
                    | BEGINPARENS DEFINE_FUN_REC functionDef ENDPARENS #recFuncModResp
                    ;
functionDef         : ID fParams fRetValue fValues;
fParams             : BEGINPARENS fParam* ENDPARENS;
fParam              : BEGINPARENS ID type ENDPARENS;
type                : INT|BOOL|STRING;
fRetValue           : type;
fValues             : expr;
value               : TRUE | FALSE #boolValue
                    | NUMBER        #numberValue
                    | TEXT          #testValue
                    ;

expr                : BEGINPARENS ITE expr expr expr  ENDPARENS #ITEexpr
					| BEGINPARENS LET BEGINPARENS varBind+ ENDPARENS expr ENDPARENS #letExpr
                    | value  #valueExpr
                    | BEGINPARENS ID expr+ ENDPARENS # funExpr
                    | BEGINPARENS AND  eqExpr+ ENDPARENS #andExpr
                    | eqExpr #eqExprLbl
                    |  BEGINPARENS NOT expr ENDPARENS #notExpr
                    | BEGINPARENS OR expr+ ENDPARENS #orExpr 
                    | BEGINPARENS GE expr expr ENDPARENS #geExpr 
                    | BEGINPARENS LE expr expr ENDPARENS #leExpr
                    | BEGINPARENS PLUS expr+ ENDPARENS #plusExpr
					| BEGINPARENS expr+ ENDPARENS #moreExpr
					| expr DOUBLEPLUS expr* #doublePlusExpr
                    | BEGINPARENS MINUS expr+ ENDPARENS #minusExpr
                    | id         #idExpr
                    ;
varBind		    	: BEGINPARENS id expr ENDPARENS;
id                  : ID;
eqExpr              : BEGINPARENS EQUAL ID value ENDPARENS #eqPExpr
                    | BEGINPARENS EQUAL expr expr ENDPARENS  #eqOExpr
                    ;


//tokens

MODEL			:	'model';
BOOL            :'Bool';
INT			    :	'Int';
LET				: 'let';
TRUE            :'true';
FALSE           :'false';
NUMBER			:	[0-9]+;
STRING          :'String';
TEXT		    : '"' ~('\r' | '\n' | '"')* '"';
ITE             :'ite';
AND             :'and';
EQUAL           :'=';
MINUS           :'-';
PLUS            :'+';
DOUBLEPLUS		:'++';
LE              :'<=';
GE              :'>=';
OR              :'or';
NOT             :'not';
UNSAT           : 'unsat';
SAT			    :	'sat';
DEFINE_FUN_REC :'define-fun-rec';
DEFINE_FUN			:	'define-fun';
ID	    :  [_A-Za-z][A-Za-z_!0-9.]* ; 
BEGINPARENS		:	'(';
ENDPARENS		:	')';
NEWLINE			:	[ \t\r\n]+ -> skip;

//STRING          :[_A-Za-z0-9]; //not sure


