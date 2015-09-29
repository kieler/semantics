/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
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

/**
 * Command to sort an {@link EList} using a given {@link Comparator}.
 * 
 * @param <T> Type to sort.
 * @author haf
 * @kieler.design proposed 2012-11-07 cds msp We should think about moving this to the SyncCharts
 *                code as it only seems to be used there.
 */
public class SortCommand<T> extends AbstractCommand {

    /** the list to sort. */
    private EList<T> list;
    /** the comparator used to compare elements. */
    private Comparator<T> comparator;
    /** map mapping indices of elements in the old list to indices in the sorted list. */
    private Map<T, Integer> oldIndices = new HashMap<T, Integer>();

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
