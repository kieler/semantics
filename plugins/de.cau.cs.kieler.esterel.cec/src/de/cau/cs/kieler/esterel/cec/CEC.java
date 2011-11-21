/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.cec;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * Wrapper class to execute CEC executables.
 * 
 * @author ctr, cmot
 * 
 */
public final class CEC {

    private CEC() {
    }

    /**
     * all modules that are part of the CEC. The names match the names of the executables, excluding
     * special characters like "-".
     */
    public enum MODULE {
        /** */
        ASTGRC("astgrc"),
        /** */
        BALASM("balasm"),
        /** */
        BLIFUTIL("blifutil"),
        /** */
        DISMANTLE("dismantle"),
        /** */
        EEC("eec"),
        /** */
        EXPANDMODULE("expandmodules"),
        /***/
        GRC3VAL("grc3val"),
        /***/
        GRCBAL("grcbal"),
        /***/
        GRCC2("grcc2"),
        /***/
        GRCDOT("grcdot"),
        /***/
        GRCOPT("grcopt"),
        /***/
        GRCPDG("grcpdg"),
        /***/
        GRCSIM("grcsim"),
        /***/
        PDGBLIF("pdgblif"),
        /***/
        PDGCCFG("pdgccfg"),
        /***/
        SCFGC("scfgc"),
        /***/
        SMBLIF("smblif"),
        /***/
        STRLXML("strlxml"),
        /***/
        V5CMAIN("v5-cmain"),
        /***/
        VM("vm"),
        /***/
        VMWRAPPER("vm-wrapper"),
        /***/
        XMLSTRL("xmlstrl");

        private String cmd;

        private MODULE(final String c) {
            this.cmd = c;
        }

        @Override
        public String toString() {
            return cmd;
        }
    }

    private static final int INIT_TIME = 500;
    private static final int TIMEOUT = 5000;
    private static final int STEP_TIME = 500;

    /**
     * Execute single CEC module.
     * 
     * @param module
     *            name of the module
     * @param input
     *            input stream for the compilation
     * @return result of the compilation
     * @throws IOException
     *             thrown for any execution error
     */
    public static InputStream exec(final MODULE module, final InputStream input)
            throws IOException {
        Bundle[] fragments = Platform.getFragments(Activator.getDefault().getBundle());

        if (fragments.length != 1) {
            throw new UnsupportedOperationException("cec native fragment not found, "
                    + "it seems that your platform is not supported by the CEC", null);
        }
        Bundle compiler = fragments[0];

        String path;
        path = FileLocator.getBundleFile(compiler).getAbsolutePath();

        String cmd = path + File.separator + "cec-" + module;

        return KonsoleExec.exec(cmd, input, INIT_TIME, TIMEOUT, STEP_TIME);
    }

    /**
     * Compile Esterel file to C. This is directly derived from the CEC script with the default
     * values.
     * 
     * @param strlFile
     *            name of the input File.
     * @param outFile
     *            output file for the C code
     * @return URI of the generated C file
     * @throws IOException
     *             if file cannot be read/written or compiler can not be executed or
     *             for compilation errors
     */
    public static URI run(final URI strlFile, final File outFile) throws IOException {

        InputStream strl = new FileInputStream(strlFile.getPath());
        InputStream ast = exec(MODULE.STRLXML, strl);
        InputStream exp = exec(MODULE.EXPANDMODULE, ast);
        InputStream dis = exec(MODULE.DISMANTLE, exp);
        InputStream grc = exec(MODULE.ASTGRC, dis);
        InputStream opt = exec(MODULE.GRCOPT, grc);
        InputStream pdg = exec(MODULE.GRCPDG, opt);
        InputStream ccfg = exec(MODULE.PDGCCFG, pdg);
        InputStream scfg = exec(MODULE.EEC, ccfg);
        InputStream c = exec(MODULE.SCFGC, scfg);

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
     * Compile Esterel file to C. This is directly derived from the CEC script with the default
     * values.
     * 
     * @param strlFile
     *            name of the input File.
     * @return URI of the generated C file
     * @throws IOException
     *             if file cannot be read/written or if compiler can not be executed
     *             or for compilation errors
     */
    public static URI run(final URI strlFile) throws IOException {
        File outFile = File.createTempFile("strl", ".c");
        return run(strlFile, outFile);
    }

}
