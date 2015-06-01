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
package de.cau.cs.kieler.kico.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.features.FeatureGroup;

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

    /** The transformation dummies. */
    private List<TransformationDummy> transformationDummies = null;

    /** The context used for this graph. */
    private KielerCompilerContext context;

    /** The set of auto selected features, based on the model and the selection. */
    private Set<Feature> autoSelectedFeatures = new HashSet<Feature>();

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
            recalculateGraphWithDependenciesAndAutoSelectFeatures();
        }
        return transformationDummies;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // -- G R A P H B U I L D I N G --
    // -------------------------------------------------------------------------

    /**
     * Builds the graph consisting of all selected (feature) transformations. Note that there will
     * no dependencies yet that complete the graph. Building the graph has the side effect that if
     * the auto select flag is true (KielerCompilerSelection) then the autoSelectedFeatures set will
     * also be computed. If the auto select flag is false then the autoSelectedFeatures set will be
     * the empty set.
     * 
     * @param context
     *            the context
     */
    private void buildGraph() {
        autoSelectedFeatures.clear();

        // Go thru selected features and retrieve the transformation handling it, preserving the
        // disabled+preferred transformations

        // Collect all selected (base) features here, for feature groups collect their fully
        // resolved features.
        Set<Feature> selectedFeatures = new HashSet<Feature>();

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
                if (transformation != null) {
                    addTransformationToGraph(transformation);
                    // Remember selection
                    selectedFeatures.add(transformation.getExpandsFeature());
                }
            } else {
                // We now know that selectedId is a feature. If it is a FeatureGroup we have
                // to select all included features!
                Feature feature = KielerCompiler.getFeature(selectedId);
                if (feature != null) {
                    if (feature instanceof FeatureGroup) {
                        FeatureGroup featureGroup = (FeatureGroup) feature;
                        Set<Feature> features = featureGroup.getResolvedFeatures();
                        for (Feature innerFeature : features) {
                            autoSelectedFeatures.add(innerFeature);
                            transformation =
                                    getTransformationHandlingFeature(innerFeature.getId(),
                                            selection, null);
                            if (transformation != null) {
                                addTransformationToGraph(transformation);
                            }
                            // Remember selection
                            selectedFeatures.add(innerFeature);
                        }
                    } else {
                        transformation =
                                getTransformationHandlingFeature(selectedId, selection, null);
                        Feature possiblyAlternativeFeature = KielerCompiler.getFeature(selectedId);
                        if (possiblyAlternativeFeature.isAlternative()) {
                            autoSelectedFeatures.add(possiblyAlternativeFeature);
                        }
                        if (transformation != null) {
                            addTransformationToGraph(transformation);
                        }
                        // Remember selection
                        selectedFeatures.add(feature);
                    }
                }
            }
        }

        // If advanced auto selection is true, then consider model features and dependencies as
        // follows
        // Consider features f1...fn present in the model
        // If there is a path over produced/not-handled-by transformations to selected
        // feature/transformation
        // .... o Add all features's transformations on this path to the graph
        // .... o Respect preferred/disable transformations on this path
        // Note: The destinction of nothandles is not considered here, it does not affect the
        // selected transformations
        // but only the ORDER (-> dependencies)
        if (context.isAdvancedSelect() && (!selection.noSelection())) {
            Set<Feature> featuresToAdd = new HashSet<Feature>();
            Set<Feature> modelFeatures = context.getTransformationObjectFeatures(false, false);
            for (Feature modelFeature : modelFeatures) {
                for (Feature selectedFeature : selectedFeatures) {
                    Set<Feature> moreFeaturesToAdd =
                            modelFeature.getProduceNotHandledByPathTo(selectedFeature, false);
                    featuresToAdd.addAll(moreFeaturesToAdd);
                }
            }

            // Now add all transformations for these features.
            // The specific transformations are filtered by their input types according to
            // the output type of possibly previous transformations.
            for (Feature featureToAdd : featuresToAdd) {
                // Add to autoselected feature set (also if this was initially selected by the
                // user!)
                autoSelectedFeatures.add(featureToAdd);
                Set<Feature> modelFeaturesAndFeaturesToAdd = new HashSet<Feature>();
                modelFeaturesAndFeaturesToAdd.addAll(modelFeatures);
                modelFeaturesAndFeaturesToAdd.addAll(featuresToAdd);
                addFeatureToGraph(featureToAdd, modelFeaturesAndFeaturesToAdd);
            }
        }

    }

    // ------------------------------------------

    /**
     * Adds the transformation as a transformation dummy for this feature respecting the preferred
     * and selected transformations if it is not already in the graph.
     * 
     * @param feature
     *            the feature
     * @param context
     *            the context
     */
    private void addFeatureToGraph(Feature feature, Set<Feature> featuresToAdd) {
        Transformation transformation =
                getTransformationHandlingFeature(feature.getId(), context.getSelection(),
                        featuresToAdd);
        if (transformation != null) {
            addTransformationToGraph(transformation);
        }
    }

    // ------------------------------------------

    /**
     * Gets the transformation that handles feature respecting 1. the selected, 2. the preferred and
     * disabled transformations. A disabled transformation is only returned, if no other
     * selected/preferred could be found. Disabled transformation still will be skipped when
     * performing transformation, this situation might prone errors (when input/outputs do not fit)
     * hence this throws a warning.
     * 
     * @param featureId
     *            the feature id
     * @param selection
     *            the selection
     * @param containedAndHandledFeatures
     *            the contained and handled features of the model or null if called not for compile
     *            chain
     * @return the transformation handling feature
     */
    public static Transformation getTransformationHandlingFeature(String featureId,
            KielerCompilerSelection selection, Set<Feature> containedAndHandledFeatures) {
        // A preferred, not disabled transformation handling a feature or a transformation
        Transformation transformation = null;
        // A non-preferred but not disabled transformation used if there is no preferred one
        // found
        Transformation backupTransformation = null;
        // Take the disabledFallback ONLY if no selected/backup can be found, this means a throwing
        // a warning because
        // run time errors when compiling an skipping a transformation might arise
        Transformation disabledFallbackTransformation = null;
        // If this is a feature, then find the first preferred transformation that is not
        // disabled
        Feature feature = KielerCompiler.getFeature(featureId);
        if (feature == null) {
            // This might be an incorrect specified feature ID, try to ignore it
            return null;
        }
        Set<Transformation> handlingTransformations = feature.getExpandingTransformations();
        // First search any selected transformation (if any)
        // First search the preferred transformation
        for (Transformation handlingTransformation : handlingTransformations) {
            String handlingTransformationId = handlingTransformation.getId();
            if (selection.isTransformationSelected(handlingTransformationId)) {
                // the transformation selected, so we take it :-)
                transformation = handlingTransformation;
            }
        }
        // Then search the preferred transformation (IF transformation is still NULL)
        if (transformation == null) {
            for (Transformation handlingTransformation : handlingTransformations) {
                String handlingTransformationId = handlingTransformation.getId();
                if (!selection.isTransformationDisabled(handlingTransformationId)) {
                    // the transformation is not disabled
                    if (selection.isTransformationPreferred(handlingTransformationId)) {
                        // found a preferred transformation, that is not disabled
                        transformation = handlingTransformation;
                    } else if (containedAndHandledFeatures == null
                            || handlingTransformation.getNotHandlesFeatures(false).isEmpty()
                            || !Sets.intersection(
                                    handlingTransformation.getNotHandlesFeatures(false),
                                    containedAndHandledFeatures).isEmpty()) {
                        // Remember in case we do not find a preferred transformation
                        backupTransformation = handlingTransformation;
                    }
                } else {
                    // Remember if there will be no transformation AND no backup!
                    disabledFallbackTransformation = handlingTransformation;
                }
            }
        }
        // If transformationId is STILL null, this means no preferred transformation has
        // been found, use a NOT disabled transformation if there is one
        // (backupTransformationId). If this is also null, then there is no enabled
        // transformation that handles this selected (!) feature, raise an error
        if (transformation == null) {
            if (backupTransformation == null) {
                if (disabledFallbackTransformation == null) {
                    // Log an error here!
                    KiCoUtil.logError(
                            KiCoPlugin.PLUGIN_ID,
                            "Error building a graph: Feature '"
                                    + featureId
                                    + "' is selected but no (enabled) transformation handling this feature"
                                    + " is found. Also no disabled transformation is found as a fallback. This is a serious error. Building compile graph aborted. Solutions: 1. Do not select"
                                    + " this feature or 2. do not disabled transformations hat can handle this"
                                    + " feature or 3. register another transformation that can handle this "
                                    + "feature.", null);
                    return null;
                } else {
                    // Log a warning here!
                    KiCoUtil.logWarning(
                            KiCoPlugin.PLUGIN_ID,
                            "Warning building a graph: Feature '"
                                    + featureId
                                    + "' is selected but no (enabled) transformation handling this feature"
                                    + " is found. Taking a disabled one instead as a fallback. Caution: Because"
                                    + "disabled transformations will be skipped, this might mean potential problem"
                                    + "during compilation. Solutions: 1. Do not select"
                                    + " this feature or 2. do not disabled transformations hat can handle this"
                                    + " feature or 3. register another transformation that can handle this "
                                    + "feature.", null);
                    return disabledFallbackTransformation;
                }
            }
            transformation = backupTransformation;
        }
        return transformation;
    }

    // ------------------------------------------

    /**
     * Adds a TransformationDummy for the transformation to the graph if it is not already in the
     * graph.
     * 
     * @param transformationId
     *            the transformation id
     */
    private void addTransformationToGraph(Transformation transformation) {
        for (TransformationDummy transformationDummy : transformationDummies) {
            if (transformationDummy.transformation == transformation) {
                // Already in the graph, leave
                return;
            }
        }
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
                        .getExpandingTransformations()) {
                    TransformationDummy dummyC =
                            getTransformationDummy(producedFeatureHandlingTransformation);
                    if (dummyC != null) {
                        dummyB.dependencies.add(dummyC);
                        dummyC.reverseDependencies.add(dummyB);
                    }
                }
            }

            // Consider not handles relationships
            for (Feature notHandlesFeature : dummyB.transformation.getNotHandlesFeatures(false)) {
                for (Transformation notHandlesFeatureHandlingTransformation : notHandlesFeature
                        .getExpandingTransformations()) {
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

    /**
     * Gets the auto selected features as computed based on the model features and the selection if
     * auto-select is true. If forceUpdate == true then the features will be recalculated otherwiese
     * a cached version is used if one exists. If no cached version exists the features are
     * calculated.
     * 
     * @return the autoSelectedFeatures
     */
    public Set<Feature> getAutoSelectedFeatures(boolean forceUpdate) {
        if (autoSelectedFeatures == null || forceUpdate) {
            recalculateGraphWithDependenciesAndAutoSelectFeatures();
        }
        return autoSelectedFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Recalculate graph with dependencies and auto select features.
     */
    private void recalculateGraphWithDependenciesAndAutoSelectFeatures() {
        transformationDummies = new ArrayList<TransformationDummy>();
        // 1. build the graph considering the user selection
        buildGraph();
        // 2. calculate dependencies considering produces & nothandles relations
        calculateDependencies();
        // 3. sort the dummies, the order of the dummies is then the order in which the
        // transformations should be processed
        topologicalSort();
    }

    // -------------------------------------------------------------------------

}
