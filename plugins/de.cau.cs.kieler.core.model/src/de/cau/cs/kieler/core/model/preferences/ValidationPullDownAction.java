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

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowPulldownDelegate2;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.util.MarkerHandler;

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
        Set<String> files = MarkerHandler.getRegisteredFiles();

        for (String file : files) {
            CheckFileMenuItem item = new CheckFileMenuItem(file, MarkerHandler
                    .isEnabled(file));
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
        IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage().getActiveEditor();

        if (part != null && part instanceof DiagramEditor) {
            DiagramEditor editor = (DiagramEditor) part;

        }
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
    private static class CheckFileMenuItem implements SelectionListener {

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

        public MenuItem getMenuItem(final Menu parent) {
            result = new MenuItem(parent, SWT.CHECK);
            result.setText(file);
            result.setSelection(value);
            result.addSelectionListener(this);
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
            MarkerHandler.setEnabled(file, result.getSelection());
        }
    }
}
