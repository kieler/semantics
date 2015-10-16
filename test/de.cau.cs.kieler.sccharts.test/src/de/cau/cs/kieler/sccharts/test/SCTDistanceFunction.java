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
package de.cau.cs.kieler.sccharts.test;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is useless
 * 
 * @author aas
 */
public class SCTDistanceFunction extends EditionDistance {
    /**
     * {@inheritDoc}
     */
    @Override
    public double distance(Comparison inProgress, EObject a, EObject b) {
        return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean areIdentic(Comparison inProgress, EObject a, EObject b) {
        return true;
    }
}
