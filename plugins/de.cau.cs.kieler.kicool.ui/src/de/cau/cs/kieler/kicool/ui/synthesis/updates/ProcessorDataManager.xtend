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
package de.cau.cs.kieler.kicool.ui.synthesis.updates

import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.compilation.ProcessorStatus
import de.cau.cs.kieler.kicool.compilation.RuntimeSystems
import de.cau.cs.kieler.kicool.compilation.observer.AbstractCompilationNotification
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.compilation.observer.AbstractProcessorNotification
import de.cau.cs.kieler.kicool.compilation.observer.CompilationChanged
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.environments.EnvironmentPair
import de.cau.cs.kieler.kicool.environments.Errors
import de.cau.cs.kieler.kicool.environments.MessageObjectReferences
import de.cau.cs.kieler.kicool.environments.Snapshots
import de.cau.cs.kieler.kicool.environments.Warnings
import de.cau.cs.kieler.kicool.ui.synthesis.MessageObjectListPair
import de.cau.cs.kieler.kicool.ui.synthesis.ProcessorSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateSelection
import de.cau.cs.kieler.kicool.ui.synthesis.actions.OnOffToggle
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectAdditionalIntermediateAction
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectIntermediateAction
import de.cau.cs.kieler.kicool.ui.synthesis.actions.ToggleProcessorOnOffAction
import de.cau.cs.kieler.kicool.ui.synthesis.feedback.PostUpdateDoubleCollector
import de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorSystem
import de.cau.cs.kieler.kicool.ui.synthesis.styles.ProcessorStyles
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KShapeLayout
import de.cau.cs.kieler.klighd.krendering.KBackground
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KColoring
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KStyle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineJoin
import de.cau.cs.kieler.klighd.krendering.Trigger
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceX
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceY
import java.util.List
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.ui.IEditorPart

import static de.cau.cs.kieler.kicool.compilation.Metric.*
import static de.cau.cs.kieler.kicool.environments.Environment.*
import static de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.*
import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.Color.*
import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorSystem.*

import static extension de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.*
import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.MessageObjectReferencesManager.fillUndefinedColors
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.uniqueProcessorId
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * The data manager handles all synthesis updates.
 * 
 * @author ssm
 * @kieler.design 2017-02-27 proposed 
 * @kieler.rating 2017-02-27 proposed yellow
 */
class ProcessorDataManager {
    
    static val KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE
    static KRenderingExtensions kRenderingExtensions = new KRenderingExtensions
    static KEdgeExtensions kEdgeExtensions = new KEdgeExtensions
    static ProcessorSynthesis processorSynthesis = new ProcessorSynthesis()
    static ProcessorStyles processorStyles = new ProcessorStyles()
    
    
    static def void populateProcessorData(ProcessorReference processorReference, KNode node) {
        node.setProperty(PROCESSOR_IDENTIFIER, processorReference)
        
        val rtProcessor = RuntimeSystems.getProcessorInstance(processorReference)
        
        if (rtProcessor === null) {
            node.setFrameErrorColor
            node.getAllContentsOfType(KText).head.text = processorReference.id.split("\\.").last
            return;
        }
        val nameStr = rtProcessor.name
        node.getAllContentsOfType(KText).head.text = nameStr
        
        val toggleOnOffButton = node.getProperty(PROCESSOR_ON_OFF_BUTTON)
        if (toggleOnOffButton !== null) {
            kRenderingExtensions.addAction(toggleOnOffButton, Trigger::SINGLECLICK, ToggleProcessorOnOffAction.ID)
            val toggle = ToggleProcessorOnOffAction.deactivatedProcessors.get(processorReference)
            if (toggle === null || toggle == OnOffToggle.ON) {
                setFBColor(toggleOnOffButton.children.head, ON)
            } else if (toggle == OnOffToggle.OFF) {
                setFBColor(toggleOnOffButton.children.head, OFF)
            } else {
                setFBColor(toggleOnOffButton.children.head, HALT)
            }
        }
    }
    
    static def void setCompatibilityError(KNode node) {
        node.setFrameErrorColor
    }
    
    
    static def void resetSystem(AbstractCompilationNotification compilationNotification, KNode node,
        CompilerView view) {

        if (compilationNotification instanceof CompilationStart) {
            node.eAllOfType(KNode).filter[getProperty(TEMPORARY_PROCESSOR)].forEach[remove]
            // Clear all intermediate results and data
            node.eAllOfType(KNode).forEach [
                getProperty(PROCESSOR_INTERMEDIATE_CONTAINER)?.children?.clear
                setProperty(INTERMEDIATE_DATA, null)
                if (getProperty(SOURCE_NODE)) {
                    container.removeAllActions
                    kRenderingExtensions.addAction(container, Trigger::SINGLECLICK, SelectAdditionalIntermediateAction.ID, false, true, false)
                    kRenderingExtensions.addAction(container, Trigger::SINGLECLICK, SelectAdditionalIntermediateAction.ID, false, false, true)
                    kRenderingExtensions.addAction(container, Trigger::SINGLECLICK, SelectIntermediateAction.ID, false, false, false)
                    setProperty(INTERMEDIATE_DATA, new IntermediateData(
                        null,
                        compilationNotification.compilationContext,
                        compilationNotification.compilationContext.originalModel,
                        view,
                        -1,
                        it
                    ))
                }
            ]

            // Set Select Nothing Data
            node.setProperty(INTERMEDIATE_DATA, new IntermediateData(
                null,
                compilationNotification.compilationContext,
                null,
                view,
                -1,
                node
            ))
        }
    }
    
    static def void resetProcessor(AbstractProcessorNotification processorNotification, KNode node) {
        val compilationContext = processorNotification.compilationContext
        val processorReference = processorNotification.processorReference
        val processorInstance = processorNotification.processorInstance
        val originalProcessorReference = compilationContext.getOriginalProcessorEntry(processorReference)
        var KNode processorNodeCandidate = null
        if (originalProcessorReference === null) {
            processorNodeCandidate = node.findNode(processorReference.uniqueProcessorId)
        } else {
            processorNodeCandidate = node.findNode(originalProcessorReference.uniqueProcessorId) 
        }
        val processorNode = processorNodeCandidate
        if (processorNode === null) {
            System.err.println("There was an update notification for an non-existing processor (" + processorReference.uniqueProcessorId + 
                "). This should not happen. I'm very sorry.")
            return
        }
        
        val edges = processorNode.incomingEdges
        if (edges.size > 1) for (edge : edges) {
            val procId = edge.source.getProperty(PROCESSOR_IDENTIFIER)
            if (procId !== null) {
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
    
    static def void addNewProcessor(CompilationChanged notification, KNode node, CompilerView view) {
        val compilationContext = notification.compilationContext
        val newNode = processorSynthesis.transform(notification.processorEntry)
        newNode.forEach[setProperty(TEMPORARY_PROCESSOR, true)]
        node.children += newNode
        
        val parent = notification.processorEntry.eContainer
        if (parent instanceof ProcessorGroup) {
            val pos = parent.processors.indexOf(notification.processorEntry)
            val predecessorIndex = if (pos > 0) pos - 1 else pos
            if (predecessorIndex < pos) {
                val predecessorEntry = parent.processors.get(predecessorIndex)
                var predecessorNode = node.findNode(predecessorEntry.uniqueProcessorId)
                if (predecessorNode === null) {
                    val originalProcessorReference = compilationContext.getOriginalProcessorEntry(predecessorEntry)
                    if (originalProcessorReference !== null) {
                        predecessorNode = node.findNode(originalProcessorReference.uniqueProcessorId)
                    }
                }
                val edge = kEdgeExtensions.createEdge 
                edge.source = predecessorNode
                edge.sourcePort = predecessorNode.ports.last // Assuming the last port is right
                edge.target = newNode.head
                edge.targetPort = newNode.head.ports.head // Assuming the first port is left
                processorStyles.addConnectionFigure(edge)
            }
        }
        
    }
    
    static def void updateProcessor(AbstractProcessorNotification processorNotification, KNode node, CompilerView view) {
        view.viewContext.layoutRecorder.startRecording
        val compilationContext = processorNotification.compilationContext
        val processorReference = processorNotification.processorReference
        val processorInstance = processorNotification.processorInstance
        val originalProcessorReference = compilationContext.getOriginalProcessorEntry(processorReference)
        var KNode processorNodeCandidate = null
        if (originalProcessorReference === null) {
            processorNodeCandidate = node.findNode(processorReference.uniqueProcessorId)
        } else {
            processorNodeCandidate = node.findNode(originalProcessorReference.uniqueProcessorId) 
        }
        val processorNode = processorNodeCandidate
        if (processorNode === null) {
            System.err.println("There was an update notification for an non-existing processor system (" + processorReference.uniqueProcessorId + 
                "). This should not happen. I'm sorry.")
            return
        }
        
        
        //switch(processorInstance.environment.status) {
        //    case ERRORS: NODE_ACTIVITY_STATUS.getContainer(nodeIdMap)?.setFBColor(ERROR)
        //    case WARNINGS: NODE_ACTIVITY_STATUS.getContainer(nodeIdMap)?.setFBColor(WARNING)
        //    default: {
        //    }
        //}

        //var envText = "pTime: %dms".format((processorInstance.environment.getProperty(PROCESSOR_TIME).doubleValue / 1000_000) as long)
        //val mMetric = processorInstance.environment.getProperty(METRIC)
        //if (mMetric !== null) envText += "\nmMetric: " + String.format(Locale.US, "%.3f", mMetric as Double) 
        //NODE_ENVIRONMENT.findNode(nodeIdMap)?.setLabel(envText)
        
        if (processorInstance.environment.getProperty(CAPTION) !== null) {
            val c = processorNode.container
            c.children.filter(KText)?.head.text = processorInstance.environment.getProperty(CAPTION)
            processorNode.setProperty(PROCESSOR_CAPTION, processorInstance.environment.getProperty(CAPTION))      
        }
        
        var intermediateModelCounter = 0
        
// This sometimes causes a Klighd exception: Exception in thread "pool-2-thread-30" java.lang.NullPointerException
//    at de.cau.cs.kieler.klighd.internal.macrolayout.KlighdLayoutConfigurationStore.getContainer(KlighdLayoutConfigurationStore.java:396)
        processorNode.container.removeAllActions
        kRenderingExtensions.addAction(processorNode.container, Trigger::SINGLECLICK, SelectAdditionalIntermediateAction.ID, false, true, false)
        kRenderingExtensions.addAction(processorNode.container, Trigger::SINGLECLICK, SelectAdditionalIntermediateAction.ID, false, false, true)
        kRenderingExtensions.addAction(processorNode.container, Trigger::SINGLECLICK, SelectIntermediateAction.ID, false, false, false)
        processorNode.setProperty(INTERMEDIATE_DATA, new IntermediateData(
            processorInstance,
            processorNotification.compilationContext,
            processorInstance.targetModel,
            view,
            intermediateModelCounter++,
            processorNode
        ))
        

        val intermediateContainer = processorNode.getProperty(PROCESSOR_INTERMEDIATE_CONTAINER)
        val intermediateData = new IntermediateData(processorInstance, processorNotification.compilationContext,
            null, view, 0, processorNode)
        if (intermediateContainer !== null) {
            intermediateContainer.children.clear
            
            if (processorInstance.environment.getProperty(DEBUG_ENVIRONMENT_MODELS)) {
                val environmentNode = processorStyles.addIntermediateModel(processorNode, intermediateData,
                    new EnvironmentPair(processorInstance.sourceEnvironment, processorInstance.sourceEnvironment), false)
                environmentNode.setBColor(ENVIRONMENT_MODEL)
            }            
            
            // Test for snapshots
            var Object lastModel = null
            val snapshots = processorInstance.environment.getProperty(SNAPSHOTS) as Snapshots
            if (snapshots !== null) {
                for (snapshot : snapshots) {
                    lastModel = snapshot.object
                    processorStyles.addIntermediateModel(processorNode, intermediateData, lastModel, lastModel === processorInstance.targetModel)
                }
            }

            // Final result
            if (lastModel !== processorInstance.targetModel) {
                val finalResultNode = processorStyles.addIntermediateModel(processorNode, intermediateData, processorInstance.targetModel, true)
                finalResultNode.setBColor(INTERMEDIATE_FINAL_RESULT)
            }        
    
    
            if (processorInstance.environment.getProperty(DEBUG_ENVIRONMENT_MODELS)) {
                val environmentNode = processorStyles.addIntermediateModel(processorNode, intermediateData,
                    new EnvironmentPair(processorInstance.sourceEnvironment, processorInstance.environment), false)
                environmentNode.setBColor(ENVIRONMENT_MODEL)
            }            
    
            val List<MessageObjectReferences> list = newArrayList
            list += processorInstance.environment.getProperty(INFOS)
            list += processorInstance.environment.getProperty(WARNINGS)
            list += processorInstance.environment.getProperty(ERRORS)
            list.forEach [
                var color = INFO
                if (it instanceof Warnings) {
                    color = WARNING
                } else if (it instanceof Errors) {
                    color = ERROR
                }
                val constantColor = color
                forEach[ key, value |
                    val intermediateNode = processorStyles.addIntermediateModel(processorNode, intermediateData,
                        new MessageObjectListPair(value.fillUndefinedColors(constantColor),
                            if(key === null) processorInstance.targetModel else key), false)
                    intermediateNode.setBColor(constantColor)
                ]
            ]
            
            val logs = processorInstance.environment.getProperty(LOGS)
            if (logs !== null && logs.files.size > 0) {
                val logNode = processorStyles.addIntermediateModel(processorNode, intermediateData, logs, false)
                logNode.setBColor(LOG)
            }
        }               
        
        if (processorNotification instanceof ProcessorFinished) {
            if (processorInstance.environment.status == ProcessorStatus.OK) {
                //NODE_ACTIVITY_STATUS.getContainer(nodeIdMap)?.setFBColor(OK)
            }        
        }
        view.viewContext.layoutRecorder.stopRecording(0)
    }
    
    
    static def void postUpdateProcessors(AbstractContextNotification contextNotification, KNode node, CompilerView view) {
        val postUpdateCollector = new PostUpdateDoubleCollector(METRIC)
        val allProcessors = contextNotification.compilationContext.processorMap.keySet
        
        // Gather data.       
        for(processor : allProcessors) {
            val processorNode = node.findNode(processor.uniqueProcessorId)    
            if (processorNode === null) {
                // This can happen because metrics are also listed in the processor map.
            } else {
                val compilationUnit = contextNotification.compilationContext.getProcessorInstance(processor)
                postUpdateCollector.addProcessor(compilationUnit)
            }
        }
        
        // Update view.
        for(processor : allProcessors) {
            val processorNode = node.findNode(processor.uniqueProcessorId)    
            if (processorNode === null) {
                // This can happen because metrics are also listed in the processor map.
            } else {
                val compilationUnit = contextNotification.compilationContext.getProcessorInstance(processor)
                val perc = postUpdateCollector.getPercentile(compilationUnit)
                processorNode.setProperty(CoreOptions.SCALE_FACTOR, perc)
            }
        }
        
        LightDiagramServices.layoutDiagram(new LightDiagramLayoutConfig(view))
    }
    
    static def updateSelectedIntermediateModels(KNode node, CompilerView view, 
        IntermediateSelection selection, IEditorPart editor
    ) {
        val processorNodes = <Pair<KNode, Integer>> newArrayList
        for (s : selection.entries) {
            if (s.processor === null) {
                processorNodes += new Pair<KNode, Integer>(node.eAllContents.filter(KNode).filter[getProperty(SOURCE_NODE)].head, s.intermediateIndex)
            } else {
                val processorReference = s.processor.processorReference
                val processorNode = node.eAllContents.filter(KNode).filter[ getProperty(PROCESSOR_IDENTIFIER)?.id == processorReference?.id ]?.head
                if (processorNode !== null) {
                    processorNodes += new Pair<KNode, Integer>(processorNode, s.intermediateIndex)
                }
            }
        }
        
        val intermediateData = <IntermediateData> newArrayList
        for (p : processorNodes.filter[ it.key !== null] ) {
            if (p.key.getProperty(PROCESSOR_INTERMEDIATE_CONTAINER) === null &&
                p.key.getProperty(INTERMEDIATE_DATA) !== null &&
                p.key.getProperty(INTERMEDIATE_DATA).intermediateIndex == p.value) {
                intermediateData += p.key.getProperty(INTERMEDIATE_DATA)
            } else {
                val iD = p.key.getProperty(PROCESSOR_INTERMEDIATE_CONTAINER).children.filter [
                    val iData = getProperty(INTERMEDIATE_DATA)
                    return (iData !== null) && (iData.intermediateIndex <= p.value)
                ].map[getProperty(INTERMEDIATE_DATA)].sortBy[intermediateIndex].last

                if (iD !== null)
                    intermediateData += iD
            }
        }
        
        if (!intermediateData.empty) {
            new Thread(new DelayedSelectionUpdate(view, intermediateData, editor)).start
        }
    }
    
    
    
    static def void setFrameErrorColor(KNode node) {
        val rect = node.getData(KContainerRendering) as KContainerRendering
        rect.setBColor(ERROR)
    }
    
    static def void setBColor(KRendering container, ColorSystem colorSystem) {
        container.setBColors(colorSystem.background.color, colorSystem.backgroundTarget.color)
    }
    
    static def void setFBColor(KRendering container, ColorSystem colorSystem) {
        container.setFBColors(colorSystem.foreground.color, colorSystem.background.color, colorSystem.backgroundTarget.color)
    }
    
    static def void setFBColorViaExtension(KRendering container, ColorSystem colorSystem) {
        container.setFBColorsViaExtension(colorSystem.foreground.color, colorSystem.background.color, colorSystem.backgroundTarget.color)
    }

    static def void setFBAColor(KRendering container, ColorSystem colorSystem, int alpha) {
        container.setFBAColors(colorSystem.foreground.color, colorSystem.background.color, colorSystem.backgroundTarget.color, alpha)
    }
    
    static def void setBAlpha(KRendering container, int alpha) {
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
    private static def void setFBColors(KRendering container, KColor foreground, KColor background, KColor backgroundTarget) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KForeground) c.color = foreground
            if (c instanceof KBackground) { 
                c.color = background
                c.targetColor = backgroundTarget
            }
        ]
    }
    
    private static def void setBColors(KRendering container, KColor background, KColor backgroundTarget) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KBackground) { 
                c.color = background
                c.targetColor = backgroundTarget
            }
        ]
    }
    
    private static def void setFBColorsViaExtension(KRendering container, KColor foreground, KColor background, KColor backgroundTarget) {
        kRenderingExtensions.setForeground(container, foreground)
        kRenderingExtensions.setBackgroundGradient(container, background, backgroundTarget, 0)
    }
    
    private static def void setFBAColors(KRendering container, KColor foreground, KColor background, KColor backgroundTarget, int alpha) {
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
    
    static def getContainer(KNode node) {
        node.getData(KContainerRendering) as KContainerRendering
    }
    
    static def getContainers(KNode node) {
        node.data.filter(KContainerRendering) 
    }

    static def getContainer(KEdge edge) {
        edge.getData(KContainerRendering) as KContainerRendering
    }
    
    static def KNode findNode(KNode node, String id) {
        node.eAllContents.filter(KNode).filter[ getProperty(PROCESSOR_IDENTIFIER)?.uniqueProcessorId == id ]?.head
    }
        
    static def findAllNodes(KNode node, String id) {
        node.eAllContents.filter(KNode).filter[ getProperty(PROCESSOR_IDENTIFIER)?.uniqueProcessorId == id ].toList
    }
    
    static def KShapeLayout getShapeLayout(KNode node) {
        node.eContents.filter(KShapeLayout).head
    }
    
    static private def <T extends KRendering> void removeAllActions(T rendering) {
        rendering.actions.clear
    }    
    
    
    static private def KRendering internalAddArrowDecorator(KPolyline pl, boolean head) {
        kRenderingExtensions.setLineCap(pl, LineCap::CAP_FLAT)
        return pl.drawArrow => [
            it.placementData = renderingFactory.createKDecoratorPlacementData => [
                it.rotateWithLine = true;
                it.relative = if (head) 1f else 0f;
                it.absolute = if (head) -2f else 2f;
                it.width = 6;
                it.height = 4;
                it.setXOffset(if (head) -4f else 6f); // chsch: used the regular way here and below, as the alias 
                it.setYOffset(if (head) -2f else 3f); //  name translation convention changed from Xtext 2.3 to 2.4.
            ];
            if (!head) kRenderingExtensions.setRotation(it, 180f)
        ];
    }   
    
    static private def <T extends KRendering> T addChild(KContainerRendering parent, T child) {
        return child => [
            parent.children.add(it);
        ];
    }      
    
    static private def KPolygon drawArrow(KContainerRendering cr) {
        return renderingFactory.createKPolygon => [
            kRenderingExtensions.setLineJoin(
                kRenderingExtensions.setBackground(cr.addChild(it).withCopyOf(kRenderingExtensions.getLineWidth(cr)).withCopyOf(kRenderingExtensions.getForeground(cr)), 
                    kRenderingExtensions.getForeground(cr)
                ),
                LineJoin.JOIN_ROUND
            )
            it.points += kRenderingExtensions.createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0);
            it.points += kRenderingExtensions.createKPosition(PositionReferenceX::LEFT, 0, 0.66f, PositionReferenceY::TOP, 0, 0.5f);
            it.points += kRenderingExtensions.createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::BOTTOM, 0, 0);
            it.points += kRenderingExtensions.createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::BOTTOM, 0, 0.5f);    
       ]
    }
    
    static private def <T extends KRendering> T withCopyOf(T rendering, KStyle style) {
        rendering.styles += style.copy;
        return rendering;
    }

}
