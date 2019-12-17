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

import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.Declaration
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.Expression
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsValuedObjectExtensions {
    
    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension EcoreUtilExtensions
    
    def Declaration getDeclaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration)
            return valuedObject.eContainer as Declaration
        else
            return null
    }
    
    def VariableDeclaration getVariableDeclaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof VariableDeclaration)
            return valuedObject.eContainer as VariableDeclaration
        else
            return null
    }     
    
    def ReferenceDeclaration getReferenceDeclaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof ReferenceDeclaration) 
            return valuedObject.eContainer as ReferenceDeclaration
        else
            return null        
    }
    
    def asVariableDeclaration(EObject eObject) {
        eObject as VariableDeclaration
    }
    
    def asReferenceDeclaration(EObject eObject) {
        eObject as ReferenceDeclaration
    }

    def asScheduleDeclaration(EObject eObject) {
        eObject as ScheduleDeclaration
    }
    
    // Create a ValuedObjectReference to a valuedObject
    def ValuedObjectReference reference(ValuedObject valuedObject) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference() => [
            setValuedObject(valuedObject)
        ]
    }

    def ScheduleObjectReference createScheduleReference(ValuedObject valuedObject) {
        KExpressionsFactory::eINSTANCE.createScheduleObjectReference() => [
            setValuedObject(valuedObject)
        ]
    }
    
    def ScheduleObjectReference createScheduleReference(ValuedObject valuedObject, int priority) {
        KExpressionsFactory::eINSTANCE.createScheduleObjectReference() => [
            setValuedObject(valuedObject)
            setPriority(priority)
        ]
    }
    
    def boolean isVariableReference(ValuedObject valuedObject) {
        valuedObject.declaration instanceof VariableDeclaration
    }    

    def boolean isVariableReference(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.isVariableReference
    }    
    
    def boolean isModelReference(ValuedObject valuedObject) {
        valuedObject.declaration instanceof ReferenceDeclaration
    }
    
    def boolean isModelReference(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.isModelReference
    }
    
    def boolean isExternalReference(ValuedObject valuedObject) {
        valuedObject.isModelReference && !valuedObject.declaration.asReferenceDeclaration.extern.nullOrEmpty
    }
    
    def boolean isExternalReference(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.isExternalReference
    }
    
    def boolean isScheduleReference(ValuedObject valuedObject) {
        valuedObject.declaration instanceof ScheduleDeclaration
    }
    
    def boolean isScheduleReference(ValuedObjectReference valuedObjectReference) {
        valuedObjectReference.valuedObject.isScheduleReference
    }
    
    def isInputVariableReference(ValuedObjectReference vor) {
        vor.isVariableReference && vor.valuedObject.variableDeclaration.input
    }
    
    def isOutputVariableReference(ValuedObjectReference vor) {
        vor.isVariableReference && vor.valuedObject.variableDeclaration.output
    }
    
    def ValueType getType(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return ValueType::REFERENCE;
        if (valuedObject.isScheduleReference) return ValueType::SCHEDULE;
        if (!valuedObject.isVariableReference) return null;
        valuedObject.getVariableDeclaration.type
    }
    
    def ImmutableList<ValuedObject> getValuedObjectsFromEObject(EObject eObject) {
        ImmutableList.copyOf(<ValuedObject> newArrayList => [ list |
            eObject.eContents.filter(Declaration).forEach[ list += valuedObjects ]
        ])
    }  
    
    def ValuedObject removeValuedObjectFromDeclaration(ValuedObject valuedObject, Declaration declaration) {
        declaration.valuedObjects -= valuedObject
        valuedObject
    }  
    
    def boolean isInput(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.isInput
    }

    def boolean isOutput(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.isOutput
    }
    
    def boolean isLocal(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        !valuedObject.isInput && !valuedObject.isOutput
    }    

    def boolean isStatic(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.isStatic
    }

    def boolean isConst(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.isConst
    }

    def boolean isExtern(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.isExtern
    }

    def boolean isArray(ValuedObject valuedObject) {
        !valuedObject.cardinalities.nullOrEmpty
    }
    
    def boolean isArrayReference(ValuedObjectReference valuedObjectReference) {
        !valuedObjectReference.indices.nullOrEmpty
    }
    
    def boolean isClassReference(ValuedObjectReference valuedObjectReference){
        valuedObjectReference.valuedObject.declaration instanceof ClassDeclaration
    }
    
    def void applyIndices(ValuedObjectReference target, ValuedObjectReference source) {
        if (target !== null && source !== null && !source.indices.nullOrEmpty) {
            for (i : source.indices) {
                target.indices.add(i.copy);
            }
        }    
    }
    
    def void applyCardinalities(ValuedObject target, ValuedObject source) {
        if (target !== null && source !== null && !source.cardinalities.nullOrEmpty) {
            for (card : source.cardinalities) {
                target.cardinalities.add(card.copy);
            }
        }    
    }
    
    def boolean isSignal(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.isSignal
    }   
    
    def boolean isPureSignal(ValuedObject valuedObject) {
        valuedObject.isSignal && valuedObject.type == ValueType::PURE
    }    

    def boolean isValuedSignal(ValuedObject valuedObject) {
        valuedObject.variableDeclaration.isSignal && valuedObject.type != ValueType::PURE
    }   
    
    def boolean isInt(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.type == ValueType.INT
    }
    
    def boolean isBool(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.type == ValueType.BOOL
    }

    def boolean isFloat(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.type == ValueType.FLOAT
    }

    def boolean isString(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.type == ValueType.STRING
    }

    def boolean isHost(ValuedObject valuedObject) {
        if (!valuedObject.isVariableReference) return false
        valuedObject.variableDeclaration.type == ValueType.HOST
    }

    
    
    def ValuedObject createValuedObject() {
        KExpressionsFactory::eINSTANCE.createValuedObject()
    }

    def ValuedObject createValuedObject(String valuedObjectName) {
        createValuedObject() => [
            setName(valuedObjectName)
        ]
    }
    
    def ValuedObject createValuedObject(Declaration declaration, String valuedObjectName) {
        val vo = createValuedObject() => [
            setName(valuedObjectName)
        ]
        declaration.attach(vo)
        vo
    }     
    
    
    
    def Declaration attach(Declaration declaration, ValuedObject valuedObject) {
        declaration => [ valuedObjects += valuedObject ]
    } 
    
    def ValuedObject attachTo(ValuedObject valuedObject, Declaration declaration) {
        valuedObject => [ declaration.valuedObjects += valuedObject ]
    }         
    
    
    def ValuedObject applyAttributes(ValuedObject valuedObject, ValuedObject valuedObjectWithAttributes) {
        if (valuedObjectWithAttributes.initialValue !== null) {
            valuedObject.setInitialValue(valuedObjectWithAttributes.initialValue.copy)
        }
        if (valuedObjectWithAttributes.combineOperator !== null) {
            valuedObject.setCombineOperator(valuedObjectWithAttributes.combineOperator)
        }
        valuedObject.applyCardinalities(valuedObjectWithAttributes)
        valuedObject
    }
    
    def List<ValuedObjectReference> getAllReferences(Expression expression) {
        val refs = <ValuedObjectReference>newArrayList
    	if (expression !== null) {
    	    if (expression instanceof ValuedObjectReference) { 
    		  refs += expression
    		}
            refs += expression.eAllContents.filter(ValuedObjectReference).toIterable
    	}
        return refs
    }    
    
    def List<ValuedObjectReference> getAllReferenceFromEObject(EObject eObject) {
        if (eObject === null) {
            return <ValuedObjectReference> newArrayList
        }
        else if (eObject instanceof Expression) {
            return eObject.allReferences
        } else {
            val l = <ValuedObjectReference> newArrayList
            for (e : eObject.eAllContents.toIterable.filter(ValuedObjectReference)) {
                l += e
            }
            return l
        }
    }
    
    def ValuedObject removeFromContainmentAndCleanup(ValuedObject valuedObject) {
        val declaration = valuedObject.declaration
        valuedObject.remove
        if (declaration.valuedObjects.nullOrEmpty) { 
            declaration.remove
        }
        valuedObject
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
        
    def ValuedObject findValuedObjectByName(Declaration declaration, String name) {
        declaration.valuedObjects.filter[ it.name.equals(name) ]?.head
    }
    
    def List<OperatorExpression> getPreOperatorExpressions(OperatorExpression operatorExpression) {
        if (operatorExpression.operator == OperatorType.PRE) {
            return <OperatorExpression> newLinkedList(operatorExpression)
        } else {
            val l = <OperatorExpression> newLinkedList
            for (se : operatorExpression.subExpressions.filter(OperatorExpression)) {
                l.addAll(se.getPreOperatorExpressions)
            }
            return l
        }
    }    
    
    def isSameValuedObjectInReference(Expression source, Expression target) {
        source instanceof ValuedObjectReference &&
            target instanceof ValuedObjectReference &&
            source.asValuedObjectReference.valuedObject == target.asValuedObjectReference.valuedObject
    }
    
    def asValue(Expression expression) {
        expression as Value
    }

    def asVectorValue(Expression expression) {
        expression as VectorValue
    }

    def asValuedObjectReference(Expression expression) {
        expression as ValuedObjectReference
    }

    def asOperatorExpression(Expression expression) {
        expression as OperatorExpression
    }
    
    def Iterable<Expression> getIndicesAndSubIndices(ValuedObjectReference vor) {
        if (vor === null) return emptyList
        return (vor.indices?:emptyList) + vor.subReference.indicesAndSubIndices
    }
    
    def ValuedObjectReference getLowermostReference(ValuedObjectReference vor) {
        var ref = vor
        while (ref.subReference !== null) {
            ref = ref.subReference
        }
        return ref
    }
    
}