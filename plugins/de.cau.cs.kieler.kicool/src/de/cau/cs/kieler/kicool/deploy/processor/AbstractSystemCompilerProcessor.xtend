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
package de.cau.cs.kieler.kicool.deploy.processor

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.List
import java.util.concurrent.TimeUnit
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractSystemCompilerProcessor<I, O> extends Processor<I, O> {
        
    public static val IProperty<Boolean> INCLUDE_GENERATED_FILES = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.compiler.sources.include-generated", true)

    public static val IProperty<List<String>> SOURCES = 
        new Property<List<String>>("de.cau.cs.kieler.kicool.deploy.compiler.sources", null)
        
    public static val IProperty<String> BIN_FOLDER = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.folder.bin", "bin")
    
    public static val IProperty<Boolean> BIN_CLEAN = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.compiler.folder.bin.clean", true)
        
    public static val IProperty<String> ADDITIONAL_OPTIONS = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.options", "")
        
    public static val IProperty<Long> TIMEOUT_SEC = 
        new Property<Long>("de.cau.cs.kieler.kicool.deploy.compiler.timeout", 60L)
        
    @Accessors(PROTECTED_GETTER, PROTECTED_SETTER)
    var Boolean escapeOptions = true
        
    protected val logger = new Logger()
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
        
    def createBinFolder(ProjectInfrastructure infra) {
        val binFolder = new File(infra.generatedCodeFolder, environment.getProperty(BIN_FOLDER)?:BIN_FOLDER.^default)
        logger.println("Binary output folder: " + binFolder)
        if (binFolder.exists) {
            if (environment.getProperty(BIN_CLEAN)) {
                logger.println("\n== Clearing Binary Output Folder ==")
                ProjectSetup.deleteRecursively(binFolder, logger)
                logger.println()
                
                binFolder.mkdirs
            } else {
                if (!binFolder.directory) {
                    environment.errors.add("Binary output folder exists and is not a directory")
                    logger.println("ERROR: Binary output folder exists and is not a directory")
                }
            }
        } else {
            binFolder.mkdirs
        }
        return binFolder
    }
    
    def invoke(List<String> command, File directory) {
        logger.println("Invoking command: " + command.join(" "))
        val pb = createProcessBuilder(command, directory)
        pb.redirectErrorStream(true)
        
        try {
            val p = pb.start
            val pReader = new BufferedReader(new InputStreamReader(p.inputStream));
            var String line = null;
            while ( (line = pReader.readLine()) !== null) {
                logger.println(line)
            }
            
            val timeout = environment.getProperty(TIMEOUT_SEC)?:TIMEOUT_SEC.^default
            val intime = p.waitFor(timeout, TimeUnit.SECONDS)
            if (!intime) {
                environment.errors.add("Command execution timed out (" + timeout + " sec)")
                logger.print("ERROR: Command execution timed out (" + timeout + " sec)")
            }
            
            logger.println("Exit value: " + p.exitValue)
            return p.exitValue
        } catch (Exception e) {
            environment.errors.add("Error while invoking command", e)
            logger.print("ERROR: Exception while invoking command")
            e.printStackTrace(logger)
        }
    }
    
    def createProcessBuilder(List<String> command, File directory) {
        val pb = new ProcessBuilder(command.escapeOptions)
        pb.directory(directory)
        return pb
    }
    
    protected def List<String> escapeOptions(List<String> command) {
        if (escapeOptions) 
            command.map[
                if (it.contains(" ") && !it.startsWith("\"")) return "\"" + it + "\""
                return it
            ].toList
        else
            command
    }
    
}