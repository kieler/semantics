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
package de.cau.cs.kieler.sim.kiem.automated.preferences;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.KiemPropertyKeyWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Preference page for KIEM main configuration.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class KiemAutoPreferencePage extends PreferencePage implements
        IWorkbenchPreferencePage {

    /** The maximum number of chars in a text input box. */
    private static final int TEXT_BOX_LIMIT = 20;

    /** the group where the properties text fields are displayed. */
    private Group propertiesGroup;

    /** The list of input fields. */
    private List<KiemIntegerPropertyInputField> inputs;

    /** self reference for the use by inner classes. */
    private PreferencePage page;

    // --------------------------------------------------------------------------

    /** Creates the configuration preference page. */
    public KiemAutoPreferencePage() {
        super();
        setDescription("This page holds the different properties of KIEMAuto.");
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
            Tools.showErrorWithStackTrace(e0, parent.getShell());
        }
        return propertiesGroup;
    }

    /**
     * Build the page.
     * 
     * @param parent
     *            the parent component.
     */
    private void buildPage(final Composite parent) {
        propertiesGroup = new Group(parent, SWT.NONE);

        // get values from the main plugin
        ConfigurationManager configuration = ConfigurationManager.getInstance();

        try {
            configuration.findPropertyValue(new KiemPropertyKeyWrapper(
                    KiemAutomatedPlugin.AUTO_TIMEOUT_ID),
                    KiemAutomatedPlugin.AUTO_TIMEOUT_DEFAULT + "");
        } catch (KiemPropertyException e0) {
            // can't happen as default value is supplied
        }

        KiemProperty[] properties = configuration
                .getExternalDefaultProperties();
        inputs = new LinkedList<KiemIntegerPropertyInputField>();

        for (KiemProperty prop : properties) {
            if (prop.getKey().equals(KiemAutomatedPlugin.AUTO_TIMEOUT_ID)) {
                inputs.add(new KiemIntegerPropertyInputField(prop));
                break;
            }
        }

        // button for always use defaults dialog
        propertiesGroup.setLayout(new GridLayout(2, true));
        propertiesGroup.setLayoutData(new GridData(SWT.BEGINNING,
                SWT.BEGINNING, true, true));
        propertiesGroup.pack();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {

    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean performOk() {
        if (!saveProperties()) {
            return false;
        }
        return true;
    }

    /**
     * Write the properties in the text fields to back end and perform a save.
     * 
     * @return if there is an illegal argument in one of the fields.
     */
    private boolean saveProperties() {
        for (KiemIntegerPropertyInputField input : inputs) {
            if (!input.save()) {
                Tools.showErrorDialog("Invalid input on text field.", page
                        .getShell());
                input.update();
                return false;
            }
        }
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
     * {@inheritDoc}
     */
    @Override
    public void performDefaults() {

    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Handles a Text input field with label and tooltip for one of the default
     * KIEM properties.
     * <p>
     * The class also provides a save method to write the contents of the text
     * field to the back end.
     * 
     * @author soh
     * @kieler.rating 2010-01-27 proposed yellow
     */
    private class KiemIntegerPropertyInputField {

        /** Some spaces to bring the input fields to proper size. */
        private static final String SPACES = "          ";

        /** The label for displaying a readable name. */
        private Label label;
        /** The property associated with this text field. */
        private KiemProperty property;
        /** The text field for user input. */
        private Text text;

        // --------------------------------------------------------------------------

        /**
         * 
         * Creates a new input field.
         * 
         * @param propertyParam
         *            the property associated with this field.
         */
        public KiemIntegerPropertyInputField(final KiemProperty propertyParam) {
            this.property = propertyParam;
            create();
        }

        // --------------------------------------------------------------------------

        /**
         * Creates the label, text field and tooltips for this input field.
         */
        public void create() {
            label = new Label(propertiesGroup, SWT.NONE);
            label.setText(getLabelFor(property.getKey()));
            label.setToolTipText(getTooltipFor(property.getKey()));

            text = new Text(propertiesGroup, SWT.BORDER);
            text.setText(property.getValue() + SPACES);
            text.setTextLimit(TEXT_BOX_LIMIT);
            text.setToolTipText(getTooltipFor(property.getKey()));
            text.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING,
                    false, false));
        }

        /**
         * Get the tooltip for the property key.
         * 
         * @param key
         *            the key
         * @return the tooltip
         */
        private String getTooltipFor(final String key) {
            if (key.equals(KiemAutomatedPlugin.AUTO_TIMEOUT_ID)) {
                return "The timeout during the automation.";
            }
            return "";
        }

        /**
         * Get the label for the property.
         * 
         * @param key
         *            the key
         * @return the label
         */
        private String getLabelFor(final String key) {
            if (key.equals(KiemAutomatedPlugin.AUTO_TIMEOUT_ID)) {
                return "Automation timeout";
            }
            return "";
        }

        // --------------------------------------------------------------------------

        /**
         * Saves the input to back end.
         * 
         * @return true if the value was saved, false if the input was invalid.
         */
        public boolean save() {
            boolean saved = false;
            String input = text.getText().trim();
            try {
                int integerInput = Integer.parseInt(input);
                property.setValue(integerInput + "");
                saved = true;
            } catch (NumberFormatException e0) {
                saved = false;
            }
            return saved;
        }

        // --------------------------------------------------------------------------

        /**
         * Updates the contents of the text box with saved value.
         */
        public void update() {
            text.setText(property.getValue());
        }
    }
}
