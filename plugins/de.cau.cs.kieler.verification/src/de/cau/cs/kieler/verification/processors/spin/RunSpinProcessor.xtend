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
 package de.cau.cs.kieler.verification.processors.spin

import com.google.common.base.Charsets
import com.google.common.io.Files
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import de.cau.cs.kieler.verification.processors.RunModelCheckerProcessorBase
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath

import static extension de.cau.cs.kieler.verification.processors.ProcessExtensions.*
import de.cau.cs.kieler.verification.VerificationPropertyType

/**
 * @author aas
 */
class RunSpinProcessor extends RunModelCheckerProcessorBase {
    
    override getId() {
        return "de.cau.cs.kieler.sccharts.verification.runSpin"
    }
    
    override getName() {
        return "Run SPIN"
    }
    
    override getType() {
        return ProcessorType.DEVELOPER
    }
    
    override process() {
        val verificationProperties = getVerificationProperties
        if(verificationProperties.isNullOrEmpty) {
            return
        }
        val property = verificationProperties.head
        
        // Check that the code generation finished without errors
        val sourceEnvironment = environments.source
        val errors = sourceEnvironment.errors.getAllMessages
        if(!errors.isNullOrEmpty) {
            property.fail(new Exception(errors.head.message))
            compilationContext.notify(new VerificationPropertyChanged(property))
            return
        }
        
        val codeContainer = getSourceModel
        val code = codeContainer.head.code
        val pmlFile = saveText(getPmlFilePath(property), code)
        try {
            throwIfCanceled
            property.modelCheckerModelFile = pmlFile
            property.runningTaskDescription = "Running model checker..."
            compilationContext.notify(new VerificationPropertyChanged(property))
            // Calling the model checker is possibly long running
            val processOutput = runModelChecker(pmlFile, property)
            val processOutputFile = saveText(getProcessOutputFilePath(property), processOutput)
            updateVerificationResult(pmlFile, processOutputFile, processOutput, property)
        } catch (Exception e) {
            e.printStackTrace
            property.fail(e)
            compilationContext.notify(new VerificationPropertyChanged(property))
        }
    }
    
    private def String runModelChecker(IFile pmlFile, VerificationProperty property) {
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(pmlFile.parent.location.toOSString))
        // Create spin command for the property.
        // -bfs (breadth-first-search) cannot be used together with -a (search acceptance cycles, e.g. for liveness).
        // Thus -bfs is used only for invariants.
        // example: spin -run -a myfile.pml
        val spinCommand = newArrayList("spin", "-run")
        if(property.type == VerificationPropertyType.LTL) {
            spinCommand += "-a"
        }
        
        val customSpinCommands = compilationContext.startEnvironment.getProperty(Environment.CUSTOM_SPIN_COMMANDS)
        if(!customSpinCommands.isNullOrEmpty) {
            spinCommand.addAll(customSpinCommands.filter[!it.isNullOrEmpty])
        }
        if(property.type == VerificationPropertyType.LTL) {
            // -bfs option is not allowed together with -a option, which is needed for LTL
            spinCommand.remove("-bfs")
        }
        spinCommand += pmlFile.name
        
        processBuilder.command(timeCommand + spinCommand)
        processBuilder.redirectErrorStream(true)
        val process = processBuilder.start
        compilationContext.startEnvironment.setProperty(Environment.VERIFICATION_PROCESS, process)
        process.waitForTermination([ return isCanceled() ])
        throwIfCanceled
        val processOutput = process.readInputStream
        return processBuilder.command.toString.replace("\n", "\\n") + "\n" + processOutput
    }
    
    private def String runSpinTrailCommand(IFile pmlFile, VerificationProperty property, IFile processOutputFile) {
        val javaioProcessOutputFile = processOutputFile.location.toFile
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(pmlFile.parent.location.toOSString))
        val trailCommand = #["spin", "-t", "-p", pmlFile.name]
        processBuilder.command(trailCommand)
        processBuilder.redirectErrorStream(true)
        processBuilder.redirectOutput(javaioProcessOutputFile)
        val process = processBuilder.start
        process.waitForTermination([ return isCanceled() ])
        throwIfCanceled
        val processOutput = Files.toString(javaioProcessOutputFile, Charsets.UTF_8)
        return processBuilder.command.toString.replace("\n", "\\n") + "\n" + processOutput
    }
    
    private def void updateVerificationResult(IFile pmlFile, IFile processOutputFile, String processOutput, VerificationProperty property) {
        property.processOutputFile = processOutputFile
        property.updateTaskDescriptionAndNotify("Parsing model checker output...")
        val spinOutputInterpreter = new SpinOutputInterpreter(processOutput)
        if(spinOutputInterpreter.wroteTrail) {
            val trailFile = getFileInTemporaryProject(getTrailFilePath(property))
            val trailOutput = runSpinTrailCommand(pmlFile, property, trailFile)
            property.processOutputFile = trailFile
            property.updateTaskDescriptionAndNotify("Parsing model checker counterexample...")
            val trailInterpreter = new SpinTrailInterpreter(trailOutput)
            val counterexample = trailInterpreter.counterexample
            if(counterexample !== null) {
                val store = VariableStore.get(compilationContext.startEnvironment)
                property.updateTaskDescriptionAndNotify("Saving KTrace...")
                val createCounterexampleWithOutputs = compilationContext.startEnvironment.getProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS)
                val ktrace = counterexample.getKtrace(store, createCounterexampleWithOutputs)
                val ktraceFile = saveText(getCounterexampleFilePath(property), ktrace)
                property.fail(ktraceFile)
            } else {
                property.fail(new Exception("Could not create counterexample from spin trail"))
            }
        } else {
            property.status = VerificationPropertyStatus.PASSED
        }
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
    
    private def IPath getPmlFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml")
    }
  
    private def IPath getProcessOutputFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml.log")
    }
    
    private def IPath getTrailFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml.trail.log")
    }
    
    private def void updateTaskDescriptionAndNotify(VerificationProperty property, String description) {
        property.runningTaskDescription = description
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
}