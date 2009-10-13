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

package de.cau.cs.kieler.simplerailctrl.codegen.c.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.emf.mwe.core.issues.*;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;


/**
 * The class CodeGenerationHandler is an action handler that
 * can generate C-Code out of the selected SimpleRailCtrl EMF
 * that can be compiled and executed.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
@SuppressWarnings("restriction")
public class CodeGenerationHandler extends AbstractHandler {
	
	/** The plug-in folder. */
	private static String _pluginFolder;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Extract selection of the project explorer.
	 * 
	 * @param sel the selection
	 * 
	 * @return the resource
	 */
	IResource extractSelection(ISelection sel) {
	      if (!(sel instanceof IStructuredSelection))
	         return null;
	      IStructuredSelection ss = (IStructuredSelection) sel;
	      Object element = ss.getFirstElement();
	      if (element instanceof IResource)
	         return (IResource) element;
	      if (!(element instanceof IAdaptable))
	         return null;
	      IAdaptable adaptable = (IAdaptable)element;
	      Object adapter = adaptable.getAdapter(IResource.class);
	      return (IResource) adapter;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		@SuppressWarnings("unused")
		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindow(event);

		IWorkbenchWindow window = HandlerUtil
								.getActiveWorkbenchWindowChecked(event);
	    
        ISelection selection = window.getWorkbench().getActiveWorkbenchWindow()
        						.getSelectionService().getSelection();
        String inputModel = extractSelection(selection).getFullPath()
        						.toString();
        
        //Workflow
        Workflow workflow = new Workflow();
        
        //EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(inputModel);
        emfReader.setModelSlot("model");
        
        //Meta model
        EmfMetaModel metaModel = new EmfMetaModel(de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage.eINSTANCE);

        //Outlet
        Outlet outlet = new Outlet();
        outlet.setOverwrite(true);
        outlet.setPath(getPluginFolder() + "src-gen/");
        
        //Generator
        Generator generator = new Generator();
        //generator.setGenPath("\\src-gen");
        generator.addMetaModel(metaModel);
        generator.addOutlet(outlet);
        
        generator.setExpand("template::main FOR model");
        
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();
        
        workflow.addComponent(emfReader);
        workflow.addComponent(generator);

		boolean success = false;
		try {
			workflow.invoke(wfx, monitor, issues);
			success = true;
		} catch(Exception e){
			e.printStackTrace();
		}
        
        System.out.print(generator.getLogMessage());
        System.out.print(issues.getInfos());
        System.out.print(issues.getIssues());
        System.out.print(issues.getWarnings());
        System.out.print(issues.getErrors().toString());
        
        if (success) {
        	System.out.println("Code Generation - completed.");
        }
        else {
        	System.out.println("Code Generation - failed.");
        }
        
		return null;
	}

	//-------------------------------------------------------------------------
	
	 /**
 	 * Gets the plug-in folder. This is needed to set the generated
 	 * source code folder.
 	 * 
 	 * @return the plug-in folder
 	 */
 	public static String getPluginFolder() {
	        if(_pluginFolder == null) {
	            _pluginFolder = Platform.getBundle("de.cau.cs.kieler.simplerailctrl.codegen.c").getLocation();// .toFile();// .resolve(url);
	            _pluginFolder = _pluginFolder.replace("initial@reference:", "");
	            _pluginFolder = _pluginFolder.replace("reference:", "");
	            _pluginFolder = _pluginFolder.replace("file:/", "");
	        }
	        return _pluginFolder;
	 }
 	
}
