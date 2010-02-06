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

import java.util.LinkedList;
import de.cau.cs.kieler.krep.evalbench.program.IConfig;
import de.cau.cs.kieler.krep.evalbench.util.EsiLogger;

/**
 * Connection to software emulation of the processor via java native interfaces.
 * 
 * @kieler.rating 2010-01-28 proposed yellow ctr
 * 
 * @author ctr
 * 
 */
public class JNIConnection implements IConnection {

    private IKrepWrapper krep = null;

    private EsiLogger esi;

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        if (krep != null) {
            krep.terminate();
            krep = null;
        }

    }

    /**
     * Connect to software emulation.
     * 
     * @param protocol
     *            use KEP or KReP protocol
     * @param logFile
     *            Name of the esi file to which the communication is logged or null to disabled
     *            logging.
     * @throws CommunicationException
     *             thrown for any connection errors, e.g., if the software simulation is not found
     * 
     * 
     */
    public JNIConnection(final String protocol, final String logFile) throws CommunicationException {
        String name = "unknown";
        if (krep != null) {
            krep.terminate();
        }
        if (esi != null) {
            esi = null;
        }
        try {
            if (protocol.equals(ICommunicationProtocol.P_KEP)) {
                name = "kep";
                krep = new KepWrapper();
            } else if (protocol.equals(ICommunicationProtocol.P_KREP)) {
                name = "klp";
                krep = new KlpWrapper();
            } else {
                krep = null;
            }
            if (logFile != null) {
                esi = new EsiLogger(logFile);
            }
        } catch (final Throwable t) {
            throw new CommunicationException("Error generating " + name + "\n" + t.getMessage()
                    + "\nLibrary path: " + System.getProperty("java.library.path"));
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String hark(final int n) throws CommunicationException {
        StringBuffer res = new StringBuffer();
        while (res.length() < n && krep.hasOutput()) {
            res.append(krep.getOutput());
        }
        return res.toString();
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String receive(final char exit) throws CommunicationException {
        StringBuffer res = new StringBuffer();
        char c;
        do {
            while (!krep.hasOutput()) {
                krep.step();
                log(";");
            }
            c = (char) krep.getOutput();
            res.append(c);
        } while (c != exit);
        return res.toString();
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String receive(final int n) throws CommunicationException {
        StringBuffer res = new StringBuffer();
        while (res.length() < n) {
            krep.step();
            log(";");
            if (krep.hasOutput()) {
                res.append((char) krep.getOutput());
            }
        }
        return res.toString();
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void send(final String data) throws CommunicationException {
        for (byte b : data.getBytes()) {
            krep.send(b);
            log(b);
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void send(final byte data) throws CommunicationException {
        krep.send(data);
        log(data);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public LinkedList<Integer> receiveByte(final int n) throws CommunicationException {
        LinkedList<Integer> res = new LinkedList<Integer>();
        final int maskByte = 0xFF;
        while (res.size() < n) {
            krep.step();
            log(";");
            if (krep.hasOutput()) {
                res.add(((int) krep.getOutput()) & maskByte);
            }
        }
        return res;
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void send(final byte[] data) throws CommunicationException {
        for (byte b : data) {
            krep.send(b);
            log(b);
        }
    }

    private void log(final byte b) {
        if (esi != null) {
            esi.write("RX(0x" + Integer.toHexString(b & IConfig.BYTE_MASK) + ");\n");
        }
    }

    private void log(final String s) {
        if (esi != null) {
            esi.write(s + "\n");
        }
    }
}
