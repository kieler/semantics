lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'Synchronous Program' ;
T16 : '(' ;
T17 : ')' ;
T18 : ':' ;
T19 : 'SIGNALS' ;
T20 : ';' ;
T21 : 'input' ;
T22 : 'output' ;
T23 : 'signal' ;
T24 : ':=' ;
T25 : 'combine' ;
T26 : 'with' ;
T27 : 'PAUSE' ;
T28 : 'TERM' ;
T29 : 'Halt' ;
T30 : 'JOIN' ;
T31 : 'ABORT' ;
T32 : 'IF' ;
T33 : ',' ;
T34 : '{' ;
T35 : '}' ;
T36 : 'GOTO' ;
T37 : 'FORK' ;
T38 : 'FORKE' ;
T39 : 'EMIT' ;
T40 : 'AWAIT' ;
T41 : 'PRIO' ;
T42 : 'inputoutput' ;
T43 : 'return' ;
T44 : 'var' ;
T45 : '@' ;
T46 : '[' ;
T47 : ']' ;
T48 : '.' ;
T49 : '=' ;
T50 : '<' ;
T51 : '<=' ;
T52 : '>' ;
T53 : '>=' ;
T54 : '<>' ;
T55 : 'pre' ;
T56 : 'or' ;
T57 : 'and' ;
T58 : 'not' ;
T59 : '+' ;
T60 : '-' ;
T61 : '*' ;
T62 : 'mod' ;
T63 : '/' ;
T64 : '?' ;
T65 : 'pure' ;
T66 : 'boolean' ;
T67 : 'unsigned' ;
T68 : 'integer' ;
T69 : 'float' ;
T70 : 'double' ;
T71 : 'string' ;
T72 : 'host' ;
T73 : 'none' ;
T74 : 'max' ;
T75 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5644
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5646
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5648
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5650
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5652
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5654
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5656
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5658
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5660
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5662
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 5664
RULE_ANY_OTHER : .;


