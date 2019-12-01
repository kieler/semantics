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
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.c.sccharts.extensions.SMExtractorExtensions
import org.eclipse.cdt.core.dom.ast.IASTCompositeTypeSpecifier
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamespaceDefinition
import java.util.ArrayList
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTQualifiedName
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTQualifiedName
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions

/**
 * @author lewe
 *
 */
class SuBStatemachineExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SMExtractorExtensions
    @Inject extension HighlightingExtensions
    
    var State rootState
    var String stateInterfaceName
    var String evaluationFunc
    var String stateChangeFunc
    var events = <String, ValuedObject> newHashMap
    var states = <String, State> newHashMap
    var stateClasses = <String, IASTCompositeTypeSpecifier> newHashMap
    var stateEvals = <String, IASTFunctionDefinition> newHashMap
    
    override getId() {
        "de.cau.cs.kieler.c.sccharts.SuBStatemachineExtractor"
    }
    
    override getName() {
        "Class-SM Extractor"
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
         println("States bestimmt")
         
         //__________FIND EVENTS_______________
         val eventEnum = findEventEnum(ast)
         val enumEvents = eventEnum.getEnumerators
         
         for (eEvent : enumEvents) {
             var eventName = eEvent.getName.toString
             
             val decl = createVariableDeclaration 
             decl.type = ValueType::BOOL
             decl.input = true
             rootState.declarations += decl
             
             val VO = decl.createValuedObject(eventName)
             events.put(eventName, VO)
         }
         
         //__________FIND CLASS EVALUATIONS____________
         
         
         val evalFuncDec = findEvalFunc(ast)
         evaluationFunc = evalFuncDec.getName.toString
         println("evaluationFuncName: " + evaluationFunc)
         
         findStateEvals(ast)     
         
         //__________FIND STATE CHANGE FUNC____________
         val stateChangeFuncDec = findStateChangeFunc(ast)
         var stateChangeFuncName = stateChangeFuncDec.getName
         if (stateChangeFuncName instanceof ICPPASTQualifiedName) {
             val segments = stateChangeFuncName.getAllSegments
             stateChangeFunc = segments.get(segments.length - 1).toString 
         } else {
             stateChangeFunc = stateChangeFuncName.toString
         }
         println("StateChangeFunc name: " + stateChangeFunc)
             
         //________Build Transitions__________________
         for (state : states.keySet) {
             buildTransitions(state)
         }    
             
         SCChart
    }
    
    def findStateEvals(IASTTranslationUnit ast) {
//        println("Inside findStateClasses")
        val funcDefs = findFuncDefs(ast)
//        println("gefundene FuncDefs: " + funcDefs.length)
        for (funcDef : funcDefs) {
            val funcName = funcDef.getDeclarator.getName
//            println("funcName: " + funcName.toString)
            if (funcName instanceof ICPPASTQualifiedName) {
                val nameSegments = funcName.getAllSegments
                val nameSegmentStrings = <String> newArrayList
                
                for (segment : nameSegments) {
                    nameSegmentStrings.add(segment.toString)
                }
                for (state : states.keySet) {
                    if (nameSegmentStrings.contains(evaluationFunc) && nameSegmentStrings.contains(state)) {
                        stateEvals.put(state, funcDef)
                    }
                }
            }
        }
        

        
    }
    
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
    
    def buildTransitions(String state) {
        
        val sourceState = states.get(state)
        val evalFunc = stateEvals.get(state)
        var IASTStatement transitionSwitch
        
        sourceState.insertHighlightAnnotations(evalFunc)
        
        for (child : evalFunc.getBody.children) {
            if (child instanceof IASTSwitchStatement) transitionSwitch = child.getBody
        }
        
        var evts = <String> newArrayList
        for (child : transitionSwitch.children) {
            if (child instanceof IASTCaseStatement) {
                val condExp = child.getExpression
                if (condExp instanceof IASTIdExpression) {
                    var expName = condExp.getName.toString
                    if (events.keySet.contains(expName)) {
                        evts.add(expName)
                    }
                }
                
            } else if (child instanceof IASTBreakStatement) {
                evts.clear
            } else {
                val targetStates = findTransitionTargets(child)
                for (targetState : targetStates) {
                    val transition = sourceState.createTransitionTo(targetState)
                    if (evts.length >= 1) {
                        var opType = OperatorType::LOGICAL_OR
                        var Expression op1 = events.get(evts.get(0)).reference
                        var Expression op2
                        for (var i = 1; i < evts.length; i++) {
                            op2 = events.get(evts.get(i)).reference
                            val tmp = opType.createOperatorExpression
                            tmp.subExpressions += op1
                            tmp.subExpressions += op2
                            op1 = tmp
                        }
                        transition.trigger = op1
                    } 
                    
                }
            }
        }
    }
    
    def ArrayList<State> findTransitionTargets(IASTNode stmt) {
        val res = <State> newArrayList
//        println("Inside findTransitionTargets")
        if (stmt instanceof IASTFunctionCallExpression) {
//            println("stmt is n functionCall")
            val funcName = stmt.getFunctionNameExpression
            var funcNameString = funcName.toString
            if (funcName instanceof ICPPASTQualifiedName) {
                val segments = funcName.getAllSegments
                funcNameString = segments.get(segments.length - 1).toString
            }
//            println("funcName: " + funcNameString)
            if (funcNameString.equals(stateChangeFunc)) {
//                println("Is die stateChangeFunc")
                val arguments = stmt.getArguments
//                println("arguments.size: " + arguments.size)
                for (argument : arguments) {
//                    println("teste argument: " + argument)
                    if (argument instanceof IASTIdExpression) {
                        var argName = argument.getName.toString
                        if (argName.indexOf("a") == 0) argName = argName.substring(1)
//                        println("argName: " + argName)
                        if (states.keySet.contains(argName)) res.add(states.get(argName))
                    }
                }
            } 
            
        } else {
            for (child : stmt.children) {
                res.addAll(findTransitionTargets(child))
            } 
        }
        
        res
    }
}