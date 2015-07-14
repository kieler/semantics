/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
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

import com.google.common.collect.Sets;

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
     * The originally selected feature and transformation Ids. These define which transformations
     * are selected for compilation
     */
    private List<String> selectedFeatureAndTransformationIds = new ArrayList<String>();

    /** The optionally disabled transformation Ids. These transformations will be skipped. */
    private List<String> disabledTransformationIds = new ArrayList<String>();

    /**
     * The originally preferred transformation Ids. Specifically preferred transformations that are
     * selected if a feature is selected that multiple transformations can handle, like ABORT or
     * CODEGENERATION.
     */
    private List<String> preferredTransformationIds = new ArrayList<String>();

    /** The optionally enabled processor options. */
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
     * Returns true if there is nothing seletec.
     *
     * @return true, if successful
     */
    public boolean noSelection() {
       return (selectedFeatureAndTransformationIds.size() == 0);
    }
    
    // -------------------------------------------------------------------------

    /**
     * Clears all selection lists.
     */
    public void clear() {
        selectedFeatureAndTransformationIds.clear();
        disabledTransformationIds.clear();
        preferredTransformationIds.clear();
        enabledProcessorOptionIds.clear();
        disabledProcessorOptionIds.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Append a selection based on string arguments to the current selection.
     * 
     * @param stringArguments
     *            the string arguments
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
     * @param stringArguments
     *            the string arguments
     * @param clear
     *            the clear
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
            this.selectedFeatureAndTransformationIds.clear();
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
                        selectedFeatureAndTransformationIds.add("T_" + idTrimmed);
                    } else {
                        preferredTransformationIds.add(idTrimmed);
                    }
                } else {
                    disabledTransformationIds.add(idTrimmed);
                }
            } else {
                // everything else is assumed a feature
                selectedFeatureAndTransformationIds.add(idTrimmed);
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
        for (String item : selectedFeatureAndTransformationIds) {
            if (returnString.length() != 0) {
                returnString.append(",");
            }
            returnString.append(item);
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
     * @param copyFrom
     *            the copy from
     * @param copyTo
     *            the copy to
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
     * Gets the selected feature and transformation ids.
     * 
     * @return the selected feature and transformation ids
     */
    public List<String> getSelectedFeatureAndTransformationIds() {
        return selectedFeatureAndTransformationIds;
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
     * Sets the selected feature and transformation ids.
     * 
     * @param selectedFeatureAndTransformationIds
     *            the new selected feature and transformation ids
     */
    public void setSelectedFeatureAndTransformationIds(
            List<String> selectedFeatureAndTransformationIds) {
        copyList(selectedFeatureAndTransformationIds, this.selectedFeatureAndTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the disabled transformation ids.
     * 
     * @param disabledTransformationIds
     *            the new disabled transformation ids
     */
    public void setDisabledTransformationIds(List<String> disabledTransformationIds) {
        copyList(disabledTransformationIds, this.disabledTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the preferred transformation ids.
     * 
     * @param preferredTransformationIds
     *            the new preferred transformation ids
     */
    public void setPreferredTransformationIds(List<String> preferredTransformationIds) {
        copyList(preferredTransformationIds, this.preferredTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the enabled processor option ids.
     * 
     * @param enabledProcessorOptionIds
     *            the new enabled processor option ids
     */
    public void setEnabledProcessorOptionIds(List<String> enabledProcessorOptionIds) {
        copyList(enabledProcessorOptionIds, this.enabledProcessorOptionIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the disabled processor option ids.
     * 
     * @param disabledProcessorOptionIds
     *            the new disabled processor option ids
     */
    public void setDisabledProcessorOptionIds(List<String> disabledProcessorOptionIds) {
        copyList(disabledProcessorOptionIds, this.disabledProcessorOptionIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if feature is selected.
     * 
     * @param featureId
     *            the feature id
     * @return true, if is selected
     */
    public boolean isFeatureSelected(String featureId) {
        return this.selectedFeatureAndTransformationIds.contains(featureId);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if transformation is selected.
     * 
     * @param transformationId
     *            the transformation id
     * @return true, if is selected
     */
    public boolean isTransformationSelected(String transformationId) {
        return this.selectedFeatureAndTransformationIds.contains("T_" + transformationId);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if transformation is preferred.
     * 
     * @param transformationId
     *            the transformation id
     * @return true, if is transformation preferred
     */
    public boolean isTransformationPreferred(String transformationId) {
        return this.preferredTransformationIds.contains(transformationId);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if transformation is disabled.
     * 
     * @param transformationId
     *            the transformation id
     * @return true, if is transformation disabled
     */
    public boolean isTransformationDisabled(String transformationId) {
        return this.disabledTransformationIds.contains(transformationId);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if processor option is enabled.
     * 
     * @param processorOptionId
     *            the processor option id
     * @return true, if is processor option enabled
     */
    public boolean isProcessorOptionEnabled(String processorOptionId) {
        return this.enabledProcessorOptionIds.contains(processorOptionId);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if processor option is disabled.
     * 
     * @param processorOptionId
     *            the processor option id
     * @return true, if is processor option disabled
     */
    public boolean isProcessorOptionDisabled(String processorOptionId) {
        return this.disabledProcessorOptionIds.contains(processorOptionId);
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the feature or transformation or processor to the end of the given selection list if
     * it was part of this list. If it can be removed then true is returned. If there was no such
     * element to remove then false is returned.
     *
     * @param elementId the element id to add to the list
     * @param elementIdList the selection list to add the element id to
     * @return true, if successfully removed the elementId
     */
    public static boolean remove(String elementId, List<String> elementIdList) {
        for (String otherElementId : elementIdList) {
            if (otherElementId.equals(elementId)) {
                elementIdList.remove(otherElementId);
                return true;
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------
    /**
     * Adds the feature or transformation or processor to the end of the given selection list if it
     * is no already included, if the forced flag is set and the element is already in the list then
     * remove it and add it to the end.
     * 
     * @param elementId
     *            the element id to add to the list
     * @param elementIdList
     *            the selection list to add the element id to
     * @param forceAdding
     *            the force adding at the end of the list even if the element is already in
     */
    public static void add(String elementId, List<String> elementIdList, boolean forceAdding) {
        boolean found = elementIdList.contains(elementId);
        if (forceAdding && found) {
            remove(elementId, elementIdList);
        }
        if (!found || forceAdding) {
            elementIdList.add(elementId);
        }
    }

    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return selectedFeatureAndTransformationIds.isEmpty();
        }
        if(getClass() == obj.getClass()) {
            KielerCompilerSelection other = (KielerCompilerSelection) obj;
            return Sets.symmetricDifference(Sets.newHashSet(selectedFeatureAndTransformationIds), Sets.newHashSet(other.selectedFeatureAndTransformationIds)).isEmpty() &&
                   Sets.symmetricDifference(Sets.newHashSet(disabledTransformationIds), Sets.newHashSet(other.disabledTransformationIds)).isEmpty() &&
                   Sets.symmetricDifference(Sets.newHashSet(preferredTransformationIds), Sets.newHashSet(other.preferredTransformationIds)).isEmpty() &&
                   Sets.symmetricDifference(Sets.newHashSet(enabledProcessorOptionIds), Sets.newHashSet(other.enabledProcessorOptionIds)).isEmpty() &&
                   Sets.symmetricDifference(Sets.newHashSet(disabledProcessorOptionIds), Sets.newHashSet(other.disabledProcessorOptionIds)).isEmpty();                   
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public KielerCompilerSelection clone() {
        KielerCompilerSelection kcs = new KielerCompilerSelection();
        kcs.selectedFeatureAndTransformationIds.addAll(selectedFeatureAndTransformationIds);
        kcs.disabledTransformationIds.addAll(disabledTransformationIds);
        kcs.preferredTransformationIds.addAll(preferredTransformationIds);
        kcs.enabledProcessorOptionIds.addAll(enabledProcessorOptionIds);
        kcs.disabledProcessorOptionIds.addAll(disabledProcessorOptionIds);
        return kcs;
    }
    
    

}
