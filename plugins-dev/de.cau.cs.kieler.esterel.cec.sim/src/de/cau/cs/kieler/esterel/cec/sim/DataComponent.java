/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.cec.sim;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.esterel.cec.CEC;
import de.cau.cs.kieler.esterel.sim.EsterelSimulationProgressMonitor;
import de.cau.cs.kieler.esterel.sim.EsterelSimulatorDataComponent;

/**
 * The Esterel simulation DataComponent is responsible for <br>
 * <ol>
 * <li>preparing Esterel code for a possibly visualized simulation execution run</li>
 * <li>generating C code with the CEC</li>
 * <li>compiling the C code to an exeutable</li>
 * <li>starting and running the executable stepwise generating inputs and examinating outputs.</li>
 * </ol>
 * <br>
 * 
 * @author cmot, ctr
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-05-31 yellow KI-7
 * 
 */
public class DataComponent extends EsterelSimulatorDataComponent {

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected java.net.URI compileEsterelToC(final URI strlFile, final File outFile,
            final EsterelSimulationProgressMonitor monitor) throws IOException, URISyntaxException {
        monitor.subTask("Reading Esterel file");
        EsterelCECSimPlugin.log("Compile 1" + strlFile.toString() + " , " + outFile.toString());
        java.net.URI inputURI = convertEMFtoJavaURI(strlFile);

        EsterelCECSimPlugin.log("Compile 2" + inputURI.toString());
        InputStream strl = CEC.runSTRL(inputURI);
        EsterelCECSimPlugin.log("Compile 3");
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        EsterelCECSimPlugin.log("Compile 4");
        monitor.subTask("Parsing Esterel file");
        InputStream strlxml = CEC.runSTRLXML(strl);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        EsterelCECSimPlugin.log("Compile 5");
        monitor.subTask("Expanding Esterel file");
        // InputStream expandmodule = CEC.runEXPANDMODULE(strlxml, System.out);
        InputStream expandmodule = CEC.runEXPANDMODULE(strlxml, System.out);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        EsterelCECSimPlugin.log("Compile 6");
        monitor.subTask("Dismantle Esterel file");
        InputStream dismantle = CEC.runDISMANTLE(expandmodule);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        EsterelCECSimPlugin.log("Compile 7");
        monitor.subTask("ASTGRC");
        InputStream astgrc = CEC.runASTGRC(dismantle);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        EsterelCECSimPlugin.log("Compile 8");
        monitor.subTask("GRCOPT");
        InputStream grcopt = CEC.runGRCOPT(astgrc);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        monitor.subTask("GRCPDG");
        InputStream grcpdg = CEC.runGRCPDG(grcopt);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        monitor.subTask("PDGCCFG");
        InputStream pdgccfg = CEC.runPDGCCFG(grcpdg);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        EsterelCECSimPlugin.log("Compile 9");
        monitor.subTask("EEC");
        InputStream eec = CEC.runEEC(pdgccfg);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        monitor.subTask("SCFGC");
        InputStream scfgc = CEC.runSCFGC(eec);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            strl.close();
            return null;
        }
        EsterelCECSimPlugin.log("Compile 10");
        monitor.subTask("Generating C code");
        java.net.URI uri = CEC.runCODEGEN(scfgc, outFile);
        EsterelCECSimPlugin.log("Compile 11" + uri);

        if (benchmark) {
            File currentFile = new File(uri.getPath());
            if (currentFile.exists()) {
                sourceFileSize = currentFile.length();
            }
        }

        monitor.worked(1);
        strl.close();
        return uri;
    }

    
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public File getDefaultOutFile() throws IOException {
        return CEC.getDefaultOutFile();
    }

    // -------------------------------------------------------------------------

}
