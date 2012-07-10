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
package de.cau.cs.kieler.synccharts.codegen.sc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;

/**
 * The Helper class provides some helping functions for the generation of code.
 * 
 * @author tam
 */
public final class Helper {

    private Helper() {
        /*
         * To avoid the checkstyle warning we need a private constructor
         */
    }

    private static ArrayList<Dependency> stateDependencies = new ArrayList<Dependency>();
    private static ArrayList<StatePlusTransition> sortedStates = new ArrayList<StatePlusTransition>();
    // There is no good way to refactor this very long type
    // SUPPRESS CHECKSTYLE NEXT LineLength
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
     * @param state the root state to start with
     * @return a sorted list (by priority) of states
     */
    public static List<StatePlusTransition> computeThreadPriorities(
            final State state) {
        stateSignalDependencies.clear();
        stateDependencies.clear();
        sortedStates.clear();
        fillStateSignalList(state);
        fillDependencyList(state);
        // printDependencyList();
        fillSortedThreadList();
        fillOptimizedStates(state);
        // printStatePlusTransitionList(sortedStates);
        // for (ArrayList<StatePlusTransition> spt : optimzedSortedStates) {
        // printStatePlusTransitionList(spt);
        // }
        // for (StatePlusTransition spt : sortedStates) {
        // System.out.println(spt.getState().getId() + " - "
        // + getRealOptimizedThreadPriority(spt.getState()));
        // }
        return sortedStates;
    }

    /**
     * Computes the real priority of the given state.
     * 
     * @param state the state you want to get the priority
     * @return priority of the state
     */
    public static int getRealThreadPriority(final State state) {
        return getThreadPriority(state, false, false);
    }

    /**
     * Computes the real optimized priority of the given state.
     * 
     * @param state the state you want to get the priority
     * @return priority of the state
     */
    public static int getRealOptimizedThreadPriority(final State state) {
        return getOptimizedPriority(state, false);
    }

    /**
     * Computes the real priority of the given state.
     * 
     * @param state the state you want to get the priority
     * @return priority of the state
     */
    public static int getSmallestThreadPriority(final State state) {
        return getThreadPriority(state, false, true);
    }

    /**
     * Computes the weak priority of the given state.
     * 
     * @param state the state you want to get the priority
     * @return priority of the state
     */
    public static int getWeakThreadPriority(final State state) {
        return getThreadPriority(state, true, true);
    }

    /**
     * Computes the weak optimized priority of the given state.
     * 
     * @param state the state you want to get the priority
     * @return priority of the state
     */
    public static int getOptimizedWeakThreadPriority(final State state) {
        return getOptimizedPriority(state, true);
    }

    /**
     * A simple method to print debug information.
     * 
     * @param s debug information
     */
    public static void debug(final String s) {
        System.out.println(s);
    }

    /**
     * A method to throw an error.
     * 
     * @param s error information
     * @throws KiemInitializationException for error handling
     */
    public static void error(final String s) throws KiemInitializationException {
        throw new KiemInitializationException("Error while generating SC code",
                true, new Exception(s));
    }

    /**
     * Computes a sorted list with states. The order of the list is the control
     * flow of all states in a region beginning with the initial one.
     * 
     * @param state the initial state to start with
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
     * @param state the state in which signals should be listed
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
     * @param state the state for which a label should be generated
     * @param flag what kind of label is desired
     * @return unique label for a state
     * 
     *         TODO: Implement the cases LABEL_ANY_ID and
     *         LABEL_SHORTEST_HIERARCHIE
     */
    public static String getStateNameByFlag(final State state,
            final Integer flag) {
        String out = "";
        switch (flag) {
        case LABEL_ANY_ID:
            out = getStateNameCompleteHierarchie(state);
            break;
        case LABEL_COMPLETE_HIERARCHIE:
            out = getStateNameCompleteHierarchie(state);
            break;
        case LABEL_SHORTEST_HIERARCHIE:
            out = getStateNameCompleteHierarchie(state);
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
     * @param state nut used?
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
     * @param transition transition to search for dependencies
     * @return true if the state has signal dependencies otherwise false
     */
    public static boolean hasDependentState(final Transition transition) {
        return (!getSignalDependentStates(transition).isEmpty());
    }

    /**
     * Computes if the given state has signal dependent states.
     * 
     * @param transition transition to search for dependencies
     * @return true if the transition is signal dependent otherwise false
     */
    public static boolean isSignalDependent(final Transition transition) {
        if (transition == null) {
            return false;
        } else {
            return (!getDependencyOwner(transition).isEmpty());
        }
    }

    /**
     * Returns the number of computed Threads without optimization of
     * priorities.
     * 
     * @return max threads
     */
    public static int getMaxPriority() {
        return sortedStates.size();
    }

    /*
     * Returns a string with an globally unique id for a state.
     */
    // TODO: implement!
    @SuppressWarnings("unused")
    private static String getStateNameAnyID(final State state) {
        String out = "";
        return out;
    }

    /*
     * Returns a string with the complete hierarchy of a state.
     */
    private static String getStateNameCompleteHierarchie(final State state) {
        //TODO: This is an ad-hoc fix for the release, this uses the
        //fragmentUriToKielerUri() method and replaces all invalid characters with underlines
//        String regionPrefix = "";
        String fragmentUri = ModelingUtil.getFragmentUri(state);
        String kielerUri = ModelingUtil.fragmentUriToKielerUri(fragmentUri, state.eResource());
        kielerUri = kielerUri.replaceAll("/" , "_");
        kielerUri = kielerUri.replaceAll("\\." , "_");
        kielerUri = kielerUri.replaceAll("@" , "_");
        return  kielerUri;
//        if (state.getParentRegion().getParentState() != null) {
//            if (state.getParentRegion().getParentState().getRegions().size() > 1) {
//                regionPrefix = state.getParentRegion().getId() + "_";
//            }
//        }
//        if (state.getParentRegion().getParentState() != null) {
//            return getStateNameCompleteHierarchie(state.getParentRegion()
//                    .getParentState()) + "_" + regionPrefix + state.getId();
//        } else {
//            return ((state.hashCode() + state.getParentRegion().hashCode())+ "").replace("-", "")
//                    + "_" + regionPrefix + state.getId();
//        }
    }

    /*
     * Returns a string with the shortest possible hierarchy of a state without any duplicated
     * strings as label.
     */
    // TODO: implement!
    @SuppressWarnings("unused")
    private static String getStateNameShortestHierarchie(final State state) {
        String out = "";
        return out;
    }

    /*
     * Returns a list with all states that are signal dependent.
     */
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

    /*
     * Returns a list with states for which a transitions is signal dependent.
     */
    private static ArrayList<StatePlusTransition> getDependencyOwner(
            final Transition transition) {
        ArrayList<StatePlusTransition> out = new ArrayList<StatePlusTransition>();
        for (Dependency dep : stateDependencies) {
            if (dep.getDependencyType() == SIGNAL_FLOW_EDGE) {
                Transition checkTransition = dep.getFirstState()
                        .getTransition();
                if (checkTransition != null
                        && checkTransition.equals(transition)) {
                    out.add(dep.getSecondState());
                }
            }
        }
        return out;
    }

    /*
     * Fills the list with signal dependencies for one state.
     */
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
                if (!disjunct(stateTriggerSignals, neighborEffectSignals)) {
                    addSignalDependencies(spt, neighborSpt);
                }
                // other direction
                if (!disjunct(stateEffectSignals, neighborTriggerSignals)) {
                    addSignalDependencies(neighborSpt, spt);
                }
            }
        }
    }

    /*
     * Helper function to add a signal dependency to a list.
     */
    private static void addSignalDependencies(final StatePlusTransition sptOne,
            final StatePlusTransition sptTwo) {
        addDependency(sptOne, sptTwo, SIGNAL_FLOW_EDGE);
        // for (Transition transition :
        // sptTwo.getState().getOutgoingTransitions()) {
        // StatePlusTransition spt = sptTwo;
        // spt.setTransition(transition);
        // }
        // if depth of states are not equal
        if (getDepth(sptOne.getState()) < getDepth(sptTwo.getState())) {
            State parentState = sptTwo.getState().getParentRegion()
                    .getParentState();
            StatePlusTransition parentSpt = getStateProperties(parentState);
            addSignalDependencies(sptOne, parentSpt);
        }
    }

    /*
     * Checks if two lists of signals are disjunct.
     */
    private static boolean disjunct(final List<Signal> firstList,
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

    /*
     * Returns the thread priority for a state depending on the state.
     */
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

    /*
     * Returns the index of a state from a list with StatePlusTransition objects.
     */
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

    /*
     * Helper function to add all signals (recursive) into a list.
     */
    private static void allSignalsHelp(final State state) {
        EList<Signal> tmp = state.getSignals();
        addSignalsToList(tmp);
        for (Region region : state.getRegions()) {
            for (State innerState : region.getStates()) {
                if (!state.getRegions().isEmpty()) {
                    allSignalsHelp(innerState);
                }
            }
        }
    }

    /*
     * Adds all signals of a given list to the global list of signals.
     */
    private static void addSignalsToList(final List<Signal> signalList) {
        for (Signal signal : signalList) {
            if (!allSignals.contains(signal)) {
                allSignals.add(signal);
            }
        }
    }

    /*
     * Helper function to sort a list of states by the control flow.
     */
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

    /*
     * Puts the neighbor regions (and its ancestors) into a list.
     */
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

    /*
     * Adds neighbor states to a list.
     */
    private static void addNeighbors(final List<Region> regions) {
        for (Region region : regions) {
            for (State innerState : region.getStates()) {
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
    @SuppressWarnings("unused")
    private static void printStatePlusTransitionList(
            final ArrayList<StatePlusTransition> list) {
        System.out.print("[");
        for (StatePlusTransition spt : list) {
            String weakStrong = "";
            weakStrong = stateType2String(spt.getType());
            String transition = "";
            if (spt.getTransition() != null) {
                transition = "+(" + spt.getTransition().getLabel() + ")";
            }
            System.out.print(spt.getState().getId() + transition + weakStrong
                    + " , ");
        }
        System.out.println("]");
    }

    /*
     * useful for debugging
     */
    @SuppressWarnings("unused")
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
                    + dependency.getFirstState().getTransition().getLabel()
                    + ")";
        }
        if (dependency.getSecondState().getTransition() != null) {
            secondTrans = "("
                    + dependency.getSecondState().getTransition().getLabel()
                    + ")";
        }
        firstState = dependency.getFirstState().getState().getId() + "+"
                + firstTrans;
        secondState = dependency.getSecondState().getState().getId() + "+"
                + secondTrans;
        System.out.print(firstState + firstWS + rel + secondState + secondWS
                + " , ");
    }

    /*
     * Returns a Dependency object for given states and types of edges of the dependency graph.
     */
    private static Dependency builtDependency(
            final StatePlusTransition firstSpt,
            final StatePlusTransition secondSpt, final int edgeType) {
        Dependency out = new Dependency(firstSpt, secondSpt, edgeType);
        return out;
    }

    /* 
     * Build a list of all possible dependencies in the SyncChart.
     */
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
                for (State innerState : region.getStates()) {
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

    /*
     * Fills a list with all dependencies of a SyncChart.
     */
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

    /*
     * Adds a dependency to the dependency list.
     */
    private static void addDependency(final StatePlusTransition sptOne,
            final StatePlusTransition sptTwo, final int dependency) {
        Dependency put = builtDependency(sptOne, sptTwo, dependency);
        if (!stateDependencies.contains(put)) {
            stateDependencies.add(put);
        }
    }

    /*
     * Adds a dependencies to the dependency list.
     */
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

    /*
     * Returns a list of transitions sorted by their transition priorities.
     */
    private static EList<Transition> getSortedTransitions(
            final EList<Transition> transitions) {
        EList<Transition> out = transitions;
        CompareTransitions comparable = new CompareTransitions();
        Collections.sort(out, comparable);
        return out;
    }

    /*
     * Returns a StatePlusTransition object for a given SyncChart state.
     */
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

    /*
     * Used by a function for debugging only.
     */
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

    /*
     * Fills a list with all triggers of a transition.
     */
    private static void fillTriggerSignals(final Transition transition) {
        EObject eObject = transition.getTrigger();
        // search for signals
        boolean hasNext = true;
        while (hasNext && eObject != null) {
            if (eObject instanceof ValuedObjectReference) {
                ValuedObject obj = ((ValuedObjectReference) eObject)
                        .getValuedObject();

                if (obj instanceof Signal) {
                    // put trigger signal into the list
                    Signal triggerSignal = ((Signal) obj);
                    if (!triggerSignals.contains(triggerSignal)) {
                        triggerSignals.add(triggerSignal);
                    }
                }
            }
            if (eObject.eAllContents().hasNext()) {
                eObject = eObject.eAllContents().next();
            } else {
                hasNext = false;
            }
        }
    }

    /*
     * Fills a list with all effects of a transition.
     */
    private static void fillEffectSignals(final Transition transition) {
        EList<Effect> triggerEffectSignals = transition.getEffects();
        // put all effect signals from transition into the list
        for (Effect effect : triggerEffectSignals) {
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

        // put all effect signals from actions into the list
        State sourceState = transition.getSourceState();
        EList<Action> innerActions = sourceState.getInnerActions();
        for (Action action : innerActions) {
            EList<Effect> actionEffects = action.getEffects();

            for (Effect effect : actionEffects) {
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
        }

        // if the target state has an immediate
        // outgoing transition put its signals to the source state ones
        for (Transition targetTrans : transition.getTargetState()
                .getOutgoingTransitions()) {
            if (isImmediateTransition(targetTrans)
                    && !transition.getSourceState().equals(
                            targetTrans.getTargetState())) {
                // System.out.println(targetTrans);
                fillEffectSignals(targetTrans);
            }
        }
    }

    /*
     * Fills a list of all signals (triggers and effects) for a state.
     */
    private static void fillStateSignalList(final State state) {
        // every region
        for (Region region : state.getRegions()) {
            // every state
            for (State innerState : region.getStates()) {
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
                        StatePlusTransition spt = new StatePlusTransition();
                        spt = getStateProperties(innerState);
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

    /*
     * Returns the depth of a state.
     */
    private static int getDepth(final State state) {
        if (state.getParentRegion().getParentState() != null) {
            return getDepth(state.getParentRegion().getParentState()) + 1;
        } else {
            return 0;
        }
    }

    /*
     * Returns a copy of a array list.
     */
    private static ArrayList<Signal> copyFromList(final ArrayList<Signal> in) {
        ArrayList<Signal> out = new ArrayList<Signal>();
        for (Signal signal : in) {
            out.add(signal);
        }
        return out;
    }

    /*
     * Main function for filling the list of sorted threads. 
     */
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
            if (isInnocentDependency(dependency)) {
                dependencyGraph.addEdge(sourceInt, targetInt, edgeType);
            }
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

    /*
     * Returns true if a dependency of a SyncChart is necessary for the dependency graph.
     */
    private static boolean isInnocentDependency(final Dependency dependency) {
        if (dependency.getDependencyType() != CONTROL_FLOW_EDGE) {
            return true;
        } else {
            Transition transition = dependency.getSecondState().getTransition();
            if (isImmediateTransition(transition)) {
                if (hasDependentState(transition)
                        || isSignalDependent(transition)) {
                    return true;
                }
            }
            // if (isSignalDependent(transition)) {
            // return true;
            // }
            // else if (hasDependentState(transition)) {
            // return true;
            // }
        }

        // else {
        // State controlDependencySource =
        // dependency.getFirstState().getState();
        // if (!controlDependencySource.getRegions().isEmpty()) {
        // return true;
        // } else if (!controlDependencySource.getEntryActions().isEmpty()) {
        // return true;
        // } else if
        // (controlDependencySource.getOutgoingTransitions().isEmpty()) {
        // return true;
        // } else if
        // (controlDependencySource.getType().equals(StateType.CONDITIONAL)) {
        // return true;
        // } else {
        // for (Transition transition :
        // controlDependencySource.getOutgoingTransitions()) {
        // if (isImmediateTransition(transition)) {
        // return true;
        // }
        // }
        // }
        // }

        return false;
    }

    /*
     * Returns if a transition is taken immediate.
     */
    private static boolean isImmediateTransition(final Transition transition) {
        return (transition.isIsImmediate()
                || transition.getType()
                        .equals(TransitionType.NORMALTERMINATION) || transition
                .getSourceState().getType().equals(StateType.CONDITIONAL));
    }

    /*
     * Starts the computation for optimized thread priorities.
     */
    private static void fillOptimizedStates(final State state) {
        optimzedSortedStates.clear();
        optimizeSortedStates(getRootState(state).getParentRegion());
    }

    /*
     * See above.
     */
    private static void optimizeSortedStates(final Region region) {
        ArrayList<ArrayList<StatePlusTransition>> regionSets;
        if (region.getParentState() == null) {
            regionSets = getStateSetsOfARegion(region.getStates().get(0));
        } else {
            regionSets = getStateSetsOfARegion(getInitialState(region));
        }
        optimzedSortedStates = mergeTwoArrayLists(optimzedSortedStates,
                regionSets);
        for (State innerState : region.getStates()) {
            for (Region innerRegion : innerState.getRegions()) {
                optimizeSortedStates(innerRegion);

            }
        }
    }

    /*
     * Returns an optimized thread priority of a state.
     */
    private static int getOptimizedPriority(final State state,
            final boolean weak) {
        int out = 0;
        StatePlusTransition spt;
        if (weak) {
            spt = new StatePlusTransition(state, WEAK_STATE, null);
        } else {
            spt = getStateProperties(state);
        }

        /*
         * if state is weak take the priority without searching in the combined list
         */
        if (weak) {
            return getIndexWithoutTransition(spt, false) + 1;
        }

        ArrayList<StatePlusTransition> listWithState = getListWithState(spt);

        // all hierarchical states
        boolean hierarchicalInThread = containsHierarchicalState(listWithState);
        ArrayList<StatePlusTransition> hierarchicalSpts = new ArrayList<StatePlusTransition>();
        if (hierarchicalInThread) {
            for (StatePlusTransition listSpt : listWithState) {
                if (isHieracrchical(listSpt.getState())) {
                    hierarchicalSpts.add(listSpt);
                }
            }
        } else {
            hierarchicalSpts = listWithState;
        }

        boolean containsSigDep = containsSignalDependency(hierarchicalSpts);
        ArrayList<StatePlusTransition> dependentSpts = new ArrayList<StatePlusTransition>();
        if (containsSigDep) {
            for (StatePlusTransition listSpt : hierarchicalSpts) {
                if (isSignalDependent(listSpt.getTransition())) {
                    dependentSpts.add(listSpt);
                }
            }
        } else {
            dependentSpts = hierarchicalSpts;
        }

        out = getSmallestIDFromList(dependentSpts);

        return out;
    }

    /*
     * Returns the biggest id of a list.
     */
    @SuppressWarnings("unused")
    private static int getBiggestIDFromList(
            final ArrayList<StatePlusTransition> sptList) {
        int out = MAX_PRIO;
        for (StatePlusTransition spt : sptList) {
            int newPriority = getIndexWithoutTransition(spt, false) + 1;
            if (newPriority < out) {
                out = newPriority;
            }
        }
        return out;
    }

    /*
     * Returns the smallest id of a list.
     */
    private static int getSmallestIDFromList(
            final ArrayList<StatePlusTransition> sptList) {
        int out = 0;
        for (StatePlusTransition spt : sptList) {
            int newPriority = getIndexWithoutTransition(spt, false) + 1;
            if (newPriority > out) {
                out = newPriority;
            }
        }
        return out;
    }

    /*
     * Returns true if a list of states contains a hierarchical state.
     */
    private static boolean containsHierarchicalState(
            final ArrayList<StatePlusTransition> sptList) {
        for (StatePlusTransition spt : sptList) {
            if (isHieracrchical(spt.getState())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isHieracrchical(final State state) {
        return !state.getRegions().isEmpty();
    }

    /*
     * Returns a the list of states in which the given state is.
     */
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

    /*
     * Returns true if a list of of states contains a state that is signal dependent.
     */
    private static boolean containsSignalDependency(
            final ArrayList<StatePlusTransition> sptList) {
        for (StatePlusTransition spt : sptList) {

            if (spt.getTransition() != null
                    && isSignalDependent(spt.getTransition())) {
                return true;
            }
        }
        return false;
    }

    /*
     * Returns the root state of a SyncChart.
     */
    private static State getRootState(final State state) {
        if (state.getParentRegion().getParentState() == null) {
            return state;
        } else {
            return getRootState(state.getParentRegion().getParentState());
        }
    }

    /*
     * Returns a list of state lists sorted by depth first search.
     */
    private static ArrayList<ArrayList<StatePlusTransition>> getStateSetsOfARegion(
            final State state) {
        ArrayList<ArrayList<StatePlusTransition>> out = new ArrayList<ArrayList<StatePlusTransition>>();
        // initialize states sorted by depth-first search
        ArrayList<State> statesSortedByDepth = new ArrayList<State>();
        ArrayList<State> notPut = new ArrayList<State>();
        for (int i = 0; i < state.getParentRegion().getStates().size(); i++) {
            notPut.add(state.getParentRegion().getStates().get(i));
        }
        getStatesSortedByDepth(state, statesSortedByDepth, notPut);

        while (!statesSortedByDepth.isEmpty()) {
            State startState = statesSortedByDepth.get(0);
            ArrayList<StatePlusTransition> innerSptList = new ArrayList<StatePlusTransition>();
            addSptsToList(startState, innerSptList);
            out.add(innerSptList);
            findPrioritySets(startState, innerSptList, statesSortedByDepth);
        }
        return out;
    }

    /*
     * Adds a state represented as StatePlusTransition object into a given list.
     */
    private static void addSptsToList(final State state,
            final ArrayList<StatePlusTransition> sptList) {
        if (state.getOutgoingTransitions().isEmpty()) {
            StatePlusTransition spt = getStateProperties(state);
            sptList.add(spt);
            if (spt.getType() == STRONG_STATE) {
                StatePlusTransition weakSpt = getStateProperties(state);
                weakSpt.setType(WEAK_STATE);
                sptList.add(weakSpt);
            }
        } else {
            for (Transition targetTransition : state.getOutgoingTransitions()) {
                StatePlusTransition spt = getStateProperties(state);
                spt.setTransition(targetTransition);
                sptList.add(spt);
                if (spt.getType() == STRONG_STATE) {
                    StatePlusTransition weakSpt = getStateProperties(state);
                    weakSpt.setType(WEAK_STATE);
                    weakSpt.setTransition(targetTransition);
                    sptList.add(weakSpt);
                }
            }
        }
    }

    /*
     * Merges two array lists into one list.
     */
    private static ArrayList<ArrayList<StatePlusTransition>> mergeTwoArrayLists(
            final ArrayList<ArrayList<StatePlusTransition>> one,
            final ArrayList<ArrayList<StatePlusTransition>> two) {
        ArrayList<ArrayList<StatePlusTransition>> out;
        ArrayList<ArrayList<StatePlusTransition>> add;
        if (one.size() > two.size()) {
            out = one;
            add = two;
        } else {
            out = two;
            add = one;
        }
        for (ArrayList<StatePlusTransition> spt : add) {
            out.add(spt);
        }
        return out;
    }

    /*
     * Determines a set of states with the same thread priority.
     */
    private static void findPrioritySets(final State state,
            final ArrayList<StatePlusTransition> sptList,
            final ArrayList<State> notPut) {
        // System.out.println(state.getId());
        notPut.remove(state);
        for (int i = 0; i < state.getOutgoingTransitions().size(); i++) {
            Transition transition = state.getOutgoingTransitions().get(i);
            State targetState = transition.getTargetState();
            if (notPut.contains(targetState)) {
                if (!hasDependentStateForAll(transition)
                        && !isHieracrchical(targetState)) {
                    // end for path
                    addSptsToList(targetState, sptList);
                    findPrioritySets(targetState, sptList, notPut);
                }
            }
        }
    }

    /*
     * Returns true if there exists a transition between the source state and target state
     * of the given transition that has signal dependent states.
     */
    private static boolean hasDependentStateForAll(final Transition transition) {
        State sourceState = transition.getSourceState();
        State targetState = transition.getTargetState();
        for (Transition trans : sourceState.getOutgoingTransitions()) {
            if (trans.getTargetState().equals(targetState)) {
                if (hasDependentState(trans)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Computes a list of states sorted by breadth-first search. 
     */
    private static void getStatesSortedByDepth(final State state,
            final ArrayList<State> states, final ArrayList<State> notPut) {
        notPut.remove(state);
        // System.out.println(state.getId());
        states.add(state);
        for (int i = 0; i < state.getOutgoingTransitions().size(); i++) {
            Transition transition = state.getOutgoingTransitions().get(i);
            State targetState = transition.getTargetState();
            if (notPut.contains(targetState)) {
                getStatesSortedByDepth(targetState, states, notPut);
            }
        }
    }

    /*
     * Returns the initial state of a given region.
     */
    private static State getInitialState(final Region region) {
        for (State state : region.getStates()) {
            if (state.isIsInitial()) {
                return state;
            }
        }
        return null;
    }
}
