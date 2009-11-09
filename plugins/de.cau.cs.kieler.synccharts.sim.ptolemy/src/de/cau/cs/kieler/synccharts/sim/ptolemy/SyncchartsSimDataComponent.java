/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 */

package de.cau.cs.kieler.synccharts.sim.ptolemy;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.emf.mwe.utils.AbstractEMFWorkflowComponent;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.synccharts.sim.ptolemy.oaw.MomlWriter;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import org.eclipse.emf.ecore.resource.ResourceSet;

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
	private Resource ptolemyModel;
	
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
	 * @throws KiemInitializationException 
     */
    public boolean Model2ModelTransformation() 
    									throws KiemInitializationException {
		 	try {
		        //Workflow
		        Workflow workflow = new Workflow();
		        
		        //EMF reader
		        Reader emfReader = new Reader();
		        emfReader.setUri(this.getInputModel());
		        emfReader.setModelSlot("emfmodel");
		        emfReader.setResourceSet(this.getInputResourceSet());

		        //MOML writer
		        MomlWriter momlWriter = new MomlWriter();
		        momlWriter.setUri(ptolemyModel.getURI().toString());
		        momlWriter.setResourceSet(ptolemyModel.getResourceSet());
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
				throw (new KiemInitializationException
				("Ptolemy Model could not be created.", true, e));
		 	} 
	        
		    return true;
	}
	 
    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem.json.JSONObject)
	 */
	public JSONObject step(JSONObject jSONObject) throws
												KiemExecutionException {
		
		System.out.println("Step in Ptolemy Model...");

		//the return object to construct
		JSONObject returnObj = new JSONObject();
		
		//contains the current state
		String currentState = "";
		
		try {
			//set current input data
			PTOEXE.setData(jSONObject);
			
			//perform an synchronous step in PtolemyExecutor
			PTOEXE.executionStep();

			//get the current states
			currentState = PTOEXE.getCurrentState();
		}
		catch(Exception e) {
			throw (new KiemExecutionException
			("Ptolemy Model cannot make a step.", true, e));
		}
		
		//get the output present signals
		String[] presentSignals = PTOEXE.getModelOutputPresentSignals();
		for (int c = 0; c < presentSignals.length; c ++) {
			String signalName = presentSignals[c];
			System.out.println("Present:" + signalName);
			try {
				JSONObject signalObject = JSONSignalValues.newValue(true);
				try {returnObj.accumulate(signalName,signalObject);}catch(Exception e){}
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println( returnObj.toString());
		
		//the stateName is the second KIEM property
		String stateName = this.getProperties()[1].getValue();

		try {returnObj.accumulate(stateName, currentState);}catch(Exception e){}
		return returnObj;
	}

    //-------------------------------------------------------------------------	 

	public String[] provideInterfaceKeys() throws KiemInitializationException {
		//do the initialization prior to providing the interface keys
		//this may rise an exception
		PTOEXE = null;
		System.gc();
		String[] keys = null;
		try {
			loadAndExecuteModel();
			keys = PTOEXE.getInterfaceSignals();
		} catch (Exception e) {
			throw new KiemInitializationException
				("Ptolemy Model could not be generated", true, e);
		}
		return keys;
	}	
	
    //-------------------------------------------------------------------------	 
	
	DiagramEditor getInputEditor() {
		String kiemEditorProperty = this.getProperties()[0].getValue();
		DiagramEditor diagramEditor = null;
		
		//get the active editor as a default case (if property is empty)
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorPart editor = activePage.getActiveEditor();
	    if (editor instanceof DiagramEditor) {
	                diagramEditor = (DiagramEditor) editor;
	    }
		
		//only check non-empty and valid property (this is optional)
		if (!kiemEditorProperty.equals("")) {
			if (getEditor(kiemEditorProperty) != null) {
					diagramEditor = getEditor(kiemEditorProperty);
			}
		}
		return diagramEditor;
	}

	//-------------------------------------------------------------------------	 
	
	String getInputModel() {
		DiagramEditor diagramEditor = this.getInputEditor();
		//now extract the file
	    View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
	    EObject myModel = (EObject) notationElement.getElement();
	    URI uri = myModel.eResource().getURI();
		
	    return uri.toPlatformString(false);
	}
	
    //-------------------------------------------------------------------------
	                     
	ResourceSet getInputResourceSet() {
		DiagramEditor diagramEditor = this.getInputEditor();
		//now extract the file
	    View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
	    EObject myModel = (EObject) notationElement.getElement();
	    URI uri = myModel.eResource().getURI();
		
	    return myModel.eResource().getResourceSet();
	}
	
    //-------------------------------------------------------------------------
	
	public void loadAndExecuteModel() throws KiemInitializationException {
		workspaceFolder = Platform.getLocation().toString();
		
		//ptolemyModel = this.getInputModel() + ".moml"; //this.getProperties()[0].getDirectory() + "generated.moml";

		ResourceSet resourceSet = new ResourceSetImpl();
        URI fileUri = URI.createFileURI(new File("generated.moml").getAbsolutePath());
        ptolemyModel = resourceSet.createResource(fileUri);
        
        String ptolemyModelFile = ptolemyModel.getURI().toFileString();
		
		//String ptolemyModelFile = workspaceFolder + ptolemyModel;
		
		System.out.println("Now creating Ptolemy Model ..." + ptolemyModel);

		if (this.Model2ModelTransformation()) {
			System.out.println("Now loading Ptolemy Model..." + ptolemyModelFile);
	        //load the Ptolemy Model
	        PTOEXE = new ExecutePtolemyModel(ptolemyModelFile);
			System.out.println("Now initializing Ptolemy Model...");
	        PTOEXE.executionInitialize();
			System.out.println("Now executing Ptolemy Model...");
		}//end if
		else {
			throw new KiemInitializationException
				("Ptolemy Model could not be generated", true, null);
		}
	}

	//-------------------------------------------------------------------------	 
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() throws KiemInitializationException {
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
		try {
			PTOEXE.executionStop();
		} catch(Exception e){
			//we expect no serious errors here
		}
		PTOEXE = null;
		System.gc();
	}
	 
    //-------------------------------------------------------------------------	 

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
	 */
	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[2];
		properties[0] = new KiemProperty(
				"SyncChart Editor",
				new KiemPropertyTypeEditor(),
				"");
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
		String kiemEditorProperty = this.getProperties()[0].getValue();
		
		//only check non-empty property (this is optional)
		if (!kiemEditorProperty.equals("")) {
			if (getEditor(kiemEditorProperty) == null) {
				//this is an error, probably the selected editor isnt open any more
				//or the file(name) opened has changed
				throw new KiemPropertyException("The selected editor '"+kiemEditorProperty+"'" +
						" does not exist.\nPlease ensure that an opened editor is selected and" +
						"the file name matches.\n\nIf you want the currently active editor to be" +
						"simulated make sure the (optional) editor property is empty!");
			}
		}
		
		if (this.getInputEditor() == null) {
                    throw new KiemPropertyException("There exists no active editor.\n"+
                            "Please ensure that an opened editor is selected and" +
                            "the file name matches.\n\nIf you want the currently active editor to be" +
                            "simulated make sure the (optional) editor property is empty!");
		}
		
    	
	}
	
    //-------------------------------------------------------------------------	 
	
	DiagramEditor getEditor(String kiemEditorProperty) {
		if ((kiemEditorProperty == null)||(kiemEditorProperty.length() == 0))
		 	return null;
		
        StringTokenizer tokenizer = new StringTokenizer(kiemEditorProperty, " ()");
        if (tokenizer.hasMoreTokens()) {
        	String fileString = tokenizer.nextToken(); 
        	String editorString = tokenizer.nextToken();

             IEditorReference[] editorRefs = PlatformUI.getWorkbench()
                     .getActiveWorkbenchWindow().getActivePage()
                     .getEditorReferences();
             for (int i = 0; i < editorRefs.length; i++) {
                 if (editorRefs[i].getId().equals(editorString)) {
                     IEditorPart editor = editorRefs[i].getEditor(true);
                     if (editor instanceof DiagramEditor) {
                    	 //test if correct file
                    	 if (fileString.equals(editor.getTitle())) {
                    		 return (DiagramEditor) editor;
//                             rootEditPart = ((DiagramEditor) editor)
//                                     .getDiagramEditPart();
//                             break;
                    	 }
                     }
                 }
             }
         }
		return null;
	}
	
}
