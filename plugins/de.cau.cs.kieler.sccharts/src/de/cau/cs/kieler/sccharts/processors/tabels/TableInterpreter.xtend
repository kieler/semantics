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
abstract class TableInterpreter implements ITableInterpreter {
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
//    @Inject extension KEffectsExtensions
//    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions

    static final String EFFECT_SPLITTER = ";"

    @Accessors
    boolean initialized = false
    @Accessors
    int headerLines
    @Accessors
    HeaderType[] headerLine

    @Accessors
    var List<List<String>> table
//    @Accessors
    var HashMap<String, StateTransitionPriorityWrapper> stateMap = new HashMap<String, StateTransitionPriorityWrapper>

    override SCCharts interpret() {
        val rootstate = createState => [name = "root"]

        val SCCharts scc = createSCChart => [rootStates += rootstate]

        // check for null and initialize as needed
        checkInitialized()
        // check for empty table and empty headerLine
        if (table.empty || headerLine.reject[HeaderType ht|ht == HeaderType.DISCARDABLE].empty) {
            // TODO throw exception when table or header are empty
        } else {
            unifyLineLengths()
            val ControlflowRegion rootRegion = createControlflowRegionWithoutLabel(rootstate, "rootRegion")

            createStates(rootRegion)
            createTransitions
        }

        return scc
    }

    /** Checks if table and headerLine have been initialized and initializes them (with defaults) if necessary */
    def checkInitialized() {
        if (!initialized) {
            initialize()
        }
    }

    /** 
     * create the map of all state names to their correlated states from the table
     * and add them to the given region as needed
     */
    override createStates(ControlflowRegion region) {
        val stateColumn = headerLine.indexOf(HeaderType.STATE)

        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            val stateName = table.get(rowIndex).get(stateColumn)
            // get the state or create a new one if needed
            if (!stateName.isNullOrEmpty && !this.stateMap.containsKey(stateName)) {
                val State state = region.createState(stateName)
                // set first state as the initial state
                if (rowIndex == headerLines) {
                    state.setInitial
                }
                // add the new state, if it didn't exist (returned default)
                this.stateMap.putIfAbsent(stateName, new StateTransitionPriorityWrapper(state))
            }
        }
    }

    def State addSinkState(State neighbour, String stateName) {
        addSinkState(neighbour.parentRegion, stateName)
    }

    def State addSinkState(ControlflowRegion region, String stateName) {
        val State state = region.createState(stateName)
        this.stateMap.putIfAbsent(stateName, new StateTransitionPriorityWrapper(state))
        return state
    }

    def createTransitionWithPrio(
        String sourceStateName,
        String targetStateName,
        Expression trigger,
        Iterable<Effect> effects,
        Integer index
    ) {
        if (!targetStateName.isNullOrEmpty && !sourceStateName.isNullOrEmpty) {
            val sourceWrapper = this.stateMap.get(sourceStateName)
            // TODO sourceState may be null
            var targetWrapper = this.stateMap.get(targetStateName)
            if (targetWrapper === null) {
                targetWrapper = new StateTransitionPriorityWrapper(addSinkState(sourceWrapper.state, targetStateName))
            }
            createTransitionWithPrio(sourceWrapper, targetWrapper, trigger, effects, index)
        }
    }

    /** Creates a transition with a trigger, a list of effects and a priority and handles
     * the declaration of any valued objects.
     * 
     * Attention: Created transitions are *NOT* connected to any sourceState.
     */
    private def createTransitionWithPrio(
        StateTransitionPriorityWrapper sourceWrapper,
        StateTransitionPriorityWrapper targetWrapper,
        Expression trigger,
        Iterable<Effect> effects,
        Integer prio
    ) throws IllegalArgumentException {
        var Transition trans = createTransition => [
            setTargetState(targetWrapper.state)
        ]
        if (prio !== null) {
            sourceWrapper.add(trans, prio)
        } else {
            sourceWrapper.add(trans)
        }

        trans.trigger = trigger
        trans.trigger.matchAndMakeValuedObjects(sourceWrapper.state)
        trans.effects.addAll(effects)
        for (effect : trans.effects) {
            effect.matchAndMakeValuedObjects(sourceWrapper.state)
        }
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

        var indices = <Integer>newArrayList
        for (var int index = 0; index < headerLine.length; index++) {
            if (headerLine.get(index) == hn) {
                indices.add(index)
            }
        }

        return indices
    }

    /** The condition strings are concatenated with a connector and then turned into an expression.
     */
    def Expression conditions2TriggerExpression(Iterable<String> conditionStrs, String connector) {
        // connect all transition conditions with the AND Operator
        var StringBuilder exSB = conditionStrs.fold(
            new StringBuilder(""),
            [ StringBuilder r, String t |
                if (!t.isNullOrEmpty) {
                    if (r.length != 0) {
                        r.append(connector)
                    }
                    r.append(t)
                }
                return r
            ]
        )
        
        return KExtStandaloneParser.parseExpression(exSB.toString)
    }

    /** Turns a list of possibly entangled effect strings into a list of effects. */
    def Iterable<Effect> effectStrings2Expression(Iterable<String> rawEffectStrs) {
        // separate all effects
        val Iterable<String> effectStrs = rawEffectStrs.fold(new ArrayList<String>, [ List<String> l, String raw |
            l.addAll(raw.split(EFFECT_SPLITTER))
            return l
        ])

        // turn strings into effects but ignore empty strings
        val effects = new ArrayList<Effect>
        for (effStr : effectStrs) {
            val Effect eff = KExtStandaloneParser.parseEffect(effStr)
            if (eff !== null) {
                effects.add(eff)
            }
        }
        return effects
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
        // TODO [only relevant for hirarchical tables] does this work or do I need to implement my own version?
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
        // TODO [only relevant for hirarchical tables] does this work or do I need to implement my own version?
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
        var declaredValuedObjects = getAllDeclarations(state).fold(
            new ArrayList<ValuedObject>,
            [ List<ValuedObject> l, Declaration d |
                l += d.getValuedObjects
                return l
            ]
        )

        for (valOR : valuedObjectsReferences) {
            // reference existing valued object instead of newly created one
            var alreadyDeclared = false
            for (dValO : declaredValuedObjects) {
                if (valOR.valuedObject.name == dValO.name) {
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

    /** Unifies the line lengths in the table and returns that length. */
    private def int unifyLineLengths() {
        var longest = 0

        for (var i = 0; i < table.size; i++) {
            val List<String> line = table.get(i)
            val lineLength = line.size()
            if (lineLength > longest) {
                for (var j = 0; j < i; j++) {
                    val tmpLine = table.get(j)
                    addElems(tmpLine, "", lineLength - longest)
                }
                longest = lineLength
            } else if (lineLength < longest) {
                addElems(line, "", longest - lineLength)
            }
        }

        return longest
    }

    /** Adds elem cnt times to the end of the given list. */
    private def <T> addElems(List<T> list, T elem, int cnt) {
        for (var i = 0; i < cnt; i++) {
            list.add(elem)
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
