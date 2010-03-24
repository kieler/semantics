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

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2361
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2363
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2365
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2367
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2369
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2371
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2373
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2375
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/labelparser/parser/antlr/internal/InternalActionLabel.g" 2377
RULE_ANY_OTHER : .;


