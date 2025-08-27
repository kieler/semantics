/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.model.AbstractUIPluginLog;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sj.xtend.AuxiliaryStates;
import de.cau.cs.kieler.s.sj.xtend.S2SJ;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
public class S2SJPlugin extends AbstractUIPluginLog {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.s.sc"; //$NON-NLS-1$

    /** The shared instance. */
    private static S2SJPlugin plugin;

    // -----------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public S2SJPlugin() {
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
     * The output folder is necessary because header paths are also generated. All paths need to be
     * platform specific and resolved.
     * 
     * @param program
     *            the program
     * @param outputFile
     *            the output file (platform specific, resolved paths)
     * @param outputFolder
     *            the output folder (platform specific, resolved paths)
     * @param alternativeSyntax
     *            the alternative SC syntax should be produced
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void generateSJCode(final Program program, final String outputFile,
            final String className, final String packageName, final boolean debug) throws IOException {

        // Pre-transformation, add auxiliary states
        AuxiliaryStates auxiliaryStates = new AuxiliaryStates();
        Program transformedProgram = auxiliaryStates.transform2Simulation(program);
        
        String outputFile2 = outputFile;
        String ccode;
        S2SJ s2SJ = Guice.createInjector().getInstance(S2SJ.class);
        //S2SJ s2SJ = new S2SJ();
        outputFile2.replace(".c", ".java");
        S2SJ.debug = debug;
        ccode = s2SJ.transform(transformedProgram, className, packageName).toString();

        // Write out c program
        FileWriter fileWriter = new FileWriter(outputFile2);
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
    public static S2SJPlugin getDefault() {
        return plugin;
    }

    // -----------------------------------------------------------------------------
}
