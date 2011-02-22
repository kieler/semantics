/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kiml.LayoutOptionData;
import de.cau.cs.kieler.kiml.SemanticLayoutConfig;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * A layout configuration that excludes scope actions from layout. This should become obsolete
 * when the interface declaration is done using Xtext.
 *
 * @author msp
 */
public class ActionLayoutConfig extends SemanticLayoutConfig {

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<LayoutOptionData<?>> getOptionData(final EObject semanticElem) {
        if (!(semanticElem instanceof Transition)) {
            return makeList(LayoutOptions.NO_LAYOUT_ID);
        }
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getSemanticProperty(final EObject semanticElem,
            final LayoutOptionData<?> layoutOption) {
        if (layoutOption.getId().equals(LayoutOptions.NO_LAYOUT_ID)
                && !(semanticElem instanceof Transition)) {
            return true;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void setSemanticProperty(final EObject semanticElem,
            final LayoutOptionData<?> layoutOption, final Object value) {
        // not supported by this layout configuration
    }

}
