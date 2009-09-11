lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.parser.antlr.internal;

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
T34 : 'function' ;
T35 : '(' ;
T36 : ')' ;
T37 : '||' ;
T38 : '[' ;
T39 : ']' ;
T40 : ':=' ;
T41 : 'abort' ;
T42 : 'when' ;
T43 : 'do' ;
T44 : 'case' ;
T45 : 'await' ;
T46 : 'upto' ;
T47 : 'watching' ;
T48 : 'timeout' ;
T49 : 'emit' ;
T50 : 'every' ;
T51 : 'exit' ;
T52 : 'halt' ;
T53 : 'if' ;
T54 : 'elsif' ;
T55 : 'then' ;
T56 : 'else' ;
T57 : 'loop' ;
T58 : 'each' ;
T59 : 'nothing' ;
T60 : 'pause' ;
T61 : 'present' ;
T62 : 'positive' ;
T63 : 'repeat' ;
T64 : 'times' ;
T65 : 'run' ;
T66 : 'copymodule' ;
T67 : '/' ;
T68 : 'signal' ;
T69 : 'in' ;
T70 : 'suspend' ;
T71 : 'sustain' ;
T72 : 'trap' ;
T73 : 'handle' ;
T74 : 'var' ;
T75 : 'weak' ;
T76 : '?' ;
T77 : 'pre' ;
T78 : '??' ;
T79 : 'and' ;
T80 : 'or' ;
T81 : 'not' ;
T82 : '<' ;
T83 : '>' ;
T84 : '<=' ;
T85 : '>=' ;
T86 : '<>' ;
T87 : '+' ;
T88 : '-' ;
T89 : '*' ;
T90 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8081
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8083
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8085
RULE_BASETYPE : ('boolean'|'integer'|'float'|'double'|'string');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8087
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8089
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8091
RULE_NUMBER : ('+'|'-') ' '? RULE_INT;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8093
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8095
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8097
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8099
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8101
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8103
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g" 8105
RULE_ANY_OTHER : .;


