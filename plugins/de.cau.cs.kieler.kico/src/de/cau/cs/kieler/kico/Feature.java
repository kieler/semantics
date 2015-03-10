/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.HashSet;
import java.util.Set;

/**
 * An instance of this class represents a registered feature a transformation can declare to handle,
 * not handle or produce.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public abstract class Feature implements IFeature {

    // -------------------------------------------------------------------------

    /**
     * This method may be overridden to optionally supply a human readable name for this feature.
     * The default implementation will return the id in place of the name.
     * 
     * @return the name
     */
    public String getName() {
        return getId();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of alternative transformations that are able to transform this feature because
     * they declared to be able to handle it.
     * 
     * @return the alternative transformations
     */
    public Set<Transformation> getAlternativeTransformations() {
        Set<Transformation> set = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            if (transformation.getHandleFeature() == this) {
                set.add(transformation);
            }
        }
        return set;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Resolve a set of features and return a new set of resolved features, where all features are
     * of type Feature and never of type FeatureGroup any more.
     * 
     * @param features
     *            the features
     * @return the sets the
     */
    public static Set<Feature> resolveFeatures(Set<Feature> features) {
        Set<Feature> resolvedFeatures = new HashSet<Feature>();
        for (Feature feature : features) {
            resolveFeatures(resolvedFeatures, feature);
        }
        return resolvedFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Resolve features helper method.
     * 
     * @param resolvedFeatures
     *            the resolved features
     * @param feature
     *            the feature
     */
    private static void resolveFeatures(Set<Feature> resolvedFeatures, Feature feature) {
        if (feature instanceof FeatureGroup) {
            // If must be resolved, recursive call
            FeatureGroup featureGroup = (FeatureGroup) feature;
            for (Feature subFeature : featureGroup.getFeatures()) {
                resolveFeatures(resolvedFeatures, subFeature);
            }
        } else {
            // If is already resolved (because no FeatureGroup)
            resolvedFeatures.add(feature);
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

}
