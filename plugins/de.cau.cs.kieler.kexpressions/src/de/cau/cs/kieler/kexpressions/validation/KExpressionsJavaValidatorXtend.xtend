/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.validation

import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author ssm
 *
 */
class KExpressionsJavaValidatorXtend extends KExpressionsJavaValidator {

    public static val CONST_DECLARATION_EXPECTS_INITIALIZATION = "A const declaration must have an initialization part!";    
    
    @Check
    public def void checkConstInitialization(VariableDeclaration declaration) {
        if (declaration.isConst) {
            for(vo : declaration.valuedObjects) {
                if (vo.initialValue == null) {
                    error(CONST_DECLARATION_EXPECTS_INITIALIZATION, vo, null, -1)
                }
            }
        }
    }    
}