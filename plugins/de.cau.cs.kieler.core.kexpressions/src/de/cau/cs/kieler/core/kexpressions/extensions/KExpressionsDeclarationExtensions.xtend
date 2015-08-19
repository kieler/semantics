/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.extensions

import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsDeclarationExtensions {
    
    def public Declaration createDeclaration() {
        KExpressionsFactory::eINSTANCE.createDeclaration
    }   
    
    def public Declaration createDeclaration(ValueType valueType) {
        KExpressionsFactory::eINSTANCE.createDeclaration => [
            type = valueType
        ]
    }   
    
    def public Declaration createIntDeclaration() {
        createDeclaration(ValueType::INT)
    }    

    def public Declaration createBoolDeclaration() {
        createDeclaration(ValueType::BOOL)
    }    
    
    def public Declaration createStringDeclaration() {
        createDeclaration(ValueType::STRING)
    }    
    
    def public Declaration createDeclaration(Declaration declaration) {
        createDeclaration => [
            type = declaration.type
            input = declaration.input
            output = declaration.output
            signal = declaration.signal
            static = declaration.static
            const = declaration.const
            extern = declaration.extern
            volatile = declaration.volatile
            hostType = declaration.hostType
        ]
    } 
    
    def Declaration applyAttributes(Declaration declaration, Declaration declarationWithAttributes) {
        declaration => [
            input = declarationWithAttributes.input
            output = declarationWithAttributes.output
            static = declarationWithAttributes.static
            const = declarationWithAttributes.const
            extern = declarationWithAttributes.extern
            type = declarationWithAttributes.type
        ]
    }
    
    def void delete(Declaration declaration) {
        declaration.valuedObjects.immutableCopy.forEach[ remove ]
        declaration.remove
    }
    
}