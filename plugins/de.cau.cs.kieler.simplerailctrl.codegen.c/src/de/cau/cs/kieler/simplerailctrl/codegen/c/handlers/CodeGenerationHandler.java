package de.cau.cs.kieler.simplerailctrl.codegen.c.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.part.FileEditorInput;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.runtime.IAdaptable;

import de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage;

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


public class CodeGenerationHandler extends AbstractHandler {
	
	private static String _pluginFolder;
	
	
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

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindow(event);

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
        
        //EMF writer
        //Writer emfWriter = new Writer();
        //emfWriter.setUri(modelURI);
        //emfWriter.setModelSlot("model");        
        
        if (success) {
        	System.out.println("Code Generation - completed.");
        }
        else {
        	System.out.println("Code Generation - failed.");
        }
        
		return null;
	}

	
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
