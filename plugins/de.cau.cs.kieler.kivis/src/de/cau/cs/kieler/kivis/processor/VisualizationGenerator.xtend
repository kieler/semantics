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
package de.cau.cs.kieler.kivis.processor

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*
import de.cau.cs.kieler.kicool.deploy.processor.AbstractDeploymentProcessor
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kivis.kivis.Visualization
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import java.io.File
import java.nio.file.Paths
import java.nio.file.Path
import de.cau.cs.kieler.kivis.KiVisStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import java.nio.file.Files
import java.nio.charset.StandardCharsets
import java.io.FileWriter

import static de.cau.cs.kieler.kivis.KiVisConstants.*
import static org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl.*
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.deploy.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl
import org.eclipse.core.resources.ResourcesPlugin
import java.net.URL

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class VisualizationGenerator extends InplaceProcessor<Object> {

    public static val IProperty<String> SOURCE = 
        new Property<String>("de.cau.cs.kieler.kivis.source", null)
    public static val IProperty<Boolean> FAIL = 
        new Property<Boolean>("de.cau.cs.kieler.kivis.fail.missing", false)
    public static val IProperty<Boolean> SEARCH = 
        new Property<Boolean>("de.cau.cs.kieler.kivis.autosearch", false)
        
    val jsProcessor = KiCoolRegistration.getInstance(KiVisJSGenerator) as KiVisJSGenerator
    val logger = new Logger
        
    override getId() {
        "de.cau.cs.kieler.kivis.gen"
    }
    
    override getName() {
        "Visualization Generation"
    }
    
    override process() {
        var Visualization viz = null
        var File vizFile = null
        var Path vizFolder = null
        
        if (model instanceof Visualization) {
            viz = model as Visualization
            if (viz.eResource !== null && viz.eResource.URI !== null) {
                if (viz.eResource.URI.platform) {
                    vizFile = new File(
                        ResourcesPlugin.workspace.root.getFile(
                            new org.eclipse.core.runtime.Path(viz.eResource.URI.toPlatformString(false))
                        ).location.toString
                    )
                } else {
                    vizFile = new File(viz.eResource.URI.toFileString)
                }
                vizFolder = Paths.get(viz.eResource.URI.trimSegments(1).toFileString)
            } else {
                vizFolder = Paths.get("")
            }
        } else if (environment.getProperty(SOURCE) !== null) {
            val source = environment.getProperty(SOURCE)
            if (!source.nullOrEmpty) {
                vizFile = new File(source)
                if (vizFile.exists) {
                    vizFolder = vizFile.absoluteFile.parentFile.toPath
                } else {
                    // Path seems to be relative
                    val inputModel = compilationContext.originalModel
                    if (inputModel instanceof EObject) {
                        if (inputModel.eResource !== null && inputModel.eResource.URI !== null) {
                            vizFolder = inputModel.eResource.URI.directory
                            vizFile = vizFolder.resolve(vizFile.toPath).toFile
                        }
                    }
                }
                if (!vizFile.exists) {
                    vizFile = null
                }
            }
        } else if (environment.getProperty(SEARCH)) {
            try {
                val inputModel = compilationContext.originalModel
                if (inputModel instanceof EObject) {
                    if (inputModel.eResource !== null && inputModel.eResource.URI !== null) {
                        vizFolder = inputModel.eResource.URI.directory
                        var name = inputModel.eResource.URI.segmentsList.last
                        name = name.replace("." + inputModel.eResource.URI.fileExtension, FILE_EXTENSION)
                        vizFile = vizFolder.resolve(name).toFile
                        if (!vizFile.exists) {
                            vizFile = null
                        }
                    }
                }
            } catch (Exception e) {
                // seaching just failed
            }
        }
        
        if (viz !== null || vizFile !== null) {
            val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
            infra.log(logger)
            
            logger.println("== Visualization Generation ==")
            logger.println("Source file: " + vizFile)
            logger.println("Source folder: " + vizFolder)
            logger.println()
            
            if (viz === null) {
                val uri = URI.createFileURI(vizFile.toString)
                val injector = KiVisStandaloneSetup.doSetup
                val rSet = injector.getInstance(XtextResourceSet);
                logger.println("Loading model: " + uri.toString)
                try {
                    val res = rSet.getResource(uri, true)
                    viz = res.contents.head as Visualization
                } catch (Exception e) {
                    environment.errors.add("Cannot load visualization file", e)
                    logger.println("ERROR: Cannot load visualization file")
                    e.printStackTrace(logger)
                }
                
                val imagePath = vizFolder.resolve(viz.image)
                logger.println("Loading image: " + imagePath.toString)
                var String svg;
                try {
                    svg = new String(Files.readAllBytes(imagePath), StandardCharsets.UTF_8);
                    // Skipp everything until opening svg tag
                    svg = svg.substring(svg.indexOf("<svg"))
                } catch (Exception e) {
                    environment.errors.add("Cannot load image file", e)
                    logger.println("ERROR: Cannot load image file")
                    e.printStackTrace(logger)
                }
                
                logger.println("Generating JS code")
                val js = jsProcessor.translate(viz)
                
                logger.println("Generating HTML")
                val composed = viz.compose(js, svg)
                val vizCC = new CodeContainer
                val fileName = "visualization.html"
                vizCC.add(fileName, composed)
                vizCC.snapshot
                
                logger.println
                logger.println("== Save Generated Visualization ==")
                
                if (infra.generadedCodeFolder === null) {
                    environment.errors.add("No folder for generated code defined")
                    logger.println("ERROR: No folder for generated code defined")
                }
                
                logger.println("Saving " + fileName)
                val target = new File(infra.generadedCodeFolder, fileName)
                try {
                    val writer = new FileWriter(target)
                    writer.write(composed)
                    writer.close
                }  catch (Exception e) {
                    environment.errors.add("Can not save file " + fileName, e)
                    logger.print("ERROR: Can not save file " + fileName)
                    e.printStackTrace(logger)
                }
                
                // Register file
                environment.setProperty(VISUALIZATION, target.absoluteFile.toURI.toURL.toString)
                
                logger.closeLog("visualization-generation.log").snapshot
            }
        } else if (environment.getProperty(FAIL)) {
            environment.errors.add("Cannot find visualization file")
        }
    }
    
    def compose(Visualization viz, String js, String svg) {
        return '''
            <!DOCTYPE html>
            <html>
              <head>
                <meta charset="UTF-8">
                «FOR url : viz.loads»
                    <script src="«url»" type="text/javascript"></script>
                «ENDFOR»
              </head>
              <body>
                «svg»
                
                <script>
                    «js»
                </script>
              </body>
            </html>
        '''
    }
    
    def directory(URI uri) {
        if (uri.platform) {
            return Paths.get(
                ResourcesPlugin.workspace.root.getFile(
                    new org.eclipse.core.runtime.Path(uri.toPlatformString(false))
                ).parent.location.toString
            )
        } else {
            return (new File(uri.toFileString)).absoluteFile.parentFile.toPath
        }
    }
}
