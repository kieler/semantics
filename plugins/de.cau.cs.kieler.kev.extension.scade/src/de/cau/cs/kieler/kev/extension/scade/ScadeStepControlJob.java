package de.cau.cs.kieler.kev.extension.scade;

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.extension.StepControlJob;
import de.cau.cs.kieler.kev.helpers.Tools;


/** A Job that takes care of the timing behaviour, i.e. controls that
 * the steps are executed in the time set by the delay variable. It has
 * a ScadeSlaveGateway and will bridge between the AnimationDataController
 * and SCADE.
 * @author haf
 *
 */
public class ScadeStepControlJob extends StepControlJob {

	ScadeSlaveGateway scadeGateway;
	AnimationData animationData;
	int step = 0;
	
	public ScadeStepControlJob(AnimationDataController controller) {
		super("SCADE Step Control Job",controller);
		// TODO: fix hardcoded stuff
		//preferenceStore = KevScadePlugin.getDefault().getPreferenceStore();
		
		scadeGateway = new ScadeSlaveGateway();
	}
	
	/**
	 * This is one step of the execution loop.
	 */
	@Override
	public void myRun() {
		if(scadeGateway.isConnected())
			try {
				// perform a step in SCADE
				scadeGateway.step(1, true);
				// read the outputs of SCADE
				String scadeResponse = scadeGateway.receiveMessage();
				//System.out.println("Data: "+scadeResponse);
				animationData = new StringAnimationData(scadeResponse);
				// notify KEV of data change
				this.getDataController().fireDataChangeEvent(DataChangeEvent.ALL, animationData);
				Tools.setStatusLine(""+ ++step);
			} catch (ClientException e) {
				Tools.showDialog(e);
			}
	}
	
	public boolean isConnected(){
		return scadeGateway.isConnected();
	}
	
	public void init(){
		try {
			Tools.setStatusLine("Loading SCADE preferences...");
			IPreferenceStore preferenceStore = KevScadePlugin.getDefault().getPreferenceStore();
			String host = preferenceStore.getString(WorkbenchPreferencePage.HOST_EDITOR);
			int port = preferenceStore.getInt(WorkbenchPreferencePage.PORT_EDITOR);
			String profile = preferenceStore.getString(WorkbenchPreferencePage.PROFILE_EDITOR);
			String rootNode = preferenceStore.getString(WorkbenchPreferencePage.ROOT_EDITOR);
			String outputpath = preferenceStore.getString(WorkbenchPreferencePage.OUTPUTPATH_EDITOR);
			String inputpath = preferenceStore.getString(WorkbenchPreferencePage.INPUTPATH_EDITOR);
			
			Tools.setStatusLine("Init SCADE gateway...");
			step = 0;
			scadeGateway.init(host,port);
			Tools.setStatusLine("Start SCADE slave simulation...");
			scadeGateway.startSimulation(profile,rootNode);
			scadeGateway.setOutputPath(outputpath);
			scadeGateway.setInputPath(inputpath);			
			Tools.setStatusLine("SCADE simulation ready. press play or step.");
		} catch (ClientException e) {
			Tools.showDialog(e);
			try { scadeGateway.stopSimulation(); } catch (Exception e1) { /* nothing */}
			scadeGateway.close();
			Tools.setStatusLine("Connection to SCADE failed.");
		}	
	}
	
	public void stop(){
		try {
			Tools.setStatusLine("Stop SCADE simulation.");
			step = 0;
			if(scadeGateway.isConnected()){
				scadeGateway.stopSimulation();
			}
		} catch (Exception e) {
			Tools.showDialog(e);
		} 
		scadeGateway.close();
		Tools.setStatusLine("SCADE connection closed.");
	}

	@Override
	public void setControlData(AnimationData data) {
		// TODO Auto-generated method stub
	}

	public void setControlData(DataChangeEvent e) {
		AnimationData controlData = e.getData();
		try{
			scadeGateway.setInputValue(controlData.toString());		
		}catch(Exception exc){
			Tools.showDialog("Could not send data to SCADE", exc);
		}
	}
}
