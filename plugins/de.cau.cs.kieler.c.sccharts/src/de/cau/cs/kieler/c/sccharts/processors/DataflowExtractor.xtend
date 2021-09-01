/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2019,2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.c.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.TagAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.c.sccharts.extensions.CDTConvertExtensions
import de.cau.cs.kieler.c.sccharts.extensions.HighlightingExtensions
import de.cau.cs.kieler.c.sccharts.extensions.ValueExtensions
import de.cau.cs.kieler.c.sccharts.util.CProcessorUtils
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
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
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
import java.util.Set
import org.eclipse.cdt.core.CCorePlugin
import org.eclipse.cdt.core.dom.ast.ASTNodeFactoryFactory
import org.eclipse.cdt.core.dom.ast.IASTArrayDeclarator
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression
import org.eclipse.cdt.core.dom.ast.IASTBreakStatement
import org.eclipse.cdt.core.dom.ast.IASTCaseStatement
import org.eclipse.cdt.core.dom.ast.IASTCastExpression
import org.eclipse.cdt.core.dom.ast.IASTCompositeTypeSpecifier
import org.eclipse.cdt.core.dom.ast.IASTCompoundStatement
import org.eclipse.cdt.core.dom.ast.IASTConditionalExpression
import org.eclipse.cdt.core.dom.ast.IASTContinueStatement
import org.eclipse.cdt.core.dom.ast.IASTDeclSpecifier
import org.eclipse.cdt.core.dom.ast.IASTDeclarationStatement
import org.eclipse.cdt.core.dom.ast.IASTDefaultStatement
import org.eclipse.cdt.core.dom.ast.IASTDoStatement
import org.eclipse.cdt.core.dom.ast.IASTElaboratedTypeSpecifier
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer
import org.eclipse.cdt.core.dom.ast.IASTExpression
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement
import org.eclipse.cdt.core.dom.ast.IASTFieldReference
import org.eclipse.cdt.core.dom.ast.IASTForStatement
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression
import org.eclipse.cdt.core.dom.ast.IASTFunctionDeclarator
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTIdExpression
import org.eclipse.cdt.core.dom.ast.IASTIfStatement
import org.eclipse.cdt.core.dom.ast.IASTInitializer
import org.eclipse.cdt.core.dom.ast.IASTInitializerList
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IASTName
import org.eclipse.cdt.core.dom.ast.IASTNamedTypeSpecifier
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle
import org.eclipse.cdt.core.dom.ast.IASTNullStatement
import org.eclipse.cdt.core.dom.ast.IASTPointer
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
import org.eclipse.cdt.core.index.IIndex
import org.eclipse.cdt.core.index.IIndexBinding
import org.eclipse.cdt.core.model.CoreModel
import org.eclipse.cdt.core.model.ICProject
import org.eclipse.cdt.core.model.ITranslationUnit
import org.eclipse.cdt.internal.core.dom.parser.ASTNode
import org.eclipse.core.resources.IResource
import org.eclipse.emf.common.util.EList

import static de.cau.cs.kieler.c.sccharts.processors.CDTToStringConverter.*
import com.sun.jdi.InvocationException
import org.eclipse.cdt.internal.core.dom.parser.c.CASTDesignatedInitializer
import org.eclipse.cdt.core.dom.ast.c.ICASTDesignatedInitializer
import org.eclipse.cdt.core.dom.ast.c.ICASTFieldDesignator
import org.eclipse.cdt.core.dom.ast.c.ICASTArrayDesignator

/**
 * A Processor analyzing the data flow of functions within a single file of a C project and visualizing it as actor-
 * based dataflow with {@link SCCharts}.
 * 
 * @author lan, nre
 */
@SuppressWarnings("all","unchecked")
class DataflowExtractor extends ExogenousProcessor<CodeContainer, SCCharts> {

    @Inject extension AnnotationsExtensions
    @Inject extension CDTConvertExtensions
    @Inject extension HighlightingExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension PragmaExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension ValueExtensions

    /**
     * If the model should be serializable. Could be read from a comment in the code, currently is just hardcoded though
     */
    // true, in a more complicated way to avoid warnings all over the place.
    static final boolean serializable = true ? true : false

    /** The seperator for valued object names and its further SSA objects. */
    static final String ssaNameSeperator = serializable ? "_" : " "

    /**
     * The name of the valued objects for returns.
     * Starts with a whitespace prefix so that it is not possible to clash with real variable names.
     */
    static final String returnObjectName = ssaNameSeperator + "res"

    static final String hiddenVariableName = ssaNameSeperator + "cond_res"

    /** The variable name for the conditional expression result */
    static final String conditionalResultName = ssaNameSeperator + "conditional"

    /** The valued object suffix for the input SSA object. */
    static final String inSuffix = ssaNameSeperator + "in"
    /** The valued object suffix for the output SSA object. */
    static final String outSuffix = ssaNameSeperator + "out"
    /** The name prefix of function parameters with an unknown name. */
    static final String unknownParamName = "param"

    /** Shown name prefix for if statements. */
    static final String ifName = "if"
    /**Shown name prefix for conditions of if/while statements. */
    static final String condName = "cond"
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
    /** Shown name prefix for while-body statements. */
    static final String whileBodyName = "body"
    /** Shown name prefix for switch statements. */
    static final String switchName = "switch"
    /** Shown name prefix for case statements. */
    static final String caseName = "case"
    /** Shown name prefix for default case statements in switches. */
    static final String defaultCaseName = "default"
    /** Shown name for break statements in loops. */
    static final String breakName = "break"
    /** Shown name for continue statements in loops. */
    static final String continueName = "continue"
    /** Shown name for multiplexer. */
    static final String multiplexerName = "M"
    /** Shown name for return multiplexer. */
    static final String returnName = "return"

    /** Name for the return combine state. */
    static final String returnCombineName = " returnCombine"
    /** Name for the sizeof state. */
    static final String sizeofName = " sizeof"

    /** Tag annotation string for custom multiplexers*/
    static final String multiplexerTag = "mult"
    /** Tag annotation string of the port group for the positive case in custom multiplexers */
    static final String posTag = "pos"
    /** Tag annotation string of the port group for the negative case in custom multiplexers */
    static final String negTag = "neg"
    /** Tag annotation string for structs */
    static final String structTag = "struct"
    /** Tag annotation string for unions */
    static final String unionTag = "union"

    /** annotation for break/continue/return multiplexer states that saves in which if stmt the break/continue/return is in */
    static final String ifStmtAnno = "ifCounter"

    /** The index for the project the translated file is in, or null if none found. */
    var IIndex index
    /** 
     * Mapping for a function-unique object to to map to the SCCharts state created for it.
     * Either an {@link IIndexBinding} if an index for the project the translated file lies in could be created,
     * or a String identifying the function's name otherwise, together with an int for the number of parameters.
     */
    var functions = <Object, Map<Integer, State>>newHashMap
    var ifCounter = 0;
    var swCounter = 0;
    var caseCounter = 0;
    var forCounter = 0;
    var whileCounter = 0;
    var doCounter = 0;
    var referenceCounter = 0;
    var returnCombineCounter = 0;
    var sizeofCounter = 0;
    var breakCounter = 0;
    var continueCounter = 0;
    var multiplexerCounter = 0;
    var breakCondsCounter = 0;
    var returnCounter = 0;

    // needed to add break/continue states to the correct while state
    /** the recent while region that was created */
    var DataflowRegion lastWhileRegion = null
    /** the top if-state in a while-stmt that contains the break stmt */
    var State topIfState = null
    /** flag whether a break or continue statement is in a while statement */
    var breakContinueFlag = false
    // needed to add return states to the correct function state
    /** the recent function region that was created */
    var DataflowRegion lastFuncRegion = null

    /** parent region of a state */
    val Map<State, DataflowRegion> hierarchy = newHashMap

    /** the corresponding valued object of a state */
    val Map<State, ValuedObject> stateObjects = newHashMap

    /** the valued objects of the local vars that are used for the break/continue/return states */
    val Map<ValuedObject, ValuedObject> breakContinueVars = newHashMap

    val Map<State, Map<String, List<ValuedObject>>> valuedObjects = newHashMap

    /** The valued objects the pointers points to. */
    val Map<State, Map<String, ValuedObject>> pointerVariables = newHashMap

    /** All pointers of a state */
    val Map<State, Set<String>> pointers = newHashMap

    /** All pointers that are parameters of the state. */
    val Map<State, List<String>> parameterPointers = newHashMap

    /** All global variables */
    val Map<String, IASTDeclSpecifier> globalVars = newHashMap

    val String addressOp = "~"

    /** the function identifiers to which the state has a dependency regarding global variables 
     * that is not resolved yet. */
    val Map<State, List<Object>> unresolvedFuncDependencies = newHashMap

    /** Maps the valuedObject of an array to the set of written indices. The indices of each write a stored in a list. */
    val voWrittenIdxs = <ValuedObject, Set<List<Expression>>>newHashMap

    /** Maps the valuedObject of an array to the set of read indices. The indices of each read a stored in a list. */
    val voReadIndices = <ValuedObject, Set<List<Expression>>>newHashMap

    var ValueType currentReturnType = null

    /** The file contents, for referencing direct String representations. */
    var byte[] sourceFile

    /** 
     * The root SCCharts container of the model. Contains every function as a state, or every function and other
     * constructs modeled as states if the {@code serializable} flag is set.
     */
    var SCCharts rootSCChart

    override String getId() {
        return "de.cau.cs.kieler.c.sccharts.dataflowExtractor"
    }

    override String getName() {
        return "Dataflow Extractor"
    }

    /**
     * Getter to access the state variable map.
     * 
     * @param the scoping state containing the variables.
     * @return the used variables (as valued object lists) for the given state
     */
    def getStateVariables(State state) {
        var Map<String, List<ValuedObject>> stateVariables = null
        if (valuedObjects.containsKey(state)) {
            stateVariables = valuedObjects.get(state)
        } else {
            stateVariables = newHashMap
            valuedObjects.put(state, stateVariables)
        }
        return stateVariables
    }

    /**
     * Getter to access the pointer  map.
     * 
     * @param the scoping state containing the variables.
     * @return the pointers (as string set) for the given state
     */
    def getStatePointers(State state) {
        var Set<String> statePointers = null
        if (pointers.containsKey(state)) {
            statePointers = pointers.get(state)
        } else {
            statePointers = newHashSet
            pointers.put(state, statePointers)
        }
        return statePointers
    }

    /**
     * Getter to access the pointer variable map.
     * 
     * @param the scoping state containing the variables.
     * @return the pointers with the valuedobjects they point to (as map) for the given state
     */
    def getStateVarPointers(State state) {
        var Map<String, ValuedObject> statePointers = null
        if (pointerVariables.containsKey(state)) {
            statePointers = pointerVariables.get(state)
        } else {
            statePointers = newHashMap
            pointerVariables.put(state, statePointers)
        }
        return statePointers
    }

    
    /**
     * Getter to access the function dependencies list.
     * 
     * @param the scoping state containing the functions.
     * @return the unresolved function dependencies for the given state
     */
    def getUnresFuncDeps(State state) {
        var List<Object> deps = null
        if (unresolvedFuncDependencies.containsKey(state)) {
            deps = unresolvedFuncDependencies.get(state)
        } else {
            deps = newArrayList
            unresolvedFuncDependencies.put(state, deps)
        }
        return deps
    }
    
    override void process() {
        val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
        var now = LocalDateTime.now

        println("Starting Dataflow Extractor - Time: " + dtf.format(now))
        val container = getModel

        val model = container.transform

        now = LocalDateTime.now
        println("Dataflow Extractor finished - Time: " + dtf.format(now))

        setModel(model)
    }

    def SCCharts transform(CodeContainer codeContainer) {
        val infrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        var IASTTranslationUnit ast

        // First, try to find the C/C++ project this file is defined in and create the AST and index from there.
        try {
            val ICProject[] allProjects = CoreModel.getDefault().getCModel().getCProjects();
            var IResource resource
            var ICProject project
            var boolean break = false
            for (var int i = 0; i < allProjects.size && !break; i++) {
                project = allProjects.get(i)
                resource = CProcessorUtils.findFileInProject(infrastructure.modelFile, project)
                if (resource !== null) {
                    break = true
                }
            }
            var ITranslationUnit tu = CoreModel.^default.create(resource) as ITranslationUnit
            ast = tu.getAST
            index = CCorePlugin.getIndexManager().getIndex(project);
        } catch (Throwable t) { /* Ignore. */
        }

        // If the previous method was not successful, build the AST only from the file without context and the index.
        if (ast === null) {
            ast = CProcessorUtils.findAstNoProject(environment)
        }

        // If we still do not have an AST, abort.
        if (ast === null) {
            return null
        }
        // Remember the file contents as well for direct string representations in the diagram.
        if (ast instanceof ASTNode) {
            val String filePath = ast.filePath
            if (filePath !== null) {
                sourceFile = Files.readAllBytes(Paths.get(filePath))
            }
        }

        // Create SCCharts root elements
        rootSCChart = createSCChart

        rootSCChart.pragmas.add(createStringPragma("skinpath", "dataflow"))

        // Make sure to always have the read lock on the index here and releasing it eventually.
        index?.acquireReadLock
        try {
            // collect definitions of global variables
            val varDefs = ast.children.filter(IASTSimpleDeclaration).filter([
                it.declSpecifier instanceof IASTSimpleDeclSpecifier ||
                    it.declSpecifier instanceof IASTElaboratedTypeSpecifier ||
                    it.declSpecifier instanceof IASTCompositeTypeSpecifier
            ])
            for (vDef : varDefs) {
                for (decl : vDef.declarators) {
                    // exclude function definitions
                    if (!(vDef.declarators.get(0) instanceof IASTFunctionDeclarator)) {
                        val name = decl.name.toString
                        globalVars.put(name, vDef.declSpecifier)
                    }
                }
            }
            
            //retrieveStructFieldNames(structDefs)
            // Interesting index functions:
            // findBinding(IName name) 
            // findReferences(IBinding binding) 
            // findDeclarations(IBinding binding)
            // findDefinitions(IBinding binding)
            val functionDefinitions = ast.children.filter(IASTFunctionDefinition)
            // Build a scaffold for referencing all defined states in this file for each defined function.
            for (functionDefinition : functionDefinitions) {
                val state = createFunctionScaffold(functionDefinition)
                rootSCChart.rootStates += state
            }
            
            // resolve unresolved function dependencies regarding global variables
            val Set<State> resStates = newHashSet
            for (state : unresolvedFuncDependencies.keySet) {
                resolveGlobalVars(state, resStates)
            }
            
            // Go through each function definition again and fill in the scaffolds now that all detailed functions are
            // known.
            for (functionDefinition : functionDefinitions) {
                fillFunctionScaffold(functionDefinition)
            }
        } finally {
            index?.releaseReadLock
        }

        return rootSCChart
    }
    
    /**
     * Resolves the dependencies of the given {@code state} regarding global variables. 
     * @param state The state for which the dependencies should be resolved.
     * @param resStates Set that contains the states for which no dependencies are left
     */
    private def void resolveGlobalVars(State state, Set<State> resStates) {
        if (!resStates.contains(state)) {
            val depStates = unresolvedFuncDependencies.get(state)
            // determine the global variables that are needed as input/output
            val inputs = <String>newHashSet
            val outputs = <String>newHashSet
            for (uniqueFunctionIdentifier : depStates) {
                // function must be in scope
                if (functions.containsKey(uniqueFunctionIdentifier)) {
                    val depState = functions.get(uniqueFunctionIdentifier).values.head
                    // if the depend state has itself dependencies, these must be resolved first
                    if (unresolvedFuncDependencies.containsKey(depState)) {
                        resolveGlobalVars(depState, resStates)
                    }
                    // check the stateVariables for global variables
                    val stateVars = getStateVariables(depState)
                    for (sVar : stateVars.keySet) {
                        if (globalVars.containsKey(sVar)) {
                            inputs += sVar
                            if(!stateVars.get(sVar).filter[it.isOutput].isEmpty) outputs += sVar
                        }
                    }
                }
            }
            // add the global variables to the current state
            addGlobalVarsAsInput(inputs, state)
            addGlobalVarsAsOutput(outputs, state)

            resStates.add(state)
        }
    }

    /**
     * Creates an {@link SCCharts} {@link State} scaffold for the given function definition with all in- and outputs
     * set, but a yet empty contained dataflow region. To fill that, call
     * {@link #fillFunctionScaffold(IASTFunctionDefinition)} after scaffolding all functions that should be visualized.
     */
    def State createFunctionScaffold(IASTFunctionDefinition func) {
        // Determine function name
        val funcDeclarator = func.getDeclarator
        val funcName = funcDeclarator.getName
        val uniqueFunctionIdentifier = CProcessorUtils.nameToIdentifier(funcName, index)

        // Determine the number of parameters.
        var int params = 0;
        if (funcDeclarator instanceof IASTStandardFunctionDeclarator) {
            params = funcDeclarator.getParameters.size
        }

        // Create the state
        val State state = createState(funcName.toString + ssaNameSeperator + params)
        state.label = funcName.toString
        val map = <Integer, State>newHashMap
        map.put(params, state)
        functions.put(uniqueFunctionIdentifier, map)
        state.label = funcName.toString

        if (!serializable) {
            // Insert text highlighting annotations
            state.insertHighlightAnnotations(func)
        }

        // Create a hashmap for the functions valued objects if needed
        val Map<String, List<ValuedObject>> stateVariables = getStateVariables(state)

        // Create inputs for the functions parameters
        if (funcDeclarator instanceof IASTStandardFunctionDeclarator) {
            val parameters = funcDeclarator.getParameters
            val Map<ValueType, VariableDeclaration> declarations = newHashMap
            for (par : parameters) {
                val declSpecifier = par.getDeclSpecifier
                // Determine parameter name
                val varName = par.getDeclarator.getName.toString
                var ValuedObject vo = null
                val varList = <ValuedObject>newArrayList
                switch (declSpecifier) {
                    IASTSimpleDeclSpecifier: {
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

                        // Create valued object for the input
                        vo = decl.createValuedObject(varName + inSuffix)
                    vo.label = varName
                    }
                    IASTElaboratedTypeSpecifier: {
                        // the parameter is a struct (pointer)
                        // struct should not have a label in order to visualize the used indices
                        val structName = declSpecifier.name.toString
                        val variableDeclaration = createVariableDeclaration
                        state.declarations += variableDeclaration

                        // Use Host Type for setting the struct type since our structs are represented as array-like valued objects
                        variableDeclaration.type = ValueType.HOST
                        variableDeclaration.hostType = elaboratedKindToString(declSpecifier.kind) + " " + structName
                        variableDeclaration.input = true

                        vo = variableDeclaration.createValuedObject(varName + inSuffix)
                        addElaboratedTag(vo, declSpecifier.kind)
                    }
                    IASTNamedTypeSpecifier: {
                        // the parameter has a unknown type
                        val typeName = declSpecifier.name.toString
                        val variableDeclaration = createVariableDeclaration
                        state.declarations += variableDeclaration

                        // Use Host Type
                        variableDeclaration.type = ValueType.HOST
                        variableDeclaration.hostType = typeName
                        variableDeclaration.input = true

                        vo = variableDeclaration.createValuedObject(varName + inSuffix)
                    }
                }
                if (vo !== null) {
                    if (!serializable) {
                        vo.insertHighlightAnnotations(par)
                    }
    
                    // Attach the valued object to its list and the list to the map
                    varList.add(vo)
                    stateVariables.put(varName, varList)
                }
            }
        }
        
        // add used global variables as input and where necessary as output
        val inputs = findInputs(func.body, state).filter[v | globalVars.containsKey(v)].toSet()
        val Map<String, String> pointers = newHashMap
        val outputs = findOutputs(func.body, state, pointers, true).filter[v | globalVars.containsKey(v)].toSet()
        inputs.addAll(outputs)
        addGlobalVarsAsInput(inputs, state)
        addGlobalVarsAsOutput(outputs, state)

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
        
        // TODO: determine array/pointer function outputs.
        // Easy approach: every array/pointer is written to and set as output.
        // Medium approach (as done here): For each function, determine if the array/pointed variable is written to directly.
        // Complex approach: same as medium, just also include analysis of renamed array/pointer variables and tracking it
        // through function call hierarchies.  
        // For each array/pointer parameter, determine if it has been written to in the function
        // by analyzing the valued objects for said parameter. If written to, add another output
        // declaration with an assignment of the final value to that output declaration.
        if (funcDeclarator instanceof IASTStandardFunctionDeclarator) {
            val parameters = funcDeclarator.getParameters
            val List<String> parList = newArrayList
            parameters.forEach [
                if (it.declarator.pointerOperators !== null && !it.declarator.pointerOperators.isEmpty) {
                    val name = it.getDeclarator.getName.toString
                    parList.add(name)
                    getStatePointers(state).add(name)
                }
            ]
            parameterPointers.put(state, parList)
            val Map<String, String> ps = newHashMap
            val changedVars = findOutputs(func.body, state, ps, true)
            for (par : parameters) {
                val parName = par.getDeclarator.getName.toString
                val isArray = par.getDeclSpecifier instanceof IASTSimpleDeclSpecifier &&
                    par.declarator instanceof IASTArrayDeclarator
                val isPointer = par.declarator.pointerOperators !== null && !par.declarator.pointerOperators.isEmpty
                val isStructPointer = par.declSpecifier instanceof IASTElaboratedTypeSpecifier
                val unknownType = par.declSpecifier instanceof IASTNamedTypeSpecifier
                if (isArray || (isPointer && changedVars.contains(parName))) {
                    // Determine parameter name
                    val varName = par.getDeclarator.getName.toString
                    val varList = stateVariables.get(varName)
                    // Create output declaration                    
                    val outDecl = createVariableDeclaration
                    // determine type
                    if (isArray) {
                        outDecl.type = (outputDeclSpecifier as IASTSimpleDeclSpecifier).type.cdtTypeConversion
                    } else if (unknownType) {
                        val typeName = (par.declSpecifier as IASTNamedTypeSpecifier).name.toString
                        outDecl.type = ValueType.HOST
                        outDecl.hostType = typeName
                    } else if (isStructPointer) {
                        // the parameter is a struct (pointer)
                        val specifier = (par.declSpecifier as IASTElaboratedTypeSpecifier)
                        val structName = (par.declSpecifier as IASTElaboratedTypeSpecifier).name.toString
                        outDecl.type = ValueType.HOST
                        outDecl.hostType = elaboratedKindToString(specifier.kind) + " " + structName
                    } else {
                        // parameter is a pointer
                        outDecl.type = (par.declSpecifier as IASTSimpleDeclSpecifier).type.cdtTypeConversion
                    }

                    outDecl.output = true
                    state.declarations += outDecl

                    // Create valued object for the output.
                    val outputVo = outDecl.createValuedObject(varName + outSuffix)
                    outputVo.label = varName
                    if (!serializable) {
                        outputVo.insertHighlightAnnotations(par)
                    }

                    // Attach the valued object to its list.
                    varList.add(outputVo)
                }
            }
        }

        return state
    }

    /**
     * Creates for each name of the set {@code names} an input variable in the given {@code state}
     * 
     * @param names The names of the variables that should be create
     * @param state The state for which input variables should be created.
     */
    private def addGlobalVarsAsInput(Set<String> names, State state) {
        val Map<ValueType, VariableDeclaration> declarations = newHashMap
        val Map<String, VariableDeclaration> hostDeclarations = newHashMap
        for (varName : names) {
            // prevent the case that global variables are created several times
            if (!getStateVariables(state).containsKey(varName) || getStateVariables(state).get(varName).filter [
                it.isInput
            ].isEmpty) {
                // determine type
                val declSpec = globalVars.get(varName)
                var ValueType type
                var String hostType
                var isStruct = false
                var kind = -1
                switch (declSpec) {
                    IASTSimpleDeclSpecifier: {
                        // primitive type, pointer or array
                        type = declSpec.type.cdtTypeConversion
                    }
                    IASTElaboratedTypeSpecifier: {
                        // struct
                        kind = declSpec.kind
                        hostType = elaboratedKindToString(kind) + " " + declSpec.name.toString
                        type = ValueType.HOST
                        isStruct = true
                    }
                    IASTCompositeTypeSpecifier: {
                        // struct
                        kind = declSpec.key
                        hostType = elaboratedKindToString(kind) + " " + declSpec.name.toString
                        type = ValueType.HOST
                        isStruct = true
                    }
                    default: {
                        type = ValueType.INT
                        println(type + " is not supported as global variable. Default type INT is used.")
                    }
                }
                // create variable declaration
                if (type !== ValueType.HOST && !declarations.containsKey(type)) {
                    val newDecl = createVariableDeclaration
                    state.declarations += newDecl
                    newDecl.type = type
                    newDecl.input = true
                    declarations.put(type, newDecl)
                } else if (type === ValueType.HOST && !hostDeclarations.containsKey(hostType)) {
                    val newDecl = createVariableDeclaration
                    state.declarations += newDecl
                    newDecl.type = type
                    newDecl.hostType = hostType
                    newDecl.input = true
                    hostDeclarations.put(hostType, newDecl)
                }

                // create the vo and add it to the stateVariables list
                val decl = declarations.get(type) ?: hostDeclarations.get(hostType)
                val vo = decl.createValuedObject(varName + inSuffix)
                vo.label = varName
                
                if(isStruct){
                    addElaboratedTag(vo, kind)
                }

                val stateVariables = getStateVariables(state)
                val varList = <ValuedObject>newArrayList
                varList.add(vo)
                stateVariables.put(varName, varList)
            }
        }
    }
    
    /**
     * Creates for each name of the set {@code names} an output variable in the given {@code state}.
     * 
     * @param names The names of the variables that should be created.
     * @param state The state for which output variables should be created.
     */
    private def addGlobalVarsAsOutput(Set<String> names, State state) {
        for (varName : names) {
            // prevent the case that global variables are created several times
            if (getStateVariables(state).get(varName).filter[it.isOutput].isEmpty) {
                // determine type
                val declSpec = globalVars.get(varName)
                var ValueType type
                var String hostType
                var isStruct = false
                var kind = -1
                switch (declSpec) {
                    IASTSimpleDeclSpecifier: {
                        // primitive type, pointer or array
                        type = declSpec.type.cdtTypeConversion
                    }
                    IASTElaboratedTypeSpecifier: {
                        // struct
                        kind = declSpec.kind
                        hostType = elaboratedKindToString(kind) + " " + declSpec.name.toString
                        type = ValueType.HOST
                        isStruct  = true
                    }
                    IASTCompositeTypeSpecifier: {
                        // struct
                        kind = declSpec.key
                        hostType = elaboratedKindToString(kind) + " " + declSpec.name.toString
                        type = ValueType.HOST
                        isStruct = true
                    }
                    default: {
                        type = ValueType.INT
                        println(type + " is not supported as global variable. Default type INT is used.")
                    }
                }
                // create variable declaration
                val outDecl = createVariableDeclaration
                outDecl.type = type
                outDecl.hostType = hostType
                outDecl.output = true
                state.declarations += outDecl

                // create the vo and add it to the stateVariables list
                val vo = outDecl.createValuedObject(varName + outSuffix)
                vo.label = varName
                
                if(isStruct){
                    addElaboratedTag(vo, kind)
                }

                val stateVariables = getStateVariables(state)
                val varList = stateVariables.get(varName)
                varList.add(vo)
            }
        }
    }

    /**
     * Fills a scaffolded {@link SCCharts} {@link State} for the given function definition and fills its contained
     * dataflow region. The scaffolds for all references states need to be created first by
     * {@link #createFunctionScaffold(IASTFunctionDefinition)}.
     */
    def void fillFunctionScaffold(IASTFunctionDefinition func) {
        
        // Determine function name
        val funcDeclarator = func.getDeclarator
        val funcName = funcDeclarator.getName
        val uniqueFunctionIdentifier = CProcessorUtils.nameToIdentifier(funcName, index)

        // Fetch the state
        val state = functions.get(uniqueFunctionIdentifier).values.head

        // Translate function body
        val body = func.getBody
        var DataflowRegion bodyRegion
        if (body instanceof IASTCompoundStatement) {
            bodyRegion = buildCompound(body, state)
            state.regions += bodyRegion
            bodyRegion.label = funcName.toString
        } else {
            println("ERROR: Body of " + funcName.toString + " is not a Compound Statement!")
        }
    }
    
    /**
     * Create a state representation for a call of an undefined function. The in- and outputs are either guessed by
     * the function call or determined by looking for the function in the AST/index.
     * 
     * @param funcName The name this function state should have.
     * @param funcCall The AST function call expression of which to get the data from to create the state.
     * @param parentState The parent state that will be containing this state, for reference.
     * @param dRegion The parent dataflow region that will be containing this state, for reference.
     * @return A new state for a function unknown in the AST.
     */
    def State createUnknownFunctionScaffold(IASTName funcName, IASTFunctionCallExpression funcCall, State parentState,
        DataflowRegion dRegion) {
        val params = funcCall.arguments.size
        // Create the state
        val state = createState(funcName.toString + ssaNameSeperator + params)
        state.label = funcName.toString
        state.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += state
        }
        state.label = funcName.toString
        val bodyRegion = state.createDataflowRegion(funcName.toString)
        bodyRegion.label = funcName.toString

        // Create an output
        val outputDecl = createVariableDeclaration
        outputDecl.output = true
        outputDecl.type = ValueType::INT
        state.declarations += outputDecl
        val outputVO = outputDecl.createValuedObject(returnObjectName + outSuffix)
        outputVO.label = returnObjectName

        // Create inputs for the functions parameters.
        // Additionally, for each array/pointer argument also add an output as the function could potentially write to
        // it.
        val declaration = createVariableDeclaration
        declaration.input = true
        declaration.type = ValueType::INT
        state.declarations += declaration
        for (arg : funcCall.arguments) {
            var needsOutput = true
            // Determine parameter name and label
            var String varName
            var String varLabel
            if (arg instanceof IASTIdExpression) {
                varName = arg.getName.toString
                varLabel = varName
                val parentDeclarations = dRegion.declarations.filter(VariableDeclaration)
                val varName_ = varName
                val inputVO = parentDeclarations.map[it.valuedObjects].flatten.findFirst [
                    it.name.substring(0, it.name.lastIndexOf(ssaNameSeperator)).equals(varName_)
                ]
                if (inputVO === null || inputVO.cardinalities.empty) {
                    needsOutput = false
                }
                if (getStatePointers(parentState).contains(varName)) {
                    // argument is a pointer, so we assume, the value gets changed
                    needsOutput = true
                }
            } else if (arg instanceof IASTUnaryExpression &&
                (arg as IASTUnaryExpression).operator === IASTUnaryExpression.op_amper &&
                (arg as IASTUnaryExpression).operand instanceof IASTIdExpression) {
                val idExpression = (arg as IASTUnaryExpression).operand as IASTIdExpression
                varName = idExpression.name.toString
                varLabel = '&' + varName
                needsOutput = true
            } else {
                needsOutput = false
                varName = unknownParamName + ssaNameSeperator + funcCall.arguments.indexOf(arg)
            }

            // Create valued object for the input
            val vo = declaration.createValuedObject(varName + inSuffix)
            vo.label = varLabel
            if (!serializable) {
                vo.insertHighlightAnnotations(arg)
            }

            if (needsOutput) {
                // Create output declaration
                val outDecl = createVariableDeclaration
                outDecl.output = true
                outDecl.type = ValueType::INT
                state.declarations += outDecl

                // Create valued object for the output.
                val outputVo = outDecl.createValuedObject(varName + outSuffix)
                outputVo.label = varName
                if (!serializable) {
                    outputVo.insertHighlightAnnotations(arg)
                }
            }
        }

        // Remember this state scaffold in the map.
        val identifier = CProcessorUtils.nameToIdentifier(funcName, index)
        val map = functions.get(identifier) ?: <Integer, State>newHashMap
        map.put(params, state)
        functions.put(identifier, map)

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
    def DataflowRegion buildCompound(IASTCompoundStatement body, State bodyState,
        IASTStatement additionalDeclarations) {
        val dfRegion = createDataflowRegion("DF-" + bodyState.name)
        if (!serializable) {
            dfRegion.insertHighlightAnnotations(body)
        }

        addAdditionalDeclarations(additionalDeclarations, bodyState, dfRegion)
        
        // set the variables for the recent regions if necessary
        val saveTopIf = topIfState
        if (body.parent instanceof IASTFunctionDefinition) {
            lastFuncRegion = dfRegion
        } else if (bodyState.name.contains(whileName + ssaNameSeperator)) {
            lastWhileRegion = dfRegion
            topIfState = null;
        } else if (bodyState.name.contains(ifName + ssaNameSeperator) && topIfState === null) {
            topIfState = bodyState
        }

        // fill the dataflow region
        val statements = body.getStatements
        for (stmt : statements) {
            buildStatement(stmt, bodyState, dfRegion)
            if (bodyState.name.contains(whileName + ssaNameSeperator)) {
                // update recent while region
                lastWhileRegion = dfRegion
            }
        }
        
        topIfState = saveTopIf
        
        // if the dataflow region is for a while state and contains a break/continue statement, finalize their multiplexer states
        if (breakContinueFlag && (bodyState.name.contains(whileName + ssaNameSeperator)) ||
            body.parent instanceof IASTFunctionDefinition) {
            finalizeBreakContinueReturnStates(body, bodyState, dfRegion)
            breakContinueFlag = false
        }
        
        linkOutputs(bodyState, dfRegion)
        return dfRegion
    }

    /**
     * Determine the outputs that should be led into a break/continue/return multiplexer 
     * since they depend on whether the stmt is taken or not.
     * @param body The body of the while containing the break/continue or the body of the function containing the return stmt
     * @param ifStmt The if stmt that contains the break/continue/return
     * @param parentState The state of the surrounding while/function
     */
    private def findMultiplexerInputs(IASTCompoundStatement body, IASTIfStatement ifStmt, State parentState) {
        var stmtFound = false
        var HashSet<String> outputs = new HashSet()
        for (stmt : body.statements) {
            if (stmt instanceof IASTIfStatement && !stmtFound) {
                if (containsSearchedIfStmt(stmt as IASTIfStatement, ifStmt)) {
                    stmtFound = true
                    outputs.addAll(multiplexerDependableVarsInIfTree(ifStmt, parentState))
                }
            } else {
                if (stmtFound) {
                    val Map<String, String> ps = newHashMap
                    outputs.addAll(findOutputs(stmt, parentState, ps, true))
                }
            }
        }
        return outputs
    }

    /**
     * Checks if the passed if statement is the searched if statement or if the latter 
     *  is a parent of the passed if statement.
     */
    private def Boolean containsSearchedIfStmt(IASTIfStatement outerIf, IASTIfStatement searchedIf) {
        if (outerIf == searchedIf) {
            return true;
        }
        val thenStmts = (outerIf.thenClause as IASTCompoundStatement).statements.toList
        var List<IASTStatement> elseStmts
        var curIf = outerIf

        // collect all statements in the else clause(s)
        while (curIf.elseClause !== null && curIf.elseClause instanceof IASTIfStatement) {
            // the elseClause is of the form "else if"
            elseStmts = ((curIf.elseClause as IASTIfStatement).thenClause as IASTCompoundStatement).statements.toList
            curIf = curIf.elseClause as IASTIfStatement
        }
        if (curIf.elseClause !== null) {
            // add the statements of the last "else"
            elseStmts = (curIf.elseClause as IASTCompoundStatement).statements.toList
        }

        val List<IASTStatement> allStmts = newArrayList
        if (outerIf.elseClause !== null) {
            allStmts.addAll(elseStmts)
        }
        // add the statements in the "then" clause
        allStmts.addAll(thenStmts)

        // search all statements for the searched if-stmt
        for (s : allStmts) {
            if (s instanceof IASTIfStatement && containsSearchedIfStmt(s as IASTIfStatement, searchedIf)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Walk upwards from a nested if statement containing a break/continue/return and collect the variables that depend on whether
     * the stmt is taken or not.
     * @param seacrhedIf The if-stmt containing the break/continue/return
     * @param parentState The surrounding while/function state
     */
    private def multiplexerDependableVarsInIfTree(IASTIfStatement searchedIf, State parentState) {
        var HashSet<String> vars = <String>newHashSet

        var currentlySearchedIf = searchedIf
        var parentClause = currentlySearchedIf.parent as IASTCompoundStatement
        var ifFound = false

        while (parentClause.parent instanceof IASTIfStatement) {
            for (s : parentClause.statements) {
                // Look in the current level whether the searchedIf is present and add all variables to the result
                // that are textually changed below it
                if (!ifFound) {
                    if (s == currentlySearchedIf) {
                        ifFound = true
                    }
                } else {
                    val Map<String, String> ps = newHashMap
                    vars.addAll(findOutputs(s, parentState, ps, true))
                }
            }
            // Step one if-level upwards
            currentlySearchedIf = parentClause.parent as IASTIfStatement
            parentClause = currentlySearchedIf.parent as IASTCompoundStatement
            ifFound = false
        }
        return vars
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

        createExpression(expression, rootState, dRegion)
    }

    /**
     * Create the expression of an expression statement.
     * 
     * @param expression The expression to create.
     * @param rootState The state to link this expression to.
     * @param dRegion The region to link this expression to.
     * @return a reference to the expression value, if applicable, {@code null} otherwise.
     */
    def ValuedObjectReference createExpression(IASTExpression expression, State rootState, DataflowRegion dRegion) {
        // Translate binary and unary expressions
        switch (expression) {
            IASTBinaryExpression: {
                createBinaryAssignment(expression, rootState, dRegion)
                return null
            }
            IASTUnaryExpression: {
                createUnaryAssignment(expression, rootState, dRegion)
                return null
            }
            // Create a function call by referencing the function state  
            IASTFunctionCallExpression: {
                return createFunctionCall(expression, rootState, dRegion)
            }
            IASTConditionalExpression: {
                return createConditionalExpression(expression, rootState, dRegion)
            }
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
//        buildWhile(stmt, rootState, dRegion)
        buildWhileDF(stmt, rootState, dRegion)
    }

    /**
     * Translate Do statement
     */
    def dispatch void buildStatement(IASTDoStatement stmt, State rootState, DataflowRegion dRegion) {
        buildDo(stmt, rootState, dRegion)
    }

    /**
     * Translate Break statement
     */
    def dispatch void buildStatement(IASTBreakStatement stmt, State rootState, DataflowRegion dRegion) {
        buildBreakContinueReturn(stmt, rootState, dRegion)
    }

    /**
     * Translate Continue statement
     */
    def dispatch void buildStatement(IASTContinueStatement stmt, State rootState, DataflowRegion dRegion) {
        buildBreakContinueReturn(stmt, rootState, dRegion)
    }

    /**
     * Translate Return statement
     */
    def dispatch void buildStatement(IASTReturnStatement stmt, State rootState, DataflowRegion dRegion) {
        if (stmt.getReturnValue !== null) {
            val retKExpr = createKExpression(stmt.getReturnValue, rootState, dRegion)
            val retVO = rootState.findValuedObjectByName(returnObjectName, true, dRegion)
            if (!serializable) {
                retVO.insertHighlightAnnotations(stmt)
            }
            addEquation(dRegion, retVO, retKExpr)
        }
        // we need a multiplexer for the pointer parameters that are changed after the return
        // (if the return is not in a if-stmt, then there is no code after the return or it is unreachable and therefore we need no multiplexer)
        if(stmt.parent.parent instanceof IASTIfStatement) buildBreakContinueReturn(stmt, rootState, dRegion)
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
     * Fallback translation of any not yet covered statement. Does nothing.
     */
    def dispatch void buildStatement(IASTStatement stmt, State rootState, DataflowRegion dRegion) {
        println("DataflowExtractor: Unsupported statement class detected! " + stmt.class.name)
    }

    /**
     * Extract the body of an if Statement
     */
    def void buildIf(IASTIfStatement ifStmt, State rootState, DataflowRegion dRegion) {
        buildConditionalDF(ifStmt, ifStmt.conditionExpression, ifStmt.thenClause, ifStmt.elseClause, rootState, dRegion)
    }

    /**
     * Create a state for a conditional expression, linked with its in- and outputs.
     */
    def ValuedObjectReference createConditionalExpression(IASTConditionalExpression expr, State rootState,
        DataflowRegion dRegion) {
        buildConditional(expr, expr.logicalConditionExpression, expr.positiveResultExpression,
            expr.negativeResultExpression, rootState, dRegion)
    }

    /**
     * Build a conditional expression or statement, as in a ternary conditional expression using ? and : or an if[else]
     * construct. This variant builds the conditional in a dataflow-alike fashion with seperate then and else dataflow
     * regions connected via a conditional based on the condition.
     */
    private def ValuedObjectReference buildConditionalDF(IASTNode node, IASTExpression condition, IASTNode positive,
        IASTNode negative, State rootState, DataflowRegion dRegion) {

        val localIfCounter = ifCounter
        ifCounter++

        // Create the state to represent the if statement.
        val ifState = createState(ifName + ssaNameSeperator + localIfCounter)
        ifState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += ifState
        }

        // Create a reference for this if state in the containing dataflow-region.
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject(ifName + ssaNameSeperator + localIfCounter)
        if (!serializable) {
            ifObj.insertHighlightAnnotations(node)
        }

        hierarchy.put(ifState, dRegion)
        stateObjects.put(ifState, ifObj)

        // Set the in and outputs of the state
        setInputs(node, rootState, ifState, dRegion, ifObj)
        setOutputs(node, rootState, ifState, dRegion, ifObj)

        // Create the dataflow region for the if state
        val ifRegion = ifState.createDataflowRegion("")
        if (!serializable) {
            ifRegion.insertHighlightAnnotations(node)
        }
        ifRegion.label = ifName + ssaNameSeperator + localIfCounter

        // Create condition state, its dataflow region, and conditional obj
        val condRes = createCondDF(localIfCounter, node as IASTStatement, ifState, ifRegion)
        val condRegion = condRes.key
        val condState = condRes.value.key
        val conditionalObj = condRes.value.value

        hierarchy.put(condState, ifRegion)

        // inlining the output of the condition
        var ValuedObject condOutputVo = findCondOutputVo(condRegion, condState, conditionalObj, ifRegion)

        // Create a then state and according reference into the if dataflow region.
        val thenState = createState(ifName + ssaNameSeperator + localIfCounter + thenName)
        thenState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += thenState
        }
        val thenRefDecl = createReferenceDeclaration
        ifRegion.declarations += thenRefDecl
        thenRefDecl.setReference(thenState)
        val thenObj = thenRefDecl.createValuedObject(ifName + ssaNameSeperator + localIfCounter + thenName)
        if (!serializable) {
            thenObj.insertHighlightAnnotations(positive)
        }

        hierarchy.put(thenState, ifRegion)
        stateObjects.put(thenState, thenObj)

        // Set the inputs of the state
        setInputs(positive, ifState, thenState, ifRegion, thenObj)
        // Set the outputs of the then/else states to refer to, but do not add the equations for them yet, as we want to
        // route them into a conditional.
        setOutputs(positive, ifState, thenState, ifRegion, thenObj, false)

        // Create the region for the 'then' part
        val thenRegion = createDFRegionForNode(positive, thenState, ifState, ifRegion, thenObj)
        thenState.regions += thenRegion
        thenRegion.label = thenName

        // If an else is given the region is also created
        var State elseState
        var ValuedObject elseObj
        var DataflowRegion elseRegion
        if (negative !== null) {
            // Create an else state and according reference into the if dataflow region.
            elseState = createState(ifName + ssaNameSeperator + localIfCounter + elseName)
            elseState.annotations += createTagAnnotation("Hide")
            if (serializable) {
                rootSCChart.rootStates += elseState
            }
            val elseRefDecl = createReferenceDeclaration
            ifRegion.declarations += elseRefDecl
            elseRefDecl.setReference(elseState)
            elseObj = elseRefDecl.createValuedObject(ifName + ssaNameSeperator + localIfCounter + elseName)
            if (!serializable) {
                elseObj.insertHighlightAnnotations(negative)
            }

            hierarchy.put(elseState, ifRegion)
            stateObjects.put(elseState, elseObj)

            // Set the in and outputs of the state
            setInputs(negative, ifState, elseState, ifRegion, elseObj)
            setOutputs(negative, ifState, elseState, ifRegion, elseObj, false)

            // Create the region for the 'else' part
            elseRegion = createDFRegionForNode(negative, elseState, ifState, ifRegion, elseObj)
            elseState.regions += elseRegion
            elseRegion.label = elseName
        }

        // Create the conditional for each output of the then/else states.
        // Determine which outputs have been set in their respective state
        val Map<String, String> ps1 = newHashMap
        var positiveOutputs = findOutputs(positive, ifState, ps1, false)
        if (getStateVariables(thenState).containsKey(returnObjectName)) {
            positiveOutputs += returnObjectName
        }
        var negativeOutputs = <String>newHashSet
        if (negative !== null) {
            val Map<String, String> ps2 = newHashMap
            negativeOutputs += findOutputs(negative, ifState, ps2, false)
            if (getStateVariables(elseState).containsKey(returnObjectName)) {
                negativeOutputs += returnObjectName
            }
        }
        val HashSet<String> allOutputs = new HashSet
        allOutputs.addAll(positiveOutputs)
        allOutputs.addAll(negativeOutputs)

        // Lists for collecting inputs and outputs for the custom multiplexer
        var multInputs = new ArrayList
        var multOutputs = new ArrayList

        // For each output, find the output VO and connect them to a conditional
        for (output : allOutputs) {
            // Find the output VO for the then state
            var ValuedObject innerPositiveOutputVo
            if (positiveOutputs.contains(output)) {
                innerPositiveOutputVo = thenState.declarations.filter(VariableDeclaration).filter[it.isOutput].flatMap [
                    it.valuedObjects
                ].filter[it.label == output].head
            }
            // Find the output VO for the else state
            var ValuedObject innerNegativeOutputVo
            if (negativeOutputs.contains(output)) {
                innerNegativeOutputVo = elseState.declarations.filter(VariableDeclaration).filter[it.isOutput].flatMap [
                    it.valuedObjects
                ].filter[it.label == output].head
            }

            // create corresponding VOs in the if-state
            var ValuedObject positiveOutputVo
            if (innerPositiveOutputVo !== null) {
                positiveOutputVo = createOutputVo(thenName, localIfCounter, ifState, thenObj, ifRegion,
                    innerPositiveOutputVo)
            }
            var ValuedObject negativeOutputVo
            if (innerNegativeOutputVo !== null) {
                negativeOutputVo = createOutputVo(elseName, localIfCounter, ifState, elseObj, ifRegion,
                    innerNegativeOutputVo)
            }

            // If the variable is not written to in the positive or negative case, use the input VO as the output. 
            val ifOutputVo = ifState.declarations.filter(VariableDeclaration).filter[it.isInput].flatMap [
                it.valuedObjects
            ].filter[it.label == output].head
            if (positiveOutputVo === null) {
                positiveOutputVo = ifOutputVo
            }
            if (negativeOutputVo === null) {
                negativeOutputVo = ifOutputVo
            }

            // Collect the outputVos in the multInputs list for the custom multiplexer
            if (positiveOutputVo === null) {
                negativeOutputVo.addTagAnnotation(negTag);
                multInputs.add(negativeOutputVo)
            } else if (negativeOutputVo === null) {
                positiveOutputVo.addTagAnnotation(posTag)
                multInputs.add(positiveOutputVo)
            } else {
                positiveOutputVo.addTagAnnotation(posTag)
                negativeOutputVo.addTagAnnotation(negTag)
                multInputs.add(positiveOutputVo)
                multInputs.add(negativeOutputVo)
            }

            val outputVO = ifState.findOutputVar(output)
            multOutputs.add(outputVO)

        }

        // muliplexer without input should not be created
        if (!multInputs.empty) {
            createMultiplexer(ifRegion, condOutputVo, multInputs, multOutputs);
        }

        linkReturn(ifState, rootState, ifRegion, dRegion, ifObj)

        // If there is some assignment to the hidden variable from a conditional expression, use it as the sub-reference
        val subReference = (getStateVariables(ifState) + getStateVariables(thenState) + getStateVariables(elseState)).
            filter [ key, value |
                key.equals(hiddenVariableName)
            ].values.head?.last?.reference
        return ifObj.reference => [
            it.subReference = subReference
        ]
    }

    /**
     * Build a conditional expression or statement, as in a ternary conditional expression using ? and : or an if[else]
     * construct. This variant builds the conditional in a state machine-alike fashion with separate then and else
     * states.
     */
    private def ValuedObjectReference buildConditional(IASTNode node, IASTExpression condition, IASTNode positive,
        IASTNode negative, State rootState, DataflowRegion dRegion) {

        // Create the state to represent the if statement.
        val ifState = createState(ifName + ssaNameSeperator + ifCounter)
        ifState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += ifState
        }

        // Create a reference for this if state in the containing dataflow-region.
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(ifState)
        val ifObj = refDecl.createValuedObject(ifName + ssaNameSeperator + ifCounter)
        if (!serializable) {
            ifObj.insertHighlightAnnotations(node)
        }
        ifCounter++

        // Set the in and outputs of the state
        setInputs(node, rootState, ifState, dRegion, ifObj)
        setOutputs(node, rootState, ifState, dRegion, ifObj)

        // Create the controlflow region for the if state and the initial state
        val cRegion = ifState.createControlflowRegion("")
        val initState = cRegion.createState("init")
        initState.label = ""
        if (!serializable) {
            initState.insertHighlightAnnotations(node)
        }
        initState.initial = true

        // Create the state for the then part
        val State thenState = createStateForNode(positive, cRegion, rootState, dRegion, ifObj, thenName)
        val thenTransition = initState.createImmediateTransitionTo(thenState)
        thenTransition.trigger = (condition).createKExpression(ifState, dRegion)
        thenTransition.label = exprToString(condition, sourceFile)
        // If an else is given the state is also created
        var State elseState
        if (negative !== null) {
            elseState = createStateForNode(negative, cRegion, rootState, dRegion, ifObj, elseName)
            initState.createImmediateTransitionTo(elseState)
        }

        assignOutputs(ifState, ifObj, rootState, dRegion)

        // If there is some assignment to the hidden variable from a conditional expression, use it as the sub-reference
        val subReference = (getStateVariables(ifState) + getStateVariables(thenState) + getStateVariables(elseState)).
            filter [ key, value |
                key.equals(hiddenVariableName)
            ].values.head?.last?.reference
        return ifObj.reference => [
            it.subReference = subReference
        ]
    }

    /**
     * Creates and returns a new state in the {@code parentRegion} of the {@code currentState} with a {@code name}
     * that contains the dataflow behavior of the {@code node}.
     */
    private def State createStateForNode(IASTNode node, ControlflowRegion parentCRegion, State parentState,
        DataflowRegion parentDRegion, ValuedObject parentReference, String name) {
        val newState = parentCRegion.createState(name)
        newState.label = name
        if (!serializable) {
            newState.insertHighlightAnnotations(node)
        }
        // Set the in and outputs of the state
        setInputs(node, parentState, newState, parentDRegion, null, false)
        setOutputs(node, parentState, newState, parentDRegion, null, false)

        val DataflowRegion region = createDFRegionForNode(node, newState, parentState, parentDRegion, parentReference)
        region.label = name
        newState.regions += region

        return newState
    }

    /**
     * Creates and returns a new dataflow region using the in/outputs of the {@code currentState} for the given
     * {@code node}.
     */
    private def DataflowRegion createDFRegionForNode(IASTNode node, State currentState, State parentState,
        DataflowRegion parentRegion, ValuedObject parentReference) {
        return createDFRegionForNode(node, currentState, parentState, parentRegion, parentReference, null)
    }

    /**
     * Creates and returns a new dataflow region using the in/outputs of the {@code currentState} for the given
     * {@code node}. The {@code additionalDeclarations} can be used if this region needs some declarations defined
     * as well that should not be visible from the outside. Used for example for 'for' loop's initializer statement.
     * 
     * @param node The node to create the region for.
     * @param currentState The state this region should be contained in.
     * @param parentState The parent state containing the currentState.
     * @param parentRegion The dataflow region containing the state for this new region.
     * @param parentReference The reference valued object used for the parentState.
     * @param additionalDeclarations Any additional declarations that need to be known for creating this state.
     * @return The new dataflow region.
     */
    private def DataflowRegion createDFRegionForNode(IASTNode node, State currentState, State parentState,
        DataflowRegion parentRegion, ValuedObject parentReference, IASTStatement additionalDeclarations) {
        var DataflowRegion newRegion
        if (node instanceof IASTCompoundStatement) {
            newRegion = buildCompound(node, currentState, additionalDeclarations)
        } else {
            newRegion = createDataflowRegion("DF-" + currentState.name)
            if (!serializable) {
                newRegion.insertHighlightAnnotations(node)
            }

            addAdditionalDeclarations(additionalDeclarations, currentState, newRegion)

            // If this is a single statement, it is translated by the function for that.
            // If the node is an expression, this expression is created and wired up and assigned to a hidden variable,
            // used if this region is further used in an assignment, for example as in ternary conditional expressions.
            if (node instanceof IASTStatement) {
                buildStatement(node, currentState, newRegion)
            } else if (node instanceof IASTExpression) {
                val output = createKExpression(node, currentState, newRegion)

                // use this as the output of the state, declare that and add an equation to it.
                val hiddenDecl = createVariableDeclaration

                if (output.isBooleanOperatorExpression) {
                    hiddenDecl.type = ValueType::BOOL
                } else {
                    hiddenDecl.type = ValueType::INT
                }
                hiddenDecl.output = true
                currentState.declarations += hiddenDecl

                // Set hidden var name
                var varName = hiddenVariableName
                val varList = <ValuedObject>newArrayList

                // Create valued object
                val hiddenVO = hiddenDecl.createValuedObject(varName + outSuffix)
                hiddenVO.label = varName

                // Attach valued object to the listing
                varList.add(hiddenVO)

                getStateVariables(currentState).put(varName, varList)
                if (!serializable) {
                    hiddenVO.insertHighlightAnnotations(node)
                }
                addEquation(newRegion, hiddenVO, output)
            }

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
        val returnDeclaration = currentState.declarations.findFirst [
            it.valuedObjects.findFirst[it.name.startsWith(returnObjectName)] !== null
        ]
        if (returnDeclaration !== null) {
            val returnedVO = returnDeclaration.valuedObjects.last
            returnedVO.label = returnObjectName
            // Look if there already is a valued object for the return statements of the parent state.
            val vos = getStateVariables(currentState)
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

            val retVO = parentState.findValuedObjectByName(returnObjectName, true, parentRegion)

            // res_i = parentState.res_out
            val source = parentReference.reference => [
                subReference = returnedVO.reference
            ]
            addEquation(parentRegion, retVO, source)
        }
    }

    /**
     * Extract the body of a switch statement
     */
    def void buildSwitch(IASTSwitchStatement swStmt, State rootState, DataflowRegion dRegion) {
        // Create the State representing the switch
        val swState = createState(switchName + ssaNameSeperator + swCounter)
        swState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += swState
        }

        // Create the reference for the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(swState)
        val swObj = refDecl.createValuedObject(switchName + ssaNameSeperator + swCounter)
        if (!serializable) {
            swObj.insertHighlightAnnotations(swStmt)
        }
        swCounter++
        hierarchy.put(swState, dRegion)

        // Set the In and Outputs
        setInputs(swStmt, rootState, swState, dRegion, swObj)
        setOutputs(swStmt, rootState, swState, dRegion, swObj)

        // Create the controlflow region
        val cRegion = swState.createControlflowRegion("")
        if (!serializable) {
            cRegion.insertHighlightAnnotations(swStmt.getBody)
        }

        // Create the controller expression label
        swStmt.getControllerExpression.createKExpression(swState, dRegion)
        val controller = exprToString(swStmt.getControllerExpression, sourceFile)
        cRegion.label = "switch (" + controller + ")"

        // Create the initial state
        val initState = cRegion.createState("init")
        initState.label = ""
        if (!serializable) {
            initState.insertHighlightAnnotations(swStmt.getBody)
        }
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
                activeCase = cRegion.createState(ssaNameSeperator + caseName + caseCounter++)
                activeCase.label = ""
                if (!serializable) {
                    activeCase.insertHighlightAnnotations(child)
                }

                setInputs(swBody, rootState, activeCase, dRegion, null, false)
                setOutputs(swBody, rootState, activeCase, dRegion, null, false)
                // Create its dataflow region
                activeDRegion = createDataflowRegion("")
                activeCase.regions += activeDRegion
                if (!serializable) {
                    activeDRegion.insertHighlightAnnotations(child)
                }

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
        // TODO: activeCase is always null, this cant work this way
//        linkReturn(activeCase, rootState, activeDRegion, dRegion, swObj)
        assignOutputs(swState, swObj, rootState, dRegion)
    }

    /**
     * Translate a For Statement
     */
    def void buildFor(IASTForStatement forStmt, State rootState, DataflowRegion dRegion) {
        // Create the state
        val forState = createState(forName + ssaNameSeperator + forCounter)
        forState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += forState
        }

        // Reference the state in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(forState)
        val forObj = refDecl.createValuedObject(forName + ssaNameSeperator + forCounter)
        if (!serializable) {
            forObj.insertHighlightAnnotations(forStmt)
        }
        hierarchy.put(forState, dRegion)

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
        val forDBodyRegion = createDFRegionForNode(forStmt.getBody, forState, rootState, dRegion, forObj,
            forStmt.getInitializerStatement)
        forState.regions += forDBodyRegion
        forDBodyRegion.label = forState.label
    }

    /**
     * Translate a while statement
     */
    def buildWhile(IASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
        // Create the while state
        val whileState = createState(whileName + ssaNameSeperator + whileCounter)
        whileState.annotations += createTagAnnotation("Hide")
        hierarchy.put(whileState, dRegion)
        if (serializable) {
            rootSCChart.rootStates += whileState
        }

        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject(whileName + ssaNameSeperator + whileCounter)
        if (!serializable) {
            whileObj.insertHighlightAnnotations(whileStmt)
        }

        // Set the in and outputs
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)

        // Create the condition expression label
        createKExpression(whileStmt.getCondition, whileState, dRegion)
        whileState.label = "while (" + exprToString(whileStmt.getCondition, sourceFile) + ")"
        whileCounter++

        // Translate the loop body
        val DataflowRegion whileDBodyRegion = createDFRegionForNode(whileStmt.getBody, whileState, rootState, dRegion,
            whileObj)
        whileState.regions += whileDBodyRegion
        whileDBodyRegion.label = whileState.label
    }

    /**
     * Builds a state with an accompanying DataflowRegion for a while statement. 
     * This variant also synthesizes the condition expression of the while statement as dataflow.
     * The body and the condition header receive their own state in a parent whileState.
     * 
     * @param whileStmt While statement from the AST of the program
     * @param rootState rootState in which the whileState should be embedded
     * @param dRegion DataflowRegion of the rootState
     */
    def ValuedObjectReference buildWhileDF(IASTWhileStatement whileStmt, State rootState, DataflowRegion dRegion) {
        val localWhileCounter = whileCounter
        whileCounter++

        // Create the while state
        val whileState = createState(whileName + ssaNameSeperator + localWhileCounter)
        whileState.annotations += createTagAnnotation("Hide")
        hierarchy.put(whileState, dRegion)

        if (serializable) {
            rootSCChart.rootStates += whileState
        }

        // Create a reference for this while state in the containing dataflow-region.
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(whileState)
        val whileObj = refDecl.createValuedObject(whileName + ssaNameSeperator + localWhileCounter)
        if (!serializable) {
            whileObj.insertHighlightAnnotations(whileStmt)
        }

        hierarchy.put(whileState, dRegion)
        stateObjects.put(whileState, whileObj)

        // Set the in and outputs of the state
        setInputs(whileStmt, rootState, whileState, dRegion, whileObj)
        setOutputs(whileStmt, rootState, whileState, dRegion, whileObj)

        // Create the dataflow region for the while state
        val whileRegion = whileState.createDataflowRegion("")
        if (!serializable) {
            whileRegion.insertHighlightAnnotations(whileStmt)
        }
        whileRegion.label = whileName + ssaNameSeperator + localWhileCounter

        // Create the cond state, region, and object
        val condRes = createCondDF(localWhileCounter, whileStmt, whileState, whileRegion)
        val condRegion = condRes.key
        val condState = condRes.value.key
        val condObj = condRes.value.value

        hierarchy.put(condState, whileRegion)
        stateObjects.put(condState, condObj)

        // Create the body state and according reference into the while dataflow region.
        val bodyState = createState(whileName + ssaNameSeperator + localWhileCounter + whileBodyName)
        bodyState.annotations += createTagAnnotation("Hide")
        hierarchy.put(bodyState, whileRegion)

        if (serializable) {
            rootSCChart.rootStates += bodyState
        }
        val bodyRefDecl = createReferenceDeclaration
        whileRegion.declarations += bodyRefDecl
        bodyRefDecl.setReference(bodyState)
        val bodyObj = bodyRefDecl.createValuedObject(whileName + ssaNameSeperator + localWhileCounter + whileBodyName)
        if (!serializable) {
            bodyObj.insertHighlightAnnotations(whileStmt.getBody)
        }

        // Set the inputs of the state
        setInputs(whileStmt.getBody, whileState, bodyState, whileRegion, bodyObj)
        // Set the outputs of the body state to refer to, but do not add the equations for them yet, as we want to
        // route them into a conditional.
        setOutputs(whileStmt.getBody, whileState, bodyState, whileRegion, bodyObj, false)

        hierarchy.put(bodyState, whileRegion)
        stateObjects.put(bodyState, bodyObj)

        // Create the region for the body part
        val bodyRegion = createDFRegionForNode(whileStmt.getBody, bodyState, whileState, whileRegion, bodyObj)
        bodyState.regions += bodyRegion
        bodyRegion.label = whileBodyName

        // inlining the output of the condition
        var ValuedObject condOutputVo = findCondOutputVo(condRegion, condState, condObj, whileRegion)

        val Map<String, String> ps = newHashMap
        var positiveOutputs = findOutputs(whileStmt.getBody, whileState, ps, false)
        if (getStateVariables(bodyState).containsKey(returnObjectName)) {
            positiveOutputs += returnObjectName
        }

        // For each output, find the output VO and collect them
        var multInputs = new ArrayList
        var multOutputs = new ArrayList
        for (output : positiveOutputs) {
            // Find the output VO for the body state
            var ValuedObject innerOutputVo = bodyState.declarations.filter(VariableDeclaration).filter[it.isOutput].
                flatMap [
                    it.valuedObjects
                ].filter[it.label == output].head

            // create corresponding output vo in the while state
            var ValuedObject positiveOutputVo
            if (innerOutputVo !== null) {
                positiveOutputVo = createOutputVo(whileBodyName, localWhileCounter, whileState, bodyObj, whileRegion,
                    innerOutputVo)
            }

            // If the variable is not written to in the body, use the input VO as the output. 
            val whileOutputVo = whileState.declarations.filter(VariableDeclaration).filter[it.isInput].flatMap [
                it.valuedObjects
            ].filter[it.label == output].head
            if (positiveOutputVo === null) {
                positiveOutputVo = whileOutputVo
            }

            // output VO for negative case
            var ValuedObject negativeOutputVo = whileOutputVo

            // find corresponding output vo in the while state
            val outputVo = whileState.findOutputVar(output)

            if (positiveOutputVo !== null) {
                positiveOutputVo.addTagAnnotation(posTag)
                multInputs.add(positiveOutputVo)
            }
            if (negativeOutputVo !== null) {
                negativeOutputVo.addTagAnnotation(negTag)
                multInputs.add(negativeOutputVo)
            }
            multOutputs.add(outputVo)
        }

        // add a big multiplexer
        createMultiplexer(whileRegion, condOutputVo, multInputs, multOutputs);

        linkReturn(whileState, rootState, whileRegion, dRegion, whileObj)
        assignOutputs(whileState, whileObj, rootState, dRegion)

        // If there is some assignment to the hidden variable from a conditional expression, use it as the sub-reference
        val subReference = (getStateVariables(whileState) + getStateVariables(bodyState) +
            getStateVariables(condState)).filter [ key, value |
            key.equals(hiddenVariableName)
        ].values.head?.last?.reference
        return whileObj.reference => [
            it.subReference = subReference
        ]
    }

    /**
     * Adds a Condition State with an accompanying DataflowRegion to the surrounding parentRegion.
     * The content of the DataflowRegion is determined by the passed statement.
     * 
     * @param localCounter Counter of the surrounding statement type
     * @param stmt Statement including the condition expression
     * @param parentState Surrounding State that is meant to get an inner condition state
     * @param parentRegion DFRegion of the parentState - The condition state is added to this DFRegion
     * @return The DataflowRegion, State and ValuedObject of the condition
     */
    private def createCondDF(int localCounter, IASTStatement stmt,
        State parentState, DataflowRegion parentRegion) {

        var name = ""
        var label = ""
        var IASTExpression expr = null
        switch stmt {
            IASTWhileStatement: {
                name = whileName + ssaNameSeperator + localCounter + condName
                label = condName + ": " + exprToString((stmt as IASTWhileStatement).getCondition, sourceFile)
                expr = (stmt as IASTWhileStatement).getCondition
            }
            IASTIfStatement: {
                name = ifName + ssaNameSeperator + localCounter + condName
                label = condName
                expr = (stmt as IASTIfStatement).conditionExpression
            }
            default:
                throw new IllegalArgumentException("The type of IASTStatement is not supported in addCondDF: " + stmt)
        }
        // Create the cond state
        val condState = createState(name)
        condState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += condState
        }
        val condRefDecl = createReferenceDeclaration
        parentRegion.declarations += condRefDecl
        condRefDecl.setReference(condState)
        val condObj = condRefDecl.createValuedObject(name)
        if (!serializable) {
            condObj.insertHighlightAnnotations(expr)
        }

        // set inputs & outputs
        setInputs(expr, parentState, condState, parentRegion, condObj)
        setOutputs(expr, parentState, condState, parentRegion, condObj, false)

        // Create the region for the condition part
        val condRegion = createDFRegionForNode(expr, condState, parentState, parentRegion, condObj)
        condState.regions += condRegion
        condRegion.label = label

        return condRegion -> (condState -> condObj)
    }

    /**
     * Inlines the output of a condition in the DataflowRegion of a condition and returns the OutputVo of the condition.
     * This is useful for example when connecting the condition to a multiplexer.
     * 
     * @param condRegion DataflowRegion of the condition 
     * @param condState State that includes the DataflowRegion condRegion
     * @param condObj ReferenceDeclaration of the condition
     * @param parentRegion Region that includes the condState
     * @return the found OutputValuedObject of the condition
     */
    private def findCondOutputVo(DataflowRegion condRegion, State condState, ValuedObject condObj,
        DataflowRegion parentRegion) {
        // find the condition vo in the condition state
        val condOutput = condState.declarations.filter(VariableDeclaration).filter[it.isOutput].map[it.valuedObjects].
            flatten.head
        var ValuedObject condOutputVo
        if (condOutput !== null) {
            // Assign the cond output to a new variable in the while region
            // For that, create a new variable declaration
            val variableDeclaration = createVariableDeclaration
            variableDeclaration.type = condOutput.type
            parentRegion.declarations += variableDeclaration

            if (variableDeclaration.type === ValueType.HOST) {
                variableDeclaration.hostType = condOutput.variableDeclaration.hostType
            }
            // Retrieve the state's variable map
            var Map<String, List<ValuedObject>> stateVariables = getStateVariables(condState)
            val varName = conditionalResultName
            val varList = <ValuedObject>newArrayList
            // Reuse the vo variable, now pointing to a new VO in the while state
            condOutputVo = variableDeclaration.createValuedObject(varName)
            condOutputVo.label = varName
            varList.add(condOutputVo)
            stateVariables.put(varName, varList)
            parentRegion.declarations += variableDeclaration
            variableDeclaration.annotations += createTagAnnotation("Hide")
            // add equation
            val innerNegativeOutputVo_ = condOutput
            val source = condObj.reference => [
                subReference = innerNegativeOutputVo_.reference
            ]
            addEquation(parentRegion, condOutputVo, source)
        }
        return condOutputVo
    }

    /**
     * Assigns the given vo {@code output} to a new "state_[varName]" variable in {@code region}.
     * 
     * @param name Name of the {@code state}, used for the variable name. If null only the label of {@code output} is 
     *          used
     * @param counter The counter of {@code state}
     * @param state The state the created variable should be in
     * @param obj The object of the state the vo {@code output} is in
     * @param region The region of {@code state}
     * @param output The vo for which the new vo should be created
     * 
     */
    private def createOutputVo(String name, int counter, State state, ValuedObject obj, DataflowRegion region,
        ValuedObject output) {
        if (region === null) {
            // something went wrong before calling this method
            println("region is null for state: " + state.name)
            return null
        }
        var ValuedObject outputVo
        // Assign the state output to a new "state_[varName]" variable in the region
        // For that, create a new variable declaration
        val variableDeclaration = createVariableDeclaration
        variableDeclaration.type = output.type
        if (variableDeclaration.type == ValueType.HOST) {
            variableDeclaration.hostType = output.variableDeclaration.hostType
        }
        region.declarations += variableDeclaration

        // Retrieve the state's variable map
        val Map<String, List<ValuedObject>> stateVariables = getStateVariables(state)
        val varName = name !== null ? name + ssaNameSeperator + counter + output.label : output.label
        // Reuse the vo variable, now pointing to a new VO in the state
        outputVo = variableDeclaration.createValuedObject(varName)
        outputVo.label = varName
        region.declarations += variableDeclaration
        variableDeclaration.annotations += createTagAnnotation("Hide")
        val innerPositiveOutputVo_ = output
        // This assignment is of the form 'varName = obj.varName'
        val source = obj.reference => [
            subReference = innerPositiveOutputVo_.reference
        ]
        addEquation(region, outputVo, source)

        // Add the new create valued object to the ssa list and valued object list
        if (stateVariables.containsKey(output.label)) {
            var varList = stateVariables.get(output.label)
            varList.add(outputVo)
        } else {
            var varList = <ValuedObject>newArrayList
            varList.add(outputVo)
            stateVariables.put(output.label, varList)
        }

        return outputVo
    }

    /**
     * Creates a multiplexer state based on an referenced SCCharts state that merges the outputs of (two) inner states
     * based on a condition. The edge to the conditional input is laid out at the south/north of the multiplexer.
     * 
     * @param parentRegion Region of the parent state that includes the Multiplexer
     * @param condOutputVo ValuedObject of the output representing the condition "choosing" the input branch 
     * @param multInputs Inputs of the multiplexer
     * @param multOutputs Outputs of the multiplexer
     * 
     */
    private def createMultiplexer(DataflowRegion parentRegion, ValuedObject condOutputVo,
        ArrayList<ValuedObject> multInputs, ArrayList<ValuedObject> multOutputs) {
        // Create the multiplexer state and according reference into the while dataflow region.
        val multState = createState(multiplexerName + ssaNameSeperator + multiplexerCounter)
        multState.addStringAnnotation("figure", "BigMult.kgt")
        multState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += multState
        }
        val multRefDecl = createReferenceDeclaration
        parentRegion.declarations += multRefDecl
        multRefDecl.setReference(multState)
        val multObj = multRefDecl.createValuedObject(multiplexerName + ssaNameSeperator + multiplexerCounter)
        multObj.label = ""

        // set in and outputs
        setMultInput(multInputs, multState, parentRegion, multObj, false)
        setMultInput(#[condOutputVo], multState, parentRegion, multObj, true)
        setMultOutputs(multOutputs, multState, parentRegion, multObj)

        // Create the region for the body part
        val multRegion = multState.createDataflowRegion(multiplexerName + ssaNameSeperator + multiplexerCounter)
        multState.regions += multRegion

        // Add tag annotation so that the multiplexer is identifiable in EquationSynthesis in a clean way
        multObj.addTagAnnotation(multiplexerTag)
        multiplexerCounter++
    }

    /**
     * Sets the output of a custom multiplexer state. 
     * 
     * @param outputs The outs as ValuedObjects that leave the multiplexer
     * @param newState The state of the multiplexer.
     * @param dRegion The parent DataflowRegion including the multiplexer's state.
     * @param refObj the ReferenceDeclaration of the multiplexer
     */
    private def setMultOutputs(ArrayList<ValuedObject> outputs, State newState, DataflowRegion dRegion,
        ValuedObject refObj) {
        // Retrieve the state's valued object map
        val Map<String, List<ValuedObject>> stateVariables = getStateVariables(newState)
        for (outputVO : outputs) {
            if (outputVO !== null) {
                // create output vo
                val innerOutputVO = createVar(outputVO, newState, stateVariables, outSuffix, "")
                // Create the assignment
                val target = outputVO
                if (refObj === null) {
                    addEquation(dRegion, target, innerOutputVO.reference)
                } else {
                    val source = refObj.reference => [
                        subReference = innerOutputVO.reference
                    ]
                    addEquation(dRegion, target, source)
                }
            } else {
                // Something went wrong before this method
                println("output is null for multiplexer: " + newState.name)
            }
        }
    }

    /**
     * Sets the inputs of a custom multiplexer state. 
     * 
     * @param inputs The inputs as ValuedObjects that are led into the multiplexer
     * @param newState The state of the multiplexer.
     * @param dRegion The parent DataflowRegion including the multiplexer's state.
     * @param refObj the ReferenceDeclaration of the multiplexer
     * @param cond Signifies whether the input should be interpreted as the condition
     */
    private def setMultInput(List<ValuedObject> inputs, State newState, DataflowRegion dRegion, ValuedObject refObj,
        boolean cond) {
        // Retrieve the state's valued object map
        val Map<String, List<ValuedObject>> stateVariables = getStateVariables(newState)
        for (inputVO : inputs) {
            if (inputVO !== null) {
                // label should not be null
                val label = inputVO.label ?: inputVO.name.substring(0, inputVO.name.lastIndexOf(ssaNameSeperator))
                inputVO.label = label

                // create input vo
                val innerInputVO = createVar(inputVO, newState, stateVariables, inSuffix, "")

                // Create the assignment
                if (innerInputVO !== null) {
                    if (refObj === null) {
                        val eq = createDataflowAssignment(innerInputVO, inputVO.reference)
                        if (cond) {
                            eq.addStringAnnotation("toPort", "in1")
                        }
                        dRegion.equations += eq
                    } else {
                        val eq = createDataflowAssignment(refObj, innerInputVO, inputVO.reference)
                        if (cond) {
                            eq.addStringAnnotation("toPort", "in1")
                        }
                        dRegion.equations += eq
                    }
                } else {
                    println("Could not set multiplexer input for: " + inputVO + ". In the state: " + newState)
                }
            } else {
                // Something went wrong before this method
                println("input is null for multiplexer: " + newState.name)
            }
        }
    }

    /** Creates in the given {@code state} an output variable for {@code vo} and updates {@code stateVars}.
     * 
     * @param vo The valued object for which an variable should be created
     * @param state The state that should contain the variable
     * @param stateVars Variables of {@code state}
     * @param suffix Suffix for the variable label
     */
    private def createVar(ValuedObject vo, State state, Map<String, List<ValuedObject>> stateVars, String suffix,
        String l) {
        // create new variable
        val decl = createVariableDeclaration
        decl.type = vo.type
        if (decl.type == ValueType.HOST) {
            decl.hostType = vo.variableDeclaration.hostType
        }
        switch (suffix) {
            case outSuffix: decl.output = true
            case inSuffix: decl.input = true
        }
        var label = ""
        if (!l.equals("")) {
            label = l + ssaNameSeperator
        }
        label = vo.label !== null ? label + vo.label : label +
            vo.name.substring(0, vo.name.lastIndexOf(ssaNameSeperator))
        state.declarations += decl
        val varVO = decl.createValuedObject(label + suffix)
        varVO.label = label

        // copy annotations
        if (!vo.annotations.empty && !suffix.equals(outSuffix)) {
            varVO.addTagAnnotation((vo.annotations.get(0) as TagAnnotation).name)
        }

        // Add the new create valued object to the ssa list and valued object list
        if (stateVars.containsKey(label)) {
            var varList = stateVars.get(label)
            varList.add(varVO)
        } else {
            var varList = <ValuedObject>newArrayList
            varList.add(varVO)
            stateVars.put(label, varList)
        }
        return varVO
    }

    /**
     * Translates a break/continue/return statement depending on the passed statement.  
     * 
     * @param passedStmt Determines whether a break, continue, or return stmt should be translated
     * @param parentState The state of the surrounding if-stmt
     * @param parentRegion The region of the {@code parentState}
     */
    def void buildBreakContinueReturn(IASTStatement passedStmt, State parentState, DataflowRegion parentRegion) {
        breakContinueFlag = true
        var localName = ""
        var localCounter = 0
        var DataflowRegion lastRegion

        // Change stmt type dependent variables
        switch (passedStmt) {
            IASTBreakStatement: {
                localName = breakName
                localCounter = breakCounter
                breakCounter++
                lastRegion = lastWhileRegion
            }
            IASTContinueStatement: {
                localName = continueName
                localCounter = continueCounter
                continueCounter++
                lastRegion = lastWhileRegion
            }
            IASTReturnStatement: {
                localName = returnName
                localCounter = returnCounter
                returnCounter++
                lastRegion = lastFuncRegion
            }
        }

        if (lastRegion === null) {
            // TODO: support for for-loop and do-while
            println("break and continue are only supported for the while-loop")
            return
        }

        // Create the state
        val newState = createState(localName + ssaNameSeperator + localCounter)
        newState.annotations += createTagAnnotation("Hide")
        newState.annotations += createStringAnnotation(ifStmtAnno, "" + (ifCounter - 1))
        newState.addStringAnnotation("figure", "BigMult.kgt")
        if (serializable) {
            rootSCChart.rootStates += newState
        }

        // Move upwards in the AST until finding the surrounding while/function statement
        var stmt = passedStmt as IASTNode
        while (!(stmt instanceof IASTWhileStatement || stmt instanceof IASTFunctionDefinition)) {
            stmt = stmt.parent
        }
        var topStmt = stmt instanceof IASTWhileStatement ? stmt as IASTWhileStatement : stmt as IASTFunctionDefinition

        // determine the state and the variables which values depend on the stmt
        var Set<String> dependableVars
        var State topState
        var addState = true
        switch (topStmt) {
            IASTWhileStatement: {
                // determine the current while state
                for (state : rootSCChart.rootStates) {
                    if (state.name.contains(whileName + ssaNameSeperator + (whileCounter - 1))) {
                        topState = state
                    }
                }
                // determine variables
                val ifStmt = passedStmt.parent instanceof IASTIfStatement
                        ? passedStmt.parent as IASTIfStatement
                        : passedStmt.parent.parent as IASTIfStatement
                dependableVars = findMultiplexerInputs(topStmt.getBody as IASTCompoundStatement, ifStmt, topState)
            }
            IASTFunctionDefinition: {
                // determine function state
                val uniqueFunctionIdentifier = CProcessorUtils.nameToIdentifier(
                    (stmt as IASTFunctionDefinition).declarator.name, index)
                if (functions.containsKey(uniqueFunctionIdentifier)) {
                    topState = functions.get(uniqueFunctionIdentifier).values.head
                    val pointerPars = parameterPointers.get(topState) ?: newArrayList
                    val ifStmt = passedStmt.parent instanceof IASTIfStatement ? passedStmt.
                            parent as IASTIfStatement : passedStmt.parent.parent as IASTIfStatement
                    // only pointers that are parameters of the function must be considered
                    dependableVars = findMultiplexerInputs(topStmt.getBody as IASTCompoundStatement, ifStmt,
                        topState).filter[pointerPars.contains(it)].toSet
                    val isVoidReturn = topState.declarations.findFirst [
                        it.valuedObjects.findFirst[it.name.startsWith(returnObjectName)] !== null
                    ] === null
                    // empty return multiplexer should only be shown when it is a return in a void method
                    addState = !dependableVars.isEmpty || isVoidReturn
                }
            }
        }

        if (addState) {
            addStateForBreakContinueReturn(lastRegion, newState, localName, localCounter, dependableVars, parentState,
                parentRegion, topState)
        }
    }
    
    /**
     * Adds the newState to the parentState and sets the positive inputs.
     * @param topRegion The region to which the {@code newSTate} should be added.
     * @param newState The state for the break/continue/return.
     * @param newStateName The name for {@code newState}
     * @param stateCounter The corresponding local Counter for the {@code newState}
     * @param dependableVars The names of the input variables
     * @param parentState The surrounding if-state of the break/continue/return stmt
     * @param parentRegion The region of the {@code parentState}
     * @param topState The surrounding while/function state of the break/continue/return stmt 
     */
    private def addStateForBreakContinueReturn(DataflowRegion topRegion, State newState, String newStateName,
        int stateCounter, Set<String> dependableVars, State parentState, DataflowRegion parentRegion, State topState) {
        // create ref decl and valued  object
        val newRefDecl = createReferenceDeclaration
        topRegion.declarations += newRefDecl
        newRefDecl.setReference(newState)
        val newObj = newRefDecl.createValuedObject(newStateName + ssaNameSeperator + stateCounter)
        newObj.annotations += createTagAnnotation(multiplexerTag)
        newObj.label = ""

        // Create the region for the body part
        val newRegion = newState.createDataflowRegion("")
        newState.regions += newRegion
        newRegion.label = newStateName + ssaNameSeperator + stateCounter

        // search for the latest valued object for each of the breakDependableVar
        val List<ValuedObject> vars = new ArrayList
        for (depVar : dependableVars) {
            var ValuedObject vo = null
            var region = parentRegion
            var state = parentState
            // input does not count as the latest vo unless it is in the surrounding while/function state
            while (vo === null || (vo.name.contains(inSuffix) && !state.equals(topState))) {
                region = hierarchy.get(state)
                val name = region.label !== null && !region.label.equals("")
                        ? region.label
                        : region.name.split("-").get(1)
                state = rootSCChart.rootStates.filter[s|s.name.equals(name)].head
                vo = findValuedObjectByName(state, depVar, false, region)
            }

            // if the top if-stmt in the while (in which the break stmt is) contains the depVar as output, the vo is this output
            val parentVarList = getStateVariables(topIfState).get(depVar)
            if (state.name.startsWith(whileName + ssaNameSeperator) && parentVarList !== null && !parentVarList.filter [
                it.isOutput
            ].isEmpty) {
                /* Since the output of the if-stmt is not the correct input for the break stmt, 
                 * we need to select the correct one.
                 * The correct one is the variable that is directly before this output variable in the list 
                 * of the while state.
                 */
                val varList = getStateVariables(state).get(depVar)
                if (varList !== null && varList.length >= 3) {
                    vo = varList.get(varList.length - 3)
                }
            }
            vars.add(vo)
        }

        // if the vos are not in the surrounding while/func state (in which the break/continue/return state is) they must be passed to it
        val List<ValuedObject> inputs = new ArrayList
        for (v : vars) {
            var vo = v
            val cont = v.eContainer.eContainer
            if (breakContinueVars.containsKey(v)) {
                // the while/func state already contains a vo for this variable
                vo = breakContinueVars.get(v)
            } else if (cont instanceof DataflowRegion && !cont.equals(topRegion)) {
                // create output variable for the region
                var pR = cont as DataflowRegion
                val regName = pR.label !== null && !pR.label.equals("") ? pR.label : pR.name.split("-").get(1)
                var pS = rootSCChart.rootStates.filter[s|s.name.equals(regName)].head
                vo = createVar(v, pS, getStateVariables(pS), outSuffix,
                    newStateName + "Var" + ssaNameSeperator + stateCounter)
                var obj = stateObjects.get(pS)

                // Create the assignment
                addEquation(pR, vo, v.reference)

                // update parents
                pR = hierarchy.get(vo.eContainer.eContainer as State)

                val name = pR.label !== null && !pR.label.equals("") ? pR.label : pR.name.split("-").get(1)
                pS = rootSCChart.rootStates.filter[s|s.name.equals(name)].head

                vo = createOutputVo(null, stateCounter, pS, obj, pR, vo)

                // repeat until while/func state is reached
                while (!pS.equals(topState)) {
                    val outputVar = createVar(vo, pS, getStateVariables(pS), outSuffix, "")
                    addEquation(pR, outputVar, vo.reference)

                    pR = hierarchy.get(outputVar.eContainer.eContainer as State)
                    val rN = pR.label !== null && !pR.label.equals("") ? pR.label : pR.name.split("-").get(1)

                    obj = stateObjects.get(pS)
                    pS = rootSCChart.rootStates.filter[s|s.name.equals(rN)].head
                    vo = createOutputVo(null, stateCounter, pS, obj, pR, outputVar)
                }
            }
            breakContinueVars.put(v, vo)
            inputs.add(vo)
        }

        // set tag annotation and input
        inputs.forEach[v|v.addTagAnnotation(posTag)]
        setMultInput(inputs, newState, topRegion, newObj, false)

        // adjust name and label of the state variables
        val name = newStateName
        getStateVariables(newState).forEach [ p1, p2 |
            p2.get(0).name = name + ssaNameSeperator + p2.get(0).name;
            p2.get(0).label = name + ssaNameSeperator + p2.get(0).label
        ]

        hierarchy.put(newState, topRegion)
        stateObjects.put(newState, newObj)
    }

    /**
     * Finalizes already created break/continue/return states in a specific while/function.
     * This means for example that it adds inputs and outputs to them.
     * 
     *   @param stmt compound statement/do-block of the while/function
     *   @param parentState The surrounding while/function state
     *   @param parentRegion The state's dataflow region
     */
    private def finalizeBreakContinueReturnStates(IASTCompoundStatement stmt, State parentState,
        DataflowRegion parentRegion) {
        // collect all break, continue, and return states in the while loop or function body
        val breakStates = collectStates(breakName, parentRegion)
        val continueStates = collectStates(continueName, parentRegion)
        val returnStates = collectStates(returnName, parentRegion)

        // finalize every break, continue, and return state
        finalize(breakStates, breakName, parentState, parentRegion)
        finalize(continueStates, continueName, parentState, parentRegion)
        finalize(returnStates, returnName, parentState, parentRegion)
    }

    /**
     * Collects all states from a DataflowRegion that have a name starting with a specific prefix.
     * @param prefix The prefix that determines which states are meant to be collected.
     * @param dataflowRegion The states are collected from this dataflow region.
     */
    private def List<State> collectStates(String prefix, DataflowRegion dataflowRegion) {
        var List<State> states = new ArrayList
        for (decl : dataflowRegion.declarations) {
            if (decl instanceof ReferenceDeclaration) {
                val state = decl.reference as State
                if (state.name.startsWith(prefix + ssaNameSeperator)) {
                    states.add(state)
                }
            }
        }

        states.sortBy[state|state.name]
        return states
    }

    /**
     * Actual work logic of finalizeBreakContinueReturn.
     * Finalizes already created break/continue/return states in a specific while/function.
     * This means for example that it adds inputs and outputs to them.
     * 
     *   @param stmt compound statement/do-block of the while 
     *   @param parentState The surrounding while/function state
     *   @param parentRegion The state's dataflow region
     */
    private def void finalize(List<State> states, String name, State parentState, DataflowRegion parentRegion) {
        for (var i = states.length - 1; i >= 0; i--) {
            val curState = states.get(i)
            val curObj = stateObjects.get(curState)

            // determine the inputs of the state
            val vars = new ArrayList()
            getStateVariables(curState).forEach [ key, value |
                val labels = key.split(ssaNameSeperator);
                vars.add(labels.get(labels.length - 1))
            ]
            var breakInputs = new ArrayList()
            for (label : vars) {
                var vo = parentState.findValuedObjectByName(label, false, parentRegion)
                vo.label = label
                vo.removeAnnotations(posTag)
                vo.addTagAnnotation(negTag)
                breakInputs.add(vo)
            }

            // create output vars
            val breakVars = getStateVariables(curState)
            for (input : breakInputs) {
                val innerOutputVO = createVar(input, curState, breakVars, outSuffix, "")
                createOutputVo(name, Integer.parseInt(curState.name.substring(name.length + 1)), parentState, curObj,
                    parentRegion, innerOutputVO)
            }

            // determine the if state the stmt is in
            var State ifState
            val localIfCounter = Integer.parseInt(curState.getStringAnnotationValue(
                DataflowExtractor.ifStmtAnno
            ))
            for (state : rootSCChart.rootStates) {
                if (state.name.equals(ifName + ssaNameSeperator + localIfCounter)) {
                    ifState = state
                }
            }

            // condition is passed to the while/function region in which the state is
            // and all conditions on the way are collected
            val conditions = collectAndPassThroughConds(ifState, parentRegion)

            var ValuedObject condInput = conditions.get(0)

            // if there is more than one condition they are connected with an "AND" operator
            if (conditions.size > 1) {
                // create local var for result auf "AND"
                val label = hiddenVariableName + breakCondsCounter
                val decl = createVariableDeclaration
                parentRegion.declarations += decl
                decl.type = ValueType.BOOL
                decl.annotations += createTagAnnotation("Hide")
                condInput = decl.createValuedObject(label)
                condInput.label = label

                // combine the conditions with an "AND" operator
                val expr = createLogicalAndExpression() => [
                    for (cond : conditions) {
                        it.subExpressions += cond.reference
                    }
                ]

                addEquation(parentRegion, condInput, expr)
                breakCondsCounter++
            }

            // set the inputs of the state  
            setMultInput(breakInputs, curState, parentRegion, curObj, false)
            setMultInput(#[condInput], curState, parentRegion, curObj, true)
        }
    }

    /**
     * Collects if-conditions and passes them through to the embedding while/function state.
     * 
     * @param startState The state in which should be started
     * @param lastRegion DataflowRegion in which the conditions are needed
     */
    private def collectAndPassThroughConds(State startState, DataflowRegion lastRegion) {
        var List<ValuedObject> conditions = new ArrayList
        var parentRegion = startState.regions.get(0) as DataflowRegion
        while (parentRegion !== lastRegion && parentRegion !== null) {
            val parentState = parentRegion.eContainer as State

            // checks whether another if-state is reached
            if (parentState.name.startsWith(ifName + ssaNameSeperator)) {
                // get the local conditional vo in the if state
                for (decl : parentRegion.declarations) {
                    if (decl instanceof VariableDeclaration) {
                        val vo = decl.valuedObjects.get(0)
                        if (vo.name.equals(conditionalResultName)) {
                            conditions.add(vo)
                        }
                    }
                }
            }

            // for each condition an output vo must be created
            val List<ValuedObject> condOutputs = new ArrayList
            for (condOutput : conditions) {
                val label = condOutput.label.startsWith(ifName + ssaNameSeperator) ? condOutput.label : parentState.
                        name + hiddenVariableName
                val voList = getStateVariables(parentState).get(label)

                // if an output already exists for the condition this output can be used, 
                // otherwise a new output must be created
                if (voList !== null) {
                    condOutputs.add(voList.get(voList.length - 1))
                } else {
                    // create condition output in the parent state
                    val outputDecl = createVariableDeclaration
                    outputDecl.type = ValueType::BOOL
                    outputDecl.output = true
                    parentState.declarations += outputDecl
                    val varName = label
                    val varList = <ValuedObject>newArrayList
                    val outputVO = outputDecl.createValuedObject(varName + outSuffix)
                    outputVO.label = varName

                    // add condition vo to the state variables
                    varList.add(outputVO)
                    getStateVariables(parentState).put(varName, varList)
                    addEquation(parentRegion, outputVO, condOutput.reference)

                    // condition vo that can be used by the next state
                    condOutputs.add(
                        createOutputVo(null, 0, parentRegion.eContainer as State, stateObjects.get(parentState),
                            hierarchy.get(parentState), outputVO))
                }
            }
            parentRegion = hierarchy.get(parentState)
            conditions = condOutputs
        }
        return conditions
    }

    /**
     * Translate a Do statement
     */
    def void buildDo(IASTDoStatement doStmt, State rootState, DataflowRegion dRegion) {
        // Create the state        
        val doState = createState(doName + ssaNameSeperator + doCounter)
        doState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += doState
        }

        // Create the reference in the containing dataflow region
        val refDecl = createReferenceDeclaration
        dRegion.declarations += refDecl
        refDecl.setReference(doState)
        val doObj = refDecl.createValuedObject(doName + ssaNameSeperator + doCounter)
        if (!serializable) {
            doObj.insertHighlightAnnotations(doStmt)
        }
        hierarchy.put(doState, dRegion)

        // Set the in and outputs
        setInputs(doStmt, rootState, doState, dRegion, doObj)
        setOutputs(doStmt, rootState, doState, dRegion, doObj)

        // Create the condition expression label
        createKExpression(doStmt.getCondition, doState, dRegion)
        doState.label = "do ... while (" + exprToString(doStmt.getCondition, sourceFile) + ")"
        doCounter++

        // Translate the body
        val doDBodyRegion = createDFRegionForNode(doStmt.getBody, doState, rootState, dRegion, doObj)
        doState.regions += doDBodyRegion
        doDBodyRegion.label = doState.label

    }

    /**
     * From some statement containing additional declarations, only those declarations and no initialization are
     * added to the dataflow region. This way any variables declared in the additional statement are known in the 
     * given region.
     * 
     * @param additionalDeclarations The declaration possibly containing some declarations.
     * @param bodyState The state in which the dataflow region resides.
     * @param dfRegion The dataflow region to add the declarations to.
     */
    def void addAdditionalDeclarations(IASTStatement additionalDeclarations, State bodyState, DataflowRegion dfRegion) {
        if (additionalDeclarations instanceof IASTDeclarationStatement) {
            // Strip the initialization away from a copy of the declaration.  
            val usedDeclarators = additionalDeclarations.copy
            val declaration = (usedDeclarators as IASTDeclarationStatement).declaration
            if (declaration instanceof IASTSimpleDeclaration) {
                declaration.declarators.forEach[initializer = null]
            }
            buildStatement(usedDeclarators, bodyState, dfRegion)
        }
    }

    /**
     * Create a variable declaration
     */
    def VariableDeclaration addDeclaration(IASTSimpleDeclaration declaration, State state, DataflowRegion dRegion) {

        // Create the declaration with the cdt type
        val variableDeclaration = createVariableDeclaration
        val declSpecifier = declaration.getDeclSpecifier
        var isStruct = false

        switch (declSpecifier) {
            IASTNamedTypeSpecifier: {
                // unknown type
                val typeName = declSpecifier.name.toString
                variableDeclaration.type = ValueType.HOST
                variableDeclaration.hostType = typeName
            }
            IASTElaboratedTypeSpecifier: {
                // struct type
                val structName = declSpecifier.name.toString
                isStruct = true

                // Uses Host Type for setting the struct type since our structs are represented as array-like valued objects
                variableDeclaration.type = ValueType.HOST
                variableDeclaration.hostType = elaboratedKindToString(declSpecifier.kind) + " " + structName
            }
            IASTSimpleDeclSpecifier: {
                variableDeclaration.type = declSpecifier.type.cdtTypeConversion
            }
            default: {
                println("declspecifier \"" + declSpecifier + "\" not supported")
            }
        }
        if (!serializable) {
            variableDeclaration.insertHighlightAnnotations(declaration)
        }

        // Retrieve the state's variable map
        var Map<String, List<ValuedObject>> stateVariables = getStateVariables(state)

        // Create a valued object for each declared variable 
        val declarators = declaration.getDeclarators
        for (decl : declarators) {
            // Retrieve the variables name
            var varName = decl.getName.toString
            // Create a SSA list for the variable
            var varList = <ValuedObject>newArrayList

            // Create the valued object
            val vo = variableDeclaration.createValuedObject(varName + ssaNameSeperator + "0")
            if (!isStruct) {
                vo.label = varName
            }
            if (!serializable) {
                vo.insertHighlightAnnotations(decl)
            }

            if (!decl.pointerOperators.isEmpty && decl.pointerOperators.get(0) instanceof IASTPointer) {
                getStatePointers(state).add(varName)
            }

            if (decl instanceof IASTArrayDeclarator) {
                vo.cardinalities += decl.arrayModifiers.map [
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

            if (declSpecifier instanceof IASTElaboratedTypeSpecifier) {
                // Structs shall be visualized and handled as arrays 
                // -> something is handled as array when cardinalities is set
                // We explicitly create arrays for structs, because arrays are passable in sccharts - structs are not
                vo.cardinalities += createIntValue(0)
                
                addElaboratedTag(vo, declSpecifier.kind)
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
            var isStruct = false

            if (initializer.children.head instanceof IASTFunctionCallExpression) {
                val expression = initializer.children.head as IASTFunctionCallExpression
                initExpr = createFunctionCall(expression, state, dRegion)
            } else {
                // Simply translate the expression
                val initHead = initializer.children.head

                if (initHead instanceof IASTInitializerList) {
                    if (isInitializerListForStructs(initHead)) {
                        // Case for designated init for structs
                        processDesignatedInitializers(initHead, vo, state, dRegion, newArrayList())
                        isStruct = true
                    } else {
                        initExpr = createKExpression(initializer.children.head, state, dRegion)
                    }
                } else {
                    initExpr = createKExpression(initializer.children.head, state, dRegion)
                }
            }

            if (initializer.children.head instanceof IASTUnaryExpression &&
                (initializer.children.head as IASTUnaryExpression).operand instanceof IASTIdExpression &&
                (initializer.children.head as IASTUnaryExpression).operator === IASTUnaryExpression.op_amper) {
                // original initExpr is of the form "&var"
                val statePointers = getStateVarPointers(state)
                statePointers.put(vo.name.substring(0, vo.name.lastIndexOf(ssaNameSeperator)),
                    (initExpr as ValuedObjectReference).valuedObject)
            }
            if (!isStruct) {
                addEquation(dRegion, vo, initExpr)
            }
        }
    }
    
    /**
     * Processes the designated initializers of a struct (e.g struct Point p1 = {.y = 0, .z = 1, .x = 2}) 
     *  and adds the resulting equations to a dataflow region.
     * 
     * @param initializers The IntializerList containing the DesignatedInitializers
     * @param vo the ValuedObject that is meant to be initialized
     * @param state the state of the dataflow region
     * @param dRegion the dataflow region to which the assignments of the initialization are added
     * @param alreadyPassedIndices shared indices for recursive calls of processDesignatedInitializers 
     *            - should be an empty list for the first call
     */
    def void processDesignatedInitializers(IASTInitializerList initializers, ValuedObject vo, State state,
        DataflowRegion dRegion, List<Expression> alreadyPassedIndices) {

        for (clause : initializers.clauses) {
            var el = clause as ICASTDesignatedInitializer

            val List<Expression> indices = newArrayList()
            val fieldDesignators = el.designators
            var isArrayField = false
            
            for (designator : fieldDesignators) {
                // There are more than one designator for nested field accesses and fields that are structs
                // Just add them behind each other to the indices list -> both cases are visualized as n-d arrays
                switch (designator) {
                    ICASTFieldDesignator: {
                        indices += createStringValue(designator.name.toString)
                    }
                    ICASTArrayDesignator: {
                        indices += designator.subscriptExpression.createKExpression(state, dRegion)
                        isArrayField = true
                    }
                }
            }

            val operand = el.getOperand()
            var Expression initVal
            if (!(operand instanceof IASTInitializerList) || isArrayField || !(operand instanceof IASTInitializerList && isInitializerListForStructs(operand as IASTInitializerList))) {
                initVal = createKExpression(operand, state, dRegion)
                if (isCorrectExpr(initVal) && vo !== null) {
                    val assignment = createDataflowAssignment(vo, initVal)

                    // If the indices are not copied and are reused for a future assignment, they are deleted from the indices
                    // Ergo each assignment gets its own copies of shared indices..
                    val List<Expression> ownCopies = newArrayList()
                    for (e : alreadyPassedIndices) {
                        ownCopies += e.copyEObjectAndReturnCopier.key
                    }
                    assignment.reference.indices += ownCopies
                    assignment.reference.indices += indices
                    dRegion.equations += assignment
                } else {
                    println("Could not process designated initializers for clause: " + clause)
                }
            } else {
                // Resurcive call if a field is again initialized via designated initialization
                alreadyPassedIndices += indices
                processDesignatedInitializers(operand as IASTInitializerList, vo, state, dRegion, alreadyPassedIndices)
            }
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
        val Map<String, String> ps = newHashMap
        var outputs = findOutputs(stmt, rootState, ps, false)

        // Retrieve the state valued object map
        var Map<String, List<ValuedObject>> stateVariables = getStateVariables(newState)
        var stateVarPointers = getStateVarPointers(rootState)

        // Create an output declaration for each found output
        for (output : outputs) {
            // consider pointer variables when searching for the correct vo
            val vo = stateVarPointers.get(output)
            var String label
            if (vo === null) {
                label = output
            } else {
                label = vo.label !== null ? vo.label : vo.name.substring(0, vo.name.lastIndexOf(ssaNameSeperator))
            }
            // Get the respective valued object of the containing state
            val outputVO = rootState.findValuedObjectByName(label, addAssignments, dRegion)
            if (outputVO !== null) {
                if (!serializable) {
                    outputVO.insertHighlightAnnotations(stmt)
                }
                val outputRootDecl = outputVO.getVariableDeclaration
                val outputType = outputRootDecl.getType

                // Create a declaration and valued object for the output 
                val decl = createVariableDeclaration
                newState.declarations += decl
                decl.type = outputType
                decl.output = true

                // Structs use host types for a correct type label
                if (outputType === ValueType.HOST) {
                    decl.hostType = outputRootDecl.hostType
                }

                val innerOutputVO = decl.createValuedObject(output + outSuffix)
                innerOutputVO.label = output
                if (!serializable) {
                    innerOutputVO.insertHighlightAnnotations(stmt)
                }

                // structs that are handled as arrays and arrays have a cardinality (in fact this makes them to arrays)
                if (outputVO.cardinalities !== null) {
                    innerOutputVO.cardinalities.addAll(outputVO.cardinalities)
                }

                // Add the new create valued object to the ssa list and valued object list
                if (stateVariables.containsKey(output)) {
                    var varList = stateVariables.get(output)
                    varList.add(innerOutputVO)
                } else {
                    var varList = <ValuedObject>newArrayList
                    varList.add(innerOutputVO)
                    stateVariables.put(output, varList)
                }

                if (addAssignments) {
                    // Create the assignment
                    val target = outputVO
                    if (refObj === null) {
                        addEquation(dRegion, target, innerOutputVO.reference)
                    } else {
                        val source = refObj.reference => [
                            subReference = innerOutputVO.reference
                        ]
                        addEquation(dRegion, target, source)
                    }
                }
            } else {
                println("output could not be resolved: " + output + ". In the new state: " + newState.name)
            }
        }

        // If the statement contains a return statement, add a return declaration to the region.
        val isReturn = findReturn(stmt)
        val hasReturn = getStateVariables(newState).containsKey(returnObjectName)
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
            val varList = <ValuedObject>newArrayList

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
        if (statement instanceof IASTReturnStatement && (statement as IASTReturnStatement).returnValue !== null) {
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
     * @param pointers A Map that contains the names of the variables pointers, that are used in {@code stmt}, points to. 
     *      Should initially be empty.
     * @param checkId If IdExpressions should also be considered an output. Should be false for any call from the
     *                outside.
     */
    def HashSet<String> findOutputs(IASTNode stmt, State parentState, Map<String, String> pointer, boolean checkId) {
        var outputs = <String>newHashSet

        switch (stmt) {
            IASTIdExpression case checkId: {
                var varName = (stmt as IASTIdExpression).getName.toString
                if (getStateVariables(parentState).containsKey(varName))
                    outputs += varName
                else if (getStatePointers(parentState).contains(varName)) {
                    outputs += varName
                } else if (pointer.containsKey(varName)) {
                    // pointer was declared in the current state, so the variable that it points to is the output
                    varName = pointer.get(varName)
                    if(getStateVariables(parentState).containsKey(varName)) outputs += varName
                } else if(globalVars.containsKey(varName)) outputs += varName
            }
            IASTBinaryExpression: {
                // Consider non-local variables that are target of an assignment.
                val operator = stmt.getOperator
                if ((operator >= IASTBinaryExpression.op_assign) &&
                    (operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                    var op1 = stmt.getOperand1

                    // if necessary, update pointer map
                    val op2 = stmt.getOperand2
                    if (op2 instanceof IASTUnaryExpression &&
                        (op2 as IASTUnaryExpression).operator === IASTUnaryExpression.op_amper) {
                        val pointerName = op1 instanceof IASTIdExpression
                                ? (op1 as IASTIdExpression).getName.toString
                                : ((op1 as IASTUnaryExpression).operand as IASTIdExpression).getName.toString
                        pointer.put(pointerName,
                            ((op2 as IASTUnaryExpression).operand as IASTIdExpression).getName.toString)
                    }
                    // if expr is in brackets, get the expr out of it
                    if (op1 instanceof IASTUnaryExpression &&
                        (op1 as IASTUnaryExpression).operator === IASTUnaryExpression.op_bracketedPrimary) {
                        op1 = (op1 as IASTUnaryExpression).operand
                    // if expr is an array in a struct, get the fieldreference
                    } else if (op1 instanceof IASTArraySubscriptExpression &&
                        (op1 as IASTArraySubscriptExpression).arrayExpression instanceof IASTFieldReference) {
                        op1 = (op1 as IASTArraySubscriptExpression).arrayExpression
                    }
                    // determine outputs
                    if (op1 instanceof IASTIdExpression) {
                        outputs += findOutputs(op1, parentState, pointer, true)
                    } else if (op1 instanceof IASTArraySubscriptExpression) {
                        outputs += findOutputs(op1.arrayExpression, parentState, pointer, true)
                    } else if (op1 instanceof IASTUnaryExpression &&
                        (op1 as IASTUnaryExpression).operator === IASTUnaryExpression.op_star) {
                        outputs += findOutputs((op1 as IASTUnaryExpression).operand, parentState, pointer, true)
                    } else if (op1 instanceof IASTFieldReference) {
                        outputs += findOutputs((op1 as IASTFieldReference).getFieldOwner, parentState, pointer, true)
                    }

                    // Also consider the source of the expression, as assignments may be nested in other expressions,
                    // such as in 'var1 = var2 = 0' or 'callFunc(var1 = 0)'.
                    outputs += findOutputs(stmt.operand2, parentState, pointer, false)
                }
            }
            IASTUnaryExpression: {
                // Consider non-local
                val operator = stmt.getOperator
                val writingUnaryOps = #[IASTUnaryExpression.op_prefixIncr, IASTUnaryExpression.op_prefixDecr,
                    IASTUnaryExpression.op_postFixIncr, IASTUnaryExpression.op_postFixDecr]
                if (writingUnaryOps.contains(operator)) {
                    val operand = stmt.operand
                    if (operand instanceof IASTIdExpression) {
                        outputs += findOutputs(operand, parentState, pointer, true)
                    } else if (operand instanceof IASTArraySubscriptExpression) {
                        outputs += findOutputs(operand.arrayExpression, parentState, pointer, true)
                    }
                }
            }
            IASTFunctionCallExpression: {
                // function call could be in brackets
                var IASTIdExpression function
                if (stmt.functionNameExpression instanceof IASTIdExpression) {
                    function = stmt.functionNameExpression as IASTIdExpression
                } else if (stmt.functionNameExpression instanceof IASTUnaryExpression &&
                    (stmt.functionNameExpression as IASTUnaryExpression).operator ===
                        IASTUnaryExpression.op_bracketedPrimary) {
                    function = (stmt.functionNameExpression as IASTUnaryExpression).operand as IASTIdExpression
                }
                if (function !== null) {
                    val uniqueFunctionIdentifier = CProcessorUtils.nameToIdentifier(function.name, index)
                    if (functions.containsKey(uniqueFunctionIdentifier)) {
                        val funcState = functions.get(uniqueFunctionIdentifier).values.head

                        // consider global vars output by the function
                        val gVars = getStateVariables(funcState)
                        for (gV : gVars.keySet) {
                            if(globalVars.containsKey(gV) && !gVars.get(gV).filter[it.isOutput].isEmpty) outputs += gV
                        }

                        // Consider pointer arguments of a function call that get changed in the function
                        val arguments = stmt.arguments
                        var index = 0
                        for (argument : arguments) {
                            // find the corresponding output vo in the called function
                            val stateDeclarations = funcState.declarations.filter(VariableDeclaration)
                            val inputVOs = stateDeclarations.filter[it.isInput].map[it.valuedObjects].flatten
                            val outputVOs = stateDeclarations.filter[it.isOutput].map[it.valuedObjects].flatten.filter [
                                it.name != returnObjectName + outSuffix
                            ]
                            if (inputVOs.size > index) {
                                val inputVO = inputVOs.get(index)
                                val outputVO = outputVOs.findFirst [
                                    it.name.substring(0, it.name.length - outSuffix.length).equals(
                                        inputVO.name.substring(0, inputVO.name.length - inSuffix.length))
                                ]
                                // there should only be an output vo if the argument is a (indirect) pointer
                                if (outputVO !== null) {
                                    switch (argument) {
                                        IASTIdExpression: {
                                            // argument is a pointer
                                            outputs += findOutputs(argument, parentState, pointer, true)
                                        }
                                        IASTUnaryExpression: {
                                            // argument is of the form "&var"
                                            if (argument.operator === IASTUnaryExpression.op_amper) {
                                                outputs += findOutputs(argument.operand, parentState, pointer, true)
                                            }
                                        }
                                        IASTFieldReference: {
                                            // TODO: argument is of the form "&struct -> field"
                                            println("arguments of the type \"&struct->field\" are not supported yet")
                                        }
                                    }
                                }
                            }
                            index++;
                        }
                    } else {
                        // function is unkown, so we assume that arguments that are pointers get changed in the function
                        val arguments = (stmt as IASTFunctionCallExpression).arguments
                        for (argument : arguments) {
                            if (argument instanceof IASTUnaryExpression &&
                                (argument as IASTUnaryExpression).operator === IASTUnaryExpression.op_amper) {
                                // argument is of the form "&expr"
                                if ((argument as IASTUnaryExpression).operand instanceof IASTIdExpression) {
                                    // argument is of the form "&var"
                                    outputs +=
                                        ((argument as IASTUnaryExpression).operand as IASTIdExpression).name.toString
                                } else {
                                    // TODO: argument is of the form "&struct -> field"
                                    println("arguments of the type \"&struct->field\" are not supported yet")
                                }
                            } else if (argument instanceof IASTIdExpression) {
                                // argument could be a pointer or global variable
                                var varName = (argument as IASTIdExpression).getName.toString
                                if (getStatePointers(parentState).contains(varName)) {
                                    outputs += varName
                                } else if (pointer.containsKey(varName)) {
                                    // pointer was declared in the current state, so the variable that it points to is the output
                                    varName = pointer.get(varName)
                                    if(getStateVariables(parentState).containsKey(varName)) outputs += varName
                                } else if(globalVars.containsKey(varName)) outputs += varName
                            }
                        }
                    }

                    // Check every child for other statements.
                    for (child : stmt.children) {
                        outputs += findOutputs(child, parentState, pointer, false)
                    }
                }
            }
            IASTFieldReference: {
                // we want the top-level owner of the field
                outputs += findOutputs(stmt.getFieldOwner, parentState, pointer, checkId)
            }
            default: {
                // if stmt is a pointer declaration, update the pointer map
                if (stmt.children.size === 3 && stmt.children.get(0) instanceof IASTPointer) {
                    val init = (stmt.children.get(2) as IASTEqualsInitializer).children.get(0)
                    if (init instanceof IASTUnaryExpression 
                        && (init as IASTUnaryExpression).operand instanceof IASTIdExpression
                    ) {
                        val varName = ((init as IASTUnaryExpression).operand as IASTIdExpression).getName.toString
                        pointer.put(stmt.children.get(1).toString, varName)
                    } else {
                        pointer.put(stmt.children.get(1).toString, null)
                    }
                }
                // Check every child for other statements.
                for (child : stmt.children) {
                    outputs += findOutputs(child, parentState, pointer, false)
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
        val Map<String, String> ps = newHashMap
        var outputs = findOutputs(stmt, rootState, ps, false)
        inputs.addAll(outputs)

        // Retrieve the state's valued object map
        var Map<String, List<ValuedObject>> stateVariables = getStateVariables(newState)

        for (input : inputs) {
            if(getStatePointers(rootState).contains(input)) getStatePointers(newState).add(input)
            // Retrieve the respective valued object of the containing state 
            var inputVO = rootState.findValuedObjectByName(input, false, dRegion)
            if (inputVO !== null) {
                
                val inputRootDecl = inputVO.getVariableDeclaration
                val inputType = inputRootDecl.getType

                // Create the input for the control statement state
                val decl = createVariableDeclaration
                newState.declarations += decl
                decl.type = inputType

                // Structs use host types for a correct type label
                if (inputType === ValueType.HOST) {
                    decl.hostType = inputRootDecl.hostType
                }
                decl.input = true
                val innerInputVO = decl.createValuedObject(input + inSuffix)
                innerInputVO.label = input

                // structs that are handled as arrays and arrays have a cardinality (in fact this makes them to arrays)
                if (inputVO.cardinalities !== null) {
                    innerInputVO.cardinalities.addAll(inputVO.cardinalities)
                }

                if (!serializable) {
                    innerInputVO.insertHighlightAnnotations(stmt)
                }

                // Add the new create valued object to the ssa list and valued object list
                if (stateVariables.containsKey(input)) {
                    var varList = stateVariables.get(input)
                    varList.add(innerInputVO)
                } else {
                    var varList = <ValuedObject>newArrayList
                    varList.add(innerInputVO)
                    stateVariables.put(input, varList)
                }

                if (addAssigments) {
                    // Create the assignment
                    if (refObj === null) {
                        addEquation(dRegion, innerInputVO, inputVO.reference)
                    } else {
                        addEquation(dRegion, refObj, innerInputVO, inputVO.reference)
                    }
                }
            } else {
                println("input could not be resolved: " + input + ". In the new state: " + newState.name)
            }
        }
    }

    /**
     * Find the Inputs needed for the given control statement
     */
    def HashSet<String> findInputs(IASTNode stmt, State parentState) {
        var inputs = <String>newHashSet
        // Add a found non local variable use
        switch (stmt) {
            IASTIdExpression: {
                val varName = (stmt as IASTIdExpression).getName.toString
                if(getStateVariables(parentState).containsKey(varName)) inputs += varName
                else if(globalVars.containsKey(varName)) inputs += varName
            }
            // Consider only variables that are not target of an assignment    
            IASTBinaryExpression: {
                val operator = (stmt as IASTBinaryExpression).getOperator
                if ((operator >= IASTBinaryExpression.op_assign) &&
                    (operator <= IASTBinaryExpression.op_binaryOrAssign)) {
                    inputs = findInputs(stmt.getOperand2, parentState)
                    // If operand1 is an array, we consider it to be "read" as well.
                    if (stmt.operand1 instanceof IASTArraySubscriptExpression) {
                        inputs += findInputs(stmt.getOperand1, parentState)
                    }
                } else {
                    inputs = findInputs(stmt.getOperand1, parentState)
                    inputs += findInputs(stmt.getOperand2, parentState)
                }
            }
            // Consider only arguments of a function call    
            IASTFunctionCallExpression: {
                // function call could be in brackets
                var IASTIdExpression function
                if (stmt.functionNameExpression instanceof IASTIdExpression) {
                    function = stmt.functionNameExpression as IASTIdExpression
                } else if (stmt.functionNameExpression instanceof IASTUnaryExpression &&
                    (stmt.functionNameExpression as IASTUnaryExpression).operator ===
                        IASTUnaryExpression.op_bracketedPrimary) {
                    function = (stmt.functionNameExpression as IASTUnaryExpression).operand as IASTIdExpression
                }
                if (function !== null) {
                    val arguments = (stmt as IASTFunctionCallExpression).getArguments
                    for (argument : arguments) {
                        inputs += findInputs(argument, parentState)
                    }
                    // consider global vars used by the function
                    val uniqueFunctionIdentifier = CProcessorUtils.nameToIdentifier(function.name, index)
                    if (functions.get(uniqueFunctionIdentifier) !== null) {
                        val state = functions.get(uniqueFunctionIdentifier).values.head
                        val gVars = getStateVariables(state)
                        for (gV : gVars.keySet) {
                            if(globalVars.containsKey(gV)) inputs += gV
                        }
                    } else {
                        getUnresFuncDeps(parentState).add(uniqueFunctionIdentifier)
                    }
                }
            }
            default: {
                // Test all children of other statements   
                for (child : stmt.children) {
                    inputs += findInputs(child, parentState)
                }
            }
        }
        return inputs
    }

    /**
     * Find the state for the given function identifier.
     * @param identifier The {@code IASTName} object from the AST identifying the function.
     */
    def State findFunctionState(IASTName identifier, int numParams) {
        val mappingIdentifier = CProcessorUtils.nameToIdentifier(identifier, index)
        return functions.get(mappingIdentifier)?.get(numParams)
    }

    /**
     * Find the state for the given function name, or create a new unknown function state and remember it.
     * 
     * @param expression The function call expression to find the state for.
     * @param state The surrounding state that will contain this state, for reference.
     * @param dRegion The surrounding dataflow region that will contain this state, for reference.
     * @return The state for the function.
     */
    def State findFunctionState(IASTFunctionCallExpression expression, State state, DataflowRegion dRegion) {
        var IASTExpression expr = expression.getFunctionNameExpression
        if (expression.getFunctionNameExpression instanceof IASTUnaryExpression &&
            (expression.getFunctionNameExpression as IASTUnaryExpression).operator ===
                IASTUnaryExpression.op_bracketedPrimary) {
            // expression is in brackets
            expr = (expression.getFunctionNameExpression as IASTUnaryExpression).operand
        }
        val funcName = (expr as IASTIdExpression).getName
        val existingFunction = findFunctionState(funcName, expression.arguments.size)
        if (existingFunction === null) {
            return createUnknownFunctionScaffold(funcName, expression, state, dRegion)
        }
        return existingFunction
    }

    /**
     * Find the valued object of the given state by its variables name and creates a new valued object if needed
     */
    def ValuedObject findValuedObjectByName(State state, String name, List<Expression> index, boolean writing,
        Region dRegion) {
        // Retrieve the last valued object of the variables list
        var ValuedObject vo
        val varList = getStateVariables(state).get(name)
        if (varList === null) {
            return null
        }
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
                val hostType = varDecl.hostType

                // If the original variable declaration was attached to the state the new one should be attached to the
                // dataflow region
                if (!dRegion.declarations.contains(varDecl)) {
                    varDecl = createVariableDeclaration
                    varDecl.annotations += createTagAnnotation("Hide")
                    varDecl.type = type

                    if (type === ValueType.HOST) {
                        varDecl.hostType = hostType
                    }

                    dRegion.declarations += varDecl
                }

                // Create the valued object and add it to the variable list, before the outSuffix object
                vo = varDecl.createValuedObject(varName)
                if (!serializable) {
                    if(OffsetAnno.length > 0) vo.annotations += OffsetAnno.head
                    if(LengthAnno.length > 0) vo.annotations += LengthAnno.head
                }
                varList.add(0, vo)
            }
        }
        // For Arrays only create a new VO if is written to for a first time or after a read, or if the specific index
        // has been written to before to still preserve SSA (at least for constant expressions), but connect what
        // belongs together.
        val boolean isArray = index !== null
        var boolean newArrayVONeeded = false
        var EList<Expression> cards;
        val isUnion = vo.hasAnnotation(unionTag)
        
        if (isArray && !isUnion) {
            var alreadyWrittenIdxs = voWrittenIdxs.get(vo)
            var alreadyReadIndices = voReadIndices.get(vo)
            
            cards = vo.cardinalities
            if (writing) {
                switch (alreadyWrittenIdxs) {
                    case alreadyWrittenIdxs === null: {
                        alreadyWrittenIdxs = newHashSet
                        voWrittenIdxs.put(vo, alreadyWrittenIdxs)
                        newArrayVONeeded = true
                    }
                    case alreadyWrittenIdxs.empty: {
                        newArrayVONeeded = true
                    } 
                    case alreadyWrittenIdxs.exists[expressionListsEquals(it, index)] || (alreadyReadIndices !== null
                        ? alreadyReadIndices.exists [expressionListsEquals(it, index)]
                        : false): {
                        // Any subsequent write to that array only needs a new VO if it is on a already used array index
                        newArrayVONeeded = true
                    }
                    default:
                        alreadyWrittenIdxs.add(index)
                }
                
            } else {
                // Branch for accessing/reading an array
                
                // We want to read from newest variant of the array in which the index was changed!
                // In many cases, that's not the newest variant of the array.
                var searchedVo = varList.reverseView.findFirst[candVo | val writtenIndices = voWrittenIdxs.get(candVo)
                    writtenIndices !== null && writtenIndices.exists[expressionListsEquals(it, index)]
                ]
                if(searchedVo !== null){
                    alreadyReadIndices = voReadIndices.get(searchedVo)
                    vo = searchedVo
               }else{
                   vo = varList.get(0)
                   alreadyReadIndices= voReadIndices.get(vo)
               }
                   
                switch(alreadyReadIndices){
                    case alreadyReadIndices === null :{
                        alreadyReadIndices = newHashSet
                        alreadyReadIndices.add(index)
                        voReadIndices.put(vo, alreadyReadIndices)
                    }
                    case alreadyReadIndices.empty || !alreadyReadIndices.exists[expressionListsEquals(it, index)] :{
                        alreadyReadIndices.add(index)
                        voReadIndices.put(vo, alreadyReadIndices)
                    }
                }               
            }
        }
        // At any time, only one field of a value can carry information. So, each write should create a new ValuedObject
        if(isUnion && writing){
             cards = vo.cardinalities
             newArrayVONeeded = true
        }

        // If the valued object is meant to be written to, a new one has to be created to preserve the SSA-form
        if (writing && !onlyOut && /* isArray => newArrayVONeeded */ (!isArray || newArrayVONeeded)) {
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
            val hostType = varDecl.hostType
            if (!dRegion.declarations.contains(varDecl)) {
                varDecl = createVariableDeclaration
                varDecl.annotations += createTagAnnotation("Hide")
                varDecl.type = type
                if (type === ValueType.HOST) {
                    varDecl.hostType = hostType
                }
                dRegion.declarations += varDecl
            }

             val hasStructAnnotation = vo.hasAnnotation(structTag)
             val hasUnionAnnotation = vo.hasAnnotation(unionTag)
            // Create the valued object
            vo = varDecl.createValuedObject(newName)
            
            if(hasStructAnnotation){
                vo.annotations += createTagAnnotation(structTag)
            }
            
            if(hasUnionAnnotation){
               vo.annotations += createTagAnnotation(unionTag) 
            }

            if (hasOut) {
                varList.add(varList.length - 1, vo)
            } else {
                varList.add(vo)
            }

            // If the vo is for an array, note which index has been used now.
            if (isArray && writing) {
                val writtenIdxs = newHashSet
                writtenIdxs.add(index)
                voWrittenIdxs.put(vo, writtenIdxs)

                // take the cardinalities from the old vo
                vo.cardinalities.addAll(cards)
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
        var stateVariables = getStateVariables(state)
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
                    val returnState = createState(returnCombineName + returnCombineCounter++)
                    returnState.label = returnCombineName
                    returnState.annotations += createTagAnnotation("Hide")
                    if (serializable) {
                        rootSCChart.rootStates += returnState
                    }
                    returnState.createDataflowRegion(returnCombineName) => [
                        label = returnCombineName
                    ]

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

                        if (newDecl.type === ValueType.HOST) {
                            newDecl.hostType = inputVO.variableDeclaration.hostType
                        }

                        returnState.declarations += newDecl
                        val innerInputVO = newDecl.createValuedObject(inputVO.name)
                        innerInputVO.label = inputVO.name

                        // Create the assignment
                        // The assignment is of the form 'return_combine.res_n = res_n'
                        addEquation(dRegion, returnStateObject, innerInputVO, inputVO.reference)
                    }

                    // Set the output of the state
                    val outDecl = createVariableDeclaration
                    outDecl.type = outVO.type
                    outDecl.output = true

                    if (outVO.type === ValueType.HOST) {
                        outDecl.hostType = outVO.variableDeclaration.hostType
                    }
                    returnState.declarations += outDecl
                    val innerOutputVO = outDecl.createValuedObject(outVO.name)
                    innerOutputVO.label = returnObjectName

                    // Create the assignment
                    // The assignment is of the form 'res = return_combine.res out'
                    val source = returnStateObject.reference => [
                        subReference = innerOutputVO.reference
                    ]
                    addEquation(dRegion, outVO, source)
                } else {
                    // Connect the last valued object in the list not being the output variable to the
                    // output suffixed valued object as the last SSA object is the output value for that variable.
                    // Retrieve the last ssa valued object
                    var lastVO = varList.get(varList.length - 1)
                    if (lastVO.getName.contains(outSuffix) && (varList.length > 1)) {
                        lastVO = varList.get(varList.length - 2)
                    }
                    // Copy the location information of the last ssa vo to the output vo
                    if (!serializable && outVO.annotations.length < 2) {
                        outVO.annotations += createStringAnnotation("Offset", lastVO.getStringAnnotationValue("Offset"))
                        outVO.annotations += createStringAnnotation("Length", lastVO.getStringAnnotationValue("Length"))
                    }
                    // Add the linking assignment
                    addEquation(dRegion, outVO, lastVO.reference)
                }
            }
        }
    }

    /**
     * Assigns the output valued of the ssa list to the surrounding region for each output of the given state.
     */
    def void assignOutputs(State state, ValuedObject refObject, State rootState, DataflowRegion dRegion) {
        var stateVariables = getStateVariables(state)
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
                addEquation(dRegion, target, source)
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

        var varList = getStateVariables(state).get(varName)
        vo = varList.findOutputVar

        return vo
    }

    /**
     * Returns true if the expressions definitely contain the same value. 
     * Currently, works with {@code Values}, {@code OperatorExpressions}, and {@code ValuedObjectReferences}.
     * The latter are considered equal, if they have the same name. 
     * This approach is chosen because {@code FindValuedObjectByName} gives a variable a new name 
     * if it was affected by a write. 
     * 
     * @param expression1 
     * @param expression2
     */
    def boolean expressionEquals(Expression expression1, Expression expression2) {
       if(expression1.class !== expression2.class){
           return false
       }
       
       switch(expression1){
            BoolValue:
                return expression1.value.equals((expression2 as BoolValue).value)
            FloatValue:
                return expression1.value.equals((expression2 as FloatValue).value)
            IntValue:
                return expression1.value.equals((expression2 as IntValue).value)
            StringValue:
                return expression1.value.equals((expression2 as StringValue).value)
            OperatorExpression: {                
                //Operator Expressions are equal if they have the same operator and the lists of arguments are equal.
                val exp2 = expression2 as OperatorExpression
                if (expression1.operator !== exp2.operator) {
                    return false
                }
                return expressionListsEquals(expression1.subExpressions, exp2.subExpressions)
            }
            ValuedObjectReference: {
                // For the moment two ValuedObjectReferences aka variables are considered equal if their name is equal.
                // FindValuedObjectByName  gives a variable a new name if there was a write. Ergo equal name -> equal content
                val vo1 = expression1.valuedObject
                val vo2 = (expression2 as ValuedObjectReference).valuedObject
                if (vo1 !== null && vo2 !== null) {
                    return vo1.name.toString.equals(vo2.name.toString)
                }
            }
        }
        //TODO: Thinking about when function calls are equal is missing, but that's a more complex case.
        print("The method expressionEquals tried to check the equality 
               of two instances of an not supported expression type. 
               The result is false as a default in this case. The type was: " + expression1.class + ". \n")
        return false
    }
    

    /**
     * Create a list of assignments for the given binary expression.
     */
    def ArrayList<Assignment> createAssignments(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        val operator = binExpr.getOperator
        var assignments = <Assignment>newArrayList
        var Assignment ass = null
        // Only if the binary expression is an assignment some work is needed
        if (operator == IASTBinaryExpression.op_assign) {
            var sourceExpr = binExpr.children.get(1)
            // TODO: cast could be visualized
            if (sourceExpr instanceof IASTCastExpression) {
                sourceExpr = sourceExpr.operand
            }
            var Expression source = null
            switch (sourceExpr) {
                // If source expression is a variable read retrieve the respective VO
                IASTIdExpression: {
                    source = funcState.findValuedObjectByName((sourceExpr as IASTIdExpression).getName.toString, false,
                        dRegion).reference
                }
                // Translate the expression that is meant to be assigned
                IASTBinaryExpression: {
                    source = createKExpression(sourceExpr, funcState, dRegion)
                }
                IASTUnaryExpression: {
                    source = createKExpression(sourceExpr, funcState, dRegion)
                }
                // Translate a function call that will be assigned
                IASTFunctionCallExpression: {
                    // Create the function reference
                    source = createFunctionCall(sourceExpr, funcState, dRegion)
                }
                // Create a value expression for a literal    
                IASTLiteralExpression: {
                    source = createValue(sourceExpr)
                }
                IASTConditionalExpression: {
                    source = createKExpression(sourceExpr, funcState, dRegion)
                }
                IASTArraySubscriptExpression: {
                    source = createKExpression(sourceExpr, funcState, dRegion)
                }
                IASTFieldReference: {
                    source = createKExpression(sourceExpr, funcState, dRegion)
                }
            }

            // Retrieve the assignment target
            val targetAndIndex = retrieveTargetAndIndexExpr(binExpr.getOperand1, funcState, dRegion)

            var Map<String, ValuedObject> statePointers = getStateVarPointers(funcState)
            // reset pointer map if target is a pointer
            if (binExpr.getOperand1 instanceof IASTIdExpression &&
                statePointers.containsKey((binExpr.getOperand1 as IASTIdExpression).getName.toString)) {
                val varName = targetAndIndex.target.name.substring(0,
                    targetAndIndex.target.name.lastIndexOf(ssaNameSeperator))
                statePointers.put(varName, null)
            }
            // if source is "&exp" update pointer ref to the corresponding vo
            if (sourceExpr instanceof IASTUnaryExpression &&
                (sourceExpr as IASTUnaryExpression).operator === IASTUnaryExpression.op_amper) {
                statePointers.put(
                    targetAndIndex.target.name.substring(0, targetAndIndex.target.name.lastIndexOf(ssaNameSeperator)),
                    ((source as OperatorExpression).subExpressions.get(0) as ValuedObjectReference).valuedObject)
                // we are only interested in the value the pointer points to not the address
                source = (source as OperatorExpression).subExpressions.get(0)
            }

            if (!serializable) {
                targetAndIndex.target.insertHighlightAnnotations(binExpr)
            }
            if (isCorrectExpr(source) && targetAndIndex.target !== null) {
                ass = createDataflowAssignment(targetAndIndex.target, source)
                if (targetAndIndex.index !== null) {
                    if (targetAndIndex.indices !== null) {
                        ass.reference.indices.addAll(targetAndIndex.indices)
                    } else {
                        ass.reference.indices += targetAndIndex.index
                    }
                }
            } else {
                println(
                    "Could not translate expr: " + source + ". For target: " + targetAndIndex.target +
                        ". In the state: " + funcState.name)
            }
        }
        if (ass !== null) {
            assignments.add(ass)
        }
        return assignments
    }

    /**
     * Retrieve the target valued object for the given target expression for the given function state and dataflow
     * region, as well as the index if the target is an array.
     * 
     * @param targetExpr the expression of the target
     * @param funcState the function's state in which the expression was called
     * @param dRegion the dataflow region of the function's state
     * @returns the requested target as a {@code ValuedObjectAndExpression}
     */
    def ValuedObjectAndExpression retrieveTargetAndIndexExpr(IASTExpression targetExpr, State funcState,
        DataflowRegion dRegion) {
        val ValuedObjectAndExpression result = new ValuedObjectAndExpression

        switch (targetExpr) {
            IASTIdExpression: {
                result.target = funcState.findValuedObjectByName(targetExpr.getName.toString, true, dRegion)
            }
            IASTArraySubscriptExpression: {
                // The target is an array accessed by a subscript expression
                val firstArrayIndex = targetExpr.argument.createKExpression(funcState, dRegion)
                val targetArrayExpr = targetExpr.arrayExpression
                val indexExpressions = newArrayList(firstArrayIndex)

                // walk from right to left through the subscript expression to get the identifier and collect the indices
                var currentArrayExpr = getArrayIdentifier(targetExpr, indexExpressions, funcState, dRegion)
                switch (currentArrayExpr) {
                    IASTIdExpression: {
                        result.target = funcState.findValuedObjectByName(
                            exprToString(currentArrayExpr, sourceFile), indexExpressions, true, dRegion)
                        result.index = firstArrayIndex
                        result.indices = indexExpressions
                    }
                    IASTFieldReference: {
                        // The identifier of the array is a struct's field
                        val castArrayExpr = currentArrayExpr
                        val fieldName = castArrayExpr.fieldName.toString
                        indexExpressions.add(0, createStringValue(fieldName))

                        if (castArrayExpr.fieldOwner instanceof IASTIdExpression) {
                            result.target = funcState.findValuedObjectByName(
                                (castArrayExpr.fieldOwner as IASTIdExpression).name.toString, indexExpressions, true,
                                dRegion)
                            result.index = firstArrayIndex
                            result.indices = indexExpressions
                        } else {
                            // TODO: support strcut->struct->field[i] = x
                            println("ArraySubscriptExpression which owner is a FieldReference is not supported yet")
                        }
                    }
                    default: {
                        // Try to solve it recursively somehow
                        print("Probably not supported targetExpression. It has the type: " + targetExpr.class.toString)
                        val res = retrieveTargetAndIndexExpr(targetArrayExpr, funcState, dRegion)
                        result.target = res.target
                        result.index = res.index
                    }
                }
            }
            IASTFieldReference: {
                // Write on a field of a struct/union
                /*
                 * Lookup the array that represents the struct. 
                 * Force the array visualization to take a string as index.
                 */
                val fieldName = targetExpr.fieldName.toString

                val List<Expression> indexExpressions = newArrayList()
                val owner = getFieldIdentifier(targetExpr, indexExpressions, funcState, dRegion)
                if (owner instanceof IASTIdExpression) {
                    var ownerName = (owner as IASTIdExpression).name.toString
                    val statePointerVars = getStateVarPointers(funcState)
                    if (statePointerVars.containsKey(ownerName)) {
                        val ref = statePointerVars.get(ownerName)
                        ownerName = ref.label !== null
                            ? ref.label
                            : ref.name.substring(0, ref.name.lastIndexOf(ssaNameSeperator))
                    }
                    val artificialIndexExpr = createIndexForFieldAccess(fieldName, funcState, dRegion)
                    val arrayRepresentant = funcState.findValuedObjectByName(ownerName,
                        newArrayList(artificialIndexExpr), true, dRegion)

                    result.target = arrayRepresentant
                    result.index = artificialIndexExpr
                    result.indices = indexExpressions.reverse
                } else {
                    // TODO: support array[i] -> field = x
                    println("FieldReference which owner is a ArraySubscriptExpression is not supported yet")
                }
            }
            IASTUnaryExpression: {
                if (targetExpr.operator === IASTUnaryExpression.op_bracketedPrimary) {
                    val res = retrieveTargetAndIndexExpr(targetExpr.operand, funcState, dRegion)
                    return res
                }
                // target is of the form "*pointer"
                val op = targetExpr.operand
                val name = (op as IASTIdExpression).getName.toString
                val map = getStateVarPointers(funcState)
                val vo = map.get(name)
                if (vo === null) {
                    result.target = funcState.findValuedObjectByName(name, true, dRegion)
                } else {
                    result.target = funcState.findValuedObjectByName(vo.label, true, dRegion)
                }
            }
            default: {
                println("DataflowExtractor: Unsupported assignment target detected!" + targetExpr.expressionType)
            }
        }
        return result
    }

    /**
     * Structure class to return a {@code ValuedObject} and an {@code Expression} in a method.
     */
    private static class ValuedObjectAndExpression {
        public ValuedObject target
        public Expression index
        public List<Expression> indices
    }

    /**
     * Create a lazy assignment like += and add them to the given dataflow region.
     */
    def void createLazyAssignment(IASTBinaryExpression expression, State funcState, DataflowRegion dRegion,
        int operator) {
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
        val inc = #[IASTUnaryExpression.op_postFixIncr, IASTUnaryExpression.op_prefixIncr]
        val dec = #[IASTUnaryExpression.op_postFixDecr, IASTUnaryExpression.op_prefixDecr]
        if ((inc + dec).contains(expression.operator)) {
            // Translate this pre- or postfix increment/decrement like a usual assignment such as i = i + 1
            // Create the source expression, for example i + 1
            val operator = if(inc.contains(expression.operator)) OperatorType::ADD else OperatorType::SUB
            val source = createOperatorExpression(operator) => [
                it.subExpressions += createKExpression(expression.operand, funcState, dRegion)
                it.subExpressions += createIntValue(1)
            ]

            // look for the target and add it to the dataflow region as an assignment.
            val targetAndIndex = retrieveTargetAndIndexExpr(expression.operand, funcState, dRegion)

            if (!serializable) {
                targetAndIndex.target.insertHighlightAnnotations(expression)
            }
            if (isCorrectExpr(source) && targetAndIndex.target !== null) {
                val Assignment ass = createDataflowAssignment(targetAndIndex.target, source)
                if (targetAndIndex.index !== null) {
                    ass.reference.indices += targetAndIndex.index
                }
                dRegion.equations += ass
            } else {
                println("Could not translate expr: " + source + ". For target: " + targetAndIndex.target)
            }
            return
        }

        // Create the expression
        val sourceExpression = createKExpression(expression, funcState, dRegion)
        // Retrieve the respective variable VO                
        val opName = (expression.getOperand as IASTIdExpression).getName.toString
        val opVO = funcState.findValuedObjectByName(opName, true, dRegion)

        if (!serializable) {
            opVO.insertHighlightAnnotations(expression)
        }
        // Create the Assignment
        addEquation(dRegion, opVO, sourceExpression)        
    }

    /**
     * Translate a function call expression and add it to the dataflow region.
     * 
     * @param expression The function call expression to translate into SCCharts.
     * @param state The surrounding state where this function call should be added to.
     * @param dRegion The dataflow region where this dunction call should be added to.
     * @return A reference to the valued object for this function call.
     */
    def ValuedObjectReference createFunctionCall(IASTFunctionCallExpression expression, State state,
        DataflowRegion dRegion) {
        val refState = findFunctionState(expression, state, dRegion)
        // Find an existing reference to this state the reference
        var ReferenceDeclaration refDecl = dRegion.declarations.filter(ReferenceDeclaration).findFirst [
            it.reference === refState
        ]
        // Create a new reference if none was found yet
        if (refDecl === null) {
            refDecl = createReferenceDeclaration
            refDecl.setReference(refState)
            refDecl.annotations += createTagAnnotation("Hide")
            dRegion.declarations += refDecl
        }

        // Create a valued object for the referenced state
        val refObj = refDecl.createValuedObject(refState.name + ssaNameSeperator + referenceCounter)
        refObj.label = refState.label
        if (!serializable) {
            refObj.insertHighlightAnnotations(expression)
        }

        // Create all assignments for the function call
        var index = 0
        
        // assignements for input global vars
        val stateDecls = refState.declarations.filter(VariableDeclaration)
        val inputGVs = stateDecls.filter[it.isInput].map[it.valuedObjects].flatten.filter [
            globalVars.containsKey(it.label)
        ]
        val outputGVs = stateDecls.filter[it.isOutput].map[it.valuedObjects].flatten.filter [
            it.name != returnObjectName + outSuffix && globalVars.containsKey(it.label)
        ]
        for (gV : inputGVs) {
            if (globalVars.containsKey(gV.label)){
                val argExpr = findValuedObjectByName(state, gV.label, false, dRegion)
                addEquation(dRegion, refObj, gV, argExpr.reference)
            }
        }
        
        // assignments for output global vars
        for (gV : outputGVs) {
            val target = state.findValuedObjectByName(gV.label, true, dRegion)
            if (refObj === null) {
                addEquation(dRegion, target, gV.reference)
            } else {
                val source = refObj.reference => [
                    subReference = gV.reference
                ]
                addEquation(dRegion, target, source)
            }
        }
        
        for (argument : expression.arguments) {
            // Create the assignments from the function inputs to inputs of the referenced state.
            val argExpr = argument.createKExpression(state, dRegion)
            val stateDeclarations = refState.declarations.filter(VariableDeclaration)
            val inputVOs = stateDeclarations.filter[it.isInput].map[it.valuedObjects].flatten
            val outputVOs = stateDeclarations.filter[it.isOutput].map[it.valuedObjects].flatten.filter [
                it.name != returnObjectName + outSuffix
            ]
            val inputVO = inputVOs.get(index)
            addEquation(dRegion, refObj, inputVO, argExpr)
            // Create the assignments from the referenced state's outputs to the corresponding
            // previous input VOs.
            val outputVO = outputVOs.findFirst [
                it.name.substring(0, it.name.length - outSuffix.length).equals(
                    inputVO.name.substring(0, inputVO.name.length - inSuffix.length))
            ]
            if (outputVO !== null && argExpr instanceof ValuedObjectReference) {
                // Search for the VO in the surrounding state that was given as the argument
                val variableVOName = (argExpr as ValuedObjectReference).valuedObject.name
                val outputToVO = findValuedObjectByName(state,
                    variableVOName.substring(0, variableVOName.lastIndexOf(ssaNameSeperator)), true, dRegion)
                
                if (refObj !== null && outputVO !== null && outputToVO !== null) {
                    val assignment = SCChartsFactory.eINSTANCE.createDataflowAssignment => [
                        it.reference = outputToVO.reference
                        it.expression = refObj.reference => [
                            it.subReference = outputVO.reference
                        ]
                    ]
                    // TODO: this should only be executed if the code underneath is not
                    dRegion.equations += assignment
                } else {
                    println("Could not translate argument: " + argument + ". For functioncall: " + refState.name)
                }
            }
            // If the argument is some pointer, the output of the function has to be assigned to
            // the variable that pointer points to
            val indirectPointer = argument instanceof IASTUnaryExpression &&
                (argument as IASTUnaryExpression).operator === IASTUnaryExpression.op_amper
            var argumentPointer = argument instanceof IASTIdExpression
                    ? getStateVarPointers(state).get((argument as IASTIdExpression).name.toString)
                    : null

            if (indirectPointer) {
                // argument is of the form "&expr"
                if ((argument as IASTUnaryExpression).operand instanceof IASTIdExpression) {
                    val name = ((argument as IASTUnaryExpression).operand as IASTIdExpression).name.toString
                    argumentPointer = findValuedObjectByName(state, name, true, dRegion)
                } else {
                    // TODO: argument is of the form "&struct -> field" 
                }
            }

            if (argumentPointer !== null && outputVO !== null) {
                val variableVOName = argumentPointer.name
                val outputToVO = findValuedObjectByName(state,
                    variableVOName.substring(0, variableVOName.lastIndexOf(ssaNameSeperator)), true, dRegion)
                if (refObj !== null && outputVO !== null && outputToVO !== null) {
                    // add assignement
                    val assignment = SCChartsFactory.eINSTANCE.createDataflowAssignment => [
                        it.reference = outputToVO.reference
                        it.expression = refObj.reference => [
                            it.subReference = outputVO.reference
                        ]
                    ]
                    dRegion.equations += assignment
                } else {
                    println("Could not translate argument: " + argument + ". For functioncall: " + refState.name)
                }
            }
            index++
        }

        referenceCounter++
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
                var opValObj = funcState.findValuedObjectByName((expr as IASTIdExpression).getName.toString, false,
                    dRegion)
                kExpression = opValObj.reference
            }
            IASTFieldReference: {
                // TODO: Probably for EquationSynthesis: Wrong label in operation
                // Lookup the struct owning the field
                val List<Expression> indexExpressions = newArrayList()
                val owner = getFieldIdentifier(expr, indexExpressions, funcState, dRegion)
                if (owner instanceof IASTIdExpression) {
                    var opValObj = funcState.findValuedObjectByName((owner as IASTIdExpression).name.toString,
                        false, dRegion)

                    if (opValObj !== null) {
                        // if expr is of the form "pointer -> field", get the struct the pointer points to
                        val label = opValObj.label !== null
                                ? opValObj.label
                                : opValObj.name.substring(0, opValObj.name.lastIndexOf(ssaNameSeperator))
                        if (getStateVarPointers(funcState).containsKey(label)) {
                            opValObj = getStateVarPointers(funcState).get(label)
                        }
                        // Use the fieldname as a pseudo index so that it appears as label in the diagram
                        kExpression = opValObj.reference;
                        (kExpression as ValuedObjectReference).indices += indexExpressions.reverse
                    } else {
                        println("No valued object for: " + owner.name + ". In the state: " + funcState)
                    }
                } else {
                    // TODO: support for x = arr[i]-> field
                    println("FieldReference which owner is also a IASTArraySubscriptExpression is not supported yet")
                }
            }
            // For an array, just use the array expression (and leave out the subscript for now).
            IASTArraySubscriptExpression: {

                var indexExpression = expr.argument.createKExpression(funcState, dRegion)
                val List<Expression> indexExpressions = newArrayList(indexExpression)

                // For multidimensional arrays walk through the tree of SubscriptExpressions and store all subscripts
                var currentArrayExpr = getArrayIdentifier(expr, indexExpressions, funcState, dRegion)

                switch (currentArrayExpr) {
                    IASTIdExpression: {
                        var opValObj = funcState.findValuedObjectByName(
                            (currentArrayExpr as IASTIdExpression).getName.toString, indexExpressions, false, dRegion)
                        kExpression = opValObj.reference
                    }
                    IASTFieldReference: {
                        // The array is a field of a struct so lookup the hidden array under structDeclName.fieldName
                        val fieldName = currentArrayExpr.fieldName.toString
                        // adds the field's name as an index so that it ends up in the visualization
                        indexExpressions.add(0, createStringValue(fieldName))

                        if (currentArrayExpr.fieldOwner instanceof IASTIdExpression) {
                            var opValObj = funcState.findValuedObjectByName(
                                (currentArrayExpr.fieldOwner as IASTIdExpression).name.toString, indexExpressions,
                                false, dRegion)
                            kExpression = opValObj.reference
                        } else {
                            // TODO: support x = strcut->struct->field[i]
                            println("ArraySubscriptExpression which owner is a FieldReference is not supported yet")
                        }
                    }
                    default: {
                        println("Unsupported ast node to create an expression: " + expr.arrayExpression.class)
                        kExpression = expr.arrayExpression.createKExpression(funcState, dRegion)
                    }
                }
                if (kExpression !== null) {
                    (kExpression as ValuedObjectReference).indices.addAll(indexExpressions)
                }
            }
            // For a function call create a reference an return the functions output VO reference
            IASTFunctionCallExpression: {
                // Create the Reference
                kExpression = createFunctionCall(expr, funcState, dRegion)
            }
            // For a conditional expression create a state similar to an if    
            IASTConditionalExpression: {
                kExpression = buildConditional(expr, expr.logicalConditionExpression, expr.positiveResultExpression,
                    expr.negativeResultExpression, funcState, dRegion)
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
                    values += expr.clauses.map[it.createKExpression(funcState, dRegion)]
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
            case null: {
                println("Expression is null.")
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
    def Expression createKExpression(IASTBinaryExpression binExpr, State funcState, DataflowRegion dRegion) {
        var Expression expression
        if (binExpr.getOperator() == IASTBinaryExpression.op_assign) {
            val assignments = createAssignments(binExpr, funcState, dRegion)
            for (assignment : assignments) {
                dRegion.equations += assignment
            }
            expression = assignments.head.reference.valuedObject.reference
        } else {
            // Create the operator expression with the corresponding operator
            var opType = binExpr.getOperator().cdtBinaryOpTypeConversion
            expression = opType.createOperatorExpression
            // Translate the operands and attach them    
            for (operand : binExpr.children) {
                val expr = operand.createKExpression(funcState, dRegion)
                if (expr !== null) {
                    (expression as OperatorExpression).subExpressions += expr
                }
            }
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
            if (opType === OperatorType.MULT) {
                // operand could be a pointer
                if (unExpr.getOperand instanceof IASTIdExpression) {
                    // operand is a pointer
                    val pointsTo = getStateVarPointers(funcState).get(
                        (unExpr.getOperand as IASTIdExpression).name.toString)
                    if (pointsTo !== null) {
                        // return the vo the pointer points to
                        val vName = pointsTo.name.substring(0, pointsTo.name.lastIndexOf(ssaNameSeperator))
                        val vo = findValuedObjectByName(funcState, vName, false, dRegion)
                        return vo.reference
                    } else {
                        // dont visualize the operator "*"
                        return unExpr.getOperand.createKExpression(funcState, dRegion)
                    }
                } else {
                    // operand is an expression -> pointer arithmetic
                    println("Pointer Arithmetic is not properly supported yet")
                }
            }
            unKExpr = opType.createOperatorExpression
            // Attach the operand
            val operandExpression = unExpr.getOperand.createKExpression(funcState, dRegion)
            if (operandExpression !== null) {
                if (unKExpr.operator === OperatorType.BITWISE_NOT) {
                    // unKExpr is of the form "&expr"
                    return operandExpression
                }
                unKExpr.subExpressions += operandExpression
                return unKExpr
            } else {
                return null
            }
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

        val sizeofState = createState(label + ssaNameSeperator + sizeofCounter++)
        sizeofState.label = label
        sizeofState.annotations += createTagAnnotation("Hide")
        if (serializable) {
            rootSCChart.rootStates += sizeofState
        }
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

            addEquation(dRegion, sizeofObject, sizeofInputVO, sizeofInput)
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
    def ValuedObjectReference outputReference(ValuedObjectReference reference, State referenceState,
        String objectName) {
        return reference => [
            subReference = referenceState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten.filter [
                name == objectName
            ].head.reference
        ]
    }
    
    /**
     *  For multidimensional arrays walk from right to left through the subscript 
     *  expression to get the identifier and collect the indices
     * @param outermostArraySubscriptExpression The complete SubscriptExpression from AST
     * @param indexExpressions List for collecting the indices
     * @param funcState State of the function
     * @param dRegion DatafloRegion of the function state
     * @return the array identifier
     */
    def private IASTExpression getArrayIdentifier(IASTArraySubscriptExpression outermostArraySubscriptExpression,
        List<Expression> indexExpressions, State funcState, DataflowRegion dRegion) {
        var IASTExpression currentArrayExpr = outermostArraySubscriptExpression.arrayExpression
        while (currentArrayExpr instanceof IASTArraySubscriptExpression) {
            var exprAsSubscript = currentArrayExpr
            val currentIndexExpr = exprAsSubscript.argument.createKExpression(funcState, dRegion)
            indexExpressions.add(currentIndexExpr)
            currentArrayExpr = exprAsSubscript.arrayExpression as IASTExpression

        }
        return currentArrayExpr
    }
    
    /**
     * Walks from right to left through the fields of a field reference. Stores the fieldnames 
     * as expressions and returns the identifier of the struct.
     * @param outermostFieldRef The complete FieldReference from AST
     * @param indexExpressions List for collecting the indices
     * @param funcState State of the function
     * @param dRegion DatafloRegion of the function state
     * @return the struct identifier
     */
    def private IASTExpression getFieldIdentifier(IASTFieldReference outermostFieldRef,
        List<Expression> indexExpressions, State funcState, DataflowRegion dRegion) {

        var String currentFieldName = outermostFieldRef.fieldName.toString
        var IASTExpression currentOwner = outermostFieldRef.fieldOwner
        var currentIndexExpr = createIndexForFieldAccess(currentFieldName, funcState, dRegion)
        indexExpressions.add(currentIndexExpr)

        while (currentOwner instanceof IASTFieldReference) {
            currentFieldName = currentOwner.fieldName.toString
            currentOwner = currentOwner.fieldOwner
            currentIndexExpr = createIndexForFieldAccess(currentFieldName, funcState, dRegion)
            indexExpressions.add(currentIndexExpr)
        }
        return currentOwner
    }
    
    
    /**
     * Checks whether two lists of expressions are pairwise equal by using expressionEquals.
     *    @param l0 first list of expressions
     *    @param l1 second list of expressions
     */
    def expressionListsEquals(List<Expression> l0, List<Expression> l1) {
        val l0Length = l0.length
        val l1Length = l1.length

        if (l0Length != l1Length) {
            return false
        }

        for (var int i = 0; i < l0Length; i++) {
            val e0 = l0.get(i)
            val e1 = l1.get(i)
            val equal = e0.expressionEquals(e1)
            if (!equal) {
                return false
            }
        }
        return true
    }
    
    /**
     * Adds an equation to the given region if all parts components are correct.
     * @param dRegion DataflowRegion that should contain the assignment
     * @param vo ValuedObject used for the assignment
     * @param expr Expression used for the assignment
     */
    def private addEquation(DataflowRegion dRegion, ValuedObject vo, Expression expr) {
        if (vo !== null && isCorrectExpr(expr)) {
           dRegion.equations += createDataflowAssignment(vo, expr)
        } else {
            println("equation translation failed for expression: " + expr + ". In the DataflowRegion: " +
                dRegion.name)
        }
    }
    
    /**
     * Adds an equation to the given region if all parts components are correct.
     * @param dRegion DataflowRegion that should contain the assignment
     * @param refVo Reference to a valued object that is used for the assignment
     * @param vo ValuedObject used for the assignment
     * @param expr Expression used for the assignment
     */
    def private addEquation(DataflowRegion dRegion, ValuedObject refVo, ValuedObject vo, Expression expr) {
        if (vo !== null && refVo !== null && isCorrectExpr(expr)) {
           dRegion.equations += createDataflowAssignment(refVo, vo, expr)
        } else {
            println("equation translation failed for expression: " + expr + ". In the DataflowRegion: " +
                dRegion.name)
        }
    }
    
    /**
     * Checks whether the given expression {@code expr} is valid.
     * @param expr The expression that should be checked
     */
    def private boolean isCorrectExpr(Expression expr) {
        if (expr === null ||
            (expr instanceof ValuedObjectReference && (expr as ValuedObjectReference).valuedObject === null)) {
            return false
        } else if (expr instanceof OperatorExpression) {
            for (subExpr : (expr as OperatorExpression).subExpressions) {
                if (!isCorrectExpr(subExpr)) {
                    return false
                }
            }
        }
        return true
    }
    
    /**
     * Creates an {@code LiteralExpression} containing the name of a field in quotes that can be used as an 
     *     index in the array access representing the field access
     *    @param fieldName the name of the field that is meant to be accessed
     *    @param funcState state of the function
     *    @param dRegion dataflow region contained in {@code funcState}
     */
    def private Expression createIndexForFieldAccess(String fieldName, State funcState, DataflowRegion dRegion) {
        // Using this short function hides the usage of the ASTNodeFactoryFactory.
        ASTNodeFactoryFactory.defaultCNodeFactory.newLiteralExpression(3, "\"" + fieldName + "\"").
            createKExpression(funcState, dRegion)
    }
    
    /**
     * Checks whether a InitializerList is used to initialize a struct via Designated Initialization. 
     *  Does this by checking whether it includes en element of type {@code ICASTDesignatedInitializer}. 
     */
    def private isInitializerListForStructs(IASTInitializerList initializers) {
        return (initializers.getSize > 0 && initializers.clauses.get(0) instanceof ICASTDesignatedInitializer)
    }
    
    /**
     *Translates the kind of a {@code IASTElaboratedTypeSpecifier} to the string prefix of the fitting type,
     *
     * @param kind the kind of the {@code IASTElaboratedTypeSpecifier} as integer
     */
    def private elaboratedKindToString(int kind){
        switch(kind){
            case 0:  return "enum"
            case 1:  return "struct"
            case 2:  return "union"
            default: return ""
        }
    }
    
    /**
     * Adds a fitting tag to the {@code ValuedObject} created for an {@code IASTElaboratedTypeSpecifier} 
       based on the kind.  
     * @param kind the kind of the {@code IASTElaboratedTypeSpecifier} as integer
     * @param vo the ValuedObject 
     */
    def private addElaboratedTag(ValuedObject vo, int kind) {
        switch (kind) {
            case 0: vo.addTagAnnotation(structTag) // enum
            case 1: vo.addTagAnnotation(structTag)
            case 2: vo.addTagAnnotation(unionTag)
        }
    }

}
