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
package de.cau.cs.kieler.comparison.datahandler;

import java.util.Observable;
import java.util.Observer;

import de.cau.cs.kieler.comparison.exchange.GeneralComparisonMeasurement;
import de.cau.cs.kieler.comparison.measuring.IMeasuring;

/**
 * The AbstractDataHandler class is used to serialize and deserialize measurings taken in a
 * comparison. On top of that the AbstractDataHandler extends Observable, allowing Observer to get
 * notified, when the DataHandler serializes and changes a given set of measurings.
 * 
 * @author nfl
 */
public abstract class AbstractDataHandler extends Observable {

    /**
     * Serializes a measuring data into a comparison.
     * 
     * @param comparison
     *            The comparison the measuring was taken in.
     * @param data
     *            The measuring taken during the comparison.
     */
    public abstract void serialize(String comparison, IMeasuring data);

    /**
     * Deserializes a set of measurings taken in a comparison.
     * 
     * @param comparison
     *            The comparison to deserialize.
     * @return a set of measurings
     */
    public abstract GeneralComparisonMeasurement getData(String comparison);
}
