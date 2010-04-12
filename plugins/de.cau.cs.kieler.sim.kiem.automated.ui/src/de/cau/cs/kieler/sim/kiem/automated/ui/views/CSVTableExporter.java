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
package de.cau.cs.kieler.sim.kiem.automated.ui.views;

import de.cau.cs.kieler.sim.kiem.automated.ui.views.ExecutionFilePanel.PanelData;

/**
 * The builder for converting the table to a comma separated file.
 * 
 * @author soh
 * @kieler.rating 2010-02-08 proposed yellow
 */
public class CSVTableExporter extends AbstractTableExporter {

    /** The double quote. */
    private static final String DOUBLE_QUOTE = "\"";

    /**
     * Export a row.
     * 
     * @param row
     *            the row to convert
     * @return the converted string
     */
    private String exportRow(final String[] row) {
        StringBuilder builder = new StringBuilder();
        for (String s : row) {
            // format string to match CSV requirements
            String formatted = DOUBLE_QUOTE
                    + s.replaceAll(DOUBLE_QUOTE, DOUBLE_QUOTE + DOUBLE_QUOTE)
                    + DOUBLE_QUOTE;
            builder.append(formatted + ",");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append(NEWLINE);
        return builder.toString();
    }

    /**
     * Export the entire table.
     * 
     * @param table
     *            the table to export
     * @return the converted string
     */
    private String exportTable(final String[][] table) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            builder.append(exportRow(table[i]));
        }

        return builder.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String exportData(final PanelData data) {
        StringBuilder builder = new StringBuilder();
        builder.append(data.getExecFileName() + NEWLINE);
        builder.append(exportRow(data.getHeaders()));
        builder.append(exportTable(data.getData()));
        return builder.toString();
    }

}
