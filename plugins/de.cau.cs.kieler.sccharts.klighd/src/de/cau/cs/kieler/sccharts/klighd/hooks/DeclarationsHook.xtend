/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.klighd.SCChartsSynthesisActionHook
import de.cau.cs.kieler.sccharts.klighd.styles.ControlflowRegionStyles
import de.cau.cs.kieler.sccharts.klighd.styles.StateStyles

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/**
 * Shows or hides state declarations.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class DeclarationsHook extends SCChartsSynthesisActionHook {

    @Inject
    extension StateStyles

    @Inject
    extension SCChartsExtension

    @Inject
    extension KRenderingExtensions
    extension KRenderingFactory = KRenderingFactory::eINSTANCE

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.hooks.DeclarationsHook";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_DECLARATIONS = SynthesisOption.createCheckOption("Declarations", true).
        setUpdateAction(DeclarationsHook.ID); // Add this action as updater
    /** Property to save position of the container */
    private static final IProperty<Integer> INDEX = new Property<Integer>(
        "de.cau.cs.kieler.sccharts.klighd.hooks.declarations.index", 0);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_DECLARATIONS)
    }

    override postState(State state, KNode node) {
        if (!state.declarations.empty && !SHOW_DECLARATIONS.booleanValue) {
            val container = node.contentContainer;
            val declarations = container?.getProperty(StateStyles.DECLARATIONS_CONTAINER);
            if (declarations != null) {
                val idx = container.children.indexOf(declarations)
                declarations.setProperty(INDEX, idx);
                container.children.remove(declarations);
                container.addInvisiblePlaceholder(idx);
            }
        }
    }

    override postRegion(Region region, KNode node) {
        if (region instanceof ControlflowRegion && !region.declarations.empty && !SHOW_DECLARATIONS.booleanValue) {
            val parent = node.regionExtendedContainer
            val declarations = parent?.getProperty(ControlflowRegionStyles.DECLARATIONS_CONTAINER);
            val container = parent?.children?.filter(KContainerRendering)?.head;
            if (declarations != null && container != null) {
                val idx = container.children.indexOf(declarations)
                declarations.setProperty(INDEX, idx);
                container.children.remove(declarations);
                container.addInvisiblePlaceholder(idx);
            }
        }
    }

    override executeAction(KNode rootNode) {
        for (KNode node : rootNode.eAllContentsOfType(KNode).toIterable) {
            if (usedContext.getSourceElement(node) instanceof Scope) {
                val scope = usedContext.getSourceElement(node) as Scope;
                if (!scope.declarations.empty) {
                    var KContainerRendering container;
                    var KContainerRendering declarations;
                    var innerContent = false;
                    if (scope instanceof ControlflowRegion) {
                        innerContent = !(scope as ControlflowRegion).states.nullOrEmpty
                        val parent = node.regionExtendedContainer
                        container = parent?.children?.filter(KContainerRendering)?.head;
                        declarations = parent?.getProperty(ControlflowRegionStyles.DECLARATIONS_CONTAINER)
                    } else if (scope instanceof State) {
                        val state = scope as State;
                        innerContent = state.hasInnerStatesOrControlflowRegions || state.hasDataflowRegions;
                        container = node.contentContainer;
                        declarations = container?.getProperty(StateStyles.DECLARATIONS_CONTAINER);
                    }
                    if (declarations != null) {
                        if (SHOW_DECLARATIONS.booleanValue && !scope.declarations.empty) {
                            // Insert actions in correct position
                            val pos = declarations.getProperty(INDEX);
                            container.children.remove(pos);
                            container.children.add(pos, declarations);
                        } else {
                            val idx = container.children.indexOf(declarations)
                            declarations.setProperty(INDEX, idx);
                            container.children.remove(declarations);
                            container.addInvisiblePlaceholder(idx);
                        }
                    }
                }
            }
        }
        return ActionResult.createResult(true).dontAnimateLayout;
    }

    private def getRegionExtendedContainer(KNode node) {
        return node.data.filter(KContainerRendering).filter [
            getProperty(KlighdProperties.EXPANDED_RENDERING)
        ].head;
    }

    private def addInvisiblePlaceholder(KContainerRendering container, int index) {
        val rendering = createKRectangle() => [
            invisible = true;
        ]
        container.children.add(index, rendering);
    }
}