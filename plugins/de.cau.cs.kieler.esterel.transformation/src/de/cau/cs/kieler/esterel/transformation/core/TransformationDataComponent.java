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

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.emf.ecore.EObject;
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
 * @author uru
 * 
 */
public abstract class TransformationDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    /** queue storing xpand transformations to be executed. */
    protected Queue<ITransformationStatement> queue;

    protected XpandModelExecution runner;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {

        XpandToJava.registerComponent(this);
        preInitialize();
        queue = new LinkedBlockingQueue<ITransformationStatement>();
        runner = new XpandModelExecution(getTransformationFile(), getBasePackages());
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(JSONObject arg0) throws KiemExecutionException {

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
                    System.out.println("Layout applied");
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
        XpandToJava.removeComponent(this);
    }

    /**
     * @return the queue
     */
    public Queue<ITransformationStatement> getQueue() {
        return queue;
    }

    public abstract void preInitialize();

    public abstract List<String> getBasePackages();

    public abstract String getTransformationFile();

    public abstract String getIdentifier();

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
}
