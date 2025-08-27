/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.config.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.part.EditorPart;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.KiemConfigEvent;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.config.managers.ContributionManager;
import de.cau.cs.kieler.sim.kiem.config.managers.EditorManager;
import de.cau.cs.kieler.sim.kiem.config.managers.IKiemConfigEventListener;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * The selection combobox for loading saved schedules.
 * 
 * @author soh
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class ScheduleSelector extends ControlContribution
        implements SelectionListener, FocusListener, IKiemConfigEventListener {

    /** string display for the matching schedules entry. */
    private static final String MATCHING_HEADER = "Select Execution >>>";
    /** The tooltip for the matching combo. */
    private static final String MATCHING_TOOLTIP =
            "Displays all schedules matching" + " the currently active editor.";

    /** string display for the recent schedules entry. */
    private static final String RECENT_HEADER = "Recently used schedules";
    /** The tooltip for the recent combo. */
    private static final String RECENT_TOOLTIP = "Displays all recently used schedules.";

    /** The combobox for displaying and selecting configurations. */
    private Combo combo;

    /** list of all schedule data in the currently displayed combo. */
    private List<ScheduleData> data;

    /** The list to use. either RECENT_COMBO or MATCHING_COMBO. */
    private int listType;

    /** The parent component of this element. */
    private Composite parentComponent = null;

    // /** The running instance of a plugin. */
    // private KiemConfigurationPlugin plugin = KiemConfigurationPlugin
    // .getDefault();

    /** True if the combo is in the process of refreshing. */
    private boolean refreshing = false;

    /** The enabled flag. */
    private boolean enabled;

    // --------------------------------------------------------------------------

    /**
     * Creates a new configuration selection box.
     * 
     * @param type
     *            the type of the selector. either ContributionManager.RECENT_COMBO or
     *            ContributionManager.MATCHING_COMBO.
     */
    public ScheduleSelector(final int type) {
        super("ConfigurationSelectorBox");
        this.listType = type;
        this.data = new LinkedList<ScheduleData>();
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createControl(final Composite parent) {
        this.parentComponent = parent;
        createCombo();
        setupCombo(true);

        ScheduleManager.getInstance().addEventListener(this);
        ContributionManager.getInstance().addEventListener(this);
        EditorManager.getInstance().addEventListener(this);
        return combo;
    }

    // --------------------------------------------------------------------------

    /**
     * Create the combo and listeners.
     */
    private void createCombo() {
        // dummy code to avoid a class circularity error
        KiemPropertyException excep = new KiemPropertyException("blah");
        excep.getMessage();
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.getDefaultConfig();

        combo = new Combo(parentComponent, SWT.READ_ONLY | SWT.BORDER);
        combo.setEnabled(true);
        String tooltip =
                listType == ContributionManager.RECENT_COMBO ? RECENT_TOOLTIP : MATCHING_TOOLTIP;
        combo.setToolTipText(tooltip);

        combo.addSelectionListener(this);
        combo.addFocusListener(this);
    }

    // --------------------------------------------------------------------------

    /**
     * Sets the enabled.
     *
     * @param enabled
     *            the new enabled
     */
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
        if (enabled) {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    combo.setEnabled(true);
                }
            });
        } else {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    combo.setEnabled(false);
                }
            });
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    // --------------------------------------------------------------------------
    /**
     * Sets up the combobox according to the currently selected editor and the list of matching
     * schedules.
     * 
     * @param useShortNames
     *            true if the name should be shortened
     */
    private void setupCombo(final boolean useShortNames) {
        if (combo != null && !refreshing && !combo.isDisposed()) {
            refreshing = true;
            // do not do disabling/enabling because we leave the focus and we want to use this
            // just when getting the focus (@author cmot)
            // combo.setEnabled(false);
            if (listType == ContributionManager.MATCHING_COMBO
                    && EditorManager.getInstance().getEditors().isEmpty()) {
                String[] names = { "No editor available" };
                combo.setItems(names);
                refreshing = false;
                return;
            }

            // get header
            String header =
                    listType == ContributionManager.RECENT_COMBO ? RECENT_HEADER : MATCHING_HEADER;
            String[] names = { " " };
            EditorIdWrapper editorId = null;
            String editorName = null;

            // get default values from manager

            // get the currently opened editor
            // this may throw a NullPointerException if no editor is open
            IEditorSite editor = KiemUtil.getActiveEditor();

            if (editor != null) {
                // get the attributes from the editor
                editorId = new EditorIdWrapper(editor.getId());
                editorName = editor.getRegisteredName();
            }
            if (editorId == null) {
                // The KLighD case
                IPath modelFilePath = KiemPlugin.getCurrentModelFile();
                if (modelFilePath != null) {
                    EObject sourceModel = KiemPlugin.getOpenedModelRootObjects().get(modelFilePath);
                    if (sourceModel != null) {
                        String modelID = sourceModel.getClass().getCanonicalName();
                        editorId = new EditorIdWrapper(modelID);
                        editorName = null;
                    }
                }
            }
            if (editorId == null) {
                editorId = EditorManager.getInstance().getDefaultEditorId();
                editorName = EditorManager.getInstance().getDefaultEditorName();
            }

            if (editorId
                    .equals("de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorID")) {
                // TODO: Handle this exception in another, more clean way in the future
                IEditorPart ep = KiemPlugin.getOpenedModelEditors()
                        .get(new Path("de.cau.cs.kieler.kico.klighd.sourceModel"));
                if (ep != null) {
                    editorId = new EditorIdWrapper(ep.getSite().getId());
                }
            }

            ScheduleManager manager = ScheduleManager.getInstance();
            // get the list of schedules from back end based on the type of
            // combo
            switch (listType) {
            case ContributionManager.MATCHING_COMBO:
                data = manager.getMatchingSchedules(editorId, editorName);
                break;
            case ContributionManager.RECENT_COMBO:
                data = manager.getRecentSchedules();
                break;
            default:
                data = null;
            }

            if (data != null) {
                boolean showHeader = showHeader();
                // create the store for the schedule names
                names = new String[data.size() + (showHeader ? 1 : 0)];

                int i = 0;
                if (showHeader) {
                    // add header
                    names[i++] = header;
                }

                // fill array
                for (ScheduleData d : data) {
                    if (useShortNames) {
                        names[i++] = d.getShortName();
                    } else {
                        names[i++] = d.getExtendedName();
                    }
                }
            }
            combo.setItems(names);
            combo.select(0);
            // do not do disabling/enabling because we leave the focus and we want to use this
            // just when getting the focus (@author cmot)
            // combo.setEnabled(true);

            refreshing = false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        ScheduleManager.getInstance().removeEventListener(this);
        ContributionManager.getInstance().removeEventListener(this);
        EditorManager.getInstance().removeEventListener(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update() {
        setupCombo(false);
    }

    // --------------------------------------------------------------------------

    /**
     * Determine whether or not to display the header.
     * 
     * @return true if the header should be displayed, false if not.
     */
    private boolean showHeader() {
        return (listType == ContributionManager.MATCHING_COMBO) || data.size() < 1;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Getter for the current selection in the combo.
     * 
     * @return the current selection or null
     */
    public ScheduleData getSelection() {
        if (combo != null) {
            int index = combo.getSelectionIndex();
            int baseIndex = showHeader() ? 1 : 0;
            if (index >= baseIndex) {
                return data.get(index - baseIndex);
            }
        }
        return null;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isVisible() {
        return true;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void widgetDefaultSelected(final SelectionEvent e) {
        // do nothing
    }

    /**
     * {@inheritDoc}
     */
    public void widgetSelected(final SelectionEvent e) {
        // do not do this while simulation is running
        if (KiemPlugin.getDefault().getExecution() == null) {
            if (e.widget == combo) {
                loadSelected();
            }
        } else {
            combo.select(0);
        }
    }

    /**
     * load the currently selected configuration.
     */
    private void loadSelected() {
        ScheduleData selected = getSelection();
        if (selected != null) {
            try {
                ScheduleManager.getInstance().openSchedule(selected);
            } catch (ScheduleFileMissingException e0) {
                KiemPlugin.getDefault().showError("Execution file not found",
                        KiemConfigurationPlugin.PLUGIN_ID, e0, true);
                ExecutionFileMissingDialog dialog =
                        new ExecutionFileMissingDialog(parentComponent.getShell(), selected);
                String result = dialog.open();
                if (result.equals(ExecutionFileMissingDialog.CANCEL)) {
                    combo.select(0);
                }
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void focusGained(final FocusEvent e) {
        // do not do anything here
    }

    /**
     * {@inheritDoc}
     */
    public void focusLost(final FocusEvent e) {
        // do not do anything here
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void eventDispatched(final KiemConfigEvent event) {
        if (combo != null && !combo.isDisposed()) {
            combo.getDisplay().syncExec(new Runnable() {

                public void run() {
                    setupCombo(false);
                }
            });

        }
    }

    // --------------------------------------------------------------------------
}
