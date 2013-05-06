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
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.core.krendering.KPolyline

class BasicBlockModifier implements IStyleModifier {
    
    extension KRenderingExtensions KRenderingExtensions = 
         Guice::createInjector().getInstance(typeof(KRenderingExtensions))    
    extension KColorExtensions KColorExtensions = 
         Guice::createInjector().getInstance(typeof(KColorExtensions))    

    def KNode create node: KimlUtil::createInitializedNode getNode(Object o) {
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

    def KNode createFrameNode(Object o, int left, int top, int right, int bottom) {
        val node = o.node;
        val shape = createFrameShape
        node.data.add(shape)
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = bottom - top
        shapeLayout.width = right - left        
        return node;
    }
    
    override modify(StyleModificationContext context) {
        System::out.println("MODIFIED2!");
        val style = context.getStyle()
        val KNode node = ModelingUtil::eContainerOfType(style, typeof(KNode))
        val rootNode = node.eContainer as KNode
        
        val obj = new Object()
       
        val kNode = obj.createFrameNode(0,0,50,50);
//        kNode.KRendering.add(factory.createKLineWidth.of(2));
        kNode.KRendering.background = "red".color
        rootNode.children.add(kNode)        
        
        return false;
    }
    
}