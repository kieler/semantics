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
package de.cau.cs.kieler.core.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.cau.cs.kieler.core.util.ICondition;

/**
 * A condition that evaluates a feature of an EOject.
 * 
 * @kieler.rating 2010-01-26 proposed yellow msp
 * @author schm
 * @author msp
 */
public class FeatureValueCondition implements ICondition<EObject> {

    private EStructuralFeature feature;
    private Object value;

    /**
     * Creates a feature condition.
     * 
     * @param thefeature
     *            a structural feature
     * @param thevalue
     *            the expected value of the feature
     */
    public FeatureValueCondition(final EStructuralFeature thefeature, final Object thevalue) {
        feature = thefeature;
        value = thevalue;
    }

    /**
     * {@inheritDoc}
     */
    public boolean evaluate(final EObject object) {
        try {
            return value.equals(object.eGet(feature));
        } catch (Exception e) {
            /* nothing. If an exception occurs, simply go on and return false.*/
        }
        return false;
    }

}
