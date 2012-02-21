/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.sim.kart.INamingSuggestion;

/**
 * @author ssc
 *
 */
public class NamingSuggestion implements INamingSuggestion {
    protected IWorkbenchPage activePage = null;
    protected boolean activePageFlag = false;

    /**
     * {@inheritDoc}
     */
    public String suggestName() {
        String filename = "";
        try {
            IEditorPart editor = getActivePage().getActiveEditor();
            
            IFile file = (IFile) editor.getEditorInput().getAdapter(IFile.class);
            URI resource = URI.createURI(file.getLocationURI().toString());
            URI absFile = CommonPlugin.resolve(resource.trimFileExtension().appendFileExtension("eso"));
            filename = absFile.toFileString();            
        } catch (Exception e) {
            // do nothing, auto-suggestion will simply not work
        }
        
        return filename;
    }

    /**
     * Gets the active page (blocking) from the UI thread.
     * 
     * @return the active page
     */
    protected IWorkbenchPage getActivePage() {
            activePageFlag = false;

            Display.getDefault().syncExec(new Runnable() {
                    public void run() {
                            // get the active editor as a default case (if property is
                            // empty)
                            IWorkbenchWindow window = PlatformUI.getWorkbench()
                                            .getActiveWorkbenchWindow();
                            activePage = window.getActivePage();
                            activePageFlag = true;
                    }
            });

            while (!activePageFlag) {
                    try {
                            Thread.sleep(100);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }
            }
            return activePage;
    }
}
