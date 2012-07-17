/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui.views;

import java.util.HashMap;

import org.eclipse.swt.graphics.RGB;

/**
 * The Colors can be used to customize the colors for the SignalsPlotter.<BR>
 * <BR>
 * RGB myColor = new RGB(0, 255, 0);<BR>
 * // color tick 4 of signal B<BR>
 * colors.setSignalColor("B", myColor , 4);<BR>
 * <BR>
 * // color tick 2 and 3 of signal A<BR>
 * colors.setSignalColor("A", myColor , 2);<BR>
 * colors.setSignalColor("A", myColor , 3);<BR>
 * <BR>
 * // color ALL ticks of signal S2<BR>
 * colors.setSignalColor("S2", myColor );<BR>
 * <BR>
 * 
 * @author cmot
 */
public class Colors {

    private static final RGB COLOR_BLACK = new RGB(0, 0, 0); // black
    private static final RGB COLOR_LIGHT_BLUE = new RGB(100, 100, 255); // light blue
    private static final RGB COLOR_LIGHTER_BLUE = new RGB(200, 200, 255); // lighter blue
    private static final RGB COLOR_DARK_BLUE = new RGB(0, 0, 50); // dark blue
    private static final RGB COLOR_RED = new RGB(255, 0, 0); // red
    private static final RGB COLOR_MAGENTA = new RGB(255, 0, 255); // magenta

    /** The color constants. */
    private RGB backgroundColor = COLOR_BLACK;
    private RGB signalColor1 = COLOR_LIGHT_BLUE;
    private RGB signalColor2 = COLOR_LIGHTER_BLUE;
    private RGB signalColor0 = COLOR_DARK_BLUE;
    private RGB signalColorMarker = COLOR_RED;
    private RGB signalColorError = COLOR_MAGENTA;

    /** The variable signal color hashmap for default/all ticks. */
    private HashMap<String, RGB> signalColor = new HashMap<String, RGB>();

    /** The variable signal color hashmap for special ticks. */
    private HashMap<Integer, RGB> signalTickColor = new HashMap<Integer, RGB>();

    // -------------------------------------------------------------------------

    /**
     * Gets the background color.
     * 
     * @return the background color
     */
    public RGB getBackgroundColor() {
        return backgroundColor;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the background color.
     * 
     * @param backgroundColor
     *            the new background color
     */
    public void setBackgroundColor(final RGB backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal color1. Signals are displayed alternately in two colors color1 and color2.
     * 
     * @return the signal color1
     */
    public RGB getSignalColor1() {
        return signalColor1;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal color1. Signals are displayed alternately in two colors color1 and color2.
     * 
     * @param signalColor1
     *            the new signal color1
     */
    public void setSignalColor1(final RGB signalColor1) {
        this.signalColor1 = signalColor1;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal color2.
     * 
     * @return the signalColor2. Signals are displayed alternately in two colors color1 and color2.
     */
    public RGB getSignalColor2() {
        return signalColor2;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal color2. Signals are displayed alternately in two colors color1 and color2.
     * 
     * @param signalColor2
     *            the new signal color2
     */
    public void setSignalColor2(final RGB signalColor2) {
        this.signalColor2 = signalColor2;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal spare color that is used for absent signals.
     * 
     * @return the signal spare color
     */
    public RGB getSignalSpareColor() {
        return signalColor0;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal spare color that is used for absent signals.
     * 
     * @param signalSpareColor
     *            the new signal spare color
     */
    public void setSignalSpareColor(final RGB signalSpareColor) {
        this.signalColor0 = signalSpareColor;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal color marker that is used to mark the currently active signal.
     * 
     * @return the signalColorMarker
     */
    public RGB getSignalColorMarker() {
        return signalColorMarker;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal color marker that is used to mark the currently active signal.
     * 
     * @param signalColorMarker
     *            the signalColorMarker to set
     */
    public void setSignalColorMarker(final RGB signalColorMarker) {
        this.signalColorMarker = signalColorMarker;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal color error that is used to mark the currently erroneous signal.
     * 
     * @return the signalColorError
     */
    public RGB getSignalColorError() {
        return signalColorError;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal color error that is used to mark the currently erroneous signal.
     * 
     * @param signalColorError
     *            the new signal color error
     */
    public void setSignalColorError(final RGB signalColorError) {
        this.signalColorError = signalColorError;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal color HashMap with individual signal colors.
     * 
     * @return the signalColor
     */
    public HashMap<String, RGB> getSignalColor() {
        return signalColor;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal color HashMap with individual signal colors.
     * 
     * @param signalColor
     *            the signalColor to set
     */
    public void setSignalColor(final HashMap<String, RGB> signalColor) {
        this.signalColor = signalColor;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets a specific individual color for a signal identified by its name.
     * 
     * @param signalName
     *            the signal name
     * @param signalColorParam
     *            the signalColor to set
     */
    public void setSignalColor(final String signalName, final RGB signalColorParam) {
        this.signalColor.put(signalName, signalColorParam);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets a specific individual color for a specific tick for a signal identified by its name.
     * 
     * @param signalName
     *            the signal name
     * @param signalColorParam
     *            the signalColor to set
     * @param tick
     *            the tick
     */
    public void setSignalColor(final String signalName, final RGB signalColorParam, final long tick) {
        this.signalTickColor.put((signalName + tick).hashCode(), signalColorParam);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets a specific individual color for a specific tick for a signal identified by its name.
     * 
     * @param signalName
     *            the signal name
     * @param tick
     *            the tick
     * @param defaultColor
     *            the default color
     * @return the signal color
     */
    public RGB getSignalColor(final String signalName, final long tick, final RGB defaultColor) {
        int key = (signalName + tick).hashCode();
        if (!(this.signalTickColor.containsKey(key))) {
            if (!(this.signalColor.containsKey(signalName))) {
                return defaultColor;
            }
            return this.signalTickColor.get(key);
        }
        return this.signalTickColor.get(key);
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all signal and tick specific signal colors.
     * 
     * @param signalName
     *            the signal name
     * @param tick
     *            the tick
     */
    public void resetSignalColor(final String signalName, final long tick) {
        int key = (signalName + tick).hashCode();
        if ((this.signalTickColor.containsKey(key))) {
            this.signalTickColor.remove(key);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all signal specific signal colors.
     * 
     * @param signalName
     *            the signal name
     */
    public void resetSignalColor(final String signalName) {
        this.signalColor.remove(signalName);
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all signal colors, both, the signal and tick specific ones and the signal specific
     * ones..
     */
    public void resetSignalColor() {
        this.signalTickColor.clear();
        this.signalColor.clear();
    }

    // -------------------------------------------------------------------------

}
