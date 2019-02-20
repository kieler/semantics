/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.properties

import java.util.Comparator

/** 
 * A comparator for property holders that can uses a specific property for comparison.
 * @kieler.design 2014-04-17 reviewed by cds, chsch, tit, uru
 * @kieler.rating proposed yellow by msp
 * @author msp
 * @param<T>
 *  the type of the property used for comparison
 */
final class PropertyHolderComparator<T extends Comparable<T>> implements Comparator<IPropertyHolder> {
    
    /** 
     * Create a property holder comparator for the given property.
     * @param property a property
     * @param<U>
     *  the property type
     * @return a comparator that considers the given property
     */
    def static <U extends Comparable<U>> PropertyHolderComparator<U> with(IProperty<U> property) {
        return new PropertyHolderComparator<U>(property)
    }

    /** 
     * the property used for comparing. 
     */
    val IProperty<T> property

    /** 
     * Create a property holder comparator for the given property.
     * @param property a property
     */
    private new(IProperty<T> property) {
        this.property = property
    }

    /** 
     * {@inheritDoc}
     */
    override int compare(IPropertyHolder ph1, IPropertyHolder ph2) {
        var T p1 = ph1.getProperty(property)
        var T p2 = ph2.getProperty(property)
        if (p1 !== null && p2 !== null) {
            return p1.compareTo(p2)
        } else if (p1 !== null) {
            return -1
        } else if (p2 !== null) {
            return 1
        } else {
            return 0
        }
    }
}
