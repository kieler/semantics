lexer grammar InternalEsterel;
@header {
package de.cau.cs.kieler.kies.ui.contentassist.antlr.internal;

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
T30 : '<>' ;
T31 : '>' ;
T32 : '<' ;
T33 : '<=' ;
T34 : '>=' ;
T35 : 'pure' ;
T36 : 'boolean' ;
T37 : 'unsigned' ;
T38 : 'integer' ;
T39 : 'float' ;
T40 : 'double' ;
T41 : 'string' ;
T42 : 'host' ;
T43 : 'none' ;
T44 : 'max' ;
T45 : 'min' ;
T46 : 'module' ;
T47 : ':' ;
T48 : 'end' ;
T49 : '(' ;
T50 : ')' ;
T51 : ':=' ;
T52 : 'combine' ;
T53 : 'with' ;
T54 : 'signal' ;
T55 : 'in' ;
T56 : ',' ;
T57 : 'sensor' ;
T58 : ';' ;
T59 : 'relation' ;
T60 : '#' ;
T61 : 'type' ;
T62 : 'constant' ;
T63 : 'function' ;
T64 : 'procedure' ;
T65 : 'task' ;
T66 : '||' ;
T67 : '[' ;
T68 : ']' ;
T69 : 'abort' ;
T70 : 'when' ;
T71 : 'do' ;
T72 : 'case' ;
T73 : 'weak' ;
T74 : 'await' ;
T75 : 'call' ;
T76 : 'upto' ;
T77 : 'watching' ;
T78 : 'timeout' ;
T79 : 'emit' ;
T80 : 'every' ;
T81 : 'exit' ;
T82 : 'halt' ;
T83 : 'if' ;
T84 : 'elsif' ;
T85 : 'then' ;
T86 : 'else' ;
T87 : 'loop' ;
T88 : 'each' ;
T89 : 'nothing' ;
T90 : 'pause' ;
T91 : 'present' ;
T92 : 'repeat' ;
T93 : 'times' ;
T94 : 'run' ;
T95 : 'copymodule' ;
T96 : 'suspend' ;
T97 : 'sustain' ;
T98 : 'trap' ;
T99 : 'handle' ;
T100 : '??' ;
T101 : 'exec' ;
T102 : 'return' ;
T103 : 'input' ;
T104 : 'output' ;
T105 : 'inputoutput' ;
T106 : 'var' ;
T107 : '@' ;
T108 : '=>' ;
T109 : 'positive' ;
T110 : 'immediate' ;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30543
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30545
RULE_ESTEREL_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30547
RULE_ESTEREL_ML_COMMENT : '%' '{' ( options {greedy=false;} : . )*'}' '%';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30549
RULE_STRING : '"' (~('"')|'"' '"')* '"';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30551
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30553
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30555
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30557
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30559
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30561
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30563
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30565
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.kies.ui/src-gen/de/cau/cs/kieler/kies/ui/contentassist/antlr/internal/InternalEsterel.g" 30567
RULE_ANY_OTHER : .;


