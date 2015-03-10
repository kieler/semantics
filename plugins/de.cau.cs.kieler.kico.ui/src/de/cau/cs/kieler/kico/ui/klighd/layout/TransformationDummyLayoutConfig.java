/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui.klighd.layout;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.kiml.LayoutOptionData;
import de.cau.cs.kieler.kiml.config.SemanticLayoutConfig;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kico.FeatureDummy;

/**
 * TransformationDummy layout configuration class.
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 * 
 */
public class TransformationDummyLayoutConfig extends SemanticLayoutConfig {

    /** the priority for this semantic layout configuration. */
    public static final int PRIORITY = 100;

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPriority() {
        return PRIORITY;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected IProperty<?>[] getAffectedOptions(final Object semanticElem) {
        if (semanticElem instanceof FeatureDummy) {
            return new IProperty<?>[] { LayoutOptions.ALGORITHM, LayoutOptions.SPACING };
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getSemanticValue(final Object semanticElem, final LayoutOptionData layoutOption) {
        if (semanticElem instanceof FeatureDummy) {
            if (layoutOption.equals(LayoutOptions.SPACING)) {
                return 0f;
            }
            if (layoutOption.equals(LayoutOptions.ALGORITHM)) {
                return "de.cau.cs.kieler.klay.layered";
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected void setSemanticValue(final Object semanticElem, final LayoutOptionData layoutOption,
            final Object value) {
        // not supported by this layout configuration
    }
}
