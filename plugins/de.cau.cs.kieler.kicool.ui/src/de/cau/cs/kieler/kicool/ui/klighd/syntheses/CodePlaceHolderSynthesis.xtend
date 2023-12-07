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
package de.cau.cs.kieler.kicool.ui.klighd.syntheses

import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.kicool.ide.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.kicool.ui.klighd.actions.OpenCodeInEditorAction
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import com.google.inject.Inject

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
    extension KRenderingExtensions

    @Inject
    extension KContainerRenderingExtensions

    @Inject
    extension KColorExtensions

    // -------------------------------------------------------------------------
    // Constants
    
    public static val SynthesisOption MAX_PREVIEW_LINES = SynthesisOption::createRangeOption(CodePlaceHolderSynthesis, "Preview Lines", 0, 500, 5, 50)
    public static val SynthesisOption WRAP_LINES = SynthesisOption::createRangeOption(CodePlaceHolderSynthesis, "Wrap Lines", 25, 300, 5, 100)
    
    public static val String ID = "de.cau.cs.kieler.kicool.ui.klighd.syntheses.CodePlaceHolderSynthesis";
    static val tabSpaces = "  ";

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(CodePlaceHolder placeholder) {
        val startTime = System.currentTimeMillis
        val rootNode = createNode();
        rootNode.children += createNode(placeholder) => [
            it.associateWith(placeholder);
            //outer frame
            it.addRoundedRectangle(8, 8) => [
                it.addDoubleClickAction(OpenCodeInEditorAction.ID);
                it.setGridPlacement(1);

                // title
                val titleText = if (placeholder.name.nullOrEmpty) placeholder.typeLabel else placeholder.typeLabel + " - " + placeholder.name
                it.addText(titleText) => [
                    it.fontSize = 11;
                    it.fontBold = true;
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
        ]
                
        // Report elapsed time
        usedContext?.setProperty(KiCoDiagramViewProperties.SYNTHESIS_TIME, System.currentTimeMillis - startTime)
        
        return rootNode;
    }
    
    def generatePreview(String text){
        val StringBuffer preview = new StringBuffer(text);
        val wrapAt = Math.max(WRAP_LINES.intValue, 10)
        var start = 0;
        var index = 0;
        var newIndex = 0;
        var count = 0;
                
        // Find nth occurrence of newline. With n <= maxPreviewLines or indexOf(nth occurrence) == length
        while((index = preview.indexOf("\n", start)) != -1 && count < MAX_PREVIEW_LINES.intValue) {
            var continue = index + 1
            // wrap text
            if (index - start > wrapAt) {
                for (i : 1..((index - start) / wrapAt)) {
                    preview.insert(start + i * wrapAt + (i - 1) * 2, "\u23CE\n")
                    continue += 2
                }
            }
            start = continue;
            count += 1;
        }
        // If original is longer than maxPreviewLines
        if(count == MAX_PREVIEW_LINES.intValue) {
            preview.setLength(index + 1);
            preview.append("\n...");
        }
        // Replace tabs with spaces
        var nextTab = preview.indexOf("\t")
        while (nextTab > -1) {
            preview.replace(nextTab, nextTab+1, tabSpaces)
            nextTab = preview.indexOf("\t")
        }
        return preview.toString();
    }
}
