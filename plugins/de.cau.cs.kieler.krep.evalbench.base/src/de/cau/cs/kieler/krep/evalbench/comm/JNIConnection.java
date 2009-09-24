package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.LinkedList;

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.ui.EvalBenchPreferencePage;


public class JNIConnection implements IConnectionProtocol {

    IKrepWrapper krep = null;
    
    public void dispose() {
	if(krep!=null){
	    krep.terminate();
	    krep = null;
	}
	
    }

    public String initialize(String device, int port)
	    throws CommunicationException {
	String name = "unknown";
	if (krep != null) {
	    krep.terminate();
	}
	try {
	    IPreferenceStore preferenceStore = Activator.getDefault()
	    .getPreferenceStore();
	    String currentProtocolType = preferenceStore.getString(EvalBenchPreferencePage.PROTOCOL_TYPE);
	    if (currentProtocolType.equals(ICommunicationProtocol.P_KEP)) {
		name = "kep";
		krep = new KepWrapper();
	    } else if (currentProtocolType
		    .equals(ICommunicationProtocol.P_KREP)) {
		name = "klp";
		krep = new KlpWrapper();
	    } else {
		krep = null;
	    }
	} catch (Throwable t) {
	    throw new CommunicationException("Error generating " + name + "\n"
		    + t.getMessage() + "\nLibrary path: "
		    + System.getProperty("java.library.path"));
	}
	return "started new " + krep.getName();
    }

    public String hark(int n) throws CommunicationException {
	String res = "";
	while (res.length() < n && krep.hasOutput()) {
	    res += krep.getOutput();
	}
	return res;
    }

    public String receive(char exit) throws CommunicationException {
	String res = "";
	char c;
	do {
	    while (!krep.hasOutput()) {
		krep.step();
	    }
	    c = (char)krep.getOutput();
	    res += c;
	} while (c != exit);
	return res;
    }

    public String receive(int n) throws CommunicationException {
	String res = "";
	while (res.length() < n) {
	    krep.step();
	    if (krep.hasOutput()) {
		res += (char)krep.getOutput();
	    }
	}
	return res;
    }

    public void send(String data) throws CommunicationException {
	for (byte b : data.getBytes()) {
	    krep.send(b);
	}
    }

    public void send(byte data) throws CommunicationException {
	//for (byte b : data.getBytes()) {
	    krep.send(data);
	//}
    }
    
    public void comment(String comment) {
	krep.comment(comment);
    }

    public LinkedList<Integer> receiveByte(int n) throws CommunicationException {
	LinkedList<Integer> res = new LinkedList<Integer>();
	while (res.size() < n) {
	    krep.step();
	    if (krep.hasOutput()) {
		
		res.add(((int)krep.getOutput()) & 0xFF);
	    }
	}
	return res;
    }

    public void send(byte[] data) throws CommunicationException {
	for (byte b : data) {
	    krep.send(b);
	}
    }

}
