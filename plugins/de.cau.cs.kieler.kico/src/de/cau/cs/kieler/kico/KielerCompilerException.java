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

import de.cau.cs.kieler.kico.internal.KiCoUtil;


/**
 * This class implements the exception used in the KielerCompiler to gather all warnings and errors.
 * 
 * @author cmot
 * @kieler.design 2014-07-04 proposed
 * @kieler.rating 2014-07-04 proposed yellow
 * 
 */
public class KielerCompilerException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2363146434608966197L;

    /** The transformation id that caused the exception. */
    private String transformationId;

    /** The processor id that caused the exception. */
    private String processorId;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler exception.
     * 
     * @param processorId
     *            the processor id
     * @param transformationId
     *            the transformation id
     * @param message
     *            the message
     */
    public KielerCompilerException(String processorId, String transformationId, String message) {
        super(message);
        this.processorId = processorId;
        this.transformationId = transformationId;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler exception.
     * 
     * @param processorId
     *            the processor id
     * @param transformationId
     *            the transformation id
     * @param exception
     *            the exception
     */
    public KielerCompilerException(String processorId, String transformationId, Exception exception) {
        super(exception.getMessage(), exception.getCause());
        this.setStackTrace(exception.getStackTrace());
        this.processorId = processorId;
        this.transformationId = transformationId;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the processor id of the processor that caused the exception.
     * 
     * @return the processor id
     */
    public String getProcessorId() {
        return processorId;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation id of the transformation that caused the exception.
     * 
     * @return the transformation id
     */
    public String getTransformationId() {
        return transformationId;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the stack trace as a string.
     * 
     * @return the stack trace
     */
    public String getStackTraceString() {
        return KiCoUtil.getStackTraceString(this);
    }

    // -------------------------------------------------------------------------

}
