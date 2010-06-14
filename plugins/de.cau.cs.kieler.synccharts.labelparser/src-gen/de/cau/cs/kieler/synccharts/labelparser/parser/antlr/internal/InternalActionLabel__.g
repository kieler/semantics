lexer grammar InternalActionLabel;
@header {
package de.cau.cs.kieler.synccharts.labelparser.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '#' ;
T14 : '/' ;
T15 : ',' ;
T16 : '(' ;
T17 : ')' ;
T18 : ':=' ;
T19 : '?' ;
T20 : '=' ;
T21 : '<' ;
T22 : '<=' ;
T23 : '>' ;
T24 : '>=' ;
T25 : '<>' ;
T26 : 'not' ;
T27 : 'pre' ;
T28 : 'or' ;
T29 : 'and' ;
T30 : '+' ;
T31 : '-' ;
T32 : '*' ;
T33 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2481
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2483
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2485
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2487
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2489
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2491
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2493
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2495
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2497
RULE_ANY_OTHER : .;


