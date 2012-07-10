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

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;

/**
 * This class contains an abstract menu item with a selection listener.
 * 
 * @author soh
 */
public abstract class AbstractContributionItem implements SelectionListener,
        IContributionItem {

    /** true if the widget is visible, false if not. */
    private boolean isVisible = true;

    /**
     * {@inheritDoc}
     */
    public void widgetDefaultSelected(final SelectionEvent e) {
    }

    /**
     * {@inheritDoc}
     */
    public abstract void widgetSelected(final SelectionEvent e);

    /**
     * {@inheritDoc}
     */
    public abstract void dispose();

    /**
     * {@inheritDoc}
     */
    public void fill(final Composite parent) {
    }

    /**
     * {@inheritDoc}
     */
    public void fill(final Menu parent, final int index) {

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
        return "de.cau.cs.kieler.core.MenuItem";
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
        return false;
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
        return isVisible;
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
        isVisible = visible;
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
