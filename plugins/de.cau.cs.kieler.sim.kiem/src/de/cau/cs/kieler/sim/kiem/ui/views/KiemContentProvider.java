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

package de.cau.cs.kieler.sim.kiem.ui.views;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The Class KiemContentProvider. This provides the content for the tree-table of
 * DataComponentWrappers. It decides based on the type (DataComponentWrapper or KiemProperty) what
 * content has to be provided.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class KiemContentProvider implements ITreeContentProvider {

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public Object[] getElements(final Object inputElement) {
        // build list with all visible components
        LinkedList<DataComponentWrapper> tempList = new LinkedList<DataComponentWrapper>();
        for (DataComponentWrapper dataComponentWrapper : ((List<DataComponentWrapper>) inputElement)) {
            if (!dataComponentWrapper.getDataComponent().isInvisible()) {
                tempList.add(dataComponentWrapper);
            }
        }
        return (tempList.toArray());
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
        // only if component
        DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) parentElement;
        return dataComponentWrapper.getProperties();
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
        // if property -> no children
        if (element instanceof KiemProperty) {
            return false;
        }

        // if component -> count properties
        DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) element;
        if (dataComponentWrapper.getDataComponent().isInvisible()) {
            // if component is invisible -> nothing
            return false;
        }
        if (dataComponentWrapper.getProperties() == null) {
            return false;
        }
        return (dataComponentWrapper.getProperties().length > 0);
    }

}
