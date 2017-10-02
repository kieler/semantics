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
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.kicool.ui.klighd.internal.model.CodePlaceHolder

/**
 * Generic synthesis for strings.
 * I use this for displaying messages in the model view.
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class CodeContainerSynthesis extends AbstractDiagramSynthesis<CodeContainer> {

    @Inject extension KNodeExtensions
    
    override transform(CodeContainer model) {
        val rootNode = model.createNode
        val myViewContext = usedContext
        for (file : model.files.keySet) {
            val cphModel = new CodePlaceHolder(file, model.get(file))
                         
            val diagramVC = LightDiagramServices.translateModel2(
                cphModel, usedContext)
            use(myViewContext)
            
            val cphNode = if (diagramVC.viewModel.children.head.children.nullOrEmpty) 
                diagramVC.viewModel.children.head else
                diagramVC.viewModel.children.head.children.head 

            rootNode.children += cphNode
        }
        
        rootNode
    }
    
}