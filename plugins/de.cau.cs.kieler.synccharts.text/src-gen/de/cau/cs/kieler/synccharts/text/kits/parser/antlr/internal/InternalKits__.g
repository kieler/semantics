lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'region' ;
T16 : '@' ;
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
T33 : '/' ;
T34 : 'history' ;
T35 : 'input' ;
T36 : 'output' ;
T37 : 'signal' ;
T38 : ':=' ;
T39 : ':' ;
T40 : 'combine' ;
T41 : 'var' ;
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

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4302
RULE_TRANSITION_LABEL : '%' ( options {greedy=false;} : . )*'%';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4304
RULE_COMMENT_ANNOTATION : '/+' ( options {greedy=false;} : . )*'+/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4306
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4308
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4310
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4312
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4314
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4316
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4318
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4320
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4322
RULE_ANY_OTHER : .;


