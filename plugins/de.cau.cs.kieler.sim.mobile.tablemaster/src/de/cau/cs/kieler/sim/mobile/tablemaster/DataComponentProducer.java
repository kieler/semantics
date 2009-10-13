/******************************************************************************
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.mobile.tablemaster;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * The DataComponentProducer of the mobile table master plug-in implements the
 * KIEM producer extension point and is responsible for inserting new data from
 * the remote mobile table unit into the Execution Manager. The insertion is 
 * done by the method {@link #setDataToSend(String)} that will merge the new
 * dataToSend JSON String into the existing {@link #dataToSend} variable.
 * Whenever a {@link #step(String)} is triggered by the Execution Manager the
 * received data is returned and reset. Both methods must execute in mutual
 * exclusion and therefore use the synchronized keyword. 
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 *
 */
public class DataComponentProducer extends JSONStringDataComponent implements
		IJSONStringDataComponent {
	
	/** The data to send. */
	private static String dataToSend;
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new DataComponentProducer KIEM DataComponent that acts
	 * as a producer only.
	 */
	public DataComponentProducer() {
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Sets the data to send which is called by the TCPServer whenever data
	 * (not commands) arrive from the remote data table unit.
	 * 
	 * @param dataToSend the new data to send
	 */
	public static synchronized void setDataToSend(String dataToSend) {
		if (DataComponentProducer.dataToSend != null) {
			try {
				JSONObject base = 
						new JSONObject(DataComponentProducer.dataToSend);
				JSONObject merge = new JSONObject(dataToSend);
				DataComponentProducer.dataToSend =
						 JSONMerger.mergeObjects(base, merge).toString();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			DataComponentProducer.dataToSend = dataToSend;
		}
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent#step(java.lang.String)
	 */
	public String step(String JSONString) throws KiemExecutionException {
		String dataToSendTmp;
		//do this in mutual exclusion to the setDataToSend method
		synchronized(this) {
			dataToSendTmp = DataComponentProducer.dataToSend;
			DataComponentProducer.dataToSend = null;
		}
		return dataToSendTmp;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() throws KiemInitializationException {
		//noop
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		//this is not an observer
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		//this is a producer only
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() throws KiemInitializationException {
		//noop
	}

}
