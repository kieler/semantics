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

package de.cau.cs.kieler.sim.mobile.tablemaster;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import org.json.JSONObject;

/**
 * The DataComponentMaster of the mobile table master plug-in implements the
 * KIEM initial component extension point and is responsible for the 
 * communication with the remote data table holding the one and only TCPServer
 * instance.<BR>
 * Whenever this component is marked as enabled within the Execution Manager 
 * then the remote table unit acts as a master component and can control the
 * execution, e.g. trigger steps.
 * Otherwise the remote table cannot control the execution which in this case
 * is done within the Execution Manager's UI by the local user running the 
 * latter. 
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 *
 */
public class DataComponentMaster extends JSONStringDataComponent implements
		IJSONStringDataComponent {
	
	/** The listening port for the TCPServer. */
	private static int port;
	
	/** The constant DEFAULT_PORT. */
	private static final int DEFAULT_PORT = 2222;
	
	/** The one and only TCPServer instance. */
	public static TCPServer tcpServer;
	
	/** The one and only DataComponentMaster instance that is used to access 
	 * the TCPServer from within the observer or producer DataComponent
	 * part. */
	private static DataComponentMaster DataComponentInstance;
	
	/** The enabled flag indicating that the remote unit is a master. */
	private boolean enabled;
	
	/** The executing flag indicating the the Execution Manager is currently
	 * running the execution. */
	private boolean executing;

	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new DataComponentMaster. This also tries to stop any
	 * previous instances by calling the finalize() method and the Java 
	 * garbage collector. After that a new TCPServer is created by calling
	 * the {@link #setPort(int)} method.
	 */
	public DataComponentMaster() {
		//try to stop previous instances and free resources (TCP port)
		if (DataComponentMaster.DataComponentInstance != null) {
			try {this.finalize();}catch(Throwable e){}
			System.gc();
		}
		//set the instance and create a new TCP server
		DataComponentMaster.DataComponentInstance = this;
		port = DEFAULT_PORT;
		setPort(port);
		executing = false;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the single instance of DataComponentMaster.
	 * 
	 * @return single instance of DataComponentMaster
	 */
	public static DataComponentMaster getInstance() {
		return DataComponentMaster.DataComponentInstance;
	}

	//-------------------------------------------------------------------------
        
    /* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#_DataComponent()
	 */
	public synchronized void _DataComponent() {
		//this is an explicit destructor that terminates the current TCPServer
		//and also unlinks it (for the garbage collector)
		//this method is called by the execution manager whenever the 
		//DataComponent instance is removed from the list
    	try {
    		DataComponentMaster.tcpServer.terminate();
    	}catch(Exception e){}
		DataComponentMaster.tcpServer = null;
		DataComponentMaster.DataComponentInstance = null;
     }
	
	//-------------------------------------------------------------------------
	
	/**
	 * Sets the port and also creates a new TCPServer. This method also tries
	 * to stop any previously created TCPServer first before creating a new
	 * one.
	 * 
	 * @param port the new port
	 */
	public static synchronized void setPort(int port) {
		if (tcpServer != null)
			tcpServer.terminate();
		tcpServer = new TCPServer(port);
		(new Thread(tcpServer)).start();
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent#step(java.lang.String)
	 */
	public String step(String jSONString) throws KiemExecutionException {
		//this should never be called because this is a pure initialization 
		//DataComponent only
		return null;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() throws KiemInitializationException {
		executing = true;
		JSONObject object = new JSONObject();
		String[] interfaceKeys = this.getInterfaceKeys();
		if (interfaceKeys == null) return;
		//enclose the interface keys for the remote table unit
		for (int c = 0; c < interfaceKeys.length; c++) {
			try {
				object.accumulate(""+c, interfaceKeys[c]);
			}catch(Exception e) {
				throw new KiemInitializationException(
						"Cannot marshall interface keys", true, e);
			}
		}
		DataComponentMaster.tcpServer.println("I"+object.toString());
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideProperties()
	 */
	@Override
	public KiemProperty[] provideProperties() {
		//create a new customized property that allows to change the port
		//whenever the user modifies that
		KiemProperty[] properties = new KiemProperty[1];
		properties[0] = new KiemProperty(
				"Port",
				new PropertyTypeNotifyInt(), 
				""+DEFAULT_PORT);
		return properties;
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		//only an initialization DataComponent
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		//only an initialization DataComponent
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() throws KiemInitializationException {
		executing = false;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * This method can be used to check whether the execution of the KIELER
	 * Execution Manager is currently running or stopped.
	 *  
	 * @return true, if execution is running
	 */
	public boolean isExecuting() {
		return this.executing;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#notifyEnabled(boolean)
	 */
	public void notifyEnabled(boolean enabled) {
		//notfiy the remote table about a change, because an enabled 
		//DataComponentMaster requires the additional MASTER functionality
		//also on the remote side
		this.enabled = enabled;
		if (DataComponentMaster.tcpServer == null) return;
		if (DataComponentMaster.tcpServer.isTerminate()) return;
		if (enabled) 
			DataComponentMaster.tcpServer.println("E"); //Enabled master
		else
			DataComponentMaster.tcpServer.println("D"); //Disabled master
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Checks if is enabled.
	 * 
	 * @return true, if is enabled
	 */
	public boolean isEnabled() {
		return this.enabled;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isMaster()
	 */
	@Override
	public boolean isMaster() {
		return true;
	}

}
