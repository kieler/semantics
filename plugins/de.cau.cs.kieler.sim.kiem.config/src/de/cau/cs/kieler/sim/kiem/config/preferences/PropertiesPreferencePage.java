/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2008 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.config.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.sim.kiem.config.data.KiemPropertyKeyWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.config.ui.PropertyUsageDialog;
import de.cau.cs.kieler.sim.kiem.config.ui.NewPropertyDialog;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * Preference page for the configuration of user defined properties.
 * <p>
 * Modified version of the LayoutPreferencePage in de.cau.cs.kieler.kiml.ui by
 * msp.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class PropertiesPreferencePage extends PreferencePage implements
        IWorkbenchPreferencePage, FocusListener {

    /** tooltip for the remove property button. */
    private static final String REMOVE_PROPERTY_TOOLTIP = "Remove all selected "
            + "properties.";

    /** the button for adding new properties to the configuration. */
    private Button addButton;
    /** the button for displaying the default usage dialog. */
    private Button alwaysUseDefaultsButton;
    /** the button for removing properties from the configuration. */
    private Button removeButton;

    /** self reference for the use by inner classes. */
    private PreferencePage page;
    /** the group where the property table is displayed. */
    private Group propertiesGroup;
    /** the table displaying the properties. */
    private Table propertiesTable;

    /** the provider class that manages content of the priority table. */
    private PropertiesTableProvider tableProvider;

    // --------------------------------------------------------------------------

    /** Creates the configuration preference page. */
    public PropertiesPreferencePage() {
        super();
        setDescription("This page holds all user defined properties. "
                + "Any of these properties can be accessed "
                + "from other plugins by:\nConfigurationManager.getInstance().findProperty(key)");
        page = this;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createContents(final Composite parent) {
        try {
            buildPage(parent);
        } catch (RuntimeException e0) {
            Tools.showErrorWithStackTrace(e0, page.getShell());
        }
        return propertiesGroup;
    }

    /**
     * Build the preference page.
     * 
     * @param parent
     *            the parent component.
     */
    private void buildPage(final Composite parent) {
        propertiesGroup = new Group(parent, SWT.NONE);
        propertiesGroup.setText("Configuration");

        // get values from the main plugin
        ConfigurationManager configuration = ConfigurationManager.getInstance();

        if (configuration.getExternalDefaultProperties() != null
                && configuration.getExternalDefaultProperties().length > 0) {
            // construct the configuration table
            propertiesTable = new Table(propertiesGroup, SWT.BORDER);
            String[] headers = { Tools.PROPERTY_KEY_NAME,
                    Tools.PROPERTY_VALUE_NAME };

            // build the table columns
            TableColumn[] columns = new TableColumn[2];
            columns[0] = new TableColumn(propertiesTable, SWT.NONE);
            columns[0].setText(headers[0]);
            columns[0].setToolTipText(Tools.PROPERTY_KEY_HINT);
            columns[1] = new TableColumn(propertiesTable, SWT.NONE);
            columns[1].setText(headers[1]);
            columns[1].setToolTipText(Tools.PROPERTY_VALUE_HINT);
            propertiesTable.setHeaderVisible(true);

            // initialize table viewer
            TableViewer configurationTableViewer = new TableViewer(
                    propertiesTable);
            String[] columnProperties = new String[2];
            columnProperties[0] = headers[0];
            columnProperties[1] = headers[1];
            configurationTableViewer.setColumnProperties(columnProperties);

            // construct cell editors
            CellEditor[] cellEditors = new CellEditor[2];
            cellEditors[0] = null; // keys can't be changed
            cellEditors[1] = new TextCellEditor(propertiesTable);

            // construct the table provider
            tableProvider = new PropertiesTableProvider(
                    configurationTableViewer, headers);
            configurationTableViewer.setContentProvider(tableProvider);
            configurationTableViewer.setLabelProvider(tableProvider);
            configurationTableViewer.setCellEditors(cellEditors);
            configurationTableViewer.setCellModifier(tableProvider);
            configurationTableViewer.setInput(configuration);
            configurationTableViewer.setComparator(new KiemTableComparator());

            // do layout
            for (TableColumn column : columns) {
                column.pack();
            }
            propertiesTable.pack();
            propertiesTable.addFocusListener(this);
        }

        // button for adding properties
        ConfigPageListener listener = new ConfigPageListener();
        addButton = new Button(propertiesGroup, SWT.NONE);
        addButton.setText("Add property...");
        addButton.addListener(SWT.Selection, listener);
        addButton.setToolTipText(Tools.ADD_PROPERTY_TOOLTIP);

        // button for removing properties
        removeButton = new Button(propertiesGroup, SWT.NONE);
        removeButton.setText("Remove property");
        removeButton.addListener(SWT.Selection, listener);
        removeButton.setToolTipText(REMOVE_PROPERTY_TOOLTIP);

        // button for always use defaults dialog
        alwaysUseDefaultsButton = new Button(propertiesGroup, SWT.NONE);
        alwaysUseDefaultsButton.setText("Property usage...");
        alwaysUseDefaultsButton
                .setToolTipText(Tools.IGNORED_KEYS_BUTTON_TOOLTIP);
        alwaysUseDefaultsButton.addListener(SWT.Selection, listener);

        // do layout
        propertiesGroup.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
                false));
        propertiesGroup.setLayout(new GridLayout(1, false));
        propertiesGroup.pack();

        checkButtonStatus();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {

    }

    // --------------------------------------------------------------------------

    /**
     * Updates the status of the buttons according to the selection.
     */
    private void checkButtonStatus() {
        if (propertiesTable != null) {
            TableItem[] items = propertiesTable.getSelection();
            if (items == null || items.length == 0) {
                removeButton.setEnabled(false);
            } else {
                removeButton.setEnabled(true);
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void focusGained(final FocusEvent e) {
        checkButtonStatus();
    }

    /**
     * {@inheritDoc}
     */
    public void focusLost(final FocusEvent e) {
        checkButtonStatus();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean performOk() {
        ConfigurationManager.getInstance().save();
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void performApply() {
        performOk();
    }

    // --------------------------------------------------------------------------

    /**
     * Open a dialog for adding a new property.
     */
    private void addProperty() {
        NewPropertyDialog dialog = new NewPropertyDialog(page.getShell());

        KiemProperty prop = dialog.open();
        if (prop != null) {
            ConfigurationManager.getInstance().addProperty(prop);
        }
    }

    /**
     * Remove all currently selected properties.
     */
    private void removeProperty() {
        TableItem[] items = propertiesTable.getSelection();
        if (items.length > 0) {
            for (TableItem item : items) {
                Object data = item.getData();
                if (data instanceof KiemProperty) {
                    KiemProperty elem = (KiemProperty) data;
                    if (elem.getKey() != null) {
                        KiemPropertyKeyWrapper wrapper = new KiemPropertyKeyWrapper(
                                elem.getKey());
                        ConfigurationManager.getInstance().removeProperty(
                                wrapper);
                    }
                }
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Listener for handling the different events that happen on the preference
     * page.
     * 
     * @author soh
     * @kieler.rating 2010-01-27 proposed yellow
     */
    private class ConfigPageListener implements Listener {

        /**
         * {@inheritDoc}
         */
        public final void handleEvent(final Event event) {
            if (event.widget == addButton) {
                addProperty();
            }
            if (event.widget == removeButton) {
                removeProperty();
            }
            if (event.widget == alwaysUseDefaultsButton) {
                PropertyUsageDialog.displayDialog(page.getShell());
            }
            // do layout
            tableProvider.refresh();
            propertiesTable.update();
            propertiesTable.pack();
            propertiesTable.layout();
            propertiesGroup.pack();
            propertiesGroup.layout();
        }
    }
}
