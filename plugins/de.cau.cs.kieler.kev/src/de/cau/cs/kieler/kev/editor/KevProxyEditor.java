/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Kiel University + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kev.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.KevView;

/**
 * Proxy editor for opening mapping files by double clicking.
 * 
 * @author soh
 * @kieler.ignore deprecated project
 */
public class KevProxyEditor extends MultiPageEditorPart {

    /** The editor input to later find this editor for closing it. */
    private IEditorInput editorInput;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createPages() {
        Composite composite = new Composite(getContainer(), SWT.NONE);
        FillLayout layout = new FillLayout();
        composite.setLayout(layout);
        int index = addPage(composite);
        setPageText(index, " ");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSave(IProgressMonitor monitor) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSaveAs() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
        super.init(site, input);

        // save the editor input for later find the edior in order to
        // close it
        this.editorInput = input;
        try {
            IWorkbenchWindow window = this.getSite().getWorkbenchWindow();
            IViewPart vP = window.getActivePage().showView(KevView.ID);
            vP.setFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        (new Thread() {
            @Override
            public void run() {
                if (input instanceof FileEditorInput) {
                    FileEditorInput fileInput = (FileEditorInput) input;
                    String file = "file:" + fileInput.getPath().toOSString();
                    MapAnimations.getInstance().initializeMappingFile(file, false);
                }
            }
        }).start();

        closeEditor();

    }

    /**
     * This allows asynchronous closing of this fake editor.
     */
    public void closeEditor() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                try {
                    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    IWorkbenchPage page = window.getActivePage();
                    IEditorPart editor = page.findEditor(editorInput);
                    if (editor != null) {
                        // page.activate(editor);
                        page.closeEditor(editor, false);
                    }
                } catch (Exception e) {
                    // In an unlikely case of an error leave the editor open//
                }
            }
        });
    }
}
