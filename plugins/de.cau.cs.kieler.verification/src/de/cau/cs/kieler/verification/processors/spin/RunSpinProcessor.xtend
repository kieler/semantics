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
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import de.cau.cs.kieler.verification.processors.RunModelCheckerProcessorBase
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath

import static extension de.cau.cs.kieler.verification.extensions.VerificationContextExtensions.*
import static extension de.cau.cs.kieler.verification.processors.ProcessExtensions.*
import java.nio.file.Path

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
        if(!compilationContext.hasVerificationContext || !compilationContext.verificationContext.verify) {
            return
        }
        
        val verificationProperties = verificationContext.verificationProperties
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
    
    private def String runModelChecker(File pmlFile, VerificationProperty property) {
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(pmlFile.parentFile)
        // Create spin command for the property.
        // example: spin -run myfile.pml
        val spinCommand = newArrayList("spin", "-run")
        val customSpinCommands = verificationContext.customSpinCommands
        if(!customSpinCommands.isNullOrEmpty) {
            spinCommand.addAll(customSpinCommands.filter[!it.isNullOrEmpty])
        }
        spinCommand += pmlFile.name
        
        processBuilder.command(timeCommand + spinCommand)
        processBuilder.redirectErrorStream(true)
        val process = processBuilder.startVerificationProcess
        process.waitForTermination([ return isCanceled() ])
        throwIfCanceled
        val processOutput = process.readInputStream
        val processOutputWithCommand = processBuilder.command.toString.replace("\n", "\\n") + "\n" + processOutput
        if(process.exitValue != 0) {
            throw new Exception("SPIN terminated with non-zero exit code.")
        }
        return processOutputWithCommand
    }
    
    private def String runSpinTrailCommand(File pmlFile, VerificationProperty property, File processOutputFile) {
        val javaioProcessOutputFile = processOutputFile
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(pmlFile.parentFile)
        val trailCommand = #["spin", "-t", "-p", "-g", pmlFile.name]
        processBuilder.command(trailCommand)
        processBuilder.redirectErrorStream(true)
        processBuilder.redirectOutput(javaioProcessOutputFile)
        val process = processBuilder.start
        process.waitForTermination([ return isCanceled() ])
        throwIfCanceled
        val processOutput = Files.asCharSource(javaioProcessOutputFile, Charsets.UTF_8).read()
        val processOutputWithCommand = processBuilder.command.toString.replace("\n", "\\n") + "\n" + processOutput
        if(process.exitValue != 0) {
            throw new Exception("SPIN trail command terminated with non-zero exit code.")
        }
        return processOutputWithCommand
    }
    
    private def void updateVerificationResult(File pmlFile, File processOutputFile, String processOutput, VerificationProperty property) {
        property.processOutputFile = processOutputFile
        property.updateTaskDescriptionAndNotify("Parsing model checker output...")
        val spinOutputInterpreter = new SpinOutputInterpreter(processOutput)
        if(spinOutputInterpreter.wroteTrail) {
            property.status = VerificationPropertyStatus.FAILED
            
            // Create counterexample from spin trail
            if(verificationContext.createCounterexamples) {
                val trailFile = getFileInTemporaryProject(getTrailFilePath(property))
                val trailOutput = runSpinTrailCommand(pmlFile, property, trailFile)
                property.spinTrailFile = trailFile
                property.updateTaskDescriptionAndNotify("Parsing model checker counterexample...")
                val trailInterpreter = new SpinTrailInterpreter(trailOutput)
                val counterexample = trailInterpreter.counterexample
                if(counterexample !== null && environment !== null) {
                    val store = VariableStore.get(environment)
                    property.updateTaskDescriptionAndNotify("Saving KTrace...")
                    val createCounterexampleWithOutputs = verificationContext.createCounterexamplesWithOutputs
                    val ktrace = counterexample.getKtrace(store, createCounterexampleWithOutputs)
                    val ktraceFile = saveText(getCounterexampleFilePath(property), ktrace)
                    property.fail(ktraceFile)
                } else {
                    property.fail(new Exception("Could not create counterexample from spin trail"))
                }    
            }
        } else {
            property.status = VerificationPropertyStatus.PASSED
        }
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
    
    private def Path getPmlFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml")
    }
  
    private def Path getProcessOutputFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml.log")
    }
    
    private def Path getTrailFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml.trail.log")
    }
    
    private def void updateTaskDescriptionAndNotify(VerificationProperty property, String description) {
        property.runningTaskDescription = description
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
}