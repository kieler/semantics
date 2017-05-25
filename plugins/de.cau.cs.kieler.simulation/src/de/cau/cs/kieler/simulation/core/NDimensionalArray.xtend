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
class NDimensionalArray {
    
    @Accessors
    private var Integer[] indices;
    
    @Accessors
    private var List<NDimensionalArrayElement> elements = newArrayList();
    
    new(List<Object> values, Integer... indices) {
//        println("indices:"+indices.map[it.intValue])
//        println(values)
        this.indices = indices
        
        val Integer[] index = newArrayOfSize(dimension)
        for(var i=0; i < index.length; i++) {
            index.set(i, 0);
        }
        
        for(v : values) {
            val elem = new NDimensionalArrayElement(v, index)
            elements += elem
            
//            println("index:"+index.map[it.intValue+" "])
            // Increase index ripple-carry-style
            var d = dimension-1; // "least significant dimension"
            index.set(d, index.get(d)+1)
            while(index.get(d) > indices.get(d)) {
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
    
    override toString() {
        val values = elements.map[it.value]
        return values.toString()
    }
}