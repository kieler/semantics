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
package de.cau.cs.kieler.c.sccharts.processors

import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import org.eclipse.cdt.core.dom.ast.IASTNode
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTNameOwner
import org.eclipse.cdt.core.dom.ast.IASTName
import org.eclipse.cdt.core.dom.ast.IASTComment
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTEnumerationSpecifier
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTQualifiedName
import java.util.ArrayList
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTParameterDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import org.eclipse.cdt.core.dom.ast.IASTExpression
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.sccharts.Transition
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.OperatorExpression
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions

/**
 * @author lewe
 *
 */
class StatemachineCppExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension HighlightingExtensions
        
        
     val stateEnumComment = "//_EXTRACTOR_STATE_ENUM"
     val eventEnumComment = "//_EXTRACTOR_EVENT_ENUM"
     val behaviourSwitchComment = "//_EXTRACTOR_BEHAVIOUR_SWITCH"
             
     var State rootState
     var states = <String, State> newHashMap
     var events = <String, ValuedObject> newHashMap
     var transitionContainingFunctions = <String, ArrayList<State>> newHashMap
     var String stateChangeFuncNamespace
     var String stateChangeFuncName
     var transitions = <State, HashMap<State,Transition>> newHashMap
     
     var eventHandlingUsed = false
     var combineTransitions = true
     var includeTransitionContainingFunctions = true
     
     override getId() {
         "de.cau.cs.kieler.c.sccharts.statemachineCppExtractor"
     }
     
     override getName() {
         "Statemachine Extractor"
     }
     
     override process() {
         val tUnit = getModel
         setModel(tUnit.transform as SCCharts)
     }
     
     def EObject transform(IASTTranslationUnit ast) {
         
         if (ast === null) {
             return null
         }
         
         if (ast.children === null) {
             return null
         }
         
         val SCChart = createSCChart
         rootState = createState
         SCChart.rootStates += rootState
         val cRegion = rootState.createControlflowRegion("")
         println("Base SCChart created")
         val stateEnum = findStateEnum(ast)
         val enumStates = stateEnum.getEnumerators
         
         for (var i = 0; i < enumStates.length; i++) {
             val enumState = enumStates.get(i)
             val stateName = enumState.getName.toString
             val state = createState(stateName)
             states.put(stateName, state)
             
             cRegion.states += state
         }
         println("states created")
         val eventEnum = findEventEnum(ast)
         if (eventEnum !== null) {
             eventHandlingUsed = true
             val enumEvents = eventEnum.getEnumerators
             
             for (var i = 0; i < enumEvents.length; i++) {
                 val enumEvent = enumEvents.get(i)
                 val eventName = enumEvent.getName.toString
                 val decl = createVariableDeclaration()
                 decl.type = ValueType::BOOL
                 val vo = decl.createValuedObject(eventName)
                 events.put(eventName, vo)
                 rootState.declarations += decl
             }
         }
         println("optional events created")
         
         val behaviourSwitch = findBehaviourSwitch(ast)
         val switchFuncDef = findContainingFuncDef(behaviourSwitch)
         var IASTName switchFuncIASTName 
         var switchFuncName= "_ast"
         var switchFuncLastname = "_ast"
         var switchFuncNamespace = ""
         if (switchFuncDef !== null) {
             switchFuncIASTName = switchFuncDef.getDeclarator.getName
             if (switchFuncIASTName instanceof CPPASTQualifiedName) {
                 switchFuncLastname = switchFuncIASTName.getLastName.toString
                 switchFuncNamespace = switchFuncIASTName.getQualifier.head.resolveBinding.toString
             } else {
                 switchFuncName = switchFuncIASTName.toString
             }
         }
         println("switch located")
         val stateVar = findCurrentStateVariable(behaviourSwitch)//ast)
         println("state variable determined")
         val stateVarAssignments = findStateVariableAssignments(ast, stateVar)
         var IASTNode stateChangeFuncNameNode
         var IASTBinaryExpression initStateBinExpr
         
         if (stateVarAssignments.length == 2) {
             
             stateChangeFuncNameNode = findStateChangeFunc(stateVarAssignments.get(0))
             
             if (stateChangeFuncNameNode === null) {
                 stateChangeFuncNameNode = findStateChangeFunc(stateVarAssignments.get(1))
                 initStateBinExpr = stateVarAssignments.get(0)
             } else {
                 initStateBinExpr = stateVarAssignments.get(1)
             }
             
         } else {
             println("ERROR: wrong number of State Variable Assignments found")
         }
         println("init state bin expr determined")
         println("state change func name node determined")
         
         if(stateChangeFuncNameNode instanceof CPPASTQualifiedName) {
             val qualName = stateChangeFuncNameNode as CPPASTQualifiedName
             stateChangeFuncName = qualName.getLastName.toString
             stateChangeFuncNamespace = qualName.getQualifier.head.resolveBinding.toString
         } else {
             stateChangeFuncName = stateChangeFuncNameNode.toString
         }
         println("state change func name determined: " + stateChangeFuncName)
         
         
         for (var i = 0; i < ast.children.length; i++) {
             val child = ast.children.get(i)
             if (child instanceof IASTFunctionDefinition) {
                 val funcDecl = (child as IASTFunctionDefinition).getDeclarator
                 val funcName = funcDecl.getName
                 if (funcName instanceof CPPASTQualifiedName) {
                     val funcLastName = (funcName as CPPASTQualifiedName).getLastName.toString
                     val funcNamespace = (funcName as CPPASTQualifiedName).getQualifier.head.resolveBinding.toString
                     if ((!funcLastName.equals(stateChangeFuncName) || !funcNamespace.equals(stateChangeFuncNamespace)) && (!funcLastName.equals(switchFuncLastname) || !funcNamespace.equals(switchFuncNamespace)) && (includeTransitionContainingFunctions)) {
                         val targets = findTargetStates(child)
                         if (targets.length != 0) {
                            transitionContainingFunctions.put(funcLastName, targets)
                         }
                     }
                 } else {
                     if ((!funcName.toString.equals(stateChangeFuncName)) && (!funcName.toString.equals(switchFuncName))) {
                         val targets = findTargetStates(child)
                         if (targets.length != 0) {
                            transitionContainingFunctions.put(funcName.toString, targets)
                         }
                     }
                 }
                 
             }
         }
         println("transition containing functions determined")

         buildTransitions(behaviourSwitch)
         println("transitions build")
         
         if (initStateBinExpr !== null) {
             
             val initState = getInitState(initStateBinExpr)
             if (initState !== null) {
                initState.initial = true
                println("initial state declared")
             } else {
                 println("ERROR: Could not determine the initial State")
             }
         }
         
         SCChart
     }
     
     def State getInitState(IASTBinaryExpression binExp) {
         var State res
         
         val op2 = binExp.getOperand2
         if (op2 instanceof IASTIdExpression) {
             res = states.get(op2.getName.toString)
         } else if (op2 instanceof IASTBinaryExpression) {
             res = getInitState(op2)
         }
         
         res
     }
     
     def ArrayList<IASTBinaryExpression> findStateVariableAssignments(IASTTranslationUnit ast, IASTName stateVar) {
         var res = <IASTBinaryExpression> newArrayList
         
         var binExpressions = <IASTBinaryExpression> newArrayList
         
         for (var i = 0; i < ast.children.length; i++) {
             binExpressions += findBinExpressions(ast.children.get(i))
         }
         for (var i = 0; i < binExpressions.length; i++) {
             val binExpr = binExpressions.get(i)
             if ((binExpr.getOperator == 17) && (binExpr.getOperand1 instanceof IASTIdExpression) && ((binExpr.getOperand1 as IASTIdExpression).getName.toString.equals(stateVar.toString))) {
                 res += binExpr
                 println("Found assignment on state Var")
                 println("op2: " + binExpr.getOperand2)
             }
         }
         
         res
     }
     
     def IASTBinaryExpression findInitStateBinaryExpression(IASTTranslationUnit ast, IASTName stateVar) {
         var IASTBinaryExpression res
         var binExpressions = <IASTBinaryExpression> newArrayList
         
         for (var i = 0; i < ast.children.length; i++) {
             binExpressions += findBinExpressions(ast.children.get(i))
         }
         for (var i = 0; i < binExpressions.length; i++) {
             val binExp = binExpressions.get(i)
             if (binExp.getOperator == 17 && (binExp.getOperand1 instanceof IASTIdExpression) && (stateVar.toString.equals((binExp.getOperand1 as IASTIdExpression).getName.toString))) {
                 val binExprContainingFuncDef = findContainingFuncDef(binExp)
                 val funcName = binExprContainingFuncDef.getDeclarator.getName
                 
                 val op2 = binExp.getOperand2
                 if (op2 instanceof IASTIdExpression) {
                     println("bin Expression mit zuweisung auf stateVariable gefunden!")
                     println("op2 is IdExpr: " + op2.getName.toString)
                     
                 }
                 

                 
                 
                 if (funcName instanceof CPPASTQualifiedName) {
                     if (!funcName.getLastName.toString.equals(stateChangeFuncName) || !funcName.getQualifier.head.resolveBinding.toString.equals(stateChangeFuncNamespace)) {
                         res = binExp
                     }
                 } else {
                     if (!funcName.toString.equals(stateChangeFuncName)) {
                         res = binExp
                     }
                 }
             }
         }
         
         res
     }
     
     def ArrayList<IASTBinaryExpression> findBinExpressions(IASTNode node) {
         var res = <IASTBinaryExpression> newArrayList
         
         for (var i = 0; i < node.children.length; i++) {
             val child = node.children.get(i)
             if (child instanceof IASTBinaryExpression) {
                 res.add(child)
                 res += findBinExpressions(child)
             } else {
                 res += findBinExpressions(child)
             }
         }
         
         res
     }
     
     def buildTransitions(IASTSwitchStatement sw) {
         val startStates = <State> newArrayList
         val swCompound = sw.getBody
         for(var i = 0; i < swCompound.children.length; i++) {
             var stmt = swCompound.children.get(i)
             if(stmt instanceof IASTCaseStatement) {
                 val caseStmt = stmt as IASTCaseStatement
                 val expression = caseStmt.getExpression
                 if (expression instanceof IASTIdExpression) {
                    val caseStateName = (expression as IASTIdExpression).getName.toString
                    val caseState = states.get(caseStateName)
                    caseState.insertHighlightAnnotations(stmt)
                    startStates.add(caseState)
                 }
             } else if(stmt instanceof IASTBreakStatement) {
                 startStates.clear
             } else {
                 if (eventHandlingUsed) {
                     if (stmt instanceof IASTIfStatement) {
                         transitionFromIf(stmt, startStates)
                     }
                     
                 } else {
                     val targetStates = findTargetStates(stmt)
                     
                     for (var j = 0; j < targetStates.length; j++) {
                            for (var k = 0; k < startStates.size; k++) {
                                buildTransition(startStates.get(k), targetStates.get(j), null)
                            }
    
                     }
                 
                 }

             }
         }
     }
     
     def transitionFromIf(IASTIfStatement stmt, ArrayList<State> startStates) {
         val condExpr = stmt.getConditionExpression
         var baseTrigger = condExpr.getTrigger
         val thenComp = stmt.getThenClause
         val thenTargetStates = findTargetStates(thenComp)
                         
         for (var j= 0; j < startStates.length; j++) {
            for (var k = 0; k < thenTargetStates.length; k++) {
                buildTransition(startStates.get(j), thenTargetStates.get(k), baseTrigger);
                             
            }
         }
         val elseComp = stmt.getElseClause
         if (elseComp !== null) {
             if (elseComp instanceof IASTIfStatement) {
                 transitionFromIf(elseComp, startStates)
             } else {
                val elseTargetStates = findTargetStates(elseComp)
                var notTrigger = createOperatorExpression(OperatorType::NOT)
                notTrigger.subExpressions += baseTrigger
                for (var j= 0; j < startStates.length; j++) {
                    for (var k = 0; k < elseTargetStates.length; k++) {
                        buildTransition(startStates.get(j), elseTargetStates.get(k), notTrigger);
                                         
                    }
                }
             }
         
         }
     }
     
     def buildTransition(State startState, State targetState, Expression trigger) {
         if (combineTransitions) {
            if (!transitions.containsKey(startState) || !transitions.get(startState).containsKey(targetState)) {
                val transition = startState.createTransitionTo(targetState)
                if (transitions.containsKey(startState)) {
                    transitions.get(startState).put(targetState, transition)
                } else {
                    val stateTargetStateMap = <State, Transition> newHashMap
                    stateTargetStateMap.put(targetState, transition)
                    transitions.put(startState, stateTargetStateMap)
                }
                if (trigger !== null) {
                    transition.trigger = trigger
                }
            } else if (trigger !== null) {
                val existingTransition = transitions.get(startState).get(targetState)
                val existingTrigger = existingTransition.trigger
                var newTrigger = createOperatorExpression(OperatorType::LOGICAL_OR)
                newTrigger.subExpressions += existingTrigger
                newTrigger.subExpressions += trigger
                existingTransition.trigger = newTrigger
            }
            
         } else {
    
            val transition = startState.createTransitionTo(targetState)
            if (transitions.containsKey(startState)) {
                transitions.get(startState).put(targetState, transition)
            } else {
                val stateTargetStateMap = <State, Transition> newHashMap
                stateTargetStateMap.put(targetState, transition)
                transitions.put(startState, stateTargetStateMap)
            }
            if (trigger !== null) transition.trigger = trigger
        }
     }
     
     def Expression getTrigger(IASTExpression expr) {
         var Expression res
            
         if (expr instanceof IASTArraySubscriptExpression) {
             val subExp = expr.getArgument
             if (subExp instanceof IASTIdExpression) {
                 val eventName = subExp.getName.toString
                 if (events.containsKey(eventName)) {
                     res = events.get(eventName).reference
                 } else {
                     println("ERROR: Event used that was not declared: " + eventName)
                 }
             }
         } else if (expr instanceof IASTUnaryExpression) {
             var opType = expr.getOperator.CDTUnaryOpTypeConversion
             if (opType !== null) {
                 var unExpr = opType.createOperatorExpression
                 
                 var operand = expr.getOperand
                 unExpr.subExpressions += getTrigger(operand)
                 
                 res = unExpr 
             } else {
                 println("ERROR: Unary Expression used that was not translateable to SCCharts")
             }
         } else if (expr instanceof IASTBinaryExpression) {
             var opType = expr.getOperator.CDTBinaryOpTypeConversion
             if (opType !== null) {
                 var unExpr = opType.createOperatorExpression
                 
                 var operand1 = expr.getOperand1
                 unExpr.subExpressions += getTrigger(operand1)
                 var operand2 = expr.getOperand2
                 unExpr.subExpressions += getTrigger(operand2)
                 
                 res = unExpr 
             } else {
                 println("ERROR: Binary Expression used that was not translateable to SCCharts")
             }
         }  
            
         res
     }
     
     def IASTFunctionDefinition findContainingFuncDef(IASTNode node) {
         var IASTFunctionDefinition res 
         var tmp = node.getParent
         while (!(tmp instanceof IASTFunctionDefinition) && !(tmp instanceof IASTTranslationUnit)) {
            tmp = tmp.getParent 
         }
         
         if (tmp instanceof IASTFunctionDefinition) {
             res = tmp as IASTFunctionDefinition
         }
         
         res
     }
     
     def ArrayList<State> findTargetStates(IASTNode stmt) {
         var res = <State> newArrayList
         
         if (stmt instanceof IASTFunctionCallExpression) {
            val funcCall = stmt as IASTFunctionCallExpression
            if(funcCall.getFunctionNameExpression instanceof IASTIdExpression) {
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName
                if (funcName instanceof CPPASTQualifiedName) {
                    if(funcName.getLastName.toString.equals(stateChangeFuncName.toString) && funcName.getQualifier.head.resolveBinding.toString.equals(stateChangeFuncNamespace.toString)) {
                        if(states.containsKey((funcCall.getArguments.head as IASTIdExpression).getName.toString)) {
                            res.add(states.get((funcCall.getArguments.head as IASTIdExpression).getName.toString))
                        }
                    } else if (transitionContainingFunctions.containsKey(funcName.getLastName.toString)) {
                        res += transitionContainingFunctions.get(funcName.getLastName.toString)
                    }
                } else {
                    if(funcName.toString.equals(stateChangeFuncName.toString)) {
                        if(states.containsKey((funcCall.getArguments.head as IASTIdExpression).getName.toString)){
                            res.add(states.get((funcCall.getArguments.head as IASTIdExpression).getName.toString))
                        }
                    } else {
                        
                        if (transitionContainingFunctions.containsKey(funcName.toString)) {
                            res += transitionContainingFunctions.get(funcName.toString)
                        }
                    }    
                }
            }
         }
         
         for (var i = 0; i < stmt.children.length; i++) {
             res += findTargetStates(stmt.children.get(i))
         }
         
         res
     }
     
     def State findTargetState(IASTStatement stmt) {
         var State res
         if(stmt instanceof IASTCompoundStatement) {
             val compStmt = stmt as IASTCompoundStatement
             for(var i= 0; i < compStmt.children.length;i++) {
                 val child = compStmt.children.get(i)
                 if(child instanceof IASTExpressionStatement){
                     val expr = child as IASTExpressionStatement
                     
                     if(expr.getExpression instanceof IASTFunctionCallExpression) {
                         val funcCall = expr.getExpression as IASTFunctionCallExpression
                         val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName
                         if (funcName instanceof CPPASTQualifiedName) {
                             if(funcName.getLastName.toString.equals(stateChangeFuncName.toString) && funcName.getQualifier.head.resolveBinding.toString.equals(stateChangeFuncNamespace.toString)) {
                                 res = states.get((funcCall.getArguments.head as IASTIdExpression).getName.toString)
                             }
                         } else {
                             if(funcName.toString.equals(stateChangeFuncName.toString)) {
                                 res = states.get((funcCall.getArguments.head as IASTIdExpression).getName.toString)
                             }    
                         }
                     }
                 }
             }
         }
         
         res
     }
     
     def IASTIdExpression findAssignSource(IASTBinaryExpression binExpr) {
         var IASTIdExpression res
         
         val op2 = binExpr.getOperand2
         if (op2 instanceof IASTIdExpression) {
             res = op2
         } else if (op2 instanceof IASTBinaryExpression) {
             res = findAssignSource(op2)
         }
         
         res
     }
     
     def IASTName findStateChangeFunc(IASTBinaryExpression binExpr) {//IASTTranslationUnit ast) {//}, IASTName stateVar) {
         var IASTName res
         
         var assignSource = findAssignSource(binExpr)
         
         var match = states.containsKey(assignSource.getName.toString)
         if (!match) {
             res = findContainingFuncDef(binExpr).getDeclarator.getName
         }
         
         return res
     }
     
     def IASTSwitchStatement findBehaviourSwitch(IASTTranslationUnit ast) {
         var IASTSwitchStatement res
         
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(behaviourSwitchComment)
         
         val switchComment = comments.get(idx)
         val commentParentNode = ast.getCommentContainingNode(switchComment)
         val commentFollowingNode = ast.getCommentFollowingNode(switchComment)
      
         if (commentFollowingNode instanceof IASTSwitchStatement) {
            res = commentFollowingNode as IASTSwitchStatement
         }
         
         res
     }
     
     def IASTEnumerationSpecifier findStateEnum(IASTTranslationUnit ast) {
         var IASTEnumerationSpecifier res
         
         //Retrieve the state enumeration comment node
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(stateEnumComment)
         
         if (idx >= 0) {
             val enumComment = comments.get(idx)
             val commentFollowingNode = ast.getCommentFollowingNode(enumComment)
             
             if (commentFollowingNode instanceof IASTSimpleDeclaration && commentFollowingNode.children.head instanceof IASTEnumerationSpecifier) {
                 res = commentFollowingNode.children.head as IASTEnumerationSpecifier
             } else {
                 println("Error: The state enumeration comment does not mark an enumeration")
             }
         } else {
             println("Error: No comment marking the state enumeration found!")
         }
         
         res
     }
     
     def IASTEnumerationSpecifier findEventEnum(IASTTranslationUnit ast) {
         var IASTEnumerationSpecifier res
         
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(eventEnumComment)
         
         if (idx >= 0) {
             val enumComment = comments.get(idx)
             val commentFollowingNode = ast.getCommentFollowingNode(enumComment)
             
             if (commentFollowingNode instanceof IASTSimpleDeclaration && commentFollowingNode.children.head instanceof IASTEnumerationSpecifier) {
                 res = commentFollowingNode.children.head as IASTEnumerationSpecifier
             } else {
                 println("ERROR: Event Comment does not mark an enum!")
             }
         }
         
         res
     }
     
     def IASTName findCurrentStateVariable(IASTSwitchStatement sw) {//IASTTranslationUnit ast) {
         
         var IASTName res = null
         
         val contExpr = sw.getControllerExpression
         if (contExpr instanceof IASTIdExpression) {
             res = contExpr.getName
         } else {
             println("ERROR: Controller Expression of the Behaviour-Switch-Statement is not an IdExpression - Could not find Current-State-Variable!")
         }
         
         res
     }
     
     def IASTNode getCommentFollowingNode(IASTNode ast, IASTComment comment) {
         var IASTNode res
         
         //Get comment location information
         val commentContainingFilename = comment.getContainingFilename
         val commentOffset = comment.getNodeLocations.get(0).getNodeOffset
         
         //iterate thourgh the ast childs to find the following node
         var found = false
         for (var i = 0; i < ast.children.length && !found; i++) {
             //Get the node location information
             val child = ast.children.get(i)
             val childFilename = child.getContainingFilename
             val childOffset = child.getNodeLocations.get(0).getNodeOffset
             val childLength = child.getNodeLocations.get(0).getNodeLength
             
             //Check if the node is in the same file as the comment
             if (childFilename.equals(commentContainingFilename)) {
                 
                 //Check if comment is inside the node
                 if (childOffset < commentOffset && (childOffset + childLength) > commentOffset) {
                     //Following node has to be inside the current node
                     res = getCommentFollowingNode(child, comment)
                     found = true
                 //First comment with greater offset is the comment following node    
                 } else if (childOffset > commentOffset) {
                     res = child
                     found = true
                 }
             }
         }
         
         res
     }
     
     def IASTNode getCommentContainingNode(IASTTranslationUnit ast, IASTComment comment) {
         var IASTNode res = ast
         
         val commentContainingFilename = comment.getContainingFilename
         val commentOffset = comment.getNodeLocations.get(0).getNodeOffset
         
         var containmentFound = true
         
         while(containmentFound) {
             containmentFound = false
             
             for (var i = 0; i < res.children.length && !containmentFound; i++) {
                 val child = res.children.get(i)
                 val childContainingFilename = child.getContainingFilename
                 if(child.getNodeLocations.length > 0){
                     val childOffset = child.getNodeLocations.get(0).getNodeOffset
                     val childLength = child.getNodeLocations.get(0).getNodeLength
                     
                     if ((commentContainingFilename.equals(childContainingFilename)) && (commentOffset > childOffset) && (commentOffset < (childOffset + childLength))) {
                         containmentFound = true
                         res = child
                     }
                 
                 }
             }
         }
         
         res 
     }
     
     def int getIdxOfComment(IASTComment[] comments, String str) {
         var res = -1
         
         for (var i = 0; i < comments.length && res == -1; i++) {
             if(comments.get(i).toString.equals(str)) {
                 res = i
             }
         }
         res
     }

}