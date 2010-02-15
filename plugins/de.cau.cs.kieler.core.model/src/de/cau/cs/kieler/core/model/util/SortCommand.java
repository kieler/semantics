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

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * Command to sort an EList using a given Comparator.
 * 
 * @param <T>
 *            Type to sort.
 * @author haf
 * 
 */
public class SortCommand<T> extends AbstractCommand {

    private EList<T> list;
    private Comparator<T> comparator;
    Map<T, Integer> oldIndices = new HashMap<T, Integer>();

    /**
     * Constructor, taking the list to sort and the comparator to use for
     * sorting.
     * 
     * @param theList
     *            to sort
     * @param theComparator
     *            to use for sorting
     */
    public SortCommand(final EList<T> theList, final Comparator<T> theComparator) {
        this.list = theList;
        this.comparator = theComparator;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        int i = 0;
        for (T obj : list) {
            oldIndices.put(obj, i);
            i++;
        }
        ECollections.sort(list, comparator);
    }

    /**
     * {@inheritDoc}
     */
    public void redo() {
        execute();
    }

    @Override
    public void undo() {
        for (T obj : oldIndices.keySet()) {
            int oldIndex = oldIndices.get(obj);
            if (oldIndex >= 0 && oldIndex < list.size()) {
                list.move(oldIndex, obj);
            }
        }
    }

    /**
     * Get the list to sort.
     * 
     * @return list to sort.
     */
    protected EList<T> getList() {
        return list;
    }

    // FIXME: This should check whether the command can really be executed.
    @Override
    protected boolean prepare() {
        return true;
    }
}
