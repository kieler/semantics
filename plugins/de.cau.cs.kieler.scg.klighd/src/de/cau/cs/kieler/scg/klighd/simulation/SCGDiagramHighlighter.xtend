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
package de.cau.cs.kieler.scg.klighd.simulation

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.ide.klighd.models.ModelChain
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.ui.visualization.DiagramHighlighter
import java.util.List

class SCGDiagramHighlighter extends DiagramHighlighter {
    
    @Inject extension KEffectsExtensions 
    @Inject extension SCGControlFlowExtensions  
    
    /**
     * Single instance.
     */
    static var SCGDiagramHighlighter instance
    
    protected var List<Node> activeNodes = <Node> newArrayList
    
    static val KForeground TRAVERSED_ELEMENT_STYLE = createTraversedElementStyle
    static val KForeground CURRENT_ELEMENT_STYLE = createCurrentStateStyle


    private new() {
        Guice.createInjector().injectMembers(this)
    }
    
    static def create() {
        if(instance === null) {
            instance = new SCGDiagramHighlighter
        }
        instance
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "SCG Highlighter"
    }
    
    def isSupported(SimulationContext ctx) {
        val compileCtx = ctx.sourceCompilationContext
        return compileCtx !== null 
    }
    
    /**
     * {@inheritDoc}
     */
    override initialize(SimulationContext ctx) {
        super.initialize(ctx)
        activeNodes.clear
        update(ctx)
    }
    
    /**
     * {@inheritDoc}
     */
    override update(SimulationContext ctx) {
        super.update(ctx)
        val pool = ctx.dataPool
        
        unhighlightDiagram      
        
        if (pool === null && !ctx.isSupported) 
            return;
            
        var SCGraph scg
        val currentDiagramModel = diagramViewContext.inputModel
        if(currentDiagramModel instanceof SCGraphs) {
            if(!currentDiagramModel.scgs.isEmpty) {
                scg = currentDiagramModel.scgs.get(0)
            }            
        } else if (currentDiagramModel instanceof ModelChain) {
            val scgs = currentDiagramModel.models.findFirst[ it instanceof SCGraphs ] as SCGraphs
            if (scgs !== null && scgs.scgs !== null && !scgs.scgs.empty) {
                scg = scgs.scgs.head
            }
        }
        if(scg === null) 
            return;

        // Calculate the simulation controlflow to determine what must be highlighted
        scg.calculateActiveNodes(ctx)
        val activeNodesHighlighting = getHighlighting(activeNodes, CURRENT_ELEMENT_STYLE)
                                           
        highlightDiagram(activeNodesHighlighting)
    }
    
    def calculateActiveNodes(SCGraph scg, SimulationContext ctx) {
        val pool = ctx.dataPool
        
        activeNodes.clear
        val activeEntries = <String> newHashSet
        
        val entries = pool.entries
        for(entry : entries.values) {
            val value = entry.getTypedValue
            if (value instanceof Boolean) {
                if (value.booleanValue) {
                    if (entry.name.startsWith("_g") && !entry.name.contains("_e")) {
                        val lastChar = entry.name.charAt(entry.name.length-1)
                        if (lastChar >= '0' && lastChar <= '9') {
                            activeEntries += "_g" + (Integer.parseInt(entry.name.substring(2)) - 1)
                        }
                    }
                    
                }
            }
        }
        
        for(node : scg.nodes) {
            if (node instanceof Assignment) {
                var nodeName = ""
                if (node.reference instanceof ValuedObjectReference) {
                    nodeName = (node.reference as ValuedObjectReference).valuedObject.name
                }
                if (activeEntries.contains(nodeName)) {
                    activeNodes += node
                }
            }
            if (node instanceof Conditional) {
                if (node.condition instanceof ValuedObjectReference) {
                    val VOName = (node.condition as ValuedObjectReference).valuedObject.name
                    if (activeEntries.contains(VOName)) {
                        activeNodes += node
                        var nextNode = node.then.target as Node
                        while(nextNode.getAllPrevious.size <= 1) {
                            activeNodes += nextNode    
                            nextNode = nextNode.allNext.map[ target ].filter(Node).head
                        }
                    }
                }
            }
        }
    }

    private static def KForeground createTraversedElementStyle() {
        val style = KRenderingFactory.eINSTANCE.createKForeground()
        style.setColor(Colors.DODGER_BLUE)
        style.setPropagateToChildren(true)
        return style
    }
    
    private static def KForeground createCurrentStateStyle() {
        val style = KRenderingFactory.eINSTANCE.createKForeground()
        style.setColor(Colors.RED)
        style.setPropagateToChildren(true)
        return style
    }

}
							