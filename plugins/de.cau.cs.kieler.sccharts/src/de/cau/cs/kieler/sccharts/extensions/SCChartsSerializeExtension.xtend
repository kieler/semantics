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
import com.google.common.base.Joiner
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.IterateAction
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import java.util.List
import org.eclipse.emf.common.util.EList

/**
 * @author ssm als
 * 
 * @kieler.design 2014-09-04 proposed ssm
 * @kieler.rating 2014-09-04 proposed yellow
 */
class SCChartsSerializeExtension extends KEffectsSerializeExtensions {
    
   
    def dispatch CharSequence serialize(Transition transition) {
        val label = new StringBuilder();

        if (transition.trigger != null) {
            if (transition.delay > 1) {
                label.append(transition.delay.toString).append(" ");
            }
            label.append(transition.trigger.serialize);
        }

        if (!transition.effects.empty) {
            label.append(" / ")
            label.append(transition.effects.serialize);
        }

        return label.toString;
    }

    def dispatch CharSequence serialize(Action action) {
        val joiner = Joiner.on(" ");
        val parts = action.serializeComponents
        return joiner.join(parts.key) + joiner.join(parts.value);
    }

    def Pair<List<String>, List<String>> serializeComponents(Action action) {
        val keywords = newLinkedList;
        val content = newLinkedList;

        if (action.immediate) {
            keywords += "immediate";
        }

        keywords += switch action {
            EntryAction: "entry"
            DuringAction: "during"
            ExitAction: "exit"
            SuspendAction case action.isWeak: "weak suspend"
            SuspendAction: "suspend"
            IterateAction: "iterate"
            default: ""
        }

        if (action.trigger != null) {
            content += action.trigger.serialize as String
        }

        if (!action.effects.empty) {
            content += "/"
            content += action.effects.serialize as String
        }

        return new Pair(keywords, content);
    }
}