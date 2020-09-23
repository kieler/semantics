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
import de.cau.cs.kieler.kicool.compilation.ProcessorStatus
import de.cau.cs.kieler.kicool.compilation.observer.AbstractCompilationNotification
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.compilation.observer.AbstractProcessorNotification
import de.cau.cs.kieler.kicool.compilation.observer.CompilationChanged
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorProgress
import de.cau.cs.kieler.kicool.environments.EnvironmentPair
import de.cau.cs.kieler.kicool.environments.Snapshots
import de.cau.cs.kieler.kicool.ide.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.kicool.ide.synthesis.MessageObjectListPair
import de.cau.cs.kieler.kicool.ide.synthesis.actions.IntermediateSelection
import de.cau.cs.kieler.kicool.ide.synthesis.updates.ProcessorIdeDataManager
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectIntermediateAction
import de.cau.cs.kieler.kicool.ui.synthesis.feedback.PostUpdateDoubleCollector
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Trigger
import java.util.List
import java.util.Locale
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.IEditorPart

import static de.cau.cs.kieler.kicool.compilation.Metric.*
import static de.cau.cs.kieler.kicool.environments.Environment.*
import static de.cau.cs.kieler.kicool.ide.synthesis.styles.ColorStore.Color.*
import static de.cau.cs.kieler.kicool.ide.synthesis.styles.ColorSystem.*
import static de.cau.cs.kieler.kicool.ui.synthesis.KNodeUIProperties.*

import static extension de.cau.cs.kieler.kicool.ide.synthesis.styles.ColorStore.*
import static extension de.cau.cs.kieler.kicool.ide.synthesis.updates.MessageObjectReferencesManager.fillUndefinedColors
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.uniqueProcessorId
import static extension java.lang.String.format
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * The data manager handles all synthesis updates.
 * 
 * @author ssm
 * @kieler.design 2017-02-27 proposed 
 * @kieler.rating 2017-02-27 proposed yellow
 */
class ProcessorDataManager extends ProcessorIdeDataManager {
    
    
    static def void resetSystem(AbstractCompilationNotification compilationNotification, KNode node, CompilerView view) {
        val allProcessors = compilationNotification.compilationContext.processorMap.keySet.toList
        for(processor : allProcessors) {
            val processorNode = node.findNode(processor.uniqueProcessorId)    
            if (processorNode === null) {
                // This can happen because metrics are also listed in the processor map.
            } else {
                processorNode.resetProcessorNode(node)
            }
        }
        
        if (compilationNotification instanceof CompilationStart) {
            // Clear all intermediate results and data
            node.eAllOfType(KNode).forEach[
                if (getData(KIdentifier) !== null && NODE_INTERMEDIATE.equals(getData(KIdentifier).id)) {
                    children.clear
                }
                setProperty(INTERMEDIATE_DATA, null)
            ]
            
            // Set Select Nothing Data
            node.setProperty(INTERMEDIATE_DATA, 
                new IntermediateData(null, 
                    compilationNotification.compilationContext, 
                    null, view, -1, node
                ))
            
            
            // Set source model
            val sourceNode = node.findNode(NODE_SOURCE)
            val processorUnit = compilationNotification.compilationContext.getFirstProcessorInstance
            sourceNode.container.removeAllActions
            sourceNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
            sourceNode.setProperty(INTERMEDIATE_DATA, 
                new IntermediateData(null, 
                    compilationNotification.compilationContext, 
                    null, view, -1, sourceNode
                ))
        }
        
        // Reload intermediate nodes.
        INTERMEDIATE_NODE = KiCoolSynthesis.getKGTFromBundle(KiCoolUiModule.BUNDLE_ID, INTERMEDIATE_KGT)
    }
    
    static def void addNewProcessor(CompilationChanged notification, KNode node, CompilerView view) {
        val compilationContext = notification.compilationContext
        val newNode = processorSynthesis.transform(notification.processorEntry)
        
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
                edge.target = node.findNode(notification.processorEntry.uniqueProcessorId)
                
                renderingFactory.createKPolyline() => [
                    edge.data += it
                    kRenderingExtensions.setLineWidth(it, 0.5f)
                    kRenderingExtensions.setForeground(it, ACTIVE_ENVIRONMENT.color)
                    internalAddArrowDecorator(it, true)
                ]
            }
        }
        
    }
    
    static def void updateProcessor(AbstractProcessorNotification processorNotification, KNode node, CompilerView view) {
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
            System.err.println("There was an update notification for an non-existing processor system (" + originalProcessorReference.uniqueProcessorId + 
                "). This should not happen. I'm sorry.")
            return
        }
        val nodeIdMap = processorNode.createNodeIdMap
        
        switch(processorInstance.environment.status) {
            case ERRORS: NODE_ACTIVITY_STATUS.getContainer(nodeIdMap)?.setFBColor(ERROR)
            case WARNINGS: NODE_ACTIVITY_STATUS.getContainer(nodeIdMap)?.setFBColor(WARNING)
            default: {
            }
        }
        
        var envText = "pTime: %dms".format((processorInstance.environment.getProperty(PROCESSOR_TIME).doubleValue / 1000_000) as long)
        val mMetric = processorInstance.environment.getProperty(METRIC)
        if (mMetric !== null) envText += "\nmMetric: " + String.format(Locale.US, "%.3f", mMetric as Double) 
        NODE_ENVIRONMENT.findNode(nodeIdMap)?.setLabel(envText)
        
        var intermediateModelCounter = 0
        
        
// This sometimes causes a Klighd exception: Exception in thread "pool-2-thread-30" java.lang.NullPointerException
//    at de.cau.cs.kieler.klighd.internal.macrolayout.KlighdLayoutConfigurationStore.getContainer(KlighdLayoutConfigurationStore.java:396)
        val processorBodyNode = NODE_PROCESSOR_BODY.findNode(nodeIdMap)
        if (processorBodyNode !== null) {
            processorBodyNode.container.removeAllActions
            processorBodyNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
            processorBodyNode.setProperty(INTERMEDIATE_DATA, 
                new IntermediateData(processorInstance, processorNotification.compilationContext, 
                    processorInstance.targetModel, view, intermediateModelCounter++, processorBodyNode
                ))
        }
        // Does not work on text.
//        val processorNameNode = NODE_NAME.findNode(nodeIdMap)
//        if (processorNameNode !== null) {
//            processorNameNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
//            processorNameNode.setProperty(INTERMEDIATE_DATA, 
//                new IntermediateData(processorInstance, processorNotification.compilationContext, processorInstance.targetModel, view))
//        }
        

        val intermediateRootNode = NODE_INTERMEDIATE.findNode(nodeIdMap)
        if (intermediateRootNode !== null) {
            val intermediateKGT = intermediateNode
            intermediateRootNode.children.clear
            val intermediatePosXInc = intermediateKGT.width - 0.5f
            var intermediatePosX = 0.0f
            
            if (processorInstance.environment.getProperty(DEBUG_ENVIRONMENT_MODELS)) {
                val environmentNode = intermediateKGT.copy
                environmentNode.xpos = intermediatePosX
                environmentNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                intermediateRootNode.children += environmentNode 
                environmentNode.setProperty(INTERMEDIATE_DATA, 
                    new IntermediateData(processorInstance, 
                        processorNotification.compilationContext, 
                        new EnvironmentPair(processorInstance.sourceEnvironment, processorInstance.sourceEnvironment),
                        view, intermediateModelCounter++, environmentNode
                    ))
                intermediatePosX += intermediatePosXInc          
                environmentNode.container.setFBColor(ENVIRONMENT_MODEL)                 
            }            
            
            // Test for snapshots
            var Object lastModel = null
            val snapshots = processorInstance.environment.getProperty(SNAPSHOTS) as Snapshots
            if (snapshots !== null) {
                for(snapshot : snapshots) {
                    val intermediateNode = intermediateKGT.copy
                    intermediateNode.xpos = intermediatePosX
                    intermediateNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                    intermediateRootNode.children += intermediateNode
                    intermediateNode.setProperty(INTERMEDIATE_DATA, 
                        new IntermediateData(processorInstance, processorNotification.compilationContext, snapshot.object, 
                            view, intermediateModelCounter++, intermediateNode
                        ))
                    intermediatePosX += intermediatePosXInc
                    lastModel = snapshot.object
                }
            }
            
            // Final result
            if (lastModel !== processorInstance.targetModel) {
                val finalResultNode = intermediateKGT.copy
                finalResultNode.xpos = intermediatePosX
                finalResultNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                intermediateRootNode.children += finalResultNode 
                finalResultNode.setProperty(INTERMEDIATE_DATA, 
                    new IntermediateData(processorInstance, processorNotification.compilationContext, 
                        processorInstance.targetModel, view, intermediateModelCounter++, finalResultNode
                    ))
                intermediatePosX += intermediatePosXInc          
                finalResultNode.container.setFBColor(INTERMEDIATE_FINAL_RESULT)
            }        
    
    
            if (processorInstance.environment.getProperty(DEBUG_ENVIRONMENT_MODELS)) {
                val environmentNode = intermediateKGT.copy
                environmentNode.xpos = intermediatePosX
                environmentNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                intermediateRootNode.children += environmentNode 
                environmentNode.setProperty(INTERMEDIATE_DATA, 
                    new IntermediateData(processorInstance, 
                        processorNotification.compilationContext, 
                        new EnvironmentPair(processorInstance.sourceEnvironment, processorInstance.environment), 
                        view, intermediateModelCounter++, environmentNode
                    ))
                intermediatePosX += intermediatePosXInc          
                environmentNode.container.setFBColor(ENVIRONMENT_MODEL)                 
            }            
    
    
            val infos = processorInstance.environment.getProperty(INFOS)
            if (infos.size > 0) {
                for (infoKey : infos.keySet) {
                    val infoNode = intermediateKGT.copy
                    infoNode.xpos = intermediatePosX
                    infoNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                    intermediateRootNode.children += infoNode 
                    
                    val model = if (infoKey === null) processorInstance.targetModel else infoKey
                    if (model instanceof EObject) {
                        val morModel = new MessageObjectListPair(infos.get(infoKey).fillUndefinedColors(INFO), 
                            if (infoKey === null) model else infoKey)
                        infoNode.setProperty(INTERMEDIATE_DATA, 
                            new IntermediateData(processorInstance, processorNotification.compilationContext, morModel, 
                                view, intermediateModelCounter++, infoNode
                            ))
                    } else {
                        val morModel = new MessageObjectListPair(infos.get(infoKey).fillUndefinedColors(INFO), 
                            if (infoKey === null) model else infoKey)
                        infoNode.setProperty(INTERMEDIATE_DATA, 
                            new IntermediateData(processorInstance, processorNotification.compilationContext, morModel, 
                                view, intermediateModelCounter++, infoNode
                            ))
                    }
                        
                    infoNode.container.setFBColor(INFO)
                    intermediatePosX += intermediatePosXInc
                }
            }            
                
            val warnings = processorInstance.environment.getProperty(WARNINGS)
            if (warnings.size > 0) {
                for (warningKey : warnings.keySet) {
                    val warningNode = intermediateKGT.copy
                    warningNode.xpos = intermediatePosX
                    warningNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                    intermediateRootNode.children += warningNode 
                    
                    val model = if (warningKey === null) processorInstance.targetModel else warningKey
                    if (model instanceof EObject) {
                        val morModel = new MessageObjectListPair(warnings.get(warningKey).fillUndefinedColors(WARNING), 
                            if (warningKey === null) model else warningKey)
                        warningNode.setProperty(INTERMEDIATE_DATA, 
                            new IntermediateData(processorInstance, processorNotification.compilationContext, morModel, 
                                view, intermediateModelCounter++, warningNode
                            ))
                    } else {
                        val morModel = new MessageObjectListPair(warnings.get(warningKey).fillUndefinedColors(WARNING), 
                            if (warningKey === null) model else warningKey)
                        warningNode.setProperty(INTERMEDIATE_DATA, 
                            new IntermediateData(processorInstance, processorNotification.compilationContext, morModel, 
                                view, intermediateModelCounter++, warningNode
                            ))
                    }
                        
                    warningNode.container.setFBColor(WARNING)
                    intermediatePosX += intermediatePosXInc
                }
            }       
            
            val errors = processorInstance.environment.getProperty(ERRORS)
            if (errors.size > 0) {
                for (errorKey : errors.keySet) {
                    val errorNode = intermediateKGT.copy
                    errorNode.xpos = intermediatePosX
                    errorNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                    intermediateRootNode.children += errorNode 
                    
                    val model = processorInstance.targetModel
                    if (model instanceof EObject) {
                        val morModel = new MessageObjectListPair(errors.get(errorKey).fillUndefinedColors(ERROR), 
                            if (errorKey === null) model else errorKey)
                        errorNode.setProperty(INTERMEDIATE_DATA, 
                            new IntermediateData(processorInstance, processorNotification.compilationContext, morModel, 
                                view, intermediateModelCounter++, errorNode
                            ))
                    } else {
                        val morModel = new MessageObjectListPair(errors.get(errorKey).fillUndefinedColors(ERROR), 
                            if (errorKey === null) model else errorKey)
                        errorNode.setProperty(INTERMEDIATE_DATA, 
                            new IntermediateData(processorInstance, processorNotification.compilationContext, morModel, 
                                view, intermediateModelCounter++, errorNode
                            ))
                    }
                        
                    errorNode.container.setFBColor(ERROR)
                    intermediatePosX += intermediatePosXInc
                }
            }
            
            val logs = processorInstance.environment.getProperty(LOGS)
            if (logs !== null && logs.files.size > 0) {
                val logNode = intermediateKGT.copy
                logNode.xpos = intermediatePosX
                logNode.container.addAction(Trigger::SINGLECLICK, SelectIntermediateAction.ID)
                logNode.container.setFBColor(LOG)
                intermediateRootNode.children += logNode
                 
                logNode.setProperty(INTERMEDIATE_DATA, 
                    new IntermediateData(processorInstance, processorNotification.compilationContext, logs, 
                        view, intermediateModelCounter++, logNode
                    ))
                intermediatePosX += intermediatePosXInc
            }
        }               
        
        if (processorNotification instanceof ProcessorProgress) {
            updateProgressbar((processorNotification.progress * 100) as int, nodeIdMap)
        } else if (processorNotification instanceof ProcessorFinished) {
            updateProgressbar(100, nodeIdMap)
            if (processorInstance.environment.status == ProcessorStatus.OK) {
                NODE_ACTIVITY_STATUS.getContainer(nodeIdMap)?.setFBColor(OK)
            }        
        }
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
    
    
    static def List<Object> retrieveIntermediateModel(KNode node, CompilerView view, Object model, IntermediateSelection selection, IEditorPart editor) {
        retrieveIntermediateModel(node, view, model, selection, editor, true)
    }
    
    package static def List<Object> retrieveIntermediateModel(KNode node, CompilerView view, Object model, 
        IntermediateSelection selection, IEditorPart editor, boolean scheduleUIJob
    ) {
        val processorNodes = <Pair<KNode, Integer>> newArrayList
        for (s : selection.entries) {
            if (s.processor === null) {
                processorNodes += new Pair<KNode, Integer>(node.findNode(NODE_SOURCE), s.intermediateIndex)
            } else {
                val processorReference = s.processor.processorReference
                processorNodes += new Pair<KNode, Integer>(
                    node.eAllContents.filter(KNode).filter[ getData(KIdentifier)?.id.startsWith(processorReference.id) ]?.head,
                    s.intermediateIndex)
            }
        }
        
        val intermediateData = <IntermediateData> newArrayList
        for (p : processorNodes.filter[ it.key !== null] ) {
            val iD = p.key.eAllContents.filter(KNode).filter[ 
                val iData = getProperty(INTERMEDIATE_DATA)
                return (iData !== null) && (iData.intermediateIndex <= p.value)
            ].map[ getProperty(INTERMEDIATE_DATA) ].toIterable.sortBy[ -intermediateIndex ].head
            
            if (iD !== null) 
                intermediateData += iD
        }
        
        if (!intermediateData.empty) {
            if (scheduleUIJob) {
                new Thread(new DelayedSelectionUpdate(node, view, model, selection, editor)).start
            } else {
                val modelList = <Object> newArrayList
                if (intermediateData.size == 1) {
                    view.viewer.resetSelectionTo(intermediateData.head.parentNode)
                    intermediateData.head.parentNode.containers.forEach[ 
                        setProperty(KlighdInternalProperties.SELECTED, true)
                    ]
                    modelList += intermediateData.head.model
                } else {
                    val selectionIter = intermediateData.map[parentNode]
                    view.viewer.resetSelectionToDiagramElements(selectionIter)
                    for (iM : intermediateData) {
                        iM.parentNode.containers.forEach[ 
                            setProperty(KlighdInternalProperties.SELECTED, true)
                        ]
                        modelList += iM.model
                    }
                }
                return modelList
            }
        }
         
        return <Object> newArrayList => [ it += model ]  
    }
}