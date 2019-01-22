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
 package de.cau.cs.kieler.sccharts.verification.processor

import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.sccharts.verification.VerificationPropertyChanged
import de.cau.cs.kieler.sccharts.verification.VerificationResult
import de.cau.cs.kieler.sccharts.verification.VerificationResultStatus
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath

import static extension de.cau.cs.kieler.sccharts.verification.processor.ProcessExtensions.*
import de.cau.cs.kieler.sccharts.verification.VerificationPropertyType

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
        
        val codeContainer = getSourceModel
        val code = codeContainer.head.code
        val pmlFile = saveText(getPmlFilePath(property), code)
        try {
            throwIfCanceled
            property.result = new VerificationResult(VerificationResultStatus.RUNNING)
            compilationContext.notify(new VerificationPropertyChanged(property))
            // Calling the model checker is possibly long running
            val processOutput = runModelChecker(pmlFile, property)
            val processOutputFile = saveText(getProcessOutputFilePath(property), processOutput)
            updateVerificationResult(processOutputFile, processOutput, property)
        } catch (Exception e) {
            property.failWithException(e)
            compilationContext.notify(new VerificationPropertyChanged(property))
        }
    }
    
    private def String runModelChecker(IFile pmlFile, VerificationProperty property) {
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(pmlFile.parent.location.toOSString))
        val spinCommand = newArrayList("spin")
        if(property.type == VerificationPropertyType.LTL) {
            spinCommand.addAll("-f", property.formula.toPmlFormula)
        }
        spinCommand.addAll("-run", pmlFile.name)
        
        processBuilder.command(timeCommand + spinCommand)
        processBuilder.redirectErrorStream(true)
        val process = processBuilder.runToTermination([ return isCanceled() ])
        throwIfCanceled
        val processOutput = process.readInputStream
        return processBuilder.command.toString.replace("\n", "\\n") + "\n" + processOutput
    }
    
    private def void updateVerificationResult(IFile processOutputFile, String processOutput, VerificationProperty property) {
        val interpreter = new SpinOutputInterpreter(processOutput)
        val counterexample = interpreter.counterexample
        val passedSpec = interpreter.passedSpec
        if(counterexample !== null && property.matches(counterexample.spec)) {
            val store = VariableStore.get(compilationContext.startEnvironment)
            val ktrace = counterexample.getKtrace(store)
            val ktraceFile = saveText(getCounterexampleFilePath(property), ktrace)
            property.result = new VerificationResult(ktraceFile)    
        } else if(passedSpec !== null && property.matches(passedSpec)) {
            property.result = new VerificationResult(VerificationResultStatus.PASSED)    
        } else {
            throw new Exception("Property did not clearly pass or fail")
        }
        property.result.processOutputFile = processOutputFile
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
    
    private def boolean matches(VerificationProperty property, String pmlFormula) {
        // The following is merely a heuristic to check that the correct property was checked.
        // Spaces and brackets are removed and afterwards the formulas are compared.
        // This is because SPIN gives the answer for a modified formula (e.g. 0/1 for false/true).
        val propertyFormula = property.formula.toPmlExpression
        val propertyFormulaSimplified = propertyFormula.replaceAll("\\s","").replace("(","").replace(")", "")
        val pmlFormulaSimplified = pmlFormula.replaceAll("\\s","").replace("(","").replace(")", "")
        return pmlFormulaSimplified == propertyFormulaSimplified
    }
    
    private def IPath getPmlFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml")
    }
  
    private def IPath getProcessOutputFilePath(VerificationProperty property) {
        return getOutputFile(property, ".pml.log")
    }
    
    private def String toPmlExpression(String kexpression) {
        return kexpression.replace("true", "1").replace("false", "0")
    }
    
    private def String toPmlFormula(String ltlFormula) {
        return ltlFormula.replace("G", "[]").replace("F", "<>").replace("R", "V")
    }
}
