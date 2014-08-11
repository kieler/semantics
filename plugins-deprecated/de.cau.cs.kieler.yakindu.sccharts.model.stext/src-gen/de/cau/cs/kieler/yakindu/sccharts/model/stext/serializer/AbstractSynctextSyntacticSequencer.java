package de.cau.cs.kieler.yakindu.sccharts.model.stext.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.services.SynctextGrammarAccess;
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
public abstract class AbstractSynctextSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SynctextGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1;
	protected AbstractElementAlias match_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1;
	protected AbstractElementAlias match_TransitionReaction_NumberSignKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SynctextGrammarAccess) access;
		match_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAlwaysEventAccess().getOncycleKeyword_1_1()));
		match_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDefaultTriggerAccess().getElseKeyword_1_1()));
		match_TransitionReaction_NumberSignKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
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
			if(match_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1.equals(syntax))
				emit_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1.equals(syntax))
				emit_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TransitionReaction_NumberSignKeyword_3_0_q.equals(syntax))
				emit_TransitionReaction_NumberSignKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'always' | 'oncycle'
	 */
	protected void emit_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'default' | 'else'
	 */
	protected void emit_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '#'?
	 */
	protected void emit_TransitionReaction_NumberSignKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
