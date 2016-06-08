/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator

import de.cau.cs.kieler.core.properties.IProperty
import java.util.List

/**
 * Common property holder interface for SCT Generator classes
 * All SCT Generator classes must return their category and a list of properties.
 * 
 * @author ssm
 * @kieler.design 2016-06-07 proposed 
 * @kieler.rating 2016-06-07 proposed yellow
 */
interface ISCTGeneratorPropertyHolder {
    /**
     * Returns the ID of the category for this property holder.
     * 
     * @returns the ID of the category for this property holder.
     */
    def String getCategory()
    
    /**
     * Retrieves the list of SCT Generator properties.
     * 
     * @returns the list of SCT Generator properties.
     */
    def List<IProperty<?>> getProperties()    
}