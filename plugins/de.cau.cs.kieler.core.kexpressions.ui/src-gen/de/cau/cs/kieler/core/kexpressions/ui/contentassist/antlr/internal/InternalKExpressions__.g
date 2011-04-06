lexer grammar InternalKExpressions;
@header {
package de.cau.cs.kieler.core.kexpressions.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'pre' ;
T17 : 'or' ;
T18 : 'and' ;
T19 : 'not' ;
T20 : '+' ;
T21 : '-' ;
T22 : '*' ;
T23 : 'mod' ;
T24 : '/' ;
T25 : '?' ;
T26 : '=' ;
T27 : '<' ;
T28 : '<=' ;
T29 : '>' ;
T30 : '>=' ;
T31 : '<>' ;
T32 : 'pure' ;
T33 : 'boolean' ;
T34 : 'unsigned' ;
T35 : 'integer' ;
T36 : 'float' ;
T37 : 'double' ;
T38 : 'string' ;
T39 : 'host' ;
T40 : 'none' ;
T41 : 'max' ;
T42 : 'min' ;
T43 : '(' ;
T44 : ')' ;
T45 : 'input' ;
T46 : ';' ;
T47 : ',' ;
T48 : 'output' ;
T49 : 'inputoutput' ;
T50 : 'return' ;
T51 : ':' ;
T52 : ':=' ;
T53 : 'var' ;
T54 : 'combine' ;
T55 : 'with' ;
T56 : '@' ;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8391
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8393
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8395
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8397
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8399
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8401
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8403
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8405
RULE_TYPEID : '[' ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')* ']';

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8407
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8409
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8411
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g" 8413
RULE_ANY_OTHER : .;


