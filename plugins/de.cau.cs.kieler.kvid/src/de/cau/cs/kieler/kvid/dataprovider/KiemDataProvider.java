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
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;
import de.cau.cs.kieler.kvid.visual.GmfDrawer;
import de.cau.cs.kieler.kvid.visual.IDrawer;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;

/**
 * Data Source which is a {@link IDataProvider} and uses KIEM to collect
 * simulation data.
 * 
 * @author jjc
 * 
 */
public class KiemDataProvider extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {
    
    private DataDistributor distributor;
    
    private RuntimeConfiguration configuration;
    
    private IDrawer drawer;

    /** List of registered {@link IProviderListener}s. */
    private List<IProviderListener> listeners = new LinkedList<IProviderListener>();
    
    /**
     * 
     */
    public KiemDataProvider() {
        distributor = new DataDistributor(this);
        drawer = new GmfDrawer(this);
    }
    
    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject)
            throws KiemExecutionException {
        for (IProviderListener listener : listeners) {
            listener.update(jSONObject);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        registerProviderListener(distributor);
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
    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[1];
        properties[0] = new KiemProperty(
                        "Model Editor",
                        new KiemPropertyTypeEditor());
        return properties;
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
    public void registerProviderListener(final IProviderListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void removeProviderListener(final IProviderListener listener) {
        listeners.remove(listener);
    }
    
    /**
     * @return The DataDistributor of this provider
     */
    public DataDistributor getDistributor() {
        return distributor;
    }
    
    /**
     * @return The drawer of this provider
     */
    public IDrawer getDrawer() {
        return drawer;
    }

}
