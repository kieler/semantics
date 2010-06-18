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
package de.cau.cs.kieler.core.model.ui;

import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import de.cau.cs.kieler.core.model.validation.ValidationManager;

/**
 * This factory is responsible for creating the menu entries for the menu of the
 * validate action on the toolbar. Each action corresponds to a check file.
 * 
 * @author soh
 * @kieler.rating 2010-06-11 proposed yellow soh
 */
public class ValidationMenuContributionFactory extends
        ExtensionContributionFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public void createContributionItems(final IServiceLocator serviceLocator,
            final IContributionRoot additions) {
        fillMenu(additions);
    }

    /**
     * Fill the menu with entries for each of the CheckFiles. Add a button for
     * directly going to the preference page at the bottom of the menu.
     * 
     * @param menu
     *            the menu
     */
    private void fillMenu(final IContributionRoot menu) {
        Set<String> files = ValidationManager.getRegisteredFiles();

        for (String id : files) {
            CheckFileMenuItem item = new CheckFileMenuItem(id,
                    ValidationManager.isEnabled(id));
            menu.addContributionItem(item, null);
        }

        menu.addContributionItem(new GotoPreferencePageItem(), null);
    }

    /**
     * One contribution item that corresponds to a checkfile. It contains a
     * checkbox menu item that triggers enablement of the file.
     * 
     * @author soh
     * @kieler.rating 2010-06-11 proposed yellow soh
     */
    private static class CheckFileMenuItem implements SelectionListener,
            IPropertyChangeListener, IContributionItem {

        /** The file that belongs to the menu item. */
        private String id;

        /** True if the file is visible, false if not. */
        private boolean value;

        /** The menu item. */
        private MenuItem result;

        /**
         * Creates a new CheckFileMenuItem.
         * 
         * @param fileParam
         *            the id
         * @param valueParam
         *            true if visible
         */
        public CheckFileMenuItem(final String fileParam,
                final boolean valueParam) {
            this.id = fileParam;
            this.value = valueParam;
        }

        /**
         * {@inheritDoc}
         */
        public void widgetDefaultSelected(final SelectionEvent e) {
        }

        /**
         * {@inheritDoc}
         */
        public void widgetSelected(final SelectionEvent e) {
            // enable or disable the checkfile and trigger a validate
            ValidationManager.setEnabled(id, result.getSelection());
            ValidationManager.validateActiveEditor();
        }

        /**
         * Update the menu item when the underlying property is changed from
         * somewhere else (e.g. the preference page).
         */
        public void propertyChange(final PropertyChangeEvent event) {
            if (event.getProperty().contains(id)) {

                boolean newValue = (Boolean) event.getNewValue();
                if (newValue != result.getSelection()) {
                    result.setSelection(newValue);
                }
            }
        }

        /**
         * Dispose of the menu item and deregister as listener since there is no
         * menu item that needs to be notified of changes.
         */
        public void dispose() {
            result.dispose();
            ValidationManager.removeListener(this);
        }

        /**
         * {@inheritDoc}
         */
        public void fill(final Composite parent) {
        }

        /**
         * Setup the menu item at the specified index in the menu. Also register
         * the necessary listeners.
         */
        public void fill(final Menu parent, final int index) {
            result = new MenuItem(parent, SWT.CHECK, index);
            result.setText(ValidationManager.getDisplay(id));
            result.setSelection(value);
            result.addSelectionListener(this);
            ValidationManager.addListener(this);
        }

        /**
         * {@inheritDoc}
         */
        public void fill(final ToolBar parent, final int index) {
        }

        /**
         * {@inheritDoc}
         */
        public void fill(final CoolBar parent, final int index) {
        }

        /**
         * {@inheritDoc}
         */
        public String getId() {
            return id;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isDirty() {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isDynamic() {
            return true;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isEnabled() {
            return true;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isGroupMarker() {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isSeparator() {
            return false;
        }

        /**
         * The Menu item should only be visible for editors that match the
         * epackage of the checkfile.
         */
        public boolean isVisible() {
            EPackage ePackage = ValidationManager.getEPackageOfActiveEditor();
            if (ePackage == null) {
                return false;
            }
            return ValidationManager.getEPackage(id).equals(ePackage);
        }

        /**
         * {@inheritDoc}
         */
        public void saveWidgetState() {
        }

        /**
         * {@inheritDoc}
         */
        public void setParent(final IContributionManager parent) {
        }

        /**
         * {@inheritDoc}
         */
        public void setVisible(final boolean visible) {
        }

        /**
         * {@inheritDoc}
         */
        public void update() {
        }

        /**
         * {@inheritDoc}
         */
        public void update(final String id) {
        }
    }

    /**
     * The menu item for opening the preference page of the validation manager.
     * 
     * @author soh
     * @kieler.rating 2010-06-11 proposed yellow soh
     */
    private static class GotoPreferencePageItem implements SelectionListener,
            IContributionItem {

        /** The menu item that triggers the opening of the page. */
        private MenuItem item;

        public void update(final String id) {
        }

        public void update() {
        }

        public void setVisible(final boolean visible) {
        }

        public void setParent(final IContributionManager parent) {
        }

        public void saveWidgetState() {
        }

        public boolean isVisible() {
            return true;
        }

        public boolean isSeparator() {
            return false;
        }

        public boolean isGroupMarker() {
            return false;
        }

        public boolean isEnabled() {
            return true;
        }

        public boolean isDynamic() {
            return false;
        }

        public boolean isDirty() {
            return false;
        }

        public String getId() {
            return "de.cau.cs.kieler.core.model.goToPreferencePage";
        }

        public void fill(final CoolBar parent, final int index) {
        }

        public void fill(final ToolBar parent, final int index) {
        }

        /**
         * 
         * {@inheritDoc}
         */
        public void fill(final Menu parent, final int index) {
            item = new MenuItem(parent, SWT.PUSH, index);
            item.setText("Configure...");
            item.addSelectionListener(this);
        }

        public void fill(final Composite parent) {
        }

        public void dispose() {
            item.dispose();
        }

        /**
         * {@inheritDoc}
         */
        public void widgetDefaultSelected(final SelectionEvent e) {
        }

        /**
         * Opens the preference dialog of the active workbench and goes directly
         * to the page for the validation manager.
         */
        public void widgetSelected(final SelectionEvent e) {
            Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getShell();

            PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
                    shell, "de.cau.cs.kieler.core.model.validationManager",
                    null, null);
            dialog.open();
        }
    }
}
