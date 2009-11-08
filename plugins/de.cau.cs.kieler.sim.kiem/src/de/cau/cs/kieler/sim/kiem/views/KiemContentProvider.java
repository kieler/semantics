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

package de.cau.cs.kieler.sim.kiem.views;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;

/**
 * The Class KiemContentProvider. This provides the content for the tree-table of DataComponentExs.
 * It decides based on the type (DataComponentEx or KiemProperty) what content has to be provided.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemContentProvider implements ITreeContentProvider {

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public Object[] getElements(final Object inputElement) {
        return ((List<DataComponent>) inputElement).toArray();
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
        DataComponentEx dataComponentEx = (DataComponentEx) parentElement;
        return dataComponentEx.getProperties();
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
        DataComponentEx dataComponentEx = (DataComponentEx) element;
        if (dataComponentEx.getProperties() == null) {
            return false;
        }
        return (dataComponentEx.getProperties().length > 0);
    }

}
