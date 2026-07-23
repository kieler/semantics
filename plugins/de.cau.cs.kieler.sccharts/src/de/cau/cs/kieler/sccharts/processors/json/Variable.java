
package de.cau.cs.kieler.sccharts.processors.json;

import java.util.List;

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
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isInput")
    @Expose
    private boolean isInput;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isOutput")
    @Expose
    private boolean isOutput;
    
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("cardinalities")
    @Expose
    private List<Integer> cardinalities;

    /**
     * @return the cardinalities
     */
    public List<Integer> getCardinalities() {
        return cardinalities;
    }

    /**
     * @param cardinalities the cardinalities to set
     */
    public void setCardinalities(List<Integer> cardinalities) {
        this.cardinalities = cardinalities;
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

    /**
     * 
     * (Required)
     * 
     */
    public boolean isIsInput() {
        return isInput;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsInput(boolean isInput) {
        this.isInput = isInput;
    }

    /**
     * 
     * (Required)
     * 
     */
    public boolean isIsOutput() {
        return isOutput;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

}
