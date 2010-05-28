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
package de.cau.cs.kieler.core.model.preferences;

import java.util.Set;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowPulldownDelegate2;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.util.CheckFileManager;

/**
 * @author soh
 */
public class ValidationPullDownAction extends Action implements
        IWorkbenchWindowPulldownDelegate2, IMenuCreator {

    /** The cached menu. */
    private Menu fMenu;

    /** The preference store. */
    private IPreferenceStore fStore;

    /**
     * Creates a new ValidationPullDownAction.
     * 
     */
    public ValidationPullDownAction() {
        fStore = CoreModelPlugin.getDefault().getPreferenceStore();
    }

    /**
     * 
     * {@inheritDoc}
     */
    public Menu getMenu(final Control parent) {
        if (fMenu != null) {
            fMenu.dispose();
        }

        fMenu = new Menu(parent);
        fillMenu(fMenu);

        return fMenu;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public Menu getMenu(final Menu parent) {
        if (fMenu == null) {
            fMenu = new Menu(parent);
            fillMenu(fMenu);
        }

        return fMenu;
    }

    /**
     * @param fMenu2
     */
    private void fillMenu(final Menu fMenu2) {
        Set<String> files = CheckFileManager.getRegisteredFiles();

        for (String file : files) {
            CheckFileMenuItem item = new CheckFileMenuItem(file,
                    CheckFileManager.isEnabled(file));
            item.getMenuItem(fMenu2);
        }
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void dispose() {
        if (fMenu != null) {
            fMenu.dispose();
            fMenu = null;
        }
    }

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbenchWindow window) {
    }

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {
        CheckFileManager.validate();
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action,
            final ISelection selection) {
    }

    /**
     * 
     * @author soh
     */
    private static class CheckFileMenuItem implements SelectionListener,
            IPropertyChangeListener, DisposeListener {

        private String file;

        private boolean value;

        private MenuItem result;

        /**
         * Creates a new CheckFileMenuItem.
         * 
         * @param fileParam
         * @param valueParam
         */
        public CheckFileMenuItem(final String fileParam,
                final boolean valueParam) {
            this.file = fileParam;
            this.value = valueParam;
        }

        /**
         * Create a new menu item for the given check file.
         * 
         * @param parent
         *            the parent menu
         * @return the menu item
         */
        public MenuItem getMenuItem(final Menu parent) {
            result = new MenuItem(parent, SWT.CHECK);
            result.setText(file);
            result.setSelection(value);
            result.addSelectionListener(this);
            CheckFileManager.addListener(this);
            result.addDisposeListener(this);
            return result;
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
            CheckFileManager.setEnabled(file, result.getSelection());
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
        public void widgetDisposed(final DisposeEvent e) {
            CheckFileManager.removeListener(this);
        }
    }
}
