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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * An instance of this class represents a registered transformation that may be called indirectly by
 * invoking the KielerCompiler.compile() method. It consists of a list of processors which are
 * called one by another when invoking the transform() method.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public abstract class Transformation implements ITransformation {

    /** The produces dependencies. */
    private Set<Feature> cachedProducesFeatures = null;

    /** The produces dependencies. */
    private Set<Feature> cachedResolvedProducesFeatures = null;

    /** The not handles dependencies. */
    private Set<Feature> cachedNotHandlesFeatures = null;

    /** The inherited not handles dependencies from feature groups. */
    private Set<Feature> cachedNoInheritedNotHandlesFeatures = null;

    /** The not handles dependencies. */
    private Set<Feature> cachedResolvedNotHandlesFeatures = null;

    /** The not handles dependencies. */
    private Set<Feature> cachedNoInheritedResolvedNotHandlesFeatures = null;

    /** The cached handles feature. */
    private Feature cachedExpandsFeature = null;

    /** The central processor list. */
    private List<ProcessorOption> processorOptions = new ArrayList<ProcessorOption>();

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Instantiates a new transformation.
     */
    public Transformation() {
        // By default add the default processor option that will be used to refer to the
        // transformation method itself
        processorOptions.add(ProcessorOption.getDefaultThisProcessorOption());
    }

    // -------------------------------------------------------------------------

    /**
     * This method may be overridden to optionally supply a human readable name for this
     * transformation. The default implementation will return the id in place of the name.
     * 
     * @return the name
     */
    public String getName() {
        return getId();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the feature that this transformation expands.
     * 
     * @return the handle feature
     */
    public Feature getExpandsFeature() {
        if (cachedExpandsFeature != null) {
            return cachedExpandsFeature;
        }
        cachedExpandsFeature = KielerCompiler.getFeature(getExpandsFeatureId());
        return cachedExpandsFeature;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of produces features that indirectly represent dependencies to other
     * transformations.
     * 
     * @return the dependencies
     */
    public Set<Feature> getProducesFeatures() {
        if (cachedProducesFeatures != null) {
            return cachedProducesFeatures;
        }
        cachedProducesFeatures = new HashSet<Feature>();
        for (String featureId : this.getProducesFeatureIds()) {
            Feature feature = KielerCompiler.getFeature(featureId);
            if (feature == null) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "Transformation '" + this.getId()
                        + "' references a feature '" + featureId
                        + "' it produces, but this feature cannot be found.", null);
            } else {
                if (feature.isGroup()) {
                    // add all features of this group!
                    for (Feature innerFeature : feature.asGroup().getResolvedFeatures()) {
                        cachedNotHandlesFeatures.add(innerFeature);
                    }
                } else {
                    cachedProducesFeatures.add(feature);
                }
            }
        }
        return cachedProducesFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of produces features that indirectly represent dependencies to other
     * transformations. All items are fully resolved so each item can only be a Feature and not a
     * FeatureGroup.
     * 
     * @return the features
     */
    public Set<Feature> getResolvedProducesFeatures() {
        if (cachedResolvedProducesFeatures != null) {
            return cachedResolvedProducesFeatures;
        }
        cachedResolvedProducesFeatures = Feature.resolveFeatures(getProducesFeatures());
        return cachedResolvedProducesFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of features that cannot be handled by this transformation which also indirectly
     * represent dependencies to other transformations.
     * 
     * @param ignoreInherited
     *            the ignore inherited
     * @return the dependencies
     */
    public Set<Feature> getNotHandlesFeatures(boolean ignoreInherited) {
        if (cachedNotHandlesFeatures != null) {
            if (ignoreInherited) {
                return cachedNoInheritedNotHandlesFeatures;
            } else {
                return cachedNotHandlesFeatures;
            }
        }
        cachedNotHandlesFeatures = new HashSet<Feature>();
        cachedNoInheritedNotHandlesFeatures = new HashSet<Feature>();
        for (String featureId : this.getNotHandlesFeatureIds()) {
            Feature feature = KielerCompiler.getFeature(featureId);
            if (feature == null) {
                KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "Transformation '" + this.getId()
                        + "' references a feature '" + featureId
                        + "' it cannot handle, but this feature cannot be found.", null);
            } else {
                if (feature.isGroup()) {
                    // add all features of this group!
                    for (Feature innerFeature : feature.asGroup().getResolvedFeatures()) {
                        cachedNotHandlesFeatures.add(innerFeature);
                        cachedNoInheritedNotHandlesFeatures.add(innerFeature);
                    }
                } else {
                    cachedNotHandlesFeatures.add(feature);
                    cachedNoInheritedNotHandlesFeatures.add(feature);
                }
            }
        }
        // META DEPENDENCY ADDITION: We need to add all features that are declared as not-manageable
        // by ANY feature group
        // our feature is part of! We inherit here all these not-handles dependencies!
        Feature ourFeature = this.getExpandsFeature();
        for (FeatureGroup featureGroup : ourFeature.getAllParentFeatureGroups()) {
            for (Feature inheritNotHandles : featureGroup.getNotHandlesFeatures()) {
                if (inheritNotHandles.isGroup()) {
                    for (Feature innerInheritNotHandles : inheritNotHandles.asGroup()
                            .getResolvedFeatures()) {
                        cachedNotHandlesFeatures.add(innerInheritNotHandles);
                    }
                } else {
                    cachedNotHandlesFeatures.add(inheritNotHandles);
                }
            }

        }
        if (ignoreInherited) {
            return cachedNoInheritedNotHandlesFeatures;
        } else {
            return cachedNotHandlesFeatures;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of features that cannot be handled by this transformation which also indirectly
     * represent dependencies to other transformations. All items are fully resolved so each item
     * can only be a Feature and not a FeatureGroup.
     * 
     * @return the features
     */
    public Set<Feature> getResolvedNotHandlesFeatures(boolean ignoreInherited) {
        if (cachedResolvedNotHandlesFeatures != null) {
            if (ignoreInherited) {
                return cachedNoInheritedResolvedNotHandlesFeatures;
            } else {
                return cachedResolvedNotHandlesFeatures;
            }
        }
        if (ignoreInherited) {
            cachedNoInheritedResolvedNotHandlesFeatures =
                    Feature.resolveFeatures(getNotHandlesFeatures(true));
            return cachedNoInheritedResolvedNotHandlesFeatures;
        } else {
            cachedResolvedNotHandlesFeatures =
                    Feature.resolveFeatures(getNotHandlesFeatures(false));
            return cachedResolvedNotHandlesFeatures;
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the central list of processors which this transformation consists of.
     * 
     * @return the dependencies
     */
    public List<ProcessorOption> getProcessorOptions() {
        return processorOptions;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the argument parameter type of the first processor.
     * 
     * @return the argument parameter type of the first processor
     */
    public Class<?> getParameterType() {
        if (processorOptions.size() > 0) {
            ProcessorOption firstProcessorOption = processorOptions.get(0);
            if (firstProcessorOption == ProcessorOption.getDefaultThisProcessorOption()) {
                return getTransformationMethodParameterType();
            }
            // Ask KiCo for processor and return the getParameterType
            Processor processor =
                    KielerCompiler.getProcessor(firstProcessorOption.getProcessorId());
            return processor.getParameterType();
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the return argument type of the last processor.
     * 
     * @return the return argument type of the last processor
     */
    public Class<?> getReturnType() {
        if (processorOptions.size() > 0) {
            ProcessorOption lastProcessorOption = processorOptions.get(processorOptions.size() - 1);
            if (lastProcessorOption == ProcessorOption.getDefaultThisProcessorOption()) {
                return getTransformationMethodReturnType();
            }
            // Ask KiCo for processor and return the getReturnType
            Processor processor = KielerCompiler.getProcessor(lastProcessorOption.getProcessorId());
            return processor.getReturnType();
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Non-Inplace transformations should return false here. The default value is true and the more
     * efficient strategy. However, if a transformation, i.e., a processor within the transformation
     * requires to work on a real copy of the model then the transformation implementation should
     * return false here an KiCo will provide the transformation with a copy of the model as input.
     * Override this method to return false;
     * 
     * @return false ONLY if the model transformation really requires a copy of the model as the
     *         input. Typically model transformations should return true here for faster processing.
     */
    public boolean isInplace() {
        return true;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * The transform method can be overridden by a transformation to simplify the transformation
     * definition. the default processor option (which by default is the only processor option in
     * the list of processor options) refers to this transform() method. Other processor options may
     * be added before and after this transform method. Note: If the default processor option is
     * removed this transform() method may not be considered. It is mainly a design decision choice
     * if a transformation should only be build from re-usable processors or also carry a
     * main-processor (represented by the default processor option). This method should not be
     * called directly!
     * 
     * @param eObject
     *            the e object
     * @param context
     *            the context
     * @return the object
     */
    public Object transform(final EObject eObject, final KielerCompilerContext context) {
        // Either this method is overridden, or the transform method (w/o a context)
        return transform(eObject);
    }

    // --------------------------------------------

    /**
     * The transform method can be overridden by a transformation to simplify the transformation
     * definition. the default processor option (which by default is the only processor option in
     * the list of processor options) refers to this transform() method. Other processor options may
     * be added before and after this transform method. Note: If the default processor option is
     * removed this transform() method may not be considered. It is mainly a design decision choice
     * if a transformation should only be build from re-usable processors or also carry a
     * main-processor (represented by the default processor option). This method should not be
     * called directly!
     * 
     * @param eObject
     *            the e object
     * @return the object
     */
    public Object transform(final EObject eObject) {
        return eObject;
    }

    // --------------------------------------------

    /**
     * Gets the argument parameter type for the transform method.
     * 
     * @return the argument parameter type
     */
    public Class<?> getTransformationMethodParameterType() {
        Method transformMethod = KiCoUtil.getSpecificTransformationMethodOrFallBack(this, getId());
        if (transformMethod == null) {
            throw (new RuntimeException("The transformation method of transformation '" + getId()
                    + "' was not found. If you declared a method you must not extend the "
                    + "Transformation abstract class at the same time."));
        }
        Class<?>[] classArray = transformMethod.getParameterTypes();
        if (classArray.length > 0) {
            return classArray[0];
        }
        return null;
    }

    // --------------------------------------------

    /**
     * Gets the return argument type for the transform method.
     * 
     * @return the return argument type
     */
    public Class<?> getTransformationMethodReturnType() {
        Method transformMethod = KiCoUtil.getSpecificTransformationMethodOrFallBack(this, getId());
        if (transformMethod == null) {
            throw (new RuntimeException("The transformation method of transformation '" + getId()
                    + "' was not found. If you declared a method you must not extend the "
                    + "Transformation abstract class at the same time."));
        }
        return transformMethod.getReturnType();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Do the transformation based on the method field. It should return an EObject if there are any
     * following transformations. A code generation will finally return a String object.
     * 
     * @param eObject
     *            the e object
     * @return the e object
     */
    public final Object doTransform(final EObject eObject, final KielerCompilerContext context) {
        EObject eObjectResult = null;

        for (ProcessorOption processorOption : getProcessorOptions()) {
            String transformationId = this.getId();
            Processor processor = null;
            String processorId = "TRANSFORM_METHOD";
            if (processorOption != ProcessorOption.getDefaultThisProcessorOption()) {
                // Ask KiCo for processor
                processor = KielerCompiler.getProcessor(processorOption.getProcessorId());
                processorId = processor.getId();
            }

            if (processorOption.isOptional()) {
                // Check context whether processorOption is enabled in the
                boolean isEnabled =
                        context.getSelection().isProcessorOptionEnabled(
                                processorOption.getProcessorOptionId());
                if (!isEnabled) {
                    // If the optional processor is disabled then continue with the next processor
                    continue;
                }
            }

            TransformationIntermediateResult transformationIntermediateResult =
                    context.getCompilationResult().getLastIntermediateResult();

            ProcessorIntermediateResult processorIntermediateResult =
                    new ProcessorIntermediateResult();
            processorIntermediateResult.setId(processorId);
            transformationIntermediateResult.addSubIntermediateResult(processorIntermediateResult);
            processorIntermediateResult.setDuration(-1);

            long start = 0;
            long end = 0;

            try {
                // Call the transform method if the default processor option, otherwise call the
                // processor
                Object result = null;
                if (processorOption == ProcessorOption.getDefaultThisProcessorOption()) {
                    // Process the next processor
                    start = System.currentTimeMillis();
                    Method transformMethod =
                            KiCoUtil.getSpecificTransformationMethodOrFallBack(this, getId());
                    if (transformMethod.getParameterTypes().length == 2) {
                        // first try more specific method
                        result = transformMethod.invoke(this, eObject, context);
                    } else {
                        // fall back to single parameter method otherwise
                        result = transformMethod.invoke(this, eObject);
                    }
                    // result = this.transform(eObjectParam, context);
                    end = System.currentTimeMillis();
                } else {
                    // Process the next processor
                    start = System.currentTimeMillis();
                    // result = processor.process(eObjectParam, context);
                    Method processMethod =
                            KiCoUtil.getSpecificProcessMethodOrFallBack(processor, getId());
                    if (processMethod.getParameterTypes().length == 2) {
                        // first try more specific method
                        result = processMethod.invoke(this, eObject, context);
                    } else {
                        // fall back to single parameter method otherwise
                        result = processMethod.invoke(this, eObject);
                    }
                    end = System.currentTimeMillis();
                }

                // Add to compilation result
                processorIntermediateResult.setResult(result);

                // Add performance result
                processorIntermediateResult.setDuration(end - start);

                // Inspect the result: If it is an EObject make it the next eObject, if not return
                // it.
                if (result instanceof EObject) {
                    eObjectResult = (EObject) result;
                } else {
                    return result;
                }
            } catch (Exception exception) {
                context.getCompilationResult().addPostponedError(
                        new KielerCompilerException(processorId, transformationId, exception));
            }
        }

        // return the last EObject after applying this chain of processors to the input eObject
        return eObjectResult;
    }

    // -------------------------------------------------------------------------

}
