/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.internal.Transformation;

/**
 * An instance of this class represents a selection diagram for the KiCo.ui KLighD view. It is a
 * compilation of the following: The visible features, the KielerCompilerContext. The latter
 * includes the selection and the graph with auto selected features.
 * 
 * @author cmot
 * @kieler.design 2015-03-12 proposed
 * @kieler.rating 2015-03-12 proposed yellow
 * 
 */
public class KiCoSelectionDiagramModel {

    /** The visible features. */
    private Set<Feature> visibleFeatures = new HashSet<Feature>();

    /** The visible transformations. */
    private Set<Transformation> visibleTransformations = new HashSet<Transformation>();

    /** The compiler context including the selection and the graph. */
    private KielerCompilerContext context = null;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new ki co selection diagram model.
     */
    public KiCoSelectionDiagramModel(KielerCompilerContext context) {
        this.context = context;
    }

    // -------------------------------------------------------------------------

    /**
     * Constructs a list of visible features or transformations by copying the
     * features/transformations from the feature/transformation list that also appear in the
     * visibleFeatureId list.
     * 
     * @param features
     *            the features
     * @param visibleFeatureOrTransformationIds
     *            the visible feature ids
     */
    public void setVisibleFeatures(Set<Feature> features, Set<Transformation> transformations,
            List<String> visibleFeatureOrTransformationIds) {
        visibleFeatures.clear();
        for (Feature feature : features) {
            if (visibleFeatureOrTransformationIds.contains(feature.getId())) {
                visibleFeatures.add(feature);
            }
        }
        for (Transformation transformation : transformations) {
            if (visibleFeatureOrTransformationIds.contains(transformation.getId())) {
                visibleTransformations.add(transformation);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the visible features.
     * 
     * @return the visible features
     */
    public Set<Feature> getVisibleFeatures() {
        return visibleFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the visible transformations.
     * 
     * @return the visible transformations
     */
    public Set<Transformation> getVisibleTransformations() {
        return visibleTransformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the Kieler Compiler context.
     * 
     * @param context
     *            the new context
     */
    public void setContext(KielerCompilerContext context) {
        this.context = context;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the Kieler Compiler context including the selection and the graph.
     * 
     * @return the context
     */
    public KielerCompilerContext getContext() {
        return context;
    }

    // -------------------------------------------------------------------------

}
