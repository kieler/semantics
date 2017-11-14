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
package de.cau.cs.kieler.kexpressions.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.IntValue
import java.util.Iterator
import java.util.List
import org.eclipse.emf.common.util.EList

/**
 * @author aas
 *
 */
class KExpressionsArrayExtensions {
    @Inject
    extension KExpressionsCreateExtensions
    
    /**
     * Returns a list of the array indices that can be accessed given an array of this cardinality.
     */
    def Iterable<List<Integer>> getIndexIterable(EList<Expression> cardinalities) {
        if(cardinalities.isNullOrEmpty) {
            return null
        }
        return new ArrayIndexIterable(cardinalities)
    }
    
    /**
     * Converts the given list of integers to a list of expressions,
     * such that they can be set for example as indices of an assignment.
     */
    def List<Expression> convert(List<Integer> list) {
        val result = newArrayList
        for(i : list) {
            result.add(createIntValue(i))
        }
        return result
    }
    
    /**
     * Calculates the array indices that can be accessed in an array of the given cardinalities.
     */
    static class ArrayIndexIterable implements Iterable<List<Integer>> {
        private val List<Integer> cardinalities
        
        new (EList<Expression> cardinalities) {
            this.cardinalities = cardinalities.convert
        }
        
        override iterator() {
            return new ArrayIndexIterator(cardinalities)
        }
        
        private def List<Integer> convert(EList<Expression> expressions) {
            if(expressions === null) {
                return null
            } if(expressions.isEmpty) {
                return #[]
            }
            val result = <Integer>newArrayList
            for(e : expressions) {
                result.add(e.convert)
            }
            return result
        }
        
        private def Integer convert(Expression e) {
            if(e instanceof IntValue) {
                return e.value
            }
            throw new IllegalArgumentException("The ArrayIndexIterator can only handle int values as cardinalities")
        }
    }
    
    /**
     * Calculates the array indices that can be accessed in an array of the given cardinalities.
     */
    static class ArrayIndexIterator implements Iterator<List<Integer>> {
        private val List<Integer> cardinalities
        private var List<Integer> currentIndex
        private var int oneDimSize
        private var int oneDimIndex
        
        new (List<Integer> cardinalities) {
            this.cardinalities = cardinalities
            if(!this.cardinalities.isNullOrEmpty) {
                oneDimSize = this.cardinalities.fold(1, [a,b | a*b])
                currentIndex = newArrayList
                for(c : this.cardinalities) {
                    currentIndex.add(0)
                }
            }
        }
        
        override hasNext() {
            if(cardinalities.isNullOrEmpty) {
                return false
            }
            return oneDimIndex < oneDimSize
        }
        
        override next() {
            if(cardinalities.isNullOrEmpty) {
                return null
            }
            if(oneDimIndex == 0) {
                // The very first index is already computed in the constructor
                oneDimIndex++;
                return currentIndex
            } else {
                // Increase current index ripple carry style
                oneDimIndex++;
                for(var dimension = cardinalities.size-1; dimension >= 0; dimension--) {
                    val currentIndexOfDimension = currentIndex.get(dimension)
                    val cardinalityOfDimension = cardinalities.get(dimension)
                    if(currentIndexOfDimension < cardinalityOfDimension-1) {
                        currentIndex.set(dimension, currentIndexOfDimension+1)
                        // Exit loop
                        return currentIndex
                    } else {
                        // Set this dimension back to 0 and checkout the next more significant dimension
                        currentIndex.set(dimension, 0)
                    }
                }
            }
        }
    }
}