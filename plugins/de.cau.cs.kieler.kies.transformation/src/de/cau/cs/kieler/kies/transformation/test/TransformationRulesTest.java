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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
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

import de.cau.cs.kieler.kies.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.kies.transformation.impl.EsterelToSyncChartDataComponent;
import de.cau.cs.kieler.kies.transformation.kivi.TransformationEffect;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.listener.SyncchartsContentUtil;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * @author uru
 * 
 */
public class TransformationRulesTest {

    private IWorkspaceRoot workspaceRoot;

    @Before
    public void setup() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspaceRoot = workspace.getRoot();
    }

    @Test
    public void testNothing() throws Exception {

        
        IProject project = workspaceRoot.getProject("External Files");
        if (!project.exists())
            project.create(null);
        if (!project.isOpen())
            project.open(null);
       
        
        IPath path = new Path(
                "E:/Uni WS10/Bachelor Thesis/eclipseWS3/de.cau.cs.kieler.kies.transformation/tests/transformation/02-nothing.strl");
        IPath path_exp = new Path(
                "E:/Uni WS10/Bachelor Thesis/eclipseWS3/de.cau.cs.kieler.kies.transformation/tests/transformation/02-nothing_exp.kixs");
        IFile strl = project.getFile(path.lastSegment());
        IFile kixs_exp = project.getFile(path_exp.lastSegment());
        strl.createLink(path, IResource.NONE, null);
        kixs_exp.createLink(path_exp, IResource.NONE, null);

        IFile kixs = transformToSyncchart(strl);

        compare(kixs, kixs_exp);
    }
    
    @Test
    public void testHalt() throws Exception {

        
        IProject project = workspaceRoot.getProject("External Files");
        if (!project.exists())
            project.create(null);
        if (!project.isOpen())
            project.open(null);
       
        
        IPath path = new Path(
                "E:/Uni WS10/Bachelor Thesis/eclipseWS3/de.cau.cs.kieler.kies.transformation/tests/transformation/03-halt.strl");
        IPath path_exp = new Path(
                "E:/Uni WS10/Bachelor Thesis/eclipseWS3/de.cau.cs.kieler.kies.transformation/tests/transformation/03-halt_exp.kixs");
        IFile strl = project.getFile(path.lastSegment());
        IFile kixs_exp = project.getFile(path_exp.lastSegment());
        strl.createLink(path, IResource.NONE, null);
        kixs_exp.createLink(path_exp, IResource.NONE, null);

        IFile kixs = transformToSyncchart(strl);

        compare(kixs, kixs_exp);
    }
    


    private IFile transformToSyncchart(IFile strlFile) {
        IPath kixsPath = strlFile.getFullPath().removeFileExtension().addFileExtension("kixs");
        IFile kixsFile = workspaceRoot.getFile(kixsPath);
        final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);

        TransformationUtil.createSyncchartDiagram(kixsFile, strlFile.getName());
        TransformationUtil.doInitialEsterelTransformation(strlFile, kixsFile);

        try {
            EsterelToSyncChartDataComponent edc = new EsterelToSyncChartDataComponent();

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
            TransformationEffect effect = new TransformationEffect(edc.getXtendFacade(),
                    td.getTransformationName(), td.getParameters(), ted);
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
            MatchModel match = MatchService.doMatch(model1, model2,
                    Collections.<String, Object> emptyMap());
            // Computing differences
            DiffModel diff = DiffService.doDiff(match, false);

            System.out.println("Differences in " + transformed + " " + expected);
            System.out.println(diff.getDifferences());
            if (!diff.getDifferences().isEmpty()) {
                throw new Exception("foo is not the same as bar");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
