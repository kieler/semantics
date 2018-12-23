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

import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule

/** 
 * @author aas
 */
abstract class CodeGeneratorModuleBase extends SCGCodeGeneratorModule {
    
    abstract def String getLineCommentToken()
    
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
        for(i : 1..5) { code.append(lineCommentToken) }
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
