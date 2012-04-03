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

import org.eclipse.swt.SWT;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService.LocationScheme;
import de.cau.cs.kieler.core.model.triggers.DiagramTrigger.DiagramState;

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
        // TODO: Implement.
    }
}
