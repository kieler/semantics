/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.TypedStringAnnotation
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook
import java.util.List
import java.util.Map.Entry

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension java.lang.Character.*

/**
 * Evaluates synthesis option annotations in the model.
 * 
 * @author als
 * @kieler.design 2015-11-4 proposed
 * @kieler.rating 2015-11-4 proposed yellow
 */
class SynthesisAnnotationHook extends SynthesisHook {

    // Annotation Keyword
    /** The annotation keyword for setting synthesis options */
    public static final String SYNTHESIS_OPTIONS_ANNOTATION = "diagram";

    /** Strings accepted as true as option value */
    public static final List<String> POSITIVE_BOOLEAN_VALUES = newImmutableList("true", "on", "checked");

    /** Strings accepted as false as option value */
    public static final List<String> NEGATIVE_BOOLEAN_VALUES = newImmutableList("false", "off", "unchecked");

    /** The annotation keyword for setting region in collapsed mode */
    public static final String COLLAPSED_ANNOTATION = "collapse";
    
    /** The annotation keyword for setting region in expanded mode */
    public static final String EXPAND_ANNOTATION = "expand";

    /** Mapping synthesis options by their accessible name */
    val nameOptionMap = <String, SynthesisOption>newHashMap;
    /** The previous values of the options set by annotation */
    val restoreOptionMap = <SynthesisOption, Object>newHashMap;
        
    override getPriority() {
        return 100;
    }

    override start(Scope source, KNode node) {
        initializeNameOptionMap();
        // Configure synthesis options via annotation
        source.getAllAnnotations(SYNTHESIS_OPTIONS_ANNOTATION).forEach[processSynthesisOptionAnnotation];
    }
    
    override finish(Scope source, KNode node) {
        // restore previous values
        for (optionValuePair : restoreOptionMap.entrySet) {
            usedContext.configureOption(optionValuePair.key, optionValuePair.value)
        }
    }
    
    override processRegion(Region region, KNode node) {
        if (node.data.filter(KRendering).size > 1) {
            for (anno : region.annotations) {
                if (anno.name.equalsIgnoreCase(COLLAPSED_ANNOTATION)) {
                    node.setLayoutOption(KlighdProperties::EXPAND, false)
                } else if (anno.name.equalsIgnoreCase(EXPAND_ANNOTATION)) {
                    node.setLayoutOption(KlighdProperties::EXPAND, true)
                }
            }
        }
    }

    /** Processes an annotation a sets the specified synthesis option */
    def processSynthesisOptionAnnotation(Annotation annotation) {
        val name = switch (annotation) {
            TypedStringAnnotation: annotation.type.accessableName
            StringAnnotation: annotation.values.head.accessableName
        }
        val value = switch (annotation) {
            TypedStringAnnotation: annotation.values?.head ?: "".toLowerCase
            StringAnnotation: "true"
        }
        if (!name.nullOrEmpty && !value.nullOrEmpty) {
            for (Entry<String, SynthesisOption> entry : nameOptionMap.entrySet) {
                if (entry.key.startsWith(name)) {
                    val option = entry.value
                    restoreOptionMap.put(option, usedContext.getOptionValue(option))
                    setOption(option , value);
                }
            }
        }
    }

    /** Initializes once the map for identifying options by name */
    private def initializeNameOptionMap() {
        if (nameOptionMap.empty) {
            val options = newHashSet();
            options.addAll(usedContext.displayedSynthesisOptions);
            for (SynthesisOption option : options) {
                val name = option.accessableName;
                if (!name.nullOrEmpty) {
                    nameOptionMap.put(name, option);
                }
            }
        }
    }

    /** Returns the accessible name of a synthesis option */
    private def accessableName(SynthesisOption option) {
        if (option.name.nullOrEmpty) {
            return null;
        }
        return option.name.accessableName;
    }

    /** Converts a String into a non-whitespace lower case variant */
    private def accessableName(String text) {
        if (text.nullOrEmpty) {
            return text;
        }
        val name = new StringBuffer(text);
        var int i = 0;
        while (i < name.length) {
            val c = name.charAt(i);
            if (c.isUnicodeIdentifierPart) {
                name.setCharAt(i, c.toLowerCase);
                i++;
            } else {
                name.deleteCharAt(i);
            }
        }
        return name.toString;
    }

    /** Sets the given option to the given value if compatible */
    private def setOption(SynthesisOption option, String value) {
        switch (option) {
            case option.isCheckOption:
                usedContext.configureOption(option, value.parseBoolean)
            case option.isChoiceOption: {
                val newValue = value.parseObject(option.values);
                if (newValue != null) {
                    usedContext.configureOption(option, newValue)
                }
            }
        }
    }

    /** Parses a boolean value from the value string */
    private def parseBoolean(String value) {
        switch (value) {
            case POSITIVE_BOOLEAN_VALUES.contains(value): return true
            case NEGATIVE_BOOLEAN_VALUES.contains(value): return false
            case value.chars.allMatch[isDigit]: return Integer.parseInt(value) != 0
            default: return !value.nullOrEmpty
        }
    }

    /** Parses one of the given values from the value string */
    private def parseObject(String value, List<?> values) {
        return values.filterNull.findFirst [
            toString.toLowerCase.equals(value);
        ]
    }
}