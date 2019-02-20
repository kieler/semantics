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

import java.lang.reflect.Method

/** 
 * A property that uses a string for identification.
 * @kieler.design 2011-01-17 reviewed by haf, cmot, soh
 * @kieler.rating proposed yellow 2012-07-10 msp
 * @param<T>
 *  type of the property
 * @author msp
 */
class Property<T> implements IProperty<T>, Comparable<IProperty<?>> {
    
    /** 
     * the default lower bound, which is smaller than everything else. 
     */
    public static val Comparable<Object> NEGATIVE_INFINITY = [ return -1 ]
    
    /** 
     * the default upper bound, which is greater than everything else. 
     */
    public static val Comparable<Object> POSITIVE_INFINITY = [ return 1 ]
    
    /** 
     * identifier of this property. 
     */
    val String id
    
    /** 
     * the default value of this property. 
     */
    var T defaultValue
    
    /** 
     * the lower bound of this property. 
     */
    var Comparable<? super T> lowerBound = NEGATIVE_INFINITY
    
    /** 
     * the upper bound of this property. 
     */
    var Comparable<? super T> upperBound = POSITIVE_INFINITY

    /** 
     * Creates a property with given identifier and {@code null} as default value.
     * @param theid the identifier
     */
    new(String theid) {
        this.id = theid
    }

    /** 
     * Creates a property with given identifier and default value.
     * @param theid the identifier
     * @param thedefaultValue the default value
     */
    new(String theid, T thedefaultValue) {
        this(theid)
        this.defaultValue = thedefaultValue
    }

    /** 
     * Creates a property with given identifier, default value, and lower bound.
     * @param theid the identifier
     * @param thedefaultValue the default value
     * @param thelowerBound the lower bound
     */
    new(String theid, T thedefaultValue, Comparable<? super T> thelowerBound) {
        this(theid, thedefaultValue)
        if (thelowerBound !== null) {
            this.lowerBound = thelowerBound
        }
    }

    /** 
     * Creates a property with given identifier, default value, and lower and upper bound.
     * @param theid the identifier
     * @param thedefaultValue the default value
     * @param thelowerBound the lower bound, or {@code null} if the default lower bound shall be taken
     * @param theupperBound the upper bound
     */
    new(String theid, T thedefaultValue, Comparable<? super T> thelowerBound, Comparable<? super T> theupperBound) {
        this(theid, thedefaultValue, thelowerBound)
        if (theupperBound !== null) {
            this.upperBound = theupperBound
        }
    }

    /** 
     * Creates a property using another property as identifier, but changing
     * the default value.
     * @param other another property
     * @param thedefaultValue the new default value
     */
    new(IProperty<T> other, T thedefaultValue) {
        this(other.getId(), thedefaultValue, other.getLowerBound(), other.getUpperBound())
    }

    /** 
     * Creates a property using another property as identifier, but changing the
     * default value and lower bound.
     * @param other another property
     * @param thedefaultValue the new default value
     * @param thelowerBound the new lower bound
     */
    new(IProperty<T> other, T thedefaultValue, Comparable<? super T> thelowerBound) {
        this(other.getId(), thedefaultValue, thelowerBound, other.getUpperBound())
    }

    /** 
     * Creates a property using another property as identifier, but changing the
     * default value, lower bound, and upper bound.
     * @param other another property
     * @param thedefaultValue the new default value
     * @param thelowerBound the new lower bound
     * @param theupperBound the new upper bound
     */
    new(IProperty<T> other, T thedefaultValue, Comparable<? super T> thelowerBound,
        Comparable<? super T> theupperBound) {
        this(other.getId(), thedefaultValue, thelowerBound, theupperBound)
    }

    /** 
     * {@inheritDoc}
     */
    override boolean equals(Object obj) {
        if (obj instanceof IProperty<?>) {
            return this.id.equals(((obj as IProperty<?>)).getId())
        } else {
            return false
        }
    }

    /** 
     * {@inheritDoc}
     */
    override int hashCode() {
        return id.hashCode()
    }

    /** 
     * {@inheritDoc}
     */
    override String toString() {
        return id
    }

    /** 
     * Returns the default value of this property.
     * @return the default value.
     */
    override T getDefault() {
        // Clone the default value if it's a Cloneable. We need to use reflection for this to work
        // properly (classes implementing Cloneable are not required to make their clone() method
        // public, so we need to check if they have such a method and invoke it via reflection, which
        // results in ugly and unchecked type casting)
        if (defaultValue instanceof Cloneable) {
            try {
                var Method cloneMethod = defaultValue.getClass().getMethod("clone")
                /*FIXME Cannot add Annotation to Variable declaration. Java code: @SuppressWarnings("unchecked")*/
                var T clonedDefaultValue = (cloneMethod.invoke(defaultValue) as T)
                return clonedDefaultValue
            } catch (Exception e) {
                // Give up cloning and return the default instance
                return defaultValue
            }

        } else {
            return defaultValue
        }
    }

    /** 
     * {@inheritDoc}
     */
    override Comparable<? super T> getLowerBound() {
        return lowerBound
    }

    /** 
     * {@inheritDoc}
     */
    override Comparable<? super T> getUpperBound() {
        return upperBound
    }

    /** 
     * {@inheritDoc}
     */
    override String getId() {
        return id
    }

    /** 
     * {@inheritDoc}
     */
    override int compareTo(IProperty<?> other) {
        return id.compareTo((other.getId() as String))
    }
}
