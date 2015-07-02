/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.tracing;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.klighd.SynthesisOption;

/**
 * Usage:
 * <p>
 * 1. In getDisplayedSynthesisOptions add TracingSynthesis.getSynthesisOption into the return list
 * of options.
 * <p>
 * 2. Make sure that all generated KGraphElemts are associated with their source elements. Use
 * associateWith. Otherwise these skipped model elements will be missing in the tracing
 * visualization.
 * <p>
 * 3. Mark the KNode associated with the root element of an model which is part of the
 * transformation chain with the following property (on KLayoutData):
 * setLayoutOption(TracingProperties.TRACED_MODEL_ROOT_NODE,true)
 * <p>
 * 4. Update your diagram with the TracingVisualizationUpdateStrategy. (ID:
 * de.cau.cs.kieler.kitt.klighd.update.TracingVisualizationUpdateStartegy)
 * 
 * @author als
 * @kieler.design 2014-08-19 proposed
 * @kieler.rating 2014-08-19 proposed yellow
 * 
 */
public final class TracingSynthesisOption {

    public enum TracingMode {
        NO_TRACING, MODEL_TRACING, ELEMENT_TRACING;

        /**
         * {@inheritDoc}
         */
        public String toString() {
            switch (this) {
            case NO_TRACING:
                return "No Tracing";
            case MODEL_TRACING:
                return "Model Tracing";
            case ELEMENT_TRACING:
                return "Element Tracing";
            default:
                return null;
            }
        }

        /**
         * Return TracingMode of given string representation. Checks if given object is a string
         * matching the toString results of any tracing mode.
         * 
         * @param obj
         *            the Object to check.
         * @return TracingMode matching the given objects or null.
         * 
         */
        public static TracingMode getTracingMode(Object obj) {
            if (obj instanceof TracingMode) {
                return (TracingMode) obj;
            } else if (obj.equals(NO_TRACING.toString())) {
                return NO_TRACING;
            } else if (obj.equals(MODEL_TRACING.toString())) {
                return MODEL_TRACING;
            } else if (obj.equals(ELEMENT_TRACING.toString())) {
                return ELEMENT_TRACING;
            } else {
                return null;
            }
        }
    }

    /**
     * Privates constructor to prevent instantiation.
     */
    private TracingSynthesisOption() {
    }

    /** Global tracing synthesis option */
    private static SynthesisOption option = SynthesisOption.createChoiceOption(
            "Tracing",
            Lists.newArrayList(TracingMode.NO_TRACING.toString(),
                    TracingMode.ELEMENT_TRACING.toString(), TracingMode.MODEL_TRACING.toString()),
            TracingMode.NO_TRACING.toString());

    /**
     * Returns the static SynthesisOption used in syntheses.
     * 
     * @return the synthesis option
     */
    public static SynthesisOption getSynthesisOption() {
        return option;
    }
}
