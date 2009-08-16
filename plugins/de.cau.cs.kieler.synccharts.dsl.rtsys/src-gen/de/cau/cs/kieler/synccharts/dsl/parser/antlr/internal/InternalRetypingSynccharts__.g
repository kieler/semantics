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
T14 : '{' ;
T15 : '@' ;
T16 : '[' ;
T17 : ',' ;
T18 : ']' ;
T19 : '}' ;
T20 : '/' ;
T21 : 'onentry' ;
T22 : 'oninner' ;
T23 : 'onexit' ;
T24 : 'suspension' ;
T25 : 'tick' ;
T26 : 'local' ;
T27 : 'input' ;
T28 : 'output' ;
T29 : ':=' ;
T30 : ':' ;
T31 : 'combine' ;
T32 : 'with' ;
T33 : 'NORMAL' ;
T34 : 'cond' ;
T35 : 'reference' ;
T36 : 'textual' ;
T37 : 'NONE' ;
T38 : '+' ;
T39 : '*' ;
T40 : 'host' ;
T41 : 'PURE' ;
T42 : 'boolean' ;
T43 : 'unsigned' ;
T44 : 'integer' ;
T45 : 'double' ;
T46 : 'float' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1848
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1850
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1852
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1854
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1856
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1858
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1860
RULE_ANY_OTHER : .;


