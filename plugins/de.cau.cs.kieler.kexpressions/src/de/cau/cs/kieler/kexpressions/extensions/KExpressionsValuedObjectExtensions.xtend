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

import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.Declaration
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.Expression
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsValuedObjectExtensions {
    
    @Inject
    extension KExpressionsDeclarationExtensions
    
    def Declaration declaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration)
            valuedObject.eContainer as Declaration
        else
            null
    }
    
    def VariableDeclaration variableDeclaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof VariableDeclaration)
            valuedObject.eContainer as VariableDeclaration
        else
            null
    }    
    
    def ReferenceDeclaration referenceDeclaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof ReferenceDeclaration)
            valuedObject.eContainer as ReferenceDeclaration
        else
            null
    }  
    
    def asVariableDeclaration(EObject eObject) {
        eObject as VariableDeclaration
    }
    
    def asReferenceDeclaration(EObject eObject) {
        eObject as ReferenceDeclaration
    }
    
    // Create a ValuedObjectReference to a valuedObject
    def ValuedObjectReference reference(ValuedObject valuedObject) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference() => [
            setValuedObject(valuedObject)
        ]
    }    
    
    def boolean isModelReference(ValuedObject valuedObject) {
        valuedObject.declaration instanceof ReferenceDeclaration
    }
    
    def ValueType getType(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return ValueType::REFERENCE;
        valuedObject.variableDeclaration.type
    }
    
    def ImmutableList<ValuedObject> getValuedObjects(EObject eObject) {
        ImmutableList.copyOf(<ValuedObject> newArrayList => [ list |
            eObject.eContents.filter(Declaration).forEach[ list += valuedObjects ]
        ])
    }  
    
    def ValuedObject removeValuedObjectFromDeclaration(ValuedObject valuedObject, Declaration declaration) {
        declaration.valuedObjects -= valuedObject
        valuedObject
    }  
    
    def boolean isInput(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return false
        valuedObject.variableDeclaration.isInput
    }

    def boolean isOutput(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return false
        valuedObject.variableDeclaration.isOutput
    }

    def boolean isStatic(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return false
        valuedObject.variableDeclaration.isStatic
    }

    def boolean isConst(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return false
        valuedObject.variableDeclaration.isConst
    }

    def boolean isExtern(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return false
        valuedObject.variableDeclaration.isExtern
    }

    def boolean isArray(ValuedObject valuedObject) {
        !valuedObject.cardinalities.nullOrEmpty
    }

    def boolean isSignal(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return false
        valuedObject.variableDeclaration.isSignal
    }   
    
    def ValuedObject createValuedObject() {
        KExpressionsFactory::eINSTANCE.createValuedObject()
    }

    def ValuedObject createValuedObject(String valuedObjectName) {
        createValuedObject() => [
            setName(valuedObjectName)
        ]
    }     

    def Declaration attach(Declaration declaration, ValuedObject valuedObject) {
        declaration => [ valuedObjects += valuedObject ]
    } 
    
    def ValuedObject attachTo(ValuedObject valuedObject, Declaration declaration) {
        valuedObject => [ declaration.valuedObjects += valuedObject ]
    }         
    
    
    def ValuedObject applyAttributes(ValuedObject valuedObject, ValuedObject valuedObjectWithAttributes) {
        if (valuedObjectWithAttributes.initialValue != null) {
            valuedObject.setInitialValue(valuedObjectWithAttributes.initialValue.copy)
        }
        if (valuedObjectWithAttributes.combineOperator != null) {
            valuedObject.setCombineOperator(valuedObjectWithAttributes.combineOperator)
        }
        if (!valuedObjectWithAttributes.cardinalities.nullOrEmpty) {
            for (card : valuedObjectWithAttributes.cardinalities) {
                valuedObject.cardinalities.add(card);
            }
        }        
        valuedObject
    }
    
    def List<ValuedObjectReference> getAllReferences(Expression expression) {
        <ValuedObjectReference> newArrayList => [
        	if (expression == null) {
        	} else if (expression instanceof ValuedObjectReference) { 
        		it += expression
        	} else { 
        		it += expression.eAllContents.filter(ValuedObjectReference).toList
        	}
        ]  
    }    
    
    def void deleteAndCleanup(ValuedObject valuedObject) {
        val declaration = valuedObject.declaration
        valuedObject.remove
        if (declaration.valuedObjects.nullOrEmpty) { 
            declaration.remove
        }
    }
    
    


    def Declaration getDeclarationOrCreate(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration) {
            valuedObject.eContainer as Declaration
        } else {
            val newDeclaration = createVariableDeclaration;
            newDeclaration.valuedObjects += valuedObject
            newDeclaration
        }
    }

}