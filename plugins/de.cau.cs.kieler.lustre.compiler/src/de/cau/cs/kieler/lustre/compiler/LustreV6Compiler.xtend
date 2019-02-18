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

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.Platform

import static de.cau.cs.kieler.lustre.compiler.LustreCompilerActivator.*

/**
 * @author lgr
 */
class LustreV6Compiler extends LustreCompiler {

    public static val LUSTRE_EXTENSION = ".lus"

    public static val IProperty<String> VERSION = 
        new Property<String>("de.cau.cs.kieler.lustre.compiler.v6.version", null)

    public static val IProperty<String> NODE_NAME = 
        new Property<String>("de.cau.cs.kieler.lustre.compiler.v6.nodeName", null)

    public static val VERSIONS = #["lv6"]
    
//    static val String[] STATICALLY_GENERATED_FILES = #{"lustre_consts.c", "lustre_consts.h", "lustre_types.h"}
        
    val Environment environment
    var String version = null
    var File lv4Root = null
        
    new(Environment environment) {
        this.environment = environment
        this.version = environment.getProperty(VERSION)
        
        if (version === null) {
            version = VERSIONS.head
            version.resolveRoot
            if (!available) {
                for (v : VERSIONS) {
                    v.resolveRoot
                    if (available) {
                        version = v
                    }
                }
            }
        } else {
            version.resolveRoot
        }
        
        if (!available) {
            if (System.getenv().containsKey('LUSTRE')) {
                root = new File(System.getenv().get('LUSTRE'))
            }
        }
        
        
        try {
            val base = bundlePath.resolve("compiler").toFile
            if (base.directory) {
                val compilerBase = new File(base, "lv4")
                if (compilerBase.directory) {
                    val platform = new File(compilerBase, Platform.OS)
                    if (platform.directory) {
                        lv4Root = platform
                    } else {
                        val arch = new File(compilerBase, Platform.OS + Platform.OSArch)
                        if (arch.directory) {
                            lv4Root = arch
                        }
                    }
                }
            }
       } catch(Exception e) {
           e.printStackTrace
       }
        
        checkExecutableFlags()
    }
    
    override getName() {
        return version
    }
    
    override configureEnvironment(Map<String, String> map) {
        if (root !== null) {
            map.put("LUSTRE", root.absolutePath)
        }
        if (lv4Root !== null) {
            map.put("LUSTRE_INSTALL", lv4Root.absolutePath)
        }
    }
    
    override generateCodeCommand(List<File> files, ArrayList<String> options) {
        val bin = new File(root, "bin")
        val command = <String>newArrayList
        val fileName = files.head.path.split("/").last
        
        environment.setProperty(NODE_NAME, fileName.split("\\.").head)
        
        command += new File(bin, "lv6").absolutePath
        command += files.map[toString]
        command += "-n"
        command += fileName.split("\\.").head
        command += "-2c"
        
        command += options
        
        return command
    }
    
    override getExpectedResults(List<File> files) {
        val lustreFiles = files.filter[it.name.endsWith(LustreV6Compiler.LUSTRE_EXTENSION)]

//        // Add sh files
//        var expectedResults = lustreFiles.map[new File(it.parent, it.name.replace(LustreV6Compiler.LUSTRE_EXTENSION, ".sh"))].toList
//        
//        // Add constant files
//        for (String parent : lustreFiles.map[parent]) {
//            expectedResults += STATICALLY_GENERATED_FILES.map[new File(parent, it)]
//        }
        
        var expectedResults = newArrayList
        // Add c files
        for (File lustreFile : lustreFiles) {
            val name = lustreFile.name.replace(LustreV6Compiler.LUSTRE_EXTENSION, "")
            expectedResults += new File(lustreFile.parent, lustreFile.name.replace(LustreV6Compiler.LUSTRE_EXTENSION, "_" + name + ".c"))
//            expectedResults += new File(lustreFile.parent, lustreFile.name.replace(LustreV6Compiler.LUSTRE_EXTENSION, "_" + name + ".h"))
//            expectedResults += new File(lustreFile.parent, lustreFile.name.replace(LustreV6Compiler.LUSTRE_EXTENSION, "_" + name + "_loop.c"))
        return expectedResults
        }
        
    }
    
    def compileLucioleCommand(File file) {
        val command = <String>newArrayList
        val fileName = file.name.split("\\.").head
        
        command += luciolePath.name
        command += fileName + ".lus"
        command += fileName
        
        return command
    }
    
    def getLuciolePath() {
        return new File(new File(root, "bin"), "luciole")
    }
    
    def getShellScriptPath() {
        return new File(root, "updateEnvironment.sh").absolutePath
    }
    
    def getLv4Root() {
        return lv4Root
    }
    
    protected def checkExecutableFlags() {
        var succeeded = true
        if (isAvailable) {
            val bin = new File(root, "bin")
            for (exe : bin.listFiles) {
                if (!exe.name.contains(".") || exe.name.endsWith(".exe")) {
                    if (!exe.canExecute) {
                        val success = exe.executable = true
                        succeeded = succeeded && success
                    }
                }
            }
            if (!succeeded) {
                environment.warnings.add("Failed to set executable flag of the lustre compiler")
            }
        }
    }
        
       
}