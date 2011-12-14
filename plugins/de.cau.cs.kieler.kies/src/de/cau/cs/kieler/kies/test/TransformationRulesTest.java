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

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;

import de.cau.cs.kieler.kies.util.TransformationUtil;
import de.cau.cs.kieler.kies.util.TransformationUtil.TransformationType;

/**
 * This JUnit tests serves as a kind of regression test for Esterel to SyncChart transformations. It
 * executes several tests taking an esterel file and an expected synccharts sematic model (kixs).
 * The esterel file is transformed and the resulting syncchart is compared to the expected one using
 * EMFCompare.
 * 
 * 
 * Keep in mind that this is a JUnit plugin test, hence it has its own workspace but the test files
 * are kept in the original workspace. For this reason you currently have to define your workspace
 * location relative to the junit workspace.
 * 
 * @author uru
 */
public class TransformationRulesTest {

    // FIXME
    private String pathToWS = "/../HELIOS/";
    private IWorkspaceRoot workspaceRoot;
    private IProject project;

    // used for optimization
    private Map<String, Boolean> optimizationVars;

    /**
     * get the workspace root and open a project to work with.
     * 
     * @throws CoreException
     *             if anything goes wrong creating the project.
     */
    @Before
    public void setup() throws CoreException {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspaceRoot = workspace.getRoot();
        project = workspaceRoot.getProject("Testing Project");

        if (!project.exists()) {
            project.create(null);
        }
        if (!project.isOpen()) {
            project.open(null);
        }
        final int numberOfProps = 9;
        optimizationVars = Maps.newHashMap();
        for (int i = 0; i < numberOfProps; i++) {
            optimizationVars.put("rule" + i, false);
        }
    }

    // javadoc just lengthens this file and does not increase the understanding of these methods
    // CHECKSTYLEOFF JavadocMethod
    @Test
    public void testNothing() throws Exception {
        performTransformation("02-nothing.strl", "_exp");
    }

    @Test
    public void testHalt() throws Exception {
        performTransformation("03-halt.strl", "_exp");
    }

    @Test
    public void testPause() throws Exception {
        performTransformation("04-pause.strl", "_exp");
    }

    @Test
    public void testAbort() throws Exception {
        performTransformation("05-abort.strl", "_exp");
    }

    @Test
    public void testAssign() throws Exception {
        performTransformation("07-assign.strl", "_exp");
    }

    @Test
    public void testDoupto() throws Exception {
        performTransformation("10-doupto.strl", "_exp");
    }

    @Test
    public void testDowatching() throws Exception {
        performTransformation("11-dowatching.strl", "_exp");
    }

    @Test
    public void testEmit() throws Exception {
        performTransformation("12-emit.strl", "_exp");
    }

    @Test
    public void testEvery() throws Exception {
        performTransformation("13-every.strl", "_exp");
    }

    @Test
    public void testIf() throws Exception {
        performTransformation("14-if.strl", "_exp");
    }

    @Test
    public void testLocalsignal() throws Exception {
        performTransformation("15-localsignal.strl", "_exp");
    }

    @Test
    public void testLocalvariable() throws Exception {
        performTransformation("16-localvariable.strl", "_exp");
    }

    @Test
    public void testLoop() throws Exception {
        performTransformation("17-loop.strl", "_exp");
    }

    @Test
    public void testLoopeach() throws Exception {
        performTransformation("18-loopeach.strl", "_exp");
    }

    @Test
    public void testParallel() throws Exception {
        performTransformation("19-parallel.strl", "_exp");
    }

    @Test
    public void testPresent() throws Exception {
        performTransformation("20-present.strl", "_exp");
    }

    @Test
    public void testCall() throws Exception {
        performTransformation("22-call.strl", "_exp");
    }

    @Test
    public void testSequence() throws Exception {
        performTransformation("23-sequence.strl", "_exp");
    }

    @Test
    public void testSuspend() throws Exception {
        performTransformation("24-suspend.strl", "_exp");
    }

    @Test
    public void testSustain() throws Exception {
        performTransformation("25-sustain.strl", "_exp");
    }

    @Test
    public void testTrap() throws Exception {
        performTransformation("26-trap.strl", "_exp");
    }

    @Test
    public void testExit() throws Exception {
        performTransformation("27-exit.strl", "_exp");
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////
    // Optimization tests
    @Test
    public void testOptRule1() throws Exception {
        performOptimization("rule1.kixs", "_exp");
    }

    @Test
    public void testOptRule2() throws Exception {
        performOptimization("rule2.kixs", "_exp");
    }

    @Test
    public void testOptRule3() throws Exception {
        performOptimization("rule3.kixs", "_exp");
    }

    @Test
    public void testOptRule4() throws Exception {
        performOptimization("rule4.kixs", "_exp");
    }

    @Test
    public void testOptRule5() throws Exception {
        performOptimization("rule5.kixs", "_exp");
    }
    
    @Test
    public void testOptRule6() throws Exception {
        performOptimization("rule6.kixs", "_exp");
    }

    @Test
    public void testOptRule7() throws Exception {
        performOptimization("rule7.kixs", "_exp");
    }

    @Test
    public void testOptRule8() throws Exception {
        performOptimization("rule8.kixs", "_exp");
    }

    // CHECKSTYLEON JavadocMethod

    /**
     * Performs the transformation an comparison of the passed file.
     * 
     * @param strlName
     *            name of the esterel file to test
     * @param expectedSuffix
     *            suffix of the expected .kixs file (e.g. "_exp")
     * @throws Exception
     *             if test fails
     */
    private void performTransformation(final String strlName, final String expectedSuffix)
            throws Exception {
        // create links to the testfiles in the test project folder
        IPath path = new Path(workspaceRoot.getLocation() + pathToWS
                + "de.cau.cs.kieler.kies.transformation/tests/transformation/" + strlName);
        IPath pathExp = new Path(workspaceRoot.getLocation() + pathToWS
                + "de.cau.cs.kieler.kies.transformation/tests/transformation/"
                + strlName.substring(0, strlName.lastIndexOf('.')) + expectedSuffix + ".kixs");
        IFile strl = project.getFile(path.lastSegment());
        IFile kixsExp = project.getFile(pathExp.lastSegment());
        // create the actual links
        strl.createLink(path, IResource.NONE, null);
        kixsExp.createLink(pathExp, IResource.NONE, null);

        // transform and compare
        IFile kixs = transformToSyncChart(strl);
        compare(kixs, kixsExp);
    }

    private IFile transformToSyncChart(final IFile strlFile) {
        IPath kixsPath = strlFile.getFullPath().removeFileExtension().addFileExtension("kixs");
        IFile kixsFile = workspaceRoot.getFile(kixsPath);

        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strlFile, kixsFile);
        TransformationUtil.performHeadlessTransformation(kixsFile, TransformationType.E2S);

        return kixsFile;
    }

    /**
     * Performs the transformation an comparison of the passed file.
     * 
     * @param kixsName
     *            name of the synccharts diagram to optimize
     * @param expectedSuffix
     *            suffix of the expected .kixs file (e.g. "_exp")
     * @throws Exception
     *             if test fails
     */
    private void performOptimization(final String kixsName, final String expectedSuffix)
            throws Exception {
        // create links to the testfiles in the test project folder
        IPath path = new Path(workspaceRoot.getLocation() + pathToWS
                + "de.cau.cs.kieler.kies.transformation/tests/optimization/" + kixsName);
        IPath pathExp = new Path(workspaceRoot.getLocation() + pathToWS
                + "de.cau.cs.kieler.kies.transformation/tests/optimization/"
                + kixsName.substring(0, kixsName.lastIndexOf('.')) + expectedSuffix + ".kixs");
        IFile kixsOrig = project.getFile(path.lastSegment());
        IFile kixsExp = project.getFile(pathExp.lastSegment());
        // create the actual links
        kixsOrig.createLink(path, IResource.NONE, null);
        kixsExp.createLink(pathExp, IResource.NONE, null);

        // transform and compare
        IFile kixs = optimizeSyncChart(kixsOrig);
        compare(kixs, kixsExp);
    }

    private IFile optimizeSyncChart(final IFile kixsFile) {
        final int numberOfProps = 9;
        // set up global vars. just the tested rule should be applied.
        for (int i = 1; i < numberOfProps; i++) {
            String rule = kixsFile.getName().substring(0, kixsFile.getName().lastIndexOf("."));
            boolean value = (rule.equals("rule" + i)) ? true : false;
            optimizationVars.put("rule" + i, value);
            System.out.println(i + " " + value + " " + kixsFile);
        }

        TransformationUtil.performHeadlessTransformation(kixsFile, TransformationType.SYNC_OPT,
                optimizationVars);
        return kixsFile;
    }

    /**
     * compares the two passed files by using EMF Compare.
     */
    private void compare(final IFile transformed, final IFile expected) throws Exception {
        final URI kixsURI = URI.createPlatformResourceURI(transformed.getFullPath().toString(),
                true);
        final URI kixsURI2 = URI.createPlatformResourceURI(expected.getFullPath().toString(), true);

        try {

            ResourceSet resourceSet = new ResourceSetImpl();
            EObject model1 = ModelUtils.load(kixsURI, resourceSet);
            EObject model2 = ModelUtils.load(kixsURI2, resourceSet);

            // Matching model elements
            Map<String, Object> emap = Collections.emptyMap();
            MatchModel match = MatchService.doMatch(model1, model2, emap);
            // Computing differences
            DiffModel diff = DiffService.doDiff(match, false);

            System.out.println("Differences in " + transformed + " " + expected);
            System.out.println(diff.getDifferences());
            if (!diff.getDifferences().isEmpty()) {
                throw new Exception(diff.getDifferences().toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
