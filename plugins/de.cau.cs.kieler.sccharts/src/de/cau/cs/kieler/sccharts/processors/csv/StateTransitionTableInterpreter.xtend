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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
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

/**
 * @author stu114663
 *
 */
class StateTransitionTableInterpreter implements ICSVInterpreter {
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    
    SCCharts scc
    
    int headerLines = 0
    StateTransitionTableInterpreter.HeaderNumbers[] headerLine = #[
        HeaderNumbers.STATE,
        HeaderNumbers.TARGET_STATE,
        HeaderNumbers.CONDITION,
        HeaderNumbers.EFFECT,
        HeaderNumbers.DISCARDABLE
    ]
    enum HeaderNumbers {
        STATE,
        TARGET_STATE,
        EFFECT,
        DISCARDABLE,
        CONDITION
    }
    
    var ArrayList<ArrayList<String>> table
    var HashMap<String, State> stateMap
    
    new (ArrayList<ArrayList<String>> table) {
        this.table = table
    }
    
    override interpret() {
        if (headerLine.length > table.get(0).length) {
            // TODO handle bad case
        }
        
        val rootstate = createState => [name = "root"]
        this.scc = createSCChart => [rootStates += rootstate]
        val ControlflowRegion rootRegion = createControlflowRegionWithoutLabel(rootstate, "")
        createStates(rootRegion)
        
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
            val State state = this.stateMap.getOrDefault(stateName, region.createState(stateName))
            // add the new state, if it didn't exist (returned default)
            this.stateMap.putIfAbsent(stateName, state)
        }
    }
    
    def createTransitions() {
        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            createTransition(this.table.get(rowIndex))
        }
    }
    
    def createTransition(ArrayList<String> row) {
        val sourceState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.STATE)))
        val targetState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.TARGET_STATE)))
        var Transition trans = createTransitionTo(sourceState, targetState)
        
        // TODO are the declarations of super states also included?
        val decls = sourceState.declarations
        
        trans.trigger = conditions2Expression(indicesToSublist(row, getAllHeaderColumns(row, HeaderNumbers.CONDITION)), decls)
        
        trans.createEffects(indicesToSublist(row, getAllHeaderColumns(row, HeaderNumbers.EFFECT)), decls)
    }
    
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
            if (headerLine.get(index) == hn.ordinal) {
                indices.add(index)
            }
        }
        
        return indices
    }
    
    def Expression conditions2Expression(ArrayList<String> conditionStrs, List<Declaration> decls) {
        var String exStr = conditionStrs.fold(
            "",
            [ String r, String t |
                if (!r.isEmpty) {
                    r.concat(" && ")
                }
                return r.concat(t)
            ]
        )
        
        // TODO wait for Alex to implement something
        // TODO also consider existing declarations
//        kext.parse(exStr)
        return null
    }
    
    def createEffects(Transition trans, ArrayList<String> effectStrs, List<Declaration> decls) {
        var String condStr = effectStrs.fold(
            "",
            [ String r, String t |
                if (!r.isEmpty) {
                    r.concat(" && ")
                }
                return r.concat(t)
            ]
        )
        
        // siehe conditions2Expression()
//        kext.parse(exStr)???
        
        trans.effects.addAll()
    }
    
    def createValuedObjects(ArrayList<String> ids, State state) {
        for (String id : ids) {
            // TODO continue here!
//            createValuedObjec
        }
    }
}









