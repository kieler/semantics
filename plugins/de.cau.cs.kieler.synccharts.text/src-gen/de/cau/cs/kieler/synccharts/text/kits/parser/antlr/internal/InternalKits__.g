lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'Region' ;
T14 : 'init' ;
T15 : 'final' ;
T16 : 'State' ;
T17 : ',' ;
T18 : ';' ;
T19 : '{' ;
T20 : '[' ;
T21 : '||' ;
T22 : ']' ;
T23 : 'onentry' ;
T24 : 'oninner' ;
T25 : 'onexit' ;
T26 : 'suspension' ;
T27 : '}' ;
T28 : 'Var' ;
T29 : ':=' ;
T30 : ':' ;
T31 : 'input' ;
T32 : 'output' ;
T33 : 'Signal' ;
T34 : 'combine' ;
T35 : 'with' ;
T36 : '<' ;
T37 : '>' ;
T38 : '#' ;
T39 : 'delay:=' ;
T40 : '/' ;
T41 : ' history' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'NORMAL' ;
T45 : 'CONDITIONAL' ;
T46 : 'REFERENCE' ;
T47 : 'TEXTUAL' ;
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

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4404
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4406
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4408
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4410
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4412
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4414
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4416
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4418
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4420
RULE_ANY_OTHER : .;


