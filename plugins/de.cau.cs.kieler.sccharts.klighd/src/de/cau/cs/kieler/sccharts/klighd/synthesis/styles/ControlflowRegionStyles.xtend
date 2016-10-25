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
package de.cau.cs.kieler.sccharts.klighd.synthesis.styles

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import java.util.List
import org.eclipse.elk.graph.KNode
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ColorStore.Color.*

import static extension de.cau.cs.kieler.klighd.microlayout.PlacementUtil.*

/**
 * Styles for {@link ControlflowRegion}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class ControlflowRegionStyles {

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension StateStyles
    
    @Inject
    extension ColorStore

    /** This property is set on the expanded rendering and points to the container holding the declaration labels */
    public static final IProperty<KContainerRendering> DECLARATIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.style.region.declarations", null);

    /**
     * Adds a region figure.
     */
    def KRectangle addRegionFigure(KNode node) {
        node.addRectangle() => [
            background = REGION_BACKGROUND.color;
            foreground = REGION_FOREGROND.color;
            lineWidth = 1;
            setSurroundingSpace(2, 0);
        ]
    }

    /**
     * Adds a button with text.
     */
    def KText addButton(KContainerRendering container, String text) {
        container.addText(text) => [
            foreground = REGION_BUTTON.color;
            fontSize = 10;
            val size = estimateTextSize;
            setPointPlacementData(LEFT, 3, 0, TOP, 1, 0, H_LEFT, V_TOP, 8, 8, size.width, size.height);
        ]
    }

    /**
     * Adds an area for inner states.<br>
     * Incompatible with {@link addStatesAndDeclarationsArea}.
     */
    def addStatesArea(KContainerRendering container, boolean useHeaderSpace) {
        container.addChildArea() => [
            if (useHeaderSpace) {
                setAreaPlacementData().from(LEFT, -2, 0, TOP, -2, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
            } else {
                setAreaPlacementData().from(LEFT, -2, 0, TOP, 8, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
            }
        ]
    }

    /**
     * Adds an area for inner states and a container for declarations.<br>
     * Incompatible with {@link addStatesArea}.
     */
    def addStatesAndDeclarationsArea(KContainerRendering container) {
        container.addRectangle() => [
            invisible = true;
            setGridPlacement(1);
            // Declarations Area
            val declarationsArea = addRectangle => [
                invisible = true;
                setGridPlacement(1);
                setGridPlacementData().from(LEFT, 3, 0, TOP, 16, 0).to(RIGHT, 8, 0, BOTTOM, 0, 0);
            ]
            container.setProperty(DECLARATIONS_CONTAINER, declarationsArea);
            // States Area
            addChildArea().setGridPlacementData().from(LEFT, -2, 0, TOP, -8, 0).to(RIGHT, -2, 0, BOTTOM, 3, 0);
        ]
    }

    /**
     * Adds a label in declaration style with the given components.<br>
     * The first part will be highlighted as keywords.
     */
    def KRectangle addDeclarationLabel(KContainerRendering container, Pair<List<String>, List<String>> components) {
        container.getProperty(DECLARATIONS_CONTAINER)?.addKeywordLabel(components);
    }
    
    /** 
     * Retrieves the extended container for the region.
     */
    def getRegionExtendedContainer(KNode node) {
        return node.data.filter(KContainerRendering).filter [
            getProperty(KlighdProperties.EXPANDED_RENDERING)
        ].head;
    }
}