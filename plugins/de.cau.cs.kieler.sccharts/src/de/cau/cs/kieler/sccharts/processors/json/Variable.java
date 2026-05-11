
package de.cau.cs.kieler.sccharts.processors.json;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Variable {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("initialValue")
    @Expose
    private Object initialValue;
    @SerializedName("isInput")
    @Expose
    private boolean isInput;
    @SerializedName("isOutput")
    @Expose
    private boolean isOutput;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Variable() {
    }

    public Variable(String id, String type, Object initialValue, boolean isInput, boolean isOutput) {
        super();
        this.id = id;
        this.type = type;
        this.initialValue = initialValue;
        this.isInput = isInput;
        this.isOutput = isOutput;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

    public Object getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Object initialValue) {
        this.initialValue = initialValue;
    }

    public boolean isIsInput() {
        return isInput;
    }

    public void setIsInput(boolean isInput) {
        this.isInput = isInput;
    }

    public boolean isIsOutput() {
        return isOutput;
    }

    public void setIsOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

}
