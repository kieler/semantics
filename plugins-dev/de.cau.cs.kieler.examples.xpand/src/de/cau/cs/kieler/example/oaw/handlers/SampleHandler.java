package de.cau.cs.kieler.example.oaw.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.gmf.runtime.notation.Diagram;
import mymodel.presentation.*;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.WorkflowFacade;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.Writer;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.emf.mwe.core.issues.*;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	
	/**
	 * The constructor.
	 */
	public SampleHandler() {
	}

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
	
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
	    
        ISelection selection = window.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
        String inputModel = extractSelection(selection).getFullPath().toString();
        
        System.out.println(inputModel);
        
		
        //Workflow
        Workflow workflow = new Workflow();
        
        //EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(inputModel);
        emfReader.setModelSlot("model");
        
        //Meta model
        EmfMetaModel metaModel = new EmfMetaModel(mymodel.MymodelPackage.eINSTANCE);

        //Outlet
        Outlet outlet = new Outlet();
        //outlet.setPath("c:/src-gen");
        outlet.setPath("/folder/");
        outlet.setOverwrite(true);
        
        //Generator
        Generator generator = new Generator();
        //generator.setGenPath("\\src-gen");
        generator.addMetaModel(metaModel);
        generator.addOutlet(outlet);
        
        generator.setExpand("model::M2Ttemplate::main FOR model");

        //workflow
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();
        
        workflow.addComponent(emfReader);
        workflow.addComponent(generator);
        workflow.invoke(wfx, monitor, issues);
        
        System.out.print(generator.getLogMessage());
        for (int c = 0; c < issues.getInfos().length; c++)
        	System.out.print(issues.getInfos()[c].getMessage());
        for (int c = 0; c < issues.getIssues().length; c++)
        	System.out.print(issues.getIssues()[c].getMessage());
        for (int c = 0; c < issues.getWarnings().length; c++)
        	System.out.print(issues.getWarnings()[c].getMessage());
        for (int c = 0; c < issues.getErrors().length; c++)
        	System.out.print(issues.getErrors()[c].getMessage());
        
        //EMF writer
        //Writer emfWriter = new Writer();
        //emfWriter.setUri(modelURI);
        //emfWriter.setModelSlot("model");        
        
		return null;
	}
	
    //------------------------------------------------------------------
	
	private static String _pluginFolder;
	public static String getPluginFolder() {
	        if(_pluginFolder == null) {
//	            _pluginFolder = Platform.getBundle("de.cau.cs.kieler.example.oaw.gen").getLocation();
	            _pluginFolder = _pluginFolder.replace("initial@reference:", "");
	            _pluginFolder = _pluginFolder.replace("reference:", "");
	            _pluginFolder = _pluginFolder.replace("file:/", "");
	        }
	        return _pluginFolder;
	 }

	private static String _pluginFolderModel;
	public static String getPluginFolderModel() {
	        if(_pluginFolderModel == null) {
//	        	_pluginFolderModel = Platform.getBundle("de.cau.cs.kieler.example.oaw").getLocation();
	        	_pluginFolderModel = _pluginFolderModel.replace("initial@reference:", "");
	        	_pluginFolderModel = _pluginFolderModel.replace("reference:", "");
	        	_pluginFolderModel = _pluginFolderModel.replace("file:/", "");
	        }
	        return _pluginFolderModel;
	 }
	
}
