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

import de.cau.cs.kieler.prom.KiBuildStandaloneSetup
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI

/**
 * @author aas
 *
 */
abstract class AbstractSimulationBackend extends SimulationBackend {
    
    private BuildConfiguration buildConfig
    
    abstract def String getBuildConfigOrigin()
    
    new() {
        buildConfig = loadBuildConfig(buildConfigOrigin)
    }
    
    override getBuildConfig() {
        return buildConfig
    }
    
    private def BuildConfiguration loadBuildConfig(String origin) {
//        val stream = PromPlugin.getInputStream(origin, #{"frontend" -> ""})
//        val resourceSet = KiBuildStandaloneSetup.doSetup.getInstance(XtextResourceSet)
//        val resource = resourceSet.createResource(URI.createURI("dummy:/dummy."+FileExtensions.BUILD_CONFIG));
//        resource.load(stream, resourceSet.getLoadOptions());
//        stream.close
//        buildConfig = resource.contents.get(0) as BuildConfiguration
        val resourceSet = KiBuildStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        val buildDefinitionFile = URI.createURI(origin)
        val resource = resourceSet.getResource(buildDefinitionFile, true)
        buildConfig = resource.contents.get(0) as BuildConfiguration
    }
}