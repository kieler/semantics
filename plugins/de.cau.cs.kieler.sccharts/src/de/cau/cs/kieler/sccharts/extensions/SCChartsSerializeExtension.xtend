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

import com.google.common.base.Joiner
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.IterateAction
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import java.util.List

/**
 * @author ssm
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
    
    def dispatch CharSequence serialize(Declaration declaration) {
        val joiner = Joiner.on(" ");
        val parts = declaration.serializeComponents
        return joiner.join(parts.key) + joiner.join(parts.value);
    }
    
    override Pair<List<String>, List<String>> serializeComponents(Declaration declaration) {
        val keywords = newLinkedList;
        val content = newLinkedList;

        //Modifiers
        if (declaration.isExtern) {
            keywords += "extern";
        }
        if (declaration.isStatic) {
            keywords += "static ";
        }
        if (declaration.isConst) {
            keywords += "const";
        }
        if (declaration.isVolatile) {
            keywords += "volatile";
        }
        if (declaration.isInput) {
            keywords += "input";
        }
        if (declaration.isOutput) {
            keywords += "output"
        }
        if (declaration.isSignal) {
            keywords += "signal";
        }

        //Type
        val type = declaration.type;
        if (type == ValueType.PURE) {
            // Nothing - indicated by signal keyword
        } else if (type == ValueType.HOST) {
            keywords += declaration.hostType
        } else {
            keywords += type.serialize as String
        } 

        //Content
        val voIter = declaration.valuedObjects.iterator;
        while (voIter.hasNext) {
            val vo = voIter.next;
            val text = new StringBuilder(vo.serialize);
            if (vo.initialValue != null) {
                text.append(" = ");
                text.append(vo.initialValue.serialize);
            }
            if (voIter.hasNext) {
                text.append(",");
            }
            content += text.toString;
        }

        return new Pair(keywords, content);
    }
}