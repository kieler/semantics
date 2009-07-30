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


// TODO: Auto-generated Javadoc
/**
 * The Class DataComponentEx.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public class DataComponentEx {
	
	/** The enabled. */
	private boolean enabled;
	
	/** The properties. */
	protected KiemPropertyList properties;  //List of properties
	
	/** The component. */
	private DataComponent component;
	
	/** The pool indices. */
	private HashMap<Long,Long> poolIndices;
	
	/** The delta index. */
	private long deltaIndex;
	
	/** The json. */
	private Boolean json;
	
	/** The property component. */
	private Boolean propertyComponent; 	   //this component is just a property!
	
	//normal constructor
	/**
	 * Instantiates a new data component ex.
	 * 
	 * @param component the component
	 */
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
	/**
	 * Instantiates a new data component ex.
	 */
	public DataComponentEx() {
		this.component = null;
		this.enabled = true;
		this.properties = null;
		this.propertyComponent = true;
		this.json = null;
		this.poolIndices = new HashMap<Long,Long>();
		this.deltaIndex = 0;
	}

	/**
	 * Checks if is property component.
	 * 
	 * @return true, if is property component
	 */
	public boolean isPropertyComponent() {
		return this.propertyComponent;
	}
	
	/**
	 * Sets the property component.
	 * 
	 * @param propertyComponent the new property component
	 */
	public void setPropertyComponent(boolean propertyComponent) {
		this.propertyComponent = propertyComponent;
	}
	// --------- ------------------------- ------------------------- 

	/**
	 * Checks if is jSON.
	 * 
	 * @return true, if is jSON
	 */
	public boolean isJSON() {
		if (this.json != null) return this.json.booleanValue();
		if (this.getDataComponent() instanceof JSONObjectDataComponent)
			this.json = new Boolean(true);
		else
			this.json = new Boolean(false);
		return this.json.booleanValue();
	}
	
	/**
	 * Gets the data component.
	 * 
	 * @return the data component
	 */
	public DataComponent getDataComponent() {
		return component;
	}
	
	/**
	 * Gets the property list.
	 * 
	 * @return the property list
	 */
	public KiemPropertyList getPropertyList() {
		return this.properties;
	}
	
	
	/**
	 * Checks if is enabled.
	 * 
	 * @return true, if is enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}
	
	/**
	 * Sets the enabled.
	 * 
	 * @param enabled the new enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	//this is used to store the deltaIndex values inside the components
	//object
	//public HashMap<Long,Long> getDeltaIndex() {
	//	return deltaIndex;
	//}
	/**
	 * Reset pool indices.
	 */
	public void resetPoolIndices() {
		poolIndices = new HashMap<Long,Long>();
	}
	
	/**
	 * Adds the pool index.
	 * 
	 * @param poolIndex the pool index
	 * @param stepCounter the step counter
	 */
	public void addPoolIndex(long poolIndex, 
							  long stepCounter) {
		if (!poolIndices.containsKey(stepCounter))
			poolIndices.put(stepCounter, poolIndex);
	}
	
	/**
	 * Gets the pool index.
	 * 
	 * @param stepCounter the step counter
	 * 
	 * @return the pool index
	 */
	public long getPoolIndex(long stepCounter) {
		if (!poolIndices.containsKey(stepCounter)) return -1;
		return poolIndices.get(stepCounter);
	}
	
	/**
	 * Gets the delta index.
	 * 
	 * @return the delta index
	 */
	public long getDeltaIndex() {
		return this.deltaIndex;
	}
	
	/**
	 * Sets the delta index.
	 * 
	 * @param deltaIndex the new delta index
	 */
	public void setDeltaIndex(long deltaIndex) {
		this.deltaIndex = deltaIndex;
	}
	
	/**
	 * Checks if is producer.
	 * 
	 * @return true, if is producer
	 */
	public boolean isProducer() {
		return this.component.isProducer();
	}
	
	/**
	 * Checks if is observer.
	 * 
	 * @return true, if is observer
	 */
	public boolean isObserver() {
		return this.component.isObserver();
	}
	
	/**
	 * Checks if is producer observer.
	 * 
	 * @return true, if is producer observer
	 */
	public boolean isProducerObserver() {
		return (this.isProducer() && this.isObserver());
	}
	
	/**
	 * Checks if is producer only.
	 * 
	 * @return true, if is producer only
	 */
	public boolean isProducerOnly() {
		return (this.isProducer() && !this.isObserver());
	}
	
	/**
	 * Checks if is observer only.
	 * 
	 * @return true, if is observer only
	 */
	public boolean isObserverOnly() {
		return (!this.isProducer() && this.isObserver());
	}
	
	//-----------------------------------------------------------------------
	// PROXY METHODS
	
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.component.getName();
	}
	
	/**
	 * Gets the filter keys.
	 * 
	 * @return the filter keys
	 */
	public String[] getFilterKeys() {
		return this.component.getFilterKeys();
	}
	
	/**
	 * Provide interface variables.
	 * 
	 * @return the string[]
	 */
	public String[] provideInterfaceVariables() {
		return this.component.provideInterfaceVariables(); 
	}
	
	/**
	 * Gets the properties.
	 * 
	 * @return the properties
	 */
	public KiemProperty[] getProperties() {
		return this.component.getProperties(); 
	}

	/**
	 * Checks if is delta observer.
	 * 
	 * @return true, if is delta observer
	 */
	public boolean isDeltaObserver() {
		return this.component.isDeltaObserver(); 
	}
	
	/**
	 * Checks if is history observer.
	 * 
	 * @return true, if is history observer
	 */
	public boolean isHistoryObserver() {
		return this.component.isHistoryObserver();
	}
	
	/**
	 * Checks if is history step.
	 * 
	 * @return true, if is history step
	 */
	public boolean isHistoryStep() {
		return this.component.isHistoryStep();
	}
	
	/**
	 * Sets the history step.
	 * 
	 * @param historyStep the new history step
	 */
	public void setHistoryStep(boolean historyStep) {
		this.component.setHistoryStep(historyStep);
	}
	
	/**
	 * Checks if is master.
	 * 
	 * @return true, if is master
	 */
	public boolean isMaster() {
		return this.component.isMaster(); 
	}
	
	/**
	 * Checks if is pause flag.
	 * 
	 * @return true, if is pause flag
	 */
	public boolean isPauseFlag() {
		return this.component.isPauseFlag(); 
	}
	
	/**
	 * Checks if is step done.
	 * 
	 * @return true, if is step done
	 */
	public boolean isStepDone() {
		return this.component.isStepDone(); 
	}
	
	/**
	 * Check properties.
	 * 
	 * @param properties the properties
	 * 
	 * @throws KiemPropertyException the kiem property exception
	 */
	public void checkProperties(KiemProperty[] properties) 
									throws KiemPropertyException {
		this.component.checkProperties(properties);
	}
	
	/**
	 * Sets the interface variables.
	 * 
	 * @param globalInterfaceVariables the new interface variables
	 */
	public void setInterfaceVariables(String[] globalInterfaceVariables) {
		this.component.setInterfaceVariables(globalInterfaceVariables); 
	}
	
	/**
	 * Checks if is master implementing gui.
	 * 
	 * @return true, if is master implementing gui
	 */
	public boolean isMasterImplementingGUI() {
		return this.component.isMasterImplementingGUI();
	}
	
	/**
	 * Master gu istep back.
	 */
	public void	masterGUIstepBack() {
		this.component.masterGUIstepBack();
	}
	
	/**
	 * Master gu istep.
	 */
	public void	masterGUIstep() {
		this.component.masterGUIstep();
	}
	
	/**
	 * Master gu imacro step.
	 */
	public void	masterGUImacroStep() {
		this.component.masterGUImacroStep();
	}
	
	/**
	 * Master gu irun.
	 */
	public void	masterGUIrun() {
		this.component.masterGUIrun();
	}
	
	/**
	 * Master gu ipause.
	 */
	public void	masterGUIpause() {
		this.component.masterGUIpause();
	}
	
	/**
	 * Master gu istop.
	 */
	public void	masterGUIstop() {
		this.component.masterGUIstop();
	}
	
	/**
	 * Master gu iis enabled step back.
	 * 
	 * @return true, if successful
	 */
	public boolean masterGUIisEnabledStepBack() {
		return this.component.masterGUIisEnabledStepBack();
	}
	
	/**
	 * Master gu iis enabled step.
	 * 
	 * @return true, if successful
	 */
	public boolean masterGUIisEnabledStep() {
		return this.component.masterGUIisEnabledStep();
	}
	
	/**
	 * Master gu iis enabled macro step.
	 * 
	 * @return true, if successful
	 */
	public boolean masterGUIisEnabledMacroStep() {
		return this.component.masterGUIisEnabledMacroStep();
	}
	
	/**
	 * Master gu iis enabled pause.
	 * 
	 * @return true, if successful
	 */
	public boolean masterGUIisEnabledPause() {
		return this.component.masterGUIisEnabledPause();
	}
	
	/**
	 * Master gu iis enabled run.
	 * 
	 * @return true, if successful
	 */
	public boolean masterGUIisEnabledRun() {
		return this.component.masterGUIisEnabledRun();
	}
	
	/**
	 * Master gu iis enabled stop.
	 * 
	 * @return true, if successful
	 */
	public boolean masterGUIisEnabledStop() {
		return this.component.masterGUIisEnabledStop();
	}
	
}
