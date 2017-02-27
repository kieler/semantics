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
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KForeground

import static extension org.eclipse.xtext.EcoreUtil2.* import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KBackground

/**
 * @author ssm
 * @kieler.design 2017-02-27 proposed 
 * @kieler.rating 2017-02-27 proposed yellow
 */
class ProcessorDataManager {
    
    @Inject extension KNodeExtensions
    
    private static val KColor ERROR_COLOR_FOREGROUND = KRenderingFactory::eINSTANCE.createKColor() => 
        [it.red = 200; it.green = 0; it.blue = 0;]
    private static val KColor ERROR_COLOR_BACKGROUND = KRenderingFactory::eINSTANCE.createKColor() => 
        [it.red = 255; it.green = 222; it.blue = 222;]
    private static val KColor ERROR_COLOR_BACKGROUND_TARGET = KRenderingFactory::eINSTANCE.createKColor() => 
        [it.red = 222; it.green = 177; it.blue = 177;]
    
    private static String NODE_PROCESSOR_BODY = "processorbody"
    private static String NODE_NAME = "name"
    
    static def void populateProcessorData(de.cau.cs.kieler.kicool.Processor processor, KNode node) {
        val rtProcessor = RuntimeSystems.getProcessorInstance(processor)
        
        val nodeIdMap = <String, KNode> newHashMap
        node.eAllContents.filter(KNode).forEach[
            val identifier = getData(KIdentifier)
            nodeIdMap.put(identifier.id, it)
        ]
        
        if (rtProcessor == null) {
            nodeIdMap.findNode(NODE_PROCESSOR_BODY).setFrameErrorColor
            nodeIdMap.findNode(NODE_NAME).label.text = processor.id.split("\\.").last
            return;
        }
        
        nodeIdMap.findNode(NODE_NAME).label.text = rtProcessor.name
    }
    
    
    static def void setFrameErrorColor(KNode node) {
        val rect = node.getData(KRoundedRectangle)
        rect.styles.filter(KForeground).head.color = ERROR_COLOR_FOREGROUND.copy
        rect.styles.filter(KBackground).head => [
            it.color = ERROR_COLOR_BACKGROUND.copy
            it.targetColor = ERROR_COLOR_BACKGROUND_TARGET.copy
        ]
    }
    
    private static def KNode findNode(Map<String, KNode> idMap, String id) {
        idMap.get(id)
    }
    
    private static def KLabel getLabel(KNode node) {
        node.eContents.filter(KLabel).head
    }
}