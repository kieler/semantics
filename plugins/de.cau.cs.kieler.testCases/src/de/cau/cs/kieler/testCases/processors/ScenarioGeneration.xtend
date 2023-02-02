/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.testCases.processors

import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.simulation.SimulationContext
import java.util.List
import java.util.Map
import java.util.Random
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.simulation.SimulationHistory
import com.google.gson.JsonElement
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.nio.file.Path
import java.io.File
import java.io.FileWriter

/**
 * @author jep
 * 
 */
class ScenarioGeneration extends InplaceProcessor<SimulationContext> {

//    @Inject extension KExpressionsCompareExtensions
//    @Inject extension SCChartsScopeExtensions
//    @Inject extension SCChartsControlflowRegionExtensions
//    @Inject extension SCChartsStateExtensions
//    @Inject extension SCChartsActionExtensions
//    @Inject extension SCChartsTransitionExtensions
//    @Inject extension SCChartsFixExtensions
//    @Inject extension SCChartsOptimization
//    protected Map<String, Object> variableMap
//    protected List<VariableDeclaration> inputVariables
//    // a random generator is needed to determine input variables and end states
//    protected Random random = new Random()
    override getId() {
        "de.cau.cs.kieler.testCases.processors.scenarioGeneration"
    }

    override getName() {
        "Scenarios"
    }

    override process() {
        setModel(model.transform)
    }

    def SimulationContext transform(SimulationContext sim) {
//        val scenarioPragma = sccharts.pragmas.filter[pragma|pragma.name.equals("scenarios")]
        println("scenario processor")

        registerProcessors(sim)
        val numberSteps = 20
        val testsuites = 5

        for (var testNumber = 0; testNumber < testsuites; testNumber++) {
            // start simluation
            sim.start(false)
            // generate test
            for (var step = 0; step < numberSteps; step++) {
                sim.controller.performInternalStep
            }
            // create KTrace
            // TODO: simulation is not yet finished!
            val ktrace = createKtrace(true, sim.history)
            // save KTrace
            val ktraceFile = saveText(getCounterexampleFilePath(testNumber + ""), ktrace)
            // reset simulation
            sim.stop
            sim.reset
        }

        // load one of the traces?
        return sim
    }

    protected def Path getOutputFolder() {
        return Path.of("testCases")
    }

    protected def Path getOutputFile(String fileName) {
        return Path.of(outputFolder.toString, fileName)
    }

    protected def Path getOutputFile(String tsetName, String fileExtension) {
        var String name = "testCase"
        if (!name.isNullOrEmpty) {
            name += ("-" + tsetName + "")
        }
        name += fileExtension
        return getOutputFile(name)
    }

    protected def Path getCounterexampleFilePath(String name) {
        return getOutputFile(name, ".ktrace")
    }

    protected def File getFileInTemporaryProject(Path path) {
        val projectInfrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        val file = Path.of(projectInfrastructure.generatedCodeFolder.path, path.toString).toFile
        return file
    }

    protected def File saveText(Path path, String text) {
        val file = getFileInTemporaryProject(path)
        if (file.exists) {
            file.delete()
        }
        file.parentFile.mkdirs
        if (file.createNewFile()) {
            val myWriter = new FileWriter(file.path)
            myWriter.write(text)
            myWriter.close()
        }
        return file
    }

    public def String createKtrace(boolean includeOutputs, SimulationHistory history) {
        val sb = new StringBuilder()
        for (data : history) {
            var inputVariableMapping = ""
            var outputVariableMapping = ""
            for (variableMapping : data.input.entrySet) {
                val variable = variableMapping.key
                val expression = variableMapping.value
                inputVariableMapping += '''«variable» = «expression.toKExpression» '''
            }
            if (includeOutputs) {
                for (variableMapping : data.output.entrySet) {
                    val variable = variableMapping.key
                    val expression = variableMapping.value
                    outputVariableMapping += '''«variable» = «expression.toKExpression» '''
                }
            }

            sb.append(inputVariableMapping)
            if (!outputVariableMapping.isNullOrEmpty) {
                sb.append('''=> «outputVariableMapping»''')
            }
            sb.append(";\n")
        }
        return sb.toString
    }

    protected def String toKExpression(JsonElement exp) {
        return exp.asString
    }

    def void registerProcessors(SimulationContext sim) {
        val root = sim.system.processors as ProcessorGroup
        if (!root.processors.exists[InputGenerator.ID.equals(id)]) {
            // Add reader processor
            root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
                id = InputGenerator.ID
            ])
        }
        if (!root.processors.exists[OutputTester.ID.equals(id)]) {
            // Add check processor
            root.processors.add(KiCoolFactory.eINSTANCE.createProcessorReference => [
                id = OutputTester.ID
            ])
        }
    }

//    def State transform(State rootState) {
//        // determines how many pairs of start and end state are inspected
//        // TODO: let the user determine this number?
//        val testsuites = 2
//        // determine for how many paths between a start/end state pair is searched
//        // TODO: eliminate in the future? number of paths should depend on coverage criteria. if the criteria is near 100% we can generate the next start/end pair
//        val numberPaths = 2
//        // maximal number of steps the algorithm can take to reach the desired end state
//        val maxSteps = 20
//
//        // map for the variables used in the scchart        
//        variableMap = new HashMap<String, Object>()
//
//        // calculate test cases
//        for (var i = 0; i < testsuites; i++) {
//            // determine random start and end state
//            val allStates = rootState.allStates.toList
//            val start = allStates.indexOf(allStates.findFirst[state|state.initial]) // random.nextInt(allStates.length)
//            val end = random.nextInt(allStates.length)
//
//            for (var pathNumber = 0; pathNumber < numberPaths; pathNumber++) {
//                // initialize the variables of the model and save them in a map
//                initVariableMap(rootState.declarations)
//                // calculate random input values
//                initInputVars(rootState)
//
//                // find a path between the two states by modeling randomly the behavior of the other vehicle
//                val List<String> path = new ArrayList()
//                performActions(allStates.get(start).actions.flatMap(action|action.effects.map(effect|effect.nontracingCopy)).toList)
//                path.add(allStates.get(start).name)
//                val found = findPath(allStates, start, end, 0, maxSteps, path)
//                println(found)
//
//                println("test")
//            }
//        }
//
//        return rootState
//    }
//
//    def boolean findPath(List<State> states, int current, int end, int step, int maxSteps, List<String> path) {
//        if (current == end) {
//            return true
//        } else if (step == maxSteps) {
//            return false
//        } else {
//            // find next state
//            val currentState = states.get(current)
//            var foundTransition = false
//            for (var i = 0; i < currentState.outgoingTransitions.length && !foundTransition; i++) {
//                val transition = currentState.outgoingTransitions.get(i)
//                val trigger = evaluateBooleanExpression(transition.trigger)
//                if (trigger) {
//                    foundTransition = true
//                    
//                    performActions(transition.effects)
//                    // perform state actions
//                    performActions(transition.targetState.actions.flatMap(action|action.effects.map(effect|effect.nontracingCopy)).toList)
//
//                    // generate new input values
//                    // TODO: determine values based on the infos in the pragma, not random
//                    randomInputValueAssignment()
//
//                    // find next transition
//                    path.add(transition.targetState.name)
//                    return findPath(states, states.indexOf(transition.targetState), end, step + 1, maxSteps, path)
//                }
//            }
//            return false
//        }
//
//    }
//
//    def void performActions(List<Effect> effects) {
//        // TODO: check that the actions are really entry actions
//        for (action : effects) {
//            // TODO: check that operator is assign
//            if (action instanceof Assignment) {
//                val variable = action.reference.valuedObject.name
//                if (action.expression instanceof ValuedObjectReference) {
//                    val value = variableMap.get((action.expression as ValuedObjectReference).valuedObject.name)
//                    variableMap.put(variable, value)
//                } else if (action.expression instanceof OperatorExpression) {
//                    if ((action.expression as OperatorExpression).operator == OperatorType.ADD &&
//                        (action.expression as OperatorExpression).operator == OperatorType.MULT &&
//                        (action.expression as OperatorExpression).operator == OperatorType.DIV &&
//                        (action.expression as OperatorExpression).operator == OperatorType.SUB) {
//                        val value = evaluateNumericalExpression(action.expression)
//                        variableMap.put(variable, value)
//                    } else {
//                        val value = evaluateBooleanExpression(action.expression)
//                        variableMap.put(variable, value)
//                    }
//                } else if (action.expression instanceof IntValue) {
//                    variableMap.put(variable, (action.expression as IntValue).value)
//                }
//            }
//        }
//    }
//
//    def boolean evaluateBooleanExpression(Object expr) {
//        if (expr instanceof OperatorExpression) {
//            switch expr.operator {
//                case OperatorType.EQ:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) ==
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.GEQ:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) >=
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.GT:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) >
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.LEQ:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) <=
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.LT:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) <
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.LOGICAL_AND:
//                    return evaluateBooleanExpression(expr.subExpressions.get(0)) &&
//                        evaluateBooleanExpression(expr.subExpressions.get(1))
//                case OperatorType.LOGICAL_OR:
//                    return evaluateBooleanExpression(expr.subExpressions.get(0)) ||
//                        evaluateBooleanExpression(expr.subExpressions.get(1))
//                case OperatorType.NOT:
//                    return !evaluateBooleanExpression(expr.subExpressions.get(0))
//                default: {
//                    println("Operator not supported: " + expr.operator)
//                    return false
//                }
//            }
//        } else if (expr instanceof ValuedObject) {
//            return variableMap.get(expr.name) as Boolean
//        } else if (expr instanceof ValuedObjectReference) {
//            return variableMap.get(expr.valuedObject.name) as Boolean
//        }
//    }
//
//    def float evaluateNumericalExpression(Object expr) {
//        if (expr instanceof OperatorExpression) {
//            switch expr.operator {
//                case OperatorType.ADD:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) +
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.MULT:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) *
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.DIV:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) /
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                case OperatorType.SUB:
//                    return evaluateNumericalExpression(expr.subExpressions.get(0)) -
//                        evaluateNumericalExpression(expr.subExpressions.get(1))
//                default: {
//                    println("Operator not supported: " + expr.operator)
//                    return 0
//                }
//            }
//        } else if (expr instanceof ValuedObject) {
//            return variableMap.get(expr.name) as Float
//        } else if (expr instanceof ValuedObjectReference) {
//            return variableMap.get(expr.valuedObject.name) as Float
//        }
//    }
//
//    def void initInputVars(State rootState) {
//        // collect input variables
//        inputVariables = new ArrayList()
//        for (decl : rootState.declarations) {
//            if (decl instanceof VariableDeclaration && (decl as VariableDeclaration).input) {
//                inputVariables.add(decl as VariableDeclaration)
//            }
//        }
//        randomInputValueAssignment()
//    }
//
//    def void randomInputValueAssignment() {
//        // assign random values to input variables based on their assumed range annotation
//        for (inputVar : inputVariables) {
//            if (inputVar.type === ValueType.BOOL) {
//                inputVar.valuedObjects.forEach[variable|variableMap.put(variable.name, random.nextBoolean())]
//            } else {
//                val rangeAnnotation = inputVar.annotations.findFirst[anno|anno.name.equals("AssumeRange")]
//                val first = (rangeAnnotation as StringAnnotation).values.get(0)
//                val second = (rangeAnnotation as StringAnnotation).values.get(1)
//                switch (inputVar.type) {
//                    case ValueType.INT: {
//                        val firstInt = Integer.parseInt(first)
//                        val secondInt = Integer.parseInt(second)
//                        if (firstInt === secondInt) {
//                            inputVar.valuedObjects.forEach [ variable |
//                                variableMap.put(variable.name, firstInt)
//                            ]
//                        } else {
//                            inputVar.valuedObjects.forEach [ variable |
//                                variableMap.put(variable.name, random.nextInt(secondInt - firstInt) + firstInt)
//                            ]
//                        }
//                    }
//                    case ValueType.FLOAT: {
//                        val firstFloat = Float.parseFloat(first)
//                        val secondFloat = Float.parseFloat(second)
//                        if (firstFloat === secondFloat) {
//                            inputVar.valuedObjects.forEach [ variable |
//                                variableMap.put(variable.name, firstFloat)
//                            ]
//                        } else {
//                            inputVar.valuedObjects.forEach [ variable |
//                                variableMap.put(variable.name, random.nextFloat() * secondFloat + firstFloat)
//                            ]
//                        }
//                    }
//                    default:
//                        println("ValueType of an input variable not supported")
//                }
//            }
//        }
//    }
//
//    def void initVariableMap(List<Declaration> declarations) {
//        for (decl : declarations) {
//            if (decl instanceof VariableDeclaration) {
//                // TODO: support arrays
//                switch (decl.type) {
//                    case ValueType.BOOL:
//                        decl.valuedObjects.forEach [ object |
//                            {
//                                if (object.initialValue === null) {
//                                    variableMap.put(object.name, false)
//                                } else {
//                                    variableMap.put(object.name, object.initialValue)
//                                }
//                            }
//                        ]
//                    case ValueType.FLOAT:
//                        decl.valuedObjects.forEach [ object |
//                            {
//                                if (object.initialValue === null) {
//                                    variableMap.put(object.name, 0.0)
//                                } else {
//                                    variableMap.put(object.name, object.initialValue)
//                                }
//                            }
//                        ]
//                    case ValueType.INT:
//                        decl.valuedObjects.forEach [ object |
//                            {
//                                if (object.initialValue === null) {
//                                    variableMap.put(object.name, 0)
//                                } else {
//                                    variableMap.put(object.name, object.initialValue)
//                                }
//                            }
//                        ]
//                    default:
//                        println("ValueType of a variable not supported")
//                }
//            }
//        }
//    }
//
}
