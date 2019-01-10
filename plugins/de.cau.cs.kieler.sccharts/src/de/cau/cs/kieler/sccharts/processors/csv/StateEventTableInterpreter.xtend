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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser
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
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
class StateEventTableInterpreter extends StateTransitionTableInterpreter implements ICSVInterpreter {
//    @Inject extension KExpressionsDeclarationExtensions
//    @Inject extension KExpressionsValuedObjectExtensions
//    @Inject extension KExpressionsCreateExtensions
//    @Inject extension KEffectsExtensions
//    @Inject extension KExtDeclarationExtensions
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    
    static final String CELL_DELIMITER = "\\"
    
    SCCharts scc
    
    int headerLines = 2
    HeaderNumbers[] headerLine = #[
        HeaderNumbers.STATE,
        HeaderNumbers.CONDITION
    ]
    
    @Accessors
//    var ArrayList<ArrayList<String>> table
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
    override createStates(ControlflowRegion region) {
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
    override createTransitions() {
        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            val condColsIndex = getAllHeaderColumns(HeaderNumbers.CONDITION)
            for (condi : condColsIndex) {
                createTransition(this.table.get(rowIndex), condi)
            }
        }
    }
    
    def createTransition(ArrayList<String> row, int condi) {
        val sourceState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.STATE)))
        
        var targetState = this.stateMap.get(getTargetName(row.get(condi)))
        
        var Transition trans = createTransitionTo(sourceState, targetState)
        
        trans.trigger = conditions2TriggerExpression(getCondRow.subList(condi, condi))
        
        matchAndMakeValuedObjects(trans.trigger, sourceState)
        
//        createEffects(trans, indicesToSublist(row, getAllHeaderColumns(row, HeaderNumbers.EFFECT)), decls)
    }
    
    def ArrayList<String> getCondRow() {table.get(headerLines-1)}
    
    def List<String> getEffectString(String cell) {
        val effectTargetList = getEffectTargetList(cell)
        effectTargetList.subList(0, effectTargetList.length-2)
    }
    
    def String getTargetName(String cell) {
        val actionTargetList = getEffectTargetList(cell)
        actionTargetList.last
    }
    
    def String[] getEffectTargetList(String cell) {
        cell.split(CELL_DELIMITER)
    }
    
    /**
     * The condition strings are concatenated with && and then turned into an expression.
     */
    override Expression conditions2TriggerExpression(List<String> conditionStrs) {
        // connect all transition conditions with the AND Operator
        var String exStr = conditionStrs.fold(
            "",
            [ String t, String r |
                if (!r.isEmpty) {
                    r.concat(CELL_DELIMITER)
                }
                return r.concat(t)
            ]
        )
        
        return KExtStandaloneParser.parseExpression(exStr)
    }
}









