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
package de.cau.cs.kieler.sccharts.ui.verification

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.ui.SCChartsUiModule
import de.cau.cs.kieler.sccharts.verification.SCChartsVerificationPropertyAnalyzer
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.sccharts.verification.VerificationPropertyChanged
import de.cau.cs.kieler.sccharts.verification.VerificationResultStatus
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationListener
import de.cau.cs.kieler.simulation.trace.TraceFileUtil
import de.cau.cs.kieler.simulation.ui.SimulationUI
import de.cau.cs.kieler.simulation.ui.view.pool.DataPoolView
import java.io.File
import java.util.List
import java.util.Observable
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.ControlContribution
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.Separator
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.events.KeyAdapter
import org.eclipse.swt.events.KeyEvent
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
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
    
    private static val PLAY_ICON = SCChartsUiModule.imageDescriptorFromPlugin(SCChartsUiModule.PLUGIN_ID, "icons/runIcon.png")
    private static val STOP_ICON = SCChartsUiModule.imageDescriptorFromPlugin(SCChartsUiModule.PLUGIN_ID, "icons/stopIcon.png")
    private static val REFRESH_ICON = SCChartsUiModule.imageDescriptorFromPlugin(SCChartsUiModule.PLUGIN_ID, "icons/refresh.png")
    private static val RUN_COUNTEREXAMPLE_ICON = SCChartsUiModule.imageDescriptorFromPlugin(SCChartsUiModule.PLUGIN_ID, "icons/rerunFailed.png")
    
    private val scchartsVerificationPropertyAnalyzer = new SCChartsVerificationPropertyAnalyzer
    private var CompilationContext verificationContext = null
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
        val menuHelp = new Action("Show Controls") {
            override run() {
                val title = "Controls for the Verification View"
                val message = "Space : Toggle verification start/stop\n"
                val dialog = new MessageDialog(viewer.control.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        }
        
        getViewSite().getActionBars().getMenuManager() => [
            add(menuHelp)
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
                val modelCheckingSystemIds = #["de.cau.cs.kieler.sccharts.verification.smv.nuxmv"]
                val modelCheckingSystems = modelCheckingSystemIds.map[KiCoolRegistration.getSystemById(it)]
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
        nameColumn = viewer.createTableColumn("Name", 128, true)
        nameColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider(this) {
            override String getText(Object element) {
                return element.asVerificationProperty.name
            }
        };
        
        formulaColumn = viewer.createTableColumn("Formula", 256, true)
        formulaColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider(this) {
            override String getText(Object element) {
                return element.asVerificationProperty.formula
            }
        };
        
        resultColumn = viewer.createTableColumn("Result", 256, true)
        resultColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider(this) {
            override String getText(Object element) {
                val result = element.asVerificationProperty.result
                switch(result.status) {
                    case null,
                    case PENDING : return ""
                    case COMPILING : return "Compiling..."
                    case RUNNING : return "Running..."
                    case FAILED : return "FAILED"
                    case PASSED : return "PASSED"
                    case EXCEPTION : {
                        if(result.cause !== null) {
                            return result.cause.class.simpleName + ": " + result.cause.message
                        } else {
                            return "EXCEPTION (of unkown cause)"
                        }    
                    }
                    default : return result.status.toString
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
            val DiagramView viewPart = diagramViews.head
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
            val lastSelection = selectedProperties
            val properties = scchartsVerificationPropertyAnalyzer.getVerificationProperties(currentModel)
            viewer.input = properties
            if(!properties.isNullOrEmpty) {
                // Restore selection
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
    }
    
    private def void runCounterexample() {
        val property = selectedProperty
        if(property !== null
            && property.result.status == VerificationResultStatus.FAILED
            && property.result.counterexample !== null) {
            try {
                // Start a simulation, and when the simulation is started, load the trace from the counterexample
                val simulationSystemId = "de.cau.cs.kieler.sccharts.simulation.tts.netlist.c"
                SimulationUI.compileAndStartSimulation(simulationSystemId, currentDiagramModel)
                SimulationUI.registerObserver(new SimulationListener() {
                    
                    override update(SimulationContext ctx, SimulationEvent e) {
                        if(e instanceof SimulationControlEvent) {
                            if(e.operation == SimulationControlEvent.SimulationOperation.START) {
                                val counterexampleLocation = property.result.counterexample.location.toOSString
                                val traceFile = TraceFileUtil.loadTraceFile(new File(counterexampleLocation))
                                SimulationUI.currentSimulation.setTrace(traceFile.traces.head, true)
                                DataPoolView.bringToTopIfOpen
                                // TODO: Remove simulation listener needed?
                            }    
                        }
                    }
                    
                    override getName() {
                        return "Model Checking View"
                    }
                    
                })

            } catch (Exception e) {
                e.printStackTrace
                StatusManager.getManager().handle(new Status(IStatus.ERROR,
                    SCChartsUiModule.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW)
            }
        }
    }
    
    private def void startVerification() {
        val verificationProperties = selectedProperties
        if(verificationProperties === null) {
            return
        }
        val model = currentDiagramModel
        if(model === null || !(model instanceof EObject)) {
            return
        }
        // Stop last verification if not done yet
        stopVerification()
        // Start new verification
        startVerification(model as EObject, verificationProperties)
    }
    
    private def void stopVerification() {
        if(verificationContext !== null) {
            verificationContext.startEnvironment.setProperty(Environment.CANCEL_COMPILATION, true)
            verificationContext = null
        }
    }
    
    private def void startVerification(EObject model, List<VerificationProperty> verificationProperties) {
        verificationContext = Compile.createCompilationContext(selectedSystemId, model)
        verificationContext.startEnvironment.setProperty(Environment.VERIFICATION_PROPERTIES, verificationProperties)
        verificationContext.addObserver[ Observable o, Object arg |
            if(arg instanceof VerificationPropertyChanged) {
                Display.getDefault().asyncExec([ viewer.update(arg.changedProperty, null) ])    
            } else if(arg instanceof CompilationFinished) {
                verificationContext = null
            }
        ]
        verificationContext.compileAsynchronously
    }
    
    private def void toggleVerificationStartStop() {
        if(verificationContext !== null) {
            stopVerification()    
        } else {
            startVerification()
        }
    }
}
