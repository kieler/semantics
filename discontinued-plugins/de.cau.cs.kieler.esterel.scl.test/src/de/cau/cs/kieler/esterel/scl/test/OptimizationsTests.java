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
package de.cau.cs.kieler.esterel.scl.test;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.scl.transformations.EsterelToSclExtensions;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.scl.scl.SCLProgram;
import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

/**
 * The test plugin for regression testing the Esterel to SCL transformation.
 * 
 * @author krat
 * 
 *         When initializing this class, all .strl files in the test data folder should be
 *         transformed to SCG. Test for compilationerrors
 * 
 */
public class OptimizationsTests extends KiemAutomatedJUnitTest {

    /**
     * @param esoFile
     */
    public OptimizationsTests(IPath esoFile) {
        super(esoFile);
        // TODO Auto-generated constructor stub
    }

    /**
     * Generate SCG from Esterel files which are in the test folder
     */
    public void kiemAutomatedJUnitTestInitialization() {
        String newline = System.getProperty("line.separator");
        String outputString = new String();
        outputString += "Test Case,SCL,CEC" + newline;
        final Bundle bundle = Platform.getBundle(getPluginId());
        Enumeration<URL> allBundleFilesUrl =
                bundle.findEntries(getBundleTestPath().toString(), "*.strl", false);
        ResourceSet resourceSet = new ResourceSetImpl();

        // Transform every *.strl file in the test folder and save it to *.scg
        while (allBundleFilesUrl.hasMoreElements()) {
            URL bundleFileUrl = allBundleFilesUrl.nextElement();
            // Load the *.strl file
            String path = new File("").getAbsolutePath();
            
                URI fileURI = null;

                try {
                    fileURI = URI.createFileURI(path + bundleFileUrl.toURI().getPath());
                } catch (URISyntaxException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                    System.out.println(bundleFileUrl.toString());
                    return;
                }

                Resource resource = resourceSet.getResource(fileURI, true);
                Program esterelProgram = (Program) resource.getContents().get(0);

                // Transform to SCL and to SCG
                KielerCompilerContext contextSCL = new KielerCompilerContext("ESTERELTOSCL", esterelProgram);
                SCLProgram sclProgram = (SCLProgram) KielerCompiler.compile(contextSCL).getEObject();
                
                KielerCompilerContext contextOpt = new KielerCompilerContext("ESTERELTOSCL_OPT", esterelProgram);
                SCLProgram sclProgramOpt = (SCLProgram) KielerCompiler.compile(contextOpt).getEObject();

            outputString += esterelProgram.getModules().get(0).getName() + ",";
            outputString += (new EsterelToSclExtensions()).countStatements(sclProgram) + ",";
            outputString += (new EsterelToSclExtensions()).countStatements(sclProgramOpt) + ",";
            outputString += (new EsterelToSclExtensions()).countStatements(esterelProgram) + newline;
        }
        System.out.println(outputString);

    }

    /**
     * {@inheritDoc}
     */
    protected String getPluginId() {
        return "de.cau.cs.kieler.esterel.scl.test";
    }

    /**
     * {@inheritDoc}
     */
    protected IPath getBundleTestPath() {
        return new Path("evalTests");
    }

    /**
     * {@inheritDoc}
     */
    protected String getModelFileExtension() {
        return "null";
    }

    /**
     * {@inheritDoc}
     */
    protected String getTemporaryWorkspaceFolderName() {
        return "test-Benchmark";
    }

    /**
     * {@inheritDoc}
     */
    protected String getExecutionFileName() {
        return "esterel_scg_kart.execution";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IPath getExternalRelativeTestPath() {
        return null;
    }
}
