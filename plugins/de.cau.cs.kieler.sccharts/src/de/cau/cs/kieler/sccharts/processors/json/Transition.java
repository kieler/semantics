
package de.cau.cs.kieler.sccharts.processors.json;

import java.util.HashMap;
import java.util.Map;
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
    @SerializedName("preemption")
    @Expose
    private Transition.Preemption preemption;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("history")
    @Expose
    private boolean history;
    @SerializedName("guard")
    @Expose
    private String guard;
    @SerializedName("action")
    @Expose
    private String action;

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
    public Transition.Preemption getPreemption() {
        return preemption;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setPreemption(Transition.Preemption preemption) {
        this.preemption = preemption;
    }

    /**
     * 
     * (Required)
     * 
     */
    public boolean isHistory() {
        return history;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setHistory(boolean history) {
        this.history = history;
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

    @Generated("jsonschema2pojo")
    public enum Preemption {

        @SerializedName("strong")
        STRONG("strong"),
        @SerializedName("weak")
        WEAK("weak"),
        @SerializedName("termination")
        TERMINATION("termination");
        private final String value;
        private final static Map<String, Transition.Preemption> CONSTANTS = new HashMap<String, Transition.Preemption>();

        static {
            for (Transition.Preemption c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Preemption(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Transition.Preemption fromValue(String value) {
            Transition.Preemption constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
