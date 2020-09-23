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
package de.cau.cs.kieler.kicool.ide.synthesis.updates

import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.compilation.RuntimeSystems
import de.cau.cs.kieler.kicool.compilation.observer.AbstractProcessorNotification
import de.cau.cs.kieler.kicool.ide.KiCoolIdeModule
import de.cau.cs.kieler.kicool.ide.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.kicool.ide.synthesis.ProcessorStyles
import de.cau.cs.kieler.kicool.ide.synthesis.ProcessorSynthesis
import de.cau.cs.kieler.kicool.ide.synthesis.actions.AbstractSelectParent
import de.cau.cs.kieler.kicool.ide.synthesis.actions.OnOffToggle
import de.cau.cs.kieler.kicool.ide.synthesis.actions.ToggleOnOffData
import de.cau.cs.kieler.kicool.ide.synthesis.actions.ToggleProcessorOnOffAction
import de.cau.cs.kieler.kicool.ide.synthesis.styles.ColorSystem
import de.cau.cs.kieler.kicool.ide.synthesis.styles.SkinSelector
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KLabel
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
import java.util.Map

import static de.cau.cs.kieler.kicool.ide.synthesis.KNodeProperties.*
import static de.cau.cs.kieler.kicool.ide.synthesis.styles.ColorStore.Color.*
import static de.cau.cs.kieler.kicool.ide.synthesis.styles.ColorSystem.*

import static extension de.cau.cs.kieler.kicool.ide.synthesis.styles.ColorStore.*
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.uniqueProcessorId
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * The ide part of the data manager that handles all synthesis updates.
 * 
 * @author ssm, sdo
 */
class ProcessorIdeDataManager {
    
    protected static val KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE
    protected static KRenderingExtensions kRenderingExtensions = new KRenderingExtensions
    protected static KEdgeExtensions kEdgeExtensions = new KEdgeExtensions
    protected static ProcessorSynthesis processorSynthesis = new ProcessorSynthesis
    protected static ProcessorStyles processorStyles = new ProcessorStyles
    
    public static val NODE_PROCESSOR_BODY = "processorbody"
    protected static val NODE_ACTIVITY_STATUS = "status"
    public static val NODE_NAME = "name"
    protected static val NODE_PROGRESS = #["p1", "p2", "p3", "p4", "p5"]
    protected static val NODE_ENVIRONMENT = "environment"
    protected static val NODE_INTERMEDIATE = "intermediate"
    protected static val NODE_SOURCE = "sourcebody"
    protected static val NODE_ACTIVE = "active"
    
    protected static val INTERMEDIATE_KGT = "intermediate.kgt"
    protected static var INTERMEDIATE_NODE = KiCoolSynthesis.getKGTFromBundle(KiCoolIdeModule.UI_BUNDLE_ID, INTERMEDIATE_KGT)
    
    protected static def intermediateNode() {
        INTERMEDIATE_NODE.copy
    }
    
    static def void populateProcessorData(ProcessorReference processorReference, KNode node) {
        node.setProperty(PROCESSOR_IDENTIFIER, processorReference)
        
        val rtProcessor = RuntimeSystems.getProcessorInstance(processorReference)
        
        val nodeIdMap = node.createNodeIdMap
        
        if (rtProcessor === null) {
            nodeIdMap.findNode(NODE_PROCESSOR_BODY).setFrameErrorColor
            nodeIdMap.findNode(NODE_NAME).label.text = processorReference.id.split("\\.").last
            return;
        }
        
        val nameNode = nodeIdMap.findNode(NODE_NAME)
        val nameStr = if (rtProcessor.name.length < SkinSelector.skinMaxNameSize) rtProcessor.name else
            rtProcessor.name.substring(0, SkinSelector.skinMaxNameSize - 2) + "..."
        val label = nameNode.label
        label.text = nameStr
//        label.data.filter(KText).head.setProperty(KlighdProperties.NOT_SELECTABLE, true)
        val text = label.data.filter(KText).head
        text.addAction(Trigger::SINGLECLICK, AbstractSelectParent.ID)
        nameNode.containers.forEach[ addAction(Trigger::SINGLECLICK, AbstractSelectParent.ID) ]
        
        val toggleOnOffNode = nodeIdMap.findNode(NODE_ACTIVE)
        if (toggleOnOffNode !== null) {
            toggleOnOffNode.container.addAction(Trigger::SINGLECLICK, ToggleProcessorOnOffAction.ID)
            toggleOnOffNode.setProperty(TOGGLE_ON_OFF_DATA, new ToggleOnOffData(processorReference))
            val toggle = ToggleProcessorOnOffAction.deactivatedProcessors.get(processorReference)
            if (toggle === null || toggle == OnOffToggle.ON) {
                setFBColor(getContainer(toggleOnOffNode), ON)
            } else if (toggle == OnOffToggle.OFF) {
                setFBColor(getContainer(toggleOnOffNode), OFF)
            } else {
                setFBColor(getContainer(toggleOnOffNode), HALT)
            }
        }
    }
    
    static def void setCompatibilityError(KNode node) {
        val nodeIdMap = node.createNodeIdMap
        
        nodeIdMap.findNode(NODE_PROCESSOR_BODY).setFrameErrorColor
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
            System.err.println("There was an update notification for an non-existing processor (" + originalProcessorReference.uniqueProcessorId + 
                "). This should not happen. I'm very sorry.")
            return
        }
        
        processorNode.resetProcessorNode(node)
        
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
    
    static protected def void resetProcessorNode(KNode processorNode, KNode node) {
        val nodeIdMap = processorNode.createNodeIdMap
        
        NODE_ACTIVITY_STATUS.getContainer(nodeIdMap)?.setFBColor(BUSY)
        for(i : 0..NODE_PROGRESS.length-1) {
            NODE_PROGRESS.get(i).getContainer(nodeIdMap)?.setFBAColor(PROGRESSBAR, 0)
        }
    }
    
    static def void updateProgressbar(int progress, Map<String, KNode> nodeIdMap) {
        var s = "" + progress + " =  "
        for(i : 0..NODE_PROGRESS.length - 1) {
            val p = (range(progress, 20 * i, 20 * i + 20) - i * 20) * 5    
            NODE_PROGRESS.get(i).getContainer(nodeIdMap)?.setBAlpha(255 * p / 100)
            s += " p" + i + ":" + p
        }
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
    
    static def void setFBColorViaExtension(KContainerRendering container, ColorSystem colorSystem) {
        container.setFBColorsViaExtension(colorSystem.foreground.color, colorSystem.background.color, colorSystem.backgroundTarget.color)
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
     * Protected to be used by sub classes because KColors are not copied.
     */
    protected static def void setFBColors(KContainerRendering container, KColor foreground, KColor background, KColor backgroundTarget) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KForeground) c.color = foreground
            if (c instanceof KBackground) { 
                c.color = background
                c.targetColor = backgroundTarget
            }
        ]
    }
    
    protected static def void setFBColorsViaExtension(KContainerRendering container, KColor foreground, KColor background, KColor backgroundTarget) {
        kRenderingExtensions.setForeground(container, foreground)
        kRenderingExtensions.setBackgroundGradient(container, background, backgroundTarget, 0)
    }
    
    protected static def void setFBAColors(KContainerRendering container, KColor foreground, KColor background, KColor backgroundTarget, int alpha) {
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
        nodeIdMap.findNode(id)?.getContainer
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
        
    static def findAllNodes(KNode node, String id) {
        node.eAllContents.filter(KNode).filter[ id.equals(getData(KIdentifier)?.id) ].toList
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
    
    protected static def int range(int value, int min, int max) {
        if (value < min) return min
        else if (value > max) return max
        else return value
    }
    
    static protected def <T extends KRendering> T addAction(T rendering, Trigger trigger, String actionId) {
        rendering.actions += KRenderingFactory.eINSTANCE.createKAction() => [
            it.trigger = trigger;
            it.actionId = actionId;
        ];
        return rendering;
    }
    
    static protected def <T extends KRendering> void removeAllActions(T rendering) {
            rendering.actions.clear
    }    
    
    
    static protected def KRendering internalAddArrowDecorator(KPolyline pl, boolean head) {
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
    
    static protected def <T extends KRendering> T addChild(KContainerRendering parent, T child) {
        return child => [
            parent.children.add(it);
        ];
    }      
    
    static protected def KPolygon drawArrow(KContainerRendering cr) {
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
    
    static protected def <T extends KRendering> T withCopyOf(T rendering, KStyle style) {
        rendering.styles += style.copy;
        return rendering;
    }

}