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
package de.cau.cs.kieler.core.annotations.ui.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.core.annotations.Annotatable;

/**
 * Content provider for annotations property sections.
 *
 * @author msp
 */
public class AnnotationsContentProvider implements ITreeContentProvider {

    /**
     * {@inheritDoc}
     */
    public void dispose() {
    }

    /**
     * {@inheritDoc}
     */
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

    /**
     * {@inheritDoc}
     */
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    /**
     * {@inheritDoc}
     */
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof Annotatable) {
            Annotatable annotatable = (Annotatable) parentElement;
            return annotatable.getAnnotations().toArray();
        }
        return new Object[0];
    }

    /**
     * {@inheritDoc}
     */
    public Object getParent(Object element) {
        if (element instanceof EObject) {
            EObject parent = ((EObject) element).eContainer();
            if (parent instanceof Annotatable) {
                return parent;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasChildren(Object element) {
        if (element instanceof Annotatable) {
            Annotatable annotatable = (Annotatable) element;
            return !annotatable.getAnnotations().isEmpty();
        }
        return false;
    }

}
