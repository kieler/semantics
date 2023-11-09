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
package de.cau.cs.kieler.scg.klighd

import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.scg.SCGraphs
import jakarta.inject.Inject

/** 
 * SCCGraph KlighD synthesis class. It contains all method mandatory to handle the visualization of
 * all predefined types of SC graphs.
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
class SCGraphsDiagramSynthesis extends AbstractDiagramSynthesis<SCGraphs> {
    
    @Inject var SCGraphDiagramSynthesis scgSynthesisDelegate
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions

    // -------------------------------------------------------------------------
    // -- Main Entry Point 
    // -------------------------------------------------------------------------
    
    /**
	 * This method is called by KlighD. Trigger your visualization here.
	 * 
	 * @param model
	 * 			the model in question
	 * @return Returns the root KNode.
	 */
	override transform(SCGraphs model) {
	    val node = createNode
	    
        // Start the synthesis.
        val timestamp = System.currentTimeMillis
        
	    for(scg : model.scgs) {
	       node.children += scgSynthesisDelegate.transform(scg) => [
	           addRectangle => [invisible = true]
	       ]
	    }
	    
        // Report duration
        usedContext?.setProperty(KiCoDiagramViewProperties.SYNTHESIS_TIME, System.currentTimeMillis - timestamp)
	    
	    node
	}
	
    override getDisplayedSynthesisOptions() {
        return scgSynthesisDelegate.displayedSynthesisOptions
    }

    override getDisplayedLayoutOptions() {
        return scgSynthesisDelegate.displayedLayoutOptions
    }
	
	override use(ViewContext vc) {
	    super.use(vc)
	    scgSynthesisDelegate.use(vc)
	}
}
