package de.cau.cs.kieler.sim.eso.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.sim.eso.services.EsoGrammarAccess;
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
public abstract class AbstractEsoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EsoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_tick___PercentSignKeyword_2_0_OutputKeyword_2_1_ColonKeyword_2_2__q;
	protected AbstractElementAlias match_tick___PercentSignPercentSignKeyword_4_0_OutputKeyword_4_1_ColonKeyword_4_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EsoGrammarAccess) access;
		match_tick___PercentSignKeyword_2_0_OutputKeyword_2_1_ColonKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTickAccess().getPercentSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTickAccess().getOutputKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getTickAccess().getColonKeyword_2_2()));
		match_tick___PercentSignPercentSignKeyword_4_0_OutputKeyword_4_1_ColonKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTickAccess().getPercentSignPercentSignKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getTickAccess().getOutputKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getTickAccess().getColonKeyword_4_2()));
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
			if(match_tick___PercentSignKeyword_2_0_OutputKeyword_2_1_ColonKeyword_2_2__q.equals(syntax))
				emit_tick___PercentSignKeyword_2_0_OutputKeyword_2_1_ColonKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_tick___PercentSignPercentSignKeyword_4_0_OutputKeyword_4_1_ColonKeyword_4_2__q.equals(syntax))
				emit_tick___PercentSignPercentSignKeyword_4_0_OutputKeyword_4_1_ColonKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('%' 'Output' ':')?
	 */
	protected void emit_tick___PercentSignKeyword_2_0_OutputKeyword_2_1_ColonKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('%%' 'Output' ':')?
	 */
	protected void emit_tick___PercentSignPercentSignKeyword_4_0_OutputKeyword_4_1_ColonKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
