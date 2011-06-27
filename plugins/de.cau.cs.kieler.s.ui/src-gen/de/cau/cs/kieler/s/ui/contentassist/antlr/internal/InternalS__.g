lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : 'pre' ;
T16 : 'or' ;
T17 : 'and' ;
T18 : 'not' ;
T19 : '+' ;
T20 : '-' ;
T21 : '*' ;
T22 : 'mod' ;
T23 : '/' ;
T24 : '?' ;
T25 : '=' ;
T26 : '<' ;
T27 : '<=' ;
T28 : '>' ;
T29 : '>=' ;
T30 : '<>' ;
T31 : 'pure' ;
T32 : 'boolean' ;
T33 : 'unsigned' ;
T34 : 'integer' ;
T35 : 'float' ;
T36 : 'double' ;
T37 : 'string' ;
T38 : 'host' ;
T39 : 'none' ;
T40 : 'max' ;
T41 : 'min' ;
T42 : 'Synchronous Program' ;
T43 : '(' ;
T44 : ')' ;
T45 : ':' ;
T46 : 'SIGNALS' ;
T47 : ';' ;
T48 : 'signal' ;
T49 : ':=' ;
T50 : 'combine' ;
T51 : 'with' ;
T52 : 'PAUSE' ;
T53 : 'TERM' ;
T54 : 'Halt' ;
T55 : 'JOIN' ;
T56 : 'ABORT' ;
T57 : 'IF' ;
T58 : '{' ;
T59 : '}' ;
T60 : ',' ;
T61 : 'GOTO' ;
T62 : 'FORK' ;
T63 : 'FORKE' ;
T64 : 'EMIT' ;
T65 : 'AWAIT' ;
T66 : 'PRIO' ;
T67 : 'input' ;
T68 : 'output' ;
T69 : 'inputoutput' ;
T70 : 'return' ;
T71 : 'var' ;
T72 : '@' ;
T73 : '[' ;
T74 : ']' ;
T75 : '.' ;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13374
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13376
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13378
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13380
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13382
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13384
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13386
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13388
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13390
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13392
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 13394
RULE_ANY_OTHER : .;


