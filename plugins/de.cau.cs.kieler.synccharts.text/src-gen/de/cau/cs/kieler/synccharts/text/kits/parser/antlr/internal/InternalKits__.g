lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'region' ;
T16 : ':' ;
T17 : 'init' ;
T18 : 'final' ;
T19 : 'state' ;
T20 : '@' ;
T21 : '[' ;
T22 : ',' ;
T23 : ']' ;
T24 : '{' ;
T25 : 'onentry' ;
T26 : 'oninner' ;
T27 : 'onexit' ;
T28 : 'suspension' ;
T29 : '}' ;
T30 : '<' ;
T31 : '>' ;
T32 : 'with' ;
T33 : '#' ;
T34 : '/' ;
T35 : 'history' ;
T36 : 'input' ;
T37 : 'output' ;
T38 : 'signal' ;
T39 : ':=' ;
T40 : 'combine' ;
T41 : 'var' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'import' ;
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
T65 : 'pure' ;
T66 : 'bool' ;
T67 : 'unsigned' ;
T68 : 'int' ;
T69 : 'float' ;
T70 : 'host' ;
T71 : 'none' ;
T72 : 'max' ;
T73 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4808
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4810
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4812
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4814
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4816
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4818
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4820
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4822
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4824
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4826
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g" 4828
RULE_ANY_OTHER : .;


