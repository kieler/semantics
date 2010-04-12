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
package de.cau.cs.kieler.sim.kiem.automated.ui.ui;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.dialogs.ListSelectionDialog;

import de.cau.cs.kieler.sim.kiem.automated.ui.KiemAutoUIPlugin;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.AbstractTableExporter;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.AutomatedEvalView;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.CSVTableExporter;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.LatexTableExporter;

/**
 * Action for exporting and saving the tables on the view.
 * 
 * @author soh
 * @kieler.rating 2010-02-09 proposed yellow
 */
public class ExportTableAction implements IViewActionDelegate,
        IStructuredContentProvider, ILabelProvider {

    /**
     * The different types of formats for export.
     * 
     * @author soh
     * @kieler.rating 2010-02-16 proposed yellow
     */
    private enum ExportType {
        /** Comma separated values. */
        CSV,
        /** Latex format. */
        LATEX;

        /**
         * Getter for the suggested file extension.
         * 
         * @return the extension
         */
        public String extension() {
            switch (this) {
            case LATEX:
                return "tex";

            case CSV:
            default:
                return "txt";
            }
        }

        @Override
        public String toString() {
            switch (this) {
            case LATEX:
                return "Latex";
            case CSV:
                return "CSV";
            default:
                return "Unknown";
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void init(final IViewPart view) {
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {
        AutomatedEvalView view = KiemAutoUIPlugin.getAutomatedEvalView();
        if (view != null && !view.isEmpty()) {
            Shell shell = view.getViewSite().getShell();

            // create the dialog
            ListSelectionDialog dialog = new ListSelectionDialog(shell,
                    ExportType.values(), this, this, "Export to...");
            dialog.setHelpAvailable(false);

            if (dialog.open() == Window.OK) {
                Object[] results = dialog.getResult();
                List<ExportType> types = new LinkedList<ExportType>();
                for (Object o : results) {
                    types.add((ExportType) o);
                }
                String selectedPath = "";

                for (ExportType type : types) {
                    String title = "Save " + type.toString() + " to...";
                    String suggestedName = view.getPanels().get(0)
                            .getExecName().removeFileExtension()
                            .addFileExtension(type.extension()).lastSegment();

                    FileDialog fileDialog = new FileDialog(shell, SWT.SAVE);
                    fileDialog.setFilterPath(selectedPath);
                    fileDialog.setFileName(suggestedName);
                    fileDialog.setText(title);

                    selectedPath = fileDialog.open();

                    if (selectedPath != null) {

                        AbstractTableExporter exporter = null;
                        switch (type) {

                        case LATEX:
                            exporter = new LatexTableExporter();
                            break;
                        case CSV:
                        default:
                            exporter = new CSVTableExporter();
                        }

                        saveToFile(exporter, selectedPath);

                        // convert string to path
                        StringBuilder builder = new StringBuilder(selectedPath);
                        int index = builder.lastIndexOf(Path.SEPARATOR + "");
                        if (index != -1) {
                            builder.delete(index + 1, builder.length());
                        }
                        selectedPath = builder.toString();
                    }
                }
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Save an exported string to a file.
     * 
     * @param exporter
     *            the exporter that will produce the string
     * @param path
     *            the path of the file
     */
    private void saveToFile(final AbstractTableExporter exporter,
            final String path) {
        String exportString = exporter.export();

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            fos = new FileOutputStream(path);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            bw.write(exportString);

            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                osw.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action,
            final ISelection selection) {
    }

    /**
     * {@inheritDoc}
     */
    public Object[] getElements(final Object inputElement) {
        if (inputElement instanceof ExportType[]) {
            return (ExportType[]) inputElement;
        }
        return null;
    }

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
    public Image getImage(final Object element) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getText(final Object element) {
        if (element instanceof ExportType) {
            ExportType elem = (ExportType) element;
            switch (elem) {
            case CSV:
                return "CSV (Comma Separated Values)";
            case LATEX:
                return "Latex source code";
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void addListener(final ILabelProviderListener listener) {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isLabelProperty(final Object element, final String property) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public void removeListener(final ILabelProviderListener listener) {
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

}
