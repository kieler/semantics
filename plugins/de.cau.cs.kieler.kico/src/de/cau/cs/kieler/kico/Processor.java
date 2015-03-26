/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.List;

/**
 * An instance of this class represents a registered processor which can run before or after a
 * transformation. It is called indirectly when invoking the KielerCompiler.compile() method.
 * 
 * @author cmot
 * @kieler.design 2015-02-11 proposed
 * @kieler.rating 2015-02-11 proposed yellow
 * 
 */
public abstract class Processor extends Transformation {

    /**
     * A processor has no handles dependencies. This method should not be called.
     * 
     * @param dependencies
     *            the new dependencies
     */
    final void setNotHandlesDependencies(List<String> dependencies) {
        throw new RuntimeException("A processor cannot have any no not handles dependencies");
    }

    // -------------------------------------------------------------------------

    /**
     * A processor has no produce dependencies. This method should not be called.
     * 
     * @param dependencies
     *            the new dependencies
     */
    final void setProducesDependencies(List<String> dependencies) {
        throw new RuntimeException("A processor cannot have any no produces dependencies");
    }

    // -------------------------------------------------------------------------

    /**
     * A processor has no not handles dependencies.
     * 
     * @return the dependencies
     */
    final public List<String> getNotHandlesDependencies() {
        // TODO: This may be a possible and necessary extension, to consider dependencies of
        // processors in the future.
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * A processor has no produce dependencies.
     * 
     * @return the dependencies
     */
    final public List<String> getProducesDependencies() {
        // TODO: This may be a possible and necessary extension, to consider dependencies of
        // processors in the future.
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * A processor cannot have further pre processors.
     * 
     * @return the dependencies
     */
    final public List<ProcessorOption> getPreProcessors() {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * A processor cannot have further post processors.
     * 
     * @return the dependencies
     */
    final public List<ProcessorOption> getPostProcessors() {
        return null;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
}
