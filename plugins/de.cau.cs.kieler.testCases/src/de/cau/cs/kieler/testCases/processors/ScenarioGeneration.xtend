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
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.SimulationHistory
import java.io.File
import java.io.FileWriter
import java.nio.file.Path
import java.lang.reflect.Array
import javax.sound.sampled.BooleanControl.Type
import java.util.List
import de.cau.cs.kieler.annotations.Annotation

/**
 * @author jep
 * 
 */
class ScenarioGeneration extends InplaceProcessor<SimulationContext> {

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
        val numberSteps = 50
//        val testsuites = 5

        // collect LTLs
        val scchart = this.environments.source.compilationContext.originalModel as SCCharts
        var List<StringAnnotation> annotations = scchart.rootStates.get(0).annotations.filter(StringAnnotation).toList
        annotations = annotations.filter [ annotation |
            annotation instanceof StringAnnotation && annotation.name.equals("LTL")
        ].toList 

        // used to check LTL coverage by the test cases
        val checkedLTLOverall = newBooleanArrayOfSize(annotations.length)
        var allLTLChecked = false

        for (var testNumber = 0; /*testNumber < testsuites &&*/ !allLTLChecked; testNumber++) {
            // start simulation
            sim.start(false)
            // generate test
            val checkedLTL = newBooleanArrayOfSize(annotations.length)
            for (var step = 0; step < numberSteps; step++) {
                sim.controller.performInternalStep
                updateCheckedLTLs(annotations, checkedLTL, sim.history)
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
            // update stop condition
            allLTLChecked = !checkedLTL.contains(false)
        }

        // TODO: load one of the traces?
        return sim
    }
    
    def updateOverallCheckedLTL(boolean[] checkedLTLOverall, boolean[] checkedLTL) {

    }

    def updateCheckedLTLs(List<StringAnnotation> annotations, boolean[] checkedLTL, SimulationHistory history) {
        val data = history.get(history.size - 1)
        for (anno : annotations) {
            val formula = anno.values.get(0)
        }
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
