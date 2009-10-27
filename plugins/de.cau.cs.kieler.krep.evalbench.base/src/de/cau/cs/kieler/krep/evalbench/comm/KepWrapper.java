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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.helpers.EsiLogger;
import de.cau.cs.kieler.krep.evalbench.ui.ConnectionPreferencePage;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;

public class KepWrapper implements IKrepWrapper {

    private final EsiLogger esi;

    private static final String NAME = "kep";

    static {
        System.loadLibrary("kep");
    }

    private final LinkedList<Byte> output = new LinkedList<Byte>();

    public KepWrapper() {
        super();
        final String msg = "";
        kep_reset(msg);
        if (msg.length() > 0) {
            MessageView.print(msg);
        }

        final IPreferenceStore preferenceStore = Activator.getDefault()
                .getPreferenceStore();

        final String fileName = preferenceStore
                .getString(ConnectionPreferencePage.JNI_LOG_FILE);
        esi = new EsiLogger(fileName);
        esi.reset();
    }

    public void terminate() {
        // nothing to do
    }

    public boolean hasOutput() {
        return !output.isEmpty();
    }

    public byte getOutput() {
        final byte b = output.poll();
        return (b);
    }

    public void step() {
        String msg = "";
        String io = ";";
        byte c = kep_step(msg);
        if (msg.length() != 0) {
            MessageView.print(msg);
            msg = "";
        }
        if (c != 0) {
            c = kep_recv(msg);
            if (msg.length() > 0) {
                MessageView.print(msg);
            }
            io += " %OUTPUT: TX(0x" + Integer.toHexString(c & 0xFF) + ")";
            output.offer(c);
        }
        io += "\n";
        esi.write(io);
    }

    public void send(final byte b) {
        final String msg = "";
        step();
        esi.write("RX(0x" + Integer.toHexString(b & 0xFF) + ")");
        kep_send(b, msg);
        if (msg.length() > 0) {
            MessageView.print(msg);
        }
        step();

    }

    public static native byte kep_step(final String msg);

    public static native byte kep_recv(final String msg);

    public static native void kep_reset(final String msg);

    public static native void kep_send(final byte c, final String msg);

    public void saveEsi(final String esiFile) {
        BufferedWriter out = null;
        try {
            final File f = new File(esiFile);
            out = new BufferedWriter(new FileWriter(f));
            out.write(esi.toString());
            out.close();
        } catch (final IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (final IOException e) {
                    // silently ignore
                }
            }
        }

    }

    public void comment(final String comment) {
        esi.comment(comment);
    }

    public String getName() {
        return NAME;
    }
}
