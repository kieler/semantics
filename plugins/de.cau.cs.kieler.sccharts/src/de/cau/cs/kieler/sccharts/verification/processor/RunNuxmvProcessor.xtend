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

import com.google.common.io.Files
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.sccharts.verification.VerificationPropertyChanged
import de.cau.cs.kieler.sccharts.verification.VerificationResult
import de.cau.cs.kieler.sccharts.verification.VerificationResultStatus
import java.io.File
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject
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
        
        val codeContainer = getSourceModel
        val code = codeContainer.head.code
        val smvFile = saveText(smvFilePath, code)
        for(propertyIndexPair : verificationProperties.indexed) {
            val property = propertyIndexPair.value
            val propertyIndex = propertyIndexPair.key
            try {
                throwIfCanceled
                property.result = new VerificationResult(VerificationResultStatus.RUNNING)
                compilationContext.notify(new VerificationPropertyChanged(property))
                // Calling the model checker is possibly long running
                val processOutput = runModelChecker(smvFile, property, propertyIndex)
                saveText(getProcessOutputFilePath(property, propertyIndex), processOutput)
                updateVerificationResult(processOutput, property, propertyIndex)
            } catch (Exception e) {
                property.failWithException(e)
                compilationContext.notify(new VerificationPropertyChanged(property))
            }
        }
    }
    
    private def String runModelChecker(IFile smvFile, VerificationProperty property, int propertyIndex) {
        val processBuilder = new ProcessBuilder()
        processBuilder.directory(new File(smvFile.parent.location.toOSString))
        val indexMap = sourceEnvironment.getProperty(Environment.INDEX_MAP_OF_SMV_SPECS) as Map<VerificationProperty, Integer>
        val index = indexMap.get(property)
        if(index === null || index < 0) {
            throw new Exception("Could not determine which arguments to send to the model checker")
        }
        processBuilder.command("nuXmv", "-n", index.toString, smvFile.name)
        processBuilder.redirectErrorStream(true)
        val process = processBuilder.runToTermination([ return isCanceled() ])
        throwIfCanceled
        val processOutput = process.readInputStream
        return processOutput
    }
    
    private def void updateVerificationResult(String processOutput, VerificationProperty property, int propertyIndex) {
        val interpreter = new NuxmvOutputInterpreter(processOutput)
        val counterexample = interpreter.counterexamples.head
        val passedSpec = interpreter.passedSpecs.head
        if(counterexample !== null && property.matches(counterexample.spec)) {
            val store = VariableStore.get(compilationContext.startEnvironment)
            val ktrace = counterexample.getKtrace(store)
            val ktraceFile = saveText(getCounterexampleFilePath(property, propertyIndex), ktrace)
            property.result = new VerificationResult(ktraceFile)    
        } else if(passedSpec !== null && property.matches(passedSpec)) {
            property.result = new VerificationResult(VerificationResultStatus.PASSED)    
        } else {
            throw new Exception("Property did not clearly pass or fail")
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
    
    private def boolean isCanceled() {
        return compilationContext.startEnvironment.getProperty(Environment.CANCEL_COMPILATION)
    }
    
    private def void throwIfCanceled() {
        if(isCanceled) {
            throw new Exception("User canceled verification")
        }
    }
    
    private def IFile saveText(IPath fullPath, String text) {
        val tmpProject = ProjectInfrastructure.getTemporaryProject()
        val file = tmpProject.getFile(fullPath)
        file.saveText(text)
        return file
    }
    
    private def IFile saveText(IFile file, String text) {
        if(file.exists) {
            file.delete(true, null)
        }
        file.createDirectories
        file.create(new StringInputStream(text), true, null)
        return file
    }
    
    private def IFile getModelFile() {
        val model = (compilationContext.originalModel as EObject)
        val eUri = model.eResource.getURI();
        if (eUri.isPlatformResource()) {
            val platformString = eUri.toPlatformString(true);
            val res = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString)
            if(res.exists && res instanceof IFile) {
                return res as IFile
            }
        }
    }
    
    private def IPath getOutputFolder() {
        val folderInKielerTemp = getModelFile.fullPath.toString.replace("/","-").replace(".","-")
        return new Path(folderInKielerTemp).append("kieler-gen").append("verification")
    }
    
    private def IPath getOutputFile(String fileName) {
        return outputFolder.append(fileName)
    }
    
    private def IPath getOutputFile(VerificationProperty property, int propertyIndex, String fileExtension) {
        var String name = modelFile.nameWithoutExtension
        if(!property.name.isNullOrEmpty) {
            name += "-'"+property.name+"'"
        }
        name += fileExtension
        return getOutputFile(name)
    }
    
    private def IPath getSmvFilePath() {
        return getOutputFile(modelFile.nameWithoutExtension+".smv")
    }
  
    private def IPath getProcessOutputFilePath(VerificationProperty property, int propertyIndex) {
        return getOutputFile(property, propertyIndex, ".smv.log")
    }

    private def IPath getCounterexampleFilePath(VerificationProperty property, int propertyIndex) {
        return getOutputFile(property, propertyIndex, ".ktrace")
    }
    
    private static def String toSmvExpression(String kexpression) {
        // TODO: duplicate of SmvCodeGeneratorSpecificationModule.toSmvExpression, but cannot import from there
        return kexpression.replace("==", "=").replace("&&", "&").replace("||", "|")
                          .replace("false", "FALSE").replace("true", "TRUE")
    }
    
    private static def String nameWithoutExtension(IFile file) {
        return Files.getNameWithoutExtension(file.name)
    }
    
    private static def void createDirectories(IResource res) {
        if(res.exists) {
            return
        }
        if(res instanceof IWorkspace) {
            return
        }
        res.parent?.createDirectories
        if(res instanceof IFolder) {    
            res.create(false, false, null)
        }
    }
}
