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
package de.cau.cs.kieler.kico.features;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Sets;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.kico.internal.Transformation;

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

    /** The cached resolved features also with all intermediate feature groups. */
    private Set<Feature> cachedResolvedFeaturesAll = null;

    /** The cached features that cannot be handled by any transformation of this group. */
    private Set<Feature> cachedNotHandlesFeatures = null;

    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public Set<String> getNotHandlesFeatureIds() {
        return Sets.newHashSet();
    }

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
     * Gets the list of transformations that are able to expand the features of this feature group.
     * 
     * @return the alternative transformations
     */
    public Set<Transformation> getExpandingTransformations() {
        if (cachedExpandingTransformations != null) {
            return cachedExpandingTransformations;
        }
        cachedExpandingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            for (Feature feature : this.getResolvedFeatures()) {
                if (transformation.getExpandsFeature() == feature) {
                    cachedExpandingTransformations.add(transformation);
                }
            }
        }
        return cachedExpandingTransformations;
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
    public Set<Transformation> getNotHandlingTransformations(boolean ignoreInherited) {
        if (cachedNotHandlingTransformations != null) {
            if (ignoreInherited) {
                return cachedNoInheritedNotHandlingTransformations;
            } else {
                return cachedNotHandlingTransformations;
            }
        }
        cachedNoInheritedNotHandlingTransformations = new HashSet<Transformation>();
        cachedNotHandlingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            for (Feature feature : this.getResolvedFeatures()) {
                if (transformation.getNotHandlesFeatures(true).contains(feature)) {
                    cachedNoInheritedNotHandlingTransformations.add(transformation);
                }
                if (transformation.getNotHandlesFeatures(false).contains(feature)) {
                    cachedNotHandlingTransformations.add(transformation);
                }
            }
        }
        if (ignoreInherited) {
            return cachedNoInheritedNotHandlingTransformations;
        } else {
            return cachedNotHandlingTransformations;
        }
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

    /**
     * Gets the set of features. All items are fully resolved. Same as getResolvedFeatures but
     * includes also all intermediate FeatureGroups.
     * 
     * @return the features
     */
    public Set<Feature> getResolvedFeaturesAll() {
        if (cachedResolvedFeaturesAll != null) {
            return cachedResolvedFeaturesAll;
        }
        cachedResolvedFeaturesAll = Feature.resolveFeaturesAll(getFeatures());
        return cachedResolvedFeaturesAll;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the set of features that not a single transformation of features part of this group is
     * able to handle. This can be features or feature groups again. All transformation should
     * inherit these not-handles features.
     * 
     * @return the features
     */
    public Set<Feature> getNotHandlesFeatures() {
        if (cachedNotHandlesFeatures != null) {
            return cachedNotHandlesFeatures;
        }
        cachedNotHandlesFeatures = new HashSet<Feature>();
        for (String featureId : this.getNotHandlesFeatureIds()) {
            Feature feature = KielerCompiler.getFeature(featureId);
            if (feature == null) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "Feature '" + this.getId()
                        + "' references a feature '" + featureId + "' that cannot be found.", null);
            } else {
                cachedNotHandlesFeatures.add(feature);
            }
        }
        return cachedNotHandlesFeatures;
    }

    // -------------------------------------------------------------------------

}
