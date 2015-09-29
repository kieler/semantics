/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
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

import com.google.inject.Guice;

import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sc.xtend.S2C;
import de.cau.cs.kieler.s.sc.xtend.S2SCC;
import de.cau.cs.kieler.s.sc.xtend.S2SCALT;
import de.cau.cs.kieler.s.extensions.SExtension;

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

    /** The estimated maximum buffer size (string length) used for a pure signal. */
    private static final int PURE_SIGNAL_BUFFER_CONSTANT = 21;

    /** The estimated maximum buffer size (string length)used for a valued signal. */
    private static final int VALUED_SIGNAL_BUFFER_CONSTANT = 100;

    /** The minimal buffer size for the communicating buffer of the running SC program. */
    private static final double MINIMAL_BUFFER_SIZE = 2048;

    /** The shared instance. */
    private static S2SCPlugin plugin;

    /** The single s / kexpression extension. */
    private static SExtension sExtension = new SExtension();
    private static KExpressionsExtension kExpressionExtension = new KExpressionsExtension();
    
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
     * @param alternativeSyntax the alternative SC syntax should be produced
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void generateCCode(final Program program, final String outputFile,
            final String outputFolder, final boolean alternativeSyntax, final String includeHeader)
            throws IOException {

        // Calculate/Estimate the buffer size
        String bufferSize = estimateBufferSize(program);
        String outputFile2 = outputFile;
        
        String ccode;
        if (alternativeSyntax) {
            // produce alternative SC syntax on request
            S2SCALT s2SC = new S2SCALT();
            ccode = s2SC.transform(program, outputFolder, bufferSize).toString();
        } else {
            // by default, produce the normal/old SC syntax
            // cmot/27. Aug 2012: use scc style variables instead of signals (S2SCC instead of S2SC)

            //S2SCC s2SCC = new S2SCC();
            S2SCC s2C = Guice.createInjector().getInstance(S2SCC.class);
//            S2SCC s2SCC = (S2SCC) KiCoPlugin.getGuiceInstance(S2SCC.class);
            S2SCC.bufferSize = bufferSize;
            S2SCC.includeHeader = includeHeader;
//            ccode = (String) KielerCompiler.compile("S2SC", program);
            ccode = s2C.transform(program).toString();
        }

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
     * Calculate estimated buffer size needed for an SC program to interact with
     * the stimulating environment.
     *
     * @param program the program
     * @return the estimated buffer size as a String
     */
    public static String estimateBufferSize(final Program program) {
        int bufferSizeInt = 0;
        for (ValuedObject signal : kExpressionExtension.getValuedObjects(program)) {
            if (kExpressionExtension.isSignal(signal)) {
                if (kExpressionExtension.getType(signal) == ValueType.PURE) {
                    bufferSizeInt += signal.getName().length() + PURE_SIGNAL_BUFFER_CONSTANT;
                } else {
                    bufferSizeInt += signal.getName().length() + VALUED_SIGNAL_BUFFER_CONSTANT;
                }
            }
        }
        double log = Math.ceil(Math.log(bufferSizeInt) / Math.log(2));
        double bufferSizeDouble = Math.ceil(Math.pow(2, log + 1));
        if (bufferSizeDouble < MINIMAL_BUFFER_SIZE) {
            bufferSizeDouble = MINIMAL_BUFFER_SIZE;
        }
        String bufferSize = bufferSizeDouble + "";
        bufferSize = bufferSize.substring(0, bufferSize.lastIndexOf('.'));
        return bufferSize;
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

    // -----------------------------------------------------------------------------
}
