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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.kvid.dataprovider.CsvDataProvider;

/**
 * 
 * Class for handling configuration that happens during runtime.
 * Will be lost if program is closed.
 * 
 * @author jjc
 *
 */
public class RuntimeConfiguration {
    
    private static RuntimeConfiguration instance = new RuntimeConfiguration();
    
    private List<Property> knownProperties = new ArrayList<Property>();
    
    private List<IPropertyListener> listeners = new LinkedList<IPropertyListener>();
    
    private RuntimeConfiguration() {
        knownProperties.add(new Property("Data Source", new String[]{"KIEM", "CSV"}));
        knownProperties.add(new Property("Animation enabled", new String[]{"true", "false"}));
        knownProperties.add(new Property("Behavior after Animation", new String[]{"Disappear",
                                                                   "Stay at last location"}));
        knownProperties.add(new Property("Debug drawing activated", new String[]{"false", "true"}));
    }
    
    public static RuntimeConfiguration getInstance() {
        return instance;
    }
    
    public String currentValueOfProperty(final String propertyName) {
        for (Property property : knownProperties) {
            if (property.getName().equals(propertyName)) {
                return property.getCurrentValue();
            }
        }
        throw new RuntimeException("Unknown property name!");
    }
    
    public List<Property> getKnownProperties() {
        return knownProperties;
    }
    
    public void addProperty(final Property theproperty) {
        knownProperties.add(theproperty);
        for (IPropertyListener listener : listeners) {
            listener.triggerPropertyListChanged();       
        }
    }
    
    public void removeProperty(final Property theproperty) {
        knownProperties.remove(theproperty);
        for (IPropertyListener listener : listeners) {
            listener.triggerPropertyListChanged();       
        }
    }
    
    public void addPropertyListener(final IPropertyListener thelistener) {
        listeners.add(thelistener);
    }
    
    public void removePropertyListener(final IPropertyListener thelistener) {
        listeners.remove(thelistener);
    }
    
    public void triggerPropertyChanged(final Property theproperty) {
        if (theproperty.getName().equals("Data Source")) {
            dataSourcePropertyChanged(theproperty);
        }
        if (theproperty.getName().equals("Path to CSV File")) {
            String path = theproperty.getCurrentValue();
            CsvDataProvider newProvider = new CsvDataProvider(path);
            newProvider.start();
            DataDistributor.getInstance().changeDataProvider(newProvider);
        }
        for (IPropertyListener listener : listeners) {
            listener.triggerPropertyChanged(theproperty);                
        }
    }
    
    private void dataSourcePropertyChanged(final Property theproperty) {
        if (theproperty.getCurrentValue().equals("CSV")) {
            knownProperties.add(knownProperties.indexOf(theproperty) + 1, 
                    new Property("Path to CSV File", "<project>/<file.csv>"));
        } else {
            for (Property property : knownProperties) {
                if (property.getName().equals("Path to CSV File")) {
                    knownProperties.remove(property);
                    break;
                }
            }
        }
    }
    
    public void resetToDefault() {
        for (Property property : knownProperties) {
            property.setCurrentValue(0);
            for (IPropertyListener listener : listeners) {
                listener.triggerPropertyChanged(property);                
            }
        }
    }
    
}
