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
T31 : '=' ;
T32 : '<' ;
T33 : '<=' ;
T34 : '>' ;
T35 : '>=' ;
T36 : '<>' ;
T37 : 'pre' ;
T38 : 'or' ;
T39 : 'and' ;
T40 : 'not' ;
T41 : '+' ;
T42 : '-' ;
T43 : '*' ;
T44 : 'mod' ;
T45 : '?' ;
T46 : 'pure' ;
T47 : 'bool' ;
T48 : 'unsigned' ;
T49 : 'int' ;
T50 : 'float' ;
T51 : 'host' ;
T52 : 'none' ;
T53 : 'max' ;
T54 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3769
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3771
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3773
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3775
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3777
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3779
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3781
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3783
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3785
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3787
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g" 3789
RULE_ANY_OTHER : .;


