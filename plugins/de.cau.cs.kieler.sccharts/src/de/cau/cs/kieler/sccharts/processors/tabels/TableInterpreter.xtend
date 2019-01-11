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
package de.cau.cs.kieler.sccharts.processors.tabels

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
abstract class TableInterpreter implements ITableInterpreter {
//    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
//    @Inject extension KExpressionsCreateExtensions
//    @Inject extension KEffectsExtensions
//    @Inject extension KExtDeclarationExtensions
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    
    final String EFFECT_SPLITTER = ";"
    
    SCCharts scc
    
    int headerLines = 1
    HeaderNumbers[] headerLine = #[
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
    var List<List<String>> table
    @Accessors
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

        println("interpreted")
        
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
     * creates a list of declarations by recursively adding parent region/state declarations
     */
    def EList<Declaration> getAllDeclarations(State state) {
        // reached root state?
        if (state.isRootState) {
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
    def <T> indicesToSublist(List<T> sourceList, List<Integer> indices) {
        val targetList = new ArrayList<T>
        for (index : indices) {
            if (index < sourceList.length) {
                targetList.add(sourceList.get(index))
            }
        }
        return targetList
    }
    
    /** returns the list of indices that have the given HeaderNumber */
    def getAllHeaderColumns(TableInterpreter.HeaderNumbers hn) {
        var indices = <Integer> newArrayList
        for(var int index = 0; index < headerLine.length; index++) {
            if (headerLine.get(index) == hn) {
                indices.add(index)
            }
        }
        
        return indices
    }
    
    /**
     * The condition strings are concatenated with a connector and then turned into an expression.
     */
    def Expression conditions2TriggerExpression(List<String> conditionStrs, String connector) {
        // connect all transition conditions with the AND Operator
        var String exStr = conditionStrs.fold(
            "",
            [ String t, String r |
                if (!r.isEmpty) {
                    r.concat(connector)
                }
                return r.concat(t)
            ]
        )
        
        return KExtStandaloneParser.parseExpression(exStr)
    }
    
    def List<Effect> effectStrings2Expression(List<String> rawEffectStrs) {
        val List<String> effectStrs = rawEffectStrs.fold(
            new ArrayList<String>,
            [ List<String> l, String raw |
                l.addAll(raw.split(EFFECT_SPLITTER))
                return l
        ])
        
        val effects = new ArrayList<Effect>
        for (eff : effectStrs) {
            // TODO does this 
            effects.add(KExtStandaloneParser.parseEffect(eff))
        }
        return effects
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
        var decls = state.allDeclarations
        
        val valuedObjectsReferences = getValuedObjectReferences(expr)
        var declaredValuedObjects = decls.fold(new ArrayList<ValuedObject>, [List<ValuedObject> l, Declaration d |
            l += d.getValuedObjects
            return l
        ])
        
        for (valOR : valuedObjectsReferences) {
            var alreadyDeclared = false
            for (dValO : declaredValuedObjects) {
                if(valOR.valuedObject.name == dValO.name) {
                    alreadyDeclared = true
                    valOR.valuedObject = dValO
                }
            }
            
            // TODO Debug: declarations are not created properly
            if (!alreadyDeclared) {
                state.parentRegion.parentState.declarations.add(
                    getDeclaration(valOR.valuedObject)
                )
                
                decls = state.allDeclarations
                declaredValuedObjects = decls.fold(new ArrayList<ValuedObject>, [List<ValuedObject> l, Declaration d |
                    l += d.getValuedObjects
                    return l
                ])
            }
        }
    }
    
//    def matchAndMakeValuedObjects(Effect effect, State state) {
//        var decls = state.allDeclarations
//        
//        val valuedObjectsReferences = getValuedObjectReferences(expr)
//        var declaredValuedObjects = decls.fold(new ArrayList<ValuedObject>, [List<ValuedObject> l, Declaration d |
//            l += d.getValuedObjects
//            return l
//        ])
//        
//        for (valOR : valuedObjectsReferences) {
//            var alreadyDeclared = false
//            for (dValO : declaredValuedObjects) {
//                if(valOR.valuedObject.name == dValO.name) {
//                    alreadyDeclared = true
//                    valOR.valuedObject = dValO
//                }
//            }
//            
//            // TODO Debug: declarations are not created properly
//            if (!alreadyDeclared) {
//                state.parentRegion.parentState.declarations.add(
//                    getDeclaration(valOR.valuedObject)
//                )
//                
//                decls = state.allDeclarations
//                declaredValuedObjects = decls.fold(new ArrayList<ValuedObject>, [List<ValuedObject> l, Declaration d |
//                    l += d.getValuedObjects
//                    return l
//                ])
//            }
//        }
//    }
}









