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

import java.util.HashMap;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;

/**
 * The SCCharts colors.
 * 
 * @author als
 * @kieler.design 2015-10-27 proposed
 * @kieler.rating 2015-10-27 proposed yellow
 */
public class ColorStore {

    public enum Color {
        SCCHARTSBLUE(205, 220, 243),
        
        COMMENT_FOREGROND(0xf0, 0xf0, 0x24),
        COMMENT_FOREGROND_TRANSITION(0x00, 0x00, 0x00),
        COMMENT_BACKGROUND_GRADIENT_1(0xff, 0xff, 0xcc),
        COMMENT_BACKGROUND_GRADIENT_2(0xff, 0xf9, 0xba),
        COMMENT_TEXT(0, 0, 0),
        COMMENT_EDGE(0xf0, 0xf0, 0x24),
        
        USER_SCHEDULE_COLOR(0x28, 0x99, 0x7E),
        
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
        STANDARD_CONTROLFLOWEDGE(0, 0, 0),
        BASICBLOCKBORDER(248, 0, 253),
        SCHEDULINGBLOCKBORDER(128, 0, 243),
        SCHEDULEBORDER(0, 0, 128),
        SCHEDULING_DEADCODE(128, 128, 128),
        SCHEDULING_SCHEDULINGEDGE(128, 0, 253),
        PROBLEM_COLOR(255, 0, 0),
        
        KEYWORD(115, 0, 65);

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
        private KColor getDefaultColor() {
            return defaultColor;
        }
    };

    private final static KRenderingFactory FACTORY = KRenderingFactory.eINSTANCE;
    /** the configuration */
    private HashMap<Color, KColor> configuration = new HashMap<ColorStore.Color, KColor>();

    /**
     * Configures the given color with RGB values.
     * 
     * @param color
     *            the color to configure
     * @param red
     *            the red component of the desired color in range of 0 to 255
     * @param green
     *            the green component of the desired color in range of 0 to 255
     * @param blue
     *            the blue component of the desired color in range of 0 to 255
     */
    public void configureColor(final Color color, final int red, final int green, final int blue) {
        KColor kColor = FACTORY.createKColor();
        kColor.setRed(red);
        kColor.setGreen(green);
        kColor.setBlue(blue);
        configuration.put(color, kColor);
    }

    /**
     * Configures the given color with a {@link Colors} color.
     * 
     * @param color
     *            the color to configure
     * @param color
     *            the {@link Colors} color
     */
    public void configureColor(final Color color, final Colors cColor) {
        KColor kColor = FACTORY.createKColor();
        kColor.setColor(cColor);
        configuration.put(color, kColor);
    }

    /**
     * @param color
     *            the color
     * @return a new {@link KColor} for the given color respecting all configurations.
     */
    public KColor getColor(Color color) {
        if (configuration.containsKey(color)) {
            return EcoreUtil.copy(configuration.get(color));
        } else if (color != null) {
            return EcoreUtil.copy(color.getDefaultColor());
        }
        return null;
    }
    
    public KColor getColor2(Color color) {
        return this.getColor(color);
    }    
}
