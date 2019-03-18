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
public abstract class CodeGeneratorModuleBase extends SCGCodeGeneratorModule {
    
    abstract def String getLineCommentToken()
    
    protected def void appendIndentation() {
        // Add the indentation once.
        // The 0 is for adding no additional indentation to the current indentation level.
        indent(0)
    }
    
    protected def void appendIndentedLine(String s) {
        appendIndentation()
        code.append(s).append("\n")
    }
    
    protected def void appendIndentedComment(String comment) {
        appendIndentedLine(lineCommentToken + " " + comment)
    }
    
    protected def void incIndentationLevel() {
        indentationModifier = indentationModifier + 1
    }
    
    protected def void decIndentationLevel() {
        indentationModifier = indentationModifier - 1
    }
}
