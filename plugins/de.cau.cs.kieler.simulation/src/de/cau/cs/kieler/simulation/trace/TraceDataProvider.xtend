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
package de.cau.cs.kieler.simulation.trace

import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.DoubleValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.trace.ktrace.Tick
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.resource.XtextResourceSet

import static com.google.common.base.Preconditions.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TraceDataProvider {

    @Accessors(PUBLIC_GETTER) val IFile sourceFile;
    val List<DataPool> tracePool

    @Accessors(PUBLIC_GETTER)
    var traceSemantics = TraceSemantics.EMISSION

    new(IFile file, int traceNumber) {
        this.sourceFile = file

        val traceFile = file.loadTraceFile
        checkArgument(traceNumber >= 0 && traceNumber < traceFile.traces.size)
        val trace = traceFile.traces.get(traceNumber)
        this.tracePool = new ArrayList(trace.ticks.size)
        trace.fillTracePool
    }

    new(TraceFile traceFile, int traceNumber) {
        this.sourceFile = null

        checkArgument(traceNumber >= 0 && traceNumber < traceFile.traces.size)
        val trace = traceFile.traces.get(traceNumber)
        this.tracePool = new ArrayList(trace.ticks.size)
        trace.fillTracePool
    }
    
    static def loadTraceFile(IFile file) {
        val resourceSet = KTraceStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        val uri = URI.createPlatformResourceURI(file.fullPath.toOSString, true)
        val resource = resourceSet.getResource(uri, true)
        return resource.getContents().head as TraceFile
    }

    private def fillTracePool(Trace trace) {
        for (Tick t : trace.ticks) {
            val pool = new DataPool()
            val model = new Model("Model")
            pool.addModel(model)
            // Add inputs
            for (Effect e : t.inputs) {
                val variable = e.convert(pool)
                variable.setIsInput(true)
                model.addVariable(variable)
            }
            // Add outputs
            for (Effect e : t.outputs) {
                val variable = e.convert(pool)
                variable.setIsOutput(true)
                model.addVariable(variable)
            }
            tracePool.add(pool)
        }
    }

    private def Variable convert(Effect e, DataPool pool) {
        switch(e) {
            Emission: {
                traceSemantics = TraceSemantics.EMISSION
                val varName = e.reference.valuedObject.name
                var v = pool.getVariable(varName)
                if(v === null) {
                    v = new Variable(varName)
                }
                if (e.newValue !== null) {
                    v.setValue(e.newValue.convert)
                } else {
                    // TODO set other inputs/outpu signals to false?
                    v.setValue(true)
                }
                return v
            }
            Assignment: {
                traceSemantics = TraceSemantics.ASSIGNMENT
                val valuedObject = e.reference.valuedObject
                val varName = valuedObject.name
                var v = pool.getVariable(varName)
                if(v === null) {
                    v = new Variable(varName)
                }
                // Set the variable value
                val arrayIndices = e.reference.indices
                val newValue = e.expression.convert
                if(arrayIndices.nullOrEmpty) {
                    v.setValue(newValue)
                } else {
                    val convertedArrayIndices = <Integer>newArrayList
                    for(card : arrayIndices) {
                        if(card instanceof IntValue) {
                            convertedArrayIndices.add(card.value)
                        } else {
                            throw new Exception("Only integers are supported for array indices in traces at the moment.")
                        }
                    } 
                    setArrayValueDynamically(v, convertedArrayIndices, newValue)
                }
                return v    
            }
        }
    }
    
    private def void setArrayValueDynamically(Variable v, List<Integer> index, Object value) {
        // Compute the minimum one dimensional array size
        // e.g. 6 for the assignment 'Y[2][1]=2'
        val oneDimArraySize = index.reduce[a,b | (a+1) * (b+1)]
        if(v.value === null || !(v.value instanceof NDimensionalArray)) {
            val arr = new NDimensionalArray(newArrayOfSize(oneDimArraySize).toList, index)
            arr.set(index, value)
            v.value = arr
        } else {
            val arr = v.value as NDimensionalArray
            // Check if the index that should be set actually fits into the current array of the variable.
            var fits = true
            for(var dimension=0; dimension < index.size; dimension++) {
                // +1 here, because the array cardinalities are the ones of a declaration,
                // whereas the others are the ones from a usage (i.e. int x[3][2]   vs   x[2][1]=3)
                if(arr.cardinalities.get(dimension) < (index.get(dimension)+1) ) {
                    fits = false
                }
            }
            if(fits) {
                arr.set(index, value)
            } else {
                // The current array does not have the field that should be set.
                // Thus we create a new one that has this filed and copy the old array values.
                val newCardinalities = <Integer> newArrayList
                for(var dimension=0; dimension < index.size; dimension++) {
                    newCardinalities.add(Math.max(arr.cardinalities.get(dimension), (index.get(dimension)+1) ))
                }
                val newOneDimArraySize = newCardinalities.reduce[a,b | a*b]
                val newArr = new NDimensionalArray(newArrayOfSize(newOneDimArraySize).toList, newCardinalities)
                // Copy old values
                for(e : arr.elements) {
                    newArr.set(e.index, e.value)
                }
                // Set new value
                newArr.set(index, value)
                v.value = newArr
            }
        }
    }
    
    private def Object convert(Expression e) {
        if (e instanceof Value) {
            switch(e) {
                BoolValue: return e.value
                IntValue: return e.value
                FloatValue: return e.value
                DoubleValue: return e.value
                StringValue: return e.value
            }
        } else if (e instanceof OperatorExpression){
            if (e.operator == OperatorType.SUB && e.subExpressions.size == 1) {
                val value = e.subExpressions.head.convert
                switch (value) {
                    Integer,: return -value
                    Float: return -value
                    default: throw new UnsupportedOperationException("Cannot negate non number value.")
                }
            } else {
                throw new UnsupportedOperationException("Not yet supported.")
            }
        } else {
            throw new UnsupportedOperationException("Not yet supported.")
        }
    }

    def getDataPool(int number) {
        tracePool.get(number)
    }

    def traceLength() {
        tracePool.size
    }

    def getFilePath() {
        if (sourceFile !== null) {
            return sourceFile.projectRelativePath.toOSString
        } else {
            return "unknown file location"
        }
    }

}
