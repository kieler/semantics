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

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;

/**
 * Enumeration of annotation types and utility methods for conversion.
 *
 * @author msp
 */
public enum AnnotationType {
    
    /** non-typed annotation. */
    NONE,
    /** string annotation. */
    STRING,
    /** typed string annotation. */
    TYPED_STRING;
    /** reference annotation. */
    
    /**
     * Determine the type of the given annotation.
     * 
     * @param annotation an annotation
     * @return the type of the annotation
     */
    public static AnnotationType of(final Annotation annotation) {
        switch (annotation.eClass().getClassifierID()) {
        case AnnotationsPackage.STRING_ANNOTATION:
            return STRING;
        case AnnotationsPackage.TYPED_STRING_ANNOTATION:
            return TYPED_STRING;
        default:
            return NONE;
        }
    }
    
    /**
     * Set a new annotation value from the given object. If the value cannot be
     * interpreted correctly, the method does nothing.
     * 
     * @param annotation an annotation
     * @param value a value in serialized or non-serialized form
     */
    public static void setValue(final Annotation annotation, final Object value) {
        switch (AnnotationType.of(annotation)) {
        case STRING:
        case TYPED_STRING:
            if (value instanceof String) {
                ((StringAnnotation) annotation).getValues().set(0, (String) value);
            }
            break;
        default:
            throw new IllegalArgumentException(
                    "Annotation type must not be CONTAINMENT, REFERENCE, or NONE.");
        }
    }
    
    /**
     * Create an annotation that corresponds to this annotation type.
     * 
     * @return a new annotation
     */
    public Annotation create() {
        switch (this) {
        case STRING:
            return AnnotationsFactory.eINSTANCE.createStringAnnotation();
        case TYPED_STRING:
            return AnnotationsFactory.eINSTANCE.createTypedStringAnnotation();
        default:
            return AnnotationsFactory.eINSTANCE.createAnnotation();
        }
    }

}
