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
package de.cau.cs.kieler.simulation.backends

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.prom.KiBuildStandaloneSetup
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * @author aas
 *
 */
abstract class OriginBasedSimulationBackend extends SimulationBackend {
    
    private BuildConfiguration buildConfig
    
    abstract def String getBuildConfigOrigin()
    
    override getBuildConfig() {
        if(buildConfig == null) {
            buildConfig = loadBuildConfig(buildConfigOrigin)
        }
        return buildConfig
    }
    
    private static def BuildConfiguration loadBuildConfig(String origin) {
        val resourceSet = KiBuildStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        // Replace possible frontend placeholder in file from origin
        val stream = PromPlugin.getInputStream(origin, #{"frontend" -> ""})
        val resource = resourceSet.createResource(URI.createURI("dummy:/dummy."+FileExtensions.BUILD_CONFIG));
        resource.load(stream, resourceSet.getLoadOptions());
        stream.close
        // Load the build configuration model
        return resource.contents.get(0) as BuildConfiguration
    }
}