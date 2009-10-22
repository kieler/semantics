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
T37 : '(' ;
T38 : ')' ;
T39 : '?' ;
T40 : '=' ;
T41 : '<' ;
T42 : '<=' ;
T43 : '>' ;
T44 : '>=' ;
T45 : 'not' ;
T46 : 'or' ;
T47 : 'and' ;
T48 : 'cond' ;
T49 : 'ref' ;
T50 : 'textual' ;
T51 : 'NONE' ;
T52 : '+' ;
T53 : '*' ;
T54 : 'AND' ;
T55 : 'OR' ;
T56 : 'hostCombineOperator' ;
T57 : 'PURE' ;
T58 : 'boolean' ;
T59 : 'unsigned' ;
T60 : 'integer' ;
T61 : 'float' ;
T62 : 'hostType' ;
T63 : '-->' ;
T64 : 'o->' ;
T65 : '>->' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4445
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4447
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4449
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4451
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4453
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4455
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4457
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4459
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4461
RULE_ANY_OTHER : .;


