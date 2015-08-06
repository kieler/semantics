/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.internal;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController.ChangeEvent;
import de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner;
import de.cau.cs.kieler.kico.ui.KiCoSelectionView;

/**
 * Static Listener instance for storing compiler selections of the KiCoSelectionView.
 * <p>
 * TODO This should be included into the KiCoSelectionView somehow.
 * 
 * @author als
 * @kieler.design 2015-06-29 proposed
 * @kieler.rating 2015-06-29 proposed yellow
 *
 */
public class CompilerSelectionStore implements KiCoSelectionChangeEventListerner {
    /** Map from editors (hash) to selected transformations. */
    private static final HashMap<Integer, Pair<KielerCompilerSelection, Boolean>> selections =
            new HashMap<Integer, Pair<KielerCompilerSelection, Boolean>>();
    /** Controller which want to be notifies when selection changed */
    private static final HashSet<KiCoModelUpdateController> listeners =
            new HashSet<KiCoModelUpdateController>();
    /** This class as listener for all necessary events */
    private static CompilerSelectionStore listener = null;

    /**
     * Returns the selection for the given editor.
     * 
     * @param editor
     * @return selection pair or null if nothing selected
     */
    public static Pair<KielerCompilerSelection, Boolean> getSelection(IEditorPart editor) {
        return selections.get(editor.hashCode());
    }

    /**
     * Adds the given Controller to the list of notified controllers.
     * 
     * @param controller
     */
    public static void register(KiCoModelUpdateController controller) {
        if (listener == null) {
            listener = new CompilerSelectionStore();
            KiCoSelectionView.selectionEventManger.addSelectionChangeEventListener(listener);
        }
        listeners.add(controller);
    }

    // -- Part Listener
    // -------------------------------------------------------------------------

    /**
     * Removes the given Controller from the list of notified controllers.
     * 
     * @param controller
     */
    public static void unregister(KiCoModelUpdateController controller) {
        listeners.remove(controller);
    }

    // -- Selection Listener
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void selectionChange(int editorID, Pair<KielerCompilerSelection, Boolean> newSelection) {
        selections.put(editorID, newSelection);
        for (KiCoModelUpdateController listener : listeners) {
            if (listener.getEditor() != null && listener.getEditor().hashCode() == editorID) {
                listener.update(ChangeEvent.SELECTION);
            }
        }
    }
}
