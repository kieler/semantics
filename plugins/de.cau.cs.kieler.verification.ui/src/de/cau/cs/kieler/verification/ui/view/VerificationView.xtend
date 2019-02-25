/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ui.view

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationListener
import de.cau.cs.kieler.simulation.trace.TraceFileUtil
import de.cau.cs.kieler.simulation.ui.SimulationUI
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import de.cau.cs.kieler.verification.ui.VerificationUiPlugin
import java.io.File
import java.util.List
import java.util.Observable
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.ControlContribution
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.MenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.jface.window.Window
import org.eclipse.swt.SWT
import org.eclipse.swt.events.KeyAdapter
import org.eclipse.swt.events.KeyEvent
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.part.ViewPart
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.simulation.ui.view.pool.DataPoolView.createTableColumn

/** 
 * @author aas
 */
class VerificationView extends ViewPart {
    
    /**
     * The single instance
     */
    public static var VerificationView instance
    
    private static val MODEL_CLASS_TO_PROPERTY_ANALYZER = #{typeof(SCCharts) -> "de.cau.cs.kieler.verification.processors.SCChartsVerificationPropertyAnalyzer"}
    private static val MODEL_CHECKER_SYSTEM_IDS = #["de.cau.cs.kieler.sccharts.verification.nuxmv",
                                                    "de.cau.cs.kieler.sccharts.verification.nusmv",
                                                    "de.cau.cs.kieler.sccharts.verification.spin"]
    private static val PLAY_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(VerificationUiPlugin.PLUGIN_ID, "icons/runIcon.png")
    private static val STOP_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(VerificationUiPlugin.PLUGIN_ID, "icons/stopIcon.png")
    private static val REFRESH_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(VerificationUiPlugin.PLUGIN_ID, "icons/refresh.png")
    private static val RUN_COUNTEREXAMPLE_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(VerificationUiPlugin.PLUGIN_ID, "icons/rerunFailed.png")
    
    private static val CUSTOM_SMV_COMMANDS_CTL_PREF_STORE_ID = "customSmvCommandsLTL"
    private static val CUSTOM_SMV_COMMANDS_LTL_PREF_STORE_ID = "customSmvCommandsCTL"
    private static val CUSTOM_SMV_COMMANDS_INVAR_PREF_STORE_ID = "customSmvCommandsInvar"
    private static val CUSTOM_SPIN_COMMANDS_PREF_STORE_ID = "customSpinCommands"
    private static val SMV_USE_IVAR = "SmvModelsWithIVAR"
    private static val CREATE_COUNTEREXAMPLES_PREF_STORE_ID = "createCounterexamples"
    private static val CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID = "createCounterexamplesWithOutputs"
    
    private var CompilationContext propertyAnalyzerContext
    private var CompilationContext verificationContext
    private var String selectedSystemId
    
    // == UI ELEMENTS ==
    /**
     * The table that shows the data pool view of the simulation.
     */
    @Accessors(PUBLIC_GETTER)
    private var TableViewer viewer
    
    private var TableViewerColumn nameColumn
    private var TableViewerColumn formulaColumn
    private var TableViewerColumn resultColumn
    
     /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
        // Create controls
        viewer = createTable(parent)
        createMenu()
        createToolbar()
        addKeyListeners()
    }
    
    /**
     * {@inheritDoc}
     */
    override setFocus() {
        viewer.refresh
        viewer.control.setFocus
    }
    
    /**
     * Creates the menu.
     */
    private def void createMenu() {
        val openCounterexampleAction = new Action("Open Counterexample") {
            override run() {
                val file = selectedProperty?.counterexampleFile
                if(file !== null && file.exists) {
                    val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    IDE.openEditor(page, file, true);
                }
            }
        }
        
        val openLogAction = new Action("Open Process Output") {
            override run() {
                var file = selectedProperty?.spinTrailFile
                if(file === null) {
                    file = selectedProperty?.processOutputFile
                }
                if(file !== null && file.exists) {
                    val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    IDE.openEditor(page, file, true);
                }
            }
        }
        
        val openModelCheckerFileAction = new Action("Open Model Checker Model") {
            override run() {
                val file = selectedProperty?.modelCheckerModelFile
                if(file !== null && file.exists) {
                    val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    IDE.openEditor(page, file, true);
                }
            }
        }
        
        val startVerificationOfModelInDiagramAction = new Action("Verify Model in Diagram") {
            override run() {
                startVerificationOfModelInDiagram()
            }
        }
        
        val openHelpAction = new Action("Show Controls") {
            override run() {
                val title = "Controls for the Verification View"
                val message = "Space : Start/stop verification\n"
                val dialog = new MessageDialog(viewer.control.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        }
        
        // Options
        val createCounterexampleAction = new Action("Create Counterexamples", IAction.AS_CHECK_BOX) {
            override run() {
                setBooleanOption(CREATE_COUNTEREXAMPLES_PREF_STORE_ID, isChecked)
            }
        }
        createCounterexampleAction.checked = getBooleanOption(CREATE_COUNTEREXAMPLES_PREF_STORE_ID, true)
        
        val writeOutputsToCounterexampleAction = new Action("Create Counterexamples With Outputs", IAction.AS_CHECK_BOX) {
            override run() {
                setBooleanOption(CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID, isChecked)
            }
        }
        writeOutputsToCounterexampleAction.checked = getBooleanOption(CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID, true)
        
        val useIVARinSmvModels = new Action("Use IVAR in SMV Models", IAction.AS_CHECK_BOX) {
            override run() {
                setBooleanOption(SMV_USE_IVAR, isChecked)
            }
        }
        useIVARinSmvModels.checked = getBooleanOption(SMV_USE_IVAR, false)
        useIVARinSmvModels.toolTipText = "IVAR variables cannot be used everywhere, e.g., not in CTL"
        
        val openEditSmvCommandsDialogAction = new Action("Edit SMV Commands...") {
            override run() {
                val dialog = new EditSmvCommandsDialog(viewer.control.shell)
                dialog.invarValue = getCustomCommands(CUSTOM_SMV_COMMANDS_INVAR_PREF_STORE_ID)
                dialog.ltlValue = getCustomCommands(CUSTOM_SMV_COMMANDS_LTL_PREF_STORE_ID)
                dialog.ctlValue = getCustomCommands(CUSTOM_SMV_COMMANDS_CTL_PREF_STORE_ID)
                val result = dialog.open()
                if (result == Window.OK) {
                    storeCustomCommands(CUSTOM_SMV_COMMANDS_INVAR_PREF_STORE_ID, dialog.getInvarValue)
                    storeCustomCommands(CUSTOM_SMV_COMMANDS_LTL_PREF_STORE_ID, dialog.getLtlValue)
                    storeCustomCommands(CUSTOM_SMV_COMMANDS_CTL_PREF_STORE_ID, dialog.getCtlValue)
                }
            }
        }
        
        val openEditSpinCommandsDialogAction = new Action("Edit Spin Commands...") {
            override run() {
                val title = "Commands for Spin"
                val message =
'''Enter commands for the verifier that is generated by Spin.
The commands will be added after the -run option, and before the file name.
Example commands:
-bfs : use breadth-first-search
-m100000 : use max search depth of 100000 (default is 10000)'''
                val initialValue = getCustomCommands(CUSTOM_SPIN_COMMANDS_PREF_STORE_ID)
                val dialog = new EditCommandsDialog(viewer.control.shell, title, message, initialValue, null)
                val result = dialog.open()
                if (result == Window.OK) {
                    storeCustomCommands(CUSTOM_SPIN_COMMANDS_PREF_STORE_ID, dialog.getValue())
                }
            }
        }
        
        // Pupulate options submenu
        val optionsSubmenu = new MenuManager("Options")
        optionsSubmenu => [
            add(createCounterexampleAction)
            add(writeOutputsToCounterexampleAction)
            add(useIVARinSmvModels)
            add(openEditSmvCommandsDialogAction)
            add(openEditSpinCommandsDialogAction)
        ]
        
        // Populate main menu
        getViewSite().getActionBars().getMenuManager() => [
            add(openLogAction)
            add(openCounterexampleAction)
            add(openModelCheckerFileAction)
            add(startVerificationOfModelInDiagramAction)
            add(new Separator)
            add(optionsSubmenu)
            add(openHelpAction)
        ]
    }
    
    /**
     * Creates the toolbar.
     */
    private def void createToolbar() {
        val comboContrib = new ControlContribution("Model Checker") {
            override protected createControl(Composite parent) {
                val comboViewer = new ComboViewer(parent, SWT.DROP_DOWN.bitwiseOr(SWT.READ_ONLY))
                comboViewer.labelProvider = new LabelProvider {
                    override getText(Object element) {
                        val system = element as System
                        return system.label
                    }
                }
                comboViewer.addSelectionChangedListener [SelectionChangedEvent e | 
                    val selectedSystem = e.structuredSelection.firstElement as System
                    selectedSystemId = selectedSystem.id
                ]
                val modelCheckingSystems = MODEL_CHECKER_SYSTEM_IDS.map[KiCoolRegistration.getSystemById(it)]
                comboViewer.setContentProvider(ArrayContentProvider.instance);
                comboViewer.input = modelCheckingSystems
                comboViewer.selection = new StructuredSelection(modelCheckingSystems.head)
                return comboViewer.combo
            }
        }
        
        val run = new Action("Start Verification", IAction.AS_PUSH_BUTTON) {
            override run() {
                startVerification
            }
        }
        run.imageDescriptor = PLAY_ICON
        
        val stop = new Action("Stop Verification", IAction.AS_PUSH_BUTTON) {
            override run() {
                stopVerification
            }
        }
        stop.imageDescriptor = STOP_ICON
        
        val refresh = new Action("Reload Properties", IAction.AS_PUSH_BUTTON) {
            override run() {
                reloadPropertiesFromModel()
            }
        }
        refresh.imageDescriptor = REFRESH_ICON
        
        val runCounterexample = new Action("Start Counterexample", IAction.AS_PUSH_BUTTON) {
            override run() {
                runCounterexample()
            }
        }
        runCounterexample.imageDescriptor = RUN_COUNTEREXAMPLE_ICON
        
        getViewSite().getActionBars().getToolBarManager() => [
            add(comboContrib)
            add(new Separator())
            add(refresh)
            add(run)
            add(runCounterexample)
            add(stop)
        ]
    }
    
    /**
     * Creates the table to show verification properties.
     */
    private def TableViewer createTable(Composite parent) {
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION).bitwiseOr(SWT.MULTI))
        table.setHeaderVisible(true)
        table.setLinesVisible(true)

        // Create viewer
        val viewer = new TableViewer(table)
        
        // Create columns
        nameColumn = viewer.createTableColumn("Name", 256, true)
        nameColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider() {
            override String getText(Object element) {
                return element.asVerificationProperty.name
            }
        };
        
        formulaColumn = viewer.createTableColumn("Formula", 256, true)
        formulaColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider() {
            override String getText(Object element) {
                return element.asVerificationProperty.formula
            }
        };
        
        resultColumn = viewer.createTableColumn("Result", 256, true)
        resultColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider() {
            override String getText(Object element) {
                val property = element.asVerificationProperty
                switch(property.status) {
                    case null,
                    case PENDING : return ""
                    case RUNNING : {
                        if(property.runningTaskDescription.isNullOrEmpty) {
                            return "Running..."    
                        } else {
                            return property.runningTaskDescription
                        }
                    }
                    case FAILED : return "FAILED"
                    case PASSED : return "PASSED"
                    case EXCEPTION : {
                        if(property.cause !== null) {
                            return property.cause.class.simpleName + ": " + property.cause.message
                        } else {
                            return "EXCEPTION (of unkown cause)"
                        }    
                    }
                    default : return property.status.toString
                }
            }
        };
        
        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = null

        return viewer
    }
    
    /**
     * Adds key listeners to the table for easy control of the simulation.
     */
    private def void addKeyListeners() {
        viewer.control.addKeyListener(new KeyAdapter() {
            override keyPressed(KeyEvent e) {
                val modifier = e.stateMask
                // SPACE
                if (e.keyCode == SWT.SPACE) {
                    toggleVerificationStartStop()
                }
            }
        })
    }
    
    private def VerificationProperty getSelectedProperty() {
        return viewer.structuredSelection?.firstElement as VerificationProperty
    }
    
    private def List<VerificationProperty> getSelectedProperties() {
        return viewer.structuredSelection?.toList as List<VerificationProperty>
    }
    
    /**
     * Returns the current model in the diagram.
     * 
     * @param the current model in the diagram
     */
    private def Object getCurrentDiagramModel() {
        val diagramViewContext = getDiagramViewContext
        if(diagramViewContext === null) {
            return null
        }
        return diagramViewContext.inputModel
    }
    
    /**
     * Returns the diagram view context.
     * 
     * @return the diagram view context
     */
    private def ViewContext getDiagramViewContext() {
        val diagramViews = DiagramView.getAllDiagramViews
        if (!diagramViews.isNullOrEmpty) {
            val viewPart = diagramViews.head
            val viewer = viewPart.getViewer()
            return viewer.getViewContext();
        }
    }
    
    private def void reloadPropertiesFromModel() {
        val currentModel = getCurrentDiagramModel
        if(currentModel === null) {
            return
        }
        if(currentModel instanceof SCCharts) {
            try {
                val processorId = MODEL_CLASS_TO_PROPERTY_ANALYZER.get(typeof(SCCharts))
                propertyAnalyzerContext = runPropertyAnalyzer(processorId, currentModel)
                val properties = propertyAnalyzerContext.getVerificationProperties
                setVerificationPropertiesInUi(properties)
            } catch (Exception e) {
                e.showInDialog
            }
        }
    }
    
    private def CompilationContext runPropertyAnalyzer(String processorId, EObject model) {
        val compilationSystem = CompilationSystem.createCompilationSystem(processorId, #[processorId])
        val context = Compile.createCompilationContext(compilationSystem, model)
        context.compile
        if(context.hasErrors) {
            val exception = context.allErrors.get(0).exception
            throw exception
        }
        return context
    }
    
    private def void setVerificationPropertiesInUi(List<VerificationProperty> properties) {
        // Put the properties in the UI table
        viewer.input = properties
        if(!properties.isNullOrEmpty) {
            // Restore selection
            val lastSelection = selectedProperties
            var newSelection = <VerificationProperty>newArrayList
            if(lastSelection !== null) {
                val namesOfLastSelection = lastSelection.map[it.name]
                val propertiesOfLastSelection = properties.filter[namesOfLastSelection.contains(it.name)]
                newSelection.addAll(propertiesOfLastSelection)
            }
            // Select first element if no last selection that can be transfered
            if(newSelection.isEmpty) {
                newSelection.add(properties.head)
            }
            viewer.selection = new StructuredSelection(newSelection)
        }
    }
    
    private def List<VerificationProperty> getVerificationProperties(CompilationContext context) {
        return context?.startEnvironment?.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
    }
    
    private def List<VerificationAssumption> getVerificationAssumptions(CompilationContext context) {
        return context?.startEnvironment?.getProperty(Environment.VERIFICATION_ASSUMPTIONS) as List<VerificationAssumption>
    }
    
    private def EObject getModel(CompilationContext context) {
        return context?.originalModel as EObject
    }
    
    private def void runCounterexample() {
        val property = selectedProperty
        if(property !== null
            && property.status == VerificationPropertyStatus.FAILED
            && property.counterexampleFile !== null) {
            try {
                // Start a simulation, and when the simulation is started, load the trace from the counterexample
                val simulationSystemId = "de.cau.cs.kieler.sccharts.simulation.tts.netlist.c"
                val addCounterexampleSimulationListener = new SimulationListener() {
                    
                    override update(SimulationContext ctx, SimulationEvent e) {
                        if(e instanceof SimulationControlEvent) {
                            if(e.operation == SimulationControlEvent.SimulationOperation.START) {
                                val counterexampleLocation = property.counterexampleFile.location.toOSString
                                val traceFile = TraceFileUtil.loadTraceFile(new File(counterexampleLocation))
                                SimulationUI.currentSimulation.setTrace(traceFile.traces.head, true, true)
                                // The listener did what it should and must be removed now.
                                // Otherwise it will add the counterexample to following simulations as well.
                                SimulationUI.removeObserver(this)
                            }    
                        }
                    }
                    
                    override getName() {
                        return "Model Checking View"
                    }
                    
                }
                SimulationUI.compileAndStartSimulation(simulationSystemId, currentDiagramModel)
                SimulationUI.registerObserver(addCounterexampleSimulationListener)

            } catch (Exception e) {
                e.showInDialog
            }
        }
    }
    
    private def void startVerification() {
        if(propertyAnalyzerContext === null) {
            return
        }
        startVerification(propertyAnalyzerContext.originalModel)
    }
     
    private def void startVerificationOfModelInDiagram() {
        val diagramModel = currentDiagramModel
        if(diagramModel === null || !(diagramModel instanceof EObject)) {
            return
        }
        startVerification(diagramModel as EObject)
    }
    
    private def void stopVerification() {
        if(verificationContext !== null) {
            if(viewer.input !== null) {
                val properties = viewer.input as List<VerificationProperty>
                for(property : properties) {
                    if(property.status == VerificationPropertyStatus.RUNNING) {
                        property.status = VerificationPropertyStatus.PENDING
                        viewer.update(property, null)    
                    }
                }
            }
            
            verificationContext.startEnvironment.setProperty(Environment.CANCEL_COMPILATION, true)
            verificationContext = null
        }
    }
    
    private def void startVerification(Object model) {
        val verificationProperties = selectedProperties
        if(verificationProperties === null) {
            return
        }
        if(model === null) {
            return
        }
        val verificationAssumptions = propertyAnalyzerContext.getVerificationAssumptions
        val modelWithVerificationProperties = propertyAnalyzerContext.getModel
        val modelFile = getFile(modelWithVerificationProperties)

        // Start new verification
        startVerification(model, modelFile, verificationProperties, verificationAssumptions)
    }
    
    private def void startVerification(Object model, IFile modelFile,
            List<VerificationProperty> verificationProperties, List<VerificationAssumption> verificationAssumptions) {
        // Stop last verification if not done yet
        stopVerification()
       
        // Create new context for verification and compile
        verificationContext = Compile.createCompilationContext(selectedSystemId, model)
        verificationContext.startEnvironment.setProperty(Environment.VERIFICATION_PROPERTIES, verificationProperties)
        verificationContext.startEnvironment.setProperty(Environment.VERIFICATION_ASSUMPTIONS, verificationAssumptions)
        verificationContext.startEnvironment.setProperty(Environment.VERIFICATION_MODEL_FILE, modelFile)
        
        // Add options
        val createCounterexamples = getBooleanOption(CREATE_COUNTEREXAMPLES_PREF_STORE_ID, true)
        verificationContext.startEnvironment.setProperty(Environment.CREATE_COUNTEREXAMPLES, createCounterexamples)
        val createCounterexamplesWithOutputs = getBooleanOption(CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID, true)
        verificationContext.startEnvironment.setProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS, createCounterexamplesWithOutputs)
        
        // Add nuXmv options
        val useIVARinSmvModels = getBooleanOption(SMV_USE_IVAR, false)
        verificationContext.startEnvironment.setProperty(Environment.SMV_USE_IVAR, useIVARinSmvModels)
        
        val customSmvInvarCommandsList = getCustomCommands(CUSTOM_SMV_COMMANDS_INVAR_PREF_STORE_ID).split("\n").toList
        val customSmvLtlCommandsList = getCustomCommands(CUSTOM_SMV_COMMANDS_LTL_PREF_STORE_ID).split("\n").toList
        val customSmvCtlCommandsList = getCustomCommands(CUSTOM_SMV_COMMANDS_CTL_PREF_STORE_ID).split("\n").toList
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_INVAR_COMMANDS, customSmvInvarCommandsList)
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_LTL_COMMANDS, customSmvLtlCommandsList)
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_CTL_COMMANDS, customSmvCtlCommandsList)
        
        // Add spin options
        val customSpinCommands = getCustomCommands(CUSTOM_SPIN_COMMANDS_PREF_STORE_ID).split("\n").toList
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_SPIN_COMMANDS, customSpinCommands)
        
        // Add observer for changed properties
        verificationContext.addObserver[ Observable o, Object arg |
            if(arg instanceof VerificationPropertyChanged) {
                val property = arg.changedProperty
                Display.getDefault().asyncExec([ viewer.update(property, null) ])    
            } else if(arg instanceof CompilationFinished) {
                verificationContext = null
            }
        ]
        
        // Update task description of the properties 
        for(property : verificationProperties) {
            property.runningTaskDescription = "Compiling..."
            property.status = VerificationPropertyStatus.RUNNING
            viewer.update(property, null)
        }
        
        verificationContext.compileAsynchronously
    }
    
    private def IFile getFile(EObject model) {
        val eUri = model.eResource.getURI();
        if (eUri.isPlatformResource()) {
            val platformString = eUri.toPlatformString(true);
            val res = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString)
            if(res.exists && res instanceof IFile) {
                return res as IFile
            }
        }
    }
    
    private def void toggleVerificationStartStop() {
        startVerification()
    }
    
    private def void setBooleanOption(String prefStoreId, boolean value) {
        preferenceStore.setValue(prefStoreId, value)
    }
    
    private def boolean getBooleanOption(String prefStoreId, boolean defaultValue) {
        preferenceStore.setDefault(prefStoreId, defaultValue)
        return preferenceStore.getBoolean(prefStoreId)
    }
    
    private def String getCustomCommands(String prefStoreId) {
        preferenceStore.setDefault(prefStoreId, "")
        return preferenceStore.getString(prefStoreId)
    }
    
    private def void storeCustomCommands(String prefStoreId, String customSmvCommands) {
        val store = VerificationUiPlugin.instance.preferenceStore
        store.putValue(prefStoreId, customSmvCommands)
    }
    
    private def void showInDialog(Exception e) {
        e.printStackTrace
        StatusManager.getManager().handle(new Status(IStatus.ERROR,
            VerificationUiPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW)
    }
    
    private def IPreferenceStore getPreferenceStore() {
        return VerificationUiPlugin.instance.preferenceStore
    }
}
