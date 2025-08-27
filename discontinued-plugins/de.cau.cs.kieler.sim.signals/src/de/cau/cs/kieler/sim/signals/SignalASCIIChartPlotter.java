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
 * The SignalASCIIPlotter plots ASCII art signals to a text file.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-07-25 yellow KI-21
 */
public class SignalASCIIChartPlotter extends SignalASCIIPlotter {

    /**
     * Plot ASCII.
     * 
     * @param signalList
     *            the signal list
     * @return the string[]
     */
    public String[] plot(final SignalList signalList) {
        LinkedList<String> stringList = new LinkedList<String>();

        long minTick = signalList.getMinTick();
        long maxTick = signalList.getMaxTick();

        // plot signal data
        int maxSignalNameLength = getMaxSignalNameLength(signalList);
        StringBuffer spaceLine = new StringBuffer();
        for (Signal signal : signalList) {
            String[] signalData = getASCIISignalData(minTick, maxTick, signal, maxSignalNameLength);
            if (spaceLine.equals("")) {
                spaceLine = getSpaceCharacters(signalData[0].length());
            }
            // no space line by default
            // stringList.add(spaceLine);
            stringList.add(signalData[0]);
            stringList.add(signalData[1]);
        }

        // build tick labels
        stringList.add(spaceLine.toString());
        String[] tickLabels = getTickLabels(minTick, maxTick, maxSignalNameLength);

        for (int line = 0; line < tickLabels.length; line++) {
            stringList.add(tickLabels[line]);
        }

        return (String[]) stringList.toArray(new String[signalList.size()]);
    }

}
