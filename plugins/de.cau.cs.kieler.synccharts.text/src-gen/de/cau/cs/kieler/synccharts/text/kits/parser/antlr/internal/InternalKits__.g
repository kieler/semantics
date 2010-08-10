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
T28 : '<' ;
T29 : '>' ;
T30 : 'with' ;
T31 : '#' ;
T32 : '/' ;
T33 : 'history' ;
T34 : 'input' ;
T35 : 'output' ;
T36 : 'signal' ;
T37 : ':=' ;
T38 : ':' ;
T39 : 'combine' ;
T40 : 'var' ;
T41 : '(' ;
T42 : ')' ;
T43 : '@' ;
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
T64 : 'pure' ;
T65 : 'bool' ;
T66 : 'unsigned' ;
T67 : 'int' ;
T68 : 'float' ;
T69 : 'host' ;
T70 : 'none' ;
T71 : 'max' ;
T72 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4318
RULE_TRANSITION_LABEL : '%' ( options {greedy=false;} : . )*'%';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4320
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4322
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4324
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4326
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4328
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4330
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4332
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4334
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4336
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4338
RULE_ANY_OTHER : .;


