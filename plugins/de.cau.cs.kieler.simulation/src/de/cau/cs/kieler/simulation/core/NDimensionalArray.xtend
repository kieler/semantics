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
 * Container for a multidimensional array of dynamic size and type.
 * Used for Variables that have an array as value.
 * 
 * @author aas
 *
 */
class NDimensionalArray implements Cloneable{
    
    /**
     * The indices of the array, that define its size.
     * 
     * They are used as in C, thus the indices [2][3] for instance, represent a two dimensional array.
     * The first dimension has two fields (index 0 and 1),
     * whereas the second dimension has three fields (index 0, 1 and 2).
     */
    @Accessors(PUBLIC_GETTER)
    private var Integer[] cardinalities;
    
    /**
     * The elements of the array.
     */
    @Accessors(PUBLIC_GETTER)
    private var NDimensionalArrayElement[] elements
    
    /**
     * Constructor.
     * The number of values and size of the array must match.
     * The values are stored linearly in a one dimensional array.
     * The are counted to reflect the desired indices for this NDimensionalArray,
     * such that the last dimension in the list of indices is the least sifnificant dimension when counting.
     * 
     * 
     * @param values The list of values
     * @param cardinalities The size of the array
     */
    new(List<Object> values, Integer... cardinalities) {
        this.cardinalities = cardinalities
        
        // Prepare index for element counting.
        val Integer[] index = newArrayOfSize(dimension)
        for(var i = 0; i < index.length; i++) {
            index.set(i, 0);
        }
        // Add elements with their index
        elements = newArrayOfSize(values.size)
        var i = 0;
        for(v : values) {
            val elem = new NDimensionalArrayElement(v, index)
            elements.set(i, elem)
            
            // Increase index ripple-carry-style
            var d = dimension-1; // "least significant dimension"
            index.set(d, index.get(d)+1)
            while(d > 0 && index.get(d) >= cardinalities.get(d)) {
                index.set(d, 0)
                d--
                index.set(d, index.get(d)+1)
            }
            i++;
        }
    }
    
    /** 
     * Returns the size of the array if it was one dimensional.
     */
    public def int getOneDimensionalArraySize() {
        return elements.size
    }
    
    /**
     * Returns the dimension of this NDimensionalArray.
     */
    public def int getDimension() {
        return cardinalities.length;
    }
    
    /**
     * Returns the size of the n'th dimension.
     * 
     * @param dimension The dimension of which to the size is returned (0 based)
     * @return the size of the given dimension
     */
    public def int getLength(int dimension) {
        return cardinalities.get(dimension);
    }
    
    /**
     * Returns the value (or user defined value) of the given index.
     * 
     * @param index The index of the element that should be returned
     * @param userValue Whether the normal value should be returned, or the user value if these are different
     * @return the value of the array element at the given index
     */
    public def Object get(List<Integer> index, boolean userValue) {
        val element = getElement(index)
        return if(userValue && element.isDirty) element.userValue else element.value
    }
    
    /**
     * Returns the value (not the user value) of the given index.
     * 
     * @param index The index
     * @return the value of the array element at the given index
     */
    public def Object get(List<Integer> index) {
        return get(index, false)
    }
    
    /**
     * Returns the element at the given index.
     * 
     * @param index The index
     * @return the element at the given index
     */
    public def NDimensionalArrayElement getElement(List<Integer> index) {
        // Check array sizes
        Assert.isTrue(index.size == dimension)
        for(var i = 0; i < index.size; i++) {
            if(index.get(i) < 0 || index.get(i) >= cardinalities.get(i)) {
                throw new IllegalArgumentException("Array index out of bounds (index was "+index+", array size is "+cardinalities.toString+")")
            }
        }
        // Return element at the given index
        val oneDimIndex = getOneDimensionalIndex(index)
        return elements.get(oneDimIndex)
    }
    
    /**
     * Sets the value for the given index.
     * 
     * @param index The index
     * @param value The new value
     */
    public def Object set(List<Integer> index, Object value) {
        val oneDimIndex = getOneDimensionalIndex(index)
        val newArrayElement = new NDimensionalArrayElement(value, index) 
        elements.set(oneDimIndex, newArrayElement)
    }
    
    /**
     * Returns the one dimensional index for the given multidimensional index.
     * 
     * For instance consider the n dimensional array of size [2][3].
     * The elements are numbered [0][0], [0][1], [0][2], [1][0], [1][1], [1][2]
     * and saved in this order in the one dimensional array.
     * Thus this method returns 3 for the list of indices #[1,0] in this example.
     * 
     * @param indices The multidimensional index
     * @return the index of the element in the one dimensional array
     */
    private def int getOneDimensionalIndex(List<Integer> indices) {
        // TODO: This method does not have constant runtime. Thus accessing/setting an element is not in constant time.
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
    
    /**
     * Clones an object
     */
    public override NDimensionalArray clone() {
        val arr = new NDimensionalArray(elements.map[NDimensionalArrayElement.getCloneOfValue(it.value)], cardinalities.clone)
        for(var i = 0; i < elements.size; i++) {
            val oldElem = elements.get(i)
            val newElem = arr.elements.get(i)
            newElem.userValue = NDimensionalArrayElement.getCloneOfValue(oldElem.userValue)
        }
        return arr 
    }
    
    /**
     * Checks whether this array is empty.
     */
    public def boolean isEmpty() {
        return elements.isNullOrEmpty
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
     * 
     * @param other The other object
     * @return true if they are equal, false otherwise
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
     * {@inheritDoc}
     */
    public static def <T> String toString(T[] arr) {
        return "["+arr.map[it.toString].join(", ")+"]"
    }
}