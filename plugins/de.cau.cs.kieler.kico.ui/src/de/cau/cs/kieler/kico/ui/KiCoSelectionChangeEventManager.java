/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui;

import org.eclipse.core.commands.common.EventManager;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.KielerCompilerSelection;

/**
 * This manager handles change events produced by SelectionView
 * 
 * @author als
 * @kieler.design 2015-05-18 proposed
 * @kieler.rating 2015-05-18 proposed yellow
 * 
 */
public class KiCoSelectionChangeEventManager extends EventManager {

    /**
     * Defines an object which listens for change events of KiCoSelection.
     * 
     * @author als
     * 
     */
    public interface KiCoSelectionChangeEventListerner {
        /**
         * Invoked when the target of the listener has changed its selection.
         * 
         * @param newSelection
         */
        public void selectionChange(int editorID, Pair<KielerCompilerSelection, Boolean> newSelection);
    }

    /**
     * Adds a new listener to the list of listers on this object
     * 
     * @param listener
     *            new listener
     */
    public void addSelectionChangeEventListener(KiCoSelectionChangeEventListerner listener) {
        addListenerObject(listener);
    }

    /**
     * Adds a listener from the list of listers on this object
     * 
     * @param listener
     *            listener to remove if registered
     */
    public void removeSelectionChangeEventListener(KiCoSelectionChangeEventListerner listener) {
        removeListenerObject(listener);
    }

    /**
     * Fires an change event to all listeners, notifying about the new selection
     * 
     * @param newSelection
     *            new selection
     */
    public void fireSelectionChangeEvent(int editorID, Pair<KielerCompilerSelection, Boolean> newSelection) {
        Object[] l = getListeners();
        for (int i = 0; i < l.length; i++) {
            try {
                ((KiCoSelectionChangeEventListerner) l[i]).selectionChange(editorID, newSelection);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
