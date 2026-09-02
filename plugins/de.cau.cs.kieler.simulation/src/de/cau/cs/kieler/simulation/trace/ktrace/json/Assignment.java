
package de.cau.cs.kieler.simulation.trace.ktrace.json;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Assignment {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("variableID")
    @Expose
    private String variableID;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private Object value;

    /**
     * 
     * (Required)
     * 
     */
    public String getVariableID() {
        return variableID;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVariableID(String variableID) {
        this.variableID = variableID;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Object getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setValue(Object value) {
        this.value = value;
    }

}
