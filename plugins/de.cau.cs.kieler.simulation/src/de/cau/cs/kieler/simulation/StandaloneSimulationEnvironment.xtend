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
package de.cau.cs.kieler.simulation

import de.cau.cs.kieler.prom.PromPlugin
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.core.resources.IFile
import org.eclipse.xtext.resource.XtextResourceSet
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import org.eclipse.emf.common.util.URI
import de.cau.cs.kieler.prom.KiBuildExtensions
import de.cau.cs.kieler.prom.build.FileGenerationResult
import org.eclipse.emf.ecore.EObject
import static com.google.common.base.Preconditions.*
import de.cau.cs.kieler.prom.ModelImporter
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl
import org.eclipse.core.resources.IFolder
import de.cau.cs.kieler.prom.KiBuildStandaloneSetup

/**
 * A standalone simulation environment.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class StandaloneSimulationEnvironment {

    static extension KiBuildExtensions kiBuildExtensions = new KiBuildExtensions
    static extension ExtensibleURIConverterImpl URIconverter = new ExtensibleURIConverterImpl

    @Accessors(PUBLIC_GETTER) val IProject project
    @Accessors var IFile modelFile = null
    @Accessors var BuildConfiguration buildConfig = null
    @Accessors(PUBLIC_GETTER) var FileGenerationResult buildResult = null

    static def createCSimulationEnvironment() {
        return new StandaloneSimulationEnvironment("TEMPORARY_SIM_PROJECT") => [
            setResource("CSimulation.ftl",
                URI.createURI("platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulation.ftl"))
            setResource("assets/CSimulationSnippets.ftl",
                URI.createURI("platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/CSimulationSnippets.ftl"))
            setBuildConfig(URI.createURI("platform:/plugin/de.cau.cs.kieler.simulation/resources/standaloneC.kibuild"))
        ]
    }

    new(String projectName) {
        val root = ResourcesPlugin.getWorkspace.getRoot
        project = root.getProject(projectName)
        if (!project.exists) {
            project.create(null)
            project.open(null)
        }
    }

    def build() {
        build(null)
    }

    def build(EObject model) {
        checkNotNull(buildConfig, "Build Configuration is null")

        // Create a (virtual) file for the source model
        if (modelFile === null) {
            checkArgument(model !== null, "Model must not be null if no model file is configured")
            modelFile = project.getFile("model")
        }
        checkArgument(project.equals(modelFile.project), "Model file is not located in the project")
        val compileModel = if(model === null) ModelImporter.load(modelFile) else model

        buildResult = new FileGenerationResult

        val modelCompilers = buildConfig.createModelCompilers
        val simulationCompilers = buildConfig.createSimulationCompilers

        // Compile model
        for (modelCompiler : modelCompilers) {
            val modelCompilationResult = modelCompiler.compile(modelFile, compileModel)
            buildResult.problems.addAll(modelCompilationResult.problems)
            // Compile simulation code to executable
            for (simulationCompiler : simulationCompilers) {
                for (simFile : modelCompilationResult.createdSimulationFiles) {
                    val simCompilationResult = simulationCompiler.compile(simFile)
                    buildResult.createdFiles.addAll(simCompilationResult.createdFiles)
                    buildResult.problems.addAll(simCompilationResult.problems)
                }
            }
        }
    }

    def setResource(String path, URI source) {
        checkArgument(!path.nullOrEmpty, "Path is null or empty")
        checkNotNull(source, "Source URI is null")

        val resource = project.getFile(path)
        // check parents
        var parent = resource.parent
        while (!(parent instanceof IProject)) {
            if (parent instanceof IFolder) {
                if (!parent.exists) {
                    parent.create(true, true, null)
                }
            }
            parent = parent.parent           
        }
        if (resource.exists) {
            resource.delete(true, null)
        }
        resource.create(source.createInputStream, true, null)
        
        project.refreshLocal(IResource.DEPTH_INFINITE, null)
    }

    def setBuildConfig(URI buildDefinitionFile) {
        val resourceSet = KiBuildStandaloneSetup.doSetup.getInstance(XtextResourceSet)
        val resource = resourceSet.getResource(buildDefinitionFile, true)
        setBuildConfig(resource.contents.get(0) as BuildConfiguration)
    }

}
