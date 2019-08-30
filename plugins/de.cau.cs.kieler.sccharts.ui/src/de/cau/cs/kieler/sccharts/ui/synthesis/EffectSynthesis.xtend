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

import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import java.util.List
import com.google.inject.Inject

/**
 * @author lgr
 *
 */
@ViewSynthesisShared
class EffectSynthesis extends SubSynthesis<Effect, KNode> {
    
    @Inject extension EquationSynthesis
    @Inject extension EmissionSynthesis
    
    @Inject EquationSynthesis equationSynthesis
    @Inject EmissionSynthesis emissionSynthesis
    
    override getDisplayedSynthesisOptions() {
        var options = newArrayList
        options.addAll(equationSynthesis.displayedSynthesisOptions)
        options.addAll(emissionSynthesis.displayedSynthesisOptions)
        
        return options
    }
    
    override performTranformation(Effect element) {
        null
    }
    
    def performTransformation(List<Effect> effects, KNode rootNode) {
        var nodes = <KNode>newLinkedList

        var assignments = effects.filter(Assignment).toList
        nodes = assignments.performTranformation(rootNode)
        
        var emissions = effects.filter(Emission).toList
        nodes += emissions.performTransformation(rootNode)
        
        return nodes
    }

}