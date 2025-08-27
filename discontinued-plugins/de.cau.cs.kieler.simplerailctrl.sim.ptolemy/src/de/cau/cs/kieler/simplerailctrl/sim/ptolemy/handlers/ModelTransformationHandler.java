/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.simplerailctrl.sim.ptolemy.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.cau.cs.kieler.simplerailctrl.sim.ptolemy.oaw.MomlWriter;

/**
 * The class ModelTransformationHandler is an action handler that
 * can transform the selected SimpleRailCtrl EMF model into a
 * semantically equivalent and executable Ptolemy model.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
@SuppressWarnings("restriction")
public class ModelTransformationHandler extends AbstractHandler {
	
	/** The constant generatedModelName. */
	static final String generatedModelName = "RailController.moml";
	
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

		//get the window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		//extract the selection (using the selection service)
        ISelection selection = window.getWorkbench().getActiveWorkbenchWindow()
        					   .getSelectionService().getSelection();
        //get the full path of the input model
        String inputModel = extractSelection(selection).getFullPath().toString();

        //use the same workspace but a different name for the output model
        int i = inputModel.lastIndexOf("/");
        String outputModel = inputModel.substring(0,i) + "/" + generatedModelName;
		
        //Workflow
        Workflow workflow = new Workflow();
        
        //EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(inputModel);
        emfReader.setModelSlot("emfmodel");

        //MOML writer
        MomlWriter momlWriter = new MomlWriter();
        momlWriter.setUri(outputModel);
        momlWriter.setModelSlot("momlmodel");
        
        //Meta models
        EmfMetaModel metaModel1 = new EmfMetaModel(
        	  de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage.eINSTANCE);
        EmfMetaModel metaModel2 = new EmfMetaModel(Moml.MomlPackage.eINSTANCE);
		
        //XtendComponent
        XtendComponent xtendComponent = new XtendComponent();
        xtendComponent.addMetaModel(metaModel1);
        xtendComponent.addMetaModel(metaModel2);
        xtendComponent.setInvoke("simplerailctrl2moml::transform(emfmodel)");
        xtendComponent.setOutputSlot("momlmodel");
        
        //workflow
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();
        
        workflow.addComponent(emfReader);
        workflow.addComponent(xtendComponent);
        workflow.addComponent(momlWriter);
        workflow.invoke(wfx, monitor, issues);
        
        System.out.print(xtendComponent.getLogMessage());
        System.out.print(issues.getInfos());
        System.out.print(issues.getIssues());
        System.out.print(issues.getWarnings());
        System.out.print(issues.getErrors().toString());
        
	    return null;
	}

}
