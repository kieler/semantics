/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015,2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.c.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions
import de.cau.cs.kieler.c.sccharts.extensions.ValueExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import org.eclipse.cdt.core.dom.ast.IASTArrayDeclarator
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTCastExpression
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import org.eclipse.cdt.core.dom.ast.IASTConditionalExpression
import org.eclipse.cdt.core.dom.ast.IASTDeclarationStatement
import org.eclipse.cdt.core.dom.ast.IASTDeclarator
import org.eclipse.cdt.core.dom.ast.IASTDefaultStatement
import org.eclipse.cdt.core.dom.ast.IASTDoStatement
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTForStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import org.eclipse.cdt.core.dom.ast.IASTInitializerList
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle
import org.eclipse.cdt.core.dom.ast.IASTReturnStatement
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTStandardFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression
import org.eclipse.cdt.core.dom.ast.IASTWhileStatement
import org.eclipse.cdt.internal.core.dom.parser.ASTNode
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.c.sccharts.processors.CDTToStringConverter.*

/**
 * @author lan, nre
 * 
 */

@SuppressWarnings("all","unchecked")
class DataflowExtractor extends ExogenousProcessor<IASTTranslationUnit, SCCharts> {

    @Inject extension AnnotationsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension HighlightingExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension ValueExtensions
    
    /**
     * The name of the valued objects for returns.
     * Starts with a whitespace prefix so that it is not possible to clash with real variable names.
     */
    static final String returnObjectName = " res"
    
    /** Shown name prefix for if statements. */
    static final String ifName = "if"
    /** Shown name prefix for then statements. */
    static final String thenName = "then"
    /** Shown name prefix for else statements. */
    static final String elseName = "else"
    /** Shown name prefix for do..while statements. */
    static final String doName = "do"
    /** Shown name prefix for for statements. */
    static final String forName = "for"
    /** Shown name prefix for while statements. */
    static final String whileName = "while"
    
    var functions = <String, State> newHashMap
    var ifCounter = 0;
    var swCounter = 0;
    var forCounter = 0;
    var whileCounter = 0;
    var doCounter = 0;
    
    val valuedObjects = <State, HashMap<String, ArrayList<ValuedObject>>> newHashMap
    
    val voWrittenIdxs = <ValuedObject, List<Expression>> newHashMap

    /** The file contents, for referencing direct String representations. */
    var byte[] sourceFile

    override String getId() {
        return "de.cau.cs.kieler.c.sccharts.dataflowExtractor"
    }
    
    override String getName() {
        return "Dataflow Extractor"
    }
    
    override void process() {
        val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
        var now = LocalDateTime.now
        
        println("Starting Dataflow Extractor - Time: " + dtf.format(now))
        val tUnit = getModel
        // Remember the file contents as well for direct string representations in the diagram.
        if (tUnit instanceof ASTNode) {
            val String filePath = tUnit.filePath
            if (filePath !== null) {
                sourceFile = Files.readAllBytes(Paths.get(filePath))
            }
        }
        
        val model = tUnit.transform as SCCharts
         
        now = LocalDateTime.now
        println("Dataflow Extractor finished - Time: " + dtf.format(now))
        
        setModel(model)
    }    

    def EObject transform(IASTTranslationUnit ast) {
        
        if(ast === null) {
            return null
        }
        
        // Create SCCharts root elements
        val scChart = createSCChart
        
        // Start extraction for each defined function
        for(child : ast.children) {
            
            if(child instanceof IASTFunctionDefinition) {
                val state = buildFunction(child)
                functions.put(state.label, state)
                scChart.rootStates += state
            } 
             
        }
        
        return scChart
        
    }


    /**
     * The function used to create the state representing a function
     */
    def State buildFunction(IASTFunctionDefinition func) {
        // Determine function name
        val funcDeclarator = func.getDeclarator
        val funcName = funcDeclarator.getName.toString
        
        // Create the state
        val State state = createState(funcName)
        state.label = funcName
        
        // Insert text highlighting annotations
        state.insertHighlightAnnotations(func)
        
        // Create a hashmap for the functions valued objects if needed
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(valuedObjects.containsKey(state)) {
            stateVariables = valuedObjects.get(state)
        } else {
            stateVariables = <String,ArrayList<ValuedObject>> newHashMap
            valuedObjects.put(state, stateVariables)    
        }
    
        // Create inputs for the functions parameters
        if (funcDeclarator instanceof IASTStandardFunctionDeclarator) {
            val parameters = funcDeclarator.getParameters
            val Map<ValueType, VariableDeclaration> declarations = newHashMap
            for (par : parameters) {
                
                
                val declSpecifier = par.getDeclSpecifier
                if (declSpecifier instanceof IASTSimpleDeclSpecifier) {
                    // Determine parameter type
                    val inputType = declSpecifier.type.cdtTypeConversion
                    if (!declarations.containsKey(inputType)) {
                        val newDecl = createVariableDeclaration
                        state.declarations += newDecl
                        newDecl.type = inputType
                        newDecl.input = true       
                        declarations.put(inputType, newDecl)
                    }
                    val decl = declarations.get(inputType)
                    // Determine parameter name
                    val varName = par.getDeclarator.getName.toString
                    var varList = <ValuedObject> newArrayList
                    
                    // Create valued object for the input
                    val VO = decl.createValuedObject(varName + "_in")
                    VO.label = varName
                    VO.insertHighlightAnnotations(par)
                    
                    // Attach the valued object to its list and the list to the map
                    varList.add(VO)
                    stateVariables.put(varName, varList)
                }
            }
        }
        
        // Determine function output
        val declSpecifier = func.getDeclSpecifier
        if (declSpecifier instanceof IASTSimpleDeclSpecifier) {
            val type = (declSpecifier as IASTSimpleDeclSpecifier).type.cdtTypeConversion
            if (type !== null) {
                // Determine output type
                val retDecl = createVariableDeclaration
                retDecl.type = type
                retDecl.output = true  
                state.declarations += retDecl
                
                // Set output name
                var varName = returnObjectName
                var varList = <ValuedObject> newArrayList
                
                // Create valued object
                val resVO = retDecl.createValuedObject(varName + "_out")
                resVO.label = varName
                
                // Attach valued object to the listing
                varList.add(resVO)
                stateVariables.put(varName, varList)   
            }
        }
        
        // Translate function body
        val body = func.getBody
        if (body instanceof IASTCompoundStatement) {
            val bodyRegion = buildCompound(body, state)
            state.regions += bodyRegion
            bodyRegion.label = funcName
        } else {
            println("ERROR: Body of " + funcName + " is not a Compound Statement!")
        }
        
        return state
    }
    
    /**
     * Create the dataflow region for a compound statement and extract each containing statement
     */
    def DataflowRegion buildCompound(IASTCompoundStatement body, State bodyState) {
        return buildCompound(body, bodyState, null)
    }
    
    /**
     * Create the dataflow region for a compound statement and extract each containing statement.
     * Additional declarations are added to the DF region as well, without their initializations, if any.
     */
    def DataflowRegion buildCompound(IASTCompoundStatement body, State bodyState, IASTStatement additionalDeclarations) {
        val dfRegion = createDataflowRegion("")
        dfRegion.insertHighlightAnnotations(body)

        // Strip away the initializations of the declaration.   
        var usedDeclarators = additionalDeclarations     
        if (additionalDeclarations instanceof IASTDeclarationStatement) {
            usedDeclarators = additionalDeclarations.copy
            val declaration = (usedDeclarators as IASTDeclarationStatement).declaration
            if (declaration instanceof IASTSimpleDeclaration) {
                declaration.declarators.forEach [ initializer = null ]
            }
        }
        if (usedDeclarators !== null) {
            buildStatement(usedDeclarators, bodyState, dfRegion)
        }
        
        val statements = body.getStatements
        for (stmt : statements) {
            buildStatement(stmt, bodyState, dfRegion)
        }
        linkOutputs(bodyState, dfRegion)
        
        return dfRegion
    }
    
    // Create a declaration of a local variable and attach it to the dataflow region
    def dispatch void buildStatement(IASTDeclarationStatement stmt, State rootState, DataflowRegion dRegion) {
        val declaration = stmt.getDeclaration
        if (declaration instanceof IASTSimpleDeclaration) {
            val decl = addDeclaration(declaration, rootState, dRegion)
            dRegion.declarations += decl
            decl.annotations += createTagAnnotation("Hide")
        }
    }
    
    /**
     * Translate an expression
     */
    def dispatch void buildStatement(IASTExpressionStatement stmt, State rootState, DataflowRegion dRegion) {
        val expression = stmt.getExpression
                
        // Translate binary and unary expressions
        if (expression instanceof IASTBinaryExpression) {
            createBinaryAssignment(expression, rootState, dRegion)
        } else if (expression instanceof IASTUnaryExpression) {
            createUnaryAssignment(expression, rootState, dRegion)
        // Create a function call by referencing the function state    
        } else if (expression instanceof IASTFunctionCallExpression) {
                
            val funcName = (expression.getFunctionNameExpression as IASTIdExpression).getName.toString
            val knownFunction = functions.containsKey(funcName)
            var State funcState 
            if (knownFunction) {
                funcState = functions.get(funcName)
            } else {
                funcState = createUnknownFuncState(funcName, expression, false)
            }
            createFuncCall(expression, rootState, dRegion, funcState, knownFunction)                
        }
    }
    
    /**
     * Translate If statement
     */
    def dispatch void buildStatement(IASTIfStatement stmt, State rootState, DataflowRegion dRegion) {
        buildIf(stmt, rootState, dRegion)
    }
    
    /**
     * Translate Switch statment
     */
    def dispatch void buildStatement(IASTSwitchStatement stmt, State rootState, DataflowRegion dRegion) {
        buildSwitch(stmt, rootState, dRegion)
    }
    
    /**
     * Translate For statement
     */
    def dispatch void buildStatement(IASTForStatement stmt, State rootState, DataflowRegion dRegion) {
        buildFor(stmt, rootState, dRegion)
    }
    
    /**
     * Translate While statement
     */
    def dispatch void buildStatement(IASTWhileStatement stmt, State rootState, DataflowRegion dRegion) {
        buildWhile(stmt, rootState, dRegion)
    }
    
    /**
     * Translate Do statement
     */
    def dispatch void buildStatement(IASTDoStatement stmt, State rootState, DataflowRegion dRegion) {
        buildDo(stmt, rootState, dRegion)
    }
    
    /**
     * Translate Return statement
     */
    def dispatch void buildStatement(IASTReturnStatement stmt, State rootState, DataflowRegion dRegion) {
        val retKExpr = createKExpression(stmt.getReturnValue, rootState, dRegion)
                
        val retVO = rootState.findValuedObjectByName(returnObjectName, true, dRegion)
        retVO.insertHighlightAnnotations(stmt)
        dRegion.equations += createDataflowAssignment(retVO, retKExpr)
    }
    
    /**
     * Translate all children of a CompoundStatement
     */
    def dispatch void buildStatement(IASTCompoundStatement stmt, State rootState, DataflowRegion dRegion) {
        for (child : stmt.getStatements) {
            buildStatement(child, rootState, dRegion)
        }
    }
    
    /**
     * Extract the body of an if Statement
     */
    def void buildIf(IASTIfStatement ifStmt, State rootState, DataflowRegion dRegion) {
        // Creating the state to represent the if statement
        val ifState = createState(ifName + "_" + ifCounter)
        
        // Create a reference for this if state in the containing dataflow-region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject(ifName + "_" + ifCounter)
        ifObj.insertHighlightAnnotations(ifStmt)
        ifCounter++
        
        // Set the in and outputs of the state
        setInputs(ifStmt, rootState, ifState, dRegion, ifObj)
        setOutputs(ifStmt, rootState, ifState, dRegion, ifObj)
        
        // Create the controlflow region for the if state and the initial state
        val cRegion = ifState.createControlflowRegion("")
        val initState = cRegion.createState("")
        initState.insertHighlightAnnotations(ifStmt)
        initState.initial = true
        
        // Create the state for the then part
        val thenStmt = ifStmt.getThenClause
        val State thenState = createStateForStatement(thenStmt, cRegion, ifState, thenName)
        val thenTransition = initState.createImmediateTransitionTo(thenState)
        thenTransition.trigger = (ifStmt.getConditionExpression).createKExpression(ifState, dRegion)
        
        // If an else is given the state is also created
        if (ifStmt.getElseClause !== null) {
            val elseStmt = ifStmt.getElseClause
            val State elseState = createStateForStatement(elseStmt, cRegion, ifState, elseName)
            initState.createImmediateTransitionTo(elseState)
        }
        
    }
    
    /**
     * Creates and returns a new state in the {@code parentRegion} of the {@code parentState} with a {@code name}
     * that contains the dataflow behavior of the {@code statement}.
     */
    private def State createStateForStatement(IASTStatement statement, ControlflowRegion parentRegion, State parentState, String name) {
        val newState = parentRegion.createState(name)
        newState.insertHighlightAnnotations(statement)
        val DataflowRegion thenRegion = createDFRegionForStatement(statement, parentState)
        newState.label = name
        newState.regions += thenRegion
        
        return newState
    }
    
    /**
     * Creates and returns a new dataflow region using the in/outputs of the {@code parentState} for the given
     * {@code statement}.
     */
    private def DataflowRegion createDFRegionForStatement(IASTStatement statement, State parentState) {
        return createDFRegionForStatement(statement, parentState, null)
    }
    
    /**
     * Creates and returns a new dataflow region using the in/outputs of the {@code parentState} for the given
     * {@code statement}. The {@code additionalDeclarations} can be used if this region needs some declariations defined
     * as well that should not be visible from the outside. Used for example for 'for' loop's initializer statement.
     */
    private def DataflowRegion createDFRegionForStatement(IASTStatement statement, State parentState,
        IASTStatement additionalDeclarations) {
        var DataflowRegion newRegion
        if (statement instanceof IASTCompoundStatement) {
            newRegion = buildCompound(statement, parentState, additionalDeclarations)
        } else {
            newRegion = createDataflowRegion("")
            newRegion.insertHighlightAnnotations(statement)
            var usedDeclarators = additionalDeclarations
            
            // From the additional initializers, only their declarations should be used, but no
            // initialization should be added to the region. So strip that initialization away
            // from a copy of the declaration.
            if (additionalDeclarations instanceof IASTDeclarationStatement) {
                usedDeclarators = additionalDeclarations.copy
                val declaration = (usedDeclarators as IASTDeclarationStatement).declaration
                if (declaration instanceof IASTSimpleDeclaration) {
                    declaration.declarators.forEach [ initializer = null ]
                }
            }
            if (usedDeclarators !== null) {
                buildStatement(usedDeclarators, parentState, newRegion)
            }
            buildStatement(statement, parentState, newRegion)
            
            linkOutputs(parentState, newRegion)
        }
        
        return newRegion
    }
    
    /**
     * Extract the body of a switch statement
     */
    def void buildSwitch(IASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        // Create the State representing the switch
        val swState = createState("switch_" + swCounter)
        
        // Create the reference for the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject("switch_" + swCounter)        
        swObj.insertHighlightAnnotations(swStmt)
        swCounter++
        
        // Set the In and Outputs
        setInputs(swStmt, rootState, swState, dRegion, swObj)
        setOutputs(swStmt, rootState, swState, dRegion, swObj)
        
        // Create the controlflow region
        val cRegion = swState.createControlflowRegion("")
        cRegion.insertHighlightAnnotations(swStmt.getBody)
        
        // Create the controller expression label
        swStmt.getControllerExpression.createKExpression(swState, dRegion)
        val controller = exprToString(swStmt.getControllerExpression, sourceFile)
        cRegion.label = "switch (" + controller + ")"       
        
        // Create the initial state
        val initState = cRegion.createState("")
        initState.insertHighlightAnnotations(swStmt.getBody)
        initState.initial = true
        
        // Translate the switch body
        val swBody = swStmt.getBody as IASTCompoundStatement
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
                
                // Create the transition from the previous case state to the new if needed
                if (noBreakCase !== null) {
                    noBreakCase.createImmediateTransitionTo(activeCase)
                    noBreakCase = null
                }
                
                // Create a triggered transition for a case state 
                if (child instanceof IASTCaseStatement) {
                    val caseTransition = initState.createImmediateTransitionTo(activeCase)
                    caseTransition.trigger = child.getExpression.createKExpression(swState, dRegion)                    
                    activeCase.label = controller + " == " + exprToString(child.getExpression, sourceFile)
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
                buildStatement(child as IASTStatement, swState, activeDRegion)
            }
            
        }
        linkOutputs(swState, activeDRegion)
    }
    
    /**
     * Translate a For Statement
     */
    def void buildFor(IASTForStatement forStmt, State rootState, DataflowRegion dRegion) {
        // Create the state
        val forState = createState(forName + "_" + forCounter)
        
        // Reference the state in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject(forName + "_" + forCounter)        
        forObj.insertHighlightAnnotations(forStmt)
        
        // Set the in and outputs
        setInputs(forStmt, rootState, forState, dRegion, forObj)
        setOutputs(forStmt, rootState, forState, dRegion, forObj)
        
        // Set the loop conditions as label
        val condExpr = exprToString(forStmt.getConditionExpression, sourceFile)
        var initExpr = stmtToString(forStmt.getInitializerStatement, sourceFile)
        if (initExpr.endsWith(";")) {
            initExpr = initExpr.substring(0, initExpr.length - 1)
        }
        val itExpr = exprToString(forStmt.getIterationExpression, sourceFile)
        forState.label = "for (" + initExpr + "; " + condExpr + "; " + itExpr + ")"
        forCounter++
        
        // Translate the body
        val forDBodyRegion = createDFRegionForStatement(forStmt.getBody, forState, forStmt.getInitializerStatement) 
        forState.regions += forDBodyRegion
        forDBodyRegion.label = forState.label        
    }
    
    /**
     * Translate a while statement
     */
    def void buildWhile(IASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
        // Create the state        
        val whileState = createState(whileName + "_" + whileCounter)
        
        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject(whileName + "_" + whileCounter)        
        whileObj.insertHighlightAnnotations(whileStmt)
        
        // Set the in and outputs
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)
        
        // Create the condition expression label
        createKExpression(whileStmt.getCondition, whileState, dRegion)
        whileState.label = "while (" + exprToString(whileStmt.getCondition, sourceFile) + ")"
        whileCounter++
        
        // Translate the loop body
        val DataflowRegion whileDBodyRegion = createDFRegionForStatement(whileStmt.getBody, whileState) 
        whileState.regions += whileDBodyRegion
        whileDBodyRegion.label = whileState.label
        
    }
    
    /**
     * Translate a Do statement
     */
    def void buildDo(IASTDoStatement doStmt, State rootState, DataflowRegion dRegion) {
        // Create the state        
        val doState = createState(doName + "_" + doCounter)
        
        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject(doName + "_" + doCounter)        
        doObj.insertHighlightAnnotations(doStmt)
        
        // Set the in and outputs
        setInputs(doStmt, rootState, doState, dRegion, doObj)
        setOutputs(doStmt, rootState, doState, dRegion, doObj)
        
        // Create the condition expression label
        createKExpression(doStmt.getCondition, doState, dRegion)
        doState.label = "do ... while (" + exprToString(doStmt.getCondition, sourceFile) + ")"
        doCounter++
        
        // Translate the body
        val doDBodyRegion = createDFRegionForStatement(doStmt.getBody, doState) 
        doState.regions += doDBodyRegion
        doDBodyRegion.label = doState.label
               
    }
    
    /**
     * Create a variable declaration
     */
    def VariableDeclaration addDeclaration(IASTSimpleDeclaration declaration, State state, DataflowRegion dRegion) {
        
        // Create the declaration with the cdt type
        val variableDeclaration = createVariableDeclaration
        variableDeclaration.type = (declaration.getDeclSpecifier as IASTSimpleDeclSpecifier).type.cdtTypeConversion
        variableDeclaration.insertHighlightAnnotations(declaration)
        
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
            
            //Create the valued object
            val vo = variableDeclaration.createValuedObject(varName + "_0")
            vo.label = varName
            vo.insertHighlightAnnotations(decl)
            if (decl instanceof IASTArrayDeclarator) {
                vo.cardinalities += decl.arrayModifiers.map[it.constantExpression.createKExpression(state, dRegion)]
            }
            
            // Add the valued object and the ssa list to the respective elements    
            varList.add(vo)
            stateVariables.put(varName, varList)
            
            // Add the initialization assignment if needed
            if(decl.getInitializer !== null) {
                vo.initializeValuedObject(decl, state, dRegion)
            }
        }
        return variableDeclaration
    }
    
    /**
     * Add an initialization assignment to the given valued object
     */
    def void initializeValuedObject(ValuedObject vo, IASTDeclarator decl, State state, DataflowRegion dRegion) {
        val initializer = decl.getInitializer
        if (initializer instanceof IASTEqualsInitializer) {
            // If the init expression is not a function call translate the expression
            if(!(initializer.children.head instanceof IASTFunctionCallExpression)) {                        
                val initExpr = createKExpression(initializer.children.head, state, dRegion)
                dRegion.equations += createDataflowAssignment(vo, initExpr)
                
            } else {
                // Retrieve the name of the called function
                val funcInit = initializer.children.head as IASTFunctionCallExpression
                val funcName = (funcInit.getFunctionNameExpression as IASTIdExpression).getName.toString
                val funcState = findFunctionState(funcName)
                
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
                    var ass = createDataflowAssignment(refObj, funcObjArg, connectExpr)
                    dRegion.equations += ass
                    i++
                }
                
                // Create the assignment to the given valued object        
                val outputSource = funcState.findOutputVar(returnObjectName)
                val outputExpr = refObj.reference => [
                    subReference = outputSource.reference
                ]
                dRegion.equations += createDataflowAssignment(vo, outputExpr)
                        
            }
        }
    }
    
    /**
     * Connect the outputs of a control statement state to the respective valued objects of the containing state
     */
    def void setOutputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        // Retrieve the set of outputs of the control statement
        var outputs = findOutputs(stmt, rootState)
        
        // Retrieve the state valued object map
        var HashMap<String, ArrayList<ValuedObject>> stateVariables = null
        if(valuedObjects.containsKey(newState)) {
            stateVariables = valuedObjects.get(newState)
        } else {
            stateVariables = <String, ArrayList<ValuedObject>> newHashMap
            valuedObjects.put(newState, stateVariables)
        }
        
        // Create an output declaration for each found output
        for(output : outputs) {
            // Get the respective valued object of the containing state
            val outputVO = rootState.findValuedObjectByName(output, true, dRegion)
            outputVO.insertHighlightAnnotations(stmt)
            val outputRootDecl = outputVO.getVariableDeclaration
            val outputType = outputRootDecl.getType
            
            // Create a declaration and valued object for the output 
            val decl = createVariableDeclaration
            newState.declarations += decl
            decl.type = outputType
            decl.output = true            
            val innerOutputVO = decl.createValuedObject(output + "_out")
            innerOutputVO.label = output
            innerOutputVO.insertHighlightAnnotations(stmt)
            
            // Add the new create valued object to the ssa list and valued object list
            if(stateVariables.containsKey(output)) {
                var varList = stateVariables.get(output)
                varList.add(innerOutputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerOutputVO)
                stateVariables.put(output, varList)
            }
            
            // Create the assignment
            val target = outputVO
            val source = refObj.reference => [
                subReference = innerOutputVO.reference
            ]            
            dRegion.equations += createDataflowAssignment(target, source)
        }
    }
    
    /**
     * Find the Outputs from the given control statements
     */
    def HashSet<String> findOutputs(IASTNode stmt, State parentState) {
        var outputs = <String> newHashSet
        if (stmt instanceof IASTIdExpression) {
            val varName = stmt.getName.toString 
            if (valuedObjects.get(parentState).containsKey(varName)) outputs += varName 
        // Consider only non local variables that are target of an assignment
        } else if (stmt instanceof IASTBinaryExpression) {
            val operator = stmt.getOperator
            if ((operator >= IASTBinaryExpression.op_assign) && (operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                val op1 = stmt.getOperand1
                if (op1 instanceof IASTIdExpression ||
                    op1 instanceof IASTArraySubscriptExpression) {
                    outputs += findOutputs(op1, parentState)
                }
            }
        // Check every child for other statements    
        } else {
            for (child : stmt.children) {
                outputs += findOutputs(child, parentState)
            }
        }        
        return outputs
    }
    
    /**
     * Connect the Inputs of the given control statement to their respective valued objects of the containing state
     */
    def void setInputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        // Find the needed inputs of the given control statement
        var inputs = findInputs(stmt, rootState)
        
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
            dRegion.equations += createDataflowAssignment(refObj, innerInputVO, inputVO.reference)
        }
    }
    
    /**
     * Find the Inputs needed for the given control statement
     */
    def HashSet<String> findInputs(IASTNode stmt, State parentState) {
        var inputs = <String> newHashSet
        // Add a found non local variable use
        if(stmt instanceof IASTIdExpression) {
            val varName = stmt.getName.toString
            if (valuedObjects.get(parentState).containsKey(varName)) inputs += varName
        // Add a found non local array variable use.
        } else if (stmt instanceof IASTArraySubscriptExpression) {
            inputs += findInputs(stmt.arrayExpression, parentState)
        // Consider only variables that are not target of an assignment    
        } else if (stmt instanceof IASTBinaryExpression) {
            val operator = stmt.getOperator
            if ((operator >= IASTBinaryExpression.op_assign) && (operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                inputs = findInputs(stmt.getOperand2, parentState)
                // If operand1 is an array, we consider it to be "read" as well.
                if (stmt.operand1 instanceof IASTArraySubscriptExpression) {
                    inputs += findInputs(stmt.getOperand1, parentState)
                }
            } else {
                inputs = findInputs(stmt.getOperand1, parentState)
                inputs += findInputs(stmt.getOperand2, parentState)
            }
        // Consider only arguments of a function call    
        } else if (stmt instanceof IASTFunctionCallExpression) {
            val arguments = stmt.getArguments
            for (argument : arguments) {
                inputs += findInputs(argument, parentState)
            }  
        // Test all children of other statements    
        } else {
            for (child : stmt.children) {
                inputs += findInputs(child, parentState)
            }
        }
        return inputs
    }

    /**
     * Find the state for the given function name
     */
    def State findFunctionState(String funcName) {
        return functions.get(funcName)
    }
    
    /**
     * Find the valued object of the given state by its variables name and creates a new valued object if needed
     */
    def ValuedObject findValuedObjectByName(State state, String name, Expression index, boolean writing, Region dRegion) {
        // Retrieve the last valued object of the variables list
        var ValuedObject vo
        val varList = valuedObjects.get(state).get(name)
        vo = varList.get(varList.length - 1)
        var varName = vo.getName()
        
        // If the last object is the "_out" object the preceding valued object has to be used
        var onlyOut = false
        var hasOut = false
        if ((varName.contains("_out")) && (varName.lastIndexOf("_out") == (varName.length - 4))) {
            hasOut = true
            if (varList.length > 1) {
                vo = varList.get(varList.length - 2)
                varName = vo.getName()
                
            // If the list only contains the "_out" valued object, a preceding one has to be created  
            } else {
                val OffsetAnno = vo.getAnnotations("Offset")
                val LengthAnno = vo.getAnnotations("Length")
                onlyOut = true
                var varDecl = vo.getVariableDeclaration
                varName = varName.substring(0, varName.length - 3) + "0"
                val type = varDecl.type
                
                // If the original variable declaration was attached to the state the new one should be attached to the dataflow region
                if (!dRegion.declarations.contains(varDecl)) {
                    varDecl = createVariableDeclaration
                    varDecl.annotations += createTagAnnotation("Hide")
                    varDecl.type = type
                    dRegion.declarations += varDecl
                }
                
                // Create the valued object and add it to the variable list, before the "_out" object
                vo = varDecl.createValuedObject(varName)
                if (OffsetAnno.length > 0) vo.annotations += OffsetAnno.head
                if (LengthAnno.length > 0) vo.annotations += LengthAnno.head                
                varList.add(0, vo) 
            }
        } 
        
        // For Arrays only create a new VO if is written to for a first time or after a read, or if the specific index
        // has been written to before to still preserve SSA (at least for constant expressions), but connect what
        // belongs together.
        val boolean isArray = index !== null
        var boolean newArrayVONeeded = false
        if (isArray) {
            var alreadyWrittenIdxs = voWrittenIdxs.get(vo)
            
            if (writing) {
                if (alreadyWrittenIdxs === null || alreadyWrittenIdxs.empty) {
                    // A first write to an array needs a new VO.
                    alreadyWrittenIdxs = newArrayList
                    voWrittenIdxs.put(vo, alreadyWrittenIdxs)
                    newArrayVONeeded = true
                } else if (alreadyWrittenIdxs.exists[ it.expressionEquals(index) ]) {
                    // Any subsequent write to that array only needs a new VO if it is on a different array index.
                    newArrayVONeeded = true
                } else {
                    alreadyWrittenIdxs.add(index)
                }
            } else if (alreadyWrittenIdxs !== null) {
                // If this is a read to an array that has been written to before, clear the alreadyWrittenIdxs, so that
                // a new VO will be created on the next write to it.
                alreadyWrittenIdxs.clear
            }
        }
        
        
        // If the valued object is meant to be written to, a new one has to be created to preserve the SSA-form
        if (writing && !onlyOut && /* isArray => newArrayVONeeded */(!isArray || newArrayVONeeded)) {
            var varDecl = vo.getVariableDeclaration
            var newName = ""
            
            // Create the right valued object suffix
            if (!(varName.lastIndexOf("_in") == varName.length - 3)) {
                val idxOfUS = varName.lastIndexOf("_")
                val varSuffix = varName.substring(idxOfUS + 1)
                val varNmr = Integer.parseInt(varSuffix)
                newName = varName.substring(0, idxOfUS + 1) + (varNmr + 1)    
            } else {
                newName = varName.substring(0, varName.length - 2) + "0"
            }
            
            // Make sure the declaration is attached to the dataflow region
            val type = varDecl.type
            if (!dRegion.declarations.contains(varDecl)) {
                varDecl = createVariableDeclaration
                varDecl.annotations += createTagAnnotation("Hide")
                varDecl.type = type
                dRegion.declarations += varDecl
            }
            
            // Create the valued object
            vo = varDecl.createValuedObject(newName)
            if (hasOut) {
                varList.add(varList.length - 1, vo)
            } else {
                varList.add(vo)    
            }
            
            // If the vo is for an array, note which index has been used now.
            if (isArray && writing) {
                val writtenIdxs = newArrayList
                writtenIdxs.add(index)
                voWrittenIdxs.put(vo, writtenIdxs)
            }
        } 
        return vo
    }
    
    /**
     * Find the valued object of the given state by its variables name and creates a new valued object if needed
     */
    def ValuedObject findValuedObjectByName(State state, String name, boolean writing, Region dRegion) {
        return findValuedObjectByName(state, name, null, writing, dRegion)
    }
    
    /**
     * Connects the last valued of the ssa list to the output valued object for each variable of the given state
     */
    def void linkOutputs(State state, DataflowRegion dRegion) {
        var stateVariables = valuedObjects.get(state)
        for (varList : stateVariables.values) {
            // Retrieve the output valued object
            val outVO = findOutputVar(varList)
            // If an output exists connect it
            if (outVO !== null && (varList.length > 1)) {
                // Retrieve the last ssa valued object
                var lastVO = varList.get(varList.length - 1)
                if(lastVO.getName.contains("_out") && (varList.length > 1)) {
                    lastVO = varList.get(varList.length - 2)
                }
                // Copy the location information of the last ssa vo to the output vo
                if (outVO.annotations.length < 2) {
                    outVO.annotations += createStringAnnotation("Offset", lastVO.getStringAnnotationValue("Offset"))
                    outVO.annotations += createStringAnnotation("Length", lastVO.getStringAnnotationValue("Length"))
                }
                // Add the linking assignment
                dRegion.equations += createDataflowAssignment(outVO, lastVO.reference)
            }
        }
    }
    
    /**
     * Find the output valued object of the given ssa list
     */
    def ValuedObject findOutputVar(ArrayList<ValuedObject> varList) {
        var ValuedObject vo = null
        
        for(var i = 0; (i < varList.length) && (vo === null); i++) {
            var varName = varList.get(i).getName
            if (varName.contains("_out")) {
                vo = varList.get(i)
            }
        }
        
        return vo
    }
    
    /**
     * Find the output valued object for the given variable name and the given state
     */
    def ValuedObject findOutputVar(State state, String varName) {
        var ValuedObject vo = null
        
        var varList = valuedObjects.get(state).get(varName)
        vo = varList.findOutputVar
        
        return vo
    }
    
    /**
     * Create a state representation for a call of a not known function
     */
    def State createUnknownFuncState(String funcName, IASTFunctionCallExpression funcCall, boolean writing) {
        // Create the state
        val state = createState(funcName)
        state.label = funcName
        
        // Create an output if needed
        if (writing) {
            val outputDecl = createVariableDeclaration
            outputDecl.output = true
            state.declarations += outputDecl
            val outputVO = outputDecl.createValuedObject(returnObjectName + "_out") 
            outputVO.label = returnObjectName
        }
        
        // Create an input for each argument
        for (argument : funcCall.getArguments) {
            val inputDecl = createVariableDeclaration
            inputDecl.input = true
            state.declarations += inputDecl
            inputDecl.createValuedObject("")
        }
        return state
    }
    
    /**
     * Returns true if the expressions definetely contain the same value. Currently only considers constant values as
     * the expressions.
     */
    def boolean expressionEquals(Expression expression1, Expression expression2) {
        if (expression1 instanceof BoolValue && expression2 instanceof BoolValue) {
            return (expression1 as BoolValue).value.equals((expression2 as BoolValue).value)
        }
        if (expression1 instanceof FloatValue && expression2 instanceof FloatValue) {
            return (expression1 as FloatValue).value.equals((expression2 as FloatValue).value)
        }
        if (expression1 instanceof IntValue && expression2 instanceof IntValue) {
            return (expression1 as IntValue).value.equals((expression2 as IntValue).value)
        }
        if (expression1 instanceof StringValue && expression2 instanceof StringValue) {
            return (expression1 as StringValue).value.equals((expression2 as StringValue).value)
        }
        // TODO: expressions such as "n" should also be considered equal. Maybe need to consider if the variables have
        // been modified in between.
        
        return false
    }
    
    /**
     * Create a list of assignments for the given binary expression.
     */
    def ArrayList<Assignment> createAssignments(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        val operator = binExpr.getOperator
        var assignments = new ArrayList<Assignment>
        var Assignment ass = null
        // Only if the binary expression is an assignment some work is needed
        if(operator == IASTBinaryExpression.op_assign) {
            var sourceExpr = binExpr.children.get(1)
            var Expression source = null
            // If source expression is a variable read retrieve the respective VO
            if(sourceExpr instanceof IASTIdExpression) {
                source = funcState.findValuedObjectByName((sourceExpr as IASTIdExpression).getName.toString, false, dRegion).reference
            // Translate the expression that is meant to be assigned
            } else if(sourceExpr instanceof IASTBinaryExpression) {
                source = createKExpression(sourceExpr, funcState, dRegion)
            } else if(sourceExpr instanceof IASTUnaryExpression) {
                source = createKExpression(sourceExpr, funcState, dRegion)
            // Translate a function call that will be assigned
            } else if(sourceExpr instanceof IASTFunctionCallExpression) {
                // Create the function reference
                val funcCall = sourceExpr as IASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                dRegion.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString
                var refState = funcName.findFunctionState
                if (refState === null) {
                    refState = createUnknownFuncState(funcName, funcCall, true)
                }
                val refStateConst = refState
                refDecl.setReference(refState)
                refDecl.annotations += createTagAnnotation("hide")
                // Create Func Object
                val funcObj = refDecl.createValuedObject(funcName)
                funcObj.insertHighlightAnnotations(sourceExpr)
                // Retrieve Func output
                source = funcObj.reference => [
                    subReference = refStateConst.declarations.filter(VariableDeclaration)
                        .map[ it.valuedObjects ].flatten
                        .filter [ name == returnObjectName + "_out" ].head.reference
                ]
                // Link func inputs (add assignments to result)
                var i = 0
                for (argument : funcCall.getArguments) {
                    val funcObjArg = refStateConst.declarations.filter(VariableDeclaration).map[ it.valuedObjects ].flatten.get(i)
                    val connectObj = funcState.findValuedObjectByName(argument.children.head.toString, false, dRegion)
                    ass = createDataflowAssignment(funcObj, funcObjArg, connectObj.reference)
                    assignments.add(ass)
                    i++
                }
            // Create a value expression for a literal    
            } else if(sourceExpr instanceof IASTLiteralExpression){
                
                source = createValue(sourceExpr)
            }
            
            // Retrieve the assignment target
            val targetAndIndex = retrieveTargetAndIndexExpr(binExpr.getOperand1, funcState, dRegion)
            
            targetAndIndex.target.insertHighlightAnnotations(binExpr)
            ass = createDataflowAssignment(targetAndIndex.target, source)
            if (targetAndIndex.index !== null) {
                ass.reference.indices += targetAndIndex.index
            }
        }
        assignments.add(ass)
        return assignments
    }
    
    /**
     * Retrieve the target valued object for the given target expression for the given function state and dataflow
     * region, as well as the index if the target is an array.
     */
    def ValuedObjectAndExpression retrieveTargetAndIndexExpr(IASTExpression targetExpr, State funcState, DataflowRegion dRegion) {
        val ValuedObjectAndExpression result = new ValuedObjectAndExpression
        if (targetExpr instanceof IASTIdExpression) {
            result.target = funcState.findValuedObjectByName(targetExpr.getName.toString, true, dRegion)    
        } else if (targetExpr instanceof IASTArraySubscriptExpression) {
            val arrayIndex = targetExpr.argument.createKExpression(funcState, dRegion)
            result.target = funcState.findValuedObjectByName(exprToString(targetExpr.arrayExpression, sourceFile), arrayIndex, true, dRegion)
            result.index = targetExpr.argument.createKExpression(funcState, dRegion)
        } else {
            println("DataflowExtractor: Unsupported assignment target detected!" + targetExpr.expressionType)
        }
        return result
    }
    
    /**
     * Structure class to return a {@code ValuedObject} and an {@code Expression} in a method.
     */
    private static class ValuedObjectAndExpression {
        public ValuedObject target
        public Expression index
    }
    
    /**
     * Create a lazy assignment like += and add them to the given dataflow region.
     */ 
    def void createLazyAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion, int operator) {
        // Create a normal assignment out of lazy assignment
        val assExpr = expression.copy(CopyStyle.withLocations)
        assExpr.setOperator = IASTBinaryExpression.op_assign
        val operatorExpr = expression.copy(CopyStyle.withLocations)
        operatorExpr.setOperator = operator
        assExpr.setOperand2 = operatorExpr
        
        // Translate the normal assignment
        val assignments = createAssignments(assExpr, funcState, dRegion)
        for (assignment : assignments) {
            dRegion.equations += assignment
        }
    }
    
    /**
     * Create the assignment out of a BinaryExpression and add them to the given dataflow region.
     */   
    def void createBinaryAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion) {
        
        switch (expression.getOperator) {
            // Translate the normal assignment
            case IASTBinaryExpression.op_assign: {
                val assignments = createAssignments(expression, funcState, dRegion)
                for (assignment : assignments) {
                    dRegion.equations += assignment
                }
            }
            // Translate lazy assignments
            case IASTBinaryExpression.op_multiplyAssign: {
                val arithmeticOP = IASTBinaryExpression.op_multiply
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_divideAssign: {
                val arithmeticOP = IASTBinaryExpression.op_divide
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_moduloAssign: {
                val arithmeticOP = IASTBinaryExpression.op_modulo
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_plusAssign: {
                val arithmeticOP = IASTBinaryExpression.op_plus
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_minusAssign: {
                val arithmeticOP = IASTBinaryExpression.op_minus
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_shiftLeftAssign: {
                val arithmeticOP = IASTBinaryExpression.op_shiftLeft
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_shiftRightAssign: {
                val arithmeticOP = IASTBinaryExpression.op_shiftRight
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_binaryAndAssign: {
                val arithmeticOP = IASTBinaryExpression.op_binaryAnd
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_binaryXorAssign: {
                val arithmeticOP = IASTBinaryExpression.op_binaryXor
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            case IASTBinaryExpression.op_binaryOrAssign: {
                val arithmeticOP = IASTBinaryExpression.op_binaryOr
                createLazyAssignment(expression, funcState, dRegion, arithmeticOP)
            }
            
        }
        
    }
    
    /**
     * Translate a unary assignment and add it to the dataflow region.
     */
    def void createUnaryAssignment(IASTUnaryExpression expression, State funcState, DataflowRegion dRegion) {
        val inc = #[IASTUnaryExpression.op_postFixIncr, IASTUnaryExpression .op_prefixIncr]
        val dec = #[IASTUnaryExpression.op_postFixDecr, IASTUnaryExpression .op_prefixDecr]
        if ((inc + dec).contains(expression.operator)) {
            // Translate this pre- or postfix increment/decrement like a usual assignment such as i = i + 1
            
            // Create the source expression, for example i + 1
            val operator = if (inc.contains(expression.operator)) OperatorType::ADD else OperatorType::SUB
            val source = createOperatorExpression(operator) => [
                it.subExpressions += createKExpression(expression.operand, funcState, dRegion)
                it.subExpressions += createIntValue(1)
            ]
            
            // look for the target and add it to the dataflow region as an assignment.
            val targetAndIndex = retrieveTargetAndIndexExpr(expression.operand, funcState, dRegion)
            
            targetAndIndex.target.insertHighlightAnnotations(expression)
            val Assignment ass = createDataflowAssignment(targetAndIndex.target, source)
            if (targetAndIndex.index !== null) {
                ass.reference.indices += targetAndIndex.index
            }
            dRegion.equations += ass
            return
        }
        
        // Create the expression
        val sourceExpression = createKExpression(expression, funcState, dRegion)
        // Retrieve the respective variable VO                
        val opName = (expression.getOperand as IASTIdExpression).getName.toString
        val opVO = funcState.findValuedObjectByName(opName, true, dRegion)
                
        opVO.insertHighlightAnnotations(expression) 
        // Create the Assignment        
        dRegion.equations += createDataflowAssignment(opVO, sourceExpression)
        
    }
    
    /**
     * Translate a func call expression and add it to the dataflow region.
     */
    def void createFuncCall(IASTFunctionCallExpression expression, State funcState, DataflowRegion dRegion, State refState, boolean knownFunction) {
        // Create the Reference
        val refDecl = createReferenceDeclaration
        refDecl.setReference(refState)
        refDecl.annotations += createTagAnnotation("hide")
        dRegion.declarations += refDecl
        val refObj = refDecl.createValuedObject(refState.name)
        refObj.insertHighlightAnnotations(expression)
        // Link the arguments        
        var arguments = expression.getArguments
        for(var i = 0; i < arguments.length; i++) {
            val argument = arguments.get(i)
            val argExpr = argument.createKExpression(funcState, dRegion)
            var inputVO = refState.declarations.filter(VariableDeclaration).map[ it.valuedObjects ].flatten.get(i)
            dRegion.equations += createDataflowAssignment(refObj, inputVO, argExpr)
            
        }
    }
    
    /**
     * Translate a CDT expression into a KExpression 
     */
    def Expression createKExpression(IASTNode expr, State funcState, DataflowRegion dRegion) {
        var Expression kExpression
        
        switch expr {
            // For variable uses create a VO reference
            IASTIdExpression: {
                var opValObj = funcState.findValuedObjectByName((expr as IASTIdExpression).getName.toString, false, dRegion)
                kExpression = opValObj.reference
            }
            IASTFieldReference: {
                var opValObj = funcState.findValuedObjectByName((expr as IASTFieldReference).getFieldName.toString, false, dRegion)
                kExpression = opValObj.reference
            }
            // For an array, just use the array expression (and leave out the subscript for now).
            IASTArraySubscriptExpression: {
                val indexExpression = expr.argument.createKExpression(funcState, dRegion)
                if (expr.arrayExpression instanceof IASTIdExpression) {
                    var opValObj = funcState.findValuedObjectByName((expr.arrayExpression as IASTIdExpression).getName.toString, indexExpression, false, dRegion)
                    kExpression = opValObj.reference
                } else {
                    println("Unsupported ast node to create an expression: " + expr.arrayExpression.class)         
                    kExpression = expr.arrayExpression.createKExpression(funcState, dRegion)
                }
                (kExpression as ValuedObjectReference).indices += indexExpression
            }
            // For a function call create a reference an return the functions output VO reference
            IASTFunctionCallExpression: {
                // Create the Reference
                val funcCall = expr as IASTFunctionCallExpression
                var refDecl = createReferenceDeclaration
                dRegion.declarations += refDecl
                val funcName = (funcCall.getFunctionNameExpression as IASTIdExpression).getName.toString//children.head.toString
                var refState = funcName.findFunctionState
                if (refState === null) {
                    refState = createUnknownFuncState(funcName, funcCall, true)
                }
                val refStateConst = refState
                refDecl.setReference(refStateConst)
                refDecl.annotations += createTagAnnotation("Hide")
                val funcObj = refDecl.createValuedObject(funcName)
                funcObj.insertHighlightAnnotations(expr)
                // Retrieve the output VO                
                kExpression = funcObj.reference => [
                    subReference = refStateConst.declarations.filter(VariableDeclaration)
                    .map[ it.valuedObjects ].flatten
                    .filter [ name == returnObjectName + "_out" ].head.reference
                ]
                // Connect the Inputs    
                var i = 0
                for (argument : funcCall.getArguments) {
                    val funcObjArg = refStateConst.declarations.filter(VariableDeclaration).map[ it.valuedObjects ].flatten.get(i)
                    val connectExpr = argument.createKExpression(funcState, dRegion)
                    dRegion.equations += createDataflowAssignment(funcObj, funcObjArg, connectExpr)
                    i++
                }
            }
            // For a conditional expression create a state similar to an if    
            IASTConditionalExpression: {
                val condExpr = expr.getLogicalConditionExpression
                //Create the State
                val condState = createState(exprToString(condExpr, sourceFile))
                condState.insertHighlightAnnotations(expr)
                val condDRegion = createDataflowRegion(condState.name)
                condDRegion.label = condState.name
                condState.regions += condDRegion
                // Create the reference
                val refDecl = createReferenceDeclaration
                refDecl.setReference(condState)
                refDecl.annotations += createTagAnnotation("hide")
                dRegion.declarations += refDecl
                val condStateVO = refDecl.createValuedObject("?")
                // Set the inputs
                setInputs(expr, funcState, condState, dRegion, condStateVO)
                
                // Create the output
                val outputDecl = createVariableDeclaration
                outputDecl.output = true
                condState.declarations += outputDecl
                val outputVO = outputDecl.createValuedObject(returnObjectName)
                // Create the positive expression
                condDRegion.equations += createDataflowAssignment(outputVO, expr.getPositiveResultExpression.createKExpression(condState,condDRegion))
                outputVO.insertHighlightAnnotations(expr)
                // Create the nagative expression
                val condNDRegion = createDataflowRegion(elseName)
                condNDRegion.label = elseName
                condState.regions += condNDRegion
                
                condNDRegion.equations += createDataflowAssignment(outputVO, expr.getNegativeResultExpression.createKExpression(condState,condNDRegion))
                outputVO.insertHighlightAnnotations(expr)
                
                // Return the output reference
                kExpression = condStateVO.reference => [
                    subReference = outputVO.reference
                ]
            }
            // Skip a cast and translate the inner expression
            IASTCastExpression: {
                kExpression = expr.getOperand.createKExpression(funcState, dRegion)
            }
            // Call subsequent translations for unary and binary expressions
            IASTUnaryExpression: {
                kExpression = (expr as IASTUnaryExpression).createKExpression(funcState, dRegion)
            }
            IASTBinaryExpression: {
                kExpression = (expr as IASTBinaryExpression).createKExpression(funcState, dRegion)
            }
            // Create a value expression for a literal
            IASTLiteralExpression: {
                kExpression = expr.createValue
            }
            // Extract the expression of an expression statement and translate it
            IASTExpressionStatement: {
                kExpression = expr.getExpression.createKExpression(funcState, dRegion)
            }
            IASTInitializerList: {
                kExpression = createVectorValue => [
                    values += expr.clauses.map [ it.createKExpression(funcState, dRegion) ]
                ]
            }
            default: {
                println("Unsupported ast node to create an expression: " + expr.class)
            }
        }
        return kExpression
    }
    
    /**
     * Translate a bianryExpression
     */
    def OperatorExpression createKExpression(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        // Create the operator expression with the corresponding operator
        var opType = binExpr.getOperator().cdtBinaryOpTypeConversion
        var expression = opType.createOperatorExpression
        // Translate the operands and attach them    
        for (operand : binExpr.children) {
                
            expression.subExpressions += operand.createKExpression(funcState, dRegion)
                
        }
        return expression
    }
    
    /**
     * Translate an UnaryExpression
     */
    def Expression createKExpression(IASTUnaryExpression unExpr, State funcState, DataflowRegion dRegion) {
        var Expression expression
        // Retrieve the operator and create the operatorExpression
        var opType = unExpr.getOperator.cdtUnaryOpTypeConversion
        var OperatorExpression unKExpr
        
        // Test if the operator exists (parentheses are an unary expression thus skip them)
        if(opType !== null) {
            unKExpr = opType.createOperatorExpression
            // Attach the operand
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
            expression = unKExpr
        } else {
            // Translate the operand
            var operand = unExpr.getOperand
            expression = operand.createKExpression(funcState, dRegion)
        }
        return expression
        
    }

}
