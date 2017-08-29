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
package de.cau.cs.kieler.sccharts.legacy.kexpressions.extensions

import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Declaration
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.legacy.kexpressions.KExpressionsFactory
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Expression
import com.google.common.collect.ImmutableList

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsValuedObjectExtensions {
    
    @Inject
    extension KExpressionsDeclarationExtensions
    
    def public Declaration declaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration)
            valuedObject.eContainer as Declaration
        else
            null
    }     
    
    // Create a ValuedObjectReference to a valuedObject
    def ValuedObjectReference reference(ValuedObject valuedObject) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference() => [
            setValuedObject(valuedObject)
        ]
    }    
    
    def public ValueType getType(ValuedObject valuedObject) {
        valuedObject.declaration.type
    }
    
    def public ImmutableList<ValuedObject> getValuedObjects(EObject eObject) {
        ImmutableList.copyOf(<ValuedObject> newArrayList => [ list |
            eObject.eContents.filter(typeof(Declaration)).forEach[ list += valuedObjects ]
        ])
    }  
    
    def public ValuedObject removeValuedObjectFrom(ValuedObject valuedObject, Declaration declaration) {
        declaration.valuedObjects -= valuedObject
        valuedObject
    }  
    
    def public boolean isInput(ValuedObject valuedObject) {
        valuedObject.declaration.isInput
    }

    def public boolean isOutput(ValuedObject valuedObject) {
        valuedObject.declaration.isOutput
    }

    def public boolean isStatic(ValuedObject valuedObject) {
        valuedObject.declaration.isStatic
    }

    def public boolean isConst(ValuedObject valuedObject) {
        valuedObject.declaration.isConst
    }

    def public boolean isExtern(ValuedObject valuedObject) {
        valuedObject.declaration.isExtern
    }

    def public boolean isArray(ValuedObject valuedObject) {
        !valuedObject.cardinalities.nullOrEmpty
    }

    def public boolean isSignal(ValuedObject valuedObject) {
        valuedObject.declaration.isSignal
    }   

    def public boolean isValuedSignal(ValuedObject valuedObject) {
        valuedObject.declaration.isSignal && valuedObject.type != ValueType::PURE
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
        declaration => [
            valuedObjects += valuedObject
        ]
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
    
    


    def public Declaration getDeclarationOrCreate(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration) {
            valuedObject.eContainer as Declaration
        } else {
            val newDeclaration = createDeclaration;
            newDeclaration.valuedObjects += valuedObject
            newDeclaration
        }
    }
    
    
}