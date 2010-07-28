package de.cau.cs.kieler.kvid.datadistributor;

import de.cau.cs.kieler.kvid.data.KViDDataType;

public class KViDOptionData {
    
    private String id;
    
    private String category;
    
    private String name;
    
    private String description;
    
    private KViDDataType type;
    
    private String[] choices;
    
    private int currentValue = 0;
    
    public KViDOptionData(String theid, String thecategory, String thename, String thedescription, KViDDataType thetype, String[] thechoices) {
        this.id = theid;
        this.category = thecategory;
        this.name = thename;
        this.description = thedescription;
        this.type = thetype;
        this.choices = thechoices;
    }
 
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getCategory() {
        return category;
    }
    
    public Object getData(String data) {
        switch (type) {
        case INT:
            return Integer.parseInt(data);
        case FLOAT:
            return Float.parseFloat(data);
        case STRING:
            return data;
        case BOOLEAN:
            return Boolean.parseBoolean(data);
        default:
            throw new RuntimeException("Data Type not supported: " + type.name());
        }
    }
    
    public KViDDataType getType() {
        return type;
    }
    
    public String[] getChoices() {
        return choices;
    }
    
    public Object getCurrentValue() {
        return getData(choices[currentValue]);
    }
    
    public void setCurrentValue(int i) {
        this.currentValue = i;
    }

}
