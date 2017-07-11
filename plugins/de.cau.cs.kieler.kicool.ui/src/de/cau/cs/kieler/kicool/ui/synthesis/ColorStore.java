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
 */
package de.cau.cs.kieler.kicool.ui.synthesis;

import java.util.HashMap;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;

/**
 * The KiCool colors.
 * 
 * @author ssm
 * @kieler.design 2015-10-27 proposed
 * @kieler.rating 2015-10-27 proposed yellow
 */
@ViewSynthesisShared
public class ColorStore {

    public enum Color {
        PROCESSORGROUP_FOREGROUND(Colors.BLACK),
        PROCESSORGROUP_BACKGROUND(Colors.WHITE),
        
        KEYWORD(115, 0, 65),
        
        BUSY_FOREGROUND(200, 200, 200),
        BUSY_BACKGROUND(255, 222, 222),
        BUSY_BACKGROUND_TARGET(177, 177, 177),        

        OK_FOREGROUND(0, 255, 0),
        OK_BACKGROUND(0, 255, 0),
        OK_BACKGROUND_TARGET(0, 128, 0),
        
        WARNING_FOREGROUND(200, 200, 0),
        WARNING_BACKGROUND(255, 255, 170),
        WARNING_BACKGROUND_TARGET(222, 222, 0),
        
        ERROR_FOREGROUND(200, 0, 0),
        ERROR_BACKGROUND(255, 177, 177),
        ERROR_BACKGROUND_TARGET(222, 120, 120),      
        
        PROGRESSBAR_FOREGROUND(200, 200, 200),
        PROGRESSBAR_BACKGROUND(120, 120, 200),
        
        ACTIVE_ENVIRONMENT(0, 0, 0),
        INACTIVE_ENVIRONMENT(160, 160, 160);

        private final KColor color = KRenderingFactory.eINSTANCE.createKColor();

        private Color(final int red, final int green, final int blue) {
            color.setRed(red);
            color.setGreen(green);
            color.setBlue(blue);
        }
        
        private Color(final Colors color) {
            this.color.setColor(color);
        }

        private KColor getColor() {
            return color;
        }
        
    };

    public static KColor getColor(Color color) {
        return EcoreUtil.copy(color.getColor());
    }
}
