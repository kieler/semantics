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
package de.cau.cs.kieler.cview;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.editors.text.FileEditorInputAdapterFactory;

import de.cau.cs.kieler.cview.model.cViewModel.FileOrFolder;
import de.cau.cs.kieler.klighd.IAction;

/**
 * Open in C or Text Editor
 * 
 * @author cmot
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class OpenEditorAction implements IAction {

    /** The action ID. */
    public static final String ID =
            "de.cau.cs.kieler.cview.OpenEditorAction";

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
        Object inputModel = context.getViewContext().getInputModel();
        Object domainElement = context.getDomainElement(context.getKNode());
        
        String pathString = ((FileOrFolder)domainElement).getLocation();
        Path path = new Path(pathString);
        IFile file = null;
        boolean done = false;
        while (!done) {
            file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
            if (file.exists()) {
                done = true;
            } else {
                int i = pathString.indexOf("/");
                int j = pathString.indexOf("\\");
                if (j > 0) {
                    i = j;
                }
                if (i == -1) {
                    // not founde
                    done = true;
                } else {
                    pathString = pathString.substring(i+1);
                    path = new Path(pathString);
                }
            }
        }
        
        IWorkbenchPage page = Workbench.getInstance().getWorkbenchWindows()[0].getActivePage();
        IEditorDescriptor desc = PlatformUI.getWorkbench().
                getEditorRegistry().getDefaultEditor(file.getName());
        try {
            page.openEditor(new FileEditorInput(file), desc.getId());
        } catch (PartInitException e) {
            e.printStackTrace();
        }        
        
//        // get placeholder model
//        CodePlaceHolder codeModel = null;
//        if (inputModel instanceof CodePlaceHolder) {
//            codeModel = (CodePlaceHolder) inputModel;
//        } else if (context.getKNode() != null) {
//            // if input model is not CodePlaceHolder check if clicked node is associated with it
//            Object domainElement = context.getDomainElement(context.getKNode());
//            if (domainElement instanceof CodePlaceHolder) {
//                codeModel = (CodePlaceHolder) domainElement;
//            }
//        }
//        // open editor
//        if (codeModel != null) {
//            // get window for opening editor
//            IWorkbenchWindow window = context.getViewContext().getDiagramWorkbenchPart().getSite()
//                    .getWorkbenchWindow();
//
//            // Create editor input based on string.
//            // Currently it is better to set this read only because if normal save is used instead
//            // of save as saving has no effect
//            IStorageEditorInput input = new StringBasedEditorInput(codeModel.getName(),
//                    "Generated Code", codeModel.getCode(), true, codeModel.getResourceExtension());
//
//            // open editor
//            IWorkbenchPage page = window.getActivePage();
//            if (page != null) {
//                try {
//                    page.openEditor(input, codeModel.getEditorID());
//                } catch (PartInitException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        return ActionResult.createResult(false);

    }

}
