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
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.layout.FillLayout
import org.eclipse.swt.widgets.Text
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import org.eclipse.swt.widgets.Display
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig

/**
 * @author stu121235
 *
 */
class DebugDiagramView extends DiagramViewPart {
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.debugDiagram"
    
    static var DebugDiagramView instance
    
    var needsInit = true
    
    new() {
        super()
        instance = this
        
    }
    
    static def void updateView(Object model) {
        if (instance !== null) {
            instance.updateDiagram(model)
        }
    }
    
    static def DebugDiagramView getInstance() {
//        if (instance === null) {
//            instance = new DebugDiagramView
//        }
        return instance
    }
    
    static def clearInstance() {
        instance = null
    }
    
    static def setInstance(DebugDiagramView view) {
        instance = view
        instance.needsInit = true
    }
    
    def needsInit() {
        return needsInit
    }
    
    def void updateDiagram(Object model) {
        
        if (viewer === null || viewer.viewContext === null || needsInit) {
            
            Display.^default.syncExec(new Runnable {
                override void run() {
                    initialize(model, null, new KlighdSynthesisProperties);

                    val canvas = viewer.control as Composite

                    val container = new Composite(canvas, SWT.BORDER) => [
                        setSize(400, 100)
                    ]
                    container.setLayout(new FillLayout)
                    container.visible = false

                    val text = new Text(container, SWT.WRAP)
                    text.setText("This is a longer text.")
                    container.pack
                    canvas.layout(true, true)
                }
            })
            needsInit = false
        } else {
            // update case
            val context = viewer.viewContext
            val config = new LightDiagramLayoutConfig(context).model(model).animate(false)
            config.performUpdate
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
    
    override void dispose() {
        super.dispose()
        instance = null
    }
}