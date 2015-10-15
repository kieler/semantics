/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.IterateAction
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions

/**
 * @author ssm
 *
 * @kieler.design 2014-09-04 proposed ssm
 * @kieler.rating 2014-09-04 proposed yellow
 */
class SCChartsSerializeExtension extends KEffectsSerializeExtensions {
    
    def dispatch CharSequence serialize(Transition transition) {
        var label = ""
        if (transition.trigger != null) { 
            if (transition.delay > 1) {
                label = label + transition.delay.toString + " "
            }
            label = label + transition.trigger.serialize as String
        }
        if (!transition.effects.empty) {
            label = label + " / " + transition.effects.serialize
            label = label.trim
        }
        label
    }
    
    def dispatch CharSequence serialize(Action action) {
        var label = "";
        if (action.immediate) { 
            label = label + "immediate ";
        }
        if (action instanceof EntryAction) { 
            label = label + "entry "
        }
        else if (action instanceof DuringAction) {
            label = label + "during "
        }
        else if (action instanceof ExitAction) {
            label = label + "exit "
        }
        else if (action instanceof IterateAction) {
            label = label + "iterate "
        }
        
        if (action.trigger != null) {
            var trigger = action.trigger.serialize as String
            label = label + trigger;
        }
        if (!action.effects.empty) {
            label = label + " / " + action.effects.serialize
            label = label.trim
        }
        label        
    }
}