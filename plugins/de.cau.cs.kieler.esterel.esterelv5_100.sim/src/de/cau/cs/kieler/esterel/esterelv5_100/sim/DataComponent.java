/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.esterelv5_100.sim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.esterel.esterelv5_100.Esterelv5_100;
import de.cau.cs.kieler.esterel.sim.EsterelSimulationProgressMonitor;
import de.cau.cs.kieler.esterel.sim.EsterelSimulatorDataComponent;

/**
 * The Esterel simulation DataComponent is responsible for <br>
 * <ol>
 * <li>preparing Esterel code for a possibly visualized simulation execution run</li>
 * <li>generating C code with the Esterelv5_100</li>
 * <li>compiling the C code to an executable</li>
 * <li>starting and running the executable stepwise generating inputs and examinating outputs.</li>
 * </ol>
 * <br>
 * 
 * @author sna
 */

public class DataComponent extends EsterelSimulatorDataComponent {

    /**
     * {@inheritDoc}
     */
    protected java.net.URI compileEsterelToC(final URI strlFile, final File outFile,
            final EsterelSimulationProgressMonitor monitor) throws IOException, URISyntaxException {

        /*
         * Handling the header file for the simulation Header must have the same name as the source
         * esterel file with extension .h
         */
        java.net.URI headerURI = convertEMFtoJavaURI(strlFile);
        String headerFileString = headerURI.toString();
        headerFileString = headerFileString.replaceFirst(".simulation.strl", ".h");
        /*
         * Since the Esterel v5_100 compiler processors produce files with different names, for
         * example "sscc_out.c", the header file must be written in a file with name according to
         * the produced C-file The renaming is hard coded in the following and must be adapted if an
         * alternative compilation chain is chosen
         */
        File headerFile = new File(outFile.getParent() + "/sscc_out.h");
        File header = new File(headerFileString);
        if (header.exists()) {
            FileInputStream headerCode = new FileInputStream(headerFileString);
            FileWriter out = new FileWriter(headerFile);
            try {
                while (headerCode.available() > 0) {
                    out.append(new String(Character.toChars(headerCode.read())));
                }
                out.flush();
            } finally {
                out.close();
                headerCode.close();
            }
        }

        // Compilation chain of the .strl file to c
        monitor.subTask("Reading Esterel file");
        System.out.println("Compile 1" + strlFile.toString() + " , " + outFile.toString());
        java.net.URI inputURI = convertEMFtoJavaURI(strlFile);

        System.out.println("Compile 2" + inputURI.toString());
        InputStream strl = Esterelv5_100.runSTRL(inputURI);
        System.out.println("Compile 3");
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        System.out.println("Compile 4");
        monitor.subTask("STRLIC");
        InputStream ic = Esterelv5_100.runSTRLIC(strl);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            ic.close();
            return null;
        }
        System.out.println("Compile 5");
        monitor.subTask("ICLC");
        InputStream lc = Esterelv5_100.runICLC(ic);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            ic.close();
            lc.close();
            return null;
        }
        System.out.println("Compile 6");
        monitor.subTask("LCSC");
        InputStream sc = Esterelv5_100.runLCSC(lc);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            ic.close();
            lc.close();
            sc.close();
            return null;
        }

        /*
         * -----------------------------------------------------------------------------
         * -----------------------------------------------------------------------------
         * 
         * In the following are three different compilation chains. Toggle the comment to switch the
         * compilation chain
         * 
         * -----------------------------------------------------------------------------
         * -----------------------------------------------------------------------------
         */

        /*
         * Generating C code with SCSSC and SSCC processors using Sorted Circuit Code(default
         * compilation chain)
         */
        // -----------------------------------------------------------------------------
        System.out.println("Compile 7");
        monitor.subTask("SCSSC");
        InputStream ssc = Esterelv5_100.runSCSSC(sc);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            ic.close();
            lc.close();
            sc.close();
            ssc.close();
            return null;
        }

        System.out.println("Compile 8");
        monitor.subTask("SSCC");
        InputStream c = Esterelv5_100.runSSCC(ssc);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            ic.close();
            lc.close();
            sc.close();
            ssc.close();
            c.close();
            return null;
        }
        // -----------------------------------------------------------------------------

        /*
         * Generating C code without SCSSC and with SCC processors using Unsorted Circuit Code
         */
        // -----------------------------------------------------------------------------
        // System.out.println("Compile 8");
        // monitor.subTask("SCC");
        // InputStream c = Esterelv5_100.runSCC(ssc);
        // monitor.worked(1);
        // if (monitor.isCanceled()) {
        // c.close();
        // return null;
        // }
        // -----------------------------------------------------------------------------

        /*
         * Generating C code with SCOC and OCC processors using the Automaton code (only for small
         * programs)
         */
        // -----------------------------------------------------------------------------
        // System.out.println("Compile 7");
        // monitor.subTask("SCOC");
        // InputStream oc = Esterelv5_100.runSCOC(sc);
        // monitor.worked(1);
        // if (monitor.isCanceled()) {
        // oc.close();
        // return null;
        // }
        // System.out.println("Compile 8");
        // monitor.subTask("OCC");
        // InputStream c = Esterelv5_100.runOCC(oc);
        // monitor.worked(1);
        // if (monitor.isCanceled()) {
        // c.close();
        // return null;
        // }
        // //-----------------------------------------------------------------------------

        /*
         * Code generation is used for all compilation chains
         */
        System.out.println("Compile 9");
        monitor.subTask("Generating C code");
        java.net.URI uri = Esterelv5_100.runCODEGEN(c, outFile);
        System.out.println("Compile 10" + uri);

        if (benchmark) {
            File currentFile = new File(uri.getPath());
            if (currentFile.exists()) {
                sourceFileSize = currentFile.length();
            }
        }

        monitor.worked(1);
        strl.close();
        ic.close();
        lc.close();
        sc.close();
        ssc.close();
        c.close();
        return uri;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File getDefaultOutFile() throws IOException {
        return Esterelv5_100.getDefaultOutFile();
    }
}
