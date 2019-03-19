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
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import de.cau.cs.kieler.verification.InvariantAssumption

import static extension de.cau.cs.kieler.verification.VerificationContextExtensions.*
import static extension de.cau.cs.kieler.verification.codegen.SmvCodeGeneratorExtensions.*

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorInvarModule extends SmvCodeGeneratorModuleBase {

    override getName() {
        return class.simpleName;
    }

    override generateInit() {
        
    }
    
    override generate() {
        val assumptions = verificationContext?.verificationAssumptions
        
        if(assumptions.isNullOrEmpty) {
            return
        }
        
        for(assumption : assumptions) {
            if(assumption instanceof InvariantAssumption) {
                incIndentationLevel
                appendIndentedLine("INVAR")
                
                incIndentationLevel
                appendIndentedLine('''«assumption.formula.toSmvExpression»;''')
                decIndentationLevel
                
                decIndentationLevel
            }
        }
    }

    override generateDone() {
    }
}
