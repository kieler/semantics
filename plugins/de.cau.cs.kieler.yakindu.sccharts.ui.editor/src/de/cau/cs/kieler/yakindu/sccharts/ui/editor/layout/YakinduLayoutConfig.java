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
package de.cau.cs.kieler.yakindu.sccharts.ui.editor.layout;

import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.model.sgraph.Region;
import org.yakindu.sct.model.sgraph.State;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.kiml.LayoutOptionData;
import de.cau.cs.kieler.kiml.config.SemanticLayoutConfig;
import de.cau.cs.kieler.kiml.options.LayoutOptions;

/**
 * A layout configuration that applies a spacing of 0 for states and a border spacing of 0 for
 * regions of a Yakindu SCT diagram.
 * 
 * @author cmot
 */
public class YakinduLayoutConfig extends SemanticLayoutConfig {

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPriority() {
        return PRIORITY;
    }

    // @Override
    // public void enrich(final LayoutContext context) {
    // super.enrich(context);
    // // Insets
    // EObject element = context.getProperty(LayoutContext.DOMAIN_MODEL);
    //
    // //if element instanceof SyncState
    // if (element instanceof State) {
    //
    // Object diagramPart = context.getProperty(LayoutContext.DIAGRAM_PART);
    // if (diagramPart instanceof KGraphElement) {
    // KGraphElement element2 = (KGraphElement) diagramPart;
    // KGraphData elementLayout;
    // if (!(element instanceof KEdge)) {
    // elementLayout = element2.getData(KShapeLayout.class);
    // KShapeLayout kShapeLayout = (KShapeLayout) elementLayout;
    // KInsets kInsets = kShapeLayout.getInsets();
    // kInsets.setRight(0.0f);
    // }
    // }
    //
    // }
    //
    // }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IProperty<?>[] getAffectedOptions(final EObject semanticElem) {
        if (semanticElem instanceof State) {
            return new IProperty<?>[] { LayoutOptions.SPACING };
        }
        if (semanticElem instanceof Region) {
            return new IProperty<?>[] { LayoutOptions.BORDER_SPACING };
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getSemanticValue(final EObject semanticElem,
            final LayoutOptionData<?> layoutOption) {
        if (semanticElem instanceof State && layoutOption.equals(LayoutOptions.SPACING)) {
            return 0.0f;
        }
        if (semanticElem instanceof Region && layoutOption.equals(LayoutOptions.BORDER_SPACING)) {
            return 0.0f;
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
