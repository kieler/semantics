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
T37 : 'function' ;
T38 : 'procedure' ;
T39 : 'task' ;
T40 : '||' ;
T41 : '[' ;
T42 : ']' ;
T43 : 'abort' ;
T44 : 'when' ;
T45 : 'do' ;
T46 : 'case' ;
T47 : 'weak' ;
T48 : 'await' ;
T49 : 'call' ;
T50 : 'upto' ;
T51 : 'watching' ;
T52 : 'timeout' ;
T53 : 'emit' ;
T54 : 'every' ;
T55 : 'exit' ;
T56 : 'halt' ;
T57 : 'if' ;
T58 : 'elsif' ;
T59 : 'then' ;
T60 : 'else' ;
T61 : 'loop' ;
T62 : 'each' ;
T63 : 'nothing' ;
T64 : 'pause' ;
T65 : 'present' ;
T66 : 'positive' ;
T67 : 'repeat' ;
T68 : 'times' ;
T69 : 'run' ;
T70 : 'copymodule' ;
T71 : '/' ;
T72 : 'tick' ;
T73 : '*' ;
T74 : '+' ;
T75 : '-' ;
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

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13933
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13935
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13937
RULE_STRING : '"' (~('"')|'"' '"')* '"';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13939
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13941
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13943
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13945
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13947
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13949
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13951
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13953
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13955
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g" 13957
RULE_ANY_OTHER : .;


