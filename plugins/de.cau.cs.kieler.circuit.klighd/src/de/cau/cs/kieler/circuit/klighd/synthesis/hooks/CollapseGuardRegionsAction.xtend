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
package de.cau.cs.kieler.circuit.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.klighd.CircuitDiagramSynthesis
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * This class hides collapses and expands the guard regions
 * @author fry
 * 
 */
@ViewSynthesisShared
class CollapseGuardRegionsAction extends SynthesisActionHook implements IAction {
    @Inject extension KRenderingExtensions

    public static final String ID = "de.cau.cs.kieler.circuit.klighd.synthesis.hooks.CollapseGuardRegionsAction"
//    public static final SynthesisAction BLA = SynthesisAction.
   
    override executeAction(ActionContext context) {
        var KNode rootNode = context.KNode
        while(rootNode.eContainer != null){
            rootNode = rootNode.eContainer as KNode
        }
        
        val KNode logicRegion = rootNode.children.head.children.filter[labels.head.text == "Program Logic"].head
        val regions = logicRegion.children.filter[!children.empty]
        
        if(regions != null){
        for (region : regions) {
            
                context.getActiveViewer().collapse(region)

            }
            
            }

        return IAction.ActionResult.createResult(true);
    }

    


}
