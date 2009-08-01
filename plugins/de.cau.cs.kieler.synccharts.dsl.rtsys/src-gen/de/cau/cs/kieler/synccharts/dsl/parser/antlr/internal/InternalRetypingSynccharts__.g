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
T15 : '||' ;
T16 : '}' ;
T17 : 'onentry' ;
T18 : 'onexit' ;
T19 : 'oninner' ;
T20 : 'NORMAL' ;
T21 : 'cond' ;
T22 : 'reference' ;
T23 : 'textual' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1303
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1305
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1307
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1309
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1311
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1313
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g" 1315
RULE_ANY_OTHER : .;


