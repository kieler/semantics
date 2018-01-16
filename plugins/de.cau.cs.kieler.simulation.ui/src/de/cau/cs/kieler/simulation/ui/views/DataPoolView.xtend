/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.views

import com.google.common.base.Strings
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.prom.ui.UIUtil
import de.cau.cs.kieler.prom.ui.views.LabelContribution
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.core.events.ErrorEvent
import de.cau.cs.kieler.simulation.core.events.SimulationAdapter
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.core.events.VariableUserValueEvent
import de.cau.cs.kieler.simulation.handlers.TraceMismatchEvent
import de.cau.cs.kieler.simulation.trace.printer.EsoFilePrinter
import de.cau.cs.kieler.simulation.trace.printer.KTraceFilePrinter
import de.cau.cs.kieler.simulation.trace.printer.SimulationHistoryPrinter
import de.cau.cs.kieler.simulation.ui.SimulationUiPlugin
import de.cau.cs.kieler.simulation.ui.toolbar.AdvancedControlsEnabledPropertyTester
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuListener
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnViewerEditor
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.jface.viewers.TableViewerEditor
import org.eclipse.jface.viewers.TableViewerFocusCellManager
import org.eclipse.jface.viewers.ViewerCell
import org.eclipse.swt.SWT
import org.eclipse.swt.dnd.DND
import org.eclipse.swt.dnd.DragSource
import org.eclipse.swt.dnd.DragSourceEvent
import org.eclipse.swt.dnd.DragSourceListener
import org.eclipse.swt.dnd.DropTarget
import org.eclipse.swt.dnd.DropTargetAdapter
import org.eclipse.swt.dnd.DropTargetEvent
import org.eclipse.swt.dnd.FileTransfer
import org.eclipse.swt.dnd.TextTransfer
import org.eclipse.swt.events.KeyAdapter
import org.eclipse.swt.events.KeyEvent
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.part.ResourceTransfer
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.simulation.ui.toolbar.AdvancedControlsEnabledPropertyTester.*
import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.simulation.handlers.TraceEvent
import de.cau.cs.kieler.simulation.handlers.TraceFinishedEvent

/**
 * Displays the data of a running simulation.
 * 
 * @author aas ssm
 *
 */
class DataPoolView extends ViewPart {
    
    /**
     * The id of the view from the plugin.xml
     */
    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"
    
    /**
     * The single instance
     */
    public static var DataPoolView instance
    
    /**
     * The simulation listener that updates this view
     */
    public static val simulationListener = createSimulationListener
    
    /**
     * The table that shows the data pool view of the simulation.
     */
    @Accessors(PUBLIC_GETTER)
    private var TableViewer viewer
    /**
     * The variable column of the table
     */
    private var TableViewerColumn variableColumn
    /**
     * The value column of the table
     */
    private var TableViewerColumn valueColumn
    /**
     * Theuser value column of the table
     */
    private var TableViewerColumn userValueColumn
    /**
     * The history column of the table
     */
    private var TableViewerColumn historyColumn
    /**
     * The isInput / isOutput column of the table
     */
    private var TableViewerColumn inputOutputColumn
    
    /**
     * The label to display the tick count
     */
    private var LabelContribution tickInfo

    /**
     * The menu contributions that are created at runtime when the menu is opened.
     */
    private val List<IAction> dynamicMenuActions = newArrayList

    /**
     * A filter for the table to control which items are visible, e.g., to search for items
     */    
    private var DataPoolFilter filter
    
    /**
     * Remember the pool for the drag and drop mechanism.
     */
    @Accessors(PUBLIC_GETTER)
    private var DataPool internalDataPool
    
    /**
     * Container for the trace mismatches and where they occured.
     * The key is the fully qualified name of a variables.
     * The value is the trace mismatch that occured on this variable.
     */
    private var Map<String, TraceMismatchEvent> traceMismatches = newHashMap
    
    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
     override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
        SimulationManager.add(simulationListener)
        
        // Create viewer.
        viewer = createTable(parent);
        
        // Create menu and toolbars.
        createMenu
        createToolbar
        
        // Add key listeners for fast controls
        addKeyListeners()
        
        // Add drag and drop support to start simulations
        addDragAndDropSupport(viewer.control)
    }
    
    /**
     * {@inheritDoc}
     */
    override setFocus() {
        viewer.refresh
        viewer.control.setFocus
    }
    
    /**
     * Dispose and clear reference to singleton instance.
     */
    override dispose() {
        super.dispose()
        instance = null
    }
    
    /**
     * Set the data pool to be displayed.
     */
    public def void setDataPool(DataPool pool) {
        internalDataPool = pool
        if(pool === null) {
            // The simulation stopped. Thus variables are reset.
            viewer.input = null
            traceMismatches = newHashMap
            statusLineText = ""
        } else {
            // Create a sorted list as input for the table viewer
            val List<Object> inputs = newArrayList()
            // Sort models by name
            val List<Model> sortedModels = pool.models.sortBy[it.name]
            // Add variables of models. The variables are also sorted.
            for(m : sortedModels) {
                inputs += m
                val sortedVariables = m.variables.sortWith(new VariableComparator)
                for(v : sortedVariables) {
                    inputs += v
                }
            }
            // Set input of viewer
            viewer.input = inputs
        }
    }
    
    /**
     * Adds drag and drop support to the control to start simulations.
     * 
     * @param control The control that should receive drag and drop support.
     */
    private def void addDragAndDropSupport(Control control) {
        // Allow data to be copied to the drop target
        val operations = PromPlugin.createBitmask(DND.DROP_COPY, DND.DROP_DEFAULT)
        val target = new DropTarget(control, operations);
   
        // Receive data in Resource or File format
        val resTransfer = ResourceTransfer.getInstance()
        val fileTransfer = FileTransfer.getInstance()
        val types = #[fileTransfer, resTransfer]
        target.setTransfer(types);
        
        target.addDropListener(new DropTargetAdapter() {
            override void dragEnter(DropTargetEvent event){
                // Change drop event to copy.
                if(event.detail == DND.DROP_DEFAULT) {
                    event.detail = DND.DROP_COPY
                }
            }
            
            override void drop(DropTargetEvent event) {
                var List<IFile> files = newArrayList
                // Open file from Resource
                if (resTransfer.isSupportedType(event.currentDataType)) {
                    val resources = event.data as IResource[]
                    if(!resources.isNullOrEmpty) {
                        for(res : resources)
                        if(res.type == IResource.FILE) {
                            files.add(res as IFile)
                        }
                    }
                }
                // Open file from File transfer
                if (fileTransfer.isSupportedType(event.currentDataType)){
                    val filePaths = event.data as String[]
                    if(!filePaths.isNullOrEmpty) {
                        for(filePath : filePaths) {
                            val file = PromPlugin.findFile(filePath)
                            if(file !== null) {
                                files.add(file)
                            }    
                        }
                    }
                }
                if(!files.isNullOrEmpty) {
                    if(files.size == 1 && FileExtensions.isTrace(files.get(0))) {
                        // Add the trace to a running simulation
                        SimulationUtil.appendToSimulation(files)
                    } else {
                        SimulationUtil.startSimulation(files)    
                    }
                }
            }
        })
    }
    
    /**
     * Creates the menu.
     */
    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
        mgr.add(new ToggleColumnVisibleAction(historyColumn));
        mgr.add(new ToggleColumnVisibleAction(inputOutputColumn));
        mgr.add(new Action("Internal Variables", IAction.AS_CHECK_BOX) {
            override run() {
                filter.internalVariables = !filter.internalVariables
                viewer.refresh
            }
        });
        mgr.add(new Action("Other Variables", IAction.AS_CHECK_BOX) {
            override run() {
                filter.otherVariables = !filter.otherVariables
                viewer.refresh
            }
        });
        mgr.add(new Separator())
        mgr.add(new Action("Clear Trace Mismatches") {
            override run() {
                traceMismatches = newHashMap
                viewer.refresh
            }
        });
        mgr.add(new Action("Reset All User Values"){
            override run(){
                for(i : viewer.input as ArrayList<Object>) {
                    if(i instanceof Variable) {
                        val variable = i as Variable
                        variable.userValue = null
                    } 
                }
                viewer.refresh
            }
        });
        mgr.add(new Action("Reset Selected User Values"){
            override run(){
                val variable = viewer.structuredSelection.firstElement as Variable
                if(variable !== null) {
                    variable.userValue = null
                    viewer.update(variable, null)
                } 
            }
        });
        mgr.add(new Separator())
        mgr.add(new Action("Enable Advanced Controls", IAction.AS_CHECK_BOX) {
            override run() {
                AdvancedControlsEnabledPropertyTester.advancedControlsEnabled = !AdvancedControlsEnabledPropertyTester.advancedControlsEnabled
                // Trigger re-evaluation of the property tester
                // that controls the visibility of the toolbar button
                AdvancedControlsEnabledPropertyTester.update
            }
        })
        mgr.add(new Separator())
        // Enable / disable simulation listeners.
        // As the listeners may change at runtime, populate this list dynamically
        val menuListener = new IMenuListener() {
            override menuAboutToShow(IMenuManager manager) {
                // Remove old actions
                for(menuAction : dynamicMenuActions) {
                    mgr.remove(menuAction.id)
                }
                dynamicMenuActions.clear
                // Create new actions
                populateDynamicMenuActions()
                for(menuAction : dynamicMenuActions) {
                    mgr.add(menuAction)    
                }
            }
        }
        mgr.addMenuListener(menuListener);
    }
    
    /**
     * Fills the list of dynamic menu actions.
     */
    private def void populateDynamicMenuActions() {
        var i = 0
        for(listener : SimulationManager.listeners) {
            val disabled = SimulationManager.isDisabled(listener)
            val action = new Action(listener.name, IAction.AS_CHECK_BOX) {
                override run() {
                    if(disabled) {
                        SimulationManager.enable(listener)
                    } else {
                        SimulationManager.disable(listener)
                    }
                }
            }
            action.setId("SimulationListener"+i)
            action.checked = !disabled
            dynamicMenuActions.add(action)
            i++;
        }
    }
    
    /**
     * Creates the toolbar.
     */
    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager()
        // The toolbar items are ordered from left to right in the order that they are added
        tickInfo = new LabelContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.tickInfo",
                                         "Tick #0000 (-000)",
                                         "Last executed macro tick")
        mgr.add(tickInfo)
        mgr.add(new Separator())
        mgr.add(new DataPoolViewToolbarAction("Show Controls", "help.png") {
            override run() {
                val title = "Controls for the Data Pool View"
                val message = "Right Arrow : Step simulation macro tick\n"
                            + "Ctrl + Right Arrow: Step in simulation history forward\n"
                            + "Ctrl + Left Arrow: Step in simulation history back\n"
                            + "Space: Play / pause simulation\n"
                val dialog = new MessageDialog(viewer.control.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
        mgr.add(new Separator())
        mgr.add(new SearchFieldContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.searchField"))
        mgr.add(new Separator())
        mgr.add(new SimulationDelayContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.desiredPause"))
        mgr.add(new Separator())
        mgr.add(new SaveSimulationAction("Save Data Pool History", "saveFile.png", new SimulationHistoryPrinter))
        mgr.add(new SaveSimulationAction("Save KTrace", "saveKTraceFile.png", new KTraceFilePrinter))
        mgr.add(new SaveSimulationAction("Save Eso Trace", "saveEsoFile.png", new EsoFilePrinter))
        mgr.add(new OpenSimulationAction("Open Data Pool", "openFile.png"));
        mgr.add(new Separator())
    }
    
    /**
     * Adds key listeners to the table for easy control of the simulation.
     */
    private def void addKeyListeners() {
        viewer.control.addKeyListener(new KeyAdapter() {
            override keyPressed(KeyEvent e) {
                val manager = SimulationManager.instance
                val mod = e.stateMask
                // CTRL + RIGHT: step history forward
                // CTRL + LEFT: step history back
                if(mod.hasBit(SWT.CTRL)) {
                    if(e.keyCode == SWT.ARROW_RIGHT) {
                        if(manager !== null) {
                            PromConsole.print("Step History Forward")
                            manager.stepHistoryForward()
                        }
                    } else if(e.keyCode == SWT.ARROW_LEFT) {
                        if(manager !== null) {
                            PromConsole.print("Step History Back")
                            manager.stepHistoryBack()
                        }
                    }
                } else {
                    // No CTRL + RIGHT: Step Macro Tick
                    if(e.keyCode == SWT.ARROW_RIGHT) {
                        if(manager !== null) {
                            PromConsole.print("Step Macro Tick")
                            manager.stepMacroTick()
                        }
                    }
                    // No CTRL + SPACE: Play Simulation
                    if(e.keyCode == SWT.SPACE) {
                        if(manager !== null) {
                            PromConsole.print("Playing Simulation")
                            if(manager.isPlaying) {
                                manager.pause()
                            } else {
                                manager.play()
                            }
                        }
                    }
                }
            }
        })
    }
    
    /**
     * Determines if the given bit is set in the bit mask.
     * 
     * @param bitMask The bit mask
     * @param bit The bit
     * @returns true if the bit is set, false otherwise
     */
    private def boolean hasBit(int bitMask, int bit) {
        return bitMask.bitwiseAnd(bit) != 0
    }
    
    /**
     * Creates the table to show and edit data pools.
     */
    private def TableViewer createTable(Composite parent) {
        val table = new Table(parent, SWT.BORDER + SWT.FULL_SELECTION + SWT.MULTI)
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        // Create viewer
        val viewer = new TableViewer(table)
        // Support objects that are "equal" yet two different objects in memory.
        viewer.comparer = new IdentityComparer()
        // Add filter to viewer
        filter = new DataPoolFilter
        viewer.addFilter(filter)
        
        // Create columns
        variableColumn = UIUtil.createTableColumn(viewer, "Variable", 120, true)
        variableColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable) {
                    if(element.isDirty)
                        return "*"+element.name
                    else
                        return element.name
                } else if(element instanceof Model) { 
                    return "-----" + element.name + "-----"
                }
            }
        };
        valueColumn = UIUtil.createTableColumn(viewer, "Current Value", 100, true)
        valueColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getToolTipText(Object element) {
                if(element instanceof Variable) {
                    // Add tooltip about trace mismatch of this value
                    val mismatch = getTraceMismatch(element)
                    if(mismatch !== null) {
                        return mismatch.toString
                    }
                }
                return super.getToolTipText(element)
            }
            
            override String getText(Object element) {
                 if(element instanceof Variable) {
                    return element.value?.toString
                }
                return ""
            }
        };
        userValueColumn = UIUtil.createTableColumn(viewer, "User Value", 100, true)
        userValueColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                 if(element instanceof Variable) {
                    if(element.isDirty) {
                        return element.userValue.toString    
                    }
                }
                return ""
            }
        };
        historyColumn = UIUtil.createTableColumn(viewer, "History", 200, true)
        historyColumn.labelProvider = new HistoryColumnLabelProvider()
        
        inputOutputColumn = UIUtil.createTableColumn(viewer, "In Out", 32, false)
        inputOutputColumn.labelProvider = new DataPoolColumnLabelProvider() {
            private val inputImageDescriptor = SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, "icons/input.png");
            private val outputImageDescriptor = SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, "icons/output.png");
            private val inputOutputImageDescriptor = SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, "icons/inputOutput.png");
            private var Image inputImage
            private var Image outputImage
            private var Image inputOutputImage
            
            override getImage(Object element) {
                if(element instanceof Variable) {
                    if(element.isInput && element.isOutput) {
                        if(inputOutputImage === null) {
                            inputOutputImage = inputOutputImageDescriptor.createImage    
                        }
                        return inputOutputImage
                    } else if (element.isInput) {
                        if(inputImage === null) {
                            inputImage = inputImageDescriptor.createImage    
                        }
                        return inputImage
                    } else if (element.isOutput) {
                        if(outputImage === null) {
                            outputImage = outputImageDescriptor.createImage    
                        }
                        return outputImage
                    }
                }
                
            }
            
            override String getToolTipText(Object element) {
                if(element instanceof Variable) {
                    if(element.isInput && element.isOutput) {
                        return "Input and output"
                    } else if (element.isInput) {
                        return "Input"
                    } else if (element.isOutput) {
                        return "Output"
                    } else {
                        return "Neither input nor output"
                    }
                }
            }
            
            override String getText(Object element) {
                return ""
            }
            
            override dispose() {
                // Dispose created images
                inputImage?.dispose()
                inputImage = null
                outputImage?.dispose()
                outputImage = null
                inputOutputImage?.dispose()
                inputOutputImage = null
            }
        };

        // Fancy tooltips
        ColumnViewerToolTipSupport.enableFor(viewer)

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
        // Make cells editable
        userValueColumn.editingSupport = new ValueColumnEditingSupport(viewer)
        
        // Use TAB to go to next row neighbor and activate cell editor
        val multiSelectFocusCellHighlighter = new FocusCellOwnerDrawHighlighter(viewer) {
            override onlyTextHighlighting(ViewerCell cell) {
                return true;
            }
        }
        val focusCellManager = new TableViewerFocusCellManager(viewer, multiSelectFocusCellHighlighter);
        val activationSupport = new ColumnViewerEditorActivationStrategy(viewer)
        activationSupport.enableEditorActivationWithKeyboard = true
        TableViewerEditor.create(viewer, focusCellManager, activationSupport, 
            ColumnViewerEditor.TABBING_HORIZONTAL.bitwiseOr(
            ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR).bitwiseOr(
            ColumnViewerEditor.TABBING_VERTICAL).bitwiseOr(
            ColumnViewerEditor.KEYBOARD_ACTIVATION))

        // Drag and drop elements in the data pool
        val DragSource dndSource = new DragSource(viewer.control, DND.DROP_MOVE + DND.DROP_COPY)
        dndSource.setTransfer(#[TextTransfer.getInstance()])
        dndSource.addDragListener(new DragSourceListener () {
            override dragStart(DragSourceEvent event) {
            }
            
            override dragSetData(DragSourceEvent event) {
                var vals = ""
                for (selection : table.selection) {
                    if (vals != "") { vals = vals + "," }
                    vals = vals + selection.getText(0)
                }    
                
                event.data = vals
            }
            
            override dragFinished(DragSourceEvent event) {
            }
            
        })
            
        return viewer
    }
    
    /**
     * Adds a trace mismatch for the given variable, so that this variable will be highlighted in the table.
     * 
     * @param variable The variable
     * @param e The trace mismatch event
     */
    public def void registerTraceMismatch(Variable variable, TraceMismatchEvent e) {
        traceMismatches.put(variable.fullyQualifiedName, e)
    }
    
    /**
     * Returns the trace mismatch for the given variable.
     * 
     * @param variable The variable
     * @return the trace mismatch for the given variable, or null if none
     */
    public def TraceMismatchEvent getTraceMismatch(Variable variable) {
        return traceMismatches.getOrDefault(variable.fullyQualifiedName, null)
    }
    
    /**
     * Updates the info label with the current tick count.
     */
    private def void updateTickInfo() {
        var String txt = null
        val simMan = SimulationManager.instance
        if(!simMan.isStopped) {
            val macroTick = simMan.currentMacroTickNumber
            val subTick = simMan.currentSubTickNumber
            txt = "Tick #"+macroTick
            if(subTick > 0) {
                txt += "," + subTick
            }
            if(SimulationManager.instance.positionInHistory > 0) {
                txt += " (-" + SimulationManager.instance.positionInHistory + ")"
            }
        }
        tickInfo?.setText(Strings.nullToEmpty(txt))
    }
    
    /**
     * Sets the text of this view's status line.
     * 
     * @param value The new status line text
     */
    public def void setStatusLineText(String value) {
        PromUIPlugin.asyncExecInUI[
            val bars = getViewSite().getActionBars();
            if(bars !== null) {
                val statusLineManager = bars.getStatusLineManager()
                statusLineManager.setMessage(value);
            }
        ]
    }
    
    /**
     * Sets the search term to filter the table.
     * 
     * @param text The search term
     */
    public def void setFilterText(String text) {
        filter.searchString = text
        viewer.refresh
    }
    
    /**
     * Creates a simulation listener that updates this view with the simulation.
     */
    private static def SimulationListener createSimulationListener() {
        val listener = new SimulationAdapter("Data Pool View") {
            var DataPoolView dataPoolView
            
            /**
             * {@inheritDoc}
             */
            override update(SimulationEvent e) {
                dataPoolView = DataPoolView.instance
                if(dataPoolView === null) {
                    return;
                }
                super.update(e)
            }
            
            /**
             * Shows errors in the status line.
             * 
             * @param e The event
             */
            override onErrorEvent(ErrorEvent e) {
                dataPoolView.setStatusLineText(e.message)
            }
            
            /**
             * Updates the row of the changed variable.
             * 
             * @param e The event
             */
            override onUserValueChanged(VariableUserValueEvent e) {
                PromUIPlugin.asyncExecInUI[
                    dataPoolView.viewer.update(e.variable, null)    
                ]
            }
            
            /**
             * Registers a trace mismatch.
             * 
             * @param e The event
             */
            override onTraceMismatch(TraceMismatchEvent e) {
                dataPoolView.registerTraceMismatch(e.variable, e)
                dataPoolView.viewer.update(e.variable, null)
            }
            
            /**
             * Indicates the end of a trace.
             * 
             * @param e The event
             */
            override onTraceEvent(TraceEvent e) {
                if(e instanceof TraceFinishedEvent) {
                    dataPoolView.statusLineText = "Trace finished"    
                }
            }
            
            /**
             * Updates the view with the new data pool from the simulation.
             * 
             * @param e The event
             */
            override onSimulationControlEvent(SimulationControlEvent e) {
                PromUIPlugin.asyncExecInUI[
                    // Update data pool view
                    if(e.pool == SimulationManager.instance?.currentPool) {
                        // Update tick info
                        dataPoolView.updateTickInfo
                        // Set pool data
                        dataPoolView.setDataPool(e.pool)
                    }
                ]
            }
        }
        return listener
    }
}