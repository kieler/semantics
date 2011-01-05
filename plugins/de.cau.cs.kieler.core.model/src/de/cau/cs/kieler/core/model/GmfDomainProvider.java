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
package de.cau.cs.kieler.core.model;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Domain model element provider for GMF.
 *
 * @author msp
 */
public class GmfDomainProvider implements IDomainProvider {

    /**
     * {@inheritDoc}
     */
    public EObject getElement(final Object object) {
        if (object instanceof IGraphicalEditPart) {
            return ((IGraphicalEditPart) object).getNotationView().getElement();
        } else if (object instanceof View) {
            return ((View) object).getElement();
        } else if (object instanceof IAdaptable) {
            IAdaptable adaptable = (IAdaptable) object;
            View view = (View) adaptable.getAdapter(View.class);
            if (view != null) {
                return view.getElement();
            }
            return (EObject) adaptable.getAdapter(EObject.class);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public TransactionalEditingDomain getEditingDomain(final Object object) {
        if (object instanceof IGraphicalEditPart) {
            return ((IGraphicalEditPart) object).getEditingDomain();
        } else if (object instanceof IAdaptable) {
            IAdaptable adaptable = (IAdaptable) object;
            return (TransactionalEditingDomain) adaptable.getAdapter(TransactionalEditingDomain.class);
        }
        return null;
    }

}
