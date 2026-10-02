
package de.cau.cs.kieler.simulation.trace.ktrace.json;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Trace {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("ticks")
    @Expose
    private List<Tick> ticks;

    /**
     * 
     * (Required)
     * 
     */
    public List<Tick> getTicks() {
        return ticks;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTicks(List<Tick> ticks) {
        this.ticks = ticks;
    }

}
