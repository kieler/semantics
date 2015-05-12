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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.kico.internal.Transformation;

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
    protected Set<Transformation> cachedExpandingTransformations = null;

    /** The cached producing transformations. */
    protected Set<Transformation> cachedProducingTransformations = null;

    /** The cached not handling transformations. */
    protected Set<Transformation> cachedNotHandlingTransformations = null;

    /** The cached not handling transformations. */
    protected Set<Transformation> cachedNoInheritedNotHandlingTransformations = null;

    /** The cached parent feature groups this feature belongs to. */
    protected Set<FeatureGroup> cachedFeatureGroups = null;

    /** The cached parent feature groups this feature belongs to. */
    protected Set<FeatureGroup> cachedAllFeatureGroups = null;

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
     * contained. This method should not be called directly! Call doIsContained() instead!
     * 
     * @param model
     *            the model
     * @return true, if is s contained
     */
    public boolean isContained(EObject model) {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if this is a feature group.
     * 
     * @return true, if is group
     */
    public boolean isGroup() {
        return (this instanceof FeatureGroup);
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the FeatureGroup is this feature is a feature group, null otherwise.
     * 
     * @return true, if is group
     */
    public FeatureGroup asGroup() {
        if (!isGroup()) {
            return null;
        }
        return (FeatureGroup) this;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Returns true if at least one transformation expanding this feature is an production
     * transformation.
     * 
     * @return is feature is production feature
     */
    public boolean isProduction() {
        for (Transformation transformation : getExpandingTransformations()) {
            if (transformation.isProduction()) {
                return true;
            }
        }
        return false;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Call the most specific isContained method suitable for the parameter. The default will just
     * return false.
     * 
     * @param model
     *            the model
     * @return true, if successful
     */
    public final boolean doIsContained(EObject model) {
        Method transformMethod = KiCoUtil.getSpecificIsContainedMethodOrFallBack(this, getId());
        boolean result;
        try {
            if (transformMethod != null && transformMethod.getParameterTypes()[0].isInstance(model)) {
                result = (Boolean) transformMethod.invoke(this, model);
                return result;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Checks if there exists a path on produce-dependencies or nothandledby-dependencies from this
     * feature to a target Feature.
     * 
     * @param targetFeature
     *            the target feature
     * @param ignoreInherited
     *            the ignore inherited
     * @return true, if successful
     */
    public final boolean existsProduceNotHandledByPathTo(Feature targetFeature,
            boolean ignoreInherited) {
        return existsProduceNotHandledByPathTo(this, targetFeature, ignoreInherited);
    }

    /**
     * Returns a possibly existing path of features on produce-dependencies or
     * nothandledby-dependencies from this feature to a target Feature if one exists.
     * 
     * @param targetFeature
     *            the target feature
     * @param ignoreInherited
     *            the ignore inherited
     * @return the produce not handled by path to
     */
    public final Set<Feature> getProduceNotHandledByPathTo(Feature targetFeature,
            boolean ignoreInherited) {
        return getProduceNotHandledByPathTo(this, targetFeature, ignoreInherited);
    }

    private final Set<Feature> getProduceNotHandledByPathTo(Feature fromFeature,
            Feature targetFeature, boolean ignoreInherited) {
        HashSet<Feature> returnFeatures = new HashSet<Feature>();

        // Recursion ends here, we have found a path
        if (fromFeature == targetFeature) {
            // return collected features (as this path is valid!)
            returnFeatures.add(fromFeature);
            return returnFeatures;
        }

        // Check produced features
        for (Transformation transformation : fromFeature.getExpandingTransformations()) {
            for (Feature producedFeature : transformation.getProducesFeatures()) {
                // producedFeature == feature that is (possibly) produced by a transformation
                // handling the fromFeature, so fromFeature must be transformed before
                // producedFeature.
                Set<Feature> moreFeatures =
                        getProduceNotHandledByPathTo(producedFeature, targetFeature,
                                ignoreInherited);
                if (moreFeatures.size() > 0) {
                    // Return the collected features
                    returnFeatures.addAll(moreFeatures);
                    // Now that we know its a valid path, also add our fragment
                    returnFeatures.add(fromFeature);
                }
            }
        }

        // Check not handled by features
        for (Transformation transformation : fromFeature
                .getNotHandlingTransformations(ignoreInherited)) {
            Feature notHandledByFeature = transformation.getExpandsFeature();
            // notHandledByFeature == feature whose transformation cannot handle the fromFeature, so
            // fromFeature must be transformed before notHandledByFeature.
            Set<Feature> moreFeatures =
                    getProduceNotHandledByPathTo(notHandledByFeature, targetFeature,
                            ignoreInherited);
            if (moreFeatures.size() > 0) {
                // Return the collected features
                returnFeatures.addAll(moreFeatures);
                // Now that we know its a valid path, also add our fragment
                returnFeatures.add(fromFeature);
            }
        }

        // Return an empty set of features if this path is not valid, or the collected features, if
        // this path was valid!
        return returnFeatures;
    }

    /**
     * Checks if there exists a path on produce-dependencies or nothandledby-dependencies from this
     * feature to a target Feature. This is an internal helper method.
     * 
     * @param fromFeature
     *            the from feature
     * @param targetFeature
     *            the target feature
     * @return true, if successful
     */
    private final boolean existsProduceNotHandledByPathTo(Feature fromFeature,
            Feature targetFeature, boolean ignoreInherited) {
        // Recursion ends here, we have found a path
        if (fromFeature == targetFeature) {
            return true;
        }

        // Check produced features
        for (Transformation transformation : fromFeature.getExpandingTransformations()) {
            for (Feature producedFeature : transformation.getProducesFeatures()) {
                // producedFeature == feature that is (possibly) produced by a transformation
                // handling the fromFeature, so fromFeature must be transformed before
                // producedFeature.
                if (existsProduceNotHandledByPathTo(producedFeature, targetFeature, ignoreInherited)) {
                    return true;
                }
            }
        }

        // Check not handled by features
        for (Transformation transformation : fromFeature
                .getNotHandlingTransformations(ignoreInherited)) {
            Feature notHandledByFeature = transformation.getExpandsFeature();
            // notHandledByFeature == feature whose transformation cannot handle the fromFeature, so
            // fromFeature must be transformed before notHandledByFeature.
            if (existsProduceNotHandledByPathTo(notHandledByFeature, targetFeature, ignoreInherited)) {
                return true;
            }
        }

        // No path found, return false;
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that are able to handle this feature because they declared
     * to be able to handle it. For a single Feature (not a group) this means a set of alternative
     * transformations that can be used to transform away the feature.
     * 
     * @return the alternative transformations
     */
    public Set<Transformation> getExpandingTransformations() {
        if (cachedExpandingTransformations != null) {
            return cachedExpandingTransformations;
        }
        cachedExpandingTransformations = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            if (transformation.getExpandsFeature() == this) {
                cachedExpandingTransformations.add(transformation);
            }
        }
        return cachedExpandingTransformations;
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
            for (Feature transformationNotHandlingFeature : transformation
                    .getNotHandlesFeatures(true)) {
                if (transformationNotHandlingFeature == this) {
                    cachedNoInheritedNotHandlingTransformations.add(transformation);
                }
            }
            for (Feature transformationNotHandlingFeature : transformation
                    .getNotHandlesFeatures(false)) {
                if (transformationNotHandlingFeature == this) {
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
        return ((!(this instanceof FeatureGroup)) && (this.getExpandingTransformations().size() > 1));
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

    /**
     * Gets the set of feature groups this feature belongs to.
     * 
     * @return the set of feature groups
     */
    public Set<FeatureGroup> getParentFeatureGroups() {
        if (cachedFeatureGroups != null) {
            return cachedFeatureGroups;
        }
        cachedFeatureGroups = new HashSet<FeatureGroup>();
        for (Feature feature : KielerCompiler.getFeatures()) {
            if (feature.isGroup() && feature.asGroup().getFeatures().contains(this)) {
                cachedFeatureGroups.add(feature.asGroup());
            }
        }
        return cachedFeatureGroups;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the set of feature groups this feature belongs to recursively following all groups up to
     * the top most.
     * 
     * @return the set of feature groups
     */
    public Set<FeatureGroup> getAllParentFeatureGroups() {
        if (cachedAllFeatureGroups != null) {
            return cachedAllFeatureGroups;
        }
        cachedAllFeatureGroups = new HashSet<FeatureGroup>();
        cachedAllFeatureGroups.addAll(getAllParentFeatureGroups(this));

        return cachedAllFeatureGroups;
    }

    // ---------------------------------

    /**
     * Gets the set of feature groups this feature belongs to recursively following all groups up to
     * the top most. Private helper method.
     * 
     * @param group
     *            the group
     * @return the all parent feature groups
     */
    private Set<FeatureGroup> getAllParentFeatureGroups(Feature featureContainedByGroup) {
        HashSet<FeatureGroup> returnSet = new HashSet<FeatureGroup>();
        for (Feature feature : KielerCompiler.getFeatures()) {
            if (feature.isGroup()
                    && feature.asGroup().getFeatures().contains(featureContainedByGroup)) {
                // Add parent
                returnSet.add(feature.asGroup());
                // Continue with parent
                returnSet.addAll(getAllParentFeatureGroups(feature));
            }
        }
        return returnSet;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

}
