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

import java.util.List;

/**
 * Class for storing KViD Properties, it's corresponding values and the 
 * currently selected value.
 * 
 * @author jjc
 *
 */
public class Property {
    
    /** The Property's name. */
    private String name;
    
    /** The possible values of this Property. */
    private String[] values;
    
    /** The currently selected value. */
    private String currentValue;
    
    /** Is this Property a free text Property? */
    private boolean isFreeText;
    
    /** A list of URIs of objects this property refers to. Null if refers to none. */
    private List<String> associatedParts = null;
    
    /**
     * Constructor for a Property with a fix set of options.
     * 
     * @param thename The Property's desired name (must be unique)
     * @param thevalues String array containing all possible options
     */
    public Property(final String thename, final String[] thevalues) {
        this.name = thename;
        this.values = thevalues.clone();
        if (0 < thevalues.length) {
            currentValue = thevalues[0];
        }
        this.isFreeText = false;
    }
    
    /**
     * Constructor for a Property with free text input.
     * 
     * @param thename The Property's desired name (must be unique)
     * @param thedefaultvalue The initial value of the Property
     */
    public Property(final String thename, final String thedefaultvalue) {
        this.name = thename;
        this.currentValue = thedefaultvalue;
        //Having a free text option, it is set as value on position 0 in the values array 
        values = new String[]{ thedefaultvalue };
        this.isFreeText = true;
    }
    
    /**
     * Constructor for a Property with a fixed set of options and
     * EditParts to which it refer. 
     * 
     * @param theName The Property's desired name (must be unique)
     * @param theValues String array containing all possible options
     * @param theAssociatedParts EditParts to which this option refers
     */
    public Property(final String theName, final String[] theValues,
            final List<String> theAssociatedParts) {
        this(theName, theValues);
        associatedParts = theAssociatedParts;
    }
    
    /**
     * Constructor for a Property with free text input and
     * EditParts to which it refer .
     * 
     * @param theName The Property's desired name (must be unique)
     * @param theDefaultValue The initial value of the Property
     * @param theAssociatedParts EditParts to which this option refers
     */
    public Property(final String theName, final String theDefaultValue,
            final List<String> theAssociatedParts) {
        this(theName, theDefaultValue);
        associatedParts = theAssociatedParts;
    }
    
    /**
     * Getter for the Property's name.
     * 
     * @return The Property's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter for the Property's current value.
     * 
     * @return The Property's current value
     */
    public String getCurrentValue() {
        return currentValue;
    }
    
    /**
     * Method to check whether this is a free text Property.
     * 
     * @return Is this a free text Property?
     */
    public boolean isFreeText() {
        return isFreeText;
    }
    
    /**
     * Gets the value of the currently selected option.
     * 
     * @return The number of the currently selected option, 0 if this is a free text Property
     */
    public int getCurrentValueNumber() {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(currentValue)) {
                return i;
            }
        }
        return 0;
    }
    
    /**
     * Getter for all possible options.
     * 
     * @return All possible options represented by a string array.
     */
    public String[] getValueNames() {
        return values.clone();
    }
    
    /**
     * Sets the current option by it's number.
     * Doesn't work for free text Properties.
     * 
     * @param optionNumber The number of the option to set to
     */
    public void setCurrentValue(final int optionNumber) {
        if (0 <= optionNumber && optionNumber < values.length) {
            currentValue = values[optionNumber];
            RuntimeConfiguration.getInstance().triggerPropertyChanged(this);
        } else {
            // FIXME throw a more specific exception
            throw new RuntimeException("Tried to set a non-existing option.");
        }
    }
    
    /**
     * Sets the current option by it's name.
     * Use this also for free text options.
     * 
     * @param optionName The name of the option that should become the new current option
     */
    public void setCurrentValue(final String optionName) {
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
        // FIXME throw a more specific exception
        throw new RuntimeException("Tried to set a non-existing option.");
    }
    
    /**
     * Method to check whether this option is associated with a certain EditPart.
     * Enter null to find general options.
     * 
     * @param thePart The URI of the object to which the option might refer
     * @return true if it refers, false else
     */
    public boolean refersTo(final String thePart) {
        if (thePart == null) {
            return associatedParts == null;
        }
        if (associatedParts == null) {
            return false;
        }
        for (String part : associatedParts) {
            if (thePart.equals(part)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return getName() + ": " + getCurrentValue();
    }

}
