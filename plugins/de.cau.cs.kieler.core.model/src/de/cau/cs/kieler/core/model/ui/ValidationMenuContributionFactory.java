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
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import de.cau.cs.kieler.core.model.util.ValidationManager;

/**
 * This factory is responsible for creating the menu entries for the menu of the
 * validate action on the toolbar. Each action corresponds to a check file.
 * 
 * @author soh
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
     * Fill the menu with entries.
     * 
     * @param menu
     *            the menu
     */
    private void fillMenu(final IContributionRoot menu) {
        Set<String> files = ValidationManager.getRegisteredFiles();

        for (String file : files) {
            CheckFileMenuItem item = new CheckFileMenuItem(file,
                    ValidationManager.isEnabled(file));
            menu.addContributionItem(item, null);
        }
    }

    /**
     * One contribution item that corresponds to a checkfile. It contains a
     * checkbox menu item that triggers enablement of the file.
     * 
     * @author soh
     */
    private static class CheckFileMenuItem implements SelectionListener,
            IPropertyChangeListener, IContributionItem {

        /** The file that belongs to the menu item. */
        private String file;

        /** True if the file is visible, false if not. */
        private boolean value;

        /** The menu item. */
        private MenuItem result;

        /**
         * Creates a new CheckFileMenuItem.
         * 
         * @param fileParam
         *            the file
         * @param valueParam
         *            true if visible
         */
        public CheckFileMenuItem(final String fileParam,
                final boolean valueParam) {
            this.file = fileParam;
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
            ValidationManager.setEnabled(file, result.getSelection());
            ValidationManager.validateActiveEditor();
        }

        /**
         * {@inheritDoc}
         */
        public void propertyChange(final PropertyChangeEvent event) {
            if (event.getProperty().contains(file)) {

                boolean newValue = (Boolean) event.getNewValue();
                if (newValue != result.getSelection()) {
                    result.setSelection(newValue);
                }
            }
        }

        /**
         * {@inheritDoc}
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
         * {@inheritDoc}
         */
        public void fill(final Menu parent, final int index) {
            result = new MenuItem(parent, SWT.CHECK, index);
            result.setText(file);
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
            return file;
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
         * {@inheritDoc}
         */
        public boolean isVisible() {
            EPackage ePackage = ValidationManager.getEPackage();
            if (ePackage == null) {
                return false;
            }
            return ValidationManager.getEPackage(file) == ePackage;
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
}
