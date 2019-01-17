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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
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
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
abstract class TableInterpreter implements ITableInterpreter {
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
//    @Inject extension KEffectsExtensions
//    @Inject extension KExtDeclarationExtensions
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    
    static final String EFFECT_SPLITTER = ";"
    
    SCCharts scc
    
    @Accessors
    boolean initialized = false
    @Accessors
    int headerLines
    @Accessors
    HeaderType[] headerLine
    
    @Accessors
    var List<List<String>> table
    @Accessors
    var HashMap<String, State> stateMap
    
    override interpret() {
        // TODO check for empty table
        // TODO check for empty headerLine
        checkInitialized()
        
        if (headerLine.length > table.get(0).length) {
            // TODO handle bad case
            // TODO check for needed lines
        }
        
        val rootstate = createState => [name = "root"]
        this.scc = createSCChart => [rootStates += rootstate]
        val ControlflowRegion rootRegion = createControlflowRegionWithoutLabel(rootstate, "rootRegion")
        
        createStates(rootRegion)
        createTransitions
        
        return scc
    }
    
    /** Checks if table and headerLine have been initialized and initializes them (with defaults) if necessary */
    def checkInitialized() {
        if(!initialized) {
            initialize()
        }
    }
    
    /** 
     * create the map of all state names to their correlated states from the table
     * and add them to the given region as needed
     */
    override createStates(ControlflowRegion region) {
        this.stateMap = new HashMap<String, State>
        
        val stateColumn = headerLine.indexOf(HeaderType.STATE)
        
        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            val stateName = table.get(rowIndex).get(stateColumn)
            // get the state or create a new one if needed
            if(!this.stateMap.containsKey(stateName)) {
                val State state = region.createState(stateName)
                // set first state as the initial state
                if(rowIndex == headerLines) {
                    state.setInitial
                }
                // add the new state, if it didn't exist (returned default)
                this.stateMap.putIfAbsent(stateName, state)
            }
        }
    }
    
    /** 
     * creates a list of declarations by recursively adding parent region/state declarations
     */
    def List<Declaration> getAllDeclarations(State state) {
        val list = new ArrayList
        // reached root state?
        if (state.isRootState) {
            list += state.declarations
        } else {
            list += state.declarations
            val Region region = state.parentRegion
            val State sState = region.parentState
            list += region.declarations
            list += getAllDeclarations(sState)
        }
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
    def getAllHeaderColumns(HeaderType hn) {
        checkInitialized()
        
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
        for (effStr : effectStrs) {
            val Effect eff = KExtStandaloneParser.parseEffect(effStr)
            if (eff !== null) {
                effects.add(eff)
            }
        }
        return effects
    }
    
    /** recursively extract valued object references from an expression */
    def List<ValuedObjectReference> getValuedObjectReferences(Expression expr) {
//        val valOExpressionList = new ArrayList<ValuedObjectReference>
//        
//        if (expr instanceof OperatorExpression) {
//            for(sexp : expr.subExpressions) {
//                valOExpressionList += getValuedObjectReferences(sexp)
//            }
//        } else if (expr instanceof ValuedObjectReference) {
//            valOExpressionList.add(expr)
//        }
//        return valOExpressionList
        expr.allReferences
    }
    
    /** 
     * Match new valued object declarations with existing ones.
     * Add non existing ones to the declarations of the <b>parent state</b>.
     */
    def matchAndMakeValuedObjects(Expression expr, State state) {
        matchAndMakeValuedObjects(getValuedObjectReferences(expr), state)
    }
    
    /** recursively extract valued object references from an effect */
    def List<ValuedObjectReference> getValuedObjectReferences(Effect effect) {
        // TODO does this work or do I need to implement my own version?
        return effect.allReferenceFromEObject
    }
    
    def matchAndMakeValuedObjects(Effect effect, State state) {
        matchAndMakeValuedObjects(getValuedObjectReferences(effect), state)
    }
    
    /** Takes a list of valued object references and a state as a scope and rereferences the valued object references 
     * to the valued objects already declared in the scope (given state).
     */
    def matchAndMakeValuedObjects(List<ValuedObjectReference> valuedObjectsReferences, State state) {
        // get all declarations in the current scope
        var declaredValuedObjects = getAllDeclarations(state).fold(new ArrayList<ValuedObject>,
            [
                List<ValuedObject> l, Declaration d |
                    l += d.getValuedObjects
                    return l
            ]
        )
        
        for (valOR : valuedObjectsReferences) {
            // reference existing valued object instead of newly created one
            var alreadyDeclared = false
            for (dValO : declaredValuedObjects) {
                if(valOR.valuedObject.name == dValO.name) {
                    alreadyDeclared = true
                    valOR.valuedObject = dValO
                }
            }
            
            if (!alreadyDeclared) {
                // create a new declaration for the new valued object
                val decl = createVariableDeclaration(ValueType.UNKNOWN)
                decl.attach(valOR.valuedObject)
                state.parentRegion.parentState.declarations.add(decl)
                
                // update the declarations
                declaredValuedObjects += valOR.valuedObject
            }
        }
    }
    
    def void initialize() {
        initialize(null, 0, null)
    }
    
    def void initialize(HeaderType[] headerLine) {
        initialize(headerLine, 0, null)
    }
    
    def void initialize(int headerlines) {
        initialize(null, headerlines, null)
    }
    
    def void initialize(List<List<String>> table) {
        initialize(null, 0, table)
    }
    
    def void initialize(HeaderType[] headerLine, int headerlines) {
        initialize(headerLine, headerlines, null)
    }
    
    def void initialize(HeaderType[] headerLine, List<List<String>> table) {
        initialize(headerLine, 0, table)
    }
    
    def void initialize(int headerlines, List<List<String>> table) {
        initialize(null, headerlines, table)
    }
}
