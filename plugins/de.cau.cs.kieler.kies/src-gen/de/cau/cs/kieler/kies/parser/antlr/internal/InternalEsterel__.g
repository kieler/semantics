lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.kies.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T18 : 'module' ;
T19 : ':' ;
T20 : 'end' ;
T21 : '.' ;
T22 : '(' ;
T23 : ')' ;
T24 : ':=' ;
T25 : 'combine' ;
T26 : 'with' ;
T27 : 'signal' ;
T28 : 'in' ;
T29 : ',' ;
T30 : 'sensor' ;
T31 : ';' ;
T32 : 'relation' ;
T33 : '=>' ;
T34 : '#' ;
T35 : 'type' ;
T36 : 'constant' ;
T37 : '=' ;
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
T74 : '*' ;
T75 : '+' ;
T76 : '-' ;
T77 : 'mod' ;
T78 : '<>' ;
T79 : '>' ;
T80 : '<' ;
T81 : '<=' ;
T82 : '>=' ;
T83 : 'not' ;
T84 : 'and' ;
T85 : 'or' ;
T86 : 'suspend' ;
T87 : 'sustain' ;
T88 : 'trap' ;
T89 : 'handle' ;
T90 : 'var' ;
T91 : '??' ;
T92 : 'immediate' ;
T93 : 'exec' ;
T94 : 'return' ;
T95 : 'input' ;
T96 : 'output' ;
T97 : 'inputoutput' ;
T98 : '@' ;
T99 : 'pre' ;
T100 : '?' ;
T101 : 'pure' ;
T102 : 'boolean' ;
T103 : 'unsigned' ;
T104 : 'integer' ;
T105 : 'float' ;
T106 : 'double' ;
T107 : 'string' ;
T108 : 'host' ;
T109 : 'none' ;
T110 : 'max' ;
T111 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14275
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14277
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14279
RULE_STRING : '"' (~('"')|'"' '"')* '"';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14281
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14283
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14285
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14287
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14289
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14291
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14293
RULE_TYPEID : '[' ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')* ']';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14295
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14297
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14299
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 14301
RULE_ANY_OTHER : .;


