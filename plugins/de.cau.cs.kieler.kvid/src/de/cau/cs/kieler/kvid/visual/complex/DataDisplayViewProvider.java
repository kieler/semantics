/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.visual.complex;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @author jjc
 *
 */
public class DataDisplayViewProvider implements IViewProvider {

    /**
     * Not used and therefore not implemented.
     * 
     * @param listener An also ignored listener
     */
    public void addProviderChangeListener(final IProviderChangeListener listener) {
        //Not used, ignored
    }

    /**
     * {@inheritDoc}
     */
    public boolean provides(final IOperation operation) {
        if (operation instanceof CreateNodeViewOperation) {
            if (((CreateNodeViewOperation) operation).getSemanticHint().equals("ScopeNode")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Not used and therefore not implemented.
     * 
     * @param listener An also ignored listener
     */
    public void removeProviderChangeListener(final IProviderChangeListener listener) {
        //Not used, ignored
    }

    /**
     * {@inheritDoc}
     */
    public Diagram createDiagram(final IAdaptable semanticAdapter,
            final String diagramKind, final PreferencesHint preferencesHint) {
        //KViD won't provide Diagrams, thus ignored 
        return null;
    }

    /**
     * {@inheritDoc} 
     */
    public Edge createEdge(final IAdaptable semanticAdapter, final View containerView,
            final String semanticHint, final int index, final boolean persisted,
            final PreferencesHint preferencesHint) {
        //Right now, KViD doesn't provide any Edges, thus ignored
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public Node createNode(final IAdaptable semanticAdapter, final View containerView,
            final String semanticHint, final int index, final boolean persisted,
            final PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
        node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(semanticHint);
        ViewUtil.insertChildView(containerView, node, index, persisted);
        return node;
    }

}
