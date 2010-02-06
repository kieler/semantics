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

import de.cau.cs.kieler.krep.evalbench.util.EsiLogger;

/**
 * Wrapper to software simulation of the Kiel Lustre Processor.
 * 
 * @kieler.rating 2010-01-28 proposed yellow ctr
 * 
 * @author ctr
 * 
 */
public class KlpWrapper implements IKrepWrapper {

    private EsiLogger esi;

    private static final String NAME = "klp";

    private static final int MASK_BYTE = 0xFF;

    static {
        System.loadLibrary("klp");
    }

    private LinkedList<Byte> output = new LinkedList<Byte>();

    /**
     * Generate new connection to KLP and reset the KLP.
     */
    public KlpWrapper() {
        super();
        final String msg = "";
        klp_reset(msg);
       
        esi = new EsiLogger("klp.esi");
        esi.reset();
        step();

    }

    /**
     * {@inheritDoc}
     */
    public void terminate() {
        // nothing to do
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasOutput() {
        return !output.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    public byte getOutput() {
        byte b = output.poll();
        return (b);
    }

    /**
     * {@inheritDoc}
     */
    public void step() {
        String msg = "";
        String io = ";";
        byte c = klp_step(msg);
        if (c != 0) {
            msg = "";
            c = klp_recv(msg);
            io += " %OUTPUT: TX(0x" + Integer.toHexString(c & MASK_BYTE) + ")";
            output.offer(c);
        }
        io += "\n";

        esi.write(io);

    }

    /**
     * {@inheritDoc}
     */
    public void send(final byte b) {
        String msg = "";
        step();
        esi.write("RX(0x" + Integer.toHexString(b & MASK_BYTE) + ")");
        klp_send(b, msg);
        step();

    }

    // CHECKSTYLEOFF Name
    // This names are enforced by the KLP and JNI
    private static native byte klp_step(final String msg);

    private static native byte klp_recv(final String msg);

    private static native void klp_reset(final String msg);

    private static native void klp_send(final byte c, final String msg);
    // CHECKSTYLEON Name
    
    /**
     * {@inheritDoc}
     */
    public final void saveEsi(final String esiFile) {
        BufferedWriter out = null;
        try {
            File f = new File(esiFile);
            out = new BufferedWriter(new FileWriter(f));
            out.write(esi.toString());
            out.flush();
        } catch (IOException e) {
            // silently ignore
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // silently ignore
                }
            }
        }

    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return NAME;
    }

    /**
     * {@inheritDoc}
     */
    public void comment(final String comment) {
        esi.comment(comment);
    }

}
