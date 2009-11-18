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
package de.cau.cs.kieler.krep.evalbench.ui.editors;

import java.util.LinkedList;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * Label provider for the program view.
 * 
 * @author msp
 */
public class ProgramLabelProvider implements ITableLabelProvider {

    /** List of label provider listeners. */
    private LinkedList<ILabelProviderListener> listeners;

    /**
     * Initializes the program label provider.
     */
    public ProgramLabelProvider() {
        // create list for label provider listeners
        listeners = new LinkedList<ILabelProviderListener>();
    }

    /**
     * {@inheritDoc}
     * 
     */
    public Image getColumnImage(final Object element, final int columnIndex) {
        // no images for this table
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String getColumnText(final Object element, final int columnIndex) {
        if (element instanceof String[]) {
            String[] line = (String[]) element;
            if (columnIndex < line.length) {
                return line[columnIndex];
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void addListener(final ILabelProviderListener listener) {
        listeners.add(listener);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void removeListener(final ILabelProviderListener listener) {
        listeners.remove(listener);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void dispose() {
        // clear list of label provider listeners
        listeners.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean isLabelProperty(final Object element, final String property) {
        return true;
    }

}
