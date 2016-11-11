/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.kivi;

import org.eclipse.elk.core.util.Maybe;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.json.JSONObject;

import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kivi.KiViDataComponent;

/**
 * A data component that observes the activity of syncchart states during simulation.
 *
 * @author mmu
 * @kieler.ignore (excluded from review process)
 */
public class SCChartsDataComponent extends KiViDataComponent {

    /**
     * {@inheritDoc}
     */
    protected IEditorPart getActiveEditor() {
        final Maybe<IEditorPart> maybe = new Maybe<IEditorPart>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage activePage = window.getActivePage();
                IEditorPart editor = activePage.getActiveEditor();
                maybe.set((IEditorPart) editor);
            }
        });
        return maybe.get();
    }

    @Override
    protected String getEncodedEObjectId(final EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected EObject getActiveModel() {
        final IEditorPart editor = getActiveEditor();
        if (editor instanceof XtextEditor) {
            return XtextModelingUtil.getModelFromXtextEditor((XtextEditor)editor, true);
        }
        return null;
    }


}
