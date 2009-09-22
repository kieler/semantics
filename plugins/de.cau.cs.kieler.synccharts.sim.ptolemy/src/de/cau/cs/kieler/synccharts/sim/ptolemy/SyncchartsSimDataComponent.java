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
 ******************************************************************************/

package de.cau.cs.kieler.synccharts.sim.ptolemy;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.synccharts.sim.ptolemy.oaw.MomlWriter;

/**
 * The class SimpleRailCtrl DataComponent implements a KIELER Execution Manager
 * DataComponent.
 * <BR>
 * Within its {@link #initialize()} method it performs the model2model 
 * Xtend transformation to create a semantically equivalent but executable
 * Ptolemy model out of the SimpleRailCtrl EMF model instance. It also loads
 * the Ptolemy model within a PtolemyExecutor and adapts the port and host
 * for connecting to the model railway simulation engine.
 * <BR>
 * Within its {@link #step(JSONObject)} method it then triggers a step of
 * the PtolemyExecutor. Because this is done asynchronously the triggering of
 * a consecutive step may lead to an KiemExecutionError be thrown that
 * was initially the consequence of the last (async) call to the step method
 * of the PtolemyExecutor.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
@SuppressWarnings("restriction")
public class SyncchartsSimDataComponent extends JSONObjectDataComponent { 
  
	/** The Ptolemy Executor */
	private ExecutePtolemyModel PTOEXE;
	
	/** The thread of the Ptolemy Executor */
	private Thread PTOEXE_Thread;
	
	/** The KIELER model. */
	private String kielerModel;
	
	/** The Ptolemy model. */
	private String ptolemyModel;
	
	/** The current workspace folder. */
	private String workspaceFolder;

	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new SimpleRailCtrl DataComponent for the KIELER Execution
	 * Manager.
	 */
	public SyncchartsSimDataComponent() {
	}

    //-------------------------------------------------------------------------
	 
	 /**
     * Transform KIELER SimpleRailCtrl model into a semantically equivalent 
     * Ptolemy model.
     * <BR>
     * This transformation uses the Xtend transformation language.
     * 
     * @param inputModel the input EMF model instance
     * @param outputModel the output Ptolemy model
     * 
     * @return true, if m2m transformation was successful
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
		        EmfMetaModel metaModel1 = new EmfMetaModel(de.cau.cs.kieler.synccharts.SyncchartsPackage.eINSTANCE);
		        EmfMetaModel metaModel2 = new EmfMetaModel(Moml.MomlPackage.eINSTANCE);
				
		        //XtendComponent
		        XtendComponent xtendComponent = new XtendComponent();
		        xtendComponent.addMetaModel(metaModel1);
		        xtendComponent.addMetaModel(metaModel2);
		        xtendComponent.setInvoke("synccharts2moml::transform(emfmodel)");
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
	public JSONObject step(JSONObject jSONObject) throws
												KiemExecutionException {
		
		//set current input data
		PTOEXE.setData(jSONObject);
		
		//perform an asynchronous step in PtolemyExecutor
		//note that this may produce a KiemExecutionException which has it 
		//source in the previous call.
		PTOEXE.executionStep();
		String currentState = PTOEXE.getCurrentState();
		//the stateName is the second KIEM property
		String stateName = this.getProperties()[1].getValue();
		JSONObject returnObj = new JSONObject();
		try {returnObj.accumulate(stateName,currentState);}catch(Exception e){}
		return returnObj;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() throws KiemInitializationException {
		workspaceFolder = Platform.getLocation().toString();
		
		//the SimpleRailCtrl EMF model instance is the first KIEM property
		kielerModel = this.getProperties()[0].getFilePath();
		ptolemyModel = this.getProperties()[0].getDirectory() + "generated.moml";
		
		String ptolemyModelFile = workspaceFolder + ptolemyModel;
				
		System.out.println("Now creating Ptolemy Model ..." + ptolemyModel);

		if (this.Model2ModelTransformation(kielerModel, ptolemyModel)) {
			System.out.println("Now loading Ptolemy Model..." + ptolemyModelFile);
	        //load the Ptolemy Model
	        PTOEXE = new ExecutePtolemyModel(ptolemyModelFile);
	        PTOEXE_Thread = new Thread(PTOEXE);
			System.out.println("Now executing Ptolemy Model...");
	        //start the thread - it is paused by default (steps==0)
	        PTOEXE_Thread.start();
		}//end if
		else 
			new KiemInitializationException
					("Ptolemy Model could not be generated", true, null);
	}

    //-------------------------------------------------------------------------	 
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		return true;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		return true;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
		//stop the model and unlink the PtolemyExecutor thread
		PTOEXE.executionStop();
		PTOEXE = null;
	}
	 
    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
	 */
	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[2];
		properties[0] = new KiemProperty(
				"KIELER Model File",
				new KiemPropertyTypeWorkspaceFile(),
				"\\example\\default.kits");
		properties[1] = new KiemProperty(
				"State Name",
				"state");
		return properties;
	}

    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#testProperties(de.cau.cs.kieler.sim.kiem.data.KiemProperty[])
	 */
	@Override
	public void checkProperties(KiemProperty[] properties) throws KiemPropertyException {
		//check if any EMF model instance form the current workspace is selected
		if (properties[0].getValue().trim().length() == 0) {
			throw new KiemPropertyException("A Syncchart-Model File must be selected!");
		}
	}
	
}
