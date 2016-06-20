package de.cau.cs.kieler.prom.simulation.ui

import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.SimulationFileData
import de.cau.cs.kieler.prom.common.SimulationLaunchData
import de.cau.cs.kieler.prom.common.ui.UIUtil
import java.util.EnumSet
import java.util.List
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.CheckStateChangedEvent
import org.eclipse.jface.viewers.CheckboxTableViewer
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ICheckStateListener
import org.eclipse.jface.viewers.ICheckStateProvider
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.Text

class SimulationMainTab  extends AbstractLaunchConfigurationTab{
    
    private static String SIMULATOR_ID = "de.cau.cs.kieler.prom.simulator"
    
    /**
     * Input field for the project name.
     */
    private var Text project
    
    public var ComboViewer simulator
    public var ComboViewer environment
    public var TableViewer files
    
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createProjectComponent(comp)
        createSimulatorComponent(comp)
        createEnvironmentComponent(comp)
        createFilesComponent(comp)
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
    
    private def createSimulatorComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Simulator", 1)
        
        simulator = createSimulatorComboViewer(group)
    }
    
    private def createEnvironmentComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Environment for compilation", 1)
        
        val store = PromPlugin.getDefault.preferenceStore
        val environments = EnvironmentData.loadAllFromPreferenceStore(store)
        environment = UIUtil.createEnvironmentsCombo(group, environments)
        environment.addSelectionChangedListener(new ISelectionChangedListener{
            override selectionChanged(SelectionChangedEvent event) {
                updateLaunchConfigurationDialog()
            }
        })
    }
        
    private def createFilesComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Files", 1)

        files = createFilesTableViewer(group)
    }
    
    private def createFilesTableViewer(Composite parent) {
        // Create table
        val table = new Table(parent, SWT.CHECK.bitwiseOr(SWT.BORDER).bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        // Create viewer
        val viewer = new CheckboxTableViewer(table)

        // Create listener
        viewer.addCheckStateListener(new ICheckStateListener() {
            override checkStateChanged(CheckStateChangedEvent event) {
                val f = event.element as SimulationFileData
                f.providesInputs = !f.providesInputs
                
                // On Windows and Mac, we have to refresh the content provider to make the change visible
                viewer.refresh();
            }
        })

        // Create state provider
        viewer.checkStateProvider = new ICheckStateProvider() {
            override isChecked(Object element) {
                val f = element as SimulationFileData
                return f.providesInputs
            }

            override isGrayed(Object element) {
                return false
            }
        }

        // Checked column
        val checkColumn = UIUtil.createTableColumn(viewer, "Provides Input", 100)
        checkColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                return "";
            }
        };

        // Create columns
        val pathColumn = UIUtil.createTableColumn(viewer, "Path", 250)
        pathColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                val f = element as SimulationFileData
                return f.projectRelativePath;
            }
        };

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
        return viewer
    }
    
    private def ComboViewer createSimulatorComboViewer(Composite parent) {
        // Create ComboViewer
        val combo = new ComboViewer(parent, SWT.DEFAULT)

        // Get simulators from extensions
        val configs = Platform.getExtensionRegistry().getConfigurationElementsFor(SIMULATOR_ID);
        
        // Create label provider
        combo.labelProvider =  new LabelProvider() {
            override getText(Object o) {
                val config = o as IConfigurationElement
                val className = config.getAttribute("class")
                // The last part of the fully qualified class name is used as label
                val lastSegment = className.split("\\.").last
                return lastSegment
            }
        }
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        combo.input = configs

        // Select first element as default 
        if (configs != null && configs.size > 0) {
            combo.selection = new StructuredSelection(configs.get(0))
        }

        return combo
    }
    
    override getName() {
        "Main"
    }
    
    override initializeFrom(ILaunchConfiguration configuration) {
        val launchData = SimulationLaunchData.loadFromConfiguration(configuration)
        
        // Set project text
        project.text = launchData.projectName
        
        // Select environment
        if(!launchData.environmentName.isNullOrEmpty) {
            val environments = environment.input as List<EnvironmentData>
            for(e : environments){
                if(e.name == launchData.environmentName) {
                    environment.selection = new StructuredSelection(e)
                }
            }
        }
        
        // Select simulator
        if(!launchData.simulatorClassName.isNullOrEmpty) {
            val configElements = simulator.input as List<IConfigurationElement>
            for(e : configElements){
                if(e.getAttribute("class") == launchData.simulatorClassName) {
                    environment.selection = new StructuredSelection(e)
                }
            }
        }
        
        // Set files
        files.input = launchData.files
    }
    
    override performApply(ILaunchConfigurationWorkingCopy configuration) {
        val launchData = SimulationLaunchData.loadFromConfiguration(configuration)
        
        // Set project
        launchData.projectName = project.text
        
        // Set environment name
        val sel = environment.selection as StructuredSelection
        if(sel != null) {
            val env = sel.firstElement as EnvironmentData
            if(env != null){
                launchData.environmentName = env.name    
            }
        }
        
        // Flush to configuration
        SimulationLaunchData.saveToConfiguration(configuration, launchData)
    }
    
    override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        
    }
    
}