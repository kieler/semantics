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

public class JNIConnection implements IConnectionProtocol {

    private IKrepWrapper krep = null;

    public void dispose() {
        if (krep != null) {
            krep.terminate();
            krep = null;
        }

    }

    public String initialize(String protocol) throws CommunicationException {
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
        } catch (Throwable t) {
            throw new CommunicationException("Error generating " + name + "\n"
                    + t.getMessage() + "\nLibrary path: "
                    + System.getProperty("java.library.path"));
        }
        return "started new "
                + ((krep != null) ? krep.getName() : "unknown processor");
    }

    public String initialize(final String device, int port)
            throws CommunicationException {
        /*String name = "unknown";
        if (krep != null) {
          krep.terminate();
        }
        try {*/
        IPreferenceStore preferenceStore = Activator.getDefault()
                .getPreferenceStore();
        String currentProtocolType = preferenceStore
                .getString(EvalBenchPreferencePage.PROTOCOL_TYPE);
        return initialize(currentProtocolType);
        /*if (currentProtocolType.equals(ICommunicationProtocol.P_KEP)) {
          name = "kep";
          krep = new KepWrapper();
        } else if (currentProtocolType.equals(ICommunicationProtocol.P_KREP)) {
          name = "klp";
          krep = new KlpWrapper();
        } else {
          krep = null;
        }
        } catch (Throwable t) {
        throw new CommunicationException("Error generating " + name + "\n"
        + t.getMessage() + "\nLibrary path: "
        + System.getProperty("java.library.path"));
        }
        return "started new "
       + ((krep != null) ? krep.getName() : "unknown processor");*/
    }

    public String hark(final int n) throws CommunicationException {
        StringBuffer res = new StringBuffer();
        while (res.length() < n && krep.hasOutput()) {
            res.append(krep.getOutput());
        }
        return res.toString();
    }

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

    public String receive(int n) throws CommunicationException {
        StringBuffer res = new StringBuffer();
        while (res.length() < n) {
            krep.step();
            if (krep.hasOutput()) {
                res.append((char) krep.getOutput());
            }
        }
        return res.toString();
    }

    public void send(String data) throws CommunicationException {
        for (byte b : data.getBytes()) {
            krep.send(b);
        }
    }

    public void send(byte data) throws CommunicationException {
        // for (byte b : data.getBytes()) {
        krep.send(data);
        // }
    }

    public void comment(String comment) {
        krep.comment(comment);
    }

    public LinkedList<Integer> receiveByte(int n) throws CommunicationException {
        LinkedList<Integer> res = new LinkedList<Integer>();
        while (res.size() < n) {
            krep.step();
            if (krep.hasOutput()) {
                res.add(((int) krep.getOutput()) & 0xFF);
            }
        }
        return res;
    }

    public void send(byte[] data) throws CommunicationException {
        for (byte b : data) {
            krep.send(b);
        }
    }

}
