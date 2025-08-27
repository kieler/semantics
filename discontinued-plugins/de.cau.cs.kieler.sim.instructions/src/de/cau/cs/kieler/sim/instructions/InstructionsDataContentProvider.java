/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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
package de.cau.cs.kieler.sim.instructions;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * The Class TableDataContentProvider.
 * 
 * @author cmot
 * @kieler.design proposed 2013-02-28
 * @kieler.rating proposed 2013-02-28 yellow
 */
public class InstructionsDataContentProvider implements ITreeContentProvider {

    /**
     * {@inheritDoc}
     */
    public Object[] getElements(final Object inputElement) {
        return ((InstructionsDataList) inputElement).getArray();
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void dispose() {
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object[] getChildren(final Object parentElement) {
        return null;
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object getParent(final Object element) {
        return null;
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean hasChildren(final Object element) {
        return false;
    }

    //-------------------------------------------------------------------------
}