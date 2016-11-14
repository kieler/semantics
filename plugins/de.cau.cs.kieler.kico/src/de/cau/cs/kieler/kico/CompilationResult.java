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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;

import de.cau.cs.kieler.kico.internal.Timing;

/**
 * This class is the extended version of the transformation result including intermediate results
 * and all processed transformation IDs. By convention the first intermediate result should always
 * be the source model.
 * 
 * @author cmot ssm
 * @kieler.design 2015-03-11 proposed
 * @kieler.rating 2015-03-11 proposed yellow
 * 
 */
public class CompilationResult {

    /** The intermediate results. */
    private List<TransformationIntermediateResult> intermediateResults = new ArrayList<TransformationIntermediateResult>();

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
    
    /** Auxiliary data. */
    private Set<AbstractKielerCompilerAuxiliaryData> auxiliaryData = 
            new HashSet<AbstractKielerCompilerAuxiliaryData>();
    
    /** Compilation duration data */
    private Map<String, Timing> compilationDurationData =
    		new HashMap<String, Timing>();

    /**
     * Indicates that the compilation is done and no further compilation steps are needed or
     * possible.
     */
    private boolean currentTransformationDone = false;

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
        clear(sourceModel);
    }

    // -------------------------------------------------------------------------
    
    /**
     * Clear with providing a new source model as the FIRST intermediate result by convention.
     *
     * @param sourceModel the source model
     */
    public void clear(EObject sourceModel) {
        intermediateResults.clear();
        TransformationIntermediateResult intermediateResult = new TransformationIntermediateResult();
        intermediateResult.setId("");
        intermediateResult.setResult(sourceModel);
        intermediateResults.add(intermediateResult);
    }

    // -------------------------------------------------------------------------

    /**
     * Access all transformation intermediate results.
     * 
     * @return the intermediate results
     */
    public List<TransformationIntermediateResult> getTransformationIntermediateResults() {
        return intermediateResults;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Adds a new transformation intermediate result for a given transformation ID.
     *
     * @param transformationID the transformation id
     * @return the intermediate result
     */
    public TransformationIntermediateResult addTransformationIntermediateResult(String transformationID) {
        TransformationIntermediateResult intermediateResult = new TransformationIntermediateResult();
        intermediateResult.setId(transformationID);
        intermediateResults.add(intermediateResult);
        return intermediateResult;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the last transformation intermediate transformation result. Returns null if there is no transformation
     * result at all.
     * 
     * @return the e object
     */
    public TransformationIntermediateResult getLastIntermediateResult() {
        if (intermediateResults.size() > 0) {
            TransformationIntermediateResult lastResult = intermediateResults.get(intermediateResults.size() - 1);
            return lastResult;
        }
        return null;
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * Gets the first transformation intermediate transformation result. Returns null if there is no transformation
     * result at all.
     * 
     * @return the e object
     */
    public TransformationIntermediateResult getFirstIntermediateResult() {
        if (intermediateResults.size() > 0) {
            TransformationIntermediateResult lastResult = intermediateResults.get(0);
            return lastResult;
        }
        return null;
    }


    // -------------------------------------------------------------------------

    /**
     * Gets the last transformation result object. Returns null if there is no transformation
     * result at all.
     * 
     * @return the e object
     */
    public Object getObject() {
        IntermediateResult intermediateResult = getLastIntermediateResult();
        if (intermediateResult != null) {
            return intermediateResult.getResult();
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the first transformation result object which by convention must be the
     * getTransformationObject. Returns null if there is no transformation
     * result at all.
     * 
     * @return the e object
     */
    public Object getTransformationObject() {
        TransformationIntermediateResult intermediateResult = getFirstIntermediateResult();
        if (intermediateResult != null) {
            return intermediateResult.getResult();
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
    public void processPostponedWarnings(boolean silent) {
        for (KielerCompilerException exception : postponedWarnings) {
            String transformationID = exception.getTransformationId();

            if (allWarnings != null) {
                allWarnings += ", ";
            } else {
                allWarnings = "";
            }
            allWarnings += exception.getStackTraceString();

            if (!silent) {
                KiCoPlugin.getInstance().showWarning(
                        "A warning occurred while calling transformation with the ID '"
                                + transformationID + "'." + "\n\n" + allWarnings , KiCoPlugin.PLUGIN_ID, exception, true);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Process all postponed errors and put them to the error log also building the resulting error
     * String.
     * 
     */
    public void processPostponedErrors(boolean silent) {
        for (KielerCompilerException exception : postponedErrors) {
            String transformationID = exception.getTransformationId();

            if (allErrors != null) {
                allErrors += ", ";
            } else {
                allErrors = "";
            }
            allErrors += exception.getStackTraceString();

            if (!silent) {
                KiCoPlugin.getInstance().showError(
                        "An error occurred while calling transformation with the ID '"
                                + transformationID + "'." + "\n\n" + allErrors, KiCoPlugin.PLUGIN_ID, exception, true);
            }
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
        return currentTransformationDone;
    }

    // -------------------------------------------------------------------------

    /**
     * Internally used to set when the current compilation step is complete. Do NOT use this method.
     * 
     * @param done
     *            the done to set
     */
    public void setCurrentTransformationDone(boolean done) {
        this.currentTransformationDone = done;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the auxiliary data by its type.
     * 
     * @param type
     * @return collection of auxiliary data with matching type
     */
    @SuppressWarnings("unchecked")
    public <T extends AbstractKielerCompilerAuxiliaryData> List<T> getAuxiliaryData(Class<T> type) {
        return new ArrayList<T>((Collection<T>) Collections2.filter(auxiliaryData, Predicates.instanceOf(type)));
    }

    /**
     * Adds given auxiliary data.
     *
     * @param data
     *            new data to add to set
     * @return true if the data set did not already contain the data
     */
    public boolean addAuxiliaryData(AbstractKielerCompilerAuxiliaryData data) {
        return auxiliaryData.add(data);
    }

    /**
     * Removed given auxiliary data if existing
     *
     * @param data
     *            to remove from set
     * @return true if this set contained the specified element
     */
    public boolean removeAuxiliaryData(AbstractKielerCompilerAuxiliaryData data) {
        return auxiliaryData.remove(data);
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new timing instance.
     * 
     * @param timingId
     * @return New timing instance
     */
    public Timing createTiming(String timingId) {
    	compilationDurationData.put(timingId, new Timing());
    	return getTiming(timingId);
    }
    
    /**
     * Returns a timing instance.
     * 
     * @param timingId
     * @return The timing instance
     */
    public Timing getTiming(String timingId) {
    	return compilationDurationData.get(timingId);
    }
}
