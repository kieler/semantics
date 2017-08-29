/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.labels;

import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.labels.IdentLabelManager;
import de.cau.cs.kieler.klighd.labels.ListLabelManager;
import de.cau.cs.kieler.klighd.labels.TruncatingLabelManager;

/**
 * @author als
 * @kieler.design 2015-11-19 proposed
 * @kieler.rating 2015-11-19 proposed yellow
 */
public enum LabelShorteningStrategies {
    NO,
    TRUNCATE,
    TRUNCATE_VARIABLES,
    HOSTCODE_ARGUMENTS,
    TRIGGER_EFFECT,
    VARIABLES,
    PRIORITIES,
    MIXED,
    SOFT_WRAPPING;

    @Override
    public String toString() {
        switch (this) {
        case NO:
            return "No";
        case TRUNCATE:
            return "Truncate";
        case TRUNCATE_VARIABLES:
            return "Truncate Variables";
        case HOSTCODE_ARGUMENTS:
            return "Hostcode Arguments";
        case TRIGGER_EFFECT:
            return "Trigger and Effect Wrapping";
        case VARIABLES:
            return "Used Variables";
        case PRIORITIES:
            return "Priorities";
        case MIXED:
            return "Mixed (Truncate Variables + Hostcode Arguments + Trigger and Effect Wrapping)";
        case SOFT_WRAPPING:
            return "Soft Wrapping";
        default:
            return "";
        }
    }

    public AbstractKlighdLabelManager getNewLabelManager() {
        switch (this) {
        case NO:
            return new IdentLabelManager();
        case TRUNCATE:
            return new TruncatingLabelManager();
        case TRUNCATE_VARIABLES:
            return new TruncateSignalsLabelManager();
        case HOSTCODE_ARGUMENTS:
            return new HostCodeTransitionLabelManager();
        case TRIGGER_EFFECT:
            return new SemanticalWrappingTransitionLabelManager();
        case VARIABLES:
            return new ShortenToSignalsLabelManager();
        case PRIORITIES:
            return new TransitionPriorityLabelManager();
        case MIXED:
            return new ListLabelManager(false, new ShortenToSignalsLabelManager(),
                    new HostCodeTransitionLabelManager(),
                    new SemanticalWrappingTransitionLabelManager());
        case SOFT_WRAPPING:
            return new de.cau.cs.kieler.klighd.labels.SoftWrappingLabelManager();
        default:
            return null;
        }
    }
}
