/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.layout;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.kiml.LayoutOptionData;
import de.cau.cs.kieler.kiml.config.SemanticLayoutConfig;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.DataflowRegion;
import de.cau.cs.kieler.sccharts.State;

/**
 * @author chsch
 *
 */
public class RegionLayoutConfig extends SemanticLayoutConfig{


    /** the priority for this semantic layout configuration. */
    public static final int PRIORITY = 100;

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPriority() {
        return PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IProperty<?>[] getAffectedOptions(final Object semanticElem) {
        if (semanticElem instanceof State) {
            return new IProperty<?>[] { LayoutOptions.ALGORITHM, LayoutOptions.SPACING };
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getSemanticValue(final Object semanticElem,
            final LayoutOptionData layoutOption) {
        if (semanticElem instanceof State) {
            if (layoutOption.equals(LayoutOptions.SPACING)) {
                return 1f;
            }
            if (layoutOption.equals(LayoutOptions.ALGORITHM)) {
                return "de.cau.cs.kieler.box";
            }
        }
        if (semanticElem instanceof ControlflowRegion) {
            if (layoutOption.equals(LayoutOptions.ALGORITHM)) {
                return "de.cau.cs.kieler.graphviz.dot";
            }
        }       
        if (semanticElem instanceof DataflowRegion) {
            if (layoutOption.equals(LayoutOptions.ALGORITHM)) {
                return "de.cau.cs.kieler.klay.layered";
            }
        }          
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void setSemanticValue(final Object semanticElem,
            final LayoutOptionData layoutOption, final Object value) {
        // not supported by this layout configuration
    }}
