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
package de.cau.cs.kieler.kico.klighd.view.model

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Diagram synthesis of a {@link EcoreModelWrapper}.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
class EcoreModelSynthesis extends AbstractDiagramSynthesis<EcoreModelWrapper> {

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
    // Constants
    public static val String ID = "de.cau.cs.kieler.kico.klighd.view.model.EcoreModelSynthesis";
    private static val KColor BG_COLOR = RENDERING_FACTORY.createKColor() => [red = 255; green = 202; blue = 119];
    private static val KColor SHADOW_COLOR = RENDERING_FACTORY.createKColor() => [it.color = Colors.BLACK];

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(EcoreModelWrapper wrapper) {
        val model = wrapper.model;
        val rootNode = createNode(wrapper);
        rootNode.children += model.translateEObject
        rootNode.children += model.eAllContents.map [
            val child = it.translateEObject;
            val container = it.eContainer;
            if (container != null) {
                createEdge => [
                    it.source = container.translateEObject;
                    it.target = child;
                    it.addPolyline.addArrowDecorator;
                ]
            }
            return child;
        ].toIterable;

        return rootNode;
    }

    private def create node : object.createNode translateEObject(EObject object) {
        node.associateWith(object);

        // create and add colored rectangle for this node
        val figure = node.createFigure;
        figure.background = Colors.GRAY_95;

        // align all text fields in a column.
        figure.setGridPlacement(1);

        // add name of object as text
        figure.addText(object.eClass.name).associateWith(object) => [
            it.fontSize = 11;
            it.setFontBold(true);
            it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
            it.suppressSelectability;
        ];

        // add all attributes as string representation
        object.eClass.EAllAttributes.filterNull.forEach [
            // add a text with name and value of the attribute
            figure.addText(it.name + ": " + String::valueOf(object.eGet(it))) => [
                it.fontSize = 9;
                it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                it.suppressSelectability;
            ];
        ]
    }

    private def createFigure(KNode node) {
        val figure = node.addRoundedRectangle(8, 8, 1);
        figure.lineWidth = 1;
        figure.foreground = Colors.GRAY;
        figure.background = BG_COLOR;

        // add shadow
        figure.shadow = SHADOW_COLOR.copy;
        figure.shadow.XOffset = 4;
        figure.shadow.YOffset = 4;

        // minimal node size is necessary if no text will be added
        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
        return figure;
    }
}
