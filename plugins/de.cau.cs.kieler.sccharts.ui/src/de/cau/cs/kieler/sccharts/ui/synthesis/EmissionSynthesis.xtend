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
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.EquationStyles
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions

/**
 * @author lgr
 *
 */
@ViewSynthesisShared
class EmissionSynthesis extends SubSynthesis<Emission, KNode> {
    
    protected static val SIGNAL_EMISSION = "SignalEmission"
    protected static val DEFAULT_FIGURE_KEY = "OperatorExpression"
    
    @Inject extension EquationStyles
    @Inject extension SCChartsSerializeHRExtensions
    
    static val SIGNAL_TEXT_SIZE = 9
    static val PADDING_SIGNAL_LEFT = 2
    static val PADDING_SIGNAL_RIGHT = 8
    
    protected val defaultFigures = #{
        DEFAULT_FIGURE_KEY -> 'OperatorExpression.kgt',
        SIGNAL_EMISSION -> 'SignalEmission.kgt'
    }
    
    override performTranformation(Emission element) {
        null
    }
    
    def performTransformation(List<Emission> emissions, KNode rootNode) {
        var nodes = <KNode>newLinkedList
        
        for (emission : emissions) {
            val node = getKGTFromBundle(defaultFigures.get(SIGNAL_EMISSION))
            var text = emission.reference.valuedObject.name
            if (emission.newValue !== null) {
                text += "(" + emission.newValue.serializeHR + ")"
                
            }
            node.addNodeLabelWithPadding(text, SIGNAL_TEXT_SIZE, PADDING_SIGNAL_LEFT, PADDING_SIGNAL_RIGHT)
            nodes += node
        }
        
        return nodes
    }
    
}