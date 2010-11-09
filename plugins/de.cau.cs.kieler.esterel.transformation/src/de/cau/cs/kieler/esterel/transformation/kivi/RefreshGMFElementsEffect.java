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
package de.cau.cs.kieler.esterel.transformation.kivi;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * @author uru
 * 
 */
public class RefreshGMFElementsEffect extends AbstractEffect {

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        final IEditorPart activeEditor = getActiveEditor();
        if (activeEditor instanceof SyncchartsDiagramEditor) {
            // update edit policies, so GMF will generate diagram elements
            // for model elements which have been generated during the
            // transformation.
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    if (activeEditor instanceof IDiagramWorkbenchPart) {
                        EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor)
                                .getDiagramEditPart().getModel()).getElement();
                        List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(obj);
                        for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
                            CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
                            nextEditPolicy.refresh();
                        }
                        IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                                .getDiagramGraphicalViewer();
                        graphViewer.flush();
                    }
                }
            });
        }

    }

    private DiagramEditor getActiveEditor() {

        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IEditorPart editor = EditorUtils.getLastActiveEditor();
                if (editor instanceof DiagramEditor) {
                    maybe.set((DiagramEditor) editor);
                }
            }
        });
        return maybe.get();
    }

}
