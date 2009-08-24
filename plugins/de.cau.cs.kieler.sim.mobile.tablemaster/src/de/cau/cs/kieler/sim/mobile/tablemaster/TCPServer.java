/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author delphino
 *
 */
 //----------------------------------------------------------------------

 public class TCPServer implements Runnable {
	
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter writer;
	private BufferedReader reader;
	private boolean terminate;
	private int port;
	private String lastLine;
	private static TCPServer instance;
	
	//-------------------------------------------------------------------------

	public TCPServer(int port) {
		instance = this;
		this.port = port;
	}

	//-------------------------------------------------------------------------

	public void terminate() {
		synchronized (DataComponentMaster.getInstance()) {
			System.out.println(this.hashCode()+" TERMINATE()");
			try{this.clientSocket.close();}catch(Exception e){}
			terminate = true;
		}
	}

	//-------------------------------------------------------------------------

	public void print(String text) {
		if (writer != null)
			this.writer.print(text);
	}
	
	//-------------------------------------------------------------------------

	public void println(String text) {
		if (writer != null)
			this.writer.println(text);
	}

	//-------------------------------------------------------------------------
	
	public boolean isTerminate() {
		return this.terminate;
	}
	
	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		//sleep to wait for potentially blocked port
		try{Thread.sleep(1000);}catch(Exception e){}
		synchronized (DataComponentMaster.getInstance()) {
			try {
	  			serverSocket = new ServerSocket(this.port);
	  			serverSocket.setSoTimeout(500);
			}catch(Exception e){
				e.printStackTrace();
				terminate = true;
				return;
			}
		}
		
		System.out.println(this.hashCode() + " SERVER RUNNING");
		terminate = false;
		
	  	while (!terminate) {
	  		try {
	  			System.out.println(this.hashCode() + " WAITING FOR CLIENTS");
		  		//connection accepted
		  		clientSocket = serverSocket.accept();
		  		System.out.println(this.hashCode() + " CLIENT ACCEPTED");
		  		if (terminate) {
		  			break;
		  		}
		  		
		  		clientSocket.setKeepAlive(true);
				writer = new PrintWriter(clientSocket.getOutputStream(),true);
				reader = new BufferedReader
						(new InputStreamReader(clientSocket.getInputStream()));
				
				//send master value
				if (!DataComponentMaster.getInstance().isEnabled()) {
					this.println("D");
				}
				//if master is enabled, get data from master
				//otherwise from the observer
				if (DataComponentMaster.getInstance().isExecuting()) {
					System.out.println("MASTER EXECUTING");
					//send initialize
					DataComponentMaster.getInstance().initialize();
				}
				else if (DataComponentObserver.getInstance().isExecuting()) {
					System.out.println("OBSERVER EXECUTING");
					//send initialize
					DataComponentObserver.getInstance().initialize();
				}

				while(true) {
					String line = null;
					System.out.println(this.hashCode()+" READLINE START");
					try {line = reader.readLine();}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println(this.hashCode()+" READLINE END");
					lastLine = line;
					//check if DataComponent is still available
					if (DataComponentMaster.getInstance() == null) {
						System.out.println(this.hashCode() + " DataComponent.getInstance() == null");
						//otherwise stop server
						clientSocket.close();
						//terminate = true;
						break;
					}
					if ((line == null)||(!clientSocket.isConnected())) {
						System.out.println(this.hashCode() + " !clientSocket.isConnected()");
						//STOP execution if necessary
						try {
							if (DataComponentMaster.getInstance().isEnabled())
								DataComponentMaster.getInstance()
								.masterStopExecution();
						}catch(Exception e){}
						break;
					}
					
					try {
						if ((line != null) && (line.length() > 0)) {
							if (line.startsWith("C")) {
								String command = line.substring(1, 2);
								
								System.out.println("COMMAND>"+command);
								
								if (command.matches("S")) {
									//STEP
									DataComponentMaster.getInstance().masterStepExecution();
								}
								else if (command.matches("R")) {
									//RUN
									DataComponentMaster.getInstance().masterRunExecution();
								}
								else if (command.matches("P")) {
									//PAUSE
									DataComponentMaster.getInstance().masterPauseExecution();
								}
								else if (command.matches("T")) {
									//STOP
									DataComponentMaster.getInstance().masterStopExecution();
								}
							}//end if command
							else {
								DataComponentProducer.setDataToSend(line);
							}
						}//end if
					}catch(Exception e) {
						//STOP execution if necessary
						try {
							if (DataComponentMaster.getInstance().isEnabled())
								DataComponentMaster.getInstance()
								.masterStopExecution();
						}catch(Exception ee){}
						break;
					}
		  		}//end while connected
		  		
	  		}catch (java.net.SocketException e) {
	  			e.printStackTrace();
				//here we can have a socket close on a connect
				//which should free the port so that we can
				//reuse it
	  			if (DataComponentMaster.getInstance() != null) {
					try{DataComponentMaster.getInstance().masterStopExecution();}
					catch(Exception ee){}
	  			}
				try{clientSocket.close();}catch(Exception ee){}
	  		}
	  		catch (java.net.SocketTimeoutException e) {
	  			//do nothing
	  		}
	  		catch(Exception e){
	  			e.printStackTrace();
				try{clientSocket.close();}catch(Exception ee){}
	  		}
	  		
	  	}//end while accepting (server running)
		System.out.println(this.hashCode() + " SERVER TERMINATED");
		
	}//end run
}

