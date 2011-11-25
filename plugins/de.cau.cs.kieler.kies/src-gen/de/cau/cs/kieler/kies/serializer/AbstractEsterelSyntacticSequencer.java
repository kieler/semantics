package de.cau.cs.kieler.kies.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.kies.services.EsterelGrammarAccess;
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

@SuppressWarnings("restriction")
public class AbstractEsterelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EsterelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a_or_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a_LeftParenthesisKeyword_2_0_a__;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_5_0_a_or_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p_______LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p__a_LeftParenthesisKeyword_5_0_a__;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p____q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a_____or_____LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a__p___LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a________q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a________q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p________q;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_5_0_a;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_5_0_p;
	protected AbstractElementAlias match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_Sequence_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EsterelGrammarAccess) access;
		match_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a_or_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a_LeftParenthesisKeyword_2_0_a__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_5_0_a_or_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p_______LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p__a_LeftParenthesisKeyword_5_0_a__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a = new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a = new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p____q = new AlternativeAlias(true, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()));
		match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a_____or_____LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a__p___LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a________q = new AlternativeAlias(true, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()))));
		match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q = new GroupAlias(true, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())));
		match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a________q = new AlternativeAlias(true, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()))));
		match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p________q = new AlternativeAlias(true, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0())), new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0())), new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0()))));
		match_AtomicExpression_LeftParenthesisKeyword_5_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0());
		match_AtomicExpression_LeftParenthesisKeyword_5_0_p = new TokenAlias(false, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_5_0());
		match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_Sequence_SemicolonKeyword_2_q = new TokenAlias(true, false, grammarAccess.getSequenceAccess().getSemicolonKeyword_2());
		match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getSignalAtomicExpressionAccess().getLeftParenthesisKeyword_1_0());
		match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p = new TokenAlias(false, true, grammarAccess.getSignalAtomicExpressionAccess().getLeftParenthesisKeyword_1_0());
		match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()));
		match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()));
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
			if(match_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a_or_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a_LeftParenthesisKeyword_2_0_a__.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a_or_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a_LeftParenthesisKeyword_2_0_a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_5_0_a_or_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p_______LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p__a_LeftParenthesisKeyword_5_0_a__.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_5_0_a_or_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p_______LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p__a_LeftParenthesisKeyword_5_0_a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p____q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a_____or_____LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a__p___LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a________q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a_____or_____LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a__p___LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a________q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a________q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a________q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p________q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p________q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_LeftParenthesisKeyword_5_0_a.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_5_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_LeftParenthesisKeyword_5_0_p.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Sequence_SemicolonKeyword_2_q.equals(syntax))
				emit_Sequence_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_SignalAtomicExpression_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_SignalAtomicExpression_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q.equals(syntax))
				emit_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('* | ((('('* '('+) | '('+) ('('* '('+)* '('*)
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_2_0_a_or_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a_LeftParenthesisKeyword_2_0_a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('* | (('('+ | ('('* '('+)) ('('* '('+)* '('*)
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression_LeftParenthesisKeyword_5_0_a_or_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p_______LeftParenthesisKeyword_5_0_a_LeftParenthesisKeyword_2_0_p__a_LeftParenthesisKeyword_5_0_a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '('+)*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_5_0_p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('+ '('+)*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('+ ('('+ '('+)*)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('('+ '('+) | '('+)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('('+ | ('('+ '('*)) | (('('+ '('*)+ ('('+ | ('('+ '('*))))?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a_____or_____LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a__p___LeftParenthesisKeyword_2_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_a________q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('('+ '('+) | '('+) ('('+ '('+)*)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p_______LeftParenthesisKeyword_2_0_p_LeftParenthesisKeyword_5_0_p__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('('+ '('*)+ (('('+ '('*) | '('+)) | (('('+ '('*) | '('+))?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_a________q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('('+ '('+) | '('+) | (('('+ '('+)+ (('('+ '('+) | '('+)))?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression_____LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p_____or_____LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p__p___LeftParenthesisKeyword_5_0_p_or___LeftParenthesisKeyword_5_0_p_LeftParenthesisKeyword_2_0_p________q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('(' ')')?
	 */
	protected void emit_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
