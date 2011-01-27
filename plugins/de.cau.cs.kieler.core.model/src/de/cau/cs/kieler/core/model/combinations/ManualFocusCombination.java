/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.combinations;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.triggers.SelectionTrigger.SelectionState;
import de.cau.cs.kieler.core.model.effects.CompartmentCollapseExpandEffect;
import de.cau.cs.kieler.core.model.trigger.ModelChangeTrigger.ActiveEditorState;

/**
 * @author haf
 * 
 */
public class ManualFocusCombination extends AbstractCombination {

    String selectionFocusButtonId = "de.cau.cs.kieler.core.kivi.selectionFocus";

    public ManualFocusCombination() {
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, selectionFocusButtonId,
                "focusSelect", "Focus selected model objects and do a semantic zooming.", null,
                SWT.CHECK, null, "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorID");
    }

    public void execute(final ButtonState button, final SelectionState selection,
            final ActiveEditorState activeEditor) {
        System.out.println("activeEditor: " + activeEditor);
        if (button.isPushedIn(selectionFocusButtonId)) {
            // collapse all objects
            EObject model = activeEditor.getLastActiveSemanticModel();
            System.out.println("MODEL: " + model);

            this.schedule(new CompartmentCollapseExpandEffect(activeEditor
                    .getLastActiveDiagramEditor(), model, null, 0, true));
            List<EObject> selected = selection.getSelectedEObjects();
        }
    }

}
