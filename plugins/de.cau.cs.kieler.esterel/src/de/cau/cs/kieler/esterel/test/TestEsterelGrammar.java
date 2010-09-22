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
package de.cau.cs.kieler.esterel.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import de.cau.cs.kieler.esterel.EsterelStandaloneSetup;

/**
 * JUnit test for the esterel grammar. Test all available files in the test/ folder. Mark tests that
 * are supposed to succeed with a leading "test-", those that are supposed to fail with a "fail-".
 * For those which should fail give information about the expected failure reason in a ".out" file
 * with the same name.
 * 
 * @author uru
 * 
 */
public class TestEsterelGrammar {

    /** contains test files that are supposed to fail. */
    private File[] filesFail = null;
    /** contains test files that are supposed to pass. */
    private File[] filesTest = null;
    /** contains several other test files. */
    private File[] filesRest = null;
    /** injector for the parser. */
    private Injector injector;

    /**
     * Set up. Create injector, read all available testfiles.
     */
    @Before
    public void setup() {

        injector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
        File dir = new File("tests/");

        // Select only .strl files
        FileFilter fileFilterFail = new FileFilter() {
            public boolean accept(final File file) {
                String ext = getFileExtension(file);
                String start = getFileStart(file);
                return !file.isDirectory() && ext.equals("strl") && start.equals("fail");
            }
        };
        FileFilter fileFilterTest = new FileFilter() {
            public boolean accept(final File file) {
                String ext = getFileExtension(file);
                String start = getFileStart(file);
                return !file.isDirectory() && ext.equals("strl") && start.equals("test");
            }
        };
        FileFilter fileFilterRest = new FileFilter() {
            public boolean accept(final File file) {
                String ext = getFileExtension(file);
                String start = getFileStart(file);
                return !file.isDirectory() && ext.equals("strl")
                        && !(start.equals("test") || start.equals("fail"));
            }
        };
        // fetch those files
        filesFail = dir.listFiles(fileFilterFail);
        filesTest = dir.listFiles(fileFilterTest);
        filesRest = dir.listFiles(fileFilterRest);
    }

    /**
     * test all available files which are supposed to be successful.
     * 
     * @throws Exception
     *             if at least one test failed.
     */
    @Test
    public void testSuccFiles() throws Exception {
        if (filesTest == null) {
            throw new Exception("No files to test!");
        }
        // store errors for each file
        HashMap<String, String> errors = new HashMap<String, String>();
        for (File f : filesTest) {

            // fetch resource and possible errors
            XtextResource resource = parseFile(f);
            if (!resource.getErrors().isEmpty()) {
                String error = "";
                for (Diagnostic d : resource.getErrors()) {
                    error += d.getMessage() + "\n";
                }
                errors.put(f.getName(), error);
            }
            // EObject model = resource.getParseResult().getRootASTElement();
        }

        // print each error in a readable way
        if (errors.size() >= 1) {
            int i = 0;
            for (String name : errors.keySet()) {
                System.out.println(i++ + ". Error in " + name + ":");
                System.out.println(errors.get(name));
                System.out.println("-----------------------------------------------------\n");
            }
            throw new Exception("Of " + filesTest.length + " were " + errors.size() + " erroneous");
        }
    }

    /**
     * tests all available files that are supposed to fail. If they do not fail the expected error
     * is printed. (stored in .out files)
     * 
     * @throws Exception
     *             if at least one test succeeds.
     */
    @Test
    public void testFailFiles() throws Exception {
        if (filesFail == null) {
            throw new Exception("No files to test!");
        }
        // store all files that succeed
        HashMap<String, String> errors = new HashMap<String, String>();
        for (File f : filesFail) {
            // fetch resource and possible errors
            XtextResource resource = parseFile(f);
            if (resource.getErrors().isEmpty()) {
                String error = "";
                // read information about the expected error.
                FileReader fiss = new FileReader(f.getPath().substring(0,
                        f.getPath().lastIndexOf("."))
                        + ".out");
                BufferedReader in = new BufferedReader(fiss);
                String str = "";
                while ((str = in.readLine()) != null) {
                    error += str + "\n";
                }
                errors.put(f.getName(), "No error found but there is one:\n" + error);
            }
            // EObject model = resource.getParseResult().getRootASTElement();
        }

        // print readable information
        if (errors.size() >= 1) {
            int i = 0;
            for (String name : errors.keySet()) {
                System.out.println(i++ + ". Error in " + name + ":");
                System.out.println(errors.get(name));
                System.out.println();
                System.out.println("-----------------------------------------------------\n");
            }
            throw new Exception("Of " + filesFail.length + " were " + errors.size() + " erroneous");
        }

    }

    /**
     * Parse the given .strl file and return the parsed resource.
     * 
     * @param f
     * @return
     * @throws Exception
     */
    private XtextResource parseFile(final File f) throws Exception {
        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        URI uri = URI.createFileURI("test/test.strl"); // uri of your resource, may be fictional
        XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        rs.getResources().add(resource);

        // we are sure f exists, as we read the path automatically
        FileInputStream fis = new FileInputStream(f);
        resource.load(fis, null);
        EcoreUtil.resolveAll(resource);
        return resource;
    }

    /**
     * returns the file's extension without the leading dot. e.g. for "test.strl" the return is
     * "strl".
     * 
     * @param file
     * @return
     */
    private String getFileExtension(final File file) {
        String filename = file.getName();
        String ext = (filename.lastIndexOf(".") == -1) ? "" : filename.substring(
                filename.lastIndexOf(".") + 1, filename.length());
        return ext;
    }

    /**
     * returns the file's leading description prior to a hyphen. e.g. for "fail-test.str" the return
     * is "fail".
     * 
     * @param file
     * @return
     */
    private String getFileStart(final File file) {
        String filename = file.getName();
        String start = (filename.indexOf("-") == -1 ? "" : filename.substring(0,
                filename.indexOf("-")));
        return start;
    }

    /**
     * 
     */
    public TestEsterelGrammar() {
        try {
            setup();
//            testFailFiles();
            testSuccFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TestEsterelGrammar();
    }

}
