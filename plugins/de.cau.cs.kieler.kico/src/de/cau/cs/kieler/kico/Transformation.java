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

    /** The not handles dependencies. */
    private Set<Feature> cachedResolvedNotHandlesFeatures = null;
    
    /** The cached handles feature. */
    private Feature cachedHandlesFeature = null;

    /** The central processor list. */
    private List<ProcessorOption> processorOptions = new ArrayList<ProcessorOption>();

    // -------------------------------------------------------------------------
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
     * Gets the feature that this transformation handles.
     *
     * @return the handle feature
     */
    public Feature getHandleFeature() {
        if (cachedHandlesFeature != null) {
            return cachedHandlesFeature;
        }
        cachedHandlesFeature = KielerCompiler.getFeature(getHandleFeatureId());
        return cachedHandlesFeature;
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
            cachedProducesFeatures.add(feature);
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
     * @return the dependencies
     */
    public Set<Feature> getNotHandlesFeatures() {
        if (cachedNotHandlesFeatures != null) {
            return cachedNotHandlesFeatures;
        }
        cachedNotHandlesFeatures = new HashSet<Feature>();
        for (String featureId : this.getNotHandlesFeatureIds()) {
            Feature feature = KielerCompiler.getFeature(featureId);
            cachedNotHandlesFeatures.add(feature);
        }
        return cachedNotHandlesFeatures;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of features that cannot be handled by this transformation which also indirectly
     * represent dependencies to other transformations. All items are fully resolved so each item
     * can only be a Feature and not a FeatureGroup.
     * 
     * @return the features
     */
    public Set<Feature> getResolvedNotHandlesFeatures() {
        if (cachedResolvedNotHandlesFeatures != null) {
            return cachedResolvedNotHandlesFeatures;
        }
        cachedResolvedNotHandlesFeatures = Feature.resolveFeatures(getNotHandlesFeatures());
        return cachedResolvedNotHandlesFeatures;
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
            // Ask KiCo for processor and return the getReturnType
            Processor processor = KielerCompiler.getProcessor(lastProcessorOption.getProcessorId());
            return processor.getReturnType();
        }
        return null;
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
    public final Object transform(final EObject eObject, final KielerCompilerContext context)
            throws Exception {

        EObject eObjectParam = eObject;
        EObject eObjectResult = null;

        for (ProcessorOption processorOption : getProcessorOptions()) {
            // Ask KiCo for processor
            Processor processor = KielerCompiler.getProcessor(processorOption.getProcessorId());

            if (processorOption.isOptional()) {
                // TODO: check context whether processorOption is enabled in the KielerCompilerContext
                boolean isEnabled = true;
                if (!isEnabled) {
                    // If the optional processor is disabled then continue with the next processor
                    continue;
                }
            }

            // Process the next processor
            Object result = processor.process(eObjectParam, context);

            // Inspect the result: If it is an EObject make it the next eObject, if not return it.
            if (result instanceof EObject) {
                eObjectResult = (EObject) result;
                eObjectParam = eObjectResult;
            } else {
                return result;
            }
        }

        // return the last EObject after applying this chain of processors to the input eObject
        return eObjectResult;
    }

    // -------------------------------------------------------------------------
}
