/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.debug.view

import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.klighd.kgraph.KEdge
import org.eclipse.ui.progress.UIJob
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.layout.FillLayout
import org.eclipse.swt.widgets.Text
import org.eclipse.core.runtime.Status

/**
 * @author stu121235
 *
 */
class DebugDiagramView extends DiagramViewPart {
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.debugDiagram"
    
    static var DebugDiagramView instance
    
    new() {
        super()
        instance = this
    }
    
    static def void updateOrCreateView(Object model) {
        if (instance === null) {
            DiagramViewManager.createView(ID, "Debug Diagram View", model) as DebugDiagramView
        } else {
            instance.updateDiagram(model)
        }
    }
    
    static def DebugDiagramView getInstance() {
        if (instance === null) {
            instance = new DebugDiagramView
        }
        return instance
    }
    
    def void updateDiagram(Object model) {
        
        if (viewer === null || viewer.viewContext === null) {
            val instance = this
            new UIJob("Init" + this.getClass.getName()) {

                @SuppressWarnings("deprecation")
                public override IStatus runInUIThread(IProgressMonitor monitor) {
                    DiagramViewManager.initializeView(instance, model, null, null);

                    val canvas = viewer.getControl() as Composite

                    val container = new Composite(canvas, SWT.BORDER) => [
                        setSize(400, 100)
                    ]
                    container.setLayout(new FillLayout)
                    container.visible = false

                    val text = new Text(container, SWT.WRAP)
                    text.setText("This is a longer text.")
//                    container.pack
                    canvas.layout(true, true)

                    return Status.OK_STATUS;
                }
            }.schedule
        } else {
            // update case
            val context = viewer.viewContext
            DiagramViewManager.updateView(context, model)
        }
    }
    
    /**
     * Returns the KNode representing the given state, or @code{null} if there is none.
     */
    def KNode getKNode(State state) {
        return viewer?.viewContext?.getTargetElement(state, KNode)
    }
    
    /**
     * Returns the KEdge representing the given transition, or @code{null} if there is none.
     */
    def KEdge getKEdge(Transition transition) {
        return viewer?.viewContext?.getTargetElement(transition, KEdge)
    }
    
}