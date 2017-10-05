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
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.ui.highlighting.DiagramHighlighter
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * 
 * @author ssm
 * @kieler.design 2017-10-05 proposed
 * @kieler.rating 2017-10-05 proposed yellow
 *
 */
class SCChartsDiagramLiveValues extends DiagramHighlighter {
    
    extension SCChartsScopeExtensions sccScopeExtensions = new SCChartsScopeExtensions
    extension KExpressionsValuedObjectExtensions kexpressionsValuedObjectRExtensions = new KExpressionsValuedObjectExtensions
    extension SCChartsSerializeHRExtensions serializeHRExtension = new SCChartsSerializeHRExtensions
    
    private static var SCChartsDiagramLiveValues instance
    
    protected val triggerEdgeMap = <Expression, KEdge> newLinkedHashMap
    protected val valuedObjectTextMap = <ValuedObject, KText> newLinkedHashMap
    protected val actionTextMap = <Expression, KText> newLinkedHashMap
    
    private var LightDiagramLayoutConfig layoutConfig = null
    
    new() {
        super()
        // Remove old instance if any
        if(instance != null) {
            SimulationManager.removeListener(instance.simulationListener)
        }
        // Remember single instance
        instance = this
    }
    
    override protected isSupported(Object model) {
        model instanceof SCCharts
    }
    
    override initialize(DataPool pool) {
        super.initialize(pool)
        
        val model = diagramViewContext.inputModel as SCCharts
        val allScopes = model.rootStates.head.allScopes
        for (scope : allScopes.toIterable) {
            if (scope instanceof State) {
                for (transition : scope.outgoingTransitions.filter[ trigger !== null ]) {
                    val trigger = transition.trigger
                    val edge = diagramViewContext.getTargetElements(transition).filter(KEdge).head
                    triggerEdgeMap.put(trigger, edge)
                }
            } 
            
            for (declaration : scope.declarations) {
                for (valuedObject : declaration.valuedObjects) {
                    val rectangle = diagramViewContext.getTargetElements(declaration).filter(KRectangle).head
                    val text = rectangle.children.filter(KText).filter[ text.contains(valuedObject.name) ].head
                    valuedObjectTextMap.put(valuedObject, text)
                }
            }
            
            for (action : scope.actions) {
                for (valuedObjectReference : action.trigger.allReferences) {
                    val rectangle = diagramViewContext.getTargetElements(action).filter(KRectangle).head
                    val text = rectangle.children.filter(KText).filter[ text.contains(valuedObjectReference.valuedObject.name) ].head
                    actionTextMap.put(valuedObjectReference, text)
                }
            }
        }
        
        update(pool)
        
        layoutConfig = new LightDiagramLayoutConfig(diagramViewContext)
        layoutConfig.performLayout
    }    
    
    override stop() {
        super.stop()
        
        null.insertLiveTransitionValues
        null.insertLiveDeclarationValues
        null.insertLiveActionValues
        
        layoutConfig.performLayout
    }    
    
    override update(DataPool pool) {
        super.update(pool)
        
        pool.insertLiveTransitionValues
        pool.insertLiveDeclarationValues
        pool.insertLiveActionValues
    }
    
    protected def insertLiveTransitionValues(DataPool pool) {
        for (trigger : triggerEdgeMap.keySet) {
            val edge = triggerEdgeMap.get(trigger)
            val label = edge.labels.head
            label.text = trigger.modifyTriggerText(label.text, pool)
        }        
    }   
    
    protected def insertLiveDeclarationValues(DataPool pool) {
        for (valuedObject : valuedObjectTextMap.keySet) {
            val text = valuedObjectTextMap.get(valuedObject)
            text.text = valuedObject.reference.modifyTriggerText(text.text, pool)
        }
    }
    
    protected def insertLiveActionValues(DataPool pool) {
        for (valuedObjectReference : actionTextMap.keySet) {
            val text = actionTextMap.get(valuedObjectReference)
            text.text = valuedObjectReference.modifyTriggerText(text.text, pool)
        }
    }
    
    protected def String modifyTriggerText(Expression trigger, String text, DataPool pool) {
        var triggerString = if (text.contains("/")) text.substring(0, text.indexOf("/") - 1) else text
        var effectString = if (text.contains("/")) text.substring(text.indexOf("/") + 2) else ""
        for (reference : trigger.allReferences) {
            val serialization = reference.serializeHR.toString
            if (triggerString.contains(serialization)) {
                val triggerStringFront = triggerString.substring(0, triggerString.indexOf(serialization) + serialization.length)
                val triggerStringIntermediateEnd = triggerString.substring(triggerStringFront.length)
                val triggerStringEnd = if (triggerStringIntermediateEnd.contains(")")) 
                    triggerStringIntermediateEnd.substring(triggerStringIntermediateEnd.indexOf(")") + 1) else
                    triggerStringIntermediateEnd
                
                if (pool !== null) {
                    val variable = pool.getVariable(serialization)                    
                    val variableValue = variable.value.toString
                    triggerString = triggerStringFront + " (" + variableValue + ")" + triggerStringEnd
                } else {
                    triggerString = triggerStringFront + triggerStringEnd
                }
            }
        }            
        return if (effectString.nullOrEmpty) triggerString else triggerString + " / " + effectString
    } 
    
}