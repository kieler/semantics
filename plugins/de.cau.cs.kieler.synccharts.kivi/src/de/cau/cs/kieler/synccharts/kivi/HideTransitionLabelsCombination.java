/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.kivi;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService.LocationScheme;
import de.cau.cs.kieler.core.model.triggers.DiagramTrigger.DiagramState;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutEffect;
import de.cau.cs.kieler.synccharts.diagram.custom.triggerlisteners.VisibilityManagerShowHideEffect;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * This combination hides or shows transition labels upon the press of a button.
 * 
 * @author cds
 */
public class HideTransitionLabelsCombination extends AbstractCombination {
    
    // CONSTANTS
    
    /**
     * ID of the SyncCharts editor.
     */
    private static final String SYNCCHARTS_EDITOR_ID =
            "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorID";
    
    /**
     * ID of the hide button.
     */
    private static final String HIDE_BUTTON_ID = "de.cau.cs.kieler.synccharts.kivi.hideTransitionLabels";
    
    /**
     * ID of the show button.
     */
    private static final String SHOW_BUTTON_ID = "de.cau.cs.kieler.synccharts.kivi.showTransitionLabels";
    
    
    /**
     * Creates a new instance and registers the two toolbar buttons associated with this combination.
     */
    public HideTransitionLabelsCombination() {
        KiviMenuContributionService.INSTANCE.addToolbarButton(
                this,
                SHOW_BUTTON_ID,
                "Show Transition Labels",
                "Shows all transition labels and triggers automatic layout.",
                null,  // ICON!
                SWT.PUSH,
                LocationScheme.TOOLBAR,
                null,
                null,
                null,
                SYNCCHARTS_EDITOR_ID);
        
        KiviMenuContributionService.INSTANCE.addToolbarButton(
                this,
                HIDE_BUTTON_ID,
                "Hide Transition Labels",
                "Hides all transition labels and triggers automatic layout.",
                null,  // ICON!
                SWT.PUSH,
                LocationScheme.TOOLBAR,
                null,
                null,
                null,
                SYNCCHARTS_EDITOR_ID);
    }
    
    
    /**
     * Shows or hides the transition labels of the active editor.
     * 
     * @param buttonState listen to ButtonTriggers.
     * @param diagram listen to DiagramTriggers.
     */
    public void execute(final ButtonState buttonState, final DiagramState diagram) {
        // Check what actually triggered this combination
        if (this.latestState() != buttonState) {
            // We only react to button presses
            return;
        }
        
        // Check whether to show or to hide everything
        boolean hide = buttonState.getButtonId().equals(HIDE_BUTTON_ID);
        
        // Get the editor and all of its edit parts
        SyncchartsDiagramEditor editor = (SyncchartsDiagramEditor) diagram.getDiagramPart();
        DiagramEditPart editPart = editor.getDiagramEditPart();
        Collection<?> editParts = editPart.getViewer().getEditPartRegistry().values();
        List<Object> list = new LinkedList<Object>();
        for (Object ep : editParts) {
            list.add(ep);
        }
        
        // Iterate over all the edit parts in the diagram and show / hide those representing
        // transition labels.
        for (Object ep : list) {
            if (ep instanceof TransitionLabelEditPart) {
                this.schedule(new VisibilityManagerShowHideEffect(
                        editor,
                        (TransitionLabelEditPart) ep,
                        hide));
            }
        }
        
        // Finally, schedule automatic layout
        this.schedule(new LayoutEffect(diagram.getDiagramPart(), null, false, false, true));
    }
}
