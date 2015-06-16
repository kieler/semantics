package de.cau.cs.kieler.core.kexpressions.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.core.kexpressions.services.KExpressionsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractKExpressionsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KExpressionsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p;
	protected AbstractElementAlias match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KExpressionsGrammarAccess) access;
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0())));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a = new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p = new GroupAlias(true, false, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
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
			if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q.equals(syntax))
				emit_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('(' '('*)*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' '('*)+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ('('* '(')*)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' | '(')*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' | '(')+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '(')*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '(')+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()'?
	 */
	protected void emit_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
