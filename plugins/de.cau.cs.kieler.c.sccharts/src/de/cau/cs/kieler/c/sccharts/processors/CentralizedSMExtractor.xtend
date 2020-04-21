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
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
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
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import org.eclipse.cdt.core.dom.ast.IASTInitializerList
import org.eclipse.cdt.core.dom.ast.IASTName
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTQualifiedName
import org.eclipse.emf.ecore.EObject

/**
 * An extractor to extract state machines following the centralized approach from C++ source code.
 * 
 * @author lewe, nre
 */
class CentralizedSMExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension CDTConvertExtensions
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
     val Map<String, State> states = newHashMap
     val Map<String, ValuedObject> inputEvents = newHashMap
     val Map<String, ValuedObject> outputEvents = newHashMap
     val Map<String, Map<State, List<String>>> transitionContainingFunctions = newHashMap
     var String stateChangeFuncNamespace
     var String stateChangeFuncName
     val Map<State, HashMap<State,Transition>>transitions = newHashMap
     
     var eventHandlingUsed = false
     var boolean outputHandlingUsed = false
     var combineTransitions = true
     var includeTransitionContainingFunctions = true
     
     override getId() {
         "de.cau.cs.kieler.c.sccharts.centralizedSMExtractor"
     }
     
     override getName() {
         "Statemachine Extractor"
     }
     
     override process() {
         val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
        var now = LocalDateTime.now
        
        println("Starting Centralized State Machine Extractor - Time: " + dtf.format(now))
        val tUnit = getModel
        val model = tUnit.transform as SCCharts
         
        now = LocalDateTime.now
        println("Centralized State Machine Extractor finished - Time: " + dtf.format(now))
        
        setModel(model)
     }
     
     def EObject transform(IASTTranslationUnit ast) {
         
         if (ast === null) {
             return null
         }
         
         if (ast.children === null) {
             return null
         }
         
         // Create the SCChart and root elements
         val SCChart = createSCChart
         rootState = createState("Centralized State Machine")
         SCChart.rootStates += rootState
         val cRegion = rootState.createControlflowRegion("")
         
         // _______Find States_____________
         val stateEnum = findStateEnum(ast)
         val enumStates = stateEnum.getEnumerators
         
         //________Create States_________
         for (enumState : enumStates) {
             val stateName = enumState.getName.toString
             val state = createState(stateName)
             states.put(stateName, state)             
             cRegion.states += state
         }
         
         //_____Find Input Events_______________ 
         val inputEventEnum = findInputEventEnum(ast)
         if (inputEventEnum !== null) {
             eventHandlingUsed = true
             val enumEvents = inputEventEnum.getEnumerators
             
             //_____Create Events_____________
             for (enumEvent : enumEvents) {
                 val eventName = enumEvent.getName.toString
                 val decl = createSignalDeclaration() => [
                     input = true
                 ]
                 val vo = decl.createValuedObject(eventName)
                 inputEvents.put(eventName, vo)
                 rootState.declarations += decl
             }
         }
         
         //_____Find Output Events_______________
         val outputEventEnum = findOutputEventEnum(ast)
         if (outputEventEnum !== null) {
             outputHandlingUsed = true
             val enumEvents = outputEventEnum.getEnumerators
             
             //_____Create Events_____________
             for (enumEvent : enumEvents) {
                 val eventName = enumEvent.getName.toString
                 val decl = createSignalDeclaration() => [
                     output = true
                 ]
                 val vo = decl.createValuedObject(eventName)
                 outputEvents.put(eventName, vo)
                 rootState.declarations += decl
             }
         }
         
         //______Find Central Switch____________
         val behaviourSwitch = findBehaviourSwitch(ast)
         // Find switch containing function name
         val switchFuncDef = findContainingFuncDef(behaviourSwitch)
         var IASTName switchFuncIASTName 
         var switchFuncName= "_ast"
         var switchFuncLastname = "_ast"
         var switchFuncNamespace = ""
         if (switchFuncDef !== null) {
             switchFuncIASTName = switchFuncDef.getDeclarator.getName
             // Check if func name is simple or qualified
             if (switchFuncIASTName instanceof ICPPASTQualifiedName) {
                 switchFuncLastname = switchFuncIASTName.getLastName.toString
                 switchFuncNamespace = switchFuncIASTName.getQualifier.head.resolveBinding.toString
             } else {
                 switchFuncName = switchFuncIASTName.toString
             }
         }
         
         //_______Find Current State Var___________
         val stateVar = findCurrentStateVariable(behaviourSwitch)
         
         //_______Find State Change Function_______
         val stateVarAssignments = findStateVariableAssignments(ast, stateVar)
         var IASTFunctionDeclarator stateChangeFuncNode
         var IASTBinaryExpression initStateBinExpr
         
         // Check which assignment is inside the state change function and which is the initial state assignment
         if (stateVarAssignments.length == 2) {
             stateChangeFuncNode = findStateChangeFunc(stateVarAssignments.get(0))
             if (stateChangeFuncNode === null) {
                 stateChangeFuncNode = findStateChangeFunc(stateVarAssignments.get(1))
                 initStateBinExpr = stateVarAssignments.get(0)
             } else {
                 initStateBinExpr = stateVarAssignments.get(1)
             }             
         } else {
             println("ERROR: wrong number of State Variable Assignments found: " + stateVarAssignments.length)
         }
         
         // Extract the state change func name
         if (stateChangeFuncNode.name instanceof ICPPASTQualifiedName) {
             val qualName = stateChangeFuncNode.name as ICPPASTQualifiedName
             stateChangeFuncName = qualName.getLastName.toString
             stateChangeFuncNamespace = qualName.getQualifier.head.resolveBinding.toString
         } else {
             stateChangeFuncName = stateChangeFuncNode.name.toString
         }
         
         // Analyse the function definitions for transition containing functions (TCG)
         for (var i = 0; i < ast.children.length; i++) {
             val child = ast.children.get(i)
             if (child instanceof IASTFunctionDefinition) {
                 // Get the name of potential TCG (state change func and switch containing func are not analysed)
                 val funcDecl = (child as IASTFunctionDefinition).getDeclarator
                 val funcName = funcDecl.getName
                 // Test if function name is qualified or simple
                 if (funcName instanceof ICPPASTQualifiedName) {
                     val funcLastName = (funcName as ICPPASTQualifiedName).getLastName.toString
                     val funcNamespace = (funcName as ICPPASTQualifiedName).getQualifier.head.resolveBinding.toString
                     if ((!funcLastName.equals(stateChangeFuncName) || !funcNamespace.equals(stateChangeFuncNamespace))
                         && (!funcLastName.equals(switchFuncLastname) || !funcNamespace.equals(switchFuncNamespace))
                         && (includeTransitionContainingFunctions)) {
                         // Find potential target states for the function
                         val targetsAndOutputs = findTargetStatesAndOutputs(child)
                         if (targetsAndOutputs.size != 0) {
                            transitionContainingFunctions.put(funcLastName, targetsAndOutputs)
                         }
                     }
                 } else {
                     if ((!funcName.toString.equals(stateChangeFuncName)) && (!funcName.toString.equals(switchFuncName))) {
                         // Find potential target states for the function
                         val targetsAndOutputs = findTargetStatesAndOutputs(child)
                         if (targetsAndOutputs.size != 0) {
                            transitionContainingFunctions.put(funcName.toString, targetsAndOutputs)
                         }
                     }
                 }
                 
             }
         }

         // Build the transitions
         buildTransitions(behaviourSwitch)
         
         // Set the initial State
         if (initStateBinExpr !== null) {
             
             val initState = getInitState(initStateBinExpr)
             if (initState !== null) {
                initState.initial = true
             } else {
                 println("ERROR: Could not determine the initial State")
             }
         }
         
         SCChart
     }
     
     // Extract the initial state out of the initial state assignment
     def State getInitState(IASTBinaryExpression binExp) {
         var State res
         
         val op2 = binExp.getOperand2
         if (op2 instanceof IASTIdExpression) {
             res = states.get(op2.getName.toString)
         
         // If multiple state variables are used like in the ardumower project the assignment could be a chain for every variable    
         } else if (op2 instanceof IASTBinaryExpression) {
             res = getInitState(op2)
         }
         
         res
     }
     
     // Find all assignments on the state variable
     def ArrayList<IASTBinaryExpression> findStateVariableAssignments(IASTTranslationUnit ast, IASTName stateVar) {
         var assignments = <IASTBinaryExpression> newArrayList
         var binExpressions = <IASTBinaryExpression> newArrayList
         
         // Find all binary expressions
         for (child : ast.children) {
             binExpressions += findBinExpressions(child)
         }
         // Filter for state var assignments
         for (binExpr : binExpressions) {
             if ((binExpr.getOperator == IASTBinaryExpression.op_assign) && (binExpr.getOperand1 instanceof IASTIdExpression) && ((binExpr.getOperand1 as IASTIdExpression).getName.toString.equals(stateVar.toString))) {
                 assignments += binExpr
             }
         }
         
         assignments
     }

     // Find all BinaryExpression child nodes of the given node
     def ArrayList<IASTBinaryExpression> findBinExpressions(IASTNode node) {
         var binExpressions = <IASTBinaryExpression> newArrayList
         
         for (var i = 0; i < node.children.length; i++) {
             val child = node.children.get(i)
             if (child instanceof IASTBinaryExpression) {
                 binExpressions.add(child)
                 binExpressions += findBinExpressions(child)
             } else {
                 binExpressions += findBinExpressions(child)
             }
         }
         
         binExpressions
     }
     
     // Build all transitions defined in the given switch statement
     def buildTransitions(IASTSwitchStatement sw) {
         // A list containing all possible start states that are not excluded by a break
         val startStates = <State> newArrayList
         val swCompound = sw.getBody
         for (stmt : swCompound.children) {
             // If the child is a case a new potential start state is found
             if (stmt instanceof IASTCaseStatement) {
                 val expression = stmt.getExpression
                 if (expression instanceof IASTIdExpression) {
                    val caseStateName = expression.getName.toString
                    val caseState = states.get(caseStateName)
                    caseState.insertHighlightAnnotations(stmt)
                    startStates.add(caseState)
                 } 
             // Clear the list of start states on a break statement    
             } else if (stmt instanceof IASTBreakStatement) {
                 startStates.clear
             // Look for state change function calls for other statements    
             } else {
                 // Decide if the eventhandling is used
                 if (eventHandlingUsed) {
                     if (stmt instanceof IASTIfStatement) {
                         transitionFromIf(stmt, startStates)
                     }
                     
                 } else {
                     val targetStatesAndOutputs = findTargetStatesAndOutputs(stmt)
                     targetStatesAndOutputs.forEach [ targetState, outputs |
                        for (startState : startStates) {
                            buildTransition(startState, targetState, null, outputs)
                        }    
                     ]
                 }
             }
         }
     }
     
     // Create transitions following the Event Scheme
     def void transitionFromIf(IASTIfStatement stmt, ArrayList<State> startStates) {
         // Extract trigger expression 
         val condExpr = stmt.getConditionExpression
         val baseTrigger = condExpr.getTrigger
         // Find Target States of then branch
         val thenComp = stmt.getThenClause
         val thenTargetStatesAndOutputs = findTargetStatesAndOutputs(thenComp)
        
         // Build transitions for then branch                         
         for (startState : startStates) {
            thenTargetStatesAndOutputs.forEach[targetState, outputs |
                buildTransition(startState, targetState, baseTrigger, outputs);
            ]
         }
         
         // Look for else branch
         val elseComp = stmt.getElseClause
         if (elseComp !== null) {
             // If else branch is another IfStatement start recursively
             if (elseComp instanceof IASTIfStatement) {
                 transitionFromIf(elseComp, startStates)
             // Build transitions for else branch with negated trigger otherwise    
             } else {
                val elseTargetStatesAndOutputs = findTargetStatesAndOutputs(elseComp)
                val notTrigger = createOperatorExpression(OperatorType::NOT)
                notTrigger.subExpressions += baseTrigger
                for (startState : startStates) {
                    elseTargetStatesAndOutputs.forEach [ targetState, outputs |
                        buildTransition(startState, targetState, notTrigger, outputs);
                    ]
                }
             }
         
         }
     }
     
     /** Create the transition between the given states with the given trigger*/
     def buildTransition(State startState, State targetState, Expression trigger, List<String> outputs) {
         if (combineTransitions) {
            // Test if an transition with the same start and target state already exists
            if (!transitions.containsKey(startState) || !transitions.get(startState).containsKey(targetState)) {
                // Create the transition
                val transition = startState.createTransitionTo(targetState)
                if (transitions.containsKey(startState)) {
                    transitions.get(startState).put(targetState, transition)
                } else {
                    val stateTargetStateMap = <State, Transition> newHashMap
                    stateTargetStateMap.put(targetState, transition)
                    transitions.put(startState, stateTargetStateMap)
                }
                // Set the trigger
                if (trigger !== null) {
                    transition.trigger = trigger
                }
                // Set the outputs
                for (output : outputs) {
                    transition.createEmission(outputEvents.get(output))
                }
            // If transitions are merged merge the trigger too    
            } else if (trigger !== null) {
                val existingTransition = transitions.get(startState).get(targetState)
                val existingTrigger = existingTransition.trigger
                var newTrigger = createOperatorExpression(OperatorType::LOGICAL_OR)
                newTrigger.subExpressions += existingTrigger
                newTrigger.subExpressions += trigger
                existingTransition.trigger = newTrigger
            }
            
         } else {
            // If no merging is tested just create the transition with the given trigger
            val transition = startState.createTransitionTo(targetState)
            if (transitions.containsKey(startState)) {
                transitions.get(startState).put(targetState, transition)
            } else {
                val stateTargetStateMap = <State, Transition> newHashMap
                stateTargetStateMap.put(targetState, transition)
                transitions.put(startState, stateTargetStateMap)
            }
            if (trigger !== null) transition.trigger = trigger
            // Set the outputs
            for (output : outputs) {
                transition.createEmission(outputEvents.get(output))
            }
        }
     }
     
     // Extract the trigger of an ifStatement following the event scheme
     def Expression getTrigger(IASTExpression expr) {
         var Expression trigger
         // Event scheme expects an array to contain all events   
         if (expr instanceof IASTArraySubscriptExpression) {
             // The Array argument expression should contain the event name
             val subExp = expr.getArgument
             if (subExp instanceof IASTIdExpression) {
                 val eventName = subExp.getName.toString
                 if (inputEvents.containsKey(eventName)) {
                     trigger = inputEvents.get(eventName).reference
                 } else {
                     println("ERROR: Event used that was not declared: " + eventName)
                 }
             } else {
                 println("ERROR: Event Array was not used with an Event")
             }
         // Extract an Unary Expression for the trigger such as NOT    
         } else if (expr instanceof IASTUnaryExpression) {
             var opType = expr.getOperator.CDTUnaryOpTypeConversion
             if (opType !== null) {
                 var unExpr = opType.createOperatorExpression
                 
                 var operand = expr.getOperand
                 unExpr.subExpressions += getTrigger(operand)
                 
                 trigger = unExpr 
             } else {
                 println("ERROR: Unary Expression used that was not translatable to SCCharts")
             }
         // Extract Binary Expression for the trigger such as AND    
         } else if (expr instanceof IASTBinaryExpression) {
             var opType = expr.getOperator.CDTBinaryOpTypeConversion
             if (opType !== null) {
                 var unExpr = opType.createOperatorExpression
                 
                 var operand1 = expr.getOperand1
                 unExpr.subExpressions += getTrigger(operand1)
                 var operand2 = expr.getOperand2
                 unExpr.subExpressions += getTrigger(operand2)
                 
                 trigger = unExpr 
             } else {
                 println("ERROR: Binary Expression used that was not translatable to SCCharts")
             }
         }  
            
         trigger
     }
     
     // Find the function Definition that contains the given node
     def IASTFunctionDefinition findContainingFuncDef(IASTNode node) {
         var IASTFunctionDefinition res 
         var parent = node.getParent
         // Test the parent node until the function definition is found or the ast top level node is reached
         while (!(parent instanceof IASTFunctionDefinition) && !(parent instanceof IASTTranslationUnit)) {
            parent = parent.getParent 
         }
         
         if (parent instanceof IASTFunctionDefinition) {
             res = parent
         }
         
         res
     }
     
     // Find all target states reachable by the given statement with their outputs
     def Map<State, List<String>> findTargetStatesAndOutputs(IASTNode stmt) {
         var targetStatesAndOutputs = <State, List<String>> newHashMap
         
         // Only function calls can trigger state changes
         if (stmt instanceof IASTFunctionCallExpression) {
            // Retrieve the function Name 
            val funcNameExpression = stmt.getFunctionNameExpression 
            if (funcNameExpression instanceof IASTIdExpression) {
                val funcName = funcNameExpression.getName
                // Test if the name is qualified or simple
                if (funcName instanceof ICPPASTQualifiedName) {
                    // Test if func call is call of state change function
                    if (funcName.getLastName.toString.equals(stateChangeFuncName.toString)
                        && funcName.getQualifier.head.resolveBinding.toString.equals(stateChangeFuncNamespace.toString)) {
                        val stateName = (stmt.getArguments.head as IASTIdExpression).getName.toString
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
                    // Test if func call is a TCG    
                    } else if (transitionContainingFunctions.containsKey(funcName.getLastName.toString)) {
                        targetStatesAndOutputs += transitionContainingFunctions.get(funcName.getLastName.toString)
                    }
                } else {
                    // Test if func call is call of state change function
                    if (funcName.toString.equals(stateChangeFuncName.toString)) {
                        val stateName = (stmt.getArguments.head as IASTIdExpression).getName.toString
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
                    } else {
                        // Test if func call is a TCG    
                        if (transitionContainingFunctions.containsKey(funcName.toString)) {
                            targetStatesAndOutputs += transitionContainingFunctions.get(funcName.toString)
                        }
                    }    
                }
            }
         }
         
         // If Statement is not a function call test all child nodes
         for (var i = 0; i < stmt.children.length; i++) {
             targetStatesAndOutputs += findTargetStatesAndOutputs(stmt.children.get(i))
         }
         
         targetStatesAndOutputs
     }
     
     // Find the source expression of an assignment - used for the state variable assignments (expects idexpression)
     def IASTIdExpression findAssignSource(IASTBinaryExpression binExpr) {
         var IASTIdExpression res
         
         val op2 = binExpr.getOperand2
         if (op2 instanceof IASTIdExpression) {
             res = op2
         // Test for potential variable chain assignments    
         } else if (op2 instanceof IASTBinaryExpression) {
             res = findAssignSource(op2)
         }
         
         res
     }
     
     // Tests if the given binary expression is the one in the state change function 
     def IASTFunctionDeclarator findStateChangeFunc(IASTBinaryExpression binExpr) {
         var IASTFunctionDeclarator declarator
         
         var assignSource = findAssignSource(binExpr)
         
         // Test if the assignment assigns a known state (that would be the initial state) 
         var match = states.containsKey(assignSource.getName.toString)
         if (!match) {
             declarator = findContainingFuncDef(binExpr).getDeclarator
         }
         
         return declarator
     }
     
     // Find the current state Variable in the given switch statement
     def IASTName findCurrentStateVariable(IASTSwitchStatement sw) {
         
         var IASTName stateVarName = null
         
         val contExpr = sw.getControllerExpression
         if (contExpr instanceof IASTIdExpression) {
             stateVarName = contExpr.getName
         } else {
             println("ERROR: Controller Expression of the Behaviour-Switch-Statement is not an IdExpression - Could not find Current-State-Variable!")
         }
         
         stateVarName
     }

}