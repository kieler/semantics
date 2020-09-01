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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.GenericTypeReference
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.Iterator
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.sccharts.iterators.ControlflowRegionIterator.*
import static extension de.cau.cs.kieler.sccharts.iterators.DataflowRegionIterator.*
import static extension de.cau.cs.kieler.sccharts.iterators.ScopeIterator.*
import static extension de.cau.cs.kieler.sccharts.iterators.StateIterator.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsScopeExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsGenericParameterExtensions
    
    def Iterator<State> getAllContainedStates(Scope scope) {
        scope.sccAllContainedStates 
    }

    def Iterator<ControlflowRegion> getAllContainedRegions(Scope scope) {
        scope.eAllContents().filter(ControlflowRegion)
    }

    def List<State> getAllContainedStatesList(State state) {
        state.allContainedStates.toList
    }
    
    def Iterator<State> getAllStates(Scope scope) {
        scope.sccAllStates
    }
    
    def Iterator<Scope> getAllScopes(Scope scope) {
        scope.sccAllScopes
    }

    def getAllContainedControlflowRegions(Scope scope) {
        scope.sccAllControlflowRegions
    }
    
    def getAllContainedDataflowRegions(Scope scope) {
        scope.sccAllDataflowRegions
    }

    def getAllContainedTransitions(Scope scope) {
        scope.eAllContents().filter(Transition)
    }

    // Beware: Transitions are also actions!
    def getAllContainedActions(Scope scope) {
        scope.eAllContents().filter(Action)
    }
    
    def getAllContainedLocalActions(Scope scope) {
        scope.eAllContents().filter(LocalAction)
    }    
    
    def getValuedObjectsList(Scope scope) {
        <ValuedObject>newLinkedList => [ ll |
            scope.declarations.forEach[d|d.valuedObjects.forEach[ll += it]]
        ]
    }
    
    def State getRootState(Scope scope) {
        switch scope {
            State: if (scope.isRootState) scope else scope.parentRegion?.getRootState
            Region: scope.parentState.getRootState
        }
    }    
    
    def Scope getNextScope(EObject eObject) {
        if (eObject === null) {
            return null
        } else if (eObject instanceof Scope) {
            return eObject
        } else {
            return eObject.eContainer.getNextScope
        }
    }
    
    
    def ValuedObject getValuedObjectByName(Scope scope, String name) {
        for(vo : scope.valuedObjects) {
            if (vo.name.equals(name)) return vo
        }
        if (scope.eContainer !== null && scope.eContainer instanceof Scope) 
            return (scope.eContainer as Scope).getValuedObjectByName(name)
        return null
    }
    
    def Map<String, ValuedObject> getValuedObjectNameMap(Scope scope) {
        scope.getValuedObjectNameMap(<String, ValuedObject> newHashMap)
    }
    
    private def Map<String, ValuedObject> getValuedObjectNameMap(Scope scope, Map<String, ValuedObject> map) {
        for(vo : scope.valuedObjects) {
            if (!map.containsKey(vo.name)) map.put(vo.name, vo)
        }
        if (scope instanceof State) {
            if (!scope.baseStates.nullOrEmpty) {
                map.putAll(scope.allInheritedDeclarations.map[valuedObjects].flatten.toMap[name])
            }
        }
        if (scope.eContainer !== null && scope.eContainer instanceof Scope) {
            return (scope.eContainer as Scope).getValuedObjectNameMap(map)
        }
        return map
    }
    
    
    
    
    def void replaceAllReferences(Scope scope, ValuedObject valuedObject, Expression expression) {
        for (obj : scope.eAllContents.filter(ValuedObjectReference).filter[ it.valuedObject == valuedObject ].toList) {
            obj.replace(expression)
        }
    }

    def void replaceAllReferencesWithCopy(Scope scope, ValuedObject valuedObject, Expression expression) {
        for (obj : scope.eAllContents.filter(ValuedObjectReference).filter[ it.valuedObject == valuedObject ].toList) {
            obj.replace(TracingEcoreUtil.copy(expression))
        }
    }

    def void replaceAllOccurrences(Scope scope, ValuedObject valuedObject, ValuedObject replacement) {
        val relevantObjects = scope.eAllContents.filter[
            it instanceof ValuedObjectReference || it instanceof Assignment ||
            it instanceof Emission || it instanceof Parameter || it instanceof Assignment
        ].toList
        for (obj : relevantObjects) {
            if (obj instanceof ValuedObjectReference && (obj as ValuedObjectReference).valuedObject == valuedObject) {
                val valuedObjectReference = (obj as ValuedObjectReference)
                val valuedObjectReferenceCopy = valuedObjectReference.nontracingCopy;
                val replacementValuedObjectReference = replacement.reference;
                obj.replace(replacementValuedObjectReference)
                replacementValuedObjectReference.indices.clear
                for (index : valuedObjectReferenceCopy.indices) {
                    replacementValuedObjectReference.indices.add(index.nontracingCopy);
                }
            } else if (obj instanceof Assignment && (obj as Assignment).valuedObject == valuedObject) {
                val assignment = (obj as Assignment)
                val assignmentCopy = assignment.nontracingCopy;
                assignment.valuedObject = replacement;
                assignment.indices.clear
                for (index : assignmentCopy.indices) {
                    assignment.indices.add(index.nontracingCopy);
                }
            } else if (obj instanceof Emission && (obj as Emission).valuedObject == valuedObject) {
                (obj as Emission).valuedObject = replacement;
            } else if (obj instanceof Parameter) {
// TODO: adapt to new referenced states (Parameter)
//                if((obj as Binding).formal == valuedObject) (obj as Binding).formal = replacement
//                if((obj as Binding).actual == valuedObject) (obj as Binding).actual = replacement
            } else if (obj instanceof Assignment && (obj as Assignment).valuedObject == valuedObject) {
                (obj as Assignment).valuedObject = replacement;
            }      

        }
    }

    def isReferencing(Scope scope) {
        return scope.reference !== null && scope.reference.target !== null
    }

    def isReferencingScope(Scope scope) {
        return scope.reference !== null && scope.reference.target instanceof Scope
    }
    
    def Scope getScope(ScopeCall call) {
        if (call.target instanceof Scope) {
            return call.target as Scope
        }
    }
    def Scope setScope(ScopeCall call, Scope newScope) {
        call?.setTarget(newScope)
        return newScope
    }

    def isReferencingGeneric(Scope scope) {
        return scope.reference !== null && scope.reference.target instanceof ValuedObject
    }

    def getReferencedGenericParameter(ScopeCall call) {
        if (call.target instanceof ValuedObject) {
            return call.target as ValuedObject
        }
    }
        
    def Scope resolveReferencedScope(ScopeCall call) {
        var target = call.target
        if (target instanceof Scope) {
            return target
        } else if (target instanceof ValuedObject) {
            return target.referencedScope
        }
        return null
    }
    def Scope getReferencedScope(ValuedObject vo) {
        if (vo.isGenericParamter) {
            val target = vo.genericParameterDeclaration.type
            if (target instanceof Scope) {
                return target
            }
        }
        return null
    }
     
    def List<ValuedObject> genericTypeParameters(Scope scope) {
        scope.genericParameterDeclarations.filter[isTypeDeclaration].map[valuedObjects.head].toList
    }
    
    def List<ValuedObject> genericValuedObjectParameters(Scope scope) {
        scope.genericParameterDeclarations.filter[isValueDeclaration || isReferenceDeclaration].map[valuedObjects.head].toList
    }
    
    def getGenericParameterDeclaration(GenericTypeReference ref) {
        // Find container referencing object containing the parameter declarations
        var EObject target = null        
        var container = ref.eContainer
        while(container !== null) {
            if (container instanceof GenericTypeReference) {
                target = container.type
                container = null
            } else if (container instanceof ReferenceDeclaration) {
                target = container.reference
                container = null
            } else if (container instanceof ScopeCall) {
                target = container.target
                container = null
            } else {
                container = container.eContainer
            }
        }
        
        // Find generic declarations in target
        var List<GenericParameterDeclaration> targetParamDeclarations = null
        if (target instanceof Scope) {
            targetParamDeclarations = target.genericParameterDeclarations
        } else if (target instanceof ValuedObject) {
            targetParamDeclarations = target.referencedScope?.genericParameterDeclarations
        }

        // Find by matching index
        if (ref.eContainer !== null && targetParamDeclarations !== null) {
            val containment = ref.eContainer.eGet(ref.eContainingFeature)
            if (containment instanceof List<?>) {
                val idx = containment.indexOf(ref)
                if (idx >= 0 && idx < targetParamDeclarations.size) {
                    return targetParamDeclarations.get(idx)
                }
            }
        }
        return null
    }
}