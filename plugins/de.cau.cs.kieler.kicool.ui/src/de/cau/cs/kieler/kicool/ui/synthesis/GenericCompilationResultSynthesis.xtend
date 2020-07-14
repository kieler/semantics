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
package de.cau.cs.kieler.kicool.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KImage
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.ide.model.MessageModel
import de.cau.cs.kieler.klighd.ide.syntheses.MessageModelSynthesis

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.kicool.classes.GenericCompilationResult

/**
 * Generic synthesis for generic compilation results.
 * 
 * @author ssm
 * @kieler.design 2018-11-21 proposed 
 * @kieler.rating 2018-11-21 proposed yellow
 */
@ViewSynthesisShared
class GenericCompilationResultSynthesis extends AbstractDiagramSynthesis<GenericCompilationResult> {

    @Inject
    extension KRenderingExtensions

    @Inject
    extension MessageModelSynthesis

    // -------------------------------------------------------------------------
    // Constants
    public static val String ID = "de.cau.cs.kieler.kicool.ui.synthesis.GenericCompilationResult";

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(GenericCompilationResult model) {
        // create basic representation with message model synthesis
        val rootNode = (new MessageModel("KIELER Compilation", null, KiCoolUiModule.PLUGIN_ID, 
                if (model.successful) "icons/accept-button.png" else "icons/cancel-button.png", 150)
            ).transform
        return rootNode;
    }
    
}
	