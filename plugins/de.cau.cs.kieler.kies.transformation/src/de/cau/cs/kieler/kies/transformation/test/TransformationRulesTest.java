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
package de.cau.cs.kieler.kies.transformation.test;

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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.junit.Before;
import org.junit.Test;

import de.cau.cs.kieler.core.model.effects.TransformationEffect;
import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.m2m.XtendTransformationContext;
import de.cau.cs.kieler.kies.transformation.EsterelToSyncChartDataComponent;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.listener.SyncchartsContentUtil;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

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
    private String pathToWS = "/../eclipse WS/";
    private IWorkspaceRoot workspaceRoot;
    private IProject project;

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

        // always create a clean project.
        // if (project.exists()) {
        // project.delete(true, null);
        // }
        // project.create(null);
        if (!project.exists()) {
            project.create(null);
        }
        if (!project.isOpen()) {
            project.open(null);
        }
    }

    // javadoc just lengthens this file and does not increase the understanding of these methods
    // CHECKSTYLEOFF JavadocMethod
    @Test
    public void testNothing() throws Exception {
        performTest("02-nothing.strl", "_exp");
    }

    @Test
    public void testHalt() throws Exception {
        performTest("03-halt.strl", "_exp");
    }

    @Test
    public void testPause() throws Exception {
        performTest("04-pause.strl", "_exp");
    }

    @Test
    public void testAbort() throws Exception {
        performTest("05-abort.strl", "_exp");
    }

    @Test
    public void testAssign() throws Exception {
        performTest("07-assign.strl", "_exp");
    }

    @Test
    public void testAwait() throws Exception {
        performTest("08-await.strl", "_exp");
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
    private void performTest(final String strlName, final String expectedSuffix) throws Exception {
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
        IFile kixs = transformToSyncchart(strl);
        compare(kixs, kixsExp);
    }

    private IFile transformToSyncchart(final IFile strlFile) {
        IPath kixsPath = strlFile.getFullPath().removeFileExtension().addFileExtension("kixs");
        IFile kixsFile = workspaceRoot.getFile(kixsPath);
        final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);

        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strlFile, kixsFile);

        try {
            EsterelToSyncChartDataComponent edc = new EsterelToSyncChartDataComponent();
            edc.setHeadless(true);

            ResourceSet resourceSet = new ResourceSetImpl();
            Resource resource = resourceSet.getResource(kixsURI, true);
            Region rootRegion = (Region) resource.getContents().get(0);
            State root = rootRegion.getStates().get(0);

            edc.initialize();
            edc.setRootState(root);

            TransformationDescriptor td = edc.getNextTransformation();

            TransactionalEditingDomain ted = TransactionalEditingDomain.Factory.INSTANCE
                    .createEditingDomain(resourceSet);
            SyncchartsContentUtil.addTriggerListeners(ted);
            ITransformationContext context = new XtendTransformationContext(edc.getXtendFacade(),
                    ted);
            TransformationEffect effect = new TransformationEffect(context, td);
            effect.execute();
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.SERIALIZE);
            ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                    ActionLabelProcessorWrapper.PARSE);

            resource.save(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kixsFile;
    }

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
