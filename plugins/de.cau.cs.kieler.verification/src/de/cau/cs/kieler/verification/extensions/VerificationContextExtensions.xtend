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
package de.cau.cs.kieler.verification.extensions

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.verification.VerificationContext
import de.cau.cs.kieler.kicool.environments.Environment

/** 
 * @author aas
 * @author als
 */
class VerificationContextExtensions {
    
    public static val IProperty<VerificationContext> VERIFICATION_CONTEXT = 
        new Property<VerificationContext>("de.cau.cs.kieler.verification.context")
    
    public static def VerificationContext createVerificationContext(CompilationContext context, boolean runModelChecker) {
        if (!context.hasVerificationContext()) {
            context.startEnvironment.setProperty(VERIFICATION_CONTEXT, new VerificationContext())
        }
        return context.verificationContext => [it.verify = runModelChecker]
    }
    
    public static def VerificationContext getVerificationContext(Environment env) {
        return env.getProperty(VERIFICATION_CONTEXT)
    }
    
    public static def VerificationContext getVerificationContext(CompilationContext context) {
        return context.startEnvironment.verificationContext
    }
    
    public static def VerificationContext getVerificationContext(CodeGeneratorModule<?, ?> codeGenModule) {
        return codeGenModule.processorInstance.compilationContext.verificationContext
    }
    
    public static def boolean hasVerificationContext(CompilationContext context) {
        return context.verificationContext !== null
    }
    
    public static def boolean hasVerificationContext(Environment env) {
        return env.verificationContext !== null
    }
}
