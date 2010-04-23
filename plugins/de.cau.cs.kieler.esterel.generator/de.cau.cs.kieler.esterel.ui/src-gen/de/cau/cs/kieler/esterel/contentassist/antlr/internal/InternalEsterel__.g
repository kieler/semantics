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
T36 : ';' ;
T37 : ',' ;
T38 : 'sensor' ;
T39 : 'relation' ;
T40 : '#' ;
T41 : 'type' ;
T42 : 'constant' ;
T43 : 'function' ;
T44 : '(' ;
T45 : ')' ;
T46 : 'procedure' ;
T47 : '||' ;
T48 : '[' ;
T49 : ']' ;
T50 : ':=' ;
T51 : 'abort' ;
T52 : 'when' ;
T53 : 'do' ;
T54 : 'case' ;
T55 : 'await' ;
T56 : 'upto' ;
T57 : 'watching' ;
T58 : 'timeout' ;
T59 : 'emit' ;
T60 : 'every' ;
T61 : 'exit' ;
T62 : 'halt' ;
T63 : 'if' ;
T64 : 'elsif' ;
T65 : 'then' ;
T66 : 'else' ;
T67 : 'loop' ;
T68 : 'each' ;
T69 : 'nothing' ;
T70 : 'pause' ;
T71 : 'present' ;
T72 : 'repeat' ;
T73 : 'times' ;
T74 : 'run' ;
T75 : 'copymodule' ;
T76 : 'signal' ;
T77 : 'in' ;
T78 : 'suspend' ;
T79 : 'sustain' ;
T80 : 'trap' ;
T81 : 'handle' ;
T82 : 'var' ;
T83 : 'weak' ;
T84 : '?' ;
T85 : 'pre' ;
T86 : '??' ;
T87 : 'input' ;
T88 : 'output' ;
T89 : 'inputoutput' ;
T90 : 'return' ;
T91 : '=>' ;
T92 : 'positive' ;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17475
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17477
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17479
RULE_BASETYPE : ('boolean'|'integer'|'float'|'double'|'string');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17481
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17483
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17485
RULE_ESTERELID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17487
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17489
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17491
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17493
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17495
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17497
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/contentassist/antlr/internal/InternalEsterel.g" 17499
RULE_ANY_OTHER : .;


