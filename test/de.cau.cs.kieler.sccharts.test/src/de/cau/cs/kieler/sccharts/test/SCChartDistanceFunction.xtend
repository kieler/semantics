/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.test

import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.emf.compare.Comparison
import org.eclipse.emf.compare.match.eobject.EditionDistance
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference

/**
 * @author aas
 */
public class SCChartDistanceFunction extends EditionDistance {
    override double distance(Comparison inProgress, EObject a, EObject b) {

        if (a instanceof Transition && b instanceof Transition) {
            val _a = a as Transition
            val _b = b as Transition

            if (haveMatchingContainers(inProgress, a, b)) {
                return Math.abs(_a.priority - _b.priority)
            } else {
                return Double.MAX_VALUE
            }
        }

        if (a instanceof Assignment && b instanceof Assignment ||
            a instanceof ValuedObjectReference && b instanceof ValuedObjectReference) {
            if (haveMatchingContainers(inProgress, a, b)) {
                return 0
            } else {
                return Double.MAX_VALUE
            }
        }

        return super.distance(inProgress, a, b);
    }

    /**
     * Check, wether two eObjects have matching containers.
     * 
     * @param inProgress
     *            the comparison being processed right now.
     * @param a first object.
     * @param b second object.
     * @return true, if a and b have matching containers.
     */
    protected def boolean haveMatchingContainers(Comparison inProgress, EObject a, EObject b) {
        return ( inProgress.getMatch(a.eContainer()) == inProgress.getMatch(b.eContainer()));
    }
}
