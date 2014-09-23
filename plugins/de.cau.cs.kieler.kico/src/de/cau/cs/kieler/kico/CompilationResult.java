/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.util.Pair;

/**
 * This class is the extended version of the transformation result including intermediate results
 * and all processed transformation IDs. By convention the first intermediate result should always
 * be the source model.
 * 
 * @author cmot ssm
 * @kieler.design 2014-05-21 proposed
 * @kieler.rating 2014-05-21 proposed yellow
 * 
 */
public class CompilationResult {

    /** The executed transformations. */
    private List<String> transformations = new ArrayList<String>();

    /** The intermediate results. */
    private List<Object> intermediateResults = new ArrayList<Object>();

    /** The postponed error list transformation id. */
    private List<KielerCompilerException> postponedErrors =
            new ArrayList<KielerCompilerException>();

    /** The postponed error list transformation id. */
    private List<KielerCompilerException> postponedWarnings =
            new ArrayList<KielerCompilerException>();

    /** All last/occurred errors processed for this compilation. */
    private String allErrors = null;

    /** All last/occurred warnings processed for this compilation. */
    private String allWarnings = null;
    
    /** Ancillary data. */
    private List<AbstractKielerCompilerAncillaryData> ancillaryData = 
            new ArrayList<AbstractKielerCompilerAncillaryData>();

    /**
     * Indicates that the compilation is done and no further compilation steps are needed or
     * possible.
     */
    private boolean currentTransformationdone = false;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new compilation result. By convention the first intermediate result should
     * always be the source model. Using this constructor is only advised if you do not intent to
     * compile but only want to calculate pre requirements.
     * 
     * @param sourceModel
     *            the source model
     */
    public CompilationResult() {
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new compilation result. By convention the first intermediate result should
     * always be the source model.
     * 
     * @param sourceModel
     *            the source model
     */
    public CompilationResult(EObject sourceModel) {
        intermediateResults.add(sourceModel);
    }

    // -------------------------------------------------------------------------

    /**
     * Access all intermediate results.
     * 
     * @return the intermediate results
     */
    public List<Object> getIntermediateResults() {
        return intermediateResults;
    }

    // -------------------------------------------------------------------------

    /**
     * Access the processed transformations in order.
     * 
     * @return the transformations
     */
    public List<String> getTransformations() {
        return transformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last transformation result as an Object. Returns null if there is no transformation
     * result at all.
     * 
     * @return the e object
     */
    public Object getObject() {
        if (intermediateResults.size() > 0) {
            Object lastResult = intermediateResults.get(intermediateResults.size() - 1);
            return lastResult;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last transformation result as an EObject. Returns null if there is no transformation
     * result at all or if the last transformation result is not an EObject.
     * 
     * @return the EObject
     */
    public EObject getEObject() {
        Object lastResult = getObject();
        if (lastResult instanceof EObject) {
            return (EObject) lastResult;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last transformation result as String. Returns null if there is no transformation
     * result at all or if the last transformation result is not String.
     * 
     * @return the String
     */
    public String getString() {
        Object lastResult = getObject();
        if (lastResult instanceof String) {
            return (String) lastResult;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the postponed error.
     * 
     * @param exception
     *            the KielerCompilerException
     */
    public void addPostponedError(KielerCompilerException exception) {
        this.postponedErrors.add(exception);
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the postponed warning.
     * 
     * @param exception
     *            the KielerCompilerException
     */
    public void addPostponedWarning(KielerCompilerException exception) {
        this.postponedWarnings.add(exception);
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all postponed warnings.
     */
    public void resetPostponedWarnings() {
        this.postponedWarnings.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all postponed errors.
     */
    public void resetPostponedErrors() {
        this.postponedErrors.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Process all postponed warnings and put them to the warnings log also building the resulting
     * warning String.
     * 
     */
    public void processPostponedWarnings() {
        for (KielerCompilerException exception : postponedWarnings) {
            String transformationID = exception.getTransformationID();

            if (allWarnings != null) {
                allWarnings += ", ";
            } else {
                allWarnings = "";
            }
            allWarnings += exception.getStackTraceString();

            KiCoPlugin.getInstance().showWarning(
                    "An warning occurred while calling transformation with the ID '"
                            + transformationID + "'.", KiCoPlugin.PLUGIN_ID, exception, true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Process all postponed errors and put them to the error log also building the resulting error
     * String.
     * 
     */
    public void processPostponedErrors() {
        for (KielerCompilerException exception : postponedErrors) {
            String transformationID = exception.getTransformationID();

            if (allErrors != null) {
                allErrors += ", ";
            } else {
                allErrors = "";
            }
            allErrors += exception.getStackTraceString();

            KiCoPlugin.getInstance().showError(
                    "An error occurred while calling transformation with the ID '"
                            + transformationID + "'.", KiCoPlugin.PLUGIN_ID, exception, true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the all errors.
     * 
     * @return the allErrors
     */
    public String getAllErrors() {
        return allErrors;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the all warnings.
     * 
     * @return the allWarnings
     */
    public String getAllWarnings() {
        return allWarnings;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the postponed errors.
     * 
     * @return the postponedErrors
     */
    public List<KielerCompilerException> getPostponedErrors() {
        return postponedErrors;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the postponed warnings.
     * 
     * @return the postponedWarnings
     */
    public List<KielerCompilerException> getPostponedWarnings() {
        return postponedWarnings;
    }

    // -------------------------------------------------------------------------

    /**
     * Internally used to check if the current compilation step is complete.
     * 
     * @return the done
     */
    public boolean isCurrentTransformationDone() {
        return currentTransformationdone;
    }

    // -------------------------------------------------------------------------

    /**
     * Internally used to set when the current compilation step is complete. Do NOT use this method.
     * 
     * @param done
     *            the done to set
     */
    public void setCurrentTransformationDone(boolean done) {
        this.currentTransformationdone = done;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the resource extension for an intermediate result. Note that for this method to work
     * there must be a plugin that uses the extension point de.cau.cs.kieler.kico.extension to
     * register a resource/file extension for a specific class name that is the (intermediate)
     * result of one or several performed transformations. If no resource extension is registered
     * for the class name of the intermediateResult given, then null is returned.
     * 
     * @param intermediateResult
     *            the intermediate result
     * @return the resource extension
     */
    public String getResourceExtension(Object intermediateResult) {
        HashMap<String, Pair<String, Boolean>> resourceExtensionMap =
                KiCoPlugin.getInstance().getRegisteredResourceExtensions(false);
        Pair<String, Boolean> specificExtension =
                resourceExtensionMap.get(intermediateResult.getClass().getName());
        if (specificExtension != null) {
            return specificExtension.getFirst();
        }
        return null;
    }

    /**
     * @return the ancillaryData
     */
    public List<AbstractKielerCompilerAncillaryData> getAncillaryData() {
        return ancillaryData;
    }

    /**
     * @param ancillaryData the ancillaryData to set
     */
    public void setAncillaryData(List<AbstractKielerCompilerAncillaryData> ancillaryData) {
        this.ancillaryData = ancillaryData;
    }

    // -------------------------------------------------------------------------

}
