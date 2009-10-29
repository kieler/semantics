package de.cau.cs.kieler.sim.tcpip;

import java.io.IOException;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			JSONClient client = new JSONClient(12345);
			client.sndMessage("{\"B0\":{\"present\":true}}");
			System.out.println(client.rcvMessage());
			client.sndMessage("{\"B1\":{\"present\":true}}");
			System.out.println(client.rcvMessage());
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
