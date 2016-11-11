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
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook
import org.eclipse.elk.core.data.LayoutMetaDataService
import org.eclipse.elk.core.klayoutdata.KLayoutData
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.graph.KEdge
import org.eclipse.elk.graph.KGraphElement
import org.eclipse.elk.graph.KNode
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import org.eclipse.elk.core.options.CoreOptions

/**
 * Sets the default layout on the diagram and evaluates layout option annotations in the model.
 * 
 * @author als
 * @kieler.design 2015-11-24 proposed
 * @kieler.rating 2015-11-24 proposed yellow
 * 
 */
@ViewSynthesisShared
class LayoutHook extends SynthesisHook {

    /** This property is set if any element should override HV or VH layout annotation effects */
    private static final IProperty<Boolean> BLOCK_ALTERNATIN_LAYOUT = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.layout.override", false)

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

    @Inject
    extension SCChartsExtension

    /** The depth of map of the sccharts scopes in the model */
    private val depthMap = <Scope, Integer>newHashMap
    private var Direction golbalDirection = null;

    override start(Scope scope, KNode node) {
        depthMap.put(scope, if(scope instanceof State) 0 else -1)
        // Calculated depths
        scope.allScopes.filter[it != scope].forEach [
            val parentDepth = depthMap.get(it.eContainer) ?: 0
            // Increase depth only after regions because state have no layouted children
            val depth = if(it instanceof State) parentDepth + 1 else parentDepth
            depthMap.put(it, depth)
        ]
        // Find global direction annotation
        for (annotation : scope.getTypedAnnotations(LAYOUT_OPTIONS_ANNOTATION)) {
            val data = LAYOUT_OPTIONS_SERVICE.getOptionDataBySuffix(annotation.type ?: "")
            if (data != null && data.id == CoreOptions.DIRECTION.id) {
                golbalDirection = data.parseValue(annotation.values?.head ?: "".toLowerCase) as Direction
            }
        }
    }

    override processState(State state, KNode node) {
        // No default layout direction for states because of the box layout
        // HV/VH Layout via annotation
        node.processAlternatingLayoutAnnotation(state)
        // Layout options
        node.processLayoutOptionAnnotations(state)
    }

    override processRegion(Region region, KNode node) {
        // Default layout direction for controlflow region
        if (region instanceof ControlflowRegion) {
            if (golbalDirection != null) {
                node.setLayoutOption(CoreOptions.DIRECTION, golbalDirection)
            } else { // Alternating
                node.setDepthDirection(region, true, 0)
            }
        }
        // HV/VH Layout via annotation
        node.processAlternatingLayoutAnnotation(region)
        // Layout options
        node.processLayoutOptionAnnotations(region)
    }

    override processTransition(Transition transition, KEdge edge) {
        edge.processLayoutOptionAnnotations(transition)
    }

    private def processLayoutOptionAnnotations(KGraphElement element, Annotatable annotatable) {
        for (annotation : annotatable.getTypedAnnotations(LAYOUT_OPTIONS_ANNOTATION)) {
            val data = LAYOUT_OPTIONS_SERVICE.getOptionDataBySuffix(annotation.type ?: "")
            val value = data?.parseValue(annotation.values?.head ?: "".toLowerCase)

            // Set layout option
            if (data != null && value != null) {
                element.setLayoutOption(data.id, value)
                if (data.id == CoreOptions.DIRECTION.id && element instanceof KNode) {
                    element.setLayoutOption(BLOCK_ALTERNATIN_LAYOUT, true);
                }
            }
        }
    }

    private def processAlternatingLayoutAnnotation(KNode node, Scope scope) {
        val annotation = scope.annotations.findLast[isAlternatingLayoutAnnotation]
        if (annotation != null) {
            val isHV = annotation.name.equalsIgnoreCase(HV_ANNOTATION)
            val offset = depthMap.get(scope)
            val workingset = newLinkedHashMap(new Pair(scope, node))
            while (!workingset.empty) {
                val subScope = workingset.keySet.head
                val subNode = workingset.remove(subScope)

                if (subScope instanceof ControlflowRegion) {
                    subNode.setDepthDirection(subScope, isHV, offset)
                }

                // Add child elements to processing queue
                for (nextScope : subScope.eContents.filter(Scope)) {
                    val nextElement = subNode.children.findFirst[isAssociatedWith(nextScope)];
                    if (nextElement != null && !nextScope.annotations.exists[isAlternatingLayoutAnnotation]) {
                        workingset.put(nextScope, nextElement)
                    }
                }
            }
        }
    }

    private def isAlternatingLayoutAnnotation(Annotation annotation) {
        if (annotation.name.nullOrEmpty) {
            return false
        } else {
            return annotation.name.equalsIgnoreCase(HV_ANNOTATION) || annotation.name.equalsIgnoreCase(VH_ANNOTATION)
        }
    }

    private def isBlockingAlternatingLayout(KNode node) {
        val data = node.getData(KLayoutData)
        if (data != null) {
            return data.getProperty(BLOCK_ALTERNATIN_LAYOUT);
        }
        return BLOCK_ALTERNATIN_LAYOUT.^default;
    }

    private def setDepthDirection(KNode node, Scope scope, boolean isHV, int depthOffset) {
        if (!node.isBlockingAlternatingLayout) {
            val depth = (depthMap.get(scope) ?: 0) - depthOffset
            if (Boolean.logicalXor(isHV,(depth % 2 == 0))) {
                node.setLayoutOption(CoreOptions.DIRECTION, Direction.DOWN)
            } else {
                node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
            }
        }
    }
}