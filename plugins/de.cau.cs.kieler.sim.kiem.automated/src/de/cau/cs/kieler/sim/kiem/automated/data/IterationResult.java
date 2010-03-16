/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.automated.data;

import de.cau.cs.kieler.sim.kiem.automated.IAutomatedComponent;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * This class contains the result of one iteration. It contains at least the
 * following information:<BR>
 * The name of the model file<BR>
 * The index of the iteration<BR>
 * The step number on which the execution finished<BR>
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class IterationResult extends AbstractResult {

    /** The status that the execution is currently at. */
    private IterationStatus status;

    /** Identifier for the message field. */
    public static final String MESSAGE = "Message";

    // --------------------------------------------------------------------------

    /**
     * Creates a new IterationResult.
     * 
     * @param modelFile
     *            the model file.
     * @param iteration
     *            the index of the execution;
     */
    public IterationResult(final String modelFile, final int iteration) {
        super();
        super.addResult(new KiemProperty(IAutomatedComponent.MODEL_FILE,
                modelFile));
        super.addResult(new KiemProperty(IAutomatedComponent.ITERATION,
                iteration + ""));
        super.addResult(new KiemProperty(IAutomatedComponent.STATUS,
                IterationStatus.labelOf(IterationStatus.CREATED)));
        super.addResult(new KiemProperty(IterationResult.MESSAGE, ""));
        this.status = IterationStatus.CREATED;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the status.
     * 
     * @return the status
     */
    public IterationStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for the status.
     * 
     * @param statusParam
     *            the status to set
     */
    public void setStatus(final IterationStatus statusParam) {
        String value = IterationStatus.labelOf(statusParam);

        for (KiemProperty prop : super.getResults()) {
            if (prop.getKey().equals(IAutomatedComponent.STATUS)) {
                prop.setValue(value);
            }
        }
        this.status = statusParam;
    }

    /**
     * Set the message on the result.
     * 
     * @param message
     *            the message
     */
    public void setMessage(final String message) {
        for (KiemProperty prop : super.getResults()) {
            if (prop.getKey().equals(IterationResult.MESSAGE)) {
                prop.setValue(message);
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * This enumeration contains the different states that an execution can be
     * in from the point of view of the iteration result.
     * 
     * 
     * @author soh
     * @kieler.rating 2010-01-29 proposed yellow
     */
    public enum IterationStatus {

        /** The execution was just created. */
        CREATED,
        /** The execution is running. */
        RUNNING,
        /** The execution is finished. */
        DONE,
        /** The execution was aborted due to an error. */
        ERROR,
        /** The execution was canceled by the user. */
        ABORTED;

        // --------------------------------------------------------------------------

        /**
         * Get a readable String for the given status.
         * 
         * @param status
         *            the status
         * @return the name
         */
        public static String labelOf(final IterationStatus status) {
            switch (status) {
            case CREATED:
                return "Created";
            case RUNNING:
                return "Running";
            case DONE:
                return "Done";
            case ERROR:
                return "Failed";
            case ABORTED:
                return "Aborted";
            }
            return "Error";
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

}
