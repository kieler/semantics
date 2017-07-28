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
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.Iterator
import java.util.List

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.sccharts.iterators.ScopeIterator.*
import static extension de.cau.cs.kieler.sccharts.iterators.StateIterator.*
import static extension de.cau.cs.kieler.sccharts.iterators.ControlflowRegionIterator.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import java.util.Map

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
    
    def SCCharts getSCCharts(Scope scope) {
        if (scope.eContainer != null) {
            return (scope.eContainer as Scope).getSCCharts as SCCharts
        } else {
            return scope as SCCharts
        }
    }
    
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
    
    
    
    def ValuedObject getValuedObjectByName(Scope scope, String name) {
        for(vo : scope.valuedObjects) {
            if (vo.name.equals(name)) return vo
        }
        if (scope.eContainer != null && scope.eContainer instanceof Scope) 
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
        if (scope.eContainer != null && scope.eContainer instanceof Scope) 
            return (scope.eContainer as Scope).getValuedObjectNameMap(map)
        map
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




    
    
}