lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.esterel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T17 : 'module' ;
T18 : ':' ;
T19 : 'end' ;
T20 : '.' ;
T21 : 'input' ;
T22 : ',' ;
T23 : ';' ;
T24 : 'output' ;
T25 : 'inputoutput' ;
T26 : 'return' ;
T27 : 'sensor' ;
T28 : 'relation' ;
T29 : '=>' ;
T30 : '#' ;
T31 : 'type' ;
T32 : 'constant' ;
T33 : '=' ;
T34 : '-' ;
T35 : 'function' ;
T36 : '(' ;
T37 : ')' ;
T38 : 'procedure' ;
T39 : '||' ;
T40 : '[' ;
T41 : ']' ;
T42 : ':=' ;
T43 : 'abort' ;
T44 : 'when' ;
T45 : 'do' ;
T46 : 'case' ;
T47 : 'await' ;
T48 : 'call' ;
T49 : 'upto' ;
T50 : 'watching' ;
T51 : 'timeout' ;
T52 : 'emit' ;
T53 : 'every' ;
T54 : 'exit' ;
T55 : 'halt' ;
T56 : 'if' ;
T57 : 'elsif' ;
T58 : 'then' ;
T59 : 'else' ;
T60 : 'loop' ;
T61 : 'each' ;
T62 : 'nothing' ;
T63 : 'pause' ;
T64 : 'present' ;
T65 : 'positive' ;
T66 : 'repeat' ;
T67 : 'times' ;
T68 : 'run' ;
T69 : 'copymodule' ;
T70 : '/' ;
T71 : 'signal' ;
T72 : 'in' ;
T73 : 'suspend' ;
T74 : 'sustain' ;
T75 : 'trap' ;
T76 : 'handle' ;
T77 : 'var' ;
T78 : 'weak' ;
T79 : '+' ;
T80 : 'or' ;
T81 : '*' ;
T82 : 'mod' ;
T83 : 'and' ;
T84 : '<' ;
T85 : '>' ;
T86 : '<=' ;
T87 : '>=' ;
T88 : '<>' ;
T89 : 'not' ;
T90 : '?' ;
T91 : 'pre' ;
T92 : '??' ;
T93 : 'combine' ;
T94 : 'with' ;
T95 : 'tick' ;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10382
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10384
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10386
RULE_BASETYPE : ('boolean'|'integer'|'float'|'double'|'string');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10388
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10390
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10392
RULE_ESTERELID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10394
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10396
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10398
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10400
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10402
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10404
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 10406
RULE_ANY_OTHER : .;


