/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.kivi;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.triggers.ReInitDiagramTriggerState;
import de.cau.cs.kieler.kiml.kivi.LayoutEffect;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutHandler;

/**
 * This combination triggers an autolayout with the given user preferences when
 * a diagram editor was reinitialized.
 *
 * @author soh
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public class LayoutAfterDiagramReinitCombination extends AbstractCombination {

    /**
     * Perform the autolayout.
     *
     * @param trigger
     *            the trigger
     */
    public void execute(final ReInitDiagramTriggerState trigger) {
        IEditorPart editor = trigger.getEditor();
        if (editor != null) {
            IPreferenceStore preferenceStore = KimlUiPlugin.getDefault().getPreferenceStore();
            boolean animation = preferenceStore.getBoolean(LayoutHandler.PREF_ANIMATION);
            boolean zoomToFit = preferenceStore.getBoolean(LayoutHandler.PREF_ZOOM);
            boolean progressDialog = preferenceStore.getBoolean(LayoutHandler.PREF_PROGRESS);

            schedule(new LayoutEffect(trigger.getEditor(), null, zoomToFit, progressDialog, false,
                    animation));
        }
    }

}
