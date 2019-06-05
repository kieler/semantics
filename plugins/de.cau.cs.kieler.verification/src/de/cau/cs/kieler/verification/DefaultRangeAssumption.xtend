/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification

/** 
 * @author aas
 */
class DefaultRangeAssumption extends RangeAssumption {
    
    new(int minValue, int maxValue) {
        super(null, minValue, maxValue)
    }
}
