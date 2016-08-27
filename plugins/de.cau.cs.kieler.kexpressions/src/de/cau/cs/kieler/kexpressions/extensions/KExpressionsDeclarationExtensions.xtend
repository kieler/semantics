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
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import com.google.common.collect.ImmutableList

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsDeclarationExtensions {
    
    def dispatch Declaration createDeclaration(VariableDeclaration declaration) {
        declaration.createVariableDeclaration
    }
    
    def dispatch Declaration createDeclaration(ReferenceDeclaration declaration) {
        declaration.createReferenceDeclaration
    }
    
    /**
     * @deprecated
     */
    def VariableDeclaration createDeclaration() {
        createVariableDeclaration
    }   
    
    def VariableDeclaration createVariableDeclaration() {
        KExpressionsFactory::eINSTANCE.createVariableDeclaration
    }   
    
    def VariableDeclaration createVariableDeclaration(ValueType valueType) {
        KExpressionsFactory::eINSTANCE.createVariableDeclaration => [
            type = valueType
        ]
    }   
    
    def VariableDeclaration createIntDeclaration() {
        createVariableDeclaration(ValueType::INT)
    }    

    def VariableDeclaration createBoolDeclaration() {
        createVariableDeclaration(ValueType::BOOL)
    }    
    
    def VariableDeclaration createStringDeclaration() {
        createVariableDeclaration(ValueType::STRING)
    }    
    
    def VariableDeclaration createVariableDeclaration(VariableDeclaration declaration) {
        (createVariableDeclaration as VariableDeclaration) => [
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
    
    def VariableDeclaration applyAttributes(VariableDeclaration declaration, VariableDeclaration declarationWithAttributes) {
        declaration => [
            input = declarationWithAttributes.input
            output = declarationWithAttributes.output
            static = declarationWithAttributes.static
            const = declarationWithAttributes.const
            extern = declarationWithAttributes.extern
            type = declarationWithAttributes.type
        ]
    }
    
    def ReferenceDeclaration createReferenceDeclaration() {
        KExpressionsFactory::eINSTANCE.createReferenceDeclaration
    } 
    
    def ReferenceDeclaration createReferenceDeclaration(ReferenceDeclaration declaration) {
        (createReferenceDeclaration as ReferenceDeclaration) => [
            reference = declaration.reference
        ]
    }
    
    def void delete(Declaration declaration) {
        declaration.valuedObjects.immutableCopy.forEach[ remove ]
        declaration.remove
    }
    
    def List<Declaration> copyDeclarations(EObject source) {
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
    
    
    def ImmutableList<VariableDeclaration> getVariableDeclarations(EObject eObject) {
        ImmutableList.copyOf(<VariableDeclaration> newArrayList => [ list |
            eObject.eContents.filter(typeof(VariableDeclaration)).forEach[ list += it ]
        ])
    }  
    
    def ImmutableList<ReferenceDeclaration> getReferenceDeclarations(EObject eObject) {
        ImmutableList.copyOf(<ReferenceDeclaration> newArrayList => [ list |
            eObject.eContents.filter(typeof(ReferenceDeclaration)).forEach[ list += it ]
        ])
    }      
    
}