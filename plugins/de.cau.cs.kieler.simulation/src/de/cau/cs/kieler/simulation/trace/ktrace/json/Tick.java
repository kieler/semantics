
package de.cau.cs.kieler.simulation.trace.ktrace.json;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Tick {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("inputs")
    @Expose
    private List<Assignment> inputs;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("outputs")
    @Expose
    private List<Assignment> outputs;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("gotoID")
    @Expose
    private String gotoID;

    /**
     * 
     * (Required)
     * 
     */
    public List<Assignment> getInputs() {
        return inputs;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setInputs(List<Assignment> inputs) {
        this.inputs = inputs;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Assignment> getOutputs() {
        return outputs;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setOutputs(List<Assignment> outputs) {
        this.outputs = outputs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGotoID() {
        return gotoID;
    }

    public void setGotoID(String gotoID) {
        this.gotoID = gotoID;
    }

}
