/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.highlighting

import com.google.common.collect.Iterables
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KStyle
import de.cau.cs.kieler.klighd.krendering.KText
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 *
 */
class Highlight {
    /**
     * A property to mark that a style is used for highlighting.
     */
    protected val HIGHLIGHTING_MARKER = new Property<Object>("highlighting");
    
    public KLabeledGraphElement element
    public KForeground foreground
    public EObject eObject
    
    /**
     * Constructor
     * 
     */
    new(KLabeledGraphElement element, KForeground foreground) {
        this.element = element
        this.foreground = foreground
    }
    
    /**
     * Constructor
     * 
     */
    new(KLabeledGraphElement element, KForeground foreground, EObject eObject) {
        this.element = element
        this.foreground = foreground
        this.eObject = eObject
    }
    
    /**
     * Highlights the element with the foreground.
     */
    public def void apply() {
        // Remember that this style is to highlight the diagram.
        // This is used to filter for highlighting styles when they should be removed.
        foreground.setProperty(HIGHLIGHTING_MARKER, this)
        // Highlight container of this element
        val ren = element.getData(typeof(KContainerRendering))
        ren.styles.add(EcoreUtil.copy(foreground))
        // Highlight label of this element
        if (!element.labels.isNullOrEmpty) {
            val label = element.labels.get(0)
            val ren2 = label.getData(typeof(KText))
            ren2.styles.add(EcoreUtil.copy(foreground))
        }
    }
    
    /**
     * Removes the highlighting.
     */
    public def void remove() {
        // Remove highlighting from container of this element
        val ren = element.getData(typeof(KContainerRendering));
        Iterables.removeIf(ren.styles, [it.isHighlighting]);
        // Remove highlighting from label of this element
        if (!element.labels.isNullOrEmpty) {
            val label = element.labels.get(0)
            val ren2 = label.getData(typeof(KText));
            Iterables.removeIf(ren2.styles, [it.isHighlighting]);
        }
    }
    
    /**
     * Checks if the given style has been used to highlight the diagram. 
     */
    protected def boolean isHighlighting(KStyle style) {
        return style.getProperty(HIGHLIGHTING_MARKER) == this
    }
}