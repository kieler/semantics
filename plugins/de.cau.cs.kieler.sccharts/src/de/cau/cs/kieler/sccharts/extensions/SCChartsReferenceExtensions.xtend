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
package de.cau.cs.kieler.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import java.util.List
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtReferenceExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.Replacements
import de.cau.cs.kieler.kexpressions.kext.extensions.Binding
import de.cau.cs.kieler.kexpressions.kext.extensions.BindingType
import de.cau.cs.kieler.kexpressions.AccessModifier

/**
 * @author ssm
 * @kieler.design 2017-07-05 proposed 
 * @kieler.rating 2017-07-05 proposed yellow 
 *
 */
class SCChartsReferenceExtensions extends KExtReferenceExtensions {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsInheritanceExtensions
    
    /** Creates all bindings for a referenced scope. */
    def List<Binding> createBindings(Scope scope) {
        scope.createBindings(new Replacements())    
    }
    
    /** Creates all bindings for a referenced scope. 
     *  Consider the replacement stack for the implicit binding calculation.
     */
    def List<Binding> createBindings(Scope scope, Replacements replacements) {
        val bindings = <Binding> newArrayList
        val bound = <ValuedObject> newHashSet
        
        // Return an empty binding list if there is no reference.
        if (scope.reference === null) return bindings
        
        val targetState = scope.reference.scope
        val parameters = scope.reference.parameters
        
        // Return an empty binding list if there is no target in the reference.
        // At the moment, only states are supported.
        if (targetState === null) return bindings
        
        val targetVOs = <ValuedObject> newArrayList
        if (targetState instanceof State) {
            
            for (declaration : targetState.variableDeclarations.filter[ input || output]) {
                targetVOs += declaration.valuedObjects
            }
            
            // Inherited Decls
            for (declaration : targetState.allVisibleInheritedDeclarations.filter(VariableDeclaration).filter[ input || output ]) {
                targetVOs += declaration.valuedObjects
            }
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
            
            val voNameMap = scope.valuedObjectNameMap
            
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
                        binding.sourceExpression = voNameMap.get(vo.name).reference
                    } else if (vo.declaration.access !== AccessModifier.PUBLIC) {
                        val privateName = "_" + (vo.declaration.eContainer as Scope).name + "_" + vo.name // FIXME this should be solved via an annotation on the renamed variable
                        if (voNameMap.containsKey(privateName)) {
                            binding.sourceExpression = voNameMap.get(privateName).reference
                        } else {
                            binding.addErrorMessage("Valued object in the referenced scope was not bound properly: " + vo.name)
                        }
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

}