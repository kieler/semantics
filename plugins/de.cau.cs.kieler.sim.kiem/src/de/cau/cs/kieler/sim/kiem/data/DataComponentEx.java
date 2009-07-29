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

package de.cau.cs.kieler.sim.kiem.data;

import java.util.HashMap;

import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;


public class DataComponentEx {
	
	private boolean enabled;
	protected KiemPropertyList properties;  //List of properties
	private DataComponent component;
	private HashMap<Long,Long> poolIndices;
	private long deltaIndex;
	private Boolean json;
	private Boolean propertyComponent; 	   //this component is just a property!
	
	//normal constructor
	public DataComponentEx(DataComponent component) {
		super();
		this.component = component;
		this.enabled = true;
		this.properties = new KiemPropertyList(this.component.getProperties());
		this.propertyComponent = false;
		this.json = null;
		this.poolIndices = new HashMap<Long,Long>();
		this.deltaIndex = 0;
	}

	// --------- for property list entries ------------------------- 
	public DataComponentEx() {
		this.component = null;
		this.enabled = true;
		this.properties = null;
		this.propertyComponent = true;
		this.json = null;
		this.poolIndices = new HashMap<Long,Long>();
		this.deltaIndex = 0;
	}

	public boolean isPropertyComponent() {
		return this.propertyComponent;
	}
	public void setPropertyComponent(boolean propertyComponent) {
		this.propertyComponent = propertyComponent;
	}
	// --------- ------------------------- ------------------------- 

	public boolean isJSON() {
		if (this.json != null) return this.json.booleanValue();
		if (this.getDataComponent() instanceof JSONObjectDataComponent)
			this.json = new Boolean(true);
		else
			this.json = new Boolean(false);
		return this.json.booleanValue();
	}
	
	public DataComponent getDataComponent() {
		return component;
	}
	
	public KiemPropertyList getPropertyList() {
		return this.properties;
	}
	
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	//this is used to store the deltaIndex values inside the components
	//object
	//public HashMap<Long,Long> getDeltaIndex() {
	//	return deltaIndex;
	//}
	public void resetPoolIndices() {
		poolIndices = new HashMap<Long,Long>();
	}
	public void addPoolIndex(long poolIndex, 
							  long stepCounter) {
		if (!poolIndices.containsKey(stepCounter))
			poolIndices.put(stepCounter, poolIndex);
	}
	public long getPoolIndex(long stepCounter) {
		if (!poolIndices.containsKey(stepCounter)) return -1;
		return poolIndices.get(stepCounter);
	}
	public long getDeltaIndex() {
		return this.deltaIndex;
	}
	public void setDeltaIndex(long deltaIndex) {
		this.deltaIndex = deltaIndex;
	}
	
	public boolean isProducer() {
		return this.component.isProducer();
	}
	public boolean isObserver() {
		return this.component.isObserver();
	}
	public boolean isProducerObserver() {
		return (this.isProducer() && this.isObserver());
	}
	public boolean isProducerOnly() {
		return (this.isProducer() && !this.isObserver());
	}
	public boolean isObserverOnly() {
		return (!this.isProducer() && this.isObserver());
	}
	
	//-----------------------------------------------------------------------
	// PROXY METHODS
	
	public String getName() {
		return this.component.getName();
	}
	
	public String[] getFilterKeys() {
		return this.component.getFilterKeys();
	}
	public String[] provideInterfaceVariables() {
		return this.component.provideInterfaceVariables(); 
	}
	public KiemProperty[] getProperties() {
		return this.component.getProperties(); 
	}

	public boolean isDeltaObserver() {
		return this.component.isDeltaObserver(); 
	}
	public boolean isHistoryObserver() {
		return this.component.isHistoryObserver();
	}
	public boolean isHistoryStep() {
		return this.component.isHistoryStep();
	}
	public void setHistoryStep(boolean historyStep) {
		this.component.setHistoryStep(historyStep);
	}
	
	public boolean isMaster() {
		return this.component.isMaster(); 
	}
	public boolean isPauseFlag() {
		return this.component.isPauseFlag(); 
	}
	public boolean isStepDone() {
		return this.component.isStepDone(); 
	}
	
	public void checkProperties(KiemProperty[] properties) 
									throws KiemPropertyException {
		this.component.checkProperties(properties);
	}
	
	public void setInterfaceVariables(String[] globalInterfaceVariables) {
		this.component.setInterfaceVariables(globalInterfaceVariables); 
	}
	
	public boolean isMasterImplementingGUI() {
		return this.component.isMasterImplementingGUI();
	}
	public void	masterGUIstepBack() {
		this.component.masterGUIstepBack();
	}
	public void	masterGUIstep() {
		this.component.masterGUIstep();
	}
	public void	masterGUImacroStep() {
		this.component.masterGUImacroStep();
	}
	public void	masterGUIrun() {
		this.component.masterGUIrun();
	}
	public void	masterGUIpause() {
		this.component.masterGUIpause();
	}
	public void	masterGUIstop() {
		this.component.masterGUIstop();
	}
	
	public boolean masterGUIisEnabledStepBack() {
		return this.component.masterGUIisEnabledStepBack();
	}
	public boolean masterGUIisEnabledStep() {
		return this.component.masterGUIisEnabledStep();
	}
	public boolean masterGUIisEnabledMacroStep() {
		return this.component.masterGUIisEnabledMacroStep();
	}
	public boolean masterGUIisEnabledPause() {
		return this.component.masterGUIisEnabledPause();
	}
	public boolean masterGUIisEnabledRun() {
		return this.component.masterGUIisEnabledRun();
	}
	public boolean masterGUIisEnabledStop() {
		return this.component.masterGUIisEnabledStop();
	}
	
}
