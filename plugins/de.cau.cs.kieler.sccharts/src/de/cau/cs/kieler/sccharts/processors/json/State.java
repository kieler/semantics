
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
    @SerializedName("regions")
    @Expose
    private List<Region> regions;

    /**
     * No args constructor for use in serialization
     * 
     */
    public State() {
    }

    public State(String id, String label, List<Action> actions, List<Transition> transitions, List<Variable> variables, boolean isInitial, boolean isFinal, List<Region> regions) {
        super();
        this.id = id;
        this.label = label;
        this.actions = actions;
        this.transitions = transitions;
        this.variables = variables;
        this.isInitial = isInitial;
        this.isFinal = isFinal;
        this.regions = regions;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Action> getActions() {
        return actions;
    }

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

    public List<Variable> getVariables() {
        return variables;
    }

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

}
