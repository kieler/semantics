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

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.EcoreUtilExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class KExtDeclarationExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KEffectsExtensions
    @Inject extension EcoreUtilExtensions
    
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
    
    def DeclarationScope getClosestDeclarationScope(EObject eObject) {
        if (eObject === null) return null
        if (eObject instanceof DeclarationScope) return eObject
        return eObject.eContainer.getClosestDeclarationScope
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
    
    def ValuedObjectMapping copyScopeDeclarations(
        DeclarationScope source, DeclarationScope target) {
        val map = new ValuedObjectMapping
        for (declaration : source.declarations) {
            val newDeclaration = createDeclaration(declaration)
            declaration.valuedObjects.forEach[ 
                map.put(it, <ValuedObject> newLinkedList(it.copyValuedObject(newDeclaration)))
            ]
            target.declarations += newDeclaration
        }
        map
    }   
    
    def ValuedObject copyValuedObject(ValuedObject sourceObject, Declaration targetDeclaration) {
        sourceObject.copy => [
            targetDeclaration.valuedObjects += it
        ]
    }    
    
    
    def ValuedObject getValuedObjectCopy(ValuedObject valuedObject, 
        ValuedObjectMapping map
    ) {
        if (valuedObject === null) {
            throw new IllegalArgumentException("Can't copy valued object. Valued object is null!")
        }
        val vo = map.get(valuedObject).peek
        if (vo === null) {
            return valuedObject // TODO: Remove
            //throw new Exception("Valued Object not found! ["+valuedObject.name+"]")
        }
        vo
    }    

    def ValuedObject getValuedObjectCopyWNULL(ValuedObject valuedObject,
        ValuedObjectMapping map
    ) {
        if (valuedObject === null) {
            return null
        }
        val vo = map.get(valuedObject)?.peek
        if (vo === null) {
            throw new Exception("Valued Object not found! ["+valuedObject.name+"]")
        }
        vo
    }    
    
    def ValuedObject addToValuedObjectMapping(ValuedObject source, ValuedObject target, ValuedObjectMapping map) {
        map.addValuedObjectMapping(source, target)
        target      
    }     
    
    public def addValuedObjectMapping(ValuedObjectMapping map, ValuedObject source, ValuedObject target) {
        val deque = map.get(source) 
        if (deque === null) {
            map.put(source, <ValuedObject> newLinkedList(target))
        } else {
            deque.push(target)
        }
    }      
    
    def Expression copyExpression(Expression expression, ValuedObjectMapping map) {
        val newExpression = expression.copy
        
        if (newExpression instanceof ValuedObjectReference) {
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.getValuedObjectCopy(map)                    
        } else {
            if (newExpression !== null)
                newExpression.eAllContents.filter(typeof(ValuedObjectReference)).
                   forEach[ valuedObject = valuedObject.getValuedObjectCopy(map) ]        
        }
        newExpression
    }            
    
    def Assignment copyAssignment(Assignment assignment, ValuedObjectMapping map) {
        KEffectsFactory.eINSTANCE.createAssignment => [ s |
            s.valuedObject = assignment.valuedObject.getValuedObjectCopyWNULL(map)
            s.expression = assignment.expression.copyExpression(map)
            s.operator = assignment.operator
            assignment.indices?.forEach[
                s.indices += it.copyExpression(map)
            ] 
        ]
    } 
    
}