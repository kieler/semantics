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
package de.cau.cs.kieler.verification.processors

import com.google.common.io.Files
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.verification.VerificationContext
import de.cau.cs.kieler.verification.VerificationProperty
import java.io.File
import java.io.FileWriter
import java.nio.file.Path
import java.util.List

import static extension de.cau.cs.kieler.verification.codegen.CodeGeneratorExtensions.*
import static extension de.cau.cs.kieler.verification.extensions.VerificationContextExtensions.*

/**
 * @author aas
 */
abstract class RunModelCheckerProcessorBase extends Processor<CodeContainer, Object> {

    protected def boolean isCanceled() {
        return compilationContext.startEnvironment.getProperty(Environment.CANCEL_COMPILATION)
    }

    protected def void throwIfCanceled() {
        if (isCanceled) {
            throw new Exception("Canceled by user")
        }
    }

    protected def File getFileInTemporaryProject(Path path) {
        val projectInfrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        val file = Path.of(projectInfrastructure.generatedCodeFolder.path, path.toString).toFile
        return file
    }

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

    protected def List<String> getTimeCommand() {
        if (OsUtil.isLinux) {
            return #["/usr/bin/time", "-f", "\n\nelapsed time: %e seconds, max memory in RAM: %M KB"]
        } else {
            #[]
        }
    }

    protected def VerificationContext getVerificationContext() {
        return compilationContext.verificationContext
    }

    protected def Path getOutputFolder() {
        return Path.of("verification")
    }

    protected def Path getOutputFile(String fileName) {
        return Path.of(outputFolder.toString,fileName)
    }

    protected def Path getOutputFile(VerificationProperty property, String fileExtension) {
        var String name = verificationContext.verificationModelFile.nameWithoutExtension
        if (!property.name.isNullOrEmpty) {
            name += ("-" + property.name.toIdentifier + "")
        }
        name += fileExtension
        return getOutputFile(name)
    }

    protected def Path getCounterexampleFilePath(VerificationProperty property) {
        return getOutputFile(property, ".ktrace")
    }

    protected static def String nameWithoutExtension(File file) {
        return Files.getNameWithoutExtension(file.name)
    }

    protected def Process startVerificationProcess(ProcessBuilder processBuilder) {
        val process = processBuilder.start
        verificationContext.verificationProcess = process
        return process
    }
}
