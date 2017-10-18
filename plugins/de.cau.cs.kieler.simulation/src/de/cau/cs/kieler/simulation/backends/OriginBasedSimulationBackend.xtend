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
    
    /**
     * The build config that has been loaded from the origin.
     */
    private BuildConfiguration buildConfig
    
    /**
     * The origin of a build config (e.g. an URI using the platform protocol)
     */
    abstract def String getBuildConfigOrigin()
    
    /**
     * Returns the build config.
     */
    override getBuildConfig() {
        if(buildConfig == null) {
            buildConfig = loadBuildConfig(buildConfigOrigin)
        }
        return buildConfig
    }
    
    /**
     * Loads the build configuration from the origin.
     */
    private static def BuildConfiguration loadBuildConfig(String origin) {
        val resourceSet = KiBuildStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        // Replace possible frontend placeholder in file from origin
        val stream = PromPlugin.getInputStream(origin, null)
        val resource = resourceSet.createResource(URI.createURI("dummy:/dummy."+FileExtensions.BUILD_CONFIG));
        resource.load(stream, resourceSet.getLoadOptions());
        stream.close
        // Load the build configuration model
        return resource.contents.get(0) as BuildConfiguration
    }
}