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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.sim.kivi.KiViDataComponent;

/**
 * A data component that observes the activity of syncchart states during simulation.
 * 
 * @author mmu
 * 
 */
public class SyncChartsDataComponent extends KiViDataComponent {
    
    /**
     * {@inheritDoc}
     */
    protected DiagramEditor getActiveEditor() {
        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage activePage = window.getActivePage();
                IEditorPart editor = activePage.getActiveEditor();
                if (editor instanceof DiagramEditor) {
                    maybe.set((DiagramEditor) editor);
                }
            }
        });
        return maybe.get();
    }

    @Override
    protected String getEncodedEObjectId(EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;
    }
    
    
//    /**
//     * {@inheritDoc}
//     * 
//     */
//    public void wrapup() throws KiemInitializationException {
//        super.wrapup();
//        if (SyncChartsCombination.getInstance() != null) {
//            SyncChartsCombination.getInstance().setActive(false);
//            SyncChartsCombination.getInstance().setActive(true);
//        }
//    }    
}
