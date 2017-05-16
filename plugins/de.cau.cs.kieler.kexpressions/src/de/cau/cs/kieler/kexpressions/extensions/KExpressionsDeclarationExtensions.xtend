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
package de.cau.cs.kieler.kexpressions.extensions

import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValueType
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.emf.ecore.EObject
import java.util.List
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.StringValue

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
    
    
    def public Declaration createSignalDeclaration() {
        val decl = createDeclaration(ValueType::PURE)
        decl.signal = true
        decl
    }    
    
    def public Declaration createIntDeclaration() {
        createDeclaration(ValueType::INT)
    }    

    def public Declaration createBoolDeclaration() {
        createDeclaration(ValueType::BOOL)
    }    

    def public Declaration createFloatDeclaration() {
        createDeclaration(ValueType::FLOAT)
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
    
    def Declaration createDeclaration(Value value) {
        if (value instanceof IntValue) createIntDeclaration
        else if (value instanceof BoolValue) createBoolDeclaration
        else if (value instanceof FloatValue) createFloatDeclaration
        else if (value instanceof StringValue) createStringDeclaration
        else createDeclaration
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
    
    public def List<Declaration> copyDeclarations(EObject source) {
        <Declaration> newArrayList => [ targetList | 
            for (declaration : source.eContents.filter(typeof(Declaration))) {
                // @als: is this trace necessary?
                targetList += createDeclaration(declaration).trace(declaration) => [ newDec |
                    declaration.valuedObjects.forEach[ _copyValuedObject(newDec) ]
                ]
            }
        ]
    }
    
    private def void _copyValuedObject(ValuedObject sourceObject, Declaration targetDeclaration) {
        val newValuedObject = sourceObject.copy
        targetDeclaration.valuedObjects += newValuedObject
    }            
    
}