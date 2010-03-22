/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;
import de.cau.cs.kieler.synccharts.codegen.sc.CompareTransitions;
import de.cau.cs.kieler.synccharts.codegen.sc.Dependency;
import de.cau.cs.kieler.synccharts.codegen.sc.Graph;
import de.cau.cs.kieler.synccharts.codegen.sc.StateAndSignals;
import de.cau.cs.kieler.synccharts.codegen.sc.StatePlusTransition;

/**
 * The Helper class provides some helping functions for the generation of code.
 * 
 * @author tam
 * 
 */
public final class Helper {

	private Helper() {
		/*
		 * To avoid the chekstyle warning we need a private constructor
		 */
	}

	private static ArrayList<Dependency> stateDependencies = new ArrayList<Dependency>();
	private static ArrayList<StatePlusTransition> sortedStates = new ArrayList<StatePlusTransition>();
	private static ArrayList<ArrayList<StatePlusTransition>> optimzedSortedStates = new ArrayList<ArrayList<StatePlusTransition>>();
	private static ArrayList<StateAndSignals> stateSignalDependencies = new ArrayList<StateAndSignals>();
	private static ArrayList<StatePlusTransition> neighborStates = new ArrayList<StatePlusTransition>();
	private static ArrayList<Region> neighborRegions = new ArrayList<Region>();
	private static ArrayList<State> checkedStates = new ArrayList<State>();
	private static ArrayList<Signal> allSignals = new ArrayList<Signal>();
	private static ArrayList<Signal> triggerSignals = new ArrayList<Signal>();
	private static ArrayList<Signal> effectSignals = new ArrayList<Signal>();
	private static final int HIERARCHY_EDGE = 1;
	private static final int CONTROL_FLOW_EDGE = -1;
	private static final int SIGNAL_FLOW_EDGE = 2;
	private static final int TRANSITION_PRIO_EDGE = 0;
	private static final int WEAK_STATE = 1;
	private static final int STRONG_STATE = 2;
	private static final int SIMPLE_STATE = 0;
	private static final int LABEL_ANY_ID = 1;
	private static final int LABEL_SHORTEST_HIERARCHIE = 2;
	private static final int LABEL_COMPLETE_HIERARCHIE = 3;
	private static final int MAX_PRIO = 2048;

	/**
	 * Computes a list with all states in the right order of their priority.
	 * 
	 * @param state
	 *            the root state to start with
	 * @return a sorted list (by priority) of states
	 */
	public static List<StatePlusTransition> computeThreadPriorities(
			final State state) {
		stateSignalDependencies.clear();
		stateDependencies.clear();
		sortedStates.clear();
		fillStateSignalList(state);
		fillDependencyList(state);
		fillSortedThreadList();
		optimizeSortedStates();

		printDependencyList();
		printStatePlusTransitionList(sortedStates);
		for (ArrayList<StatePlusTransition> spt : optimzedSortedStates) {
			printStatePlusTransitionList(spt);
		}

		return sortedStates;
	}

	/**
	 * Computes the real priority of the given state.
	 * 
	 * @param state
	 *            the state you want to get the priority
	 * @return priority of the state
	 */
	public static int getRealThreadPriority(final State state) {
		return getThreadPriority(state, false, false);
	}

	/**
	 * Computes the real optimized priority of the given state.
	 * 
	 * @param state
	 *            the state you want to get the priority
	 * @return priority of the state
	 */
	public static int getRealOptimizedThreadPriority(final State state) {
		return getOptimizedPriority(state, false);
	}

	/**
	 * Computes the real priority of the given state.
	 * 
	 * @param state
	 *            the state you want to get the priority
	 * @return priority of the state
	 */
	public static int getSmallestThreadPriority(final State state) {
		return getThreadPriority(state, false, true);
	}

	/**
	 * Computes the weak priority of the given state.
	 * 
	 * @param state
	 *            the state you want to get the priority
	 * @return priority of the state
	 */
	public static int getWeakThreadPriority(final State state) {
		return getThreadPriority(state, true, true);
	}

	/**
	 * Computes the weak optimized priority of the given state.
	 * 
	 * @param state
	 *            the state you want to get the priority
	 * @return priority of the state
	 */
	public static int getOptimizedWeakThreadPriority(final State state) {
		return getOptimizedPriority(state, true);
	}

	/**
	 * A simple method to print debug information.
	 * 
	 * @param s
	 *            debug information
	 */
	public static void debug(final String s) {
		System.out.println(s);
	}

	/**
	 * A method to throw an error.
	 * 
	 * @param s
	 *            error information
	 * @throws KiemInitializationException
	 *             for error handling
	 */
	public static void error(final String s) throws KiemInitializationException {
		System.out.println("hier");
		throw new KiemInitializationException("Error while generating SC code",
				true, new Exception(s));
	}

	/**
	 * Computes a sorted list with states. The order of the list is the control
	 * flow of all states in a region beginning with the initial one.
	 * 
	 * @param state
	 *            the initial state to start with
	 * @return a list, sorted by the control flow in the SyncChart
	 */
	public static List<State> sortStateControlFlow(final State state) {
		List<State> listToSort = new LinkedList<State>();
		return sortStateControlFlowHelp(listToSort, state);
	}

	/**
	 * Computes a list of all signals (global and local) that are used in the
	 * state and his child-states.
	 * 
	 * @param state
	 *            the state in which signals should be listed
	 * @return a list of all signals in the states and child-states
	 */
	public static List<Signal> allSignals(final State state) {
		allSignals.clear();
		allSignalsHelp(state);
		return allSignals;
	}

	/**
	 * Returns unique a label for a state independent on the flag.
	 * 
	 * @param state
	 *            the state for which a label should be generated
	 * @param flag
	 *            what kind of label is desired
	 * @return unique label for a state
	 */
	public static String getStateNameByFlag(final State state,
			final Integer flag) {
		String out = "";
		switch (flag) {
		case LABEL_ANY_ID:
			out = getStateNameAnyID(state);
			break;
		case LABEL_COMPLETE_HIERARCHIE:
			out = getStateNameCompleteHierarchie(state);
			break;
		case LABEL_SHORTEST_HIERARCHIE:
			out = getStateNameShortestHierarchie(state);
			break;
		default:
			out = getStateNameCompleteHierarchie(state);
			break;
		}
		return out;
	}

	/**
	 * Not used?
	 * 
	 * @param state
	 *            nut used?
	 * @return not used?
	 */
	public static List<StateAndSignals> getStateSignals(final State state) {
		stateSignalDependencies.clear();
		fillStateSignalList(state);
		return stateSignalDependencies;
	}

	/**
	 * Computes if the given state has signal dependent states.
	 * 
	 * @param transition
	 *            transition to search for dependencies
	 * @return true if the state has signal dependencies otherwise false
	 */
	public static boolean hasDependentState(final Transition transition) {
		return (!getSignalDependentStates(transition).isEmpty());
	}

	/**
	 * Computes if the given state has signal dependent states.
	 * 
	 * @param transition
	 *            transition to search for dependencies
	 * @return true if the transition is signal dependent otherwise false
	 */
	public static boolean isSignalDependent(final Transition transition) {
		return (!getDependencyOwner(transition.getSourceState()).isEmpty());
	}

	private static String getStateNameAnyID(final State state) {
		String out = "";
		return out;
	}

	private static String getStateNameCompleteHierarchie(final State state) {
		String regionPrefix = "";
		if (state.getParentRegion().getParentState() != null) {
			if (state.getParentRegion().getParentState().getRegions().size() > 1) {
				regionPrefix = state.getParentRegion().getId() + "_";
			}
		}
		if (state.getParentRegion().getParentState() != null) {
			return getStateNameCompleteHierarchie(state.getParentRegion()
					.getParentState())
					+ "_" + regionPrefix + state.getId();
		} else {
			return regionPrefix + state.getId();
		}
	}

	private static String getStateNameShortestHierarchie(final State state) {
		String out = "";
		return out;
	}

	private static ArrayList<StatePlusTransition> getSignalDependentStates(
			final Transition transition) {
		ArrayList<StatePlusTransition> out = new ArrayList<StatePlusTransition>();
		for (Dependency dep : stateDependencies) {
			if (dep.getSecondState().getTransition() != null) {
				if (dep.getSecondState().getTransition().equals(transition)
						&& dep.getDependencyType() == SIGNAL_FLOW_EDGE) {
					out.add(dep.getFirstState());
				}
			}
		}
		return out;
	}

	private static ArrayList<StatePlusTransition> getDependencyOwner(
			final State state) {
		ArrayList<StatePlusTransition> out = new ArrayList<StatePlusTransition>();
		for (Dependency dep : stateDependencies) {
			if (dep.getSecondState().getState().equals(state)
					&& dep.getDependencyType() == SIGNAL_FLOW_EDGE) {
				out.add(dep.getSecondState());
			}
		}
		return out;
	}

	private static void putSignalDependencies(final StatePlusTransition spt) {
		// get signals of the state
		ArrayList<Signal> stateTriggerSignals = new ArrayList<Signal>();
		ArrayList<Signal> stateEffectSignals = new ArrayList<Signal>();
		for (StateAndSignals s : stateSignalDependencies) {
			boolean found = spt.equals(s.getStatePlusTransition());
			if (found) {
				stateTriggerSignals = s.getTriggerSignals();
				stateEffectSignals = s.getEffectSignals();
				break;
			}
		}

		neighborRegions.clear();
		neighborStates.clear();
		getNeighborRegions(spt.getState());
		addNeighbors(neighborRegions);
		for (StatePlusTransition neighborSpt : neighborStates) {
			// get signals of neighbor states and their child states
			if (!spt.equals(neighborSpt)) {
				ArrayList<Signal> neighborEffectSignals = new ArrayList<Signal>();
				ArrayList<Signal> neighborTriggerSignals = new ArrayList<Signal>();
				for (StateAndSignals s : stateSignalDependencies) {
					if (neighborSpt.equals(s.getStatePlusTransition())) {
						neighborEffectSignals = s.getEffectSignals();
						neighborTriggerSignals = s.getTriggerSignals();
						break;
					}
				}
				// one direction
				if (!disjunkt(stateTriggerSignals, neighborEffectSignals)) {
					addSignalDependencies(spt, neighborSpt);
				}
				// other direction
				if (!disjunkt(stateEffectSignals, neighborTriggerSignals)) {
					addSignalDependencies(neighborSpt, spt);
				}
			}
		}
	}

	private static void addSignalDependencies(final StatePlusTransition sptOne,
			final StatePlusTransition sptTwo) {
		for (Transition transition : sptTwo.getState().getOutgoingTransitions()) {
			StatePlusTransition spt = sptTwo;
			spt.setTransition(transition);
			addDependency(sptOne, sptTwo, SIGNAL_FLOW_EDGE);
		}
		// if depth of states are not equal
		if (getDepth(sptOne.getState()) < getDepth(sptTwo.getState())) {
			State parentState = sptTwo.getState().getParentRegion()
					.getParentState();
			StatePlusTransition parentSpt = getStateProperties(parentState);
			addSignalDependencies(sptOne, parentSpt);
		}
	}

	private static boolean disjunkt(final List<Signal> firstList,
			final List<Signal> secondList) {
		boolean out = true;
		if (firstList.isEmpty() || secondList.isEmpty()) {
			return out;
		} else {
			for (Signal firstSignal : firstList) {
				for (Signal secondSignal : secondList) {
					if (firstSignal.equals(secondSignal)) {
						out = false;
						break;
					}
				}
			}
		}
		return out;
	}

	private static int getThreadPriority(final State state, final boolean weak,
			final boolean smallest) {
		int out = 0;
		StatePlusTransition spt;
		if (weak) {
			spt = new StatePlusTransition(state, WEAK_STATE, null);
		} else {
			spt = getStateProperties(state);
		}
		out = getIndexWithoutTransition(spt, smallest) + 1;
		return out;
	}

	private static int getIndexWithoutTransition(final StatePlusTransition spt,
			final boolean smalest) {
		int out = 0;
		for (int i = 0; i < sortedStates.size(); i++) {
			StatePlusTransition listSpt = sortedStates.get(i);
			if (listSpt.getState().equals(spt.getState())
					&& listSpt.getType() == spt.getType()) {
				out = i;
				if (smalest) {
					break;
				}
			}
		}
		return out;
	}

	private static void allSignalsHelp(final State state) {
		EList<Signal> tmp = state.getSignals();
		addSignalsToList(tmp);
		for (Region region : state.getRegions()) {
			for (State innerState : region.getInnerStates()) {
				if (!state.getRegions().isEmpty()) {
					allSignalsHelp(innerState);
				}
			}
		}
	}

	private static void addSignalsToList(final List<Signal> signalList) {
		for (Signal signal : signalList) {
			if (!allSignals.contains(signal)) {
				allSignals.add(signal);
			}
		}
	}

	private static List<State> sortStateControlFlowHelp(final List<State> out,
			final State state) {
		out.add(state);
		for (Transition transition : state.getOutgoingTransitions()) {
			if (!out.contains(transition.getTargetState())) {
				sortStateControlFlowHelp(out, transition.getTargetState());
			}
		}
		return out;
	}

	private static void getNeighborRegions(final State state) {
		if (state.getParentRegion().getParentState() != null) {
			for (Region region : state.getParentRegion().getParentState()
					.getRegions()) {
				if (!region.equals(state.getParentRegion())) {
					neighborRegions.add(region);
				}
			}
			getNeighborRegions(state.getParentRegion().getParentState());
		}
	}

	private static void addNeighbors(final List<Region> regions) {
		for (Region region : regions) {
			for (State innerState : region.getInnerStates()) {
				for (Transition transition : innerState
						.getOutgoingTransitions()) {
					StatePlusTransition spt = getStateProperties(innerState);
					spt.setTransition(transition);
					if (!neighborStates.contains(spt)) {
						neighborStates.add(spt);
					}
				}
				if (!innerState.getRegions().isEmpty()) {
					addNeighbors(innerState.getRegions());
				}
			}
		}
	}

	/*
	 * useful for debugging
	 */
	private static void printStatePlusTransitionList(
			final ArrayList<StatePlusTransition> list) {
		System.out.print("[");
		for (StatePlusTransition spt : list) {
			String weakStrong = "";
			weakStrong = stateType2String(spt.getType());
			String transition = "";
			if (spt.getTransition() != null) {
				transition = "+(" + spt.getTransition().getTriggersAndEffects()
						+ ")";
			}
			System.out.print(spt.getState().getId() + transition + weakStrong
					+ " , ");
		}
		System.out.println("]");
	}

	/*
	 * useful for debugging
	 */
	private static void printDependencyList() {
		System.out.print("dependencyList: [ ");
		for (Dependency dependency : stateDependencies) {
			printDependency(dependency);
		}
		System.out.println("] ");
	}

	/*
	 * useful for debugging
	 */
	private static void printDependency(final Dependency dependency) {
		String firstWS = "";
		String secondWS = "";
		String firstState = "";
		String secondState = "";
		String firstTrans = "empty";
		String secondTrans = "empty";
		String rel = "";
		firstWS = stateType2String(dependency.getFirstState().getType());
		secondWS = stateType2String(dependency.getSecondState().getType());
		switch (dependency.getDependencyType()) {
		case CONTROL_FLOW_EDGE:
			rel = " <c< ";
			break;

		case HIERARCHY_EDGE:
			rel = " <h< ";
			break;

		case TRANSITION_PRIO_EDGE:
			rel = " <p< ";
			break;

		default:
			rel = " <s< ";
			break;
		}
		if (dependency.getFirstState().getTransition() != null) {
			firstTrans = "("
					+ dependency.getFirstState().getTransition()
							.getTriggersAndEffects() + ")";
		}
		if (dependency.getSecondState().getTransition() != null) {
			secondTrans = "("
					+ dependency.getSecondState().getTransition()
							.getTriggersAndEffects() + ")";
		}
		firstState = dependency.getFirstState().getState().getId() + "+"
				+ firstTrans;
		secondState = dependency.getSecondState().getState().getId() + "+"
				+ secondTrans;
		System.out.print(firstState + firstWS + rel + secondState + secondWS
				+ " , ");
	}

	private static Dependency builtDependency(
			final StatePlusTransition firstSpt,
			final StatePlusTransition secondSpt, final int edgeType) {
		Dependency out = new Dependency(firstSpt, secondSpt, edgeType);
		return out;
	}

	// Build a list of all possible dependencies in the SyncChart.
	private static void fillDependencyList(final State state) {
		// fill transition priority dependencies
		EList<Transition> sortedTransitions = getSortedTransitions(state
				.getOutgoingTransitions());
		int countTransitions = sortedTransitions.size();
		if (countTransitions > 1) {
			for (int i = 0; i < countTransitions - 1; i++) {
				StatePlusTransition sptOne = getStateProperties(state);
				sptOne.setTransition(sortedTransitions.get(i));
				StatePlusTransition sptTwo = getStateProperties(state);
				sptTwo.setTransition(sortedTransitions.get(i + 1));
				addDependency(sptTwo, sptOne, TRANSITION_PRIO_EDGE);
			}
		}
		// fill signal flow dependencies
		if (state.getParentRegion().getParentState() != null) {
			for (Transition transition : state.getOutgoingTransitions()) {
				StatePlusTransition putSpt = getStateProperties(state);
				putSpt.setTransition(transition);
				putSignalDependencies(putSpt);
			}
		}
		// add state to the checked State list
		checkedStates.add(state);

		// fill control flow dependencies
		for (Transition transition : state.getOutgoingTransitions()) {
			StatePlusTransition sourceSpt = getStateProperties(state);
			sourceSpt.setTransition(transition);

			if (!transition.getSourceState()
					.equals(transition.getTargetState())) {
				State targetState = transition.getTargetState();
				addDependencies(targetState, sourceSpt, CONTROL_FLOW_EDGE);
				if (!checkedStates.contains(targetState)) {
					fillDependencyList(targetState);
				}
			}
		}

		// fill hierarchy dependencies
		StatePlusTransition sptOne;
		StatePlusTransition sptTwo;
		StatePlusTransition hierarchySpt = getStateProperties(state);
		if (hierarchySpt.getType() > SIMPLE_STATE) {
			for (Region region : state.getRegions()) {
				for (State innerState : region.getInnerStates()) {
					int innerStateStatus = getStateProperties(innerState)
							.getType();
					// state as weak state
					sptOne = new StatePlusTransition(state, WEAK_STATE, null);
					sptTwo = new StatePlusTransition(innerState,
							innerStateStatus, null);
					addAllDependencies(sptOne, sptTwo, HIERARCHY_EDGE);
					// state as strong state
					sptOne = new StatePlusTransition(state, STRONG_STATE, null);
					sptTwo = new StatePlusTransition(innerState,
							innerStateStatus, null);
					addAllDependencies(sptTwo, sptOne, HIERARCHY_EDGE);
					// inner state is hierarchical
					if (innerStateStatus > SIMPLE_STATE) {
						// inner state is concurrent
						if (innerStateStatus == WEAK_STATE) {
							// dependency for strong state
							sptOne = new StatePlusTransition(state, WEAK_STATE,
									null);
							sptTwo = new StatePlusTransition(innerState,
									STRONG_STATE, null);
							addAllDependencies(sptOne, sptTwo, HIERARCHY_EDGE);
							sptOne = new StatePlusTransition(state,
									STRONG_STATE, null);
							sptTwo = new StatePlusTransition(innerState,
									STRONG_STATE, null);
							addAllDependencies(sptTwo, sptOne, HIERARCHY_EDGE);
						} else {
							// dependency for weak state
							sptOne = new StatePlusTransition(state, WEAK_STATE,
									null);
							sptTwo = new StatePlusTransition(innerState,
									WEAK_STATE, null);
							addAllDependencies(sptOne, sptTwo, HIERARCHY_EDGE);
							sptOne = new StatePlusTransition(state,
									STRONG_STATE, null);
							sptTwo = new StatePlusTransition(innerState,
									WEAK_STATE, null);
							addAllDependencies(sptTwo, sptOne, HIERARCHY_EDGE);
						}
					}
					if (!checkedStates.contains(innerState)) {
						fillDependencyList(innerState);
					}
				}
			}
		}

	}

	private static void addAllDependencies(final StatePlusTransition sptOne,
			final StatePlusTransition sptTwo, final int dependency) {
		State stateOne = sptOne.getState();
		int typeOne = sptOne.getType();
		State stateTwo = sptTwo.getState();
		int typeTwo = sptTwo.getType();
		if (stateOne.getOutgoingTransitions().isEmpty()) {
			if (stateTwo.getOutgoingTransitions().isEmpty()) {
				addDependency(sptOne, sptTwo, dependency);
			} else {
				for (Transition transition : stateTwo.getOutgoingTransitions()) {
					StatePlusTransition sptTwoNew = new StatePlusTransition(
							stateTwo, typeTwo, transition);
					addDependency(sptOne, sptTwoNew, dependency);
				}
			}
		} else {
			for (Transition transitionOne : stateOne.getOutgoingTransitions()) {
				StatePlusTransition sptOneNew = new StatePlusTransition(
						stateOne, typeOne, transitionOne);
				if (stateTwo.getOutgoingTransitions().isEmpty()) {
					addDependency(sptOneNew, sptTwo, dependency);
				} else {
					for (Transition transitionTwo : stateTwo
							.getOutgoingTransitions()) {
						StatePlusTransition sptTwoNew = new StatePlusTransition(
								stateTwo, typeTwo, transitionTwo);
						sptTwoNew.setTransition(transitionTwo);
						addDependency(sptOneNew, sptTwoNew, dependency);
					}
				}
			}
		}
	}

	private static void addDependency(final StatePlusTransition sptOne,
			final StatePlusTransition sptTwo, final int dependency) {
		Dependency put = builtDependency(sptOne, sptTwo, dependency);
		if (!stateDependencies.contains(put)) {
			stateDependencies.add(put);
		}
	}

	private static void addDependencies(final State state,
			final StatePlusTransition sptTwo, final int dependency) {
		if (state.getOutgoingTransitions().isEmpty()) {
			StatePlusTransition sptOne = getStateProperties(state);
			addDependency(sptOne, sptTwo, dependency);
		} else {
			for (Transition transition : state.getOutgoingTransitions()) {
				StatePlusTransition sptOne = getStateProperties(state);
				sptOne.setTransition(transition);
				addDependency(sptOne, sptTwo, dependency);
			}
		}
	}

	private static EList<Transition> getSortedTransitions(
			final EList<Transition> transitions) {
		EList<Transition> out = transitions;
		CompareTransitions comparable = new CompareTransitions();
		Collections.sort(out, comparable);
		return out;
	}

	private static StatePlusTransition getStateProperties(final State state) {
		StatePlusTransition out = new StatePlusTransition();
		int stateProperty = SIMPLE_STATE;
		if (!state.getRegions().isEmpty()) {
			stateProperty = WEAK_STATE;
			for (Transition transition : state.getOutgoingTransitions()) {
				if (transition.getType() == TransitionType.STRONGABORT) {
					stateProperty = STRONG_STATE;
					break;
				}
			}
		}
		out.setState(state);
		out.setType(stateProperty);
		out.setTransition(null);
		return out;
	}

	private static String stateType2String(final int stateType) {
		String out = "";
		switch (stateType) {
		case WEAK_STATE:
			out = "_w";
			break;
		case STRONG_STATE:
			out = "_s";
			break;
		default:
			break;
		}
		return out;
	}

	private static void fillTriggerSignals(final Transition transition) {
		EObject eObject = transition.getTrigger();
		// search for signals
		boolean hasNext = true;
		while (hasNext && eObject != null) {
			if (eObject instanceof SignalReference) {
				// put trigger signal into the list
				Signal triggerSignal = ((SignalReference) eObject).getSignal();
				if (!triggerSignals.contains(triggerSignal)) {
					triggerSignals.add(triggerSignal);
				}
			}
			if (eObject.eAllContents().hasNext()) {
				eObject = eObject.eAllContents().next();
			} else {
				hasNext = false;
			}
		}
	}

	private static void fillEffectSignals(final Transition transition) {
		EList<Effect> tmpEffectSignals = transition.getEffects();
		// put all effect signals into the list
		for (Effect effect : tmpEffectSignals) {
			EObject eObject = effect;
			boolean hasNext = true;
			while (hasNext) {
				if (eObject instanceof Emission) {
					// put trigger signal into the list
					Signal effectSignal = ((Emission) eObject).getSignal();
					if (!effectSignals.contains(effectSignal)) {
						effectSignals.add(effectSignal);
					}
				}
				if (eObject.eAllContents().hasNext()) {
					eObject = eObject.eAllContents().next();
				} else {
					hasNext = false;
				}
			}
		}
		// if the target state has an immediate
		// outgoing transition put its signals to the source state ones
		for (Transition targetTrans : transition.getTargetState()
				.getOutgoingTransitions()) {
			if (targetTrans.isIsImmediate()) {
				fillEffectSignals(targetTrans);
			}
		}
	}

	private static void fillStateSignalList(final State state) {
		// every region
		for (Region region : state.getRegions()) {
			// every state
			for (State innerState : region.getInnerStates()) {
				for (Transition transition : innerState
						.getOutgoingTransitions()) {
					StateAndSignals stateAndSignals = new StateAndSignals();
					triggerSignals.clear();
					effectSignals.clear();
					// every outgoing transition
					fillTriggerSignals(transition);
					fillEffectSignals(transition);
					ArrayList<Signal> triggers = copyFromList(triggerSignals);
					ArrayList<Signal> effects = copyFromList(effectSignals);

					if (!(triggers.isEmpty() && effects.isEmpty())) {
						StatePlusTransition spt = getStateProperties(innerState);
						spt.setTransition(transition);
						stateAndSignals.setState(spt);
						stateAndSignals.setTriggerSignals(triggers);
						stateAndSignals.setEffectSignals(effects);
						if (!stateSignalDependencies.contains(stateAndSignals)) {
							stateSignalDependencies.add(stateAndSignals);
						}
					}
				}
				if (!innerState.getRegions().isEmpty()) {
					fillStateSignalList(innerState);
				}
			}
		}
	}

	private static int getDepth(final State state) {
		if (state.getParentRegion().getParentState() != null) {
			return getDepth(state.getParentRegion().getParentState()) + 1;
		} else {
			return 0;
		}
	}

	private static ArrayList<Signal> copyFromList(final ArrayList<Signal> in) {
		ArrayList<Signal> out = new ArrayList<Signal>();
		for (Signal signal : in) {
			out.add(signal);
		}
		return out;
	}

	private static void fillSortedThreadList() {
		// Build a unsorted list of all threads.
		ArrayList<StatePlusTransition> threadListUnsorted = new ArrayList<StatePlusTransition>();
		for (Dependency dependency : stateDependencies) {
			if (!threadListUnsorted.contains(dependency.getFirstState())) {
				threadListUnsorted.add(dependency.getFirstState());
			}
			if (!threadListUnsorted.contains(dependency.getSecondState())) {
				threadListUnsorted.add(dependency.getSecondState());
			}
		}

		// Build a Graph with the dependencies of all threads.
		Graph dependencyGraph = new Graph(threadListUnsorted.size(), true);
		StatePlusTransition sourceSpt;
		StatePlusTransition targetSpt;
		int sourceInt;
		int targetInt;
		int edgeType;
		for (Dependency dependency : stateDependencies) {
			sourceSpt = dependency.getFirstState();
			targetSpt = dependency.getSecondState();
			edgeType = dependency.getDependencyType();
			sourceInt = threadListUnsorted.indexOf(sourceSpt);
			targetInt = threadListUnsorted.indexOf(targetSpt);
			dependencyGraph.addEdge(sourceInt, targetInt, edgeType);
		}

		// Make a topological sort of the dependency graph.
		LinkedList<Integer> threadListTopologicalSorted;
		threadListTopologicalSorted = dependencyGraph.topologicalSort();
		// Remove all pseudo threads and fill the
		// thread list with threads in their right priority order.
		for (int i = 0; i < threadListTopologicalSorted.size(); i++) {
			int threadInt = threadListTopologicalSorted.get(i);
			StatePlusTransition spt = threadListUnsorted.get(threadInt);
			sortedStates.add(spt);
		}
	}

	private static void optimizeSortedStates() {
		optimzedSortedStates.clear();
		for (StatePlusTransition spt : sortedStates) {
			// System.out.println(spt.getState().getId());
			boolean added = addSptToOptimizedList(spt);
			if (!added) {
				ArrayList<StatePlusTransition> addList = new ArrayList<StatePlusTransition>();
				addList.add(spt);
				optimzedSortedStates.add(addList);
			}
		}
		//removeNeedlessLists();
	}

	private static void removeNeedlessLists() {
		ArrayList<ArrayList<StatePlusTransition>> newList = new ArrayList<ArrayList<StatePlusTransition>>();
		for (ArrayList<StatePlusTransition> sptList : optimzedSortedStates) {
			if (!isNotNeeded(sptList)) {
				newList.add(sptList);
			}
		}
		optimzedSortedStates = newList;
	}

	private static boolean isNotNeeded(ArrayList<StatePlusTransition> sptList) {
		boolean size = sptList.size() == 1;
		boolean root = sptList.get(0).getState().getParentRegion().getParentState() == null; 
		boolean transition = sptList.get(0).getState().getOutgoingTransitions()
				.isEmpty();
		boolean onEntry = sptList.get(0).getState().getEntryActions().isEmpty();
		boolean onInside = sptList.get(0).getState().getInnerActions()
				.isEmpty();
		boolean regions = sptList.get(0).getState().getRegions().size() == 1;
		return size && transition && onEntry && onInside && regions && root;
	}

	private static int getOptimizedPriority(final State state,
			final boolean weak) {
		int out = 0;
		StatePlusTransition spt;
		if (weak) {
			spt = new StatePlusTransition(state, WEAK_STATE, null);
		} else {
			spt = getStateProperties(state);
		}

		ArrayList<StatePlusTransition> listWithState = getListWithState(spt);
		if (listWithState != null) {
			out = optimzedSortedStates.indexOf(listWithState) + 1;
		}

		return out;
	}

	private static ArrayList<StatePlusTransition> getListWithState(
			final StatePlusTransition spt) {
		for (ArrayList<StatePlusTransition> list : optimzedSortedStates) {
			for (int i = 0; i < list.size(); i++) {
				StatePlusTransition listSpt = list.get(i);
				if (listSpt.getState().equals(spt.getState())
						&& listSpt.getType() == spt.getType()) {
					return list;
				}
			}
		}
		return null;
	}

	private static State getRootState(State state) {
		if (state.getParentRegion().getParentState() == null) {
			return state;
		} else {
			return getRootState(state.getParentRegion().getParentState());
		}
	}

	private static boolean addSptToOptimizedList(final StatePlusTransition spt) {
		boolean added = false;
		ArrayList<ArrayList<StatePlusTransition>> tmp = new ArrayList<ArrayList<StatePlusTransition>>();
		for (ArrayList<StatePlusTransition> sptList : optimzedSortedStates) {
			ArrayList<StatePlusTransition> sptListTmp = new ArrayList<StatePlusTransition>();
			for (StatePlusTransition optimizedSpt : sptList) {
				sptListTmp.add(optimizedSpt);

				// exists controll flow edge between two states?
				Dependency depOne = new Dependency(spt, optimizedSpt,
						CONTROL_FLOW_EDGE);
				Dependency depTwo = new Dependency(optimizedSpt, spt,
						CONTROL_FLOW_EDGE);

				if (stateDependencies.contains(depOne)
						|| stateDependencies.contains(depTwo)) {
					if (!isSignalDependent(spt.getTransition())
							&& !hasDependentState(spt.getTransition())) {
						sptListTmp.add(spt);
						added = true;
					}
				}
			}
			tmp.add(sptListTmp);
		}
		optimzedSortedStates = tmp;
		return added;
	}
}
