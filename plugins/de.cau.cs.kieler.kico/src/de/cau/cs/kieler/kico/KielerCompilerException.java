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

import java.io.PrintWriter;
import java.io.StringWriter;

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
    private String transformationID;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler exception.
     * 
     * @param transformationID
     *            the transformation id
     */
    public KielerCompilerException(String transformationID, String errorMessage) {
        super(errorMessage);
        this.transformationID = transformationID;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler exception.
     * 
     * @param transformationID
     *            the transformation id
     */
    public KielerCompilerException(String transformationID, Exception exception) {
        super(exception.getMessage(), exception.getCause());
        this.setStackTrace(exception.getStackTrace());
        this.transformationID = transformationID;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation id of the transformation that caused the exception.
     * 
     * @return the transformation id
     */
    public String getTransformationID() {
        return transformationID;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the stack trace as a string.
     * 
     * @return the stack trace
     */
    public String getStackTraceString() {
        return KielerCompilerException.getStackTraceString(this);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the stack trace of an exception as a string.
     * 
     * @param t
     *            the t
     * @return the error stack trace
     */
    public static String getStackTraceString(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString(); // stack trace as a string
    }

    // -------------------------------------------------------------------------

}
