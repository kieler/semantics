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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler.StatusListener;
import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.config.managers.ContributionManager;
import de.cau.cs.kieler.sim.kiem.config.ui.PropertyUsageDialog;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * Preference page for KIEM main configuration.
 * <p>
 * Modified version of the LayoutPreferencePage in de.cau.cs.kieler.kiml.ui by
 * msp.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class ConfigurationsPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	/** The maximum number of chars in a text input box. */
	private static final int TEXT_BOX_LIMIT = 20;

	/** The check box for enabling/disabling advanced mode. */
	private Button advancedCheck;
	/** the button for displaying the default usage dialog. */
	private Button alwaysUseDefaultsButton;
	/** Checkbox for enabling/disabling the matching schedules combo. */
	private Button matchingCheck;
	/** Checkbox for enabling/disabling the recent schedules combo. */
	private Button recentCheck;
	/** The check box for enabling/disabling execution summary message. */
	private Button summaryMessageCheck;

	/** the group where the properties text fields are displayed. */
	private Group propertiesGroup;

	/** The list of input fields. */
	private List<KiemIntegerPropertyInputField> inputs;

	/** self reference for the use by inner classes. */
	private PreferencePage page;

	// --------------------------------------------------------------------------

	/** Creates the configuration preference page. */
	public ConfigurationsPreferencePage() {
		super();
		setDescription("This page holds the different properties of the KIELER Execution Manager.");
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

		// FIXME: Workaround to prevent a ClassCircularityError from
		// throwing a popup warning. Find a way to remove the formal
		// circularity without changing the semantics.
		// (The program works just fine, the circularity never actually
		// affects anything)
		StatusListener dummy = new StatusListener() {
			public int reroute(final StatusAdapter statusAdapter,
					final int style) {
				IStatus status = statusAdapter.getStatus();
				if (status != null) {
					if (status.getException() instanceof ClassCircularityError) {
						return StatusManager.NONE;
					}
				}
				return StatusListener.DONT_CARE;
			}
		};
		KiemConfigurationPlugin.addErrorListener(dummy);

		// get values from the main plugin
		ConfigurationManager configuration = ConfigurationManager.getInstance();

		KiemConfigurationPlugin.removeErrorListener(dummy);

		KiemProperty[] properties = configuration
				.getInternalDefaultProperties();
		inputs = new LinkedList<KiemIntegerPropertyInputField>();
		for (KiemProperty prop : properties) {
			inputs.add(new KiemIntegerPropertyInputField(prop));
		}

		ConfigPageListener listener = new ConfigPageListener();

		// button for always use defaults dialog
		alwaysUseDefaultsButton = new Button(propertiesGroup, SWT.NONE);
		alwaysUseDefaultsButton.setText("Property usage...");
		alwaysUseDefaultsButton
				.setToolTipText(Tools.IGNORED_KEYS_BUTTON_TOOLTIP);
		alwaysUseDefaultsButton.addListener(SWT.Selection, listener);

		// checkbox for the execution summary message
		summaryMessageCheck = new Button(propertiesGroup, SWT.CHECK);
		summaryMessageCheck.setText("Disable execution summary message");
		summaryMessageCheck.addListener(SWT.Selection, listener);

		// checkbox for the recent schedules
		recentCheck = new Button(propertiesGroup, SWT.CHECK);
		recentCheck.setText("Show recently used schedules combo");
		recentCheck.addListener(SWT.Selection, listener);

		// checkbox for the matching schedules
		matchingCheck = new Button(propertiesGroup, SWT.CHECK);
		matchingCheck.setText("Show matching schedules combo");
		matchingCheck.addListener(SWT.Selection, listener);

		advancedCheck = new Button(propertiesGroup, SWT.CHECK);
		advancedCheck.setText("Enable advanced user mode");
		advancedCheck.setToolTipText(Tools.ADVANCED_MODE_HINT);
		advancedCheck.addListener(SWT.Selection, listener);

		propertiesGroup.setLayout(new GridLayout(2, true));
		propertiesGroup.setLayoutData(new GridData(SWT.BEGINNING,
				SWT.BEGINNING, true, true));
		propertiesGroup.pack();
		checkButtonStatus();
	}

	// --------------------------------------------------------------------------

	/**
	 * Confirm the status of the checkboxes.
	 */
	private void checkButtonStatus() {
		summaryMessageCheck.setSelection(ContributionManager.getInstance()
				.isSummaryMessageDisabled());
		recentCheck.setSelection(ContributionManager.getInstance()
				.isComponentEnabled(ContributionManager.RECENT_COMBO));
		matchingCheck.setSelection(ContributionManager.getInstance()
				.isComponentEnabled(ContributionManager.MATCHING_COMBO));
		advancedCheck.setSelection(ContributionManager.getInstance()
				.isInAdvancedMode());
		summaryMessageCheck.setSelection(ContributionManager.getInstance()
				.isSummaryMessageDisabled());
	}

	/**
	 * Do the layout of this preference page.
	 */
	private void doLayout() {
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
				Tools.showErrorDialog("Invalid input on text field.",
						page.getShell());
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
		ConfigurationManager.getInstance().restoreDefaults();
		for (KiemIntegerPropertyInputField input : inputs) {
			input.update();
		}
		doLayout();
	}

	// --------------------------------------------------------------------------

	/**
	 * Toggle either of the combo boxes.
	 * 
	 * @param comboId
	 *            either ContributionManager.RECENT_COMBO or
	 *            ContributionManager.MATCHING_COMBO
	 * @param enabled
	 *            true if the combo should be enabled, false if not
	 */
	private void toggleCombo(final int comboId, final boolean enabled) {
		ContributionManager.getInstance().toggleCombo(comboId, enabled);
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
			try {
				if (event.widget == summaryMessageCheck) {
					ContributionManager.getInstance()
							.setSummaryMessageDisabled(
									summaryMessageCheck.getSelection());
				}
				if (event.widget == matchingCheck) {
					toggleCombo(ContributionManager.MATCHING_COMBO,
							matchingCheck.getSelection());
				}
				if (event.widget == recentCheck) {
					toggleCombo(ContributionManager.RECENT_COMBO,
							recentCheck.getSelection());
				}
				if (event.widget == advancedCheck) {
					ContributionManager.getInstance().setInAdvancedMode(
							advancedCheck.getSelection());
				}
				if (event.widget == alwaysUseDefaultsButton) {
					PropertyUsageDialog.displayDialog(page.getShell());
				}
				checkButtonStatus();
				// do layout
				doLayout();
			} catch (RuntimeException e0) {
				Tools.showErrorWithStackTrace(e0, page.getShell());
			}
		}
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
			label.setText(Tools.getLabelFor(property.getKey()));
			label.setToolTipText(Tools.getTooltipFor(property.getKey()));

			text = new Text(propertiesGroup, SWT.BORDER);
			text.setText(property.getValue() + SPACES);
			text.setTextLimit(TEXT_BOX_LIMIT);
			text.setToolTipText(Tools.getTooltipFor(property.getKey()));
			text.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING,
					false, false));
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
