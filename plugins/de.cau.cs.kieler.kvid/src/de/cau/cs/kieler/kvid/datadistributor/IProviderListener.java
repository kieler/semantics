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

import org.json.JSONObject;

/**
 * Classes who listen on a data source, e.g. classes which implement the {@link IDataProvider}
 * interface, must implement this interface and register as listeners.
 * 
 * @author jjc
 *
 */
public interface IProviderListener {
   
    /**
     * Will be triggered when the current {@link IDataProvider} starts giving data.
     */
    void triggerInitialization();
    
    /**
     * Will be triggered when the current {@link IDataProvider} stops giving data.
     */
    void triggerWrapup();
    
    /**
     * Call this every time the data to visualize has changed to trigger
     * the visualization of the new data.
     * 
     * @param data The new data for the next visualization step in JSON
     * @return Always null, could return a {@link JSONObject} if it is 
     *          to produce data for the {@link IDataProvider}
     */
    JSONObject update(JSONObject data);

}
