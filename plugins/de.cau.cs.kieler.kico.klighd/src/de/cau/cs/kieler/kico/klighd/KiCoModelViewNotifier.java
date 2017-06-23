/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.elk.core.util.Pair;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController.ChangeEvent;
import de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner;
import de.cau.cs.kieler.kico.ui.KiCoSelectionView;

/**
 * Static Notifier for the KiCoModelUpdateController.
 * 
 * @author als
 * @kieler.design 2015-06-29 proposed
 * @kieler.rating 2015-06-29 proposed yellow
 *
 */
public class KiCoModelViewNotifier {
    
    /** All controllers. */
    private static final HashSet<KiCoModelUpdateController> CONTROLLERS = new HashSet<KiCoModelUpdateController>();

    /**
     * Adds the given Controller to the list of notified controllers.
     * 
     * @param controller
     *            the update controller
     */
    // package protected
    static void register(final KiCoModelUpdateController controller) {
        CONTROLLERS.add(controller);
    }

    /**
     * Removes the given Controller from the list of notified controllers.
     * 
     * @param controller
     *            the update controller
     */
    // package protected
    static void unregister(final KiCoModelUpdateController controller) {
        CONTROLLERS.remove(controller);
    }

    // -- Notifications
    // -------------------------------------------------------------------------
    
    /**
     * Notifies all ModelViews linked to the Compiler and listening on the given Editor about a new compilation result.
     * 
     * @param editor the related editor
     * @param model the new compilation result
     */
    public static void notifyCompilationChanged(final IEditorPart editor, final Object model) {
        notifyCompilationChanged(editor, model, null);
    }
    
    /**
     * Notifies all ModelViews linked to the Compiler and listening on the given Editor about a new compilation result.
     * 
     * @param editor the related editor
     * @param model the new compilation result
     * @param context the used compilation context
     */
    public static void notifyCompilationChanged(final IEditorPart editor, final Object model, final CompilationResult context) {
        for (KiCoModelUpdateController controller : CONTROLLERS) {
            if (controller.isActive() &&
                controller.getEditor() != null &&
                controller.getEditor() == editor) {
                controller.updateCompilerModel(model, context);
            }
        }
    }
}
