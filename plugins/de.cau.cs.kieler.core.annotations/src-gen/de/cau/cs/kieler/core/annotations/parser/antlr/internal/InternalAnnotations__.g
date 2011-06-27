lexer grammar InternalAnnotations;
@header {
package de.cau.cs.kieler.core.annotations.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : '@' ;
T15 : '(' ;
T16 : ')' ;
T17 : '[' ;
T18 : ']' ;
T19 : '.' ;

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 975
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 977
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 979
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 981
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 983
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 985
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 987
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 989
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 991
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g" 993
RULE_ANY_OTHER : .;


