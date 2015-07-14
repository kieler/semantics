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
package de.cau.cs.kieler.synccharts.klighd

import de.cau.cs.kieler.core.model.triggers.PartTrigger
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.effects.KlighdDiagramEffect
import de.cau.cs.kieler.klighd.incremental.UpdateStrategy
import de.cau.cs.kieler.klighd.xtext.UpdateXtextModelKLighDCombination
import de.cau.cs.kieler.klighd.xtext.triggers.XtextBasedEditorActivationChangeTrigger$XtextModelChangeState
import java.util.Collections
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class SyncChartsShowDiagramCombination extends UpdateXtextModelKLighDCombination {
    
    private static val ResourceSet resSet = new ResourceSetImpl();

    override getRequestedUpdateStrategy(XtextModelChangeState state) {
        return UpdateStrategy::ID;
    }
    
    /**
     * The 'execute()' method, see doc of {@link AbstractCombination}.
     */    
    def public void execute(PartTrigger$PartState es, SelectionTrigger$SelectionState selectionState) {
            
        // do not react on partStates as well as on selectionStates in case
        //  a view part has been deactivated recently, as an potentially out-dated selection
        //  is currently about to be processed
        // most certainly a "part activated" event will follow and subsequently a further
        //  selection event if the selection of the newly active part is changed, too! 
        if (this.latestState() == es || es.eventType == PartTrigger$EventType::VIEW_DEACTIVATED) {
           return;
        }
        
        val selection = selectionState.selectedObjects;
        if (!selection.nullOrEmpty) {
            if (selection.size == 1 && typeof(IFile).isInstance(selection.get(0))) {
                val IFile file = selection.get(0) as IFile;
                val path = file.fullPath.toPortableString;
              
                if (!path.endsWith("kixs") && !path.endsWith("kits")) {
                    return;
                }
                
                val res = resSet.createResource(URI::createPlatformResourceURI(path, false));
                val eObject = (res => [
                    it?.unload();
                    it?.load(Collections::emptyMap());
                ])?.contents?.head;
                if (eObject != null) {
                    this.schedule(new KlighdDiagramEffect("volatile.synccharts.outline", eObject) => [
                        it.setProperty(LightDiagramServices::REQUESTED_UPDATE_STRATEGY, UpdateStrategy::ID);
                    ]);
                }
            }
        }
    }
}