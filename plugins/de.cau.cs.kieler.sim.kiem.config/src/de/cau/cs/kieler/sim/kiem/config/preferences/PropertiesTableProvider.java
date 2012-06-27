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

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TableItem;

import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * Provider class for the configuration table. Includes a content provider, a
 * label provider, and a cell modifier.
 * <p>
 * Modified version of the SchedulePriorityTableProvider in
 * de.cau.cs.kieler.kiml.ui by msp.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class PropertiesTableProvider extends LabelProvider implements
        IStructuredContentProvider, ITableLabelProvider, ICellModifier {

    /** table viewer that makes use of this provider. */
    private TableViewer priorityTableViewer;
    /** the headers of the table. */
    private String[] tableHeaders;

    // --------------------------------------------------------------------------

    /**
     * Creates a table provider instance.
     * 
     * @param thetableViewer
     *            table viewer that makes use of this provider
     * @param headers
     *            array of table headers
     */
    public PropertiesTableProvider(final TableViewer thetableViewer,
            final String[] headers) {
        this.priorityTableViewer = thetableViewer;
        this.tableHeaders = headers.clone();
        refresh();
    }

    // --------------------------------------------------------------------------

    /**
     * Refreshes internally cached data for display in the table.
     */
    public void refresh() {
        priorityTableViewer.refresh();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public final Image getColumnImage(final Object element,
            final int columnIndex) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getColumnText(final Object element, final int columnIndex) {
        if (element instanceof KiemProperty) {
            KiemProperty entry = (KiemProperty) element;
            if (columnIndex == 0) {
                return entry.getKey();
            }
            return entry.getValue();
        }
        return null;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object[] getElements(final Object inputElement) {
        if (inputElement instanceof ConfigurationManager) {
            return ((ConfigurationManager) inputElement)
                    .getExternalDefaultProperties();
        }
        return null;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object getValue(final Object element, final String property) {
        KiemProperty entry = (KiemProperty) element;
        return property.equals(tableHeaders[0]) ? entry.getKey() : entry
                .getValue();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void inputChanged(final Viewer viewer, final Object oldInput,
            final Object newInput) {
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean canModify(final Object element, final String property) {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void modify(final Object element, final String property,
            final Object value) {
        KiemProperty entry = (KiemProperty) ((TableItem) element).getData();
        if (!(property.equals(tableHeaders[0]))) {
            entry.setValue((String) value);
        }
        priorityTableViewer.refresh();
    }

    // --------------------------------------------------------------------------

}
