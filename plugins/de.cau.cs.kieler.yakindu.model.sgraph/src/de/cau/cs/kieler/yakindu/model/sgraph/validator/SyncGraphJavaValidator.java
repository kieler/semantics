package de.cau.cs.kieler.yakindu.model.sgraph.validator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.yakindu.sct.model.sgraph.Choice;
import org.yakindu.sct.model.sgraph.Entry;
import org.yakindu.sct.model.sgraph.Region;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.sgraph.Transition;
import org.yakindu.sct.model.sgraph.Trigger;
import org.yakindu.sct.model.sgraph.Vertex;
import org.yakindu.sct.model.sgraph.validation.SGraphJavaValidator;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;

/**
 * This validator is intended to be used by a compositeValidator (See
 * {@link org.eclipse.xtext.validation.ComposedChecks}) of another language
 * specific validator. It does not register itself as an EValidator.
 * 
 * This validator checks for common graphical constraints for all kinds of state
 * charts.
 * 
 * @author wah
 */
public class SyncGraphJavaValidator extends SGraphJavaValidator {

	// private static final String ISSUE_INITIAL_ENTRY_WITH_IN_TRANS =
	// "Initial state should have no incoming transition.";
	private static final String REGION_HAS_ONE_INITIAL_STATE = "Every region should have exactly one initial state.";
	private static final String STATE_HAS_ONLY_ONE_NORMAL_TERMINATION = "A state can only have one outgoing normal termination.";
	private static final String SYNCCHARTS_HAS_ONE_REGION = "A diagram should have exactly one region.";
	private static final String ROOT_REGION_HAS_ONE_STATE = "The root region should have exactly one state.";
	private static final String ROOT_STATE_NOT_INITIALSTATE = "The root state may not be an initial state.";
	private static final String ROOT_STATE_NOT_FINALSTATE = "The root state may not be a final state.";
	private static final String ROOT_STATE_NOT_TRANSITIONS = "The root state may not have incoming/outgoing transitions";
	private static final String NORMAL_TERMINATION_LEAST_ONE_FINALSTATE = "A composite state with an outgoing normal "
			+ "termination has to contain at least one final state in every parallel region.";
	private static final String NORMAL_TERMINATION_SIMPLESTATE = "Simple states may not have a normal termination transition";
	private static final String STRONGABORT_ON_SIMPLESTATE = "Strong aborts on simple states don't make sense.";
	private static final String INTER_LEVEL_TRANSITIONS = "Inter-level transitions are not forbidden!\nOnly"
			+ " use transitions between states in the same region!\nYou"
			+ " can use final states and normal termination transitions to emulate inter-level transition behavior.";
	private static final String ISSUE_CHOICE_MORE_INCOMING_TRANSITIONS = "At least one of the transitions will never be taken.";
	private static final String ISSUE_CHOICE_NO_INCOMING_TRANSITIONS = "Not reachable choice! Every choice needs an incoming transition.";

	/**
	 * Check if no reachable choice
	 */
	@Check(CheckType.FAST)
	public void choiceNoIncomingTransition(Choice choice) {
		// Choice without outgoing transition
		if (choice.getIncomingTransitions().size() == 0) {
			error(ISSUE_CHOICE_NO_INCOMING_TRANSITIONS, choice, null, -1);
		}
	}

	/**
	 * Warning if a choice has more then one incoming transition
	 */
	@Check(CheckType.FAST)
	public void choiceIncomingTransitionCount(Choice choice) {
		// Choice without outgoing transition
		if (choice.getIncomingTransitions().size() > 1) {
			warning(ISSUE_CHOICE_MORE_INCOMING_TRANSITIONS, choice, null, -1);
		}
	}

	/**
	 * Override nameIsNotEmpty to enable states without name
	 */
	@Check(CheckType.FAST)
	@Override
	public void nameIsNotEmpty(org.yakindu.sct.model.sgraph.State state) {

	}

	/**
	 * Verify that states except initial states are reachable (have incoming
	 * transition)
	 */
	@Check(CheckType.FAST)
	@Override
	public void vertexNotReachable(Vertex vertex) {
		// escape the root state
		if (vertex instanceof SyncState
				&& ((SyncState) vertex).eContainer() instanceof Region
				&& (((SyncState) vertex).eContainer()).eContainer() instanceof Statechart) {
			return;
		}
		if (!(vertex instanceof Entry)) {
			int incomingTransitions = 0;
			incomingTransitions += vertex.getIncomingTransitions().size();
			if (vertex instanceof org.yakindu.sct.model.sgraph.State) {
				SyncState state = (SyncState) vertex;
				// escape initial states
				if (!state.isIsInitial()) {
					TreeIterator<EObject> eAllContents = vertex.eAllContents();
					while (eAllContents.hasNext()) {
						EObject next = eAllContents.next();
						if (next instanceof org.yakindu.sct.model.sgraph.State) {
							for (Transition transition : ((org.yakindu.sct.model.sgraph.State) next)
									.getIncomingTransitions()) {
								if (!EcoreUtil.isAncestor(vertex,
										transition.getSource())) {
									incomingTransitions++;
								}
							}
						}
					}
					if (incomingTransitions == 0) {
						error(ISSUE_NODE_NOT_REACHABLE, vertex, null, -1);
					}
				}
			}

		}
	}

	/**
	 * Verify that a final state has no outgoing transition
	 */
	@Check(CheckType.FAST)
	public void outgoingTransitionCount(SyncState finalState) {
		if (finalState.isIsFinal()) {
			if ((finalState.getOutgoingTransitions().size() > 0)) {
				warning(ISSUE_FINAL_STATE_OUTGOING_TRANSITION, finalState,
						null, -1);
			}
		}
	}

	// /**
	// * Verify that an initial state has no incoming transition.
	// */
	// @Check(CheckType.FAST)
	// public void incomingTransitionCount(Vertex vertex) {
	// if (vertex.getIncomingTransitions().size() > 0
	// && vertex instanceof SyncState
	// && ((SyncState) vertex).isIsInitial()) {
	// error(ISSUE_INITIAL_ENTRY_WITH_IN_TRANS, vertex, null, -1);
	// }
	// }

//	/**
//	 * Verify that a normal termination transition has no trigger
//	 * 
//	 */
//	@Check(CheckType.FAST)
//	public void disallowTrigger(SyncTransition transition) {
//		if (transition.getType() == TransitionType.NORMALTERMINATION
//				&& transition.getTrigger() != null) {
//		        if (transition.getTrigger(). instanceof ReactionTrigger) {
//		            ReactionTrigger trigger = (ReactionTrigger) transition.getTrigger;
//		            expression = trigger.getTrigger();
//		        }
//			error(NORMALTERMINATION_WITH_TRIGGER + transition.getTrigger().toString(), transition, null, -1);
//		}
//	}

	/**
	 * Verify that every region has one initial state
	 */
	@Check(CheckType.FAST)
	public void regionInitialState(Region region) {
		// escape the root region
		if (region.eContainer() instanceof Statechart) {
			return;
		}
		EList<Vertex> vertices = region.getVertices();
		int InitialStatesCount = 0;
		for (Vertex vertex : vertices) {
			if (vertex instanceof SyncState) {
				if (((SyncState) vertex).isIsInitial())
					InitialStatesCount++;
			}
		}
		if (InitialStatesCount != 1) {
			error(REGION_HAS_ONE_INITIAL_STATE, region, null, -1);
		}
	}

	/**
	 * Verify that a state has only one outgoing normal termination
	 */
	@Check(CheckType.FAST)
	public void stateOneNormalTermination(SyncState state) {
		EList<Transition> transitions = state.getOutgoingTransitions();

		int normalTerminationCount = 0;

		for (Transition transition : transitions) {
			if (((SyncTransition) transition).getType() == TransitionType.NORMALTERMINATION) {
				normalTerminationCount++;
			}
		}
		if (normalTerminationCount > 1) {
			error(STATE_HAS_ONLY_ONE_NORMAL_TERMINATION, state, null, -1);
		}
	}

	/**
	 * Verify that the root region has exactly one state
	 * 
	 */
	@Check(CheckType.FAST)
	public void rootStateOneRegion(Region region) {
		if (region.eContainer() instanceof Statechart) {
			if (region.getVertices().size() != 1) {
				error(ROOT_REGION_HAS_ONE_STATE, region, null, -1);
			}
		}
	}

	/**
	 * Check the number of root regions
	 */
	@Check(CheckType.FAST)
	public void rootRegions(Statechart statechart) {
		if (statechart.getRegions().size() != 1) {
			error(SYNCCHARTS_HAS_ONE_REGION, statechart, null, -1);
		}

	}

	/**
	 * Verify that the root state is a simple state
	 * 
	 */
	@Check(CheckType.FAST)
	public void rootStateSimpleState(SyncState state) {
		if (state.eContainer().eContainer() instanceof Statechart) {
			if (state.isIsInitial()) {
				error(ROOT_STATE_NOT_INITIALSTATE, state, null, -1);
			}
			if (state.isIsFinal()) {
				error(ROOT_STATE_NOT_FINALSTATE, state, null, -1);
			}
		}
	}

	/**
	 * Verify that the root state has no incoming/outgoing transition
	 * 
	 */
	@Check(CheckType.FAST)
	public void rootStateTransitions(SyncState state) {
		if (state.eContainer().eContainer() instanceof Statechart) {
			if (state.getIncomingTransitions().size() > 0
					|| state.getOutgoingTransitions().size() > 0) {
				error(ROOT_STATE_NOT_TRANSITIONS, state, null, -1);
			}
		}
	}

	/**
	 * Verify that state with outgoing normal termination has to contain at
	 * least one final state in every parallel region
	 */
	@Check(CheckType.FAST)
	public void finalStateNormalTermination(SyncTransition transition) {
		if (transition.getType() == TransitionType.NORMALTERMINATION) {
			Vertex vertex = transition.getSource();
			if (vertex instanceof SyncState) {
				EList<Region> regions = ((SyncState) vertex).getRegions();
				// if the source state is a simple state return error
				if (regions.size() == 0) {
					error(NORMAL_TERMINATION_SIMPLESTATE, transition, null, -1);
					return;
				}
				// find a final state in every region
				for (Region region : regions) {
					boolean found = false;
					EList<Vertex> vertices = region.getVertices();
					for (Vertex vertex2 : vertices) {
						if (vertex2 instanceof SyncState) {
							if (((SyncState) vertex2).isIsFinal()) {
								found = true;
							}
						}
					}
					if (!found) {
						error(NORMAL_TERMINATION_LEAST_ONE_FINALSTATE,
								transition, null, -1);
						return;
					}
				}
			}
		}
	}

	/**
	 * Warning if a strong abort and a simple state
	 * 
	 */
	@Check(CheckType.FAST)
	public void simpleStateStrongAbort(SyncTransition transition) {
		if (transition.getType() == TransitionType.STRONGABORT) {
			Vertex vertex = transition.getSource();
			if (vertex instanceof SyncState) {
				EList<Region> regions = ((SyncState) vertex).getRegions();
				if (regions.size() == 0) {
					warning(STRONGABORT_ON_SIMPLESTATE, transition, null, -1);
				}
			}
		}
	}

	/**
	 * Check inter-level transitions.
	 * 
	 */
	@Check(CheckType.FAST)
	public void interLevelTransitions(SyncTransition transition) {
		if (transition.getSource().getParentRegion() != transition.getTarget()
				.getParentRegion()) {
			error(INTER_LEVEL_TRANSITIONS, transition, null, -1);
		}
	}

}
