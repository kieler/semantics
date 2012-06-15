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
package de.cau.cs.kieler.sim.signals;

import java.util.LinkedList;

/**
 * The SignalASCIITimeLinePlotter plots ASCII art signals to a text file
 * 
 * @author cmot
 */
public class SignalASCIITimeLinePlotter extends SignalASCIIPlotter {

    /**
     * Plot ASCII.
     * 
     * @param signalList
     *            the signal list
     * @return the string[]
     */
    public String[] plot(SignalList signalList) {
        LinkedList<String> stringList = new LinkedList<String>();

        long minTick = signalList.getMinTick();
        long maxTick = signalList.getMaxTick();

        int maxSignalNameLength = getMaxSignalNameLength(signalList);
        int maxTickLabelLength = (maxTick + "").length();
        int spaceLength = Math.max(maxSignalNameLength, maxTickLabelLength) + 2;

        int maxLineLength = spaceLength * (int) (maxTick - minTick);

        // space line
        stringList.add(getSpaceCharacters(maxLineLength));

        // plot signal data
        for (Signal signal : signalList) {
            String currentLine = "";
            for (long tick = minTick; tick <= maxTick; tick++) {
                if (signal.isPresent(tick)) {
                    currentLine += createSpacedLabel(signal.getName(), spaceLength, 0);
                } else {
                    currentLine += getSpaceCharacters(spaceLength);
                }
            }
            stringList.add(currentLine);
        }

        // space line
        stringList.add(getSpaceCharacters(maxLineLength));

        // plot time line and tick labels
        String timeLine = "";
        String tickLabels = "";
        for (long tick = minTick; tick <= maxTick; tick++) {
            timeLine += createSpacedLabel("|", spaceLength, 0, '-');
            tickLabels += createSpacedLabel(tick + "", spaceLength, 0);
        }
        stringList.add(timeLine);
        stringList.add(tickLabels);

        return (String[]) stringList.toArray(new String[signalList.size()]);
    }

}
