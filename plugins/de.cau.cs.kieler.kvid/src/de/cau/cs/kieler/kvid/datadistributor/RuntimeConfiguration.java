package de.cau.cs.kieler.kvid.datadistributor;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConfiguration {
    
    private static RuntimeConfiguration instance = new RuntimeConfiguration();
    
    private List<Property> knownProperties = new ArrayList<Property>();
    
    private RuntimeConfiguration() {
        knownProperties.add(new Property("Animation enabled", new String[]{"true", "false"}));
    }
    
    public static RuntimeConfiguration getInstance() {
        return instance;
    }
    
    public String currentValueOfProperty(String propertyName) {
        for (Property property : knownProperties) {
            if (propertyName.equals(propertyName)) {
                return property.getCurrentValue();
            }
        }
        return null;
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
