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
package de.cau.cs.kieler.scg.processors.transformators.codegen

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule

/** 
 * @author aas
 */
abstract class CodeGeneratorModuleBase extends SCGCodeGeneratorModule {
    @Inject extension KExpressionsValuedObjectExtensions
    
    protected static val GUARD_PREFIX = "_g"
    protected static val PRE_GUARD_PREFIX = "_p"
    protected static val CONDITIONAL_GUARD_PREFIX = "_cg"
    
    abstract protected def String getLineCommentToken()
    
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
        #[1..5].forEach[code.append(lineCommentToken)]
        code.append("\n")
        appendIndentation
        code.append(lineCommentToken).append(" ").append(comment).append("\n")
    }
    
    protected def void incIndentationLevel() {
        indentationModifier = indentationModifier + 1
    }
    
    protected def void decIndentationLevel() {
        indentationModifier = indentationModifier - 1
    }
    
    /**
     * Adds the header for KIELER generated code.
     */
    protected def void addHeader(StringBuilder sb) {
        sb.append("/*\n" +
                  " * Automatically generated code by\n" +
                  " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                  " *\n" +
                  " * http://rtsys.informatik.uni-kiel.de/kieler\n" +
                  " */\n\n") 
    }
}
