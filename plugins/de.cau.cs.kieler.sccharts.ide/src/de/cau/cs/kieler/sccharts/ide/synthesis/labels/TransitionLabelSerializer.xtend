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
package de.cau.cs.kieler.sccharts.ide.synthesis.labels

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import java.util.List

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TransitionLabelSerializer {
    @Inject extension SCChartsSerializeHRExtensions
    
    def String serializeLabel(Transition transition, boolean userlabel) {
        transition.serializeMultilineLabel(userlabel).map[trim].join(" ")
    }
    
    def List<String> serializeMultilineLabel(Transition transition, boolean userlabel) {
        val parts = <String>newLinkedList
        val part = new StringBuilder
        var effectPrefix = new StringBuffer
        
        if (transition.label.nullOrEmpty || !userlabel) {
            // Prio
            if (transition.sourceState.outgoingTransitions.size > 1) {
                part.append(transition.sourceState.outgoingTransitions.indexOf(transition) + 1).append(": ")
            }
            
            // Probability
            if (transition.triggerProbability > 0) {
                part.append("Pr=" + transition.triggerProbability).append(": ")
            }
            
            // Trigger
            if (transition.trigger != null) {
                if (transition.triggerDelay > 1) {
                    part.append(transition.triggerDelay).append(" ");
                }
                part.append(transition.trigger.serializeHR);
                parts.add(part.toString)
            } else {
                effectPrefix.append(part)
            }

            // Effects
            if (parts.empty && transition.effects.empty) {
                // Only priority
                parts.add(effectPrefix.toString)
            } else {
                effectPrefix.append("/ ")
                for (effect : transition.effects.indexed) {
                    part.length = 0 // clear part
                    part.append(effectPrefix)
                    part.append(effect.value.serializeHR)
                    if (effect.key < transition.effects.size - 1) part.append(";")
                    
                    parts.add(part.toString)

                    // Convert prefix to indentation
                    for (var i = 0; i < effectPrefix.length; i++) {
                        effectPrefix.setCharAt(i, ' ')
                    }
                }
            }
        } else {
            parts.add(transition.label);
        }
        return parts
    }
}