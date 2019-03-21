/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model;

/**
 * Thrown when a diagram object such as an editor part or edit part is not supported.
 * The most specific constructor takes a String as an explanation for the operation that
 * is not supported, a reason why it is not supported and an Object, that is not supported
 * in the context of the operation. The message will be built from these elements, which
 * may be null.
 * 
 * @kieler.design 2012-11-06 proposed cds
 * @kieler.rating 2012-11-06 proposed yellow cds
 * @author haf
 */
public class UnsupportedPartException extends RuntimeException {

    /** the serial version UID. */
    private static final long serialVersionUID = -3050609849973311868L;
    /** the object that is not supported by the operation, if any. */
    private Object myNotSupportedObject = null;
    /** the operation that is not supported. */
    private String myOperation = null;
    /** the reason why the operation is not supported. */
    private String myReason = null;
    

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
        
        super(buildMessage("", operation, reason, notSupportedObject, false));
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
        
        super(buildMessage("", operation, reason, notSupportedObject, nullConsideredEvil));
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
    
    
    /**
     * Builds the error message string from the given information.
     * 
     * @param message a custom message.
     * @param operation the operation that is not supported. May be {@code null}.
     * @param reason the reason why it is not supported. May be {@code null}.
     * @param notSupportedObject the object that is not supported. May be {@code null}.
     * @param nullConsideredEvil currently not used.
     * @return the error message.
     */
    private static String buildMessage(final String message, final String operation,
            final String reason, final Object notSupportedObject, final boolean nullConsideredEvil) {
        
        StringBuilder temp = new StringBuilder("Not supported:");
        temp.append(message);
        
        if (operation != null) {
            temp.append(" ").append(operation);
        }
        
        if (reason != null) {
            temp.append(" ").append(reason);
        }
        
        if (notSupportedObject != null) {
            temp.append(" ").append(notSupportedObject);
        } else {
            temp.append(" The passed object is null!");
        }
        
        return temp.toString();
    }

}
