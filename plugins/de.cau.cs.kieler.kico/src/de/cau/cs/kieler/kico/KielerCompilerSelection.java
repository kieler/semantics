/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Instances of this class represent user selections for interactive compilation. Users may give
 * just command line string arguments that can be parsed.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public class KielerCompilerSelection {

    /**
     * The originally selected transformation Ids. These define which transformations are selected
     * for compilation
     */
    private List<String> selectedFeatureIds = new ArrayList<String>();

    /** The originally selected transformation Ids. Specifically selected transformations. */
    private List<String> selectedTransformationIds = new ArrayList<String>();

    /** The optionally disabled transformation Ids. These transformations will be skipped. */
    private List<String> disabledTransformationIds = new ArrayList<String>();

    /**
     * The originally preferred transformation Ids. Specifically preferred transformations that are
     * selected if a feature is selected that multiple transformations can handle, like ABORT or
     * CODEGENERATION.
     */
    private List<String> preferredTransformationIds = new ArrayList<String>();

    /** The optionally disabled processor options. */
    private List<String> enabledProcessorOptionIds = new ArrayList<String>();

    /** The optionally disabled processor options. */
    private List<String> disabledProcessorOptionIds = new ArrayList<String>();

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler selection.
     */
    public KielerCompilerSelection() {

    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler selection.
     * 
     * @param stringArguments
     *            the string arguments
     */
    public KielerCompilerSelection(String stringArguments) {
        parseStringArguments(stringArguments, true);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Clears all selection lists.
     */
    public void clear() {
        selectedFeatureIds.clear();
        selectedTransformationIds.clear();
        disabledTransformationIds.clear();
        preferredTransformationIds.clear();
        enabledProcessorOptionIds.clear();
        disabledProcessorOptionIds.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Append a selection based on string arguments to the current selection.
     *
     * @param stringArguments the string arguments
     */
    public void appendSelection(String stringArguments) {
        parseStringArguments(stringArguments, false);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Parses the selected and disabled features, transformations and processorOptions as well as
     * preferred. <BR>
     * It is a list of IDs, where disabled IDs are marked with a "!" before the ID and preferred
     * with a "*". Transformation IDs start with a preceding "T_" and processor options with "P_". <BR>
     * Example:<BR>
     * "ABORT, *T_ABORT_WTO,!P_DEADCODE"
     *
     * @param stringArguments the string arguments
     * @param clear the clear
     */
    private void parseStringArguments(String stringArguments, boolean clear) {

        String trimmed = stringArguments.replace(" ", "");
        if (trimmed.length() == 0) {
            return;
        }
        String[] idArray = trimmed.split(",");
        if (idArray == null) {
            return;
        }
        if (clear) {
            // Clear all ID lists
            this.selectedTransformationIds.clear();
            this.preferredTransformationIds.clear();
            this.disabledTransformationIds.clear();
            this.enabledProcessorOptionIds.clear();
            this.disabledProcessorOptionIds.clear();
        }
        for (String id : Arrays.asList(idArray)) {
            String idTrimmed = id.trim();
            boolean preferred = false;
            boolean disabled = false;
            boolean isTransformation = false;
            boolean isProcessorOption = false;
            // parsing
            if (idTrimmed.startsWith("!")) {
                idTrimmed = idTrimmed.substring(1);
                disabled = true;
            }
            if (idTrimmed.startsWith("*")) {
                idTrimmed = idTrimmed.substring(1);
                preferred = true;
            }
            if (idTrimmed.startsWith("T_")) {
                idTrimmed = idTrimmed.substring(2);
                isTransformation = true;
            }
            if (idTrimmed.startsWith("P_")) {
                idTrimmed = idTrimmed.substring(2);
                isProcessorOption = true;
            }
            // put id into correct list
            if (isProcessorOption) {
                if (!disabled) {
                    enabledProcessorOptionIds.add(idTrimmed);
                } else {
                    disabledProcessorOptionIds.add(idTrimmed);
                }
            } else if (isTransformation) {
                if (!disabled) {
                    if (!preferred) {
                        selectedTransformationIds.add(idTrimmed);
                    } else {
                        preferredTransformationIds.add(idTrimmed);
                    }
                } else {
                    disabledTransformationIds.add(idTrimmed);
                }
            } else {
                // everything else is assumed a feature
                selectedFeatureIds.add(idTrimmed);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Serializes the selection to a (later) parsable string.
     * 
     * @return the string
     */
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for (String item : selectedFeatureIds) {
            if (returnString.length() != 0) {
                returnString.append(",");
            }
            returnString.append(item);
        }
        for (String item : selectedTransformationIds) {
            if (returnString.length() != 0) {
                returnString.append(",");
            }
            returnString.append("T_" + item);
        }
        for (String item : disabledTransformationIds) {
            if (returnString.length() != 0) {
                returnString.append(",");
            }
            returnString.append("!T_" + item);
        }
        for (String item : preferredTransformationIds) {
            if (returnString.length() != 0) {
                returnString.append(",");
            }
            returnString.append("*T_" + item);
        }
        for (String item : enabledProcessorOptionIds) {
            if (returnString.length() != 0) {
                returnString.append(",");
            }
            returnString.append("P_" + item);
        }
        for (String item : disabledProcessorOptionIds) {
            if (returnString.length() != 0) {
                returnString.append(",");
            }
            returnString.append("!P_" + item);
        }
        return returnString.toString();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    /**
     * Copies a list to another list.
     *
     * @param copyFrom the copy from
     * @param copyTo the copy to
     */
    private static void copyList(List<String> copyFrom, List<String> copyTo) {
        copyTo.clear();
        for (String item : copyFrom) {
            copyTo.add(item);
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the selected feature ids.
     * 
     * @return the selected feature ids
     */
    public List<String> getSelectedFeatureIds() {
        return selectedFeatureIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the selected transformation ids.
     * 
     * @return the selected transformation ids
     */
    public List<String> getSelectedTransformationIds() {
        return selectedTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the disabled transformation ids.
     * 
     * @return the disabled transformation ids
     */
    public List<String> getDisabledTransformationIds() {
        return disabledTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the preferred transformation ids.
     * 
     * @return the preferred transformation ids
     */
    public List<String> getPreferredTransformationIds() {
        return preferredTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the enabled processor option ids.
     * 
     * @return the enabled processor option ids
     */
    public List<String> getEnabledProcessorOptionIds() {
        return enabledProcessorOptionIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the disabled processor option ids.
     * 
     * @return the disabled processor option ids
     */
    public List<String> getDisabledProcessorOptionIds() {
        return disabledProcessorOptionIds;
    }

    // -------------------------------------------------------------------------
 
    /**
     * Sets the selected feature ids.
     *
     * @param selectedFeatureIds the new selected feature ids
     */
    public void setSelectedFeatureIds(List<String> selectedFeatureIds) {
        copyList(selectedFeatureIds, this.selectedFeatureIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the selected transformation ids.
     *
     * @param selectedTransformationIds the new selected transformation ids
     */
    public void setSelectedTransformationIds(List<String> selectedTransformationIds) {
        copyList(selectedTransformationIds, this.selectedTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the disabled transformation ids.
     *
     * @param disabledTransformationIds the new disabled transformation ids
     */
    public void setDisabledTransformationIds(List<String> disabledTransformationIds) {
        copyList(disabledTransformationIds, this.disabledTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the preferred transformation ids.
     *
     * @param preferredTransformationIds the new preferred transformation ids
     */
    public void setPreferredTransformationIds(List<String> preferredTransformationIds) {
        copyList(preferredTransformationIds, this.preferredTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the enabled processor option ids.
     *
     * @param enabledProcessorOptionIds the new enabled processor option ids
     */
    public void setEnabledProcessorOptionIds(List<String> enabledProcessorOptionIds) {
        copyList(enabledProcessorOptionIds, this.enabledProcessorOptionIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the disabled processor option ids.
     *
     * @param disabledProcessorOptionIds the new disabled processor option ids
     */
    public void setDisabledProcessorOptionIds(List<String> disabledProcessorOptionIds) {
        copyList(disabledProcessorOptionIds, this.disabledProcessorOptionIds);
    }

    // -------------------------------------------------------------------------
    
}
