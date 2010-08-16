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
T42 : '@' ;
T43 : '=' ;
T44 : '<' ;
T45 : '<=' ;
T46 : '>' ;
T47 : '>=' ;
T48 : '<>' ;
T49 : 'pre' ;
T50 : 'or' ;
T51 : 'and' ;
T52 : 'not' ;
T53 : '+' ;
T54 : '-' ;
T55 : '*' ;
T56 : 'mod' ;
T57 : '/' ;
T58 : '?' ;
T59 : 'pure' ;
T60 : 'bool' ;
T61 : 'unsigned' ;
T62 : 'int' ;
T63 : 'float' ;
T64 : 'host' ;
T65 : 'none' ;
T66 : 'max' ;
T67 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3831
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3833
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3835
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3837
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3839
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3841
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3843
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3845
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3847
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3849
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3851
RULE_ANY_OTHER : .;


