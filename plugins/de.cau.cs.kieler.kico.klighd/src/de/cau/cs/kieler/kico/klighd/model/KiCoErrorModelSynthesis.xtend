/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.model

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kico.klighd.model.action.ErrorShowExceptionAction
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import javax.inject.Inject

/**
 * Diagram synthesis of a KiCoModelChain.
 * 
 * @author als
 *
 */
class KiCoErrorModelSynthesis extends AbstractDiagramSynthesis<KiCoErrorModel> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KPortExtensions

    @Inject
    extension KLabelExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KColorExtensions

    // -------------------------------------------------------------------------
    // The Main entry transform function
    override KNode transform(KiCoErrorModel errorModel) {
        val rootNode = createNode();
        rootNode.children += createNode(errorModel) => [
            it.addRectangle() => [
                it.invisible = true;
                it.setGridPlacement(1);
                //upper part is sign
                it.addRectangle => [
                    it.invisible = true;
                    //add image of sign with size 250x250
                    it.setGridPlacementData(250, 250);
                    it.addImage("de.cau.cs.kieler.kico.klighd", "icons/KiCoErrorModelSign.png").addRectangularClip.
                        setPointPlacementData(LEFT, 0, 0, TOP, 0, 0, H_CENTRAL, V_CENTRAL, 0, 0, 500, 500);
                ]
                //lower part is message
                it.addRoundedRectangle(7, 7) => [
                    it.setGridPlacement(1);
                    //title
                    it.addText("ERROR") => [
                        it.fontSize = 12;
                        it.setFontBold = true;
                        it.foreground = "red".color;
                        it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                        it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
                    ]
                    //message
                    it.addText(errorModel.message) => [
                        it.fontSize = 12;
                        it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                        it.setProperty(KlighdProperties::KLIGHD_SELECTION_UNPICKABLE, true);
                    ]
                    //link to exception if available
                    if (errorModel.exception != null) {
                        it.addText("[Show Exception]") => [
                            it.foreground = "blue".color
                            it.fontSize = 9
                            it.addSingleClickAction(ErrorShowExceptionAction.ID);
                            it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                        ]
                    }
                ]
            ]
        ]
        return rootNode;
    }
}
