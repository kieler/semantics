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

    private static List<TransformationDummy> buildGraph(List<String> prioritizedTransformationIDs) {
        ArrayList<TransformationDummy> returnList = new ArrayList<TransformationDummy>();

        transformation2graph.clear();

        // Build all nodes first
        for (Transformation transformation : transformations) {
            TransformationDummy transformationDummy = new TransformationDummy(transformation);

            returnList.add(transformationDummy);
            transformation2graph.put(transformation, transformationDummy);
            System.out.println("Adding Dummy node for " + transformation.getId() + ", "
                    + transformation.toString());
        }

        // Calculate dependencies
        for (Transformation transformation : transformations) {
            TransformationDummy transformationDummy = transformation2graph.get(transformation);

            List<String> dependencies = transformation.getDependencies();
            if (transformationDummy.isAlternative()) {
                // If this is an alternative group, then ONLY add the SELECTED alternative
                // according to the prioritizedTransformationIDs (input)
                dependencies = new ArrayList<String>();
                String selectedAlternative =
                        ((TransformationGroup) transformationDummy.transformation)
                                .getSelectedDependency(prioritizedTransformationIDs);
                dependencies.add(selectedAlternative);
            }

            for (String dependencyId : dependencies) {
                Transformation otherTransformationOrGroup = getTransformation(dependencyId);
                System.out.println("Dependencies for " + transformation.getId());
                System.out.println("  " + otherTransformationOrGroup.getId());
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

    private static void cleanupUnusedAlternatives(List<TransformationDummy> graph) {
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
                        System.out.println("REMOVE " + transformationDummy.id);
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                graph.remove(toBeDeleted);
                for (TransformationDummy transformationDummy : graph) {
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

    private static void markNodes(List<TransformationDummy> graph, List<String> transformationIDs) {
        for (String transformationID : transformationIDs) {
            Transformation transformation = getTransformation(transformationID);
            TransformationDummy transformationDummy = transformation2graph.get(transformation);
            transformationDummy.marked = true;
            System.out.println("Marking " + transformationDummy.id);
        }
    }

    // -------------------------------------------------------------------------

    private static void markReverseDependencies(TransformationDummy transformationDummy) {
        if (transformationDummy != null && !transformationDummy.marked) {
            transformationDummy.marked = true;
            System.out.println("Marking " + transformationDummy.id);
            for (TransformationDummy otherTransformationDummy : transformationDummy.reverseDependencies) {
                markReverseDependencies(otherTransformationDummy);
            }
        }
    }

    private static void markReverseDependencies(List<TransformationDummy> graph) {
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

    private static void eliminatedUnmarkedNodes(List<TransformationDummy> graph) {
        boolean found = true;
        TransformationDummy toBeDeleted = null;
        while (found) {
            found = false;
            for (TransformationDummy transformationDummy : graph) {
                if (!transformationDummy.marked) {
                    toBeDeleted = transformationDummy;
                    System.out.println("REMOVE " + transformationDummy.id);
                    found = true;
                    break;
                }
            }
            if (found) {
                graph.remove(toBeDeleted);
                for (TransformationDummy transformationDummy : graph) {
                    if (transformationDummy.reverseDependencies.contains(toBeDeleted)) {
                        System.out.println("REMOVE " + toBeDeleted.id
                                + " from reverse-dependencies of " + transformationDummy.id);
                        transformationDummy.reverseDependencies.remove(toBeDeleted);
                    }
                    if (transformationDummy.dependencies.contains(toBeDeleted)) {
                        System.out.println("REMOVE " + toBeDeleted.id + " from dependencies of "
                                + transformationDummy.id);
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
     * Update mapping.
     */
    private static void updateMapping(boolean force) {
        if (id2transformations == null || force) {
            id2transformations = KiCoPlugin.getDefault().getRegisteredTransformations();
            transformations = new ArrayList<Transformation>();
            for (Entry<String, Transformation> localTransformation : id2transformations.entrySet()) {
                transformations.add(localTransformation.getValue());
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation for a transformationID.
     * 
     * @param transformationId
     *            the transformation id
     * @return the dependencies
     */
    private static Transformation getTransformation(String transformationID) {
        if (transformations == null) {
            updateMapping(false);
        }
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
     * Gets the transformation id.
     * 
     * @param transformation
     *            the transformation
     * @return the transformation id
     */
    private static String getTransformationID(Transformation transformation) {
        return transformation.getId();
    }

    // -------------------------------------------------------------------------

    /**
     * Eliminate group ids.
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
    public static EObject compile(final String transformationIDs, final EObject eObject) {
        String trimmed = transformationIDs.replace(" ", "");
        if (trimmed.length() == 0) {
            return eObject;
        }
        String[] transformationIDArray = trimmed.split(",");
        if (transformationIDArray == null) {
            return null;
        }
        return compile(Arrays.asList(transformationIDArray), eObject);
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
    public static EObject compile(final List<String> transformationIDs, final EObject eObject) {
        return compile(transformationIDs, eObject, true);
    }

    // -------------------------------------------------------------------------

    /**
     * Advanced KIELER Compiler compile method. It can be called in order to call several
     * consecutive transformations. Specify desired transformations as a String List of IDs. Use
     * this with care! Note that if switching autoexpand off you cannot use transformation group IDs
     * any more. Also no dependencies will be considered. The transformations will be applied
     * straight forward in the order defined by the transformationIDs list.
     * 
     * @param transformationID
     *            the transformation id
     * @param eObject
     *            the e object
     * @return the object
     */
    public static EObject compile(final List<String> transformationIDs, final EObject eObject,
            final boolean autoexpand) {
        updateMapping(DEBUG);

        EObject transformedObject = eObject;

        // Auto expansion will resolve dependencies and expand transformation groups
        List<String> processedTransformationIDs = transformationIDs;
        if (autoexpand) {

            // 1. build graph (with initially requested transformation IDs as a tie
            // braker for alternative groups)
            List<TransformationDummy> graph = buildGraph(transformationIDs);

            // 2. clean up unused alternative paths
            cleanupUnusedAlternatives(graph);

            // 3. mark nodes
            markNodes(graph, processedTransformationIDs);

            // 4. mark reverse dependencies
            markReverseDependencies(graph);

            // 5. eliminate unmarked nodes
            eliminatedUnmarkedNodes(graph);

            // 6. topological sort
            processedTransformationIDs = topologicalSort(graph);

            // 7. final cleanup, eliminate any groups
            processedTransformationIDs = eliminateGroupIds(processedTransformationIDs);
        }

        System.out.println("=== ");
        for (String processedTransformationID : processedTransformationIDs) {
            Transformation transformation = getTransformation(processedTransformationID);

            if (transformation != null)
                // If the requested TransformationID
                if (transformation.getId().equals(processedTransformationID)) {
                    // If this is an individual
                    System.out.println("PERFORM TRANSFORMATION: " + processedTransformationID);
                    transformedObject = transformation.doTransform(transformedObject);
                }
        }
        return transformedObject;
    }

    // -------------------------------------------------------------------------

}
