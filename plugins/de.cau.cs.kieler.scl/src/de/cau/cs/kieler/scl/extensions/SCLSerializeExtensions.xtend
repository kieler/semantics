/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scl.extensions

import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.scl.Scope
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Return
import de.cau.cs.kieler.scl.Assignment

/**
 * @author als
 */
class SCLSerializeExtensions extends KEffectsSerializeHRExtensions {

    def dispatch CharSequence serialize(Pause pause) {
        return "pause;"
    }

    def dispatch CharSequence serialize(Label label) {
        return label.name + ":"
    }
    
    def dispatch CharSequence serialize(Goto goto) {
        return "goto " + goto.target.name + ";"
    }
    
    def dispatch CharSequence serialize(Return ret) {
        return "return " + ret.expression.serializeHR + ";"
    }
    
    def dispatch CharSequence serialize(Assignment assignment) {
        if (assignment.expression === null) {
            return assignment.serializeAssignment(";")
        } else {
            return assignment.serializeAssignment(assignment.expression.serializeHR) + ";"
        }
    }
    
    def dispatch CharSequence serialize(Conditional cond) {
        return "if (" + cond.expression.serializeHR + ") {"
            + cond.declarations.map[serialize].join("; ") + cond.statements.map[serialize].join(" ") + "}"
            + if (cond.^else !== null) " else " + cond.^else.serialize else ""
    }
    
    def dispatch CharSequence serialize(Parallel par) {
        return "fork " + par.threads.map[serialize].join(" par ") + " join;"
    }
    
    def dispatch CharSequence serialize(Scope scope) {
        return "{" + scope.declarations.map[serialize].join("; ") + scope.statements.map[serialize].join(" ") + "}"
    }
}