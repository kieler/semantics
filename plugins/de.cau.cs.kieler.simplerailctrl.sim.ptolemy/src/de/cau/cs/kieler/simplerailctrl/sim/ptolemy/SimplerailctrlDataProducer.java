package de.cau.cs.kieler.simplerailctrl.sim.ptolemy;

//Example Data Producer//

//import java.util.HashMap;
//import java.util.Map;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.openarchitectureware.workflow.WorkflowRunner;
import de.cau.cs.kieler.sim.kiem.extension.DataProducer;
import de.cau.cs.kieler.simplerailctrl.sim.ptolemy.handlers.ModelTransformationHandler;

public class SimplerailctrlDataProducer extends DataProducer { 
  
	private static String _pluginFolder;
	private ExecutePtolemyModel PTOEXE;
	private Thread PTOEXE_Thread;
	
	public SimplerailctrlDataProducer() {
	}

	 public static String getPluginFolder() {
	        if(_pluginFolder == null) {
	            _pluginFolder = Platform.getBundle("de.cau.cs.kieler.simplerailctrl.sim.ptolemy").getLocation();// .toFile();// .resolve(url);
	            _pluginFolder = _pluginFolder.replace("initial@reference:", "");
	        }
	        return _pluginFolder;
	 }
	 
	public void ExecutionInitialize(String ModelFile) {
		// TODO Auto-generated method stub
		System.out.println("Initialize Execution (" + ModelFile+")");
        //delete "_diagram"-extension
		ModelFile = ModelFile.replace("_diagram", "");
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
        	return;
        }

		System.out.println("Now loading Ptolemy Model..." + PtolemyModel);

		PtolemyModel = PtolemyModel.replace("file:/", "");
		PtolemyModel = PtolemyModel.replace("file:\\", "");
		PtolemyModel = PtolemyModel.replace("file:", "");
        //Load the Ptolemy Model
        PTOEXE = new ExecutePtolemyModel(PtolemyModel);
        PTOEXE_Thread = new Thread(PTOEXE);

		System.out.println("Now executing Ptolemy Model...");
        
        //Start the Thread - it is paused by default (steps==0)
        PTOEXE_Thread.start();
	}

	public void ExecutionPause() {
		// TODO Auto-generated method stub
		System.out.println("Pause Execution");
		PTOEXE.executionPause();
	}

	public void ExecutionPlay() {
		// TODO Auto-generated method stub
		System.out.println("Play Execution");
		PTOEXE.executionPlay();
	}

	public void ExecutionStep() {
		// TODO Auto-generated method stub
		System.out.println("Step Execution");
		PTOEXE.executionStep();
	}

	public void ExecutionStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop Execution");
		PTOEXE.executionStop();
	}
	
	
}
