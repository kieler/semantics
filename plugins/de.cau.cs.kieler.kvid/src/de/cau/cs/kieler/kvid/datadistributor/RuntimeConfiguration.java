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
import java.util.List;

public class RuntimeConfiguration {
    
    private static RuntimeConfiguration instance = new RuntimeConfiguration();
    
    private List<Property> knownProperties = new ArrayList<Property>();
    
    private RuntimeConfiguration() {
        knownProperties.add(new Property("Animation enabled", new String[]{"true", "false"}));
        knownProperties.add(new Property("Behavior after Animation", new String[]{"Disappear",
                                                                   "Stay at last location"}));
        knownProperties.add(new Property("Debug drawing activated", new String[]{"false", "true"}));
    }
    
    public static RuntimeConfiguration getInstance() {
        return instance;
    }
    
    public String currentValueOfProperty(String propertyName) {
        for (Property property : knownProperties) {
            if (property.getName().equals(propertyName)) {
                return property.getCurrentValue();
            }
        }
        throw new RuntimeException("Unknown property name!");
    }
    
    public List<Property> getKnownOptions() {
        return knownProperties;
    }
    
    public void resetToDefault() {
        for (Property property : knownProperties) {
            property.setCurrentValue(0);            
        }
    }
    
}
