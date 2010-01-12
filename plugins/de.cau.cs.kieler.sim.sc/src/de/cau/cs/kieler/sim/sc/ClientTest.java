package de.cau.cs.kieler.sim.sc;

import java.io.IOException;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			JSONClient client = new JSONClient(3274);
			client.sndMessage("{\"a\":{\"present\":true}}");
			System.out.println(client.rcvMessage());
			client.sndMessage("{\"a\":{\"present\":true}}");
			System.out.println(client.rcvMessage());
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
