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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scl.scl.SCLProgram;
import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;
import de.cau.cs.kieler.esterel.cec.*;
import de.cau.cs.kieler.esterel.scl.*;
import de.cau.cs.kieler.esterel.scl.transformations.EsterelToSclExtensions;

/**
 * Compiles every .strl file in test folder and returns a list of all failing files
 * 
 * @author krat
 * 
 * 
 */
public class SortOutFailing extends KiemAutomatedJUnitTest {

    /**
     * @param esoFile
     */
    public SortOutFailing(IPath esoFile) {
        super(esoFile);
        // TODO Auto-generated constructor stub
    }

    /**
     * Generate SCG from Esterel files which are in the test folder
     */
    public void kiemAutomatedJUnitTestInitialization() {
        String newline = System.getProperty("line.separator");
        String outputString = new String();
        String evaluation = new String();
        long startTime;
        long endTime;
        long timeElapsed;
        
        final Bundle bundle = Platform.getBundle(getPluginId());
        Enumeration<URL> allBundleFilesUrl =
                bundle.findEntries(getBundleTestPath().toString(), "*.strl", false);
        ResourceSet resourceSet = new ResourceSetImpl();

        // Transform every *.strl file in the test folder and save it to *.scg
        while (allBundleFilesUrl.hasMoreElements()) {
            URL bundleFileUrl = allBundleFilesUrl.nextElement();
            // Load the *.strl file
            String path = new File("").getAbsolutePath();
            

            // //////////////////////////////
            // Esterel to Scl to target code
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
                try {
                    startTime = System.nanoTime();
                SCLProgram sclProgram =
                        (SCLProgram) KielerCompiler.compile("ESTERELTOSCL_OPT", esterelProgram,
                                false, false).getEObject();
                endTime = System.nanoTime();
                timeElapsed = endTime - startTime;
                evaluation += (new EsterelToSclExtensions()).countStatements(esterelProgram) + "," + timeElapsed + newline;
                }
                catch (Exception e) { outputString += fileURI + newline; }
        }
        System.out.println(outputString);
        System.out.println(evaluation);

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
        return new Path("allTests");
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
        return "tests";
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
