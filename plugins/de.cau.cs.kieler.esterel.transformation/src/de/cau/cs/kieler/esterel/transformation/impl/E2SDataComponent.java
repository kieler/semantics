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
package de.cau.cs.kieler.esterel.transformation.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.esterel.transformation.core.ITransformationStatement;
import de.cau.cs.kieler.esterel.transformation.core.TransformationDataComponent;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;

/**
 * @author uru
 * 
 */
public class E2SDataComponent extends TransformationDataComponent {

    // base packages and xpand transformation file.
    private static final String SYNCCHARTS_PACKAGE = "de.cau.cs.kieler.synccharts.SyncchartsPackage";
    private static final String EXPRESSIONS_PACKAGE = "de.cau.cs.kieler.core.expressions."
            + "ExpressionsPackage";
    private static final String ESTEREL_PACKAGE = "de.cau.cs.kieler.esterel.esterel.EsterelPackage";
    private static final String ECORE_PACKAGE = "org.eclipse.emf.ecore.EcorePackage";
    private static final String TRANSFORMATION_FILE = "toSyncchartTransformationNew.ext";

    /** first transformation being executed. */
    private static final String INITIAL_TRANSFORMATION = "initial";

    private static final String IDENTIFIER = "de.cau.cs.kieler.esterel.transformation."
            + "impl.E2SDataComponent";

    /** is the actual transformation started yet?. */
    private boolean started = false;

    /**
     * {@inheritDoc}
     */
    @Override
    public void preInitialize() {

        // first load the esterel file into a syncchart
        loadEsterelIntoSyncChart();

        // catch the first model and place it on the queue
        // FIXME this should be done a better way!
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            public void run() {
                IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().getActiveEditor();
                if (editor instanceof SyncchartsDiagramEditor) {
                    EditPart rootEditPart = ((DiagramEditor) editor).getDiagramEditPart();
                    EditPartViewer viewer = rootEditPart.getViewer();

                    // programmatically select the root state
                    viewer.select(rootEditPart);

                    @SuppressWarnings("unchecked")
                    List<EditPart> selected = viewer.getSelectedEditParts();
                    if (selected.size() == 1) {
                        EditPart selPart = selected.get(0);
                        Object selView = selPart.getModel();
                        EObject selModel = ((View) selView).getElement();
                        State root = ((Region) selModel).getStates().get(0);
                        // rootState = root;
                        runner.setEditDomain(TransactionUtil.getEditingDomain(root));
                        // initializing first statement
                        QueueStatement qs = new QueueStatement(INITIAL_TRANSFORMATION, root, root
                                .getBodyContents());
                        queue.add(qs);
                    }
                }
                System.out.println("Added First Statement");

            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getBasePackages() {
        LinkedList<String> basePackages = new LinkedList<String>();
        basePackages.add(SYNCCHARTS_PACKAGE);
        basePackages.add(EXPRESSIONS_PACKAGE);
        basePackages.add(ESTEREL_PACKAGE);
        basePackages.add(ECORE_PACKAGE);
        return basePackages;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTransformationFile() {
        return TRANSFORMATION_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    // FIXME WHYYY is xpand returning VOID for the estMod?!?
    public ITransformationStatement getTransformationStatement(String transName, State synMod,
            EObject estMod) {
        QueueStatement qs = new QueueStatement(transName, synMod,
                ((State) synMod).getBodyContents());
        return qs;
    }

    /**
     * loads an esterel program initially into a syncchart TODO do this somewhere else.
     */
    private void loadEsterelIntoSyncChart() {

        final String esterelLanguage = "de.cau.cs.kieler.esterel.Esterel";

        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {
                System.out.println("Initializing Esterel Transformation.");

                System.out.println("Reading current Esterel Editor");
                try {
                    // get Editor must be done in UI Thread, otherwise null
                    IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                            .getActivePage().getActiveEditor();
                    XtextEditor xeditor = ((XtextEditor) editor);
                    if (!xeditor.getLanguageName().equals(esterelLanguage)) {
                        throw new IllegalArgumentException("The currently open Xtext Editor is no"
                                + " Esterel Editor. Editor language is "
                                + xeditor.getLanguageName() + " but should be " + esterelLanguage);
                    }

                    IFile file = ((FileEditorInput) xeditor.getEditorInput()).getFile();

                    final URI strlURI = URI.createPlatformResourceURI(
                            file.getFullPath().toString(), true);
                    final URI kidsURI = URI.createPlatformResourceURI(file.getFullPath()
                            .removeFileExtension().addFileExtension("kids").toString(), false);
                    final URI kixsURI = URI.createPlatformResourceURI(file.getFullPath()
                            .removeFileExtension().addFileExtension("kixs").toString(), false);

                    System.out.println("Creating new SyncCharts Diagram.");
                    IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
                        protected void execute(final IProgressMonitor monitor)
                                throws CoreException, InterruptedException {
                            Resource diagram = SyncchartsDiagramEditorUtil.createDiagram(kidsURI,
                                    kixsURI, monitor);
                            try {
                                diagram.save(null);
                                SyncchartsDiagramEditorUtil.openDiagram(diagram);
                            } catch (Exception e) {
                                System.out.println(e);
                                e.printStackTrace();
                            }

                        }
                    };
                    op.run(null);

                    State rootState;

                    System.out.println("Creating initial SyncCharts contents.");
                    ResourceSet resourceSet = new ResourceSetImpl();
                    Resource resource = resourceSet.getResource(kixsURI, true);
                    SyncchartsFactory sf = SyncchartsFactory.eINSTANCE;
                    Region rootRegion = (Region) resource.getContents().get(0);
                    rootState = sf.createState();
                    rootRegion.getStates().add(rootState);
                    rootState.setLabel("EsterelState");
                    rootState.setType(StateType.TEXTUAL);

                    System.out.println("Reading Esterel Source Code.");

                    // IXtextDocument document = xeditor.getDocument();
                    // TextualCode code = ExpressionsFactory.eINSTANCE.createTextualCode();
                    // rootState.setBodyText(code);
                    // code.setCode(document.get());

                    System.out.println("Parsing Esterel Source Code.");
                    Resource xtextResource = resourceSet.getResource(strlURI, true);
                    EObject esterelModule = xtextResource.getContents().get(0);

                    System.out.println("Attaching Esterel Model to SyncChart");
                    rootState.setBodyContents(esterelModule);

                    resource.save(null);

                } catch (Exception e) {
                    // throw new KiemInitializationException(
                    // "Failed to initialize Esterel Transformation. No valid Esterel Editor found.",
                    // true, e);
                    e.printStackTrace();
                }

            }
        });
    }

    /**
     * represents a queue statement used to store a transformation and an according module within
     * the queue.
     * 
     */
    private class QueueStatement implements ITransformationStatement {

        // CHECKSTYLEOFF VisibilityModifier
        private String transformation;
        private EObject syncModel;
        private EObject estModel;

        // CHECKSTYLEON VisibilityModifier

        public QueueStatement(final String trans, final EObject theSyncModel,
                final EObject theEstModel) {
            this.transformation = trans;
            this.syncModel = theSyncModel;
            this.estModel = theEstModel;
        }

        /**
         * {@inheritDoc}
         */
        public EObject[] getParameters() {
            return new EObject[] { syncModel, estModel };
        }

        /**
         * {@inheritDoc}
         */
        public String getTransformationName() {
            return transformation;
        }
    }
}
