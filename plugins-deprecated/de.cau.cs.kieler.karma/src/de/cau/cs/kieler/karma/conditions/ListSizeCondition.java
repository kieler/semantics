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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.karma.conditions;

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
public class ListSizeCondition implements ICondition<EObject> {

    private EStructuralFeature feature;
    private int size;
    private String operator;

    /**
     * Creates a size condition.
     * 
     * @param thefeature
     *            a structural feature
     * @param thesize
     *            the expected size of the corresponding list
     * @param theoperator
     *            string representation of an operator such as ==, !=, <, >
     */
    public ListSizeCondition(final EStructuralFeature thefeature, final int thesize,
            final String theoperator) {
        feature = thefeature;
        size = thesize;
        operator = theoperator;
    }

    /**
     * {@inheritDoc}
     */
    public boolean evaluate(final EObject object) {
        Object modelFeature = object.eGet(feature);
        try {
        if (modelFeature instanceof EList<?>) {
            if (operator.equals("") || operator.equals("==")) {
                return (size == ((EList<?>) modelFeature).size());
            } else if (operator.equals("!=")) {
                return (size != ((EList<?>) modelFeature).size());
            } else if (operator.equals(">")) {
                return (size > ((EList<?>) modelFeature).size());
            } else if (operator.equals(">=")) {
                return (size >= ((EList<?>) modelFeature).size());
            } else if (operator.equals("<")) {
                return (size < ((EList<?>) modelFeature).size());
            } else if (operator.equals("<=")) {
                return (size <= ((EList<?>) modelFeature).size());
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
