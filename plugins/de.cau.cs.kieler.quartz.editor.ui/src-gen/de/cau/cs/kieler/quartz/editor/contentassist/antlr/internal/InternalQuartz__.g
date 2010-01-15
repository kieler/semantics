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
T50 : 'satisfies' ;
T51 : '{' ;
T52 : '}' ;
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
T88 : 'X' ;
T89 : 'G' ;
T90 : 'F' ;
T91 : 'PA' ;
T92 : 'PF' ;
T93 : 'PSX' ;
T94 : 'PMX' ;
T95 : 'E' ;
T96 : 'A' ;
T97 : '[]' ;
T98 : '<>' ;
T99 : '[:]' ;
T100 : '<:>' ;
T101 : 'fixpoints' ;
T102 : 'in' ;
T103 : 'emit' ;
T104 : '<-' ;
T105 : 'do' ;
T106 : '..' ;
T107 : 'nothing' ;
T108 : 'weak' ;
T109 : 'immediate' ;
T110 : 'abort' ;
T111 : 'when' ;
T112 : 'abstract' ;
T113 : 'case' ;
T114 : 'default' ;
T115 : 'choose' ;
T116 : 'else' ;
T117 : 'while' ;
T118 : 'for' ;
T119 : 'if' ;
T120 : 'let' ;
T121 : 'loop' ;
T122 : 'pause' ;
T123 : 'halt' ;
T124 : 'every' ;
T125 : '.*' ;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12510
RULE_BVCONST : '0b';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12512
RULE_OCTCONST : '0o' ('0'..'7')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12514
RULE_HEXCONST : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12516
RULE_NATCONST : ('0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12518
RULE_REALCONST : ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+ ('e' ('+'|'-')? ('0'..'9')+)?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12520
RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12522
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12524
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 12526
RULE_WS : (' '|'\t'|'\r'|'\n')+;


