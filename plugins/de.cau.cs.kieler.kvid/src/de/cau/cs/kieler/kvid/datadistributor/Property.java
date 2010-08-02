package de.cau.cs.kieler.kvid.datadistributor;

public class Property {
    
    private String name;
    
    private String[] values;
    
    private String currentValue;
    
    public Property(String thename, String[] thevalues) {
        this.name = thename;
        this.values = thevalues;
        if (0 < thevalues.length) {
            currentValue = thevalues[0];
        }
    }
    
    public Property(String thename, String thedefaultvalue) {
        this.name = thename;
        this.currentValue = thedefaultvalue;
        values = new String[]{ thedefaultvalue };
    }
    
    public String getName() {
        return name;
    }
    
    public String getCurrentValue() {
        return currentValue;
    }
    
    public void setCurrentValue(int optionNumber) {
        if (0 <= optionNumber && optionNumber < values.length) {
            currentValue = values[optionNumber];
        } else {
            throw new RuntimeException("Tried to set a non-existing option.");
        }
    }

}
