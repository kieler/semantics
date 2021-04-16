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

import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.kexpressions.AccessModifier
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.Return
import de.cau.cs.kieler.scl.Scope

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
    
    def dispatch CharSequence serialize(Declaration declaration) {
        val components = newArrayList

        // Modifiers
        if (declaration instanceof VariableDeclaration) {
            if (declaration.access == AccessModifier.PRIVATE) {
                components.add("private")
            }
            if (declaration.access == AccessModifier.PROTECTED) {
                components.add("protected")
            }
            if (declaration.isExtern) {
                components.add("extern")
            }
            if (declaration.isGlobal) {
                components.add("global")
            }
            if (declaration.isStatic) {
                components.add("static")
            }
            if (declaration.isConst) {
                components.add("const")
            }
            if (declaration.isVolatile) {
                components.add("volatile")
            }
            if (declaration.isInput) {
                components.add("input")
            }
            if (declaration.isOutput) {
                components.add("output")
            }
            if (declaration.isSignal) {
                components.add("signal")
            }

            // Type
            val type = declaration.type;
            if (type == ValueType.PURE) {
                // Nothing - indicated by signal keyword
            } else if (type == ValueType.HOST) {
                components.add(declaration.hostType)
            } else if (type == ValueType.CLOCK) {
                components.add("clock")
            }  else if (type == ValueType.STRUCT) {
                if ((declaration as ClassDeclaration).host) components.add("host")
                components.add("struct")
            }  else if (type == ValueType.CLASS) {
                if ((declaration as ClassDeclaration).host) components.add("host")
                components.add("class")
            } else {
                components.add(type.serialize)
            }
        }

        // Content
        val voIter = declaration.valuedObjects.iterator;
        while (voIter.hasNext) {
            val vo = voIter.next;
            components.add(vo.serialize)
            if (vo.initialValue !== null) {
                components.add("=")
                components.add(vo.initialValue.serialize)
            }
            if (voIter.hasNext) {
                components.add(",");
            }
        }

        return components.join(" ")
    }
}