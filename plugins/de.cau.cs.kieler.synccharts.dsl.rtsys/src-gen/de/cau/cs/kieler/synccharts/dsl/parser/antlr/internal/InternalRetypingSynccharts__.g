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
T26 : 'region' ;
T27 : '#' ;
T28 : ';' ;
T29 : 'with ' ;
T30 : ' history' ;
T31 : ':= ' ;
T32 : ': ' ;
T33 : 'local' ;
T34 : 'input' ;
T35 : 'output' ;
T36 : 'combine' ;
T37 : 'with' ;
T38 : 'cond' ;
T39 : 'ref' ;
T40 : 'textual' ;
T41 : 'NONE' ;
T42 : '+' ;
T43 : '*' ;
T44 : 'AND' ;
T45 : 'OR' ;
T46 : 'host' ;
T47 : 'PURE' ;
T48 : 'boolean' ;
T49 : 'unsigned' ;
T50 : 'integer' ;
T51 : 'float' ;
T52 : '-->' ;
T53 : 'o->' ;
T54 : '>->' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 3377
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 3379
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 3381
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 3383
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 3385
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 3387
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 3389
RULE_ANY_OTHER : .;


