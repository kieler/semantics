/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sc.xtend.S2SCC;
import de.cau.cs.kieler.s.sc.xtend.S2SCALT;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
public class S2SCPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.s.sc"; //$NON-NLS-1$

    /** The shared instance. */
    private static S2SCPlugin plugin;

    // -----------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public S2SCPlugin() {
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -----------------------------------------------------------------------------

    /**
     * Generate SC code for a given S program and write it into the outputFile in the output Folder.
     * The output folder is necessary because header paths are also generated. All paths need to
     * be platform specific and resolved.
     *
     * @param program the program
     * @param outputFile the output file (platform specific, resolved paths)
     * @param outputFolder the output folder (platform specific, resolved paths)
     * @param bufferSize the buffer size, estimated for input to the running SC program
     * @param alternativeSyntax the alternative SC syntax should be produced
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void generateSCCode(final Program program, final String outputFile,
            final String outputFolder, final String bufferSize, final boolean alternativeSyntax)
            throws IOException {

        String ccode;
        if (alternativeSyntax) {
            // produce alternative SC syntax on request
            S2SCALT s2SC = new S2SCALT();
            ccode = s2SC.transform(program, outputFolder, bufferSize).toString();
        } else {
            // by default, produce the normal/old SC syntax
            // cmot/27. Aug 2012: use scc style variables instead of signals (S2SCC instead of S2SC)
            S2SCC s2SCC = new S2SCC();
            ccode = s2SCC.transform(program, outputFolder, bufferSize).toString();
        }

        // Write out c program
        FileWriter fileWriter = new FileWriter(outputFile);
        if (fileWriter != null) {
            BufferedWriter out = new BufferedWriter(fileWriter);
            if (out != null) {
                out.write(ccode);
                out.close();
            }
        }
    }

    // -----------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static S2SCPlugin getDefault() {
        return plugin;
    }

}
