/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
 package de.cau.cs.kieler.verification.processors.nuxmv

import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import de.cau.cs.kieler.verification.processors.RunModelCheckerProcessorBase
import java.io.File
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath

import static extension de.cau.cs.kieler.scg.processors.transformators.codegen.smv.SmvCodeGeneratorExtensions.toSmvExpression
import static extension de.cau.cs.kieler.scg.processors.transformators.codegen.CodeGeneratorExtensions.toIdentifier
import static extension de.cau.cs.kieler.verification.processors.ProcessExtensions.*

/**
 * Base class to run NuSMV and nuXmv model checker.
 * 
 * @author aas
 */
abstract class RunSmvProcessor extends RunModelCheckerProcessorBase {

    public static val PROPERTY_NAME_PLACEHOLDER = "${PROPERTY_NAME}"    
    public static val DEFAULT_INTERACTIVE_COMMANDS = #['''go''', '''check_property -P «PROPERTY_NAME_PLACEHOLDER»''', '''quit''']
    
    /**
     * The command list for the process builder to start a new process.
     * @param smvFile File containing the smv code
     * @param property The property to be checked
     */
    abstract protected def List<String> getProcessBuilderCommandList(IFile smvFile, VerificationProperty property)
    
    override getType() {
        return ProcessorType.DEVELOPER
    }
    
    override process() {
        if(verificationProperties.isNullOrEmpty) {
            return
        }
        
        val codeContainer = getSourceModel
        val code = codeContainer.head.code
        val smvFile = saveText(smvFilePath, code)
        for(property : verificationProperties) {
            try {
                throwIfCanceled
                property.modelCheckerModelFile = smvFile
                property.runningTaskDescription = "Running model checker..."
                compilationContext.notify(new VerificationPropertyChanged(property))
                // Calling the model checker is possibly long running
                val processOutput = runModelChecker(smvFile, property)
                val processOutputFile = saveText(getProcessOutputFilePath(property), processOutput)
                updateVerificationResult(processOutputFile, processOutput, property)
            } catch (Exception e) {
                e.printStackTrace
                property.fail(e)
                compilationContext.notify(new VerificationPropertyChanged(property))
            }
        }
    }
    
    /**
     * Returns the list of commands that are sent sequentially to the running process.
     * 
     * @param smvFile File containing the smv code
     * @param property The property to be checked
     */
    protected def getInteractiveCommands(IFile smvFile, VerificationProperty property) {
        var List<String> customInteractiveCommands = null
        switch(property.type) {
            case INVARIANT:
                customInteractiveCommands = compilationContext.startEnvironment.getProperty(Environment.CUSTOM_INTERACTIVE_SMV_INVAR_COMMANDS)
            case LTL:
                customInteractiveCommands = compilationContext.startEnvironment.getProperty(Environment.CUSTOM_INTERACTIVE_SMV_LTL_COMMANDS)
            case CTL:
                customInteractiveCommands = compilationContext.startEnvironment.getProperty(Environment.CUSTOM_INTERACTIVE_SMV_CTL_COMMANDS)
        }
        val interactiveCommands = if (customInteractiveCommands.isNullOrEmpty)
                                      DEFAULT_INTERACTIVE_COMMANDS 
                                  else
                                      customInteractiveCommands
        return interactiveCommands.resolvePlaceholders(property)
    }
    
    private def String runModelChecker(IFile smvFile, VerificationProperty property) {
        // Get commands to start a new process and the commands to be sent to the new process
        val List<String> processCommand = getProcessBuilderCommandList(smvFile, property)
        val interactiveCommands = getInteractiveCommands(smvFile, property)
        // Create process
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(smvFile.parent.location.toOSString))
        processBuilder.command(timeCommand + processCommand)
        processBuilder.redirectErrorStream(true)
        val process = processBuilder.start()
        compilationContext.startEnvironment.setProperty(Environment.VERIFICATION_PROCESS, process)
        // Send the interactive commands sequentially to the process and
        // wait for new output from the process before the next command is sent. 
        val outputBuffer = new StringBuffer
        process.waitForOutput([ return isCanceled() ])
        throwIfCanceled
        outputBuffer.append(process.readInputStream)
        for(command : interactiveCommands.filter[!it.isNullOrEmpty]) {
            // Send command to the process
            val commandWithNewline = command+"\n"
            process.outputStream.write(commandWithNewline.bytes)
            process.outputStream.flush
            // Add the sent command to the outputBuffer, so one can understand what happened when viewing the log 
            outputBuffer.append(commandWithNewline)
            // Wait for new output from the process
            process.waitForOutput([ return isCanceled() ])
            throwIfCanceled
            outputBuffer.append(process.readInputStream)
        }
        // Wait until the process is done with all commands
        process.waitForTermination([ return isCanceled() ])
        outputBuffer.append(process.readInputStream)
        // Get combined process output
        val processOutput = outputBuffer.toString
        throwIfCanceled
        return processBuilder.command.toString.replace("\n", "\\n") + "\n" + processOutput
    }
    
    private def void updateVerificationResult(IFile processOutputFile, String processOutput, VerificationProperty property) {
        property.processOutputFile = processOutputFile
        property.updateTaskDescriptionAndNotify("Parsing model checker output...")
        val interpreter = new NuxmvOutputInterpreter(processOutput)
        val counterexample = interpreter.counterexamples.head
        val passedSpec = interpreter.passedSpecs.head
        if(counterexample !== null && property.matches(counterexample.spec)) {
            val store = VariableStore.get(compilationContext.startEnvironment)
            property.updateTaskDescriptionAndNotify("Saving KTrace...")
            val createCounterexampleWithOutputs = compilationContext.startEnvironment.getProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS)
            val ktrace = counterexample.getKtrace(store, createCounterexampleWithOutputs)
            val ktraceFile = saveText(getCounterexampleFilePath(property), ktrace)
            property.fail(ktraceFile)    
        } else if(passedSpec !== null && property.matches(passedSpec)) {
            property.status = VerificationPropertyStatus.PASSED    
        } else {
            property.fail(new Exception("Property did not clearly pass or fail"))
        }
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
    
    private def boolean matches(VerificationProperty property, String smvFormula) {
        // The following is merely a heuristic to check that the correct property was checked.
        // Spaces and brackets are removed and afterwards the formulas are compared.
        // This is because nuXmv gives the answer for a minified formula.
        val propertyFormula = property.formula.toSmvExpression()
        val propertyFormulaSimplified = propertyFormula.replaceAll('''\s|\(|\)''',"")
        val smvFormulaSimplified = smvFormula.replaceAll('''\s|\(|\)''',"")
        return smvFormulaSimplified == propertyFormulaSimplified
    }
    
    private def IPath getSmvFilePath() {
        return getOutputFile(modelFile.nameWithoutExtension+".smv")
    }
  
    private def IPath getProcessOutputFilePath(VerificationProperty property) {
        return getOutputFile(property, ".smv.log")
    }
    
    protected def List<String> resolvePlaceholders(List<String> interactiveCommands, VerificationProperty property) {
        return interactiveCommands.map[
            it.replace(PROPERTY_NAME_PLACEHOLDER, property.name.toIdentifier)
              .trim
        ]
    }
    
    private def void updateTaskDescriptionAndNotify(VerificationProperty property, String description) {
        property.runningTaskDescription = description
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
}
