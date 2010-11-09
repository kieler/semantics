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
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * @author uru
 * 
 */
public class RefreshGMFElementsEffect extends AbstractEffect {

    private SyncchartsDiagramEditor activeEditor;

    /**
     * @param theActiveEditor
     *            active editor which should be refreshed.
     */
    public RefreshGMFElementsEffect(final SyncchartsDiagramEditor theActiveEditor) {
        super();
        this.activeEditor = theActiveEditor;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        // update edit policies, so GMF will generate diagram elements
        // for model elements which have been generated during the
        // transformation.
        Display.getDefault().asyncExec(new Runnable() {
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
