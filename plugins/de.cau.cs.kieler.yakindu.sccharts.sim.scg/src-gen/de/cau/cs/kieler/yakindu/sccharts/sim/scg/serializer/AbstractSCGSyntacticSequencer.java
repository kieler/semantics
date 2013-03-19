package de.cau.cs.kieler.yakindu.sccharts.sim.scg.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.services.SCGGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSCGSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SCGGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Variable_InputKeyword_0_0_or_OutputKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SCGGrammarAccess) access;
		match_Variable_InputKeyword_0_0_or_OutputKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getVariableAccess().getInputKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getVariableAccess().getOutputKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getPauseRule())
			return getPauseToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Pause:
	 *     'pause'
	 * ;
	 */
	protected String getPauseToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "pause";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Variable_InputKeyword_0_0_or_OutputKeyword_0_1.equals(syntax))
				emit_Variable_InputKeyword_0_0_or_OutputKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'input' | 'output'
	 */
	protected void emit_Variable_InputKeyword_0_0_or_OutputKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
