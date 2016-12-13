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
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment

/**
 * EMFCompare object to calculate the distance of EObjects in two SCCharts.
 * If the distance of two objects from model A and model B is small enough
 * then the objects will be taken as the same. 
 * 
 * @author aas
 */
public class SCChartDistanceFunction extends EditionDistance {
    
    /**
     * {@inheritDoc}
     */
    override double distance(Comparison inProgress, EObject a, EObject b) {
        var distance = 0;
        
        // Compare Transitions
        if (a instanceof Transition && b instanceof Transition) {
            val _a = a as Transition
            val _b = b as Transition
            
            // Transitions can only be taken as equal if they are part of matching states
            // and have the same target. 
            if (haveMatchingContainers(inProgress, a, b) && _a.targetState.id == _b.targetState.id) {
                
                // Another priority indicates strongly that the transisions are not the same
                distance += Math.abs(_a.priority - _b.priority)*2
                
                // Differents in differed and immediate indicates different transitions 
                if(_a.isDeferred != _b.isDeferred)
                    distance += 1
                if(_a.isImmediate != _b.isImmediate)
                    distance += 1
                
                return distance
            } else {
                return Double.MAX_VALUE
            }
        }

        // Compare Assignments
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
