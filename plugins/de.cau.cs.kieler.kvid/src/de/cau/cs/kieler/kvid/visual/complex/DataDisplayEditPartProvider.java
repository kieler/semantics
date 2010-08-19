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

import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.editpart.IEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * {@link IEditPartProvider} for node classes provided by KViD.
 * 
 * @author jjc
 *
 */
@SuppressWarnings("restriction")
public class DataDisplayEditPartProvider implements IEditPartProvider {

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
        if (operation instanceof CreateGraphicEditPartOperation) {
            View view = ((IEditPartOperation) operation).getView();
            return view.getType().equals("ScopeNode");
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
    public IGraphicalEditPart createGraphicEditPart(final View view) {
        IGraphicalEditPart part = new ScopeEditPart(view);
        return part;
    }

    /**
     * {@inheritDoc} 
     */
    public RootEditPart createRootEditPart(final Diagram diagram) {
        //KViD won't provide RootEditParts, thus ignored 
        return null;
    }

}
