/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.Writer;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A command that expands all referenceMacroStates in a given file <name>[.kixs] and writes the expanded
 * superstate to a new file <name>_EXPANDED.kixs
 * 
 * @author abl
 */
public class ExpandMacroStatesCommand extends AbstractHandler {

    /** File extension for model files. */
    private static final String MODEL_EXTENSION = "kixs";

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("restriction")
    public void setEnabled(Object evaluationContext) {
        if (evaluationContext instanceof EvaluationContext) {
            EvaluationContext evalContext = (EvaluationContext) evaluationContext;
            // get list of selected files
            Object defVar = evalContext.getDefaultVariable();
            if (defVar instanceof Iterable<?>) {
                Iterable<?> iterable = (Iterable<?>) defVar;
                Iterator<?> iter = iterable.iterator();
                while (iter.hasNext()) {
                    Object o = iter.next();
                    if (o instanceof org.eclipse.core.internal.resources.File) {
                        IPath path = ((org.eclipse.core.internal.resources.File) o).getFullPath();
                        if (path.getFileExtension().equals(MODEL_EXTENSION)) {
                            super.setBaseEnabled(true);
                            return;
                        }
                    }
                }
            }
        }
        super.setBaseEnabled(false);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("restriction")
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // get the selection
        Object object = event.getApplicationContext();
        if (object instanceof EvaluationContext) {
            EvaluationContext evalContext = (EvaluationContext) object;
            // get list of selected files
            Object defVar = evalContext.getDefaultVariable();
            if (defVar instanceof Iterable<?>) {
                Iterable<?> iterable = (Iterable<?>) defVar;
                Iterator<?> iter = iterable.iterator();
                while (iter.hasNext()) {
                    Object o = iter.next();
                    if (o instanceof org.eclipse.core.internal.resources.File) {
                        IPath path = ((org.eclipse.core.internal.resources.File) o).getFullPath();
                        try {
                            IPath expDiagram = expandMacroStates(path);
                        } catch (RuntimeException e0) {
                            e0.printStackTrace();
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }

    private IPath expandMacroStates(final IPath path) {
        IPath target = (IPath) path.clone();
        target = target.removeFileExtension();
        String filename = target.lastSegment() + "_EXPANDED.kixs";
        target = target.removeLastSegments(1).append(filename);

        Workflow workflow = new Workflow();
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();
        Issues issues = new IssuesImpl();

        // Meta model
        EmfMetaModel metaModel = new EmfMetaModel(SyncchartsPackage.eINSTANCE);

        Reader xmiReader = new Reader();
        xmiReader.setUri(path.toString());
        xmiReader.setModelSlot("model");
        workflow.addComponent(xmiReader);

        XtendComponent transformation = new XtendComponent();
        transformation.addMetaModel(metaModel);
        transformation.setInvoke("transformations::expandReferenceStates::transform(model)");
        transformation.setOutputSlot("transformedModel");
        workflow.addComponent(transformation);

        Writer writer = new Writer();
        writer.setUri(target.toString());
        writer.setModelSlot("transformedModel");
        workflow.addComponent(writer);

        workflow.invoke(wfx, monitor, issues);
        
        System.out.println("Issues: \n" + issues);
        
        return target;
    }
}
