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
import org.eclipse.cdt.core.dom.ast.IASTForStatement
import org.eclipse.cdt.core.dom.ast.IASTWhileStatement
import org.eclipse.cdt.core.dom.ast.IASTDoStatement
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensions
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import java.util.HashSet
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTDefaultStatement
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import org.eclipse.cdt.core.dom.ast.IASTExpression

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
    @Inject extension KExpressionsSerializeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension HighlightingExtensions
    @Inject extension ExpressionConverterExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension ValueExtensions
    @Inject extension SMExtractorExtensions
    
    var State baseState
    var String structName
    var functionDefinitions = <String, IASTFunctionDefinition> newHashMap
    var functionStates = <String, State> newHashMap
    var functionInputElements = <String, HashSet<String>> newHashMap
    var functionOutputElements = <String, HashSet<String>> newHashMap
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
        
        if(ast === null) {
            return null
        }
        
        // Create SCCharts root elements
        val SCChart = createSCChart
        baseState = createState
        SCChart.rootStates += baseState
        
        // Find the marked comment        
        val comments = ast.getComments
        val idx = comments.getIdxOfComment("//_EXTRACTOR_FUNCTION")
        if(idx >= 0) {
            val exComment = comments.get(idx)
            val mFunc = getCommentFollowingNode(ast, exComment) as IASTFunctionDefinition   
            
            // Retrieve the name of the marked function
            val funcName = mFunc.getDeclarator.getName.toString
            baseState.name = funcName
            baseState.label = funcName
            baseState.insertHighlightAnnotations(mFunc)
            functionStates.put(funcName, baseState)
            
            // Retrieve the name of teh central struct
            val structParam = (mFunc.getDeclarator as CASTFunctionDeclarator).getParameters.get(0) 
            structName = structParam.getDeclarator.getName.toString
            
            // Retrieve all structflow functions
            findFunctions(ast)
            
            // Set the in and outputs of the core function
            mFunc.findFuncInputs()
            setStateInputs()
            mFunc.findFuncOutputs()
            setStateOutputs()
            
            // Add all structflow function to the sccharts
            for (funcState : functionStates.values) {
                SCChart.rootStates += funcState
            }
            
            // Translate the function body
            buildStructFlowForFunction(funcName)
            
        } else {
            baseState.name = "No function marked for Extraction!\nPlace the comment \"//_EXTRACTOR_FUNCTION\" above the function to extract"
            baseState.label = baseState.name
        }
        
        SCChart
        
    }
    
    // Create function states for all function definitions
    def findFunctions(IASTTranslationUnit ast) {
        for (stmt : ast.children) {
            if (stmt instanceof IASTFunctionDefinition) {
                // Retrieve function name
                val funcName = stmt.getDeclarator.getName.toString
                functionDefinitions.put(funcName, stmt)
                functionBuild.put(funcName, false)
                // If function is not yet created build the state
                if (!functionStates.containsKey(funcName)) {
                    // Create the state
                    val funcState = createState(funcName)
                    funcState.insertHighlightAnnotations(stmt)
                    
                    // Create the output is the function has a return type
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
    
    // Create the body for the named function
    def DataflowRegion buildStructFlowForFunction(String funcName) {
        var DataflowRegion dRegion
        // Check if the body was already translated 
        if (!functionBuild.get(funcName)) {
            // Set the flag
            functionBuild.remove(funcName)
            functionBuild.put(funcName, true)
            
            val funcDef = functionDefinitions.get(funcName)
            if (functionStates.containsKey(funcName)) {
                val funcState = functionStates.get(funcName)
                dRegion = createDataflowRegion("")
                funcState.regions += dRegion
                for (annote : funcState.annotations) {
                    dRegion.annotations += annote
                }
                // Translate each statement
                for (stmt : funcDef.getBody.children) {
                    buildStructFlow(stmt, funcState, dRegion)    
                }
                funcState.linkOutputs(dRegion)    
            }
        }        
        dRegion
    }
    
    def buildStructFlow(IASTNode stmt, State funcState, DataflowRegion dRegion) {
            
        // Translate an expression
        if (stmt instanceof IASTExpressionStatement) {
            val expr = stmt.getExpression
            
            // Reference the function state for a function call for a struct flow function    
            if (expr instanceof IASTFunctionCallExpression) {
                val firstArg = expr.getArguments.get(0)
                // Check if the function is a structflow function
                if ((firstArg instanceof IASTIdExpression) && ((firstArg as IASTIdExpression).getName.toString.equals(structName))) {
                    var funcCallName = ""
                    val funcCallNameExpr = expr.getFunctionNameExpression
                    if (funcCallNameExpr instanceof IASTIdExpression) {
                        funcCallName = funcCallNameExpr.getName.toString
                    } else {
                        funcCallName = ((funcCallNameExpr as IASTUnaryExpression).getOperand as IASTIdExpression).getName.toString
                    }
                    
                    if (functionStates.containsKey(funcCallName)) {
                        // Retrieve the function state
                        val funcCallState = functionStates.get(funcCallName)
                        val funcCallInputs = functionInputElements.get(funcCallName)
                        val funcCallOutputs = functionOutputElements.get(funcCallName)
                        
                        // Create the reference of the state    
                        val refDecl = createReferenceDeclaration
                        refDecl.setReference(funcCallState)
                        refDecl.annotations += createTagAnnotation("Hide")
                        dRegion.declarations += refDecl                            
                        val funcCallVO = refDecl.createValuedObject(funcCallName)
                        
                        // Connect the inputs    
                        for (funcCallInput : funcCallInputs) {
                            val funcCallInputVO = VOs.get(funcCallState).get(funcCallInput).get(0)
                            val inputVO = funcState.findValuedObjectByName(funcCallInput, false, dRegion)
                                
                            dRegion.equations += createAssignment(funcCallVO, funcCallInputVO, inputVO.reference)
                        }
                        
                        // Connect the outputs    
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
                        
                        // Translate the body of the function    
                        buildStructFlowForFunction(funcCallName)
                    }
                }
            
            // Translate a binary expression        
            } else if (expr instanceof IASTBinaryExpression) {
                // Find the in- and output struct elements
                val exprOutputElements = findOutputElements(expr)
                val op2OutputElements = findOutputElements(expr.getOperand2)
                // Check if the expression writes to a struct element
                if ((exprOutputElements.length > op2OutputElements.length)) {
                    // Retrieve the element that is written to
                    val targetNames = findDifference(exprOutputElements, op2OutputElements)
                    if (targetNames.length == 1) {
                        // Create the assignment    
                        val sourceExpr = createStructFlowKExpression(expr.getOperand2, funcState, dRegion) 
                        val targetVO = funcState.findValuedObjectByName(targetNames.get(0), true, dRegion)
                        dRegion.equations += createAssignment(targetVO, sourceExpr)
                        targetVO.insertHighlightAnnotations(expr)
                    }
                }
            }
        // Build the controlflow Statements if wanted    
        } if (buildControlStatements) {
            if (stmt instanceof IASTForStatement) {
                
                buildForStatement(stmt, funcState, dRegion)              
                 
            } else if (stmt instanceof IASTWhileStatement) {
                  
                buildWhileStatement(stmt, funcState, dRegion) 
                 
            } else if (stmt instanceof IASTDoStatement) {
                
                buildDoStatement(stmt, funcState, dRegion)                    
                 
            } else if (stmt instanceof IASTIfStatement) {
                
                buildIfStatement(stmt, funcState, dRegion)
                
            } else if (stmt instanceof IASTSwitchStatement) {
                
                buildSwitchStatement(stmt, funcState, dRegion)
                
            }
        } else {
            for (child : stmt.children) {
                buildStructFlow(child, funcState, dRegion)
            }
        }
    }
    
    // Build the respective state for a for statement
    def buildForStatement(IASTForStatement stmt, State funcState, DataflowRegion dRegion) {
        // Create the for state
        val forState = createState("For_" + forCounter)
        forState.label = "For"
        forState.insertHighlightAnnotations(stmt)
        //Create the Reference
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject("For_" + forCounter)
        forCounter++
        
        // Link the in- and outputs            
        controlStmtSetInOutputs(stmt, forState, forObj, funcState, dRegion)
        
        // Translate the body            
        val forDRegion = createDataflowRegion("")
        forDRegion.insertHighlightAnnotations(stmt)
        forState.regions += forDRegion
        val forBody = stmt.getBody
        for (bStmt : forBody.children) {
            buildStructFlow(bStmt, forState, forDRegion)
        }
        forState.linkOutputs(forDRegion)
    }
    
    // Build the respective state for a while statement
    def buildWhileStatement(IASTWhileStatement stmt, State funcState, DataflowRegion dRegion) {
        // Create the while state
        val wState = createState("While_" + whileCounter)
        wState.label = "While"
        wState.insertHighlightAnnotations(stmt)
        // Create the Reference
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(wState)
        val wObj = refDecl.createValuedObject("While_" + whileCounter)
        whileCounter++
        
        // Link the in- and outputs        
        controlStmtSetInOutputs(stmt, wState, wObj, funcState, dRegion)
        
        // Translate the body          
        val wDRegion = createDataflowRegion("")
        wDRegion.insertHighlightAnnotations(stmt)
        wState.regions += wDRegion
        val wBody = stmt.getBody
        for (bStmt : wBody.children) {
            buildStructFlow(bStmt, wState, wDRegion)
        }
        wState.linkOutputs(wDRegion)
    }
    
    // Build the state for a do statement
    def buildDoStatement(IASTDoStatement stmt, State funcState, DataflowRegion dRegion) {
        // Create the do state
        val doState = createState("Do_" + doCounter)
        doState.label = "Do"
        doState.insertHighlightAnnotations(stmt)
        // Create the Reference
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject("Do_" + doCounter)
        doCounter++
        
        // Link the in- and outputs            
        controlStmtSetInOutputs(stmt, doState, doObj, funcState, dRegion)
        
        // Translate the body            
        val doDRegion = createDataflowRegion("")
        doDRegion.insertHighlightAnnotations(stmt)
        doState.regions += doDRegion
        val doBody = stmt.getBody
        for (bStmt : doBody.children) {
           buildStructFlow(bStmt, doState, doDRegion)
        }
        doState.linkOutputs(doDRegion)
    }
    
    // Translate an if statement
    def buildIfStatement(IASTIfStatement stmt, State funcState, DataflowRegion dRegion) {
        // Create the if state
        val ifState = createState("If_" + ifCounter)
        ifState.label = "If"
        ifState.insertHighlightAnnotations(stmt)
        // Create the Reference
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject("If_" + ifCounter)
        ifCounter++
        
        // Link the in- and outputs            
        controlStmtSetInOutputs(stmt, ifState, ifObj, funcState, dRegion)
        
        // Translate the body       
        val ifCRegion = createControlflowRegion("")
        ifCRegion.insertHighlightAnnotations(stmt)
        ifState.regions += ifCRegion
        val initState = ifCRegion.createState("Init")
        initState.initial = true
        ifState.insertHighlightAnnotations(stmt)
        
        // Create the Then state      
        val thenState = ifCRegion.createState("Then")
        val thenDRegion = createDataflowRegion("")
        thenState.regions += thenDRegion
        // Create the then transition
        val thenTransition = initState.createTransitionTo(thenState)
        thenTransition.trigger = stmt.getConditionExpression.createStructFlowKExpression(ifState, thenDRegion)
        // Translate the then branch            
        val thenBody = stmt.getThenClause
        thenState.insertHighlightAnnotations(thenBody)
        thenDRegion.insertHighlightAnnotations(thenBody)
        for (tStmt : thenBody.children) {
            buildStructFlow(tStmt, ifState, thenDRegion)
        }      
        ifState.linkOutputs(thenDRegion)                
                
        val elseBody = stmt.getElseClause
        if (elseBody !== null) {
            // Create the Else state
            val elseState = ifCRegion.createState("Else")
            elseState.insertHighlightAnnotations(elseBody)
            val elseDRegion = createDataflowRegion("")
            elseDRegion.insertHighlightAnnotations(elseBody)
            elseState.regions += elseDRegion
            // Create the else transition
            initState.createTransitionTo(elseState)
            
            // Translate the else branch           
            for (eStmt : elseBody.children) {
               buildStructFlow(eStmt, ifState, elseDRegion)
            }      
            ifState.linkOutputs(elseDRegion)
        }
    }
    
    // Translate a switch statement
    def buildSwitchStatement(IASTSwitchStatement stmt, State funcState, DataflowRegion dRegion) {
        // Create the State representing the switch
        val swState = createState("Switch_" + swCounter)
        
        // Create the reference for the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject("Switch_" + swCounter)        
        swObj.insertHighlightAnnotations(stmt)
        swCounter++
        
        // Set the In and Outputs
        controlStmtSetInOutputs(stmt, swState, swObj, funcState, dRegion)
        
        // Create the controlflow region
        val cRegion = swState.createControlflowRegion("")
        cRegion.insertHighlightAnnotations(stmt.getBody)
        
        // Create the controller expression label
        val controller = stmt.getControllerExpression.createStructFlowKExpression(swState, dRegion)
        cRegion.label = "switch (" + controller.serialize + ")"       
        
        // Create the initial state
        val initState = cRegion.createState("Init")
        initState.insertHighlightAnnotations(stmt.getBody)
        initState.initial = true
        
        // Create the final state
        val finalState = cRegion.createState("final")
        finalState.insertHighlightAnnotations(stmt.getBody)
        finalState.final = true
        
        // Translate the switch body
        val swBody = stmt.getBody as IASTCompoundStatement
        var State noBreakCase
        var State activeCase
        var DataflowRegion activeDRegion
        for (child : swBody.children) {
            
            // Create a new state for case or default statements
            if (child instanceof IASTCaseStatement || child instanceof IASTDefaultStatement) {
                // Save the previous case state
                noBreakCase = activeCase
                if (activeCase !== null) {
                    linkOutputs(swState, activeDRegion)
                }
                // Create the state
                activeCase = cRegion.createState("")
                activeCase.insertHighlightAnnotations(child)
                
                // Create its dataflow region
                activeDRegion = createDataflowRegion("")
                activeCase.regions += activeDRegion
                activeDRegion.insertHighlightAnnotations(child)
                
                // Create the transition from teh previous case state to the new if needed
                if (noBreakCase !== null) {
                    noBreakCase.createTransitionTo(activeCase)
                    noBreakCase = null
                }
                
                // Create a triggered transition for a case state 
                if (child instanceof IASTCaseStatement) {
                    val caseTransition = initState.createTransitionTo(activeCase)
                    caseTransition.trigger = child.getExpression.createKExpression(swState, dRegion)                    
                    activeCase.label = controller.serialize + " == " + caseTransition.trigger.serialize
                // Create a transition without a trigger for a default statement    
                } else {
                    initState.createTransitionTo(activeCase)
                    activeCase.createTransitionTo(finalState)                    
                    activeCase.label = "default"
                }
            // Create a transition to the final state for break statements    
            } else if (child instanceof IASTBreakStatement) {
                activeCase.createTransitionTo(finalState)
                linkOutputs(swState, activeDRegion)
                activeCase = null
            // Translate other statements into the currently active dataflow region    
            } else {
                buildStructFlow(child, swState, activeDRegion)
            }
            
        }
        linkOutputs(swState, activeDRegion)
    }
    
    // Link the in and outputs of a control statement state
    def controlStmtSetInOutputs(IASTNode stmt, State csState, ValuedObject csObj, State funcState, DataflowRegion dRegion) {
        // Find the in- and outputs
        var inputs = findInputElements(stmt)
        var outputs = findOutputElements(stmt)
        
        // Create the state variable map
        val stateVariables = <String, ArrayList<ValuedObject>> newHashMap
        VOs.put(csState, stateVariables)
        
        for (input : inputs) {
            // Create the input
            val decl = createVariableDeclaration
            decl.input = true
            csState.declarations += decl
            val inputVO = decl.createValuedObject(input + "_in")
            
            // Create the ssa list and attach it to the state var map
            val varList = <ValuedObject> newArrayList
            varList.add(inputVO)
            stateVariables.put(input, varList)
            
            // Link the created input to the respective outer VO
            val outerInputVO = funcState.findValuedObjectByName(input,false,dRegion)
            dRegion.equations += createAssignment(csObj, inputVO, outerInputVO.reference)
        }
        
        for (output : outputs) {
            // Create the output
            val decl = createVariableDeclaration
            decl.output = true
            csState.declarations += decl
            val outputVO = decl.createValuedObject(output + "_out")
            
            // Create the ssa list if needed
            var varList = <ValuedObject> newArrayList
            if (stateVariables.containsKey(output)) {
                varList = stateVariables.get(output)
            } else {
                stateVariables.put(output, varList)    
            }            
            varList.add(outputVO)
            
            // Link the created output to the outer vo
            val outerOutputVO = funcState.findValuedObjectByName(output,true,dRegion)
            val source = csObj.reference => [
                subReference = outputVO.reference
            ]
            dRegion.equations += createAssignment(outerOutputVO, source)
            outerOutputVO.insertHighlightAnnotations(stmt)
        }
    }
    
    // Translate a function call expression found inside of another expression
    def ValuedObject buildFuncCall(IASTFunctionCallExpression expr, State funcState, DataflowRegion dRegion) {
        var ValuedObject vo
        
        // Make sure the function is a struct flow function
        val firstArg = expr.getArguments.get(0)
        if ((firstArg instanceof IASTIdExpression) && ((firstArg as IASTIdExpression).getName.toString.equals(structName))) {
            // Retrieve the function name
            var funcCallName = ""
            val funcCallNameExpr = expr.getFunctionNameExpression
            if (funcCallNameExpr instanceof IASTIdExpression) {
                funcCallName = funcCallNameExpr.getName.toString
            } else {
                funcCallName = ((funcCallNameExpr as IASTUnaryExpression).getOperand as IASTIdExpression).getName.toString
            }
            if (functionStates.containsKey(funcCallName)) {
                // Retireve the function state
                val funcCallState = functionStates.get(funcCallName)
                val funcCallInputs = functionInputElements.get(funcCallName)
                val funcCallOutputs = functionOutputElements.get(funcCallName)
                        
                // Create the Reference        
                val refDecl = createReferenceDeclaration
                refDecl.setReference(funcCallState)
                refDecl.annotations += createTagAnnotation("Hide")
                dRegion.declarations += refDecl
                val funcCallVO = refDecl.createValuedObject(funcCallName)
                vo = funcCallVO
                
                // Connect the argument expressions           
                for (funcCallInput : funcCallInputs) {
                    val funcCallInputVO = VOs.get(funcCallState).get(funcCallInput).get(0)
                    val inputVO = funcState.findValuedObjectByName(funcCallInput, false, dRegion)
                    dRegion.equations += createAssignment(funcCallVO, funcCallInputVO, inputVO.reference)
                }
                
                // Connect the function outputs   
                if (funcCallOutputs !== null) {         
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
                }
                
                // Build the func body             
                buildStructFlowForFunction(funcCallName)
            }
        }
        
        vo
    }
    
    // Translate an expression
    def Expression createStructFlowKExpression(IASTNode expr, State funcState, DataflowRegion dRegion) {
        var Expression res
        println("createStructFlowKExpression für expr: " + expr)
        // Create a reference expression for a use of a struct element
        if (expr instanceof IASTFieldReference) {
            val structExpr = expr.getFieldOwner
            println("   expr is fieldReference und filed owner is: " + structExpr)
            if (structExpr instanceof IASTIdExpression) {
                println("    field owner is idexpression")
                if (structExpr.getName.toString.equals(structName)) {
                    println("filed owner is central struct")
                    val elemVO = funcState.findValuedObjectByName(expr.getFieldName.toString, false, dRegion)
                    res = elemVO.reference
                }
            } else if (structExpr instanceof IASTFieldReference) {
                println("field owner is wieder ne field reference")
                res = structExpr.createStructFlowKExpression(funcState, dRegion)
            }
        // Translate the unary expression    
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
        // Translate the Binary Expression    
        } else if (expr instanceof IASTBinaryExpression) {
            val opType = expr.getOperator.CDTBinaryOpTypeConversion
            val binExpr = opType.createOperatorExpression
            
            for (operand : expr.children) {
                binExpr.subExpressions += operand.createStructFlowKExpression(funcState, dRegion)
            }
            
            res = binExpr
        // Test if the array is a struct element    
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
        // Translate the IdExpression into a String value    
        } else if (expr instanceof IASTIdExpression) {
            res = createStringValue(expr.getName.toString)
        // Translate the literal    
        } else if (expr instanceof IASTLiteralExpression) {
            res = expr.createValue
        // Extract the expression and translate it    
        } else if (expr instanceof IASTExpressionStatement) {
            res = expr.getExpression.createStructFlowKExpression(funcState, dRegion)
        // Translate a function call expression
        } else if (expr instanceof IASTFunctionCallExpression) {
            // Retrieve the function's name
            var funcCallName = ""
            val funcCallNameExpr = expr.getFunctionNameExpression
            if (funcCallNameExpr instanceof IASTIdExpression) {
                funcCallName = funcCallNameExpr.getName.toString
            } else {
                funcCallName = ((funcCallNameExpr as IASTUnaryExpression).getOperand as IASTIdExpression).getName.toString
            }
            // Retrieve the function state if it exists
            val funcCallState = functionStates.get(funcCallName)
            if (funcCallState !== null) {
                val funcCallVO = expr.buildFuncCall(funcState, dRegion)
                res = funcCallVO.reference => [
                    subReference = funcCallState.declarations.filter(VariableDeclaration).map[ valuedObjects ].flatten.filter [ name == "res_out" ].head.reference
                ]
            // Create a state for a not known function an connect it    
            } else {
                // Create the state
                val unFuncCallState = createState(funcCallName)
                unFuncCallState.insertHighlightAnnotations(expr)
                // Create an output
                val outVarDecl = createVariableDeclaration
                outVarDecl.output= true
                unFuncCallState.declarations += outVarDecl
                val outputVO = outVarDecl.createValuedObject("")
                
                // Create the Reference
                var refDecl = createReferenceDeclaration
                refDecl.setReference(unFuncCallState)
                refDecl.annotations += createTagAnnotation("hide")
                dRegion.declarations += refDecl                
                val funcCallVO = refDecl.createValuedObject(funcCallName)
                res = funcCallVO.reference => [
                    subReference = outputVO.reference
                ]
                
                // Connect the argument expressions
                val arguments = expr.getArguments
                for (argument : arguments) {
                    val argDecl = createVariableDeclaration
                    argDecl.input = true
                    unFuncCallState.declarations += argDecl
                    val argVO = argDecl.createValuedObject("")
                    
                    dRegion.equations += createAssignment(funcCallVO, argVO, argument.createStructFlowKExpression(funcState, dRegion))
                }
            }

        // Translate a conditional expression similar to an if statement    
        } else if (expr instanceof IASTConditionalExpression) {
            
            val condExpr = expr.getLogicalConditionExpression
            // Create the state
            val condState = createState(condExpr.exprToString)
            condState.insertHighlightAnnotations(expr)
            // Create a Region for the then branch
            val condDRegion = createDataflowRegion(condState.name)
            condDRegion.label = condState.name
            condState.regions += condDRegion
            // Create the Reference
            val refDecl = createReferenceDeclaration
            refDecl.setReference(condState)
            refDecl.annotations += createTagAnnotation("hide")
            dRegion.declarations += refDecl
            val condStateVO = refDecl.createValuedObject("?")
            val stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            VOs.put(condState, stateVariables)
            
            // Connect the inputs
            var inputElements = expr.findInputElements
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
            
            // Connect the output
            val outputDecl = createVariableDeclaration
            outputDecl.output = true
            condState.declarations += outputDecl
            val outputVO = outputDecl.createValuedObject("res")
            
            // Translate the positive expression
            condDRegion.equations += createAssignment(outputVO, expr.getPositiveResultExpression.createStructFlowKExpression(condState,condDRegion))
            outputVO.insertHighlightAnnotations(expr)
            
            // Translate the negative expression
            val condNDRegion = createDataflowRegion("Else")
            condNDRegion.label = "Else"
            condState.regions += condNDRegion
            
            condNDRegion.equations += createAssignment(outputVO, expr.getNegativeResultExpression.createStructFlowKExpression(condState,condNDRegion))
            outputVO.insertHighlightAnnotations(expr)
            
            
            res = condStateVO.reference => [
                subReference = outputVO.reference
            ]
            
        // Translate a Cast Expression    
        } else if (expr instanceof IASTCastExpression) {
            res = expr.getOperand.createStructFlowKExpression(funcState, dRegion)
        }
        
        res
    }
    
    def printASTHead(IASTNode node, String prefix) {
        println(prefix + node.toString)
        for (child : node.children) {
            if (!(child instanceof IASTCompoundStatement)) {
                printASTHead(child, prefix + "  ")
            }
        }
    }
    
    // Return all elements of set1 that are not contained in set2
    def ArrayList<String> findDifference(HashSet<String> set1, HashSet<String> set2) {
        val res = <String> newArrayList
        
        for (elem : set1) {
            if (!set2.contains(elem)) res.add(elem)
        }
        
        res
    }
    
    // Find all used struct elements of the given function definition
    def HashSet<String> findFuncInputs(IASTFunctionDefinition funcDef) {
        var res = <String> newHashSet
        
        val funcName = funcDef.getDeclarator.getName.toString    
        res = findInputElements(funcDef.getBody)
        
        functionInputElements.put(funcName, res)
            
        res
    }
    
    // Find all struct elements read in the given node
    def HashSet<String> findInputElements(IASTNode stmt) {
        var res = <String> newHashSet
            // Add a found struct element
            if (stmt instanceof IASTFieldReference) {
                val structExpr = stmt.getFieldOwner
                if (structExpr instanceof IASTIdExpression) {
                    if (structExpr.getName.toString.equals(structName)) {
                        res += stmt.getFieldName.toString
                    }
                } else if (structExpr instanceof IASTFieldReference) {
                    res = findInputElements(structExpr)
                }
            // Test if the array is a struct element    
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
            // If the node is a BianryExpression exclude targets of an assignment    
            } else if (stmt instanceof IASTBinaryExpression) {
                if (stmt.getOperator == IASTBinaryExpression.op_assign) {
                    val op1 = stmt.getOperand1
                    if (op1 instanceof IASTArraySubscriptExpression) {
                        res += findInputElements(op1.getArgument)
                    }                    
                    res += findInputElements(stmt.getOperand2)
                } else {
                    res = findInputElements(stmt.getOperand1)
                    res += findInputElements(stmt.getOperand2)
                }
            // Include all inputs of a found function call    
            } else if (stmt instanceof IASTFunctionCallExpression) {
                var String funcName
                if (stmt.getFunctionNameExpression instanceof IASTIdExpression) {
                    funcName = (stmt.getFunctionNameExpression as IASTIdExpression).getName.toString
                
                } else {
                    println("FUNC CALL!!!")
                    println("containingFile: " + stmt.getContainingFilename)
                    println("location Offset: " + stmt.getNodeLocations.get(0).getNodeOffset)
                    println("FunctionName: " + stmt.FUNCTION_NAME)
                    printASTHead(stmt, "")
                    /*var IASTExpression nameExpression = stmt.getFunctionNameExpression
                    while (!(nameExpression instanceof IASTIdExpression)) {
                        nameExpression = (nameExpression as IASTUnaryExpression).getOperand
                    }
                    funcName = (nameExpression as IASTIdExpression).getName.toString*/
                    funcName = "Weird Func Call!"
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
            // Test all children of any other kind of node    
            } else {
                for (child : stmt.children) {
                    res += findInputElements(child)
                }
            }
            
        res
    }
    
    // Create the inputs of all structflow functions
    def setStateInputs() {
        val functionsWithInputs = functionInputElements.keySet
        for (func : functionsWithInputs) {
            // Retrieve the input list of the function
            val inputs = functionInputElements.get(func)
            // Retrieve the corresponding state
            val funcState = functionStates.get(func)
            // Set up the state valued object map
            var stateVars = <String, ArrayList<ValuedObject>> newHashMap
            if (VOs.containsKey(funcState)) {
                stateVars = VOs.get(funcState)
            } else {
                VOs.put(funcState, stateVars)    
            }
            
            // Create an input declaration    
            val decl = createVariableDeclaration
            decl.input = true
            funcState.declarations += decl
            
            // Create a valued object for each input    
            for (input : inputs) {
                val varList = <ValuedObject> newArrayList
                
                val vo = decl.createValuedObject(input + "_in")
                varList.add(vo)
                stateVars.put(input, varList)
            }
            
        }
    }
    
    // Find all struct elements written inside the given function
    def HashSet<String> findFuncOutputs(IASTFunctionDefinition funcDef) {
        var res = <String> newHashSet
        
        val funcName = funcDef.getDeclarator.getName.toString    
        res = findOutputElements(funcDef.getBody)
        
        functionOutputElements.put(funcName, res)
            
        res
    }
    
    // Find all struct elements written inside the given node
    def HashSet<String> findOutputElements(IASTNode stmt) {
        var res = <String> newHashSet
            
            // Include every target of an assignment
            if (stmt instanceof IASTBinaryExpression) {
                if (stmt.getOperator == 17) {
                    val op1 = stmt.getOperand1
                    // Include struct elements
                    if (op1 instanceof IASTFieldReference) {
                        val structExpr = op1.getFieldOwner
                        if (structExpr instanceof IASTIdExpression) {
                            if (structExpr.getName.toString.equals(structName)) {
                                res += op1.getFieldName.toString
                            }
                        } else if (structExpr instanceof IASTFieldReference) {
                            res = findInputElements(structExpr)
                        }
                    // Test if the array is a struct element     
                    } else if (op1 instanceof IASTArraySubscriptExpression) {
                        val array = op1.getArrayExpression
                            if (array instanceof IASTFieldReference) {
                            val structExpr = array.getFieldOwner
                            if (structExpr instanceof IASTIdExpression) {
                                if (structExpr.getName.toString.equals(structName)) {
                                    res += array.getFieldName.toString
                                }
                            } else if (structExpr instanceof IASTFieldReference) {
                                res = findInputElements(structExpr)
                            }
                        }
                    }
                }
            // Include all elements written in the called function    
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
            // Test every child of the given node   
            } else {
                for (child : stmt.children) {
                    res += findOutputElements(child)
                }
            }
            
        res
    }
    
    // Create the outputs for every structflow function
    def setStateOutputs() {
        val functionsWithOutputs = functionOutputElements.keySet
        for (func : functionsWithOutputs) {
            // Retrieve the functions outputs
            val outputs = functionOutputElements.get(func)
            val funcState = functionStates.get(func)
            // Retrieve the state's valued object map
            var stateVars = <String, ArrayList<ValuedObject>> newHashMap
            if (VOs.containsKey(funcState)) {
                stateVars = VOs.get(funcState)
            } else {
                VOs.put(funcState, stateVars)
            }
            // Create an output declaration    
            val decl = createVariableDeclaration
            decl.output = true
            funcState.declarations += decl
            // Create a valued object for every output
            for (output : outputs) {
                var varList = <ValuedObject> newArrayList
                if (stateVars.containsKey(output)) {
                    varList = stateVars.get(output)
                } else {
                    stateVars.put(output, varList)
                }
                
                val vo = decl.createValuedObject(output + "_out")
                varList.add(vo)                
            }
        }
    }
    
    // Find the needed valued object of a state representing the named variable   
    def ValuedObject findValuedObjectByName(State state, String name, boolean writing, Region dRegion) {
        var ValuedObject res
        // Retrieve the last VO from the ssa lsit
        val varList = VOs.get(state).get(name)
        res = varList.get(varList.length - 1)
        var varName = res.getName()
        var onlyOut = false
        // Test of the selected object is an output object
        if(varName.contains("_out")) {
            // Take the previous object if exists
            if(varList.length > 1) {
                res = varList.get(varList.length - 2)
                varName = res.getName()
            // Create a new valued object if needed
            } else {
                val OffsetAnno = res.getAnnotations("Offset")
                val LengthAnno = res.getAnnotations("Length")
                onlyOut = true
                // Retrieve the declaration and type of the output object
                var varDecl = res.getVariableDeclaration
                varName = varName.substring(0, varName.length-3) + "0"
                val type = varDecl.type
                
                // Test if a new declaration needs to be created
                if(!dRegion.declarations.contains(varDecl)) {
                    varDecl = createVariableDeclaration
                    varDecl.annotations += createTagAnnotation("Hide")
                    varDecl.type = type
                    dRegion.declarations += varDecl
                }
                
                // Create the new valued object
                res = varDecl.createValuedObject(varName)
                if (OffsetAnno.length > 0) res.annotations += OffsetAnno.head
                if (LengthAnno.length > 0) res.annotations += LengthAnno.head
                
                varList.add(0, res)
                
            }
        }
        // Create a new valued object if needed to maintain ssa form 
        if(writing && !onlyOut) {
            // Retrieve the declaration of the previous candidate
            var varDecl = res.getVariableDeclaration
            var newName = ""
            
            // Find the new suffix
            if (!(varName.lastIndexOf("_in") == varName.length - 3)) {
                val varSuffix = varName.substring(varName.lastIndexOf("_") + 1)
                val varNmr = Integer.parseInt(varSuffix)
                newName = varName.substring(0, varName.lastIndexOf("_") + 1) + (varNmr + 1)    
            } else {
                newName = varName.substring(0, varName.length - 2) + "0"
            }
            // Create a new declaration if needed
            val type = varDecl.type
            if(!dRegion.declarations.contains(varDecl)) {
                varDecl = createVariableDeclaration
                varDecl.annotations += createTagAnnotation("Hide")
                varDecl.type = type
                dRegion.declarations += varDecl
            }
            // Create the valued object
            res = varDecl.createValuedObject(newName)
            varList.add(res)
        } 
        res
    }
    
    // Link the last written valued obejct for a variable to its output object
    def linkOutputs(State state, DataflowRegion dRegion) {
        var stateVariables = VOs.get(state)
        for (varList : stateVariables.values) {
            // Retrieve the output object
            val outVO = findOutputVar(varList)
            if (outVO !== null && (varList.length > 1)) {
                // Retrieve the last written object
                var lastVO = varList.get(varList.length - 1)
                if(lastVO.getName.contains("_out") && (varList.length > 1)) {
                    lastVO = varList.get(varList.length - 2)
                }
                // Copy the location annotations
                if (outVO.annotations.length < 2) {
                    outVO.annotations += createStringAnnotation("Offset", lastVO.getStringAnnotationValue("Offset"))
                    outVO.annotations += createStringAnnotation("Length", lastVO.getStringAnnotationValue("Length"))
                }
                // Create the assignment
                dRegion.equations += createAssignment(outVO, lastVO.reference)
                
            }
        }
    }
    
    // Find the output valued object in the ssa list
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