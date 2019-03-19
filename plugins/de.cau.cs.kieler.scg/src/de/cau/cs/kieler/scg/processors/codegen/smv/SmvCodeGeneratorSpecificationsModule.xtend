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
package de.cau.cs.kieler.scg.processors.codegen.smv

import de.cau.cs.kieler.verification.VerificationProperty

import static extension de.cau.cs.kieler.verification.codegen.CodeGeneratorExtensions.*
import static extension de.cau.cs.kieler.verification.codegen.SmvCodeGeneratorExtensions.*
import static extension de.cau.cs.kieler.verification.VerificationContextExtensions.*

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorSpecificationsModule extends SmvCodeGeneratorModuleBase {
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
    }
    
    override generate() {
        val verificationProperties = verificationContext?.verificationProperties
        if(verificationProperties.isNullOrEmpty) {
            return
        }
        
        for(property : verificationProperties) {
            val specName = property.getSmvSpecName
            appendIndentedLine('''«specName»''')
            incIndentationLevel
            appendIndentedLine('''«property.name.toIdentifier» := «property.formula.toSmvExpression»;''')
            decIndentationLevel
        }
    }
    
    override generateDone() {
    }

    private def String getSmvSpecName(VerificationProperty property) {
        switch(property.type) {
            case INVARIANT : return "INVARSPEC NAME"
            case LTL : return "LTLSPEC NAME"
            case CTL : return "CTLSPEC NAME"
            default : throw new Exception("Cannot translate VerificationProperty '"+property+"' to SMV code")
        }
    }
}
