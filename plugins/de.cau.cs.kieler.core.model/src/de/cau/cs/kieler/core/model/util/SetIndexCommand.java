/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.util;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Set an integer feature of the element to its index in a list.
 * 
 * @author haf
 * 
 * @param <T>
 *            Type to sort.
 */
public class SetIndexCommand<T extends EObject> extends AbstractCommand {

    private EList<T> list;
    private EStructuralFeature feature;
    private int offset;
    private int[] oldValues;

    /**
     * @param theList
     *            the List to sort
     * @param theFeature
     *            the feature to set the index to
     * @param theOffset
     *            an offset to add to the index
     */
    public SetIndexCommand(final EList<T> theList, final EStructuralFeature theFeature,
            final int theOffset) {
        this.list = theList;
        feature = theFeature;
        offset = theOffset;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        oldValues = new int[getList().size()];
        for (int i = 0; i < getList().size(); i++) {
            T obj = getList().get(i);
            oldValues[i] = (Integer) obj.eGet(feature);
            obj.eSet(feature, i + offset);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void redo() {
        execute();
    }

    @Override
    public void undo() {
        for (int i = 0; i < getList().size(); i++) {
            if (i < oldValues.length) {
                T obj = getList().get(i);
                obj.eSet(feature, oldValues[i]);
            }
        }
    }

    /**
     * Get the list.
     * 
     * @return list.
     */
    protected EList<T> getList() {
        return list;
    }

    @Override
    protected boolean prepare() {
        return true;
    }
}
