package de.cau.cs.kieler.sim.mobile.tablemaster;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponentMaster extends JSONStringDataComponent implements
		IJSONStringDataComponent {
	
	private static int port;
	private static final int DEFAULT_PORT = 2222;
	public static TCPServer tcpServer;
	private static DataComponentMaster DataComponentInstance;
	private boolean enabled;
	private boolean executing;

	//-------------------------------------------------------------------------

	public DataComponentMaster() {
		if (DataComponentMaster.DataComponentInstance != null) {
			try {this.finalize();}catch(Throwable e){}
			System.gc();
		}
		DataComponentMaster.DataComponentInstance = this;
		port = DEFAULT_PORT;
		setPort(port);
		executing = false;
	}

	//-------------------------------------------------------------------------
	
	public static DataComponentMaster getInstance() {
		return DataComponentMaster.DataComponentInstance;
	}

	//-------------------------------------------------------------------------
        
    public synchronized void _DataComponent() {
    	try {
    		DataComponentMaster.tcpServer.terminate();
    	}catch(Exception e){}
		DataComponentMaster.tcpServer = null;
		DataComponentMaster.DataComponentInstance = null;
     }
	
	//-------------------------------------------------------------------------
	
	public static synchronized void setPort(int port) {
		if (tcpServer != null)
			tcpServer.terminate();
		tcpServer = new TCPServer(port);
		(new Thread(tcpServer)).start();
	}

	//-------------------------------------------------------------------------

	public String step(String jSONString) throws KiemExecutionException {
		return null;
	}

	//-------------------------------------------------------------------------

	public void initialize() throws KiemInitializationException {
		executing = true;
		JSONObject object = new JSONObject();
		String[] interfaceKeys = this.getInterfaceKeys();
		if (interfaceKeys == null) return;
		for (int c = 0; c < interfaceKeys.length; c++) {
			try {
				object.accumulate(""+c, interfaceKeys[c]);
			}catch(Exception e) {
				throw new KiemInitializationException(
						"Cannot marshall interface keys", true, e);
			}
		}
		System.out.println("INITIALIZE: "+object.toString());
		this.tcpServer.println("I"+object.toString());
	}
	
	//-------------------------------------------------------------------------

	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[1];
		properties[0] = new KiemProperty(
				"Port",
				new PropertyTypeNotifyInt(), 
				""+DEFAULT_PORT);
		return properties;
	}

	//-------------------------------------------------------------------------
	
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return false;
	}

	//-------------------------------------------------------------------------

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	//-------------------------------------------------------------------------

	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub
		executing = false;
	}
	
	//-------------------------------------------------------------------------
	
	public boolean isExecuting() {
		return this.executing;
	}
	
	//-------------------------------------------------------------------------

	public void notifyEnabled(boolean enabled) {
		this.enabled = enabled;
		if (DataComponentMaster.tcpServer == null) return;
		if (DataComponentMaster.tcpServer.isTerminate()) return;
		if (enabled) 
			DataComponentMaster.tcpServer.println("E");
		else
			DataComponentMaster.tcpServer.println("D");
	}
	
	//-------------------------------------------------------------------------

	public boolean isEnabled() {
		return this.enabled;
	}
	
	//-------------------------------------------------------------------------

	@Override
	public boolean isMaster() {
		return true;
	}

}
