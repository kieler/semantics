/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019-2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions
import de.cau.cs.kieler.c.sccharts.extensions.SMExtractorExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTInitializerList
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTQualifiedName
import org.eclipse.emf.ecore.EObject

/**
 * An extractor to extract state machines following the class-based approach from a C++ abstract syntax tree.
 * 
 * @author lan, nre
 */
class ClassBasedSMExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension HighlightingExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SMExtractorExtensions
    
    var State rootState
    var String evaluationFunc
    var String stateChangeFunc
    var Map<String, ValuedObject> inputEvents = newHashMap
    var Map<String, ValuedObject> outputEvents = newHashMap
    var Map<String, State> states = newHashMap
    var Map<String, Map<State, List<String>>> transitionContainingFunctions = newHashMap
    var Map<String, IASTFunctionDefinition> stateEvals = newHashMap
    
    var includeTransitionContainingFunctions = true
    var boolean outputHandlingUsed = false
    
    
    override getId() {
        "de.cau.cs.kieler.c.sccharts.classBasedSMExtractor"
    }
    
    override getName() {
        "Class-SM Extractor"
    }
    
    override process() {
        val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
        var now = LocalDateTime.now
        
        println("Stating StructflowExtractor - Time: " + dtf.format(now))
        val tUnit = getModel
        val model = tUnit.transform as SCCharts
         
        now = LocalDateTime.now
        println("StructflowExtractor finished - Time: " + dtf.format(now))
        
        setModel(model)
    }
    
    def EObject transform(IASTTranslationUnit ast) {
        if (ast === null) {
             return null
         }
         
         if (ast.children === null) {
             return null
         }
         
         // Create SCChart core elements
         val SCChart = createSCChart
         rootState = createState("Class-Based State Machine")
         SCChart.rootStates += rootState
         
         val cRegion = rootState.createControlflowRegion("")
         
         //________EXTRACT STATES_______________
         val stateEnum = findStateEnum(ast)
         val enumStates = stateEnum.getEnumerators
         
         var initial = true
         for (eState : enumStates) {
             var stateName = eState.getName.toString
             if (stateName.indexOf("a") == 0) stateName = stateName.substring(1)
             val state = createState(stateName)
             state.initial = initial
             initial = false
             states.put(stateName, state)
             
             cRegion.states += state
         }
         
         //__________FIND INPUT EVENTS_______________
         val inputEventEnum = findInputEventEnum(ast)
         val inputEnumEvents = inputEventEnum.getEnumerators
         
         for (iEvent : inputEnumEvents) {
             var eventName = iEvent.getName.toString
             
             val decl = createSignalDeclaration() => [
                 input = true
             ]
             rootState.declarations += decl
             
             val vo = decl.createValuedObject(eventName)
             inputEvents.put(eventName, vo)
         }
         
         //__________FIND OUTPUT EVENTS_______________
         val outputEventEnum = findOutputEventEnum(ast)
         if (outputEventEnum !== null) {
             outputHandlingUsed = true
             val outputEnumEvents = outputEventEnum.getEnumerators
             
             for (oEvent : outputEnumEvents) {
                 var eventName = oEvent.getName.toString
                 
                 val decl = createSignalDeclaration() => [
                     output = true
                 ]
                 rootState.declarations += decl
                 
                 val vo = decl.createValuedObject(eventName)
                 outputEvents.put(eventName, vo)
             }
         }
         
         //__________FIND CLASS EVALUATION FUNCTIONS____________
         
         
         val evalFuncDec = findEvalFunc(ast)
         evaluationFunc = evalFuncDec.getName.toString         
         findStateEvals(ast)     
         
         //__________FIND STATE CHANGE FUNC____________
         val stateChangeFuncDec = findStateChangeFunc(ast)
         val stateChangeFuncName = stateChangeFuncDec.getName
         if (stateChangeFuncName instanceof ICPPASTQualifiedName) {
             val segments = stateChangeFuncName.getAllSegments
             stateChangeFunc = segments.get(segments.length - 1).toString 
         } else {
             stateChangeFunc = stateChangeFuncName.toString
         }
             
         //______Find transition containing functions_______
         if (includeTransitionContainingFunctions) {
             var funcDefs = findFuncDefs(ast)
             funcDefs = removeEvaluates(funcDefs) 
             transitionContainingFunctions = findTransitionContainingFunctions(funcDefs, stateChangeFunc) 
         }
         
                      
         //________Build Transitions__________________
         for (state : states.keySet) {
             buildTransitions(state)
         }    
             
         SCChart
    }
    
    // Find all functions that contain state changes
    def Map<String, Map<State, List<String>>> findTransitionContainingFunctions(ArrayList<IASTFunctionDefinition> funcDefs, String stateChangeFunc) {
        val Map<String, Map<State, List<String>>> tcgs = newHashMap
        
        // Test all given func definitions
        for (funcDef : funcDefs) {
            // Retrieve func name
            var funcName = funcDef.getDeclarator.getName
            var funcNameString = funcName.toString
            if (funcName instanceof ICPPASTQualifiedName) {
                val segments = funcName.getAllSegments
                funcNameString = segments.get(segments.length - 1).toString
            } 
            // If function is not the state change func test for potential target states
            if (!funcNameString.equals(stateChangeFunc)) {
                val targetStatesAndOutputs = funcDef.getBody.findTargetStatesAndOutputs(stateChangeFunc)
                if (targetStatesAndOutputs.size > 0) {
                    tcgs.put(funcNameString, targetStatesAndOutputs)
                }
            }
        }
        
        tcgs
    }
    
    // Recursivly find all potential target states reachable from the given node with their outputs
    def Map<State, List<String>> findTargetStatesAndOutputs(IASTNode node, String stateChangeFunc) {
        val Map<State, List<String>> targetStatesAndOutputs = newHashMap
        if (node !== null) {
            // Only a call of the state change function leads to a new target state
            if (node instanceof IASTFunctionCallExpression) {
                val funcCallName = node.getFunctionNameExpression
                if (funcCallName instanceof IASTIdExpression) {
                    var funcName = funcCallName.getName
                    var funcNameString = funcName.toString
                    if (funcName instanceof ICPPASTQualifiedName) {
                        val segments = funcName.getAllSegments
                        funcNameString = segments.get(segments.length - 1).toString
                    }
                    // If the call is the state change function add the parameter as target state
                    if (funcNameString.equals(stateChangeFunc)) {
                        var newStateName = (node.getArguments.head as IASTIdExpression).getName.toString
                        newStateName = newStateName.substring(1)
                        val List<String> outputs = newArrayList
                        if (outputHandlingUsed) {
                            outputs += (node.getArguments.get(1) as IASTInitializerList).getClauses.map [
                                (it as IASTIdExpression).getName.toString
                            ]
                        }
                        if (states.containsKey(newStateName)) {
                            targetStatesAndOutputs.put(states.get(newStateName), outputs)
                        }
                    }
                }
            // If the node is not a function call test its children    
            } else {
                for (var i = 0; i < node.children.length; i++) {
                    targetStatesAndOutputs += node.children.get(i).findTargetStatesAndOutputs(stateChangeFunc)
                }
                
            }
        }        
        return targetStatesAndOutputs
    }
    
    // Removes the class evaluate functions out of a given list of function definitions
    def ArrayList<IASTFunctionDefinition> removeEvaluates(ArrayList<IASTFunctionDefinition> funcDefs) {
        val res = <IASTFunctionDefinition> newArrayList
        
        for (funcDef : funcDefs) {
            // Retrieve func name
            val funcName = funcDef.getDeclarator.getName
            if (funcName instanceof ICPPASTQualifiedName) {
                val nameSegments = funcName.getAllSegments
                val nameSegmentStrings = <String> newArrayList
                
                for (segment : nameSegments) {
                    nameSegmentStrings.add(segment.toString)
                }
                // Tests if the func name is not an evaluate function
                if (!(nameSegmentStrings.contains(evaluationFunc))) res.add(funcDef)
            } else {
                // Tests if the func name is not an evaluate function
                if (!(funcName.toString.equals(evaluationFunc))) res.add(funcDef)
            }
        }        
        res
    }
    
    // Find the evaluate functions for each class
    def findStateEvals(IASTTranslationUnit ast) {
        // Retrieve all function definitions
        val funcDefs = findFuncDefs(ast)
        for (funcDef : funcDefs) {
            // Retrieve function name
            val funcName = funcDef.getDeclarator.getName
            // Name has to be qualified to contain eval func name and state name
            if (funcName instanceof ICPPASTQualifiedName) {
                // Retrieve all name segments as strings
                val nameSegments = funcName.getAllSegments
                val nameSegmentStrings = <String> newArrayList
                for (segment : nameSegments) {
                    nameSegmentStrings.add(segment.toString)
                }
                // Test for each state if the tested function is the states evaluation function
                for (state : states.keySet) {
                    if (nameSegmentStrings.contains(evaluationFunc) && nameSegmentStrings.contains(state)) {
                        stateEvals.put(state, funcDef)
                    }
                }
            }
        }        
    }
    
    // Find all function definitions contained in the given node
    def ArrayList<IASTFunctionDefinition> findFuncDefs(IASTNode node) {
        var res = <IASTFunctionDefinition> newArrayList
        
        if (node instanceof IASTFunctionDefinition) {
            res.add(node)
        } else {
            for (child : node.children) {
                res.addAll(findFuncDefs(child))
                
            }
        }        
        res
    }
    
    // Build transitions for the given state
    def buildTransitions(String state) {
        
        // Retrieve the source state and evaluation function
        val sourceState = states.get(state)
        val evalFunc = stateEvals.get(state)
        var IASTStatement transitionSwitch
        sourceState.insertHighlightAnnotations(evalFunc)
        
        // Find the switch statement testing the event
        for (child : evalFunc.getBody.children) {
            if (child instanceof IASTSwitchStatement) transitionSwitch = child.getBody
        }
        
        // Test the switch statement for transitions
        val evts = <String> newArrayList
        for (child : transitionSwitch.children) {
            // A Case statement contains a new trigger event
            if (child instanceof IASTCaseStatement) {
                val condExp = child.getExpression
                if (condExp instanceof IASTIdExpression) {
                    var expName = condExp.getName.toString
                    if (inputEvents.keySet.contains(expName)) {
                        evts.add(expName)
                    }
                }
            // The break statement removes all active trigger events    
            } else if (child instanceof IASTBreakStatement) {
                evts.clear
            // Every other statement is checked for target states    
            } else {
                val targetStatesAndOutputs = findTransitionTargetsAndOutputs(child)
                // Create a Transition for each target State with their outputs
                targetStatesAndOutputs.forEach [ targetState, outputs |
                    val transition = sourceState.createTransitionTo(targetState)
                    // Create a trigger if trigger events are active
                    if (evts.length >= 1) {
                        var opType = OperatorType::LOGICAL_OR
                        var Expression op1 = inputEvents.get(evts.get(0)).reference
                        var Expression op2
                        // If more than one event is active connect them with OR
                        for (var i = 1; i < evts.length; i++) {
                            op2 = inputEvents.get(evts.get(i)).reference
                            val tmp = opType.createOperatorExpression
                            tmp.subExpressions += op1
                            tmp.subExpressions += op2
                            op1 = tmp
                        }
                        transition.trigger = op1
                        // Set the outputs
                        for (output : outputs) {
                            transition.createEmission(outputEvents.get(output))
                        }
                    }
                ]
            }
        }
    }
    
    // Find all states reachable from the given statement with their outputs
    def Map<State, List<String>> findTransitionTargetsAndOutputs(IASTNode stmt) {
        var Map<State, List<String>> targetStatesAndOutputs = newHashMap
        // Only a function call can contain a target state
        if (stmt instanceof IASTFunctionCallExpression) {
            val funcName = stmt.getFunctionNameExpression
            var funcNameString = funcName.toString
            if (funcName instanceof ICPPASTQualifiedName) {
                val segments = funcName.getAllSegments
                funcNameString = segments.get(segments.length - 1).toString
            }
            // If the called function is the state change function add the state in the argument to the target states
            if (funcNameString.equals(stateChangeFunc)) {
                var stateName = (stmt.getArguments.head as IASTIdExpression).getName.toString
                if (stateName.indexOf("a") == 0) stateName = stateName.substring(1)
                val List<String> outputs = newArrayList
                if (outputHandlingUsed) {
                    outputs += (stmt.getArguments.get(1) as IASTInitializerList).getClauses.map [
                        (it as IASTIdExpression).getName.toString
                    ]
                }
                if (states.containsKey(stateName)) {
                    // Add func call parameter to target States
                    targetStatesAndOutputs.put(states.get(stateName), outputs)
                }
            // If the called function is TCG add all its target states     
            } else if (includeTransitionContainingFunctions && transitionContainingFunctions.containsKey(funcNameString)) {
                targetStatesAndOutputs = transitionContainingFunctions.get(funcNameString)
            }
        
        // If the node is not a function call test each child    
        } else {
            for (child : stmt.children) {
                targetStatesAndOutputs.putAll(findTransitionTargetsAndOutputs(child))
            } 
        }
        return targetStatesAndOutputs
    }
}