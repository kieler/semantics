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

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import de.cau.cs.kieler.c.sccharts.extensions.ExpressionConverterExtensionsStruct
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions
import de.cau.cs.kieler.c.sccharts.extensions.SMExtractorExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import org.eclipse.cdt.core.dom.ast.IASTDeclarationStatement
import org.eclipse.cdt.core.dom.ast.IASTDeclarator
import org.eclipse.cdt.core.dom.ast.IASTDefaultStatement
import org.eclipse.cdt.core.dom.ast.IASTDoStatement
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTForStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTStandardFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTWhileStatement
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression.*

/**
 * @author lewe, nre
 *
 */
class StructflowExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsSerializeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension HighlightingExtensions
    @Inject extension ExpressionConverterExtensionsStruct
    @Inject extension CDTConvertExtensions
    @Inject extension SMExtractorExtensions
    
    public static val LOCAL_PREFIX = "local:"
    
    var State baseState
    var String structName
    /** The AST node for all function definitions */
    var functionDefinitions = <String, IASTFunctionDefinition> newHashMap
    /** The SCCharts state for all functions */
    var functionStates = <String, State> newHashMap
    var functionInputElements = <String, HashSet<String>> newHashMap
    var functionOutputElements = <String, HashSet<String>> newHashMap
    /** Flag for each function name if it has already been built. */
    val functionBuild = <String, Boolean> newHashMap
    val valuedObjects = <State, HashMap<String, ArrayList<ValuedObject>>> newHashMap
    
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
        val scc = createSCChart
        baseState = createState
        scc.rootStates += baseState
        
        // Find the marked comment        
        val comments = ast.getComments
        val idx = comments.getIdxOfComment("//_EXTRACTOR_FUNCTION")
        if (idx < 0) {
            baseState.name = "No function marked for Extraction!\nPlace the comment \"//_EXTRACTOR_FUNCTION\" above the function to extract"
            baseState.label = baseState.name
            return scc    
        }
        val exComment = comments.get(idx)
        val mFunc = getCommentFollowingNode(ast, exComment) as IASTFunctionDefinition   
        
        // Retrieve the name of the marked function
        val funcName = mFunc.getDeclarator.getName.toString
        baseState.name = funcName
        baseState.label = funcName
        baseState.insertHighlightAnnotations(mFunc)
        functionStates.put(funcName, baseState)
        
        // Retrieve the name of the central struct
        val structParam = (mFunc.getDeclarator as IASTStandardFunctionDeclarator).getParameters.get(0) 
        structName = structParam.getDeclarator.getName.toString
        
        // Retrieve all structflow functions
        findFunctions(ast)
        
        // Set the in and outputs of the core function
        // and the outputs include the return value of the main extracted function as well.
        mFunc.findFuncInputs(baseState)
        setStateInputs()
        mFunc.findFuncOutputs(baseState)
        setStateOutputs()
        
        // Add all structflow function to the sccharts
        for (funcState : functionStates.values) {
            scc.rootStates += funcState
        }
        
        // Translate the function body
        buildStructFlowForFunction(funcName)
        return scc
        
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
                    
                    // Create the output if the function has a return type
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
                        valuedObjects.put(funcState, stateVariables)
                         
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
                    buildStatement(stmt, funcState, dRegion)
                }
                funcState.linkOutputs(dRegion)
            }
        }
        dRegion
    }
    
    def void buildStatement(IASTNode stmt, State funcState, DataflowRegion dRegion) {
        switch stmt {
            // Create a declaration of a local variable and attach it to the dataflow region.
            IASTDeclarationStatement: {
                val declaration = stmt.declaration
                if (declaration instanceof IASTSimpleDeclaration) {
                    val decl = addDeclaration(declaration, funcState, dRegion)
                    dRegion.declarations += decl
                    decl.annotations += createTagAnnotation("Hide")
                }
            }
            // Translate an expression
            IASTExpressionStatement: {
                val expr = stmt.getExpression
                
                switch expr {
                    // Reference the function state for a function call for a struct flow function
                    IASTFunctionCallExpression: {
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
                                    val funcCallInputVO = valuedObjects.get(funcCallState).get(funcCallInput).get(0)
                                    val inputVO = funcState.findValuedObjectByName(funcCallInput, false, dRegion)
                                        
                                    dRegion.equations += createAssignment(funcCallVO, funcCallInputVO, inputVO.reference)
                                }
                                
                                // Connect the outputs    
                                for (funcCallOutput : funcCallOutputs) {
                                    val funcCallOutputVOList = valuedObjects.get(funcCallState).get(funcCallOutput)
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
                    }
                    // Translate a binary expression
                    IASTBinaryExpression: {
                        // Find the in- and output elements
                        val exprOutputElements = findOutputElements(expr, funcState)
                        val op2OutputElements = findOutputElements(expr.getOperand2, funcState)
                        // Check if the expression writes to a struct element
                        if ((exprOutputElements.length > op2OutputElements.length)) {
                            // Retrieve the element that is written to
                            val targetNames = Sets.difference(exprOutputElements, op2OutputElements)
                            if (targetNames.length == 1) {
                                // Create the assignment    
                                val sourceExpr = createKExpression(expr.getOperand2, funcState, dRegion) 
                                val targetVO = funcState.findValuedObjectByName(targetNames.get(0), true, dRegion)
                                dRegion.equations += createAssignment(targetVO, sourceExpr)
                                targetVO.insertHighlightAnnotations(expr)
                            }
                        }
                    }
                    IASTUnaryExpression: {
                        // TODO: Does not work yet. Somehow breaks something in the equation synthesis.
//                        // Create the expression
//                        val sourceExpression = createKExpression(expr, funcState, dRegion)
//                        // Retrieve the respective variable VO                
//                        val opName = (expr.getOperand as IASTIdExpression).getName.toString
//                        val opVO = funcState.findValuedObjectByName(opName, true, dRegion)
//                                
//                        opVO.insertHighlightAnnotations(expr) 
//                        // Create the Assignment        
//                        dRegion.equations += createAssignment(opVO, sourceExpression)
                    }
                }
            }
        }
        // Build the controlflow Statements if wanted
        // TODO: I think this else case is broken if buildCOntrolStatements is false, as it then will also be executed
        // for all cases of the switch above.
        if (buildControlStatements) {
            switch stmt {
                IASTForStatement: {
                    buildForStatement(stmt, funcState, dRegion)              
                }
                IASTWhileStatement: {
                    buildWhileStatement(stmt, funcState, dRegion) 
                }
                IASTDoStatement: {
                    buildDoStatement(stmt, funcState, dRegion)   
                }
                IASTIfStatement: {
                    buildIfStatement(stmt, funcState, dRegion)
                }
                IASTSwitchStatement: {
                    buildSwitchStatement(stmt, funcState, dRegion)
                }
            }
        } else {
            for (child : stmt.children) {
                buildStatement(child, funcState, dRegion)
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
            buildStatement(bStmt, forState, forDRegion)
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
            buildStatement(bStmt, wState, wDRegion)
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
           buildStatement(bStmt, doState, doDRegion)
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
        val initState = ifCRegion.createState("")
        initState.initial = true
        ifState.insertHighlightAnnotations(stmt)
        
        // Create the Then state      
        val thenState = ifCRegion.createState("Then")
        val thenDRegion = createDataflowRegion("")
        thenState.regions += thenDRegion
        // Create the then transition
        val thenTransition = initState.createImmediateTransitionTo(thenState)
        thenTransition.trigger = stmt.getConditionExpression.createKExpression(ifState, thenDRegion)
        // Translate the then branch            
        val thenBody = stmt.getThenClause
        thenState.insertHighlightAnnotations(thenBody)
        thenDRegion.insertHighlightAnnotations(thenBody)
        for (tStmt : thenBody.children) {
            buildStatement(tStmt, ifState, thenDRegion)
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
            initState.createImmediateTransitionTo(elseState)
            
            // Translate the else branch           
            for (eStmt : elseBody.children) {
               buildStatement(eStmt, ifState, elseDRegion)
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
        val controller = stmt.getControllerExpression.createKExpression(swState, dRegion)
        cRegion.label = "switch (" + controller.serialize + ")"       
        
        // Create the initial state
        val initState = cRegion.createState("")
        initState.insertHighlightAnnotations(stmt.getBody)
        initState.initial = true
        
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
                    noBreakCase.createImmediateTransitionTo(activeCase)
                    noBreakCase = null
                }
                
                // Create a triggered transition for a case state 
                if (child instanceof IASTCaseStatement) {
                    val caseTransition = initState.createImmediateTransitionTo(activeCase)
                    caseTransition.trigger = child.getExpression.createKExpression(swState, dRegion)                    
                    activeCase.label = controller.serialize + " == " + caseTransition.trigger.serialize
                // Create a transition without a trigger for a default statement    
                } else {
                    initState.createImmediateTransitionTo(activeCase)                  
                    activeCase.label = "default"
                }
            // Create a transition to the final state for break statements    
            } else if (child instanceof IASTBreakStatement) {
                linkOutputs(swState, activeDRegion)
                activeCase = null
            // Translate other statements into the currently active dataflow region    
            } else {
                buildStatement(child, swState, activeDRegion)
            }
            
        }
        linkOutputs(swState, activeDRegion)
    }
    
    // Create a variable declaration
    def VariableDeclaration addDeclaration(IASTSimpleDeclaration declaration, State state, DataflowRegion dRegion) {
        
        // Create the declaration with the cdt type
        val res = createVariableDeclaration
        if (declaration.declSpecifier instanceof IASTSimpleDeclSpecifier) {
            res.type = (declaration.getDeclSpecifier as IASTSimpleDeclSpecifier).type.CDTTypeConversion
        } else {
            println("non-simple variable declaration type. Not setting the SCCharts Variable type.")
        }
        res.insertHighlightAnnotations(declaration)
        
        // Retrieve the state's variable map
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(valuedObjects.containsKey(state)) {
            stateVariables = valuedObjects.get(state)    
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            valuedObjects.put(state, stateVariables)
        }
        
        // Create a valued object for each declared variable 
        val declarators = declaration.getDeclarators
        for(decl : declarators) {
            // Retrieve the variables name
            var varName = decl.getName.toString
            // Create a SSA list for the variable
            var varList = <ValuedObject> newArrayList
            
            // Create the valued object
            val vo = res.createValuedObject(varName + "_0")
            vo.label = varName
            vo.insertHighlightAnnotations(decl)
            
            // Add the valued object and the ssa list to the respective elements    
            varList.add(vo)
            stateVariables.put(varName, varList)
            
            // Add the initialization assignment is needed
            if(decl.getInitializer !== null) {
                vo.initializeValuedObject(decl, state, dRegion)
            }
        }
        return res
    }
    
    // Add an initialization assignment to the given valued object
    def initializeValuedObject(ValuedObject vo, IASTDeclarator decl, State state, DataflowRegion dRegion) {
        val initializer = decl.getInitializer
        if (initializer instanceof IASTEqualsInitializer) {
            // If the init expression is not a function call translate the expression
            if(!(initializer.children.head instanceof IASTFunctionCallExpression)) {                        
                val initExpr = createKExpression(initializer.children.head, state, dRegion)
                dRegion.equations += createAssignment(vo, initExpr)
                
            } else {
                // Retrieve the name of the called function
                val funcInit = initializer.children.head as IASTFunctionCallExpression
                val funcName = (funcInit.getFunctionNameExpression as IASTIdExpression).getName.toString
                val funcState = findFunctionState(funcName)
                if (funcState === null) {
                    return
                }
                
                // Reference the function state         
                val refDecl = createReferenceDeclaration
                state.declarations += refDecl
                refDecl.setReference(funcState)                        
                val refObj = refDecl.createValuedObject(funcName)
                refObj.insertHighlightAnnotations(funcInit)
                
                // Connect the function argument expressions        
                var i = 0
                for (argument : funcInit.getArguments) {
                    val funcObjArg = funcState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten.get(i)
                    val connectExpr = argument.createKExpression(state, dRegion)
                    var ass = createAssignment(refObj, funcObjArg, connectExpr)
                    dRegion.equations += ass
                    i++
                }
                
                // Create the assignment to the given valued object        
                val outputSource = funcState.findOutputVar("res")
                val outputExpr = refObj.reference => [
                    subReference = outputSource.reference
                ]
                dRegion.equations += createAssignment(vo, outputExpr)
                        
            }
        }
    }

    // Find the state for the given function name
    def State findFunctionState(String funcName) {
        functionStates.get(funcName)
    }
    
    // Link the in and outputs of a control statement state
    def controlStmtSetInOutputs(IASTNode stmt, State csState, ValuedObject csObj, State funcState, DataflowRegion dRegion) {
        // Find the in- and outputs
        var inputs = findInputElements(stmt, csState)
        var outputs = findOutputElements(stmt, csState)
        
        // Create the state variable map
        val stateVariables = <String, ArrayList<ValuedObject>> newHashMap
        valuedObjects.put(csState, stateVariables)
        
        for (input : inputs) {
            // Create the input
            val decl = createVariableDeclaration
            decl.input = true
            csState.declarations += decl
            val inputVO = decl.createValuedObject(input + "_in")
            inputVO.label = input
            
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
                    val funcCallInputVO = valuedObjects.get(funcCallState).get(funcCallInput).get(0)
                    val inputVO = funcState.findValuedObjectByName(funcCallInput, false, dRegion)
                    dRegion.equations += createAssignment(funcCallVO, funcCallInputVO, inputVO.reference)
                }
                
                // Connect the function outputs   
                if (funcCallOutputs !== null) {         
                    for (funcCallOutput : funcCallOutputs) {
                        val funcCallOutputVOList = valuedObjects.get(funcCallState).get(funcCallOutput)
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
    
    def void printASTHead(IASTNode node, String prefix) {
        println(prefix + node.toString)
        for (child : node.children) {
            if (!(child instanceof IASTCompoundStatement)) {
                printASTHead(child, prefix + "  ")
            }
        }
    }
    
    // Find all used elements of the given function definition
    def HashSet<String> findFuncInputs(IASTFunctionDefinition funcDef, State parentState) {
        var res = <String> newHashSet
        
        val funcName = funcDef.getDeclarator.getName.toString    
        res = findInputElements(funcDef.getBody, parentState)
        
        functionInputElements.put(funcName, res)
            
        res
    }
    
    // TODO: maybe rename all struct inputs to structname->member instead of just member
    /** Find all elements read in the given node */
    def HashSet<String> findInputElements(IASTNode stmt, State parentState) {
        var inputs = <String> newHashSet
        
        switch stmt {
            // Add a found non local variable use
            IASTIdExpression: {
                val varName = stmt.getName.toString
                // TODO: seems like only non-local varibales should be used. How to find that out?
//                if (VOs.get(parentState).containsKey(varName)) {
                    // TODO: use a local prefix.
                    inputs += /*LOCAL_PREFIX +*/ varName 
//                }
            }
            // Add a found struct element
            IASTFieldReference: {
                val structExpr = stmt.getFieldOwner
                if (structExpr instanceof IASTIdExpression) {
                    if (structExpr.getName.toString.equals(structName)) {
                        inputs += stmt.getFieldName.toString
                    }
                } else if (structExpr instanceof IASTFieldReference) {
                    inputs = findInputElements(structExpr, parentState)
                }
            }
            // Test if the array is a struct element
            IASTArraySubscriptExpression: {
                val array = stmt.getArrayExpression
                if (array instanceof IASTFieldReference) {
                    val structExpr = array.getFieldOwner
                    if (structExpr instanceof IASTIdExpression) {
                        if (structExpr.getName.toString.equals(structName)) {
                            inputs += array.getFieldName.toString
                        }
                    }
                }
            }
            // If the node is a BianryExpression exclude targets of an assignment
            IASTBinaryExpression: {
                if (stmt.operator >= IASTBinaryExpression.op_assign
                    && stmt.operator <= IASTBinaryExpression.op_binaryOrAssign) {
                    val op1 = stmt.operand1
                    if (op1 instanceof IASTArraySubscriptExpression) {
                        inputs += findInputElements(op1.getArgument, parentState)
                    }                    
                    inputs += findInputElements(stmt.getOperand2, parentState)
                } else {
                    inputs = findInputElements(stmt.getOperand1, parentState)
                    inputs += findInputElements(stmt.getOperand2, parentState)
                }
            }
            // Include all inputs of a found function call
            IASTFunctionCallExpression: {
                var String funcName
                if (stmt.getFunctionNameExpression instanceof IASTIdExpression) {
                    funcName = (stmt.getFunctionNameExpression as IASTIdExpression).getName.toString
                
                } else {
                    // nre: Apparently, this case has not been implemented yet. TODO
                    println("Unimplemented func call type")
                    println("containingFile: " + stmt.getContainingFilename)
                    println("location Offset: " + stmt.getNodeLocations.get(0).getNodeOffset)
                    println("FunctionName: " + stmt.FUNCTION_NAME)
                    printASTHead(stmt, "")
                    /*var IASTExpression nameExpression = stmt.getFunctionNameExpression
                    while (!(nameExpression instanceof IASTIdExpression)) {
                        nameExpression = (nameExpression as IASTUnaryExpression).getOperand
                    }
                    funcName = (nameExpression as IASTIdExpression).getName.toString*/
//                    funcName = "Weird Func Call!"
                }
                if (functionInputElements.containsKey(funcName)) {
                    inputs = functionInputElements.get(funcName)
                } else {
                    if (functionDefinitions.containsKey(funcName)) {
                        inputs = findFuncInputs(functionDefinitions.get(funcName), parentState)
                    }
                }
                // TODO: which of these is needed?
//                for (argument : stmt.arguments) {
//                    inputs += findInputElements(argument, parentState)
//                }
                
                for (child : stmt.children) {
                    inputs += findInputElements(child, parentState)
                }
            }
            // Test all children of any other kind of node    
            default: {
                for (child : stmt.children) {
                    inputs += findInputElements(child, parentState)
                }
            }
        }
            
        return inputs
    }
    
    // Create the inputs of all structflow functions
    def void setStateInputs() {
        val functionsWithInputs = functionInputElements.keySet
        for (func : functionsWithInputs) {
            // Retrieve the input list of the function
            val inputs = functionInputElements.get(func)
            if (inputs.empty) {
                return
            }
            // Retrieve the corresponding state
            val funcState = functionStates.get(func)
            // Set up the state valued object map
            var stateVars = <String, ArrayList<ValuedObject>> newHashMap
            if (valuedObjects.containsKey(funcState)) {
                stateVars = valuedObjects.get(funcState)
            } else {
                valuedObjects.put(funcState, stateVars)    
            }
            
            // Create an input declaration    
            val decl = createVariableDeclaration
            decl.input = true
            funcState.declarations += decl
            
            // Create a valued object for each input    
            for (input : inputs) {
                val varList = <ValuedObject> newArrayList
                
                val vo = decl.createValuedObject(input + "_in")
                vo.label = input
                varList.add(vo)
                stateVars.put(input, varList)
            }
            
        }
    }
    
    // Connect the Inputs of the given control statement to their respective valued objects of the containing state
    def void setInputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        // Find the needed inputs of teh given control statement
        var inputs = findInputElements(stmt, rootState)
        
        // Retrieve the state's valued object map
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(valuedObjects.containsKey(newState)) {
            stateVariables = valuedObjects.get(newState)
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            valuedObjects.put(newState, stateVariables)
        }
        
        for (input : inputs) {
            // Retrieve the respective valued object of the containing state 
            var inputVO = rootState.findValuedObjectByName(input, false, dRegion)
            if (inputVO === null) {
                inputVO = baseState.findValuedObjectByName(input, false, dRegion)
            }
            val inputRootDecl = inputVO.getVariableDeclaration
            val inputType = inputRootDecl.getType
            
            // Create the input for the control statement state
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = inputType
            decl.input = true            
            val innerInputVO = decl.createValuedObject(input + "_in")
            innerInputVO.label = input
            innerInputVO.insertHighlightAnnotations(stmt)
            
            // Add the new create valued object to the ssa list and valued object list
            if(stateVariables.containsKey(input)) {
                var varList = stateVariables.get(input)
                varList.add(innerInputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerInputVO)
                stateVariables.put(input, varList)
            }
            
            // Create the assignment    
            dRegion.equations += createAssignment(refObj, innerInputVO, inputVO.reference)
        }
    }
    
    // Find all elements written inside the given function
    def HashSet<String> findFuncOutputs(IASTFunctionDefinition funcDef, State parentState) {
        var res = <String> newHashSet
        
        val funcName = funcDef.getDeclarator.getName.toString    
        res = findOutputElements(funcDef.getBody, parentState)
        
        functionOutputElements.put(funcName, res)
            
        res
    }
    
    // Find all elements written inside the given node
    def HashSet<String> findOutputElements(IASTNode stmt, State parentState) {
        var outputs = <String> newHashSet
        
        switch stmt {
            // Include every target of an assignment
            IASTBinaryExpression: {
                if ((stmt.operator >= IASTBinaryExpression.op_assign) && (stmt.operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                    val op1 = stmt.getOperand1
                    switch op1 {
                        // non-local variables
                        IASTIdExpression: {
                            val varName = op1.getName.toString
                            // TODO: seems like only non-local varibales should be used. How to find that out?
//                            if (VOs.get(parentState).containsKey(varName)) {
                                outputs += varName
//                            }
                        }
                        // Include struct elements
                        IASTFieldReference: {
                            val structExpr = op1.getFieldOwner
                            if (structExpr instanceof IASTIdExpression) {
                                if (structExpr.getName.toString.equals(structName)) {
                                    outputs += op1.getFieldName.toString
                                }
                            } else if (structExpr instanceof IASTFieldReference) {
                                outputs = findOutputElements(structExpr, parentState)
                            }
                        }
                        // Test if the array is a struct element     
                        IASTArraySubscriptExpression: {
                            val array = op1.getArrayExpression
                                if (array instanceof IASTFieldReference) {
                                val structExpr = array.getFieldOwner
                                if (structExpr instanceof IASTIdExpression) {
                                    if (structExpr.getName.toString.equals(structName)) {
                                        outputs += array.getFieldName.toString
                                    }
                                } else if (structExpr instanceof IASTFieldReference) {
                                    outputs = findOutputElements(structExpr, parentState)
                                }
                            }
                        }
                    }
                }
            }
            // Include all elements written in the called function
            IASTFunctionCallExpression: {
                var String funcName
                if (stmt.getFunctionNameExpression instanceof IASTIdExpression) {
                    funcName = (stmt.getFunctionNameExpression as IASTIdExpression).getName.toString
                
                } else {
                    val nameExpression = stmt.getFunctionNameExpression as IASTUnaryExpression
                    funcName = (nameExpression.getOperand as IASTIdExpression).getName.toString
                }
                if (functionOutputElements.containsKey(funcName)) {
                    outputs = functionOutputElements.get(funcName)
                } else {
                    if (functionDefinitions.containsKey(funcName)) {
                        outputs = findFuncOutputs(functionDefinitions.get(funcName), parentState)
                    }
                }
            }
            // Test every child of the given node
            default: {
                for (child : stmt.children) {
                    outputs += findOutputElements(child, parentState)
                }
            }
        }
            
        return outputs
    }
    
    // Create the outputs for every structflow function
    def void setStateOutputs() {
        val functionsWithOutputs = functionOutputElements.keySet
        for (func : functionsWithOutputs) {
            // Retrieve the functions outputs
            val outputs = functionOutputElements.get(func)
            if (outputs.empty) {
                return
            }
            val funcState = functionStates.get(func)
            // Retrieve the state's valued object map
            var stateVars = <String, ArrayList<ValuedObject>> newHashMap
            if (valuedObjects.containsKey(funcState)) {
                stateVars = valuedObjects.get(funcState)
            } else {
                valuedObjects.put(funcState, stateVars)
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
                vo.label = output
                varList.add(vo)                
            }
        }
    }
    
    // Find the needed valued object of a state representing the named variable   
    def ValuedObject findValuedObjectByName(State state, String name, boolean writing, Region dRegion) {
        var ValuedObject res
        // Retrieve the last VO from the ssa lsit
        val varList = valuedObjects.get(state).get(name)
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
        var stateVariables = valuedObjects.get(state)
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
    
    // Find the output valued object for the given variable name and the given state
    def ValuedObject findOutputVar(State state, String varName) {
        var ValuedObject res = null
        
        var varList = valuedObjects.get(state).get(varName)
        res = varList.findOutputVar
        
        res
    }
    
    // Create a state representation for a call of a not known function
    def State createUnknownFuncState(String funcName, IASTFunctionCallExpression funcCall, boolean writing) {
        // Create the state
        val state = createState(funcName)
        state.label = funcName
        
        // Create an output if needed
        if (writing) {
            val outputDecl = createVariableDeclaration
            outputDecl.output = true
            state.declarations += outputDecl
            val outputVO = outputDecl.createValuedObject("res_out") 
        }
        
        // Create an input for each argument
        for (argument : funcCall.getArguments) {
            val inputDecl = createVariableDeclaration
            inputDecl.input = true
            state.declarations += inputDecl
            val inputVO = inputDecl.createValuedObject("")
        }
        state
    }
  
}