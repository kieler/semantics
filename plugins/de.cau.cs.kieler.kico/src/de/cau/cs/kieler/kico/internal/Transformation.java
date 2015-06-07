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
package de.cau.cs.kieler.kico.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kico.ProcessorIntermediateResult;
import de.cau.cs.kieler.kico.TransformationIntermediateResult;
import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation;
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation;
import de.cau.cs.kieler.kico.transformation.IExpansionTransformation;
import de.cau.cs.kieler.kico.transformation.IHook;
import de.cau.cs.kieler.kico.transformation.IProductionTransformation;
import de.cau.cs.kieler.kico.transformation.ITransformation;
import de.cau.cs.kieler.kico.transformation.Processor;
import de.cau.cs.kieler.kico.transformation.ProcessorOption;

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
public class Transformation implements ITransformation {

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
    private final List<ProcessorOption> processorOptions = new ArrayList<ProcessorOption>();

    /** The transformation this class handles */
    private final ITransformation delegate;

    /** This flag indicates a transformation producing a freatue instead of expanding it. */
    private boolean production = false;

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Instantiates a raw transformation handler.
     */
    private Transformation(ITransformation transformation) {
        this.delegate = transformation;
        if (transformation instanceof AbstractExpansionTransformation
                || transformation instanceof AbstractProductionTransformation) {
            /*
             * If the transformation is instance of one of the abstract classes it may have an
             * overridden transform method. Thus add the default processor option that will be used
             * to refer to the transformation method itself
             */
            processorOptions.add(ProcessorOption.getDefaultThisProcessorOption());
        }
        if (transformation.getProcessorOptions() != null) {
            processorOptions.addAll(transformation.getProcessorOptions());
        }
    }

    /**
     * Instantiates a new transformation handling expansion transformations.
     */
    public Transformation(IExpansionTransformation expansionTransformation) {
        this((ITransformation) expansionTransformation);
    }

    /**
     * Instantiates a new transformation handling production transformations.
     */
    public Transformation(IProductionTransformation productionTransformation) {
        this((ITransformation) productionTransformation);
        this.production = true;
    }

    // -------------------------------------------------------------------------
    // -- Delegation of ITransformation Interface

    /**
     * @see de.cau.cs.kieler.kico.transformation.ITransformation#getId()
     */
    public String getId() {
        return delegate.getId();
    }

    /**
     * @see de.cau.cs.kieler.kico.transformation.ITransformation#getName()
     */
    public String getName() {
        return delegate.getName();
    }

    /**
     * @see de.cau.cs.kieler.kico.transformation.ITransformation#isInplace()
     */
    public boolean isInplace() {
        return delegate.isInplace();
    }

    // -------------------------------------------------------------------------
    
    
    /**
     * @return The transformation performing the actual transformation
     */
    public ITransformation getDelegate() {
        return delegate;
    }

    /**
     * @see de.cau.cs.kieler.kico.transformation.ITransformation#getProcessorOptions()
     */
    public List<ProcessorOption> getProcessorOptions() {
        return processorOptions;
    }

    // -------------------------------------------------------------------------

    /**
     * @return indicates if this transformation in a production transformation
     */
    public boolean isProduction() {
        return production;
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
        String expandsFeatureID;
        if (production) {
            // In production transformations the expanded feature is produced instead of expanded
            expandsFeatureID = ((IProductionTransformation) delegate).getProducedFeatureId();
        } else {
            expandsFeatureID = ((IExpansionTransformation) delegate).getExpandsFeatureId();
        }
        cachedExpandsFeature = KielerCompiler.getFeature(expandsFeatureID);
        if (cachedExpandsFeature == null) {
            KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "Transformation '" + this.getId()
                    + "' references a feature '" + expandsFeatureID
                    + "' it expands, but this feature cannot be found.", null);
        }
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
        if (!production) {
            // Only expansion transformation have the concept of additional produced features
            for (String featureId : ((IExpansionTransformation) delegate)
                    .getProducesFeatureIds()) {
                Feature feature = KielerCompiler.getFeature(featureId);
                if (feature == null) {
                    KiCoUtil.logError(KiCoPlugin.PLUGIN_ID, "Transformation '" + this.getId()
                            + "' references a feature '" + featureId
                            + "' it produces, but this feature cannot be found.", null);
                } else {
                    if (feature.isGroup()) {
                        // add all features of this group!
                        for (Feature innerFeature : feature.asGroup().getResolvedFeatures()) {
                            cachedProducesFeatures.add(innerFeature);
                        }
                    } else {
                        cachedProducesFeatures.add(feature);
                    }
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

        Set<String> notHandlesFeatureIDs = new HashSet<String>();
        if (production) {
            /*
             * In production transformation the required features are also not handled features
             * because the have to produced or removed before.
             */
            Set<String> ids = ((IProductionTransformation) delegate).getRequiredFeatureIds();
            if (ids != null) {
                notHandlesFeatureIDs.addAll(ids);
            }
            // Merge with normal not handled features
            ids = ((IProductionTransformation) delegate).getNotHandlesFeatureIds();
            if (ids != null) {
                notHandlesFeatureIDs.addAll(ids);
            }
        } else {
            Set<String> ids = ((IExpansionTransformation) delegate).getNotHandlesFeatureIds();
            if (ids != null) {
                notHandlesFeatureIDs.addAll(ids);
            }
        }
        // Find features
        for (String featureId : notHandlesFeatureIDs) {
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

    /**
     * Gets the argument parameter type for the transform method.
     * 
     * @return the argument parameter type
     */
    public Class<?> getTransformationMethodParameterType() {
        Method transformMethod =
                KiCoUtil.getSpecificTransformationMethodOrFallBack(delegate, getId());
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
        Method transformMethod =
                KiCoUtil.getSpecificTransformationMethodOrFallBack(delegate, getId());
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
            String processorId = "UNKNOWN_PROCESSOR";
            if (processorOption != ProcessorOption.getDefaultThisProcessorOption()) {
                // Ask KiCo for processor
                processor = KielerCompiler.getProcessor(processorOption.getProcessorId());
                if (processor.getId() != null) {
                    processorId = processor.getId();
                }
            } else {
                processorId = processorOption.getProcessorId();
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

            EObject processorInput = eObject;
            Object result = null;

            // Invoke pre hooks
            for (IHook hook : KielerCompiler.getHooks()) {
                EObject hookResult = hook.preProcessor(processorInput, context, processor);
                if (hookResult != null) {
                    processorInput = hookResult;
                }
            }

            try {
                // Call the transform method if the default processor option, otherwise call the
                // processor
                if (processorOption == ProcessorOption.getDefaultThisProcessorOption()) {
                    // Process the next processor
                    start = System.currentTimeMillis();
                    Method transformMethod =
                            KiCoUtil.getSpecificTransformationMethodOrFallBack(delegate, getId());
                    if (transformMethod.getParameterTypes().length == 2) {
                        // first try more specific method
                        result = transformMethod.invoke(delegate, processorInput, context);
                    } else {
                        // fall back to single parameter method otherwise
                        result = transformMethod.invoke(delegate, processorInput);
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
                        result = processMethod.invoke(this, processorInput, context);
                    } else {
                        // fall back to single parameter method otherwise
                        result = processMethod.invoke(this, processorInput);
                    }
                    end = System.currentTimeMillis();
                }
            } catch (Exception exception) {
                context.getCompilationResult().addPostponedError(
                        new KielerCompilerException(processorId, transformationId, exception));
            } finally {
                // Invoke post hooks
                for (IHook hook : KielerCompiler.getHooks()) {
                    Object hookResult = hook.postProcessor(processorInput, result, context, processor);
                    if (hookResult != null) {
                        result = hookResult;
                    }
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
            }
        }

        // return the last EObject after applying this chain of processors to the input eObject
        return eObjectResult;
    }

    // -------------------------------------------------------------------------

}
