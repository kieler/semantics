/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.colors;

import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;

/**
 * @author als
 */
public class ColorUtil {
    
    private final static KRenderingFactory FACTORY = KRenderingFactory.eINSTANCE;
    
    /**
     * Adjusts the brightness of the given color.
     */
    public static KColor adjustBrightness(KColor color, float adjustment) {
        var HSB = java.awt.Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        HSB[2] += adjustment;
        HSB[2] = Math.max(0, Math.min(1, HSB[2]));
        var RGB = java.awt.Color.getHSBColor(HSB[0],HSB[1],HSB[2]);
        
        var newColor = FACTORY.createKColor();
        newColor.setRed(RGB.getRed());
        newColor.setGreen(RGB.getGreen());
        newColor.setBlue(RGB.getBlue());
        
        return newColor;
    }
}
