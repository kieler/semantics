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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A special condition that checks whether referenced lists have a certain size.
 * 
 * @author schm
 */
public class SizeCondition extends Condition {

    /**
     * The constructor.
     * 
     * @param f The feature to check.
     * @param v The value the feature is supposed to have.
     */
    public SizeCondition(final EStructuralFeature f, final Integer v) {
        super(f, v);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isValid(final EObject modelElement) {
        if ((modelElement == null) || (modelElement.eGet(getFeature()) == null)
                || !(modelElement.eGet(getFeature()) instanceof EList<?>)) {
            return false;
        }
        if (((Integer) getValue()).intValue() == ((EList<?>) modelElement.eGet(getFeature())).size()) {
            return true;
        }
        return false;
    }

}
