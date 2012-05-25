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

package de.cau.cs.kieler.sim.kiem.properties;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The Class KiemPropertyTypeFile. This implements a sample KiemPropertyType that uses a standard
 * SWT dialog to browse for a file.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 * 
 */
public class KiemPropertyTypeFile extends KiemPropertyType implements IKiemPropertyType {

    /** The Constant PROPERTY_FILE. */
    private static final Image PROPERTY_FILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/propertyFileIcon.png").createImage();

    /** The Constant DEFAULT_FILTER_NAMES. */
    private static final String[] DEFAULT_FILTER_NAMES = { "All Files (*.*)" };

    /** The Constant DEFAULT_FILTER_EXTS. */
    private static final String[] DEFAULT_FILTER_EXTS = { "*.*" };

    /** The filter extension names. */
    private String[] filterNames;

    /** The filter extensions. */
    private String[] filterExts;

    /** A flag whether the user can modify the text field manually. */
    private boolean isEditable;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyType file.
     */
    public KiemPropertyTypeFile() {
        super();
        this.filterNames = DEFAULT_FILTER_NAMES;
        this.filterExts = DEFAULT_FILTER_EXTS;
        this.isEditable = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyType file.
     * 
     * @param textFieldIsEditableManually
     *            a flag whether the user can modify the text field manually
     */
    public KiemPropertyTypeFile(final boolean textFieldIsEditableManually) {
        super();
        this.filterNames = DEFAULT_FILTER_NAMES;
        this.filterExts = DEFAULT_FILTER_EXTS;
        this.isEditable = textFieldIsEditableManually;
    }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------

    /**
     * This method bridges String file location values (encoded as Strings in property) and the
     * String displayed in the String cell editor.
     * 
     * {@inheritDoc}
     */
    public Object getValue(final KiemProperty property) {
        return property.getValue();
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges String file location values (encoded as Strings in property) and the
     * String displayed in the String cell editor.
     * 
     * {@inheritDoc}
     */
    public void setValue(final KiemProperty property, final Object value) {
        if (value != null) {
            property.setValue((String) value);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the value as file.
     * 
     * @param property
     *            the property
     * 
     * @return the value as file
     */
    public static IPath getValueAsIPath(final KiemProperty property) {
        String filePath = property.getFilePath();
        Path returnPath = new Path(filePath);
        return returnPath;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
     */
    @Override
    public Image provideIcon() {
        return PROPERTY_FILE;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideCellEditor(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public CellEditor provideCellEditor(final Composite parent) {
        return new CustomDialogCellEditor(parent, isEditable);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the filter extension names.
     * 
     * @param filterNamesParam
     *            the new filter names
     */
    public void setFilterNames(final String[] filterNamesParam) {
        this.filterNames = filterNamesParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the filter extension names.
     * 
     * @return the filter names
     */
    public String[] getFilterNames() {
        return this.filterNames;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the filter extensions.
     * 
     * @param filterExtsParam
     *            the new filter extensions
     */
    public void setFilterExts(final String[] filterExtsParam) {
        this.filterExts = filterExtsParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the filter extensions.
     * 
     * @return the filter extensions
     */
    public String[] getFilterExts() {
        return this.filterExts;
    }

    // -------------------------------------------------------------------------

    /**
     * The Class CustomDialogCellEditor.
     */
    public class CustomDialogCellEditor extends EditableDialogCellEditor {

        // ---------------------------------------------------------------------

        /**
         * Instantiates a new custom dialog cell editor.
         * 
         * @param parent
         *            the parent
         * @param isEditableParam
         *            the isEditable parameter
         */
        public CustomDialogCellEditor(final Composite parent, final boolean isEditableParam) {
            super(parent, isEditableParam);
        }

        // ---------------------------------------------------------------------

        /*
         * (non-Javadoc)
         * 
         * @see
         * org.eclipse.jface.viewers.DialogCellEditor#openDialogBox(org.eclipse.swt.widgets.Control)
         */
        @Override
        protected Object openDialogBox(final Control cellEditorWindow) {
            FileDialog dlg = new FileDialog(cellEditorWindow.getShell(), SWT.SINGLE);
            // if we have a value, then take this to set the file name
            Object object = this.getValue();
            if (object != null && object instanceof String) {
                try {
                    // set the default directory to the one the current file comes from
                    String fileName = (String) object;
                    String filePath = (new File(fileName)).getParentFile().getAbsolutePath();
                    if (filePath.endsWith("/")) {
                        filePath = filePath.substring(0, filePath.length());
                    }
                    if (filePath.endsWith("\\")) {
                        filePath = filePath.substring(0, filePath.length());
                    }
                    dlg.setFilterPath(filePath);
                } catch (Exception e) {
                    // ignore false paths
                }
            }
            dlg.setOverwrite(true);
            String fn = dlg.open();
            if (fn != null) {
                return dlg.getFilterPath().toString() + System.getProperty("file.separator")
                        + dlg.getFileName().toString();
            }
            return null;
        }

    }

}
