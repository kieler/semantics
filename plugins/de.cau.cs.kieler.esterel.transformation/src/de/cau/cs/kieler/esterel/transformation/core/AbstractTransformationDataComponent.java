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
package de.cau.cs.kieler.esterel.transformation.core;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.json.JSONObject;

import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.esterel.transformation.kivi.TransformationTrigger;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * 
 * Every extending class also has to implement the following method. This is used within the .ext
 * file to receive a correct transformation statement.
 * 
 * <pre>
 * public static ITransformationStatement getTransformationStatement(String transName, State synMod,
 *         EObject estMod) {
 *         ... 
 * }
 * </pre>
 * 
 * @author uru
 * 
 */
public abstract class AbstractTransformationDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    /** queue storing xpand transformations to be executed. */
    private Queue<ITransformationStatement> queue;

    private XtendExecution runner;

    protected Resource resource;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {

        // register this component, do extending class's initialize method and initialize the queue
        // and runner.
        XtendToJava.registerComponent(this);
        queue = new LinkedBlockingQueue<ITransformationStatement>();
        runner = new XtendExecution(getTransformationFile(), getBasePackages());
        preInitialize();
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject arg0) throws KiemExecutionException {

        if (queue.isEmpty()) {
            System.out.println("NO FURTHER TRANSFORMATIONS");
            return null;
        }

        // poll a statement from the queue and execute
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            public void run() {
                IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().getActiveEditor();
                if (!(activeEditor instanceof SyncchartsDiagramEditor)) {
                    return;
                }

                ITransformationStatement ts = queue.poll();
                runner.executeTransformation(ts.getParameters(), ts.getTransformationName());

                if (resource != null) {
                    try {
                        resource.save(null);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                // update edit policies, so GMF will generate diagram elements
                // for model elements which have been generated during the
                // transformation.
                if (activeEditor instanceof IDiagramWorkbenchPart) {
                    EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor)
                            .getDiagramEditPart().getModel()).getElement();
                    List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(obj);
                    for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
                        CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
                        nextEditPolicy.refresh();
                    }
                    IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                            .getDiagramGraphicalViewer();
                    graphViewer.flush();
                }

                // apply automatic layout by triggering the trigger (null layouts whole diagram)
                if (TransformationTrigger.getInstance() != null) {
                    TransformationTrigger.getInstance().step(null, (DiagramEditor) activeEditor);
                }

            }
        });
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        queue = null;
        runner = null;
        XtendToJava.removeComponent(this);
    }

    /**
     * @return the queue
     */
    public Queue<ITransformationStatement> getQueue() {
        return queue;
    }

    /**
     * @return the runner
     */
    public XtendExecution getRunner() {
        return runner;
    }

    /**
     * method is called within the DataComponents initialize() method.
     */
    public abstract void preInitialize();

    /**
     * @return all base packages needed for the transformations planned.
     */
    public abstract List<String> getBasePackages();

    /**
     * @return the actual transformation file (.ext)
     */
    public abstract String getTransformationFile();

    /**
     * @return unique identifier
     */
    public abstract String getIdentifier();

    // protected DiagramEditor getActiveEditor() {
    // final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
    // Display.getDefault().syncExec(new Runnable() {
    // public void run() {
    // // get the active editor
    // IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    // IWorkbenchPage activePage = window.getActivePage();
    // IEditorPart editor = activePage.getActiveEditor();
    // if (editor instanceof DiagramEditor) {
    // maybe.set((DiagramEditor) editor);
    // }
    // }
    // });
    // return maybe.get();
    // }

    protected DiagramEditor getActiveEditor() {
        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage activePage = window.getActivePage();
                IEditorPart editor = activePage.getActiveEditor();
                if (editor instanceof DiagramEditor) {
                    maybe.set((DiagramEditor) editor);
                }
            }
        });
        return maybe.get();
    }

    protected TransactionalEditingDomain getActiveEditorEditingDomain() {
        DiagramEditor activeEditor = getActiveEditor();
        if (activeEditor != null) {
            return activeEditor.getEditingDomain();
        }
        return null;
    }

    protected TransactionalEditingDomain getEditingDomainForResourceSet(ResourceSet rs) {
        return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
    }
}
