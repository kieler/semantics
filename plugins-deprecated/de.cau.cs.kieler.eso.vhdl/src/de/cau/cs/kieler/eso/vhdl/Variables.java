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
package de.cau.cs.kieler.eso.vhdl;

/**
 * @author gjohannsen
 *
 */
public class Variables<T> {
    
    private String name;
    private boolean isInput;
    private boolean isBoolean;
    private T value;
    
    public Variables(String name, boolean isInput, T value ){
        
        this.name = name;
        this.isInput = isInput;
        if(value instanceof Integer){
            this.isBoolean = false;
        }else if(value instanceof Boolean){
            this.isBoolean = true;
        }
        this.value = value;
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
