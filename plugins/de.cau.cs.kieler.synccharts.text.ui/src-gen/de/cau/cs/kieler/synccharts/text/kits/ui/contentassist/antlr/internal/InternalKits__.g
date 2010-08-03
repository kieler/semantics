lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'pre' ;
T15 : 'or' ;
T16 : 'and' ;
T17 : 'not' ;
T18 : '+' ;
T19 : '-' ;
T20 : '*' ;
T21 : 'mod' ;
T22 : '/' ;
T23 : '?' ;
T24 : 'normal' ;
T25 : 'conditional' ;
T26 : 'reference' ;
T27 : 'textual' ;
T28 : '-->' ;
T29 : 'o->' ;
T30 : '>->' ;
T31 : '=' ;
T32 : '<' ;
T33 : '<=' ;
T34 : '>' ;
T35 : '>=' ;
T36 : '<>' ;
T37 : 'PURE' ;
T38 : 'BOOL' ;
T39 : 'UNSIGNED' ;
T40 : 'INT' ;
T41 : 'FLOAT' ;
T42 : 'HOST' ;
T43 : 'NONE' ;
T44 : 'max' ;
T45 : 'min' ;
T46 : 'host' ;
T47 : 'region' ;
T48 : 'state' ;
T49 : ';' ;
T50 : ',' ;
T51 : '{' ;
T52 : '}' ;
T53 : 'onentry' ;
T54 : 'oninner' ;
T55 : 'onexit' ;
T56 : 'suspension' ;
T57 : '||' ;
T58 : 'var' ;
T59 : ':' ;
T60 : ':=' ;
T61 : 'signal' ;
T62 : 'combine' ;
T63 : 'with' ;
T64 : 'delay:=' ;
T65 : '(' ;
T66 : ')' ;
T67 : 'init' ;
T68 : 'final' ;
T69 : 'input' ;
T70 : 'output' ;
T71 : '#' ;
T72 : 'history' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9000
RULE_T_ANNOTATION : '/+' ( options {greedy=false;} : . )*'+/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9002
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9004
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9006
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9008
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9010
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9012
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9014
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9016
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 9018
RULE_ANY_OTHER : .;


