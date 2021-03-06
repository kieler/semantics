/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.properties

import java.util.Map

/** 
 * Interface for holders of property values.
 * @kieler.design 2011-01-17 reviewed by haf, cmot, soh
 * @kieler.rating proposed yellow 2012-07-10 msp
 * @author msp
 */
interface IPropertyHolder {
    /** 
     * Sets a property value. No type checking is performed while setting, so
     * users of this method must take care that the right object types are generated.
     * @param<T>
     *  type of property
     * @param property the property to set
     * @param value the new value
     * @return <code>this</code> {@link IPropertyHolder} for convenience
     */
    def <T> IPropertyHolder setProperty(IProperty<? super T> property, T value)

    /** 
     * Retrieves a property value. If the property is not set, its default value shall be taken,
     * which is taken from the given property instance.
     * @param<T>
     *  type of property
     * @param property the property to get
     * @return the current value, or the default value if the property is not set
     */
    def <T> T getProperty(IProperty<T> property)
    
    /**
     * Retrieves a property value. If the property is not set or null, it is set to the given value and returned.
     * 
     * @param <T> type of property
     * @param property the property to get
     * @param the value to set if absent
     * @return the current value, or the given value
     */
    def <T> T getPropertyAndSetIfAbsent(IProperty<T> property, T value)

    /** 
     * Copy all properties from another property holder to this one.
     * @param holder another property holder
     * @return <code>this</code> {@link IPropertyHolder} for convenience
     */
    def IPropertyHolder copyProperties(IPropertyHolder holder)

    /** 
     * Returns a map of all assigned properties with associated values.
     * @return a map of all properties
     */
    def Map<IProperty<?>, Object> getAllProperties()

}
