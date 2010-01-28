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
T25 : 'with' ;
T26 : '#' ;
T27 : 'delay:=' ;
T28 : '/' ;
T29 : ',' ;
T30 : ' history' ;
T31 : ';' ;
T32 : 'var' ;
T33 : ':=' ;
T34 : ': ' ;
T35 : 'input' ;
T36 : 'output' ;
T37 : ': combine' ;
T38 : '.' ;
T39 : '(' ;
T40 : ')' ;
T41 : 'NORMAL' ;
T42 : 'cond' ;
T43 : 'ref' ;
T44 : 'textual' ;
T45 : 'NONE' ;
T46 : '+' ;
T47 : '*' ;
T48 : 'AND' ;
T49 : 'OR' ;
T50 : 'hostCombineOperator' ;
T51 : 'PURE' ;
T52 : 'boolean' ;
T53 : 'unsigned' ;
T54 : 'integer' ;
T55 : 'float' ;
T56 : 'hostType' ;
T57 : '-->' ;
T58 : 'o->' ;
T59 : '>->' ;
T60 : '?' ;
T61 : '=' ;
T62 : '<' ;
T63 : '<=' ;
T64 : '>' ;
T65 : '>=' ;
T66 : 'not' ;
T67 : 'pre' ;
T68 : 'or' ;
T69 : 'and' ;
T70 : '-' ;
T71 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3929
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3931
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3933
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3935
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3937
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3939
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3941
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3943
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3945
RULE_ANY_OTHER : .;


