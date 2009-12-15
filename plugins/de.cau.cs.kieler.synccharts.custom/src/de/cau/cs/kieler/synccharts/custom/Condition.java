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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Represents conditions which consist of a feature and a value that the feature
 * is supposed to have.
 * 
 * @author schm
 */
public class Condition {

    private EStructuralFeature feature;
    private Object value;

    /**
     * The constructor.
     * 
     * @param f The feature.
     * @param v The value of the feature.
     */
    public Condition(final EStructuralFeature f, final Object v) {
        feature = f;
        value = v;
    }

    /**
     * Return the feature of the condition.
     * 
     * @return The feature.
     */
    public EStructuralFeature getFeature() {
        return feature;
    }

    /**
     * Return the value of the condition.
     * 
     * @return The value.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Check if this condition is fulfilled by a model element.
     * 
     * @param modelElement The model element to check.
     * @return True if fulfilled, false otherwise.
     */
    public boolean isValid(final EObject modelElement) {
        if ((modelElement == null) || (modelElement.eGet(feature) == null)) {
            return false;
        }
        if (value.equals(modelElement.eGet(feature))) {
            return true;
        }
        return false;
    }

}
