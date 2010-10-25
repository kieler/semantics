lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : 'pre' ;
T16 : 'or' ;
T17 : 'and' ;
T18 : 'not' ;
T19 : '+' ;
T20 : '-' ;
T21 : '*' ;
T22 : 'mod' ;
T23 : '/' ;
T24 : '?' ;
T25 : 'normal' ;
T26 : 'conditional' ;
T27 : 'reference' ;
T28 : 'textual' ;
T29 : '-->' ;
T30 : 'o->' ;
T31 : '>->' ;
T32 : '=' ;
T33 : '<' ;
T34 : '<=' ;
T35 : '>' ;
T36 : '>=' ;
T37 : '<>' ;
T38 : 'pure' ;
T39 : 'bool' ;
T40 : 'unsigned' ;
T41 : 'int' ;
T42 : 'float' ;
T43 : 'host' ;
T44 : 'none' ;
T45 : 'max' ;
T46 : 'min' ;
T47 : 'region' ;
T48 : ':' ;
T49 : 'code' ;
T50 : '(' ;
T51 : ')' ;
T52 : 'state' ;
T53 : '@' ;
T54 : '[' ;
T55 : ']' ;
T56 : ',' ;
T57 : '{' ;
T58 : '}' ;
T59 : 'onentry' ;
T60 : 'oninner' ;
T61 : 'onexit' ;
T62 : 'suspension' ;
T63 : 'with' ;
T64 : 'signal' ;
T65 : ':=' ;
T66 : 'combine' ;
T67 : 'var' ;
T68 : 'import' ;
T69 : 'init' ;
T70 : 'final' ;
T71 : '#' ;
T72 : 'history' ;
T73 : 'input' ;
T74 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10615
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10617
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10619
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10621
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10623
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10625
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10627
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10629
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10631
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10633
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g" 10635
RULE_ANY_OTHER : .;


