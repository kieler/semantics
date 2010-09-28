/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.datadistributor;

/**
 * 
 * Interface for IDataListener.
 * Usually is registered at the {@link DataDistributor} which will deliver
 * new data to the listeners.
 * 
 * @author jjc
 *
 */
public interface IDataListener {
    
    /**
     * Method to be called when the data relvant ot the listener is changed.
     * 
     * @param isHistoryValue Shows whether this is a new value or we a browsing in the past
     */
    void triggerDataChanged(boolean isHistoryValue);
    
    /**
     * Method to be called when the visualization is finished.
     */
    void triggerWrapup();

}
