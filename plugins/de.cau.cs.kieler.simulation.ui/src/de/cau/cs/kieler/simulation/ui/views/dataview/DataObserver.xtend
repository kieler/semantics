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
package de.cau.cs.kieler.simulation.ui.views.dataview

import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.SWT
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.core.VariableType
import de.cau.cs.kieler.simulation.core.DataPool

/**
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataObserver {

    @Accessors val variables = <Variable> newLinkedHashSet
    @Accessors val liveVariables = <Variable> newLinkedHashSet
    @Accessors val originMap = <Variable, Variable> newHashMap
    
    @Accessors var DataCanvas canvas 
    @Accessors var VariableType domain
    
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
    
    def addVariable(Variable variable) {
        if (variable === null) return;
        variables += variable
        
        canvas.addVariable(variable)
        compositeParent.layout(true)
        compositeParent.update
    }
    
    def hasVariable(Variable variable) {
        variables.contains(variable)
    }
    
    def hasDomain(VariableType type) {
        variables.exists[ it.type == type ]
    }
    
    def resetValues(DataPool pool) {
        maxValue = 1
        minValue = 0
    }
    
    def updateValues(DataPool pool) {
        liveVariables.clear
        originMap.clear
        for (v : variables) {
            val live = pool.getVariable(v.name)
            liveVariables += live
            originMap.put(live, v)
            checkMinMaxValues(live)
        }
        
        canvas.redraw
    }
    
    def double getVariableValue(Variable variable) {
        var double value = 0
        switch(variable.value) {
        Integer: value = (variable.value as Integer).intValue
        Double: value = (variable.value as Double).doubleValue as double
        Float: value = (variable.value as Float).floatValue as float
        Boolean: value = if ((variable.value as Boolean).booleanValue) 1 else 0
        default: value = 1
        }        
        return value
    }
    
    def getVariableIntValue(Variable variable) {
        variable.getVariableValue as int
    }
    
    protected def checkMinMaxValues(Variable variable) {
        if (!(domain == VariableType.INT || domain == VariableType.FLOAT)) return
        val value = variable.getVariableIntValue
        
        if (value > maxValue) maxValue = value
        if (value < minValue) minValue = value
    }
}