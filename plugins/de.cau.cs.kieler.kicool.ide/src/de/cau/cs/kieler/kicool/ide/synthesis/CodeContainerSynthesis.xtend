/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.ide.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.kicool.ide.klighd.syntheses.CodePlaceHolderSynthesis
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis

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
    
    public static val SynthesisOption SHOW_LIBS = SynthesisOption::createCheckOption("Library files", true)
    
    override getDisplayedSynthesisOptions() {
        #[
            SHOW_LIBS,
            CodePlaceHolderSynthesis.MAX_PREVIEW_LINES,
            CodePlaceHolderSynthesis.WRAP_LINES
        ]
    }
    
    override transform(CodeContainer model) {
        
        val rootNode = model.createNode
        val myViewContext = usedContext
        for (file : model.files.filter[!library || SHOW_LIBS.booleanValue]) {
            val cphModel = new CodePlaceHolder(file)
            
            if (file.library) {
                cphModel.typeLabel = "LIBRARY"
            }
                         
            val diagramVC = LightDiagramServices.translateModel2(cphModel, usedContext)
            use(myViewContext)
            
            val cphNode = if (diagramVC.viewModel.children.head.children.nullOrEmpty) 
                diagramVC.viewModel.children.head else
                diagramVC.viewModel.children.head.children.head 

            rootNode.children += cphNode
        }
        
        rootNode
    }
    
}
