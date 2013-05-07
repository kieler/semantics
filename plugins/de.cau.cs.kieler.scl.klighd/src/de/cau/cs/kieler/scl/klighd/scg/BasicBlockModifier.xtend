package de.cau.cs.kieler.scl.klighd.scg

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.IStyleModifier
import de.cau.cs.kieler.klighd.StyleModificationContext
import de.cau.cs.kieler.klighd.util.ModelingUtil
import javax.inject.Inject
import com.google.inject.Guice
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.kgraph.KLabeledGraphElement
import java.util.List

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

    def KNode createFrameNode(Object o, BasicBlockDataHolder basicBlockData, 
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
            it.text = 'P' + basicBlockData.BasicBlockRootStatement.getBasicBlockIndex
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(255, 0, 0);
        ]
        var LSData = headLabel.getData(typeof(KShapeLayout))
        LSData.ypos = LSData.ypos - 4
        LSData.xpos = LSData.xpos + 5
        
        var gLT = ''
        for (pred : basicBlockData.BasicBlockRootStatement.getBasicBlockPredecessorRoots) {
            gLT = gLT + 'P' + pred.getBasicBlockIndex + "\n"
        } 
        val goLabelText = gLT
        val goLabel = node.createLabel() => [
            it.text = goLabelText
            it.data += renderingFactory.createKText().setFontName(KlighdConstants::DEFAULT_FONT_NAME).
                setFontSize(5).setForegroundColor(255, 0, 0);
        ]
        LSData = goLabel.getData(typeof(KShapeLayout))
        LSData.ypos = LSData.ypos + 4
        LSData.xpos = right - left + 8

        return node;
    }    
    
    override modify(StyleModificationContext context) {
        System::out.println("MODIFIED2!");
        val style = context.getStyle()
        val KNode node = ModelingUtil::eContainerOfType(style, typeof(KNode))
        val rootNode = node.eContainer as KNode

        val shapeLayout = node.getData(typeof(KShapeLayout))
        val basicBlockData = node.getData(typeof(BasicBlockDataHolder))
        
        val obj = new Object()
        
        var bbLeft = shapeLayout.xpos - BBPADDING
        var bbTop = shapeLayout.ypos - BBPADDING
        var bbRight = shapeLayout.xpos + shapeLayout.width + BBPADDING
        var bbBottom = shapeLayout.ypos + shapeLayout.height + BBPADDING
       
        for(bbNode : basicBlockData.BasicBlockNodes) {
            val bbNodeShapeLayout = bbNode.getData(typeof(KShapeLayout))
            if (bbNodeShapeLayout.padLeft < bbLeft) bbLeft = bbNodeShapeLayout.padLeft
            if (bbNodeShapeLayout.padTop < bbTop) bbTop = bbNodeShapeLayout.padTop
            if (bbNodeShapeLayout.padRight > bbRight) bbRight = bbNodeShapeLayout.padRight
            if (bbNodeShapeLayout.padBottom > bbBottom) bbBottom = bbNodeShapeLayout.padBottom
        }
       
        val kNode = obj.createFrameNode(basicBlockData, bbLeft, bbTop, bbRight, bbBottom);
//        kNode.KRendering.add(factory.createKLineWidth.of(2));
        rootNode.children.add(kNode)        
        
        return false;
    }
    
    def float padLeft(KShapeLayout shapeLayout) {
        shapeLayout.xpos - BBPADDING
    }
    
    def float padRight(KShapeLayout shapeLayout) {
        shapeLayout.xpos + shapeLayout.width + BBPADDING
    }
    
    def float padTop(KShapeLayout shapeLayout) {
        shapeLayout.ypos - BBPADDING
    }
    
    def float padBottom(KShapeLayout shapeLayout) {
        shapeLayout.ypos + shapeLayout.height + BBPADDING
    }
    
}