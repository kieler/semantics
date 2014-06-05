

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class TCPClient {
	Socket socket = null;

	public TCPClient() throws IOException {
		socket = new Socket("localhost", 5555);
	}
	
	public TCPClient(String host, int port) throws IOException {
		socket = new Socket(host, port);
	}

	void sndMessage(String msg) throws IOException {
		OutputStreamWriter out = new OutputStreamWriter(socket
				.getOutputStream());
		PrintWriter printWriter = new PrintWriter(out);
		printWriter.print(msg);
		printWriter.flush();
		out.flush();
	}

	String rcvModel() throws IOException {
		InputStreamReader in = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(in);
		
                int lines = Integer.parseInt(bufferedReader.readLine());

                String model = "";
                String s;
                while (lines > 0) {
                    s = bufferedReader.readLine();
                    lines--;
                    if (!model.equals("")) {
                        model += "\n";
                    }
                    model += s;
                }
		
		return model;
	}
	
	void close() throws IOException{
		socket.close();
	}
	
	boolean getBoundingStatus(){
	    return socket.isBound();
	}

}

/*

String sentence;
  String modifiedSentence;
  BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
  Socket clientSocket = new Socket("localhost", 6789);
  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  sentence = inFromUser.readLine();
  outToServer.writeBytes(sentence + '\n');
  modifiedSentence = inFromServer.readLine();
  System.out.println("FROM SERVER: " + modifiedSentence);
  clientSocket.close(); 

*/
