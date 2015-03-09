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
import java.util.List;

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
    private List<String> producesDependencies = new ArrayList<String>();

    /** The not handles dependencies. */
    private List<String> notHandlesDependencies = new ArrayList<String>();

    /** The central processor list. */
    private List<ProcessorOption> processors = new ArrayList<ProcessorOption>();

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

    /**
     * Gets the list of produces feature IDs that indirectly represent dependencies to other
     * transformations.
     * 
     * @return the dependencies
     */
    public List<String> getProducesDependencies() {
        return producesDependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the list of produces feature IDs that indirectly represent dependencies to other
     * transformations.
     * 
     * @param dependencies
     *            the new dependencies
     */
    void setProducesDependencies(List<String> dependencies) {
        this.producesDependencies = dependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of feature IDs of features that cannot be handled by this transformation which
     * also indirectly represent dependencies to other transformations.
     * 
     * @return the dependencies
     */
    public List<String> getNotHandlesDependencies() {
        return notHandlesDependencies;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the list of feature IDs of features that cannot be handled by this transformation which
     * also indirectly represent dependencies to other transformations.
     * 
     * @param dependencies
     *            the new dependencies
     */
    void setNotHandlesDependencies(List<String> dependencies) {
        this.notHandlesDependencies = dependencies;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the central list of processors which this transformation consists of.
     * 
     * @return the dependencies
     */
    public List<ProcessorOption> getProcessors() {
        return processors;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the argument parameter type of the first processor.
     * 
     * @return the argument parameter type of the first processor
     */
    public Class<?> getParameterType() {
        if (processors.size() > 0) {
            ProcessorOption firstProcessorOption = processors.get(0);
            // TODO: ask Kico for processor and return the getParameterType
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
        if (processors.size() > 0) {
            ProcessorOption lastProcessorOption = processors.get(processors.size() - 1);
            // TODO: ask Kico for processor and return the getReturnType
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

        for (ProcessorOption processorOption : getProcessors()) {
            // TODO: ask Kico for processor and return the getReturnType
            Processor processor = null;

            if (processorOption.isOptional()) {
                // TODO: check context whether processorOption is enabled
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
