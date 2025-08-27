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

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;

/**
 * The test plugin for regression testing the Esterel to SCL transformation.
 * 
 * @author krat
 * 
 *         When initializing this class, all .strl files in the test data folder should be
 *         transformed to SCG.
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
//        final Bundle bundle = Platform.getBundle(getPluginId());
//        Enumeration<URL> allBundleFilesUrl =
//                bundle.findEntries(getBundleTestPath().toString(), "*.strl", false);
//        ResourceSet resourceSet = new ResourceSetImpl();
//
//        // Transform every *.strl file in the test folder and save it to *.scg
//        while (allBundleFilesUrl.hasMoreElements()) {
//            URL bundleFileUrl = allBundleFilesUrl.nextElement();
//
//            // Load the *.strl file
//            String path = new File("").getAbsolutePath();
//            URI fileURI = null;
//
//            try {
//                fileURI = URI.createFileURI(path + bundleFileUrl.toURI().getPath());
//            } catch (URISyntaxException e1) {
//                // TODO Auto-generated catch block
//                e1.printStackTrace();
//            }
//
//            Resource resource = resourceSet.getResource(fileURI, true);
//            Program esterelProgram = (Program) resource.getContents().get(0);
//
//            // Transform to SCL and to SCG
//            de.cau.cs.kieler.scl.scl.SCLProgram sclProgram =
//                    (de.cau.cs.kieler.scl.scl.SCLProgram) KielerCompiler.compile("ESTERELTOSCL_OPT",
//                            esterelProgram, false, false).getEObject();
//            SCGraph scg =
//                    (SCGraph) KielerCompiler.compile("SCLTOSCG", sclProgram, false, false)
//                            .getEObject();
//
//            // Save as *.scg
//            Resource saveResource =
//                    resourceSet.createResource(fileURI.trimFileExtension().appendFileExtension(
//                            "scg"));
//            saveResource.getContents().add(scg);
//            try {
//                saveResource.save(Collections.EMPTY_MAP);
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }

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
        return "strl";
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
