/******************************************************************************
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem;

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

/**
 * The Class editor is a fake Eclipse EditorPart that handles a convenient
 * way of opening *.execution files over the ProjectExplorer. The editor
 * is registered by the extension point with this file extension and
 * calls the openFile() method of the KiemPlugin. The latter then handles
 * the opening of the file. The editor is not needed anymore and closes
 * itself immediately.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class KiemProxyEditor extends MultiPageEditorPart
 {

	/** The editor input to later find this editor for closing it. */
	private IEditorInput editorInput;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new (fake) editor.
	 */
	public KiemProxyEditor() {
		super();
	}

	//-------------------------------------------------------------------------

	@Override
	public void doSave(IProgressMonitor monitor) {
		//do nothing
	}

	//-------------------------------------------------------------------------

	@Override
	public void doSaveAs() {
		//do nothing
	}

	//-------------------------------------------------------------------------

	public void init(IEditorSite site, 
					 IEditorInput editorInputToOpen)
			throws PartInitException {
         super.init(site, editorInputToOpen);

         //save the editor input for later find the edior in order to
         //close it
         this.editorInput = editorInputToOpen;
         
         //call the KiemPlugin to open asynchronously
         (new Thread() {
        	 public void run() {
        		 KiemPlugin.getDefault().openFile(editorInput);
        	 }
         }).start();
         
         closeEditor();
	}

	//-------------------------------------------------------------------------

	@Override
	public boolean isDirty() {
		return false;
	}

	//-------------------------------------------------------------------------

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	//-------------------------------------------------------------------------

	@Override
	public void setFocus() {
		//do nothing
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * This allows asynchronous closing of this fake editor.
	 */
	public void closeEditor() {
		Display.getDefault().asyncExec(new Runnable(){
			public void run(){
				try {
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					IWorkbenchPage page = window.getActivePage();	
					IEditorPart editor = page.findEditor(editorInput);
					if (editor != null) {
					   //page.activate(editor);
					   page.closeEditor(editor, false);
					}	
					}catch(Exception e){}
			}});            
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#createPages()
	 */
	@Override
	protected void createPages() {
		//create just an empty fake page
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		int index = addPage(composite);
		setPageText(index, " ");
	}

}
