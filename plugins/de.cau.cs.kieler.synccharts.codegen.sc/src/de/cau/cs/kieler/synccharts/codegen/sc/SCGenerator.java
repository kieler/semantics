/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/

package de.cau.cs.kieler.synccharts.codegen.sc;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A simple class to invoke the process of generating SC-Code.
 * 
 * @kieler.rating 2010-06-14 yellow
 * 
 * @author tam
 * 
 */
public class SCGenerator extends AbstractHandler implements IHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        String fileLocation2 = "";

        // get input model from currently selected file in Explorer
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        File file = (File) ((TreeSelection) selection).getFirstElement();
        fileLocation2 = WorkflowGenerator.getAbsoultePath(URI.createPlatformResourceURI(file
                .getFullPath().toString(), true));

        WorkflowGenerator wf = new WorkflowGenerator(fileLocation2);
        wf.invokeWorkflow(false, "");
        return null;
    }

    // -------------------------------------------------------------------------

    private DiagramEditor diagramEditor = null;
    private boolean diagramEditorFlag = false;

    DiagramEditor getInputEditor() {
        diagramEditorFlag = false;

        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor as a default case (if property is empty)
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage activePage = window.getActivePage();
                IEditorPart editor = activePage.getActiveEditor();
                if (editor instanceof DiagramEditor) {
                    diagramEditor = (DiagramEditor) editor;
                }
                diagramEditorFlag = true;
            }
        });

        while (!diagramEditorFlag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return diagramEditor;
    }

    // -------------------------------------------------------------------------

    public String getInputModel() {
        DiagramEditor inputEditor = this.getInputEditor();
        // now extract the file
        View notationElement = ((View) inputEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();
        URI uri = myModel.eResource().getURI();

        return uri.toPlatformString(false);
    }

    // -------------------------------------------------------------------------
}
