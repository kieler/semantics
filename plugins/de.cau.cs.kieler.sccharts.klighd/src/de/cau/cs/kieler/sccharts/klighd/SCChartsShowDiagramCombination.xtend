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
package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.core.kivi.AbstractCombination
import de.cau.cs.kieler.core.kivi.triggers.PartTrigger
import de.cau.cs.kieler.core.kivi.triggers.SelectionTrigger
import de.cau.cs.kieler.klighd.xtext.UpdateXtextModelKLighDCombination

class SCChartsShowDiagramCombination extends UpdateXtextModelKLighDCombination {
    
// FIX while klighd.incremental is down
//    override getRequestedUpdateStrategy(XtextModelChangeState state) {
//        return UpdateStrategy::ID; 
//    }
    
    /**
     * The 'execute()' method, see doc of {@link AbstractCombination}.
     */    
    def public void execute(PartTrigger.PartState es, SelectionTrigger.SelectionState selectionState) {
            
        // do not react on partStates as well as on selectionStates in case
        //  a view part has been deactivated recently, as an potentially out-dated selection
        //  is currently about to be processed
        // most certainly a "part activated" event will follow and subsequently a further
        //  selection event if the selection of the newly active part is changed, too! 
        if (this.latestState() == es || es.getEventType() == PartTrigger.EventType::VIEW_DEACTIVATED) {
           return;
        }
    }
}