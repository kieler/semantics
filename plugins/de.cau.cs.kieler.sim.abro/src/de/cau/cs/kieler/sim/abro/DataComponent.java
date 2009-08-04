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

package de.cau.cs.kieler.sim.abro;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * The class DataComponent. It implements the KIEM Extension Point
 * for JSONObject capable DataComponents. The behavior is described
 * in {@link AbroPlugin} and the method {@link #step(JSONObject)} 
 * implements this behavior.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {
	
	/** The state ''wait for A''. */
	boolean wA;
	
	/** The state ''wait for B'' */
	boolean wB;
	
	/** The state ''done A''. */
	boolean dA;
	
	/** The state ''done B'' */
	boolean dB;
	
	/** The done state (got A and B). */
	boolean done;
	
	/** The name of the state variable to output. */
	String stateName;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new data component.
	 */
	public DataComponent() {
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Reset abo.
	 */
	private void resetABO() {
		wA = true;
		wB = true;
		dA = false;
		dB = false;
		done = false;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Transition_w a_d a.
	 */
	private void transition_wA_dA() {
		wA = false;
		dA = true;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Transition_w b_d b.
	 */
	private void transition_wB_dB() {
		wB = false;
		dB = true;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Transition_done.
	 */
	private void transition_done() {
		dB = false;
		dA = false;
		done = true;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem.json.JSONObject)
	 */
	public JSONObject step(JSONObject JSONobject) 
								throws KiemExecutionException {

		JSONObject returnObj = new JSONObject();
		try{
			if (JSONobject.has("E")
					&& (JSONSignalValues.isPresent(JSONobject.get("E")))) {
				//raise sample error when signal E is present
				throw new KiemExecutionException("Error detected!", true, null);
			}

			if (JSONobject.has("R")
				&& (JSONSignalValues.isPresent(JSONobject.get("R")))) {
					//reset ABO when R is present
					resetABO();
			}
			else {
				if (wA && JSONobject.has("A") 
					&& (JSONSignalValues.isPresent(JSONobject.get("A")))) {
					//take transition from waitA to doneA when A is present
					transition_wA_dA();
				}
				if (wB && JSONobject.has("B")
					&& (JSONSignalValues.isPresent(JSONobject.get("B")))) {
					//take transition from waitB to doneB when B is present
					transition_wB_dB();
				}
				if (dA && dB) {
					//take normal termination if in both states doneA and doneB
					transition_done();
					returnObj.accumulate("O", JSONSignalValues.newValue(true));
				}
			}
			//return the current state(s) ABRO is in
			if (done) {
				returnObj.accumulate(stateName, "done");
			}
			if (dA && !dB) {
				returnObj.accumulate(stateName, "dA, wB");
			}
			if (dB && !dA) {
				returnObj.accumulate(stateName, "wa, dB");
			}
			if (wA && wB) {
				returnObj.accumulate(stateName, "wA, wB");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return returnObj;
	}

	//--------------------------------------------------------------------------
	//additional methods
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() {
		stateName = getProperties()[0].getValue();
		//write some warm welcome to the console
		System.out.println("ABRO in Java in KIELER in ACTION :-) initialize");
		resetABO();
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
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
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isDeltaObserver() {
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
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMaster()
	 */
	@Override
	public boolean isMaster() {
		return false;
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isPauseFlag()
	 */
	@Override
	public boolean isPauseFlag() {
		return false;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideInterfaceVariables()
	 */
	@Override
	public String[] provideInterfaceVariables() {
		String[] signals = {getProperties()[0].getValue(), 
													"A", "B", "R", "O", "E"}; 
		return signals;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMultiInstantiable()
	 */
	@Override
	public boolean isMultiInstantiable() {
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideProperties()
	 */
	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[7];
		properties[0] = new KiemProperty(
				"state name",
				"ABRO state");
		properties[1] = new KiemProperty(
				"some bool",
				true);
		properties[2] = new KiemProperty(
				"an integer",
				2);
		properties[3] = new KiemProperty(
				"a file",
				new KiemPropertyTypeFile(),
				"c:/nothing.txt");
		String[] items = {"trace 1","trace 2", "trace 3", "trace 4"};
		properties[4] = new KiemProperty(
				"a choice",
				new KiemPropertyTypeChoice(items),
				items[2]);
		properties[5] = new KiemProperty(
				"workspace file",
				new KiemPropertyTypeWorkspaceFile(),
				"/nothing.txt");
		properties[6] = new KiemProperty(
				"editor",
				new KiemPropertyTypeEditor(),
				"");
		return properties;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#checkProperties(de.cau.cs.kieler.sim.kiem.data.KiemProperty[])
	 */
	@Override
	public void checkProperties(KiemProperty[] properties) 
												throws KiemPropertyException {
		if (properties[0].getValue().trim().length() == 0) {
			throw new KiemPropertyException("The state name cannot be empty!");
		}
	}

}
