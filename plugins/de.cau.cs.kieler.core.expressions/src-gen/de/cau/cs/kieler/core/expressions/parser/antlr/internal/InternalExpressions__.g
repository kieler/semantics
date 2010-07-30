lexer grammar InternalExpressions;
@header {
package de.cau.cs.kieler.core.expressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '(' ;
T14 : ')' ;
T15 : '=' ;
T16 : '<' ;
T17 : '<=' ;
T18 : '>' ;
T19 : '>=' ;
T20 : '<>' ;
T21 : 'pre' ;
T22 : 'or' ;
T23 : 'and' ;
T24 : 'not' ;
T25 : '+' ;
T26 : '-' ;
T27 : '*' ;
T28 : 'mod' ;
T29 : '/' ;
T30 : '?' ;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 1991
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 1993
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 1995
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 1997
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 1999
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 2001
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 2003
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 2005
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 2007
RULE_ANY_OTHER : .;


