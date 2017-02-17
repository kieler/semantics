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
 * The SCCharts colors.
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
}
