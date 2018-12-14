/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.csv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
class StateTransitionTableInterpreter implements ICSVInterpreter {
//    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
//    @Inject extension KExpressionsCreateExtensions
//    @Inject extension KEffectsExtensions
//    @Inject extension KExtDeclarationExtensions
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    
    SCCharts scc
    
    int headerLines = 1
    StateTransitionTableInterpreter.HeaderNumbers[] headerLine = #[
        HeaderNumbers.STATE,
        HeaderNumbers.CONDITION,
        HeaderNumbers.EFFECT,
        HeaderNumbers.TARGET_STATE
    ]
    enum HeaderNumbers {
        STATE,
        TARGET_STATE,
        EFFECT,
        DISCARDABLE,
        CONDITION
    }
    
    @Accessors
    var ArrayList<ArrayList<String>> table
    var HashMap<String, State> stateMap
    
    override interpret() {
        // TODO check for empty table
        if (headerLine.length > table.get(0).length) {
            // TODO handle bad case
        }
        
        val rootstate = createState => [name = "root"]
        this.scc = createSCChart => [rootStates += rootstate]
        val ControlflowRegion rootRegion = createControlflowRegionWithoutLabel(rootstate, "rootRegion")
        
        createStates(rootRegion)
        createTransitions
        
        return scc
    }
    
    /** 
     * create the map of all state names to their correlated states from the table
     * and add them to the given region as needed
     */
    def createStates(ControlflowRegion region) {
        this.stateMap = new HashMap<String, State>
        
        val stateColumn = headerLine.indexOf(HeaderNumbers.STATE)
        
        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            val stateName = table.get(rowIndex).get(stateColumn)
            // get the state or create a new one if needed
            if(!this.stateMap.containsKey(stateName)) {
                val State state = region.createState(stateName)
                // add the new state, if it didn't exist (returned default)
                this.stateMap.putIfAbsent(stateName, state)
            }
        }
    }
    
    /**
     * create a transition for each line
     */
    def createTransitions() {
        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            createTransition(this.table.get(rowIndex))
        }
    }
    
    def createTransition(ArrayList<String> row) {
        val sourceState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.STATE)))
        val targetState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.TARGET_STATE)))
        var Transition trans = createTransitionTo(sourceState, targetState)
        
        trans.trigger = conditions2TriggerExpression(
            indicesToSublist(row, getAllHeaderColumns(row, HeaderNumbers.CONDITION))
        )
        
        matchAndMakeValuedObjects(trans.trigger, sourceState)
        
//        createEffects(trans, indicesToSublist(row, getAllHeaderColumns(row, HeaderNumbers.EFFECT)), decls)
    }
    
    /** 
     * creates a list of declarations by recursively adding parent region/state declarations
     */
    def EList<Declaration> getAllDeclarations(State state) {
        // reached root state?
        if (state.enclosingState === null) {
            return state.declarations
        }
        
        val list = state.declarations
        val Region region = state.parentRegion
        val State sState = region.parentState
        list += region.declarations
        list += getAllDeclarations(sState)
        return list
    }
    
    /** Create a subset of the sourceList from a list of indices.
     * Indices are *not* sorted or checked for duplicates.
     */
    def <T> indicesToSublist(ArrayList<T> sourceList, ArrayList<Integer> indices) {
        val targetList = <T> newArrayList
        for (index : indices) {
            if (index < sourceList.length) {
                targetList.add(sourceList.get(index))
            }
        }
        return targetList
    }
    
    /** returns the list of indices that have the given HeaderNumber */
    def getAllHeaderColumns(ArrayList<String> row, StateTransitionTableInterpreter.HeaderNumbers hn) {
        var indices = <Integer> newArrayList
        for(var int index = 0; index < headerLine.length; index++) {
            if (headerLine.get(index) == hn) {
                indices.add(index)
            }
        }
        
        return indices
    }
    
    /**
     * The condition strings are concatenated with && and then turned into an expression.
     */
    def Expression conditions2TriggerExpression(ArrayList<String> conditionStrs) {
        // connect all transition conditions with the AND Operator
        var String exStr = conditionStrs.fold(
            "",
            [ String t, String r |
                if (!r.isEmpty) {
                    r.concat(" && ")
                }
                return r.concat(t)
            ]
        )
        
        return KExtStandaloneParser.parseExpression(exStr)
    }
    
    /** recursively extract valued object references from an expression */
    def List<ValuedObjectReference> getValuedObjectReferences(Expression expr) {
        val valOExpressionList = new ArrayList<ValuedObjectReference>
        if (expr instanceof OperatorExpression) {
            for(sexp : expr.subExpressions) {
                valOExpressionList += getValuedObjectReferences(sexp)
            }
        } else if (expr instanceof ValuedObjectReference) {
            valOExpressionList.add(expr)
        }
        return valOExpressionList
    }
    
    /** 
     * Match new valued object declarations with existing ones.
     * Add non existing ones to the declarations of the <b>parent state</b>.
     */
    def matchAndMakeValuedObjects(Expression expr, State state) {
        // TODO Test and Debug
        val decls = state.allDeclarations
        
        val valuedObjectsReferences = getValuedObjectReferences(expr)
        val declaredValuedObjects = decls.fold(new ArrayList<ValuedObject>, [List<ValuedObject> l, Declaration d |
            l += d.getValuedObjects
            return l
        ])
        
        for (valOR : valuedObjectsReferences) {
            for (dValO : declaredValuedObjects) {
                if(valOR.valuedObject.name == dValO.name) {
                    // YES -> connect valued object expression with existing VO
                    valOR.valuedObject = dValO
                } else {
                    // NO  -> add created VO to parent state declarations
                    state.parentRegion.parentState.declarations.add(
                        getDeclaration(valOR.valuedObject)
                    )
                }
            }
        }
    }
}









