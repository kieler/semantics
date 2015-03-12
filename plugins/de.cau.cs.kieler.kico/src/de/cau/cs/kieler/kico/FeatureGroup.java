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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * An instance of this class represents a registered feature group a transformation can declare to
 * not handle or produce. Feature groups collect a set of features and get expanded before
 * compilation takes place. The isAllContained() test method will return true only if all features
 * are contained. The isContained() test method will return true if at least one feature of this
 * group is contained. The getContainedFeatures will return a set of IDs which are contained from
 * this feature group.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public abstract class FeatureGroup extends Feature implements IFeatureGroup {

    /** The cached (direct) features where each item may be a Feature or FeatureGroup. */
    private Set<Feature> cachedFeatures = null;

    /** The cached resolved features where each item is Feature and not a FeatureGroup. */
    private Set<Feature> cachedResolvedFeatures = null;

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Tests for the existence of at least one feature of this feature group in an EObject model. It
     * returns true if at least one feature is contained in the model and false otherwise.
     * 
     * @return the list
     */
    public boolean isContained(EObject model) {
        for (Feature feature : getResolvedFeatures()) {
            if (feature.isContained(model)) {
                return true;
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Tests for the existence of all features of this feature group in an EObject model. It returns
     * true iff all features are contained in the model and false otherwise.
     * 
     * @return the list
     */
    public boolean isAllContained(EObject model) {
        for (Feature feature : getResolvedFeatures()) {
            if (!feature.isContained(model)) {
                return false;
            }
        }
        return true;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that are able to handle the features of this feature group.
     * 
     * @return the alternative transformations
     */
    public Set<Transformation> getHandlingTransformations() {
        if (cachedHandlingTransformations != null) {
            return cachedHandlingTransformations;
        }
        cachedHandlingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            for (Feature feature : this.getResolvedFeatures()) {
                if (transformation.getHandleFeature() == feature) {
                    cachedHandlingTransformations.add(transformation);
                }
            }
        }
        return cachedHandlingTransformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that declare to produce features of this feature group.
     * 
     * @return the producing transformations
     */
    public Set<Transformation> getProducingTransformations() {
        if (cachedProducingTransformations != null) {
            return cachedProducingTransformations;
        }
        cachedProducingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            for (Feature feature : this.getResolvedFeatures()) {
                if (transformation.getProducesFeatures() == feature) {
                    cachedProducingTransformations.add(transformation);
                }
            }
        }
        return cachedProducingTransformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that declare not being able to handle some features of this
     * feature group.
     * 
     * @return the not handling transformations
     */
    public Set<Transformation> getNotHandlingTransformations() {
        if (cachedNotHandlingTransformations != null) {
            return cachedNotHandlingTransformations;
        }
        cachedNotHandlingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            for (Feature feature : this.getResolvedFeatures()) {
                if (transformation.getNotHandlesFeatures() == feature) {
                    cachedNotHandlingTransformations.add(transformation);
                }
            }
        }
        return cachedNotHandlingTransformations;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the set of features. Each item in this set can be a Feature or FeatureGroup.
     * 
     * @return the features
     */
    public Set<Feature> getFeatures() {
        if (cachedFeatures != null) {
            return cachedFeatures;
        }
        cachedFeatures = new HashSet<Feature>();
        for (String featureId : this.getFeatureIds()) {
            Feature feature = KielerCompiler.getFeature(featureId);
            if (feature == null) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "Feature '" + this.getId()
                        + "' references a feature '" + featureId + "' that cannot be found.", null);
            } else {
                cachedFeatures.add(feature);
            }
        }
        return cachedFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the set of features. All items are fully resolved so each item can only be a Feature and
     * not a FeatureGroup.
     * 
     * @return the features
     */
    public Set<Feature> getResolvedFeatures() {
        if (cachedResolvedFeatures != null) {
            return cachedResolvedFeatures;
        }
        cachedResolvedFeatures = Feature.resolveFeatures(getFeatures());
        return cachedResolvedFeatures;
    }

    // -------------------------------------------------------------------------

}
