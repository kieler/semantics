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
    SOFT_WRAPPING;

    @Override
    public String toString() {
        switch (this) {
        case NO:
            return "No";
        case TRUNCATE:
            return "Truncate";
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
        case SOFT_WRAPPING:
            return new SoftWrappingLabelManager();
        default:
            return null;
        }
    }
}
