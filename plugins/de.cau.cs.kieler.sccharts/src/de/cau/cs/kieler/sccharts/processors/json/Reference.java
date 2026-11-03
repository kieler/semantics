
package de.cau.cs.kieler.sccharts.processors.json;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Reference {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("targetID")
    @Expose
    private String targetID;
    @SerializedName("targetFile")
    @Expose
    private String targetFile;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("parameters")
    @Expose
    private List<String> parameters;

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

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

}
