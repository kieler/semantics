lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'pre' ;
T14 : 'or' ;
T15 : 'and' ;
T16 : 'not' ;
T17 : '+' ;
T18 : '-' ;
T19 : '*' ;
T20 : 'mod' ;
T21 : '/' ;
T22 : '?' ;
T23 : 'NORMAL' ;
T24 : 'CONDITIONAL' ;
T25 : 'REFERENCE' ;
T26 : 'TEXTUAL' ;
T27 : '-->' ;
T28 : 'o->' ;
T29 : '>->' ;
T30 : '=' ;
T31 : '<' ;
T32 : '<=' ;
T33 : '>' ;
T34 : '>=' ;
T35 : '<>' ;
T36 : 'PURE' ;
T37 : 'BOOL' ;
T38 : 'UNSIGNED' ;
T39 : 'INT' ;
T40 : 'FLOAT' ;
T41 : 'HOST' ;
T42 : 'NONE' ;
T43 : 'max' ;
T44 : 'min' ;
T45 : 'host' ;
T46 : 'Region' ;
T47 : 'State' ;
T48 : ';' ;
T49 : ',' ;
T50 : '{' ;
T51 : '}' ;
T52 : '[' ;
T53 : ']' ;
T54 : '||' ;
T55 : 'onentry' ;
T56 : 'oninner' ;
T57 : 'onexit' ;
T58 : 'suspension' ;
T59 : 'Var' ;
T60 : ':' ;
T61 : ':=' ;
T62 : 'Signal' ;
T63 : 'combine' ;
T64 : 'with' ;
T65 : 'delay:=' ;
T66 : '(' ;
T67 : ')' ;
T68 : 'init' ;
T69 : 'final' ;
T70 : 'input' ;
T71 : 'output' ;
T72 : '#' ;
T73 : ' history' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10058
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10060
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10062
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10064
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10066
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10068
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10070
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10072
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10074
RULE_ANY_OTHER : .;


