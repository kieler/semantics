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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.util.ColorPreferences;
import de.cau.cs.kieler.klighd.util.KlighdProperties;

/**
 * A general color store.
 * 
 * @author als
 */
public abstract class AbstractColorStore {

    public interface IColor {
        /**
         * @return the default color
         */
        public KColor getDefaultColor();
    }
    
    
    public enum GeneralColor implements IColor {
        FOREGROUND(Colors.BLACK),
        BACKGROUND(Colors.WHITE),
        HIGHLIGHT(Colors.RED);
        
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
        private GeneralColor(final int red, final int green, final int blue) {
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
        private GeneralColor(final Colors color) {
            defaultColor.setColor(color);
        }

        /**
         * @return the default color
         */
        public KColor getDefaultColor() {
            return defaultColor;
        } 
    };
    
    private final static KRenderingFactory FACTORY = KRenderingFactory.eINSTANCE;
    
    /** the configuration */
    private Map<IColor, KColor> configuration = new HashMap<IColor, KColor>();

    /**
     * Configures the entire color store based on the configuration in the view context.
     * 
     * @param context
     *            the ViewContext
     */
    public void configureAllColors(final ViewContext context) {
        ColorPreferences preferences = context.getProperty(KlighdProperties.COLOR_PREFERENCES);
        if (preferences != null) {
            configureColor(GeneralColor.FOREGROUND, preferences.getForeground());
            configureColor(GeneralColor.BACKGROUND, preferences.getBackground());
            configureColor(GeneralColor.HIGHLIGHT, preferences.getHighlight());
            
            configureOwnColors(preferences);
        }
    }
    
    /**
     * Handles the color adjustment for the colors of the deriving class.
     * @param preferences
     */
    protected abstract void configureOwnColors(ColorPreferences preferences);
    
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
    public void configureColor(final IColor color, final int red, final int green, final int blue) {
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
    public void configureColor(final IColor color, final Colors cColor) {
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
    public void configureColor(final IColor color, final KColor kColor) {
        configuration.put(color, EcoreUtil.copy(kColor));
    }

    /**
     * @param color
     *            the color
     * @return a new {@link KColor} for the given color respecting all configurations.
     */
    public KColor getColor(IColor color) {
        if (configuration.containsKey(color)) {
            return EcoreUtil.copy(configuration.get(color));
        } else if (color != null) {
            return EcoreUtil.copy(color.getDefaultColor());
        }
        return null;
    }
}
