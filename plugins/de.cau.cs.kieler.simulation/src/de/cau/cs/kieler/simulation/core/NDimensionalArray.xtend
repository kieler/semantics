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
package de.cau.cs.kieler.simulation.core

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.core.runtime.Assert

/**
 * @author aas
 *
 */
class NDimensionalArray implements Cloneable{
    
    @Accessors(PUBLIC_GETTER)
    private var Integer[] indices;
    
    @Accessors(PUBLIC_GETTER)
    private var NDimensionalArrayElement[] elements
    
    new(List<Object> values, Integer... indices) {
        this.indices = indices
        
        val Integer[] index = newArrayOfSize(dimension)
        for(var i = 0; i < index.length; i++) {
            index.set(i, 0);
        }
        
        elements = newArrayOfSize(values.size)
        var i = 0;
        for(v : values) {
            val elem = new NDimensionalArrayElement(v, index)
            elements.set(i, elem)
            
            // Increase index ripple-carry-style
            var d = dimension-1; // "least significant dimension"
            index.set(d, index.get(d)+1)
            while(d > 0 && index.get(d) >= indices.get(d)) {
                index.set(d, 0)
                d--
                index.set(d, index.get(d)+1)
            }
            i++;
        }
    }
    
    public def int getDimension() {
        return indices.length;
    }
    
    public def int getLength(int dimension) {
        return indices.get(dimension);
    }
    
    public def Object get(List<Integer> index, boolean userValue) {
        val element = getElement(index)
        return if(userValue && element.isDirty) element.userValue else element.value
    }
    
    public def Object get(List<Integer> index) {
        return get(index, false)
    }
    
    public def NDimensionalArrayElement getElement(List<Integer> index) {
        // Check array sizes
        Assert.isTrue(index.size == dimension)
        for(var i = 0; i < index.size; i++) {
            if(index.get(i) < 0 || index.get(i) >= indices.get(i)) {
                throw new IllegalArgumentException("Array index out of bounds (index was "+index+", array size is "+indices.toString+")")
            }
        }
        // Return element at the given index
        val oneDimIndex = getOneDimensionalIndex(index)
        return elements.get(oneDimIndex)
    }
    
    public def Object set(List<Integer> index, Object value) {
        val oneDimIndex = getOneDimensionalIndex(index)
        val newArrayElement = new NDimensionalArrayElement(value, index) 
        elements.set(oneDimIndex, newArrayElement)
    }
    
    private def int getOneDimensionalIndex(List<Integer> indices) {
        val leastSignificantDimension = getDimension()-1
        val mostSignificantDimension = 0
        var index = 0
        var step = 1;
        for(var i = leastSignificantDimension; i >= mostSignificantDimension; i--) {
            index += indices.get(i)*step
            step *= getLength(i)
        }
        return index
    }
    
    public override NDimensionalArray clone() {
        val arr = new NDimensionalArray(elements.map[NDimensionalArrayElement.getCloneOfValue(it.value)], indices.clone)
        for(var i = 0; i < elements.size; i++) {
            val oldElem = elements.get(i)
            val newElem = arr.elements.get(i)
            newElem.userValue = NDimensionalArrayElement.getCloneOfValue(oldElem.userValue)
        }
        return arr 
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        val values = elements.map[if(it.isDirty)
                                      "*"+it.userValue
                                  else
                                      it.value]
        return values.toString()
    }
    
    /**
     * Two NDimensionalArrays are equal, if they have the same size of elements
     * and all their elements are equal within the same order.
     */
    override equals(Object other) {
        if(other != null) {
            if(other instanceof NDimensionalArray) {
                if(other.elements.size == elements.size) {
                    for(var i = 0; i < elements.size; i++) {
                        if(!elements.get(i).equals(other.elements.get(i))) {
                            return false
                        }
                    }
                    return true
                }    
            }
        }
        return false
    }
    
    /**
     * Returns a string representation for an array.
     * @param arr The array
     */
    public static def <T> String toString(T[] arr) {
        return "["+arr.map[it.toString].join(", ")+"]"
    }
}