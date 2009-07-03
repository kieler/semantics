package de.cau.cs.kieler.simplerailctrl.codegen.c.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.eclipse.ui.part.FileEditorInput;

public class CodeGenerationHandler extends AbstractHandler {
	
	private static String _pluginFolder;
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindow(event);

		IWorkbenchPage page = activeWorkbenchWindow.getActivePage();
		if (page == null) {
			return null;
		}

		IEditorPart editor = page.getActiveEditor();
		if (editor == null) {
			return null;
		}
		
		IWorkbenchWindow window = activeWorkbenchWindow;
		IEditorPart Editor = window.getActivePage().getActiveEditor();

        String ModelFile = "";
		if (Editor.getEditorInput() instanceof URIEditorInput) {
			URIEditorInput EditorInput = (URIEditorInput)Editor.getEditorInput();
	        URI EditorURI = EditorInput.getURI();
	        ModelFile = EditorURI.toString();
		}
		else {
			FileEditorInput EditorInput = (FileEditorInput)Editor.getEditorInput();
			ModelFile = EditorInput.getURI().toString();
		}
		
        //delete "_diagram"-extension
		ModelFile = ModelFile.replace("_diagram", "");
		//ModelFile = ModelFile.replace("reference:", "");
		//ModelFile = ModelFile.replace("file:/", "");

		String PluginRoot = CodeGenerationHandler.getPluginFolder();
		String GenFolder = PluginRoot + "src-gen";
		
		// code generation here //
        Map<String,String> properties = new HashMap<String,String>();
        Map<String, Object> slotContents = new HashMap<String, Object>();
        
        String WorkflowFile = "model/workflowM2T.oaw";
		properties.put("model", ModelFile);
		properties.put("metamodel", "SimpleRailCtrl.ecore");
		properties.put("src-gen", GenFolder); 
		
		System.out.println("Code Generation - starting...");
		
		boolean success = false;
		try {  
//		     ProjectIncludingResourceLoader resourceLoader =   
//		      new ProjectIncludingResourceLoader(project);  
//		     ResourceLoaderFactory.setCurrentThreadResourceLoader(resourceLoader);  
		     WorkflowRunner runner = new WorkflowRunner();  
		     success = runner.run(WorkflowFile, null,    
		                                  properties, slotContents);  
		}	finally {  
//		     ResourceLoaderFactory.setCurrentThreadResourceLoader(null);  
		}  
			   
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
