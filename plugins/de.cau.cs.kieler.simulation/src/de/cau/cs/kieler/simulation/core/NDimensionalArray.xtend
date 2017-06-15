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
package de.cau.cs.kieler.simulation.core

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class NDimensionalArray implements Cloneable{
    
    @Accessors(PUBLIC_GETTER)
    private var Integer[] indices;
    
    @Accessors(PUBLIC_GETTER)
    private var List<NDimensionalArrayElement> elements = newArrayList();
    
    new(List<Object> values, Integer... indices) {
        this.indices = indices
        
        val Integer[] index = newArrayOfSize(dimension)
        for(var i = 0; i < index.length; i++) {
            index.set(i, 0);
        }
        
        for(v : values) {
            val elem = new NDimensionalArrayElement(v, index)
            elements += elem
            
            // Increase index ripple-carry-style
            var d = dimension-1; // "least significant dimension"
            index.set(d, index.get(d)+1)
            while(d > 0 && index.get(d) >= indices.get(d)) {
                index.set(d, 0)
                d--
                index.set(d, index.get(d)+1)
            }
        }
    }
    
    public def int getDimension() {
        return indices.length;
    }
    
    public def int getLength(int dimension) {
        return indices.get(dimension);
    }
    
    public def Object get(int... indices) {
        return elements.get(getOneDimensionalIndex(indices)).value
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
        val arr = new NDimensionalArray(elements.map[it.cloneOfValue], indices.clone)
        return arr 
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        val values = elements.map[it.value]
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
}