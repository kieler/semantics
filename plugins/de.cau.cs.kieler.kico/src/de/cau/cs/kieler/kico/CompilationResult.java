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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * This class is the extended version of the transformation result including intermediate results
 * and all processed transformation IDs. By convention the first intermediate result should always
 * be the source model.
 * 
 * @author cmot
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
    private ArrayList<String> postponedErrorsTransformationID = new ArrayList<String>();

    /** The postponed error list exception. */
    private ArrayList<Exception> postponedErrors = new ArrayList<Exception>();

    /** The postponed error list transformation id. */
    private ArrayList<String> postponedWarningsTransformationID = new ArrayList<String>();

    /** The postponed error list exception. */
    private ArrayList<Exception> postponedWarnings = new ArrayList<Exception>();

    /** All last/occurred errors processed for this compilation. */
    private String allErrors = null;

    /** All last/occurred warnings processed for this compilation. */
    private String allWarnings = null;

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
     * Gets the last transformation result as an EObject. Returns null if there is no transformation
     * result at all or if the last transformation result is not an EObject.
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
     * @param transformationID
     *            the transformation ID
     * @param exception
     *            the exception
     */
    public void addPostponedError(String transformationID, Exception exception) {
        this.postponedErrorsTransformationID.add(transformationID);
        this.postponedErrors.add(exception);
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the postponed warning.
     * 
     * @param transformationID
     *            the transformation ID
     * @param exception
     *            the exception
     */
    public void addPostponedWarning(String transformationID, Exception exception) {
        this.postponedWarningsTransformationID.add(transformationID);
        this.postponedWarnings.add(exception);
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all postponed warnings.
     */
    public void resetPostponedWarnings() {
        this.postponedWarningsTransformationID.clear();
        this.postponedWarnings.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all postponed errors.
     */
    public void resetPostponedErrors() {
        this.postponedErrorsTransformationID.clear();
        this.postponedErrors.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Process all postponed warnings and put them to the warnings log also building the resulting
     * warning String.
     * 
     */
    public void processPostponedWarnings() {
        for (int c = 0; c < postponedWarningsTransformationID.size(); c++) {
            String transformationID = postponedWarningsTransformationID.get(c);
            Exception e = postponedWarnings.get(c);

            if (allWarnings != null) {
                allWarnings += ", ";
            } else {
                allWarnings = "";
            }
            allWarnings += getErrorMessage(e);

            KiCoPlugin.getInstance().showWarning(
                    "An warning occurred while calling transformation with the ID '"
                            + transformationID + "'.", KiCoPlugin.PLUGIN_ID, e, true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Process all postponed errors and put them to the error log also building the resulting error
     * String.
     * 
     */
    public void processPostponedErrors() {
        for (int c = 0; c < postponedErrorsTransformationID.size(); c++) {
            String transformationID = postponedErrorsTransformationID.get(c);
            Exception e = postponedErrors.get(c);

            if (allErrors != null) {
                allErrors += ", ";
            } else {
                allErrors = "";
            }
            allErrors += getErrorMessage(e);

            KiCoPlugin.getInstance().showError(
                    "An error occurred while calling transformation with the ID '"
                            + transformationID + "'.", KiCoPlugin.PLUGIN_ID, e, true);
        }
    }

    // -------------------------------------------------------------------------

    private String getErrorMessage(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString(); // stack trace as a string
    }

    // -------------------------------------------------------------------------

    /**
     * @return the allErrors
     */
    public String getAllErrors() {
        return allErrors;
    }

    // -------------------------------------------------------------------------

    /**
     * @return the allWarnings
     */
    public String getAllWarnings() {
        return allWarnings;
    }

    // -------------------------------------------------------------------------

}
