lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'pre' ;
T12 : 'or' ;
T13 : 'and' ;
T14 : 'not' ;
T15 : '+' ;
T16 : '-' ;
T17 : '*' ;
T18 : 'mod' ;
T19 : '/' ;
T20 : '?' ;
T21 : 'E' ;
T22 : 'e' ;
T23 : 'true' ;
T24 : 'false' ;
T25 : '=' ;
T26 : '<' ;
T27 : '<=' ;
T28 : '>' ;
T29 : '>=' ;
T30 : '<>' ;
T31 : 'PURE' ;
T32 : 'BOOL' ;
T33 : 'UNSIGNED' ;
T34 : 'INT' ;
T35 : 'FLOAT' ;
T36 : 'HOST' ;
T37 : 'NONE' ;
T38 : 'max' ;
T39 : 'min' ;
T40 : 'host' ;
T41 : 'Synchronous Program' ;
T42 : '(' ;
T43 : ')' ;
T44 : ':' ;
T45 : 'SIGNALS' ;
T46 : ';' ;
T47 : 'signal' ;
T48 : ':=' ;
T49 : 'combine' ;
T50 : 'with' ;
T51 : 'PAUSE' ;
T52 : 'TERM' ;
T53 : 'Halt' ;
T54 : 'JOIN' ;
T55 : 'ABORT' ;
T56 : 'IF' ;
T57 : '{' ;
T58 : '}' ;
T59 : ',' ;
T60 : 'GOTO' ;
T61 : 'FORK' ;
T62 : 'FORKE' ;
T63 : 'EMIT' ;
T64 : 'AWAIT' ;
T65 : 'PRIO' ;
T66 : '.' ;
T67 : 'input' ;
T68 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9274
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9276
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9278
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9280
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9282
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9284
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9286
RULE_ANY_OTHER : .;


