package de.cau.cs.kieler.c.sccharts.processors

import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSwitchStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDefinition
import org.eclipse.cdt.internal.core.dom.parser.c.CASTWhileStatement
import java.util.ArrayList
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIdExpression
import org.eclipse.cdt.internal.core.dom.parser.c.CASTSimpleDeclaration
import org.eclipse.cdt.internal.core.dom.parser.c.CASTEnumerationSpecifier
import org.eclipse.cdt.internal.core.dom.parser.c.CASTEnumerator
import org.eclipse.cdt.core.dom.ast.IASTName
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTExpressionStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBinaryExpression
import de.cau.cs.kieler.sccharts.State
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCompoundStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTCaseStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTNode
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import org.eclipse.cdt.internal.core.dom.parser.c.CASTIfStatement
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionCallExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.cdt.internal.core.dom.parser.c.CASTArraySubscriptExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.cdt.internal.core.dom.parser.c.CASTUnaryExpression
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensions

/**
 * @author lan
 */
 class StatemachineExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
     
     @Inject extension SCChartsCoreExtensions
     @Inject extension SCChartsStateExtensions
     @Inject extension SCChartsControlflowRegionExtensions
     @Inject extension SCChartsTransitionExtensions
     @Inject extension KExpressionsDeclarationExtensions
     @Inject extension KExpressionsValuedObjectExtensions
     @Inject extension ExpressionConverterExtensions
     
     var State rootState
     var enums = <String, CASTEnumerationSpecifier> newHashMap
     var states = <String, State> newHashMap
     var events = <String, ValuedObject> newHashMap
     var IASTName stateVariable 
     var IASTName stateChangeFunc
     
     
     override getId() {
         "de.cau.cs.kieler.c.sccharts.statemachineExtractor"
     }
     
     override getName() {
         "Statemachine Extractor"
     }
     
     override process() {
         val tUnit = getModel
         setModel(tUnit.transform as SCCharts)
     }
     
     def EObject transform(IASTTranslationUnit translationUnit) {
         
         if(translationUnit === null) {
             return null
         }
         if(translationUnit.children !== null) {
             
         } else {
             return null
         }
         
         val SCChart = createSCChart
         rootState = createState
         SCChart.rootStates += rootState
         var rootLabel = ""
         
         for (child : translationUnit.children) {
             if(child instanceof CASTFunctionDefinition) {
                 var switchStmt = findSMSwitch(child as CASTFunctionDefinition)
                 if(switchStmt !== null) {
                     println("")
                     println("Bearbeitung von FuncDef: " + child.getDeclarator.getName.toString)
                     rootLabel += "switch (" + (switchStmt.getControllerExpression as CASTIdExpression).getName.toString + ")"
                     val cRegion = rootState.createControlflowRegion("")
                     stateVariable = (switchStmt.getControllerExpression as CASTIdExpression).getName
                     
                     println("stateVariable bestimmt: " + stateVariable)
                     
                     //bestimme inital state+
                     val initStateName = findInitStateName(child, stateVariable)
                     println("initStateName: " + initStateName)
                     
                     //bestimme states
                     val stateEnum = enums.get(initStateName.toString)
                     println("enums.size: " + enums.size)
                     println("enums.containsKey(initStateName): " + enums.containsKey(initStateName))
                     println("stateEnum bestimmt: " + stateEnum)
                     if(stateEnum !== null) {
                         for(enumState : stateEnum.getEnumerators) {
                             val state = createState(enumState.getName.toString)
                             state.label = enumState.getName.toString
                             if (state.label.equals(initStateName.toString)) state.initial = true
                             states.put(enumState.getName.toString, state)
                             cRegion.states += state
                         }
                     }
                     
                     val enumKeys = enums.keySet
                     for(key : enumKeys) {
                         if (enums.get(key) != stateEnum) {
                             val decl = createVariableDeclaration
                             decl.type = ValueType::BOOL
                             
                             val VO = decl.createValuedObject(key)
                             events.put(key, VO)
                             
                             rootState.declarations += decl
                         }
                     }
                     
                     var funcDefs = translationUnit.children.filter(typeof(CASTFunctionDefinition))
                     stateChangeFunc = findChangeStateFunction(funcDefs, child.getDeclarator.getName.toString)
                     println("stateChangeFunc bestimmt: " + stateChangeFunc)
                     
                     buildTransitions(switchStmt)
                     println("")
                 } 
             }
             
             if(child instanceof CASTSimpleDeclaration) {
                 var declStmt = child as CASTSimpleDeclaration
                 val specifier = declStmt.getDeclSpecifier
                 if(specifier instanceof CASTEnumerationSpecifier) {
                     val enumerationSpeci = specifier as CASTEnumerationSpecifier
                     println("")
                     println("Enumeration childs:")
                     var i = 0
                     for(specChild : enumerationSpeci.children) {
                         if(specChild instanceof CASTEnumerator) {
                             val enumerator = specChild as CASTEnumerator
                             println(enumerator.getName.toString + " = " + i)
                             i++
                             enums.put(enumerator.getName.toString, enumerationSpeci)
                         }
                     }
                     println("")
                 }
             }
             
         }
         
         rootState.label = rootLabel
         SCChart
     }
     
     def CASTSwitchStatement findSMSwitch(CASTFunctionDefinition funcDef) {
         var CASTSwitchStatement res = null
         var ArrayList<CASTSwitchStatement> resList = <CASTSwitchStatement>newArrayList
         val directWhiles = funcDef.getBody.children.filter(typeof(CASTWhileStatement))
         if(directWhiles !== null) {
             for (wile : directWhiles) {
                 val wileSwitches = wile.getBody.children.filter(typeof(CASTSwitchStatement))
                 resList += wileSwitches
             }
         }
         
         if(resList.length > 1) {
             println("")
             println("multiple while switch combinations found!")
             println("")
         }
         
         res = resList.head
         res
     }
     
     def IASTName findInitStateName(CASTFunctionDefinition funcDef, IASTName stateVariable) {
         println("    inside findInitStateName")
         var IASTName res
         val funcExprStmts = funcDef.getBody.children.filter(typeof(CASTExpressionStatement))
         println("    funcExprStmts bestimmt - length: " + funcExprStmts.length)
         for(exprStmt : funcExprStmts) {
             if(exprStmt.getExpression instanceof CASTBinaryExpression) {
                 val binExpr = exprStmt.getExpression as CASTBinaryExpression
                 println("    BinaryExpr gefunden:")
                 println("        operator: " + binExpr.getOperator)
                 println("        operand1: " + (binExpr.getOperand1 as CASTIdExpression).getName)
                 println("      binExpr.getOperator == 17 : " + (binExpr.getOperator == 17))
                 println("      (binExpr.getOperand1 as CASTIdExpression).getName.equals(stateVariable) : " + ((binExpr.getOperand1 as CASTIdExpression).getName.toString.equals(stateVariable.toString)))
                 if((binExpr.getOperator == 17) && ((binExpr.getOperand1 as CASTIdExpression).getName.toString.equals(stateVariable.toString))) {
                     println("    operator is 17 und operand1 is stateVariable")
                     if(binExpr.getOperand2 instanceof CASTIdExpression) {
                         res = (binExpr.getOperand2 as CASTIdExpression).getName
                     }
                 }
             }
         }
        
         res
     }
     
     def IASTName findChangeStateFunction(Iterable<CASTFunctionDefinition> funcs, String mainFunc) {
         var IASTName res
         
         for(funcDef : funcs) {
             if(!funcDef.getDeclarator.getName.toString.equals(mainFunc)) {
                 val funcBody = funcDef.getBody as CASTCompoundStatement
                 val expressions = funcBody.children.filter(typeof(CASTExpressionStatement))
                 for (expr : expressions) {
                     if (expr.getExpression instanceof CASTBinaryExpression) {
                         val binExpr = expr.getExpression as CASTBinaryExpression
                         if((binExpr.getOperator == 17) && (binExpr.getOperand1 as CASTIdExpression).getName.toString.equals(stateVariable.toString)) {
                             res = funcDef.getDeclarator.getName
                         }
                     }
                 }
             }
         }
         
         res
     }
     
     def buildTransitions(CASTSwitchStatement swStmt) {
         
         println("")
         println("inside buildTransitions")
         
         val swBody = swStmt.getBody as CASTCompoundStatement
         for(var i = 0; i < swBody.children.length; i++) {
             var child = swBody.children.get(i)
             
             if(child instanceof CASTCaseStatement) {
                 println("CaseStatement gefunden")
                 var caseExpr = ((child as CASTCaseStatement).getExpression as CASTIdExpression).getName.toString
                 var sourceState = states.get(caseExpr)
                 println("sourceState: " + sourceState.label)
                 
                 var j = 1
                 if((i + j) < swBody.children.length) {
                     println("build Transition")
                    var nextChild = swBody.children.get(i + j)
                    println("anfangs nextChild erstellt!")
                    while (!(nextChild instanceof CASTBreakStatement)) {
                        println("    in while loop")
                        val trans = buildTransition(nextChild)
                        println("    buildTransition is zurückgekehrt: " + trans)
                        if (trans !== null) {
                            trans.sourceState = sourceState
                            println("    sourceState gesetzt: " + sourceState)                            
                        }
                        j++
                        println("    j incrementiert")
                        if((i+j) > swBody.children.length) {
                            println("    i + j is zu groß")
                            nextChild = new CASTBreakStatement
                            println("    leeres break statement erstellt")    
                        } else {
                            println("    i + j is noch im Rahmen")
                            nextChild = swBody.children.get(i + j)
                            println("    nächtes next child bestimmt")    
                        }
                    }
                 }
                 
             }
         }
         
         println("")
     }
     
     def Transition buildTransition(IASTNode stmt) {
         var Transition res
         
         if(stmt instanceof CASTIfStatement) {
             res = createTransition
             val ifStmt = stmt as CASTIfStatement
             val condition = ifStmt.getConditionExpression
             res.trigger = condition.createKExpression(rootState)
             
             val thenBody = ifStmt.getThenClause as CASTCompoundStatement
             val thenExpressions = thenBody.children.filter(typeof(CASTExpressionStatement))
             for (expr : thenExpressions) {
                 if ((expr.getExpression instanceof CASTFunctionCallExpression) && (((expr.getExpression as CASTFunctionCallExpression).getFunctionNameExpression as CASTIdExpression).getName.toString.equals(stateChangeFunc.toString))) {
                     res.targetState = states.get(((expr.getExpression as CASTFunctionCallExpression).getArguments.head as CASTIdExpression).getName.toString)
                 }
             } 
         }
         
         res
     }
     
 }