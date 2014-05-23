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

import org.eclipse.emf.ecore.EObject;
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

    /** The Constant DEBUG. */
    public static final boolean DEBUG = !System.getProperty("java.vm.info", "").contains("sharing");

    /** The cached map id to transformations. */
    private static HashMap<String, Transformation> id2transformations = null;

    /** The cached list of transformations. */
    private static ArrayList<Transformation> transformations = null;

    /** The cached transformations to graph elements. */
    private static HashMap<Transformation, TransformationDummy> transformation2graph =
            new HashMap<Transformation, TransformationDummy>();;

    // -------------------------------------------------------------------------

    /**
     * Builds the graph adding only defaults for alternatives iff not prioritized.
     * 
     * @param prioritizedTransformationIDs
     *            the prioritized transformation i ds
     * @return the list
     */
    public static List<TransformationDummy> buildGraph(List<String> prioritizedTransformationIDs) {
        return buildGraph(prioritizedTransformationIDs, true);
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the full graph with all alternatives.
     * 
     * @return the list
     */
    public static List<TransformationDummy> buildGraph() {
        return buildGraph(new ArrayList<String>(), false);
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the graph with filtering optional transformation IDs of alternative groups.
     * 
     * @param prioritizedTransformationIDs
     *            the prioritized transformation i ds
     * @param preselectAlternatives
     *            the preselect alternatives
     * @return the list
     */
    public static List<TransformationDummy> buildGraph(List<String> prioritizedTransformationIDs,
            boolean preselectAlternatives) {
        ArrayList<TransformationDummy> returnList = new ArrayList<TransformationDummy>();

        transformation2graph.clear();

        updateMapping(false);

        // Build all nodes first
        for (Transformation transformation : transformations) {
            TransformationDummy transformationDummy = new TransformationDummy(transformation);

            returnList.add(transformationDummy);
            transformationDummy.parent = returnList;
            transformation2graph.put(transformation, transformationDummy);
            // System.out.println("Adding Dummy node for " + transformation.getId() + ", "
            // + transformation.toString());
        }

        // Calculate dependencies
        for (Transformation transformation : transformations) {
            TransformationDummy transformationDummy = transformation2graph.get(transformation);

            List<String> dependencies = transformation.getDependencies();
            if (transformationDummy.isAlternative()) {
                dependencies = new ArrayList<String>();
                if (preselectAlternatives) {
                    // If this is an alternative group, then ONLY add the SELECTED alternative
                    // according to the prioritizedTransformationIDs (input)
                    String selectedAlternative =
                            ((TransformationGroup) transformationDummy.transformation)
                                    .getSelectedDependency(prioritizedTransformationIDs);
                    dependencies.add(selectedAlternative);
                } else {
                    List<String> allAlternative =
                            ((TransformationGroup) transformationDummy.transformation)
                                    .getDependencies();
                    for (String alternative : allAlternative) {
                        dependencies.add(alternative);
                    }
                }
            }

            for (String dependencyId : dependencies) {
                Transformation otherTransformationOrGroup = getTransformation(dependencyId);
                // System.out.println("Dependencies for " + transformation.getId());
                // System.out.println("  " + otherTransformationOrGroup.getId());
                TransformationDummy otherTransformationDummy =
                        transformation2graph.get(otherTransformationOrGroup);

                // Insert dependency in dummy
                transformationDummy.dependencies.add(otherTransformationDummy);
                // Insert reverse dependency in other dummy
                otherTransformationDummy.reverseDependencies.add(transformationDummy);

            }
        }
        return returnList;
    }

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
            List<TransformationDummy> graph) {
        for (TransformationDummy otherTransformationDummy : graph) {
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
            List<TransformationDummy> graph) {
        for (TransformationDummy otherTransformationDummy : graph) {
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
            List<TransformationDummy> graph) {
        for (TransformationDummy otherTransformationDummy : graph) {
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
     */
    public static void reduceGraph(List<TransformationDummy> graph, List<String> transformationIDs) {
        // not remove the selected but ALL UNselected
        boolean removeSelected = false;
        removeFromGraph(graph, transformationIDs, removeSelected);
    }

    // -------------------------------------------------------------------------

    /**
     * Removes all transformations selected as transformationIDs from the graph.
     * 
     * @param graph
     *            the graph
     */
    public static void removeFromGraph(List<TransformationDummy> graph,
            List<String> transformationIDs) {
        // remove ONLY the selected
        boolean removeSelected = false;
        removeFromGraph(graph, transformationIDs, removeSelected);
    }

    // -------------------------------------------------------------------------

    /**
     * Removes all transformations selected OR not-selected as transformationIDs from the graph.
     * 
     * @param graph
     *            the graph
     */
    public static void removeFromGraph(List<TransformationDummy> graph,
            List<String> transformationIDs, boolean removeSelected) {
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
    public static void cleanupImpossibleAlternatives(List<TransformationDummy> graph) {
        boolean found = true;
        TransformationDummy toBeDeleted = null;
        while (found) {
            found = false;
            for (TransformationDummy transformationDummy : graph) {
                boolean dependencyReferenced = isDependencyReferenced(transformationDummy, graph);
                boolean alternative = isAlternative(transformationDummy, graph);
                boolean groupReferenced = isGroupReferenced(transformationDummy, graph);

                if (alternative && !dependencyReferenced && !groupReferenced) {
                    if (transformationDummy.reverseDependencies.size() == 0) {
                        toBeDeleted = transformationDummy;
                        // System.out.println("REMOVE " + transformationDummy.id);
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                graph.remove(toBeDeleted);
                for (TransformationDummy transformationDummy : graph) {
                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
                        // System.out.println("REMOVE " + toBeDeleted.id + " from "
                        // + transformationDummy.id);
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
    private static void markGroupNodes(List<TransformationDummy> graph,
            TransformationGroup transformationGroup) {
        for (String groupTransformationID : transformationGroup.getDependencies()) {
            Transformation groupTransformation = getTransformation(groupTransformationID);
            TransformationDummy groupTransformationDummy =
                    transformation2graph.get(groupTransformation);
            groupTransformationDummy.marked = true;
            // System.out.println("Marking " + groupTransformationDummy.id);
            if (groupTransformation instanceof TransformationGroup) {
                // groupTransformation is a TransformationGroup itself, so close recursion here
                markGroupNodes(graph, (TransformationGroup) groupTransformation);
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
     */
    public static void markNodes(List<TransformationDummy> graph, List<String> transformationIDs,
            boolean expandGroupNodes) {
        for (String transformationID : transformationIDs) {
            Transformation transformation = getTransformation(transformationID);

            TransformationDummy transformationDummy = transformation2graph.get(transformation);
            transformationDummy.marked = true;
            // System.out.println("Marking " + transformationDummy.id);

            if (expandGroupNodes && (transformation instanceof TransformationGroup)) {
                TransformationGroup transformationGroup = (TransformationGroup) transformation;
                markGroupNodes(graph, transformationGroup);
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
    public static void markReverseDependencies(List<TransformationDummy> graph) {
        List<TransformationDummy> startNodes = new ArrayList<TransformationDummy>();
        for (TransformationDummy transformationDummy : graph) {
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
    public static void markParentGroups(List<TransformationDummy> graph) {
        for (TransformationDummy transformationDummy : graph) {
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
    public static void eliminatedUnmarkedNodes(List<TransformationDummy> graph) {
        boolean found = true;
        TransformationDummy toBeDeleted = null;
        while (found) {
            found = false;
            for (TransformationDummy transformationDummy : graph) {
                if (!transformationDummy.marked) {
                    toBeDeleted = transformationDummy;
                    // System.out.println("REMOVE " + transformationDummy.id);
                    found = true;
                    break;
                }
            }
            if (found) {
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

    private static List<TransformationDummy> getTransformationDummyWithNoDependencies(
            List<TransformationDummy> graph) {
        List<TransformationDummy> returnList = new ArrayList<TransformationDummy>();
        for (TransformationDummy transformationDummy : graph) {
            if (transformationDummy.dependencies.size() == 0) {
                returnList.add(transformationDummy);
            }
        }
        return returnList;
    }

    // ------------------------------------------

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

    private static List<String> topologicalSort(List<TransformationDummy> graph) {
        List<TransformationDummy> initialTransformationDummys =
                getTransformationDummyWithNoDependencies(graph);
        int tmpOrder = 0;
        for (TransformationDummy initialTransformationDummy : initialTransformationDummys) {
            tmpOrder = visit(initialTransformationDummy, tmpOrder);
        }

        // Now insert into return list by order
        String[] returnArray = new String[graph.size()];
        for (TransformationDummy transformationDummy : graph) {
            returnArray[transformationDummy.order - 1] = transformationDummy.id;
        }
        return Arrays.asList(returnArray);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Update mapping between transformation IDs and transformations.
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
    private static Transformation getTransformation(String transformationID) {
        updateMapping(false);
        Transformation transformation = id2transformations.get(transformationID);
        if (transformation == null) {
            throw new RuntimeException("Cannot find a transformation with the ID '"
                    + transformationID
                    + "'. Make sure that the transformation with this ID is registered and its"
                    + " declaring plugin is loaded. Make sure that the ID does exactly match"
                    + " (case sensitive). Maybe you forgot to separate multiple ID's by a"
                    + " comma.");
        }
        return transformation;
    }

    // -------------------------------------------------------------------------

    /**
     * Eliminate group ids (phase 7).
     * 
     * @param transformationIDs
     *            the transformation i ds
     * @return the list
     */
    private static List<String> eliminateGroupIds(List<String> transformationIDs) {
        List<String> returnList = new ArrayList<String>();
        for (String transformationID : transformationIDs) {
            Transformation transformation = getTransformation(transformationID);
            if (!(transformation instanceof TransformationGroup)) {
                returnList.add(transformationID);
            }
        }
        return returnList;
    }

    // -------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations or transformation groups with comma
     * separated IDs.
     * 
     * @param transformationIDs
     *            the transformation i ds
     * @param eObject
     *            the e object
     * @return the object
     */
    public static Object compile(final String transformationIDs, final EObject eObject) {
        return compile(transformationIDs, eObject, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations or transformation groups with comma
     * separated IDs.
     * 
     * @param transformationIDs
     *            the transformation i ds
     * @param eObject
     *            the e object
     * @return the object
     */
    public static Object compile(final String enabledAndDisabledTransformationIDs, final EObject eObject,
            final boolean prerequirements) {
        String trimmed = enabledAndDisabledTransformationIDs.replace(" ", "");
        if (trimmed.length() == 0) {
            return eObject;
        }
        String[] transformationIDArray = trimmed.split(",");
        if (transformationIDArray == null) {
            return null;
        }
        List<String> excludedTransformations = new ArrayList<String>();
        List<String> transformations = new ArrayList<String>();
        for (String transformation : Arrays.asList(transformationIDArray)) {
            if (transformation.startsWith("!")) {
                excludedTransformations.add(transformation.substring(1));
            } else {
                transformations.add(transformation);
            }
        }
        return compile(transformations, excludedTransformations, eObject, prerequirements);
    }

    // -------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations or transformation groups as a String List of
     * their IDs.
     * 
     * @param transformationID
     *            the transformation id
     * @param eObject
     *            the e object
     * @return the object
     */
    public static Object compile(final List<String> transformationIDs, final EObject eObject) {
        return compile(transformationIDs, new ArrayList<String>(), eObject, true);
    }

    // -------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations or transformation groups as a String List of
     * their IDs.
     * 
     * @param transformationIDs
     *            the transformation i ds
     * @param excludedTransformationIDs
     *            the excluded transformation i ds
     * @param eObject
     *            the e object
     * @return the e object
     */
    public static Object compile(final List<String> transformationIDs,
            final List<String> excludedTransformationIDs, final EObject eObject) {
        return compile(transformationIDs, excludedTransformationIDs, eObject, true);
    }

    // -------------------------------------------------------------------------
    
    /**
     * Advanced KIELER Compiler compile method. It can be called in order to call several
     * consecutive transformations. Specify desired transformations as a String List of IDs. Use
     * this with care! Note that if switching autoexpand off you cannot use transformation group IDs
     * any more. Also no dependencies will be considered. The transformations will be applied
     * straight forward in the order defined by the transformationIDs list.
     *
     * @param enabledAndDisabledTransformationIDs the enabled and disabled transformation i ds
     * @param eObject the e object
     * @param prerequirements the prerequirements
     * @return the e object
     */
    public static Object compile(final List<String> enabledAndDisabledTransformationIDs, final EObject eObject,
            final boolean prerequirements) {
        List<String> excludedTransformations = new ArrayList<String>();
        List<String> transformations = new ArrayList<String>();
        for (String transformation : enabledAndDisabledTransformationIDs) {
            if (transformation.startsWith("!")) {
                excludedTransformations.add(transformation.substring(1));
            } else {
                transformations.add(transformation);
            }
        }
        return compile(transformations, excludedTransformations, eObject, prerequirements);
    }

    // -------------------------------------------------------------------------
    
    /**
     * Calculate pre requirements.
     *
     * @param transformationIDs the transformation i ds
     * @return the list
     */
    public static List<String> calculatePreRequirements(List<String> enabledAndDisabledTransformationIDs, boolean noGroups) {
        List<String> excludedTransformations = new ArrayList<String>();
        List<String> transformations = new ArrayList<String>();
        for (String transformation : enabledAndDisabledTransformationIDs) {
            if (transformation.startsWith("!")) {
                excludedTransformations.add(transformation.substring(1));
            } else {
                transformations.add(transformation);
            }
        }
        return calculatePreRequirements(transformations, excludedTransformations, noGroups);
    }

    // -------------------------------------------------------------------------
    
    /**
     * Calculate pre requirements.
     *
     * @param transformationIDs the transformation i ds
     * @return the list
     */
    public static List<String> calculatePreRequirements(List<String> transformationIDs, final List<String> excludedTransformationIDs, boolean noGroups) {
        // Auto expansion will resolve dependencies and expand transformation groups
        List<String> processedTransformationIDs = transformationIDs;        
        
        // 1. build graph (with initially requested transformation IDs as a tie
        // braker for alternative groups)
        List<TransformationDummy> graph = buildGraph(transformationIDs);

        // 2. eliminate unused alternative paths
        cleanupImpossibleAlternatives(graph);

        // 3. mark nodes, including groups
        markNodes(graph, processedTransformationIDs, true);

        // 4. mark reverse dependencies
        markReverseDependencies(graph);

        // 5. eliminate unmarked nodes
        eliminatedUnmarkedNodes(graph);

        // 5b remove excluded transformations
        if (excludedTransformationIDs != null && excludedTransformationIDs.size() > 0) {
            removeFromGraph(graph, excludedTransformationIDs);
        }

        // 6. topological sort
        processedTransformationIDs = topologicalSort(graph);

        if (noGroups) {
            // 7. final cleanup, eliminate any groups
            processedTransformationIDs = eliminateGroupIds(processedTransformationIDs);
        }
        
        return processedTransformationIDs;
    }

    // -------------------------------------------------------------------------

    /**
     * Advanced KIELER Compiler compile method. It can be called in order to call several
     * consecutive transformations. Specify desired transformations as a String List of IDs. Use
     * this with care! Note that if switching autoexpand off you cannot use transformation group IDs
     * any more. Also no dependencies will be considered. The transformations will be applied
     * straight forward in the order defined by the transformationIDs list. Inplace is false by
     * default meaning the compilation will be done on a copy of the input EObject.
     *
     * @param transformationIDs the transformation i ds
     * @param excludedTransformationIDs the excluded transformation i ds
     * @param eObject the e object
     * @param prerequirements the prerequirements
     * @return the e object
     */
    public static Object compile(final List<String> transformationIDs,
            final List<String> excludedTransformationIDs, final EObject eObject,
            final boolean prerequirements) {
        boolean inplace = false;
        return  compile(transformationIDs, excludedTransformationIDs, eObject,
                prerequirements, inplace);
    }
    // -------------------------------------------------------------------------
    
    /**
     * Advanced KIELER Compiler compile method. It can be called in order to call several
     * consecutive transformations. Specify desired transformations as a String List of IDs. Use
     * this with care! Note that if switching autoexpand off you cannot use transformation group IDs
     * any more. Also no dependencies will be considered. The transformations will be applied
     * straight forward in the order defined by the transformationIDs list. Inplace tells whether
     * the compilation will be done on a copy of the input EObject or on the original EObject.
     * 
     * @param transformationID
     *            the transformation id
     * @param eObject
     *            the e object
     * @return the object
     */
    public static Object compile(final List<String> transformationIDs,
            final List<String> excludedTransformationIDs, final EObject eObject,
            final boolean prerequirements, final boolean inplace) {
        updateMapping(DEBUG);
        
        EObject transformedObject = eObject;
        // If not inplace then produce a copy of the input EObject
        if (!inplace) {
            transformedObject = EcoreUtil.copy(eObject);
        }

        // Auto expansion will resolve dependencies and expand transformation groups
        List<String> processedTransformationIDs = transformationIDs;

        // 1. build graph (with initially requested transformation IDs as a tie
        // braker for alternative groups)
        List<TransformationDummy> graph = buildGraph(transformationIDs);

        // 2. eliminate unused alternative paths
        cleanupImpossibleAlternatives(graph);

        // 3. mark nodes, including groups
        markNodes(graph, processedTransformationIDs, true);

        if (prerequirements) {
            // 4. mark reverse dependencies
            markReverseDependencies(graph);
        }

        // 4b. mark parent groups
        markParentGroups(graph);
        
        // 5. eliminate unmarked nodes
        eliminatedUnmarkedNodes(graph);

        // 5b remove excluded transformations
        if (excludedTransformationIDs != null && excludedTransformationIDs.size() > 0) {
            removeFromGraph(graph, excludedTransformationIDs);
        }

        // 6. topological sort
        processedTransformationIDs = topologicalSort(graph);

        // 7. final cleanup, eliminate any groups
        processedTransformationIDs = eliminateGroupIds(processedTransformationIDs);

        // System.out.println("=== ");
        for (String processedTransformationID : processedTransformationIDs) {
            Transformation transformation = getTransformation(processedTransformationID);

            if (transformation != null)
                // If the requested TransformationID
                if (transformation.getId().equals(processedTransformationID)) {
                    // If this is an individual
                    System.out.println("PERFORM TRANSFORMATION: " + processedTransformationID);
                    transformation.doTransform(transformedObject);
                    Object object = transformation.doTransform(transformedObject);
                    if (object instanceof EObject) {
                        transformedObject = (EObject) object;
                    }
                    else {
                        // in this case we CANNOT do any further transformation calls
                        // which require the return value of doTransform to be an EObject
                        return object;
                    }
                }
        }
        return transformedObject;
    }

    // -------------------------------------------------------------------------

}
