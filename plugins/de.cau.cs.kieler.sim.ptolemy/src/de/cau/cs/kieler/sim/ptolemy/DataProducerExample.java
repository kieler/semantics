package de.cau.cs.kieler.sim.ptolemy;

//Example Data Producer//

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;


import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.extension.DataProducer;

public class DataProducerExample extends DataProducer { 
  
	private static String _pluginFolder;
	
	public DataProducerExample() {
	}

	public static String getPluginFolder() {
	        if(_pluginFolder == null) {
	            _pluginFolder = Platform.getBundle("de.cau.cs.kieler.sim.ptolemy").getLocation();// .toFile();// .resolve(url);
	            _pluginFolder = _pluginFolder.replace("initial@reference:", "");
	        }
	        return _pluginFolder;
	 }
	 
	public void ExecutionInitialize() {
		// TODO Auto-generated method stub
		String PluginRoot = DataProducerExample.getPluginFolder();
		String PtolemyModel = PluginRoot + "src-gen/generated.moml";
		
		// M2M transformation here //
        Map<String,String> properties = new HashMap<String,String>();
        Map<String, Object> slotContents = new HashMap<String, Object>();
        
        String WorkflowFile = "model/workflowM2M.oaw";
		properties.put("emfmodel", "file:"+this.getModelFile());
		properties.put("emfmetamodel", "synccharts.ecore");
		properties.put("ptometamodel", "Moml.ecore");
		properties.put("momlmodel", PtolemyModel); //"src-gen/generated.moml") ;
		
        
		System.out.println("M2M transformation - starting...");
		
        if (new WorkflowRunner().run(WorkflowFile , 
        		null, properties, slotContents)) {
        	System.out.println("M2M transformation - completed.");
        }
        else {
        	System.out.println("M2M transformation - failed.");
        }
		
		try {
	        String command = "D:\\Studium2009\\PtolemyVergil.bat " + PtolemyModel;
	        Process enc = Runtime.getRuntime().exec(command);
	        enc.waitFor();
	    	enc.getErrorStream().close();
	    	enc.getOutputStream().close();
	    	enc.getInputStream().close();
		}//end try
		catch(Exception e) {
			e.printStackTrace();
		}//end catch
	}

	public void ExecutionPause() {
		// TODO Auto-generated method stub
		
	}

	public void ExecutionPlay() {
		// TODO Auto-generated method stub
		
	}

	public void ExecutionStep() {
		// TODO Auto-generated method stub
		
	}

	public void ExecutionStop() {
		// TODO Auto-generated method stub
		
	}

	public void ExecutionInitialize(String ModelFile) {
		// TODO Auto-generated method stub
		
	}
	
	
}
