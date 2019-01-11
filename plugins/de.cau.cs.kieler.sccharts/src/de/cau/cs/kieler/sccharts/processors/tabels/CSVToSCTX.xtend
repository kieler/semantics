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
package de.cau.cs.kieler.sccharts.processors.tabels

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.List
import java.util.Map

/**
 * @author ssm
 * @kieler.design 2018-10-12 proposed
 * @kieler.rating 2018-10-12 proposed yellow 
 */
class CSVToSCTX extends ExogenousProcessor<String, SCCharts> {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    
//    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    public static val IProperty<String> CSV2SCC_ROOTSTATE_NAME = 
        new Property<String>("de.cau.cs.kieler.sccharts.csv.rootStateName", "CSV Spec")        
    public static val IProperty<Integer> CSV2SCC_COLS = 
        new Property<Integer>("de.cau.cs.kieler.sccharts.csv.cols", 7)        
    public static val IProperty<String> CSV2SCC_SEPARATOR = 
        new Property<String>("de.cau.cs.kieler.sccharts.csv.sepatator", ";")
        
    public static val IProperty<Integer> CSV2SCC_SOURCE_STATE_COL = 
        new Property<Integer>("de.cau.cs.kieler.sccharts.csv.col.sourceState", 1)        
    public static val IProperty<Integer> CSV2SCC_CONDITIONAL_HIERARCHIES = 
        new Property<Integer>("de.cau.cs.kieler.sccharts.csv.conditional.hierarchies", 2)        
    public static val List<IProperty<Integer>> CSV2SCC_CONDITIONAL_COLS = #[  
            new Property<Integer>("de.cau.cs.kieler.sccharts.csv.col.conditional.l0", 2),
            new Property<Integer>("de.cau.cs.kieler.sccharts.csv.col.conditional.l0", 3)
        ]        
    public static val IProperty<Integer> CSV2SCC_ACTION_COL = 
        new Property<Integer>("de.cau.cs.kieler.sccharts.csv.col.action", 4)        
    public static val IProperty<Integer> CSV2SCC_TARGET_STATE_COL = 
        new Property<Integer>("de.cau.cs.kieler.sccharts.csv.col.sourceState", 5)        
    public static val IProperty<Integer> CSV2SCC_COMMENT_COL = 
        new Property<Integer>("de.cau.cs.kieler.sccharts.csv.col.comments", 6)        
                
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.CSVToSCTX"
    }
    
    override getName() {
        "CSV to SCTX"
    }
    
    override process() {
        val sourceString = getModel
        
        val csvTable = new CSVTable(sourceString, environment.getProperty(CSV2SCC_SEPARATOR).charAt(0), 
            environment.getProperty(CSV2SCC_COLS)
        )
        
        val rootState = createState => [
            name = environment.getProperty(CSV2SCC_ROOTSTATE_NAME)
        ] 
        val scc = createSCChart => [
            rootStates += rootState
        ]
        
        csvTable.generateStateContent(rootState)
        
        setModel(scc)
    }
    
    private def generateStateContent(CSVTable csv, State state) {
        val cfr = createControlflowRegion(state, "")
        
        val condConnectors = <Pair<String, String>, State> newHashMap
        
        val states = csv.createStates(cfr)
        val objects = csv.createValuedObjects(state)
        val transitions = csv.createTransitions(states, objects, condConnectors)
//        val comments = csv.createComments(states)
    }
    
    private def createStates(CSVTable csv, ControlflowRegion cfr) {
        val stateList = <String> newLinkedHashSet
        for (row : csv.table) {
            val sname = row.get(environment.getProperty(CSV2SCC_SOURCE_STATE_COL))
            val tname = row.get(environment.getProperty(CSV2SCC_TARGET_STATE_COL))
            stateList.add(sname) 
            stateList.add(tname)
        }
        
        val stateMap = <String, State> newHashMap
        for (s : stateList) {
            val newState = cfr.createState(s)
            stateMap.put(s, newState)    
        }
        stateMap.get(stateList.head).initial = true
        
        return stateMap
    }
    
    private def createValuedObjects(CSVTable csv, State state) {
        val declaration = createBoolDeclaration => [
            state.declarations += it
            input = true
        ]
        
        val wordList = <String, Integer> newHashMap
        val hierarchies = environment.getProperty(CSV2SCC_CONDITIONAL_HIERARCHIES) 
        for (row : csv.table) {
            for (h : 0..<hierarchies) {
                val cond = row.get(environment.getProperty(CSV2SCC_CONDITIONAL_COLS.get(h)))
                val words = cond.split("\\W+");
                
                for (w : words.filter[!it.nullOrEmpty]) {
                    wordList.put(w, h)
                }
            }             
        }

        val valuedObjectMap = <String, ValuedObject> newHashMap
        var constCounter = 0
        for (w : wordList.keySet) {
            val wname = w
            
            
            if (wname.isAllUpperCase) {
                val constDecl = createIntDeclaration => [
                    const = true
                ]
                val vo = state.createValuedObject(wname, constDecl)
                vo.initialValue = createIntValue(constCounter)
                valuedObjectMap.put(w, vo)
                constCounter++
            } else {
                val vo = state.createValuedObject(wname, declaration)
                valuedObjectMap.put(w, vo)
            }
                
        }
        return valuedObjectMap
    }
    
    private def createTransitions(CSVTable csv, Map<String, State> stateMap,
        Map<String, ValuedObject> objects, 
        Map<Pair<String, String>, State> condConnectors
    ) {
        val transitionMap = <String, Transition> newHashMap
        
        for (row : csv.table) {
            val sname = row.get(environment.getProperty(CSV2SCC_SOURCE_STATE_COL))
            val tname = row.get(environment.getProperty(CSV2SCC_TARGET_STATE_COL))
            val condition = row.get(environment.getProperty(CSV2SCC_CONDITIONAL_COLS.get(0)))
            val condition2 = row.get(environment.getProperty(CSV2SCC_CONDITIONAL_COLS.get(1)))
            val action = row.get(environment.getProperty(CSV2SCC_ACTION_COL)) 
            val comment = row.get(environment.getProperty(CSV2SCC_COMMENT_COL)).replaceAll("\\\\n", "\n")
            val condPair = new Pair<String, String>(sname, condition)
            
            val sourceState = stateMap.get(sname)
            
            if (!condConnectors.keySet.contains(condPair)) {
                val connector = createState(sourceState.parentRegion, "c" + Math.abs(condPair.hashCode).toString) => [
                    connector = true
                ]
                condConnectors.put(condPair, connector)    
                val connTransition = sourceState.createTransitionTo(connector)
                connTransition.createTrigger(condition, objects)
            } 
            
            val targetState = stateMap.get(tname)
            val connState = condConnectors.get(condPair)
            
            val transition = connState.createTransitionTo(targetState)
            transition.createTrigger(condition2, objects)
            transition.createActions(action, objects) 
            transition.addCommentAnnotation(null, comment)
            
        }
        return transitionMap
    }
    
    private def createTrigger(Transition transition, String triggerString, Map<String, ValuedObject> objects) {
        if (triggerString.contains(" == ") || triggerString.contains(" != ")) {
            var s = null as String[]
            var OperatorType operator
            if (triggerString.contains(" == ")) {
                s = triggerString.split(" == ")
                operator = OperatorType.EQ
            } else {
                s = triggerString.split(" != ")
                operator = OperatorType.NE
            }
            val first = objects.get(s.get(0))
            val second = objects.get(s.get(1))
            if (first === null || second === null) {
                System.err.println("VO does not exists! " + first + " " + second + " " + triggerString)
                return
            } 
            val op = operator
            val opExp = 
                createOperatorExpression => [
                    subExpressions += first.reference
                    subExpressions += second.reference
                    it.operator = op
            ]                     
            transition.trigger = opExp
        } else if (objects.keySet.contains(triggerString)) {
            val vo = objects.get(triggerString)
            transition.trigger = vo.reference
        }
    }
    
    private def createActions(Transition transition, String actionString, Map<String, ValuedObject> objects) {
        if (actionString.nullOrEmpty) return
        
        val effect = actionString.createHostcodeEffect
        transition.addEffect(effect)            
    }    
    
    
    private static def isAllUpperCase(String s) {
        for (var i=0; i<s.length; i++) {
            if (!Character.isUpperCase(s.charAt(i))) 
                return false;
        }
        return true
    }
    
}
