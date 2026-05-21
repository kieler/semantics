
package de.cau.cs.kieler.sccharts.processors.json;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Region {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("label")
    @Expose
    private String label;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("states")
    @Expose
    private List<State> states;

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<State> getStates() {
        return states;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setStates(List<State> states) {
        this.states = states;
    }

}
