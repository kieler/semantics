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
import de.cau.cs.kieler.s.sc.xtend.S2SC;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 */
public class S2SCPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.s.sc"; //$NON-NLS-1$

    /** The shared instance. */
    private static S2SCPlugin plugin;

    // -----------------------------------------------------------------------------

    /**
     * The constructor
     */
    public S2SCPlugin() {
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -----------------------------------------------------------------------------

    /**
     * Generate SC code for a given S program and write it into the outputFile in the output Folder.
     * The output folder is necessary because header paths are also generated.
     * 
     * @param program
     *            the program
     * @param outputFile
     *            the output file
     * @param outputFolder
     *            the output folder
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void generateSCCode(Program program, String outputFile, String outputFolder)
            throws IOException {
        S2SC s2SC = new S2SC();
        String ccode = s2SC.transform(program, outputFolder).toString();

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
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static S2SCPlugin getDefault() {
        return plugin;
    }

}
