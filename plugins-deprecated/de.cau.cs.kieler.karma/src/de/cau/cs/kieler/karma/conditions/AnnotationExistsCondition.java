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

package de.cau.cs.kieler.karma.conditions;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.Annotation;

/**
 * This condition is true if the annotation identified by the key exists in a given EObject.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public class AnnotationExistsCondition extends ICustomCondition<EObject> {
    
    /**
     * {@inheritDoc}
     */
    public boolean evaluate(final EObject object) {
        if (object instanceof Annotatable) {
            Annotatable annotatable = ((Annotatable) object);
            if (!annotatable.getAnnotations().isEmpty()) {
                Annotation annotation = annotatable.getAnnotation(key);
                if (annotation != null) {
                    return true;
                } else {
                    for (Annotation ann : annotatable.getAnnotations()) {
                        if (evaluate(ann)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
