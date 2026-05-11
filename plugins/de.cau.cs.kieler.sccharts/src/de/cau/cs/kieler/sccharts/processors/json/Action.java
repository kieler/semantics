
package de.cau.cs.kieler.sccharts.processors.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Action {

    @SerializedName("label")
    @Expose
    private String label;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private Action.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("isImmediate")
    @Expose
    private boolean isImmediate;
    @SerializedName("guard")
    @Expose
    private String guard;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("action")
    @Expose
    private String action;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Action() {
    }

    public Action(String label, Action.Type type, boolean isImmediate, String guard, String action) {
        super();
        this.label = label;
        this.type = type;
        this.isImmediate = isImmediate;
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
    public Action.Type getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setType(Action.Type type) {
        this.type = type;
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

    public String getGuard() {
        return guard;
    }

    public void setGuard(String guard) {
        this.guard = guard;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getAction() {
        return action;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setAction(String action) {
        this.action = action;
    }

    @Generated("jsonschema2pojo")
    public enum Type {

        @SerializedName("during")
        DURING("during"),
        @SerializedName("entry")
        ENTRY("entry"),
        @SerializedName("exit")
        EXIT("exit");
        private final String value;
        private final static Map<String, Action.Type> CONSTANTS = new HashMap<String, Action.Type>();

        static {
            for (Action.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Action.Type fromValue(String value) {
            Action.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
