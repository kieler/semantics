/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions

/**
 * @author mka
 *
 */
 @ViewSynthesisShared
class FontSizeHook extends SynthesisHook {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KRenderingExtensions
    
    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.FontSizeHook";
    
    public static final SynthesisOption ADAPTIVE_FONTS = 
        SynthesisOption.createCheckOption("Adaptive Fonts", false)
            .setCategory(GeneralSynthesisOptions::LAYOUT)

    static final int SIMPLE_STATE_FONT_SIZE = 11
    
    static final double SIMPLE_STATE_INCREASE_FACTOR = 0.5

    static final int MACRO_STATE_FONT_SIZE = 11
    
    static final double MACRO_STATE_INCREASE_FACTOR = 1.0

    static final int MAX_FONT_INCREASE = 15


    /** Checks if given state should be visualized as macro state */
    def boolean isMacroState(State state) {
        return state.controlflowRegionsContainStates || state.containsDataflowRegions || !state.actions.empty ||
            !state.declarations.empty || state.isReferencing || state.hasBaseStates;
    }

    /** returns a new font size based on the base size and the number of siblings
     *  crowded (many siblings) layouts get a larger font.
     */
    def int dynamicFont(int baseSize, int siblingCount, double factor) {
        return Math.min((baseSize + factor*(siblingCount - 1)).intValue(), (baseSize + factor*(MAX_FONT_INCREASE)).intValue())
    }

    override getDisplayedSynthesisOptions() {
        return #[ADAPTIVE_FONTS]
    }

    override processState(State state, KNode node) {
        
        if (ADAPTIVE_FONTS.booleanValue && state.parentRegion !== null) {
            
            val macroFont = dynamicFont(MACRO_STATE_FONT_SIZE, state.parentRegion.states.size, MACRO_STATE_INCREASE_FACTOR)
            val simpleFont = dynamicFont(SIMPLE_STATE_FONT_SIZE, state.parentRegion.states.size, SIMPLE_STATE_INCREASE_FACTOR)
            
            if (state.isMacroState) {
                
                node.data.filter(KRendering).map[it.eAllContents.toList].toList.flatten.forEach[
                    if (it instanceof KText) it.fontSize = macroFont
                ]
            } else  if (state.isSimple) {
                
                node.eAllContents.filter(KRendering).toList.forEach[
                    if (it instanceof KText) it.fontSize = simpleFont
                ]
            }
        }
    }
}