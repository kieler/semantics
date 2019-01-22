/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testsuite

import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.nio.file.Path
import de.cau.cs.kieler.kicool.System

/**
 * @author mek
 *
 */
class TestsuiteCompilationData {
    public String root
    public String destination
    public String generatedFolder
    public String fileEndsWithFilter
    public System system
    
    def validFile(Path file) {
        return file.fileName.toString.endsWith(fileEndsWithFilter)
    }
    
    def fillEnvitonment(Environment env) {
        if (root !== null) {
            env.setProperty(ProjectInfrastructure.MODEL_SRC_PATH,  root)
        }
        if (destination !== null) {
            env.setProperty(ProjectInfrastructure.MODEL_DST_PATH,  destination)
        }
        if (generatedFolder !== null && generatedFolder != "") {
            env.setProperty(ProjectInfrastructure.USE_GENERATED_FOLDER, true)
            env.setProperty(ProjectInfrastructure.GENERATED_NAME, generatedFolder)
        } else {
            env.setProperty(ProjectInfrastructure.USE_GENERATED_FOLDER, false)
        }
    }
}