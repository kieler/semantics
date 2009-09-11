lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T17 : '.' ;
T18 : 'and' ;
T19 : 'or' ;
T20 : 'not' ;
T21 : '<' ;
T22 : '>' ;
T23 : '<=' ;
T24 : '>=' ;
T25 : '<>' ;
T26 : '=' ;
T27 : '+' ;
T28 : '-' ;
T29 : '*' ;
T30 : '/' ;
T31 : 'mod' ;
T32 : 'module' ;
T33 : ':' ;
T34 : 'end' ;
T35 : 'input' ;
T36 : ';' ;
T37 : ',' ;
T38 : 'output' ;
T39 : 'inputoutput' ;
T40 : 'return' ;
T41 : 'sensor' ;
T42 : 'relation' ;
T43 : '#' ;
T44 : 'type' ;
T45 : 'constant' ;
T46 : 'function' ;
T47 : '(' ;
T48 : ')' ;
T49 : '||' ;
T50 : '[' ;
T51 : ']' ;
T52 : ':=' ;
T53 : 'abort' ;
T54 : 'when' ;
T55 : 'do' ;
T56 : 'case' ;
T57 : 'await' ;
T58 : 'upto' ;
T59 : 'watching' ;
T60 : 'timeout' ;
T61 : 'emit' ;
T62 : 'every' ;
T63 : 'exit' ;
T64 : 'halt' ;
T65 : 'if' ;
T66 : 'elsif' ;
T67 : 'then' ;
T68 : 'else' ;
T69 : 'loop' ;
T70 : 'each' ;
T71 : 'nothing' ;
T72 : 'pause' ;
T73 : 'present' ;
T74 : 'repeat' ;
T75 : 'times' ;
T76 : 'run' ;
T77 : 'copymodule' ;
T78 : 'signal' ;
T79 : 'in' ;
T80 : 'suspend' ;
T81 : 'sustain' ;
T82 : 'trap' ;
T83 : 'handle' ;
T84 : 'var' ;
T85 : 'weak' ;
T86 : '?' ;
T87 : 'pre' ;
T88 : '??' ;
T89 : '=>' ;
T90 : 'positive' ;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16137
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16139
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16141
RULE_BASETYPE : ('boolean'|'integer'|'float'|'double'|'string');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16143
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16145
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16147
RULE_NUMBER : ('+'|'-') ' '? RULE_INT;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16149
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16151
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16153
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16155
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16157
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16159
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/contentassist/antlr/internal/InternalEsterel.g" 16161
RULE_ANY_OTHER : .;


