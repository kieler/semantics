lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.esterel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T17 : 'tick' ;
T18 : '.' ;
T19 : 'and' ;
T20 : 'or' ;
T21 : 'not' ;
T22 : '<' ;
T23 : '>' ;
T24 : '<=' ;
T25 : '>=' ;
T26 : '<>' ;
T27 : '=' ;
T28 : '+' ;
T29 : '-' ;
T30 : '*' ;
T31 : '/' ;
T32 : 'mod' ;
T33 : 'module' ;
T34 : ':' ;
T35 : 'end' ;
T36 : 'input' ;
T37 : ';' ;
T38 : ',' ;
T39 : 'output' ;
T40 : 'inputoutput' ;
T41 : 'return' ;
T42 : 'sensor' ;
T43 : 'relation' ;
T44 : '#' ;
T45 : 'type' ;
T46 : 'constant' ;
T47 : 'function' ;
T48 : '(' ;
T49 : ')' ;
T50 : 'procedure' ;
T51 : '||' ;
T52 : '[' ;
T53 : ']' ;
T54 : ':=' ;
T55 : 'abort' ;
T56 : 'when' ;
T57 : 'do' ;
T58 : 'case' ;
T59 : 'await' ;
T60 : 'call' ;
T61 : 'upto' ;
T62 : 'watching' ;
T63 : 'timeout' ;
T64 : 'emit' ;
T65 : 'every' ;
T66 : 'exit' ;
T67 : 'halt' ;
T68 : 'if' ;
T69 : 'elsif' ;
T70 : 'then' ;
T71 : 'else' ;
T72 : 'loop' ;
T73 : 'each' ;
T74 : 'nothing' ;
T75 : 'pause' ;
T76 : 'present' ;
T77 : 'repeat' ;
T78 : 'times' ;
T79 : 'run' ;
T80 : 'copymodule' ;
T81 : 'signal' ;
T82 : 'in' ;
T83 : 'suspend' ;
T84 : 'sustain' ;
T85 : 'trap' ;
T86 : 'handle' ;
T87 : 'var' ;
T88 : 'weak' ;
T89 : '?' ;
T90 : 'pre' ;
T91 : '??' ;
T92 : 'combine' ;
T93 : 'with' ;
T94 : '=>' ;
T95 : 'positive' ;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24015
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24017
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24019
RULE_BASETYPE : ('boolean'|'integer'|'float'|'double'|'string');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24021
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24023
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24025
RULE_ESTERELID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24027
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24029
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24031
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24033
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24035
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24037
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 24039
RULE_ANY_OTHER : .;


