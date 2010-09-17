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
package de.cau.cs.kieler.synccharts.synchronizer.kitsView;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.synchronizer.InvokeGMFEditorSynchronizationRunnable;
import de.cau.cs.kieler.synccharts.synchronizer.KitsSynchronizeLinker;
import de.cau.cs.kieler.synccharts.synchronizer.ModelSynchronizer;
import de.cau.cs.kieler.synccharts.synchronizer.SyncchartsSynchronizerPlugin;
import de.cau.cs.kieler.synccharts.text.actions.scoping.ActionsScopeProvider;
import de.cau.cs.kieler.synccharts.text.kits.KitsResource;
import de.cau.cs.kieler.synccharts.text.kits.scoping.KitsEmbeddedScopeProvider;

public class SyncChartSynchronizerJob extends Job implements ISelectionListener {

    private SyncchartsDiagramEditor passiveEditor = null;
    private static Map<String, Object> matchOptions = new HashMap<String, Object>();

    private EmbeddedXtextEditor kitsEditor;
    private EmbeddedXtextEditor actionsEditor;
    
    private EmbeddedXtextEditor lastActiveEditor;
    
    private EReference feature;
    
    private KitsResource dummyResource;

    private Region rootRegionCopy;

    private State container;
    
    private State target;

    private int index;

    public SyncChartSynchronizerJob(String name, EmbeddedXtextEditor theKitsEditor,
            EmbeddedXtextEditor theActionsEditor) {
        super(name);
        kitsEditor = theKitsEditor;
        actionsEditor = theActionsEditor;

        matchOptions.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);

        dummyResource = (KitsResource) kitsEditor.createResource();

        this.addJobChangeListener(new JobChangeAdapter() {

            @SuppressWarnings("unchecked")
            @Override
            public void done(IJobChangeEvent event) {
                if (event.getResult().equals(Status.CANCEL_STATUS)) {
                    return;
                }
                if (container != null) {
                    ((EList<EObject>) container.eGet(feature)).remove(index);
                }
            }
        });

    }

    private EObject leftElement;

    @Override
    protected IStatus run(IProgressMonitor monitor) {

        lastActiveEditor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {

            @Override
            @SuppressWarnings("unchecked")
            public synchronized void process(XtextResource state) throws Exception {
                    
                EObject copy = null;
                if (!state.getContents().isEmpty()) {
                    copy = EcoreUtil.copy(state.getContents().get(0));
                } else {
                    if (lastActiveEditor == kitsEditor) {
                        copy = SyncchartsFactory.eINSTANCE.createRegion();
                    } else {
                        copy = SyncchartsFactory.eINSTANCE.createTransition();
                    }
                }
                if (container == null) {
                    dummyResource.getContents().clear();
                    dummyResource.getContents().add(copy);
                    leftElement = copy;
                } else {
                    
                    ((EList<EObject>) container.eGet(feature)).add(index, copy);
                    if (SyncchartsPackage.eINSTANCE.getState_OutgoingTransitions().equals(feature)) {
                        ((Transition) copy).setTargetState(target);
                    }
                    leftElement = rootRegionCopy;
                }
            }
        });

        MatchModel matchModel = null;

        Region rightRegion = (Region) ((Diagram) ((IDiagramWorkbenchPart) passiveEditor)
                .getDiagramEditPart().getModel()).getElement();
        try {
            matchModel = MatchService.doMatch(leftElement, rightRegion, matchOptions);
        } catch (InterruptedException e) {
            return new Status(Status.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    ModelSynchronizer.MSG_MATCH_FAILED, e);
        }

        final DiffModel diffModel = DiffService.doDiff(matchModel);

        if (!diffModel.getDifferences().isEmpty()) {
            PlatformUI
                    .getWorkbench()
                    .getDisplay()
                    .syncExec(
                            new InvokeGMFEditorSynchronizationRunnable(
                                    (DiagramDocumentEditor) passiveEditor, diffModel));
        }

        return Status.OK_STATUS;
    }

    public void selectionChanged(IWorkbenchPart part, ISelection selection) {

        EObject model = null;
        StructuredSelection sSelection = null;

        if (part instanceof SyncchartsDiagramEditor && selection instanceof StructuredSelection) {

            passiveEditor = (SyncchartsDiagramEditor) part;
            sSelection = (StructuredSelection) selection;

            if (sSelection.size() != 0 && sSelection.getFirstElement() instanceof EditPart) {
                EditPart ePart = (EditPart) sSelection.getFirstElement();

                if (ePart.getModel() instanceof View) {
                    model = ((View) ePart.getModel()).getElement();
                }
            }
        }

        if (model == null) {
            return;
        }

        // ascend to the innermost region
        // may be the root region
        while (model != null) {
            if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(model)) {
                serializeRegion((Region) model);
                break;
            }
            if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(model)) {
                serializeTransition((Transition) model);
                break;
            }
            model = model.eContainer();
        }

    }

    private void serializeRegion(final Region region) {

        final Region rootRegion = (Region) EcoreUtil.getRootContainer(region);

        try {
            kitsEditor.getDocumentEditor().process(new IUnitOfWork.Void<XtextResource>() {

                @Override
                public void process(XtextResource state) throws Exception {
                    // create a copy of the complete model of the diagram editor
                    rootRegionCopy = EcoreUtil.copy(rootRegion);
                    Region copy = null;

                    // to link the models properly they have to be in a resource
                    dummyResource.getContents().clear();
                    dummyResource.getContents().add(rootRegionCopy);

                    try {
                        // link the rootRegionCopy and reveal the part of interest
                        copy = new KitsSynchronizeLinker()
                                .consultSrcAndCopy(rootRegion, rootRegionCopy)
                                .linkElement(rootRegionCopy).getMatched(region);
                    } catch (ClassCastException e) {
                        EditorUtils.log(new Status(Status.ERROR,
                                SyncchartsSynchronizerPlugin.PLUGIN_ID, 1, "Model linking failed",
                                e));
                        return;
                    }

                    // keep the container of the model part of interest in mind
                    // we need it later on for proper reconstruction of the whole
                    // copy to compare it with the original one (in diagram editor)
                    container = (State) copy.eContainer();

                    // the scope provide need to know about the "outer" model
                    // to propose and link all signals and variables properly
                    KitsEmbeddedScopeProvider.logicalContainer = container;

                    index = 0;
                    if (container != null) {
                        index = container.getRegions().indexOf(copy);
                    }

                    // finally remove the xtext editor's model and give it the new one
                    // (this will remove 'copy' from 'container')
                    state.getContents().clear();
                    state.getContents().add(copy);
                }

            }, kitsEditor.getDocument());

            actionsEditor.getViewer().getControl().setVisible(false);
            kitsEditor.getViewer().getControl().setVisible(true);
//            ((StackLayout) kitsEditor.getControl().getLayout()).topControl = kitsEditor.getViewer().getControl();

            // the above transformation will cause a model change notification
            // but I don't want to synchronize the freshly copied, serialized & re-parsed model
            cancel();

        } catch (XtextSerializationException e) {
            EditorUtils.log(new Status(IStatus.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID, 1,
                    "Serialization of textual view failed", e));
        }
    }

    private void serializeTransition(final Transition transition) {
        

        final Region rootRegion = (Region) EcoreUtil.getRootContainer(transition);

        try {
            actionsEditor.getDocumentEditor().process(new IUnitOfWork.Void<XtextResource>() {

                @Override
                public void process(XtextResource state) throws Exception {
                    // create a copy of the complete model of the diagram editor
                    rootRegionCopy = EcoreUtil.copy(rootRegion);
                    Transition copy = null;

                    // to link the models properly they have to be in a resource
                    dummyResource.getContents().clear();
                    dummyResource.getContents().add(rootRegionCopy);

                    try {
                        // link the rootRegionCopy and reveal the part of interest
                        copy = new KitsSynchronizeLinker()
                                .consultSrcAndCopy(rootRegion, rootRegionCopy)
                                .linkElement(rootRegionCopy).getMatched(transition);
                    } catch (ClassCastException e) {
                        EditorUtils.log(new Status(Status.ERROR,
                                SyncchartsSynchronizerPlugin.PLUGIN_ID, 1, "Model linking failed",
                                e));
                        return;
                    }
                    
                    target = copy.getTargetState();
                    
                    // keep the container of the model part of interest in mind
                    // we need it later on for proper reconstruction of the whole
                    // copy to compare it with the original one (in diagram editor)
                    container = (State) copy.eContainer();

                    // the scope provide need to know about the "outer" model
                    // to propose and link all signals and variables properly
                    ActionsScopeProvider.parent = container;

                    index = 0;
                    if (container != null) {
                        index = container.getOutgoingTransitions().indexOf(copy);
                    }

                    // finally remove the xtext editor's model and give it the new one
                    // (this will remove 'copy' from 'container')
                    state.getContents().clear();
                    state.getContents().add(copy);
                }

            }, actionsEditor.getDocument());

            kitsEditor.getViewer().getControl().setVisible(false);
            actionsEditor.getViewer().getControl().setVisible(true);
//            ((StackLayout) actionsEditor.getControl().getLayout()).topControl = actionsEditor.getViewer().getControl();

            // the above transformation will cause a model change notification
            // but I don't want to synchronize the freshly copied, serialized & re-parsed model
            cancel();

        } catch (XtextSerializationException e) {
            EditorUtils.log(new Status(IStatus.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID, 1,
                    "Serialization of textual view failed", e));
        }
    }

    public void setLastActiveEditor(EmbeddedXtextEditor lastActiveEditor) {
        this.lastActiveEditor = lastActiveEditor;
    }
    
    public void setFeature(EReference theFeature) {
        this.feature = theFeature;
    }
    
    

}
