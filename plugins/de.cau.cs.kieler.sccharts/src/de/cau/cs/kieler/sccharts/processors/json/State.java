
package de.cau.cs.kieler.sccharts.processors.json;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class State {

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
    @SerializedName("actions")
    @Expose
    private List<Action> actions;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("transitions")
    @Expose
    private List<Transition> transitions;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("variables")
    @Expose
    private List<Variable> variables;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isInitial")
    @Expose
    private boolean isInitial;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isFinal")
    @Expose
    private boolean isFinal;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isConnector")
    @Expose
    private boolean isConnector;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("regions")
    @Expose
    private List<Region> regions;
    @SerializedName("reference")
    @Expose
    private Reference reference;

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
    public List<Action> getActions() {
        return actions;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Transition> getTransitions() {
        return transitions;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Variable> getVariables() {
        return variables;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    /**
     * 
     * (Required)
     * 
     */
    public boolean isIsInitial() {
        return isInitial;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsInitial(boolean isInitial) {
        this.isInitial = isInitial;
    }

    /**
     * 
     * (Required)
     * 
     */
    public boolean isIsFinal() {
        return isFinal;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    /**
     * 
     * (Required)
     * 
     */
    public boolean isIsConnector() {
        return isConnector;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsConnector(boolean isConnector) {
        this.isConnector = isConnector;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Region> getRegions() {
        return regions;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

}
