/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.kitt.tracing;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

/**
 * Service interface for comparing TracingTrees.
 * 
 * @author wechselberg
 */
public interface ITracingTreeComparator {
    
    /**
     * Compares two given Tracings.
     * 
     * @return {@code null} if models are not identically, bijective mapping between matching objects otherwise
     */
    HashMap<EObject, EObject> matchModels(EObject left, EObject right);

}
