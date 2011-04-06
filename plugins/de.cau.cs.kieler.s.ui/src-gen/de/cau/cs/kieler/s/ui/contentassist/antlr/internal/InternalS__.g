lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.ui.contentassist.antlr.internal;

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
T43 : 'Synchronous Program' ;
T44 : '(' ;
T45 : ')' ;
T46 : ':' ;
T47 : 'SIGNALS' ;
T48 : ';' ;
T49 : 'signal' ;
T50 : ':=' ;
T51 : 'combine' ;
T52 : 'with' ;
T53 : 'PAUSE' ;
T54 : 'TERM' ;
T55 : 'Halt' ;
T56 : 'JOIN' ;
T57 : 'ABORT' ;
T58 : 'IF' ;
T59 : '{' ;
T60 : '}' ;
T61 : ',' ;
T62 : 'GOTO' ;
T63 : 'FORK' ;
T64 : 'FORKE' ;
T65 : 'EMIT' ;
T66 : 'AWAIT' ;
T67 : 'PRIO' ;
T68 : 'input' ;
T69 : 'output' ;
T70 : 'inputoutput' ;
T71 : 'return' ;
T72 : 'var' ;
T73 : '@' ;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13156
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13158
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13160
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13162
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13164
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13166
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13168
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13170
RULE_TYPEID : '[' ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')* ']';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13172
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13174
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13176
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13178
RULE_ANY_OTHER : .;


