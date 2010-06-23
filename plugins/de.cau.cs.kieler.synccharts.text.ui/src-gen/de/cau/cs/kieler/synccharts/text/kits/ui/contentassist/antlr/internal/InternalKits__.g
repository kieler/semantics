lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'pre' ;
T12 : 'or' ;
T13 : 'and' ;
T14 : 'not' ;
T15 : '+' ;
T16 : '-' ;
T17 : '*' ;
T18 : 'mod' ;
T19 : '/' ;
T20 : '?' ;
T21 : 'E' ;
T22 : 'e' ;
T23 : 'true' ;
T24 : 'false' ;
T25 : 'NORMAL' ;
T26 : 'CONDITIONAL' ;
T27 : 'REFERENCE' ;
T28 : 'TEXTUAL' ;
T29 : '-->' ;
T30 : 'o->' ;
T31 : '>->' ;
T32 : '=' ;
T33 : '<' ;
T34 : '<=' ;
T35 : '>' ;
T36 : '>=' ;
T37 : '<>' ;
T38 : 'PURE' ;
T39 : 'BOOL' ;
T40 : 'UNSIGNED' ;
T41 : 'INT' ;
T42 : 'FLOAT' ;
T43 : 'HOST' ;
T44 : 'NONE' ;
T45 : 'max' ;
T46 : 'min' ;
T47 : 'host' ;
T48 : 'Region' ;
T49 : 'State' ;
T50 : ';' ;
T51 : ',' ;
T52 : '{' ;
T53 : '}' ;
T54 : '[' ;
T55 : ']' ;
T56 : '||' ;
T57 : 'onentry' ;
T58 : 'oninner' ;
T59 : 'onexit' ;
T60 : 'suspension' ;
T61 : 'var' ;
T62 : ':' ;
T63 : ':=' ;
T64 : 'signal' ;
T65 : 'combine' ;
T66 : 'with' ;
T67 : 'delay:=' ;
T68 : '(' ;
T69 : ')' ;
T70 : '.' ;
T71 : 'init' ;
T72 : 'final' ;
T73 : 'input' ;
T74 : 'output' ;
T75 : '#' ;
T76 : ' history' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10784
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10786
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10788
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10790
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10792
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10794
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10796
RULE_ANY_OTHER : .;


