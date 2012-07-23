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
package de.cau.cs.kieler.synccharts.synchronizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.presentation.SyncchartsEditor;

/**
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class ModelSynchronizerJob extends Job {

    private static Map<String, Object> matchOptions = new HashMap<String, Object>();
    
    private IEditorPart activeEditor = null;

    public ModelSynchronizerJob() {
        super("Synchronize Model Views");
        matchOptions.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);
        // KitsMatchScopeProvider scopeProvider = new KitsMatchScopeProvider();
        // this.matchOptions.put(MatchOptions.OPTION_MATCH_SCOPE_PROVIDER, scopeProvider);
    }

    public static Map<String, Object> getMatchOptions() {
        return matchOptions;
    }
    
//    public void setActiveEditor(IEditorPart theActiveEditor) throws KielerException {
//        if (theActiveEditor != this.activeEditor 
//                && this.getState() != Job.NONE) {
//            throw new KielerException(ModelSynchronizer.MSG_JOB_IS_RUNNING);
//        } else {
//            this.activeEditor = theActiveEditor;
//        }
//    }

    protected IStatus run(IProgressMonitor monitor) {
        List<IEditorReference> editorRefs = null;
//        IEditorPart activeEditor3 = null;

        IWorkbenchPage workbenchPage = ModelSynchronizer.INSTANCE.getWorkbenchPage();

        if (workbenchPage != null) {
            try {
                editorRefs = Arrays.asList(workbenchPage.getEditorReferences());
                activeEditor = workbenchPage.getActiveEditor();

            } catch (Exception e) {
                return new Status(Status.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                        ModelSynchronizer.MSG_NO_ACTIVE_EDITOR, e);
            }
        }

        List<IEditorPart> syncChartEditors = new ArrayList<IEditorPart>();

        if (editorRefs != null) {
            for (IEditorReference ref : editorRefs)
                if (ref.getEditor(false) != null
                        && (ref.getEditor(false) instanceof SyncchartsEditor
                                || ref.getEditor(false) instanceof XtextEditor || ref
                                .getEditor(false) instanceof SyncchartsDiagramEditor)) {
                    syncChartEditors.add(ref.getEditor(false));
                }
        }

        if (activeEditor != null && syncChartEditors.size() > 1) {
            // System.out.println(syncChartEditors.size());
            // don't consider activeSyncChartsEditor to be synchronized
            syncChartEditors.remove(activeEditor);

            Resource res_active = null;
            EObject model_active = null;

            if (activeEditor instanceof IEditingDomainProvider) {
                res_active = ((IEditingDomainProvider) activeEditor)
                        .getEditingDomain()
                        .getResourceSet()
                        .getResource(
                                URI.createPlatformResourceURI(
                                        ((FileEditorInput) ((IEditorPart) activeEditor)
                                                .getEditorInput()).getFile().getFullPath()
                                                .toOSString(), true), true);
                if (res_active != null && !res_active.getContents().isEmpty()) {
                    model_active = res_active.getContents().get(0);
                }

            } else if (activeEditor instanceof XtextEditor) {
                res_active = ((XtextEditor) activeEditor).getDocument().readOnly(
                        new IUnitOfWork<Resource, XtextResource>() {

                            public Resource exec(XtextResource state) throws Exception {
                                if (state.getErrors().isEmpty())
                                    return state;
                                return null;
                            }
                        });
                if (res_active != null && !res_active.getContents().isEmpty()) {
                    model_active = res_active.getContents().get(0);
                }
            } else if (activeEditor instanceof DiagramDocumentEditor) {
                model_active = ((Diagram) ((DiagramDocumentEditor) activeEditor)
                        .getDiagramEditPart().getModel()).getElement();
                res_active = model_active.eResource();
            }

            if (res_active != null && model_active == null) {
                model_active = res_active.getContents().get(0);
                if (model_active instanceof Diagram) {
                    model_active = ((Diagram) model_active).getElement();
                }
            }

            Resource res_passive = null;
            EObject model_passive = null;

            while (model_active != null && !syncChartEditors.isEmpty()) {
                // System.out.println("Synchronizing...");

                final IEditorPart passiveEditor = syncChartEditors.remove(0);
                if (passiveEditor instanceof IEditingDomainProvider) {
                    res_passive = ((IEditingDomainProvider) passiveEditor)
                            .getEditingDomain()
                            .getResourceSet()
                            .getResource(
                                    URI.createPlatformResourceURI(
                                            ((FileEditorInput) ((IEditorPart) activeEditor)
                                                    .getEditorInput()).getFile().getFullPath()
                                                    .toOSString(), true), true);
                    if (!res_passive.getContents().isEmpty())
                        model_passive = res_passive.getContents().get(0);
                } else if (passiveEditor instanceof XtextEditor) {
                    res_passive = ((XtextEditor) passiveEditor).getDocument().readOnly(
                            new IUnitOfWork<Resource, XtextResource>() {

                                public Resource exec(XtextResource state) throws Exception {
                                    return state;
                                }
                            });
                    if (!res_passive.getContents().isEmpty()) {
                        model_passive = res_passive.getContents().get(0);
                    }
                } else if (passiveEditor instanceof DiagramDocumentEditor) {
                    model_passive = ((Diagram) ((IDiagramWorkbenchPart) passiveEditor)
                            .getDiagramEditPart().getModel()).getElement();
                    res_passive = model_passive.eResource();
                }

                final DiffModel diffModel;
                final EObject copy;
                int diffs = 0;
                if (model_passive != null) {
                    MatchModel matchModel = null;

                    try {
                        matchModel = MatchService
                                .doMatch(model_active, model_passive, matchOptions);
                    } catch (InterruptedException e) {
                        return new Status(Status.ERROR, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                                ModelSynchronizer.MSG_MATCH_FAILED,
                                new RuntimeException(ModelSynchronizer.MSG_MATCH_FAILED, e));
                    }

                    ModelSynchronizer.dumpMatch(matchModel, System.out);

                    diffModel = DiffService.doDiff(matchModel);

                    // debugging stuff
                    ModelSynchronizer.dumpDiff(diffModel, System.out);

                    try {
                        diffs = ((DiffGroup) diffModel.getOwnedElements().get(0)).eContents()
                                .size();
                    } catch (Exception e) {
                        // nothing: diffs is properly initialized
                    }
                    copy = null;

                } else {
                    // if no passive model exists (e.g. content of an Xtext editor is empty
                    //  a dummy diffModel is created comprising only root elements
                    //  but no diff elements
                    diffs = -1;
                    copy = EcoreUtil.copy(model_active);
                    diffModel = DiffFactory.eINSTANCE.createDiffModel();
                    diffModel.getLeftRoots().add(model_active);
                    diffModel.getRightRoots().add(copy);
                }

                if (passiveEditor instanceof XtextEditor && !(diffs == 0)) {
                    // System.out.println(">>> Xtext");

                    PlatformUI
                            .getWorkbench()
                            .getDisplay()
                            .asyncExec(
                                    new InvokeXtextEditorSynchronizationRunnable((XtextEditor) passiveEditor,
                                            diffModel));

                } else {
                    if (passiveEditor instanceof DiagramDocumentEditor) {
                        // System.out.println(">>> GMF");

                        PlatformUI
                                .getWorkbench()
                                .getDisplay()
                                .syncExec(
                                        new InvokeGMFEditorSynchronizationRunnable(
                                                (DiagramDocumentEditor) passiveEditor, diffModel));
                    } else {
                        if (passiveEditor instanceof SyncchartsEditor) {
                            // System.out.println(">>> EMF tree");
                            
                            MergeService.merge(diffModel.getOwnedElements(), true);
                        }
                    }
                }
            }
        }
        return Status.OK_STATUS;
    }

}
