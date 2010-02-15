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
package de.cau.cs.kieler.sim.kiem.automated.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The page for setting up all custom properties for the execution.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class PropertySettingPage extends WizardPage implements
        SelectionListener {

    /** Some spaces to fill the text fields to ensure sufficient length. */
    private static final String SPACES = "                    ";

    /** The composite where everything is displayed. */
    private Group mainGroup;
    /** button for adding a new property. */
    private Button addPropertyButton;

    /** The panels that each can contain one property. */
    private List<PropertyPanel> propertyPanels;
    /** The initial setup of the page. */
    private List<KiemProperty> initialSelection;

    // --------------------------------------------------------------------------

    /**
     * Creates a new empty PropertySettingPage.
     */
    public PropertySettingPage() {
        super("PropertySettingPage");
        super
                .setTitle("Select the properties to be passed along to the DataComponents.");

    }

    /**
     * Creates a new PropertySettingPage with an initial setup.
     * 
     * @param selection
     *            the initial selection
     */
    public PropertySettingPage(final List<KiemProperty> selection) {
        this();
        this.initialSelection = selection;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void createControl(final Composite parent) {
        mainGroup = new Group(parent, SWT.BORDER);
        mainGroup.setText("Properties");

        mainGroup.setLayout(new GridLayout(1, false));
        mainGroup.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING,
                true, true));

        addPropertyButton = new Button(mainGroup, SWT.BORDER);
        addPropertyButton.setText("Add a new property");
        addPropertyButton.addSelectionListener(this);

        new Label(mainGroup, SWT.NONE);
        new Label(mainGroup, SWT.NONE);
        new Label(mainGroup, SWT.NONE);

        if (initialSelection != null && !initialSelection.isEmpty()) {
            for (KiemProperty prop : initialSelection) {
                addProperty(prop.getKey(), prop.getValue());
            }
        }

        mainGroup.pack();
        super.setControl(mainGroup);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Control getControl() {
        return mainGroup;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canFlipToNextPage() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPageComplete() {
        return true;
    }

    // --------------------------------------------------------------------------

    /**
     * Add a new property to the page.
     * 
     * @param key
     *            the initial key for the property
     * @param value
     *            the initial value for the property
     */
    private void addProperty(final String key, final String value) {
        if (propertyPanels == null) {
            propertyPanels = new LinkedList<PropertyPanel>();
        }
        propertyPanels.add(new PropertyPanel(key, value));
    }

    /**
     * Getter for the properties.
     * 
     * @return the list of properties
     */
    public List<KiemProperty> getProperties() {
        List<KiemProperty> result = new LinkedList<KiemProperty>();

        if (propertyPanels != null) {
            for (PropertyPanel panel : propertyPanels) {
                KiemProperty prop = panel.getProperty();
                if (prop != null) {
                    result.add(prop);
                }
            }
        }
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void widgetDefaultSelected(final SelectionEvent e) {
    }

    /**
     * {@inheritDoc}
     */
    public void widgetSelected(final SelectionEvent e) {
        if (e.widget == addPropertyButton) {
            addProperty("", "");
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * A panel handling the setting of one custom property.
     * 
     * @author soh
     * @kieler.rating 2009-01-29 proposed yellow
     */
    private class PropertyPanel implements SelectionListener {

        /** The number of columns in this components GridLayout. */
        private static final int NUM_OF_COLS = 5;

        /** The group where all components are. */
        private Group propertyGroup;
        /** The label in front of the property key text field. */
        private Label propKeyLabel;
        /** The text field for entering the property key. */
        private Text propKeyText;
        /** The label in front of the property value text field. */
        private Label propValueLabel;
        /** The text field for entering a property value. */
        private Text propValueText;
        /** The button for removing the entire panel. */
        private Button removeButton;

        // --------------------------------------------------------------------------

        /**
         * 
         * Creates a new PropertySettingPage.
         * 
         * @param initKey
         *            the initial contents of the key field
         * @param initValue
         *            the initial contents of the value field
         */
        public PropertyPanel(final String initKey, final String initValue) {
            propertyGroup = new Group(mainGroup, SWT.NONE);
            propertyGroup.setLayout(new GridLayout(NUM_OF_COLS, false));
            propertyGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
                    true));

            propKeyLabel = new Label(propertyGroup, SWT.NONE);
            propKeyLabel.setText(Tools.PROPERTY_KEY_NAME);

            propKeyText = new Text(propertyGroup, SWT.BORDER);
            propKeyText.setToolTipText(Tools.PROPERTY_KEY_HINT);
            propKeyText.setText(initKey + SPACES);

            propValueLabel = new Label(propertyGroup, SWT.NONE);
            propValueLabel.setText(Tools.PROPERTY_VALUE_NAME);

            propValueText = new Text(propertyGroup, SWT.BORDER);
            propValueText.setToolTipText(Tools.PROPERTY_VALUE_HINT);
            propValueText.setText(initValue + SPACES);

            removeButton = new Button(propertyGroup, SWT.BORDER);
            removeButton.setText("Remove property");
            removeButton.addSelectionListener(this);

            propertyGroup.pack();
            mainGroup.pack();
        }

        // --------------------------------------------------------------------------

        /**
         * Construct a new KiemProperty from the contents of this panel.
         * 
         * @return the newly created property or null if the key was empty
         */
        public KiemProperty getProperty() {
            KiemProperty result = null;
            String keyString = propKeyText.getText().trim();
            if (keyString != null && keyString.length() > 0) {
                String valueString = propValueText.getText();
                if (valueString != null) {
                    valueString = valueString.trim();
                }

                result = new KiemProperty(keyString.trim(), valueString);
            }
            return result;
        }

        // --------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void widgetDefaultSelected(final SelectionEvent e) {
        }

        /**
         * {@inheritDoc}
         */
        public void widgetSelected(final SelectionEvent e) {
            if (e.widget == removeButton) {
                propertyPanels.remove(this);
                removeButton.dispose();
                propKeyText.dispose();
                propValueText.dispose();
                propValueLabel.dispose();
                propKeyLabel.dispose();
                propertyGroup.dispose();
                mainGroup.redraw();
                mainGroup.pack();
            }
        }

        // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------

    }
}
