package railwayInterfacePackage;

// =========================================================================== 
// ==   Model Railway Interface - Java Side Part  == (c) C.Motika, Aug 2007 ==
// ===========================================================================

/*! \file TAsyncCom.java

  The class implements the basic asynchronous communication. It should 
  facilitate the sending and receiving procedure and hide communication
  details classes using instances of it.
 
 */

// ===========================================================================

import java.io.*;
import java.net.*;


public class TAsyncCom {
	Socket socket;
	PrintWriter writer;
	BufferedReader reader;
	boolean connected;
 	
	//------------------------------------------------------------------------
 	//! The Constructor sets up a listening port server-socket for every new
 	//! TAsyncCom-Object. The port has to be unique!
 	//! Calling Receive later will block until something is received on this
 	//! port.
	//!
	//! @param Host
	//!				host to connect to
	//! @param port
	//!				port to connect to
	//!
    public TAsyncCom(String Host, int port) {
 		 connected = false;
	     try {
		  	  socket = new Socket(Host,port);
		 	  writer = new PrintWriter(socket.getOutputStream(),true);
			  reader = new BufferedReader
				            (new InputStreamReader(socket.getInputStream()));
			  connected = true;
		 }
		 catch(Exception e){
			 //e.printStackTrace();
			 connected = false;
		 }
		 return;		     
	   }
   
	
	//------------------------------------------------------------------------
	//! Send() send a String-Command to a specific Host and Port.
	//! There also is a second version of Send() which will not just send one
	//! String but a StringList of several strings.
	//!
	//! @param Command
	//!				string command to send over tcp
	//! @return
	//!				string answer received from tcp connection
	//!
	public String SendAndReceive(String Command) {
 	   String Result = "";

       try {
			  //send command
			  writer.print(Command);
	  	  	  writer.flush();
	  	  	  
           	  //read answer
	  	  	  String line = "";
			  if ((line = reader.readLine()) != null){
			 	  Result = line;
			  }//end while
 			  connected = true;
		}
		catch(Exception e){
			//e.printStackTrace();
			connected = false;
		}
        return Result;
	}


	//------------------------------------------------------------------------
	//! Send() send a String-Command to a specific Host and Port.
	//! There also is a second version of Send() which will not just send one
	//! String but a StringList of several strings.
	//!
	//! @param Command
	//!				string command to send over tcp
	//!
	public void Send(String Command) {
       try {
			//send command
			writer.print(Command);
	  	  	writer.flush();
			connected = true;
		}
		catch(Exception e){
			//e.printStackTrace();
			connected = false;
		}
        return;
	}
}
