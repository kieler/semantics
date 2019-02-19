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
    
    def void setup(ProjectInfrastructure pinf, PrintStream logger) {
        if (root !== null) {
            if (root.isFile) {
                rootDir = new File(root.toFileString)
                logger.println("Dectected external compiler on system path: " + rootDir)
            } else if (root.isPlatformPlugin) {
                try {
                    val bundle = Platform.getBundle(root.segment(1))
                    val bundleFile = bundle.getBundleFile
                    if (bundleFile.directory) {
                        val file = new File(bundle.find(new Path(root.segments.drop(2).join("/"))).toFileURL.toURI.normalize)
                        if (file.directory) {
                            rootDir = file
                            logger.println("Dectected external compiler on unzipped plugin path: " + rootDir)
                        }
                    }
                } catch(Exception e) {
                    // ignore
                }
                if (rootDir === null) {
                    logger.println("External compiler is located in zipped plugin.")
                    val target = if (pinf.hasProject) {
                        pinf.getProjectRelativeFile(new File(name))
                    } else {
                        new File(pinf.generatedCodeFolder, name)
                    }
                    if (!target.exists) {
                        target.mkdirs
                        root.copyFolder(target, logger, true)
                    }
                    rootDir = target
                    logger.println("External compiler copied into: " + rootDir)
                }
            }
        } else {
            logger.println("No compiler available")
        }
    }
    
    def isAvailable() {
        return root !== null
    }
    
    def isProperlySetUp() {
        return root !== null && rootDir !== null && rootDir.directory
    }
    
    def checkExecutableFlags(String binariesFolder) {
        var succeeded = true
        if (isProperlySetUp && binariesFolder !== null) {
            val bin = new File(rootDir, binariesFolder)
            if (bin.directory) {
                for (exe : bin.listFiles) {
                    if (!exe.name.contains(".") || exe.name.endsWith(".exe")) {
                        if (!exe.canExecute) {
                            val success = exe.executable = true
                            succeeded = succeeded && success
                        }
                    }
                }
            }
            if (!succeeded) {
                environment.warnings.add("Failed to set executable flag of the esterel compiler")
            }
        }
    }
    
}
