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
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
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
import de.cau.cs.kieler.sccharts.SCChartsFactory
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
import org.eclipse.cdt.core.dom.ast.IASTInitializer
import org.eclipse.cdt.core.dom.ast.IASTInitializerList
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle
import org.eclipse.cdt.core.dom.ast.IASTNullStatement
import org.eclipse.cdt.core.dom.ast.IASTReturnStatement
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTStandardFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTStatement
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.IASTTypeIdExpression
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
    
    /** The seperator for valued object names and its further SSA objects. */
    static final String ssaNameSeperator = " "
    /** The valued object suffix for the input SSA object. */
    static final String inSuffix = ssaNameSeperator + "in"
    /** The valued object suffix for the output SSA object. */
    static final String outSuffix = ssaNameSeperator + "out"
    /** The name prefix of function parameters with an unknown name. */
    static final String unknownParamName = "param"
    
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
    /** Shown name prefix for switch statements. */
    static final String switchName = "switch"
    /** Shown name prefix for default case statements in switches. */
    static final String defaultCaseName = "default"
    
    /** Name for the return combine state. */
    static final String returnCombineName = " returnCombine"
    /** Name for the sizeof state. */
    static final String sizeofName = " sizeof"
    
    var functions = <String, State> newHashMap
    var ifCounter = 0;
    var swCounter = 0;
    var forCounter = 0;
    var whileCounter = 0;
    var doCounter = 0;
    
    val Map<State, Map<String, List<ValuedObject>>> valuedObjects = newHashMap
    
    val voWrittenIdxs = <ValuedObject, List<Expression>> newHashMap
    
    var SCCharts rootSCChart
    
    var ValueType currentReturnType = null

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
        if (ast === null) {
            return null
        }
        
        // Create SCCharts root elements
        rootSCChart = createSCChart
        
        // Start extraction for each defined function
        for (child : ast.children) {
            if (child instanceof IASTFunctionDefinition) {
                val state = buildFunction(child)
                rootSCChart.rootStates += state
            } 
             
        }
        
        return rootSCChart
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
        functions.put(funcName, state)
        state.label = funcName
        
        // Insert text highlighting annotations
        state.insertHighlightAnnotations(func)
        
        // Create a hashmap for the functions valued objects if needed
        var Map<String, List<ValuedObject>> stateVariables = null
        if (valuedObjects.containsKey(state)) {
            stateVariables = valuedObjects.get(state)
        } else {
            stateVariables = newHashMap
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
                    val varList = <ValuedObject> newArrayList
                    
                    // Create valued object for the input
                    val vo = decl.createValuedObject(varName + inSuffix)
                    vo.label = varName
                    vo.insertHighlightAnnotations(par)
                    
                    // Attach the valued object to its list and the list to the map
                    varList.add(vo)
                    stateVariables.put(varName, varList)
                }
            }
        }
        
        // Determine function output
        val outputDeclSpecifier = func.getDeclSpecifier
        if (outputDeclSpecifier instanceof IASTSimpleDeclSpecifier) {
            val type = (outputDeclSpecifier as IASTSimpleDeclSpecifier).type.cdtTypeConversion
            currentReturnType = type
            if (type !== null) {
                val varList = addReturnDecl(state)
                stateVariables.put(returnObjectName, varList)
            }
        }
        
        // Translate function body
        val body = func.getBody
        var DataflowRegion bodyRegion
        if (body instanceof IASTCompoundStatement) {
            bodyRegion = buildCompound(body, state)
            state.regions += bodyRegion
            bodyRegion.label = funcName
        } else {
            println("ERROR: Body of " + funcName + " is not a Compound Statement!")
        }
        
        // For each array/pointer parameter, determine if it has been written to in the function
        // by analyzing the valued objects for said parameter. If written to, add another output
        // declaration with an assignment of the final value to that output declaration.
        if (funcDeclarator instanceof IASTStandardFunctionDeclarator) {
            val parameters = funcDeclarator.getParameters
            for (par : parameters) {
                val isArray = par.getDeclSpecifier instanceof IASTSimpleDeclSpecifier
                           && par.declarator       instanceof IASTArrayDeclarator
                if (isArray) {
                    val type = (outputDeclSpecifier as IASTSimpleDeclSpecifier).type.cdtTypeConversion
                    // Determine parameter name
                    val varName = par.getDeclarator.getName.toString
                    val varList = stateVariables.get(varName)
                    
                    // Find declaration for this parameter in the body's region.
                    val decl = bodyRegion.declarations.findFirst[ // The declaration...
                        it.valuedObjects.findFirst[ // ... with a valued object ...
                            it.name.startsWith(varName + ssaNameSeperator) // ... named "varName"
                        ] !== null
                    ]
                    
                    // If there is a declaration in the region, then it has been written to, so we need to create a new
                    // output.
                    if (decl !== null) {
                        // Create output declaration                    
                        val outDecl = createVariableDeclaration
                        outDecl.type = type
                        outDecl.output = true  
                        state.declarations += outDecl
                        
                        // Create valued object for the output.
                        val outputVo = outDecl.createValuedObject(varName + outSuffix)
                        outputVo.label = varName
                        outputVo.insertHighlightAnnotations(par)
                        
                        // Attach the valued object to its list.
                        varList.add(outputVo)
                        
                        // Add an assignment of the last VO to the output VO.
                        val source = decl.valuedObjects.get(decl.valuedObjects.filter[ // The last VO with the variable's name
                            it.name.startsWith(varName + ssaNameSeperator)
                        ].size - 1)
                        val target = outputVo
                        bodyRegion.equations += createDataflowAssignment(target,  source.reference)
                    }
                }
            }
        }
        
        return state
    }
    
    /**
     * Create a state representation for a call of a not known function
     * 
     * @param funcName The name this function state should have.
     * @param funcCall The AST function call expression of which to get the data from to create the state.
     * @param dRegion The parent dataflow region that will be containing this state, for reference.
     * @return A new state for a function unknown in the AST.
     */
    def State createUnknownFuncState(String funcName, IASTFunctionCallExpression funcCall, DataflowRegion dRegion) {
        // Create the state
        val state = createState(funcName)
        functions.put(funcName, state)
        state.label = funcName
        val bodyRegion = state.createDataflowRegion(funcName)
        bodyRegion.label = funcName
        
        // Create an output
        val outputDecl = createVariableDeclaration
        outputDecl.output = true
        state.declarations += outputDecl
        val outputVO = outputDecl.createValuedObject(returnObjectName + outSuffix) 
        outputVO.label = returnObjectName

        // For each array/pointer parameter, determine if it has been written to in the function
        // by analyzing the valued objects for said parameter. If written to, add another output
        // declaration with an assignment of the final value to that output declaration.
        // Create inputs for the functions parameters
        val declaration = createVariableDeclaration
        declaration.input = true
        state.declarations += declaration
        for (arg : funcCall.arguments) {
            var needsOutput = true
            // Determine parameter name
            var String varName
            if (arg instanceof IASTIdExpression) {
                varName = arg.getName.toString
                val parentDeclarations = dRegion.declarations.filter(VariableDeclaration)
                val potentialInputVOs  = parentDeclarations.map[it.valuedObjects].flatten
                val varName_ = varName
                val inputVO = potentialInputVOs.findFirst[it.label.equals(varName_)]
                if (inputVO === null || inputVO.cardinalities.empty) {
                    needsOutput = false
                }
            } else {
                needsOutput = false
                varName = unknownParamName + ssaNameSeperator + funcCall.arguments.indexOf(arg)
            }
            
                
            // Create valued object for the input
            val vo = declaration.createValuedObject(varName + inSuffix)
            vo.label = varName
            vo.insertHighlightAnnotations(arg)
            
            if (needsOutput) {
                // Create output declaration
                val outDecl = createVariableDeclaration
                outDecl.output = true
                state.declarations += outDecl
                
                // Create valued object for the output.
                val outputVo = outDecl.createValuedObject(varName + outSuffix)
                outputVo.label = varName
                outputVo.insertHighlightAnnotations(arg)
            }
        }
        
        rootSCChart.rootStates += state
        
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
        val dfRegion = createDataflowRegion("DF-" + bodyState.name)
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
    
    /**
     *  Create a declaration of a local variable and attach it to the dataflow region
     */
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
            createFunctionCall(expression, rootState, dRegion)
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
     * Translate a Null statement. Does nothing.
     */
    def dispatch void buildStatement(IASTNullStatement stmt, State rootState, DataflowRegion dRegion) {
    }
    
    /**
     * Extract the body of an if Statement
     */
    def void buildIf(IASTIfStatement ifStmt, State rootState, DataflowRegion dRegion) {
        // Creating the state to represent the if statement
        val ifState = createState(ifName + ssaNameSeperator + ifCounter)
        
        // Create a reference for this if state in the containing dataflow-region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject(ifName + ssaNameSeperator + ifCounter)
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
        val State thenState = createStateForStatement(thenStmt, cRegion, rootState, dRegion, ifObj, thenName)
        val thenTransition = initState.createImmediateTransitionTo(thenState)
        thenTransition.trigger = (ifStmt.getConditionExpression).createKExpression(ifState, dRegion)
        
        // If an else is given the state is also created
        if (ifStmt.getElseClause !== null) {
            val elseStmt = ifStmt.getElseClause
            val State elseState = createStateForStatement(elseStmt, cRegion, rootState, dRegion, ifObj, elseName)
            initState.createImmediateTransitionTo(elseState)
        }
        
        assignOutputs(ifState, ifObj, rootState, dRegion)
    }
    
    /**
     * Creates and returns a new state in the {@code parentRegion} of the {@code currentState} with a {@code name}
     * that contains the dataflow behavior of the {@code statement}.
     */
    private def State createStateForStatement(IASTStatement statement, ControlflowRegion parentCRegion,
        State parentState, DataflowRegion parentDRegion, ValuedObject parentReference, String name) {
        val newState = parentCRegion.createState(name)
        newState.label = name
        newState.insertHighlightAnnotations(statement)
        // Set the in and outputs of the state
        setInputs(statement, parentState, newState, parentDRegion, null, false)
        setOutputs(statement, parentState, newState, parentDRegion, null, false)
        
        val DataflowRegion region = createDFRegionForStatement(statement, newState, parentState, parentDRegion, parentReference)
        region.label = name
        newState.regions += region
        
        return newState
    }
    
    /**
     * Creates and returns a new dataflow region using the in/outputs of the {@code currentState} for the given
     * {@code statement}.
     */
    private def DataflowRegion createDFRegionForStatement(IASTStatement statement, State currentState, State parentState,
        DataflowRegion parentRegion, ValuedObject parentReference) {
        return createDFRegionForStatement(statement, currentState, parentState, parentRegion, parentReference, null)
    }
    
    /**
     * Creates and returns a new dataflow region using the in/outputs of the {@code currentState} for the given
     * {@code statement}. The {@code additionalDeclarations} can be used if this region needs some declarations defined
     * as well that should not be visible from the outside. Used for example for 'for' loop's initializer statement.
     * 
     * @param statement The statement to create the region for.
     * @param currentState The state this region should be contained in.
     * @param parentState The parent state containing the currentState.
     * @param parentRegion The dataflow region containing the state for this new region.
     * @param parentReference The reference valued object used for the parentState.
     * @param additionalDeclarations Any additional declarations that need to be known for creating this state.
     * @return The new dataflow region.
     */
    private def DataflowRegion createDFRegionForStatement(IASTStatement statement, State currentState, State parentState,
        DataflowRegion parentRegion, ValuedObject parentReference, IASTStatement additionalDeclarations) {
        var DataflowRegion newRegion
        if (statement instanceof IASTCompoundStatement) {
            newRegion = buildCompound(statement, currentState, additionalDeclarations)
        } else {
            newRegion = createDataflowRegion("DF-" + currentState.name)
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
                buildStatement(usedDeclarators, currentState, newRegion)
            }
            buildStatement(statement, currentState, newRegion)
            
            linkOutputs(currentState, newRegion)
        }
        
        linkReturn(currentState, parentState, newRegion, parentRegion, parentReference)
        return newRegion
    }
    
    /**
     * Links the return output of the {@code currentRegion} to its parent.
     * 
     * @param currentState The state containing the current region.
     * @param parentState The state containing the current state.
     * @param currentRegion The region that may define a return output that needs to be linked.
     * @param parentRegion The parent region, where the new assignment is put.
     * @param parentReference The reference object used for the parent state in the parent region.
     */
    def void linkReturn(State currentState, State parentState, DataflowRegion currentRegion,
        DataflowRegion parentRegion, ValuedObject parentReference) {
        val returnDeclaration = currentState.declarations.findFirst[
            it.valuedObjects.findFirst[it.name.startsWith(returnObjectName)] !== null
        ]
        if (returnDeclaration !== null) {
            val returnedVO = returnDeclaration.valuedObjects.last
            returnedVO.label = returnObjectName
            // Look if there already is a valued object for the return statements of the parent state.
            val vos = valuedObjects.get(currentState)
            var returnObjects = vos.get(returnObjectName)
            if (returnObjects === null) {
                returnObjects = newArrayList
                
                // Create a declaration with the same type as the return function.
                val returnDecl = createVariableDeclaration
                returnDecl.type = currentReturnType
                returnDecl.output = true
                parentState.declarations += returnDecl
                
                val returnVO = returnDecl.createValuedObject(returnObjectName + outSuffix)
                returnVO.label = returnObjectName
                returnObjects += returnVO
                vos.put(returnObjectName, returnObjects)
            }
            
            val retVO = parentState.findValuedObjectByName(returnObjectName, true, currentRegion)
            
            // res_i = while_0.res_out
            val source = parentReference.reference => [
                subReference = returnedVO.reference
            ]
            parentRegion.equations += createDataflowAssignment(retVO, source)
        }
    }
    
    /**
     * Extract the body of a switch statement
     */
    def void buildSwitch(IASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        // Create the State representing the switch
        val swState = createState(switchName + ssaNameSeperator + swCounter)
        
        // Create the reference for the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject(switchName + ssaNameSeperator + swCounter)        
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
                
                setInputs(swBody, rootState, activeCase, dRegion, null, false)
                setOutputs(swBody, rootState, activeCase, dRegion, null, false)
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
                    activeCase.label = defaultCaseName
                }
            // Create a transition to the final state for break statements    
            } else if (child instanceof IASTBreakStatement) {
                assignOutputs(swState, swObj, rootState, dRegion)
                activeCase = null
            // Translate other statements into the currently active dataflow region    
            } else {
                buildStatement(child as IASTStatement, activeCase, activeDRegion)
            }
            
        }
        // If the last statement is missing a break, link inputs anyway.
        if (!(swBody.children.last instanceof IASTBreakStatement)) {
            assignOutputs(swState, swObj, rootState, dRegion)
        }
        linkReturn(activeCase, rootState, activeDRegion, dRegion, swObj)
        assignOutputs(swState, swObj, rootState, dRegion)
    }
    
    /**
     * Translate a For Statement
     */
    def void buildFor(IASTForStatement forStmt, State rootState, DataflowRegion dRegion) {
        // Create the state
        val forState = createState(forName + ssaNameSeperator + forCounter)
        
        // Reference the state in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject(forName + ssaNameSeperator + forCounter)        
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
        val forDBodyRegion = createDFRegionForStatement(forStmt.getBody, forState, rootState, dRegion, forObj, forStmt.getInitializerStatement) 
        forState.regions += forDBodyRegion
        forDBodyRegion.label = forState.label        
    }
    
    /**
     * Translate a while statement
     */
    def void buildWhile(IASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
        // Create the state        
        val whileState = createState(whileName + ssaNameSeperator + whileCounter)
        
        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject(whileName + ssaNameSeperator + whileCounter)        
        whileObj.insertHighlightAnnotations(whileStmt)
        
        // Set the in and outputs
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)
        
        // Create the condition expression label
        createKExpression(whileStmt.getCondition, whileState, dRegion)
        whileState.label = "while (" + exprToString(whileStmt.getCondition, sourceFile) + ")"
        whileCounter++
        
        // Translate the loop body
        val DataflowRegion whileDBodyRegion = createDFRegionForStatement(whileStmt.getBody, whileState, rootState, dRegion, whileObj) 
        whileState.regions += whileDBodyRegion
        whileDBodyRegion.label = whileState.label
        
    }
    
    /**
     * Translate a Do statement
     */
    def void buildDo(IASTDoStatement doStmt, State rootState, DataflowRegion dRegion) {
        // Create the state        
        val doState = createState(doName + ssaNameSeperator + doCounter)
        
        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject(doName + ssaNameSeperator + doCounter)        
        doObj.insertHighlightAnnotations(doStmt)
        
        // Set the in and outputs
        setInputs(doStmt, rootState, doState, dRegion, doObj)
        setOutputs(doStmt, rootState, doState, dRegion, doObj)
        
        // Create the condition expression label
        createKExpression(doStmt.getCondition, doState, dRegion)
        doState.label = "do ... while (" + exprToString(doStmt.getCondition, sourceFile) + ")"
        doCounter++
        
        // Translate the body
        val doDBodyRegion = createDFRegionForStatement(doStmt.getBody, doState, rootState, dRegion, doObj)
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
        var Map<String, List<ValuedObject>> stateVariables = null
        if (valuedObjects.containsKey(state)) {
            stateVariables = valuedObjects.get(state)    
        } else {
            stateVariables = newHashMap
            valuedObjects.put(state, stateVariables)
        }
        
        // Create a valued object for each declared variable 
        val declarators = declaration.getDeclarators
        for (decl : declarators) {
            // Retrieve the variables name
            var varName = decl.getName.toString
            // Create a SSA list for the variable
            var varList = <ValuedObject> newArrayList
            
            //Create the valued object
            val vo = variableDeclaration.createValuedObject(varName + ssaNameSeperator + "0")
            vo.label = varName
            vo.insertHighlightAnnotations(decl)
            if (decl instanceof IASTArrayDeclarator) {
                vo.cardinalities += decl.arrayModifiers.map[
                    val expr = it.constantExpression?.createKExpression(state, dRegion)
                    if (expr !== null) {
                        return expr
                    } else {
                        // For declarations such as 'char string[] = "foo"' there is no constant expression,
                        // so just add some cardinality to the array, that SCChart does not really matter about anyways
                        // for the visual representation.
                        return createIntValue(1)
                    }
                ]
            }
            
            // Add the valued object and the ssa list to the respective elements    
            varList.add(vo)
            stateVariables.put(varName, varList)
            
            // Add the initialization assignment if needed
            if (decl.getInitializer !== null) {
                vo.initializeValuedObject(decl.getInitializer, state, dRegion)
            }
        }
        return variableDeclaration
    }
    
    /**
     * Add an initialization assignment to the given valued object
     */
    def void initializeValuedObject(ValuedObject vo, IASTInitializer initializer, State state, DataflowRegion dRegion) {
        if (initializer instanceof IASTEqualsInitializer) {
            var Expression initExpr
            if (initializer.children.head instanceof IASTFunctionCallExpression) {
                val expression = initializer.children.head as IASTFunctionCallExpression
                initExpr = createFunctionCall(expression, state, dRegion)
            } else {
                // Simply translate the expression
                initExpr = createKExpression(initializer.children.head, state, dRegion)
            }
            dRegion.equations += createDataflowAssignment(vo, initExpr)
        }
    }
    
    /**
     * Connect the outputs of a control statement state to the respective valued objects of the containing state
     */
    def void setOutputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        setOutputs(stmt, rootState, newState, dRegion, refObj, true)
    }
    
    /**
     * Connect the outputs of a control statement state to the respective valued objects of the containing state
     */
    def void setOutputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj,
        boolean addAssignments) {
        // Retrieve the set of outputs of the control statement
        var outputs = findOutputs(stmt, rootState, false)
        
        // Retrieve the state valued object map
        var Map<String, List<ValuedObject>> stateVariables = null
        if (valuedObjects.containsKey(newState)) {
            stateVariables = valuedObjects.get(newState)
        } else {
            stateVariables = newHashMap
            valuedObjects.put(newState, stateVariables)
        }
        
        // Create an output declaration for each found output
        for (output : outputs) {
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
            val innerOutputVO = decl.createValuedObject(output + outSuffix)
            innerOutputVO.label = output
            innerOutputVO.insertHighlightAnnotations(stmt)
            
            // Add the new create valued object to the ssa list and valued object list
            if (stateVariables.containsKey(output)) {
                var varList = stateVariables.get(output)
                varList.add(innerOutputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerOutputVO)
                stateVariables.put(output, varList)
            }
            
            if (addAssignments) {
                // Create the assignment
                val target = outputVO
                if (refObj === null) {
                    dRegion.equations += createDataflowAssignment(target, innerOutputVO.reference)
                } else {
                    val source = refObj.reference => [
                        subReference = innerOutputVO.reference
                    ]
                    dRegion.equations += createDataflowAssignment(target, source)
                }
            }
        }
        
        // If the statement contains a return statement, add a return declaration to the region.
        val isReturn = findReturn(stmt)
        val hasReturn = valuedObjects.get(newState).containsKey(returnObjectName)
        if (isReturn && !hasReturn) {
            val varList = addReturnDecl(newState)
            if (varList !== null) {
                stateVariables.put(returnObjectName, varList)   
            }
        }
    }
    
    /**
     * Adds a return declaration to the given declaration scope.
     * 
     * @param state The state to add the declaration to.
     * @return A new list with a new valued object for the return value for this declaration.
     */
    def List<ValuedObject> addReturnDecl(State state) {
            // Add a new return declaration and initialize it with the _out valued object.
            if (currentReturnType !== null) {
                // Determine output type
                val retDecl = createVariableDeclaration
                retDecl.type = currentReturnType
                retDecl.output = true  
                state.declarations += retDecl
                
                // Set output name
                var varName = returnObjectName
                val varList = <ValuedObject> newArrayList
                
                // Create valued object
                val resVO = retDecl.createValuedObject(varName + outSuffix)
                resVO.label = varName
                
                // Attach valued object to the listing
                varList.add(resVO)
                return varList
            }
    }
    
    /**
     * Returns true if the statement or any of its children are a return statement, false otherwise.
     * 
     * @param statement The AST node to search the return statement in.
     * @return If a return statement was found.
     */
    def boolean findReturn(IASTNode statement) {
        if (statement instanceof IASTReturnStatement) {
            return true
        } else {
            for (child : statement.children) {
                val childHasReturn = findReturn(child)
                if (childHasReturn) {
                    return true
                }
            }
        }
        return false
    }
    
    /**
     * Find the outputs from the given control statement.
     * 
     * @param stmt The control statement
     * @param parentState The state this control statement is contained in.
     * @param checkId If IdExpressions should also be considered an output. Should be false for any call from the
     *                outside.
     */
    def HashSet<String> findOutputs(IASTNode stmt, State parentState, boolean checkId) {
        var outputs = <String> newHashSet
        
        switch (stmt) {
            IASTIdExpression case checkId: {
                val varName = (stmt as IASTIdExpression).getName.toString
                if (valuedObjects.get(parentState).containsKey(varName)) outputs += varName
            }
            IASTBinaryExpression: {
                // Consider only non-local variables that are target of an assignment.
                val operator = stmt.getOperator
                if ((operator >= IASTBinaryExpression.op_assign) && (operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                    val op1 = stmt.getOperand1
                    if (op1 instanceof IASTIdExpression) {
                        outputs += findOutputs(op1, parentState, true)
                    } else if (op1 instanceof IASTArraySubscriptExpression) {
                        outputs += findOutputs(op1.arrayExpression, parentState, true)
                    }
                }
            }
            IASTUnaryExpression: {
                // Consider non-local
                val operator = stmt.getOperator
                val writingUnaryOps = #[IASTUnaryExpression.op_prefixIncr,  IASTUnaryExpression.op_prefixDecr,
                                        IASTUnaryExpression.op_postFixIncr, IASTUnaryExpression.op_postFixDecr]
                if (writingUnaryOps.contains(operator)) {
                    val operand = stmt.operand
                    if (operand instanceof IASTIdExpression) {
                        outputs += findOutputs(operand, parentState, true)
                    } else if (operand instanceof IASTArraySubscriptExpression) {
                        outputs += findOutputs(operand.arrayExpression, parentState, true)
                    }
                }
            }
            default: {
                // Check every child for other statements.
                for (child : stmt.children) {
                    outputs += findOutputs(child, parentState, false)
                }
            }
        }
        return outputs
    }
    
    /**
     * Connect the Inputs of the given control statement to their respective valued objects of the containing state
     */
    def void setInputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj) {
        setInputs(stmt, rootState, newState, dRegion, refObj, true)
    }
    
    /**
     * Connect the Inputs of the given control statement to their respective valued objects of the containing state
     */
    def void setInputs(IASTNode stmt, State rootState, State newState, DataflowRegion dRegion, ValuedObject refObj,
        boolean addAssigments) {
        // Find the needed inputs of the given control statement
        var inputs = findInputs(stmt, rootState)
        
        // All outputs are also shown as inputs. As no control statement is required to be executed, this allows
        // to be interpreted as "take either the output of this control statement or the previous input value".
        var outputs = findOutputs(stmt, rootState, false)
        inputs.addAll(outputs)
        
        // Retrieve the state's valued object map
        var Map<String, List<ValuedObject>> stateVariables = null
        if (valuedObjects.containsKey(newState)) {
            stateVariables = valuedObjects.get(newState)
        } else {
            stateVariables = newHashMap
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
            val innerInputVO = decl.createValuedObject(input + inSuffix)
            innerInputVO.label = input
            innerInputVO.insertHighlightAnnotations(stmt)
            
            // Add the new create valued object to the ssa list and valued object list
            if (stateVariables.containsKey(input)) {
                var varList = stateVariables.get(input)
                varList.add(innerInputVO)
            } else {
                var varList = <ValuedObject> newArrayList    
                varList.add(innerInputVO)
                stateVariables.put(input, varList)
            }
            
            if (addAssigments) {
                // Create the assignment
                if (refObj === null) {
                    dRegion.equations += createDataflowAssignment(innerInputVO, inputVO.reference)
                } else {
                    dRegion.equations += createDataflowAssignment(refObj, innerInputVO, inputVO.reference)
                }
            }
        }
    }
    
    /**
     * Find the Inputs needed for the given control statement
     */
    def HashSet<String> findInputs(IASTNode stmt, State parentState) {
        var inputs = <String> newHashSet
        // Add a found non local variable use
        if (stmt instanceof IASTIdExpression) {
            val varName = stmt.getName.toString
            if (valuedObjects.get(parentState).containsKey(varName)) inputs += varName
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
     * Find the state for the given function name, or create a new unknown function state and remember it.
     * 
     * @param expression The function call expression to find the state for.
     * @param dRegion The surrounding dataflow region that will contain this state, for reference.
     * @return The state for the function.
     */
    def State findFunctionState(IASTFunctionCallExpression expression, DataflowRegion dRegion) {
        val funcName = (expression.getFunctionNameExpression as IASTIdExpression).getName.toString
        val existingFunction = findFunctionState(funcName)
        if(existingFunction === null) {
            return createUnknownFuncState(funcName, expression, dRegion)
        }
        return existingFunction
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
        
        // If the last object is the outSuffix object the preceding valued object has to be used
        var onlyOut = false
        var hasOut = false
        if ((varName.contains(outSuffix)) && (varName.lastIndexOf(outSuffix) == (varName.length - outSuffix.length))) {
            hasOut = true
            if (varList.length > 1) {
                vo = varList.get(varList.length - 2)
                varName = vo.getName()
                
            // If the list only contains the outSuffix valued object, a preceding one has to be created  
            } else {
                val OffsetAnno = vo.getAnnotations("Offset")
                val LengthAnno = vo.getAnnotations("Length")
                onlyOut = true
                var varDecl = vo.getVariableDeclaration
                varName = varName.substring(0, varName.length - outSuffix.length) + ssaNameSeperator + "0"
                val type = varDecl.type
                
                // If the original variable declaration was attached to the state the new one should be attached to the dataflow region
                if (!dRegion.declarations.contains(varDecl)) {
                    varDecl = createVariableDeclaration
                    varDecl.annotations += createTagAnnotation("Hide")
                    varDecl.type = type
                    dRegion.declarations += varDecl
                }
                
                // Create the valued object and add it to the variable list, before the outSuffix object
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
            if (!(varName.lastIndexOf(inSuffix) == varName.length - inSuffix.length)) {
                val idxOfUS = varName.lastIndexOf(ssaNameSeperator)
                val varSuffix = varName.substring(idxOfUS + 1)
                val varNmr = Integer.parseInt(varSuffix)
                newName = varName.substring(0, idxOfUS + 1) + (varNmr + 1)    
            } else {
                newName = varName.substring(0, varName.length - inSuffix.length) + ssaNameSeperator + "0"
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
                if (varList.length > 2 && varList.head.name.startsWith(returnObjectName)) {
                    // The return value is a special case, every assignment to it comes from a possible return statement
                    // somewhere in the given state. 
                    val allReturns = varList.filter[it !== outVO]
                    
                    // Create a state to combine all returns
                    val returnState = createState(returnCombineName)
                    returnState.createDataflowRegion(returnCombineName)
                    
                    // Create the reference to this state in the containing dataflow region
                    val refDecl = createReferenceDeclaration
                    refDecl.setReference(returnState)
                    dRegion.declarations += refDecl
                    val returnStateObject = refDecl.createValuedObject(returnCombineName)
                    
                    // Set the inputs of the state
                    for (inputVO : allReturns) {
                        val newDecl = createVariableDeclaration
                        newDecl.type = inputVO.variableDeclaration.type
                        newDecl.input = true
                        returnState.declarations += newDecl
                        val innerInputVO = newDecl.createValuedObject(inputVO.name)
                        innerInputVO.label = inputVO.name
                        
                        // Create the assignment
                        // The assignment is of the form 'return_combine.res_n = res_n'
                        dRegion.equations += createDataflowAssignment(returnStateObject, innerInputVO, inputVO.reference)
                    }
                    
                    // Set the output of the state
                    val outDecl = createVariableDeclaration
                    outDecl.type = outVO.type
                    outDecl.output = true
                    returnState.declarations += outDecl
                    val innerOutputVO = outDecl.createValuedObject(outVO.name)
                    innerOutputVO.label = returnObjectName
                    
                    // Create the assignment
                    // The assignment is of the form 'res = return_combine.res out'
                    val source = returnStateObject.reference => [
                        subReference = innerOutputVO.reference
                    ]
                    dRegion.equations += createDataflowAssignment(outVO, source)
                } else {
                    // Connect the last valued object in the list not being the output variable to the
                    // output suffixed valued object as the last SSA object is the output value for that variable.
                
                    // Retrieve the last ssa valued object
                    var lastVO = varList.get(varList.length - 1)
                    if (lastVO.getName.contains(outSuffix) && (varList.length > 1)) {
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
    }
    
    /**
     * Assigns the output valued of the ssa list to the surrounding region for each output of the given state.
     */
    def void assignOutputs(State state, ValuedObject refObject, State rootState, DataflowRegion dRegion) {
        var stateVariables = valuedObjects.get(state)
        for (varList : stateVariables.values) {
            // Retrieve the output valued object
            val outVO = findOutputVar(varList)
            if (outVO !== null && !varList.head.name.startsWith(returnObjectName)) {
                // All none-return object variables that are output of the state need to be assigned in the outer region.
                // This function call called with true handles that for us.
                val name = outVO.label
                val target = findValuedObjectByName(rootState, name, true, dRegion)
                // newVar = ref.output
                val source = refObject.reference => [
                    subReference = outVO.reference
                ]
                dRegion.equations += createDataflowAssignment(target, source)
            }
        }
    }
    
    /**
     * Find the output valued object of the given ssa list
     */
    def ValuedObject findOutputVar(List<ValuedObject> varList) {
        var ValuedObject vo = null
        
        for (var i = 0; (i < varList.length) && (vo === null); i++) {
            var varName = varList.get(i).getName
            if (varName.contains(outSuffix)) {
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
     * Returns true if the expressions definitely contain the same value. Currently only considers constant values as
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
        var assignments = <Assignment> newArrayList
        var Assignment ass = null
        // Only if the binary expression is an assignment some work is needed
        if (operator == IASTBinaryExpression.op_assign) {
            var sourceExpr = binExpr.children.get(1)
            var Expression source = null
            // If source expression is a variable read retrieve the respective VO
            if (sourceExpr instanceof IASTIdExpression) {
                source = funcState.findValuedObjectByName((sourceExpr as IASTIdExpression).getName.toString, false, dRegion).reference
            // Translate the expression that is meant to be assigned
            } else if (sourceExpr instanceof IASTBinaryExpression) {
                source = createKExpression(sourceExpr, funcState, dRegion)
            } else if (sourceExpr instanceof IASTUnaryExpression) {
                source = createKExpression(sourceExpr, funcState, dRegion)
            // Translate a function call that will be assigned
            } else if (sourceExpr instanceof IASTFunctionCallExpression) {
                // Create the function reference
                source = createFunctionCall(sourceExpr, funcState, dRegion)
            // Create a value expression for a literal    
            } else if (sourceExpr instanceof IASTLiteralExpression){
                
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
     * Translate a function call expression and add it to the dataflow region.
     * 
     * @param expression The function call expression to translate into SCCharts.
     * @param state The surrounding state where this function call should be added to.
     * @param dRegion The dataflow region where this dunction call should be added to.
     * @return A reference to the valued object for this function call.
     */
    def ValuedObjectReference createFunctionCall(IASTFunctionCallExpression expression, State state, DataflowRegion dRegion) {
        val refState = findFunctionState(expression, dRegion)
        
        // Find an existing reference to this state the reference
        var ReferenceDeclaration refDecl = dRegion.declarations.filter(ReferenceDeclaration).findFirst[
            it.reference === refState
        ]
        // Create a new reference if none was found yet
        if (refDecl === null) {
            refDecl = createReferenceDeclaration
            refDecl.setReference(refState)
            refDecl.annotations += createTagAnnotation("hide")
            dRegion.declarations += refDecl
        }
        
        // Create a valued object for the referenced state
        val refObj = refDecl.createValuedObject(refState.name)
        refObj.insertHighlightAnnotations(expression)
        
        // Create all assignments for the function call
        var index = 0
        for (argument : expression.arguments) {
            // Create the assignments from the function inputs to inputs of the referenced state.
            val argExpr = argument.createKExpression(state, dRegion)
            val stateDeclarations = refState.declarations.filter(VariableDeclaration)
            val inputVOs  = stateDeclarations.filter[it.isInput] .map[it.valuedObjects].flatten
            val outputVOs = stateDeclarations.filter[it.isOutput].map[it.valuedObjects].flatten
                .filter[it.name != returnObjectName + outSuffix]
            val inputVO = inputVOs.get(index)
            dRegion.equations += createDataflowAssignment(refObj, inputVO, argExpr)
            
            // Create the assignments from the referenced state's outputs to the corresponding
            // previous input VOs.
            val outputVO = outputVOs.findFirst[
                it                 .name.substring(0, it     .name.length - outSuffix.length)
                    .equals(inputVO.name.substring(0, inputVO.name.length -  inSuffix.length))
            ]
            if (outputVO !== null && argExpr instanceof ValuedObjectReference) {
                // Search for the VO in the surrounding state that was given as the argument
                val variableVOName = (argExpr as ValuedObjectReference).valuedObject.name
                val outputToVO = findValuedObjectByName(state,
                    variableVOName.substring(0, variableVOName.indexOf(ssaNameSeperator)), true, dRegion)
                
                val assignment = SCChartsFactory.eINSTANCE.createDataflowAssignment => [
                    it.reference = outputToVO.reference
                    it.expression = refObj.reference => [
                        it.subReference = outputVO.reference
                    ]
                ]
                
                dRegion.equations += assignment
            }
            index++
        }
        
        // Wire the sub-reference to the output VO of the reference state.
        return refObj.reference.outputReference(refState, returnObjectName + outSuffix) 
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
                kExpression = createFunctionCall(expr, funcState, dRegion)
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
            IASTTypeIdExpression: {
                val declSpecifier = expr.typeId.declSpecifier
                if (declSpecifier instanceof IASTSimpleDeclSpecifier) {
                    val inputType = declSpecifier.type.cdtTypeConversion
                    val inputTypeName = nodeToString(expr, sourceFile)
                    kExpression = createSizeofState(null, inputType, inputTypeName, dRegion)
                }
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
        // Retrieve the operator and create the operatorExpression
        var opType = unExpr.getOperator.cdtUnaryOpTypeConversion
        var OperatorExpression unKExpr
        
        // Test if the operator is a simple translatable operator.
        if (opType !== null) {
            unKExpr = opType.createOperatorExpression
            // Attach the operand
            var operand = unExpr.getOperand
            unKExpr.subExpressions += operand.createKExpression(funcState, dRegion)
            return unKExpr
        } else {
            // If the operator is not translatable as an KExpression OperatorType, check for some
            // special cases that we do handle.
            switch (unExpr.getOperator) {
                case IASTUnaryExpression.op_sizeof: {
                    // sizeof will get translated to a new sizeof operator box
                    // First, translate its operand as the input for the sizeof.
                    var operand = unExpr.getOperand
                    val sizeofInput = operand.createKExpression(funcState, dRegion)
                    
                    // Create the operator as a sizeof state that gets wired up in its parent dataflow region.
                    
                    return createSizeofState(sizeofInput, ValueType::INT, null, dRegion)
                }
                default: {
                    // Otherwise, translate the operand
                    var operand = unExpr.getOperand
                    return operand.createKExpression(funcState, dRegion)
                }
            }
        }
    }
    
    /**
     * Creates a new state for the sizeof expression.
     * 
     * @param sizeofInput The expression that is the input for this expression, or {@code null} if there is no input.
     * @param inputType The input type as a ValueType.
     * @param nodeName The name of the node, or null. Is only used if {@code sizeofInput} is null, this string is shown
     *                 as a label instead.
     * @param dRegion The region the state for this sizeof expression should be put in.
     * @return A reference to the created state's valued object.
     */
    def ValuedObjectReference createSizeofState(Expression sizeofInput, ValueType inputType, String nodeName,
        DataflowRegion dRegion) {
        val label = if (sizeofInput === null) {
            nodeName
        } else {
            sizeofName
        }
        
        val sizeofState = createState(label)
        sizeofState.createDataflowRegion(label) => [
            it.label = label
        ]
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(sizeofState)
        val sizeofObject = refDecl.createValuedObject(label)
        
        // Input
        if (sizeofInput !== null) {
            val sizeofInputDecl = createVariableDeclaration => [
                type = inputType
                input = true
            ]
            sizeofState.declarations += sizeofInputDecl
            val sizeofInputVO = sizeofInputDecl.createValuedObject(inSuffix)
            sizeofInputVO.label = ""
            
            dRegion.equations += createDataflowAssignment(sizeofObject, sizeofInputVO, sizeofInput)
        }
        
        // Output
        val sizeofOutputDecl = createVariableDeclaration => [
            type = ValueType::INT
            output = true
        ]
        sizeofState.declarations += sizeofOutputDecl
        val sizeofOutputVO = sizeofOutputDecl.createValuedObject(outSuffix)
        sizeofOutputVO.label = ""
        
        return sizeofObject.reference => [
            subReference = sizeofOutputVO.reference
        ]
    }
    
    /**
     * Adds the sub reference to the output valued object of the given reference in the state.
     * 
     * @param reference The reference of which to modify the sub reference.
     * @param referenceState The state this reference belongs to.
     * @return The same reference, for convenience.
     */
    def ValuedObjectReference outputReference(ValuedObjectReference reference, State referenceState, String objectName) {
        return reference => [
            subReference = referenceState.declarations.filter(VariableDeclaration)
                .map[ it.valuedObjects ].flatten
                .filter [ name == objectName ].head.reference
        ]
    }

}
