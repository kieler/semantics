/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.vhdl;

/**
 * This class represent a variable.
 * 
 * It has a name and can contain any value, intended is boolean and integer.
 * It can also be specified if this variable is an input, output or when both
 * is set to false, to be a local variable   
 * 
 * 
 * @author gjo
 *
 */
public class Variables<T> {
    
    /** The variable name */
    private String name;
    
    /** marks a variable as input */
    private boolean isInput;
    
    /** marks a variable as output */
    private boolean isOutput;
    
    /** variable contains a boolean value */
    private boolean isBoolean;
    
    /** the variables value */
    private T value;
    
    /**
     * Variable constructor
     * 
     * @param name
     *          the variable name
     * @param isInput
     *          the variable is in input variable
     * @param isOutput
     *          the variable is in output variable
     * @param value
     *          the variable value
     */
    public Variables(String name, boolean isInput, boolean isOutput, T value ){
        
        this.name = name;
        this.isInput = isInput;
        this.isOutput = isOutput;
        if(value instanceof Integer){
            this.isBoolean = false;
        }else if(value instanceof Boolean){
            this.isBoolean = true;
        }
        this.value = value;
    }

    /**
     * @return the isOutput
     */
    public boolean isOutput() {
        return isOutput;
    }

    /**
     * @param isOutput the isOutput to set
     */
    public void setOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the isInput
     */
    public boolean isInput() {
        return isInput;
    }

    /**
     * @param isInput the isInput to set
     */
    public void setInput(boolean isInput) {
        this.isInput = isInput;
    }

    /**
     * @return the isBoolean
     */
    public boolean isBoolean() {
        return isBoolean;
    }

    /**
     * @param isBoolean the isBoolean to set
     */
    public void setBoolean(boolean isBoolean) {
        this.isBoolean = isBoolean;
    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }
    
  
    
    

}
