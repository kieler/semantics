lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.esterel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T17 : 'tick' ;
T18 : 'pre' ;
T19 : 'or' ;
T20 : 'and' ;
T21 : 'not' ;
T22 : '+' ;
T23 : '-' ;
T24 : '*' ;
T25 : 'mod' ;
T26 : '/' ;
T27 : '?' ;
T28 : '.' ;
T29 : '=' ;
T30 : '<' ;
T31 : '<=' ;
T32 : '>' ;
T33 : '>=' ;
T34 : '<>' ;
T35 : 'pure' ;
T36 : 'bool' ;
T37 : 'unsigned' ;
T38 : 'int' ;
T39 : 'float' ;
T40 : 'host' ;
T41 : 'none' ;
T42 : 'max' ;
T43 : 'min' ;
T44 : 'module' ;
T45 : ':' ;
T46 : 'end' ;
T47 : '(' ;
T48 : ')' ;
T49 : ':=' ;
T50 : 'combine' ;
T51 : 'with' ;
T52 : 'signal' ;
T53 : 'in' ;
T54 : ',' ;
T55 : 'sensor' ;
T56 : ';' ;
T57 : 'relation' ;
T58 : '#' ;
T59 : 'type' ;
T60 : 'constant' ;
T61 : 'function' ;
T62 : 'procedure' ;
T63 : 'task' ;
T64 : '||' ;
T65 : '[' ;
T66 : ']' ;
T67 : 'abort' ;
T68 : 'when' ;
T69 : 'do' ;
T70 : 'case' ;
T71 : 'weak' ;
T72 : 'await' ;
T73 : 'call' ;
T74 : 'upto' ;
T75 : 'watching' ;
T76 : 'timeout' ;
T77 : 'emit' ;
T78 : 'every' ;
T79 : 'exit' ;
T80 : 'halt' ;
T81 : 'if' ;
T82 : 'elsif' ;
T83 : 'then' ;
T84 : 'else' ;
T85 : 'loop' ;
T86 : 'each' ;
T87 : 'nothing' ;
T88 : 'pause' ;
T89 : 'present' ;
T90 : 'repeat' ;
T91 : 'times' ;
T92 : 'run' ;
T93 : 'copymodule' ;
T94 : 'suspend' ;
T95 : 'sustain' ;
T96 : 'trap' ;
T97 : 'handle' ;
T98 : '??' ;
T99 : 'exec' ;
T100 : 'return' ;
T101 : 'input' ;
T102 : 'output' ;
T103 : 'inputoutput' ;
T104 : 'var' ;
T105 : '@' ;
T106 : '=>' ;
T107 : 'positive' ;
T108 : 'immediate' ;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30368
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30370
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30372
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30374
RULE_STRING : '"' (~('"')|'"' '"')* '"';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30376
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30378
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30380
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30382
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30384
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30386
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30388
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30390
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel.ui/src-gen/de/cau/cs/kieler/esterel/ui/contentassist/antlr/internal/InternalEsterel.g" 30392
RULE_ANY_OTHER : .;


