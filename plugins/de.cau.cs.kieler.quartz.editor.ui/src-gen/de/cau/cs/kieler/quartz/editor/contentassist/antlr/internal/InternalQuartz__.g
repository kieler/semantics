lexer grammar InternalQuartz;
@header {
package de.cau.cs.kieler.quartz.editor.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'event' ;
T14 : 'mem' ;
T15 : 'bool' ;
T16 : 'real' ;
T17 : 'bv' ;
T18 : 'nat' ;
T19 : 'int' ;
T20 : '?' ;
T21 : '!' ;
T22 : 'mu' ;
T23 : 'nu' ;
T24 : '_' ;
T25 : 'instant' ;
T26 : 'inside' ;
T27 : 'terminate' ;
T28 : 'true' ;
T29 : 'false' ;
T30 : '||' ;
T31 : '|||' ;
T32 : '&&' ;
T33 : '&&&' ;
T34 : 'during' ;
T35 : 'final' ;
T36 : 'not' ;
T37 : '&' ;
T38 : 'and' ;
T39 : '|' ;
T40 : 'or' ;
T41 : 'package' ;
T42 : ';' ;
T43 : 'import' ;
T44 : '.' ;
T45 : 'macro' ;
T46 : '(' ;
T47 : ')' ;
T48 : '=' ;
T49 : 'module' ;
T50 : '{' ;
T51 : '}' ;
T52 : 'satisfies' ;
T53 : ',' ;
T54 : '[' ;
T55 : ']' ;
T56 : 'ProveE' ;
T57 : 'ProveA' ;
T58 : 'DisProveE' ;
T59 : 'DisProveA' ;
T60 : 'with' ;
T61 : ':' ;
T62 : 'assume' ;
T63 : 'assert' ;
T64 : '+' ;
T65 : '-' ;
T66 : 'abs' ;
T67 : 'sat' ;
T68 : 'der' ;
T69 : 'reverse' ;
T70 : '::' ;
T71 : 'next' ;
T72 : 'nat2bv' ;
T73 : 'int2bv' ;
T74 : 'arr2bv' ;
T75 : 'tup2bv' ;
T76 : 'bv2nat' ;
T77 : 'bv2int' ;
T78 : 'nat2real' ;
T79 : 'int2real' ;
T80 : 'sin' ;
T81 : 'cos' ;
T82 : 'exp' ;
T83 : 'log' ;
T84 : 'sizeOf' ;
T85 : 'forall' ;
T86 : 'exists' ;
T87 : 'sum' ;
T88 : 'SU' ;
T89 : 'SB' ;
T90 : 'SW' ;
T91 : 'WU' ;
T92 : 'WB' ;
T93 : 'WW' ;
T94 : 'PSU' ;
T95 : 'PSB' ;
T96 : 'PSW' ;
T97 : 'PMU' ;
T98 : 'PMB' ;
T99 : 'PMW' ;
T100 : 'X' ;
T101 : 'G' ;
T102 : 'F' ;
T103 : 'PA' ;
T104 : 'PF' ;
T105 : 'PSX' ;
T106 : 'PMX' ;
T107 : 'E' ;
T108 : 'A' ;
T109 : '[]' ;
T110 : '<>' ;
T111 : '[:]' ;
T112 : '<:>' ;
T113 : 'fixpoints' ;
T114 : 'in' ;
T115 : 'emit' ;
T116 : '<-' ;
T117 : 'release' ;
T118 : 'constrainS' ;
T119 : 'constrainM' ;
T120 : 'constrainE' ;
T121 : 'constrainSM' ;
T122 : 'constrainSE' ;
T123 : 'constrainME' ;
T124 : 'constrainSME' ;
T125 : 'do' ;
T126 : '..' ;
T127 : 'nothing' ;
T128 : 'pause' ;
T129 : 'halt' ;
T130 : 'immediate' ;
T131 : 'await' ;
T132 : 'weak' ;
T133 : 'suspend' ;
T134 : 'when' ;
T135 : 'abort' ;
T136 : 'while' ;
T137 : 'loop' ;
T138 : 'each' ;
T139 : 'always' ;
T140 : 'every' ;
T141 : 'if' ;
T142 : 'else' ;
T143 : 'case' ;
T144 : 'default' ;
T145 : 'choose' ;
T146 : 'for' ;
T147 : 'abstract' ;
T148 : 'let' ;
T149 : '.*' ;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15973
RULE_BVCONST : '0b';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15975
RULE_OCTCONST : '0o' ('0'..'7')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15977
RULE_HEXCONST : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15979
RULE_NATCONST : ('0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15981
RULE_REALCONST : ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+ ('e' ('+'|'-')? ('0'..'9')+)?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15983
RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15985
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15987
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 15989
RULE_WS : (' '|'\t'|'\r'|'\n')+;


