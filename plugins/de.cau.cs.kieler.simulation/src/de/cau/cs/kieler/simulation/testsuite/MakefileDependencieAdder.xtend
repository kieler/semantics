/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testsuite

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import java.util.Map
import java.util.List
import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.deploy.Logger
import java.util.HashMap
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * @author mek
 *
 */
class MakefileDependencieAdder extends InplaceProcessor<CodeContainer>{
    
    public static val IProperty<Boolean> DEPENDENCIE_NAME_AUTODETECT =
        new Property<Boolean>("de.cau.cs.kieler.simulation.testsuite.makefile.dependencie.name.autodetect", true)
    
    public static val IProperty<String> DEPENDENCIE_FILE =
        new Property<String>("de.cau.cs.kieler.simulation.testsuite.makefile.dependencie.file", null)
    
    public static val IProperty<Map<String, List<String>>> DEPENDENCIE_MAP =
        new Property<Map<String, List<String>>>("de.cau.cs.kieler.simulation.testsuite.makefile.dependencies", null)
    
    
    override getId() {
         "de.cau.cs.kieler.simulation.testsuite.makefile"
    }
    
    override getName() {
        "Makefile Dependencies"
    }
        
    override process() {
        val dependencieFilePath = environment.getProperty(DEPENDENCIE_FILE)
        val dependencies = environment.getProperty(DEPENDENCIE_MAP)
        val logger = new Logger
        
        if (dependencieFilePath !== null && dependencies !== null) {
            val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
            // get the name to place in placeholder, on auto-detect get name of first CodeContainer file
            var name = infra.modelFile?.name ?: ""
            // note: don't get (and cast) model if auto-detect is off
            if (environment.getProperty(DEPENDENCIE_NAME_AUTODETECT) && model.files.size > 0) {
                name = model.files.get(0).fileName
            }
            // remove the extension(s)
            if (name.contains(".")) {
                name = name.substring(0, name.indexOf("."))
            }
            
            val vars = new HashMap<String,String>()
            vars.put("NAME", name)
            
            // get file to write dependencies into
            val dependencieFile = Paths
                .get(infra.generatedCodeFolder.path)
                .resolve(vars.getDependenciePath(infra, dependencieFilePath))
            val dependencieLines = new ArrayList(dependencies.size)
            
            // add all dependency lines to the list
            for (Map.Entry<String, List<String>> entry : dependencies.entrySet) {
                if (entry.value !== null && entry.value.size > 0) {
                    val line = new StringBuilder
                    
                    line.append(vars.getDependenciePath(infra, entry.key))
                    line.append(":")
                    for (String dependent : entry.value) {
                        line.append(" ")
                        line.append(vars.getDependenciePath(infra, dependent))
                    }
                    dependencieLines += line
                    logger.println(line)
                }
            }
            
            // append the dependencies to target file
            logger.println()
            logger.println("Output-file: "+dependencieFile)
            Files.write(dependencieFile, dependencieLines, UTF_8, APPEND, CREATE)
        }
        
        snapshot(logger.closeLog("dependencies.d"))
    }
    
    /**
     * This method resolves a path with given variables which may be used in path with
     * "${VARIABLE}" and resolves it to a path for a makefile
     */
    private def String getDependenciePath(Map<String,String> vars, ProjectInfrastructure infra, String path) {
        return Paths
            .get(infra.variableReplacement(vars, path))
            .normalize
            .toString
            .replace("\\", "/")
    }
}