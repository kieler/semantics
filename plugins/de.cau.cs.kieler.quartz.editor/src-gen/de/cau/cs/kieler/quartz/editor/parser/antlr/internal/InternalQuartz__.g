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
T23 : '{' ;
T24 : '}' ;
T25 : 'satisfies' ;
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
T78 : 'SU' ;
T79 : 'SB' ;
T80 : 'SW' ;
T81 : 'WU' ;
T82 : 'WB' ;
T83 : 'WW' ;
T84 : 'PSU' ;
T85 : 'PSB' ;
T86 : 'PSW' ;
T87 : 'PMU' ;
T88 : 'PMB' ;
T89 : 'PMW' ;
T90 : 'X' ;
T91 : 'G' ;
T92 : 'F' ;
T93 : 'PA' ;
T94 : 'PF' ;
T95 : 'PSX' ;
T96 : 'PMX' ;
T97 : 'E' ;
T98 : 'A' ;
T99 : '[]' ;
T100 : '<>' ;
T101 : '[:]' ;
T102 : '<:>' ;
T103 : 'fixpoints' ;
T104 : 'in' ;
T105 : 'emit' ;
T106 : '<-' ;
T107 : 'release' ;
T108 : 'constrainS' ;
T109 : 'constrainM' ;
T110 : 'constrainE' ;
T111 : 'constrainSM' ;
T112 : 'constrainSE' ;
T113 : 'constrainME' ;
T114 : 'constrainSME' ;
T115 : 'do' ;
T116 : '..' ;
T117 : '||' ;
T118 : '|||' ;
T119 : '&&' ;
T120 : '&&&' ;
T121 : 'nothing' ;
T122 : 'pause' ;
T123 : 'halt' ;
T124 : 'immediate' ;
T125 : 'await' ;
T126 : 'weak' ;
T127 : 'suspend' ;
T128 : 'when' ;
T129 : 'abort' ;
T130 : 'during' ;
T131 : 'final' ;
T132 : 'while' ;
T133 : 'loop' ;
T134 : 'each' ;
T135 : 'always' ;
T136 : 'every' ;
T137 : 'if' ;
T138 : 'else' ;
T139 : 'case' ;
T140 : 'default' ;
T141 : 'choose' ;
T142 : 'for' ;
T143 : 'abstract' ;
T144 : 'let' ;
T145 : 'not' ;
T146 : '&' ;
T147 : 'and' ;
T148 : '|' ;
T149 : 'or' ;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6698
RULE_BVCONST : '0b';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6700
RULE_OCTCONST : '0o' ('0'..'7')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6702
RULE_HEXCONST : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6704
RULE_NATCONST : ('0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6706
RULE_REALCONST : ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+ ('e' ('+'|'-')? ('0'..'9')+)?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6708
RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6710
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6712
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g" 6714
RULE_WS : (' '|'\t'|'\r'|'\n')+;


