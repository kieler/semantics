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
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
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

import de.cau.cs.kieler.core.KielerRuntimeException;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.synchronizer.KitsSynchronizeLinker;
import de.cau.cs.kieler.synccharts.synchronizer.SyncchartsSynchronizerPlugin;
import de.cau.cs.kieler.synccharts.synchronizer.InvokeGMFEditorSynchronizationRunnable;
import de.cau.cs.kieler.synccharts.synchronizer.ModelSynchronizer;
import de.cau.cs.kieler.synccharts.text.kits.KitsResource;
import de.cau.cs.kieler.synccharts.text.kits.scoping.KitsEmbeddedScopeProvider;

public class SyncChartSynchronizerJob extends Job implements ISelectionListener {

    private SyncchartsDiagramEditor passiveEditor = null;
    private static Map<String, Object> matchOptions = new HashMap<String, Object>();

    private EmbeddedXtextEditor editor;

    private KitsResource dummyResource;

    private Region rootRegionCopy;

    private State container;

    private int index;

    public SyncChartSynchronizerJob(String name, EmbeddedXtextEditor theEditor) {
        super(name);
        editor = theEditor;
        matchOptions.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);

        dummyResource = (KitsResource) editor.createResource();

        this.addJobChangeListener(new JobChangeAdapter() {

            @Override
            public void done(IJobChangeEvent event) {
                if (event.getResult().equals(Status.CANCEL_STATUS)) {
                    return;
                }
                if (container != null) {
                    container.getRegions().remove(index);
                }
            }
        });

    }

    private Region leftRegion;

    @Override
    protected IStatus run(IProgressMonitor monitor) {

        editor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {

            @Override
            public synchronized void process(XtextResource state) throws Exception {
                Region copy = null;
                if (!state.getContents().isEmpty()) {
                    copy = EcoreUtil.copy((Region) state.getContents().get(0));
                } else {
                    copy = SyncchartsFactory.eINSTANCE.createRegion();
                }
                if (container == null) {
                    dummyResource.getContents().clear();
                    dummyResource.getContents().add(copy);
                    leftRegion = copy;
                } else {
                    container.getRegions().add(index, copy);
                    leftRegion = rootRegionCopy;
                }
            }
        });

        final DiffModel diffModel;

        MatchModel matchModel = null;

        Region rightRegion = (Region) ((Diagram) ((IDiagramWorkbenchPart) passiveEditor)
                .getDiagramEditPart().getModel()).getElement();
        try {
            matchModel = MatchService.doMatch(leftRegion, rightRegion, matchOptions);
        } catch (InterruptedException e) {
            return new Status(Status.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    ModelSynchronizer.MSG_MATCH_FAILED, new KielerRuntimeException(
                            ModelSynchronizer.MSG_MATCH_FAILED));
        }

        diffModel = DiffService.doDiff(matchModel);

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
        while (!SyncchartsPackage.eINSTANCE.getRegion().isInstance(model)) {
            model = model.eContainer();
        }

        final Region region = (Region) model;
        final Region rootRegion = (Region) EcoreUtil.getRootContainer(region);

        try {
            editor.getDocumentEditor().process(new IUnitOfWork.Void<XtextResource>() {

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

            }, editor.getDocument());

            // the above transformation will cause a model change notification
            // but I don't want to synchronize the freshly copied, serialized & re-parsed model
            cancel();

        } catch (XtextSerializationException e) {
            EditorUtils.log(new Status(IStatus.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID, 1,
                    "Serialization of textual view failed", e));
        }
    }

}
