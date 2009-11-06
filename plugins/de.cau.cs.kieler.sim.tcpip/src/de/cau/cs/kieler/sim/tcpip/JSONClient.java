package de.cau.cs.kieler.sim.tcpip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class JSONClient {
	Socket socket = null;

	public JSONClient() throws IOException {
		socket = new Socket("localhost", 12345);
	}
	
	public JSONClient(int port) throws IOException {
		socket = new Socket("localhost", port);
	}

	void sndMessage(String msg) throws IOException {
		OutputStreamWriter out = new OutputStreamWriter(socket
				.getOutputStream());
		PrintWriter printWriter = new PrintWriter(out);
		printWriter.print(msg);
		printWriter.flush();
	}

	String rcvMessage() throws IOException {
		InputStreamReader in = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(in);
		/* blockiert bis Nachricht empfangen */
		String msg = bufferedReader.readLine();
		return msg;
	}
	
	void close() throws IOException{
		socket.close();
	}
	
	boolean getBoundingStatus(){
	    return socket.isBound();
	}

}