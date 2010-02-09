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
package de.cau.cs.kieler.sim.kiem.automated.views;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.automated.data.AbstractResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult.ComponentResult;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyType;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeBool;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeInt;

/**
 * A panel that displays a table visualizing the results of a the execution of
 * one .execution file with multiple model files and possibly multiple
 * iterations.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class ExecutionFilePanel {

    /** The tableViewer where inputs are listed. */
    private TableViewer tableViewer = null;
    /** The table where the results are displayed. */
    private Table table = null;

    /** The group where the table is displayed. */
    private Group execPanel;

    /** The inputs. */
    private List<IterationResult> results = null;

    /** The names of the columns. */
    private String[] columnNames;

    /** The list of columns, used to pack() after every new addition. */
    private LinkedList<TableColumn> columns;

    /** The displayed name of this execution. */
    private IPath execName;

    // --------------------------------------------------------------------------

    /**
     * Creates a new ExecutionFilePanel.java.
     * 
     * @param name
     *            the execution file
     * @param panel
     *            the parent panel
     */
    public ExecutionFilePanel(final IPath name, final Composite panel) {
        execPanel = new Group(panel, SWT.BORDER);
        this.execName = name;
        execPanel.setText(getName(execName));
        execPanel.setLayout(new GridLayout(1, false));
        execPanel.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING,
                false, false));
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Add a new result to this panel. If this is the first call to this method
     * the panel is set up with the column names extracted from the properties
     * in the passed result.
     * 
     * @param iterationResult
     *            the result that should be added
     */
    public void addResult(final IterationResult iterationResult) {
        if (results == null) {
            results = new LinkedList<IterationResult>();
            doInitialLayout(iterationResult);
        }
        if (!results.contains(iterationResult)) {
            results.add(iterationResult);
        }

        refresh();
    }

    /**
     * Add a list of results to the table, the columns will be taken from the
     * last result in the list as that is assumed to be correct.
     * 
     * @param resultsParam
     *            the list of results
     */
    public void addResult(final List<IterationResult> resultsParam) {
        if (results == null) {
            results = new LinkedList<IterationResult>();
            doInitialLayout(resultsParam.get(resultsParam.size() - 1));
        }

        for (IterationResult result : resultsParam) {
            if (!results.contains(result)) {
                results.add(result);
            }
        }

        refresh();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the execName.
     * 
     * @return the execName
     */
    public IPath getExecName() {
        return this.execName;
    }

    // --------------------------------------------------------------------------

    /**
     * Do the initial layout of this page.
     * 
     * @param iterationResult
     *            the first result that is to be added.
     */
    private void doInitialLayout(final IterationResult iterationResult) {

        // get column names from keys in the parent results
        List<String> columnNamesList = new LinkedList<String>();
        for (KiemProperty prop : iterationResult.getResults()) {
            columnNamesList.add(prop.getKey());
        }

        List<AbstractResult> children = iterationResult.getChildren();

        if (children != null && !children.isEmpty()) {
            // get column names from the keys in the children results
            for (AbstractResult child : children) {
                if (child instanceof ComponentResult) {
                    ComponentResult comp = (ComponentResult) child;

                    String name = comp.getName();

                    List<KiemProperty> properties = comp.getResults();

                    if (properties != null && !properties.isEmpty()) {
                        for (KiemProperty prop : properties) {
                            columnNamesList.add(name + ":" + prop.getKey());
                        }
                    }
                }
            }
        }

        columnNames = columnNamesList
                .toArray(new String[columnNamesList.size()]);

        // create table
        table = new Table(execPanel, SWT.NONE);
        columns = new LinkedList<TableColumn>();
        for (int i = 0; i < columnNamesList.size(); i++) {
            TableColumn column = new TableColumn(table, SWT.NONE, i);
            column.setText(columnNames[i]);
            columns.add(column);
        }

        table.setLinesVisible(true);
        table.setHeaderVisible(true);

        // create table tableViewer
        tableViewer = new TableViewer(table);
        tableViewer.setColumnProperties(columnNames);

        // create table label and input provider
        TableProvider provider = new TableProvider();
        tableViewer.setContentProvider(provider);
        tableViewer.setLabelProvider(provider);
        tableViewer.setInput(results);
    }

    /**
     * Create a new name from an IPath object.
     * 
     * @param newLocation
     *            the location of the .execution file
     * @return filename[project name]
     */
    private String getName(final IPath newLocation) {
        String result = "";
        String[] segments = newLocation.removeFileExtension().segments();
        result += segments[segments.length - 1];
        if (newLocation.toOSString().startsWith("bundleentry")) {
            result += "[IMPORTED]";
        } else {
            result += "[" + segments[0] + "]";
        }
        return result;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Dispose of this panel.
     */
    public void dispose() {
        if (columns != null) {
            for (TableColumn column : columns) {
                column.dispose();
            }
        }
        if (table != null) {
            table.dispose();
            tableViewer = null;
        }
        if (execPanel != null) {
            execPanel.dispose();
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Refreshes the view.
     */
    public void refresh() {
        if (tableViewer != null) {

            tableViewer.setInput(results);
            tableViewer.refresh();

            for (TableColumn column : columns) {
                column.pack();
            }

            table.pack();
            execPanel.pack();
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Get the data contained in the table as a matrix.
     * 
     * @return the data
     */
    public PanelData getData() {
        PanelData result = new PanelData(results.size(), columns.size());
        result.setExecFileName(getName(execName));
        for (int j = 0; j < columns.size(); j++) {
            result.getHeaders()[j] = columns.get(j).getText();
        }

        for (int i = 0; i < results.size(); i++) {
            IterationResult iterationResult = results.get(i);
            List<KiemProperty> iterationResults = iterationResult.getResults();
            int j = 0;
            // add results
            for (; j < iterationResults.size(); j++) {
                result.getData()[i][j] = iterationResults.get(j).getValue();
            }

            // add children
            List<AbstractResult> children = iterationResult.getChildren();
            if (children != null && !children.isEmpty()) {
                for (AbstractResult child : children) {
                    for (KiemProperty childResult : child.getResults()) {
                        result.getData()[i][j++] = childResult.getValue();
                    }
                }
            }
            // fill empty columns on faulty records
            for (; j < columns.size(); j++) {
                // faulty record, not all columns filled
                result.getData()[i][j] = "";
            }
        }
        return result;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Contains all the data that is shown on a execution file panel.
     * 
     * @author soh
     * @kieler.rating 2010-02-08 proposed yellow
     */
    public static class PanelData {

        /** The name of the execution file. */
        private String execFileName;
        /** The table headers. */
        private String[] headers;
        /** The data on the table. */
        private String[][] data;

        /**
         * Creates a new ExecutionFilePanel.
         * 
         * @param numberOfResults
         *            the number of results
         * @param numberOfColumns
         *            the number of columns
         */
        public PanelData(final int numberOfResults, final int numberOfColumns) {
            headers = new String[numberOfColumns];
            data = new String[numberOfResults][numberOfColumns];
        }

        /**
         * Setter for the execFileName.
         * 
         * @param execFileNameParam
         *            the execFileName to set
         */
        public void setExecFileName(final String execFileNameParam) {
            this.execFileName = execFileNameParam;
        }

        /**
         * Getter for the execFileName.
         * 
         * @return the execFileName
         */
        public String getExecFileName() {
            return execFileName;
        }

        /**
         * Getter for the headers.
         * 
         * @return the headers
         */
        public String[] getHeaders() {
            return headers;
        }

        /**
         * Getter for the data.
         * 
         * @return the data
         */
        public String[][] getData() {
            return data;
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Content and label provider for the table on this panel.
     * 
     * 
     * @author soh
     * @kieler.rating 2010-01-29 proposed yellow
     */
    private static class TableProvider implements IStructuredContentProvider,
            ITableLabelProvider {

        /**
         * {@inheritDoc}
         */
        @SuppressWarnings("unchecked")
        public Object[] getElements(final Object inputElement) {
            IterationResult[] resultArray = null;

            // convert the input list to an array of iteration results
            if (inputElement instanceof List<?>) {
                List<IterationResult> resultList = (List<IterationResult>) inputElement;
                resultArray = resultList.toArray(new IterationResult[resultList
                        .size()]);
            }

            return resultArray;
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void dispose() {
        }

        /**
         * {@inheritDoc}
         */
        public void inputChanged(final Viewer viewer, final Object oldInput,
                final Object newInput) {
        }

        /**
         * {@inheritDoc}
         */
        public Image getColumnImage(final Object element, final int columnIndex) {
            if (element instanceof IterationResult) {
                IterationResult iterationResult = (IterationResult) element;

                KiemProperty result = findProperty(columnIndex, iterationResult);

                if (result != null) {
                    KiemPropertyType type = result.getType();

                    if (type instanceof KiemPropertyTypeBool) {
                        boolean value = result.getValueAsBoolean();
                        if (value) {
                            return KiemAutomatedPlugin.getTrueImage();
                        }
                        return KiemAutomatedPlugin.getFalseImage();
                    }
                }

            }
            return null;
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public String getColumnText(final Object element, final int columnIndex) {
            if (element instanceof IterationResult) {
                IterationResult iterationResult = (IterationResult) element;

                KiemProperty result = findProperty(columnIndex, iterationResult);

                if (result != null) {
                    KiemPropertyType type = result.getType();
                    if (type instanceof KiemPropertyTypeBool) {
                        return "";
                    }
                    if (type instanceof KiemPropertyTypeInt) {
                        try {
                            return result.getValueAsInt() + "";
                        } catch (NumberFormatException e0) {
                            return result.getValue();
                        }
                    }
                    if (type instanceof KiemPropertyTypeChoice) {
                        try {
                            int index = result.getValueAsInt();
                            CellEditor editor = type.getCellEditor();
                            ComboBoxCellEditor comboEditor = (ComboBoxCellEditor) editor;
                            String[] items = comboEditor.getItems();

                            StringBuilder builder = new StringBuilder("{");
                            for (int i = 0; i < items.length; i++) {
                                if (i == index) {
                                    builder.append("((" + items[i] + "))");
                                } else {
                                    builder.append(items[i]);
                                }
                                if (i != items.length - 1) {
                                    builder.append(", ");
                                }
                            }
                            builder.append("}");
                            return builder.toString();
                        } catch (NumberFormatException e0) {
                            return result.getValue();
                        } catch (ClassCastException e0) {
                            return result.getValue();
                        }

                    }
                    return result.getValue();
                }
            }
            return "";
        }

        /**
         * Find the property for the matching index.
         * 
         * @param columnIndex
         *            the index to look for
         * @param iterationResult
         *            the iteration result
         * @return the property that was found or null
         */
        private KiemProperty findProperty(final int columnIndex,
                final IterationResult iterationResult) {
            int counter = 0;
            for (KiemProperty prop : iterationResult.getResults()) {
                if (counter == columnIndex) {
                    return prop;
                }
                counter++;
            }

            List<AbstractResult> children = iterationResult.getChildren();

            if (children != null && !children.isEmpty()) {
                for (AbstractResult comp : children) {

                    List<KiemProperty> results = comp.getResults();

                    if (results != null && !results.isEmpty()) {
                        for (KiemProperty prop : results) {
                            if (counter == columnIndex) {
                                return prop;
                            }
                            counter++;
                        }
                    }
                }
            }
            return null;
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void addListener(final ILabelProviderListener listener) {
        }

        /**
         * {@inheritDoc}
         */
        public boolean isLabelProperty(final Object element,
                final String property) {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        public void removeListener(final ILabelProviderListener listener) {
        }

    }
}
