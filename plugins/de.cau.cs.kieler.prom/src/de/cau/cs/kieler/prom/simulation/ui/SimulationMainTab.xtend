package de.cau.cs.kieler.prom.simulation.ui

import de.cau.cs.kieler.prom.common.SimulationLaunchData
import de.cau.cs.kieler.prom.common.ui.UIUtil
import java.util.EnumSet
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text

class SimulationMainTab  extends AbstractLaunchConfigurationTab{
    /**
     * The launch configuration this object is working on.
     */
    private ILaunchConfiguration configuration
    
    /**
     * Input field for the project name.
     */
    private var Text project
    
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createProjectComponent(comp)
    }
    
    private def void createProjectComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project", 3)

        project = UIUtil.createTextField(group, "", EnumSet.of(UIUtil.Buttons.PROJECT_BUTTON))
        project.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog()
            }
        })
    }
    
    override getName() {
        "Main"
    }
    
    override initializeFrom(ILaunchConfiguration configuration) {
        val launchData = SimulationLaunchData.loadFromConfiguration(configuration)
        project.text = launchData.projectName
    }
    
    override performApply(ILaunchConfigurationWorkingCopy configuration) {
        
    }
    
    override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        
    }
    
}