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
 * @author jjc
 *
 */
public class Property {
    
    private String name;
    
    private String[] values;
    
    private String currentValue;
    
    private boolean isFreeText;
    
    public Property(String thename, String[] thevalues) {
        this.name = thename;
        this.values = thevalues;
        if (0 < thevalues.length) {
            currentValue = thevalues[0];
        }
        this.isFreeText = false;
    }
    
    public Property(String thename, String thedefaultvalue) {
        this.name = thename;
        this.currentValue = thedefaultvalue;
        values = new String[]{ thedefaultvalue };
        this.isFreeText = true;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCurrentValue() {
        return currentValue;
    }
    
    public boolean isFreeText() {
        return isFreeText;
    }
    
    public int getCurrentValueNumber() {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(currentValue)) {
                return i;
            }
        }
        return 0;
    }
    
    public String[] getValueNames() {
        return values;
    }
    
    public void setCurrentValue(int optionNumber) {
        if (0 <= optionNumber && optionNumber < values.length) {
            currentValue = values[optionNumber];
            RuntimeConfiguration.getInstance().triggerPropertyChanged(this);
        } else {
            throw new RuntimeException("Tried to set a non-existing option.");
        }
    }
    
    public void setCurrentValue(String optionName) {
        if (isFreeText) {
            currentValue = optionName;
            values[0] = optionName;
            RuntimeConfiguration.getInstance().triggerPropertyChanged(this);
            return;
        }
        for (String option : values) {
            if (optionName.equals(option)) {
                currentValue = option;
                RuntimeConfiguration.getInstance().triggerPropertyChanged(this);
                return;
            }
        }
        throw new RuntimeException("Tried to set a non-existing option.");
    }
    
    @Override
    public String toString() {
        return getName() + ": " + getCurrentValue();
    }

}
