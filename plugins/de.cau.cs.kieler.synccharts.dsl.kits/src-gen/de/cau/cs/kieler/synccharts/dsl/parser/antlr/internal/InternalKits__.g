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
T17 : 'onentry' ;
T18 : 'oninner' ;
T19 : 'onexit' ;
T20 : 'suspension' ;
T21 : '{' ;
T22 : '||' ;
T23 : '}' ;
T24 : '@' ;
T25 : '<' ;
T26 : '>' ;
T27 : 'with' ;
T28 : '#' ;
T29 : '/' ;
T30 : ',' ;
T31 : ' history' ;
T32 : ';' ;
T33 : 'var' ;
T34 : ':=' ;
T35 : ': ' ;
T36 : 'input' ;
T37 : 'output' ;
T38 : ': combine' ;
T39 : '.' ;
T40 : '(' ;
T41 : ')' ;
T42 : 'NORMAL' ;
T43 : 'cond' ;
T44 : 'ref' ;
T45 : 'textual' ;
T46 : 'NONE' ;
T47 : '+' ;
T48 : '*' ;
T49 : 'AND' ;
T50 : 'OR' ;
T51 : 'hostCombineOperator' ;
T52 : 'PURE' ;
T53 : 'boolean' ;
T54 : 'unsigned' ;
T55 : 'integer' ;
T56 : 'float' ;
T57 : 'hostType' ;
T58 : '-->' ;
T59 : 'o->' ;
T60 : '>->' ;
T61 : '?' ;
T62 : '=' ;
T63 : '<=' ;
T64 : '>=' ;
T65 : 'not' ;
T66 : 'pre' ;
T67 : 'or' ;
T68 : 'and' ;
T69 : '-' ;
T70 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3720
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3722
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3724
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3726
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3728
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3730
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3732
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3734
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3736
RULE_ANY_OTHER : .;


