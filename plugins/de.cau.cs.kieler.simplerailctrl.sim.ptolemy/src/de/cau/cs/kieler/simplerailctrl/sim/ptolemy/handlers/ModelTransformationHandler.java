package de.cau.cs.kieler.simplerailctrl.sim.ptolemy.handlers;

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

public class ModelTransformationHandler extends AbstractHandler {
	
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
		ModelFile = ModelFile.replace("file:/", "");
		ModelFile = ModelFile.replace("file:\\", "");
		String PluginRoot = ModelTransformationHandler.getPluginFolder();
		String PtolemyModel = "file:/" + PluginRoot + "src-gen/generated.moml";

		// M2M transformation here //
        Map<String,String> properties = new HashMap<String,String>();
        Map<String, Object> slotContents = new HashMap<String, Object>();
        
        String WorkflowFile = "model/workflowM2M.oaw";
		properties.put("emfmodel", "file:"+ModelFile);
		properties.put("emfmetamodel", "simplerailctrl.ecore");
		properties.put("ptometamodel", "moml.ecore");
		properties.put("momlmodel", PtolemyModel); //"src-gen/generated.moml") ;
		
        
		System.out.println("M2M transformation - starting...");
		
        if (new WorkflowRunner().run(WorkflowFile , 
        		null, properties, slotContents)) {
        	System.out.println("M2M transformation - completed.");
        }
        else {
        	System.out.println("M2M transformation - failed.");
        }
		
	    return null;
	}

	
	 public static String getPluginFolder() {
	        if(_pluginFolder == null) {
	            _pluginFolder = Platform.getBundle("de.cau.cs.kieler.simplerailctrl.sim.ptolemy").getLocation();// .toFile();// .resolve(url);
	            _pluginFolder = _pluginFolder.replace("initial@reference:", "");
	            _pluginFolder = _pluginFolder.replace("reference:", "");
	            _pluginFolder = _pluginFolder.replace("file:/", "");
	            _pluginFolder = _pluginFolder.replace("file:\\", "");
	        }
	        return _pluginFolder;
	 }
}
