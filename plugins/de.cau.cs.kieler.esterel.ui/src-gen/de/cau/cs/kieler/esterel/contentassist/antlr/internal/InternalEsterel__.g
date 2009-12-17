lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.esterel.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
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
T60 : 'upto' ;
T61 : 'watching' ;
T62 : 'timeout' ;
T63 : 'emit' ;
T64 : 'every' ;
T65 : 'exit' ;
T66 : 'halt' ;
T67 : 'if' ;
T68 : 'elsif' ;
T69 : 'then' ;
T70 : 'else' ;
T71 : 'loop' ;
T72 : 'each' ;
T73 : 'nothing' ;
T74 : 'pause' ;
T75 : 'present' ;
T76 : 'repeat' ;
T77 : 'times' ;
T78 : 'run' ;
T79 : 'copymodule' ;
T80 : 'signal' ;
T81 : 'in' ;
T82 : 'suspend' ;
T83 : 'sustain' ;
T84 : 'trap' ;
T85 : 'handle' ;
T86 : 'var' ;
T87 : 'weak' ;
T88 : '?' ;
T89 : 'pre' ;
T90 : '??' ;
T91 : '=>' ;
T92 : 'positive' ;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17391
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17393
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17395
RULE_BASETYPE : ('boolean'|'integer'|'float'|'double'|'string');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17397
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17399
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17401
RULE_ESTERELID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17403
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17405
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17407
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17409
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17411
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17413
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17415
RULE_ANY_OTHER : .;


