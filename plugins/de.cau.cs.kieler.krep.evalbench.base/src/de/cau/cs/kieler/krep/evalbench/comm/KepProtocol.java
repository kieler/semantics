/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;

/**
 * Implementation of the communication protocol interface that uses the KEP
 * protocol.
 * 
 * @author msp
 */
public class KepProtocol extends CommunicationProtocol {

	/** Character reserved for the run command */
	private final static String RUN_COMMAND = "C";

	/** Character reserved for the stop command */
	private final static String STOP_COMMAND = "S";

	/** Character reserved for the execution trace command */
	private final static String TRACE_COMMAND = "M";

	/** Character reserved for the target info command */
	private final static String INFO_COMMAND = "N";

	/** Character reserved for the tick length command */
	private final static String TICK_LENGTH_COMMAND = "L";

	/** Character reserved for the load program command */
	private final static String LOAD_COMMAND = "W";

	/** Character reserved for the first instruction sent for a load command */
	private final static String INSTRUCTION1_COMMAND = "6";

	/** Character reserved for the second instruction sent for a load command */
	private final static String INSTRUCTION2_COMMAND = "7";

	/** Character reserved to end a command */
	private final static String END_COMMAND = "X";

	/** Character reserved for the reset command */
	private final static String RESET_COMMAND = "R";

	/** Character reserved for the verify communication command */
	private final static String VERIFY_COMMAND = "V";

	/** Character reserved for the send inputs command */
	private final static String INPUT_COMMAND = "I";

	/** Character reserved for the tick command */
	private final static String TICK_COMMAND = "T";

	/** Character reserved for the receive outputs command */
	private final static String OUTPUT_COMMAND = "O";

	/** Character reserved for the choose valued signal command */
	private final static String CHOOSE_VALUED_COMMAND = "D";

	/** Character reserved for the send valued signal command */
	private final static String SEND_VALUED_COMMAND = "G";

	/** Character reserved for the get valued signal command */
	private final static String GET_VALUED_COMMAND = "P";

	/** Expected string for the verify communication command */
	private final static String VERIFICATION_STRING = "0123456789ABCDEFX";

	/** Character received at the end of a normal reply */
	private final static char END_REPLY = 'X';

	/** Description of received target information data */
	private final static String[] INFO_DESC = {
			"KEP Type:                         ",
			"PRE support:                      ",
			"Data path width:                  ",
			"Signal number:                    ",
			"Thread number:                    ",
			"Watcher number:                   ",
			"Watcher counter width:            ",
			"LWatcher number:                  ",
			"LWatcher counter width:           ",
			"TWatcher counter width:           ",
			"Delay counter width:              ",
			"Prio value width:                 ",
			"Register number:                  ",
			"Tick length:                      ",
			"Instruction memory address width: " };

	/** Length of information items for target information */
	private final static int[] INFO_LENGTH = { 0, 1, 2, 3, 2, 2, 2, 2, 2, 2, 2,
			2, 3, 4, 2 };

	private int MAX_TICKLEN = 0;

	/**
	 * Constructs a new instance of the KEP protocol.
	 * 
	 * @param connectionProtocol
	 *            underlying connection protocol to be used; this protocol
	 *            instance is expected to be already initialized
	 */
	public KepProtocol(IConnectionProtocol connectionProtocol) {
		super(connectionProtocol);
	}

	/**
	 * Parses an integer value from a received string. The integer is expected
	 * to be encoded as hex number with the least significant digit first.
	 * 
	 * @param s
	 *            input string
	 * @param offset
	 *            index of the first digit
	 * @param n
	 *            number of digits to read
	 * @return integer value
	 * @throws CommunicationException
	 *             when the input string does not match the expected format
	 */
	private static int parseIntRev(String s, int offset, int n)
			throws CommunicationException {
		// reverse digits for parsing
		StringBuffer stringBuffer = new StringBuffer(n);
		stringBuffer.setLength(n);
		for (int i = 0; i < n; i++) {
			if (offset + i >= s.length()) {
				throw new CommunicationException(
						"Wrong number of digits in received string");
			}
			stringBuffer.setCharAt(n - i - 1, s.charAt(offset + i));
		}
		// parse integer with radix 16
		try {
			return Integer.parseInt(stringBuffer.toString(), 16);
		} catch (NumberFormatException e) {
			throw new CommunicationException(
					"Invalid number format in received string");
		}
	}

	/**
	 * Transforms a string with hex digits into a sequence of characters with
	 * corresponding binary information. The character sequence will have half
	 * the length of the input string. Each pair of hex digits is expected to be
	 * reversed in the input string.
	 * 
	 * @param s
	 *            string to be processed
	 * @return character sequence with binary information
	 * @throws CommunicationException
	 *             when the input string does not match the expected format
	 */
	private static char[] parseSeq(String s) throws CommunicationException {
		int n = s.length();
		char[] x = new char[(n + 1) / 2];
		for (int i = 0; i < n; i += 2) {
			try {
				if (i < n - 1) {
					x[i / 2] = (char) Integer.parseInt(s
							.substring(i + 1, i + 2)
							+ s.substring(i, i + 1), 16);
				} else {
					x[i / 2] = (char) Integer.parseInt(s.substring(i), 16);
				}
			} catch (NumberFormatException e) {
				throw new CommunicationException(
						"Invalid number format in received string");
			}
		}
		return x;
	}

	/**
	 * Constructs a string holding a hex representation of the given number with
	 * leading zeros, so a string length of n is reached as long as the input
	 * number is less than 2^n. In any other case a hex string with needed
	 * length is returned.
	 * 
	 * @param x
	 *            number to be processed
	 * @param n
	 *            number of digits for hex representation
	 * @return hex string with length n if x < 2^n
	 */
	private static String toHexString(int x, int n) {
		String s = Integer.toHexString(x).toUpperCase();
		int l = s.length();
		if (l < n) {
			StringBuffer zeros = new StringBuffer(n - l);
			zeros.setLength(n - l);
			for (int i = 0; i < n - l; i++) {
				zeros.setCharAt(i, '0');
			}
			return zeros.toString() + s;
		} else {
			return s;
		}
	}

	/**
	 * Constructs a string holding a reversed hex representation of the given
	 * number with leading zeros, so a string length of n is reached as long as
	 * the input number is less than 2^n. In any other case a reversed hex
	 * string with needed length is returned.
	 * 
	 * @param x
	 *            number to be processed
	 * @param n
	 *            number of digits for hex representation
	 * @return reversed hex string with length n if x < 2^n
	 */
	private static String toHexStringRev(int x, int n) {
		String s = Integer.toHexString(x).toUpperCase();
		int l = s.length();
		StringBuffer reversed = new StringBuffer(l);
		reversed.setLength(l);
		for (int i = 0; i < l; i++) {
			reversed.setCharAt(i, s.charAt(l - i - 1));
		}
		if (l < n) {
			StringBuffer zeros = new StringBuffer(n - l);
			zeros.setLength(n - l);
			for (int i = 0; i < n - l; i++) {
				zeros.setCharAt(i, '0');
			}
			return reversed.toString() + zeros.toString();
		} else {
			return reversed.toString();
		}
	}

	/**
	 * Constructs a string holding a hex representation of the given character
	 * sequence. The string will have twice the length of the input sequence.
	 * 
	 * @param x
	 *            sequence of numbers to be processed
	 * @param n
	 *            total number of bits to be stored
	 * @return string where each character is a reversed hex representation of
	 *         the two corresponding characters of the input sequence
	 */
	private static String toHexStringSeq(char[] x, int n) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < x.length; i++) {
			String s = Integer.toHexString((int) x[i]).toUpperCase();
			if (s.length() <= 1) {
				if (n <= 8 * i + 4)
					stringBuffer.append(s);
				else
					stringBuffer.append(s + "0");
			} else {
				stringBuffer.append(s.substring(1) + s.substring(0, 1));
			}
		}
		return stringBuffer.toString();
	}

	private void send(final String data) throws CommunicationException {
		connection.send(data);
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				notifySend(data);
			}
		});
	}

	/*
	 * private String receive(int n) throws CommunicationException { final
	 * String res = connection.receive(n); Display.getDefault().asyncExec(new
	 * Runnable(){ public void run(){ notifyReceive(res); } }); return res; }
	 */

	private String receive(char x) throws CommunicationException {
		final String res = connection.receive(x);
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				notifyReceive(res);
			}
		});
		return res;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.ICommunicationProtocol#continuousRun()
	 */
	public void continuousRun() throws CommunicationException {
		send(RUN_COMMAND);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.ICommunicationProtocol#getExecutionTrace()
	 */
	public int[] getExecutionTrace() throws CommunicationException {
		send(TRACE_COMMAND);
		String reply = receive(END_REPLY);
		// extract list of addresses from received string
		int addressCount = (reply.length() - 1) / 4;
		int[] trace = new int[addressCount];
		for (int i = 0; i < addressCount; i++) {
			trace[i] = parseIntRev(reply, 4 * i, 4);
		}
		return trace;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.ICommunicationProtocol#getTargetInfo()
	 */
	public String getTargetInfo() throws CommunicationException {
		send(INFO_COMMAND);
		String reply = receive(END_REPLY);
		// construct info message from received string
		StringBuffer stringBuffer = new StringBuffer();
		// KEP Type
		int x = parseIntRev(reply, 0, 1);
		if (((x >> 3) & 1) == 1) {
			stringBuffer.append(INFO_DESC[0] + "Esterel\n");
		} else {
			stringBuffer.append(INFO_DESC[0] + "VHDL\n");
		}
		// PRE support
		stringBuffer.append(INFO_DESC[1] + (x & 1) + "\n");
		// other information items
		int pos = 1;
		for (int i = 2; i < 15; i++) {
			x = parseIntRev(reply, pos, INFO_LENGTH[i]);
			stringBuffer.append(INFO_DESC[i] + x + "\n");
			pos += INFO_LENGTH[i];
		}
		return stringBuffer.toString();
	}

	private int getTickLength() throws CommunicationException {
		send(TICK_LENGTH_COMMAND);
		String reply = receive(END_REPLY);
		return parseIntRev(reply, 0, 4);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * krep.evalbench.comm.ICommunicationProtocol#loadProgram(java.lang.String)
	 */
	public boolean loadProgram(IAssembler program, IProgressMonitor monitor)
			throws CommunicationException {
		String[] prog = program.getObj(null);
		send(LOAD_COMMAND);
		int n = prog.length;
		for (int i = 0; i < n; i++) {
			// send instruction for the first time
			String data = INSTRUCTION1_COMMAND + toHexString(i, 4) + prog[i];
			send(data);
			// send instruction for the second time
			data = INSTRUCTION2_COMMAND + toHexString(i, 4) + prog[i];
			send(data);
			// sleep to make sure the communication word
			// TODO: implement acknowledgment into KEP protocol
			try {
				Thread.sleep(prog.length / 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// wait for possible error reply
			String reply = connection.hark(1);
			if (reply.length() > 0) {
				final String notify = reply;
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						notifyReceive(notify);
					}
				});
			}
			if (reply.length() == 1 && reply.charAt(0) == END_REPLY) {
				return false;
			}
			if (monitor != null) {
				monitor.worked(1);
			}
		}
		send(END_COMMAND);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.ICommunicationProtocol#resetStatus()
	 */
	public void resetStatus() throws CommunicationException {
		send(RESET_COMMAND);
		receive(END_REPLY);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.ICommunicationProtocol#stopContinuous()
	 */
	public void stopContinuous() throws CommunicationException {
		send(STOP_COMMAND);
		receive(END_REPLY);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * krep.evalbench.comm.ICommunicationProtocol#tick(java.util.LinkedList,
	 * java.util.LinkedList)
	 */
	public int tick(int maxSignals, LinkedList<Signal> inputs,
			LinkedList<Signal> outputs) throws CommunicationException {
		// construct and send input message
		LinkedList<Signal> valuedInputs = new LinkedList<Signal>();
		send(INPUT_COMMAND);
		// int n = inputs.size() + outputs.size();
		int n = maxSignals;
		char[] inputStatus = new char[(n + 7) / 8];
		Iterator<Signal> iterator = inputs.iterator();
		while (iterator.hasNext()) {
			Signal s = iterator.next();
			int index = s.getIndex() - 1;
			try {
				inputStatus[index / 8] |= (s.getPresent() ? 1 : 0) << (index % 8);
			} catch (Exception e) {
				e.printStackTrace();
				throw new CommunicationException(e.getMessage());
			}
			if (s.isValued()) {
				valuedInputs.add(s);
			}
		}
		String inputString = toHexStringSeq(inputStatus, n);
		send(inputString);
		send(END_COMMAND);

		// send values of valued input signals
		iterator = valuedInputs.iterator();
		while (iterator.hasNext()) {
			Signal s = iterator.next();
			// choose valued signal
			send(CHOOSE_VALUED_COMMAND);
			String indexCode = toHexStringRev(s.getIndex(), 2);
			send(indexCode);
			send(END_COMMAND);
			// send data of valued signal; data is expected to be of type int
			send(SEND_VALUED_COMMAND);
			String signalValue = toHexStringRev(((Integer) s.getValue())
					.intValue(), 8);
			send(signalValue);
			send(END_COMMAND);
		}

		// perform tick
		send(TICK_COMMAND);
		String reply = receive(END_REPLY);

		// receive output message and extract data
		send(OUTPUT_COMMAND);
		reply = receive(END_REPLY);
		char[] outputStatus = parseSeq(reply.substring(0, reply.length() - 1));
		LinkedList<Signal> valuedOutputs = new LinkedList<Signal>();
		iterator = outputs.iterator();
		while (iterator.hasNext()) {
			Signal s = iterator.next();
			int index = s.getIndex() - 1;
			s.setPresent(((outputStatus[index / 8] >> (index % 8)) & 1) == 1);
			if (s.isValued()) {
				valuedOutputs.add(s);
			}
		}

		// receive values of valued output signals
		iterator = valuedOutputs.iterator();
		while (iterator.hasNext()) {
			Signal s = iterator.next();
			// choose valued signal
			send(CHOOSE_VALUED_COMMAND);
			String indexCode = toHexStringRev(s.getIndex(), 2);
			send(indexCode);
			send(END_COMMAND);
			// receive data of valued signal
			send(GET_VALUED_COMMAND);
			reply = receive(END_REPLY);
			s.setValue(Integer.valueOf((parseIntRev(reply, 0,
					reply.length() - 1))));
		}

		int len = getTickLength();

		if (MAX_TICKLEN > 0 && len > MAX_TICKLEN) {
			outputs.getLast().setPresent(true);
		}

		return len;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.ICommunicationProtocol#verifyCommunication()
	 */
	public String verifyCommunication() throws CommunicationException {
		send(VERIFY_COMMAND);
		String reply = receive(END_REPLY);
		if (reply.equals(VERIFICATION_STRING))
			return "Return string is valid.";
		else
			return "Return string is invalid!";
	}

	public boolean getTickWarn() {
		return true;
	}

	public void dumpRom() {
		MessageView.print("dump ROM not available for KEP");

	}

}
