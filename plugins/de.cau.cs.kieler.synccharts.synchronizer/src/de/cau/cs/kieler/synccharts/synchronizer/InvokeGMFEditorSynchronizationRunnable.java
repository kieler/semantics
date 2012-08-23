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

import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;

import de.cau.cs.kieler.kiml.ui.diagram.DiagramLayoutEngine;

/**
 * A Runnable encapsulating the activities for synchronizing a graphical view.
 *  
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class InvokeGMFEditorSynchronizationRunnable implements Runnable {

    private DiagramDocumentEditor passiveEditor = null;
    private DiffModel diffModel = null;
    
    /**
     * Constructor.
     * 
     * @param thePassiveEditor the GMF-based editor
     * @param theDiffModel the difference model describing the merge
     */
    public InvokeGMFEditorSynchronizationRunnable(final DiagramDocumentEditor thePassiveEditor,
            final DiffModel theDiffModel) {
        this.passiveEditor = thePassiveEditor;
        this.diffModel = theDiffModel;
    }
    
    /**
     * {@inheritDoc}
     */
    public void run() {
        passiveEditor
                .getDiagramEditDomain()
                .getDiagramCommandStack()
                .execute(
                        new ICommandProxy(new SynchronizeGMFEditorCommand(passiveEditor, diffModel)));
        
        for (CanonicalEditPolicy p : CanonicalEditPolicy.getRegisteredEditPolicies(passiveEditor
                .getDiagram().getElement())) {
            p.refresh();
        }

        ((DiagramDocumentEditor) passiveEditor).getDiagramGraphicalViewer().flush();

        DiagramLayoutEngine.INSTANCE.layout(passiveEditor, null, true, false, false, false);
    }
}
