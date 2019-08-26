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

/**
 * @author lewe
 *
 */
class StatemachineCppExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
        
        
     val currentStateVariableComment = "//_EXTRACTOR_CURRENT_STATE_VARIABLE"
     val stateEnumComment = "//_EXTRACTOR_STATE_ENUM"
     val stateChageFunctionComment = "//_EXTRACTOR_STATE_CHANGE_FUNCTION"
     val behaviourSwitchComment = "//_EXTRACTOR_BEHAVIOUR_SWITCH"
             
     var State rootState
     var states = <String, State> newHashMap
     var transitionContainingFunctions = <String, ArrayList<State>> newHashMap
     var String stateChangeFuncNamespace
     var String stateChangeFuncName
     var transitions = <State, ArrayList<State>> newHashMap
     
     var combineTransitions = true
     var includeTransitionContainingFunctions = true
     
     override getId() {
         "de.cau.cs.kieler.c.sccharts.statemachineCppExtractor"
     }
     
     override getName() {
         "Statemachine Extractor C++"
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
         
         val stateEnum = findStateEnum(ast)
         val enumStates = stateEnum.getEnumerators
         
         for (var i = 0; i < enumStates.length; i++) {
             val enumState = enumStates.get(i)
             val stateName = enumState.getName.toString
             val state = createState(stateName)
             states.put(stateName, state)
             
             cRegion.states += state
         }
         
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
         
         val stateVar = findCurrentStateVariable(behaviourSwitch)//ast)
         val stateVarAssignments = findStateVariableAssignments(ast, stateVar)
         var IASTNode stateChangeFuncNameNode
         var IASTBinaryExpression initStateBinExpr
         
         if (stateVarAssignments.length == 2) {
             
             stateChangeFuncNameNode = findStateChangeFunc(stateVarAssignments.get(0))
             
             if (stateChangeFuncNameNode === null) {
                 stateChangeFuncNameNode = findStateChangeFunc(stateVarAssignments.get(1))
                 initStateBinExpr = stateVarAssignments.get(0)
             } else {
                 initStateBinExpr = stateVarAssignments.get(0)
             }
             
         } else {
             println("ERROR: wrong number of State Variable Assignments found")
         }
         
//         val stateChangeFuncNameNode = findStateChangeFunc(ast)//, stateVar) 
         
         if(stateChangeFuncNameNode instanceof CPPASTQualifiedName) {
             val qualName = stateChangeFuncNameNode as CPPASTQualifiedName
             stateChangeFuncName = qualName.getLastName.toString
             stateChangeFuncNamespace = qualName.getQualifier.head.resolveBinding.toString
         } else {
             stateChangeFuncName = stateChangeFuncNameNode.toString
         }
         
//         val initStateBinExpr = findInitStateBinaryExpression(ast, stateVar)
         
         
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
         
//         println(transitionContainingFunctions)
         
//         println("behaviourSwitch: " + behaviourSwitch)
         buildTransitions(behaviourSwitch)
         
         
         if (initStateBinExpr !== null) {
//             println("")
//             println("Found state Init Bin Expr: ")
//             println(initStateBinExpr.toString)
//             println("Operator: " + initStateBinExpr.getOperator)
//             println("Operand1: " + initStateBinExpr.getOperand1)
//             println("Operand2: " + initStateBinExpr.getOperand2)
             
             val initState = getInitState(initStateBinExpr)
             if (initState !== null) {
                initState.initial = true
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
                 
                 /*
                 if(stateChangeFuncNameNode instanceof CPPASTQualifiedName) {
             val qualName = stateChangeFuncNameNode as CPPASTQualifiedName
             stateChangeFuncName = qualName.getLastName.toString
             stateChangeFuncNamespace = qualName.getQualifier.head.resolveBinding.toString
         } else {
             stateChangeFuncName = stateChangeFuncNameNode.toString
         }*/
                 
                 
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
//         println("Beginne buildTransitions")
         val startStates = <State> newArrayList
         
         val swCompound = sw.getBody
         for(var i = 0; i < swCompound.children.length; i++) {
             var stmt = swCompound.children.get(i)
             if(stmt instanceof IASTCaseStatement) {
                 val caseStmt = stmt as IASTCaseStatement
//                 println("Found CaseStatement")
//                 println("Expression: " + caseStmt.getExpression)
                 val expression = caseStmt.getExpression
                 if (expression instanceof IASTIdExpression) {
                    val caseStateName = (expression as IASTIdExpression).getName.toString
                    val caseState = states.get(caseStateName)
                    startStates.add(caseState)
//                    println("added a state - new startStates:\n" + startStates)
                 }
             } else if(stmt instanceof IASTBreakStatement) {
                 startStates.clear
             } else {
                 val targetStates = findTargetStates(stmt)
                 
                 for (var j = 0; j < targetStates.length; j++) {
    //                 if(targetStates.get(j) !== null) {
                        for (var k = 0; k < startStates.size; k++) {
                            if (combineTransitions) {
                                if (!transitions.containsKey(startStates.get(k)) || !transitions.get(startStates.get(k)).contains(targetStates.get(j))) {
//                                    println("createTransition: " + startStates.get(k).getName + " -> " + targetStates.get(j).getName)
                                    startStates.get(k).createTransitionTo(targetStates.get(j))
                                    if (transitions.containsKey(startStates.get(k))) {
                                        transitions.get(startStates.get(k)).add(targetStates.get(j))
                                    } else {
                                        val stateTargetStateList = <State> newArrayList
                                        stateTargetStateList.add(targetStates.get(j))
                                        transitions.put(startStates.get(k), stateTargetStateList)
                                    }
                                }
                            } else {
//                                println("createTransition: " + startStates.get(k).getName + " -> " + targetStates.get(j).getName)
                                startStates.get(k).createTransitionTo(targetStates.get(j))
                                if (transitions.containsKey(startStates.get(k))) {
                                    transitions.get(startStates.get(k)).add(targetStates.get(j))
                                } else {
                                    val stateTargetStateList = <State> newArrayList
                                    stateTargetStateList.add(targetStates.get(j))
                                    transitions.put(startStates.get(k), stateTargetStateList)
                                }
                            }
                        }
    //                }
                 }
                 /*if(stmt instanceof IASTIfStatement) {
                     /*
                      * TODO handle Expression (transitiontrigger)
                      /
                      var targetState = findTargetState((stmt as IASTIfStatement).getThenClause)
                      if (targetState !== null) {
    //                      println("targetState found in Then: " + targetState)
                          for (var j = 0; j < startStates.size; j++) {
                              startStates.get(j).createTransitionTo(targetState)
                          }
                      }
                      targetState = findTargetState((stmt as IASTIfStatement).getElseClause)
                      if (targetState !== null) {
    //                      println("targetState found in Else: " + targetState)
                          for (var j = 0; j < startStates.size; j++) {
                              startStates.get(j).createTransitionTo(targetState)
                          }
                      }
                 }*/
             }
         }
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
//            println("Is ne FunctionCallExpression")
            val funcCall = stmt as IASTFunctionCallExpression
            if(funcCall.getFunctionNameExpression instanceof IASTIdExpression) {
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName
//                println("FuncName: " + funcName.toString)
                if (funcName instanceof CPPASTQualifiedName) {
//                    println("Is CPPASTQualifiedName")
//                    println("stateChangeFuncName: " + stateChangeFuncName)
//                    println("stateChangeFuncNamespace: " + stateChangeFuncNamespace)
                    if(funcName.getLastName.toString.equals(stateChangeFuncName.toString) && funcName.getQualifier.head.resolveBinding.toString.equals(stateChangeFuncNamespace.toString)) {
                        if(states.containsKey((funcCall.getArguments.head as IASTIdExpression).getName.toString)) {
                            res.add(states.get((funcCall.getArguments.head as IASTIdExpression).getName.toString))
                        }
                    } else if (transitionContainingFunctions.containsKey(funcName.getLastName.toString)) {
//                        println("is ne transition Contaiing Function")
                        res += transitionContainingFunctions.get(funcName.getLastName.toString)
                    }
                } else {
//                    println("function has not qualified name")
                    if(funcName.toString.equals(stateChangeFuncName.toString)) {
//                        println("Add Transition for not QualifiedName")
                        if(states.containsKey((funcCall.getArguments.head as IASTIdExpression).getName.toString)){
                            res.add(states.get((funcCall.getArguments.head as IASTIdExpression).getName.toString))
                        }
                    } else {
//                        println("func is nich die stateChangeFunc")
//                        println("funcName.toString: " + funcName.toString)
//                        println("trasitionContainingFunction.containsKey(funcName.toString): " + transitionContainingFunctions.containsKey(funcName.toString))
                        
                        if (transitionContainingFunctions.containsKey(funcName.toString)) {
//                            println("is ne transition Contaiing Function")
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
//         println("Inside FindTargetState")
         if(stmt instanceof IASTCompoundStatement) {
//             println("Stmt isntanceof IASTCompoundStatement")
             val compStmt = stmt as IASTCompoundStatement
             for(var i= 0; i < compStmt.children.length;i++) {
//                 println("Teste child: " + i)
                 val child = compStmt.children.get(i)
                 if(child instanceof IASTExpressionStatement){
                     val expr = child as IASTExpressionStatement
                     
                     if(expr.getExpression instanceof IASTFunctionCallExpression) {
//                         println("Is ne FunctionCallExpression")
                         val funcCall = expr.getExpression as IASTFunctionCallExpression
                         val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName
                         println("FuncName: " + funcName.toString)
                         if (funcName instanceof CPPASTQualifiedName) {
//                             println("Is CPPASTQualifiedName")
//                             println("stateChangeFuncName: " + stateChangeFuncName)
//                             println("stateChangeFuncNamespace: " + stateChangeFuncNamespace)
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
        println("")
        println("Inside findStateChangeFunc")
         var IASTName res
         
         var assignSource = findAssignSource(binExpr)
         println("assignSource: " + assignSource.getName.toString)
         
         var match = states.containsKey(assignSource.getName.toString)
         if (!match) {
             res = findContainingFuncDef(binExpr).getDeclarator.getName
         }
         
         /*
         val funcDef = findContainingFuncDef(binExpr)
         val funcDecl = funcDef.getDeclarator
         println("Containing Func: " + funcDecl.getName.toString)
         var IASTParameterDeclaration[] arguments
         
         if (funcDecl instanceof CPPASTFunctionDeclarator) {
            arguments = funcDecl.getParameters    
         } else {
             arguments = (funcDecl as CASTFunctionDeclarator).getParameters
         }
         println("parameter bestimmt: " + arguments)
         var match = false 
         for (var i = 0; (i < arguments.length) && !match; i++) {
             println("argument[" + i + "]: " + arguments.get(i).getDeclarator.getName.toString)
             match = arguments.get(i).getDeclarator.getName.toString.equals(assignSource.getName.toString)
             println("match mit argument[" + i + "]: " + match)
         }
         
         if (match) {
             res = funcDecl.getName
             println("res aktualisiert: " + res)
         }
         
         
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(stateChageFunctionComment)
         
         val stateChangeComment = comments.get(idx)
         val commentParentNode = ast.getCommentContainingNode(stateChangeComment)
         
//         println("stateChangeComment containingNode found!")
//         println("Class: " + commentParentNode)
//         println("Parent Class: " + commentParentNode.getParent)
         
         if (commentParentNode instanceof IASTCompoundStatement && commentParentNode.getParent instanceof IASTFunctionDefinition) {
             val funcDef = commentParentNode.getParent as IASTFunctionDefinition
//             println("function Declarator: " + funcDef.getDeclarator.getName.toString)
             res = funcDef.getDeclarator.getName
         }
         */
         return res
     }
     
     def IASTSwitchStatement findBehaviourSwitch(IASTTranslationUnit ast) {
         var IASTSwitchStatement res
         
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(behaviourSwitchComment)
         
         val switchComment = comments.get(idx)
         val commentParentNode = ast.getCommentContainingNode(switchComment)
         val commentFollowingNode = ast.getCommentFollowingNode(switchComment)
                  
         println("switchComment FollowingNode found!")
         println("Offset: " + commentFollowingNode.getNodeLocations.get(0).getNodeOffset)
         println("Class: " + commentFollowingNode)
         
         if (commentFollowingNode instanceof IASTSwitchStatement) {
            res = commentFollowingNode as IASTSwitchStatement
         }
         
         res
     }
     
     def IASTEnumerationSpecifier findStateEnum(IASTTranslationUnit ast) {
         var IASTEnumerationSpecifier res
         
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(stateEnumComment)
         
         val enumComment = comments.get(idx)
         val commentFollowingNode = ast.getCommentFollowingNode(enumComment)
         
         println("enum commentFollowingNode: " + commentFollowingNode)
                           
         if (commentFollowingNode instanceof IASTSimpleDeclaration && commentFollowingNode.children.head instanceof IASTEnumerationSpecifier) {
             res = commentFollowingNode.children.head as IASTEnumerationSpecifier
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
         /*
         var IASTName res = null
         
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(currentStateVariableComment)
         
         val currStateComment = comments.get(idx)
         val currStateCommentOffset = currStateComment.getNodeLocations.get(0).getNodeOffset
         val currStateCommentFilename = currStateComment.getContainingFilename
         
         var IASTNode declContainingNode = null
         var IASTNode declNode = null
         var possibleNodes = ast.children
         
         while (declNode === null) {
             declContainingNode = null
             
             for (var i = 0; i < possibleNodes.length && declContainingNode === null; i++) {
                val child = possibleNodes.get(i)
                val childOffset = child.getNodeLocations.get(0).getNodeOffset
                val childLength = child.getNodeLocations.get(0).getNodeLength
                val childFilename = child.getContainingFilename
                if ((childFilename === currStateCommentFilename) 
                    && (childOffset <= currStateCommentOffset) && ((childOffset + childLength) > currStateCommentOffset)
                ) {
                    declContainingNode = child
                    possibleNodes = child.children
                }    
             }
             
             //if no containing node is found then the comment is on the same level as the declaration
             if (declContainingNode === null) {
                 var childIdx = 0;
                 var child = possibleNodes.get(childIdx)
                 while(((child.getContainingFilename !== currStateCommentFilename) || (child.getNodeLocations.get(0).getNodeOffset < currStateCommentOffset)) && (childIdx < (possibleNodes.length - 1))) {
                     childIdx++
                     child = possibleNodes.get(childIdx)
                 }
                 if(child.getContainingFilename === currStateCommentFilename && child.getNodeLocations.get(0).getNodeOffset > currStateCommentOffset) {
                     declNode = child
                 } else {
                     return null
                 }
             }
         
         }
         
         res = (declNode as IASTSimpleDeclaration).getDeclarators.get(0).getName
         
         res
         */
     }
     
     def IASTNode getCommentFollowingNode(IASTNode ast, IASTComment comment) {
         var IASTNode res
         
         val commentContainingFilename = comment.getContainingFilename
         val commentOffset = comment.getNodeLocations.get(0).getNodeOffset
         
         var found = false
         for (var i = 0; i < ast.children.length && !found; i++) {
             val child = ast.children.get(i)
             val childFilename = child.getContainingFilename
             val childOffset = child.getNodeLocations.get(0).getNodeOffset
             val childLength = child.getNodeLocations.get(0).getNodeLength
             
             if (childFilename.equals(commentContainingFilename)) {
                 if (childOffset < commentOffset && (childOffset + childLength) > commentOffset) {
                     res = getCommentFollowingNode(child, comment)
                     found = true
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