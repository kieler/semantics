lexer grammar InternalRetypingSynccharts;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'init' ;
T12 : 'final' ;
T13 : 'state' ;
T14 : '[' ;
T15 : ',' ;
T16 : ']' ;
T17 : '{' ;
T18 : 'onentry' ;
T19 : 'oninner' ;
T20 : 'onexit' ;
T21 : 'suspension' ;
T22 : '||' ;
T23 : '}' ;
T24 : '/' ;
T25 : '@' ;
T26 : '#' ;
T27 : ';' ;
T28 : 'with' ;
T29 : ' history' ;
T30 : 'var' ;
T31 : ': ' ;
T32 : ':=' ;
T33 : 'inputoutput' ;
T34 : 'input' ;
T35 : 'output' ;
T36 : ': combine' ;
T37 : 'cond' ;
T38 : 'ref' ;
T39 : 'textual' ;
T40 : 'NONE' ;
T41 : '+' ;
T42 : '*' ;
T43 : 'AND' ;
T44 : 'OR' ;
T45 : 'hostCombineOperator' ;
T46 : 'PURE' ;
T47 : 'boolean' ;
T48 : 'unsigned' ;
T49 : 'integer' ;
T50 : 'float' ;
T51 : 'hostType' ;
T52 : '-->' ;
T53 : 'o->' ;
T54 : '>->' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 5447
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 5449
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 5451
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 5453
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 5455
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 5457
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 5459
RULE_ANY_OTHER : .;


