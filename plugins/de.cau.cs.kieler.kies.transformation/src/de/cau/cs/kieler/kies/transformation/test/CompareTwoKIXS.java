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

import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
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
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;

import com.google.inject.Injector;

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
public class CompareTwoKIXS implements IActionDelegate {

    private IFile kixsFile1;
    private IFile kixsFileExp;

    private IWorkspaceRoot workspaceRoot;

    private Injector injector;

    private String times = "";

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {

        IFile temp = kixsFileExp;
        kixsFileExp = kixsFile1;
        kixsFile1 = temp;

        ResourceSet resourceSet = new ResourceSetImpl();
        final URI kixsURI = URI.createPlatformResourceURI(kixsFile1.getFullPath().toString(), true);
        final URI kixsURI2 = URI.createPlatformResourceURI(kixsFileExp.getFullPath().toString(),
                true);

        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspaceRoot = workspace.getRoot();
        System.out.println(kixsFile1);
        IPath strlPath = kixsFile1.getFullPath().removeFileExtension().addFileExtension("strl");
        IFile strlFile = workspaceRoot.getFile(strlPath);
        TransformationUtil.createSyncchartDiagram(kixsFile1);
        TransformationUtil.doInitialEsterelTransformation(strlFile, kixsFile1);
        // TransformationUtil.refreshEditPolicies();

        // Loading models

        try {

            EsterelToSyncChartDataComponent edc = new EsterelToSyncChartDataComponent();

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

            EObject model1 = ModelUtils.load(kixsURI, resourceSet);
            EObject model2 = ModelUtils.load(kixsURI2, resourceSet);

            // SyncChartsOptimizationDataComponent dc = new SyncChartsOptimizationDataComponent();
            //
            // System.out.println(model1);
            // System.out.println(model2);
            //
            // State state = ((Region) model1).getStates().get(0);
            // dc.setRootState(state);
            // dc.initialize();
            //
            // TransformationDescriptor descriptor = dc.getNextTransformation();
            // if (descriptor != null) {
            // System.out.println("Trigger");
            // if (TransformationTrigger.getInstance() != null) {
            // // TransformationTrigger.getInstance().step(dc.getXtendFacade(),
            // // descriptor.getTransformationName(), descriptor.getParameters(),
            // // dc.getDomain());
            // }
            // }
            //
            // TransformationEffect effect = new TransformationEffect(dc.getXtendFacade(),
            // descriptor.getTransformationName(), descriptor.getParameters(), dc.getDomain());
            // effect.execute();

            // 2nd time
            // descriptor = dc.getNextTransformation();
            // effect = new TransformationEffect(dc.getXtendFacade(),
            // descriptor.getTransformationName(), descriptor.getParameters(), dc.getDomain());
            // effect.execute();

            // Matching model elements
            MatchModel match = MatchService.doMatch(model1, model2,
                    Collections.<String, Object> emptyMap());
            // Computing differences
            DiffModel diff = DiffService.doDiff(match, false);

            System.out.println("Differences in " + kixsFile1 + " " + kixsFileExp);
            System.out.println(diff.getDifferences());
            // Merges all differences from model1 to model2
            // List<DiffElement> differences = new ArrayList<DiffElement>(diff.getOwnedElements());
            // MergeService.merge(differences, true);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action, final ISelection selection) {
        action.setEnabled(false);
        if (!(selection instanceof IStructuredSelection) || selection.isEmpty()) {
            return;
        }
        if (((IStructuredSelection) selection).size() == 2) {
            kixsFile1 = (IFile) ((IStructuredSelection) selection).getFirstElement();
            kixsFileExp = (IFile) ((IStructuredSelection) selection).toList().get(1);
        }

        action.setEnabled(true);
    }

    /**
     * @return the currentFile
     */
    public IFile getCurrentFile() {
        return kixsFile1;
    }

}
