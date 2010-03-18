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
package de.cau.cs.kieler.sim.kiem.automated.views;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.sim.kiem.automated.views.ExecutionFilePanel.PanelData;

/**
 * A View for displaying the results of an automated execution run.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class AutomatedEvalView extends ViewPart implements ControlListener {

    /** The identifier string for this view. */
    public static final String VIEW_ID = "de.cau.cs.kieler.sim.kiem.config.views.eabView";

    /** The main panel for this view. */
    private Composite panel = null;

    /** The list of panels in this component. */
    private List<ExecutionFilePanel> panels = null;

    /** The composite responsible for scrolling the view. */
    private ScrolledComposite scroller = null;

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void createPartControl(final Composite parentComponent) {
        parentComponent.addControlListener(this);
        scroller = new ScrolledComposite(parentComponent, SWT.V_SCROLL
                | SWT.H_SCROLL | SWT.BORDER);
        scroller.setExpandHorizontal(true);
        scroller.setExpandVertical(true);
        scroller.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));

        panels = new LinkedList<ExecutionFilePanel>();
        panel = new Composite(scroller, SWT.NONE);
        scroller.setContent(panel);
        panel.setLayout(new GridLayout(1, false));
        panel.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false,
                false));
        panel.pack();
        scroller.setMinSize(panel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFocus() {
        panel.setFocus();
    }

    // --------------------------------------------------------------------------

    /**
     * Add a new execution file to the result view. The method returns the panel
     * where the results for each individual iteration will be displayed.
     * 
     * @param name
     *            the path of the execution file
     * @return the panel for managing the result
     */
    public ExecutionFilePanel addExecutionFile(final IPath name) {
        ExecutionFilePanel filePanel = new ExecutionFilePanel(name, panel);
        panels.add(filePanel);
        redraw();
        return filePanel;
    }

    /**
     * Add a failed execution file to the view.
     * 
     * @param name
     *            the name of the file
     * @param e0
     *            the exception that caused the failure
     */
    public void addExecutionFileFailed(final IPath name, final Exception e0) {
        ExecutionFilePanel filePanel = new ExecutionFilePanel(name, panel, e0);
        panels.add(filePanel);
        redraw();

    }

    // --------------------------------------------------------------------------

    /**
     * Dispose of all panels and clear the view.
     */
    public void clear() {
        for (ExecutionFilePanel filePanel : panels) {
            filePanel.dispose();
        }
        panels = new LinkedList<ExecutionFilePanel>();
        panel.redraw();
    }

    // --------------------------------------------------------------------------

    /**
     * Redraw the view.
     */
    private void redraw() {
        panel.pack();
        scroller.setMinSize(panel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
    }

    /**
     * {@inheritDoc}
     */
    public void controlMoved(final ControlEvent e) {
        redraw();
    }

    /**
     * {@inheritDoc}
     */
    public void controlResized(final ControlEvent e) {
        redraw();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the data in all tables.
     * 
     * @return the data
     */
    public List<PanelData> getData() {
        List<PanelData> result = new LinkedList<PanelData>();
        if (!isEmpty()) {
            for (ExecutionFilePanel execPanel : panels) {
                result.add(execPanel.getData());
            }
        }
        return result;
    }

    /**
     * Getter for the panels.
     * 
     * @return the panels
     */
    public List<ExecutionFilePanel> getPanels() {
        return this.panels;
    }

    /**
     * Determine whether or not the view is empty.
     * 
     * @return true if the view is empty
     */
    public boolean isEmpty() {
        return panels == null || panels.isEmpty();
    }

}
