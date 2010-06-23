lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'Region' ;
T12 : 'init' ;
T13 : 'final' ;
T14 : 'State' ;
T15 : ',' ;
T16 : ';' ;
T17 : '{' ;
T18 : '[' ;
T19 : '||' ;
T20 : ']' ;
T21 : 'onentry' ;
T22 : 'oninner' ;
T23 : 'onexit' ;
T24 : 'suspension' ;
T25 : '}' ;
T26 : 'var' ;
T27 : ':=' ;
T28 : ':' ;
T29 : 'input' ;
T30 : 'output' ;
T31 : 'signal' ;
T32 : 'combine' ;
T33 : 'with' ;
T34 : '<' ;
T35 : '>' ;
T36 : '#' ;
T37 : 'delay:=' ;
T38 : '/' ;
T39 : ' history' ;
T40 : '(' ;
T41 : ')' ;
T42 : '-' ;
T43 : '.' ;
T44 : 'E' ;
T45 : 'e' ;
T46 : 'true' ;
T47 : 'false' ;
T48 : 'NORMAL' ;
T49 : 'CONDITIONAL' ;
T50 : 'REFERENCE' ;
T51 : 'TEXTUAL' ;
T52 : '-->' ;
T53 : 'o->' ;
T54 : '>->' ;
T55 : '=' ;
T56 : '<=' ;
T57 : '>=' ;
T58 : '<>' ;
T59 : 'pre' ;
T60 : 'or' ;
T61 : 'and' ;
T62 : 'not' ;
T63 : '+' ;
T64 : '*' ;
T65 : 'mod' ;
T66 : '?' ;
T67 : 'PURE' ;
T68 : 'BOOL' ;
T69 : 'UNSIGNED' ;
T70 : 'INT' ;
T71 : 'FLOAT' ;
T72 : 'HOST' ;
T73 : 'NONE' ;
T74 : 'max' ;
T75 : 'min' ;
T76 : 'host' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4547
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4549
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4551
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4553
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4555
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4557
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4559
RULE_ANY_OTHER : .;


