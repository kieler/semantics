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
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.google.inject.Inject;

/**
 * This class represents a transformation dummy graph for fast processing transformation
 * dependencies.
 * 
 * @author cmot
 * @kieler.design 2015-03-11 proposed
 * @kieler.rating 2015-03-11 proposed yellow
 * 
 */
public class TransformationDummyGraph {

    /** The logger. */
    @Inject
    public static Logger logger;

    /** The transformation dummies. */
    private List<TransformationDummy> transformationDummies = null;

    /** The context used for this graph. */
    private KielerCompilerContext context;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new transformation dummy graph.
     */
    public TransformationDummyGraph(KielerCompilerContext context) {
        // Set the context. This is where this graph belongs to! We later need access to the
        // selection of the context to build the graph
        this.context = context;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation dummies. If the list does not exist yet, then compute it. Also
     * re-compute if forceUpdate is true. If the model or the user selection changed forceUpdate
     * should be true, otherwise it mostly should be false.
     * 
     * @return the transformation dummies
     */
    public List<TransformationDummy> getTransformationDummies(boolean forceUpdate) {
        if (transformationDummies == null || forceUpdate) {
            transformationDummies = new ArrayList<TransformationDummy>();
            // 1. build the graph considering the user selection
            buildGraph();
            // 2. calculate dependencies considering produces & nothandles relations
            calculateDependencies();
            // 3. sort the dummies, the order of the dummies is then the order in which the
            // transformations should be processed
            topologicalSort();
        }
        return transformationDummies;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // -- G R A P H B U I L D I N G --
    // -------------------------------------------------------------------------

    /**
     * Builds the graph consisting of all selected (feature) transformations. Note that there will
     * no dependencies yet that complete the graph.
     * 
     * @param context
     *            the context
     */
    private void buildGraph() {
        // Go thru selected features and retrieve the transformation handling it, preserving the
        // disabled+preferred transformations
        KielerCompilerSelection selection = context.getSelection();
        // Go thru all selected Ids
        for (String selectedId : selection.getSelectedFeatureAndTransformationIds()) {
            // A preferred, not disabled transformation handling a feature or a transformation
            Transformation transformation = null;
            // Test if this id is a transformation already
            if (selectedId.startsWith("T_")) {
                // If this is a transformation already, remove the T_ - marker
                String transformationId = selectedId.substring(2);
                transformation = KielerCompiler.getTransformation(transformationId);
            } else {
                // At this point we found a transformationId that is a transformation (possibly
                // handling a feature)
                // Now insert a new transformationDummy for this transformation, respecting all
                // dependencies
                transformation = getTransformationHandlingFeature(selectedId, selection);
                if (transformation != null) {
                    addTransformationToGraph(transformation);
                }
            }
        }

        // If auto selection is true, then add
        // 1. features, "selected" by occurrence in the model
        // 2. (recursive) features produced by transformations already selected
        // 2b. recursion stops if a selected feature is hit! (marking the end)
        // Note: nothandles is not considered here, it does not affect the selected transformations
        // but only the ORDER (-> dependencies)
        if (context.isAutoSelect()) {
            Set<Feature> modelFeatures = context.getTransformationObjectFeatures();
            for (Feature modelFeature : modelFeatures) {
                addFeatureToGraph(modelFeature);
            }
        }

    }

    // ------------------------------------------

    /**
     * Adds the transformation as a transformation dummy for this feature and proceeds with produced
     * features if the feature is not a selected one (which marks a STOP).
     * 
     * @param feature
     *            the feature
     * @param context
     *            the context
     */
    private void addFeatureToGraph(Feature feature) {
        Transformation transformation =
                getTransformationHandlingFeature(feature.getId(), context.getSelection());
        if (transformation != null) {
            addTransformationToGraph(transformation);
            // Do recursion iff not have hit a selected feature, we want to stop at selected
            // features!
            if (!context.getSelection().isFeatureSelected(feature.getId())) {
                // Follow the path of produce relations and add nodes
                for (Feature producedFeature : transformation.getProducesFeatures()) {
                    addFeatureToGraph(producedFeature);
                }
            }
        }
    }

    // ------------------------------------------

    /**
     * Gets the transformation that handles feature respecting the peferred and disabled
     * transformations.
     * 
     * @param featureId
     *            the feature id
     * @return the transformation handling feature
     */
    private static Transformation getTransformationHandlingFeature(String featureId,
            KielerCompilerSelection selection) {
        // A preferred, not disabled transformation handling a feature or a transformation
        Transformation transformation = null;
        // A non-preferred but not disabled transformation used if there is no preferred one
        // found
        Transformation backupTransformation = null;
        // If this is a feature, then find the first preferred transformation that is not
        // disabled
        Feature feature = KielerCompiler.getFeature(featureId);
        Set<Transformation> handlingTransformations = feature.getHandlingTransformations();
        // First search the preferred transformation
        for (Transformation handlingTransformation : handlingTransformations) {
            String handlingTransformationId = handlingTransformation.getId();
            if (!selection.isTransformationDisabled(handlingTransformationId)) {
                // the transformation is not disabled
                if (selection.isTransformationPreferred(handlingTransformationId)) {
                    // found a preferred transformation, that is not disabled
                    transformation = handlingTransformation;
                }
                // Remember in case we do not find a preferred transformation
                backupTransformation = handlingTransformation;
            }
        }
        // If transformationId is STILL null, this means no preferred transformation has
        // been found, use a NOT disabled transformation if there is one
        // (backupTransformationId). If this is also null, then there is no enabled
        // transformation that handles this selected (!) feature, raise an error
        if (transformation == null) {
            if (backupTransformation == null) {
                // Log an error here!
                logger.severe("Error building a graph: Feature '" + featureId
                        + "' is selected but no (enabled) transformation handling this feature"
                        + " is found. Building compile graph aborted. Solutions: 1. Do not select"
                        + " this feature or 2. do not disabled transformations hat can handle this"
                        + " feature or 3. register another transformation that can handle this "
                        + "feature.");
                return null;
            }
            transformation = backupTransformation;
        }
        return transformation;
    }

    // ------------------------------------------

    /**
     * Adds a TransformationDummy for the transformation to the graph.
     * 
     * @param transformationId
     *            the transformation id
     */
    private void addTransformationToGraph(Transformation transformation) {
        TransformationDummy transformationDummy = new TransformationDummy(this, transformation);
        this.transformationDummies.add(transformationDummy);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // -- D E P E N D E N C Y C A L C U L A T I O N --
    // -------------------------------------------------------------------------

    /**
     * Calculates dependencies for a graph of transformation dummies. The dependencies are required
     * to do a topological sort. It is required that the graph nodes of type TransformationDummy are
     * already present and calculated including all transformations that will be. <BR>
     * <BR>
     * This calculation is required because here also not handled relations are considered! Also the
     * modeler could have chosen a number of transformations only (autoSelect == false) so that
     * these transformations must be ordered. <BR>
     * <BR>
     * Hence it is not sufficient to just follow the path of produce relations.
     * 
     */
    private void calculateDependencies() {
        // for every transformation B
        // 1. add dependencies to transformations C of features produced by B (B->C)
        // 2. add dependencies from transformations A of features not handled by B (A->B)
        // also add reverse dependencies accordingly

        for (TransformationDummy dummyB : this.transformationDummies) {
            // Consider produce relationships
            for (Feature producedFeature : dummyB.transformation.getProducesFeatures()) {
                for (Transformation producedFeatureHandlingTransformation : producedFeature
                        .getHandlingTransformations()) {
                    TransformationDummy dummyC =
                            getTransformationDummy(producedFeatureHandlingTransformation);
                    if (dummyC != null) {
                        dummyB.dependencies.add(dummyC);
                        dummyC.reverseDependencies.add(dummyB);
                    }
                }
            }

            // Consider not handles relationships
            for (Feature notHandlesFeature : dummyB.transformation.getNotHandlesFeatures()) {
                for (Transformation notHandlesFeatureHandlingTransformation : notHandlesFeature
                        .getHandlingTransformations()) {
                    TransformationDummy dummyA =
                            getTransformationDummy(notHandlesFeatureHandlingTransformation);
                    if (dummyA != null) {
                        dummyA.dependencies.add(dummyB);
                        dummyB.reverseDependencies.add(dummyA);
                    }
                }
            }
        }

    }

    // ------------------------------------------

    /**
     * Returns a transformation dummy representation if one exists for the transformation.
     * 
     * @param transformation
     *            the transformation
     * @return the transformation dummy
     */
    private TransformationDummy getTransformationDummy(Transformation transformation) {
        for (TransformationDummy dummy : this.transformationDummies) {
            if (dummy.transformation == transformation) {
                return dummy;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------
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

    // ------------------------------------------

    /**
     * Topologically sorts the transformation dummy graph and its transformation dummies list.
     * Afterwards the transformation dummies are in a sorted order.
     */
    private void topologicalSort() {
        List<TransformationDummy> initialTransformationDummys =
                getTransformationDummyWithNoDependencies(transformationDummies);
        int tmpOrder = 0;
        for (TransformationDummy initialTransformationDummy : initialTransformationDummys) {
            tmpOrder = visit(initialTransformationDummy, tmpOrder);
        }

        // Now insert into new array by order converted to list at the end
        TransformationDummy[] returnArray = new TransformationDummy[transformationDummies.size()];
        for (TransformationDummy transformationDummy : transformationDummies) {
            returnArray[transformationDummy.order - 1] = transformationDummy;
        }
        transformationDummies = Arrays.asList(returnArray);
        return;
    }

    // ------------------------------------------

    /**
     * Gets the transformation dummy with no dependencies of the topological sort algorithm.
     * 
     * @param graph
     *            the graph
     * @return the transformation dummy with no dependencies
     */
    private List<TransformationDummy> getTransformationDummyWithNoDependencies(
            List<TransformationDummy> transformationDummies) {
        List<TransformationDummy> returnList = new ArrayList<TransformationDummy>();
        for (TransformationDummy transformationDummy : transformationDummies) {
            if (transformationDummy.dependencies.size() == 0) {
                returnList.add(transformationDummy);
            }
        }
        return returnList;
    }

    // ------------------------------------------

    /**
     * The visit method of the topological sort algorithm.
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

    // -------------------------------------------------------------------------

}
