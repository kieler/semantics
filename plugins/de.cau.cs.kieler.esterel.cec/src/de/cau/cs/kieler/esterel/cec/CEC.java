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
import java.io.FileNotFoundException;
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

    /**
     * Instantiates a new cEC.
     */
    private CEC() {
    }

    // -------------------------------------------------------------------------

    /**
     * all modules that are part of the CEC. The names match the names of the executables, excluding
     * special characters like "-".
     */
    public enum MODULE {
        
        /** The ASTGRC. */
        ASTGRC("astgrc"),
        
        /** The BALASM. */
        BALASM("balasm"),
        
        /** The BLIFUTIL. */
        BLIFUTIL("blifutil"),
        
        /** The DISMANTLE. */
        DISMANTLE("dismantle"),
        
        /** The EEC. */
        EEC("eec"),
        
        /** The EXPANDMODULE. */
        EXPANDMODULE("expandmodules"),
        
        /** The GR c3 val. */
        GRC3VAL("grc3val"),
        
        /** The GRCBAL. */
        GRCBAL("grcbal"),
        
        /** The GRC c2. */
        GRCC2("grcc2"),
        
        /** The GRCDOT. */
        GRCDOT("grcdot"),
        
        /** The GRCOPT. */
        GRCOPT("grcopt"),
        
        /** The GRCPDG. */
        GRCPDG("grcpdg"),
        
        /** The GRCSIM. */
        GRCSIM("grcsim"),
        
        /** The PDGBLIF. */
        PDGBLIF("pdgblif"),
        
        /** The PDGCCFG. */
        PDGCCFG("pdgccfg"),
        
        /** The SCFGC. */
        SCFGC("scfgc"),
        
        /** The SMBLIF. */
        SMBLIF("smblif"),
        
        /** The STRLXML. */
        STRLXML("strlxml"),
        
        /** The V5 cmain. */
        V5CMAIN("v5-cmain"),
        
        /** The VM. */
        VM("vm"),
        
        /** The VMWRAPPER. */
        VMWRAPPER("vm-wrapper"),
        
        /** The XMLSTRL. */
        XMLSTRL("xmlstrl");

        /** The cmd. */
        private String cmd;

        /**
         * Instantiates a new mODULE.
         *
         * @param c the c
         */
        private MODULE(final String c) {
            this.cmd = c;
        }

        /* (non-Javadoc)
         * @see java.lang.Enum#toString()
         */
        @Override
        public String toString() {
            return cmd;
        }
    }

    // -------------------------------------------------------------------------

    /** The Constant INIT_TIME. */
    private static final int INIT_TIME = 1000;
    
    /** The Constant TIMEOUT. */
    private static final int TIMEOUT = 500;
    
    /** The Constant STEP_TIME. */
    private static final int STEP_TIME = 100;

    // -------------------------------------------------------------------------
    
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
        Bundle[] fragments = Platform.getFragments(CECPlugin.getDefault().getBundle());

        if (fragments.length != 1) {
            throw new UnsupportedOperationException("cec native fragment not found, "
                    + "it seems that your platform is not supported by the CEC", null);
        }
        Bundle compiler = fragments[0];

        String path;
        path = FileLocator.getBundleFile(compiler).getAbsolutePath();

        String cmd = path + File.separator + "cec-" + module;

        System.out.println(cmd);
        
        return KonsoleExec.exec(cmd, input, INIT_TIME, TIMEOUT, STEP_TIME);
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * Run 1. strl.
     *
     * @param strlFile the strl file
     * @return the input stream
     * @throws FileNotFoundException the file not found exception
     */
    public static InputStream runSTRL(final URI strlFile) throws FileNotFoundException {
    	 return new FileInputStream(strlFile.getPath());
    }
    
    // -------------------------------------------------------------------------

    /**
     * Run 2. strlxml.
     *
     * @param strl the strl
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runSTRLXML(final InputStream strl) throws IOException {
   	 return exec(MODULE.STRLXML, strl);
   }

    // -------------------------------------------------------------------------
    
    /**
     * Run 3. expandmodule.
     *
     * @param strlxml the strlxml
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runEXPANDMODULE(final InputStream strlxml) throws IOException {
      	 return exec(MODULE.EXPANDMODULE, strlxml);
      }

    // -------------------------------------------------------------------------
    
    /**
     * Run 4. dismantle.
     *
     * @param expandmodule the expandmodule
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runDISMANTLE(final InputStream expandmodule) throws IOException {
      	 return exec(MODULE.DISMANTLE, expandmodule);
      }

    // -------------------------------------------------------------------------
    
    /**
     * Run 5. astgrc.
     *
     * @param dismantle the dismantle
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runASTGRC(final InputStream dismantle) throws IOException {
      	 return exec(MODULE.ASTGRC, dismantle);
      }

    // -------------------------------------------------------------------------
    
    /**
     * Run 6. grcopt.
     *
     * @param astgrc the astgrc
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runGRCOPT(final InputStream astgrc) throws IOException {
      	 return exec(MODULE.GRCOPT, astgrc);
      }

    // -------------------------------------------------------------------------
    
    /**
     * Run 7. grcpdg.
     *
     * @param grcopt the grcopt
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runGRCPDG(final InputStream grcopt) throws IOException {
      	 return exec(MODULE.GRCPDG, grcopt);
      }
    
    // -------------------------------------------------------------------------
    
    /**
     * Run 8. pdgccfg.
     *
     * @param grcpdg the grcpdg
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runPDGCCFG(final InputStream grcpdg) throws IOException {
      	 return exec(MODULE.PDGCCFG, grcpdg);
      }

    // -------------------------------------------------------------------------
    
    /**
     * Run 9. eec.
     *
     * @param pdgccfg the pdgccfg
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runEEC(final InputStream pdgccfg) throws IOException {
      	 return exec(MODULE.EEC, pdgccfg);
      }

    // -------------------------------------------------------------------------
    
    /**
     * Run 10. scfgc.
     *
     * @param eec the eec
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static InputStream runSCFGC(final InputStream eec) throws IOException {
      	 return exec(MODULE.SCFGC, eec);
      }
    
    // -------------------------------------------------------------------------

    /**
     * Run 11. codegen.
     *
     * @param scfgc the scfgc
     * @param outFile the out file
     * @return the uRI
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static URI runCODEGEN(final InputStream scfgc, final File outFile) throws IOException {
        FileWriter out = new FileWriter(outFile);
        try {
            while (scfgc.available() > 0) {
                out.append(new String(Character.toChars(scfgc.read())));
            }
            out.flush();
        } finally {
            out.close();
        }
        return outFile.toURI();
    }    
    
    // -------------------------------------------------------------------------

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
        InputStream strl = CEC.runSTRL(strlFile);
        InputStream strlxml = CEC.runSTRLXML(strl);
        InputStream expandmodule = CEC.runEXPANDMODULE(strlxml);
        InputStream dismantle = CEC.runDISMANTLE(expandmodule);
        InputStream astgrc = CEC.runASTGRC(dismantle);
        InputStream grcopt = CEC.runGRCOPT(astgrc);
        InputStream grcpdg = CEC.runGRCPDG(grcopt);
        InputStream pdgccfg = CEC.runPDGCCFG(grcpdg);
        InputStream eec = CEC.runEEC(pdgccfg);
        InputStream scfgc = CEC.runSCFGC(eec);
        return runCODEGEN(scfgc, outFile);
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the default out file.
     *
     * @return the default out file
     * @throws IOException 
     */
    public static File getDefaultOutFile() throws IOException {
    	File outFile = File.createTempFile("strl", ".c");
    	return outFile;
    }
    
    // -------------------------------------------------------------------------


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
        return run(strlFile, getDefaultOutFile());
    }

}
