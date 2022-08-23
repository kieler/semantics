/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.processors

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.KlighdDataManager
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.ISynthesis
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import java.util.Map

import static extension java.lang.String.*

/**
 * Perform a Klighd diagram synthesis.
 * 
 * @author als
 */
class KlighdDiagramSynthesis extends Processor<Object, KNode> {
    
    public static val ID = "de.cau.cs.kieler.kicool.ide.processors.diagram.synthesis"

    public static val IProperty<Map<String, Object>> PROPERTIES = 
        new Property<Map<String, Object>>("de.cau.cs.kieler.kicool.ide.processors.diagram.synthesis.properties", null)
    public static val IProperty<Map<String, Object>> OPTIONS = 
        new Property<Map<String, Object>>("de.cau.cs.kieler.kicool.ide.processors.diagram.synthesis.options", null)
    public static val IProperty<Boolean> VERBOSE = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.ide.processors.diagram.synthesis.verbose", false)
    public static val IProperty<Boolean> LAYOUT = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.ide.processors.diagram.synthesis.layout", true)

    override getId() {
        ID
    }

    override getName() {
        "Klighd Diagram Synthesis"
    }

    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        model = sythesize(model)
    }

    def KNode sythesize(Object model) {
        // Properties and options
        val properties = new KlighdSynthesisProperties()
        properties.setProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT, compilationContext)
        
        val synthesisProperties = environment.getProperty(PROPERTIES)
        if (synthesisProperties !== null && !synthesisProperties.empty) {
            for (entry : synthesisProperties.entrySet) {
                val v = if (entry.value instanceof String) parsePropertyValue(entry.value as String) else entry.value
                if (environment.getProperty(VERBOSE) && !(v instanceof String) && entry.value instanceof String) {
                    println("Automatically converted value (%s) of property %s to %s.".format(entry.value, entry.key, v.class.simpleName))
                }
                properties.allProperties.put(new org.eclipse.elk.graph.properties.Property<Object>(entry.key), v)
            }
        }
        
        val synthesisOptions = environment.getProperty(OPTIONS)
        if (synthesisOptions !== null && !synthesisOptions.empty) {
            var ISynthesis synthesis;
            if (properties.hasProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS)) {
                synthesis = KlighdDataManager.instance.getDiagramSynthesisById(properties.getProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS))
            }
            if (synthesis === null) {
                val syntheses = KlighdDataManager.instance.getAvailableSyntheses(model.class)
                if (!syntheses.empty) {
                    synthesis = syntheses.head
                }
            }
            if (synthesis === null) {
                environment.errors.add("Cannot find synthesis for mode of type " + model.class.toString)
            }
            val options = synthesis.displayedSynthesisOptions
            val optionConfig = newHashMap
            for (entry : synthesisOptions.entrySet) {
                val key = entry.key
                var option = options.findFirst[!it.id.nullOrEmpty && it.id.equals(key)]
                if (option === null) {
                    if (environment.getProperty(VERBOSE)) println("Could not find synthesis option with id \"%s\".".format(key))
                    option = options.findFirst[!it.name.nullOrEmpty && (it.name.startsWith(key) || it.name.equalsIgnoreCase(key))]
                    if (environment.getProperty(VERBOSE)) {
                        if (option === null) {
                            println("Could not find synthesis option with name \"%s\" either.".format(key))
                        } else {
                            println("Found synthesis option with matching name \"%s\" for \"%s\".".format(option.name, key))
                        }
                    }
                }
                if (option !== null) {
                    val v = if (entry.value instanceof String) option.parseOptionValue(entry.value as String) else entry.value
                    if (v !== null) {
                        optionConfig.put(option, v)
                    }
                }
            }
            properties.configureSynthesisOptionValues(optionConfig)
        }
        
        // Synthesize
        val vc = LightDiagramServices.translateModel2(model, null, properties)
        
        // Layout
        if (environment.getProperty(LAYOUT)) {
            new LightDiagramLayoutConfig(vc).performLayout();
        }
        
        return vc.viewModel;
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
            if (environment.getProperty(VERBOSE)) println("Could not parse value \"%s\" for synthesis option \"%s\"".format(value, option.name))
        }
        return null;
    }

}