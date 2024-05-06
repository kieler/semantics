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
package de.cau.cs.kieler.scg.klighd;

import de.cau.cs.kieler.kicool.ui.synthesis.colors.AbstractColorStore;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.util.ColorPreferences;

/**
 * The SCG colors.
 * 
 * @author als
 */
@ViewSynthesisShared
public class ColorStore extends AbstractColorStore {

    public enum Color implements IColor {
        NODE_FOREGROUND(Colors.BLACK),
        NODE_BACKGROUND(Colors.WHITE),
        NODE_TEXT(Colors.BLACK),
        NODE_SHADOW(Colors.BLACK),
        NODE_REFERENCED_BACKGROUND_GRADIENT_1(0xfc, 0xf7, 0xfc),
        NODE_REFERENCED_BACKGROUND_GRADIENT_2(0xe6, 0xcb, 0xf2),
        
        THREAD_LABEL(Colors.BLACK),
        THREAD_BACKGROUND(205, 220, 243),
        
        COMMENT_FOREGROND(0xf0, 0xf0, 0x24),
        COMMENT_FOREGROND_TRANSITION(0x00, 0x00, 0x00),
        COMMENT_BACKGROUND_GRADIENT_1(0xff, 0xff, 0xcc),
        COMMENT_BACKGROUND_GRADIENT_2(0xff, 0xf9, 0xba),
        COMMENT_TEXT(0, 0, 0),
        COMMENT_EDGE(0xf0, 0xf0, 0x24),
        
        USER_SCHEDULE_COLOR(0x28, 0x99, 0x7E),
        
        CONTROLFLOW_EDGE(0, 0, 0),
        DEPENDENCY_ABSWRITEREAD(0, 192, 0),
        DEPENDENCY_RELWRITEREAD(0, 192, 192),
        DEPENDENCY_ABSWRITERELWRITE(0, 0, 255),
        DEPENDENCY_ABSWRITEABSWRITE(255, 0, 0),
        DEPENDENCY_CONTROL(0, 192, 192),
        DEPENDENCY_EXPRESSION(168, 128, 96),
        DEPENDENCY_GUARD(240, 128, 128),
        DEPENDENCY_TICKBOUNDARY(128, 128, 128),
        
        SCHIZO_COLOR(245, 96, 33),
        STRONGLY_CONNECTED_COMPONENT_COLOR(180, 50, 180),
        NODE_PRIORITY_COLOR(255, 30, 30),
        OPT_PRIORITY_COLOR(30, 30, 255),
        PASSIVE_REGION_COLOR(255, 101, 127),
        BASICBLOCK_BORDER(248, 0, 253),
        SCHEDULINGBLOCK_BORDER(128, 0, 243),
        SCHEDULE_BORDER(0, 0, 128),
        SCHEDULING_DEADCODE(128, 128, 128),
        SCHEDULING_SCHEDULING_EDGE(128, 0, 253),
        PROBLEM_COLOR(255, 0, 0);

        /** the default color */
        private final KColor defaultColor = KRenderingFactory.eINSTANCE.createKColor();

        /**
         * Hidden constructor.
         * 
         * @param red
         *            the red component of the desired color in range of 0 to 255
         * @param green
         *            the green component of the desired color in range of 0 to 255
         * @param blue
         *            the blue component of the desired color in range of 0 to 255
         */
        private Color(final int red, final int green, final int blue) {
            defaultColor.setRed(red);
            defaultColor.setGreen(green);
            defaultColor.setBlue(blue);
        }

        /**
         * Hidden constructor.
         * 
         * @param color
         *            the {@link Colors} color
         */
        private Color(final Colors color) {
            defaultColor.setColor(color);
        }

        /**
         * @return the default color
         */
        public KColor getDefaultColor() {
            return defaultColor;
        }
    };

    @Override
    public void configureOwnColors(final ColorPreferences preferences) {
        var fg = preferences.getForeground();
        var bg = preferences.getBackground();
        
        // check if it can be considered dark mode
        var bgHSB = java.awt.Color.RGBtoHSB(bg.getRed(), bg.getGreen(), bg.getBlue(), null);
        boolean dark = bgHSB[2] < 0.6f;

        configureColor(Color.NODE_FOREGROUND, fg);
        configureColor(Color.NODE_BACKGROUND, bg);
        configureColor(Color.NODE_TEXT, fg);
        configureColor(Color.CONTROLFLOW_EDGE, fg);
        if (dark) {
            configureColor(Color.NODE_SHADOW, Colors.LIGHT_GRAY);
            configureColor(Color.NODE_REFERENCED_BACKGROUND_GRADIENT_1, 103, 74, 115);
            configureColor(Color.NODE_REFERENCED_BACKGROUND_GRADIENT_2, 125, 98, 125);

            configureColor(Color.THREAD_LABEL, fg);
            configureColor(Color.THREAD_BACKGROUND, 98, 103, 125);

            configureColor(Color.COMMENT_FOREGROND, Colors.ANTIQUE_WHITE_3);
            configureColor(Color.COMMENT_FOREGROND_TRANSITION, Colors.ANTIQUE_WHITE_3);
            configureColor(Color.COMMENT_BACKGROUND_GRADIENT_1, Colors.ANTIQUE_WHITE_4);
            configureColor(Color.COMMENT_BACKGROUND_GRADIENT_2, Colors.ANTIQUE_WHITE_4);
            configureColor(Color.COMMENT_TEXT, fg);
            configureColor(Color.COMMENT_EDGE, Colors.ANTIQUE_WHITE_3);
        }
    }
}
