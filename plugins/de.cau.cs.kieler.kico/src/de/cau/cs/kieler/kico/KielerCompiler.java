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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

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

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // .....█████╗..██████╗.██████╗███████╗███████╗███████╗
    // ....██╔══██╗██╔════╝██╔════╝██╔════╝██╔════╝██╔════╝
    // ....███████║██║.....██║.....█████╗..███████╗███████╗
    // ....██╔══██║██║.....██║.....██╔══╝..╚════██║╚════██║
    // ....██║..██║╚██████╗╚██████╗███████╗███████║███████║
    // ....╚═╝..╚═╝.╚═════╝.╚═════╝╚══════╝╚══════╝╚══════╝.
    // -------------------------------------------------------------------------

    /**
     * Gets the processor by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the processor
     */
    public static Processor getProcessor(String id) {
        return KiCoPlugin.getProcessor(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered processors.
     * 
     * @return the processors
     */
    public static Set<Processor> getProcessors() {
        Map<String, Processor> map = KiCoPlugin.getRegisteredProcessors(false);
        Set<Processor> set = new HashSet<Processor>();
        for (Entry<String, Processor> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the feature by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the feature
     */
    public static Feature getFeature(String id) {
        return KiCoPlugin.getFeature(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered features.
     * 
     * @return the features
     */
    public static Set<Feature> getFeatures() {
        Map<String, Feature> map = KiCoPlugin.getRegisteredFeatures(false);
        Set<Feature> set = new HashSet<Feature>();
        for (Entry<String, Feature> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the transformation
     */
    public static Transformation getTransformation(String id) {
        return KiCoPlugin.getTransformation(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered transformations.
     * 
     * @return the transformations
     */
    public static Set<Transformation> getTransformations() {
        Map<String, Transformation> map = KiCoPlugin.getRegisteredTransformations(false);
        Set<Transformation> set = new HashSet<Transformation>();
        for (Entry<String, Transformation> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the creeper by its id, if it is registered.
     * 
     * @param id
     *            the id
     * @return the creeper
     */
    public static Creeper getCreeper(String id) {
        return KiCoPlugin.getCreeper(id, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all registered creepers.
     * 
     * @return the creepers
     */
    public static Set<Creeper> getCreepers() {
        Map<String, Creeper> map = KiCoPlugin.getRegisteredCreepers(false);
        Set<Creeper> set = new HashSet<Creeper>();
        for (Entry<String, Creeper> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // ....██████╗.██████╗..██████╗..██████╗███████╗███████╗███████╗
    // ....██╔══██╗██╔══██╗██╔═══██╗██╔════╝██╔════╝██╔════╝██╔════╝
    // ....██████╔╝██████╔╝██║...██║██║.....█████╗..███████╗███████╗
    // ....██╔═══╝.██╔══██╗██║...██║██║.....██╔══╝..╚════██║╚════██║
    // ....██║.....██║..██║╚██████╔╝╚██████╗███████╗███████║███████║
    // ....╚═╝.....╚═╝..╚═╝.╚═════╝..╚═════╝╚══════╝╚══════╝╚══════╝
    // -------------------------------------------------------------------------

//    /**
//     * Checks if dependency referenced.
//     * 
//     * @param transformationDummy
//     *            the transformation dummy
//     * @param graph
//     *            the graph
//     * @return true, if is dependency referenced
//     */
//    private static boolean isDependencyReferenced(FeatureDummy transformationDummy,
//            KielerCompilerContext context) {
//        for (FeatureDummy otherTransformationDummy : context.getGraph()) {
//            if (!otherTransformationDummy.isGroup()) {
//                for (FeatureDummy groupTransformationDummy : otherTransformationDummy.dependencies) {
//                    if (groupTransformationDummy == transformationDummy) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Checks if group is alternative.
//     * 
//     * @param transformationDummy
//     *            the transformation dummy
//     * @param graph
//     *            the graph
//     * @return true, if is alternative
//     */
//    private static boolean isAlternative(FeatureDummy transformationDummy,
//            KielerCompilerContext context) {
//        for (FeatureDummy otherTransformationDummy : context.getGraph()) {
//            if (otherTransformationDummy.isAlternative()) {
//                // By convention: Group transformations are internally handled as produce
//                // dependencies
//                // Rationale: If a group is selected, these transformations are applied
//                for (String alternative : otherTransformationDummy.transformation
//                        .getProducesFeatureIds()) {
//                    if (transformationDummy.id.equals(alternative)) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Checks if group referenced.
//     * 
//     * @param transformationDummy
//     *            the transformation dummy
//     * @param graph
//     *            the graph
//     * @return true, if is group referenced
//     */
//    private static boolean isGroupReferenced(FeatureDummy transformationDummy,
//            KielerCompilerContext context) {
//        for (FeatureDummy otherTransformationDummy : context.getGraph()) {
//            if (otherTransformationDummy.isGroup() && !otherTransformationDummy.isAlternative()) {
//                for (FeatureDummy groupTransformationDummy : otherTransformationDummy.dependencies) {
//                    if (groupTransformationDummy == transformationDummy) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Reduces the graph to the transformations selected as transformationIds.
//     * 
//     * @param graph
//     *            the graph
//     * @param transformationIds
//     *            the transformation i ds
//     */
//    public static void reduceGraph(KielerCompilerContext context, List<String> transformationIds) {
//        // not remove the selected but ALL UNselected
//        boolean removeSelected = false;
//        removeFromGraph(context, transformationIds, removeSelected);
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Removes all transformations selected as transformationIds from the graph.
//     * 
//     * @param graph
//     *            the graph
//     * @param transformationIds
//     *            the transformation i ds
//     */
//    public static void removeFromGraph(KielerCompilerContext context, List<String> transformationIds) {
//        if (transformationIds != null && (transformationIds.size() > 0)) {
//            // remove ONLY the selected
//            boolean removeSelected = true;
//            removeFromGraph(context, transformationIds, removeSelected);
//        }
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Removes all transformations selected OR not-selected as transformationIds from the graph.
//     * 
//     * @param graph
//     *            the graph
//     * @param transformationIds
//     *            the transformation i ds
//     * @param removeSelected
//     *            the remove selected
//     */
//    public static void removeFromGraph(KielerCompilerContext context,
//            List<String> transformationIds, boolean removeSelected) {
//        List<FeatureDummy> graph = context.getGraph();
//        FeatureDummy toBeDeleted = null;
//        do {
//            toBeDeleted = null;
//            for (FeatureDummy transformationDummy : graph) {
//                boolean found = false;
//                for (String transformationId : transformationIds) {
//                    if (transformationId.equals(transformationDummy.id)) {
//                        found = true;
//                        break;
//                    }
//                }
//                if (found && removeSelected) {
//                    toBeDeleted = transformationDummy;
//                    break;
//                }
//                if (!found && !removeSelected) {
//                    toBeDeleted = transformationDummy;
//                    break;
//                }
//            }
//            if (toBeDeleted != null) {
//                graph.remove(toBeDeleted);
//                for (FeatureDummy transformationDummy : graph) {
//                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
//                        // System.out.println("REMOVE " + toBeDeleted.id
//                        // + " from reverse-dependencies of " + transformationDummy.id);
//                        transformationDummy.reverseDependencies.remove(toBeDeleted);
//                    }
//                    if (transformationDummy.dependencies.contains(toBeDeleted)) {
//                        // System.out.println("REMOVE " + toBeDeleted.id + " from dependencies of "
//                        // + transformationDummy.id);
//                        transformationDummy.dependencies.remove(toBeDeleted);
//                    }
//                }
//            }
//        } while (toBeDeleted != null);
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Cleanup unused alternatives groups.
//     * 
//     * @param graph
//     *            the graph
//     */
//    public static void cleanupImpossibleAlternatives(KielerCompilerContext context) {
//        boolean found = true;
//        FeatureDummy toBeDeleted = null;
//        while (found) {
//            found = false;
//            for (FeatureDummy transformationDummy : context.getGraph()) {
//                boolean dependencyReferenced = isDependencyReferenced(transformationDummy, context);
//                boolean alternative = isAlternative(transformationDummy, context);
//                boolean groupReferenced = isGroupReferenced(transformationDummy, context);
//
//                if (alternative && !dependencyReferenced && !groupReferenced) {
//                    if (transformationDummy.reverseDependencies.size() == 0) {
//                        toBeDeleted = transformationDummy;
//                        found = true;
//                        break;
//                    }
//                }
//            }
//            if (found) {
//                context.getGraph().remove(toBeDeleted);
//                for (FeatureDummy transformationDummy : context.getGraph()) {
//                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
//                        transformationDummy.reverseDependencies.remove(toBeDeleted);
//                    }
//                }
//            }
//        }
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Recursively mark group nodes (belongs to phase 3).
//     * 
//     * @param graph
//     *            the graph
//     * @param transformationGroup
//     *            the transformation group
//     */
//    private static void markGroupNodes(KielerCompilerContext context,
//            TransformationGroup transformationGroup) {
//        // TODO: Check if this is right!
//        for (String groupTransformationId : transformationGroup.getProducesFeatureIds()) {
//            Transformation groupTransformation = getTransformation(groupTransformationId);
//            if (groupTransformation != null) {
//                FeatureDummy groupTransformationDummy =
//                        context.getGraphTransformationDummy(groupTransformation);
//                groupTransformationDummy.marked = true;
//                // System.out.println("Marking " + groupTransformationDummy.id);
//                if (groupTransformation instanceof TransformationGroup) {
//                    // groupTransformation is a TransformationGroup itself, so close recursion here
//                    markGroupNodes(context, (TransformationGroup) groupTransformation);
//                }
//            }
//        }
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Mark nodes including expand of groups (phase 3).
//     * 
//     * @param graph
//     *            the graph
//     * @param transformationIds
//     *            the transformation i ds
//     * @param expandGroupNodes
//     *            the expand group nodes
//     */
//    public static void markNodes(KielerCompilerContext context, List<String> transformationIds,
//            boolean expandGroupNodes) {
//        for (String transformationId : transformationIds) {
//            Transformation transformation = getTransformation(transformationId);
//
//            if (transformation != null) {
//                FeatureDummy transformationDummy =
//                        context.getGraphTransformationDummy(transformation);
//                transformationDummy.marked = true;
//                // System.out.println("Marking " + transformationDummy.id);
//
//                if (expandGroupNodes && (transformation instanceof TransformationGroup)) {
//                    TransformationGroup transformationGroup = (TransformationGroup) transformation;
//                    markGroupNodes(context, transformationGroup);
//                }
//            }
//        }
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Mark reverse dependencies (phase 4).
//     * 
//     * @param transformationDummy
//     *            the transformation dummy
//     */
//    private static void markReverseDependencies(FeatureDummy transformationDummy) {
//        if (transformationDummy != null && !transformationDummy.marked) {
//            transformationDummy.marked = true;
//            // System.out.println("Marking " + transformationDummy.id);
//            for (FeatureDummy otherTransformationDummy : transformationDummy.reverseDependencies) {
//                markReverseDependencies(otherTransformationDummy);
//            }
//        }
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Mark reverse dependencies (phase 4).
//     * 
//     * @param graph
//     *            the graph
//     */
//    public static void markReverseDependencies(KielerCompilerContext context) {
//        List<FeatureDummy> startNodes = new ArrayList<FeatureDummy>();
//        for (FeatureDummy transformationDummy : context.getGraph()) {
//            if (transformationDummy.marked) {
//                transformationDummy.marked = false; // Reset recursion stop indicator before calling
//                // recursive function
//                startNodes.add(transformationDummy);
//            }
//        }
//
//        // Start recursion from the start nodes
//        for (FeatureDummy transformationDummy : startNodes) {
//            markReverseDependencies(transformationDummy);
//        }
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Mark parent group.
//     * 
//     * @param transformationDummy
//     *            the transformation dummy
//     */
//    private static void markParentGroup(FeatureDummy transformationDummy) {
//        for (FeatureDummy parent : transformationDummy.parent) {
//            if (!parent.marked && parent.isGroup()) {
//                parent.marked = true;
//                markParentGroup(parent);
//            }
//        }
//    }
//
//    /**
//     * Mark reverse dependencies (phase 4a).
//     * 
//     * @param graph
//     *            the graph
//     */
//    public static void markParentGroups(KielerCompilerContext context) {
//        for (FeatureDummy transformationDummy : context.getGraph()) {
//            if (transformationDummy.marked) {
//                markParentGroup(transformationDummy);
//            }
//        }
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Eliminated unmarked nodes (phase 5).
//     * 
//     * @param graph
//     *            the graph
//     */
//    public static void eliminatedUnmarkedNodes(KielerCompilerContext context) {
//        boolean found = true;
//        FeatureDummy toBeDeleted = null;
//        while (found) {
//            found = false;
//            for (FeatureDummy transformationDummy : context.getGraph()) {
//                if (!transformationDummy.marked) {
//                    toBeDeleted = transformationDummy;
//                    // System.out.println("REMOVE " + transformationDummy.id);
//                    found = true;
//                    break;
//                }
//            }
//            if (found) {
//                context.getGraph().remove(toBeDeleted);
//                for (FeatureDummy transformationDummy : context.getGraph()) {
//                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
//                        // System.out.println("REMOVE " + toBeDeleted.id
//                        // + " from reverse-dependencies of " + transformationDummy.id);
//                        transformationDummy.reverseDependencies.remove(toBeDeleted);
//                    }
//                    if (transformationDummy.dependencies.contains(toBeDeleted)) {
//                        // System.out.println("REMOVE " + toBeDeleted.id + " from dependencies of "
//                        // + transformationDummy.id);
//                        transformationDummy.dependencies.remove(toBeDeleted);
//                    }
//                }
//            }
//        }
//    }

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
    private static List<FeatureDummy> getTransformationDummyWithNoDependencies(
            KielerCompilerContext context) {
        List<FeatureDummy> returnList = new ArrayList<FeatureDummy>();
        for (FeatureDummy transformationDummy : context.getGraph()) {
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
    private static int visit(FeatureDummy transformationDummy, int order) {
        if (transformationDummy.order == -1) {
            // This transformationDummy has not been seen yet
            transformationDummy.order = -2;
            int tmpOrder = order;
            for (FeatureDummy nextTransformationDummy : transformationDummy.reverseDependencies) {
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
        List<FeatureDummy> initialTransformationDummys =
                getTransformationDummyWithNoDependencies(context);
        int tmpOrder = 0;
        for (FeatureDummy initialTransformationDummy : initialTransformationDummys) {
            tmpOrder = visit(initialTransformationDummy, tmpOrder);
        }

        // Now insert into return list by order
        List<FeatureDummy> graph = context.getGraph();
        String[] returnArray = new String[graph.size()];
        for (FeatureDummy transformationDummy : graph) {
            returnArray[transformationDummy.order - 1] = transformationDummy.id;
        }
        context.setCompilationTransformationIds(Arrays.asList(returnArray));
        return;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

//    /**
//     * Expand groups.
//     * 
//     * @param transformationIds
//     *            the transformation i ds
//     * @return the list
//     */
//    private static List<String> expandGroups(List<String> transformationIds,
//            List<String> disabledTransformationIds, List<String> priorizedTransformationIds) {
//        List<String> returnList =
//                expandGroupsHelper(transformationIds, disabledTransformationIds,
//                        priorizedTransformationIds);
//        while (returnList.size() != transformationIds.size()) {
//            // find fixed point
//            transformationIds = returnList;
//            returnList =
//                    expandGroupsHelper(transformationIds, disabledTransformationIds,
//                            priorizedTransformationIds);
//        }
//        return returnList;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Expand groups helper.
//     * 
//     * @param transformationIds
//     *            the transformation i ds
//     * @return the list
//     */
//    private static List<String> expandGroupsHelper(List<String> transformationIds,
//            List<String> disabledTransformationIds, List<String> priorizedTransformationIds) {
//        List<String> returnList = new ArrayList<String>();
//        for (String transformationId : transformationIds) {
//            Transformation transformation = getTransformation(transformationId);
//            if (transformation != null) {
//                if (transformation instanceof TransformationGroup) {
//                    TransformationGroup transformationGroup = (TransformationGroup) transformation;
//                    if (!transformationGroup.isAlternatives()) {
//                        // Add/expand all NON-alternative group members
//                        // TODO: check if produces dependencies is right!
//                        for (String otherTransformationId : transformationGroup
//                                .getProducesFeatureIds()) {
//                            returnList.add(otherTransformationId);
//                        }
//                    } else {
//                        // Add/expand ONE alternative group members (if no other already exists)
//                        boolean exists = false;
//                        // TODO: check if produces dependencies is right!
//                        for (String otherTransformationId : transformationGroup
//                                .getProducesFeatureIds()) {
//                            for (String returnListItem : transformationIds) {
//                                if (returnListItem.equals(otherTransformationId)) {
//                                    exists = true;
//                                    break;
//                                }
//                            }
//                        }
//                        if (!exists) {
//                            // Add default here because no alternative of this group is yet included
//                            // take the first alternative group member that is not disabled! //TODO:
//                            List<String> allPrioDependencies = transformationIds;
//                            // TODO: check if produces dependencies is right!
//                            String defaultTransformation =
//                                    transformationGroup.getSelectedProducesDependency(
//                                            transformationIds, disabledTransformationIds,
//                                            priorizedTransformationIds);
//                            returnList.add(defaultTransformation);
//                        }
//                    }
//                } else {
//                    returnList.add(transformationId);
//                }
//            }
//        }
//        return returnList;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Eliminate group ids (phase 7).
//     * 
//     * @param context
//     *            the context
//     * @return the list
//     */
//    private static void eliminateGroupIds(KielerCompilerContext context, boolean allGroups,
//            List<String> disabledTransformationIds) {
//        List<String> returnList = new ArrayList<String>();
//        for (String transformationId : context.getCompilationTransformationIds()) {
//            Transformation transformation = getTransformation(transformationId);
//            if (transformation != null) {
//                if (!(transformation instanceof TransformationGroup)) {
//                    returnList.add(transformationId);
//                } else {
//                    TransformationGroup group = (TransformationGroup) transformation;
//                    if (!allGroups) {
//                        // if we do NOT want to eliminate ALL groups, then do NOT delete
//                        // 1. alternative groups
//                        // 2. non-alternative groups where ALL members are marked
//                        if (group.isAlternatives()) {
//                            returnList.add(transformationId);
//                        } else {
//                            boolean allMarked = true;
//                            // TODO: check if produces dependencies is right!
//                            List<String> dependencyIds =
//                                    expandGroups(group.getProducesFeatureIds(),
//                                            disabledTransformationIds,
//                                            context.getPriorizedTransformationsIds());
//                            for (String dependencyId : dependencyIds) {
//                                boolean found = false;
//                                for (String searchTransformationId : context
//                                        .getCompilationTransformationIds()) {
//                                    if (searchTransformationId.equals(dependencyId)) {
//                                        found = true;
//                                        break;
//                                    }
//                                }
//                                if (!found) {
//                                    allMarked = false;
//                                    break;
//                                }
//                            }
//                            if (allMarked) {
//                                returnList.add(transformationId);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        context.setCompilationTransformationIds(returnList);
//        return;
//    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

//    /**
//     * Calculate pre requirements.
//     * 
//     * @param selectedAndDisabledTransformationIds
//     *            the enabled and disabled transformation i ds
//     * @param noGroups
//     *            if false then mark groups, i.e., boolean mark alternative groups if ONE of the
//     *            alternatives is selected and mark non-alternatives groups if ALL are selected
//     * 
//     * @return the list
//     */
//    public static List<String> calculatePreRequirements(
//            String selectedAndDisabledTransformationIds, boolean noGroups) {
//        KielerCompilerContext context =
//                new KielerCompilerContext(selectedAndDisabledTransformationIds);
//        return context.getCompilationTransformationIds();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Calculate pre requirements.
//     * 
//     * @param selectedTransformationIds
//     *            the transformation i ds
//     * @param disabledTransformationIds
//     *            the excluded transformation i ds
//     * @param noGroups
//     *            if false then mark groups, i.e., boolean mark alternative groups if ONE of the
//     *            alternatives is selected and mark non-alternatives groups if ALL are selected
//     * @return the list
//     */
//    public static List<String> calculatePreRequirements(List<String> selectedTransformationIds,
//            final List<String> disabledTransformationIds, boolean noGroups) {
//        KielerCompilerContext context =
//                new KielerCompilerContext(selectedTransformationIds, disabledTransformationIds);
//        context.setNoGroups(noGroups);
//        calculatePreRequirements(context);
//        return context.getCompilationTransformationIds();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Calculate pre requirements for a given context.
//     * 
//     */
//    private static void calculatePreRequirements(KielerCompilerContext context) {
//        // 1. build graph (with initially requested transformation Ids as a tie
//        // breaker for alternative groups)
//        context.buildGraph(context.getSelectedTransformationIds());
//
//        // 2. eliminate unused alternative paths
//        cleanupImpossibleAlternatives(context);
//
//        // 3. mark nodes, including groups
//        markNodes(context, context.getSelectedTransformationIds(), true);
//
//        // 4. mark reverse dependencies
//        markReverseDependencies(context);
//
//        // 5. eliminate unmarked nodes
//        eliminatedUnmarkedNodes(context);
//
//        // 5b remove excluded transformations
//        removeFromGraph(context, context.getDisabledTransformationIds());
//
//        // 6. topological sort
//        topologicalSort(context);
//
//        // 7. final cleanup, eliminate any groups
//        eliminateGroupIds(context, context.isNoGroups(), context.getDisabledTransformationIds());
//        return;
//    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

//    /**
//     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
//     * transformations. Specify desired transformations or transformation groups with comma
//     * separated Ids. Disabled transformation have a leading "!" before their Id. Switching off
//     * calculation of prerequirements is not suggested. If prerequirements is switched off no
//     * dependencies are considered and the transformations will be applied straight forward in the
//     * order defined by the transformationIds list. Inplace tells whether the compilation will be
//     * done on a copy of the input EObject or on the original EObject.
//     * 
//     * @param selectedAndDisabledTransformationIds
//     *            the enabled and disabled transformation i ds
//     * @param eObject
//     *            the e object
//     * @param prerequirements
//     *            the prerequirements
//     * @return the object
//     */
//    public static CompilationResult compile(final String selectedAndDisabledTransformationIds,
//            final EObject eObject, final boolean prerequirements, final boolean inplace) {
//        KielerCompilerContext context =
//                new KielerCompilerContext(selectedAndDisabledTransformationIds, eObject);
//        context.setAutoSelect(prerequirements);
//        context.setInplace(inplace);
//        compile(context);
//        return context.getCompilationResult();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
//     * transformations. Specify desired transformations or transformation groups with comma
//     * separated Ids. Disabled transformation have a leading "!" before their Id. Switching off
//     * calculation of prerequirements is not suggested. If prerequirements is switched off no
//     * dependencies are considered and the transformations will be applied straight forward in the
//     * order defined by the transformationIds list. Inplace tells whether the compilation will be
//     * done on a copy of the input EObject or on the original EObject.
//     * 
//     * @param selectedAndDisabledTransformationIds
//     *            the enabled and disabled transformation i ds
//     * @param eObject
//     *            the e object
//     * @param prerequirements
//     *            the prerequirements
//     * @return the object
//     */
//    public static CompilationResult compile(List<String> selectedTransformationIds,
//            final List<String> disabledTransformationIds, final EObject eObject,
//            final boolean prerequirements, final boolean inplace) {
//        KielerCompilerContext context =
//                new KielerCompilerContext(selectedTransformationIds, disabledTransformationIds,
//                        eObject);
//        context.setAutoSelect(prerequirements);
//        context.setInplace(inplace);
//        compile(context);
//        return context.getCompilationResult();
//    }
//
    // -------------------------------------------------------------------------

    /**
     * Advanced internally used KIELER Compiler compile method on a given context.
     * 
     * @param context
     *            the context
     * @return the compilation result
     */
    public static CompilationResult compile(KielerCompilerContext context) {
        long start = System.currentTimeMillis();

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
            EObject copiedObject = EcoreUtil.copy(transformationEObject);
            // replace (first) intermediate object
            context.getCompilationResult().clear(copiedObject);
            // make the new copy the transformedObject
            transformationEObject = copiedObject;
        }

        // 1. build graph (with initially requested transformation Ids as a tie
        // breaker for alternative groups)
        context.buildGraph(context.getSelectedTransformationIds());

        // 2. eliminate unused alternative paths
        cleanupImpossibleAlternatives(context);

        // 3. mark nodes, including groups
        markNodes(context, context.getSelectedTransformationIds(), true);

        if (context.isAutoSelect()) {
            // 4. mark reverse dependencies
            markReverseDependencies(context);
        }

        // 4b. mark parent groups
        markParentGroups(context);

        // 5. eliminate unmarked nodes
        eliminatedUnmarkedNodes(context);

        // 5b remove excluded transformations
        removeFromGraph(context, context.getDisabledTransformationIds());

        // 6. topological sort
        topologicalSort(context);

        // 7. final cleanup, eliminate any groups
        eliminateGroupIds(context, true, context.getDisabledTransformationIds());

        List<String> compilationTransformationIds = context.getCompilationTransformationIds();

        // The progress monitor is optional and may be null!
        IProgressMonitor monitor = context.getProgressMonitor();

        int doneWork = 0;
        int totalWork = compilationTransformationIds.size();
        if (monitor != null) {
            monitor.beginTask("Compiling, performing " + totalWork + "transformations.",
                    totalWork * 100);
        }

        // This will be the current instance of the transformed model, initially it is the
        // transformationEObject from the context
        EObject transformedObject = transformationEObject;

        for (String compilationTransformationId : compilationTransformationIds) {
            Transformation transformation = getTransformation(compilationTransformationId);

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
            Object object = context.getCompilationResult().getEObject();
            if (object != null) {
                transformedObject = (EObject) object;
            }
            if (!(object instanceof EObject)) {
                // In this case we CANNOT do any further transformation calls
                // which require the return value of doTransform to be an EObject
                break;
            }

        }

        if (monitor != null) {
            monitor.done();
        }
        long end = System.currentTimeMillis();
        String seconds = (((float) (end - start)) / 1000) + "";
        System.out.println("KIELER Compiler compiled in " + seconds + " seconds.");

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
            String compilationTransformationId = transformation.getId();

            // The progress monitor is optional and may be null!
            IProgressMonitor monitor = context.getProgressMonitor();

            if (monitor != null) {
                monitor.setTaskName("Compiling, performing transformation " + doneWork + "/"
                        + totalWork + ": '" + transformation.getName() + "'");
            }

            // If the requested TransformationId
            if (transformation.getId().equals(compilationTransformationId)) {
                // If this is an individual

                // Class<?> parameterType = transformedObject.getClass();
                Class<?> handledParameterType = transformation.getParameterType();
                if (handledParameterType != null) {
                    KiCoPlugin.logger
                            .info("PERFORM TRANSFORMATION: " + compilationTransformationId);
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

        long start = 0;
        long end = 0;
        String transformationId = "unknown";
        Object object = null;
        try {
            transformationId = transformation.getId();
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

            start = System.currentTimeMillis();
            object = transformation.transform(transformedObject, context);
            end = System.currentTimeMillis();
        } catch (Exception exception) {
            context.getCompilationResult().addPostponedError(
                    new KielerCompilerException(transformationId, exception));
        }

        if (object != null) {
            // If this is the FIRST successful transformation AND we are NOT in
            // verbose mode
            // then clear all possibly previous errors
            if (context.getCompilationResult().getTransformationIntermediateResults().size() <= 1
                    && !context.isVerboseMode()) {
                context.getCompilationResult().resetPostponedErrors();
            }

            String compilationTransformationId = transformation.getId();
            IntermediateResult intermediateResult =
                    context.getCompilationResult().addTransformationIntermediateResult(
                            compilationTransformationId);

            // Add to compilation result
            intermediateResult.setResult(object);

            // Add performance result
            intermediateResult.setDuration(end - start);

            if (!(object instanceof EObject)) {
                // in this case we CANNOT do any further transformation calls
                // which require the return value of doTransform to be an EObject
                context.getCompilationResult().setCurrentTransformationDone(true);
            }
        }
    }

    // -------------------------------------------------------------------------
}
