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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KrepConfig;

/**
 * Implementation of the communication protocol interface that uses the KREP protocol.
 * 
 * @author ctr
 */
public class KrepProtocol extends CommunicationProtocol {

    private static final byte VERIFY_COMMAND = 'V';

    private static final byte HALT_COMMAND = 'H';

    private static final byte INFO_COMMAND = 'I';

    private static final byte RESET_COMMAND = 'R';

    private static final byte TICK_COMMAND = 'T';

    private static final byte CONT_COMMAND = 'C';

    private static final byte TRACE_COMMAND = 'E';

    private static final byte WRITE_COMMAND = 'W';

    private static final byte SETVALUE_COMMAND = 'S';

    private static final byte GETVALUE_COMMAND = 'G';

    private static final String VERIFICATION_STRING = "0123456789:)";

    private static final int BASE_NUM = 16;

    private static final int ACK = 0xFF;

    /** Description of received target information data. */
    private static final String[] INFO_DESC = { "KIND:                   ",
            "Version:                    ", "#Cores:                     ",
            "#IO Registers:              ", "#local Registers            ",
            "#Instructions               ", "#ALU                        " };

    private KrepConfig krp = null;

    private static final int MASK_BYTE = 0xFF;
    private static final int BYTE_LENGTH = 8;

    private void sendCmd(final byte data) throws CommunicationException {
        getConnection().send(data);
        notifySend(Integer.toHexString(data) + "(" + String.valueOf((char) data) + ")");
    }

    private void send(final byte data) throws CommunicationException {
        getConnection().send(data);
        // log("-> " + data);
        notifySend(Integer.toHexString(data));

    }

    private void send(final byte[] data) throws CommunicationException {
        getConnection().send(data);
        // ConnectionView.log("-> " + data);
        StringBuffer t = new StringBuffer();
        for (byte b : data) {
            t.append(Integer.toHexString(b));
        }
        notifySend(t.toString());
    }

    private LinkedList<Integer> receiveByte(final int n) throws CommunicationException {
        final LinkedList<Integer> res = getConnection().receiveByte(n);

        notifyReceive(String.valueOf(res));

        // ConnectionView.log("<- " + res);
        return res;
    }

    /**
     * Constructs a new instance of the KREP protocol.
     * 
     * @param connectionProtocol
     *            underlying connection protocol to be used; this protocol instance is expected to
     *            be already initialized
     */
    public KrepProtocol(final IConnectionProtocol connectionProtocol) {
        super(connectionProtocol);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void continuousRun() throws CommunicationException {
        sendCmd(CONT_COMMAND);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public int[] getExecutionTrace() throws CommunicationException {
        notifyComment("getTrace");
        ArrayList<Integer> trace = new ArrayList<Integer>();
        int bytes = (krp.getIrom()) / BYTE_LENGTH;
        sendCmd(TRACE_COMMAND);
        LinkedList<Integer> t = receiveByte(bytes);
        for (int i = 0; i < bytes; i++) {
            // String s = t.substring(2*i, 2*(i+1));
            int b = t.get(i);
            int mask = 1;
            for (int j = 0; j < BYTE_LENGTH; j++) {
                if ((b & mask) != 0) {
                    trace.add(BYTE_LENGTH * i + j);
                }
                mask = (mask << 1);
            }
        }
        int[] res = new int[trace.size()];
        for (int i = 0; i < trace.size(); i++) {

            res[i] = trace.get(i);
        }
        return res;
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String getTargetInfo() throws CommunicationException {
        notifyComment("get target information");
        sendCmd(INFO_COMMAND);
        // construct info message from received string
        LinkedList<Integer> msg = receiveByte(INFO_DESC.length);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < INFO_DESC.length; i++) {
            stringBuffer.append(INFO_DESC[i] + "0x" + String.valueOf(msg.get(i)) + "\n");
        }
        Iterator<Integer> i = msg.iterator();
        // int nKind = msg.get(0);
        int kind = i.next();
        if (kind != 0x2) {
            throw new CommunicationException("Wrong processor");
        }
        // int version =
        i.next();

        int nCores = i.next();
        int nIO = i.next();
        int nReg = i.next();
        int nROM = 1 << i.next();

        krp = new KrepConfig(nCores, nIO, nReg, nROM);
        return stringBuffer.toString();
    }

    /**
     * {@inheritDoc}
     */
    public boolean loadProgram(final IAssembler program, final IProgressMonitor monitor)
            throws CommunicationException, LoadException {
        notifyComment("load program");
        if (krp == null) {
            getTargetInfo();
        }
        String error = program.canExecute(krp);
        if (error == null) {
            for (String s : program.getObj(krp)) {
                sendCmd(WRITE_COMMAND);
                byte[] b = { 0, 0, 0, 0, 0 };
                for (int j = 0; j < b.length; j++) {
                    String t = s.substring(2 * j, 2 * (j + 1));
                    int i = Integer.parseInt(t, BASE_NUM);
                    b[j] = (byte) (i & MASK_BYTE);
                }
                send(b);
                LinkedList<Integer> i = receiveByte(1);
                if (i.size() != 1 || i.getFirst() != ACK) {
                    throw new LoadException("wrong acknowledgement");
                }
                if (monitor != null) {
                    monitor.worked(1);
                }
            }
            sendCmd(RESET_COMMAND);
            sendCmd(TICK_COMMAND); // Initialize
            LinkedList<Integer> i = receiveByte(1);
            if (i.size() != 1) {
                throw new LoadException("wrong acknowledgement");
            }
            return true;
        } else {
            throw new LoadException("Cannot execute program: " + error);
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void resetStatus() throws CommunicationException {
        notifyComment("reset");
        sendCmd(RESET_COMMAND);
        sendCmd(TICK_COMMAND); // Initialize
        receiveByte(1);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void stopContinuous() throws CommunicationException {
        sendCmd(HALT_COMMAND);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public int tick(final int maxSignals, final LinkedList<Signal> inputs,
            final LinkedList<Signal> outputs) throws CommunicationException {
        notifyComment("tick");
        int rt = 0;
        // send inputs
        byte i = 0;
        byte[] msg = { 0, 0, 0, 0, 0 };
        for (Signal s : inputs) {
            msg[0] = i; // Signal index
            if (s.isValued()) {
                int v = (Integer) s.getValue();
                for (int j = 0; j < msg.length - 1; j++) {
                    msg[j + 1] = (byte) (v & MASK_BYTE);
                    v = v >> BYTE_LENGTH;
                }
            } else {
                if (s.getPresent()) {
                    msg[msg.length - 1] = (byte) 1;
                } else {
                    msg[msg.length - 1] = (byte) 0;
                }
            }
            sendCmd(SETVALUE_COMMAND);
            send(msg);
            receiveByte(1);
            i++;
        }

        // perform tick
        getConnection().send(TICK_COMMAND);
        rt = receiveByte(1).getFirst();
        // receive outputs
        i = 0;
        for (Signal s : outputs) {
            sendCmd(GETVALUE_COMMAND);
            send(i);
            Integer v = receiveInt();
            if (s.isValued()) {
                s.setValue(v);
                s.setPresent(true);
            } else {
                s.setPresent(v != 0);
            }
            i++;
        }
        return rt;
    }

    private Integer receiveInt() throws CommunicationException {
        final int wordSize = 4;
        long tmp = 0;
        LinkedList<Integer> bytes = receiveByte(wordSize);
        for (Integer b : bytes) {
            tmp = tmp << BYTE_LENGTH;
            tmp += b;
        }
        final long tmin = 0x80000000;
        final long tmax = 0x7FFFFFFF;
        if (tmp > tmax) {
            tmp += tmin;
            tmp += tmin;
        }
        Integer res = (int) tmp;
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public String verifyCommunication() throws CommunicationException {
        notifyComment("verifiy");
        sendCmd(VERIFY_COMMAND);
        String reply = getConnection().receive(VERIFICATION_STRING.length());
        if (reply.equals(VERIFICATION_STRING)) {
            return "Return string is valid.";
        } else {
            return "Return string is invalid!";
        }
    }
}
