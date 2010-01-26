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

import java.util.StringTokenizer;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The Class KiemPropertyTypeEditor. This implements a sample KiemPropertyType that uses a displays
 * a list of all open editors to choose from.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemPropertyTypeEditor extends KiemPropertyType implements IKiemPropertyType {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3163900421868918205L;

    /** The Constant PROPERTY_CHOICE. */
    private static final Image PROPERTY_CHOICE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/propertyEditorIcon.png").createImage();

    /** The editor items. */
    private String[] items;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyType editor.
     */
    public KiemPropertyTypeEditor() {
        super();
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
        refreshItems();
        return new ComboBoxCellEditor(parent, items, SWT.Deactivate);
    }

    // -------------------------------------------------------------------------

    /**
     * Refresh editor items. Goes thru the list of all opened Eclipse editors and adds them to the
     * items list for the drop down list.
     */
    public void refreshItems() {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorReference[] editors = page.getEditorReferences();
        if ((editors == null) || (editors.length == 0)) {
            this.items = new String[0];
            return;
        }
        String[] itemsTmp = new String[editors.length];
        for (int c = 0; c < editors.length; c++) {
            try {
                itemsTmp[c] = editors[c].getTitle() + " (" + editors[c].getId() + ")";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.items = itemsTmp;
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges String names values (encoded as Strings in property) to int of the
     * combobox cell editor. All items are searched, and the resulting index is returned. If nothing
     * is found, the first item with index 0 is the default selected one.
     * 
     * {@inheritDoc}
     */
    public Object getValue(final KiemProperty property) {
        if ((items == null) || (items.length == 0)) {
            return "0";
        }
        for (int c = 0; c < items.length; c++) {
            if (property.getValue().equals(items[c])) {
                return "" + c;
            }
        }
        return "0"; // default is the first item
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the DiagramEditor selected in the KiemProperty.
     * 
     * @param property
     *            the KiemProperty
     * 
     * @return the DiagramEditor
     */
    public DiagramEditor getValueAsDiagramEditor(final KiemProperty property) {
        String kiemEditorProperty = property.getValue();
        DiagramEditor noDiagramEditor = null;

        // only check non-empty and valid property (this is optional)
        if (!kiemEditorProperty.equals("")) {
            if ((kiemEditorProperty == null) || (kiemEditorProperty.length() == 0)) {
                return null;
            }

            StringTokenizer tokenizer = new StringTokenizer(kiemEditorProperty, " ()");
            if (tokenizer.hasMoreTokens()) {
                String fileString = tokenizer.nextToken();
                String editorString = tokenizer.nextToken();

                IEditorReference[] editorRefs = PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getActivePage().getEditorReferences();
                for (int i = 0; i < editorRefs.length; i++) {
                    if (editorRefs[i].getId().equals(editorString)) {
                        IEditorPart editor = editorRefs[i].getEditor(true);
                        if (editor instanceof DiagramEditor) {
                            // test if correct file
                            if (fileString.equals(editor.getTitle())) {
                                return (DiagramEditor) editor;
                            }
                        }
                    }
                }
            }
        }
        return noDiagramEditor;
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges String names values (encoded as Strings in property) to int of the
     * combobox cell editor. The item text of the selected index is saved as a String.
     * 
     * {@inheritDoc}
     */
    public void setValue(final KiemProperty property, final Object value) {
        if ((items == null) || (items.length == 0)) {
            return;
        }
        property.setValue(items[Integer.parseInt((String) value)]);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
     */
    @Override
    public Image provideIcon() {
        return PROPERTY_CHOICE;
    }

}
