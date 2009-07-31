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

/**
 * The Class DataComponentEx. Is a wrapper for the
 * {@link de.cau.cs.kieler.sim.kiem.extension.DataComponent} class.
 * It should enrich the above class with information that is only needed
 * for instances in the running execution manager and its view. For example
 * whether a DataComponent instance is enabled or disabled or the current
 * pool index for delta observer DataComponents.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class DataComponentEx {
	
	/** The boolean enabled flag indicating whether the DataComponent is 
	 * enabled or not. */
	private boolean enabled;
	
	/** The contained DataComponent. */
	private DataComponent component;
	
	/** The pool indices for history steps. */
	private HashMap<Long,Long> poolIndices;
	
	/** The currently stored delta index. */
	private long deltaIndex;
	
	/** The boolean json flag indicating a JSON capable DataComponent. */
	private Boolean json;
	
	/** Indicates that the properties are unfolded. */
	private boolean unfolded;
	
	//------------------------------------------------------------------------- 

	/**
	 * Instantiates a new DataComponentEx wrapping a DataComponent.
	 * 
	 * @param component the contained DataComponent
	 */
	public DataComponentEx(DataComponent component) {
		super();
		this.component = component;
		this.enabled = true;
		this.json = null;
		this.poolIndices = new HashMap<Long,Long>();
		this.deltaIndex = 0;
	}

	//------------------------------------------------------------------------- 

	/**
	 * Checks whether this DataComponent is a JSON component that is able to
	 * handle JSONObjects of the following Java implementation 
	 * {@link "http://www.json.org/java"}.
	 * 
	 * @return true, if this DataComponent is JSON capable
	 */
	public boolean isJSON() {
		if (this.json != null) return this.json.booleanValue();
		if (this.getDataComponent() instanceof JSONObjectDataComponent)
			this.json = new Boolean(true);
		else
			this.json = new Boolean(false);
		return this.json.booleanValue();
	}
	
	//------------------------------------------------------------------------- 
	
  	 /**
	 * Checks whether the properties of this DataComponent are unfolded.
	 * 
	 * @return true, if properties are unfolded
	 */
	public boolean isUnfolded() {
  		 return this.unfolded;
  	 }
  	 
 	//-------------------------------------------------------------------------
  	 
  	 /**
	  * Sets whether the properties of this DataComponent are unfolded.
	  * 
	  * @param unfolded set to true if they are unfolded
	  */
	 public void setUnfolded(boolean unfolded) {
  		 this.unfolded = unfolded;
  	 }
  	 
	//------------------------------------------------------------------------- 
	
	/**
	 * Gets the contained DataComponent.
	 * 
	 * @return the contained DataComponent
	 */
	public DataComponent getDataComponent() {
		return component;
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is enabled or disabled.
	 * 
	 * @return true, if is enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Sets the enabled flag of this DataComponent. This is also reflected by
	 * the KiemView GUI whenever a refresh is triggered.
	 * 
	 * @param enabled true, if the DataComponent is enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Reset pool indices. This is called whenever the execution is reset.
	 */
	public void resetPoolIndices() {
		poolIndices = new HashMap<Long,Long>();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Adds a pool index for a given step. This is necessary to recover
	 * delta pool indices of a history step.
	 * 
	 * @param poolIndex the pool index to add
	 * @param stepCounter the related step counter 
	 */
	public void addPoolIndex(long poolIndex, 
							  long stepCounter) {
		if (!poolIndices.containsKey(stepCounter))
			poolIndices.put(stepCounter, poolIndex);
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Gets the pool index of a specific step. This is necessary to recover
	 * delta pool indices of a history step.
	 * 
	 * @param stepCounter the step counter to find the related pool index
	 * 
	 * @return the related pool index
	 */
	public long getPoolIndex(long stepCounter) {
		if (!poolIndices.containsKey(stepCounter)) return -1;
		return poolIndices.get(stepCounter);
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Gets the delta index. This is used for delta DataComponents only.
	 * The delta index is the last pool index when this DataComponent as
	 * an observer did not get skipped.
	 * 
	 * @return the delta index
	 */
	public long getDeltaIndex() {
		return this.deltaIndex;
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Sets the delta index. This is used for delta DataComponents only.
	 * The delta index is the last pool index when this DataComponent as
	 * an observer did not get skipped.
	 * 
	 * @param deltaIndex the new delta index
	 */
	public void setDeltaIndex(long deltaIndex) {
		this.deltaIndex = deltaIndex;
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is a producer <B>AND</B> an observer at the
	 * same time.
	 * 
	 * @return true, if it is a producer and an observer
	 */
	public boolean isProducerObserver() {
		return (this.isProducer() && this.isObserver());
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is a pure producer only.
	 * 
	 * @return true, if it is a producer only
	 */
	public boolean isProducerOnly() {
		return (this.isProducer() && !this.isObserver());
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is a pure observer only.
	 * 
	 * @return true, if it is an observer only
	 */
	public boolean isObserverOnly() {
		return (!this.isProducer() && this.isObserver());
	}
	
	//-------------------------------------------------------------------------
	//--                       PROXY METHODS                                 --                                 
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is an producer.
	 * 
	 * @return true, if it is a producer
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isProducer()
	 */
	public boolean isProducer() {
		return this.component.isProducer();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is an observer.
	 * 
	 * @return true, if it is an observer
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isObserver()
	 */
	public boolean isObserver() {
		return this.component.isObserver();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Gets the name of the DataComponent.
	 * 
	 * @return the name
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#getName()
	 */
	public String getName() {
		return this.component.getName();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Gets the filter keys if the DataComponent provides any or null if it
	 * is an observer and wants <B>ALL</B> complete data.
	 * 
	 * @return the filter keys
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#getFilterKeys()
	 */
	public String[] getFilterKeys() {
		return this.component.getFilterKeys();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * This method is implemented by the DataComponent if it provides a String[]
	 * array of interface variables.
	 * 
	 * @return the String[] array of interface variables
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideInterfaceVariables()
	 */
	public String[] provideInterfaceVariables() {
		return this.component.provideInterfaceVariables(); 
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Gets the KiemProperties of this DataComponent.
	 * 
	 * @return the KiemProperties
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#getProperties()
	 */
	public KiemProperty[] getProperties() {
		return this.component.getProperties(); 
	}

	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is a delta observer.
	 * 
	 * @return true, if DataComponent is a delta observer
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isDeltaObserver()
	 */
	public boolean isDeltaObserver() {
		return this.component.isDeltaObserver(); 
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the DataComponent is a history observer.
	 * 
	 * @return true, if DataComponent is a history observer
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isHistoryObserver()
	 */
	public boolean isHistoryObserver() {
		return this.component.isHistoryObserver();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks if the current step is a history step. Normally only called by
	 * the DataConsumer itself to implement special behavior within its step()
	 * method.
	 * 
	 * @return true, if current step is a history step
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isHistoryStep()
	 */
	public boolean isHistoryStep() {
		return this.component.isHistoryStep();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Flag the current step as a history step. Called by the execution manager.
	 * 
	 * @param historyStep true, if the step is a history step
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#setHistoryStep(boolean)
	 */
	public void setHistoryStep(boolean historyStep) {
		this.component.setHistoryStep(historyStep);
	}
	
	//------------------------------------------------------------------------- 
	
	/**
	 * Checks whether this DataComponent implements a master.
	 * 
	 * @return true, if the DataComponent is a master
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMaster()
	 */
	public boolean isMaster() {
		return this.component.isMaster(); 
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks if is pause flag.
	 * 
	 * @return true, if is pause flag
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isPauseFlag()
	 */
	public boolean isPauseFlag() {
		return this.component.isPauseFlag(); 
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks if is a macro step is finished.
	 * 
	 * @return true, if checks if is macro step done
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMacroStepDone()
	 */
	public boolean isMacroStepDone() {
		return this.component.isMacroStepDone(); 
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Let the DataComponent check its properties. It is supposed to throw an
	 * error if a property is not set correctly.
	 * 
	 * @param properties the KiemProperties of this component
	 * 
	 * @throws KiemPropertyException an Exception in case of an error
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#checkProperties(KiemProperty[])
	 */
	public void checkProperties(KiemProperty[] properties) 
									throws KiemPropertyException {
		this.component.checkProperties(properties);
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Sets the global interface variables. This method is called by the
	 * execution manager after it collects the union of interface variables
	 * of all DataComponents.
	 * 
	 * @param globalInterfaceVariables all interface variables
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#setInterfaceVariables(String[])
	 */
	public void setInterfaceVariables(String[] globalInterfaceVariables) {
		this.component.setInterfaceVariables(globalInterfaceVariables); 
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Checks whether the master is implementing GUI buttons.
	 * 
	 * @return true, if is master DataComponent is implementing GUI buttons
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMasterImplementingGUI()
	 */
	public boolean isMasterImplementingGUI() {
		return this.component.isMasterImplementingGUI();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button step back.
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIstepBack()
	 */
	public void	masterGUIstepBack() {
		this.component.masterGUIstepBack();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button step.
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIstep()
	 */
	public void	masterGUIstep() {
		this.component.masterGUIstep();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button macro step.
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUImacroStep()
	 */
	public void	masterGUImacroStep() {
		this.component.masterGUImacroStep();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button run.
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIrun()
	 */
	public void	masterGUIrun() {
		this.component.masterGUIrun();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button pause.
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIpause()
	 */
	public void	masterGUIpause() {
		this.component.masterGUIpause();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button stop.
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIstop()
	 */
	public void	masterGUIstop() {
		this.component.masterGUIstop();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button step back.
	 * 
	 * @return true, if button is enabled
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledStepBack()
	 */
	public boolean masterGUIisEnabledStepBack() {
		return this.component.masterGUIisEnabledStepBack();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button step.
	 * 
	 * @return true, if button is enabled
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledStep()
	 */
	public boolean masterGUIisEnabledStep() {
		return this.component.masterGUIisEnabledStep();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button macro step.
	 * 
	 * @return true, if button is enabled
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledMacroStep()
	 */
	public boolean masterGUIisEnabledMacroStep() {
		return this.component.masterGUIisEnabledMacroStep();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button pause.
	 * 
	 * @return true, if button is enabled
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledPause()
	 */
	public boolean masterGUIisEnabledPause() {
		return this.component.masterGUIisEnabledPause();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button run.
	 * 
	 * @return true, if button is enabled
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledRun()
	 */
	public boolean masterGUIisEnabledRun() {
		return this.component.masterGUIisEnabledRun();
	}
	
	//------------------------------------------------------------------------- 

	/**
	 * Master component enables/disables and implements GUI button stop.
	 * 
	 * @return true, if button is enabled
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#masterGUIisEnabledStop()
	 */
	public boolean masterGUIisEnabledStop() {
		return this.component.masterGUIisEnabledStop();
	}
	
}
