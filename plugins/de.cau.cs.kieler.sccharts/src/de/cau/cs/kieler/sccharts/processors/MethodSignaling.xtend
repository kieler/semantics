/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Call
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.SpecialAccessExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsArrayExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.PolicyRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.scl.Return
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.StatementContainer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transforms convenience access of method invocation and active states into signal-like variables.
 * 
 * @author als
 */
class MethodSignaling extends SCChartsProcessor implements Traceable {
    
    public static val ID = "de.cau.cs.kieler.sccharts.processors.methodsignaling"
    public static val ACCESS_KEYWORD = "state"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        ID
    }
    
    override getName() {
        "Method Signaling"
    }
 
    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension KExpressionsArrayExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    static public final String INVOCATION_POSTFIX = "_invocs"
    static public final String ACTIVE_POSTFIX = "_active"

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

    def State transform(State rootState) {
        val methodSignals = HashMultimap.create
        val stateAccesses = HashMultimap.create
        
        // Find all methods used like signals
        for (t : rootState.allContainedActions.filter(Transition).toIterable) {
            if (t.trigger !== null && !(t.eContainer.asState.eContainer instanceof PolicyRegion)) {
                if (t.trigger.isMethodSignalVOR) {
                    val mRef = t.trigger as ValuedObjectReference
                    methodSignals.put(mRef.valuedObject.declaration as MethodDeclaration, mRef)
                }
                for (mRef : t.trigger.eAllContents.filter(ValuedObjectReference).filter[isMethodSignalVOR].toIterable) {
                    methodSignals.put(mRef.valuedObject.declaration as MethodDeclaration, mRef)
                }
            }
        }
        methodSignals.transformMethodSignaling()
        
        // Find all state checks in methods
        for (s : rootState.allScopes.toIterable) {
            for (d : s.declarations.filter(MethodImplementationDeclaration)) {
                for (a : d.eAllContents.filter(SpecialAccessExpression).filter[isStateAccess].toIterable) {
                    stateAccesses.put(a.target as State, a)
                }
            }
        }
        stateAccesses.transformActiveState()
        
        return rootState
    }
    
    def transformMethodSignaling(HashMultimap<MethodDeclaration, ValuedObjectReference> methodSignals) {
        val decls = newHashMap
        for (method : methodSignals.keySet) {
            if (method instanceof MethodImplementationDeclaration) {
                val methodContainer = method.eContainer as DeclarationScope
                if (!decls.containsKey(methodContainer)) {
                    val decl = createVariableDeclaration(ValueType.INT)
                    methodContainer.declarations += decl
                    decls.put(methodContainer, decl)
                }
                var indicatorDecl = decls.get(methodContainer)
                val indicator = createValuedObject(indicatorDecl, GENERATED_PREFIX + method.valuedObjects.head.name + INVOCATION_POSTFIX) => [
                    initialValue = createIntValue(0)
                ]
                
                val returns = method.eAllContents.filter(Return).toList
                for (r : returns) {
                    val container = r.eContainer as StatementContainer
                    container.statements.add(container.statements.indexOf(r), SCLFactory.eINSTANCE.createAssignment => [
                        operator = AssignOperator.POSTFIXADD
                        reference = indicator.reference
                        semicolon = true
                    ])
                }
                if (!returns.contains(method.statements.last)) {
                    method.statements.add(SCLFactory.eINSTANCE.createAssignment => [
                        operator = AssignOperator.POSTFIXADD
                        reference = indicator.reference
                    ])
                }
                
                // Add reset
                createAssignment(createDuringAction(method.nextScope), indicator, createIntValue(0))
                
                // Fix references
                for (vor : methodSignals.get(method)) {
                    vor.valuedObject = indicator
                    
                    var exp = vor
                    while(exp.isSubReference) {
                        exp = exp.eContainer as ValuedObjectReference
                    }
                    
                    val expContainer = exp.eContainer
                    if (expContainer instanceof OperatorExpression && (expContainer as OperatorExpression).operator == OperatorType.VAL) {
                        expContainer.replace(exp)
                    } else {
                        val newExp = createOperatorExpression(OperatorType.NE)
                        exp.replace(newExp)
                        newExp.subExpressions += exp
                        newExp.subExpressions += createIntValue(0)
                    }
                }
            } else {
                environment.errors.add("Cannot handle method signaling on methods without implementation!", method, true)
            }
        }
    }
    
    protected def isMethodSignalVOR(Expression e) {
        if (e instanceof ValuedObjectReference) {
            val decl = e.valuedObject?.declaration
            if (decl instanceof MethodDeclaration) {
                var parentExp = e
                while(parentExp.isSubReference) {
                    parentExp = parentExp.eContainer as ValuedObjectReference
                }
                if (!(parentExp instanceof Call)) {
                    return true
                }
            }
        }
        return false
    }
    
    def transformActiveState(HashMultimap<State, SpecialAccessExpression> stateAccesses) {
        val decls = newHashMap
        for (state : stateAccesses.keySet) {
            val parentRegion = state.parentRegion
            val parentState = parentRegion.parentState
            if (!decls.containsKey(parentState)) {
                val decl = createVariableDeclaration(ValueType.BOOL)
                parentState.declarations += decl
                decls.put(parentState, decl)
            }
            var indicatorDecl = decls.get(parentState)
            val indicator = createValuedObject(indicatorDecl,
                GENERATED_PREFIX + (parentRegion.name.nullOrEmpty ? "default" : parentRegion.name) + "_" + state.name + ACTIVE_POSTFIX
            ) => [
                initialValue = createBoolValue(false)
            ]
            
            // Add indicator
            // Only works with states on top level because of aborts
            createAssignment(state.createEntryAction, indicator, createBoolValue(true))
            createAssignment(state.createExitAction, indicator, createBoolValue(false))
            
            // Fix references
            for (exp : stateAccesses.get(state)) {
                exp.replace(indicator.reference)
            }
        }
    }
    
    static def isStateAccess(SpecialAccessExpression exp) {
        return ACCESS_KEYWORD.equals(exp.access)
    }

}
