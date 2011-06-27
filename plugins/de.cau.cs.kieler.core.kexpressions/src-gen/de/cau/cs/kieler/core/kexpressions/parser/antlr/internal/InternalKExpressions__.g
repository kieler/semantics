lexer grammar InternalKExpressions;
@header {
package de.cau.cs.kieler.core.kexpressions.parser.antlr.internal;

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
T29 : '[' ;
T30 : ']' ;
T31 : '.' ;
T32 : '=' ;
T33 : '<' ;
T34 : '<=' ;
T35 : '>' ;
T36 : '>=' ;
T37 : '<>' ;
T38 : 'pre' ;
T39 : 'or' ;
T40 : 'and' ;
T41 : 'not' ;
T42 : '+' ;
T43 : '-' ;
T44 : '*' ;
T45 : 'mod' ;
T46 : '/' ;
T47 : '?' ;
T48 : 'pure' ;
T49 : 'boolean' ;
T50 : 'unsigned' ;
T51 : 'integer' ;
T52 : 'float' ;
T53 : 'double' ;
T54 : 'string' ;
T55 : 'host' ;
T56 : 'none' ;
T57 : 'max' ;
T58 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4112
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4114
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4116
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4118
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4120
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4122
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4124
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4126
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4128
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4130
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g" 4132
RULE_ANY_OTHER : .;


