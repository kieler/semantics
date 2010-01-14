/*
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
 */
package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;

/**
 * Implementation of the communication protocol interface that uses the KEP protocol.
 * 
 * @author msp
 */
public class KepProtocol extends CommunicationProtocol {

    /** Character reserved for the run command. */
    private static final String RUN_COMMAND = "C";

    /** Character reserved for the stop command. */
    private static final String STOP_COMMAND = "S";

    /** Character reserved for the execution trace command. */
    private static final String TRACE_COMMAND = "M";

    /** Character reserved for the target info command. */
    private static final String INFO_COMMAND = "N";

    /** Character reserved for the tick length command. */
    private static final String TICK_LENGTH_COMMAND = "L";

    /** Character reserved for the load program command. */
    private static final String LOAD_COMMAND = "W";

    /** Character reserved for the first instruction sent for a load command. */
    private static final String INSTRUCTION1_COMMAND = "6";

    /** Character reserved for the second instruction sent for a load command. */
    private static final String INSTRUCTION2_COMMAND = "7";

    /** Character reserved to end a command. */
    private static final String END_COMMAND = "X";

    /** Character reserved for the reset command. */
    private static final String RESET_COMMAND = "R";

    /** Character reserved for the verify communication command. */
    private static final String VERIFY_COMMAND = "V";

    /** Character reserved for the send inputs command. */
    private static final String INPUT_COMMAND = "I";

    /** Character reserved for the tick command. */
    private static final String TICK_COMMAND = "T";

    /** Character reserved for the receive outputs command. */
    private static final String OUTPUT_COMMAND = "O";

    /** Character reserved for the choose valued signal command. */
    private static final String CHOOSE_VALUED_COMMAND = "D";

    /** Character reserved for the send valued signal command. */
    private static final String SEND_VALUED_COMMAND = "G";

    /** Character reserved for the get valued signal command. */
    private static final String GET_VALUED_COMMAND = "P";

    /** Expected string for the verify communication command. */
    private static final String VERIFICATION_STRING = "0123456789ABCDEFX";

    /** Character received at the end of a normal reply. */
    private static final char END_REPLY = 'X';

    /** base for number exchange in protocol. */
    private static final int NUMBASE = 16;

    private static final int WORD_LEN = 4;

    private static final int BYTE_LEN = 8;

    /** Description of received target information data. */
    private static final String[] INFO_DESC = { "KEP Type:                         ",
            "PRE support:                      ", "Data path width:                  ",
            "Signal number:                    ", "Thread number:                    ",
            "Watcher number:                   ", "Watcher counter width:            ",
            "LWatcher number:                  ", "LWatcher counter width:           ",
            "TWatcher counter width:           ", "Delay counter width:              ",
            "Prio value width:                 ", "Register number:                  ",
            "Tick length:                      ", "Instruction memory address width: " };

    /** Length of information items for target information. */
    private static final int[] INFO_LENGTH = { 0, 1, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 2 };

    /** currently loaded assembler */
    private IAssembler asm = null;

    /**
     * Constructs a new instance of the KEP protocol.
     * 
     * @param connectionProtocol
     *            underlying connection protocol to be used; this protocol instance is expected to
     *            be already initialized
     */
    public KepProtocol(final IConnectionProtocol connectionProtocol) {
        super(connectionProtocol);
    }

    /**
     * Parses an integer value from a received string. The integer is expected to be encoded as hex
     * number with the least significant digit first.
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
    private static int parseIntRev(final String s, final int offset, final int n)
            throws CommunicationException {
        // reverse digits for parsing
        StringBuffer stringBuffer = new StringBuffer(n);
        stringBuffer.setLength(n);
        for (int i = 0; i < n; i++) {
            if (offset + i >= s.length()) {
                throw new CommunicationException("Wrong number of digits in received string");
            }
            stringBuffer.setCharAt(n - i - 1, s.charAt(offset + i));
        }
        // parse integer with radix 16
        try {
            return Integer.parseInt(stringBuffer.toString(), NUMBASE);
        } catch (NumberFormatException e) {
            throw new CommunicationException("Invalid number format in received string");
        }
    }

    /**
     * Transforms a string with hex digits into a sequence of characters with corresponding binary
     * information. The character sequence will have half the length of the input string. Each pair
     * of hex digits is expected to be reversed in the input string.
     * 
     * @param s
     *            string to be processed
     * @return character sequence with binary information
     * @throws CommunicationException
     *             when the input string does not match the expected format
     */
    private static char[] parseSeq(final String s) throws CommunicationException {
        int n = s.length();
        char[] x = new char[(n + 1) / 2];
        for (int i = 0; i < n; i += 2) {
            try {
                if (i < n - 1) {
                    x[i / 2] = (char) Integer.parseInt(s.substring(i + 1, i + 2)
                            + s.substring(i, i + 1), NUMBASE);
                } else {
                    x[i / 2] = (char) Integer.parseInt(s.substring(i), NUMBASE);
                }
            } catch (NumberFormatException e) {
                throw new CommunicationException("Invalid number format in received string");
            }
        }
        return x;
    }

    /**
     * Constructs a string holding a hex representation of the given number with leading zeros, so a
     * string length of n is reached as long as the input number is less than 2^n. In any other case
     * a hex string with needed length is returned.
     * 
     * @param x
     *            number to be processed
     * @param n
     *            number of digits for hex representation
     * @return hex string with length n if x < 2^n
     */
    private static String toHexString(final int x, final int n) {
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
     * Constructs a string holding a reversed hex representation of the given number with leading
     * zeros, so a string length of n is reached as long as the input number is less than 2^n. In
     * any other case a reversed hex string with needed length is returned.
     * 
     * @param x
     *            number to be processed
     * @param n
     *            number of digits for hex representation
     * @return reversed hex string with length n if x < 2^n
     */
    private static String toHexStringRev(final int x, final int n) {
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
     * Constructs a string holding a hex representation of the given character sequence. The string
     * will have twice the length of the input sequence.
     * 
     * @param x
     *            sequence of numbers to be processed
     * @param n
     *            total number of bits to be stored
     * @return string where each character is a reversed hex representation of the two corresponding
     *         characters of the input sequence
     */
    private static String toHexStringSeq(final char[] x, final int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < x.length; i++) {
            String s = Integer.toHexString((int) x[i]).toUpperCase();
            if (s.length() <= 1) {
                if (n <= BYTE_LEN * i + BYTE_LEN / 2) {
                    stringBuffer.append(s);
                } else {
                    stringBuffer.append(s + "0");
                }
            } else {
                stringBuffer.append(s.substring(1) + s.substring(0, 1));
            }
        }
        return stringBuffer.toString();
    }

    private void send(final String data) throws CommunicationException {
        getConnection().send(data);
        notifySend(data);
    }

    private String receive(final char x) throws CommunicationException {
        final String res = getConnection().receive(x);
        notifyReceive(res);
        return res;
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void continuousRun() throws CommunicationException {
        send(RUN_COMMAND);
    }

    /**
     * {@inheritDoc}
     */
    public int[] getExecutionTrace() throws CommunicationException {
        notifyComment("get trace");
        send(TRACE_COMMAND);
        String reply = receive(END_REPLY);
        // extract list of addresses from received string
        int addressCount = (reply.length() - 1) / WORD_LEN;
        int[] trace = new int[addressCount];
        for (int i = 0; i < addressCount; i++) {
            trace[i] = parseIntRev(reply, WORD_LEN * i, WORD_LEN);
        }
        return trace;
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String getTargetInfo() throws CommunicationException {
        notifyComment("get Target info");
        final int typeID = 3;
        send(INFO_COMMAND);
        String reply = receive(END_REPLY);
        // construct info message from received string
        StringBuffer stringBuffer = new StringBuffer();
        // KEP Type
        int x = parseIntRev(reply, 0, 1);
        if (((x >> typeID) & 1) == 1) {
            stringBuffer.append(INFO_DESC[0] + "Esterel\n");
        } else {
            stringBuffer.append(INFO_DESC[0] + "VHDL\n");
        }
        // PRE support
        stringBuffer.append(INFO_DESC[1] + (x & 1) + "\n");
        // other information items
        int pos = 1;
        for (int i = 2; i < INFO_DESC.length; i++) {
            x = parseIntRev(reply, pos, INFO_LENGTH[i]);
            stringBuffer.append(INFO_DESC[i] + x + "\n");
            pos += INFO_LENGTH[i];
        }
        return stringBuffer.toString();
    }

    private int getTickLength() throws CommunicationException {
        notifyComment("get ticklength");
        send(TICK_LENGTH_COMMAND);
        String reply = receive(END_REPLY);
        return parseIntRev(reply, 0, WORD_LEN);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public boolean loadProgram(final IAssembler program, final IProgressMonitor monitor)
            throws CommunicationException {
        final int loadTimeout = 50;
        asm = program;
        notifyComment("Load program");
        String[] prog = program.getObj(null);
        send(LOAD_COMMAND);
        int n = prog.length;
        for (int i = 0; i < n; i++) {
            // send instruction for the first time
            String data = INSTRUCTION1_COMMAND + toHexString(i, WORD_LEN) + prog[i];
            send(data);
            // send instruction for the second time
            data = INSTRUCTION2_COMMAND + toHexString(i, WORD_LEN) + prog[i];
            send(data);
            // sleep to make sure the communication word has reached the KEP
            // TODO: implement acknowledgment into KEP protocol
            try {
                Thread.sleep(loadTimeout); // prog.length);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // wait for possible error reply
            String reply = getConnection().hark(1);
            if (reply.length() > 0) {
                notifyReceive(reply);
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

    /**
     * {@inheritDoc}
     * 
     */
    public void reset() throws CommunicationException {
        send(RESET_COMMAND);
        receive(END_REPLY);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void stopContinuous() throws CommunicationException {
        send(STOP_COMMAND);
        receive(END_REPLY);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public int tick(final int maxSignals, final LinkedList<Signal> inputs,
            final LinkedList<Signal> outputs) throws CommunicationException {
        // construct and send input message
        notifyComment("tick");
        LinkedList<Signal> valuedInputs = new LinkedList<Signal>();
        send(INPUT_COMMAND);
        int n = asm.getInputs().size() + asm.getOutputs().size();
        char[] inputStatus = new char[(n + BYTE_LEN - 1) / BYTE_LEN];
        Iterator<Signal> iterator = inputs.iterator();
        while (iterator.hasNext()) {
            Signal s = iterator.next();
            int index = s.getIndex() - 1;
            try {
                inputStatus[index / BYTE_LEN] |= (s.getPresent() ? 1 : 0) << (index % BYTE_LEN);
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
            String signalValue = toHexStringRev(((Integer) s.getValue()).intValue(), BYTE_LEN);
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
        iterator = asm.getOutputs().iterator();
        while (iterator.hasNext()) {
            Signal s = iterator.next();
            int index = s.getIndex() - 1;
            int b = index / BYTE_LEN;
            if (b < outputStatus.length) {
                if (((outputStatus[b] >> (index % BYTE_LEN)) & 1) == 1) {
                    s.setPresent(true);
                    outputs.add(s);
                }
            }
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
            s.setValue(Integer.valueOf((parseIntRev(reply, 0, reply.length() - 1))));
        }

        return getTickLength();
    }

    /**
     * {@inheritDoc}
     * 
     */
    public boolean verifyCommunication() throws CommunicationException {
        send(VERIFY_COMMAND);
        String reply = receive(END_REPLY);
        return reply.equals(VERIFICATION_STRING);
    }
}
