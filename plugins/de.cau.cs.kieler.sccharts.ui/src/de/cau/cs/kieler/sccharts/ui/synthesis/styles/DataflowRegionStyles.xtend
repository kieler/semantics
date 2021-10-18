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
package de.cau.cs.kieler.sccharts.ui.synthesis.styles

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Styles for {@link DataflowRegion}.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class DataflowRegionStyles extends ControlflowRegionStyles {

    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension StateStyles
    @Inject extension ColorStore
    @Inject extension KColorExtensions


    def KRectangle addRegionStyle(KRectangle rect, String style) {
        switch(style) {
            case 'entry': {
                return rect => [
//                    foreground = REGION_FOREGROUND.color
//                    setBackgroundGradient('#fff'.color, '#cfc'.color, 0);
                    lineWidth = 3f;
                ]
            }
            case 'during': {
                return rect => [
//                    foreground = REGION_FOREGROUND.color
//                    background = '#ffc'.color
//                    setBackgroundGradient('#cfc'.color, '#fcc'.color, 0);
//                    lineWidth = 1.3f;
                ]
            }
            case 'exit': {
//                return rect => [
//                    foreground = REGION_FOREGROUND.color
//                    setBackgroundGradient('#fff'.color, '#fcc'.color, 180);
//                    lineWidth = 1.3f;
//                ]
                return rect.addRectangle => [
                    background = rect.background.copy
                    foreground = rect.foreground.copy
                    lineWidth = rect.lineWidthValue;
                    setSurroundingSpace(3, 0);
                ]                
            }
            default: return rect
        }
    }
}