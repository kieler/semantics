package de.cau.cs.kieler.sim.tcpip;

import java.io.IOException;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;

public class DataObserver extends JSONStringDataComponent {

	JSONClient client = null;

	@Override
	public String step(String JSONString) throws KiemExecutionException {
		String out = "";
		try {
			client.sndMessage(JSONString);
			out = client.rcvMessage();
			//client.sndMessage(JSONString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("empfangen: \t" + out);
		return out;
		// System.out.println(in.nextLine());
	}

	@Override
	public void initialize() throws KiemInitializationException {
		// TODO Auto-generated method stub
		try {
			client = new JSONClient(Integer.parseInt(getProperties()[0].getValue()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void wrapup() throws KiemInitializationException {
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[1];
		properties[0] = new KiemProperty(
				"port",
				"12345");
		return properties;
	}

}
