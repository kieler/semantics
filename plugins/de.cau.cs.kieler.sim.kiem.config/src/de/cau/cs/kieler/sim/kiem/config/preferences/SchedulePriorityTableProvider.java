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
package de.cau.cs.kieler.sim.kiem.config.preferences;

import java.util.List;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TableItem;

import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;

/**
 * Provider class for the schedule priorities table. Includes a content
 * provider, a label provider, and a cell modifier.
 * <p>
 * Modified version of the PriorityTableProvider in de.cau.cs.kieler.kiml.ui by
 * msp.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class SchedulePriorityTableProvider extends LabelProvider implements
        IStructuredContentProvider, ITableLabelProvider, ICellModifier {

    /** property name of the schedule column. */
    public static final String SCHEDULES_PROPERTY = "entries";

    /** table viewer that makes use of this provider. */
    private TableViewer priorityTableViewer;
    /** array of the entries with maximum priority. */
    private ScheduleData[] maxIndices;
    /** image used for active entries. */
    private Image activeImage;
    /** image used for locked entries. */
    private Image lockedImage;
    /** the entries. */
    private List<DataEntry> entries;

    // --------------------------------------------------------------------------

    /** data type for row entries in the table. */
    public static class DataEntry {

        /** the associated schedule. */
        private ScheduleData schedule = null;
        /** array of priorities for the entries. */
        private int[] priorities = null;

        // --------------------------------------------------------------------------

        /**
         * Returns the schedule.
         * 
         * @return the schedule
         */
        ScheduleData getSchedule() {
            return schedule;
        }

        /**
         * Sets the schedule.
         * 
         * @param theSchedule
         *            the schedule to set
         */
        void setSchedule(final ScheduleData theSchedule) {
            this.schedule = theSchedule;
        }

        // --------------------------------------------------------------------------

        /**
         * Returns the priorities.
         * 
         * @return the priorities
         */
        int[] getPriorities() {
            return priorities;
        }

        /**
         * Sets the priorities.
         * 
         * @param thepriorities
         *            the priorities to set
         */
        void setPriorities(final int[] thepriorities) {
            this.priorities = thepriorities;
        }

        /**
         * 
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder(schedule.getName());
            for (Integer i : priorities) {
                builder.append(" " + i);
            }
            return builder.toString();
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Creates a table provider instance.
     * 
     * @param thetableViewer
     *            table viewer that makes use of this provider
     * @param entriesParam
     *            all entries
     */
    public SchedulePriorityTableProvider(final TableViewer thetableViewer,
            final List<DataEntry> entriesParam) {
        this.priorityTableViewer = thetableViewer;
        this.entries = entriesParam;
        this.maxIndices = new ScheduleData[entriesParam != null ? entriesParam
                .get(0).priorities.length : 0];
        this.activeImage = KiemConfigurationPlugin.getActiveImage();
        this.lockedImage = KiemConfigurationPlugin.getLockedImage();
        refresh();
    }

    // --------------------------------------------------------------------------

    /**
     * Determines the index of the schedule with highest priority for the given
     * column.
     * 
     * @param col
     *            column of the diagram type for which the highest priority
     *            shall be determined
     */
    private void calcMaxIndex(final int col) {
        int max = ScheduleData.MIN_PRIORITY;
        ScheduleData best = null;
        for (DataEntry entry : entries) {
            if (entry.priorities[col] > max) {
                max = entry.priorities[col];
                best = entry.schedule;
            }
        }
        maxIndices[col] = best;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean canModify(final Object element, final String property) {
        return !property.equals(SCHEDULES_PROPERTY);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        activeImage.dispose();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Image getColumnImage(final Object element, final int columnIndex) {
        if (element instanceof DataEntry) {
            DataEntry entry = (DataEntry) element;
            if (columnIndex == 0 && entry.schedule.isLocked()) {
                return lockedImage;
            }
            if (columnIndex > 0
                    && maxIndices[columnIndex - 1] == entry.getSchedule()) {
                return activeImage;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getColumnText(final Object element, final int columnIndex) {
        if (element instanceof DataEntry) {
            DataEntry entry = (DataEntry) element;
            if (columnIndex == 0) {
                return entry.getSchedule().getName();
            }
            int prio = entry.getPriorities()[columnIndex - 1];
            return prio <= ScheduleData.MIN_PRIORITY ? null : Integer
                    .toString(prio);
        }
        return null;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public Object[] getElements(final Object inputElement) {
        if (inputElement instanceof List<?>) {
            List<DataEntry> list = (List<DataEntry>) inputElement;
            return list.toArray(new DataEntry[list.size()]);
        }
        return null;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object getValue(final Object element, final String property) {
        DataEntry entry = (DataEntry) element;
        try {
            int typeIndex = Integer.parseInt(property);
            int prio = entry.getPriorities()[typeIndex];
            return prio <= ScheduleData.MIN_PRIORITY ? "0" : Integer
                    .toString(prio);
        } catch (NumberFormatException exception) {
            return null;
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void inputChanged(final Viewer viewer, final Object oldInput,
            final Object newInput) {
        refresh();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void modify(final Object element, final String property,
            final Object value) {
        DataEntry entry = (DataEntry) ((TableItem) element).getData();
        int typeIndex = Integer.parseInt(property);
        try {
            entry.getPriorities()[typeIndex] = Integer.parseInt((String) value);
        } catch (NumberFormatException exception) {
            entry.getPriorities()[typeIndex] = ScheduleData.MIN_PRIORITY;
        }
        calcMaxIndex(typeIndex);
        priorityTableViewer.refresh();
        String[] prios = new String[entry.getPriorities().length + 1];
        prios[0] = entry.getSchedule().getName();
        int index = 1;
        for (Integer prio : entry.getPriorities()) {
            prios[index++] = prio + "";
        }
        priorityTableViewer.update(element, prios);
    }

    // --------------------------------------------------------------------------

    /**
     * Refreshes internally cached data for display in the table.
     */
    public void refresh() {
        for (int j = 0; j < entries.get(0).priorities.length; j++) {
            calcMaxIndex(j);
        }
        priorityTableViewer.refresh();
    }

    /**
     * Remove an entry from the table.
     * 
     * @param entry
     *            the entry to be removed.
     */
    public void remove(final DataEntry entry) {
        entries.remove(entry);
    }

}
