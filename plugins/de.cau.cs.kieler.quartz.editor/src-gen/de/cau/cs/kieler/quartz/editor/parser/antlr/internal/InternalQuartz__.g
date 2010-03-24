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
T23 : ',' ;
T24 : 'event' ;
T25 : 'mem' ;
T26 : 'bool' ;
T27 : 'real' ;
T28 : 'bv' ;
T29 : '{' ;
T30 : '}' ;
T31 : 'nat' ;
T32 : 'int' ;
T33 : '[' ;
T34 : ']' ;
T35 : '?' ;
T36 : '!' ;
T37 : 'mu' ;
T38 : 'nu' ;
T39 : '_' ;
T40 : 'instant' ;
T41 : 'inside' ;
T42 : 'terminate' ;
T43 : 'true' ;
T44 : 'false' ;
T45 : '+' ;
T46 : '-' ;
T47 : 'abs' ;
T48 : 'sat' ;
T49 : 'der' ;
T50 : 'reverse' ;
T51 : '::' ;
T52 : 'next' ;
T53 : 'nat2bv' ;
T54 : 'int2bv' ;
T55 : 'arr2bv' ;
T56 : 'tup2bv' ;
T57 : 'bv2nat' ;
T58 : 'bv2int' ;
T59 : 'nat2real' ;
T60 : 'int2real' ;
T61 : 'sin' ;
T62 : 'cos' ;
T63 : 'exp' ;
T64 : 'log' ;
T65 : 'sizeOf' ;
T66 : 'forall' ;
T67 : 'exists' ;
T68 : 'sum' ;
T69 : 'X' ;
T70 : 'G' ;
T71 : 'F' ;
T72 : 'PA' ;
T73 : 'PF' ;
T74 : 'PSX' ;
T75 : 'PMX' ;
T76 : 'E' ;
T77 : 'A' ;
T78 : '[]' ;
T79 : '<>' ;
T80 : '[:]' ;
T81 : '<:>' ;
T82 : 'fixpoints' ;
T83 : 'in' ;
T84 : ':' ;
T85 : 'emit' ;
T86 : '<-' ;
T87 : 'assume' ;
T88 : 'assert' ;
T89 : 'do' ;
T90 : '..' ;
T91 : '||' ;
T92 : '|||' ;
T93 : '&&' ;
T94 : '&&&' ;
T95 : 'nothing' ;
T96 : 'weak' ;
T97 : 'immediate' ;
T98 : 'abort' ;
T99 : 'when' ;
T100 : 'during' ;
T101 : 'final' ;
T102 : 'abstract' ;
T103 : 'case' ;
T104 : 'default' ;
T105 : 'choose' ;
T106 : 'while' ;
T107 : 'for' ;
T108 : 'if' ;
T109 : 'else' ;
T110 : 'let' ;
T111 : 'loop' ;
T112 : 'pause' ;
T113 : 'halt' ;
T114 : 'every' ;
T115 : 'not' ;
T116 : '&' ;
T117 : 'and' ;
T118 : '|' ;
T119 : 'or' ;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4499
RULE_BVCONST : '0b';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4501
RULE_OCTCONST : '0o' ('0'..'7')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4503
RULE_HEXCONST : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4505
RULE_NATCONST : ('0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4507
RULE_REALCONST : ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+ ('e' ('+'|'-')? ('0'..'9')+)?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4509
RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4511
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4513
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 4515
RULE_WS : (' '|'\t'|'\r'|'\n')+;


