lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.esterel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T17 : 'module' ;
T18 : ':' ;
T19 : 'end' ;
T20 : '.' ;
T21 : '(' ;
T22 : ')' ;
T23 : ':=' ;
T24 : 'combine' ;
T25 : 'with' ;
T26 : 'signal' ;
T27 : 'in' ;
T28 : ',' ;
T29 : 'sensor' ;
T30 : ';' ;
T31 : 'relation' ;
T32 : '=>' ;
T33 : '#' ;
T34 : 'type' ;
T35 : 'constant' ;
T36 : '=' ;
T37 : '-' ;
T38 : 'function' ;
T39 : 'procedure' ;
T40 : 'task' ;
T41 : '||' ;
T42 : '[' ;
T43 : ']' ;
T44 : 'abort' ;
T45 : 'when' ;
T46 : 'do' ;
T47 : 'case' ;
T48 : 'weak' ;
T49 : 'await' ;
T50 : 'call' ;
T51 : 'upto' ;
T52 : 'watching' ;
T53 : 'timeout' ;
T54 : 'emit' ;
T55 : 'every' ;
T56 : 'exit' ;
T57 : 'halt' ;
T58 : 'if' ;
T59 : 'elsif' ;
T60 : 'then' ;
T61 : 'else' ;
T62 : 'loop' ;
T63 : 'each' ;
T64 : 'nothing' ;
T65 : 'pause' ;
T66 : 'present' ;
T67 : 'positive' ;
T68 : 'repeat' ;
T69 : 'times' ;
T70 : 'run' ;
T71 : 'copymodule' ;
T72 : '/' ;
T73 : 'tick' ;
T74 : 'suspend' ;
T75 : 'sustain' ;
T76 : 'trap' ;
T77 : 'handle' ;
T78 : 'var' ;
T79 : '??' ;
T80 : 'immediate' ;
T81 : 'exec' ;
T82 : 'return' ;
T83 : 'input' ;
T84 : 'output' ;
T85 : 'inputoutput' ;
T86 : '@' ;
T87 : '<' ;
T88 : '<=' ;
T89 : '>' ;
T90 : '>=' ;
T91 : '<>' ;
T92 : 'pre' ;
T93 : 'or' ;
T94 : 'and' ;
T95 : 'not' ;
T96 : '+' ;
T97 : '*' ;
T98 : 'mod' ;
T99 : '?' ;
T100 : 'pure' ;
T101 : 'bool' ;
T102 : 'unsigned' ;
T103 : 'int' ;
T104 : 'float' ;
T105 : 'host' ;
T106 : 'none' ;
T107 : 'max' ;
T108 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13568
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13570
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13572
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13574
RULE_STRING : '"' (~('"')|'"' '"')* '"';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13576
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13578
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13580
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13582
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13584
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13586
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13588
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13590
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g" 13592
RULE_ANY_OTHER : .;


