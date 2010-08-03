lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'region' ;
T15 : 'init' ;
T16 : 'final' ;
T17 : 'state' ;
T18 : ',' ;
T19 : ';' ;
T20 : '{' ;
T21 : 'onentry' ;
T22 : 'oninner' ;
T23 : 'onexit' ;
T24 : 'suspension' ;
T25 : '||' ;
T26 : '}' ;
T27 : 'var' ;
T28 : ':=' ;
T29 : ':' ;
T30 : 'input' ;
T31 : 'output' ;
T32 : 'signal' ;
T33 : 'combine' ;
T34 : 'with' ;
T35 : '<' ;
T36 : '>' ;
T37 : '#' ;
T38 : 'delay:=' ;
T39 : '/' ;
T40 : 'history' ;
T41 : '(' ;
T42 : ')' ;
T43 : 'normal' ;
T44 : 'conditional' ;
T45 : 'reference' ;
T46 : 'textual' ;
T47 : '-->' ;
T48 : 'o->' ;
T49 : '>->' ;
T50 : '=' ;
T51 : '<=' ;
T52 : '>=' ;
T53 : '<>' ;
T54 : 'pre' ;
T55 : 'or' ;
T56 : 'and' ;
T57 : 'not' ;
T58 : '+' ;
T59 : '-' ;
T60 : '*' ;
T61 : 'mod' ;
T62 : '?' ;
T63 : 'PURE' ;
T64 : 'BOOL' ;
T65 : 'UNSIGNED' ;
T66 : 'INT' ;
T67 : 'FLOAT' ;
T68 : 'HOST' ;
T69 : 'NONE' ;
T70 : 'max' ;
T71 : 'min' ;
T72 : 'host' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4054
RULE_T_ANNOTATION : '/+' ( options {greedy=false;} : . )*'+/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4056
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4058
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4060
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4062
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4064
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4066
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4068
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4070
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4072
RULE_ANY_OTHER : .;


