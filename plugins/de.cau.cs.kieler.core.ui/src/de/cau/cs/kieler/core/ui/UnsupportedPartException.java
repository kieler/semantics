/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.ui;

/**
 * Thrown when a diagram object such as an editor part or edit part is not supported.
 * The most specific constructor takes a String as an explanation for the operation that
 * is not supported, a reason why it is not supported and an Object, that is not supported
 * in the context of the operation. The message will be built from these elements, which
 * may be null.
 * 
 * @author haf
 */
public class UnsupportedPartException extends RuntimeException {

    /** the serial version UID. */
    private static final long serialVersionUID = -3050609849973311868L;
    private Object myNotSupportedObject = null;
    private String myOperation = null;
    private String myReason = null;

    private static String transformMessage(final String message, final String operation,
            final String reason, final Object notSupportedObject, final boolean nullConsideredEvil) {
        String temp = "Not supported: " + message;
        if (operation != null) {
            temp += " " + operation;
        }
        if (reason != null) {
            temp += " " + reason;
        }
        if (notSupportedObject != null) {
            temp += " " + notSupportedObject;
        } else {
            temp += " The passed object is null!";
        }
        return temp;
    }

    /**
     * Constructs a KIELER exception with given message.
     * 
     * @param message
     *            readable exception message
     */
    public UnsupportedPartException(final String message) {
        super(message);
    }

    /**
     * Constructs a KIELER exception with given message and cause.
     * 
     * @param operation
     *            the operation that is not supported
     * @param reason
     *            a reason why the operation is not supported
     * @param notSupportedObject
     *            an object for which the operation is not supported, e.g. a wrong parameter
     */
    public UnsupportedPartException(final String operation, final String reason,
            final Object notSupportedObject) {
        super(transformMessage("", operation, reason, notSupportedObject, false));
        this.myReason = reason;
        this.myOperation = operation;
        this.myNotSupportedObject = notSupportedObject;
    }

    /**
     * Constructs a KIELER exception with given message and cause.
     * 
     * @param operation
     *            the operation that is not supported
     * @param reason
     *            a reason why the operation is not supported
     * @param notSupportedObject
     *            an object for which the operation is not supported, e.g. a wrong parameter
     * @param nullConsideredEvil
     *            true if a null-notSupportedObject should indicate a programming error where the
     *            location of that error is of great importance and should be indicated in the
     *            message
     */
    public UnsupportedPartException(final String operation, final String reason,
            final Object notSupportedObject, final boolean nullConsideredEvil) {
        super(transformMessage("", operation, reason, notSupportedObject, nullConsideredEvil));
        this.myReason = reason;
        this.myOperation = operation;
        this.myNotSupportedObject = notSupportedObject;
    }

    /**
     * Constructs a KIELER exception with given message and cause.
     * 
     * @param message
     *            readable exception message
     * @param cause
     *            exception that caused this exception
     */
    public UnsupportedPartException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * @return object which in the context of the operation is not supported, e.g. a wrong parameter
     */
    public Object getNotSupportedObject() {
        return myNotSupportedObject;
    }

    /**
     * @return a description or name of the Operation that is not supported
     */
    public String getOperation() {
        return myOperation;
    }

    /**
     * @return a descriptive explanation why the operation is not supported
     */
    public String getReason() {
        return myReason;
    }

}
