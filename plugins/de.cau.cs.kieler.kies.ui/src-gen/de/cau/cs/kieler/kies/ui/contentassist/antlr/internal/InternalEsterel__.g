lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.kies.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T18 : 'tick' ;
T19 : 'pre' ;
T20 : 'or' ;
T21 : 'and' ;
T22 : 'not' ;
T23 : '+' ;
T24 : '-' ;
T25 : '*' ;
T26 : 'mod' ;
T27 : '/' ;
T28 : '?' ;
T29 : '.' ;
T30 : '=' ;
T31 : '<>' ;
T32 : '>' ;
T33 : '<' ;
T34 : '<=' ;
T35 : '>=' ;
T36 : 'pure' ;
T37 : 'boolean' ;
T38 : 'unsigned' ;
T39 : 'integer' ;
T40 : 'float' ;
T41 : 'double' ;
T42 : 'string' ;
T43 : 'host' ;
T44 : 'none' ;
T45 : 'max' ;
T46 : 'min' ;
T47 : 'module' ;
T48 : ':' ;
T49 : 'end' ;
T50 : '(' ;
T51 : ')' ;
T52 : ':=' ;
T53 : 'combine' ;
T54 : 'with' ;
T55 : 'signal' ;
T56 : 'in' ;
T57 : ',' ;
T58 : 'sensor' ;
T59 : ';' ;
T60 : 'relation' ;
T61 : '#' ;
T62 : 'type' ;
T63 : 'constant' ;
T64 : 'function' ;
T65 : 'procedure' ;
T66 : 'task' ;
T67 : '||' ;
T68 : '[' ;
T69 : ']' ;
T70 : 'abort' ;
T71 : 'when' ;
T72 : 'do' ;
T73 : 'case' ;
T74 : 'weak' ;
T75 : 'await' ;
T76 : 'call' ;
T77 : 'upto' ;
T78 : 'watching' ;
T79 : 'timeout' ;
T80 : 'emit' ;
T81 : 'every' ;
T82 : 'exit' ;
T83 : 'halt' ;
T84 : 'if' ;
T85 : 'elsif' ;
T86 : 'then' ;
T87 : 'else' ;
T88 : 'loop' ;
T89 : 'each' ;
T90 : 'nothing' ;
T91 : 'pause' ;
T92 : 'present' ;
T93 : 'repeat' ;
T94 : 'times' ;
T95 : 'run' ;
T96 : 'copymodule' ;
T97 : 'suspend' ;
T98 : 'sustain' ;
T99 : 'trap' ;
T100 : 'handle' ;
T101 : '??' ;
T102 : 'exec' ;
T103 : 'return' ;
T104 : 'input' ;
T105 : 'output' ;
T106 : 'inputoutput' ;
T107 : 'var' ;
T108 : '@' ;
T109 : '=>' ;
T110 : 'positive' ;
T111 : 'immediate' ;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32086
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32088
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32090
RULE_STRING : '"' (~('"')|'"' '"')* '"';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32092
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32094
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32096
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32098
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32100
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32102
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32104
RULE_TYPEID : '[' ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')* ']';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32106
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32108
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32110
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 32112
RULE_ANY_OTHER : .;


