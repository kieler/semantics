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
package de.cau.cs.kieler.kicool.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import java.util.Map
import de.cau.cs.kieler.kicool.compilation.RuntimeSystems
import de.cau.cs.kieler.klighd.krendering.KForeground

import static extension org.eclipse.xtext.EcoreUtil2.* 
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KBackground
import de.cau.cs.kieler.kicool.compilation.observer.AbstractProcessorNotification
import de.cau.cs.kieler.kicool.compilation.ProcessorStatus
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KColoring
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ColorStore.*
import static de.cau.cs.kieler.kicool.ui.synthesis.ColorStore.Color.*
import static de.cau.cs.kieler.kicool.ui.synthesis.ColorSystem.*
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorProgress
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.uniqueProcessorId
import de.cau.cs.kieler.kicool.compilation.observer.AbstractCompilationNotification
import static extension de.cau.cs.kieler.kicool.environments.Environment.*
import static extension de.cau.cs.kieler.kicool.compilation.Metric.*
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectIntermediateAction
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.environments.Snapshots
import static extension de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.INTERMEDIATE_DATA
import static extension de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.TOGGLE_ON_OFF_DATA
import static extension de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.PROCESSOR_IDENTIFIER
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KShapeLayout
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.ui.synthesis.feedback.PostUpdateDoubleCollector
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.kicool.ui.synthesis.actions.ToggleProcessorOnOffAction
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.getSystem
import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import de.cau.cs.kieler.kicool.ui.synthesis.actions.ToggleOnOffData
import static extension de.cau.cs.kieler.kicool.compilation.Metric.METRIC
import java.util.Locale
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.kicool.ProcessorReference

/**
 * The data manager handles all synthesis updates.
 * 
 * @author ssm
 * @kieler.design 2017-02-27 proposed 
 * @kieler.rating 2017-02-27 proposed yellow
 */
class ProcessorDataManager {
    
    @Inject extension KNodeExtensions
    
    static val NODE_PROCESSOR_BODY = "processorbody"
    static val NODE_ACTIVITY_STATUS = "status"
    static val NODE_NAME = "name"
    static val NODE_PROGRESS = #["p1", "p2", "p3", "p4", "p5"]
    static val NODE_ENVIRONMENT = "environment"
    static val NODE_INTERMEDIATE = "intermediate"
    static val NODE_SOURCE = "sourcebody"
    static val NODE_ACTIVE = "active"
    
    static val INTERMEDIATE_KGT = "intermediate.kgt"
    
    static val INTERMEDIATE_NODE = KiCoolSynthesis.getKGTFromBundle(KiCoolUiModule.BUNDLE_ID, INTERMEDIATE_KGT)
    
    static def void populateProcessorData(ProcessorReference processorReference, KNode node) {
        node.setProperty(PROCESSOR_IDENTIFIER, processorReference)
        
        val rtProcessor = RuntimeSystems.getProcessorInstance(processorReference)
        
        val nodeIdMap = node.createNodeIdMap
        
        if (rtProcessor == null) {
            nodeIdMap.findNode(NODE_PROCESSOR_BODY).setFrameErrorColor
            nodeIdMap.findNode(NODE_NAME).label.text = processorReference.id.split("\\.").last
            return;
        }
        
        nodeIdMap.findNode(NODE_NAME).label.text = rtProcessor.name
        
        
        val toggleOnOffNode = nodeIdMap.findNode(NODE_ACTIVE)
        if (toggleOnOffNode != null) {
            toggleOnOffNode.container.addAction(Trigger::SINGLECLICK, ToggleProcessorOnOffAction.ID)
            toggleOnOffNode.setProperty(TOGGLE_ON_OFF_DATA, new ToggleOnOffData(processorReference))
            if (ToggleProcessorOnOffAction.deactivatedProcessors.contains(processorReference)) {
                setFBColor(getContainer(toggleOnOffNode), OFF)
            } else {
                setFBColor(getContainer(toggleOnOffNode), ON)
            }
        }
    }
    
    
    static def void resetSystem(AbstractCompilationNotification compilationNotification, KNode node, CompilerView view) {
        val allProcessors = compilationNotification.compilationContext.processorMap.keySet
        for(processor : allProcessors) {
            val processorNode = node.findNode(processor.uniqueProcessorId)    
            if (processorNode == null) {
                // This can happen because metrics are also listed in the processor map.
            } else {
                processorNode.resetProcessorNode(node)
            }
        }
        
        if (compilationNotification instanceof CompilationStart) {
            // Set source model
            val sourceNode = node.findNode(NODE_SOURCE)
            val processorUnit = compilationNotification.compilationContext.getFirstProcessorInstance
            sourceNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
            sourceNode.setProperty(INTERMEDIATE_DATA, 
                new IntermediateData(processorUnit, 
                    compilationNotification.compilationContext, 
                    compilationNotification.compilationContext.sourceModel, view
                ))
        }
    }
    
    static def void resetProcessor(AbstractProcessorNotification processorNotification, KNode node) {
        val processorReference = processorNotification.processorReference
        val processorInstance = processorNotification.processorInstance
        val processorNode = node.findNode(processorReference.uniqueProcessorId)
        if (processorNode == null) {
            System.err.println("There was an update notification for an non-existing processor (" + processorReference.uniqueProcessorId + 
                "). This should not happen. I'm very sorry.")
            return
        }
        
        processorNode.resetProcessorNode(node)
        
        val edges = processorNode.incomingEdges
        if (edges.size > 1) for (edge : edges) {
            val procId = edge.source.getProperty(PROCESSOR_IDENTIFIER)
            if (procId != null) {
                val proc = processorNotification.compilationContext.processorMap.get(procId)
                if (processorInstance.sourceEnvironment != proc.environment) {
                    edge.container.setFBColors(INACTIVE_ENVIRONMENT.color, INACTIVE_ENVIRONMENT.color, INACTIVE_ENVIRONMENT.color)
                    edge.container.children.filter(KPolygon).head.setFBColors(INACTIVE_ENVIRONMENT.color, INACTIVE_ENVIRONMENT.color, INACTIVE_ENVIRONMENT.color)
                } else {
                    edge.container.setFBColors(ACTIVE_ENVIRONMENT.color, ACTIVE_ENVIRONMENT.color, ACTIVE_ENVIRONMENT.color)
                    edge.container.children.filter(KPolygon).head.setFBColors(ACTIVE_ENVIRONMENT.color, ACTIVE_ENVIRONMENT.color, ACTIVE_ENVIRONMENT.color)
                }
            }
        } 
    }   
    
    static private def void resetProcessorNode(KNode processorNode, KNode node) {
        val nodeIdMap = processorNode.createNodeIdMap
        
        NODE_ACTIVITY_STATUS.getContainer(nodeIdMap).setFBColor(BUSY)
        for(i : 0..NODE_PROGRESS.length-1) {
            NODE_PROGRESS.get(i).getContainer(nodeIdMap).setFBAColor(PROGRESSBAR, 0)
        }
    } 
    
    static def void updateProcessor(AbstractProcessorNotification processorNotification, KNode node, CompilerView view) {
        val processorReference = processorNotification.processorReference
        val processorInstance = processorNotification.processorInstance
        val processorNode = node.findNode(processorReference.uniqueProcessorId)
        if (processorNode == null) {
            System.err.println("There was an update notification for an non-existing processor system (" + processorReference.uniqueProcessorId + 
                "). This should not happen. I'm sorry.")
            return
        }
        val nodeIdMap = processorNode.createNodeIdMap
        
        switch(processorInstance.environment.status) {
            case ERRORS: NODE_ACTIVITY_STATUS.getContainer(nodeIdMap).setFBColor(ERROR)
            case WARNINGS: NODE_ACTIVITY_STATUS.getContainer(nodeIdMap).setFBColor(WARNING)
        }
        
        val pTime = processorInstance.environment.getProperty(PTIME)
        var envText = "pTime: " + pTime + "ms"
        val mMetric = processorInstance.environment.getProperty(METRIC)
        if (mMetric != null) envText += "\nmMetric: " + String.format(Locale.US, "%.3f", mMetric as Double) 
        NODE_ENVIRONMENT.findNode(nodeIdMap).setLabel(envText)
        

        val intermediateRootNode = NODE_INTERMEDIATE.findNode(nodeIdMap)
        val intermediateKGT = INTERMEDIATE_NODE.copy
        intermediateRootNode.children.clear
        var intermediatePosX = 0.0f
        // Test for infos, warnings and errors
        // Test for snapshots
        val snapshots = processorInstance.environment.getProperty(SNAPSHOTS) as Snapshots
        if (snapshots!= null) {
            for(snapshot : snapshots) {
                val intermediateNode = intermediateKGT.copy
                intermediateNode.xpos = intermediatePosX
                intermediateNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                intermediateRootNode.children += intermediateNode
                intermediateNode.setProperty(INTERMEDIATE_DATA, 
                    new IntermediateData(processorInstance, processorNotification.compilationContext, snapshot, view))
                intermediatePosX += 3.5f
            }
        }
        
        // Final result
        val finalResultNode = intermediateKGT.copy
        finalResultNode.xpos = intermediatePosX
        finalResultNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
        intermediateRootNode.children += finalResultNode 
        finalResultNode.setProperty(INTERMEDIATE_DATA, 
            new IntermediateData(processorInstance, processorNotification.compilationContext, processorInstance.getModel, view))
        intermediatePosX += 3.5f            

        val processorBodyNode = NODE_PROCESSOR_BODY.findNode(nodeIdMap)
        processorBodyNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
        processorBodyNode.setProperty(INTERMEDIATE_DATA, 
            new IntermediateData(processorInstance, processorNotification.compilationContext, processorInstance.getModel, view))
            
        val warnings = processorInstance.environment.getProperty(WARNINGS)
        if (warnings.size > 0) {
            val warningNode = intermediateKGT.copy
            warningNode.xpos = intermediatePosX
            warningNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
            intermediateRootNode.children += warningNode 
            warningNode.setProperty(INTERMEDIATE_DATA, 
                new IntermediateData(processorInstance, processorNotification.compilationContext, warnings, view))
            warningNode.container.setFBColor(WARNING)
            intermediatePosX += 3.5f
        }       
        
        val errors = processorInstance.environment.getProperty(ERRORS)
        if (errors.size > 0) {
            val errorNode = intermediateKGT.copy
            errorNode.xpos = intermediatePosX
            errorNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
            intermediateRootNode.children += errorNode 
            errorNode.setProperty(INTERMEDIATE_DATA, 
                new IntermediateData(processorInstance, processorNotification.compilationContext, errors, view))
            errorNode.container.setFBColor(ERROR)
            intermediatePosX += 3.5f
        }                
        
        if (processorNotification instanceof ProcessorProgress) {
            updateProgressbar((processorNotification.progress * 100) as int, nodeIdMap)
        } else if (processorNotification instanceof ProcessorFinished) {
            updateProgressbar(100, nodeIdMap)
            if (processorInstance.environment.status == ProcessorStatus.OK) {
                NODE_ACTIVITY_STATUS.getContainer(nodeIdMap).setFBColor(OK)
            }        
        }
    }
    
    static def void updateProgressbar(int progress, Map<String, KNode> nodeIdMap) {
        var s = "" + progress + " =  "
        for(i : 0..NODE_PROGRESS.length - 1) {
            val p = (range(progress, 20 * i, 20 * i + 20) - i * 20) * 5    
            NODE_PROGRESS.get(i).getContainer(nodeIdMap).setBAlpha(255 * p / 100)
            s += " p" + i + ":" + p
        }
    }
    
    
    static def void postUpdateProcessors(AbstractContextNotification contextNotification, KNode node, CompilerView view) {
        val postUpdateCollector = new PostUpdateDoubleCollector(METRIC)
        val allProcessors = contextNotification.compilationContext.processorMap.keySet
        
        // Gather data.       
        for(processor : allProcessors) {
            val processorNode = node.findNode(processor.uniqueProcessorId)    
            if (processorNode == null) {
                // This can happen because metrics are also listed in the processor map.
            } else {
                val compilationUnit = contextNotification.compilationContext.getProcessorInstance(processor)
                postUpdateCollector.addProcessor(compilationUnit)
            }
        }
        
        // Update view.
        for(processor : allProcessors) {
            val processorNode = node.findNode(processor.uniqueProcessorId)    
            if (processorNode == null) {
                // This can happen because metrics are also listed in the processor map.
            } else {
                val compilationUnit = contextNotification.compilationContext.getProcessorInstance(processor)
                val perc = postUpdateCollector.getPercentile(compilationUnit)
                processorNode.setProperty(CoreOptions.SCALE_FACTOR, perc)
            }
        }
        
        LightDiagramServices.layoutDiagram(view)
    }
    
    
    
    
    
    
    
    static def void setFrameErrorColor(KNode node) {
        val rect = node.getData(KContainerRendering) as KContainerRendering
        rect.setFBColor(ERROR)
    }
    
    static def void setLabel(KNode node, String string) {
        node.labels.head.text = string
    }    
    
    static def void setFBColor(KContainerRendering container, ColorSystem colorSystem) {
        container.setFBColors(colorSystem.foreground.color, colorSystem.background.color, colorSystem.backgroundTarget.color)
    }

    static def void setFBAColor(KContainerRendering container, ColorSystem colorSystem, int alpha) {
        container.setFBAColors(colorSystem.foreground.color, colorSystem.background.color, colorSystem.backgroundTarget.color, alpha)
    }
    
    static def void setBAlpha(KContainerRendering container, int alpha) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KBackground) { 
                c.alpha = alpha
                c.targetAlpha = alpha
            }
        ]
    }
    

    
    /**
     * Private because KColors are not copied.
     */
    private static def void setFBColors(KContainerRendering container, KColor foreground, KColor background, KColor backgroundTarget) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KForeground) c.color = foreground
            if (c instanceof KBackground) { 
                c.color = background
                c.targetColor = backgroundTarget
            }
        ]
    }

    private static def void setFBAColors(KContainerRendering container, KColor foreground, KColor background, KColor backgroundTarget, int alpha) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KForeground) c.color = foreground
            if (c instanceof KBackground) { 
                c.color = background
                c.targetColor = backgroundTarget
                c.alpha = alpha
                c.targetAlpha = alpha
            }
        ]
    }
    
    
    static def getContainer(String id, Map<String, KNode> nodeIdMap) {
        nodeIdMap.findNode(id).getContainer
    }
    
    static def getContainer(KNode node) {
        node.getData(KContainerRendering) as KContainerRendering
    }

    static def getContainer(KEdge edge) {
        edge.getData(KContainerRendering) as KContainerRendering
    }
    
    static def Map<String, KNode> createNodeIdMap(KNode node) {
        <String, KNode> newHashMap => [ map |
            node.eAllContents.filter(KNode).forEach[
                val identifier = getData(KIdentifier)
                map.put(identifier.id, it)
            ]
        ]
    }
    
    static def KNode findNode(Map<String, KNode> idMap, String id) {
        idMap.get(id)
    }
    
    static def KNode findNode(String id, Map<String, KNode> idMap) {
        idMap.get(id)
    }
    
    static def KNode findNode(KNode node, String id) {
        node.eAllContents.filter(KNode).filter[ id.equals(getData(KIdentifier)?.id) ]?.head
    }
    
    static def getId(KNode node) {
        node.eContents.filter(KIdentifier).head.id
    }    
    
    static def KLabel getLabel(KNode node) {
        node.eContents.filter(KLabel).head
    }
    
    static def KShapeLayout getShapeLayout(KNode node) {
        node.eContents.filter(KShapeLayout).head
    }
    
    private static def int range(int value, int min, int max) {
        if (value < min) return min
        else if (value > max) return max
        else return value
    }
    
    static private def <T extends KRendering> T addAction(T rendering, Trigger trigger, String actionId) {

        rendering.actions += KRenderingFactory.eINSTANCE.createKAction() => [
            it.trigger = trigger;
            it.actionId = actionId;
        ];
        return rendering;
    }    
    
}