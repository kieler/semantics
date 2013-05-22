/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
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
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.StyleModificationContext
import de.cau.cs.kieler.klighd.util.ModelingUtil
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import java.util.List

import static de.cau.cs.kieler.scl.klighd.scg.BasicBlockModifier.*
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import java.util.ArrayList
import de.cau.cs.kieler.scl.basicblocks.BasicBlock

class BasicBlockModifier implements IStyleModifier {
    
    extension KRenderingExtensions KRenderingExtensions = 
         Guice::createInjector().getInstance(typeof(KRenderingExtensions))    
    extension KColorExtensions KColorExtensions = 
         Guice::createInjector().getInstance(typeof(KColorExtensions))  
//    extension KLabelExtensions KLabelExtensions = 
//         Guice::createInjector().getInstance(typeof(KLabelExtensions))  
    private static val KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE
    extension SCLBasicBlockExtensions SCLBasicBlockExtensions = 
         Guice::createInjector().getInstance(typeof(SCLBasicBlockExtensions))  
    extension SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))  
         
    private float BBPADDING = 5.0f  

    def KNode create node: KimlUtil::createInitializedNode getNode(Object o) {
    }
    
    def KLabel create node: KimlUtil::createInitializedLabel(labeledElement) getLabel(List<?> o,
            KLabeledGraphElement labeledElement) {
    }
    
    def KLabel createLabel(KLabeledGraphElement labeledElement) {
        return KimlUtil::createInitializedLabel(labeledElement)
    }
    
    def KPolyline createFrameShape() {
        KRenderingFactory::eINSTANCE.createKPolyline() => [
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0);
            it.foreground = "red".color
         ];        
    }

    def KNode createFrameNode(Object o, BasicBlock basicBlock, 
        float left, float top, float right, float bottom
    ) {
        val node = o.node;
        val shape = createFrameShape
        node.data.add(shape)
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = bottom - top
        shapeLayout.width = right - left        
        shapeLayout.xpos = left
        shapeLayout.ypos = top

        node.KRendering.background = "red".color

        val headLabel = node.createLabel() => [
            it.text = 'P' + basicBlock.getBasicBlockIndex
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(255, 0, 0);
        ]
        var LSData = headLabel.getData(typeof(KShapeLayout))
        LSData.ypos = LSData.ypos - 4
        LSData.xpos = LSData.xpos + 5
        
        var gLT = ''
        var labelLines = 0
        for (pred : basicBlock.getBasicBlockPredecessor) {
            gLT = gLT + 'P' + pred.getBasicBlockIndex + "\n"
            labelLines = labelLines + 1
        } 
        val goLabelText = gLT
        val goLabel = node.createLabel() => [
            it.text = goLabelText
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(255, 0, 0);
        ]
        LSData = goLabel.getData(typeof(KShapeLayout))
        LSData.ypos = bottom - top - shapeLayout.height + 5 * labelLines 
        LSData.xpos = right - left + 8

        var tLT = ''
        labelLines = 0
        for (pred : basicBlock.getBasicBlockSuccessor) {
            tLT = tLT + 'P' + pred.getBasicBlockIndex + "\n"
            labelLines = labelLines + 1
        } 
        val termLabelText = tLT
        val termLabel = node.createLabel() => [
            it.text = termLabelText
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(128, 0, 0);
        ]
        LSData = termLabel.getData(typeof(KShapeLayout))
        LSData.ypos = bottom - top - 5 * labelLines 
        LSData.xpos = right - left + 8


        return node;
    }    
    
    override modify(StyleModificationContext context) {
        System::out.println("MODIFIED2!")
        val style = context.getStyle()
        val KNode node = ModelingUtil::eContainerOfType(style, typeof(KNode))
        val rootNode = node.eContainer as KNode

        val bBDH = node.getData(typeof(BasicBlockDataHolder))
        
        for(basicBlock : bBDH.BasicBlockData) {        
            val obj = new Object()
        
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
            val kNode = obj.createFrameNode(basicBlock, bbLeft, bbTop, bbRight, bbBottom);
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