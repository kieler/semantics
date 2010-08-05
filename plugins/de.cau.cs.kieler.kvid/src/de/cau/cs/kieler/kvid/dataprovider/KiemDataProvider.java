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

import java.util.LinkedList;
import java.util.List;

import org.json.JSONObject;

import de.cau.cs.kieler.kvid.datadistributor.IProviderListener;
import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * 
 * @author jjc
 * 
 */
public class KiemDataProvider extends JSONObjectDataComponent implements
        IJSONObjectDataComponent, IDataProvider {

    private List<IProviderListener> listeners = new LinkedList<IProviderListener>();
    
    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject)
            throws KiemExecutionException {
        //new CsvDataProvider("test/test.csv");
        for (IProviderListener listener : listeners) {
            listener.update(jSONObject);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        if (!listeners.contains(DataDistributor.getInstance()))
            registerProviderListener(DataDistributor.getInstance());
        for (IProviderListener listener : listeners) {
            listener.triggerInitialization();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        for (IProviderListener listener : listeners) {
            listener.triggerWrapup();
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void registerProviderListener(IProviderListener listener) {
        listeners.add(listener);
    }

    public void removeProviderListener(IProviderListener listener) {
        listeners.remove(listener);
    }

}
