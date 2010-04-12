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

import java.util.List;

import de.cau.cs.kieler.sim.kiem.automated.ui.KiemAutoUIPlugin;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.ExecutionFilePanel.PanelData;

/**
 * Abstract super class for all table exporter.
 * 
 * @author soh
 * @kieler.rating 2010-02-08 proposed yellow
 */
public abstract class AbstractTableExporter {

    /** The systems newline character. */
    protected static final String NEWLINE = System
            .getProperty("line.separator");

    /**
     * Export the entire table by converting it into a string that can be
     * written to a file.
     * 
     * @return the resulting string
     */
    public String export() {
        StringBuilder result = new StringBuilder();
        AutomatedEvalView view = KiemAutoUIPlugin.getAutomatedEvalView();
        if (view != null) {
            List<PanelData> data = view.getData();

            for (PanelData panelData : data) {
                result.append(exportData(panelData) + NEWLINE);
            }
        }

        return result.toString();
    }

    /**
     * Export the panel data.
     * 
     * @param data
     *            the data
     * @return the converted string
     */
    public abstract String exportData(PanelData data);

}
