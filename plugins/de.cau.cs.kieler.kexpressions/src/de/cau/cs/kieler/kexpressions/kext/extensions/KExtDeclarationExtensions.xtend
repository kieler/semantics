/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.kext.extensions

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kexpressions.ValuedObject
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList

import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.Expression

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class KExtDeclarationExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def DeclarationScope asDeclarationScope(EObject eObject) {
        eObject as DeclarationScope
    }
    
    def getValuedObjects(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten
    }
    
    def getValuedObjectsList(DeclarationScope scope) {
        <ValuedObject>newLinkedList => [ ll |
            scope.declarations.forEach[d|d.valuedObjects.forEach[ll += it]]
        ]
    }
    
    def getPureSignals(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten.filter[ isPureSignal ]
    }

    def getValuedSignals(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten.filter[ isValuedSignal ]
    }

    def getSignals(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten.filter[ isSignal ]
    }

    def ValuedObject createValuedObject(DeclarationScope scope, String valuedObjectName, Declaration declaration) {
        val valuedObject = createValuedObject(valuedObjectName);
        declaration.valuedObjects += valuedObject
        if (!scope.declarations.contains(declaration)) {
            scope.declarations += declaration
        }
        valuedObject
    }
    
    def ValuedObject addValuedObject(DeclarationScope scope, ValuedObject valuedObject, Declaration declaration) {
        declaration.valuedObjects += valuedObject
        if (!scope.declarations.contains(declaration)) {
            scope.declarations += declaration
        }
        valuedObject
    }    
    
    def ValuedObject findValuedObjectByName(DeclarationScope scope, String name) {
        var EObject container = scope
        while (container !== null) {
            var EList<Declaration> declarations = null
            if (container instanceof DeclarationScope)
                declarations = (container as DeclarationScope).declarations
            if (!declarations.nullOrEmpty)
                for (declaration : declarations) {
                    val valuedObject = declaration.findValuedObjectByName(name)
                    if(valuedObject !== null) return valuedObject
                }
            container = container.eContainer
        }
        null
    }    
    
    def DeclarationScope getDeclarationScope(Declaration declaration) {
        if (declaration.eContainer instanceof DeclarationScope) return declaration.eContainer as DeclarationScope
        return null
    }
    
    def DeclarationScope getDeclarationScope(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration) return (valuedObject.eContainer as Declaration).declarationScope
        return null
    }
    
    def getValuedObject(DeclarationScope scope, int index) {
        scope.valuedObjects.get(index)
    }
    
    def getValuedObject(Declaration declaration, int index) {
        if (declaration instanceof ReferenceDeclaration) {
            if (declaration.reference instanceof DeclarationScope) 
                return (declaration.reference as DeclarationScope).getValuedObject(index)
        } 
        if (declaration.eContainer instanceof DeclarationScope) return (declaration.eContainer as DeclarationScope).getValuedObject(index)
        return null
    }
    
    def isReferenceDeclarationReference(Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            if (expression.valuedObject !== null && expression.valuedObject.eContainer !== null && 
                expression.valuedObject.eContainer instanceof ReferenceDeclaration
            ) return true
        }
        return false
    }
    
    def EObject getReferenceDeclarationReference(Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            if (expression.valuedObject.eContainer instanceof ReferenceDeclaration)
                return (expression.valuedObject.eContainer as ReferenceDeclaration).reference 
        }
        return null
    }
    
    def boolean isExternalReferenceDeclaration(ReferenceDeclaration declaration) {
        declaration.extern.size > 0
    }
    
}