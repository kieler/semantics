/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations;

/**
 * Utility class for annotations.
 * 
 * @author msp
 */
public final class AnnotationsUtil {
    
    /**
     * Hidden constructor to avoid instantiation.
     */
    private AnnotationsUtil() {
    }
    
    /**
     * Retrieve a string value from an annotation.
     * 
     * @param annotatable an annotatable object
     * @param key the annotation key
     * @return the annotation value, or {@code null} if there is none
     */
    public static String getString(final Annotatable annotatable, final String key) {
        Annotation annotation = annotatable.getAnnotation(key);
        if (annotation instanceof StringAnnotation) {
            return ((StringAnnotation) annotation).getValue();
        }
        return null;
    }
    
    /**
     * Retrieve an integer value from an annotation.
     * 
     * @param annotatable an annotatable object
     * @param key the annotation key
     * @return the annotation value, or {@code null} if there is none
     */
    public static Integer getInt(final Annotatable annotatable, final String key) {
        Annotation annotation = annotatable.getAnnotation(key);
        if (annotation instanceof IntAnnotation) {
            return ((IntAnnotation) annotation).getValue();
        }
        return null;
    }
    
    /**
     * Retrieve a boolean value from an annotation.
     * 
     * @param annotatable an annotatable object
     * @param key the annotation key
     * @return the annotation value, or {@code null} if there is none
     */
    public static Boolean getBoolean(final Annotatable annotatable, final String key) {
        Annotation annotation = annotatable.getAnnotation(key);
        if (annotation instanceof BooleanAnnotation) {
            return ((BooleanAnnotation) annotation).isValue();
        }
        return null;
    }
    
    /**
     * Retrieve a floating point value from an annotation.
     * 
     * @param annotatable an annotatable object
     * @param key the annotation key
     * @return the annotation value, or {@code null} if there is none
     */
    public static Float getFloat(final Annotatable annotatable, final String key) {
        Annotation annotation = annotatable.getAnnotation(key);
        if (annotation instanceof FloatAnnotation) {
            return ((FloatAnnotation) annotation).getValue();
        }
        return null;
    }

}
