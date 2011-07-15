package de.cau.cs.kieler.sim.kiem.ui.launching;

import java.util.LinkedList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.core.IInternalDebugCoreConstants;
import org.eclipse.debug.internal.ui.IInternalDebugUIConstants;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
import de.cau.cs.kieler.sim.kiem.config.managers.EditorManager;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemContentProvider;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemLabelProvider;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemTableViewer;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemLabelProvider;

public class KiemTab extends AbstractLaunchConfigurationTab {

    /** The parent. */
    private Composite parent;
    
    private Composite top;
    
    /** The Constant MARGIN_WIDTH_AND_HEIGHT. */
    private static final int MARGIN_WIDTH_AND_HEIGHT = 15;
    

    /** The table box for displaying and selecting configurations. */
    private Table table;

    /** The label for displaying the usage hints. */
    private Label usageLabel;

//    /** The label for the list . */
//    private Label comboLabel;
//
//    /** The combo label. */
//    private static String LABEL_COMBO = "Schedule: ";

    /** The usage instruction hints. */
    private static String LABEL_USAGE_INSTRUCTIONS = "Select the schedule to use for this launch configuration.\n\nThe execution" +
    		" file can be either a predefined one (tagged with '[IMPORTED]') or any execution file from the Workspace. " +
    		"Note that an execution file from the Workspace must be available if you want to use the launch configuration.";

    /** list of all schedule data in the currently displayed combo. */
    private java.util.List<ScheduleData> data;

    private static KiemTab instance;

    public KiemTab() {
        super();
        instance = this;
        this.data = new LinkedList<ScheduleData>();
    }

    public static KiemTab getInstance() {
        return instance;
    }

    public void setupTable() {
        EditorIdWrapper editorId = null;
        String editorName = null;

//        // get the currently opened editor
//        // this may throw a NullPointerException if no editor is open
//        if (EditorUtils.getLastActiveEditor() != null) {
//            IEditorSite editor = EditorUtils.getLastActiveEditor().getEditorSite();
//            if (editor != null) {
//                // get the attributes from the editor
//                editorId = new EditorIdWrapper(editor.getId());
//                editorName = editor.getRegisteredName();
//            }
//        }

        ScheduleManager manager = ScheduleManager.getInstance();
        data = manager.getMatchingSchedules(editorId, editorName);

        // clear the table
        table.clearAll();
        
        if (data != null) {
            // create the store for the schedule names
            String[] names = new String[data.size()];

            // fill array
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
                
                item.setText(0,name);
                item.setText(1,pluginId);
                item.setText(2,location);
                item.setData(scheduleData);
                if (scheduleData.isImported()) {
                    item.setImage(KiemIcons.KIEM_DISABLED);
                }
                else {
                    item.setImage(KiemIcons.KIEM);
                }
            }
        }

        //table.select(0);
    }

    protected void setDirty(boolean dirty) {
        super.setDirty(dirty);
        super.updateLaunchConfigurationDialog();
    }

    public boolean isValid(ILaunchConfiguration config) {
        return (getSelection() != null);
    }

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
        GridData gridData = new GridData(SWT.LEFT , SWT.TOP, false, false); 
        gridData.widthHint = parent.getClientArea().width - 2*MARGIN_WIDTH_AND_HEIGHT ;
        usageLabel.setLayoutData(gridData);        
        usageLabel.setText(KiemTab.LABEL_USAGE_INSTRUCTIONS);
        
        // ensure that the label is really wrapped
        parent.addListener(SWT.Resize, new Listener() {
            public void handleEvent(Event e) {
                GridData gridData = new GridData(SWT.LEFT , SWT.TOP, false, false); 
                System.out.println(top.getParent().getClientArea().width);
                gridData.widthHint = top.getParent().getClientArea().width - 4*MARGIN_WIDTH_AND_HEIGHT ;
                usageLabel.setLayoutData(gridData);   
            }
        });        
        
        // declare the table
        table = new Table(top, SWT.BORDER | SWT.FULL_SELECTION);
        table.setHeaderVisible (true);
        TableColumn column0 = new TableColumn(table, SWT.NONE);
        TableColumn column1 = new TableColumn(table, SWT.NONE);
        TableColumn column2 = new TableColumn(table, SWT.NONE);
        column0.setText("Name");  
        column0.setWidth(10);
        column1.setText("Plugin");  
        column1.setWidth(10);
        column2.setText("Location");  
        column2.setWidth(10);
        
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
        column1.setWidth(100);
        column2.setWidth(100);
    }

    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // TODO Auto-generated method stub

    }

    /**
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getId()
     * 
     * @since 3.3
     */
    public String getId() {
        return "de.cau.cs.kieler.sim.kiem.ui.launching.kiemtab"; //$NON-NLS-1$
    }

    public String getName() {
        return "Execution Schedule";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getImage()
     */
    public Image getImage() {
        return KiemIcons.KIEM;
    }

    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        if ( getSelection() != null ) {
            configuration.setAttribute(KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE, getSelection()
                    .toString());
        }
    }

    /**
     * Getter for the current selection in the combo.
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
                String vglString0 = data.get(i).toString();
                String vglString1 = scheduleData.toString();
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
