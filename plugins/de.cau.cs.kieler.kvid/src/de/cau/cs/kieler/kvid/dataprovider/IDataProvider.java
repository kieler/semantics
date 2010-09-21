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
package de.cau.cs.kieler.kvid.dataprovider;

import de.cau.cs.kieler.kvid.datadistributor.IProviderListener;

/**
 * Interface for data sources. Follows a three step structure: 1. start -
 * trigger once before data delivery 2. step - trigger evvery time new data is
 * available 3. stop - trigger once when no more new data will follow
 * 
 * @deprecated Since KIEM is the only Interface to the environment, there is no
 *             need for more than one provider
 * @author jjc
 * 
 */
public interface IDataProvider {
    
    /**
     * Registers a new listener which will be notified about triggering of he three steps.
     * 
     * @param listener The {@link IProviderListener} to add
     */
    void registerProviderListener(IProviderListener listener);
    
    /**
     * Removes a listener from the listeners list.
     * 
     * @param listener The {@link IProviderListener} to remove
     */
    void removeProviderListener(IProviderListener listener);
    
    /**
     * Method to be called when data delivery starts.
     */
    void start();
    
    /**
     * Method to be called every time new data is available. 
     */
    void step();
    
    
    /**
     * Method to be called once when no more new data will follow.
     */
    void stop();

}
