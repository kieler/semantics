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
T48 : 'upto' ;
T49 : 'watching' ;
T50 : 'timeout' ;
T51 : 'emit' ;
T52 : 'every' ;
T53 : 'exit' ;
T54 : 'halt' ;
T55 : 'if' ;
T56 : 'elsif' ;
T57 : 'then' ;
T58 : 'else' ;
T59 : 'loop' ;
T60 : 'each' ;
T61 : 'nothing' ;
T62 : 'pause' ;
T63 : 'present' ;
T64 : 'positive' ;
T65 : 'repeat' ;
T66 : 'times' ;
T67 : 'run' ;
T68 : 'copymodule' ;
T69 : '/' ;
T70 : 'signal' ;
T71 : 'in' ;
T72 : 'suspend' ;
T73 : 'sustain' ;
T74 : 'trap' ;
T75 : 'handle' ;
T76 : 'var' ;
T77 : 'weak' ;
T78 : 'and' ;
T79 : 'or' ;
T80 : 'not' ;
T81 : '<' ;
T82 : '>' ;
T83 : '<=' ;
T84 : '>=' ;
T85 : '<>' ;
T86 : '+' ;
T87 : '*' ;
T88 : 'mod' ;
T89 : '?' ;
T90 : 'pre' ;
T91 : '??' ;
T92 : 'tick' ;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8772
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8774
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8776
RULE_BASETYPE : ('boolean'|'integer'|'float'|'double'|'string');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8778
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8780
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8782
RULE_ESTERELID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8784
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8786
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8788
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8790
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8792
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8794
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 8796
RULE_ANY_OTHER : .;


