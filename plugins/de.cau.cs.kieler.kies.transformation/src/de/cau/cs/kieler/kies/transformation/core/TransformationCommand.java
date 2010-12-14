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
package de.cau.cs.kieler.kies.transformation.core;

import java.util.Collection;
import java.util.Vector;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtend.XtendFacade;

/**
 * @author uru
 * 
 */
public class TransformationCommand extends RecordingCommand {

    private XtendFacade xtendFacade;
    private Object[] parameters;
    private String transformationName;

    private Collection<Object> result;

    /**
     * @param domain
     * @param xtendFacade
     * @param parameters
     * @param transformationName
     * @param editingDomain
     */
    public TransformationCommand(final XtendFacade xtendFacade, final Object[] parameters,
            final String transformationName, final TransactionalEditingDomain editingDomain) {
        super(editingDomain);
        this.xtendFacade = xtendFacade;
        this.parameters = parameters;
        this.transformationName = transformationName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canExecute() {
        return true;
    }

    @Override
    protected void doExecute() {
        Object o = xtendFacade.call(transformationName, parameters);
        result = new Vector<Object>(1);
        result.add(o);

        // RefreshGMFElementsEffect gmf = new RefreshGMFElementsEffect(getActiveEditor());
        // gmf.execute();

//        final DiagramEditor activeEditor = getActiveEditor();

        // for (CanonicalEditPolicy p : CanonicalEditPolicy.getRegisteredEditPolicies(activeEditor
        // .getDiagram().getElement())) {
        // p.refresh();
        // }

        // Display.getDefault().syncExec(new Runnable() {
        // public void run() {
        // if (activeEditor instanceof IDiagramWorkbenchPart) {
        // EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor)
        // .getDiagramEditPart().getModel()).getElement();
        // List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(obj);
        // for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
        // CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
        // nextEditPolicy.refresh();
        // }
        // IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
        // .getDiagramGraphicalViewer();
        // graphViewer.flush();
        // }
        // }
        // });

    }

//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    public void undo() {
//        super.undo();
//        // RefreshGMFElementsEffect gmf = new RefreshGMFElementsEffect(getActiveEditor());
//        // gmf.execute();
//        // System.out.println("undooo");
//
//    }

//    private DiagramEditor getActiveEditor() {
//        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
//        Display.getDefault().syncExec(new Runnable() {
//            public void run() {
//                IEditorPart editor = EditorUtils.getLastActiveEditor();
//                if (editor instanceof DiagramEditor) {
//                    maybe.set((DiagramEditor) editor);
//                }
//            }
//        });
//        return maybe.get();
//    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<Object> getResult() {
        return result;
    }

}
