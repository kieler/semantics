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
package de.cau.cs.kieler.kicool.ui.synthesis

import org.eclipse.elk.graph.KNode
import org.eclipse.elk.core.klayoutdata.KIdentifier
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import java.util.Map
import org.eclipse.elk.graph.KLabel
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
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorSynthesis.uniqueProcessorId
import de.cau.cs.kieler.kicool.compilation.observer.AbstractCompilationNotification
import static extension de.cau.cs.kieler.kicool.compilation.Environment.*
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectIntermediateAction
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.internal.Snapshots
import org.eclipse.elk.core.klayoutdata.KShapeLayout

/**
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
    
    static val INTERMEDIATE_KGT = "resources/intermediate.kgt"
    
    static val knodeProcessorMap = <KNode, de.cau.cs.kieler.kicool.compilation.Processor> newHashMap
    static val processorViewMap = <de.cau.cs.kieler.kicool.compilation.Processor, CompilerView> newHashMap
    
        
    static def void populateProcessorData(de.cau.cs.kieler.kicool.Processor processor, KNode node) {
        val rtProcessor = RuntimeSystems.getProcessorInstance(processor)
        
        val nodeIdMap = node.createNodeIdMap
        
        if (rtProcessor == null) {
            nodeIdMap.findNode(NODE_PROCESSOR_BODY).setFrameErrorColor
            nodeIdMap.findNode(NODE_NAME).label.text = processor.id.split("\\.").last
            return;
        }
        
        nodeIdMap.findNode(NODE_NAME).label.text = rtProcessor.name
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
            knodeProcessorMap.put(sourceNode, processorUnit)
            processorViewMap.put(processorUnit, view)
            sourceNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
        }
    }
    
    static def void resetProcessor(AbstractProcessorNotification processorNotification, KNode node) {
        val processorEntry = processorNotification.processorEntry
        val processorUnit = processorNotification.processorUnit
        val processorNode = node.findNode(processorEntry.uniqueProcessorId)
        if (processorNode == null) {
            System.err.println("There was an update notification for an non-existing processor (" + processorEntry.uniqueProcessorId + 
                "). This should not happen. I'm very sorry.")
            return
        }
        
        processorNode.resetProcessorNode(node)
    }   
    
    static private def void resetProcessorNode(KNode processorNode, KNode node) {
        val nodeIdMap = processorNode.createNodeIdMap
        
        NODE_ACTIVITY_STATUS.getContainer(nodeIdMap).setFBColor(BUSY)
        for(i : 0..NODE_PROGRESS.length-1) {
            NODE_PROGRESS.get(i).getContainer(nodeIdMap).setFBAColor(PROGRESSBAR, 0)
        }
    } 
    
    static def void updateProcessor(AbstractProcessorNotification processorNotification, KNode node, CompilerView view) {
        val processorEntry = processorNotification.processorEntry
        val processorUnit = processorNotification.processorUnit
        val processorNode = node.findNode(processorEntry.uniqueProcessorId)
        if (processorNode == null) {
            System.err.println("There was an update notification for an non-existing processor system (" + processorEntry.uniqueProcessorId + 
                "). This should not happen. I'm sorry.")
            return
        }
        val nodeIdMap = processorNode.createNodeIdMap
        
        if (processorUnit.environment.status == ProcessorStatus.ERRORS) {
            NODE_ACTIVITY_STATUS.getContainer(nodeIdMap).setFBColor(ERROR)
        }
        
        val pTime = processorUnit.environment.getData(PTIME, 0)
        NODE_ENVIRONMENT.findNode(nodeIdMap).setLabel("pTime: " + pTime + "ms")

        val intermediateRootNode = NODE_INTERMEDIATE.findNode(nodeIdMap)
        val intermediateKGT = KiCoolSynthesis.getKGTFromBundle(KiCoolUiModule.BUNDLE_ID, INTERMEDIATE_KGT)
        intermediateRootNode.children.clear
        var intermediatePosX = 0.0f
        // Test for infos, warnings and errors
        // Test for snapshots
        val snapshots = processorUnit.environment.getData(SNAPSHOTS, null) as Snapshots
        if (snapshots!= null) {
            for(snapshot : snapshots) {
                val intermediateNode = intermediateKGT.copy
                intermediateNode.shapeLayout.xpos = intermediatePosX
                intermediateNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                intermediateRootNode.children += intermediateNode 
                knodeProcessorMap.put(intermediateNode, processorUnit)
                intermediatePosX += 3.5f
            }
        }
        
        // Final result
        val finalResultNode = intermediateKGT.copy
        finalResultNode.shapeLayout.xpos = intermediatePosX
        finalResultNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
        intermediateRootNode.children += finalResultNode 
        knodeProcessorMap.put(finalResultNode, processorUnit)
        processorViewMap.put(processorUnit, view)
        val processorBodyNode = NODE_PROCESSOR_BODY.findNode(nodeIdMap)
        processorBodyNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
        knodeProcessorMap.put(processorBodyNode, processorUnit)
        
        if (processorNotification instanceof ProcessorProgress) {
            updateProgressbar((processorNotification.progress * 100) as int, nodeIdMap)
        } else if (processorNotification instanceof ProcessorFinished) {
            updateProgressbar(100, nodeIdMap)
            if (processorUnit.environment.status == ProcessorStatus.OK) {
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
    
    static def de.cau.cs.kieler.kicool.compilation.Processor getProcessorFromKNode(KNode kNode) {
        knodeProcessorMap.get(kNode)
    }
    
    static def CompilerView getViewFromProcessor(de.cau.cs.kieler.kicool.compilation.Processor processor) {
        processorViewMap.get(processor)
    }
    
    static def void removeAllCompilationContextEntries(CompilationContext context) {
        context.processorInstances.forEach[ removeAllProcessorEntries ]
    }

    static def void removeAllProcessorEntries(de.cau.cs.kieler.kicool.compilation.Processor processor) {
        knodeProcessorMap.keySet.filter[ k | knodeProcessorMap.get(k).equals(processor) ].toList.forEach[ k |
            knodeProcessorMap.remove(k)
            println("Removed " + k + " of " + processor)
        ]
        processorViewMap.remove(processor)
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