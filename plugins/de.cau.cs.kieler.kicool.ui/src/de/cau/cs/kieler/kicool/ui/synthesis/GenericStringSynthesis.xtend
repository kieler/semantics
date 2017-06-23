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

import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions

/**
 * Generic synthesis for strings.
 * I use this for displaying messages in the model view.
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class GenericStringSynthesis extends AbstractDiagramSynthesis<Container<String>> {

    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    
    override transform(Container<String> model) {
        val rootNode = model.createNode
        
        val node = model.toString.createNode
        
        node.setMinimalNodeSize(34, 34)
        node.addRoundedRectangle(17, 17, 2)
        node.KContainerRendering.addText(model.toString) => [
            fontSize = 11;
            setAreaPlacementData.from(LEFT, 10, 0, TOP, 0, 0).to(RIGHT, 10, 0, BOTTOM, 0, 0)
        ]
        
        rootNode.children += node
        
        rootNode
    }
    
}