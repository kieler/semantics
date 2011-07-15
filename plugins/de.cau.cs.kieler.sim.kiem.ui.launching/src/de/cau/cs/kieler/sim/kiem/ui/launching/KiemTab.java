package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorSite;

import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.KiemParserException;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;

/**
 * The class KiemTab implements the basic launch tab in the launch configuration page. The user is
 * able to select from all available execution files.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KiemTab extends AbstractLaunchConfigurationTab {

    /** The top level SWT composite containing the content. */
    private Composite top;

    /** The constant MARGIN_WIDTH_AND_HEIGHT. */
    private static final int MARGIN_WIDTH_AND_HEIGHT = 15;

    /** The constant SEARCH. */
    private static String SEARCH = "bundleentry:";

    /** The table box for displaying and selecting configurations. */
    private Table table;

    /** The label for displaying the usage hints. */
    private Label usageLabel;

    /** The usage instruction hints. */
    private static String LABEL_USAGE_INSTRUCTIONS = "Select the schedule to use for this launch configuration.\n\nThe execution"
            + " file can be either a predefined one (darker icons, location is a plugin) or any execution file from the Workspace. "
            + "Note that an execution file from the Workspace must be available at the you want to use the specific launch configuration.";

    /** list of all schedule data in the currently displayed combo. */
    private java.util.List<ScheduleData> data;

    // --------------------------------------------------------------------------

    /**
     * Setup the KIEM execution scheduling table.
     */
    public void setupTable() {
        // grab the existing schedules
        EditorIdWrapper editorId = null;
        String editorName = null;
        ScheduleManager manager = ScheduleManager.getInstance();
        data = manager.getMatchingSchedules(editorId, editorName);

        // clear the table
        table.clearAll();

        if (data != null) {
            // create the store for the schedule names
            String[] names = new String[data.size()];

            // fill table with items
            int i = 0;
            for (ScheduleData scheduleData : data) {
                names[i++] = scheduleData.getName();
                TableItem item = new TableItem(table, SWT.NULL);

                String name = scheduleData.getName();
                String pluginId = scheduleData.getPluginId();
                if (pluginId == null) {
                    pluginId = "";
                }
                String location = scheduleData.getLocation().toOSString();

                item.setText(0, name);
                item.setData(scheduleData);
                if (scheduleData.isImported()) {
                    item.setImage(KiemIcons.KIEM);
                    item.setText(1, pluginId);
                } else {
                    item.setImage(KiemIcons.KIEM_DISABLED);
                    item.setText(1, location);
                }
            }
        }
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#setDirty(boolean)
     */
    protected void setDirty(boolean dirty) {
        super.setDirty(dirty);
        super.updateLaunchConfigurationDialog();
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse.debug.core.
     * ILaunchConfiguration)
     */
    public boolean isValid(ILaunchConfiguration config) {
        return (getSelection() != null);
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent) {
        top = new Composite(parent, SWT.NONE);
        top.setFont(parent.getFont());

        // set the top layout
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        top.setLayout(gridLayout);
        gridLayout.marginHeight = MARGIN_WIDTH_AND_HEIGHT;
        gridLayout.marginWidth = MARGIN_WIDTH_AND_HEIGHT;

        // declare a wrapping label
        usageLabel = new Label(top, SWT.WRAP);
        GridData gridData = new GridData(SWT.LEFT, SWT.TOP, false, false);
        gridData.widthHint = parent.getClientArea().width - 2 * MARGIN_WIDTH_AND_HEIGHT;
        usageLabel.setLayoutData(gridData);
        usageLabel.setText(KiemTab.LABEL_USAGE_INSTRUCTIONS);

        // ensure that the label is really wrapped
        parent.addListener(SWT.Resize, new Listener() {
            public void handleEvent(Event e) {
                GridData gridData = new GridData(SWT.LEFT, SWT.TOP, false, false);
                gridData.widthHint = top.getParent().getClientArea().width - 4
                        * MARGIN_WIDTH_AND_HEIGHT;
                usageLabel.setLayoutData(gridData);
            }
        });

        // declare the table
        table = new Table(top, SWT.BORDER | SWT.FULL_SELECTION);
        table.setHeaderVisible(true);
        TableColumn column0 = new TableColumn(table, SWT.NONE);
        TableColumn column1 = new TableColumn(table, SWT.NONE);
        column0.setText("Name");
        column0.setWidth(10);
        column1.setText("Location / Plugin");
        column1.setWidth(10);

        table.setEnabled(true);
        table.addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent e) {
                setDirty(true);
                try {
                    scheduleUpdateJob();
                } catch (Exception ee) {
                    // do nothing
                }
            }

            public void widgetDefaultSelected(SelectionEvent e) {
                // do nothing
            }
        });
        table.addMouseListener(new MouseListener() {
            public void mouseDoubleClick(final MouseEvent e) {
                setDirty(true);
                try {
                    scheduleUpdateJob();
                } catch (Exception ee) {
                    // do nothing
                }
            }

            public void mouseDown(final MouseEvent e) {
            }

            public void mouseUp(final MouseEvent e) {
            }
        });

        // fill the table
        setupTable();

        // set the table layout
        GridData gridData2 = new GridData();
        gridData2.grabExcessHorizontalSpace = true;
        gridData2.grabExcessVerticalSpace = true;
        gridData2.horizontalAlignment = GridData.FILL;
        gridData2.verticalAlignment = GridData.FILL;
        table.setLayoutData(gridData2);

        // set focus on the table
        setControl(top);

        // resize table headers NOW - if this is done before table layout, this gets messed up
        column0.setWidth(150);
        column1.setWidth(250);
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.
     * ILaunchConfigurationWorkingCopy)
     */
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // try to select the default execution for the currently/last opened editor
        EditorIdWrapper editorId = null;
        String editorName = null;

        if (EditorUtils.getLastActiveEditor() != null) {
            IEditorSite editor = EditorUtils.getLastActiveEditor().getEditorSite();
            if (editor != null) {
                // get the attributes from the editor
                editorId = new EditorIdWrapper(editor.getId());
                editorName = editor.getRegisteredName();

                ScheduleManager manager = ScheduleManager.getInstance();
                data = manager.getMatchingSchedules(editorId, editorName);

                for (ScheduleData scheduleData: data) {
                    // take the first default schedule
                    if (scheduleData.isImported() ) {
                        String scheduleDataString = scheduleData.toString();
                        configuration.setAttribute(KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE,
                                scheduleDataString);
                        break;
                    }
                }
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getId()
     * 
     * @since 3.3
     */
    public String getId() {
        return "de.cau.cs.kieler.sim.kiem.ui.launching.kiemtab"; //$NON-NLS-1$
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    public String getName() {
        return "Execution Schedule";
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getImage()
     */
    public Image getImage() {
        return KiemIcons.KIEM;
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.
     * ILaunchConfigurationWorkingCopy)
     */
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        if (getSelection() != null) {
            // if there is a meaningful selection, save the serialized string
            configuration.setAttribute(KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE, getSelection()
                    .toString());
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the current selection in the table.
     * 
     * @return the current selection or null
     */
    public ScheduleData getSelection() {
        if (table != null) {
            int index = table.getSelectionIndex();
            if (index >= 0) {
                return data.get(index);
            }
        }
        return null;
    }

    // --------------------------------------------------------------------------

    /**
     * Removes the "bundleentry://xxxx/" volatile part, so that it is possible to compare two
     * locations.
     * 
     * @param id
     *            the id
     * @return the string
     */
    private String removeBundleentryVolatilePart(String id) {
        String tmp = id;
        if (tmp.contains(SEARCH)) {
            tmp = tmp.substring(tmp.indexOf(SEARCH) + SEARCH.length());
            String slash = tmp.substring(0, 1);
            tmp = tmp.substring(2);
            tmp = tmp.substring(tmp.indexOf(slash));
        }
        return tmp;
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.
     * ILaunchConfiguration)
     */
    public void initializeFrom(ILaunchConfiguration configuration) {
        try {
            String scheduleDataString = configuration.getAttribute(
                    KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE, "");
            ScheduleData scheduleData = ScheduleData.fromString(scheduleDataString);
            for (int i = 0; i < data.size(); i++) {
                String vglString0 = removeBundleentryVolatilePart(data.get(i).toString());
                String vglString1 = removeBundleentryVolatilePart(scheduleData.toString());
                if (vglString0.equals(vglString1)) {
                    table.select(i);
                }
            }
        } catch (KiemParserException e) {
            // do not load anything if error occurs
            e.printStackTrace();
        } catch (CoreException e) {
            // do not load anything if error occurs
        }

    }

}
