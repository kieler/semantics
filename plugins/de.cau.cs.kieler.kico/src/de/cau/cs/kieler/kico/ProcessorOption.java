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

/**
 * An processor option is mainly a reference to a processor. Additionally there can be defined an ID
 * to switch the option on or off together with a default value whether the option is active or not
 * (if it is not switched on or off specifically.
 * 
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 * 
 */
class ProcessorOption {

    /** The id of the processor. */
    private String processorId;

    /**
     * The optional switchId string can be used to switch the processor option on or off in a
     * compile call.
     */
    private String switchId;

    /**
     * The defaultActive flag tells if the processor is active by default. Note that the processor
     * needs to be optional, otherwise defaultActive will be ignored.
     */
    private boolean defaultActive;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new processor option. This processor option cannot be switched off and hence
     * has no switchId.
     * 
     * @param processorId
     *            the id
     * @param switchId
     *            the optional
     * @param defaultActive
     *            the default active
     */
    public ProcessorOption(String processorId) {
        this.processorId = processorId;
        this.switchId = null;
        this.defaultActive = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new processor option. The optional switchId string can be used to switch the
     * processor option on or off in a compile call. The defaultActive flag tells if the processor
     * is active by default. Note that the processor needs to be optional, otherwise defaultActive
     * will be ignored.
     * 
     * @param processorId
     *            the id
     * @param switchId
     *            the optional
     * @param defaultActive
     *            the default active
     */
    public ProcessorOption(String processorId, String switchId, boolean defaultActive) {
        this.processorId = processorId;
        this.switchId = switchId;
        this.defaultActive = defaultActive;
    }

    // -------------------------------------------------------------------------

    /**
     * The identifier of the processor id.
     * 
     * @return the string
     */
    public String getProcessorId() {
        return processorId;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns whether the processor is optional in this context.
     * 
     * @return true, if is optional
     */
    public boolean isOptional() {
        return (switchId != null);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the optional switchId string which can be used to switch the processor option on or off
     * in a compile call.
     * 
     * @return the switch id
     */
    public String getSwitchId() {
        return switchId;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns whether the processor is active by default if it is an optional processor in this
     * context.
     * 
     * @return true, if is optional
     */
    public boolean isDefaultActive() {
        return defaultActive;
    }

    // -------------------------------------------------------------------------
}
