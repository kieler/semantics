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
 */

package de.cau.cs.kieler.sim.kiem.internal;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.IViewPart;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * The Class editor is a fake Eclipse EditorPart that handles a convenient way of opening
 * *.execution files over the ProjectExplorer. The editor is registered by the extension point with
 * this file extension and calls the openFile() method of the KiemPlugin. The latter then handles
 * the opening of the file. The editor is not needed anymore and closes itself immediately.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 */
public class KiemProxyEditor extends MultiPageEditorPart {

    /** The editor input to later find this editor for closing it. */
    private IEditorInput editorInput;

    /** The id of the view for KIEM. */
    private static final String KIEMVIEWID = "de.cau.cs.kieler.sim.kiem.view";

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new (fake) editor.
     */
    public KiemProxyEditor() {
        super();
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void doSave(final IProgressMonitor monitor) {
        // do nothing
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorPart#doSaveAs()
     */
    @Override
    public void doSaveAs() {
        // do nothing
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.MultiPageEditorPart#init(org.eclipse.ui.IEditorSite,
     * org.eclipse.ui.IEditorInput)
     */
    @Override
    public void init(final IEditorSite site, final IEditorInput editorInputToOpen)
            throws PartInitException {
        super.init(site, editorInputToOpen);

        // save the editor input for later find the edior in order to
        // close it
        this.editorInput = editorInputToOpen;

        // bring KIEM view to the front (lazy loading)
        try {
            IWorkbenchWindow window = this.getSite().getWorkbenchWindow();
            IViewPart vP = window.getActivePage().showView(KIEMVIEWID);
            vP.setFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // call the KiemPlugin to open asynchronously
        (new Thread() {
            public void run() {
                try {
                    KiemPlugin.getDefault().openFile(editorInput);
                } catch (IOException e) {
                    // Should not happen because the editorInput is always of type IFileEditorInput
                    e.printStackTrace();
                }
            }
        }).start();

        closeEditor();
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.MultiPageEditorPart#isDirty()
     */
    @Override
    public boolean isDirty() {
        return false;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.MultiPageEditorPart#setFocus()
     */
    @Override
    public void setFocus() {
        // do nothing
    }

    // -------------------------------------------------------------------------

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

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.MultiPageEditorPart#createPages()
     */
    @Override
    protected void createPages() {
        // create just an empty fake page
        Composite composite = new Composite(getContainer(), SWT.NONE);
        FillLayout layout = new FillLayout();
        composite.setLayout(layout);
        int index = addPage(composite);
        setPageText(index, " ");
    }

}
