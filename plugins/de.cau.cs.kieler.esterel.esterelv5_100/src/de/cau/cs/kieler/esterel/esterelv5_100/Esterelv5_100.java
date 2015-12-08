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
package de.cau.cs.kieler.esterel.esterelv5_100;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * Wrapper class to execute CEC executables.
 * 
 * @author sna
 *
 */
public class Esterelv5_100 {

    /**
     * Instantiates a new Esterelv5_100 compiler.
     */
    private Esterelv5_100() {

    }

    /**
     * all modules that are part of the Esterelv5_100 compiler. 
     * The names match the names of the executables, excluding
     * special characters like "-".
     */
    public enum MODULE {
        /**
         * The STRLIC processor
         */
        STRLIC("strlic"), 
        /**
         * The ICLC processor
         */
        ICLC("iclc"), 
        /**
         * The LCSC processor
         */
        LCSC("lcsc"), 
        /**
         * The SCOC processor
         */
        SCOC("scoc"), 
        /**
         * The SCC processor
         */
        SCC("scc"), 
        /**
         * The OCC processor
         */
        OCC("occ"), 
        /**
         * The SCSSC processor
         */
        SCSSC("scssc"), 
        /**
         * The SSCC processor
         */
        SSCC("sscc");

        /** 
         * The cmd 
         */
        private String cmd;

        /**
         * Instantiates a new MODULE.
         * 
         * @param c the cmd
         */
        private MODULE(final String c) {
            this.cmd = c;
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Enum#toString()
         */
        @Override
        public String toString() {
            return cmd;
        }
    }

    /** The Constant INIT_TIME. Adopted from CEC. */
    private static final int INIT_TIME = 10000;

    /** The Constant TIMEOUT. Adopted from CEC. */
    private static final int TIMEOUT = 200;

    /** The Constant STEP_TIME. Adopted from CEC. */
    private static final int STEP_TIME = 50;

    
    private static URL resolveBundleOrWorkspaceFile(final String file, final String pluginId) {
        // if the bundle is not ready then there is no image
        final Bundle bundle = Platform.getBundle(pluginId);

        System.out.println("Bundle:" + bundle.getBundleId() + "///" + bundle.getSymbolicName());

        // first try to resolve bundle files (give preference to bundle files)
        URL fileURL = org.eclipse.core.runtime.FileLocator.find(bundle, new Path(file), null);

        if (fileURL == null) {
            System.out.println("fileURL: NULL");
        } else {
            System.out.println("fileURL:" + fileURL.toString());
        }

        return fileURL;
    }

    /**
     * Resolve the path to the executable in a fragment for a specific Esterelv5_100 module.
     * 
     * @param module the MODULE
     * @return the string for the MODULE
     */
    private static String resolveFragmentModule(final MODULE module) {
        try {
            URL resolvedFileName =
                    resolveBundleOrWorkspaceFile("" + module,
                            "de.cau.cs.kieler.esterel.esterelv5_100");

            if (resolvedFileName != null) {
                resolvedFileName = KiemUtil.getAbsoluteBundlePath(resolvedFileName);
            }
            if (resolvedFileName != null) {
                String resolvedModuleExecutable = KiemUtil.getAbsoluteFilePath(resolvedFileName);
                return resolvedModuleExecutable;
            }            
        } catch (MalformedURLException e) {
            throw new RuntimeException("Cannot resolve executable of Esterelv5_100 module '"
                    + module + "'", e);
        } catch (IOException e) {
            throw new RuntimeException("Cannot resolve executable of Esterelv5_100 module '"
                    + module + "'", e);
        }
        throw new RuntimeException("Cannot resolve executable of Esterelv5_100 module '" + module
                + "'");
    }

    /**
     * Execute single Esterelv5_100 module except the C code generating modules
     * with an optional additional output.
     * 
     * @param module
     *            name of the module
     * @param input
     *            input stream for the compilation
     * @return result of the compilation
     * @throws IOException
     *             thrown for any execution error
     */
    public static InputStream exec(final MODULE module, final InputStream input) throws IOException {

        String cmd = resolveFragmentModule(module);

        System.out.println(cmd);

        return EsterelExec.exec(cmd, input, INIT_TIME, TIMEOUT, STEP_TIME);
    }

    /**
     * Execute Esterelv5_100 C code generating module.
     * 
     * @param module
     *            name of the module
     * @param input
     *            input stream for the compilation
     * @return result of the compilation
     * @throws IOException
     *             thrown for any execution error
     */
    public static InputStream execComp(final MODULE module, final InputStream input)
            throws IOException {

        String cmd = resolveFragmentModule(module);

        System.out.println(cmd);

        return EsterelExec.execComp(cmd, input);
    }

    /**
     * Run 1. strl.
     * 
     * @param strlFile
     *            the strl file
     * @return the input stream
     * @throws FileNotFoundException
     *             the file not found exception
     */
    public static InputStream runSTRL(final URI strlFile) throws FileNotFoundException {
        return new FileInputStream(strlFile.getPath());
    }

    /**
     * Run 2. strlic.
     * 
     * @param strl
     *            the strl stream
     * @return the ic input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runSTRLIC(final InputStream strl) throws IOException {
        return exec(MODULE.STRLIC, strl);
    }

    /**
     * Run 3. iclc.
     * 
     * @param ic
     *            the ic stream
     * @return the lc input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runICLC(final InputStream ic) throws IOException {
        return exec(MODULE.ICLC, ic);
    }

    /**
     * Run 4. lcsc.
     * 
     * @param lc
     *            the lc stream
     * @return the sc input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runLCSC(final InputStream lc) throws IOException {
        return exec(MODULE.LCSC, lc);
    }

    /**
     * Run 5. scoc (alternative route).
     * 
     * @param sc
     *            the sc stream
     * @return the oc input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runSCOC(final InputStream sc) throws IOException {
        return exec(MODULE.SCOC, sc);
    }

    /**
     * Run 5. scc (alternative route).
     * 
     * @param sc
     *            the strl stream
     * @return the c input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runSCC(final InputStream sc) throws IOException {
        return exec(MODULE.SCC, sc);
    }

    /**
     * Run 6. occ (alternative route).
     * 
     * @param oc
     *            the oc stream
     * @return the c input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runOCC(final InputStream oc) throws IOException {
        return exec(MODULE.OCC, oc);
    }

    /**
     * Run 5. scssc.
     * 
     * @param sc
     *            the strl stream
     * @return the ssc input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runSCSSC(final InputStream sc) throws IOException {
        return exec(MODULE.SCSSC, sc);
    }

    /**
     * Run 6. sscc (alternative route).
     * 
     * @param ssc
     *            the strl stream
     * @return the c input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream runSSCC(final InputStream ssc) throws IOException {
        return execComp(MODULE.SSCC, ssc);
    }

    /**
     * Run 6/7. codegen.
     * 
     * @param c
     *            the c stream
     * @param outFile
     *            the out file
     * @return the URI
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static URI runCODEGEN(final InputStream c, final File outFile) throws IOException {
        FileWriter out = new FileWriter(outFile);
        try {
            while (c.available() > 0) {
                out.append(new String(Character.toChars(c.read())));
            }
            out.flush();
        } finally {
            out.close();
        }
        return outFile.toURI();
    }

    /**
     * Compile Esterel file to C. This is directly derived from the Esterelv5_100 script 
     * with the default values. The expandedOutputStream is optional an may be null.
     * 
     * @param strlFile
     *            name of the input File.
     * @param outFile
     *            output file for the C code
     * @return URI of the generated C file
     * @throws IOException
     *             if file cannot be read/written or compiler can not be executed or for compilation
     *             errors
     */
    public static URI run(final URI strlFile, final File outFile) throws IOException {
        InputStream strl = Esterelv5_100.runSTRL(strlFile);
        InputStream ic = Esterelv5_100.runSTRLIC(strl);
        InputStream lc = Esterelv5_100.runICLC(ic);
        InputStream sc = Esterelv5_100.runLCSC(lc);
        // InputStream oc = Esterelv5_100.runSCOC(sc);
        // InputStream c = Esterelv5_100.runOCC(oc);
        // InputStream c = Esterelv5_100.runSCC(sc);
        InputStream ssc = Esterelv5_100.runSCSSC(sc);
        InputStream c = Esterelv5_100.runSSCC(ssc);
        return runCODEGEN(c, outFile);
    }

    /**
     * Gets the default out file.
     * 
     * @return the default out file
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static File getDefaultOutFile() throws IOException {
        File outFile = File.createTempFile("strl", ".c");
        System.out.println(outFile.getPath().toString());
        return outFile;
    }

    /**
     * Compile Esterel file to C. This is directly derived from the CEC script 
     * with the default values. 
     * 
     * @param strlFile
     *            name of the input File.
     * @return URI of the generated C file
     * @throws IOException
     *             if file cannot be read/written or if compiler can not be executed or for
     *             compilation errors
     */
    public static URI run(final URI strlFile) throws IOException {
        return run(strlFile, getDefaultOutFile());
    }
}
