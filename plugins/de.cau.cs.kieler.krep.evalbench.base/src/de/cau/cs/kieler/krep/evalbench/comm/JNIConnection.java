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

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.ui.EvalBenchPreferencePage;

/**
 * Connection to software emulation of the processor via java native interfaces.
 * 
 * @author ctr
 * 
 */
public class JNIConnection implements IConnectionProtocol {

    private IKrepWrapper krep = null;

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
     * @return String to indicate the status of the connection.
     * @throws CommunicationException
     *             thrown for any connection errors, e.g., if the software simulation is not found
     * 
     * 
     */
    public String initialize(final String protocol) throws CommunicationException {
        String name = "unknown";
        if (krep != null) {
            krep.terminate();
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
        } catch (final Throwable t) {
            throw new CommunicationException("Error generating " + name + "\n" + t.getMessage()
                    + "\nLibrary path: " + System.getProperty("java.library.path"));
        }
        return "started new " + ((krep != null) ? krep.getName() : "unknown processor");
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String initialize(final String device, final int port) throws CommunicationException {
        IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
        String currentProtocolType = preferenceStore
                .getString(EvalBenchPreferencePage.PROTOCOL_TYPE);
        return initialize(currentProtocolType);
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
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void send(final byte data) throws CommunicationException {
        krep.send(data);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void comment(final String comment) {
        krep.comment(comment);
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
        }
    }

}
