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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsAccessVisibilityExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kexpressions.kext.extensions.Binding
import de.cau.cs.kieler.kexpressions.kext.extensions.BindingType
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtReferenceExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.Replacements
import de.cau.cs.kieler.sccharts.BaseStateReference
import de.cau.cs.kieler.sccharts.ModuleScopeCall
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.State
import java.util.List
import java.util.Map

import static extension java.lang.String.format

/**
 * @author ssm
 * @kieler.design 2017-07-05 proposed 
 * @kieler.rating 2017-07-05 proposed yellow 
 *
 */
class SCChartsReferenceExtensions extends KExtReferenceExtensions {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsGenericParameterExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KExpressionsAccessVisibilityExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsTypeExtensions
    
    /** Creates all bindings for a referenced scope. */
    def List<Binding> createBindings(Scope scope) {
        scope.createBindings(new Replacements())    
    }
    
    /** Creates all bindings for a referenced scope. 
     *  Consider the replacement stack for the implicit binding calculation.
     */
    def List<Binding> createBindings(Scope scope, Replacements replacements) {
        val bindings = <Binding> newArrayList
        
        // Return an empty binding list if there is no reference.
        if (!scope.isReferencing) return bindings
        
        val targetState = scope.reference.resolveReferencedScope
        val parameters = scope.reference.parameters
        
        bindings += targetState.createBindings(parameters, replacements, scope.valuedObjectNameMap)
        
        // Create binding for generic parameters
        bindings += scope.createGenericParameterBindings
        
        bindings
    }
    
    def List<Binding> createBindings(Scope targetState, List<Parameter> parameters, Replacements replacements, Map<String, ValuedObject> parentVONameMap) { 
        val bindings = <Binding> newArrayList
        val bound = <ValuedObject> newHashSet
          
        // Return an empty binding list if there is no target in the reference.
        // At the moment, only states are supported.
        if (targetState === null) return bindings
        
        val targetVOs = <ValuedObject> newArrayList
        if (targetState instanceof State) {
            
            targetVOs += targetState.getInputAndOutputValuedObjects
            
            // Inherited Decls
            val boundInheritedVOs = <ValuedObject>newHashSet// bining in base state reference
            for (bsr : targetState.getAllInheritedStateReferencesHierachically.filter[!it.parameters.nullOrEmpty]) {
                for (binding : bsr.target.createBindings(bsr.parameters, new Replacements, newHashMap)) {
                    if (binding.errorMessages.nullOrEmpty) {
                        boundInheritedVOs += binding.targetValuedObject
                    }
                }
            }
            for (declaration : targetState.allVisibleInheritedDeclarations.filter[input || output]) {
                targetVOs += declaration.valuedObjects.filter[!boundInheritedVOs.contains(it)]
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
            
            // Consider the replacement stack for the name matching.
            // However, this is kind of dangerous because all previous bindings are on the stack. Hence, it is possible to 
            // bind a variable that is not included in the calling scope. 
            // However, this usually should result in a validation error in the model because the binding cannot be found
            // in the calling scope.
            for (voName : parentVONameMap.keySet.immutableCopy) {
                if (replacements.containsKey(voName)) {
                    val newRef = replacements.peek(voName)
                    if (newRef instanceof ValuedObjectReference) {
                        parentVONameMap.put(voName, newRef.valuedObject)
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
                    
                    if (parentVONameMap.containsKey(vo.name)) {
                        binding.sourceExpression = parentVONameMap.get(vo.name).reference
                    } else if (!vo.declaration.isPublic) {
                        val privateName = "_" + (vo.declaration.eContainer as Scope).name + "_" + vo.name // FIXME this should be solved via an annotation on the renamed variable
                        if (parentVONameMap.containsKey(privateName)) {
                            binding.sourceExpression = parentVONameMap.get(privateName).reference
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
        
        return bindings
    }
    
    def List<Binding> createBindings(ValuedObject vo, Replacements replacements) {
        val bindings = <Binding> newArrayList
        
        if (vo.declaration instanceof ReferenceDeclaration) {
            val decl = vo.referenceDeclaration
            if (decl.reference !== null) {
                val target = decl.resolveReferencedScope
                if (target instanceof State) {
                    val parentScope = decl.eContainer
                    var Map<String, ValuedObject> parentVONameMap = newHashMap
                    if (parentScope instanceof Scope) {
                        parentVONameMap = parentScope.valuedObjectNameMap
                        // Since this funtion is only used for ref decls the inherited interface from thereplacement stack
                        // must be added to parentVONameMap because the parent object might alredy have been to these and
                        // does not contain these variables for implicit biniding. (This is ugly)
                        for (ioVO : target.allInheritedDeclarations.filter[input || output].map[valuedObjects].flatten) {
                            if (replacements.containsKey(ioVO)) {
                                parentVONameMap.put(ioVO.name, ioVO)
                            }
                        }
                    }
                    bindings += target.createBindings(vo.parameters, replacements, parentVONameMap)
                    
                    // Create binding for generic parameters
                    bindings += vo.createGenericParameterBindings
                }
            }
        }
        
        bindings
    }
    
    def List<Binding> createBindings(BaseStateReference ref, Replacements replacements) {
        val bindings = <Binding> newArrayList
        
        if (ref.target !== null) {
            val target = ref.target//.resolveReferencedScope
            if (target instanceof State) {
                val implicitlyBoundInSuperState = newHashSet
                var container = ref.eContainer?.eContainer
                while (container !== null) {
                    if (container instanceof State) {
                        if (!container.baseStateReferences.nullOrEmpty) {
                            implicitlyBoundInSuperState.addAll(container.allInheritedStates.map[declarations].flatten.filter[input || output])
                        }
                    }
                    container = container.eContainer
                }
                val Map<String, ValuedObject> parentVONameMap = newHashMap
                implicitlyBoundInSuperState.map[valuedObjects].flatten.forEach[parentVONameMap.put(it.name, it)]
                
                bindings += ref.target.createBindings(ref.parameters, replacements, parentVONameMap)
                
                // Create binding for generic parameters
                bindings += ref.createGenericParameterBindings
            }
        }
        
        bindings
    }
    
    def List<Binding> createGenericParameterBindings(Scope scope) {
        if (scope.isReferencing) {
            var decls = emptyList
            val target = scope.reference.resolveReferencedScope
            if (target instanceof Scope) {
                decls = target.genericParameterDeclarations?:emptyList
            }
            return decls.createGenericParameterBindings(scope.reference.genericParameters?:emptyList)
        }
        return emptyList
    }
    def List<Binding> createGenericParameterBindings(BaseStateReference ref) {
        if (ref.target !== null) {
            var decls = emptyList
            if (ref.target instanceof State) {
                decls = ref.target.genericParameterDeclarations?:emptyList
            }
            return decls.createGenericParameterBindings(ref.genericParameters?:emptyList)
        }
        return emptyList
    }
    def List<Binding> createGenericParameterBindings(ValuedObject vo) {
        if (vo.declaration instanceof ReferenceDeclaration) {
            val decl = vo.referenceDeclaration
            if (decl.reference !== null) {
                var decls = emptyList
                val target = decl.resolveReferencedScope
                if (target instanceof Scope) {
                    decls = target.genericParameterDeclarations?:emptyList
                }
                return decls.createGenericParameterBindings(vo.getGenericParameters.nullOrEmpty ? decl.genericParameters?:emptyList : vo.getGenericParameters?:emptyList)
            }
        }
        return emptyList
    }
    
    protected def List<Binding> createGenericParameterBindings(List<GenericParameterDeclaration> decls, List<Parameter> params) {
        val bindings = newArrayList
        
        for (i : 0 ..< Math.max(decls.size, params.size)) {
            val decl = i < decls.size ? decls.get(i) : null
            val param = i < params.size ? params.get(i) : null
            
            val binding = new Binding => [
                type = decl === null || decl.isTypeDeclaration ? BindingType.GENERIC_TYPE : BindingType.GENERIC_PARAM
                targetValuedObject = decl?.valuedObjects?.head
                sourceExpression = param?.expression
            ]
            bindings += binding
            
            if (param === null) {
                binding.errorMessages += "There is no parameter given for generic parameter declaration of %s.".format(binding.targetValuedObject?.name)
            } else if (decl === null) {
                binding.errorMessages += "There is no declaration for the given generic parameter (position: %d).".format(i)
            } else {
                val problem = decl.checkForSubtypeProblem(param.expression)
                if (problem !== null) {
                    binding.errorMessages += problem
                }
            }
        }
        
        return bindings
    }
    
    // Adjusted Checks
    
    override checkTypeCompability(Binding binding) {
        super.checkTypeCompability(binding)
        
        val targetDecl = binding.targetValuedObject?.declaration
        if (targetDecl instanceof ReferenceDeclaration) {
            val problem = targetDecl.checkForSubtypeProblem(binding.sourceExpression)
            if (problem !== null) {
                binding.addErrorMessage(problem)
            }
        }
    }
    
    
    // Helper
    
    def getInputAndOutputValuedObjects(DeclarationScope scope) {
        return scope.declarations.filter[input || output].map[valuedObjects].flatten
    }
    
    def getInputValuedObjects(DeclarationScope scope) {
        return scope.declarations.filter[input].map[valuedObjects].flatten
    }
    
    def getOutputValuedObjects(DeclarationScope scope) {
        return scope.declarations.filter[output].map[valuedObjects].flatten
    }
    
    // finds a list of valued objects witch are inputs of the referenced SCChart
    def getInputs(ReferenceDeclaration ref){
        return (ref.reference as State).getInputValuedObjects.toList
    }
    
    // finds a list of valued objects witch are outputs of the referenced SCChart
    def getOutputs(ReferenceDeclaration ref){
        return (ref.reference as State).getOutputValuedObjects.toList
    }
    
    def separateGenericTypeDependentReferenceDeclarations(List<ReferenceDeclaration> decls) {
        val separated = newArrayList
        
        for (decl : decls) {
            if (decl.valuedObjects.size > 1 && decl.valuedObjects.exists[!genericParameters.nullOrEmpty]) {
                for (voPair : decl.valuedObjects.indexed.drop(1)) {
                    val sDecl = createReferenceDeclaration(decl)
                    sDecl.valuedObjects += voPair.value
                    separated += sDecl
                }
            }
        }
        
        decls += separated
    }
    
    def boolean fixMemberReferenceIfParentChanged(ValuedObjectReference ref, boolean recursive) {
        val parent = ref.eContainer
        if (parent instanceof ValuedObjectReference) {
            if (parent.subReference === ref) {
                val decl = parent.valuedObject?.declaration
                if (decl instanceof ClassDeclaration) {
                    val match = decl.innerValuedObjects.findFirst[name?.equals(ref.valuedObject?.name)]
                    if (match !== null && match !== ref.valuedObject) {
                        ref.valuedObject = match
                        if (ref.subReference !== null && recursive) {
                            ref.subReference.fixMemberReferenceIfParentChanged(recursive)
                        }
                    }
                }
            }
        }
        return false
    }
    
    def isModuleCall(ScopeCall sc) {
        return sc instanceof ModuleScopeCall
    }
    def isModuleCallReference(Scope scope) {
        return scope.isReferencing && scope.reference.isModuleCall
    }
    
    def isModuleExpansion(ScopeCall sc) {
        return !sc.isModuleCall
    }
    def isModuleExpansionReference(Scope scope) {
        return scope.isReferencing && scope.reference.isModuleExpansion
    }
}