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
package de.cau.cs.kieler.sccharts.ide.simulation

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.ide.visualization.AbstractDiagramHighlighter

import static de.cau.cs.kieler.sccharts.ide.synthesis.EquationSynthesisProperties.*
import com.google.inject.Inject

/**
 * FIXME This class is instantiated via bundle start!
 * 
 * @author ssm
 * @kieler.design 2017-10-05 proposed
 * @kieler.rating 2017-10-05 proposed yellow
 *
 */
class SCChartsDiagramLiveValues extends AbstractDiagramHighlighter {
    
    @Inject extension SCChartsScopeExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsSerializeHRExtensions
    
    protected val triggerEdgeMap = <Expression, KEdge> newLinkedHashMap
    protected val valuedObjectTextMap = <ValuedObject, KText> newLinkedHashMap
    protected val actionTextMap = <Expression, KText> newLinkedHashMap
    protected val wireTextMap = <Expression, KText> newLinkedHashMap
    
    private var LightDiagramLayoutConfig layoutConfig = null
    
    /**
     * Normally only the current simulation data pool is updated.
     * However, if the simulation is playing too fast, no update will be shown at all.
     * This is a threshold in ms to perform an update anyway, even if the data pool to display is not the most current.
     */
    private static val MAX_UPDATE_PAUSE = 1000
    
    private var long lastUpdateTime
    
    override getName() {
        return "SCCharts Live Values"
    }
    
    def isSupported(SimulationContext ctx) {
        val compileCtx = ctx.sourceCompilationContext
        return compileCtx !== null && compileCtx.originalModel instanceof SCCharts
    }
    
    override initialize(SimulationContext ctx) {
        super.initialize(ctx)
        
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
                    if (rectangle !== null) {
                        val text = rectangle.children.filter(KText).filter[
                            text.equals(valuedObject.name) 
                            || text.startsWith(valuedObject.name + " ")  
                        ].head
                        valuedObjectTextMap.put(valuedObject, text)
                    }
                }
            }
            
            for (action : scope.actions) {
                for (valuedObjectReference : action.trigger.allReferences) {
                    val rectangle = diagramViewContext.getTargetElements(action).filter(KRectangle).head
                    if (rectangle !== null) {
                        val text = rectangle.children.filter(KText).filter[ text.contains(valuedObjectReference.valuedObject.name) ].head
                        actionTextMap.put(valuedObjectReference, text)
                    }
                }
            }
            
            if (scope instanceof DataflowRegion) {
                var node = diagramViewContext.getTargetElements(scope).filter(KNode).head
                var nodes = node.children.filter[getProperty(INPUT_FLAG) || getProperty(OUTPUT_FLAG)]
                for (n : nodes) {
                    val voRef = diagramViewContext.getSourceElement(n)
                    if( voRef instanceof ValuedObjectReference){
                        val polygon = n.data.filter(KPolygon).head //.filter(KRectangle).head
                        val text = polygon.children.filter(KText).filter[ text.contains(voRef.asValuedObjectReference.valuedObject.name) ].head
                        wireTextMap.put(voRef.asValuedObjectReference, text)
                    }
                }            
            }
            
        }
        
        lastUpdateTime = System.currentTimeMillis
        update(ctx)
        
        layoutConfig = new LightDiagramLayoutConfig(diagramViewContext)
        layoutConfig.zoomStyle(ZoomStyle.NONE)
        layoutConfig.performLayout
    }    
    
    override stop(SimulationContext ctx) {
        super.stop(ctx)
        
        null.insertLiveTransitionValues
        null.insertLiveDeclarationValues
        null.insertLiveActionValues
        null.insertLiveWireValues
        
        layoutConfig?.performLayout
    }    
    
    override update(SimulationContext ctx) {
        super.update(ctx)
        val pool = ctx.dataPool
        
        // Only show the values of the current data pool in the simulation.
        // From time to time perform an update anyway.
        if(System.currentTimeMillis > (lastUpdateTime+MAX_UPDATE_PAUSE)) {
            pool.insertLiveTransitionValues
            pool.insertLiveDeclarationValues
            pool.insertLiveActionValues
            pool.insertLiveWireValues
            lastUpdateTime = System.currentTimeMillis
        }
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
            if (text !== null) text.text = valuedObject.reference.modifyTriggerText(text.text, pool)
        }
    }
    
    protected def insertLiveActionValues(DataPool pool) {
        for (valuedObjectReference : actionTextMap.keySet) {
            val text = actionTextMap.get(valuedObjectReference)
            text.text = valuedObjectReference.modifyTriggerText(text.text, pool)
        }
    }
    
    protected def insertLiveWireValues(DataPool pool) {
        for (valuedObjectReference : wireTextMap.keySet) {
            val text = wireTextMap.get(valuedObjectReference)
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
                    val variable = pool.entries.get(serialization)   
                    if (variable !== null) {        
                        val variableValue = variable.rawValue.toString
                        triggerString = triggerStringFront + " (" + variableValue + ")" + triggerStringEnd
                    }
                } else {
                    triggerString = triggerStringFront + triggerStringEnd
                }
            }
        }            
        return if (effectString.nullOrEmpty) triggerString else triggerString + " / " + effectString
    } 
    
}
															