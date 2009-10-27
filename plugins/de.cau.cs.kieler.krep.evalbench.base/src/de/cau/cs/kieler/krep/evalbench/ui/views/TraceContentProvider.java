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
package de.cau.cs.kieler.krep.evalbench.ui.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Diplay contents as expected by traces.
 * 
 * @author ctr
 * 
 */
public class TraceContentProvider implements IStructuredContentProvider {
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java .lang.Object)
     */
    public Object[] getElements(final Object inputElement) {
        if (inputElement instanceof String[][]) {
            return (String[][]) inputElement;
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        // nothing to do

    }

    /**
     * {@inheritDoc}
     */
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        // noting to do

    }

}
