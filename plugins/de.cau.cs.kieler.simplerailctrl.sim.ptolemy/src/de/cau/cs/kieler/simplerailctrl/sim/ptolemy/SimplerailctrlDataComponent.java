/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 * 
 *****************************************************************************/

package de.cau.cs.kieler.simplerailctrl.sim.ptolemy;

//Example Data Producer//

//import java.util.HashMap;
//import java.util.Map;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.simplerailctrl.sim.ptolemy.handlers.ModelTransformationHandler;
import de.cau.cs.kieler.simplerailctrl.sim.ptolemy.oaw.MomlWriter;

public class SimplerailctrlDataComponent extends JSONObjectDataComponent { 
  
	private static String _pluginFolder;
	private ExecutePtolemyModel PTOEXE;
	private Thread PTOEXE_Thread;
	private String kielerModel;
	private String ptolemyModel;
	private String workspaceFolder;

	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new simplerailctrl data component.
	 */
	public SimplerailctrlDataComponent() {
	}

    //-------------------------------------------------------------------------
	
	 /**
 	 * Gets the plugin folder.
 	 * 
 	 * @return the plugin folder
 	 */
 	public static String getPluginFolder() {
	        if(_pluginFolder == null) {
	            _pluginFolder = Platform.getBundle("de.cau.cs.kieler.simplerailctrl.sim.ptolemy").getLocation();// .toFile();// .resolve(url);
	            _pluginFolder = _pluginFolder.replace("initial@reference:", "");
	        }
	        return _pluginFolder;
	 }
	 
    //-------------------------------------------------------------------------
	 
	 /**
     * Transform KIELER simplerailctrl model into ptolemy model.
     * 
     * @param inputModel the input EMF model
     * @param outputModel the output PTO model
     * 
     * @return true, if successful
     */
    public boolean Model2ModelTransformation(String inputModel,
			 								 String outputModel) {
		 	try {
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
		        EmfMetaModel metaModel1 = new EmfMetaModel(de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage.eINSTANCE);
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
		 	}
		 	catch(Exception e){
		 		return false;
		 	} 
	        
		    return true;
	}
	 
    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem.json.JSONObject)
	 */
	public JSONObject step(JSONObject JSONobject) throws
												KiemExecutionException {
		PTOEXE.executionStep();
		// TODO Auto-generated method stub
		String currentState = PTOEXE.getCurrentState();
		String stateName = this.getProperties()[1].getValue();
		JSONObject returnObj = new JSONObject();
		try {returnObj.accumulate(stateName,currentState);} catch(Exception e){}
		return returnObj;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() throws KiemInitializationException {
		// TODO Auto-generated method stub
		workspaceFolder = Platform.getLocation().toString();
		
		kielerModel = this.getProperties()[0].getFilePath();
		ptolemyModel = this.getProperties()[0].getDirectory() + "generated.moml";
		
		String ptolemyModelFile = workspaceFolder + ptolemyModel;
				
		System.out.println("Now creating Ptolemy Model ..." + ptolemyModel);

		if (this.Model2ModelTransformation(kielerModel, ptolemyModel)) {
			System.out.println("Now loading Ptolemy Model..." + ptolemyModelFile);
	        //Load the Ptolemy Model
			String host = this.getProperties()[2].getValue();
			String port = this.getProperties()[3].getValue();
	        PTOEXE = new ExecutePtolemyModel(ptolemyModelFile,host,port);
	        PTOEXE_Thread = new Thread(PTOEXE);
			System.out.println("Now executing Ptolemy Model...");
	        //Start the Thread - it is paused by default (steps==0)
	        PTOEXE_Thread.start();
		}//end if
		else 
			new KiemInitializationException
					("Ptolemy Model could not be generated", true);
	}

    //-------------------------------------------------------------------------	 
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
		// TODO Auto-generated method stub
		PTOEXE.executionStop();
		PTOEXE = null;
	}
	 
    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
	 */
	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[4];
		properties[0] = new KiemProperty(
				"KIELER Model File",
				new KiemPropertyTypeWorkspaceFile(),
				"\\example\\default.simplerailctrl");
		properties[1] = new KiemProperty(
				"State Name",
				"RAIL state");
		properties[2] = new KiemProperty(
				"Host",
				"localhost");
//				"epoch");
		properties[3] = new KiemProperty(
				"Port",
				2000);
//				5000);
		return properties;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#testProperties(de.cau.cs.kieler.sim.kiem.data.KiemProperty[])
	 */
	@Override
	public void checkProperties(KiemProperty[] properties) throws KiemPropertyException {
		if (properties[0].getValue().trim().length() == 0) {
			throw new KiemPropertyException("A SimpleRailCtrl-Model File must be selected!");
		}
	}
	
}
