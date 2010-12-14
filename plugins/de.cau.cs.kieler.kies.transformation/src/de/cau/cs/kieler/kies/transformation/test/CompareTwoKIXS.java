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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;

import com.google.inject.Injector;

import de.cau.cs.kieler.kies.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.kies.transformation.impl.SyncChartsOptimizationDataComponent;
import de.cau.cs.kieler.kies.transformation.kivi.TransformationEffect;
import de.cau.cs.kieler.kies.transformation.kivi.TransformationTrigger;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;

/**
 * @author uru
 * 
 */
public class CompareTwoKIXS implements IActionDelegate {

    private IFile kixsFile1;
    private IFile kixsFile2;

    private IWorkspaceRoot workspaceRoot;

    private Injector injector;

    private String times = "";

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {

        ResourceSet resourceSet = new ResourceSetImpl();
        final URI kixsURI = URI.createPlatformResourceURI(kixsFile1.getFullPath().toString(), true);
        final URI kixsURI2 = URI
                .createPlatformResourceURI(kixsFile2.getFullPath().toString(), true);

        // Loading models

        try {
            EObject model1 = ModelUtils.load(kixsURI, resourceSet);
            EObject model2 = ModelUtils.load(kixsURI2, resourceSet);

            SyncChartsOptimizationDataComponent dc = new SyncChartsOptimizationDataComponent();

            System.out.println(model1);
            System.out.println(model2);

            State state = ((Region) model1).getStates().get(0);
            dc.setRootState(state);
            dc.initialize();

            TransformationDescriptor descriptor = dc.getNextTransformation();
            if (descriptor != null) {
                System.out.println("Trigger");
                if (TransformationTrigger.getInstance() != null) {
//                    TransformationTrigger.getInstance().step(dc.getXtendFacade(),
//                            descriptor.getTransformationName(), descriptor.getParameters(),
//                            dc.getDomain());
                }
            }

            TransformationEffect effect = new TransformationEffect(dc.getXtendFacade(),
                    descriptor.getTransformationName(), descriptor.getParameters(), dc.getDomain());
            effect.execute();

            // 2nd time
//            descriptor = dc.getNextTransformation();
//            effect = new TransformationEffect(dc.getXtendFacade(),
//                    descriptor.getTransformationName(), descriptor.getParameters(), dc.getDomain());
//            effect.execute();

            // Matching model elements
            MatchModel match = MatchService.doMatch(model1, model2,
                    Collections.<String, Object> emptyMap());
            // Computing differences
            DiffModel diff = DiffService.doDiff(match, false);

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
            kixsFile2 = (IFile) ((IStructuredSelection) selection).toList().get(1);
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
