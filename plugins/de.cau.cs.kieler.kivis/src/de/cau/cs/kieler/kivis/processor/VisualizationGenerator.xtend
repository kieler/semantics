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

import de.cau.cs.kieler.annotations.Pragmatable
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kivis.KiVisStandaloneSetup
import de.cau.cs.kieler.kivis.kivis.Visualization
import java.io.File
import java.io.FileWriter
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResourceSet

import static de.cau.cs.kieler.kivis.KiVisConstants.*

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
        
    public static val VIZ_PRAGMA = PragmaRegistry.register("visualization", StringPragma, "The path to the visualiuation file.")
        
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
        var java.nio.file.Path vizFolder = null
        val origin = compilationContext.originalModel
        
        if (model instanceof Visualization) {
            viz = model as Visualization
            if (viz.eResource !== null && viz.eResource.URI !== null) {
                if (viz.eResource.URI.platform) {
                    vizFile = new File(
                        ResourcesPlugin.workspace.root.getFile(
                            new Path(viz.eResource.URI.toPlatformString(false))
                        ).location.toString
                    )
                } else {
                    vizFile = new File(viz.eResource.URI.toFileString)
                }
                vizFolder = Paths.get(viz.eResource.URI.trimSegments(1).toFileString)
            } else {
                vizFolder = Paths.get("")
            }
        } else if (environment.getProperty(SOURCE) !== null ||
            (model instanceof Pragmatable && (model as Pragmatable).pragmas.filter(StringPragma).exists[VIZ_PRAGMA.equals(name)]) ||
            (origin instanceof Pragmatable && (origin as Pragmatable).pragmas.filter(StringPragma).exists[VIZ_PRAGMA.equals(name)])
        ) {
            var source = environment.getProperty(SOURCE)
            if (source.nullOrEmpty && model instanceof Pragmatable) {
                source = (model as Pragmatable).pragmas.filter(StringPragma).findFirst[VIZ_PRAGMA.equals(name)].values.head
            }
            if (source.nullOrEmpty && origin instanceof Pragmatable) {
                source = (origin as Pragmatable).pragmas.filter(StringPragma).findFirst[VIZ_PRAGMA.equals(name)].values.head
            }
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
                
                val svg = new StringBuffer
                for (image : viz.images) {
                    val imagePath = vizFolder.resolve(image)
                    logger.println("Loading image: " + imagePath.toString)
                    try {
                        val imageSVG = new String(Files.readAllBytes(imagePath), StandardCharsets.UTF_8);
                        // Skipp everything until opening svg tag
                        if (imageSVG.contains("<svg")) {
                            svg.append(imageSVG.substring(imageSVG.indexOf("<svg")))
                        } else {
                            svg.append(imageSVG)
                            logger.println("Warning: Image is not an svg!")
                        }
                    } catch (Exception e) {
                        environment.errors.add("Cannot load image file", e)
                        logger.println("ERROR: Cannot load image file")
                        e.printStackTrace(logger)
                    }
                }
                
                logger.println("Generating JS code")
                val js = jsProcessor.translate(viz)
                
                logger.println("Generating HTML")
                val composed = viz.compose(js, svg.toString)
                val vizCC = new CodeContainer
                val fileName = "visualization.html"
                vizCC.add(fileName, composed)
                vizCC.snapshot
                
                logger.println
                logger.println("== Save Generated Visualization ==")
                
                if (infra.generatedCodeFolder === null) {
                    environment.errors.add("No folder for generated code defined")
                    logger.println("ERROR: No folder for generated code defined")
                }
                
                logger.println("Saving " + fileName)
                val target = new File(infra.generatedCodeFolder, fileName)
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
              <style>
                svg text { // Suppress text selection
                  -webkit-touch-callout: none;
                  -webkit-user-select: none;
                  -moz-user-select: none;
                  -ms-user-select: none;
                  user-select: none;
                  pointer-events: none;
                }
              </style>
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
                    new Path(uri.toPlatformString(true))
                ).parent.location.toString
            )
        } else {
            return (new File(uri.toFileString)).absoluteFile.parentFile.toPath
        }
    }
}
