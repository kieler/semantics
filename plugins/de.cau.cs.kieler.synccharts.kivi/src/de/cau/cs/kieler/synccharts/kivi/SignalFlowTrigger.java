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
package de.cau.cs.kieler.synccharts.kivi;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.kivi.core.Viewmanagement;
import de.cau.cs.kieler.kivi.core.impl.AbstractTrigger;

/**
 * This trigger is informed whenever the button for the signal flow visualization is pushed.
 * 
 * @author mmu
 * 
 */
public class SignalFlowTrigger extends AbstractTrigger {

    private static SignalFlowTrigger instance;

    private boolean pushed;

    private ISelection selection;

    private IEditorPart editor;

    /**
     * Default constructor.
     */
    public SignalFlowTrigger() {
        instance = this;
    }

    private SignalFlowTrigger(final boolean p, final ISelection s, final IEditorPart e) {
        pushed = p;
        selection = s;
        editor = e;
    }

    /**
     * Get the faux-singleton instance.
     * 
     * @return the instance
     */
    public static SignalFlowTrigger getInstance() {
        return instance;
    }

    @Override
    public void register() {
        // TODO look into dynamic hiding of the signal flow button if the trigger is disabled
    }

    @Override
    public void unregister() {
        // TODO see above
    }

    /**
     * Called by the signal flow handler when the button is pressed.
     * 
     * @param p
     *            true if the button is in the pushed state
     * @param s
     *            the current selection in the SyncChart editor
     * @param e
     *            the active SyncChart editor
     */
    public void button(final boolean p, final ISelection s, final IEditorPart e) {
        if (isActive()) {
            Viewmanagement.getInstance().trigger(new SignalFlowTrigger(p, s, e));
        }
    }

    /**
     * Check whether the button is in the pushed state.
     * 
     * @return true if pushed
     */
    public boolean isPushed() {
        return pushed;
    }

    /**
     * Get the current selection in the active editor.
     * 
     * @return the current selection
     */
    public ISelection getSelection() {
        return selection;
    }

    /**
     * Get the active editor.
     * 
     * @return the active editor
     */
    public IEditorPart getEditor() {
        return editor;
    }

}
