grammar kitty;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package de.cau.cs.kieler.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package de.cau.cs.kieler.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import de.cau.cs.kieler.MetaModelRegistration;

}
@lexer::members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == kittyLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==kittyLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==kittyLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManagerNeu ptm = new ParseTreeManagerNeu();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
		
	}

	public ParseTreeManagerNeu getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
	public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		ptm.addError(msg, e);
		// This doesn't work. ANTLR may simply report an superfluous token. In that case,
		// two nodes will be finished instead of one.
		// ptm.ruleFinished(null, end());
	}

    private boolean skipCurrentToken;
    
	@Override
	protected boolean recoverFromMismatchedElement(IntStream arg0, RecognitionException arg1, BitSet arg2) {
		skipCurrentToken = true;
		return super.recoverFromMismatchedElement(arg0, arg1, arg2);
	}
}


parse returns [Node r]:
	 result=ruleChart
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
{
if (result != null)
  ptm.setModelElement(result);
$r = ptm.getCurrent();
ptm.ruleFinished(result);}	 EOF
;

ruleChart returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Chart");
			 }
(({skipCurrentToken = false;}'statechart'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"name",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)

(({skipCurrentToken = false;}'['{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(0)));}temp_ChartArgument=
ruleChartArgument{if (temp_ChartArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_ChartArgument);
  factory.add($result,"chartArgs",convert(temp_ChartArgument),false);
  ptm.ruleFinished(temp_ChartArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
)*

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(2)));}temp_ChartArgument=
ruleChartArgument{if (temp_ChartArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_ChartArgument);
  factory.add($result,"chartArgs",convert(temp_ChartArgument),false);
  ptm.ruleFinished(temp_ChartArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})?

({skipCurrentToken = false;}']'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)?

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(4)));}temp_IoDeclaration=
ruleIoDeclaration{if (temp_IoDeclaration != null) {
  hasContent = true;
  ptm.setModelElement(temp_IoDeclaration);
  factory.add($result,"iodeclarations",convert(temp_IoDeclaration),false);
  ptm.ruleFinished(temp_IoDeclaration);
} else {
  ptm.destroyNode();
}
}
)*

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(5)));}temp_CState=
ruleCState{if (temp_CState != null) {
  hasContent = true;
  ptm.setModelElement(temp_CState);
  factory.set($result,"cstate",convert(temp_CState),false);
  ptm.ruleFinished(temp_CState);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(6)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(7)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleSableCCIdentifier returns [String s] @init {StringBuffer buff = new StringBuffer(); boolean hasContent = false;} :
	 

((	{skipCurrentToken = false;}	'_' {if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(0)));
  ptm.ruleFinished(temp);
  buff.append(temp.getText());
}}
) |
(	{skipCurrentToken = false;}	'#' {if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(1)));
  ptm.ruleFinished(temp);
  buff.append(temp.getText());
}}
) |
(	{skipCurrentToken = false;}	'.' {if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(2)));
  ptm.ruleFinished(temp);
  buff.append(temp.getText());
}}
) |
({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(3)));
  ptm.ruleFinished(temp);
  if (temp.getType() == kittyLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}) |
({skipCurrentToken = false;}
RULE_INT
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(4)));
  ptm.ruleFinished(temp);
  if (temp.getType() == kittyLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}))*

{if (hasContent)
  $s =buff.toString();}
;
catch [RecognitionException re] {if (hasContent)
$s =buff.toString();
reportError(re);
recover(input,re);}

ruleChartArgument returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "ChartArgument");
			 }
((({skipCurrentToken = false;}'model'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
  factory.set($result,"model",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'version'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
  factory.set($result,"version",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleIoDeclaration returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "IoDeclaration");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));}temp_DeclarationType=
ruleDeclarationType{if (temp_DeclarationType != null) {
  hasContent = true;
  factory.set($result,"type",convert(temp_DeclarationType),false);
  ptm.ruleFinished(temp_DeclarationType);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"name",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)

(({skipCurrentToken = false;}':'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_INT{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
  factory.set($result,"initialValue",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)?

(({skipCurrentToken = false;}':'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)).eContents().get(1)));}temp_VarEventType=
ruleVarEventType{if (temp_VarEventType != null) {
  hasContent = true;
  factory.set($result,"varEventType",convert(temp_VarEventType),false);
  ptm.ruleFinished(temp_VarEventType);
} else {
  ptm.destroyNode();
}
}
)
)?

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleDeclarationType returns [Enumerator r] :
		 'input'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)));
$r=factory.enumLit("", "DeclarationType","input");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'output'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(2)));
$r=factory.enumLit("", "DeclarationType","output");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'var'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(3)));
$r=factory.enumLit("", "DeclarationType","variable");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
;

ruleVarEventType returns [Enumerator r] :
		 'boolean'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));
$r=factory.enumLit("", "VarEventType","boolean");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'double'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(2)));
$r=factory.enumLit("", "VarEventType","double");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'float'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(3)));
$r=factory.enumLit("", "VarEventType","float");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'integer'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(4)));
$r=factory.enumLit("", "VarEventType","integer");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'combine integer with +'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(5)));
$r=factory.enumLit("", "VarEventType","combPlus");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'combine integer with *'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(6)));
$r=factory.enumLit("", "VarEventType","combMal");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
;

ruleCState returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "CState");
			 }
((({skipCurrentToken = false;}'['{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(0)));}temp_StateArgument=
ruleStateArgument{if (temp_StateArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_StateArgument);
  factory.add($result,"stateArgs",convert(temp_StateArgument),false);
  ptm.ruleFinished(temp_StateArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
)*

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(2)));}temp_StateArgument=
ruleStateArgument{if (temp_StateArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_StateArgument);
  factory.add($result,"stateArgs",convert(temp_StateArgument),false);
  ptm.ruleFinished(temp_StateArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})?

({skipCurrentToken = false;}']'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)?

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)));}temp_Region=
ruleRegion{if (temp_Region != null) {
  hasContent = true;
  ptm.setModelElement(temp_Region);
  factory.set($result,"firstRegion",convert(temp_Region),false);
  ptm.ruleFinished(temp_Region);
} else {
  ptm.destroyNode();
}
}
)?

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(0)));}temp_State=
ruleState{if (temp_State != null) {
  hasContent = true;
  ptm.setModelElement(temp_State);
  factory.add($result,"states",convert(temp_State),false);
  ptm.ruleFinished(temp_State);
} else {
  ptm.destroyNode();
}
}
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(1)));}temp_Transition=
ruleTransition{if (temp_Transition != null) {
  hasContent = true;
  ptm.setModelElement(temp_Transition);
  factory.add($result,"transitions",convert(temp_Transition),false);
  ptm.ruleFinished(temp_Transition);
} else {
  ptm.destroyNode();
}
}
)
	|
(({skipCurrentToken = false;}'||'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(2)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)).eContents().get(2)).eContents().get(1)));}temp_Region=
ruleRegion{if (temp_Region != null) {
  hasContent = true;
  ptm.setModelElement(temp_Region);
  factory.add($result,"innerRegions",convert(temp_Region),false);
  ptm.ruleFinished(temp_Region);
} else {
  ptm.destroyNode();
}
}
)?
)
)*

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(5)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleStateArgument returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "StateArgument");
			 }
((({skipCurrentToken = false;}'label'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
  factory.set($result,"label",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'type'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)));}temp_Pseudo=
rulePseudo{if (temp_Pseudo != null) {
  hasContent = true;
  factory.set($result,"type",convert(temp_Pseudo),false);
  ptm.ruleFinished(temp_Pseudo);
} else {
  ptm.destroyNode();
}
}
)
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)));}temp_Event=
ruleEvent{if (temp_Event != null) {
  hasContent = true;
  ptm.setModelElement(temp_Event);
  factory.set($result,"event",convert(temp_Event),false);
  ptm.ruleFinished(temp_Event);
} else {
  ptm.destroyNode();
}
}
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)));}temp_Variable=
ruleVariable{if (temp_Variable != null) {
  hasContent = true;
  ptm.setModelElement(temp_Variable);
  factory.set($result,"variable",convert(temp_Variable),false);
  ptm.ruleFinished(temp_Variable);
} else {
  ptm.destroyNode();
}
}
)
	|
(({skipCurrentToken = false;}'doActivity'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)).eContents().get(2)));
  factory.set($result,"doAction",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'do'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(2)));
  factory.set($result,"doAction",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'entryActivity'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(2)));
  factory.set($result,"entryAction",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'entry'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(2)));
  factory.set($result,"entryAction",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'exitActivity'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(8)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(8)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(8)).eContents().get(2)));
  factory.set($result,"exitAction",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'exit'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(9)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(9)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(9)).eContents().get(2)));
  factory.set($result,"exitAction",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

rulePseudo returns [Enumerator r] :
		 'final'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)));
$r=factory.enumLit("", "Pseudo","final");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'initial'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(2)));
$r=factory.enumLit("", "Pseudo","initial");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'history'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(3)));
$r=factory.enumLit("", "Pseudo","history");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'choice'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(4)));
$r=factory.enumLit("", "Pseudo","choice");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'dynamicchoice'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(5)));
$r=factory.enumLit("", "Pseudo","dynamicchoice");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'suspend'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(6)));
$r=factory.enumLit("", "Pseudo","suspend");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
;

ruleEvent returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Event");
			 }
(({skipCurrentToken = false;}'localEvent'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)));
  factory.set($result,"localEvent",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleVariable returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Variable");
			 }
(({skipCurrentToken = false;}'localVariable'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)));
  factory.set($result,"localVariable",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleRegion returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Region");
			 }
(({skipCurrentToken = false;}'<'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"regionID",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}'>'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})

(({skipCurrentToken = false;}'['{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));}temp_RegionArgument=
ruleRegionArgument{if (temp_RegionArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_RegionArgument);
  factory.add($result,"regArgs",convert(temp_RegionArgument),false);
  ptm.ruleFinished(temp_RegionArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
)*

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(2)));}temp_RegionArgument=
ruleRegionArgument{if (temp_RegionArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_RegionArgument);
  factory.add($result,"stateArgs",convert(temp_RegionArgument),false);
  ptm.ruleFinished(temp_RegionArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})?

({skipCurrentToken = false;}']'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)?
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleRegionArgument returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "RegionArgument");
			 }
((({skipCurrentToken = false;}'label'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
  factory.set($result,"label",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)));}temp_Event=
ruleEvent{if (temp_Event != null) {
  hasContent = true;
  ptm.setModelElement(temp_Event);
  factory.set($result,"event",convert(temp_Event),false);
  ptm.ruleFinished(temp_Event);
} else {
  ptm.destroyNode();
}
}
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)));}temp_Variable=
ruleVariable{if (temp_Variable != null) {
  hasContent = true;
  ptm.setModelElement(temp_Variable);
  factory.set($result,"variable",convert(temp_Variable),false);
  ptm.ruleFinished(temp_Variable);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleState returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "State");
			 }
((({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(0)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"name",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)

(({skipCurrentToken = false;}'['{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(1)).eContents().get(0)));}temp_StateArgument=
ruleStateArgument{if (temp_StateArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_StateArgument);
  factory.add($result,"stateArgs",convert(temp_StateArgument),false);
  ptm.ruleFinished(temp_StateArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
)*

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(2)));}temp_StateArgument=
ruleStateArgument{if (temp_StateArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_StateArgument);
  factory.add($result,"stateArgs",convert(temp_StateArgument),false);
  ptm.ruleFinished(temp_StateArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})?

({skipCurrentToken = false;}']'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)?

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})
)
	|
(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"name",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)));}temp_CState=
ruleCState{if (temp_CState != null) {
  hasContent = true;
  ptm.setModelElement(temp_CState);
  factory.set($result,"cstate",convert(temp_CState),false);
  ptm.ruleFinished(temp_CState);
} else {
  ptm.destroyNode();
}
}
)
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleTransition returns [EObject result]
:
        temp_initialtransition=ruleInitialTransition {$result=temp_initialtransition;}	|        temp_noninitialtransition=ruleNonInitialTransition {$result=temp_noninitialtransition;}	;

ruleInitialTransition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "InitialTransition");
			 }
(({skipCurrentToken = false;}'->'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"targetState",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)

(({skipCurrentToken = false;}'['{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(0)));}temp_TransArgument=
ruleTransArgument{if (temp_TransArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_TransArgument);
  factory.add($result,"transArgs",convert(temp_TransArgument),false);
  ptm.ruleFinished(temp_TransArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
)*

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(2)));}temp_TransArgument=
ruleTransArgument{if (temp_TransArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_TransArgument);
  factory.add($result,"transArgs",convert(temp_TransArgument),false);
  ptm.ruleFinished(temp_TransArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})?

({skipCurrentToken = false;}']'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)?

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleNonInitialTransition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "NonInitialTransition");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"sourceState",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)?

({skipCurrentToken = false;}'->'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(2)));}temp_SableCCIdentifier=
ruleSableCCIdentifier{if (temp_SableCCIdentifier != null) {
  hasContent = true;
  factory.set($result,"targetState",convert(temp_SableCCIdentifier),false);
  ptm.ruleFinished(temp_SableCCIdentifier);
} else {
  ptm.destroyNode();
}
}
)

(({skipCurrentToken = false;}'['{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));}temp_TransArgument=
ruleTransArgument{if (temp_TransArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_TransArgument);
  factory.add($result,"transArgs",convert(temp_TransArgument),false);
  ptm.ruleFinished(temp_TransArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
)*

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(2)));}temp_TransArgument=
ruleTransArgument{if (temp_TransArgument != null) {
  hasContent = true;
  ptm.setModelElement(temp_TransArgument);
  factory.add($result,"transArgs",convert(temp_TransArgument),false);
  ptm.ruleFinished(temp_TransArgument);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})?

({skipCurrentToken = false;}']'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)?

({skipCurrentToken = false;}';'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleTransArgument returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "TransArgument");
			 }
((({skipCurrentToken = false;}'label'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
  factory.set($result,"label",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
	|
(({skipCurrentToken = false;}'type'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)).eContents().get(2)));}temp_TransitionType=
ruleTransitionType{if (temp_TransitionType != null) {
  hasContent = true;
  factory.set($result,"type",convert(temp_TransitionType),false);
  ptm.ruleFinished(temp_TransitionType);
} else {
  ptm.destroyNode();
}
}
)
)
	|
(({skipCurrentToken = false;}'priority'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
  factory.set($result,"priority",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleTransitionType returns [Enumerator r] :
		 'weakAbortion'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)));
$r=factory.enumLit("", "TransitionType","weakabortion");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'wa'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(2)));
$r=factory.enumLit("", "TransitionType","wa");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'strongAbortion'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(3)));
$r=factory.enumLit("", "TransitionType","strongabortion");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'sa'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(4)));
$r=factory.enumLit("", "TransitionType","sa");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'normalTermination'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(5)));
$r=factory.enumLit("", "TransitionType","normaltermination");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'nt'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(6)));
$r=factory.enumLit("", "TransitionType","nt");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'suspension'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(7)));
$r=factory.enumLit("", "TransitionType","suspension");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'sp'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(8)));
$r=factory.enumLit("", "TransitionType","sp");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'conditional'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(9)));
$r=factory.enumLit("", "TransitionType","conditional");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'co'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(10)));
$r=factory.enumLit("", "TransitionType","co");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'internal'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(11)));
$r=factory.enumLit("", "TransitionType","internal");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'it'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(12)));
$r=factory.enumLit("", "TransitionType","it");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
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

