/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.cau.cs.kieler.kitt.tracing.TransformationTracing;

/**
 * This is the main class of the Kieler Compiler (KiCo) Project that aims to provide an
 * infrastructure for compiling via consecutive modal transformations.
 * 
 * @author cmot
 * @kieler.design 2014-03-13 proposed
 * @kieler.rating 2014-03-13 proposed yellow
 * 
 */
public class KielerCompiler {

    /** The Constant DEBUG. */
    public static final boolean DEBUG = java.lang.management.ManagementFactory.getRuntimeMXBean()
            .getInputArguments().toString().contains("-agentlib:jdwp");

    // -------------------------------------------------------------------------

    /** The cached map id to all registered transformations. */
    private static HashMap<String, Transformation> id2transformations = null;

    /** The cached list of all transformations. */
    private static ArrayList<Transformation> transformations = null;

    // -------------------------------------------------------------------------

    /**
     * Checks if dependency referenced.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param graph
     *            the graph
     * @return true, if is dependency referenced
     */
    private static boolean isDependencyReferenced(TransformationDummy transformationDummy,
            KielerCompilerContext context) {
        for (TransformationDummy otherTransformationDummy : context.getGraph()) {
            if (!otherTransformationDummy.isGroup()) {
                for (TransformationDummy groupTransformationDummy : otherTransformationDummy.dependencies) {
                    if (groupTransformationDummy == transformationDummy) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if group is alternative.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param graph
     *            the graph
     * @return true, if is alternative
     */
    private static boolean isAlternative(TransformationDummy transformationDummy,
            KielerCompilerContext context) {
        for (TransformationDummy otherTransformationDummy : context.getGraph()) {
            if (otherTransformationDummy.isAlternative()) {
                for (String alternative : otherTransformationDummy.transformation.getDependencies()) {
                    if (transformationDummy.id.equals(alternative)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if group referenced.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param graph
     *            the graph
     * @return true, if is group referenced
     */
    private static boolean isGroupReferenced(TransformationDummy transformationDummy,
            KielerCompilerContext context) {
        for (TransformationDummy otherTransformationDummy : context.getGraph()) {
            if (otherTransformationDummy.isGroup() && !otherTransformationDummy.isAlternative()) {
                for (TransformationDummy groupTransformationDummy : otherTransformationDummy.dependencies) {
                    if (groupTransformationDummy == transformationDummy) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Reduces the graph to the transformations selected as transformationIDs.
     * 
     * @param graph
     *            the graph
     * @param transformationIDs
     *            the transformation i ds
     */
    public static void reduceGraph(KielerCompilerContext context, List<String> transformationIDs) {
        // not remove the selected but ALL UNselected
        boolean removeSelected = false;
        removeFromGraph(context, transformationIDs, removeSelected);
    }

    // -------------------------------------------------------------------------

    /**
     * Removes all transformations selected as transformationIDs from the graph.
     * 
     * @param graph
     *            the graph
     * @param transformationIDs
     *            the transformation i ds
     */
    public static void removeFromGraph(KielerCompilerContext context, List<String> transformationIDs) {
        if (transformationIDs != null && (transformationIDs.size() > 0)) {
            // remove ONLY the selected
            boolean removeSelected = false;
            removeFromGraph(context, transformationIDs, removeSelected);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Removes all transformations selected OR not-selected as transformationIDs from the graph.
     * 
     * @param graph
     *            the graph
     * @param transformationIDs
     *            the transformation i ds
     * @param removeSelected
     *            the remove selected
     */
    public static void removeFromGraph(KielerCompilerContext context,
            List<String> transformationIDs, boolean removeSelected) {
        List<TransformationDummy> graph = context.getGraph();
        TransformationDummy toBeDeleted = null;
        do {
            toBeDeleted = null;
            for (TransformationDummy transformationDummy : graph) {
                boolean found = false;
                for (String transformationID : transformationIDs) {
                    if (transformationID.equals(transformationDummy.id)) {
                        found = true;
                        break;
                    }
                }
                if (found && removeSelected) {
                    toBeDeleted = transformationDummy;
                    break;
                }
                if (!found && !removeSelected) {
                    toBeDeleted = transformationDummy;
                    break;
                }
            }
            if (toBeDeleted != null) {
                graph.remove(toBeDeleted);
                for (TransformationDummy transformationDummy : graph) {
                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
                        // System.out.println("REMOVE " + toBeDeleted.id
                        // + " from reverse-dependencies of " + transformationDummy.id);
                        transformationDummy.reverseDependencies.remove(toBeDeleted);
                    }
                    if (transformationDummy.dependencies.contains(toBeDeleted)) {
                        // System.out.println("REMOVE " + toBeDeleted.id + " from dependencies of "
                        // + transformationDummy.id);
                        transformationDummy.dependencies.remove(toBeDeleted);
                    }
                }
            }
        } while (toBeDeleted != null);
    }

    // -------------------------------------------------------------------------

    /**
     * Cleanup unused alternatives groups.
     * 
     * @param graph
     *            the graph
     */
    public static void cleanupImpossibleAlternatives(KielerCompilerContext context) {
        boolean found = true;
        TransformationDummy toBeDeleted = null;
        while (found) {
            found = false;
            for (TransformationDummy transformationDummy : context.getGraph()) {
                boolean dependencyReferenced = isDependencyReferenced(transformationDummy, context);
                boolean alternative = isAlternative(transformationDummy, context);
                boolean groupReferenced = isGroupReferenced(transformationDummy, context);

                if (alternative && !dependencyReferenced && !groupReferenced) {
                    if (transformationDummy.reverseDependencies.size() == 0) {
                        toBeDeleted = transformationDummy;
                        System.out.println("REMOVE " + transformationDummy.id);
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                context.getGraph().remove(toBeDeleted);
                for (TransformationDummy transformationDummy : context.getGraph()) {
                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
                        System.out.println("REMOVE " + toBeDeleted.id + " from "
                                + transformationDummy.id);
                        transformationDummy.reverseDependencies.remove(toBeDeleted);
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Recursively mark group nodes (belongs to phase 3).
     * 
     * @param graph
     *            the graph
     * @param transformationGroup
     *            the transformation group
     */
    private static void markGroupNodes(KielerCompilerContext context,
            TransformationGroup transformationGroup) {
        for (String groupTransformationID : transformationGroup.getDependencies()) {
            Transformation groupTransformation = getTransformation(groupTransformationID);
            if (groupTransformation != null) {
                TransformationDummy groupTransformationDummy =
                        context.getGraphTransformationDummy(groupTransformation);
                groupTransformationDummy.marked = true;
                // System.out.println("Marking " + groupTransformationDummy.id);
                if (groupTransformation instanceof TransformationGroup) {
                    // groupTransformation is a TransformationGroup itself, so close recursion here
                    markGroupNodes(context, (TransformationGroup) groupTransformation);
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Mark nodes including expand of groups (phase 3).
     * 
     * @param graph
     *            the graph
     * @param transformationIDs
     *            the transformation i ds
     * @param expandGroupNodes
     *            the expand group nodes
     */
    public static void markNodes(KielerCompilerContext context, List<String> transformationIDs,
            boolean expandGroupNodes) {
        for (String transformationID : transformationIDs) {
            Transformation transformation = getTransformation(transformationID);

            if (transformation != null) {
                TransformationDummy transformationDummy =
                        context.getGraphTransformationDummy(transformation);
                transformationDummy.marked = true;
                // System.out.println("Marking " + transformationDummy.id);

                if (expandGroupNodes && (transformation instanceof TransformationGroup)) {
                    TransformationGroup transformationGroup = (TransformationGroup) transformation;
                    markGroupNodes(context, transformationGroup);
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Mark reverse dependencies (phase 4).
     * 
     * @param transformationDummy
     *            the transformation dummy
     */
    private static void markReverseDependencies(TransformationDummy transformationDummy) {
        if (transformationDummy != null && !transformationDummy.marked) {
            transformationDummy.marked = true;
            // System.out.println("Marking " + transformationDummy.id);
            for (TransformationDummy otherTransformationDummy : transformationDummy.reverseDependencies) {
                markReverseDependencies(otherTransformationDummy);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Mark reverse dependencies (phase 4).
     * 
     * @param graph
     *            the graph
     */
    public static void markReverseDependencies(KielerCompilerContext context) {
        List<TransformationDummy> startNodes = new ArrayList<TransformationDummy>();
        for (TransformationDummy transformationDummy : context.getGraph()) {
            if (transformationDummy.marked) {
                transformationDummy.marked = false; // Reset recursion stop indicator before calling
                // recursive function
                startNodes.add(transformationDummy);
            }
        }

        // Start recursion from the start nodes
        for (TransformationDummy transformationDummy : startNodes) {
            markReverseDependencies(transformationDummy);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Mark parent group.
     * 
     * @param transformationDummy
     *            the transformation dummy
     */
    private static void markParentGroup(TransformationDummy transformationDummy) {
        for (TransformationDummy parent : transformationDummy.parent) {
            if (!parent.marked && parent.isGroup()) {
                parent.marked = true;
                markParentGroup(parent);
            }
        }
    }

    /**
     * Mark reverse dependencies (phase 4a).
     * 
     * @param graph
     *            the graph
     */
    public static void markParentGroups(KielerCompilerContext context) {
        for (TransformationDummy transformationDummy : context.getGraph()) {
            if (transformationDummy.marked) {
                markParentGroup(transformationDummy);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Eliminated unmarked nodes (phase 5).
     * 
     * @param graph
     *            the graph
     */
    public static void eliminatedUnmarkedNodes(KielerCompilerContext context) {
        boolean found = true;
        TransformationDummy toBeDeleted = null;
        while (found) {
            found = false;
            for (TransformationDummy transformationDummy : context.getGraph()) {
                if (!transformationDummy.marked) {
                    toBeDeleted = transformationDummy;
                    // System.out.println("REMOVE " + transformationDummy.id);
                    found = true;
                    break;
                }
            }
            if (found) {
                context.getGraph().remove(toBeDeleted);
                for (TransformationDummy transformationDummy : context.getGraph()) {
                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
                        // System.out.println("REMOVE " + toBeDeleted.id
                        // + " from reverse-dependencies of " + transformationDummy.id);
                        transformationDummy.reverseDependencies.remove(toBeDeleted);
                    }
                    if (transformationDummy.dependencies.contains(toBeDeleted)) {
                        // System.out.println("REMOVE " + toBeDeleted.id + " from dependencies of "
                        // + transformationDummy.id);
                        transformationDummy.dependencies.remove(toBeDeleted);
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------
    // -- T O P O L O G I C A L S O R T --
    // -------------------------------------------------------------------------

    // L <- Empty list that will contain the sorted nodes
    // S <- Set of all nodes with no outgoing edges
    // for each node n in S do
    // visit(n)
    // function visit(node n)
    // if n has not been visited yet then
    // mark n as visited
    // for each node m with an edge from m to n do
    // visit(m)
    // add n to L

    /**
     * Gets the transformation dummy with no dependencies.
     * 
     * @param graph
     *            the graph
     * @return the transformation dummy with no dependencies
     */
    private static List<TransformationDummy> getTransformationDummyWithNoDependencies(
            KielerCompilerContext context) {
        List<TransformationDummy> returnList = new ArrayList<TransformationDummy>();
        for (TransformationDummy transformationDummy : context.getGraph()) {
            if (transformationDummy.dependencies.size() == 0) {
                returnList.add(transformationDummy);
            }
        }
        return returnList;
    }

    // ------------------------------------------

    /**
     * Visit.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @param order
     *            the order
     * @return the int
     */
    private static int visit(TransformationDummy transformationDummy, int order) {
        if (transformationDummy.order == -1) {
            // This transformationDummy has not been seen yet
            transformationDummy.order = -2;
            int tmpOrder = order;
            for (TransformationDummy nextTransformationDummy : transformationDummy.reverseDependencies) {
                if (nextTransformationDummy != transformationDummy) {
                    tmpOrder = visit(nextTransformationDummy, tmpOrder);
                }
            }
            transformationDummy.order = tmpOrder + 1;
            return tmpOrder + 1;
        } else {
            return order;
        }
    }

    // ------------------------------------------

    /**
     * Topological sort.
     * 
     * @param context
     *            the context
     */
    private static void topologicalSort(KielerCompilerContext context) {
        List<TransformationDummy> initialTransformationDummys =
                getTransformationDummyWithNoDependencies(context);
        int tmpOrder = 0;
        for (TransformationDummy initialTransformationDummy : initialTransformationDummys) {
            tmpOrder = visit(initialTransformationDummy, tmpOrder);
        }

        // Now insert into return list by order
        List<TransformationDummy> graph = context.getGraph();
        String[] returnArray = new String[graph.size()];
        for (TransformationDummy transformationDummy : graph) {
            returnArray[transformationDummy.order - 1] = transformationDummy.id;
        }
        context.setCompilationTransformationIDs(Arrays.asList(returnArray));
        return;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Update mapping between transformation IDs and transformations.
     * 
     * @param force
     *            the force
     */
    private static void updateMapping(boolean force) {
        if (transformations == null || id2transformations == null || force) {
            id2transformations = KiCoPlugin.getInstance().getRegisteredTransformations();
            transformations = new ArrayList<Transformation>();
            for (Entry<String, Transformation> localTransformation : id2transformations.entrySet()) {
                transformations.add(localTransformation.getValue());
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation for a transformation ID. If no registered transformation is found for
     * an ID then a runtime exception is raised.
     * 
     * @param transformationID
     *            the transformation id
     * @return the transformation
     */
    public static Transformation getTransformation(String transformationID) {
        updateMapping(false);
        Transformation transformation = id2transformations.get(transformationID);
        if (transformation == null) {
            KiCoPlugin
                    .getInstance()
                    .showError(
                            "Cannot find a transformation with the ID '"
                                    + transformationID
                                    + "'. Make sure that the transformation with this ID is registered and its"
                                    + " declaring plugin is loaded. Make sure that the ID does exactly match"
                                    + " (case sensitive). Maybe you forgot to separate multiple ID's by a"
                                    + " comma.", KiCoPlugin.PLUGIN_ID, null, true);
            // throw new RuntimeException("Cannot find a transformation with the ID '"
            // + transformationID
            // + "'. Make sure that the transformation with this ID is registered and its"
            // + " declaring plugin is loaded. Make sure that the ID does exactly match"
            // + " (case sensitive). Maybe you forgot to separate multiple ID's by a"
            // + " comma.");
        }
        return transformation;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of all registered transformations.
     * 
     * @return the registered transformations
     */
    public static List<Transformation> getRegisteredTransformations() {
        if (transformations == null) {
            KielerCompiler.updateMapping(true);
        }
        return transformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Expand groups.
     * 
     * @param transformationIDs
     *            the transformation i ds
     * @return the list
     */
    private static List<String> expandGroups(List<String> transformationIDs) {
        List<String> returnList = expandGroupsHelper(transformationIDs);
        while (returnList.size() != transformationIDs.size()) {
            // find fixed point
            transformationIDs = returnList;
            returnList = expandGroupsHelper(transformationIDs);
        }
        return returnList;
    }

    // -------------------------------------------------------------------------

    /**
     * Expand groups helper.
     * 
     * @param transformationIDs
     *            the transformation i ds
     * @return the list
     */
    private static List<String> expandGroupsHelper(List<String> transformationIDs) {
        List<String> returnList = new ArrayList<String>();
        for (String transformationID : transformationIDs) {
            Transformation transformation = getTransformation(transformationID);
            if (transformation != null) {
                if (transformation instanceof TransformationGroup) {
                    TransformationGroup transformationGroup = (TransformationGroup) transformation;
                    if (!transformationGroup.isAlternatives()) {
                        // Add/expand all NON-alternative group members
                        for (String otherTransformationID : transformationGroup.getDependencies()) {
                            returnList.add(otherTransformationID);
                        }
                    } else {
                        // Add/expand ONE alternative group members (if no other already exists)
                        boolean exists = false;
                        for (String otherTransformationID : transformationGroup.getDependencies()) {
                            for (String returnListItem : transformationIDs) {
                                if (returnListItem.equals(otherTransformationID)) {
                                    exists = true;
                                    break;
                                }
                            }
                        }
                        if (!exists) {
                            // Add default here because no alternative of this group is yet included
                            String defaultTransformation =
                                    transformationGroup.getSelectedDependency(transformationIDs);
                            returnList.add(defaultTransformation);
                        }
                    }
                } else {
                    returnList.add(transformationID);
                }
            }
        }
        return returnList;
    }

    // -------------------------------------------------------------------------

    /**
     * Eliminate group ids (phase 7).
     * 
     * @param context
     *            the context
     * @return the list
     */
    private static void eliminateGroupIds(KielerCompilerContext context, boolean allGroups) {
        List<String> returnList = new ArrayList<String>();
        for (String transformationID : context.getCompilationTransformationIDs()) {
            Transformation transformation = getTransformation(transformationID);
            if (transformation != null) {
                if (!(transformation instanceof TransformationGroup)) {
                    returnList.add(transformationID);
                } else {
                    TransformationGroup group = (TransformationGroup) transformation;
                    if (!allGroups) {
                        // if we do NOT want to eliminate ALL groups, then do NOT delete
                        // 1. alternative groups
                        // 2. non-alternative groups where ALL members are marked
                        if (group.isAlternatives()) {
                            returnList.add(transformationID);
                        } else {
                            boolean allMarked = true;
                            List<String> dependencyIDs = expandGroups(group.getDependencies());
                            for (String dependencyID : dependencyIDs) {
                                boolean found = false;
                                for (String searchTransformationID : context
                                        .getCompilationTransformationIDs()) {
                                    if (searchTransformationID.equals(dependencyID)) {
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    allMarked = false;
                                    break;
                                }
                            }
                            if (allMarked) {
                                returnList.add(transformationID);
                            }
                        }
                    }
                }
            }
        }
        context.setCompilationTransformationIDs(returnList);
        return;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Calculate pre requirements.
     * 
     * @param selectedAndDisabledTransformationIDs
     *            the enabled and disabled transformation i ds
     * @param noGroups
     *            if false then mark groups, i.e., boolean mark alternative groups if ONE of the
     *            alternatives is selected and mark non-alternatives groups if ALL are selected
     * 
     * @return the list
     */
    public static List<String> calculatePreRequirements(
            String selectedAndDisabledTransformationIDs, boolean noGroups) {
        KielerCompilerContext context =
                new KielerCompilerContext(selectedAndDisabledTransformationIDs);
        return context.getCompilationTransformationIDs();
    }

    // -------------------------------------------------------------------------

    /**
     * Calculate pre requirements.
     * 
     * @param selectedTransformationIDs
     *            the transformation i ds
     * @param disabledTransformationIDs
     *            the excluded transformation i ds
     * @param noGroups
     *            if false then mark groups, i.e., boolean mark alternative groups if ONE of the
     *            alternatives is selected and mark non-alternatives groups if ALL are selected
     * @return the list
     */
    public static List<String> calculatePreRequirements(List<String> selectedTransformationIDs,
            final List<String> disabledTransformationIDs, boolean noGroups) {
        KielerCompilerContext context =
                new KielerCompilerContext(selectedTransformationIDs, disabledTransformationIDs);
        context.setNoGroups(noGroups);
        calculatePreRequirements(context);
        return context.getCompilationTransformationIDs();
    }

    // -------------------------------------------------------------------------

    /**
     * Calculate pre requirements for a given context.
     * 
     */
    private static void calculatePreRequirements(KielerCompilerContext context) {
        // 1. build graph (with initially requested transformation IDs as a tie
        // breaker for alternative groups)
        context.buildGraph(context.getSelectedTransformationIDs());

        // 2. eliminate unused alternative paths
        cleanupImpossibleAlternatives(context);

        // 3. mark nodes, including groups
        markNodes(context, context.getSelectedTransformationIDs(), true);

        // 4. mark reverse dependencies
        markReverseDependencies(context);

        // 5. eliminate unmarked nodes
        eliminatedUnmarkedNodes(context);

        // 5b remove excluded transformations
        removeFromGraph(context, context.getDisabledTransformationIDs());

        // 6. topological sort
        topologicalSort(context);

        // 7. final cleanup, eliminate any groups
        eliminateGroupIds(context, context.isNoGroups());
        return;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations or transformation groups with comma
     * separated IDs. Disabled transformation have a leading "!" before their ID. Switching off
     * calculation of prerequirements is not suggested. If prerequirements is switched off no
     * dependencies are considered and the transformations will be applied straight forward in the
     * order defined by the transformationIDs list. Inplace tells whether the compilation will be
     * done on a copy of the input EObject or on the original EObject.
     * 
     * @param selectedAndDisabledTransformationIDs
     *            the enabled and disabled transformation i ds
     * @param eObject
     *            the e object
     * @param prerequirements
     *            the prerequirements
     * @return the object
     */
    public static CompilationResult compile(final String selectedAndDisabledTransformationIDs,
            final EObject eObject, final boolean prerequirements, final boolean inplace) {
        KielerCompilerContext context =
                new KielerCompilerContext(selectedAndDisabledTransformationIDs, eObject);
        context.setPrerequirements(prerequirements);
        context.setInplace(inplace);
        compile(context);
        return context.getCompilationResult();
    }

    // -------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations or transformation groups with comma
     * separated IDs. Disabled transformation have a leading "!" before their ID. Switching off
     * calculation of prerequirements is not suggested. If prerequirements is switched off no
     * dependencies are considered and the transformations will be applied straight forward in the
     * order defined by the transformationIDs list. Inplace tells whether the compilation will be
     * done on a copy of the input EObject or on the original EObject.
     * 
     * @param selectedAndDisabledTransformationIDs
     *            the enabled and disabled transformation i ds
     * @param eObject
     *            the e object
     * @param prerequirements
     *            the prerequirements
     * @return the object
     */
    public static CompilationResult compile(List<String> selectedTransformationIDs,
            final List<String> disabledTransformationIDs, final EObject eObject,
            final boolean prerequirements, final boolean inplace) {
        KielerCompilerContext context =
                new KielerCompilerContext(selectedTransformationIDs, disabledTransformationIDs,
                        eObject);
        context.setPrerequirements(prerequirements);
        context.setInplace(inplace);
        compile(context);
        return context.getCompilationResult();
    }

    // -------------------------------------------------------------------------

    /**
     * Advanced internally used KIELER Compiler compile method on a given context.
     * 
     * @param context
     *            the context
     * @return the compilation result
     */
    public static CompilationResult compile(KielerCompilerContext context) {
        updateMapping(DEBUG);

        // as this is a compile run, the following MUST be set
        EObject transformationEObject = context.getTransformationObject();
        if (transformationEObject == null) {
            KiCoPlugin.getInstance().showError(
                    "No model was supplied for this compilation run! Aborting compilation.",
                    KiCoPlugin.PLUGIN_ID, null, true);
            return context.getCompilationResult();
        }

        // Set the main resource
        if (context.getMainResource() == null) {
            context.setMainResource(transformationEObject.eResource());
        }

        // If not inplace then produce a copy of the input EObject
        if (!context.isInplace()) {
            EObject copiedObject = copy(transformationEObject);
            // replace intermediate object
            context.getCompilationResult().getIntermediateResults().clear();
            context.getCompilationResult().getIntermediateResults().add(copiedObject);
            // make the new copy the transformedObject
            transformationEObject = copiedObject;
        }

        // 1. build graph (with initially requested transformation IDs as a tie
        // breaker for alternative groups)
        context.buildGraph(context.getSelectedTransformationIDs());

        // 2. eliminate unused alternative paths
        cleanupImpossibleAlternatives(context);

        // 3. mark nodes, including groups
        markNodes(context, context.getSelectedTransformationIDs(), true);

        if (context.isPrerequirements()) {
            // 4. mark reverse dependencies
            markReverseDependencies(context);
        }

        // 4b. mark parent groups
        markParentGroups(context);

        // 5. eliminate unmarked nodes
        eliminatedUnmarkedNodes(context);

        // 5b remove excluded transformations
        removeFromGraph(context, context.getDisabledTransformationIDs());

        // 6. topological sort
        topologicalSort(context);

        // 7. final cleanup, eliminate any groups
        eliminateGroupIds(context, true);

        List<String> compilationTransformationIDs = context.getCompilationTransformationIDs();

        // The progress monitor is optional and may be null!
        IProgressMonitor monitor = context.getProgressMonitor();

        int doneWork = 0;
        int totalWork = compilationTransformationIDs.size();
        if (monitor != null) {
            monitor.beginTask("Compiling, performing " + totalWork + "transformations.",
                    totalWork * 100);
        }

        // This will be the current instance of the transformed model, initially it is the
        // transformationEObject from the context
        EObject transformedObject = transformationEObject;

        for (String compilationTransformationID : compilationTransformationIDs) {
            Transformation transformation = getTransformation(compilationTransformationID);

            // Reset the done flag for the next transformation step
            context.getCompilationResult().setCurrentTransformationDone(false);

            doneWork++;

            // Possibly async call to perform the transformation (in a new Eclipse job)
            performTransformationTask(transformedObject, transformation, context, doneWork,
                    totalWork);

            boolean cancelled = false;
            // Blocking waiting until cancelled or current transformation is done
            while (!cancelled && !context.getCompilationResult().isCurrentTransformationDone()) {
                if (monitor != null && monitor.isCanceled()) {
                    cancelled = true;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }

            // Break if either cancelled by the user
            if (monitor != null && monitor.isCanceled()) {
                break;
            }

            // Feed back the last transformation result for the NEXT transformation
            EObject object = context.getCompilationResult().getEObject();
            if (object != null) {
                //create copy to create a intermediate result for every selected transformation
                if (!context.isInplace() && context.getSelectedTransformationIDs().contains(compilationTransformationID)) {
                    transformedObject = copy(object);
                }else{
                    transformedObject = object;
                }
            } else {
                // In this case we CANNOT do any further transformation calls
                // which require the return value of doTransform to be an EObject
                break;
            }

        }

        if (monitor != null) {
            monitor.done();
        }
        context.getCompilationResult().processPostponedWarnings();
        context.getCompilationResult().processPostponedErrors();
        return context.getCompilationResult();
    }

    // -------------------------------------------------------------------------

    /**
     * Internally perform a single transformation.
     * 
     * @param transformedObject
     *            the transformed object
     * @param transformation
     *            the transformation
     * @param context
     *            the context
     * @param doneWork
     *            the done work
     * @param totalWork
     *            the total work
     * @return the object
     */
    private static void performTransformationTask(final EObject transformedObject,
            Transformation transformation, KielerCompilerContext context, int doneWork,
            int totalWork) {
        if (transformation != null) {
            String compilationTransformationID = transformation.getId();
            context.getCompilationResult().getTransformations().add(compilationTransformationID);

            // The progress monitor is optional and may be null!
            IProgressMonitor monitor = context.getProgressMonitor();

            if (monitor != null) {
                monitor.setTaskName("Compiling, performing transformation " + doneWork + "/"
                        + totalWork + ": '" + transformation.getName() + "'");
            }

            // If the requested TransformationID
            if (transformation.getId().equals(compilationTransformationID)) {
                // If this is an individual

                // Class<?> parameterType = transformedObject.getClass();
                Class<?> handledParameterType = transformation.getParameterType();
                if (handledParameterType != null) {
                    if (DEBUG) {
                        System.out.println("PERFORM TRANSFORMATION: " + compilationTransformationID
                        // + " ( is " + parameterType.getName() + " handled by "
                        // + handledParameterType.getName() + "? "
                        // + handledParameterType.isInstance(transformedObject) + " )"
                                );
                    }
                    if (handledParameterType.isInstance(transformedObject)) {

                        KielerCompilerProgressMonitor subMonitor = null;
                        if (monitor == null) {
                            monitor = new NullProgressMonitor();
                        }
                        subMonitor = new KielerCompilerProgressMonitor(monitor, 100);
                        // Set the sub monitor for this transformation
                        context.setCurrentTransformationProgressMonitor(subMonitor);
                        // Each subMonitor can use 0 - 100 % / work units
                        performTransformation(transformedObject, transformation, context,
                                subMonitor);
                        context.getCompilationResult().setCurrentTransformationDone(true);
                        // Increment the main monitor with 100%-x% percent, where x% is the number
                        // of
                        // work in % already added by the subMonitor
                        int additional = 100 - subMonitor.getPercentDone();
                        monitor.worked(additional);
                    } else {
                        // MUST flag this to be finished otherwise
                        context.getCompilationResult().setCurrentTransformationDone(true);
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Perform the actual transformation.
     * 
     * @param transformedObject
     *            the transformed object
     * @param transformation
     *            the transformation
     * @param context
     *            the context
     * @return the object
     */
    private static void performTransformation(final EObject transformedObject,
            final Transformation transformation, final KielerCompilerContext context,
            final KielerCompilerProgressMonitor subMonitor) {

        String transformationID = "unknown";
        Object object = null;
        try {
            transformationID = transformation.getId();
            Resource res = transformedObject.eResource();
            if (context.isCreateDummyResource()) {
                // If we should create a dummy resource then save it after each successful
                // transformation step
                if (res == null) {
                    // Create a dummy resource by calling serialization (this creates a dummy
                    // resource on the fly)
                    @SuppressWarnings("unused")
                    String discard = KiCoUtil.serialize(transformedObject, context, true);
                }
                res = context.getMainResource();
            }
            
            //Perform transformation and traces all steps
            TransformationTracing.startTransformationTracing(transformedObject, transformationID);
            object = transformation.doTransform(transformedObject, context);
        } catch (Exception exception) {
            context.getCompilationResult().addPostponedError(
                    new KielerCompilerException(transformationID, exception));
        } finally{
            TransformationTracing.finishTransformationTracing(transformedObject, object);
        }

        if (object != null) {
            // If this is the FIRST successful transformation AND we are NOT in
            // verbose mode
            // then clear all possibly previous errors
            if (context.getCompilationResult().getIntermediateResults().size() <= 1
                    && !context.isVerboseMode()) {
                context.getCompilationResult().resetPostponedErrors();
            }

            // Add to compilation result
            context.getCompilationResult().getIntermediateResults().add(object);

            if (!(object instanceof EObject)) {
                // in this case we CANNOT do any further transformation calls
                // which require the return value of doTransform to be an EObject
                context.getCompilationResult().setCurrentTransformationDone(true);
            }
        }
    }

    // -------------------------------------------------------------------------
    
    /**
     * Creates and returns a copy of the given model and preserves its tracings if necessary.
     * @param original model
     * @return copy model
     */
    private static EObject copy(EObject original){
        TransformationTracing.startTransformationTracing(original, false);
        EObject copy = TransformationTracing.tracedCopy(original);
        TransformationTracing.finishTransformationTracing(original, copy); 
        return copy;
    }
}
