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

import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.SimulationHistory
import de.cau.cs.kieler.verification.ltl.LTLFormulaStandaloneParser
import java.io.File
import java.io.FileWriter
import java.nio.file.Path
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.verification.ltl.lTLFormula.LTLExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration

/**
 * @author jep
 * 
 */
class ScenarioGeneration extends InplaceProcessor<SimulationContext> {

    extension KExpressionsFactory kExpressionsFactory = KExpressionsFactory.eINSTANCE

    protected Map<String, String[]> enumDefinitions

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

        // collect LTLs
        val scchart = this.environments.source.compilationContext.originalModel as SCCharts
        var List<StringAnnotation> annotations = scchart.rootStates.get(0).annotations.filter(StringAnnotation).toList
        annotations = annotations.filter [ annotation |
            annotation instanceof StringAnnotation && annotation.name.equals("LTL")
        ].toList
        val List<Expression> ltlExpressions = new ArrayList<Expression>()
        val List<ValuedObject> definedVariables = new ArrayList<ValuedObject>()
        // parse strings to LTL formulas
        for (anno : annotations) {
            val annotatedFormula = anno.values.get(0)
            val ltlFormula = LTLFormulaStandaloneParser.parseLTLFormula(annotatedFormula)
            ltlExpressions.add(ltlFormula.expr)
            definedVariables.addAll(ltlFormula.declarations.flatMap [ decl |
                decl.valuedObjects
            ].toList)
        }

        // used to check LTL coverage by the test cases
        val checkedLTLOverall = newBooleanArrayOfSize(annotations.length)

        for (var testNumber = 0; testNumber < testsuites  || checkedLTLOverall.contains(false); testNumber++) {
            // start simulation
            sim.start(false)
            // generate test
            val checkedLTL = new HashSet<Integer>()
            // initial steps
            for (var step = 0; step < 5; step++) {
                sim.controller.performInternalStep
            }
            for (var step = 0; step < numberSteps; step++) {
                sim.controller.performInternalStep
                updateCheckedLTLs(checkedLTL, sim.history, ltlExpressions, definedVariables)
            }
            updateOverallCheckedLTL(checkedLTLOverall, checkedLTL)
            // TODO: save checked LTL (write it in scchart file above LTL?)
            // create KTrace
            val ktrace = createKtrace(true, sim.history)
            // save KTrace
            saveText(getTestCaseFilePath(testNumber + ""), ktrace)
            // reset simulation
            sim.stop
            sim.reset
        }

        // TODO: load one of the traces?
        return sim
    }

    // collect enum definitions
    def Map<String, String[]> getEnumDefinitions() {
        if (this.enumDefinitions === null) {
            val scchart = this.environments.source.compilationContext.originalModel as SCCharts
            val enumDecls = scchart.rootStates.get(0).declarations.filter [ decl |
                decl instanceof ClassDeclaration && (decl as ClassDeclaration).type == ValueType.ENUM
            ].toList
            val enumMap = new HashMap<String, String[]>()
            enumDecls.forEach [ decl |
                enumMap.put(decl.valuedObjects.get(0).name, (decl as ClassDeclaration).declarations.get(0).
                    valuedObjects.map[variable|variable.name])
            ]
            this.enumDefinitions = enumMap
        }
        return this.enumDefinitions
    }

    def updateOverallCheckedLTL(boolean[] checkedLTLOverall, HashSet<Integer> checkedLTL) {
        for (i : checkedLTL) {
            checkedLTLOverall.set(i, true);
        }
    }

    // checks which LTL formulas are fulfilled by the last step in the simulation
    def updateCheckedLTLs(HashSet<Integer> checkedLTL, SimulationHistory history, List<Expression> ltlExpressions,
        List<ValuedObject> declaratedVariables) {
        // create evaluator with current variable values
        val data = history.get(0).entries
        val variableMap = createVariableValues(data, declaratedVariables)
        val evaluator = new PartialExpressionEvaluator(variableMap, getEnumDefinitions())
        evaluator.compute = true

        ltlExpressions.forEach [ expr, index |
            {
                if (!checkedLTL.contains(index)) {
                    val impl = getImplication(expr)
                    val evaluation = evaluator.evaluate(impl)
                    if (evaluation instanceof BoolValue && (evaluation as BoolValue).value) {
                        checkedLTL.add(index)
                    }
                }
            }
        ]
    }

    // returns the left side expression of the first implication in the given expression
    def Expression getImplication(Expression expression) {
        if (expression instanceof LTLExpression) {
            return getImplication((expression as LTLExpression).subExpressions.get(0))
        } else if (expression instanceof OperatorExpression) {
            switch ((expression as OperatorExpression).operator) {
                case OperatorType.INIT: {
                    return (expression as OperatorExpression).subExpressions.get(0)
                }
                default:
                    return getImplication((expression as OperatorExpression).subExpressions.get(0))
            }
        } else {
            return expression
        }
    }

    // returns a map containing the values for each variable in the definedVariables list
    def createVariableValues(Map<String, DataPoolEntry> data, List<ValuedObject> definedVariables) {
        var map = new HashMap<ValuedObject, Value>()
        for (variable : definedVariables) {
            val object = data.get(variable.name)
            if (object !== null) {
                switch (object.variableInformation.get(0).type) {
                    case ValueType.INT: {
                        val currentVal = createIntValue
                        currentVal.value = object.rawValue.asInt
                        map.put(variable, currentVal)
                    }
                    case ValueType.DOUBLE,
                    case ValueType.FLOAT: {
                        val currentVal = createFloatValue
                        currentVal.value = object.rawValue.asDouble
                        map.put(variable, currentVal)
                    }
                    case ValueType.BOOL: {
                        val currentVal = createBoolValue
                        currentVal.value = object.rawValue.asBoolean
                        map.put(variable, currentVal)
                    }
                    default: {
                    }
                }
            }
        }
        return map
    }

    /**
     * Registers the processors to generate the input before each tick and to check the output after a tick
     */
    def void registerProcessors(SimulationContext sim) {
        val root = sim.system.processors as ProcessorGroup
        if (!root.processors.exists[InputGenerator.ID.equals(id)]) {
            // Add input generator processor
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

    /**
     * Creates a ktrace for the given simulation history.
     */
    protected def String createKtrace(boolean includeOutputs, SimulationHistory history) {
        val sb = new StringBuilder()
        for (data : history) {
            var inputVariableMapping = ""
            var outputVariableMapping = ""
            // input values
            for (variableMapping : data.input.entrySet) {
                val variable = variableMapping.key
                val expression = variableMapping.value
                inputVariableMapping += '''«variable» = «expression.asString» '''
            }
            if (includeOutputs) {
                // output values
                for (variableMapping : data.output.entrySet) {
                    val variable = variableMapping.key
                    val expression = variableMapping.value
                    outputVariableMapping += '''«variable» = «expression.asString» '''
                }
            }

            // create ktrace
            sb.append(inputVariableMapping)
            if (!outputVariableMapping.isNullOrEmpty) {
                sb.append('''=> «outputVariableMapping»''')
            }
            sb.append(";\n")
        }
        return sb.toString
    }

    /**
     * Returns the path of the folder for the testcase ktraces.
     */
    protected def Path getOutputFolder() {
        return Path.of("testCases")
    }

    /**
     * Returns the path of the file with the given name.
     */
    protected def Path getOutputFile(String fileName) {
        return Path.of(outputFolder.toString, fileName)
    }

    /**
     * Returns the path of the file with the given name and file extension.
     */
    protected def Path getOutputFile(String fileName, String fileExtension) {
        var String name = "testCase"
        if (!name.isNullOrEmpty) {
            name += ("-" + fileName + "")
        }
        name += fileExtension
        return getOutputFile(name)
    }

    /**
     * Returns the path of the ktrace file with given name.
     */
    protected def Path getTestCaseFilePath(String name) {
        return getOutputFile(name, ".ktrace")
    }

    /**
     * Creates a file for the given path.
     */
    protected def File getFileInTemporaryProject(Path path) {
        val projectInfrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        val file = Path.of(projectInfrastructure.generatedCodeFolder.path, path.toString).toFile
        return file
    }

    /**
     * Creates a new file at the given path and writes the given text into it.
     */
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

}
