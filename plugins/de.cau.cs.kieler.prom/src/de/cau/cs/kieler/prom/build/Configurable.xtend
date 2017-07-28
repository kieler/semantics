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
package de.cau.cs.kieler.prom.build

/**
 * @author aas
 *
 */
abstract class Configurable {
    
    protected extension AttributeExtensions attributeExtensions
    
    new() {
        attributeExtensions = new AttributeExtensions
    }
}