lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'region' ;
T16 : 'init' ;
T17 : 'final' ;
T18 : 'state' ;
T19 : ',' ;
T20 : ';' ;
T21 : '{' ;
T22 : 'onentry' ;
T23 : 'oninner' ;
T24 : 'onexit' ;
T25 : 'suspension' ;
T26 : '||' ;
T27 : '}' ;
T28 : 'var' ;
T29 : ':=' ;
T30 : ':' ;
T31 : 'input' ;
T32 : 'output' ;
T33 : 'signal' ;
T34 : 'combine' ;
T35 : 'with' ;
T36 : '<' ;
T37 : '>' ;
T38 : '#' ;
T39 : 'delay:=' ;
T40 : '/' ;
T41 : 'history' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'normal' ;
T45 : 'conditional' ;
T46 : 'reference' ;
T47 : 'textual' ;
T48 : '-->' ;
T49 : 'o->' ;
T50 : '>->' ;
T51 : '=' ;
T52 : '<=' ;
T53 : '>=' ;
T54 : '<>' ;
T55 : 'pre' ;
T56 : 'or' ;
T57 : 'and' ;
T58 : 'not' ;
T59 : '+' ;
T60 : '-' ;
T61 : '*' ;
T62 : 'mod' ;
T63 : '?' ;
T64 : 'PURE' ;
T65 : 'BOOL' ;
T66 : 'UNSIGNED' ;
T67 : 'INT' ;
T68 : 'FLOAT' ;
T69 : 'HOST' ;
T70 : 'NONE' ;
T71 : 'max' ;
T72 : 'min' ;
T73 : 'host' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3968
RULE_TRANSITION_LABEL : '%' ( options {greedy=false;} : . )*'%';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3970
RULE_T_ANNOTATION : '/+' ( options {greedy=false;} : . )*'+/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3972
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3974
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3976
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3978
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3980
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3982
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3984
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3986
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 3988
RULE_ANY_OTHER : .;


