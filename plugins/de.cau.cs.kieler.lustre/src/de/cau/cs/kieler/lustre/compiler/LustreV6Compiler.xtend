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
package de.cau.cs.kieler.lustre.compiler

import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.Platform

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.external.AbstractExternalCompiler
import org.eclipse.emf.common.util.URI
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.PrintStream

/**
 * @author lgr
 */
class LustreV6Compiler extends AbstractExternalCompiler {

    public static val LUSTRE_EXTENSION = ".lus"

    public static val IProperty<Boolean> PREFER_ENV = 
        new Property<Boolean>("de.cau.cs.kieler.lustre.compiler.v6.env", false)
        
    public static val IProperty<String> NODE_NAME = 
        new Property<String>("de.cau.cs.kieler.lustre.compiler.v6.nodeName", null)

    public static val ID = "Lustre_V6"
    
    new(Environment environment) {
        super(environment)
        
        if (environment.getProperty(PREFER_ENV)) {
            if (System.getenv().containsKey('LUSTRE')) {
                root = URI.createFileURI(System.getenv().get('LUSTRE'))
            } else {
                environment.warnings.add("Missing $LUSTRE environment variable with path to Lustre installation")
            }
        }
        if (root === null && PROVIDERS.containsKey(ID)) {
            root = PROVIDERS.get(ID).getRootDir(Platform.OS, Platform.OSArch)
            if (root === null) {
                environment.warnings.add("There is no Lustre compiler bundled in KIELER for this OS.")
            }
        }
        if (root === null) { // Try ENV
            if (System.getenv().containsKey('LUSTRE')) {
                root = URI.createFileURI(System.getenv().get('LUSTRE'))
            }
        }
        
    }
    
    override getName() {
        return ID
    }
    
    def setup(ProjectInfrastructure pinf, PrintStream logger) {
        if (super.setup(pinf, logger, "bin")) {
            logger.println("Compiler setup successful.")
        } else {
            environment.warnings.add("Failed to set up lustre compiler.")
        }
    }
    
    override configureEnvironment(Map<String, String> map) {
        if (rootDir !== null) {
            map.put("LUSTRE", rootDir.absolutePath)
        }
    }
    
    override generateCodeCommand(List<File> files, ArrayList<String> options) {
        val bin = new File(rootDir, "bin")
        val command = <String>newArrayList
        val fileName = files.head.path.split("/").last
        
        environment.setProperty(NODE_NAME, fileName.split("\\.").head)
        
        command += new File(bin, "lv6").absolutePath
        command += files.map[toString]
        command += "-n"
        command += fileName.split("\\.").head
        command += "-2c"
        command += "-v"
        
        command += options
        
        return command
    }
    
    override getExpectedResults(List<File> files) {
        val lustreFiles = files.filter[it.name.endsWith(LustreV6Compiler.LUSTRE_EXTENSION)]

        var expectedResults = newArrayList
        val name = lustreFiles.head.name.replace(LustreV6Compiler.LUSTRE_EXTENSION, "")
        expectedResults += new File(lustreFiles.head.parent, lustreFiles.head.name.replace(LustreV6Compiler.LUSTRE_EXTENSION, "_" + name + ".c"))
       
        return expectedResults
    } 
       
}