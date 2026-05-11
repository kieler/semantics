
package de.cau.cs.kieler.sccharts.processors.json;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Transition {

    @SerializedName("label")
    @Expose
    private String label;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("targetID")
    @Expose
    private String targetID;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isImmediate")
    @Expose
    private boolean isImmediate;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isTermination")
    @Expose
    private boolean isTermination;
    @SerializedName("guard")
    @Expose
    private String guard;
    @SerializedName("action")
    @Expose
    private String action;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transition() {
    }

    public Transition(String label, String targetID, boolean isImmediate, boolean isTermination, String guard, String action) {
        super();
        this.label = label;
        this.targetID = targetID;
        this.isImmediate = isImmediate;
        this.isTermination = isTermination;
        this.guard = guard;
        this.action = action;
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
    public String getTargetID() {
        return targetID;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTargetID(String targetID) {
        this.targetID = targetID;
    }

    /**
     * 
     * (Required)
     * 
     */
    public boolean isIsImmediate() {
        return isImmediate;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsImmediate(boolean isImmediate) {
        this.isImmediate = isImmediate;
    }

    /**
     * 
     * (Required)
     * 
     */
    public boolean isIsTermination() {
        return isTermination;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsTermination(boolean isTermination) {
        this.isTermination = isTermination;
    }

    public String getGuard() {
        return guard;
    }

    public void setGuard(String guard) {
        this.guard = guard;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
