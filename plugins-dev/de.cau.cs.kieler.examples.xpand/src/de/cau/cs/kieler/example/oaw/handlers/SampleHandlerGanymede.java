package de.cau.cs.kieler.example.oaw.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.openarchitectureware.workflow.WorkflowRunner;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandlerGanymede extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public SampleHandlerGanymede() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		//Code Generation Here//
		String PluginRoot = SampleHandlerGanymede.getPluginFolder();
		String PluginModelRoot = SampleHandlerGanymede.getPluginFolderModel();
		String GenFolder = PluginRoot.replace("file:", "") + "src-gen";
		
		Map<String,String> properties = new HashMap<String,String>();
        Map<String, Object> slotContents = new HashMap<String, Object>();

        String WorkflowFile = "model/M2Tworkflow.oaw";
		properties.put("model", PluginRoot + "My.mymodel");
		properties.put("metamodel", PluginModelRoot + "model/mymodel.ecore");
		properties.put("src-gen", GenFolder); 
		
		boolean success = false;
		try {  
		     WorkflowRunner runner = new WorkflowRunner();  
		     success = runner.run(WorkflowFile, null,    
		                                  properties, slotContents);  
		} finally {}  
			   
        if (success) {
    		MessageDialog.openInformation(
    				window.getShell(),
    				"Oaw Plug-in",
    				"Code Generation sucessfull!");

        }
        else {
    		MessageDialog.openInformation(
    				window.getShell(),
    				"Oaw Plug-in",
					"Code Generation failed!");

        }

		
		return null;
	}
	
    //------------------------------------------------------------------
	
	private static String _pluginFolder;
	public static String getPluginFolder() {
	        if(_pluginFolder == null) {
	            _pluginFolder = Platform.getBundle("de.cau.cs.kieler.example.oaw.gen").getLocation();
	            _pluginFolder = _pluginFolder.replace("initial@reference:", "");
	            _pluginFolder = _pluginFolder.replace("reference:", "");
	            _pluginFolder = _pluginFolder.replace("file:/", "");
	        }
	        return _pluginFolder;
	 }

	private static String _pluginFolderModel;
	public static String getPluginFolderModel() {
	        if(_pluginFolderModel == null) {
	        	_pluginFolderModel = Platform.getBundle("de.cau.cs.kieler.example.oaw").getLocation();
	        	_pluginFolderModel = _pluginFolderModel.replace("initial@reference:", "");
	        	_pluginFolderModel = _pluginFolderModel.replace("reference:", "");
	        	_pluginFolderModel = _pluginFolderModel.replace("file:/", "");
	        }
	        return _pluginFolderModel;
	 }
	
}
