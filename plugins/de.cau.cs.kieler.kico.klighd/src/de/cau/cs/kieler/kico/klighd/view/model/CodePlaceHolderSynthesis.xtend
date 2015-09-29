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
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view.model

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kico.klighd.view.model.action.OpenCodeInEditorAction
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import javax.inject.Inject

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Diagram synthesis for a {@link CodePlaceHolder}.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
class CodePlaceHolderSynthesis extends AbstractDiagramSynthesis<CodePlaceHolder> {

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
    
    public static val String ID = "de.cau.cs.kieler.kico.klighd.view.model.CodePlaceHolderSynthesis";
    static val int maxPreviewLines = 50;

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(CodePlaceHolder placeholder) {
        val rootNode = createNode();
        rootNode.children += createNode(placeholder) => [
            it.associateWith(placeholder);
            //outer frame
            it.addRoundedRectangle(8, 8) => [
                it.addDoubleClickAction(OpenCodeInEditorAction.ID);
                it.setGridPlacement(1);

                // title
                it.addText("CODE") => [
                    it.fontSize = 11;
                    it.setFontBold = true;
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.suppressSelectability;
                ]

                // open in editor button
                it.addText("[Open in Editor]") => [
                    it.fontSize = 10;
                    it.foreground = "blue".color
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.addSingleClickAction(OpenCodeInEditorAction.ID);
                    it.addDoubleClickAction(OpenCodeInEditorAction.ID);
                ]

                // separator
                it.addHorizontalSeperatorLine(1, 0);

                // code preview
                it.addText(placeholder.code.generatePreview) => [
                    it.fontSize = 8;
                    it.fontName = KlighdConstants.DEFAULT_MONOSPACE_FONT_NAME;
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.suppressSelectability;
                    it.addDoubleClickAction(OpenCodeInEditorAction.ID);
                ]
            ]
        ];
        return rootNode;
    }
    
    def generatePreview(String text){
        val StringBuffer preview = new StringBuffer(text);
        var start = 0;
        var index = 0;
        var count = 0;
        // Find nth occurrence of newline. With n <= maxPreviewLines or indexOf(nth occurrence) == length
        while((index = preview.indexOf("\n", start)) != -1 && count < maxPreviewLines){
            start = index + 1;
            count += 1;
        }
        // If original is longer than maxPreviewLines
        if(count == maxPreviewLines){
            preview.setLength(index + 1);
            preview.append("\n...");
        }
        
        return preview.toString();
    }
}
