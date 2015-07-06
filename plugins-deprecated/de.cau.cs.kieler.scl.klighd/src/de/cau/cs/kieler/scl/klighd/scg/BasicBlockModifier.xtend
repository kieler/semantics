/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scl.klighd.scg

import com.google.inject.Guice
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klighd.IStyleModifier
import de.cau.cs.kieler.klighd.IStyleModifier$StyleModificationContext
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.util.ModelingUtil
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import java.util.List

import static de.cau.cs.kieler.scl.klighd.scg.BasicBlockModifier.*
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.basicblocks.BasicBlock
import de.cau.cs.kieler.klighd.util.KlighdProperties

/**
 * Basic Block Visualization
 * done via post-processing trick.
 * 
 * The class is called after all layouting took place. It uses the transfered basic block information 
 * of the SCL program to draw the basic blocks afterwards. 
 * The class needs refactoring as soon as neater methods for post-processing or hierarchical edge routing
 * become available. 
 * 
 * @author: ssm
 */

class BasicBlockModifier implements IStyleModifier {
    
    extension KRenderingExtensions KRenderingExtensions = 
         Guice::createInjector().getInstance(typeof(KRenderingExtensions))    
    extension KColorExtensions KColorExtensions = 
         Guice::createInjector().getInstance(typeof(KColorExtensions))  
    private static val KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE
    extension SCLBasicBlockExtensions SCLBasicBlockExtensions = 
         Guice::createInjector().getInstance(typeof(SCLBasicBlockExtensions))  
    extension SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))  
         
    private static val BASICBLOCK_COLOR_RED = 180         
    private static val BASICBLOCK_COLOR_GREEN = 64         
    private static val BASICBLOCK_COLOR_BLUE = 180         

    private static val BASICBLOCK_COLOR_RED2 = 255         
    private static val BASICBLOCK_COLOR_GREEN2 = 32         
    private static val BASICBLOCK_COLOR_BLUE2 = 32         
         
    private float BBPADDING = 5.0f  

    def KNode create node: KimlUtil::createInitializedNode getNode(Object o) {
    }
    
    def KLabel create node: KimlUtil::createInitializedLabel(labeledElement) getLabel(List<?> o,
            KLabeledGraphElement labeledElement) {
    }
    
    def KLabel createLabel(KLabeledGraphElement labeledElement) {
        return KimlUtil::createInitializedLabel(labeledElement)
    }
    
    def KPolyline createFrameShape(boolean schedulable) {
        KRenderingFactory::eINSTANCE.createKPolyline() => [
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0);
            if (schedulable) {
                it.setForegroundColor(BASICBLOCK_COLOR_RED, BASICBLOCK_COLOR_GREEN, BASICBLOCK_COLOR_BLUE)
            } else {
                it.setForegroundColor(BASICBLOCK_COLOR_RED2, BASICBLOCK_COLOR_GREEN2, BASICBLOCK_COLOR_BLUE2)
                it.setLineWidth(2.0f)
            }
         ];        
    }

    def KNode createFrameNode(Object o, BasicBlock basicBlock, 
        float left, float top, float right, float bottom, boolean schedulable
    ) {
        val node = o.node;
        val shape = createFrameShape(schedulable)
        node.data.add(shape)
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = bottom - top
        shapeLayout.width = right - left        
        shapeLayout.xpos = left
        shapeLayout.ypos = top
        shapeLayout.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true)

        node.KRendering.background = "red".color

        val headLabel = node.createLabel() => [
            it.text = basicBlock.getBasicBlockName
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(BASICBLOCK_COLOR_RED, BASICBLOCK_COLOR_GREEN, BASICBLOCK_COLOR_BLUE);
        ]
        var LSData = headLabel.getData(typeof(KShapeLayout))
        LSData.ypos = LSData.ypos - 5
        LSData.xpos = LSData.xpos + 6
        var gLT = ''
        var labelLines = 0
        var wide = false
        for (pred : basicBlock.getBasicBlockPredecessor) {
            if (basicBlock.isParallelJoin) {
                gLT = gLT + 'e' + pred.getBasicBlockIndex + "\n"
            } else {
                if (pred.isPauseSurface) { 
                    gLT = gLT + 'pre_g' + pred.getBasicBlockIndex + "\n" 
                    wide = true
                } else {
                    gLT = gLT + 'g' + pred.getBasicBlockIndex + "\n"
                }
            }
            labelLines = labelLines + 1
        } 
        val goLabelText = gLT
        val goLabel = node.createLabel() => [
            it.text = goLabelText
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(BASICBLOCK_COLOR_RED, BASICBLOCK_COLOR_GREEN, BASICBLOCK_COLOR_BLUE);
        ]
        LSData = goLabel.getData(typeof(KShapeLayout))
        LSData.ypos = bottom - top - shapeLayout.height + 5 * labelLines 
        LSData.xpos = - 7 
        if (wide) LSData.xpos = - 14 
        
        
        var dLT = ''
        var labelLines2 = 0
        wide = true
        for (dep : basicBlock.getBasicBlockDependencyPredecessors) {
            dLT = dLT + 'dep_g' + dep.getBasicBlockIndex
            dLT = dLT +  "\n"
            labelLines2 = labelLines + 1
        } 
        val depLabelText = dLT
        val depLabel = node.createLabel() => [
            it.text = depLabelText
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(BASICBLOCK_COLOR_RED2, BASICBLOCK_COLOR_GREEN2, BASICBLOCK_COLOR_BLUE2);
        ]
        LSData = depLabel.getData(typeof(KShapeLayout))
        LSData.ypos = bottom - top - shapeLayout.height + 5 * labelLines2 + 5 * labelLines  
        LSData.xpos = - 7 
        if (wide) LSData.xpos = - 14         
        

        var tLT = ''
        labelLines = 0
        wide = false
        for (pred : basicBlock.getBasicBlockSuccessor) {
            if (basicBlock.isPauseSurface) { 
                tLT = tLT + 'suc_g' + pred.getBasicBlockIndex + "\n"
                wide = true
            } else {
                tLT = tLT + 'g' + pred.getBasicBlockIndex + "\n"
            }
            labelLines = labelLines + 1
        } 
        val termLabelText = tLT
        val termLabel = node.createLabel() => [
            it.text = termLabelText
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(BASICBLOCK_COLOR_RED / 2, BASICBLOCK_COLOR_GREEN / 2, BASICBLOCK_COLOR_BLUE / 2);
        ]
        LSData = termLabel.getData(typeof(KShapeLayout))
        LSData.ypos = bottom - top - 5 * labelLines 
        LSData.xpos = right - left + 8
        if (wide) LSData.xpos = right - left + 15


        return node;
    }    
    
    override modify(StyleModificationContext context) {
        System::out.println("MODIFIED2!")
        
        val KShapeLayout layoutData = (context.layoutData as KShapeLayout);
        if (layoutData.xpos == 0f && layoutData.ypos == 0) {
            return false;
        }

        
        val style = context.getStyle()
        val KNode node = ModelingUtil::eContainerOfType(style, typeof(KNode))
        val rootNode = node.eContainer as KNode

        val bBDH = node.getData(typeof(BasicBlockDataHolder))
        val ASCPool = bBDH.SCLProgram.ASCPool
        
        for(basicBlock : bBDH.BasicBlockData) {        
            val obj = new Object()
            
            var schedulable = true
            if (ASCPool.containsEqual(basicBlock)) schedulable = false
        
            var bbLeft = 100000.0f 
            var bbTop = 100000.0f 
            var bbRight = 0.0f
            var bbBottom = 0.0f
            var KNode bbNodeParent = null
            
            for(bbStatement : basicBlock.statements) {
                if (!bbStatement.isEmpty) {
                    val bbNodePair = bBDH.NodeData.get(bbStatement.getInstruction)
                    if (bbNodePair != null) {
                        var bbNode = bbNodePair.first
                
                        bbNodeParent = bbNode.parent                       
                        if (bbStatement.isPause && bbStatement.isPauseDepth) bbNode = bbNodePair.second
                        if (bbStatement.isParallel && bbStatement.isParallelJoin) bbNode = bbNodePair.second
                
                        val bbNodeShapeLayout = bbNode.getData(typeof(KShapeLayout))
                        if (bbNodeShapeLayout.padLeft(basicBlock, bbStatement) < bbLeft) 
                            bbLeft = bbNodeShapeLayout.padLeft(basicBlock, bbStatement)
                        if (bbNodeShapeLayout.padTop(basicBlock, bbStatement) < bbTop) 
                            bbTop = bbNodeShapeLayout.padTop(basicBlock, bbStatement)
                        if (bbNodeShapeLayout.padRight(basicBlock, bbStatement) > bbRight) 
                            bbRight = bbNodeShapeLayout.padRight(basicBlock, bbStatement)
                        if (bbNodeShapeLayout.padBottom(basicBlock, bbStatement) > bbBottom) 
                            bbBottom = bbNodeShapeLayout.padBottom(basicBlock, bbStatement)
                    }
                }
            }
         
            while (bbNodeParent != null) {
                val bbParentShapeLayout = bbNodeParent.getData(typeof(KShapeLayout))
                bbLeft = bbLeft + bbParentShapeLayout.xpos
                bbRight = bbRight + bbParentShapeLayout.xpos
                bbTop = bbTop + bbParentShapeLayout.ypos
                bbBottom = bbBottom + bbParentShapeLayout.ypos
                bbNodeParent = bbNodeParent.parent
            }       
            val kNode = obj.createFrameNode(basicBlock, bbLeft, bbTop, bbRight, bbBottom, schedulable);
            rootNode.children.add(kNode)
        }        
        
        return false;
    }
    
    def float padLeft(KShapeLayout shapeLayout, BasicBlock basicBlock, Statement statement) {
        shapeLayout.xpos - BBPADDING
    }
    
    def float padRight(KShapeLayout shapeLayout, BasicBlock basicBlock, Statement statement) {
        shapeLayout.xpos + shapeLayout.width + BBPADDING
    }
    
    def float padTop(KShapeLayout shapeLayout, BasicBlock basicBlock, Statement statement) {
        var pad = shapeLayout.ypos
        pad = pad - BBPADDING
        pad
    }
    
    def float padBottom(KShapeLayout shapeLayout, BasicBlock basicBlock, Statement statement) {
        var pad = shapeLayout.ypos + shapeLayout.height;
        pad = pad + BBPADDING
        pad
    }
    
}