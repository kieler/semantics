/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.promela

import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kexpressions.ValuedObject

/** 
 * @author aas
 */
abstract class PromelaCodeGeneratorModuleBase extends SCGCodeGeneratorModule {
    protected static val TICK_LOOP_FUNCTION_NAME = "tick_loop"
    
    protected static val GUARD_PREFIX = "_g"
    protected static val PRE_GUARD_PREFIX = "_p"
    protected static val CONDITIONAL_GUARD_PREFIX = "_cg"
    
    protected def boolean isGuard(ValuedObject valuedObject) {
        return valuedObject.name.startsWith("_g")
    }

    protected def boolean isConditionGuard(ValuedObject valuedObject) {
        return valuedObject.name.startsWith("_cg")
    }

    protected def boolean isPreGuard(ValuedObject valuedObject) {
        return valuedObject.name.startsWith("_p")
    }
    
    protected def void appendIndentation() {
        indent(0) // The indentationModifier is always added
    }
    
    protected def void appendIndented(String s) {
        appendIndentation()
        code.append(s)
    }
    
    protected def void appendIndentedLine(String s) {
        appendIndented(s)
        code.append("\n")
    }
    
    protected def void generateSeparatorComment(String comment) {
        appendIndentation
        code.append("///////////////\n")
        appendIndentation
        code.append("// ").append(comment).append("\n")
    }
    
    protected def void incIndentationLevel() {
        indentationModifier = indentationModifier + 1
    }
    
    protected def void decIndentationLevel() {
        indentationModifier = indentationModifier - 1
    }
}
