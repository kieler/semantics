package de.cau.cs.kieler.sim.kiem.ui.launching;

import java.util.LinkedList;
import java.util.List;

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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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

    /** The combobox for displaying and selecting configurations. */
    private Combo combo;

    /** list of all schedule data in the currently displayed combo. */
    private List<ScheduleData> data;

    private static KiemTab instance;

    public KiemTab() {
        super();
        instance = this;
        this.data = new LinkedList<ScheduleData>();
    }

    public static KiemTab getInstance() {
        return instance;
    }

    public void setupCombo() {
        EditorIdWrapper editorId = null;
        String editorName = null;

        // get the currently opened editor
        // this may throw a NullPointerException if no editor is open
        if (EditorUtils.getLastActiveEditor() != null) {
            IEditorSite editor = EditorUtils.getLastActiveEditor().getEditorSite();
            if (editor != null) {
                // get the attributes from the editor
                editorId = new EditorIdWrapper(editor.getId());
                editorName = editor.getRegisteredName();
            }
        }

        ScheduleManager manager = ScheduleManager.getInstance();
        data = manager.getMatchingSchedules(editorId, editorName);

        if (data != null) {
            // create the store for the schedule names
            String[] names = new String[data.size()];

            // fill array
            int i = 0;
            for (ScheduleData d : data) {
                names[i++] = d.getName();
            }
            combo.setItems(names);
        }

        combo.select(0);
    }

    protected void setDirty(boolean dirty) {
        super.setDirty(dirty);
        super.updateLaunchConfigurationDialog();
    }

    public boolean isValid(ILaunchConfiguration config) {
        return (combo.getSelection() != null);
    }

    public void createControl(Composite parent) {
        Composite top = new Composite(parent, SWT.NONE);
        top.setFont(parent.getFont());

        combo = new Combo(top, SWT.READ_ONLY | SWT.BORDER);
        combo.setEnabled(true);
        combo.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                setDirty(true);
                try {
                    scheduleUpdateJob();
                } catch (Exception ee) {

                }
            }
        });

        setupCombo();

        top.setLayout(new FillLayout());

        setControl(top);

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
        ScheduleData schedData = getSelection();
        String string = getSelection().toString();
        configuration.setAttribute(KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE, getSelection()
                .toString());
    }

    /**
     * Getter for the current selection in the combo.
     * 
     * @return the current selection or null
     */
    public ScheduleData getSelection() {
        if (combo != null) {
            int index = combo.getSelectionIndex();
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
        String scheduleName;
        try {
            String scheduleDataString = configuration.getAttribute(
                    KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE, "");
            ScheduleData scheduleData = ScheduleData.fromString(scheduleDataString);
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).toString().equals(scheduleData.toString())) {
                    combo.select(i);
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
