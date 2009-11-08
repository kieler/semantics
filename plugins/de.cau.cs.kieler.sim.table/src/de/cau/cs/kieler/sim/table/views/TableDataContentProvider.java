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

package de.cau.cs.kieler.sim.table.views;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * The Class TableDataContentProvider.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableDataContentProvider implements ITreeContentProvider {

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object[] getElements(final Object inputElement) {
        return ((TableDataList) inputElement).getArray();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void dispose() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object[] getChildren(final Object parentElement) {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object getParent(final Object element) {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean hasChildren(final Object element) {
        return false;
    }

}
