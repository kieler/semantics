/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
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
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

/**
 * The test plugin for regression testing the Esterel to SCL transformation.
 * 
 * @author krat
 * 
 *         When initializing this class, all .strl files in the test data folder should be
 *         transformed to SCG. It would also be useful to provide some kind of eso file manipulation
 *         to delete valued signal outputs.
 * 
 */
public class EsterelToSclAutomatedTests extends KiemAutomatedJUnitTest {

    /**
     * Instantiates a new simulation test.
     * 
     * @param esoFile
     *            the ESO file
     */
    public EsterelToSclAutomatedTests(final IPath esoFile) {
        super(esoFile);
    }

    /**
     * Generate SCG from Esterel files which are in the test folder
     */
    public void kiemAutomatedJUnitTestInitialization() {
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
            }

            Resource resource = resourceSet.getResource(fileURI, true);
            Program esterelProgram = (Program) resource.getContents().get(0);

            // Transform to SCL and to SCG
            de.cau.cs.kieler.scl.scl.Program sclProgram =
                    (de.cau.cs.kieler.scl.scl.Program) KielerCompiler.compile("ESTERELTOSCL",
                            esterelProgram, false, false).getEObject();
            SCGraph scg =
                    (SCGraph) KielerCompiler.compile("SCLTOSCG", sclProgram, false, false)
                            .getEObject();

            // Save as *.scg
            Resource saveResource =
                    resourceSet.createResource(fileURI.trimFileExtension().appendFileExtension(
                            "scg"));
            saveResource.getContents().add(scg);
            try {
                saveResource.save(Collections.EMPTY_MAP);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        super.kiemAutomatedJUnitTestInitialization();
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
        return new Path("testdata");
    }

    /**
     * {@inheritDoc}
     */
    protected String getModelFileExtension() {
        return "scg";
    }

    /**
     * {@inheritDoc}
     */
    protected String getTemporaryWorkspaceFolderName() {
        return "test-esterelToScg";
    }

    /**
     * {@inheritDoc}
     */
    protected String getExecutionFileName() {
        return "sccharts_c_validation_headless.execution";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IPath getExternalRelativeTestPath() {
        return null;
    }
}
