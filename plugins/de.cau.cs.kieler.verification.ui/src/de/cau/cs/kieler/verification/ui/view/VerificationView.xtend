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
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.ISimulationListener
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.trace.TraceFileUtil
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationLogic
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
import static extension de.cau.cs.kieler.verification.extensions.VerificationContextExtensions.*

/** 
 * @author aas
 */
class VerificationView extends ViewPart {

    VerificationLogic verLogic = new VerificationLogic()

    /**
     * The single instance
     */
    public static var VerificationView instance

    private static val MODEL_CHECKER_SYSTEM_IDS = #["de.cau.cs.kieler.sccharts.verification.nuxmv",
        "de.cau.cs.kieler.sccharts.verification.nusmv", "de.cau.cs.kieler.sccharts.verification.spin"]
    private static val PLAY_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(VerificationUiPlugin.PLUGIN_ID,
        "icons/runIcon.png")
    private static val STOP_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(VerificationUiPlugin.PLUGIN_ID,
        "icons/stopIcon.png")
    private static val REFRESH_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(VerificationUiPlugin.PLUGIN_ID,
        "icons/refresh.png")
    private static val RUN_COUNTEREXAMPLE_ICON = VerificationUiPlugin.imageDescriptorFromPlugin(
        VerificationUiPlugin.PLUGIN_ID, "icons/rerunFailed.png")

    private static val CUSTOM_SMV_COMMANDS_CTL_PREF_STORE_ID = "customSmvCommandsLTL"
    private static val CUSTOM_SMV_COMMANDS_LTL_PREF_STORE_ID = "customSmvCommandsCTL"
    private static val CUSTOM_SMV_COMMANDS_INVAR_PREF_STORE_ID = "customSmvCommandsInvar"
    private static val CUSTOM_SPIN_COMMANDS_PREF_STORE_ID = "customSpinCommands"
    private static val SMV_USE_IVAR_PREF_STORE_ID = "smvModelsUseIVAR"
    private static val SMV_IGNORE_RANGE_ASSUMPTIONS = "smvIgnoreRangeAssumptions"
    private static val CREATE_COUNTEREXAMPLES_PREF_STORE_ID = "createCounterexamples"
    private static val CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID = "createCounterexamplesWithOutputs"

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
                if (file !== null && file.exists) {
                    val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    IDE.openEditor(page, getFile(file), true);
                }
            }
        }

        val openLogAction = new Action("Open Process Output") {
            override run() {
                var file = selectedProperty?.spinTrailFile
                if (file === null) {
                    file = selectedProperty?.processOutputFile
                }
                if (file !== null && file.exists) {
                    val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    IDE.openEditor(page, getFile(file), true);
                }
            }
        }

        val openModelCheckerFileAction = new Action("Open Model Checker Model") {
            override run() {
                val file = selectedProperty?.modelCheckerModelFile
                if (file !== null && file.exists) {
                    val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    IDE.openEditor(page, getFile(file), true);
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

        val writeOutputsToCounterexampleAction = new Action("Create Counterexamples With Outputs",
            IAction.AS_CHECK_BOX) {
            override run() {
                setBooleanOption(CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID, isChecked)
            }
        }
        writeOutputsToCounterexampleAction.checked = getBooleanOption(CREATE_COUNTEREXAMPLES_WITH_OUTPUTS_PREF_STORE_ID,
            true)

        val useIVARinSmvModels = new Action("Use IVAR in SMV", IAction.AS_CHECK_BOX) {
            override run() {
                setBooleanOption(SMV_USE_IVAR_PREF_STORE_ID, isChecked)
            }
        }
        useIVARinSmvModels.checked = getBooleanOption(SMV_USE_IVAR_PREF_STORE_ID, false)
        useIVARinSmvModels.toolTipText = "IVAR variables cannot be used everywhere, e.g., not in CTL"

        val smvIgnoreRangeAssumptions = new Action("Ignore Range Assumptions for SMV", IAction.AS_CHECK_BOX) {
            override run() {
                setBooleanOption(SMV_IGNORE_RANGE_ASSUMPTIONS, isChecked)
            }
        }
        smvIgnoreRangeAssumptions.checked = getBooleanOption(SMV_IGNORE_RANGE_ASSUMPTIONS, false)
        smvIgnoreRangeAssumptions.toolTipText = "This can be useful in combination with infinite domain algorithms (e.g. IC3)"

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
                val message = '''Enter commands for the verifier that is generated by Spin.
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
            add(smvIgnoreRangeAssumptions)
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
                comboViewer.addSelectionChangedListener [ SelectionChangedEvent e |
                    val selectedSystem = e.structuredSelection.firstElement as System
                    verLogic.systemId = selectedSystem.id
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
                val verificationProps = selectedProperties
                verLogic.prepareVerification(verificationProps)
                addUpdater(verificationProps)
                verLogic.startVerification
            }
        }
        run.imageDescriptor = PLAY_ICON

        val stop = new Action("Stop Verification", IAction.AS_PUSH_BUTTON) {
            override run() {
                verLogic.stopVerification
            }
        }
        stop.imageDescriptor = STOP_ICON

        val refresh = new Action("Reload Properties", IAction.AS_PUSH_BUTTON) {
            override run() {
                val currentModel = getCurrentDiagramModel
                val properties = verLogic.reloadPropertiesFromModel(currentModel)
                setVerificationPropertiesInUi(properties)
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
                switch (property.status) {
                    case null,
                    case PENDING:
                        return ""
                    case RUNNING: {
                        if (property.runningTaskDescription.isNullOrEmpty) {
                            return "Running..."
                        } else {
                            return property.runningTaskDescription
                        }
                    }
                    case FAILED:
                        return "FAILED"
                    case PASSED:
                        return "PASSED"
                    case EXCEPTION: {
                        if (property.cause !== null) {
                            return property.cause.class.simpleName + ": " + property.cause.message
                        } else {
                            return "EXCEPTION (of unkown cause)"
                        }
                    }
                    default:
                        return property.status.toString
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
        if (diagramViewContext === null) {
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

    private def void setVerificationPropertiesInUi(List<VerificationProperty> properties) {
        // Put the properties in the UI table
        viewer.input = properties
        if (!properties.isNullOrEmpty) {
            // Restore selection
            val lastSelection = selectedProperties
            var newSelection = <VerificationProperty>newArrayList
            if (lastSelection !== null) {
                val namesOfLastSelection = lastSelection.map[it.name]
                val propertiesOfLastSelection = properties.filter[namesOfLastSelection.contains(it.name)]
                newSelection.addAll(propertiesOfLastSelection)
            }
            // Select first element if no last selection that can be transfered
            if (newSelection.isEmpty) {
                newSelection.add(properties.head)
            }
            viewer.selection = new StructuredSelection(newSelection)
        }
    }

    private def void runCounterexample() {
        val property = selectedProperty
        if (property !== null && property.status == VerificationPropertyStatus.FAILED &&
            property.counterexampleFile !== null) {
            try {
                // Start a simulation, and when the simulation is started, load the trace from the counterexample
                val simulationSystemId = "de.cau.cs.kieler.sccharts.simulation.tts.netlist.c"
                val addCounterexampleSimulationListener = new ISimulationListener() {

                    override update(SimulationContext ctx, SimulationEvent e) {
                        if (e instanceof SimulationControlEvent) {
                            if (e.operation == SimulationControlEvent.SimulationOperation.START) {
                                val counterexampleLocation = property.counterexampleFile.path
                                val traceFile = TraceFileUtil.loadTraceFile(new File(counterexampleLocation))
                                CentralSimulation.currentSimulation.setTrace(traceFile.traces.head, true, true)
                                // The listener did what it should and must be removed now.
                                // Otherwise it will add the counterexample to following simulations as well.
                                CentralSimulation.addListener(this)
                            }
                        }
                    }

                    override getName() {
                        return "Model Checking View"
                    }

                }
                CentralSimulation.compileAndStartSimulation(simulationSystemId, currentDiagramModel)
                CentralSimulation.addListener(addCounterexampleSimulationListener)

            } catch (Exception e) {
                e.showInDialog
            }
        }
    }

    private def void startVerificationOfModelInDiagram() {
        val diagramModel = currentDiagramModel
        if (diagramModel === null || !(diagramModel instanceof EObject)) {
            return
        }
        val verificationProps = selectedProperties
        verLogic.prepareVerification(diagramModel as EObject, verificationProps)
        addUpdater(verificationProps)
        verLogic.startVerification
    }

    private def void toggleVerificationStartStop() {
        val verificationProps = selectedProperties
        verLogic.prepareVerification(verificationProps)
        addUpdater(verificationProps)
        verLogic.startVerification
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
        StatusManager.getManager().handle(new Status(IStatus.ERROR, VerificationUiPlugin.PLUGIN_ID, e.getMessage(), e),
            StatusManager.SHOW)
    }

    private def IPreferenceStore getPreferenceStore() {
        return VerificationUiPlugin.instance.preferenceStore
    }

    private def addUpdater(List<VerificationProperty> verificationProperties) {
        // Add observer for changed properties
        verLogic.verificationCompileContext.addObserver [ Observable o, Object arg |
            if (arg instanceof VerificationPropertyChanged) {
                val property = arg.changedProperty
                Display.getDefault().asyncExec([viewer.update(property, null)])
            } else if (arg instanceof CompilationFinished) {
                 verLogic.verificationCompileContext = null
            }
        ]
        // Update task description of the properties 
        for(property : verificationProperties) {
            property.runningTaskDescription = "Compiling..."
            property.status = VerificationPropertyStatus.RUNNING
            viewer.update(property, null)
        }
    }

    private def IFile getFile(File file) {
        val location = file.toURI();
        val files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(location);
        return files.get(0)
    }
}
