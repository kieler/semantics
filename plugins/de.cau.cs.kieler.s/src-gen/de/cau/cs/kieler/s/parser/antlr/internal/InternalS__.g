lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'Synchronous Program' ;
T17 : '(' ;
T18 : ')' ;
T19 : ':' ;
T20 : 'SIGNALS' ;
T21 : ';' ;
T22 : 'input' ;
T23 : 'output' ;
T24 : 'signal' ;
T25 : ':=' ;
T26 : 'combine' ;
T27 : 'with' ;
T28 : 'PAUSE' ;
T29 : 'TERM' ;
T30 : 'Halt' ;
T31 : 'JOIN' ;
T32 : 'ABORT' ;
T33 : 'IF' ;
T34 : ',' ;
T35 : '{' ;
T36 : '}' ;
T37 : 'GOTO' ;
T38 : 'FORK' ;
T39 : 'FORKE' ;
T40 : 'EMIT' ;
T41 : 'AWAIT' ;
T42 : 'PRIO' ;
T43 : 'inputoutput' ;
T44 : 'return' ;
T45 : 'var' ;
T46 : '@' ;
T47 : '=' ;
T48 : '<' ;
T49 : '<=' ;
T50 : '>' ;
T51 : '>=' ;
T52 : '<>' ;
T53 : 'pre' ;
T54 : 'or' ;
T55 : 'and' ;
T56 : 'not' ;
T57 : '+' ;
T58 : '-' ;
T59 : '*' ;
T60 : 'mod' ;
T61 : '/' ;
T62 : '?' ;
T63 : 'pure' ;
T64 : 'boolean' ;
T65 : 'unsigned' ;
T66 : 'integer' ;
T67 : 'float' ;
T68 : 'double' ;
T69 : 'string' ;
T70 : 'host' ;
T71 : 'none' ;
T72 : 'max' ;
T73 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5593
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5595
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5597
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5599
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5601
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5603
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5605
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5607
RULE_TYPEID : '[' ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')* ']';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5609
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5611
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5613
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5615
RULE_ANY_OTHER : .;


