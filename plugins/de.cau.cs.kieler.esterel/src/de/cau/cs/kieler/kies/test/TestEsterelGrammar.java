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
package de.cau.cs.kieler.kies.test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor.TreeConstructionDiagnostic;
import org.eclipse.xtext.parsetree.reconstr.Serializer;
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator.InvalidConcreteSyntaxException;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.kies.EsterelStandaloneSetup;

/**
 * JUnit test for the esterel grammar. Test all available files in the test/ folder. Mark tests that
 * are supposed to succeed with a leading "test-", those that are supposed to fail with a "fail-".
 * For those which should fail give information about the expected failure reason in a ".out" file
 * with the same name.
 * 
 * @author uru
 * 
 */
public class TestEsterelGrammar { //CHSCH: extends AbstractXtextTests {

    /** in ms. */
    private static final int SERIALIZATION_TIME_LIMIT = 4000;

    private boolean serialize = true;

    /** contains test files that are supposed to fail. */
    private File[] filesFail = null;
    /** contains test files that are supposed to pass. */
    private File[] filesTest = null;
    /** contains several other test files. */
    @SuppressWarnings("unused")
    private File[] filesRest = null;
    /** injector for the parser. */
    private Injector injector;

    private String times = "";

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

            String error = "";
            // parse
            XtextResource resource = parseFile(f);
            // fetch resource and possible errors
            if (!resource.getErrors().isEmpty()) {
                error += "### Parse: \n";
                for (Diagnostic d : resource.getErrors()) {
                    error += d.getMessage() + "\n";
                }
            }
            // serialize
            if (serialize) {
                Exception ex = serializeResource(resource);
                if (ex != null) {
                    error += "### Serialization: \n";
                    if (ex instanceof InvalidConcreteSyntaxException) {
                        error += ((InvalidConcreteSyntaxException) ex).toString();
                    } else if (ex instanceof XtextSerializationException) {
                        if (((XtextSerializationException) ex).getReport() != null) {
                            for (TreeConstructionDiagnostic d : ((XtextSerializationException) ex)
                                    .getReport().getDiagnostics()) {
                                error += d.getLikelyErrorReasons() + "\n";
                            }
                        }
                    }
                }
            }
            if (!error.equals("")) {
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

        long start = System.currentTimeMillis();
        final XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        rs.getResources().add(resource);
        long end = System.currentTimeMillis();
        times += f.getName() + " Parse: " + (end - start) + "ms";

        // we are sure f exists, as we read the path automatically
        FileInputStream fis = new FileInputStream(f);
        resource.load(fis, null);
        EcoreUtil.resolveAll(resource);

        return resource;
    }

    /**
     * serialize the passed resource.
     * 
     * @param resource
     * @return possible thrown exception either XtextSerializationException or
     *         InvalidConcreteSyntaxException
     * @throws Exception
     */
    @SuppressWarnings("deprecation")
    private Exception serializeResource(final XtextResource resource) throws Exception {

        long start = System.currentTimeMillis();
        // serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final OutputStreamWriter osw = new OutputStreamWriter(baos);

        final Maybe<Exception> possibleException = new Maybe<Exception>();
        Runnable r = new Runnable() {

            public void run() {
                try {
                    Serializer serializerUtil = injector.getInstance(Serializer.class);
                    serializerUtil.serialize(resource.getContents().get(0), osw,
                            SaveOptions.defaultOptions());
                } catch (XtextSerializationException e) {
                    possibleException.set(e);
                } catch (InvalidConcreteSyntaxException icse) {
                    possibleException.set(icse);
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        try {
            t.join(SERIALIZATION_TIME_LIMIT);
            long end = System.currentTimeMillis();
            if (t.isAlive()) {
                // FIXME ugly hack to preempt eternal serialization

                t.suspend();
                times += " Serialize: exceeded time limit\n";
            } else {
                times += " Serialize: " + (end - start) + "ms\n";
            }

        } catch (Exception e) {
            System.out.println("Some Thread error");
        }
        return possibleException.get();
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
            // testFailFiles();
            testSuccFiles();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println(times);

            // needed due to thread hack
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TestEsterelGrammar();
    }

}
