/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.views

import org.eclipse.jface.viewers.IElementComparer

/**
 * Comparer to compare elements by identity instead usint the equals method.
 * This can be used in SWT viewers to support elements that are "equal" yet two different objects.
 *  
 * @author aas
 *
 */
class IdentityComparer implements IElementComparer {
            
    override equals(Object a, Object b) {
        return a === b
    }
    
    override hashCode(Object element) {
        return element.hashCode
    }
}