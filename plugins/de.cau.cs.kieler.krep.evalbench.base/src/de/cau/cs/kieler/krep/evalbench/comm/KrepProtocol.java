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
import org.eclipse.swt.widgets.Display;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KrepConfig;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;

/**
 * Implementation of the communication protocol interface that uses the KREP
 * protocol.
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

    private static final byte DUMPROM_COMMAND = 'D';

    private static final String VERIFICATION_STRING = "0123456789:)";

    /** Description of received target information data. */
    private static final String[] INFO_DESC = { "KIND:                   ",
            "Version:                    ", "#Cores:                     ",
            "#IO Registers:              ", "#local Registers            ",
            "#Instructions               ", "#ALU                        " };

    private KrepConfig krp = null;

    private void sendCmd(final byte data) throws CommunicationException {
        connection.send(data);
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                notifySend(Integer.toHexString(data) + "("
                        + String.valueOf((char) data) + ")");
            }
        });
    }

    private void send(final byte data) throws CommunicationException {
        connection.send(data);
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                notifySend(Integer.toHexString(data));
            }
        });
    }

    private void send(final byte[] data) throws CommunicationException {
        connection.send(data);
        String t = "";
        for (byte b : data) {
            t += Integer.toHexString(b);
        }
        final String hex = t;

        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                notifySend(hex);
            }
        });
    }

    private LinkedList<Integer> receiveByte(int n)
            throws CommunicationException {
        final LinkedList<Integer> res = connection.receiveByte(n);
        String s = "";

        final String t = s;
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                notifyReceive(t);
            }
        });
        return res;
    }

    /**
     * Constructs a new instance of the KREP protocol.
     * 
     * @param connectionProtocol
     *            underlying connection protocol to be used; this protocol
     *            instance is expected to be already initialized
     */
    public KrepProtocol(IConnectionProtocol connectionProtocol) {
        super(connectionProtocol);
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ICommunicationProtocol#continuousRun()
     */
    public void continuousRun() throws CommunicationException {
        sendCmd(CONT_COMMAND);
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ICommunicationProtocol#getExecutionTrace()
     */
    public int[] getExecutionTrace() throws CommunicationException {
        ArrayList<Integer> trace = new ArrayList<Integer>();
        int bytes = (krp.getIrom()) / 8;
        sendCmd(TRACE_COMMAND);
        LinkedList<Integer> t = receiveByte(bytes);
        for (int i = 0; i < bytes; i++) {
            // String s = t.substring(2*i, 2*(i+1));
            int b = t.get(i);
            int mask = 1;
            for (int j = 0; j < 8; j++) {
                if ((b & mask) != 0) {
                    trace.add(8 * i + j);
                }
                mask = (mask << 1);
            }
        }
        int[] res = new int[trace.size()];
        for (int i = 0; i < trace.size(); i++) {

            res[i] = trace.get(i);
        }
        // int res[] = {1,2};
        MessageView.print("TraceLength:" + trace.size());
        return res;
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ICommunicationProtocol#getTargetInfo()
     */
    public String getTargetInfo() throws CommunicationException {
        sendCmd(INFO_COMMAND);
        // construct info message from received string
        LinkedList<Integer> msg = receiveByte(INFO_DESC.length);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < INFO_DESC.length; i++) {
            stringBuffer.append(INFO_DESC[i] + "0x"
                    + String.valueOf(msg.get(i)) + "\n");
        }
        int nKind = msg.get(0); // Integer.parseInt(msg.substring(0, 2), 16);
        int nCores = msg.get(2); // Integer.parseInt(msg.substring(4, 6), 16);
        int nIO = msg.get(3); // Integer.parseInt(msg.substring(6, 8), 16);
        int nReg = msg.get(4); // Integer.parseInt(msg.substring(8, 10), 16);
        int nROM = 1 << msg.get(5); // Integer.parseInt(msg.substring(10, 12),
        // 16);

        /*
         * if (nROM <0){ nROM=0; int b = msg.get(5); if ((b & 0x01) !=0) nROM+=
         * 1; if ((b & 0x02) !=0) nROM+= 2; if ((b & 0x04) !=0) nROM+= 4; if ((b
         * & 0x08) !=0) nROM+= 8; if ((b & 0x10) !=0) nROM+= 16; if ((b & 0x20)
         * !=0) nROM+= 32; if ((b & 0x40) !=0) nROM+= 64; if ((b & 0x80) !=0)
         * nROM+= 128; }
         */

        krp = new KrepConfig(nCores, nIO, nReg, nROM);

        return stringBuffer.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * krep.evalbench.comm.ICommunicationProtocol#loadProgram(java.lang.String)
     */
    public boolean loadProgram(IAssembler program, IProgressMonitor monitor)
            throws CommunicationException, LoadException {
        if (krp == null) {
            getTargetInfo();
        }
        String error = program.canExecute(krp);
        if (error == null) {
            for (String s : program.getObj(krp)) {
                sendCmd(WRITE_COMMAND);
                byte[] b = new byte[5];
                for (int j = 0; j < 5; j++) {
                    String t = s.substring(2 * j, 2 * (j + 1));
                    int i = Integer.parseInt(t, 16);
                    b[j] = (byte) (i & 0xFF);
                }
                send(b);
                receiveByte(1);
                if (monitor != null) {
                    monitor.worked(1);
                }
            }
            sendCmd(RESET_COMMAND);
            sendCmd(TICK_COMMAND); // Initialize
            receiveByte(1);
            return true;
        } else {
            throw new LoadException("Cannot execute program: " + error);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ICommunicationProtocol#resetStatus()
     */
    public void resetStatus() throws CommunicationException {
        sendCmd(RESET_COMMAND);
        sendCmd(TICK_COMMAND); // Initialize
        receiveByte(1);
    }

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ICommunicationProtocol#stopContinuous()
     */
    public void stopContinuous() throws CommunicationException {
        sendCmd(HALT_COMMAND);
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

        int rt = 0;
        // send inputs
        byte i = 0;
        byte[] msg = new byte[5];
        for (Signal s : inputs) {
            msg[0] = i; // Signal index
            if (s.isValued()) {
                int v = (Integer) s.getValue();
                for (int j = 0; j < 4; j++) {
                    msg[j + 1] = (byte) (v & 0xFF);
                    v = v >> 8;
                }
                // msg+= toHex(((Integer) s.getValue()));
            } else {
                msg[4] = ((byte) (s.getPresent() ? 1 : 0));
            }
            sendCmd(SETVALUE_COMMAND);
            send(msg);
            receiveByte(1);
            i++;
        }

        // perform tick
        connection.send(TICK_COMMAND);
        rt = receiveByte(1).getFirst(); // Integer.parseInt(receive(2), 16);
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
        /*
         * rt=0; send(TRACE_COMMAND); int bytes = (krp.getIrom()+1)/8; String t
         * = receive(2*bytes); for( i=0; i<bytes; i++){ String s =
         * t.substring(2*i, 2*(i+1)); int b = Integer.parseInt(s, 16); int mask
         * =1; for(int j=0; j<8;j++){ if((b & mask)!=0){ rt++; } mask = (mask <<
         * 1); } }
         */
        return rt;
    }

    private Integer receiveInt() throws CommunicationException {
        long tmp = 0;
        LinkedList<Integer> bytes = receiveByte(4);
        for (Integer b : bytes) {
            tmp = tmp << 8;
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

    /*
     * (non-Javadoc)
     * 
     * @see krep.evalbench.comm.ICommunicationProtocol#verifyCommunication()
     */
    public String verifyCommunication() throws CommunicationException {
        sendCmd(VERIFY_COMMAND);
        String reply = connection.receive(VERIFICATION_STRING.length());
        if (reply.equals(VERIFICATION_STRING)) {
            return "Return string is valid.";
        } else {
            return "Return string is invalid!";
        }
    }

    public void dumpRom() {
        try {
            sendCmd(DUMPROM_COMMAND);
            LinkedList<Integer> rom = receiveByte(4 * krp.getIrom());
            Iterator<Integer> i = rom.iterator();
            for (int k = 0; k < krp.getIrom(); k++) {
                String s = k + ": ";
                for (int j = 0; j < 4; j++) {
                    s += Integer.toHexString(i.next()) + " ";
                }
                MessageView.print(s);
            }
        } catch (CommunicationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
