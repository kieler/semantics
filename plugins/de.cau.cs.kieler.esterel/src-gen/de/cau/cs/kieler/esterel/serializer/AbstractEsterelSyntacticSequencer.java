package de.cau.cs.kieler.esterel.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.esterel.services.EsterelGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractEsterelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EsterelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__q;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_5_0_a;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_5_0_p;
	protected AbstractElementAlias match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_p;
	protected AbstractElementAlias match_Sequence_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EsterelGrammarAccess) access;
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__q = new GroupAlias(false, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()));
		match_AtomicExpression_LeftParenthesisKeyword_5_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0());
		match_AtomicExpression_LeftParenthesisKeyword_5_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0());
		match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_Sequence_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getSequenceAccess().getSemicolonKeyword_2());
		match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getSignalAtomicExpressionAccess().getLeftParenthesisKeyword_1_0());
		match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getSignalAtomicExpressionAccess().getLeftParenthesisKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_LeftParenthesisKeyword_5_0_a.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_5_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_LeftParenthesisKeyword_5_0_p.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_AtomicValuedExpression_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Sequence_SemicolonKeyword_2_q.equals(syntax))
				emit_Sequence_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('('* '('+)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_AtomicExpression_LeftParenthesisKeyword_5_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_AtomicExpression_LeftParenthesisKeyword_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_AtomicValuedExpression_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Sequence_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
