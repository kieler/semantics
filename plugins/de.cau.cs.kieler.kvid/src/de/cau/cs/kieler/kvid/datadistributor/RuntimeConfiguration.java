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

/**
 * 
 * Class for handling configuration that happens during runtime.
 * Will be lost if program is closed.
 * 
 * @author jjc
 *
 */
public final class RuntimeConfiguration {
    
    /** The instance of the configuration handler. See Singleton Design Pattern. */
    private static final RuntimeConfiguration INSTANCE = new RuntimeConfiguration();
    
    /** The list of all {@link Property}s which KViD offers. */
    private List<Property> knownProperties = new ArrayList<Property>();
    
    /** List of {@link IPropertyListener}s who want to be notified about changes. */ 
    private List<IPropertyListener> listeners = new LinkedList<IPropertyListener>();
    
    /**
     * Constrcutor which must not be called by anyone. 
     * Creates a few {@link Property}s which control basic functionality of KViD.
     */
    private RuntimeConfiguration() {
        addProperty(new Property("Animation enabled", new String[] { "true",
                "false" }));
        addProperty(new Property("Behavior after Animation", new String[] {
                "Disappear", "Stay at last location", "Replay" }));
        addProperty(new Property("Debug drawing activated", new String[] {
                "false", "true" }));
    }
    
    /**
     * Gives the single instance of the RuntimeConfiguration.
     * 
     * @return The single instance of the RuntimeConfiguration
     */
    public static RuntimeConfiguration getInstance() {
        return INSTANCE;
    }
    
    /**
     * Gives the current value of a {@link Property} by it's name.
     * 
     * @param propertyName The name of the {@link Property} to look up
     * @return The current value of the requested {@link Property} 
     */
    public String currentValueOfProperty(final String propertyName) {
        for (Property property : knownProperties) {
            if (property.getName().equals(propertyName)) {
                return property.getCurrentValue();
            }
        }
        throw new RuntimeException("Unknown property name!");
    }
    
    /**
     * Getter for the list of currently known {@link Property}s.
     * Only for display purposes, do NOT use for manipulation!
     * 
     * @return The list of currently known {@link Property}s
     */
    public List<Property> getKnownProperties() {
        return knownProperties;
    }
    /**
     * Getter for the list of {@link Property}s referring to the current selection.
     * Enter null if there is no selection to get general options.
     * 
     * @param selectedParts The currently selected EditParts
     * @return The Properties referring to the selected EditParts
     */
    public List<Property> getReferedProperties(final List<String> selectedParts) {
        List<Property> result = new LinkedList<Property>();
        if (selectedParts == null) {
            for (Property property : knownProperties) {
                if (property.refersTo(null)) {
                    result.add(property);
                }
            }
        } else {
            for (String part : selectedParts) {
                for (Property property : knownProperties) {
                    if (property.refersTo(part)) {
                        result.add(property);
                    }
                }
            }
        }
        return result;
    }
    
    /**
     * ONLY use this to add a new {@link Property} to the configuration.
     * Will make sure {@link Property} names are unique.
     * 
     * @param theproperty The new {@link Property} to add
     */
    public void addProperty(final Property theproperty) {
        addProperty(knownProperties.size(), theproperty);
    }
    
    /**
     * ONLY use this to add a new {@link Property} to the configuration when a
     * certain position is desired (e.g. for style reasons).
     * Will make sure {@link Property} names are unique.
     * 
     * @param where Position in the Properties list where it should be added
     * @param theproperty The new {@link Property} to add
     */
    public void addProperty(final int where, final Property theproperty) {
        for (Property property : knownProperties) {
            if (property.getName().equals(theproperty.getName())) {
                //Check if the name already exists, ignore the new property then
                return;
            }
        }
        knownProperties.add(where, theproperty);
        for (IPropertyListener listener : listeners) {
            listener.triggerPropertyListChanged();       
        }
    }
    
    /**
     * Removes a {@link Property} from the list of currenty known Properties.
     * 
     * @param theproperty The {@link Property} to remove from the list
     */
    public void removeProperty(final Property theproperty) {
        knownProperties.remove(theproperty);
        for (IPropertyListener listener : listeners) {
            listener.triggerPropertyListChanged();       
        }
    }
    
    /**
     * Registers a new listener which will be notified when the Properties change.
     * 
     * @param thelistener The {@link IPropertyListener} to add
     */
    public void addPropertyListener(final IPropertyListener thelistener) {
        listeners.add(thelistener);
    }
    
    /**
     * Removes a listener from the listeners list.
     * 
     * @param thelistener The {@link IPropertyListener} to remove
     */
    public void removePropertyListener(final IPropertyListener thelistener) {
        listeners.remove(thelistener);
    }
    
    /**
     * Method which notifies listeners when Properties have changed.
     * Also takes care, when some {@link Property} needs special handling.
     *  
     * @param theproperty The Property which was changed
     */
    public void triggerPropertyChanged(final Property theproperty) {
        for (IPropertyListener listener : listeners) {
            listener.triggerPropertyChanged(theproperty);                
        }
    }
    
    /**
     * Resets all known Properties to its' default values.
     * Will ignore free text Properties. 
     */
    public void resetToDefault() {
        for (Property property : knownProperties) {
            property.setCurrentValue(0);
            for (IPropertyListener listener : listeners) {
                listener.triggerPropertyChanged(property);                
            }
        }
    }
    
}
