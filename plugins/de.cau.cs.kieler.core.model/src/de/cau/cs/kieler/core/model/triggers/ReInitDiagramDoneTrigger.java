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
package de.cau.cs.kieler.core.model.triggers;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.ITriggerState;

/**
 * This trigger is used for notifying that a diagram reinitialization has
 * finished.
 * 
 * TODO: Take a look at this code.
 * 
 * @author soh
 */
public class ReInitDiagramDoneTrigger extends AbstractTrigger {

    /** All triggers. */
    private static Set<ReInitDiagramDoneTrigger> triggers =
            new HashSet<ReInitDiagramDoneTrigger>();

    @Override
    public void register() {
        triggers.add(this);
    }

    @Override
    public void unregister() {
        triggers.remove(this);
    }

    /**
     * Notify all triggers of a reinitialized diagram editor.
     * 
     * @param editor
     *            the editor.
     */
    public static void triggerAll(final IEditorPart editor) {
        ITriggerState state = new ReInitDiagramTriggerState(editor);
        for (ReInitDiagramDoneTrigger trigger : triggers) {
            trigger.trigger(state);
        }
    }
}
