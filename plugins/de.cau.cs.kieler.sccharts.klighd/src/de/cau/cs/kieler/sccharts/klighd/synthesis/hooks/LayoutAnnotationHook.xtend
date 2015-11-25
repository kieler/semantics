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

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.Annotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kiml.LayoutMetaDataService
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Evaluates layout option annotations in the model.
 * 
 * @author als
 * @kieler.design 2015-11-24 proposed
 * @kieler.rating 2015-11-24 proposed yellow
 * 
 */
@ViewSynthesisShared
class LayoutAnnotationHook extends SynthesisHook {

    /** This property is set if any element should override HV or VH layout annotation effects */
    private static final IProperty<Boolean> BLOCK_HV_LAYOUT_ANNOTATION = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.layoutannotation.override", false)

    /** Service class for accessing layout options by name */
    private static final LayoutMetaDataService LAYOUT_OPTIONS_SERVICE = LayoutMetaDataService.getInstance();

    // Annotation Keywords
    /** The annotation keyword for setting layout options */
    public static final String LAYOUT_OPTIONS_ANNOTATION = "layout";

    /** The name of the annotation that must be present to activate the specified layout. */
    public static final String HV_ANNOTATION = "HVLayout";

    /** The name of the annotation that must be present to activate the specified layout. */
    public static final String VH_ANNOTATION = "VHLayout";

    @Inject
    extension AnnotationsExtensions

    override processState(State state, KNode node) {
        node.setLayoutOptions(state)
        node.setAlternatingLayout(state)
    }

    override processRegion(Region region, KNode node) {
        node.setLayoutOptions(region)
        node.setAlternatingLayout(region)
    }

    override processTransition(Transition transition, KEdge edge) {
        edge.setLayoutOptions(transition)
    }

    private def setLayoutOptions(KGraphElement element, Annotatable annotatable) {
        for (annotation : annotatable.getTypedAnnotations(LAYOUT_OPTIONS_ANNOTATION)) {
            val data = LAYOUT_OPTIONS_SERVICE.getOptionDataBySuffix(annotation.type ?: "")
            val value = data?.parseValue(annotation.values?.head ?: "".toLowerCase)

            // Set layout option
            if (data != null && value != null) {
                element.setLayoutOption(data.id, value)
                if (data.id == LayoutOptions.DIRECTION.id && element instanceof KNode) {
                    element.setLayoutOption(LayoutAnnotationHook.BLOCK_HV_LAYOUT_ANNOTATION, true);
                }
            }
        }
    }

    private def setAlternatingLayout(KNode node, Scope scope) {
        val annotation = scope.annotations.findLast[isAlternatingLayoutAnnotation]
        if (annotation != null) {
            val isHV = annotation.name.equals(HV_ANNOTATION)
            val workingset = newLinkedHashMap(new Pair(scope, new Pair(node, 0)))
            while (!workingset.empty) {
                val key = workingset.keySet.head
                val elementDepthPair = workingset.remove(key)
                val element = elementDepthPair.key
                val depth = elementDepthPair.value

                // Set alternating layout
                if (key instanceof ControlflowRegion && !element.blockHVLayout) {
                    if (Boolean.logicalXor(isHV,(depth % 2 == 0))) {
                        element.setLayoutOption(LayoutOptions.DIRECTION, Direction.DOWN)
                    } else {
                        element.setLayoutOption(LayoutOptions.DIRECTION, Direction.RIGHT)
                    }
                }

                // Increase depth only after regions because state have no layouted children
                val subDepth = if(key instanceof State) depth else depth + 1
                // Add child elements to processing queue
                for (subScope : key.eContents.filter(Scope)) {
                    val subElement = element.children.findFirst[isAssociatedWith(subScope)];
                    if (subElement != null && !subScope.annotations.exists[isAlternatingLayoutAnnotation]) {
                        workingset.put(subScope, new Pair(subElement, subDepth))
                    }
                }
            }
        }
    }

    private def isAlternatingLayoutAnnotation(Annotation annotation) {
        if (annotation.name.nullOrEmpty) {
            return false
        } else {
            return annotation.name.equals(HV_ANNOTATION) || annotation.name.equals(VH_ANNOTATION)
        }
    }

    private def blockHVLayout(KNode node) {
        val data = node.getData(KLayoutData)
        if (data != null) {
            return data.getProperty(BLOCK_HV_LAYOUT_ANNOTATION);
        }
        return BLOCK_HV_LAYOUT_ANNOTATION.^default;
    }

}