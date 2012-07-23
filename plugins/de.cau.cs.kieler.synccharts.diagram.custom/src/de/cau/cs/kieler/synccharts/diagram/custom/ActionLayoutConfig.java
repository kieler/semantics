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

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.kiml.LayoutOptionData;
import de.cau.cs.kieler.kiml.config.SemanticLayoutConfig;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * A layout configuration that excludes scope actions from layout. This should become obsolete
 * when the interface declaration is done using Xtext.
 *
 * @author msp
 * @kieler.ignore (excluded from review process)
 */
public class ActionLayoutConfig extends SemanticLayoutConfig {

    /**
     * {@inheritDoc}
     */
    @Override
    protected IProperty<?>[] getAffectedOptions(final EObject semanticElem) {
        if (!(semanticElem instanceof Transition)) {
            return new IProperty<?>[] { LayoutOptions.NO_LAYOUT };
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getSemanticValue(final EObject semanticElem,
            final LayoutOptionData<?> layoutOption) {
        if (layoutOption.getId().equals(LayoutOptions.NO_LAYOUT.getId())
                && !(semanticElem instanceof Transition)) {
            return true;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void setSemanticValue(final EObject semanticElem,
            final LayoutOptionData<?> layoutOption, final Object value) {
        // not supported by this layout configuration
    }

}
