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
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.sccharts.ControlflowRegion
import java.util.List

import static extension de.cau.cs.kieler.klighd.microlayout.PlacementUtil.*

/**
 * Styles for {@link ControlflowRegion}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class ControlflowRegionStyles {

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KColorExtensions

    @Inject
    extension StateStyles

    /** This property is set on the expanded rendering and points to the container holding the declaration labels */
    public static final IProperty<KContainerRendering> DECLARATIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.style.region.declarations", null);

    /**
     * Adds a region figure.
     */
    def KRectangle addRegionFigure(KNode node) {
        node.addRectangle() => [
            background = "white".color;
            foreground = "gray".color
            lineWidth = 1;
            setSurroundingSpace(2, 0);
        ]
    }

    /**
     * Adds a button with text.
     */
    def KText addButton(KContainerRendering container, String text) {
        container.addText(text) => [
            foreground = "dimGray".color;
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
}