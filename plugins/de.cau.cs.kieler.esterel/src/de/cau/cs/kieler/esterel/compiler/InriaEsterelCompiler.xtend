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
package de.cau.cs.kieler.esterel.compiler

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.Platform
import de.cau.cs.kieler.kicool.external.AbstractExternalCompiler
import org.eclipse.emf.common.util.URI
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.PrintStream

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class InriaEsterelCompiler extends AbstractExternalCompiler {

    public static val ESTEREL_EXTENSION = ".strl"

    public static val IProperty<Boolean> XES_CODE = 
        new Property<Boolean>("de.cau.cs.kieler.esterel.compiler.inria.xes", false)
        
    public static val IProperty<Boolean> PREFER_ENV = 
        new Property<Boolean>("de.cau.cs.kieler.esterel.compiler.inria.env", false)

    public static val ID = "BerryEsterelV5_100"
    
    new(Environment environment) {
        super(environment)
        
        if (environment.getProperty(PREFER_ENV)) {
            if (System.getenv().containsKey('ESTEREL')) {
                root = URI.createFileURI(System.getenv().get('ESTEREL'))
            } else {
                environment.warnings.add("Missing $ESTEREL evnironment varibale with path to Esterel installation")
            }
        }
        if (root === null && PROVIDERS.containsKey(ID)) {
            root = PROVIDERS.get(ID).getRootDir(Platform.OS, Platform.OSArch)
            if (root === null) {
                environment.warnings.add("There is no Esterel compiler bundled in KIELER for this OS.")
            }
        }
        if (root === null) { // Try ENV
            if (System.getenv().containsKey('ESTEREL')) {
                root = URI.createFileURI(System.getenv().get('ESTEREL'))
            }
        }
        
    }
    
    override getName() {
        return ID
    }
    
    override setup(ProjectInfrastructure pinf, PrintStream logger) {
        super.setup(pinf, logger)
        checkExecutableFlags("bin")
    }
    
    override configureEnvironment(Map<String, String> map) {
        if (rootDir !== null) {
            map.put("ESTEREL", rootDir.absolutePath)
        }
    }
    
    override generateCodeCommand(List<File> files, ArrayList<String> options) {
        val bin = new File(rootDir, "bin")
        val command = <String>newArrayList
        
        command += new File(bin, "esterel").absolutePath
        command += "-v"
        command += "-W"
        command += "-stat"
        command += "-size"
        
        if (environment.getProperty(XES_CODE)?:false) {
            command += "-I" // lass check -> possible runtime errors in xes
            command += "-simul"
        }
        
        command += options
        command += files.map[toString]
        
        return command
    }
    
    override getExpectedResults(List<File> files) {
        return files.filter[it.name.endsWith(ESTEREL_EXTENSION)].map[new File(it.parent, it.name.replace(ESTEREL_EXTENSION, ".c"))].toList
    }
    
    def compileXESCommand(List<File> files, List<String> options, String target) {
        val command = <String>newArrayList
        
        command += XESPath.absolutePath
        command += options
        command += files.map[toString]
        command += "-o"
        command += target
        
        return command
    }
    
    def getXESPath() {
        return new File(new File(rootDir, "bin"), "xes")
    }
    
    def supportsXES() {
        return XESPath.exists
    }
    
}