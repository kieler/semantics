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
package de.cau.cs.kieler.core.ui.providers;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.ui.model.BaseWorkbenchContentProvider;

import de.cau.cs.kieler.core.util.ICondition;

/**
 * The BaseWorkbenchContentProvider that can filter returned children objects.
 * 
 * @author mri
 */
public class ConditionalWorkbenchContentProvider extends
        BaseWorkbenchContentProvider {

    /** the condition. */
    private ICondition<Object> condition;

    /**
     * The constructor.
     * 
     * @param cond
     *            the condition
     */
    public ConditionalWorkbenchContentProvider(final ICondition<Object> cond) {
        condition = cond;
    }

    /**
     * {@inheritDoc}
     */
    public Object[] getChildren(final Object element) {
        Object[] children = super.getChildren(element);
        List<Object> filtered = new LinkedList<Object>();
        for (Object obj : children) {
            if (condition.evaluate(obj)) {
                filtered.add(obj);
            }
        }
        return filtered.toArray();
    }

    /**
     * {@inheritDoc}
     */
    public Object[] getElements(final Object element) {
        return getChildren(element);
    }
}
