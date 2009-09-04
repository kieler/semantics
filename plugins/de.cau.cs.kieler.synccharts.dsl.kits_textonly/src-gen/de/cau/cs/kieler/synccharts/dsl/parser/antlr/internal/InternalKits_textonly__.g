lexer grammar InternalKits_textonly;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'region' ;
T12 : 'init' ;
T13 : 'final' ;
T14 : 'state' ;
T15 : '{' ;
T16 : 'onentry' ;
T17 : 'oninner' ;
T18 : 'onexit' ;
T19 : 'suspension' ;
T20 : '}' ;
T21 : '@' ;
T22 : '#' ;
T23 : ';' ;
T24 : 'with' ;
T25 : ' history' ;
T26 : 'var' ;
T27 : ': ' ;
T28 : ':=' ;
T29 : 'inputoutput' ;
T30 : 'input' ;
T31 : 'output' ;
T32 : ': combine' ;
T33 : 'cond' ;
T34 : 'ref' ;
T35 : 'textual' ;
T36 : 'NONE' ;
T37 : '+' ;
T38 : '*' ;
T39 : 'AND' ;
T40 : 'OR' ;
T41 : 'hostCombineOperator' ;
T42 : 'PURE' ;
T43 : 'boolean' ;
T44 : 'unsigned' ;
T45 : 'integer' ;
T46 : 'float' ;
T47 : 'hostType' ;
T48 : '-->' ;
T49 : 'o->' ;
T50 : '>->' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5264
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5266
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5268
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5270
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5272
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5274
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5276
RULE_ANY_OTHER : .;


