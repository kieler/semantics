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
package de.cau.cs.kieler.verification

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.verification.VerificationContext
import de.cau.cs.kieler.scg.processors.transformators.codegen.CodeGeneratorModuleBase

/** 
 * @author aas
 */
class VerificationContextExtensions {
    
    public static def VerificationContext asVerificationContext(CompilationContext context) {
        return context as VerificationContext
    }
    
    public static def VerificationContext getVerificationContext(CodeGeneratorModule<?, ?> codeGenModule) {
        return codeGenModule.processorInstance.compilationContext as VerificationContext
    }
    
    public static def VerificationContext getVerificationContext(CodeGeneratorModuleBase module) {
        return module.processorInstance.compilationContext.asVerificationContext
    }
}
