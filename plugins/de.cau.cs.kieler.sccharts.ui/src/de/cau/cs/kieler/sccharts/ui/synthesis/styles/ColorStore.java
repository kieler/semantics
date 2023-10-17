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
package de.cau.cs.kieler.sccharts.ui.synthesis.styles;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.util.ColorPreferences;
import de.cau.cs.kieler.klighd.util.KlighdProperties;

/**
 * The SCCharts colors.
 * 
 * @author als
 * @kieler.design 2015-10-27 proposed
 * @kieler.rating 2015-10-27 proposed yellow
 */
@ViewSynthesisShared
public class ColorStore {

    public enum Color {
        STATE_FOREGROUND(Colors.GRAY),
        STATE_TEXT_FOREGROUND(Colors.BLACK),
        STATE_INITIAL_FOREGROND(Colors.BLACK),
        STATE_FIANL_FOREGROND(Colors.BLACK),
        STATE_FINAL_FOREGROND_BACKGROUND(Colors.WHITE),
        STATE_BACKGROUND_GRADIENT_1(248, 249, 253),
        STATE_BACKGROUND_GRADIENT_2(205, 220, 243),
        STATE_REFERENCED_BACKGROUND_GRADIENT_1(0xfc, 0xf7, 0xfc),
        STATE_REFERENCED_BACKGROUND_GRADIENT_2(0xe6, 0xcb, 0xf2),
        STATE_CONNECTOR(Colors.BLACK),
        STATE_SHADOW(Colors.BLACK),
        STATE_VIOLATION_BACKGROUND_GRADIENT_1(253, 244, 240),
        STATE_VIOLATION_BACKGROUND_GRADIENT_2(245, 160, 163),
        
        TRANSITION_FOREGROND(Colors.BLACK),
        TRANSITION_HISTORY(60, 60, 60),
        TRANSITION_HISTORY_DECORATOR(Colors.WHITE),
        TRANSITION_DEFERRED(Colors.RED),
        TRANSITION_DEFERRED_DECORATOR(Colors.WHITE),
        TRANSITION_ABORT_DECORATOR(Colors.RED),
        TRANSITION_TERMINATION_DECORATOR(Colors.GREEN),
        TRANSITION_PROBABILITY(Colors.STEEL_BLUE_2),
        TRANSITION_NONDETERMINISTIC(234, 154, 86),          // darker SANDY_BROWN
        TRANSITION_LABEL_FOREGROND(Colors.BLACK),
        
        REGION_FOREGROUND(Colors.GRAY),
        REGION_BACKGROUND(Colors.WHITE),
        REGION_OVERRIDE_FOREGROUND(0xaa, 0xd4, 0x00),
        REGION_OVERRIDE_BACKGROUND(Colors.WHITE),
        REGION_ABORT_FOREGROUND(Colors.RED),
        REGION_ABORT_BACKGROUND(Colors.WHITE),
        REGION_BUTTON_FOREGROUND(Colors.WHITE),
        REGION_LABEL(Colors.DIM_GRAY),
        
        INPUTNODE_BACKGROUND_GRADIENT_1(248, 249, 253),
        INPUTNODE_BACKGROUND_GRADIENT_2(205, 220, 243),
        INPUTNODE_FOREGROUND(Colors.GRAY),
        OUTPUTNODE_BACKGROUND_GRADIENT_1(248, 249, 253),
        OUTPUTNODE_BACKGROUND_GRADIENT_2(205, 220, 243),
        OUTPUTNODE_FOREGROUND(Colors.GRAY),
        OPERATORNODE_BACKGROUND_GRADIENT_1(248, 249, 253),
        OPERATORNODE_BACKGROUND_GRADIENT_2(205, 220, 243),
        OPERATORNODE_FOREGROUND(Colors.GRAY),
        REFERENCENODE_BACKGROUND_GRADIENT_1(0xfc, 0xf7, 0xfc),
        REFERENCENODE_BACKGROUND_GRADIENT_2(0xe6, 0xcb, 0xf2),
        REFERENCENODE_FOREGROUND(Colors.GRAY),
        
        COMMENT_FOREGROND(0xf0, 0xf0, 0x24),
        COMMENT_FOREGROND_TRANSITION(0x00, 0x00, 0x00),
        COMMENT_BACKGROUND_GRADIENT_1(0xff, 0xff, 0xcc),
        COMMENT_BACKGROUND_GRADIENT_2(0xff, 0xf9, 0xba),
        COMMENT_TEXT(0, 0, 0),
        COMMENT_EDGE(0xf0, 0xf0, 0x24),
        
        USER_SCHEDULE_COLOR(0x28, 0x99, 0x7E),
        
        DEPENDENCY_ABSWRITEREAD(0, 192, 0),
        DEPENDENCY_ABSWRITERELWRITE(0, 0, 255),
        DEPENDENCY_ABSWRITEABSWRITE(255, 0, 0),
        
        METHOD_FOREGROUND(Colors.GRAY_22),
        METHOD_BACKGROUND(Colors.GRAY_92),
        
        SELECTION(74, 144, 217),
        
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
    private Map<Color, KColor> configuration = new HashMap<ColorStore.Color, KColor>();

    /**
     * Configures the entire color store based on the configuration in the view context.
     * 
     * @param context
     *            the ViewContext
     */
    public void configureAllColors(final ViewContext context) {
        ColorPreferences preferences = context.getProperty(KlighdProperties.COLOR_PREFERENCES);
        
        var fg = preferences.getForeground();
        var bg = preferences.getBackground();
        
        // check if it can be considered dark mode
        var bgHSB = java.awt.Color.RGBtoHSB(bg.getRed(), bg.getGreen(), bg.getBlue(), null);
        boolean dark = bgHSB[2] < 0.6f;
        
        if (dark) {
            configureColor(Color.STATE_FOREGROUND, fg);
            configureColor(Color.STATE_TEXT_FOREGROUND, fg);
            configureColor(Color.STATE_INITIAL_FOREGROND, fg);
            configureColor(Color.STATE_FIANL_FOREGROND, fg);
            configureColor(Color.STATE_FINAL_FOREGROND_BACKGROUND, bg);
            configureColor(Color.STATE_BACKGROUND_GRADIENT_1, 74, 90, 115);
            configureColor(Color.STATE_BACKGROUND_GRADIENT_2, 98, 103, 125);
            configureColor(Color.STATE_REFERENCED_BACKGROUND_GRADIENT_1, 103, 74, 115);
            configureColor(Color.STATE_REFERENCED_BACKGROUND_GRADIENT_2, 125, 98, 125);
            configureColor(Color.STATE_CONNECTOR, fg);
            configureColor(Color.STATE_SHADOW, Colors.LIGHT_GRAY);
            
            configureColor(Color.TRANSITION_FOREGROND, fg);
            configureColor(Color.TRANSITION_HISTORY, Colors.LIGHT_GRAY);
            configureColor(Color.TRANSITION_HISTORY_DECORATOR, Colors.BLACK);
            configureColor(Color.TRANSITION_DEFERRED, Colors.RED_3);
            configureColor(Color.TRANSITION_DEFERRED_DECORATOR, fg);
            configureColor(Color.TRANSITION_ABORT_DECORATOR, Colors.RED_3);
            configureColor(Color.TRANSITION_TERMINATION_DECORATOR, Colors.GREEN_3);
            configureColor(Color.TRANSITION_PROBABILITY, Colors.STEEL_BLUE_2);
            configureColor(Color.TRANSITION_NONDETERMINISTIC, 234, 154, 86);
            configureColor(Color.TRANSITION_LABEL_FOREGROND, fg);
    
            configureColor(Color.REGION_FOREGROUND, fg);
            configureColor(Color.REGION_BACKGROUND, bg);
            configureColor(Color.REGION_OVERRIDE_FOREGROUND, adjustBrightness(Color.REGION_OVERRIDE_FOREGROUND.defaultColor, 0.2f));
            configureColor(Color.REGION_OVERRIDE_BACKGROUND, bg);
            configureColor(Color.REGION_ABORT_FOREGROUND, Colors.RED_3);
            configureColor(Color.REGION_ABORT_BACKGROUND, bg);
            configureColor(Color.REGION_BUTTON_FOREGROUND, bg);
            configureColor(Color.REGION_LABEL, fg);
    
            configureColor(Color.INPUTNODE_BACKGROUND_GRADIENT_1, getColor(Color.STATE_BACKGROUND_GRADIENT_1));
            configureColor(Color.INPUTNODE_BACKGROUND_GRADIENT_2, getColor(Color.STATE_BACKGROUND_GRADIENT_2));
            configureColor(Color.INPUTNODE_FOREGROUND, getColor(Color.STATE_FOREGROUND));
            configureColor(Color.OUTPUTNODE_BACKGROUND_GRADIENT_1, getColor(Color.STATE_BACKGROUND_GRADIENT_1));
            configureColor(Color.OUTPUTNODE_BACKGROUND_GRADIENT_2, getColor(Color.STATE_BACKGROUND_GRADIENT_2));
            configureColor(Color.OUTPUTNODE_FOREGROUND, getColor(Color.STATE_FOREGROUND));
            configureColor(Color.OPERATORNODE_BACKGROUND_GRADIENT_1, getColor(Color.STATE_BACKGROUND_GRADIENT_1));
            configureColor(Color.OPERATORNODE_BACKGROUND_GRADIENT_2, getColor(Color.STATE_BACKGROUND_GRADIENT_2));
            configureColor(Color.OPERATORNODE_FOREGROUND, getColor(Color.STATE_FOREGROUND));
            configureColor(Color.REFERENCENODE_BACKGROUND_GRADIENT_1, getColor(Color.STATE_REFERENCED_BACKGROUND_GRADIENT_1));
            configureColor(Color.REFERENCENODE_BACKGROUND_GRADIENT_2, getColor(Color.STATE_REFERENCED_BACKGROUND_GRADIENT_2));
            configureColor(Color.REFERENCENODE_FOREGROUND, getColor(Color.STATE_FOREGROUND));
    
            configureColor(Color.COMMENT_FOREGROND, Colors.ANTIQUE_WHITE_3);
            configureColor(Color.COMMENT_FOREGROND_TRANSITION, Colors.ANTIQUE_WHITE_3);
            configureColor(Color.COMMENT_BACKGROUND_GRADIENT_1, Colors.ANTIQUE_WHITE_4);
            configureColor(Color.COMMENT_BACKGROUND_GRADIENT_2, Colors.ANTIQUE_WHITE_4);
            configureColor(Color.COMMENT_TEXT, fg);
            configureColor(Color.COMMENT_EDGE, Colors.ANTIQUE_WHITE_3);
    
            configureColor(Color.USER_SCHEDULE_COLOR, 0x28, 0x99, 0x7E);
            configureColor(Color.DEPENDENCY_ABSWRITEREAD, 0, 192, 0);
            configureColor(Color.DEPENDENCY_ABSWRITERELWRITE, 0, 0, 255);
            configureColor(Color.DEPENDENCY_ABSWRITEABSWRITE, 255, 0, 0);
    
            configureColor(Color.METHOD_FOREGROUND, getColor(Color.REGION_FOREGROUND));
            configureColor(Color.METHOD_BACKGROUND, adjustBrightness(getColor(Color.REGION_BACKGROUND), 0.15f));
    
            configureColor(Color.SELECTION, adjustBrightness(Color.SELECTION.defaultColor, 0.2f));
            
            configureColor(Color.KEYWORD, 0xC5, 0x86, 0xC0);
        }
    }
    
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
     * Configures the given color with a {@link Colors} color.
     * 
     * @param color
     *            the color to configure
     * @param color
     *            the {@link KColor} color
     */
    public void configureColor(final Color color, final KColor kColor) {
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
    
    /**
     * Adjusts the brightness of the given color.
     */
    private KColor adjustBrightness(KColor color, float adjustment) {
        var HSB = java.awt.Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        HSB[2] += adjustment;
        HSB[2] = Math.max(0, Math.min(1, HSB[2]));
        var RGB = java.awt.Color.getHSBColor(HSB[0],HSB[1],HSB[2]);
        
        KColor newColor = FACTORY.createKColor();
        newColor.setRed(RGB.getRed());
        newColor.setGreen(RGB.getGreen());
        newColor.setBlue(RGB.getBlue());
        
        return newColor;
    }
}
