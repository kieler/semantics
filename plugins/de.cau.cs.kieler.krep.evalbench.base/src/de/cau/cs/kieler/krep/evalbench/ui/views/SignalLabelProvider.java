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

import java.util.LinkedList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;

/**
 * Label provider used for the embedded table viewer in the input and output views.
 * 
 * @author msp
 */
public class SignalLabelProvider implements ITableLabelProvider {

    /** Relative path to the image to use for present signals. */
    private static final String PRESENT_PATH = "icons/present.gif";
    /** Relative path to the image to use for absent signals. */
    private static final String ABSENT_PATH = "icons/absent.gif";
    /** Relative path to the image to use for present signals. */
    private static final String CHECKED_PATH = "icons/checked.gif";
    /** Relative path to the image to use for absent signals. */
    private static final String UNCHECKED_PATH = "icons/unchecked.gif";

    /** List of label provider listeners. */
    private LinkedList<ILabelProviderListener> listeners;

    /** Image to use for present signals. */
    private Image presentImage;
    /** Image to use for absent signals. */
    private Image absentImage;

    /**
     * Initializes the signal label provider.
     * 
     * @param input
     *            if true, the icons for input editing are used
     */
    public SignalLabelProvider(final boolean input) {
        // create list for label provider listeners
        listeners = new LinkedList<ILabelProviderListener>();
        // create images
        if (input) {
            ImageDescriptor presentImageDescriptor = Activator.imageDescriptorFromPlugin(
                    Activator.PLUGIN_ID, CHECKED_PATH);
            presentImage = presentImageDescriptor.createImage();
            ImageDescriptor absentImageDescriptor = Activator.imageDescriptorFromPlugin(
                    Activator.PLUGIN_ID, UNCHECKED_PATH);
            absentImage = absentImageDescriptor.createImage();
        } else {
            ImageDescriptor presentImageDescriptor = Activator.imageDescriptorFromPlugin(
                    Activator.PLUGIN_ID, PRESENT_PATH);
            presentImage = presentImageDescriptor.createImage();
            ImageDescriptor absentImageDescriptor = Activator.imageDescriptorFromPlugin(
                    Activator.PLUGIN_ID, ABSENT_PATH);
            absentImage = absentImageDescriptor.createImage();
        }
    }

    /**
     * {@inheritDoc}
     */
    public Image getColumnImage(final Object element, final int columnIndex) {
        if (element instanceof Signal) {
            Signal s = (Signal) element;
            switch (columnIndex) {
            case 1:
                return s.getPresent() ? presentImage : absentImage;
            default:
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
    public String getColumnText(final Object element, final int columnIndex) {
        if (element instanceof Signal) {
            Signal s = (Signal) element;
            switch (columnIndex) {
            case 0:
                return s.getName();
            case 2:
                if (s.isValued()) {
                    Object value = s.getValue();
                    if (value != null) {
                        return value.toString();
                    } else {
                        return "";
                    }
                } else {
                    return "";
                }
            default:
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
        // dispose images
        presentImage.dispose();
        absentImage.dispose();
    }

    /**
     * {@inheritDoc}
     * 
     */
    public boolean isLabelProperty(final Object element, final String property) {
        return true;
    }

}
