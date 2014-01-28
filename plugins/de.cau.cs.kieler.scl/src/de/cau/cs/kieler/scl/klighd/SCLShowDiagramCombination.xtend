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
package de.cau.cs.kieler.scl.klighd

import de.cau.cs.kieler.core.kivi.AbstractCombination
import de.cau.cs.kieler.core.kivi.triggers.PartTrigger
import de.cau.cs.kieler.core.kivi.triggers.SelectionTrigger
import de.cau.cs.kieler.klighd.kivi.effects.KlighdUpdateDiagramEffect
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.klighd.xtext.UpdateXtextModelKLighDCombination
import de.cau.cs.kieler.klighd.xtext.triggers.XtextBasedEditorActivationChangeTrigger.XtextModelChangeState
import java.util.Collections
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import de.cau.cs.kieler.scl.transformations.SCLToSCGTransformation
import com.google.inject.Guice
import de.cau.cs.kieler.scl.scl.Program

/** 
 * SCG Combination for the synthesis of SC Graphs in KlighD.
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
class SCLShowDiagramCombination extends UpdateXtextModelKLighDCombination {
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
        
    /** Resource set */
    private static val ResourceSet resSet = new ResourceSetImpl();

    // -------------------------------------------------------------------------
    // -- Combination 
    // -------------------------------------------------------------------------
    
    /**
     * Returns the ID of the update strategy.
     * 
     * @param state state
     * @return Returns the ID of the update strategy.
     */
    override getRequestedUpdateStrategy(XtextModelChangeState state) {
        return SimpleUpdateStrategy::ID;
    }
    
    /**
     * Is called when the combination is executed. Invoke the KlighD synthesis here.
     * 
     * @param partState partState
     * @param selectionState selectionState
     * @return Returns nothing.
     */    
    def public void execute(PartTrigger.PartState partState, SelectionTrigger.SelectionState selectionState) {
            
        // Do not react on partStates as well as on selectionStates in case
        // a view part has been deactivated recently. 
        // As an potentially out-dated selection is currently about to be processed
        // most certainly a "part activated" event will follow and subsequently a further
        // selection event if the selection of the newly active part is changed, too! 
        if (this.latestState() == partState || partState.eventType == PartTrigger.EventType::VIEW_DEACTIVATED) return
        
        // If something is selected...
        val selection = selectionState.selectionElements;
        if (!selection.nullOrEmpty) {
            if (selection.size == 1 && typeof(IFile).isInstance(selection.get(0))) {
                val IFile file = selection.get(0) as IFile;
                val path = file.fullPath.toPortableString;
              
              	// Abort if its not an SCG that is selected.
                if (!(path.endsWith("scl") || 
                    path.endsWith("scl"))) return

				// Otherwise, create a resource, query an eObject and trigger the KlighD update effect.                
                val res = resSet.createResource(URI::createPlatformResourceURI(path, false));
                val eObject = (res => [
                    it?.unload();
                    it?.load(Collections::emptyMap());
                ])?.contents?.head;
                if (eObject != null) {
                    
                    val SCLToSCGTransformation transformation =
                        Guice.createInjector().getInstance(typeof(SCLToSCGTransformation));

                    try {        
                        val transformed = transformation.transformSCLToSCG(eObject as Program);
                    
                        if (transformed != null) {
                            this.schedule(new KlighdUpdateDiagramEffect("volatile.scg.outline", transformed) => [
                                it.setProperty(KlighdSynthesisProperties::REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy::ID);
                            ]);
                        }
                    } 
                    catch (Exception e) {
                        
                    }
                }
            }
        }
    }
}