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

import org.eclipse.emf.ecore.EObject;

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

    /** The cached handling/alternative transformations. */
    protected Set<Transformation> cachedHandlingTransformations = null;

    /** The cached producing transformations. */
    protected Set<Transformation> cachedProducingTransformations = null;

    /** The cached not handling transformations. */
    protected Set<Transformation> cachedNotHandlingTransformations = null;

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
     * This default implementation will return false. Specific implementations should use the most
     * possible general parameter and calculate the return value based on whether the features is
     * contained.
     * 
     * @param model
     *            the model
     * @return true, if is s contained
     */
    public boolean isContained(EObject model) {
        return false;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that are able to handle this feature because they declared
     * to be able to handle it. For a single Feature (not a group) this means a set of alternative
     * transformations that can be used to transform away the feature.
     * 
     * @return the alternative transformations
     */
    public Set<Transformation> getHandlingTransformations() {
        if (cachedHandlingTransformations != null) {
            return cachedHandlingTransformations;
        }
        cachedHandlingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            if (transformation.getHandleFeature() == this) {
                cachedHandlingTransformations.add(transformation);
            }
        }
        return cachedHandlingTransformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that declare to produce this feature.
     * 
     * @return the producing transformations
     */
    public Set<Transformation> getProducingTransformations() {
        if (cachedProducingTransformations != null) {
            return cachedProducingTransformations;
        }
        cachedProducingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            if (transformation.getProducesFeatures() == this) {
                cachedProducingTransformations.add(transformation);
            }
        }
        return cachedProducingTransformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that declare not being able to handle this feature.
     * 
     * @return the not handling transformations
     */
    public Set<Transformation> getNotHandlingTransformations() {
        if (cachedNotHandlingTransformations != null) {
            return cachedNotHandlingTransformations;
        }
        cachedNotHandlingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            for (Feature transformationNotHandlingFeature : transformation.getNotHandlesFeatures()) {
                if (transformationNotHandlingFeature == this) {
                    cachedNotHandlingTransformations.add(transformation);
                }
            }
        }
        return cachedNotHandlingTransformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is alternative feature meaning that there are more than one transformation
     * tranforming this feature.
     * 
     * @return true, if is alternative
     */
    public boolean isAlternative() {
        // boolean noFeatureGroup = !(this instanceof FeatureGroup);
        // int handlingTransformations = 0;
        // if (this.getHandlingTransformations() != null) {
        // handlingTransformations = this.getHandlingTransformations().size();
        // }
        // if (noFeatureGroup && handlingTransformations > 1) {
        // return true;
        // }
        // return false;
        return ((!(this instanceof FeatureGroup)) && (this.getHandlingTransformations().size() > 1));
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
            resolveFeatures(resolvedFeatures, feature, false);
        }
        return resolvedFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Resolve a set of features and return a new set of resolved features, where all features are
     * of type Feature including intermediate FeatureGroups.
     * 
     * @param features
     *            the features
     * @return the sets the
     */
    public static Set<Feature> resolveFeaturesAll(Set<Feature> features) {
        Set<Feature> resolvedFeaturesAll = new HashSet<Feature>();
        for (Feature feature : features) {
            resolveFeatures(resolvedFeaturesAll, feature, true);
        }
        return resolvedFeaturesAll;
    }

    // -------------------------------------------------------------------------

    /**
     * Resolve features helper method. If all is set, also intermediate FeatureGroups are included
     * into to the resulting set.
     * 
     * @param resolvedFeatures
     *            the resolved features
     * @param feature
     *            the feature
     * @param all
     *            the all
     */
    private static void resolveFeatures(Set<Feature> resolvedFeatures, Feature feature, boolean all) {
        if (feature instanceof FeatureGroup) {
            // If must be resolved, recursive call
            FeatureGroup featureGroup = (FeatureGroup) feature;
            if (all) {
                resolvedFeatures.add(feature);
            }
            for (Feature subFeature : featureGroup.getFeatures()) {
                resolveFeatures(resolvedFeatures, subFeature, all);
            }
        } else {
            // If is already resolved (because no FeatureGroup)
            resolvedFeatures.add(feature);
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

}
