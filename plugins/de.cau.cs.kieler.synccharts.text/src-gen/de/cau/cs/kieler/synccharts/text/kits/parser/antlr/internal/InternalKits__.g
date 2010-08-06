lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'region' ;
T17 : 'init' ;
T18 : 'final' ;
T19 : 'state' ;
T20 : ',' ;
T21 : ';' ;
T22 : '{' ;
T23 : 'onentry' ;
T24 : 'oninner' ;
T25 : 'onexit' ;
T26 : 'suspension' ;
T27 : '||' ;
T28 : '}' ;
T29 : '<' ;
T30 : '>' ;
T31 : 'with' ;
T32 : '#' ;
T33 : 'delay:=' ;
T34 : '/' ;
T35 : 'history' ;
T36 : 'input' ;
T37 : 'output' ;
T38 : 'signal' ;
T39 : ':=' ;
T40 : ':' ;
T41 : 'combine' ;
T42 : 'var' ;
T43 : '(' ;
T44 : ')' ;
T45 : 'normal' ;
T46 : 'conditional' ;
T47 : 'reference' ;
T48 : 'textual' ;
T49 : '-->' ;
T50 : 'o->' ;
T51 : '>->' ;
T52 : '=' ;
T53 : '<=' ;
T54 : '>=' ;
T55 : '<>' ;
T56 : 'pre' ;
T57 : 'or' ;
T58 : 'and' ;
T59 : 'not' ;
T60 : '+' ;
T61 : '-' ;
T62 : '*' ;
T63 : 'mod' ;
T64 : '?' ;
T65 : 'PURE' ;
T66 : 'BOOL' ;
T67 : 'UNSIGNED' ;
T68 : 'INT' ;
T69 : 'FLOAT' ;
T70 : 'HOST' ;
T71 : 'NONE' ;
T72 : 'max' ;
T73 : 'min' ;
T74 : 'host' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4252
RULE_TRANSITION_LABEL : '%' ( options {greedy=false;} : . )*'%';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4254
RULE_COMMENT_ANNOTATION : '/+' ( options {greedy=false;} : . )*'+/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4256
RULE_ANNOTATION_KEY : '@' RULE_ID;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4258
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4260
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4262
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4264
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4266
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4268
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4270
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4272
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4274
RULE_ANY_OTHER : .;


