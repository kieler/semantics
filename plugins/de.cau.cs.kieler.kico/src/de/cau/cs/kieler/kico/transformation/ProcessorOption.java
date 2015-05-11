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
package de.cau.cs.kieler.kico.transformation;

/**
 * An processor option is mainly a reference to a processor. Additionally there can be defined an ID
 * to switch the option on or off together with a default value whether the option is enabled or not
 * (if it is not switched on or off specifically.
 * 
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 * 
 */
public class ProcessorOption {

    /** The id of the processor. */
    private String processorId;

    /**
     * The optional processorOptionId string can be used to switch the processor option on or off in
     * a compile call.
     */
    private String processorOptionId;

    /**
     * The defaultEnabled flag tells if the processor is enabled by default. Note that the processor
     * needs to be optional, otherwise defaultEnabled will be ignored.
     */
    private boolean defaultEnabled;

    /** The default this processor option. */
    private static ProcessorOption defaultThisProcessorOption = null;

    // -------------------------------------------------------------------------

    /**
     * Returns the single default this processor option that is used in transformations to refer to
     * the transformation method.
     * 
     * @return the default this processor option
     */
    public static ProcessorOption getDefaultThisProcessorOption() {
        if (defaultThisProcessorOption == null) {
            defaultThisProcessorOption =
                    new ProcessorOption("TRANSFORMATION_METHOD");
        }
        return defaultThisProcessorOption;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new processor option. This processor option cannot be switched off and hence
     * has no switchId.
     * 
     * @param processorId
     *            the id
     * @param processorOptionId
     *            the optional
     * @param defaultEnabled
     *            the default enabled
     */
    public ProcessorOption(String processorId) {
        this.processorId = processorId;
        this.processorOptionId = null;
        this.defaultEnabled = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new processor option. The optional processorOptionId string can be used to
     * switch the processor option on or off explicitly in a compile call. The defaultEnabled flag
     * tells if the processor is enabled by default. Note that the processor needs to be optional,
     * otherwise defaultEnabled will be ignored.
     * 
     * @param processorId
     *            the id
     * @param switchId
     *            the optional
     * @param defaultEnabled
     *            the default enabled
     */
    public ProcessorOption(String processorId, String processorOptionId, boolean defaultEnabled) {
        this.processorId = processorId;
        this.processorOptionId = processorOptionId;
        this.defaultEnabled = defaultEnabled;
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
     * Returns whether the processor is optional in this context and can be switched on or off by
     * its processorOptionId.
     * 
     * @return true, if is optional
     */
    public boolean isOptional() {
        return (processorOptionId != null);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the optional processorOptionId string which can be used to switch the processor option
     * on or off in a compile call.
     * 
     * @return the switch id
     */
    public String getProcessorOptionId() {
        return processorOptionId;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns whether the processor is enabled by default if it is an optional processor in this
     * context.
     * 
     * @return true, if is optional
     */
    public boolean isDefaultEnabled() {
        return defaultEnabled;
    }

    // -------------------------------------------------------------------------
}
