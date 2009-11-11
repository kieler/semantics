lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'region' ;
T14 : 'init' ;
T15 : 'final' ;
T16 : 'state' ;
T17 : '{' ;
T18 : 'onentry' ;
T19 : 'oninner' ;
T20 : 'onexit' ;
T21 : 'suspension' ;
T22 : '||' ;
T23 : '}' ;
T24 : '@' ;
T25 : 'with' ;
T26 : '#' ;
T27 : '/' ;
T28 : ',' ;
T29 : ' history' ;
T30 : ';' ;
T31 : 'var' ;
T32 : ': ' ;
T33 : ':=' ;
T34 : 'input' ;
T35 : 'output' ;
T36 : ': combine' ;
T37 : '.' ;
T38 : '(' ;
T39 : ')' ;
T40 : 'NORMAL' ;
T41 : 'cond' ;
T42 : 'ref' ;
T43 : 'textual' ;
T44 : 'NONE' ;
T45 : '+' ;
T46 : '*' ;
T47 : 'AND' ;
T48 : 'OR' ;
T49 : 'hostCombineOperator' ;
T50 : 'PURE' ;
T51 : 'boolean' ;
T52 : 'unsigned' ;
T53 : 'integer' ;
T54 : 'float' ;
T55 : 'hostType' ;
T56 : '-->' ;
T57 : 'o->' ;
T58 : '>->' ;
T59 : '?' ;
T60 : '=' ;
T61 : '<' ;
T62 : '<=' ;
T63 : '>' ;
T64 : '>=' ;
T65 : 'not' ;
T66 : 'pre' ;
T67 : 'or' ;
T68 : 'and' ;
T69 : '-' ;
T70 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5521
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5523
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5525
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5527
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5529
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5531
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5533
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5535
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 5537
RULE_ANY_OTHER : .;


