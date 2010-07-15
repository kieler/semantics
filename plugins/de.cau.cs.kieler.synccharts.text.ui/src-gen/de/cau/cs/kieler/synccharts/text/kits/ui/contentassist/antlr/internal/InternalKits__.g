lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '?' ;
T14 : 'not' ;
T15 : 'pre' ;
T16 : 'or' ;
T17 : 'and' ;
T18 : '/' ;
T19 : 'NORMAL' ;
T20 : 'CONDITIONAL' ;
T21 : 'REFERENCE' ;
T22 : 'TEXTUAL' ;
T23 : '-->' ;
T24 : 'o->' ;
T25 : '>->' ;
T26 : '=' ;
T27 : '<' ;
T28 : '<=' ;
T29 : '>' ;
T30 : '>=' ;
T31 : '<>' ;
T32 : '+' ;
T33 : '-' ;
T34 : '*' ;
T35 : 'mod' ;
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
T59 : 'var' ;
T60 : ':' ;
T61 : ':=' ;
T62 : 'signal' ;
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

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10554
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10556
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10558
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10560
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10562
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10564
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10566
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10568
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10570
RULE_ANY_OTHER : .;


