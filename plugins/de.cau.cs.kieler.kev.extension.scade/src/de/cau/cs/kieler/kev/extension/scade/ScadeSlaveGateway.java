package de.cau.cs.kieler.kev.extension.scade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import de.cau.cs.kieler.kev.helpers.Tools;


/**
 * SCADE Slave Simulator Gateway. An object of this class can open a TCP/IP
 * connection to a SCADE model in the SCADE Editor. From there the SCADE
 * simulator is started and run in a remote controlled slave mode. In this mode
 * TCP/IP commands send from this object control the whole SCADE simulation.
 * You can advance simulation steps, read outputs, set inputs, activate or
 * refresh the SCADE simulator GUI and close the simulation session.
 *
 * This Java gateway was implemented by reverse engineering of the original
 * Windows C library of the SCADE gateway.
 *
 * Notice the private String constants in this class! SCADE reacts quite fragile
 * to different TCP messages and might crash. For example a different newline
 * symbol (only \n instead of \r\n) will crash SCADE. So be careful in adding or
 * changing any of these Strings.
 *
 *  @version for SCADE 6.0 Prototype 3A (only rudimentary functions work in SCADE)
 *
 * @author Hauke Fuhrmann <haf@informatik.uni-kiel.de>
 *
 */

public class ScadeSlaveGateway {

	/** Every TCP command is prefixed with this String **/
	private static final String prefix = "SsmProxy::";
	/** SCADE command that starts the simulator **/
	private static final String start = "Start";
	/** SCADE command that evaluates some simulation steps **/
	private static final String step = "Step";
	/** Acknowledgement of SCADE if it has received a command correctly **/
	private static final String ok = "OK";
	/** SCADE command that requests the value of one explicit SCADE variable **/
	private static final String getoutputvalue = "GetOutputValue";
	/** SCADE command that requests the value of all top level SCADE outputs **/
	private static final String getoutputvector = "GetOutputVector";
	/** SCADE command that sets all top level SCADE inputs **/
	private static final String setinputvector = "SetInputVector";
	/** SCADE command that sets the value of one explicit SCADE variable **/
	private static final String setinputvalue = "SetInputValue";
	/** SCADE command that activates the simulator GUI and brings it into foreground **/
	private static final String activate = "Activate";
	/** SCADE command that refreshes the SCADE simulator gui **/
	private static final String refresh = "Refresh";
	/** SCADE command that evaluates some simulation steps and then pauses until manually resumed **/
	private static final String debugstep = "DbgStep";
	/** SCADE command that closes the simulation session and the TCP communication **/
	private static final String close = "Close";
	/** RegExp that matches an error message of SCADE that is send instead of an acknowledgemen **/
	private static final String error = "(\\d+\\.([^\\.])+\\.)|ERROR"; // number.text.|ERROR
	/** RegExp that matches a normal response of SCADE with the String representation of data **/
	private static final String response = ".+";
    /** Delimiter symbol that separates arguments in a TCP command to SCADE **/
	private static final String delim = " ";
	/** Finalizer symbol that SCADE either sends or expects in some messages **/
	private static final String finalizer = ".";
	/** Line terminating symbol that SCADE expects in some messages **/
	private static final String terminator = "\r\n";
	/** Some messages even require a tailing null character. This symbol is only a placeholder
	 *  in the string and will be replaced by the real 0 when sent **/
	private static final String nullSymbol = "|NULL|";

	private static ScadeSlaveGateway me;
	private final String defaultConfiguration = "Simulation";

	private static final int BUFFER_SIZE = 16000;
	
	private int shortto = 1000;  // short timeout
	private int connectto = 10000; // connection timeout
	private int longto = 0; // long timeout (infinity)
	private int readRetries = 10;
	
	private String host;
	private int port;

	Socket socket;

	BufferedReader in;

	PrintWriter out;
	Logger logger;
	
	char[] buffer = new char[BUFFER_SIZE];
//	ClientException scadeException;
	private String outputPath;
	private String inputPath;
	
		
	/**
	 * Standard Constructor. Creates new uninitialized Gateway object.
	 *
	 */
	public ScadeSlaveGateway() {
		super();
		logger = Logger.getLogger("scade.log");
		socket = new Socket();
		host = null;
		port = -1;
		me = this;
		this.outputPath = "";
		this.inputPath = "";
	}
	
	
	/**
	 * Initialize the Gateway object by connecting to the corresponding host and
	 * port. This method assumes, SCADE is up and running and the corresponding
	 * project is loaded (simulator is not yet started). In project settings the
	 * listening port must have been set.
	 *
	 * @param host
	 * @param port
	 * @throws ClientException
	 *             if connection fails
	 */
	public void init(String host, int port) throws ClientException {
		try {
			/*SVGApplication.getProgressBar().setString("Connecting...");
			SVGApplication.getProgressBar().setVisible(true);
			new Thread(new Runnable(){
				public void run() {
					int increment = SVGApplication.getProgressBar().getMaximum()*1000/connectto;
					int counter = 0;
					while(SVGApplication.getProgressBar().isVisible()){
						counter = counter + increment;
						SVGApplication.getProgressBar().setValue(counter);
						try {
							Thread.sleep(1000);
						}
						catch (InterruptedException e) {
						}						
					}
				}				
			}).start();*/
			this.host = host;
			this.port = port;			
			socket = new Socket(host, port);
			socket.setSoTimeout(shortto);
			//System.out.println("rgwg");
			//SVGApplication.getProgressBar().setVisible(false);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket
					.getInputStream()));
			logger.info("SCADE slave simulation successfully initialized!");
		} catch (UnknownHostException e) {
			throw new ClientException(e,
					"Problem creating socket to the host. Hostname or IP is unknown: "
							+ host + "\n : ");
		} catch (IOException e) {
			throw new ClientException(
					e,
					"Problem creating socket to the host!\n"
							+ e.getMessage()
							+ "\nPlease make sure, SCADE is up and the corresponding project is loaded and the correct connection port is set up in the project settings for co-simulation!");
		} catch (Exception e) {
			throw new ClientException(e, "Initialization failed!");
		}
	}

	/**
	 * Change the timeout that is waited for a response of SCADE after a
	 * request was sent. The default is optimized for a local area network
	 * and might need to be increased for environments with long tcp/ip
	 * delays.
	 * @param timeout
	 */
	public void setReadTimeout(int timeout){
		this.shortto = timeout;
	}
	
	public void startSimulation() throws ClientException {
		startSimulation(defaultConfiguration);
	}

	/**
	 * Starts simulation with the given configuration (Name of the code
	 * generator configuration as set in the SCADE settings). The root node is
	 * used from the SCADE configuration settings.
	 *
	 * @param configuration
	 * @throws ClientException
	 */
	public void startSimulation(String configuration) throws ClientException {
		String rootnode = null;		
		startSimulation(configuration, rootnode);		
	}
	
	public void restartSimulation(String configuration){
		try {
			this.stopSimulation();
			//readAck(true);
			this.startSimulation(configuration);
			//readAck(true);
		}
		catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*catch (SocketTimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void close(){
		try {
			//this.stopSimulation();
			if (in != null)
				this.in.close();
			if (out != null)
				this.out.close();
			if (socket != null)
				this.socket.close();
			in = null;
			out = null;
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		/*catch (SimulationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		catch (ClientException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}*/
//		fireSimulationStopped(new SimulationEvent(this));
		
	}

	/**
	 * Starts simulation with the given configuration (Name of the code
	 * generator configuration as set in the SCADE settings) and the rootnode.
	 *
	 * @param configuration
	 * @param rootnode
	 * @throws ClientException
	 *             if no connection was established before
	 */
	public void startSimulation(String configuration, String rootnode)
			throws ClientException {
		String conf = "\"" + defaultConfiguration;
		if (configuration != null)
			conf = "\"" + configuration;
		conf += "\"";
		try {
			String message = "Starting SCADE simulation... ";
			logger.info(message);
			Tools.setStatusLine(message);
/*
			SVGApplication.getProgressBar().setVisible(true);
			SVGApplication.getProgressBar().setString("Starting SCADE simulation...");
			new Thread(new Runnable(){
				public void run() {
					int increment = SVGApplication.getProgressBar().getMaximum()/20;
					int counter = 0;
					while(SVGApplication.getProgressBar().isVisible()){
						counter = (counter + increment) % (SVGApplication.getProgressBar().getMaximum() + increment);
						SVGApplication.getProgressBar().setValue(counter);
						try {
							Thread.sleep(50);
						}
						catch (InterruptedException e) {
						}						
					}
				}				
			}).start();
*/			
			if (rootnode == null){
				requestAcknowledge(prefix + start + delim + conf + delim + terminator, false, longto);
			}
			else {
				requestAcknowledge(prefix + start + delim + conf + delim + rootnode + terminator , false, longto);
			}
//			SVGApplication.getProgressBar().setVisible(false);
//			fireSimulationStarted(new SimulationEvent(this));
		} catch (SimulationAlreadyStartedException e){
//			SVGApplication.getProgressBar().setVisible(false);
		}
	}

	/**
	 * Will tell the simulator to advance some simulation steps.
	 *
	 * @param stepsize
	 *            Number of steps that should be calculated
	 * @param refresh
	 *            true if the SCADE Gui should be refreshed after the steps
	 * @throws ClientException
	 *             if no connection was established before
	 */
	public void step(int stepsize, boolean refresh) throws ClientException {
		checkConnection();
		
		String refreshString = refresh ? "1" : "0";
		requestAcknowledge(prefix + step + delim + stepsize + delim + refreshString + terminator, false, shortto);
		//System.out.println("ok");
//		fireSimulationStepped(new SimulationEvent(this));
	}

	/**
	 * Will tell the simulator to advance some simulation steps and wait for the
	 * user to press the SCADE continue button.
	 *
	 * @param stepsize
	 *            Number of steps that should be calculated
	 * @throws ClientException
	 *             if no connection was established before
	 */
	public void debugStep(int stepsize) throws ClientException {
		checkConnection();
		requestAcknowledge(prefix + debugstep + delim + stepsize + terminator, false, shortto);
	}

	

	/**
	 * Activates the SCADE Gui and bring it into focus.
	 *
	 * @throws ClientException
	 *             if no connection was established before
	 */
	public void activate() throws ClientException {
		checkConnection();
		requestAcknowledge(prefix + activate + terminator + nullSymbol, false, shortto);
	}

	/**
	 * Refresh the SCADE Gui. Useful together with the step method and there the
	 * refresh value set to false. This way the developer has full control over
	 * the refresh behaviour of the SCADE gui.
	 *
	 * @throws ClientException
	 *             if no connection was established before
	 */
	public void refresh() throws ClientException {
		checkConnection();
		requestAcknowledge(prefix + refresh + terminator + nullSymbol , false, shortto);
	}

	/**
	 * Should return the output vector of the top level SCADE outputs. Seems to
	 * be not implemented by SCADE yet, as it always returns only a . character.
	 *
	 * @return .
	 * @throws ClientException
	 *             if no connection was established before
	 */
	public String getOutputVector() throws ClientException {
		checkConnection();
		return requestAcknowledgeResponse(prefix + getoutputvector + terminator , true, shortto);
	}
	
	public String receiveMessage() throws ClientException {
		return getOutputValue(this.outputPath);
	}
	
	/**
	 * Returns the String representation of a specified SCADE output variable.
	 * The variable is set by the corresponding parameter in the typical SCADE
	 * format: package::rootnode/variable All accessible variables (set by the
	 * optimization level of the SCADE code generator can be accessed. Set the
	 * path parameter to the same String as displayed in the SCADE simulator Gui
	 * in the watch list. Variables of other nodes can be accessed by using the
	 * corresponding occurrence number: package::rootnode/package::childnode
	 * occnumber/variable e.g.
	 * simulation::railway/simulation::kicking_horse_pass 1/feedback
	 *
	 * @param pathToScadeVariable
	 * @return
	 * @throws ClientException
	 */
	private String getOutputValue(String pathToScadeVariable) throws ClientException {
		checkConnection();
		return requestAcknowledgeResponse(prefix + getoutputvalue + delim + pathToScadeVariable + terminator, true, shortto);
	}

	public void setInputValue(String pathToScadeVariable, String inputVector)
			throws ClientException {
		checkConnection();
		requestAcknowledge(prefix + setinputvalue + delim + pathToScadeVariable + delim + terminator + inputVector , false, shortto);
	}

	public void setInputValue(String inputVector)
			throws ClientException {
		checkConnection();
		requestAcknowledge(prefix + setinputvalue + delim + this.inputPath + delim + terminator + inputVector , false, shortto);
	}
	
	public void sendMessage(String inputVector) throws ClientException{
		checkConnection();
		requestAcknowledge(prefix + setinputvector + delim  + inputVector + terminator , false, shortto);
	}

	/**
	 * Closes the SCADE slave simulator and closes the TCP/IP connection.
	 *
	 * @throws ClientException
	 *             if no connection was established before
	 */
	public void stopSimulation() throws SimulationException, ClientException {
		checkConnection();
		try {
			requestAcknowledge(prefix + close + terminator, false, longto);
//			fireSimulationStopped(new SimulationEvent(this));
		}
		catch(SimulationNotLaunchedException e){
			/* nothing */
		}
	}
	

	/**
	 * Checks if the connection to the SCADE slave simulator via TCP/IP is up
	 * and running. Will either return normally or throw an Exception.
	 *
	 * @throws ClientException
	 *             if no connection was established before
	 */
	private void checkConnection() throws ClientException {
		if (!isConnected()){
			this.init(host, port);
		}
		return;
	}
	
	/**
	 * Checks if the connection to the SCADE slave simulator via TCP/IP is up
	 * and running.
	 * */
	public boolean isConnected(){
		if (socket == null || socket.isClosed() || in == null || out == null)
			return false;
		return true;
	}

	/**
	 * Reads one answer of SCADE. Unfortunately the answers are not terminated
	 * by a newline character. So it is difficult to decide how many characters
	 * should be expected. Hence the content is parsed and compared to some
	 * internal regular expressions with expected response signatures
	 *
	 * @return The whole read response
	 * @throws ClientException
	 */
	private boolean readAck(boolean expectFinalizer) throws SimulationAlreadyStartedException, SimulationNotLaunchedException, SimulationException, ClientException, SocketTimeoutException{
		String line = "";
		try {
			char c;
			int size = 0;
			do {
				c = (char) in.read();
				line += c;
				size++;
				//System.out.println(line);
				if(expectFinalizer && line.matches(ok+finalizer))
					return true;
				else if(!expectFinalizer && line.matches(ok))
					return true;
				else if(line.matches(error)){
					//System.out.println("error message: " + line + " Result: " + getScadeErrorType(line));
					if (getScadeErrorType(line) == SimulationException.SIM_ALREADY_STARTED_ERROR)
						throw new SimulationAlreadyStartedException(line);
					else if (getScadeErrorType(line) == SimulationException.ACCESS_SIM_ERROR)
						throw new SimulationNotLaunchedException(line);
					else if (getScadeErrorType(line) == SimulationException.VARIABLE_NOT_FOUND_ERROR)
						throw new CannotFindVariableException(line);				
					else
						throw new SimulationException(line);
				}
				else if(size > 1000){
					freeBuffer();
					throw new ClientException("No valid data received from SCADE: "+line);
				}
			} while (true);
		} catch (IOException e) {
			//this.close();
			throw new ClientException(e, "Input stream not ready to read!");
		}
	}

	private String readResponse() throws ClientException, IllegalArgumentException{
		try {
			boolean bracketsBalanced = false;
			boolean scalar = false;
			StringBuilder strBuilder = new StringBuilder(10000);
			
			int count = 0;
			do {
				count ++;
				int numberChars = in.read(buffer, 0, buffer.length);
				if (numberChars > -1)
					strBuilder.append(buffer,0, numberChars);
	
				// check if brackets are correct
				String outString = strBuilder.toString();				
				bracketsBalanced = this.hasBalancedBrackets(outString);
				if(outString.matches(response) && bracketsBalanced && !scalar){
					//Logger.getLogger("new Logger").info(outString);
					//logger.info("String length: " + outString.length());
					return outString;
				}
				else if(strBuilder.toString().matches(error))
					throw new ClientException("Message from SCADE: " + strBuilder.toString());
			} while (true);
		} catch (IOException e) {
			throw new ClientException(e, "");
		}
	}

	/**
	 * Empties the receive buffer and throws the data away. This method can be used
	 * if an error disturbed the communication and the order of messages is somewhat
	 * scrambled. E.g. sending requests to SCADE too fast might return multiple successive
	 * acknowledgements before multiple successive responses. To start over the request,
	 * the read buffer should be freed completely.
	 */
	private void freeBuffer(){
		try{
			while(in.ready())
				in.read();
		}catch(IOException e){
			/*nothing*/
		}
	}
	
	private boolean hasBalancedBrackets(String str){
		int bracketCount1 = 0, 
			bracketCount2 = 0, 
			bracketCount3 = 0;	
		
		for (int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if (c == '(')
				bracketCount1++;
			else if (c == ')')
				bracketCount1--;
			else if (c == '[')
				bracketCount2++;
			else if (c == ']')
				bracketCount2--;
			else if (c == '{')
				bracketCount3++;
			else if (c == '}')
				bracketCount3--;
			if (bracketCount1 == 0 && bracketCount2 == 0 && bracketCount3 == 0){
				
				//logger.severe(str);
				return true;
			}
		}
		return false;
	}
	
	private boolean hasBalancedBrackets(String str, int start, int end){
		int bracketCount1 = 0, 
			bracketCount2 = 0, 
			bracketCount3 = 0;	
		
		if (end >= str.length())
			end = str.length() -1;
		if (end <= start)
			return true;
		if (start < 0)
			start = 0;
		if (start >= str.length())
			return true;
		for (int i = start; i < str.length(); i++){
			char c = str.charAt(i);
			if (c == '(')
				bracketCount1++;
			else if (c == ')')
				bracketCount1--;
			else if (c == '[')
				bracketCount2++;
			else if (c == ']')
				bracketCount2--;
			else if (c == '{')
				bracketCount3++;
			else if (c == '}')
				bracketCount3--;
			if (bracketCount1 == 0 && bracketCount2 == 0 && bracketCount3 == 0){
				return true;
			}
		}
		return false;
	}

	/**
	 * This methods sends a command request to SCADE and reads the acknowledgement from
	 * SCADE. After sending the request, the method only reads for a specified timeout.
	 * If the timeout has expired, the request is resent. This is repeated several times.
	 * Unfortunately we have observed, that SCADE sometimes does not react to a request.
	 * @param request
	 *                String message that is send to SCADE.
	 * @param expectFinalizer
	 *                must be true, iff the Acknowledgement of SCADE is followed by the
	 *                finalizer string (e.g. "OK." instead of "OK")
	 * @param timeout
	 *                Number of milliseconds that the method waits for a reaction of SCADE
	 * @throws ClientException
	 *                thrown if something unexpected happened in the underlying send or
	 *                readAck methods or if the timeout has expired too often
	 */
	private void requestAcknowledge(String request, boolean expectFinalizer, int timeout) throws SimulationAlreadyStartedException, SimulationNotLaunchedException, ClientException{
//System.out.println("Request: "+request.replaceAll("\\s", " "));
		try {
			socket.setSoTimeout(timeout);
		}catch(SocketException e){
			throw new ClientException(e.getMessage());
		}
		for( int i=0 ; i<=readRetries ; i++ ){
			send(request);
			try {
				readAck(expectFinalizer);
//System.out.println("Acknowledgement OK");
				break; // if the read finished without timeout exception, everything is fine
			} catch (SocketTimeoutException e) {
				if(i==readRetries)
					throw new ClientException(e,"SCADE did not answer to the request within "+readRetries+" retries: \""+request+"\"");
				else
					freeBuffer(); // the request is resent, so reset the receive buffer first
//				System.out.println("Timeout for request: "+request);
			}
		}
	}

	/**
	 * Same as requestAcknowledge with an integrated readResponse which is also included
	 * into the timeout repeat sequence. Hence an invalid response leads to a resend
	 * of the request.
	 * @param request
	 * @param expectFinalizer
	 * @param timeout
	 * @return
	 * @throws ClientException
	 */
	private String requestAcknowledgeResponse(String request, boolean expectFinalizer, int timeout) throws ClientException{
//System.out.println("Request: "+request.replaceAll("\\s", " "));
		try {
			socket.setSoTimeout(timeout);
		}catch(SocketException e){
			throw new ClientException("Could not set timeout: "+e.getMessage());
		}
		for( int i=0 ; i<=readRetries ; i++ ){
			send(request);
			try {
				readAck(expectFinalizer);
//				System.out.println("Acknowledgement OK");
				return readResponse();
				// if the read finished without timeout exception, everything is fine
			} catch (SocketTimeoutException e) {
				if(i==readRetries)
					throw new ClientException(e,"SCADE did not answer to the request within "+readRetries+" retries: \""+request+"\"");
				/*else nothing, just repeat the loop */
//				System.out.println("Timeout for request: "+request);
			} catch (IllegalArgumentException e){
				// scade has returned some bad value
				if(i==readRetries)
					throw new ClientException(e,"SCADE did not answer to the request within "+readRetries+" retries: \""+request+"\"");
				/*else nothing, just repeat the loop */
//				System.out.println("Illegal Argument: "+request);
			}
		}
		return ""; // this should never happen
	}

	/**
	 * Sends a command string to SCADE. Might have some debugging side effects,
	 * like printing the sent string to the console or something. Notice that
	 * SCADE is quite fragile corresponding the line terminators.
	 *
	 * @param msg
	 *            Message that should be send to SCADE
	 * @throws ClientException
	 *             if no connection was established before
	 */
	private void send(String msg) throws ClientException {
		// check if the String should be terminated with 0
		int index = msg.indexOf(nullSymbol);
		if(index > -1){
			// dont write the nullSymbol place holder
			out.write(msg, 0, index);
			// write a real Null character
			out.write(0);
		}
		else
			out.print(msg);
		out.flush();
	}
	
	private int getScadeErrorType(String errorMsg){
		StringTokenizer tok = new StringTokenizer(errorMsg, ".");
		String number = tok.nextToken();
		int errorNumber = SimulationException.UNKNOWN_RESPONSE;
		try {
			errorNumber = Integer.parseInt(number);
		} catch (NumberFormatException e){
			/* do nothing, hence if parsing fails errorNumber is a UNKNOWN_RESPONSE */
		}
		return errorNumber;
	}



	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}



	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	/*public static void main(String[] args) {
		ScadeSlaveGateway scade = new ScadeSlaveGateway();
		try {
			// test03();
			scade.init("10.6.3.5", 60001);
			//new Thread(scade).start();
			scade.startSimulation("Simulation", "simulation::railway");
			//while(true){
			// scade.step(1, true);
			//}
			scade.step(50, true);
			// Thread.sleep(1000);
			// scade.step(3, true);
			scade.refresh();
			scade.activate();
			// scade.debugStep(2);

			// System.out.println("OutputVector: " + scade.getOutputVector());
			String pointString = "[";
			for (int i = 0; i < 47; i++) {
				pointString += "simulation::p_turn,";
			}
			pointString += "simulation::p_turn]";

			// scade.setInputValue(pointString,"simulation::railway/points.");
			System.out.println("OutputValue: "
					+ scade.getOutputValue("simulation::railway/feedback"));
			// System.out.println("OutputValue: " +
			// scade.getOutputValue("simulation::railway/feedback"));
			// System.out.println("OutputValue: " +
			// scade.getOutputValue("simulation::railway/feedback"));
			 scade.close();
			 System.out.println("finished.");

		} catch (ClientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}*/

	/**
	 * Just a test thread that displays all incoming data.
	 */
	/*public void run() {
		try {
			checkConnection();
			char c;
			do {
				// System.out.println("start read");
				c = (char) in.read();
				System.out.print(c);
				System.out.flush();
				// System.out.println("Ready: "+in.ready());
			} while (true);
		} catch (ClientException e) {
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/
		
}
