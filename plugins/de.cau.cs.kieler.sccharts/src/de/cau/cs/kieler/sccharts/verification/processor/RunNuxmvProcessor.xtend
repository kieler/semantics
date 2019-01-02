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

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.sccharts.verification.VerificationPropertyChanged
import de.cau.cs.kieler.sccharts.verification.VerificationResultStatus
import java.io.File
import java.util.List
import java.util.Map
import java.util.regex.Pattern
import org.eclipse.core.resources.IFile
import org.eclipse.xtext.util.StringInputStream

import static extension de.cau.cs.kieler.sccharts.verification.processor.ProcessExtensions.*

/**
 * @author aas
 */
class RunNuxmvProcessor extends Processor<CodeContainer, Object> {
        
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
        val verificationProperties = compilationContext.startEnvironment.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
        if(verificationProperties.isNullOrEmpty) {
            return
        }
        
        val smvFile = saveCodeFile()
        for(property : verificationProperties) {
            try {
                throwIfCanceled
                property.result.status = VerificationResultStatus.RUNNING
                compilationContext.notify(new VerificationPropertyChanged(property))
                // Calling the model checker is possibly long running
                val processOutput = runModelChecker(smvFile, property)
                updateVerificationResult(processOutput, property)
            } catch (Exception e) {
                property.failWithException(e)
                compilationContext.notify(new VerificationPropertyChanged(property))
            }
        }
    }
    
    private def IFile saveCodeFile() {
        throwIfCanceled
        val codeContainer = getSourceModel
        val code = codeContainer.head.code
        val tmpProject = ProjectInfrastructure.getTemporaryProject()
        val modelName = (compilationContext.originalModel as SCCharts).name
        val smvFile = tmpProject.getFile(modelName+".smv")
        if(smvFile.exists) {
            smvFile.delete(true, null)
        }
        smvFile.create(new StringInputStream(code), true, null)
        return smvFile
    }
    
    private def String runModelChecker(IFile smvFile, VerificationProperty property) {
        throwIfCanceled
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(smvFile.parent.location.toOSString))
        val indexMap = sourceEnvironment.getProperty(Environment.INDEX_MAP_OF_SMV_SPECS) as Map<VerificationProperty, Integer>
        val index = indexMap.get(property)
        if(index === null || index < 0) {
            throw new Exception("Could not determine which arguments to send to the model checker")
        }
        processBuilder.command("nuXmv", "-n", index.toString, smvFile.name)
        processBuilder.redirectErrorStream(true)
        val processOutput = processBuilder.execute([ return isCanceled ])
        return processOutput
    }
    
    private def void updateVerificationResult(String processOutput, VerificationProperty property) {
        throwIfCanceled
        if(processOutput.isNullOrEmpty) {
            throw new Exception("nuXmv process returned nothing")
        }
        val passedPattern = Pattern.compile("-- (specification|invariant) .* is true")
        val passedMatcher = passedPattern.matcher(processOutput)
        val passed = passedMatcher.find()
        
        if(passed) {
            property.result.status = VerificationResultStatus.PASSED
        } else {
            val failedPattern = Pattern.compile("-- (specification|invariant) .* is false")
            val failedMatcher = failedPattern.matcher(processOutput)
            val failed = failedMatcher.find()
            if(failed) {
                property.result.status = VerificationResultStatus.FAILED                
            } else {
               throw new Exception("Property did not clearly pass or fail")
            }
        }
        compilationContext.notify(new VerificationPropertyChanged(property))
    }
    
    private def boolean isCanceled() {
        return compilationContext.startEnvironment.getProperty(Environment.CANCEL_COMPILATION)
    }
    
    private def void throwIfCanceled() {
        if(isCanceled) {
            throw new Exception("User canceled verification")
        }
    }
}
