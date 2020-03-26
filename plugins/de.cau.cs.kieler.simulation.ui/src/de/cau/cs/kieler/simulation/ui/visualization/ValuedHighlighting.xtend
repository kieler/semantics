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
package de.cau.cs.kieler.simulation.ui.visualization

import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.simulation.ide.visualization.Highlighting
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeLabelPlacement
import de.cau.cs.kieler.klighd.krendering.KFontSize
import de.cau.cs.kieler.klighd.krendering.KFontName
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * @author kolja
 * 
 */
class ValuedHighlighting extends Highlighting {

    extension KRenderingFactory = KRenderingFactory::eINSTANCE

    Object value
    KLabel label
    boolean highlightLine

    new(KLabeledGraphElement element, KForeground foreground, Object value, boolean highlightLine) {
        super(element, foreground)
        this.value = value
        this.highlightLine = highlightLine
    }

    override apply() {
        if( highlightLine )
            super.apply()
        if (label === null) {
            label = KGraphUtil::createInitializedLabel(element)
            label.text = "(" + String.valueOf(value) + ")";
            var text = createKText()
            text.styles.add(EcoreUtil.copy(foreground))
            text.styles.removeAll(text.styles.filter(typeof(KFontSize)).toList);
            text.styles += createKFontSize => [
                it.setSize(5)
            ];
            text.styles.removeAll(text.styles.filter(typeof(KFontName)).toList);
            text.styles += createKFontName => [
                it.setName(KlighdConstants::DEFAULT_FONT_NAME)
            ];
            label.data += text
            label.setProperty(CoreOptions::EDGE_LABELS_PLACEMENT, EdgeLabelPlacement::CENTER)
        }
    }

    override remove() {
        if (label !== null) {
            element.labels.remove(label)
            label = null
        }
        if( highlightLine )
            super.remove()
    }

    def getValue() {
        return value
    }
}
