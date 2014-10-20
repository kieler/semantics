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
package de.cau.cs.kieler.karma.conditions;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.ContainmentAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.ReferenceAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;

/**
 * Condition that works on annotations.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public class RecursiveAnnotationCondition extends ICustomCondition<EObject> {

    /**
     * {@inheritDoc}
     */
    public boolean evaluate(final EObject object) {
        Boolean result = false;
        if (object instanceof Annotatable) {
            Annotatable annotatable = ((Annotatable) object);
            List<Annotation> annotations = getAnnotationByKeyRecursive(annotatable);
            for (Annotation annotation : annotations) {
                if (result) {
                    return true;
                } else {
                    if (annotation instanceof BooleanAnnotation) {
                        BooleanAnnotation booleanAnnotation = (BooleanAnnotation) annotation;
                        boolean annotationValue = booleanAnnotation.isValue();
                        boolean boolValue = Boolean.parseBoolean(value);
                        result = (annotationValue == boolValue);
                    } else if (annotation instanceof ContainmentAnnotation) {
                        ContainmentAnnotation containmentAnnotation = (ContainmentAnnotation) annotation;
                        EObject eObject = containmentAnnotation.getObject();
                        // TODO probably think of a different check that makes more sense.
                        result = eObject.eClass().getName().equals(value);
                    } else if (annotation instanceof FloatAnnotation) {
                        FloatAnnotation floatAnnotation = (FloatAnnotation) annotation;
                        float annotationValue = floatAnnotation.getValue();
                        float floatValue = Float.parseFloat(value);
                        result = Float.compare(floatValue, annotationValue) == 0;
                    } else if (annotation instanceof IntAnnotation) {
                        IntAnnotation intAnnotation = (IntAnnotation) annotation;
                        int annotationValue = intAnnotation.getValue();
                        int intValue = Integer.parseInt(value);
                        result = (intValue == annotationValue);
                    } else if (annotation instanceof ReferenceAnnotation) {
                        ReferenceAnnotation referenceAnnotation = (ReferenceAnnotation) annotation;
                        EObject eObject = referenceAnnotation.getObject();
                        // TODO probably think of a different check that makes more sense.
                        result = eObject.eClass().getName().equals(value);
                    } else if (annotation instanceof StringAnnotation) {
                        StringAnnotation stringAnnotation = (StringAnnotation) annotation;
                        result = stringAnnotation.getValue().equals(value);
                    }
                }
            }
        }
        return result;
    }

    private List<Annotation> getAnnotationByKeyRecursive(final Annotatable annotatable) {
        if (!annotatable.getAnnotations().isEmpty()) {
            List<Annotation> annotations = annotatable.getAllAnnotations(key);
            for (Annotation ann : annotatable.getAnnotations()) {
                List<Annotation> moreAnnotations = getAnnotationByKeyRecursive(ann);
                if (moreAnnotations != null) { 
                    annotations.addAll(moreAnnotations);
                }
            }
            return annotations;
        }
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     */
    public void initialize(final String thekey, final String thevalue) {
        key = thekey;
        value = thevalue;
    }

}
