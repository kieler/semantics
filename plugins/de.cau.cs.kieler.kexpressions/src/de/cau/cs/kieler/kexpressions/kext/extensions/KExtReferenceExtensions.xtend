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
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import java.util.List

/**
 * @author ssm
 * @kieler.design 2017-07-05 proposed 
 * @kieler.rating 2017-07-05 proposed yellow 
 *
 */
class KExtReferenceExtensions {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExtSerializeExtensions
    
    /** Creates all bindings for a referenced scope. */
    def List<Binding> createBindings(ReferenceCall referenceCall) {
        referenceCall.createBindings(new Replacements)    
    }
    
    /** Creates all bindings for a referenced scope. 
     *  Consider the replacement stack for the implicit binding calculation.
     */
    def List<Binding> createBindings(ReferenceCall referenceCall, Replacements replacements) {
        val bindings = <Binding> newArrayList
        val bound = <ValuedObject> newHashSet
        val referenceDeclaration = referenceCall.valuedObject.referenceDeclaration
        
        // Return an empty binding list if there is no reference.
        if (referenceDeclaration.reference === null) return bindings
        
        val targetState = referenceDeclaration.reference
        val parameters = referenceCall.parameters
        
        // Return an empty binding list if there is no target in the reference.
        // At the moment, only states are supported.
        if (targetState === null) return bindings
        
        val targetVOs = <ValuedObject> newArrayList
        if (targetState instanceof DeclarationScope) {
            
            for (declaration : targetState.variableDeclarations.filter[ input || output]) {
                targetVOs += declaration.valuedObjects
            }
            
            // Inherited Decls
//            for (declaration : targetState.allVisibleInheritedDeclarations.filter(VariableDeclaration).filter[ input || output ]) {
//                targetVOs += declaration.valuedObjects
//            }
        } else {
            targetVOs += targetState.eAllContents.filter(ValuedObjectReference).map[valuedObject].toSet
        }

        // Process explicit bindings.
        var targetVOPtr = 0
        for (parameter : parameters) {
            val binding = new Binding => [
                sourceExpression = parameter.expression
            ]
            
            if (parameter.explicitBinding !== null) {
                val tmpPtr = targetVOs.indexOf(parameter.explicitBinding)
                if (tmpPtr == -1) {
                    binding.addErrorMessage("Explicit binding could not be resolved! The valued object is unknown! " + 
                        parameter.explicitBinding.toString
                    )    
                } else {
                    targetVOPtr = tmpPtr
                }
            } else {
                binding.type = BindingType.ORDER
            }
            
            if (binding.errors == 0) {
                
                if (targetVOPtr > targetVOs.size - 1) {
                    binding.addErrorMessage("A Valued Object is supposed to be bound, but there is no free Valued Object left in the referenced scope: " + 
                        parameter.expression.serializeHR
                    )
                } else {
                    binding.targetValuedObject = targetVOs.get(targetVOPtr)
                    binding.targetIndices = parameter.explicitBindingIndices
                    bound += binding.targetValuedObject
                    
                    targetVOPtr++
                }
            }
            
            binding.checkTypeCompability
            bindings += binding
            
        }

        
        // Calculate implicit bindings.
        if (bound.size < targetVOs.size) {
            
            val voNameMap = (referenceDeclaration.reference as DeclarationScope).valuedObjectNameMap
            
            // Consider the replacement stack for the name matching.
            // However, this is kind of dangerous because all previous bindings are on the stack. Hence, it is possible to 
            // bind a variable that is not included in the calling scope. 
            // However, this usually should result in a validation error in the model because the binding cannot be found
            // in the calling scope.
            for (voName : voNameMap.keySet.immutableCopy) {
                if (replacements.containsKey(voName)) {
                    val newRef = replacements.peek(voName)
                    if (newRef instanceof ValuedObjectReference) {
                        voNameMap.put(voName, newRef.valuedObject)
                    } else {
                        throw new IllegalStateException("There is a matching valued object on the replacement stack for an implicitly bound variable ( " + 
                            voName + ")." + 
                            "However, the binding is not a valued object reference, so the type does not match."
                        )
                    }
                }
            } 
            
            for (vo : targetVOs) {
                if (!bound.contains(vo)) {
                    val binding = new Binding => [
                        targetValuedObject = vo
                        type = BindingType.IMPLICIT
                    ]
                    
                    if (voNameMap.containsKey(vo.name)) {
                        val sourceVO = voNameMap.get(vo.name)
                        binding.sourceExpression = sourceVO.reference
                    } else {
                        binding.addErrorMessage("Valued object in the referenced scope was not bound properly: " + vo.name)
                    }
                    
                    binding.checkTypeCompability
                    bindings += binding
                }
            }        
        }
        
        bindings
    }

    protected def checkTypeCompability(Binding binding) {
        switch(binding.sourceExpression) {
            ValuedObjectReference: binding.checkTypeCompabilityForReferences
            Value: binding.checkTypeCompabilityForLiterals
        }
    }
    
    protected def checkTypeCompabilityForReferences(Binding binding) {
        val sExp = binding.sourceExpression as ValuedObjectReference
        if (sExp.isArrayReference) {
            // An array ref is used
            if (sExp.valuedObject.isArray) {
                if (!binding.targetValuedObject.isArray) {
                    // but the target is not an array
//                        binding.addErrorMessage("It is not possible to bind an array reference of array " + sExp.valuedObject.name + 
//                            " to scalar " + binding.targetValuedObject.name + "!")
                }
            } else {
                // but the valued object is not an array
                binding.addErrorMessage("It is not possible to bind an array reference of the scalar " +
                    sExp.valuedObject.name)
            }
        } else {
            // No array ref used
            if (sExp.valuedObject.isArray) { //
                // but is is an array
                if (!binding.targetValuedObject.isArray) {
                    // but the target is not an array
                    binding.addErrorMessage("It is not possible to bind array " + sExp.valuedObject.name + 
                        " to scalar " + binding.targetValuedObject.name + "!")
                }
            } 
        }
    }
        
    protected def checkTypeCompabilityForLiterals(Binding binding) { 
        val sExp = binding.sourceExpression as Value
        val targetContainer = binding.targetValuedObject.eContainer
        if (targetContainer instanceof VariableDeclaration) {
            if (targetContainer.output) {
                binding.addErrorMessage("It is not possible to bind the literal " + sExp.serializeHR + " 
                    to the output " + binding.targetValuedObject.name + " !")
            }
        }
    }
    
}