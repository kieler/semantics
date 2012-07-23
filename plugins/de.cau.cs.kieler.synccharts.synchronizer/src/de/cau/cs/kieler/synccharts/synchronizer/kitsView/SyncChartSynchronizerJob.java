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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import de.cau.cs.kieler.synccharts.Scope;
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


/**
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class SyncChartSynchronizerJob extends Job implements ISelectionListener {

    private SyncchartsDiagramEditor passiveEditor = null;
    private static Map<String, Object> matchOptions = new HashMap<String, Object>();

    private EmbeddedXtextEditor actionsEditor;
    private EmbeddedXtextEditor kitsEditor;
    private EmbeddedXtextEditor kitsStateEditor;

    private EmbeddedXtextEditor lastActiveEditor;

    private EReference feature;

    private KitsResource dummyResource;

    private Region rootRegionCopy;

    private Scope container;
    private List<Transition> incomingTransitions;

    private State transitionTarget;
    private int transitionPrio;

    private int index;

    public SyncChartSynchronizerJob(String name, EmbeddedXtextEditor theActionsEditor,
            EmbeddedXtextEditor theKitsEditor, EmbeddedXtextEditor theKitsStateEditor) {
        super(name);
        actionsEditor = theActionsEditor;
        kitsEditor = theKitsEditor;
        kitsStateEditor = theKitsStateEditor;

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
    

    @Override
    protected IStatus run(IProgressMonitor monitor) {

        // prepare the left element for comparing it with 
        // the current active editors document content
        // (aka the right element in EMF compare speach) 
        Region leftRegion = lastActiveEditor.getDocument().readOnly(
                new IUnitOfWork<Region, XtextResource>() {

                    @SuppressWarnings("unchecked")
                    public synchronized Region exec(XtextResource resource) throws Exception {

                        EObject copy = null;
                        Region leftElement = null;

                        if (!resource.getContents().isEmpty()) {
                            
                            /* create a copy of the Xtext editor's content as
                             * pulling Xtext editor's might result in conflicts
                             */ 
                            copy = EcoreUtil.copy(resource.getContents().get(0));
                            
                            /* link the transitions of the copy as transition target
                             * haven't been set due to the bidirectional association;
                             * 
                             * has no effect if the root element is a transition itself
                             * (i.e. lastActiveEditor=actionsEditor)
                             */
                            new KitsSynchronizeLinker().consultSrcAndCopy(
                                    resource.getContents().get(0), copy).linkTransitionsInElement(
                                    copy);
                            
                        } else {                            
                            /* in case the whole content was deleted create a dummy element
                             * for comparing it with the original one 
                             */
                            if (lastActiveEditor == kitsEditor) {
                                copy = SyncchartsFactory.eINSTANCE.createRegion();
                            } else {
                                if (lastActiveEditor == kitsStateEditor) {
                                    copy = SyncchartsFactory.eINSTANCE.createState();
                                } else {
                                    copy = SyncchartsFactory.eINSTANCE.createTransition();
                                }
                            }
                        }

                        /* put the copy in a dummy resource:
                         * EMF Compare needs this for building fragmentURIs for example */
                        if (container == null) {
                            dummyResource.getContents().clear();
                            dummyResource.getContents().add(copy);
                            leftElement = (Region) copy;

                        } else {
                            /* in case only a sub model was serialized put the new sub
                             * into the original context (a copy of the complete original model*/ 
                            ((EList<EObject>) container.eGet(feature)).add(index, copy);

                            if (SyncchartsPackage.eINSTANCE.getState_OutgoingTransitions().equals(
                                    feature)) {
                                ((Transition) copy).setTargetState(transitionTarget);
                                ((Transition) copy).setPriority(transitionPrio);
                            }
                            leftElement = rootRegionCopy;
                        }

                        if (SyncchartsPackage.eINSTANCE.getState().isInstance(copy)) {
                            /* if a state is the root of the serialized sub model
                             * the original counterpart might have incoming transitions
                             * that have to be re-directed to the copy;
                             * otherwise they will be removed while merging */
                            for (Transition t : incomingTransitions) {
                                t.setTargetState((State) copy);
                            }
                        }

                        return leftElement;
                    }

                });

        // reveal the right element
        Region rightRegion = (Region) ((Diagram) ((IDiagramWorkbenchPart) passiveEditor)
                .getDiagramEditPart().getModel()).getElement();

        MatchModel matchModel = null;
        
        try {
            matchModel = MatchService.doMatch(leftRegion, rightRegion, matchOptions);
        } catch (InterruptedException e) {
            return new Status(Status.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    ModelSynchronizer.MSG_MATCH_FAILED, e);
        }

        final DiffModel diffModel = DiffService.doDiff(matchModel);
        
        //ModelSynchronizer.DEBUGDiff = true;
        //ModelSynchronizer.dumpDiff(diffModel, System.out);

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

        while (model != null) {
            if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(model)) {
                serializeRegion((Region) model);
                break;
            }
            if (SyncchartsPackage.eINSTANCE.getState().isInstance(model)) {
                serializeState((State) model);
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

        try {
            kitsEditor.getDocument().modify(new IUnitOfWork.Void<XtextResource>() {

                @SuppressWarnings("unchecked")
                @Override
                public void process(XtextResource state) throws Exception {
                    Region copy = createCopy(region);

                    // keep the container of the model part of interest in mind
                    // we need it later on for proper reconstruction of the whole
                    // copy to compare it with the original one (in diagram editor)
                    container = (Scope) copy.eContainer();
                    feature = SyncchartsPackage.eINSTANCE.getState_Regions();

                    // the scope provide need to know about the "outer" model
                    // to propose and link all signals and variables properly
                    KitsEmbeddedScopeProvider.logicalContainer = container;

                    index = 0;
                    if (container != null) {
                        index = ((EList<EObject>) container.eGet(feature)).indexOf(copy);
                    }

                    // finally remove the xtext editor's model and give it the new one
                    // (this will remove 'copy' from 'container')
                    state.getContents().clear();
                    state.getContents().add(copy);
                }

            });

            kitsEditor.bringOnTop();
            lastActiveEditor = kitsEditor;

            // the above transformation will cause a model change notification
            // but I don't want to synchronize the freshly copied, serialized & re-parsed model
            cancel();

        } catch (XtextSerializationException e) {
            EditorUtils.log(new Status(IStatus.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    "Serialization of textual view failed", e));
        }
    }

    private void serializeState(final State state) {

        try {
            kitsStateEditor.getDocument().modify(new IUnitOfWork.Void<XtextResource>() {

                @SuppressWarnings("unchecked")
                @Override
                public void process(XtextResource resource) throws Exception {
                    State copy = createCopy(state);

                    // keep the container of the model part of interest in mind
                    // we need it later on for proper reconstruction of the whole
                    // copy to compare it with the original one (in diagram editor)
                    container = (Scope) copy.eContainer();
                    feature = SyncchartsPackage.eINSTANCE.getRegion_States();

                    // the scope provide need to know about the "outer" model
                    // to propose and link all signals and variables properly
                    KitsEmbeddedScopeProvider.logicalContainer = container;

                    index = 0;
                    if (container != null) {
                        index = ((EList<EObject>) container.eGet(feature)).indexOf(copy);
                    }

                    // keep the incoming transtions of the state delivered to xtext
                    // in mind as we will have to redirect them to the new state
                    // created by xtext (in the above run() method)
                    // self loops have to be excluded

                    incomingTransitions = new ArrayList<Transition>();
                    for (Transition t : copy.getIncomingTransitions()) {
                        if (t.getSourceState() != copy) {
                            incomingTransitions.add(t);
                        }
                    }

                    // finally remove the xtext editor's model and give it the new one
                    // (this will remove 'copy' from 'container')
                    resource.getContents().clear();
                    resource.getContents().add(copy);
                }

            });

            kitsStateEditor.bringOnTop();
            lastActiveEditor = kitsStateEditor;

            // the above transformation will cause a model change notification
            // but I don't want to synchronize the freshly copied, serialized & re-parsed model
            cancel();

        } catch (XtextSerializationException e) {
            EditorUtils.log(new Status(IStatus.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    "Serialization of textual view failed", e));
        }
    }

    private void serializeTransition(final Transition transition) {

        try {
            actionsEditor.getDocument().modify(new IUnitOfWork.Void<XtextResource>() {

                @SuppressWarnings("unchecked")
                @Override
                public void process(XtextResource state) throws Exception {
                    Transition copy = createCopy(transition);
                    transitionTarget = copy.getTargetState();
                    transitionPrio = copy.getPriority();

                    // keep the container of the model part of interest in mind
                    // we need it later on for proper reconstruction of the whole
                    // copy to compare it with the original one (in diagram editor)
                    container = (State) copy.eContainer();
                    feature = SyncchartsPackage.eINSTANCE.getState_OutgoingTransitions();

                    // the scope provide need to know about the "outer" model
                    // to propose and link all signals and variables properly
                    ActionsScopeProvider.parent = container;

                    index = 0;
                    if (container != null) {
                        index = ((EList<EObject>) container.eGet(feature)).indexOf(copy);
                    }

                    // finally remove the xtext editor's model and give it the new one
                    // (this will remove 'copy' from 'container')
                    state.getContents().clear();
                    state.getContents().add(copy);
                }

            });

            actionsEditor.bringOnTop();
            lastActiveEditor = actionsEditor;

            // the above transformation will cause a model change notification
            // but I don't want to synchronize the freshly copied, serialized & re-parsed model
            cancel();

        } catch (XtextSerializationException e) {
            EditorUtils.log(new Status(IStatus.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    "Serialization of textual view failed", e));
        }
    }

    private <T extends EObject> T createCopy(T element) {
        Region rootRegion = (Region) EcoreUtil.getRootContainer(element);

        // create a copy of the complete model of the diagram editor
        rootRegionCopy = EcoreUtil.copy(rootRegion);

        // to link the models properly they have to be in a resource
        dummyResource.getContents().clear();
        dummyResource.getContents().add(rootRegionCopy);

        try {
            // link the rootRegionCopy and reveal the part of interest
            return new KitsSynchronizeLinker().consultSrcAndCopy(rootRegion, rootRegionCopy)
                    .linkElement(rootRegionCopy).getMatched(element);
        } catch (ClassCastException e) {
            EditorUtils.log(new Status(Status.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    "Model linking failed", e));
            return null;
        }

    }
}
