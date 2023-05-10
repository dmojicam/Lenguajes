grammar MiLenguaje;


s                    : routine srecursion EOF |  x routrecursion EOF | EOF;
srecursion           : s  | ;
routrecursion        : routine srecursion    | ;
x                    : types xrecursion   ;
types                : conditional | for | while | ID xp  |goto |built ;
xrecursion           : x | ;
built                : 'Array' bifunction | 'Stack' bifunction |'Program' bifunction |'TextWindow' bifunction ;
bifunction           : TKN_PERIOD ID TKN_LEFT_PAREN paramsp TKN_RIGHT_PAREN ;
params               : TKN_COMMA paramsp |  ;
paramsp              : b params   | params  ;
xp                   : etiq |exec |asig  ;
conditional          : 'If' TKN_LEFT_PAREN b TKN_RIGHT_PAREN 'Then' xorempty ei 'EndIf' ;
ei                   : 'ElseIf' TKN_LEFT_PAREN b TKN_RIGHT_PAREN 'Then' xorempty ei | else;
else                 : 'Else' xorempty | ;
while                : 'While' TKN_LEFT_PAREN b TKN_RIGHT_PAREN xorempty 'EndWhile' ;
for                  : 'For' a 'To' b step xorempty 'EndFor'  ;
step                 : 'Step' d  | ;
etiq                 : TKN_COLON  ;
goto                 : 'Goto' ID    ;
routine              : 'Sub' ID xorempty 'EndSub'     ;
xorempty             : x |  ;
exec                 : TKN_LEFT_PAREN TKN_RIGHT_PAREN   ;
corch                : TKN_LEFT_BRAC b TKN_RIGHT_BRAC memp  ;
mem                  : ID memp ;
memp                 : corch |   ;
a                    : ID asig;
asig                 : corch TKN_EQUALS b | TKN_EQUALS b ;
b                    : c bp;
bp                   : 'And' c bp | 'Or' c bp |  ;
c                    : d cp;
cp                   : TKN_LESS d | TKN_GREATER d |TKN_LEQ d  |TKN_GEQ d |TKN_DIFF d | TKN_EQUALS d | ;
d                    : e dp;
dp                   : TKN_PLUS e dp |TKN_MINUS e dp  |  ;
e                    : f ep;
ep                   : TKN_TIMES f ep  | TKN_DIV f ep |   ;
f                    : TKN_MINUS g | g ;
g                    : mem | built |TKN_NUMBER | TKN_TEXT| TRUE   |FALSE |TKN_LEFT_PAREN b TKN_RIGHT_PAREN ;
TRUE : ["][Tt][Rr][Uu][Ee]["];
FALSE: ["][Ff][Aa][Ll][Ss][Ee]["];
TKN_PERIOD : '.';
TKN_EQUALS : '=';
TKN_COMMA : ',';
TKN_COLON : ':';
TKN_LEFT_BRAC : '[';
TKN_RIGHT_BRAC : ']';
TKN_LEFT_PAREN : '(';
TKN_RIGHT_PAREN : ')';
TKN_PLUS : '+';
TKN_MINUS : '-';
TKN_TIMES : '*';
TKN_DIV : '/';
TKN_DIFF : '<>';
TKN_LESS : '<';
TKN_LEQ : '<=';
TKN_GREATER : '>';
TKN_GEQ : '>=';
TKN_NUMBER : [0-9]+[.]?[0-9]*;
TKN_TEXT : '"'.*?'"';

ID: ([a-zA-Z\u00C0-\u00FF\u0153\u0152])[a-zA-Z\u00C0-\u00FF\u0153\u0152_0-9]*;
WS    : [ \t\r\n]+ -> skip ;