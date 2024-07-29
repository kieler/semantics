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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KColoring
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.StateSynthesis
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles

import static de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore.Color.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.copy

/**
 * Applies paper color theme.
 *  
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class BlackWhiteModeHook extends SynthesisHook {

    @Inject
    extension KRenderingExtensions

    @Inject
    extension ColorStore
    
    @Inject
    extension StateStyles
    
    @Inject
    extension StateSynthesis

    /** The related synthesis option */
    public static final SynthesisOption PAPER_BW = SynthesisOption.createCheckOption(BlackWhiteModeHook, "Paper Mode (Black/White)", false).
    	setCategory(GeneralSynthesisOptions::APPEARANCE);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(PAPER_BW);
    }

    override start(Scope scope, KNode root) {
        if (PAPER_BW.booleanValue) {
            configureColor(TRANSITION_DEFERRED_DECORATOR, Colors.GRAY);
            configureColor(TRANSITION_ABORT_DECORATOR, Colors.GRAY);
            configureColor(TRANSITION_TERMINATION_DECORATOR, Colors.GRAY);
            
            configureColor(STATE_FOREGROND, Colors.BLACK);
            configureColor(STATE_BACKGROUND_GRADIENT_1, Colors.GRAY_95);
            configureColor(STATE_BACKGROUND_GRADIENT_2, Colors.GRAY_95);
            configureColor(STATE_REFERENCED_BACKGROUND_GRADIENT_1, Colors.GRAY_97);
            configureColor(STATE_REFERENCED_BACKGROUND_GRADIENT_2, Colors.GRAY_97);

            configureColor(KEYWORD, Colors.DIM_GRAY);
            
            baseLineWidth = 2;
        }
    }

    override processState(State state, KNode node) {
        if (PAPER_BW.booleanValue) {
            val container = node.getKContainerRendering;
            container.styles.remove(container.shadow);
            if (!state.isMacroState) {
                if (state.final) {
                    node.contentContainer.background = Colors.WHITE;
                } else {
                    container.background = Colors.WHITE;
                }
            }
        }
    }
    
    override processRegion(Region region, KNode node) {
        if (PAPER_BW.booleanValue) {
            if (region instanceof DataflowRegion) {
                for (color : node.eAllContents.filter(KColoring).toIterable) {
                    color.color.convertToGray
                    if (color.targetColor !== null) {
                        color.targetColor = color.color.copy
                        color.targetColor2 = color.color.copy
                    }
                }
            }
        }
    }
    
    private def void convertToGray(KColor c) {
        if (c.red != c.green || c.green != c.blue || c.red != c.blue) {
            // Normalize and gamma correct:
            var r = Math.pow(c.red / 255.0, 2.2);
            var g = Math.pow(c.green / 255.0, 2.2);
            var b = Math.pow(c.blue / 255.0, 2.2);
    
            // Calculate luminance:
            var lum = 0.2126 * r + 0.7152 * g + 0.0722 * b;
    
            // Gamma compound and rescale to byte range:
            var gray = (255.0 * Math.pow(lum, 1.0 / 2.2)) as int;
            
            // Set color
            c.red = gray
            c.green = gray
            c.blue = gray
        }
    }

}