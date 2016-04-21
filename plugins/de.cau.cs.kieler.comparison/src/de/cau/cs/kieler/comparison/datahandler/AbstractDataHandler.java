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

import de.cau.cs.kieler.comparison.exchange.AbstractComparisonMeasurement;
import de.cau.cs.kieler.comparison.measuring.IMeasuring;

/**
 * @author nfl
 *
 */
public abstract class AbstractDataHandler extends Observable {

    public abstract void serialize(String comparison, IMeasuring data);
    public abstract AbstractComparisonMeasurement getData(String comparison);    
}
