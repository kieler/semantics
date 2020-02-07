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
package de.cau.cs.kieler.sccharts.ui.debug.highlighting

import de.cau.cs.kieler.simulation.ui.visualization.Highlighting
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.krendering.KForeground
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.klighd.krendering.KBackground
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KText
import org.eclipse.elk.graph.properties.Property
import java.util.List
import de.cau.cs.kieler.klighd.krendering.KStyle
import de.cau.cs.kieler.sccharts.ui.debug.view.DebugDiagramView
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.State

/**
 * Extension of the regular Highlighting class with two main differences.
 * This version also supports highlighting via background, not only foregrounds.
 * Also, it allows to selectively remove markers of one type while not clearing the others.
 * 
 * @author stu121235
 * 
 */
class DebugHighlighting extends Highlighting {

    private val KBackground background

    private static val Property<String> MARKER_TYPE_PROPERTY = new Property<String>("Marker Type")

    new(KLabeledGraphElement element, KForeground foreground) {
        super(element, foreground)
        background = null
    }

    new(KLabeledGraphElement element, KForeground foreground, EObject obj) {
        super(element, foreground, obj)
        background = null
    }

    new(KLabeledGraphElement element, KBackground background, EObject obj) {
        super(element, null, obj)
        this.background = background
    }

    def void reapply() {
        if (eObject === null) {
            println("Can't reapply highlighting: Unknown EObject.")
            return
        }
        
        // Reload KGraphElements from newly synthesized view model
        if (eObject instanceof Transition) {
            element = DebugDiagramView.instance.getKEdge(eObject)
        } else if (eObject instanceof State) {
            element = DebugDiagramView.instance.getKNode(eObject)
        }
        
        // Then apply the same highlighting to the new element
        apply
    }

    override void apply() {
        if (foreground !== null) {
            super.apply()
        } else {
            // Remember that this style is to highlight the diagram.
            // This is used to filter for highlighting styles when they should be removed.
            background.setProperty(HIGHLIGHTING_MARKER, this)
            // Highlight container of this element
            val ren = element.getData(typeof(KContainerRendering))
            ren.styles.add(EcoreUtil.copy(background))
            // Highlight label of this element
            if (!element.labels.isNullOrEmpty) {
                val label = element.labels.get(0)
                val ren2 = label.getData(typeof(KText))
                if (ren2 !== null) {
                    ren2.styles.add(EcoreUtil.copy(foreground))
                }
            }
        }
    }
    
    override void removeHighlighting(List<KStyle> styles) {
        if (foreground !== null) {
            for(s : styles.clone) {
                // Make sure to only remove the highlighting using foregrounds
                if(s.isHighlighting && !s.hasProperty(MARKER_TYPE_PROPERTY)) {
                        styles.remove(s)
                }
            }
        } else {
            for(s : styles.clone) {
                // Make sure to only remove the highlighting corresponding to this marker type
                if(s.isHighlighting && s.hasProperty(MARKER_TYPE_PROPERTY)) {
                    styles.remove(s)
                }
            }
        }
    }
}
