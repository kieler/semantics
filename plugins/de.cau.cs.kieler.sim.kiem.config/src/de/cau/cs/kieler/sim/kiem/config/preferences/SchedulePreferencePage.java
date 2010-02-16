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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.EditorDefinition;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.KiemConfigEvent;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.config.managers.EditorManager;
import de.cau.cs.kieler.sim.kiem.config.managers.IKiemConfigEventListener;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleComparator;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.config.preferences.SchedulePriorityTableProvider.DataEntry;
import de.cau.cs.kieler.sim.kiem.config.ui.ExecutionFileMissingDialog;

/**
 * Preference page for the scheduling preferences in KIEM.
 * <p>
 * Modified version of the LayoutPreferencePage in de.cau.cs.kieler.kiml.ui by
 * msp.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class SchedulePreferencePage extends PreferencePage implements
        IWorkbenchPreferencePage, ILabelProvider, IKiemConfigEventListener,
        FocusListener, SelectionListener {

    /** the tooltip for the add editor button/dialog. */
    private static final String ADD_EDITOR_TOOLTIP = "Select any editor currently "
            + "registered on the workbench to be added to the table.";
    /** the tooltip for the edit schedule button. */
    private static final String EDIT_SCHEDULE_TOOLTIP = "Edit the location of"
            + " the currently selected schedule.";
    /** the tooltip for the import all button. */
    private static final String IMPORT_TOOLTIP = "Import all execution files"
            + " located in the currently active workspace";
    /** maximum length of displayed editor names. */
    private static final int MAX_EDITORS_NAME_LENGTH = 7;
    /** number of invisible columns held in reserve. */
    private static final int PUFFER_SIZE = 10;
    /** the tooltip for the remove editor button/dialog. */
    private static final String REMOVE_EDITOR_TOOLTIP = "Select registered editors "
            + "that should be removed from the table.\n"
            + "WARNING: Removes the editor support from all registered schedules!";
    /** the tooltip for the remove schedule button. */
    private static final String REMOVE_SCHEDULE_TOOLTIP = "Remove all selected schedules.";
    /** the tooltip for the select default editor button/dialog. */
    private static final String SELECT_DEFAULT_EDITOR_TOOLTIP = "Select an editor "
            + "that should be assumed active\n"
            + "when no editor is in fact active on the workbench.";

    /** The parent component of this page. */
    private Composite parent;
    /** group for displaying the table. */
    private Group prioritiesGroup;
    /** the group for displaying the buttons. */
    private Group buttonGroup;

    /** the table where everything is displayed. */
    private Table prioritiesTable;
    /** The table viewer. */
    private TableViewer priorityTableViewer;
    /** The columns on the table. */
    private TableColumn[] columns;
    /** The column properties of the table. */
    private String[] columnProperties;
    /** The cell editors. */
    private CellEditor[] cellEditors;

    /** button for adding a new editor. */
    private Button addEditorButton;
    /** button for editing the location of the schedule. */
    private Button editScheduleButton;
    /** button for removing an editor. */
    private Button removeEditorButton;
    /** button for removing a schedule from the table. */
    private Button removeSchedule;
    /** button for selecting a default editor. */
    private Button selectDefaultEditorButton;
    /** button for importing all files inside the workspace. */
    private Button importFilesInWorkspaceButton;

    /** data matrix: rows represent schedules, columns represent editors. */
    private int[][] data;
    /** The list of schedule data. */
    private List<ScheduleData> scheduleDataList;

    /** The next index where a new editor is added. */
    private int firstFreeIndex = 0;
    /** The array of editors, empty columns and [0] are null. */
    private EditorDefinition[] editorArray;
    /** the data entries for this table. */
    private List<DataEntry> tableEntries;
    /** The label, content and cell provider for the table. */
    private SchedulePriorityTableProvider tableProvider;

    // --------------------------------------------------------------------------

    /**
     * Creates the schedule preference page.
     */
    public SchedulePreferencePage() {
        super();
        setDescription("This page holds information about the editors, "
                + "schedules and their priorities.\n"
                + "The editor marked in the column header is the default editor\n"
                + "which will be used for schedule matching when no other editor is open.\n"
                + "The marked schedule is the best schedule for the given editor.");
        ScheduleManager.getInstance().addEventListener(this);
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createContents(final Composite parentComponent) {
        parent = parentComponent;
        doInitialLayout();
        layout();
        return prioritiesGroup;
    }

    /**
     * Do the initial layout for the entire preference page.
     */
    private void doInitialLayout() {
        prioritiesGroup = new Group(parent, SWT.NONE);
        prioritiesGroup.setText("Scheduling Priorities");
        ScheduleManager scheduleManager = ScheduleManager.getInstance();

        // get schedules from back end
        scheduleDataList = scheduleManager.getAllSchedules();
        Collections.sort(scheduleDataList, new ScheduleComparator());
        int scheduleCount = scheduleDataList.size();

        // check if there are any schedules at all
        if (scheduleCount > 0) {
            fillTableInfo();
            // get editors
            List<EditorDefinition> editors = EditorManager.getInstance()
                    .getEditors();

            // construct the priorities table
            int numberOfColumns = editors.size() + 1 + PUFFER_SIZE;
            firstFreeIndex = editors.size() + 1;
            editorArray = new EditorDefinition[numberOfColumns];

            prioritiesTable = new Table(prioritiesGroup, SWT.BORDER
                    | SWT.FULL_SELECTION);
            priorityTableViewer = new TableViewer(prioritiesTable);
            columns = new TableColumn[numberOfColumns];

            for (int j = 0; j < numberOfColumns; j++) {
                columns[j] = new TableColumn(prioritiesTable, SWT.NONE);
                if (j == 0) {
                    columns[j].setText("Schedule");
                    columns[j].setToolTipText("The name of the schedule");
                } else if (j <= editors.size()) {
                    editorArray[j] = editors.get(j - 1);
                    String editorName = editors.get(j - 1).getName();
                    columns[j].setText(getAbbrev(editorName));
                    String toolTip = editorName + " ("
                            + editors.get(j - 1).getEditorId() + ")";
                    columns[j].setToolTipText(toolTip);
                }
                columns[j].addSelectionListener(new TableSelectionListener(j));
            }

            prioritiesTable.setHeaderVisible(true);
            columnProperties = new String[numberOfColumns];
            cellEditors = new CellEditor[numberOfColumns];
            columnProperties[0] = SchedulePriorityTableProvider.SCHEDULES_PROPERTY;
            for (int j = 1; j < numberOfColumns; j++) {
                columnProperties[j] = Integer.toString(j - 1);
                cellEditors[j] = new TextCellEditor(prioritiesTable);
            }
            priorityTableViewer.setColumnProperties(columnProperties);
            tableProvider = new SchedulePriorityTableProvider(
                    priorityTableViewer, tableEntries);
            priorityTableViewer.setContentProvider(tableProvider);
            priorityTableViewer.setLabelProvider(tableProvider);
            priorityTableViewer.setCellEditors(cellEditors);
            priorityTableViewer.setCellModifier(tableProvider);
            priorityTableViewer.setInput(tableEntries);

            for (int index = 0; index < columns.length; index++) {
                TableColumn column = columns[index];
                column.pack();
            }
            prioritiesTable.setLayoutData(new GridData(SWT.LEFT, SWT.TOP,
                    false, false));
            prioritiesTable.pack();

            prioritiesTable.addFocusListener(this);
            prioritiesTable.addSelectionListener(this);
        }

        prioritiesGroup.setLayout(new GridLayout(1, false));
        prioritiesGroup.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
                false));

        SelectListener listener = new SelectListener();

        buttonGroup = new Group(prioritiesGroup, SWT.NONE);

        editScheduleButton = new Button(buttonGroup, SWT.BORDER);
        editScheduleButton.addSelectionListener(listener);
        editScheduleButton.setText("Edit schedule location...");
        editScheduleButton.setToolTipText(EDIT_SCHEDULE_TOOLTIP);

        removeSchedule = new Button(buttonGroup, SWT.BORDER);
        removeSchedule.addSelectionListener(listener);
        removeSchedule.setText("Remove Schedule");
        removeSchedule.setToolTipText(REMOVE_SCHEDULE_TOOLTIP);

        addEditorButton = new Button(buttonGroup, SWT.BORDER);
        addEditorButton.setText("Add editor...");
        addEditorButton.addSelectionListener(listener);
        addEditorButton.setToolTipText(ADD_EDITOR_TOOLTIP);

        removeEditorButton = new Button(buttonGroup, SWT.BORDER);
        removeEditorButton.setText("Remove editor...");
        removeEditorButton.addSelectionListener(listener);
        removeEditorButton.setToolTipText(REMOVE_EDITOR_TOOLTIP);

        selectDefaultEditorButton = new Button(buttonGroup, SWT.BORDER);
        selectDefaultEditorButton.setText("Select default editor...");
        selectDefaultEditorButton.addSelectionListener(listener);
        selectDefaultEditorButton.setToolTipText(SELECT_DEFAULT_EDITOR_TOOLTIP);

        importFilesInWorkspaceButton = new Button(buttonGroup, SWT.BORDER);
        importFilesInWorkspaceButton.setText("Import workspace");
        importFilesInWorkspaceButton.addSelectionListener(listener);
        importFilesInWorkspaceButton.setToolTipText(IMPORT_TOOLTIP);

        buttonGroup.setLayout(new GridLayout(2, false));
        buttonGroup
                .setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));

        buttonGroup.pack();
        prioritiesGroup.pack();
        checkDefaultEditor();
        checkButtonStatus();
    }

    // --------------------------------------------------------------------------

    /**
     * Fills the list that is responsible for the table input.
     */
    private void fillTableInfo() {
        scheduleDataList = ScheduleManager.getInstance().getAllSchedules();
        Collections.sort(scheduleDataList, new ScheduleComparator());
        int scheduleCount = scheduleDataList.size();

        // check if there are any schedules at all
        if (scheduleCount > 0) {
            // get editors
            List<EditorDefinition> editors = EditorManager.getInstance()
                    .getEditors();

            fillData(editors);

            tableEntries = new LinkedList<DataEntry>();

            int i = 0;
            for (ScheduleData scheduleData : scheduleDataList) {
                DataEntry entry = new DataEntry();
                entry.setSchedule(scheduleData);
                entry.setPriorities(data[i++]);
                tableEntries.add(entry);
            }
        }
    }

    /**
     * Fill the data table. Add a few extra columns to allow dynamic adding of
     * more editors.
     * 
     * @param editors
     *            the list of editors
     */
    private void fillData(final List<EditorDefinition> editors) {
        int editorsSize = editors == null ? 0 : editors.size();
        data = new int[scheduleDataList.size()][editorsSize + PUFFER_SIZE + 1];
        for (int i = 0; i < scheduleDataList.size(); i++) {
            ScheduleData schedule = scheduleDataList.get(i);
            for (int j = 0; j < editorsSize + PUFFER_SIZE + 1; j++) {
                if (j < editorsSize) {
                    data[i][j] = schedule.getSupportedPriority(editors.get(j)
                            .getEditorId());
                } else {
                    data[i][j] = ScheduleData.MIN_PRIORITY;
                }
            }
        }
    }

    /**
     * Creates an abbreviation for the given editor name.
     * 
     * @param editorName
     *            an editor name
     * @return an abbreviation for editor name
     */
    private String getAbbrev(final String editorName) {
        if (editorName.length() <= MAX_EDITORS_NAME_LENGTH) {
            return editorName;
        }
        StringBuilder abbrev = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(editorName);
        while (tokenizer.hasMoreTokens()) {
            abbrev.append(tokenizer.nextToken().charAt(0));
        }
        return abbrev.toString();
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Updates the status of the buttons according to the selection.
     */
    private void checkButtonStatus() {
        TableItem[] items = prioritiesTable.getSelection();
        boolean showRemove = true;
        if (items == null || items.length == 0) {
            showRemove = false;
        } else if (items.length == 1) {
            Object tableData = items[0].getData();
            if (tableData instanceof DataEntry) {
                DataEntry entry = (DataEntry) tableData;
                ScheduleData schedule = entry.getSchedule();
                if (schedule.isLocked()) {
                    showRemove = false;
                }
            }
        }

        removeSchedule.setEnabled(showRemove);
        editScheduleButton.setEnabled(showRemove);
    }

    /**
     * Updates the image of the default editor in the column header.
     */
    private void checkDefaultEditor() {
        if (columns != null) {
            for (int i = 0; i < columns.length; i++) {
                TableColumn column = columns[i];
                EditorDefinition editor = editorArray[i];
                if (editor != null) {
                    if (editor.getEditorId().equals(
                            EditorManager.getInstance().getDefaultEditorId())) {

                        column.setImage(KiemConfigurationPlugin
                                .getActiveImage());
                    } else if (editor.isLocked()) {
                        column.setImage(KiemConfigurationPlugin
                                .getLockedImage());
                    } else {
                        column.setImage(null);
                    }
                } else {
                    column.setImage(null);
                }
            }
        }
    }

    /**
     * pack all components.
     */
    private void layout() {
        if (priorityTableViewer != null) {
            fillTableInfo();
            priorityTableViewer.setInput(tableEntries);
            checkDefaultEditor();
            priorityTableViewer.refresh();
            columns[0].pack();

            // show or hide columns based on the editor array
            for (int i = 1; i < columns.length; i++) {
                TableColumn column = columns[i];
                if (editorArray[i] == null) {
                    column.setWidth(0);
                } else {
                    column.pack();
                }
            }

            prioritiesTable.update();
            prioritiesTable.pack();
            prioritiesTable.layout();
            buttonGroup.pack();
            prioritiesGroup.pack();
            prioritiesGroup.layout();
            parent.layout();
        }
        checkButtonStatus();
    }

    // --------------------------------------------------------------------------
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
    protected void performDefaults() {
        // do nothing, no defaults.
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean performOk() {
        savePriorities();
        ScheduleManager.getInstance().save();
        EditorManager.getInstance().save();
        return true;
    }

    /**
     * Write the priorities to back end.
     */
    private void savePriorities() {
        if (tableEntries != null) {
            for (DataEntry entry : tableEntries) {
                int[] prios = entry.getPriorities();
                ScheduleData schedule = entry.getSchedule();

                for (int j = 1; j < editorArray.length; j++) {
                    EditorDefinition editor = editorArray[j];

                    if (editor != null) {
                        schedule.setEditorSupport(editor.getEditorId(),
                                prios[j - 1]);
                    }
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void performApply() {
        performOk();
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Get the currently selected schedule.
     * 
     * @return the currently selected schedule or null
     */
    private ScheduleData getSelectedSchedule() {
        TableItem[] items = prioritiesTable.getSelection();
        ScheduleData result = null;
        if (items.length == 1 && items[0].getData() instanceof DataEntry) {
            DataEntry entry = (DataEntry) items[0].getData();
            result = entry.getSchedule();
        }
        return result;
    }

    /**
     * Remove the currently selected schedules.
     */
    private void removeSchedule() {
        String title = Tools.ARE_YOU_SURE;
        String message = Tools.DELETE_QUESTION + "the selected schedules?";
        if (MessageDialog.openConfirm(parent.getShell(), title, message)) {

            // get all selected elements
            TableItem[] items = prioritiesTable.getSelection();
            if (items.length > 0) {
                // remove schedules from back end
                for (int i = 0; i < items.length; i++) {
                    Object tableData = items[i].getData();
                    if (tableData instanceof DataEntry) {
                        DataEntry entry = (DataEntry) tableData;
                        ScheduleData schedule = entry.getSchedule();
                        if (!schedule.isLocked()) {
                            ScheduleManager.getInstance().removeSchedule(
                                    schedule);
                        }
                    }
                }
            }
        }
    }

    /**
     * Add a new editor chosen from the list of available editors.
     */
    private void addEditor() {
        // get all editors currently registered
        IConfigurationElement[] elements = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("org.eclipse.ui.editors");

        List<EditorDefinition> editors = new LinkedList<EditorDefinition>();
        for (IConfigurationElement element : elements) {
            try {
                EditorIdWrapper wrapper = new EditorIdWrapper(element
                        .getAttribute("id"));

                if (EditorManager.getInstance().findEditorById(wrapper) == null) {
                    // only add editors that are not already registered
                    editors.add(new EditorDefinition(element
                            .getAttribute("name"), wrapper));
                }
            } catch (InvalidRegistryObjectException e0) {
                // do nothing, continue to next editor
            }

        }

        EditorDefinition[] availableEditors = editors
                .toArray(new EditorDefinition[editors.size()]);
        EditorDefinition result = displayDialog(availableEditors,
                ADD_EDITOR_TOOLTIP);

        if (result != null) {
            EditorManager.getInstance().addEditor(result);

            editorArray[firstFreeIndex] = result;

            String editorName = result.getName();
            columns[firstFreeIndex].setText(getAbbrev(editorName));
            String toolTip = editorName + " (" + result.getEditorId() + ")";
            columns[firstFreeIndex].setToolTipText(toolTip);

            columnProperties[firstFreeIndex] = Integer
                    .toString(firstFreeIndex - 1);
            cellEditors[firstFreeIndex] = new TextCellEditor(prioritiesTable);

            priorityTableViewer.setColumnProperties(columnProperties);
            priorityTableViewer.setCellEditors(cellEditors);

            firstFreeIndex++;
            checkFreeIndex();
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Remove an editor from the list of editors.
     */
    private void removeEditor() {
        List<EditorDefinition> editors = EditorManager.getInstance()
                .getEditors();

        List<EditorDefinition> availableEditors = new LinkedList<EditorDefinition>();

        for (EditorDefinition editor : editors) {
            if (!editor.isLocked()) {
                availableEditors.add(editor);
            }
        }

        EditorDefinition[] elements = availableEditors
                .toArray(new EditorDefinition[availableEditors.size()]);
        EditorDefinition result = displayDialog(elements, REMOVE_EDITOR_TOOLTIP);

        if (result != null) {
            String title = Tools.ARE_YOU_SURE;
            String message = Tools.DELETE_QUESTION + result.toString() + "?";

            if (MessageDialog.openConfirm(parent.getShell(), title, message)) {
                EditorManager.getInstance().removeEditor(result);

                for (int i = 0; i < editorArray.length; i++) {
                    if (editorArray[i] == result) {
                        editorArray[i] = null;
                    }
                }
            }
        }
        checkFreeIndex();
    }

    // --------------------------------------------------------------------------

    /**
     * Determine if the currently selected free index is still on a valid field.
     * If that is not the case try to find one.
     */
    private void checkFreeIndex() {
        if (firstFreeIndex == editorArray.length
                || editorArray[firstFreeIndex] != null) {
            for (int i = 1; i < editorArray.length; i++) {
                if (editorArray[i] == null) {
                    firstFreeIndex = i;
                    break;
                }
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Open a selection box for selecting the default editor.
     */
    private void selectDefaultEditor() {
        EditorDefinition[] elements = EditorManager.getInstance().getEditors()
                .toArray(new EditorDefinition[1]);
        EditorDefinition result = displayDialog(elements,
                SELECT_DEFAULT_EDITOR_TOOLTIP);

        if (result != null) {
            EditorManager.getInstance().setDefaultEditor(result);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Display a list selection dialog with a given list of editors and return
     * the selected editor. Return null if canceled.
     * 
     * @param elements
     *            the list of editors.
     * @param message
     *            the message to display in the dialog.
     * @return the selected editor or null.
     */
    private EditorDefinition displayDialog(final EditorDefinition[] elements,
            final String message) {
        ElementListSelectionDialog dialog = new ElementListSelectionDialog(
                parent.getShell(), this);
        dialog.setMultipleSelection(false);
        dialog.setElements(elements);
        dialog.setMessage(message);
        dialog.setHelpAvailable(false);

        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();
            return ((EditorDefinition) result[0]);
        }
        return null;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void focusGained(final FocusEvent e) {
        checkButtonStatus();
    }

    /**
     * {@inheritDoc}
     */
    public void focusLost(final FocusEvent e) {
        checkButtonStatus();
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
        checkButtonStatus();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Image getImage(final Object element) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getText(final Object element) {
        return element.toString();
    }

    /**
     * {@inheritDoc}
     */
    public void addListener(final ILabelProviderListener listener) {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isLabelProperty(final Object element, final String property) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public void removeListener(final ILabelProviderListener listener) {
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void eventDispatched(final KiemConfigEvent event) {
        // doLayout();
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Listener for listening to any select events on this preference page.
     * Especially button clicks.
     * 
     * @author soh
     * @kieler.rating 2010-01-27 proposed yellow
     */
    private class SelectListener implements SelectionListener {

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
            if (e.widget == removeSchedule) {
                removeSchedule();
            }
            if (e.widget == addEditorButton) {
                addEditor();
            }
            if (e.widget == removeEditorButton) {
                removeEditor();
            }
            if (e.widget == selectDefaultEditorButton) {
                selectDefaultEditor();
            }
            if (e.widget == editScheduleButton) {
                ScheduleData result = getSelectedSchedule();
                if (result != null) {
                    ExecutionFileMissingDialog dialog = new ExecutionFileMissingDialog(
                            parent.getShell(), result);
                    dialog.enterNewLocation(false);
                }
            }
            if (e.widget == importFilesInWorkspaceButton) {
                ScheduleManager.getInstance().importAllFilesInWorkspace();
            }
            layout();
        }
    }

    /**
     * This listeners sort the list based on clicks on the table headers.
     * 
     * @author soh
     */
    private class TableSelectionListener extends SelectionAdapter {

        /** The index of the column. */
        private int columnIndex;

        /**
         * 
         * Creates a new TableSelectionListener.
         * 
         * @param columnIndexParam
         *            the column of the listener
         */
        public TableSelectionListener(final int columnIndexParam) {
            this.columnIndex = columnIndexParam;
        }

        /**
         * 
         * {@inheritDoc}
         */
        @Override
        public void widgetSelected(final SelectionEvent e) {
            ViewerSorter sorter = priorityTableViewer.getSorter();
            if (sorter != null && sorter instanceof TableViewerSorter
                    && columnIndex == ((TableViewerSorter) sorter).getColumn()) {
                TableViewerSorter oldSorter = (TableViewerSorter) sorter;
                oldSorter.setReversed(!oldSorter.getReversed());
            } else {
                priorityTableViewer.setSorter(new TableViewerSorter());
            }

            priorityTableViewer.refresh();
        }

        /**
         * This class is responsible for sorting the table.
         * 
         * @author soh
         */
        private class TableViewerSorter extends ViewerSorter {

            /** true if the list should be reversed. */
            private boolean reversed;

            /**
             * Instantiates a new table viewer sorter.
             * 
             */
            public TableViewerSorter() {
                reversed = false;
            }

            /**
             * Gets the column.
             * 
             * @return the column
             */
            public int getColumn() {
                return columnIndex;
            }

            /**
             * Gets the reversed.
             * 
             * @return the reversed
             */
            public boolean getReversed() {
                return reversed;
            }

            /**
             * Sets the reversed.
             * 
             * @param reversedParam
             *            the new reversed
             */
            public void setReversed(final boolean reversedParam) {
                this.reversed = reversedParam;
            }

            /**
             * 
             * {@inheritDoc}
             */
            @Override
            public int compare(final Viewer viewer, final Object o1,
                    final Object o2) {
                if (columnIndex == 0) {
                    String name1 = "";
                    String name2 = "";

                    if (o1 instanceof DataEntry) {
                        name1 = ((DataEntry) o1).getSchedule().getName();
                    }
                    if (o2 instanceof DataEntry) {
                        name2 = ((DataEntry) o2).getSchedule().getName();
                    }

                    if (reversed) {
                        return name2.compareTo(name1);
                    }
                    return name1.compareTo(name2);
                }
                Integer value1 = Integer.MIN_VALUE;
                Integer value2 = Integer.MIN_VALUE;

                if (o1 instanceof DataEntry) {
                    value1 = ((DataEntry) o1).getPriorities()[columnIndex - 1];
                }
                if (o2 instanceof DataEntry) {
                    value2 = ((DataEntry) o2).getPriorities()[columnIndex - 1];
                }

                if (reversed) {
                    return value2.compareTo(value1);
                }
                return value1.compareTo(value2);
            }
        }
    }
}
