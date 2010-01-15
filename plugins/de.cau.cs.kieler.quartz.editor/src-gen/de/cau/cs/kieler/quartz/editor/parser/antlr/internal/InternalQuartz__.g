lexer grammar InternalQuartz;
@header {
package de.cau.cs.kieler.quartz.editor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'package' ;
T14 : ';' ;
T15 : 'import' ;
T16 : '.' ;
T17 : '.*' ;
T18 : 'macro' ;
T19 : '(' ;
T20 : ')' ;
T21 : '=' ;
T22 : 'module' ;
T23 : 'satisfies' ;
T24 : '{' ;
T25 : '}' ;
T26 : ',' ;
T27 : 'event' ;
T28 : 'mem' ;
T29 : 'bool' ;
T30 : 'real' ;
T31 : 'bv' ;
T32 : 'nat' ;
T33 : 'int' ;
T34 : '[' ;
T35 : ']' ;
T36 : '?' ;
T37 : '!' ;
T38 : 'ProveE' ;
T39 : 'ProveA' ;
T40 : 'DisProveE' ;
T41 : 'DisProveA' ;
T42 : 'with' ;
T43 : ':' ;
T44 : 'assume' ;
T45 : 'assert' ;
T46 : 'mu' ;
T47 : 'nu' ;
T48 : '_' ;
T49 : 'instant' ;
T50 : 'inside' ;
T51 : 'terminate' ;
T52 : 'true' ;
T53 : 'false' ;
T54 : '+' ;
T55 : '-' ;
T56 : 'abs' ;
T57 : 'sat' ;
T58 : 'der' ;
T59 : 'reverse' ;
T60 : '::' ;
T61 : 'next' ;
T62 : 'nat2bv' ;
T63 : 'int2bv' ;
T64 : 'arr2bv' ;
T65 : 'tup2bv' ;
T66 : 'bv2nat' ;
T67 : 'bv2int' ;
T68 : 'nat2real' ;
T69 : 'int2real' ;
T70 : 'sin' ;
T71 : 'cos' ;
T72 : 'exp' ;
T73 : 'log' ;
T74 : 'sizeOf' ;
T75 : 'forall' ;
T76 : 'exists' ;
T77 : 'sum' ;
T78 : 'X' ;
T79 : 'G' ;
T80 : 'F' ;
T81 : 'PA' ;
T82 : 'PF' ;
T83 : 'PSX' ;
T84 : 'PMX' ;
T85 : 'E' ;
T86 : 'A' ;
T87 : '[]' ;
T88 : '<>' ;
T89 : '[:]' ;
T90 : '<:>' ;
T91 : 'fixpoints' ;
T92 : 'in' ;
T93 : 'emit' ;
T94 : '<-' ;
T95 : 'do' ;
T96 : '..' ;
T97 : '||' ;
T98 : '|||' ;
T99 : '&&' ;
T100 : '&&&' ;
T101 : 'nothing' ;
T102 : 'weak' ;
T103 : 'immediate' ;
T104 : 'abort' ;
T105 : 'when' ;
T106 : 'during' ;
T107 : 'final' ;
T108 : 'abstract' ;
T109 : 'case' ;
T110 : 'default' ;
T111 : 'choose' ;
T112 : 'else' ;
T113 : 'while' ;
T114 : 'for' ;
T115 : 'if' ;
T116 : 'let' ;
T117 : 'loop' ;
T118 : 'pause' ;
T119 : 'halt' ;
T120 : 'every' ;
T121 : 'not' ;
T122 : '&' ;
T123 : 'and' ;
T124 : '|' ;
T125 : 'or' ;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5275
RULE_BVCONST : '0b';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5277
RULE_OCTCONST : '0o' ('0'..'7')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5279
RULE_HEXCONST : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5281
RULE_NATCONST : ('0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5283
RULE_REALCONST : ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+ ('e' ('+'|'-')? ('0'..'9')+)?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5285
RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5287
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5289
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 5291
RULE_WS : (' '|'\t'|'\r'|'\n')+;


