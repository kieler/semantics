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
import de.cau.cs.kieler.sccharts.verification.VerificationResultStatus
import java.io.File
import java.util.List
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
        val smvFile = saveCodeFile()
        val processOutput = runModelChecker(smvFile)
        updateVerificationResult(processOutput)
    }
    
    private def IFile saveCodeFile() {
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
    
    private def String runModelChecker(IFile smvFile) {
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(smvFile.parent.location.toOSString))
        processBuilder.command("nuXmv", smvFile.name)
        processBuilder.redirectErrorStream(true)
        val processOutput = processBuilder.execute([ return isCanceled ])
        return processOutput
    }
    
    private def void updateVerificationResult(String processsOutput) {
        val verificationProperties = compilationContext.startEnvironment.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
        if(verificationProperties.isNullOrEmpty || processsOutput.isNullOrEmpty) {
            return
        }
        val pattern = Pattern.compile("-- specification .* is true")
        val matcher = pattern.matcher(processsOutput)
        val propertyHolds = matcher.find()
        if(propertyHolds) {
            verificationProperties.head.result.status = VerificationResultStatus.PASSED
        } else {
            verificationProperties.head.result.status = VerificationResultStatus.FAILED
        }    
    }
    
    private def boolean isCanceled() {
        return compilationContext.startEnvironment.getProperty(Environment.CANCEL_COMPILATION)
    }
}
