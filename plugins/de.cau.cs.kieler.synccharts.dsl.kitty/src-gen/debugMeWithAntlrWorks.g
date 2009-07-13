grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleChart
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
	 EOF
;

ruleChart 

:
(('statechart')

(ruleSableCCIdentifier)

(('[')

((ruleChartArgument)

(';')
)*

(ruleChartArgument)

(';')?

(']')
)?

('{')

(ruleIoDeclaration)*

(ruleCState)

('}')

(';')
)
;

ruleSableCCIdentifier :

((		'_' 
) |
(		'#' 
) |
(		'.' 
) |
(RULE_ID
) |
(RULE_INT
))*

;

ruleChartArgument 

:
((('model')

('=')

(RULE_STRING)
)
	|
(('version')

('=')

(RULE_STRING)
)
)
;

ruleIoDeclaration 

:
((ruleDeclarationType)

(ruleSableCCIdentifier)

((':')

('=')

(RULE_INT)
)?

((':')

(ruleVarEventType)
)?

(';')
)
;

ruleDeclarationType  :
		 'input'
		 
	 |		 'output'
		 
	 |		 'var'
		 
;

ruleVarEventType  :
		 'boolean'
		 
	 |		 'double'
		 
	 |		 'float'
		 
	 |		 'integer'
		 
	 |		 'combine integer with +'
		 
	 |		 'combine integer with *'
		 
;

ruleCState 

:
((('[')

((ruleStateArgument)

(';')
)*

(ruleStateArgument)

(';')?

(']')
)?

('{')

(ruleRegion)?

((ruleState)
	|
(ruleTransition)
	|
(('||')

(ruleRegion)?
)
)*

('}')

(';')
)
;

ruleStateArgument 

:
((('label')

('=')

(RULE_STRING)
)
	|
(('type')

('=')

(rulePseudo)
)
	|
(ruleEvent)
	|
(ruleVariable)
	|
(('doActivity')

('=')

(RULE_STRING)
)
	|
(('do')

('=')

(RULE_STRING)
)
	|
(('entryActivity')

('=')

(RULE_STRING)
)
	|
(('entry')

('=')

(RULE_STRING)
)
	|
(('exitActivity')

('=')

(RULE_STRING)
)
	|
(('exit')

('=')

(RULE_STRING)
)
)
;

rulePseudo  :
		 'final'
		 
	 |		 'initial'
		 
	 |		 'history'
		 
	 |		 'choice'
		 
	 |		 'dynamicchoice'
		 
	 |		 'suspend'
		 
;

ruleEvent 

:
(('localEvent')

('=')

(RULE_STRING)
)
;

ruleVariable 

:
(('localVariable')

('=')

(RULE_STRING)
)
;

ruleRegion 

:
(('<')

(ruleSableCCIdentifier)

('>')

(('[')

((ruleRegionArgument)

(';')
)*

(ruleRegionArgument)

(';')?

(']')
)?
)
;

ruleRegionArgument 

:
((('label')

('=')

(RULE_STRING)
)
	|
(ruleEvent)
	|
(ruleVariable)
)
;

ruleState 

:
(((ruleSableCCIdentifier)

(('[')

((ruleStateArgument)

(';')
)*

(ruleStateArgument)

(';')?

(']')
)?

(';')
)
	|
((ruleSableCCIdentifier)

(ruleCState)
)
)
;

ruleTransition 
:
        temp_initialtransition=ruleInitialTransition 	|        temp_noninitialtransition=ruleNonInitialTransition 	;

ruleInitialTransition 

:
(('->')

(ruleSableCCIdentifier)

(('[')

((ruleTransArgument)

(';')
)*

(ruleTransArgument)

(';')?

(']')
)?

(';')
)
;

ruleNonInitialTransition 

:
((ruleSableCCIdentifier)?

('->')

(ruleSableCCIdentifier)

(('[')

((ruleTransArgument)

(';')
)*

(ruleTransArgument)

(';')?

(']')
)?

(';')
)
;

ruleTransArgument 

:
((('label')

('=')

(RULE_STRING)
)
	|
(('type')

('=')

(ruleTransitionType)
)
	|
(('priority')

('=')

(RULE_STRING)
)
)
;

ruleTransitionType  :
		 'weakAbortion'
		 
	 |		 'wa'
		 
	 |		 'strongAbortion'
		 
	 |		 'sa'
		 
	 |		 'normalTermination'
		 
	 |		 'nt'
		 
	 |		 'suspension'
		 
	 |		 'sp'
		 
	 |		 'conditional'
		 
	 |		 'co'
		 
	 |		 'internal'
		 
	 |		 'it'
		 
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

