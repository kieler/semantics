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
package de.cau.cs.kieler.sccharts.ui.synthesis.labels;

import de.cau.cs.kieler.klighd.labels.management.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.labels.management.IdentLabelManager;
import de.cau.cs.kieler.klighd.labels.management.SoftWrappingLabelManager;
import de.cau.cs.kieler.klighd.labels.management.TruncatingLabelManager;

/**
 * @author als
 * @kieler.design 2015-11-19 proposed
 * @kieler.rating 2015-11-19 proposed yellow
 */
public enum LabelShorteningStrategies {
    NO,
    TRUNCATE,
    TRUNCATE_VARIABLES,
    VARIABLES,
    PRIORITIES,
    SOFT_WRAPPING,
    SEMANTIC_SOFT_WRAPPING;

    @Override
    public String toString() {
        switch (this) {
        case NO:
            return "Original Labels";
        case TRUNCATE:
            return "Truncate";
        case TRUNCATE_VARIABLES:
            return "Truncate Variables";
        case VARIABLES:
            return "Used Variables";
        case PRIORITIES:
            return "Priorities";
        case SOFT_WRAPPING:
            return "Soft Wrapping";
        case SEMANTIC_SOFT_WRAPPING:
            return "Semantic Soft Wrapping";
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
        case VARIABLES:
            return new ShortenToSignalsLabelManager();
        case PRIORITIES:
            return new TransitionPriorityLabelManager();
        case SOFT_WRAPPING:
            return new SoftWrappingLabelManager();
        case SEMANTIC_SOFT_WRAPPING:
            return new SemanticSoftWrappingLabelManager();
        default:
            return null;
        }
    }
}
