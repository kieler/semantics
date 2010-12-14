lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.kies.parser.antlr.internal;

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
T74 : '*' ;
T75 : '+' ;
T76 : 'mod' ;
T77 : '<>' ;
T78 : '>' ;
T79 : '<' ;
T80 : '<=' ;
T81 : '>=' ;
T82 : 'not' ;
T83 : 'and' ;
T84 : 'or' ;
T85 : 'suspend' ;
T86 : 'sustain' ;
T87 : 'trap' ;
T88 : 'handle' ;
T89 : 'var' ;
T90 : '??' ;
T91 : 'immediate' ;
T92 : 'exec' ;
T93 : 'return' ;
T94 : 'input' ;
T95 : 'output' ;
T96 : 'inputoutput' ;
T97 : '@' ;
T98 : 'pre' ;
T99 : '?' ;
T100 : 'pure' ;
T101 : 'boolean' ;
T102 : 'unsigned' ;
T103 : 'integer' ;
T104 : 'float' ;
T105 : 'double' ;
T106 : 'string' ;
T107 : 'host' ;
T108 : 'none' ;
T109 : 'max' ;
T110 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13746
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13748
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13750
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13752
RULE_STRING : '"' (~('"')|'"' '"')* '"';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13754
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13756
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13758
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13760
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13762
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13764
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13766
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13768
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13770
RULE_ANY_OTHER : .;


