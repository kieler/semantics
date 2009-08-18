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
T14 : '@' ;
T15 : '[' ;
T16 : ',' ;
T17 : ']' ;
T18 : '{' ;
T19 : 'onentry' ;
T20 : 'oninner' ;
T21 : 'onexit' ;
T22 : 'suspension' ;
T23 : '||' ;
T24 : '}' ;
T25 : '/' ;
T26 : 'region' ;
T27 : '#' ;
T28 : ':= ' ;
T29 : ': ' ;
T30 : 'local' ;
T31 : 'input' ;
T32 : 'output' ;
T33 : ':=' ;
T34 : 'combine' ;
T35 : 'with' ;
T36 : 'NORMAL' ;
T37 : 'cond' ;
T38 : 'reference' ;
T39 : 'textual' ;
T40 : 'NONE' ;
T41 : '+' ;
T42 : '*' ;
T43 : 'host' ;
T44 : 'PURE' ;
T45 : 'boolean' ;
T46 : 'unsigned' ;
T47 : 'integer' ;
T48 : 'double' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1888
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1890
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1892
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1894
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1896
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1898
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1900
RULE_ANY_OTHER : .;


