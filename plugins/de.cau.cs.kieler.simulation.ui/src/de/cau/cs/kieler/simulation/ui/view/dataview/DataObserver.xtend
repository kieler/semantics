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
package de.cau.cs.kieler.simulation.ui.view.dataview

import com.google.gson.JsonArray
import com.google.gson.JsonNull
import com.google.gson.JsonObject
import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.SimulationContext
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataObserver {

    @Accessors val variables = <String> newLinkedHashSet
//    @Accessors val liveVariables = <Variable> newLinkedHashSet
//    @Accessors val originMap = <Variable, Variable> newHashMap
    
    @Accessors var DataCanvas canvas 
    @Accessors var boolean numberDomain
    
    @Accessors(PUBLIC_GETTER)
    protected var SimulationContext context
    protected var DataView dataView
    protected var Composite compositeParent
    protected val DataObserver instance
    
    public var maxValue = 1
    public var minValue = 0
    
    new(Composite parent, DataView dataView) {
        this.compositeParent = parent
        this.dataView = dataView
        instance = this
    }
        
    def createCanvas() {
        canvas = new DataCanvas(compositeParent, SWT.NONE, dataView, this)
        
        compositeParent.layout(true)
        compositeParent.update        
    }
    
    def void addVariable(String variable, DataPoolEntry entry) {
        if (variable === null) return;
        variables.add(variable)
        numberDomain = numberDomain || entry.numberDomain
        checkMinMaxValues(true)

        canvas.addVariable(variable)
        compositeParent.layout(true)
        compositeParent.update
    }
    
    def hasVariable(String variable) {
        variables.contains(variable)
    }
    
    def resetValues() {
        maxValue = 1
        minValue = 0
    }
    
    def updateValues(SimulationContext context) {
        this.context = context
        checkMinMaxValues(false)
        
        if (canvas !== null && !canvas.disposed) canvas.redraw
    }
     
    protected def checkMinMaxValues(boolean all) {
        if (!numberDomain || context === null) return
        
        val iter = (context.dataPool.entries.entrySet.filter[variables.contains(key)])
        for (entry : iter) {
            if (all && context.history.size > 0) {
                val max = entry.key.history.filterNull.max
                val min = entry.key.history.filterNull.min
                if (max > maxValue) maxValue = max.intValue
                if (min < minValue) minValue = min.intValue
            } else {
                val value = (entry.value.getTypedValue(null) as Number).intValue
                
                if (value > maxValue) maxValue = value
                if (value < minValue) minValue = value
            }
        }
    }
    
    def static isNumberDomain(DataPoolEntry entry) {
        return entry !== null && entry.getTypedValue(null) instanceof Number
    }
    
    def getHistory(String name) {
        return context.history.reverseIterator.map[
            val entry = entries.get(name)
            var double value = 0
            if (entry !== null) {
                val json = entry.rawValue
                value = switch(json) {
                    JsonNull: 0
                    JsonObject: json.size
                    JsonArray: json.size
                    JsonPrimitive: {
                        switch (json) {
                            case json.isNumber: json.asNumber.doubleValue
                            case json.isBoolean: if (json.asBoolean) 1 else 0
                            case json.isString: json.toString.length
                        } 
                    }
                }
            }
            return value
        ]
    }
    
}
