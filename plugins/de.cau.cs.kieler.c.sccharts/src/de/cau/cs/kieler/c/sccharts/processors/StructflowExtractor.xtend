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
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.c.sccharts.extensions.SMExtractorExtensions
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import de.cau.cs.kieler.sccharts.DataflowRegion
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import java.util.ArrayList
import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import java.util.HashMap
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.Region
import org.eclipse.cdt.internal.core.dom.parser.c.CASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import de.cau.cs.kieler.c.sccharts.extensions.ValueExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeHRExtensions
import org.eclipse.cdt.core.dom.ast.IASTConditionalExpression
import org.eclipse.cdt.core.dom.ast.IASTCastExpression
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensionsV3
import org.eclipse.cdt.core.dom.ast.IASTForStatement
import org.eclipse.cdt.core.dom.ast.IASTWhileStatement
import org.eclipse.cdt.core.dom.ast.IASTDoStatement
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

/**
 * @author lewe
 *
 */
class StructflowExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension HighlightingExtensions
    @Inject extension ExpressionConverterExtensionsV3
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    @Inject extension SMExtractorExtensions
    @Inject extension KExpressionsSerializeHRExtensions
    
    var State baseState
    var String structName
    var functionDefinitions = <String, IASTFunctionDefinition> newHashMap
    var functionStates = <String, State> newHashMap
    var functionInputElements = <String, ArrayList<String>> newHashMap
    var functionOutputElements = <String, ArrayList<String>> newHashMap
    val functionBuild = <String, Boolean> newHashMap
    val VOs = <State, HashMap<String, ArrayList<ValuedObject>>> newHashMap
    
    var ifCounter = 0;
    var swCounter = 0;
    var forCounter = 0;
    var whileCounter = 0;
    var doCounter = 0;
    
    val buildControlStatements = true
    
    override getId() {
        "de.cau.cs.kieler.c.sccharts.structflowExtractor"
    }
    
    override getName() {
        "Structflow Extractor"
    }
    
    override process() {
        val tUnit = getModel
        setModel(tUnit.transform as SCCharts)
    }
    
    def EObject transform(IASTTranslationUnit ast) {
        
        if(ast === null) {
            return null
        }
        
        val SCChart = createSCChart
        
        baseState = createState
        SCChart.rootStates += baseState
        
        
        val comments = ast.getComments
        val idx = comments.getIdxOfComment("//EXTRACTOR_FUNCTION")
        if(idx >= 0) {
            val exComment = comments.get(idx)
            val mFunc = getCommentFollowingNode(ast, exComment) as IASTFunctionDefinition   
            
            val funcName = mFunc.getDeclarator.getName.toString
            baseState.name = funcName
            baseState.label = funcName
            baseState.insertHighlightAnnotations(mFunc)
            functionStates.put(funcName, baseState)
            
            val structParam = (mFunc.getDeclarator as CASTFunctionDeclarator).getParameters.get(0) 
            structName = structParam.getDeclarator.getName.toString
            
            findFunctions(ast)
            mFunc.findFuncInputs()
            setStateInputs()
            mFunc.findFuncOutputs()
            setStateOutputs()
            
            for (funcState : functionStates.values) {
                SCChart.rootStates += funcState
            }
            
            buildStructFlowForFunction(funcName)
            
        } else {
            baseState.name = "No function marked for Extraction!\nPlace the commen \"//EXTRACTOR_FUNCTION\" above the function to extract"
            baseState.label = baseState.name
        }
        
        SCChart
        
    }
    
    def findFunctions(IASTTranslationUnit ast) {
        for (stmt : ast.children) {
            if (stmt instanceof IASTFunctionDefinition) {
                val funcName = stmt.getDeclarator.getName.toString
                functionDefinitions.put(funcName, stmt)
                functionBuild.put(funcName, false)
                if (!functionStates.containsKey(funcName)) {
                    val funcState = createState(funcName)
                    funcState.insertHighlightAnnotations(stmt)
                    val declSpecifier = stmt.getDeclSpecifier
                    if (!(declSpecifier instanceof IASTSimpleDeclSpecifier) || ((declSpecifier as IASTSimpleDeclSpecifier).type > 1)) {
                        var stateVariables = <String, ArrayList<ValuedObject>> newHashMap
                        var varList = <ValuedObject> newArrayList
                            
                        val retDecl = createVariableDeclaration
                        retDecl.output = true
                        funcState.declarations += retDecl
                            
                        val outputName = "res"
                        val resVO = retDecl.createValuedObject(outputName + "_out")
                            
                        varList.add(resVO)
                        stateVariables.put(outputName, varList)
                        VOs.put(funcState, stateVariables)
                         
                    }
                    
                    functionStates.put(funcName, funcState)
                    
                }
            }
        }
    }
    
    def DataflowRegion buildStructFlowForFunction(String funcName) {
        var DataflowRegion dRegion
        if (!functionBuild.get(funcName)) {
            functionBuild.remove(funcName)
            functionBuild.put(funcName, true)
            val funcDef = functionDefinitions.get(funcName)
            if (functionStates.containsKey(funcName)) {
                val funcState = functionStates.get(funcName)
                dRegion = createDataflowRegion("")
                funcState.regions += dRegion
                for (stmt : funcDef.getBody.children) {
                    buildStructFlow(stmt, funcState, dRegion)    
                }
                funcState.linkOutputs(dRegion)    
            }
        }        
        dRegion
    }
    
    def buildStructFlow(IASTNode stmt, State funcState, DataflowRegion dRegion) {
            if (stmt instanceof IASTExpressionStatement) {
                val expr = stmt.getExpression
                
                if (expr instanceof IASTFunctionCallExpression) {
                    val firstArg = expr.getArguments.get(0)
                    if ((firstArg instanceof IASTIdExpression) && ((firstArg as IASTIdExpression).getName.toString.equals(structName))) {
                        var funcCallName = ""
                        val funcCallNameExpr = expr.getFunctionNameExpression
                        if (funcCallNameExpr instanceof IASTIdExpression) {
                            funcCallName = funcCallNameExpr.getName.toString
                        } else {
                            funcCallName = ((funcCallNameExpr as IASTUnaryExpression).getOperand as IASTIdExpression).getName.toString
                        }
                        if (functionStates.containsKey(funcCallName)) {
                            val funcCallState = functionStates.get(funcCallName)
                            val funcCallInputs = functionInputElements.get(funcCallName)
                            val funcCallOutputs = functionOutputElements.get(funcCallName)
                            
                            val refDecl = createReferenceDeclaration
                            refDecl.setReference(funcCallState)
                            refDecl.annotations += createTagAnnotation("Hide")
                            dRegion.declarations += refDecl
                            
                            val funcCallVO = refDecl.createValuedObject(funcCallName)
                            
                            for (funcCallInput : funcCallInputs) {
                                val funcCallInputVO = VOs.get(funcCallState).get(funcCallInput).get(0)
                                val inputVO = funcState.findValuedObjectByName(funcCallInput, false, dRegion)
                                
                                dRegion.equations += createAssignment(funcCallVO, funcCallInputVO, inputVO.reference)
                            }
                            
                            for (funcCallOutput : funcCallOutputs) {
                                val funcCallOutputVOList = VOs.get(funcCallState).get(funcCallOutput)
                                val funcCallOutputVO = findOutputVar(funcCallOutputVOList)
                                if (funcCallOutputVO !== null) {
                                    val outputVO = funcState.findValuedObjectByName(funcCallOutput, true, dRegion)
                                    
                                    val sourceReference = funcCallVO.reference => [
                                        subReference = funcCallOutputVO.reference
                                    ]
                                    dRegion.equations += createAssignment(outputVO, sourceReference)
                                    outputVO.insertHighlightAnnotations(expr)
                                }
                            }
                            
                            buildStructFlowForFunction(funcCallName)
                        }
                    }
                    
                } else if (expr instanceof IASTBinaryExpression) {
                    val exprOutputElements = findOutputElements(expr)
                    val exprInputElements = findInputElements(expr)
                    val op2OutputElements = findOutputElements(expr.getOperand2)
                    if ((exprOutputElements.length > op2OutputElements.length) && (exprInputElements.length > 0)) {
                        val targetNames = findDifference(exprOutputElements, op2OutputElements)
                        if (targetNames.length == 1) {
                            
                            val sourceExpr = createStructFlowKExpression(expr.getOperand2, funcState, dRegion) 
                            val targetVO = funcState.findValuedObjectByName(targetNames.get(0), true, dRegion)
                            
                            dRegion.equations += createAssignment(targetVO, sourceExpr)
                            targetVO.insertHighlightAnnotations(expr)
                        }
                    }
                }
            
            } if (buildControlStatements) {
                if (stmt instanceof IASTForStatement) {
                    
                    val forState = createState("For_" + forCounter)
                    forState.insertHighlightAnnotations(stmt)
                    val refDecl = createReferenceDeclaration
                    dRegion.declarations += refDecl
                    refDecl.setReference(forState)
                    val forObj = refDecl.createValuedObject("For_" + forCounter)
                    forCounter++
                    
                    controlStmtSetInOutputs(stmt, forState, forObj, funcState, dRegion)
                    
                    val forDRegion = createDataflowRegion("")
                    forState.regions += forDRegion
                    
                    val forBody = stmt.getBody
                    for (bStmt : forBody.children) {
                        buildStructFlow(bStmt, forState, forDRegion)
                    }
                    forState.linkOutputs(forDRegion)              
                 
                } else if (stmt instanceof IASTWhileStatement) {
                    
                    val wState = createState("While_" + whileCounter)
                    wState.insertHighlightAnnotations(stmt)
                    val refDecl = createReferenceDeclaration
                    dRegion.declarations += refDecl
                    refDecl.setReference(wState)
                    val wObj = refDecl.createValuedObject("While_" + whileCounter)
                    whileCounter++
                    
                    controlStmtSetInOutputs(stmt, wState, wObj, funcState, dRegion)
                    
                    val wDRegion = createDataflowRegion("")
                    wState.regions += wDRegion
                    
                    val wBody = stmt.getBody
                    for (bStmt : wBody.children) {
                        buildStructFlow(bStmt, wState, wDRegion)
                    }
                    wState.linkOutputs(wDRegion) 
                 
                } else if (stmt instanceof IASTDoStatement) {
                    val doState = createState("Do_" + doCounter)
                    doState.insertHighlightAnnotations(stmt)
                    val refDecl = createReferenceDeclaration
                    dRegion.declarations += refDecl
                    refDecl.setReference(doState)
                    val doObj = refDecl.createValuedObject("Do_" + doCounter)
                    doCounter++
                    
                    controlStmtSetInOutputs(stmt, doState, doObj, funcState, dRegion)
                    
                    val doDRegion = createDataflowRegion("")
                    doState.regions += doDRegion
                    
                    val doBody = stmt.getBody
                    for (bStmt : doBody.children) {
                        buildStructFlow(bStmt, doState, doDRegion)
                    }
                    doState.linkOutputs(doDRegion)                    
                 
                } else if (stmt instanceof IASTIfStatement) {
                    val ifState = createState("If_" + ifCounter)
                    ifState.insertHighlightAnnotations(stmt)
                    val refDecl = createReferenceDeclaration
                    dRegion.declarations += refDecl
                    refDecl.setReference(ifState)
                    val ifObj = refDecl.createValuedObject("If_" + ifCounter)
                    ifCounter++
                    
                    controlStmtSetInOutputs(stmt, ifState, ifObj, funcState, dRegion)
                    
                    val ifCRegion = createControlflowRegion("")
                    ifState.regions += ifCRegion
                    val initState = ifCRegion.createState("Init")
                    initState.initial = true
                    ifState.insertHighlightAnnotations(stmt)
                    
                    val thenState = ifCRegion.createState("Then")
                    val thenDRegion = createDataflowRegion("")
                    thenState.regions += thenDRegion
                    val thenTransition = initState.createTransitionTo(thenState)
                    thenTransition.trigger = stmt.getConditionExpression.createStructFlowKExpression(ifState, thenDRegion)
                    
                    val thenBody = stmt.getThenClause
                    thenState.insertHighlightAnnotations(thenBody)
                    for (tStmt : thenBody.children) {
                        buildStructFlow(tStmt, ifState, thenDRegion)
                    }      
                    ifState.linkOutputs(thenDRegion)                
                 
                    val elseBody = stmt.getElseClause
                    if (elseBody !== null) {
                        val elseState = ifCRegion.createState("Else")
                        elseState.insertHighlightAnnotations(elseBody)
                        val elseDRegion = createDataflowRegion("")
                        elseState.regions += elseDRegion
                        initState.createTransitionTo(elseState)
                        
                        for (eStmt : elseBody.children) {
                            buildStructFlow(eStmt, ifState, elseDRegion)
                        }      
                        ifState.linkOutputs(elseDRegion)
                    }
                }
            } else {
                for (child : stmt.children) {
                    buildStructFlow(child, funcState, dRegion)
                }
            }/* */
    }
    
    def controlStmtSetInOutputs(IASTNode stmt, State csState, ValuedObject csObj, State funcState, DataflowRegion dRegion) {
        
        var inputs = findInputElements(stmt)
        inputs = removeDuplicates(inputs)
        var outputs = findOutputElements(stmt)
        outputs = removeDuplicates(outputs)
        
        val stateVariables = <String, ArrayList<ValuedObject>> newHashMap
        VOs.put(csState, stateVariables)
        
        for (input : inputs) {
            val decl = createVariableDeclaration
            decl.input = true
            csState.declarations += decl
            val inputVO = decl.createValuedObject(input + "_in")
            
            val varList = <ValuedObject> newArrayList
            varList.add(inputVO)
            stateVariables.put(input, varList)
            
            val outerInputVO = funcState.findValuedObjectByName(input,false,dRegion)
            
            dRegion.equations += createAssignment(csObj, inputVO, outerInputVO.reference)
        }
        
        for (output : outputs) {
            val decl = createVariableDeclaration
            decl.output = true
            csState.declarations += decl
            val outputVO = decl.createValuedObject(output + "_out")
            
            var varList = <ValuedObject> newArrayList
            if (stateVariables.containsKey(output)) {
                varList = stateVariables.get(output)
            } else {
                stateVariables.put(output, varList)    
            }            
            varList.add(outputVO)
            
            val outerOutputVO = funcState.findValuedObjectByName(output,true,dRegion)
            
            val source = csObj.reference => [
                subReference = outputVO.reference
            ]
            
            dRegion.equations += createAssignment(outerOutputVO, source)
            outerOutputVO.insertHighlightAnnotations(stmt)
        }
    }
    
    def ValuedObject buildFuncCall(IASTFunctionCallExpression expr, State funcState, DataflowRegion dRegion) {
        var ValuedObject res
        
        val firstArg = expr.getArguments.get(0)
        if ((firstArg instanceof IASTIdExpression) && ((firstArg as IASTIdExpression).getName.toString.equals(structName))) {
            var funcCallName = ""
            val funcCallNameExpr = expr.getFunctionNameExpression
            if (funcCallNameExpr instanceof IASTIdExpression) {
                funcCallName = funcCallNameExpr.getName.toString
            } else {
                funcCallName = ((funcCallNameExpr as IASTUnaryExpression).getOperand as IASTIdExpression).getName.toString
            }
            if (functionStates.containsKey(funcCallName)) {
                val funcCallState = functionStates.get(funcCallName)
                val funcCallInputs = functionInputElements.get(funcCallName)
                val funcCallOutputs = functionOutputElements.get(funcCallName)
                        
                val refDecl = createReferenceDeclaration
                refDecl.setReference(funcCallState)
                refDecl.annotations += createTagAnnotation("Hide")
                dRegion.declarations += refDecl
                           
                val funcCallVO = refDecl.createValuedObject(funcCallName)
                res = funcCallVO
                           
                for (funcCallInput : funcCallInputs) {
                    val funcCallInputVO = VOs.get(funcCallState).get(funcCallInput).get(0)
                    val inputVO = funcState.findValuedObjectByName(funcCallInput, false, dRegion)
                                
                    dRegion.equations += createAssignment(funcCallVO, funcCallInputVO, inputVO.reference)
                }
                            
                for (funcCallOutput : funcCallOutputs) {
                    val funcCallOutputVOList = VOs.get(funcCallState).get(funcCallOutput)
                    val funcCallOutputVO = findOutputVar(funcCallOutputVOList)
                    if (funcCallOutputVO !== null) {
                        val outputVO = funcState.findValuedObjectByName(funcCallOutput, true, dRegion)
                                    
                        val sourceReference = funcCallVO.reference => [
                            subReference = funcCallOutputVO.reference
                        ]
                        dRegion.equations += createAssignment(outputVO, sourceReference)
                        outputVO.insertHighlightAnnotations(expr)
                    }
                }
                            
                buildStructFlowForFunction(funcCallName)
            }
        }
        
        res
    }
    
    def Expression createStructFlowKExpression(IASTNode expr, State funcState, DataflowRegion dRegion) {
        var Expression res
        
        if (expr instanceof IASTFieldReference) {
            val structExpr = expr.getFieldOwner
            if (structExpr instanceof IASTIdExpression) {
                if (structExpr.getName.toString.equals(structName)) {
                    val elemVO = funcState.findValuedObjectByName(expr.getFieldName.toString, false, dRegion)
                    res = elemVO.reference
                }
            }
        } else if (expr instanceof IASTUnaryExpression) {
            var opType = expr.getOperator.CDTUnaryOpTypeConversion
            val operand = expr.getOperand
            if (opType !== null) {
                val unExpr = opType.createOperatorExpression
                unExpr.subExpressions += operand.createStructFlowKExpression(funcState, dRegion)
                
                res = unExpr
            } else {
                res = operand.createStructFlowKExpression(funcState, dRegion)
            }
        } else if (expr instanceof IASTBinaryExpression) {
            val opType = expr.getOperator.CDTBinaryOpTypeConversion
            val binExpr = opType.createOperatorExpression
            
            for (operand : expr.children) {
                binExpr.subExpressions += operand.createStructFlowKExpression(funcState, dRegion)
            }
            
            res = binExpr
        } else if (expr instanceof IASTArraySubscriptExpression) {
            val array = expr.getArrayExpression
            if (array instanceof IASTFieldReference) {
                val structExpr = array.getFieldOwner
                if (structExpr instanceof IASTIdExpression) {
                    if (structExpr.getName.toString.equals(structName)) {
                        val elemVO = funcState.findValuedObjectByName(array.getFieldName.toString, false, dRegion)
                        res = elemVO.reference
                    }
                }
            } else {
                res = createStringValue(expr.exprToString)
            }
        } else if (expr instanceof IASTIdExpression) {
            res = createStringValue(expr.getName.toString)
        } else if (expr instanceof IASTLiteralExpression) {
            res = expr.createValue
        } else if (expr instanceof IASTExpressionStatement) {
            res = expr.getExpression.createStructFlowKExpression(funcState, dRegion)
        } else if (expr instanceof IASTFunctionCallExpression) {
            var funcCallName = ""
            val funcCallNameExpr = expr.getFunctionNameExpression
            if (funcCallNameExpr instanceof IASTIdExpression) {
                funcCallName = funcCallNameExpr.getName.toString
            } else {
                funcCallName = ((funcCallNameExpr as IASTUnaryExpression).getOperand as IASTIdExpression).getName.toString
            }
            val funcCallState = functionStates.get(funcCallName)
            if (funcCallState !== null) {
                println("funcCallState: " + funcCallState)
                val funcCallVO = expr.buildFuncCall(funcState, dRegion)
                res = funcCallVO.reference => [
                    subReference = funcCallState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res_out" ].head.reference
                ]
            } else {
                //UNKNOWN FUNC CALL
                val unFuncCallState = createState(funcCallName)
                unFuncCallState.insertHighlightAnnotations(expr)
                val outVarDecl = createVariableDeclaration
                outVarDecl.output= true
                unFuncCallState.declarations += outVarDecl
                val outputVO = outVarDecl.createValuedObject("")
                
                var refDecl = createReferenceDeclaration
                refDecl.setReference(unFuncCallState)
                refDecl.annotations += createTagAnnotation("hide")
                dRegion.declarations += refDecl
                
                val funcCallVO = refDecl.createValuedObject(funcCallName)
                res = funcCallVO.reference => [
                    subReference = outputVO.reference
                ]
                
                val arguments = expr.getArguments
                for (argument : arguments) {
                    val argDecl = createVariableDeclaration
                    argDecl.input = true
                    unFuncCallState.declarations += argDecl
                    val argVO = argDecl.createValuedObject("")
                    
                    dRegion.equations += createAssignment(funcCallVO, argVO, argument.createStructFlowKExpression(funcState, dRegion))
                }
            }

            
        } else if (expr instanceof IASTConditionalExpression) {
            
            val condExpr = expr.getLogicalConditionExpression
            
            val condState = createState(condExpr.exprToString)
            condState.insertHighlightAnnotations(expr)
            val condDRegion = createDataflowRegion(condState.name)
            condDRegion.label = condState.name
            condState.regions += condDRegion
            val refDecl = createReferenceDeclaration
            refDecl.setReference(condState)
            refDecl.annotations += createTagAnnotation("hide")
            dRegion.declarations += refDecl
            val condStateVO = refDecl.createValuedObject("?")
            val stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(condState, stateVariables)
            
            var inputElements = expr.findInputElements
            inputElements = inputElements.removeDuplicates
            for (inputElement : inputElements) {
                val varDecl = createVariableDeclaration
                varDecl.input = true
                condState.declarations += varDecl
                val inputVO = varDecl.createValuedObject(inputElement)
                val varList = <ValuedObject> newArrayList
                varList.add(inputVO)
                stateVariables.put(inputElement, varList)
                
                val outerVO = funcState.findValuedObjectByName(inputElement, false, dRegion)
                
                dRegion.equations += createAssignment(condStateVO, inputVO, outerVO.reference)
            }
            
            val outputDecl = createVariableDeclaration
            outputDecl.output = true
            condState.declarations += outputDecl
            val outputVO = outputDecl.createValuedObject("res")
            
            condDRegion.equations += createAssignment(outputVO, expr.getPositiveResultExpression.createStructFlowKExpression(condState,condDRegion))
            outputVO.insertHighlightAnnotations(expr)
            
            val condNDRegion = createDataflowRegion("Else")
            condNDRegion.label = "Else"
            condState.regions += condNDRegion
            
            condNDRegion.equations += createAssignment(outputVO, expr.getNegativeResultExpression.createStructFlowKExpression(condState,condNDRegion))
            outputVO.insertHighlightAnnotations(expr)
            
            
            res = condStateVO.reference => [
                subReference = outputVO.reference
            ]
            
            
        } else if (expr instanceof IASTCastExpression) {
            res = expr.getOperand.createStructFlowKExpression(funcState, dRegion)
        }
        
        res
    }
    
    def ArrayList<String> findDifference(ArrayList<String> list1, ArrayList<String> list2) {
        val res = <String> newArrayList
        
        for (elem : list1) {
            if (!list2.contains(elem)) res.add(elem)
        }
        
        res
    }
    
    def ArrayList<String> findFuncInputs(IASTFunctionDefinition funcDef) {
        var res = <String> newArrayList
        
        val funcName = funcDef.getDeclarator.getName.toString    
        res = findInputElements(funcDef.getBody)
        res = res.removeDuplicates()
        
        functionInputElements.put(funcName, res)
            
        res
    }
    
    def ArrayList<String> findInputElements(IASTNode stmt) {
        var res = <String> newArrayList
            
            if (stmt instanceof IASTFieldReference) {
                val structExpr = stmt.getFieldOwner
                if (structExpr instanceof IASTIdExpression) {
                    if (structExpr.getName.toString.equals(structName)) {
                        res += stmt.getFieldName.toString
                    }
                }
            } else if (stmt instanceof IASTArraySubscriptExpression) {
                
                val array = stmt.getArrayExpression
                if (array instanceof IASTFieldReference) {
                    val structExpr = array.getFieldOwner
                    if (structExpr instanceof IASTIdExpression) {
                        if (structExpr.getName.toString.equals(structName)) {
                            res += array.getFieldName.toString
                        }
                    }
                }
                
            } else if (stmt instanceof IASTBinaryExpression) {
                if (stmt.getOperator == 17) {
                    val op1 = stmt.getOperand1
                    if (op1 instanceof IASTArraySubscriptExpression) {
                        res += findInputElements(op1.getArgument)
                    }
                    
                    res += findInputElements(stmt.getOperand2)
                } else {
                    res = findInputElements(stmt.getOperand1)
                    res += findInputElements(stmt.getOperand2)
                }
            } else if (stmt instanceof IASTFunctionCallExpression) {
                var String funcName
                if (stmt.getFunctionNameExpression instanceof IASTIdExpression) {
                    funcName = (stmt.getFunctionNameExpression as IASTIdExpression).getName.toString
                
                } else {
                    val nameExpression = stmt.getFunctionNameExpression as IASTUnaryExpression
                    funcName = (nameExpression.getOperand as IASTIdExpression).getName.toString
                }
                if (functionInputElements.containsKey(funcName)) {
                    res = functionInputElements.get(funcName)
                } else {
                    if (functionDefinitions.containsKey(funcName)) {
                        res = findFuncInputs(functionDefinitions.get(funcName))
                    }
                }
                for (child : stmt.children) {
                    res += findInputElements(child)
                }
                
            } else {
                for (child : stmt.children) {
                    res += findInputElements(child)
                }
            }
            
        res
    }
    
    def setStateInputs() {
        val functionsWithInputs = functionInputElements.keySet
        for (func : functionsWithInputs) {
            val inputs = functionInputElements.get(func)
            val funcState = functionStates.get(func)
            var stateVars = <String, ArrayList<ValuedObject>> newHashMap
            if (VOs.containsKey(funcState)) {
                stateVars = VOs.get(funcState)
            } else {
                VOs.put(funcState, stateVars)    
            }
             var i = 0
            for (input : inputs) {
                val varList = <ValuedObject> newArrayList
                
                val decl = createVariableDeclaration
                decl.input = true
                funcState.declarations += decl
                
                val vo = decl.createValuedObject(input + "_in")
                varList.add(vo)
                stateVars.put(input, varList)
                i++
            }
            if(i > funcState.declarations.length) println("Mehr declarationen als input variablen für State: " + funcState.name)
        }
    }
    
    def ArrayList<String> findFuncOutputs(IASTFunctionDefinition funcDef) {
        var res = <String> newArrayList
        
        val funcName = funcDef.getDeclarator.getName.toString    
        res = findOutputElements(funcDef.getBody)
        res = res.removeDuplicates()
        
        functionOutputElements.put(funcName, res)
            
        res
    }
    
    def ArrayList<String> findOutputElements(IASTNode stmt) {
        var res = <String> newArrayList
            
            if (stmt instanceof IASTBinaryExpression) {
                if (stmt.getOperator == 17) {
                    val op1 = stmt.getOperand1
                    if (op1 instanceof IASTFieldReference) {
                        val structExpr = op1.getFieldOwner
                        if (structExpr instanceof IASTIdExpression) {
                            if (structExpr.getName.toString.equals(structName)) {
                                res += op1.getFieldName.toString
                            }
                        }
                    } else if (op1 instanceof IASTArraySubscriptExpression) {
                        val array = op1.getArrayExpression
                            if (array instanceof IASTFieldReference) {
                            val structExpr = array.getFieldOwner
                            if (structExpr instanceof IASTIdExpression) {
                                if (structExpr.getName.toString.equals(structName)) {
                                    res += array.getFieldName.toString
                                }
                            }
                        }
                    }
                }
            } else if (stmt instanceof IASTFunctionCallExpression) {
                var String funcName
                if (stmt.getFunctionNameExpression instanceof IASTIdExpression) {
                    funcName = (stmt.getFunctionNameExpression as IASTIdExpression).getName.toString
                
                } else {
                    val nameExpression = stmt.getFunctionNameExpression as IASTUnaryExpression
                    funcName = (nameExpression.getOperand as IASTIdExpression).getName.toString
                }
                if (functionOutputElements.containsKey(funcName)) {
                    res = functionOutputElements.get(funcName)
                } else {
                    if (functionDefinitions.containsKey(funcName)) {
                        res = findFuncOutputs(functionDefinitions.get(funcName))
                    }
                }
                
            } else {
                for (child : stmt.children) {
                    res += findOutputElements(child)
                }
            }
            
        res
    }
    
    def setStateOutputs() {
        val functionsWithOutputs = functionOutputElements.keySet
        for (func : functionsWithOutputs) {
            val outputs = functionOutputElements.get(func)
            val funcState = functionStates.get(func)
            
            var stateVars = <String, ArrayList<ValuedObject>> newHashMap
            if (VOs.containsKey(funcState)) {
                stateVars = VOs.get(funcState)
            } else {
                VOs.put(funcState, stateVars)
            }
            
            for (output : outputs) {
                var varList = <ValuedObject> newArrayList
                if (stateVars.containsKey(output)) {
                    varList = stateVars.get(output)
                } else {
                    stateVars.put(output, varList)
                }
                
                val decl = createVariableDeclaration
                decl.output = true
                funcState.declarations += decl
                
                val vo = decl.createValuedObject(output + "_out")
                varList.add(vo)                
            }
        }
    }
    
    def ArrayList<String> removeDuplicates(ArrayList<String> list) {
        var res = <String> newArrayList
        
        for (elem : list) {
            if (!(res.contains(elem))) res.add(elem)
        }
        
        res
    }
    
       
    def ValuedObject findValuedObjectByName(State state, String name, boolean writing, Region dRegion) {
        var ValuedObject res
        val varList = VOs.get(state).get(name)
//        println("")
//        println("looking for " + name + " in state " + state.getName() + " with writing: " + writing)
//        println("current varList: " + varList)
        res = varList.get(varList.length - 1)
//        println("last Elem found: " + res)
        var varName = res.getName()
        var onlyOut = false
        if(varName.contains("_out")) {
//            //println("contains _out")
            if(varList.length > 1) {
                res = varList.get(varList.length - 2)
//                //println("use now: " + res)
                varName = res.getName()
            } else {
                val OffsetAnno = res.getAnnotations("Offset")
                val LengthAnno = res.getAnnotations("Length")
                onlyOut = true
                var varDecl = res.getVariableDeclaration
                varName = varName.substring(0, varName.length-3) + "0"
                val type = varDecl.type
                
                if(!dRegion.declarations.contains(varDecl)) {
                    varDecl = createVariableDeclaration
                    varDecl.annotations += createTagAnnotation("Hide")
                    varDecl.type = type
                    dRegion.declarations += varDecl
                }
                
                res = varDecl.createValuedObject(varName)
                if (OffsetAnno.length > 0) res.annotations += OffsetAnno.head
                if (LengthAnno.length > 0) res.annotations += LengthAnno.head
                
                varList.add(0, res)
                
            }
        } 
        if(writing && !onlyOut) {
            var varDecl = res.getVariableDeclaration
            var newName = ""
            
            if (!(varName.lastIndexOf("_in") == varName.length - 3)) {
                val varSuffix = varName.substring(varName.lastIndexOf("_") + 1)
                val varNmr = Integer.parseInt(varSuffix)
                newName = varName.substring(0, varName.lastIndexOf("_") + 1) + (varNmr + 1)    
            } else {
                newName = varName.substring(0, varName.length - 2) + "0"
            }
            
            
            
            val type = varDecl.type
            if(!dRegion.declarations.contains(varDecl)) {
                varDecl = createVariableDeclaration
                varDecl.annotations += createTagAnnotation("Hide")
                varDecl.type = type
                dRegion.declarations += varDecl
            }
            
            res = varDecl.createValuedObject(newName)
//            //println("writing==true => use: " + res)
            varList.add(res)
        }
         
//        //println("") 
        res
    }
    
    def linkOutputs(State state, DataflowRegion dRegion) {
        println("Inside LinkOutputs")
        var stateVariables = VOs.get(state)
        for (varList : stateVariables.values) {
            val outVO = findOutputVar(varList)
            if (outVO !== null && (varList.length > 1)) {
                println("Found an output to link: " + outVO)
                var lastVO = varList.get(varList.length - 1)
                if(lastVO.getName.contains("_out") && (varList.length > 1)) {
                    lastVO = varList.get(varList.length - 2)
                }
                if (outVO.annotations.length < 2) {
                    outVO.annotations += createStringAnnotation("Offset", lastVO.getStringAnnotationValue("Offset"))
                    outVO.annotations += createStringAnnotation("Length", lastVO.getStringAnnotationValue("Length"))
                }
                dRegion.equations += createAssignment(outVO, lastVO.reference)
                
            }
        }
    }
    
    def ValuedObject findOutputVar(ArrayList<ValuedObject> varList) {
        var ValuedObject res = null
        
        for(var i = 0; (i < varList.length) && (res === null); i++) {
            var varName = varList.get(i).getName
            if (varName.contains("_out")) {
                res = varList.get(i)
            }
        }
        
        res
    }
  
}