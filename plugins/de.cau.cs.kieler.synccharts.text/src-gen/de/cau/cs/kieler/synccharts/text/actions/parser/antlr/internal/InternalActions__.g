lexer grammar InternalActions;
@header {
package de.cau.cs.kieler.synccharts.text.actions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : '#' ;
T16 : '/' ;
T17 : ',' ;
T18 : '(' ;
T19 : ')' ;
T20 : ':=' ;
T21 : 'input' ;
T22 : ';' ;
T23 : 'output' ;
T24 : 'inputoutput' ;
T25 : 'return' ;
T26 : ':' ;
T27 : 'var' ;
T28 : 'combine' ;
T29 : 'with' ;
T30 : '@' ;
T31 : '[' ;
T32 : ']' ;
T33 : '.' ;
T34 : '=' ;
T35 : '<' ;
T36 : '<=' ;
T37 : '>' ;
T38 : '>=' ;
T39 : '<>' ;
T40 : 'pre' ;
T41 : 'or' ;
T42 : 'and' ;
T43 : 'not' ;
T44 : '+' ;
T45 : '-' ;
T46 : '*' ;
T47 : 'mod' ;
T48 : '?' ;
T49 : 'pure' ;
T50 : 'boolean' ;
T51 : 'unsigned' ;
T52 : 'integer' ;
T53 : 'float' ;
T54 : 'double' ;
T55 : 'string' ;
T56 : 'host' ;
T57 : 'none' ;
T58 : 'max' ;
T59 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4510
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4512
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4514
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4516
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4518
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4520
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4522
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4524
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4526
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4528
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 4530
RULE_ANY_OTHER : .;


