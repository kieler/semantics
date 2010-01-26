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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A condition that checks whether a featured list of an EObject has a certain size.
 * 
 * @kieler.rating 2010-01-26 proposed yellow msp
 * @author schm
 * @author msp
 */
public class ListSizeCondition implements ICondition {

    private EStructuralFeature feature;
    private int size;

    /**
     * Creates a size condition.
     * 
     * @param thefeature a structural feature
     * @param thesize the expected size of the corresponding list
     */
    public ListSizeCondition(final EStructuralFeature thefeature, final int thesize) {
        feature = thefeature;
        size = thesize;
    }

    /**
     * {@inheritDoc}
     */
    public boolean evaluate(final Object object) {
        if (object instanceof EObject) {
            EObject modelElement = (EObject) object;
            Object modelFeature = modelElement.eGet(feature);
            if (modelFeature instanceof EList<?>) {
                return (size == ((EList<?>) modelFeature).size());
            }
        }
        return false;
    }

}
