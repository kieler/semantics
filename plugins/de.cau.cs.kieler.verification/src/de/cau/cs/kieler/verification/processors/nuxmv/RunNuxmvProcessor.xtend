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
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath

import static extension de.cau.cs.kieler.verification.processors.ProcessExtensions.*

/**
 * @author aas
 */
class RunNuxmvProcessor extends RunModelCheckerProcessorBase {
    
    override getId() {
        return "de.cau.cs.kieler.sccharts.verification.runNuxmv"
    }
    
    override getName() {
        return "Run nuXmv"
    }
    
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
                property.status = VerificationPropertyStatus.RUNNING
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
    
    private def String runModelChecker(IFile smvFile, VerificationProperty property) {
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(smvFile.parent.location.toOSString))
        val indexMap = sourceEnvironment.getProperty(Environment.INDEX_MAP_OF_SMV_SPECS) as Map<VerificationProperty, Integer>
        val index = indexMap.get(property)
        if(index === null || index < 0) {
            throw new Exception("Could not determine which arguments to send to the model checker")
        }
        val nuXmvCommand = #["nuXmv", "-n", index.toString, smvFile.name]
        processBuilder.command(timeCommand + nuXmvCommand)
        processBuilder.redirectErrorStream(true)
        val process = processBuilder.runToTermination([ return isCanceled() ])
        throwIfCanceled
        val processOutput = process.readInputStream
        return processBuilder.command.toString.replace("\n", "\\n") + "\n" + processOutput
    }
    
    private def void updateVerificationResult(IFile processOutputFile, String processOutput, VerificationProperty property) {
        property.processOutputFile = processOutputFile
        val interpreter = new NuxmvOutputInterpreter(processOutput)
        val counterexample = interpreter.counterexamples.head
        val passedSpec = interpreter.passedSpecs.head
        if(counterexample !== null && property.matches(counterexample.spec)) {
            val store = VariableStore.get(compilationContext.startEnvironment)
            val ktrace = counterexample.getKtrace(store)
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
        val propertyFormulaSimplified = propertyFormula.replaceAll("\\s","").replace("(","").replace(")", "")
        val smvFormulaSimplified = smvFormula.replaceAll("\\s","").replace("(","").replace(")", "")
        return smvFormulaSimplified == propertyFormulaSimplified
    }
    
    private static def String toSmvExpression(String kexpression) {
        // TODO: duplicate of SmvCodeGeneratorSpecificationModule.toSmvExpression, but cannot import from there
        return kexpression.replace("==", "=").replace("&&", "&").replace("||", "|")
                          .replace("false", "FALSE").replace("true", "TRUE")
    }
    
    private def IPath getSmvFilePath() {
        return getOutputFile(modelFile.nameWithoutExtension+".smv")
    }
  
    private def IPath getProcessOutputFilePath(VerificationProperty property) {
        return getOutputFile(property, ".smv.log")
    }
}
