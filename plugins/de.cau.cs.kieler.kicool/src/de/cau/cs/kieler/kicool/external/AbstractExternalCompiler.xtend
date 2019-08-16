/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.external

import de.cau.cs.kieler.core.services.KielerServiceLoader
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.io.PrintStream
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI

import static extension de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure.*
import static extension org.eclipse.core.runtime.FileLocator.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractExternalCompiler {
    
    public static val PROVIDERS = KielerServiceLoader.load(IExternalCompilerProvider).toMap[id]
    
    protected var URI root
    protected var File rootDir
    
    protected val Environment environment
    
    new(Environment environment) {
        this.environment = environment
    }

    abstract def String getName()
    
    abstract def void configureEnvironment(Map<String, String> map)
    
    abstract def List<String> generateCodeCommand(List<File> files, ArrayList<String> strings)
    
    abstract def List<File> getExpectedResults(List<File> files)
    
    protected def boolean setup(ProjectInfrastructure pinf, PrintStream logger, String... executables) {
        if (root !== null) {
            if (root.isFile) {
                val file = new File(root.toFileString)
                logger.println("Dectected external compiler on system path: " + file)
                if (file.checkExecutableFlags(logger, executables)) {
                    rootDir = file
                    return true
                }
            } else if (root.isPlatformPlugin) {
                try {
                    val bundle = Platform.getBundle(root.segment(1))
                    val bundleFile = bundle.getBundleFile
                    if (bundleFile.directory) {
                        val file = new File(bundle.find(new Path(root.segments.drop(2).join("/"))).toFileURL.toURI.normalize)
                        if (file.directory) {
                            logger.println("Dectected external compiler on plugin path: " + file)
                            if (file.checkExecutableFlags(logger, executables)) {
                                rootDir = file
                                return true
                            }
                        }
                    }
                } catch(Exception e) {
                    // ignore
                }
                if (rootDir === null) {
                    logger.println("External compiler must be copied to an accessable location.")
                    val target = if (pinf.hasProject) {
                        new File(pinf.project.workspace.root.rawLocation.toString + pinf.project.fullPath.toString, name)
                    } else {
                        new File(pinf.generatedCodeFolder, name)
                    }
                    if (!target.exists) {
                        target.mkdirs
                        root.copyFolder(target, logger, true)
                        logger.println("External compiler copied to: " + target)
                    } else {
                        logger.println("External compiler copied already exists in: " + target)
                    }
                    rootDir = target
                    return rootDir.checkExecutableFlags(logger, executables)
                }
            }
        }
        logger.println("No compiler available")
        return false
    }
    
    def isAvailable() {
        return root !== null
    }
    
    def isProperlySetUp() {
        return root !== null && rootDir !== null && rootDir.directory
    }
    
    protected def boolean checkExecutableFlags(File source, PrintStream logger, String... files) {
        var succeeded = true
        for (fileName : files) {
            val file = new File(source, fileName)
            if (file.directory) {
                for (exe : file.listFiles) {
                    val success = exe.checkExecutableFlag(logger)
                    succeeded = succeeded && success
                }
            } else {
                val success = file.checkExecutableFlag(logger)
                succeeded = succeeded && success
            }
        }
        return succeeded
    }
    
    private def checkExecutableFlag(File file, PrintStream logger) {
        if (!file.name.contains(".") || file.name.endsWith(".exe")) {
            if (!file.canExecute) {
                val success = file.executable = true
                if (!success) logger.println("Unable to set executable flag for " + file)
                return success
            }
        }
        return true
    }
    
}
