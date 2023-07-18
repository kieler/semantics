/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.cli

import de.cau.cs.kieler.kicool.cli.KielerCompilerCLI
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.compilation.ExecutableContainerWrapper
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.KlighdDataManager
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.ISynthesis
import de.cau.cs.kieler.klighd.standalone.KlighdStandaloneSetup
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import java.io.File
import java.util.Map
import org.eclipse.core.runtime.IStatus
import org.eclipse.elk.graph.properties.Property
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option

import static extension java.lang.String.*

/**
 * @author als
 */
@Command(name="kicodia")
class KielerCompilerDiagramCLI extends KielerCompilerCLI {

    /** Klighd export format */
    enum ImageFormat {
        BMP,
        JPEG,
        PNG,
        SVG
    }

    @Option(names=#["-d", "--diagram"], description="the output will also saved as a diagram if possible.")
    protected boolean diagram

    @Option(names=#["--diagram-format"], paramLabel = "FORMAT", description="the file format for the diagram image output. Accepted values: bmp, jpeg, png, svg. Default: png")
    protected ImageFormat format = ImageFormat.PNG
    
    @Option(names=#["--diagram-synthesis"], paramLabel = "ID", description="the id of the diagram synthesis that should be used. If no synthesis is specified or the synthesis cannot handle the model, try to use a compatible synthesis.")
    protected String requestedSynthesisId
    
    @Option(names=#["--only-diagram"], description="suppresses normal file output of the compilation result and only saves diagram (if possible)")
    protected boolean onlyDiagram
    
    @Option(names = #["--synthesis-property", "--SP"], paramLabel = "PROPERTY", description = "the diagram synthesis properties.")
    protected Map<String, String> synthesisProperties
    
    @Option(names = #["--synthesis-option", "--SO"], paramLabel = "PROPERTY", description = "the configuration of diagram synthesis (side-bar) options. Keys can be either the id or the label of the option.")
    protected Map<String, String> synthesisOptions  
      
    @Option(names = #["--list-all-syntheses"], description = "lists all available diagram syntheses.")
    protected boolean listAllSyntheses

    static def void main(String[] args) throws Exception {
        val cl = new CommandLine(new KielerCompilerDiagramCLI())
        cl.caseInsensitiveEnumValuesAllowed = true // case insensitive format
        System.exit(cl.execute(args))
    }

    override protected saveModel(Object model, File dest, File source, CompilationContext cc) {
        if (diagram || onlyDiagram) {
            if (!onlyDiagram) {
                val success = super.saveModel(model, dest, source, cc)
                if(!success) return false
            }
            try {
                if (model instanceof CodeContainer
                    || model instanceof ExecutableContainer || model instanceof ExecutableContainerWrapper
                    || model instanceof String || model instanceof CharSequence
                ) {
                    if (verbose) println("Skipping diagram generation for model of type %s".format(model.class.simpleName))
                    return true
                }
                
                val kdm = initializeKlighd()
                var ISynthesis synthesis = null
                
                // Find synthesis
                if (!requestedSynthesisId.nullOrEmpty) {
                    synthesis = kdm.getDiagramSynthesisById(requestedSynthesisId)
                    if (synthesis === null) {
                        println("No registered diagram synthesis with ID %s.".format(requestedSynthesisId))
                    } else if (!synthesis.supports(model, null)) {
                        println("Diagram synthesis (%s) does not support the given model (%s).".format(requestedSynthesisId, model.class.simpleName))
                        synthesis = null // fallback
                    }
                }
                if (synthesis === null) {
                    val syntheses = kdm.getAvailableSyntheses(model.class)
                    if (syntheses.nullOrEmpty) {
                        println("No diagram synthesis available to handle the given model type %s.".format(model.class.simpleName))
                        return !onlyDiagram
                    } else {
                        synthesis = syntheses.head
                    }
                }
                if (verbose) {
                    println("Using diagram synthesis: %s".format(kdm.getSynthesisID(synthesis)))
                }
                
                // Determine target
                var File target
                val name = (source.name.contains(".")) ? source.name.substring(0, source.name.lastIndexOf(".")) : source.name
                if (!dest.exists) {
                    if (dest.parentFile !== null && !dest.parentFile.exists) {
                        if (!dest.parentFile.mkdirs) {
                            println("Could not create output directory: %s".format(dest.parentFile))
                            return !onlyDiagram
                        }
                    }
                    dest.createNewFile
                }
                if (dest.isFile) {
                    if (onlyDiagram) {
                        target = dest
                    } else {
                        target = new File(dest.parentFile, dest.name + "." + format.name.toLowerCase)
                    }
                } else {
                    target = new File(dest, name + "." + format.name.toLowerCase)
                    if (target.absoluteFile.equals(source.absoluteFile)) {
                        println("Diagram is not generated since it would overwrite the source file.")
                        return !onlyDiagram
                    }
                }
                
                // Properties and options
                val properties = new KlighdSynthesisProperties
                properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, kdm.getSynthesisID(synthesis));
                properties.setProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT, cc)
                
                if (synthesisProperties !== null && !synthesisProperties.empty) {
                    for (entry : synthesisProperties.entrySet) {
                        val v = parsePropertyValue(entry.value)
                        if (verbose && !(v instanceof String)) {
                            println("Automatically converted value (%s) of property %s to %s.".format(entry.value, entry.key, v.class.simpleName))
                        }
                        properties.allProperties.put(new Property<Object>(entry.key), v)
                    }
                }
                if (synthesisOptions !== null && !synthesisOptions.empty) {
                    val options = synthesis.displayedSynthesisOptions
                    val optionConfig = newHashMap
                    for (entry : synthesisOptions.entrySet) {
                        val key = entry.key
                        var option = options.findFirst[!it.id.nullOrEmpty && it.id.equals(key)]
                        if (option === null) {
                            if (verbose) println("Could not find synthesis option with id \"%s\".".format(key))
                            option = options.findFirst[!it.name.nullOrEmpty && (it.name.startsWith(key) || it.name.equalsIgnoreCase(key))]
                            if (verbose) {
                                if (option === null) {
                                    println("Could not find synthesis option with name \"%s\" either.".format(key))
                                } else {
                                    println("Found synthesis option with matching name \"%s\" for \"%s\".".format(option.name, key))
                                }
                            }
                        }
                        if (option !== null) {
                            val v = option.parseOptionValue(entry.value)
                            if (v !== null) {
                                optionConfig.put(option, v)
                            }
                        }
                    }
                    properties.configureSynthesisOptionValues(optionConfig);
                }
                
                
                // Render
                if (verbose) println("Rendering diagram to %s".format(target))
                val startTimestamp = System.nanoTime
                val IStatus result = LightDiagramServices.renderOffScreen(model, format.name.toLowerCase, target.path, properties)
        
                // Check if rendering was successful
                if (result === null || !result.OK) {
                    println("Rendering diagram failed.")
                    if(verbose && result !== null && result.exception !== null) result.exception.printStackTrace
                    return !onlyDiagram
                } else if (verbose) {
                    println("Rendering finished in %.2fms".format((System.nanoTime - startTimestamp) as double / 1000_000))
                }
            } catch (Exception e) {
                println("Rendering diagram failed.")
                if(verbose) e.printStackTrace
                if(onlyDiagram) return false
            }
            return true
        } else {
            return super.saveModel(model, dest, source, cc)
        }
    }
    
    override boolean printList() {
        val exit = super.printList()
        if (listAllSyntheses) {
            println("All available diagram syntheses (<id> [<input-type>]):")
            try {
                val kdm = initializeKlighd()
                // FIXME Klighd should have API to access registered syntheses 
                val field = kdm.class.getDeclaredField("idSynthesisMapping") => [accessible = true]
                val syntheses = field.get(kdm) as Map<String, ISynthesis>
                
                for (entry : syntheses.entrySet.sortBy[it.key]) {
                    println("  %s [%s]".format(entry.key, entry.value.inputDataType.simpleName))
                }
            } catch (Exception e) {
                println("Internal error: Failed to collect synthesis data.")
            }
            return true
        }
        return exit
    }
    
    
    protected def Object parsePropertyValue(String value) {
        try {
            return Boolean.parseBoolean(value)
        } catch (Exception e) {}
        try {
            return Integer.parseInt(value)
        } catch (Exception e) {}
        try {
            return Float.parseFloat(value)
        } catch (Exception e) {}
        return value;
    }
    
    protected def Object parseOptionValue(SynthesisOption option, String value) {
        try {
            if (option !== null && !value.nullOrEmpty) {
                if (option.isCheckOption()) {
                    return Boolean.parseBoolean(value);
                } else if (option.isRangeOption()) {
                    return Float.parseFloat(value);
                } else if (option.isChoiceOption()) {
                    for (Object choice : option.getValues()) {
                        if (choice !== null && choice.toString().equalsIgnoreCase(value)) {
                            return choice;
                        }
                    }
                    // If not explicit match, try index
                    return option.getValues().get(Integer.parseInt(value))
                } else if (option.isTextOption()) {
                    return value;
                }
            }
        } catch (Exception e) {
            if (verbose) println("Could not parse value \"%s\" for synthesis option \"%s\"".format(value, option.name))
        }
        return null;
    }
    
    private var KlighdDataManager _kdm;
    protected def KlighdDataManager initializeKlighd() {
        // Lazy loading of KlighdDataManager ensures that syntheses are loaded after external jars were put on the class path  
        if (_kdm === null) {
            KlighdStandaloneSetup.initialize();
            _kdm = KlighdDataManager.getInstance();
        }
        return _kdm;
    }

}
