lexer grammar InternalExpressions;
@header {
package de.cau.cs.kieler.core.expressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : '(' ;
T16 : ')' ;
T17 : 'input' ;
T18 : ',' ;
T19 : ';' ;
T20 : 'output' ;
T21 : 'inputoutput' ;
T22 : 'return' ;
T23 : ':' ;
T24 : ':=' ;
T25 : 'var' ;
T26 : 'combine' ;
T27 : 'with' ;
T28 : '@' ;
T29 : '=' ;
T30 : '<' ;
T31 : '<=' ;
T32 : '>' ;
T33 : '>=' ;
T34 : '<>' ;
T35 : 'pre' ;
T36 : 'or' ;
T37 : 'and' ;
T38 : 'not' ;
T39 : '+' ;
T40 : '-' ;
T41 : '*' ;
T42 : 'mod' ;
T43 : '/' ;
T44 : '?' ;
T45 : 'pure' ;
T46 : 'bool' ;
T47 : 'unsigned' ;
T48 : 'int' ;
T49 : 'float' ;
T50 : 'host' ;
T51 : 'none' ;
T52 : 'max' ;
T53 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3371
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3373
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3375
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3377
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3379
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3381
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3383
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3385
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3387
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3389
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g" 3391
RULE_ANY_OTHER : .;


