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
package de.cau.cs.kieler.simulation.handlers

import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.trace.KTraceStandaloneSetup
import de.cau.cs.kieler.simulation.trace.ktrace.Tick
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.resource.XtextResourceSet

import static com.google.common.base.Preconditions.*
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.DoubleValue
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.StringValue

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TraceDataProvider {

    @Accessors(PUBLIC_GETTER) val IFile sourceFile;
    val List<DataPool> tracePool

    new(IFile file, int traceNumber) {
        this.sourceFile = file

        val resourceSet = KTraceStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        val uri = URI.createFileURI(file.fullPath.toOSString)
        val resource = resourceSet.getResource(uri, true)
        val traceFile = resource.getContents().head as TraceFile
        checkArgument(traceNumber >= 0 && traceNumber < traceFile.traces.size)
        val trace = traceFile.traces.get(traceNumber)
        this.tracePool = newArrayOfSize(trace.ticks.size)
        trace.fillTracePool
    }

    new(TraceFile traceFile, int traceNumber) {
        this.sourceFile = null

        checkArgument(traceNumber >= 0 && traceNumber < traceFile.traces.size)
        val trace = traceFile.traces.get(traceNumber)
        this.tracePool = newArrayOfSize(trace.ticks.size)
        trace.fillTracePool
    }

    private def fillTracePool(de.cau.cs.kieler.simulation.trace.ktrace.Trace trace) {
        for (Tick t : trace.ticks) {
            val pool = new DataPool()
            val model = new Model("Model")
            pool.addModel(model)
            // Add inputs
            for (Effect e : t.inputs) {
                val variable = e.convert
                variable.setIsInput(true)
                model.addVariable(variable)
            }
            // Add outputs
            for (Effect e : t.outputs) {
                val variable = e.convert
                variable.setIsOutput(true)
                model.addVariable(variable)
            }
            tracePool.add(pool)
        }
    }

    private def Variable convert(Effect e) {
        switch(e) {
            Emission: {
                val v = new Variable(e.valuedObject.name)
                if (e.newValue !== null) {
                    v.setValue(e.newValue.convert)
                } else {
                    // TODO set other inputs/outpu signals to false?
                    v.setValue(true)
                }
                return v
            }
            Assignment: throw new UnsupportedOperationException("Not yet supported.")
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
