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
import de.cau.cs.kieler.kico.klighd.model.action.OpenCodeInEditorAction
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.LinkedList
import java.util.StringTokenizer
import javax.inject.Inject

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Diagram synthesis of a KiCoModelChain.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 *
 */
class KiCoCodePlaceHolderSynthesis extends AbstractDiagramSynthesis<KiCoCodePlaceHolder> {

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
    val int maxPreviewLines = 50;

    // -------------------------------------------------------------------------
    // The Main entry transform function
    override KNode transform(KiCoCodePlaceHolder code) {
        val rootNode = createNode();
        rootNode.children += createNode(code) => [
            it.associateWith(code);
            it.addRoundedRectangle(8, 8) => [
                it.addDoubleClickAction(OpenCodeInEditorAction.ID);
                it.setGridPlacement(1);
                
                //title
                it.addText("CODE") => [                
                    it.fontSize = 11;
                    it.setFontBold = true;
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.suppressSelectability;
                ]
                
                //open option
                it.addText("[Open in Editor]") => [
                    it.fontSize = 10;
                    it.foreground = "blue".color
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.addSingleClickAction(OpenCodeInEditorAction.ID);
                    it.addDoubleClickAction(OpenCodeInEditorAction.ID);
                ]
                
                //separator
                it.addHorizontalSeperatorLine(1, 0);
                
                //preprocess code to compress
                val tokenizer = new StringTokenizer(code.code, "\n");
                val previewLines = new LinkedList<String>();
                previewLines.add("");
                while (previewLines.size < maxPreviewLines && tokenizer.hasMoreTokens) {
                    val line = tokenizer.nextToken;

                    //skip multiple empty lines
                    if (!line.trim.empty || !previewLines.getLast().trim.empty) {
                        previewLines.add(line);
                    }
                }
                
                //rebuild to single string
                val preview = new StringBuilder();
                previewLines.forEach[preview.append(it).append("\n")];
                
                //add continue sign
                if (tokenizer.hasMoreTokens) {
                    preview.append("...")
                }
                
                //code preview
                it.addText(preview.toString()) => [
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
}
