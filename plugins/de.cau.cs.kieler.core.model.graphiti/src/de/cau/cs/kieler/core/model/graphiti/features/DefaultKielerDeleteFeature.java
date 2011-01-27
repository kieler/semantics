/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.graphiti.features;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

/**
 * Default feature that removes outgoing and incoming links of any node when the
 * node is removed. This feature also doesn't prompt the user to confirm the
 * deletion.
 * 
 * @author soh
 */
public class DefaultKielerDeleteFeature extends DefaultDeleteFeature {

    private Set<Connection> links = null;

    /**
     * Creates a new KaomDeleteFeature.java.
     * 
     * @param fp
     *            the feature provider
     */
    public DefaultKielerDeleteFeature(final IFeatureProvider fp) {
        super(fp);
    }

    /**
     * 
     * {@inheritDoc}
     */
    // override the user decision, so objects can be deleted without any
    // dialog
    @Override
    protected boolean getUserDecision() {
        return true;
    }

    @Override
    public void preDelete(final IDeleteContext context) {
        PictogramElement pe = context.getPictogramElement();
        if (pe instanceof AnchorContainer) {
            AnchorContainer ac = (AnchorContainer) pe;
            links = new HashSet<Connection>();
            for (Anchor anchor : ac.getAnchors()) {
                for (Connection c : anchor.getIncomingConnections()) {
                    links.add(c);
                }
                for (Connection c : anchor.getOutgoingConnections()) {
                    links.add(c);
                }
            }
        } else if (pe instanceof Anchor) {
            Anchor anchor = (Anchor) pe;
            links = new HashSet<Connection>();
            for (Connection c : anchor.getIncomingConnections()) {
                links.add(c);
            }
            for (Connection c : anchor.getOutgoingConnections()) {
                links.add(c);
            }
        }
        if (links != null) {
            for (Connection c : links) {
                EObject eObj = c.getLink().getBusinessObjects().get(0);
                EcoreUtil.delete(eObj);
            }
        }
    }

    @Override
    public void postDelete(final IDeleteContext context) {
        if (links != null) {
            for (Connection con : links) {
                DeleteContext deleteLink = new DeleteContext(con);
                IDeleteFeature feature =
                        getFeatureProvider().getDeleteFeature(deleteLink);
                if (feature != null) {
                    feature.execute(deleteLink);
                }
            }
        }
    }
}
