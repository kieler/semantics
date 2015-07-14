/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.signals;

import java.util.LinkedList;

/**
 * The SignalASCIITimeLinePlotter plots ASCII art signals to a text file.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-07-25 yellow KI-21
 */
public class SignalASCIITimeLinePlotter extends SignalASCIIPlotter {
    
    /** The plot signal values instead of names. */
    private boolean plotValues;

    //-------------------------------------------------------------------------
    
    /**
     * Plot ASCII.
     *
     * @param signalList the signal list
     * @return the string[]
     */
    public String[] plot(final SignalList signalList) {
        LinkedList<String> stringList = new LinkedList<String>();

        long minTick = signalList.getMinTick();
        long maxTick = signalList.getMaxTick();

        int maxSignalNameLength = getMaxSignalNameLength(signalList);
        int maxTickLabelLength = (maxTick + "").length();
        int spaceLength = Math.max(maxSignalNameLength, maxTickLabelLength) + 2;

        int maxLineLength = spaceLength * (int) (maxTick - minTick);

        // space line
        stringList.add(getSpaceCharacters(maxLineLength).toString());

        // plot signal data
        for (Signal signal : signalList) {
            StringBuffer currentLineBuf = new StringBuffer();
            for (long tick = minTick; tick <= maxTick; tick++) {
                if (signal.isPresent(tick)) {
                    String signalText = "";
                    // decide to show values or names
                    if (!plotValues) {
                        signalText = signal.getName();
                    } else {
                        Object signalValue = signal.getValue(tick);
                        if (signalValue != null) {
                            signalText = signalValue + "";
                        }
                    }
                    currentLineBuf.append(createSpacedLabel(new StringBuffer(signalText),
                            spaceLength, 0));
                } else {
                    currentLineBuf.append(getSpaceCharacters(spaceLength));
                }
            }
            stringList.add(currentLineBuf.toString());
        }

        // space line
        stringList.add(getSpaceCharacters(maxLineLength).toString());

        // plot time line and tick labels
        StringBuffer timeLine = new StringBuffer();
        StringBuffer tickLabels = new StringBuffer();
        for (long tick = minTick; tick <= maxTick; tick++) {
            timeLine.append(createSpacedLabel(new StringBuffer("|"), spaceLength, 0, '-'));
            tickLabels.append(createSpacedLabel(new StringBuffer(tick + ""), spaceLength, 0));
        }
        stringList.add(timeLine.toString());
        stringList.add(tickLabels.toString());

        return (String[]) stringList.toArray(new String[signalList.size()]);
    }

    //-------------------------------------------------------------------------
    
    /**
     * Checks if is plot values.
     *
     * @return true, if is plot values
     */
    public boolean isPlotValues() {
        return plotValues;
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the plot values.
     *
     * @param plotValues the new plot values
     */
    public void setPlotValues(final boolean plotValues) {
        this.plotValues = plotValues;
    }

    //-------------------------------------------------------------------------
}
