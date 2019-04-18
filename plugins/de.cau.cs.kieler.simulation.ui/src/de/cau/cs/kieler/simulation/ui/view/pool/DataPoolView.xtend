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
package de.cau.cs.kieler.simulation.ui.view.pool

import com.google.gson.JsonElement
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationListener
import de.cau.cs.kieler.simulation.events.TraceFinishedEvent
import de.cau.cs.kieler.simulation.events.TraceMismatchEvent
import de.cau.cs.kieler.simulation.trace.TraceFileUtil
import de.cau.cs.kieler.simulation.ui.SimulationUIPlugin
import de.cau.cs.kieler.simulation.ui.view.SimulationControlButtons
import java.io.File
import java.util.Collections
import java.util.Comparator
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuListener
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.MenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.dialogs.ErrorDialog
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ColumnViewerEditor
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter
import org.eclipse.jface.viewers.IStructuredContentProvider
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.jface.viewers.TableViewerEditor
import org.eclipse.jface.viewers.TableViewerFocusCellManager
import org.eclipse.jface.viewers.ViewerCell
import org.eclipse.jface.window.Window
import org.eclipse.swt.SWT
import org.eclipse.swt.dnd.DND
import org.eclipse.swt.dnd.DragSource
import org.eclipse.swt.dnd.DragSourceEvent
import org.eclipse.swt.dnd.DragSourceListener
import org.eclipse.swt.dnd.TextTransfer
import org.eclipse.swt.events.KeyAdapter
import org.eclipse.swt.events.KeyEvent
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.dialogs.SaveAsDialog
import org.eclipse.ui.ide.ResourceUtil
import org.eclipse.ui.part.ViewPart
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.simulation.ide.SimulationIDE.*
import static de.cau.cs.kieler.simulation.ui.SimulationUI.*
import org.eclipse.core.runtime.Path
import org.eclipse.jface.viewers.IElementComparer

/**
 * Displays the data of a running simulation.
 * 
 * @author als, aas, ssm
 * 
 */
class DataPoolView extends ViewPart implements SimulationListener {

    /**
     * The id of the view from the plugin.xml
     */
    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"
    /**
     * The max number of history entries to be displayed. 
     */
    public static val SHOWN_HISTORY_LENGTH = 20

    /**
     * The single instance
     */
    public static var DataPoolView instance

    // == UI ELEMENTS ==
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

    // -- Menu --
    private var IAction menuLoadTrace
    private var IAction menuSaveTrace
    private var IAction menuCheckTrace
    private var IAction menuResetAllUserValues
    private var IAction menuResetSelectedUserValue
    private var MenuManager menuSimulationListenersSubmenu
    private var IMenuListener menuSimulationListenersSubmenuPoplulator
    private var IAction menuHelp

    // -- Toolbar --
    private var SimulationControlButtons simulationControlButtons
    private var SimulationModeMenu simulationModeMenu

    /**
     * A filter for the table to control which items are visible, e.g., to search for items
     */
    @Accessors(PUBLIC_GETTER)
    private var DataPoolFilter filter

    /**
     * Remember the pool for the drag and drop mechanism.
     */
    @Accessors(PUBLIC_GETTER)
    private var DataPool internalDataPool

    /**
     * User values
     */
    @Accessors(PUBLIC_GETTER)
    private val Map<String, JsonElement> userValues = Collections.synchronizedMap(newHashMap)
    
    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this

        // Create viewer.
        viewer = createTable(parent)
        filter.viewComposite = parent

        // Create menu and toolbars.
        createMenu
        createToolbar

        // Add key listeners for fast controls
        addKeyListeners

        updateButtonEnabling(null, null)

        // Register for events
        registerObserver(this)
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

        if (pool === null) {
            // The simulation stopped. Thus variables are reset.
            viewer.input = null
        } else {
            // Set input of viewer
            viewer.input = pool
        }
    }

    /**
     * Creates the menu.
     */
    private def void createMenu() {
        menuLoadTrace = new Action("Load Trace", IAction.AS_PUSH_BUTTON) {
            override run() {
                if (currentSimulation !== null) {
                    val shell = instance.site.shell
                    val workspace = ResourcesPlugin.getWorkspace()
                    val root = workspace.getRoot()
                    val activeEditor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
                    val extensions = newHashSet("ktrace", "eso", "esi")

                    // Configure dialog
                    val res = if (activeEditor !== null && activeEditor.editorInput !== null) {
                            ResourceUtil.getFile(activeEditor.editorInput)
                        }
                    val dialog = new ResourceSelectionDialog(shell, root,
                        "Select single trace file. " + extensions.join(", ")["*." + it])
                    dialog.open
                    val results = dialog.result
                    if (results !== null) {
                        try {
                            var error = ""
                            val file = results.head
                            if (file instanceof IFile) {
                                if (extensions.contains(file.fileExtension)) {
                                    val traceFile = TraceFileUtil.loadTraceFile(new File(file.locationURI))
                                    if (traceFile !== null) {
                                        if (traceFile.traces.size == 1) {
                                            currentSimulation.setTrace(traceFile.traces.head, menuCheckTrace.checked, true)
                                            MessageDialog.openInformation(shell, "Success",
                                                "Trace loading successfull.")
                                            return
                                        } else if (traceFile.traces.size > 1) {
                                            val dialog2 = new ElementListSelectionDialog(shell, new LabelProvider())
                                            val elements = (0 ..< traceFile.traces.size).map["Trace " + it].toList
                                            dialog2.setElements(elements.toArray)
                                            dialog2.setTitle("Select Trace");
                                            dialog2.setMessage("Trace file successfully loaded. Please select trace!");
                                            if (dialog2.open() == Window.OK) {
                                                val selection = dialog2.getResult()
                                                if (selection !== null) {
                                                    currentSimulation.setTrace(
                                                        traceFile.traces.get(elements.indexOf(selection.head)),
                                                        menuCheckTrace.checked, true)
                                                }
                                            }
                                            return
                                        }
                                    }
                                } else {
                                    error = "\nUnsupported file extension " + file.fileExtension
                                }
                            }
                            MessageDialog.openError(shell, "Error", "Could not open trace file." + error)
                        } catch (Exception e) {
                            e.printStackTrace
                            StatusManager.getManager().handle(new Status(IStatus.ERROR,
                                SimulationUIPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW)
                        }
                    }
                }
            }
        }
        menuCheckTrace = new Action("Validate Outputs", IAction.AS_CHECK_BOX) {
            override run() {}
        } => [
            checked = true
            toolTipText = "Check simulation outputs against trace if available"
        ]
        menuSaveTrace = new Action("Save Trace", IAction.AS_PUSH_BUTTON) {
            override run() {
                if (currentSimulation !== null && !currentSimulation.history.empty) {
                    val shell = instance.site.shell
                    val workspace = ResourcesPlugin.getWorkspace()
                    val root = workspace.getRoot()
                    val activeEditor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor

                    val saveAsDialog = new SaveAsDialog(shell)

                    // Configure dialog
                    if (activeEditor !== null && activeEditor.editorInput !== null) {
                        val res = ResourceUtil.getFile(activeEditor.editorInput)
                        if (res !== null) {
                            saveAsDialog.originalFile = res.parent.getFile(new Path(res.name.substring(0, res.name.lastIndexOf(".")) + ".ktrace"))
                        }
                    }
                    saveAsDialog.setTitle("Save Trace")
                    saveAsDialog.setBlockOnOpen(true)

                    // open and get result
                    saveAsDialog.open()
                    val path = saveAsDialog.getResult()

                    // save
                    if (path !== null && !path.isEmpty()) {
                        val file = root.getFile(path)
                        if (file.exists) {
                            val dialog = new MessageDialog(shell, "Override?", null,
                                "The given file already exists and may contain other traces.\nAppend the new trace or overwrite file?",
                                MessageDialog.WARNING, #["Cancel", "Overwrite", "Append"], 2)
                            val result = dialog.open()
                            if (result == 0) {
                                return
                            } else {
                                try {
                                    TraceFileUtil.saveTraceToFile(new File(file.locationURI.normalize),
                                        currentSimulation, result == 2)
                                    file.refreshLocal(IResource.DEPTH_INFINITE, null)
                                } catch (Exception e) {
                                    e.printStackTrace
                                    StatusManager.getManager().handle(new Status(IStatus.ERROR,
                                        SimulationUIPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW)
                                }
                            }
                        } else {
                            try {
                                TraceFileUtil.saveTraceToFile(new File(file.locationURI.normalize), currentSimulation,
                                    false)
                                file.refreshLocal(IResource.DEPTH_INFINITE, null)
                            } catch (Exception e) {
                                e.printStackTrace
                                StatusManager.getManager().handle(new Status(IStatus.ERROR,
                                    SimulationUIPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW)
                            }
                        }
                    }
                }
            }
        }
        menuResetAllUserValues = new Action("Reset All User Values") {
            override run() {
                userValues.clear
                viewer.refresh
            }
        }
        menuResetSelectedUserValue = new Action("Reset Selected User Values") {
            override run() {
                val selection = selectedVariables.map[name].toSet
                userValues.keySet.removeIf[selection.contains(it)]
                viewer.refresh
            }
        }
        // Enable / disable simulation listeners.
        // As the listeners may change at runtime, populate this list dynamically
        menuSimulationListenersSubmenu = new MenuManager("Active Simulation Listeners")
        menuSimulationListenersSubmenuPoplulator = new IMenuListener() {
            override menuAboutToShow(IMenuManager manager) {
                // Remove old actions
                menuSimulationListenersSubmenu.removeAll
                // Create new actions
                for (listener : observers.filter[canBeDisabled].sortBy[name]) {
                    val action = new Action(listener.name, IAction.AS_CHECK_BOX) {
                        override run() {
                            listener.enabled = checked
                        }
                    }
                    action.setId(listener.hashCode.toString)
                    action.checked = listener.enabled
                    menuSimulationListenersSubmenu.add(action)
                }
            }
        }
        // The toolbar items are ordered from left to right in the order that they are added
        menuHelp = new Action("Show Controls") {
            override run() {
                val title = "Controls for the Data Pool View"
                val message = "Right Arrow : Step simulation macro tick\n"
                //            + "Ctrl + Right Arrow: Step in simulation history forward\n"
//                            + "Ctrl + Left Arrow: Step in simulation history back\n"
                + "Space: Play / pause simulation\n" + "Ctrl + Shift + F: Filter variables by name \n"
                val dialog = new MessageDialog(viewer.control.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        }

        getViewSite().getActionBars().getMenuManager() => [
            filter.addMenuContributions(it)
            add(new Separator)
            add(new ToggleColumnVisibleAction(historyColumn))
            add(new ToggleColumnVisibleAction(inputOutputColumn))
            add(menuSimulationListenersSubmenu)
            addMenuListener(menuSimulationListenersSubmenuPoplulator)
            add(new Separator)
            add(menuSaveTrace)
            add(menuLoadTrace)
            add(menuCheckTrace)
            add(new Separator)
            add(menuResetAllUserValues)
            add(menuResetSelectedUserValue)
            add(menuHelp)
        ]

    }

    /**
     * Creates the toolbar.
     */
    private def void createToolbar() {
        simulationControlButtons = new SimulationControlButtons(false)
        simulationModeMenu = new SimulationModeMenu()
        
        getViewSite().getActionBars().getToolBarManager() => [
            simulationModeMenu.addControls(it)
            add(new Separator)
            simulationControlButtons.addButtons(it)
        ]
    }

    /**
     * Adds key listeners to the table for easy control of the simulation.
     */
    private def void addKeyListeners() {
        viewer.control.addKeyListener(new KeyAdapter() {
            override keyPressed(KeyEvent e) {
                val sim = currentSimulation
                if(sim === null) return
                val mod = e.stateMask
                // CTRL + RIGHT: step history forward
                // CTRL + LEFT: step history back
                if (mod.hasBit(SWT.CTRL)) {
//                    if(e.keyCode == SWT.ARROW_RIGHT) {
//                        sim.stepHistoryForward
//                    } else if(e.keyCode == SWT.ARROW_LEFT) {
//                        sim.stepHistoryBack
//                    }
                    if (mod.hasBit(SWT.SHIFT) && e.character == 0x6) {
                        filter.toggleSearch
                    }
                } else {
                    // No CTRL + RIGHT: Step Macro Tick
                    if (e.keyCode == SWT.ARROW_RIGHT) {
                        sim.step()
                    }
                    // No CTRL + SPACE: Play Simulation
                    if (e.keyCode == SWT.SPACE) {
                        if (sim.playing) {
                            sim.pause
                        } else {
                            sim.play
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
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION).bitwiseOr(SWT.MULTI))
        table.setHeaderVisible(true)
        table.setLinesVisible(true)

        // Create viewer
        val viewer = new TableViewer(table)
        // Support objects that are "equal" yet two different objects in memory.
        viewer.comparer = new IElementComparer() {
            
            override equals(Object a, Object b) {
                if (a instanceof DataPoolEntry) {
                    if (b instanceof DataPoolEntry) {
                        return a.name.equals(b.name)
                    }
                }
                return a === b
            }
            
            override hashCode(Object element) {
                if (element instanceof DataPoolEntry) {
                    return element.name.hashCode
                }
                return element.hashCode
            }
            
        }
        // Add filter to viewer
        filter = new DataPoolFilter
        viewer.addFilter(filter)

        // Create columns
        inputOutputColumn = viewer.createTableColumn("I/O", 10, false)
        inputOutputColumn.labelProvider = new AbstractDataPoolColumnLabelProvider(this) {
            private val inputImageDescriptor = SimulationUIPlugin.imageDescriptorFromPlugin(
                SimulationUIPlugin.PLUGIN_ID, "icons/input.png");
            private val outputImageDescriptor = SimulationUIPlugin.imageDescriptorFromPlugin(
                SimulationUIPlugin.PLUGIN_ID, "icons/output.png");
            private val inputOutputImageDescriptor = SimulationUIPlugin.imageDescriptorFromPlugin(
                SimulationUIPlugin.PLUGIN_ID, "icons/inputOutput.png");
            private var Image inputImage
            private var Image outputImage
            private var Image inputOutputImage

            override getImage(Object element) {
                if (element instanceof DataPoolEntry) {
                    if (element.isInput && element.isOutput) {
                        if (inputOutputImage === null) {
                            inputOutputImage = inputOutputImageDescriptor.createImage
                        }
                        return inputOutputImage
                    } else if (element.isInput) {
                        if (inputImage === null) {
                            inputImage = inputImageDescriptor.createImage
                        }
                        return inputImage
                    } else if (element.isOutput) {
                        if (outputImage === null) {
                            outputImage = outputImageDescriptor.createImage
                        }
                        return outputImage
                    }
                }

            }

            override String getToolTipText(Object element) {
                if (element instanceof DataPoolEntry) {
                    if (element.isInput && element.isOutput) {
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

        variableColumn = viewer.createTableColumn("Variable", 120, true)
        variableColumn.labelProvider = new AbstractDataPoolColumnLabelProvider(this) {
            override String getText(Object element) {
                if (element instanceof DataPoolEntry) {
                    if (element.hasUserValue)
                        return "*" + element.name
                    else
                        return element.name
                }
            }
        }
        valueColumn = viewer.createTableColumn("Value", 100, true)
        valueColumn.labelProvider = new AbstractDataPoolColumnLabelProvider(this) {
            override String getText(Object element) {
                if (element instanceof DataPoolEntry) {
                    val value = element.rawValue
                    if (!element.variableInformation.nullOrEmpty && !element.variableInformation.head.format.nullOrEmpty) {
                        val format = element.variableInformation.head.format
                        return value.toFormattedString(format)
                    } else {
                        return element.rawValue.toString
                    }
                }
                return ""
            }
        }
        userValueColumn = viewer.createTableColumn("User Value", 100, true)
        userValueColumn.labelProvider = new AbstractDataPoolColumnLabelProvider(this) {
            override String getText(Object element) {
                if (element instanceof DataPoolEntry) {
                    if (element.hasUserValue) {
                        return userValues.get(element.name).toString
                    }
                }
                return ""
            }
        }
        historyColumn = viewer.createTableColumn("History", 200, true)
        historyColumn.labelProvider = new AbstractDataPoolColumnLabelProvider(this) {
            override String getText(Object element) {
                if(element instanceof DataPoolEntry) {
                    if (currentSimulation !== null && !currentSimulation.history.empty) {
                        val values = currentSimulation.history.take(SHOWN_HISTORY_LENGTH).map[
                            val entry = entries.get(element.name)
                            if (entry !== null) {
                                val value = entry.rawValue
                                if (value !== null) {
                                    if (!element.variableInformation.nullOrEmpty && !element.variableInformation.head.format.nullOrEmpty) {
                                        val format = element.variableInformation.head.format
                                        return value.toFormattedString(format)
                                    } else {
                                        return value.toString
                                    }
                                }
                            }
                            return "null"
                        ]
                        return values.join(", ") + if (currentSimulation.history.size > SHOWN_HISTORY_LENGTH) " ..." else ""
                    }
                }
                return ""
            }
        }

        // Fancy tooltips
        ColumnViewerToolTipSupport.enableFor(viewer)

        // Create content
        viewer.setContentProvider(new IStructuredContentProvider() {

            val COMPERATOR = new Comparator<DataPoolEntry> {

                override compare(DataPoolEntry o1, DataPoolEntry o2) {
                    val p1 = new Pair(o1.name, o1.variableInformation.head)
                    val p2 = new Pair(o2.name, o2.variableInformation.head)
                    return VariableStore.VARIABLE_ORDER.compare(p1, p2)
                }

            }

            override getElements(Object input) {
                if (input instanceof DataPool) {
                    return input.entries.values.sortWith(COMPERATOR)
                }
                return #[]
            }

        });
        viewer.input = null

        // Make cells editable
        userValueColumn.editingSupport = new ValueColumnEditingSupport(viewer, this)

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
            ColumnViewerEditor.TABBING_HORIZONTAL.bitwiseOr(ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR).bitwiseOr(
                ColumnViewerEditor.TABBING_VERTICAL).bitwiseOr(ColumnViewerEditor.KEYBOARD_ACTIVATION))

        // Drag and drop elements in the data pool
        val DragSource dndSource = new DragSource(viewer.control, DND.DROP_MOVE + DND.DROP_COPY)
        dndSource.setTransfer(#[TextTransfer.getInstance()])
        dndSource.addDragListener(new DragSourceListener() {
            override dragStart(DragSourceEvent event) {
            }

            override dragSetData(DragSourceEvent event) {
                var vals = ""
                for (selection : table.selection.filter[data instanceof DataPoolEntry]) {
                    if (vals != "") {
                        vals = vals + ","
                    }
                    vals = vals + (selection.data as DataPoolEntry).name
                }

                if (!vals.nullOrEmpty) event.data = vals
            }

            override dragFinished(DragSourceEvent event) {
            }

        })

        return viewer
    }
    
    /**
     * Creates a column for a table viewer with the given title and width.
     * 
     * @param viewer The TableViewer this column is added to
     * @param title The title for this column
     * @param width The width of this column
     * @return the created column.
     */
    public static def TableViewerColumn createTableColumn(TableViewer viewer, String title, int width) {
        return createTableColumn(viewer, title, width, true)
    }

    /**
     * Creates a column for a table viewer with the given title and width.
     * 
     * @param viewer The TableViewer this column is added to
     * @param title The title for this column
     * @param width The width of this column
     * @return the created column.
     */
    public static def TableViewerColumn createTableColumn(TableViewer viewer, String title, int width,
        boolean visible) {
        val viewerColumn = new TableViewerColumn(viewer, SWT.NONE)
        val column = viewerColumn.column
        column.text = title
        column.moveable = true

        if (visible) {
            column.width = width
            column.resizable = true
        } else {
            column.width = 0
            column.resizable = false
        }
        return viewerColumn
    }
    
    private static def String toFormattedString(JsonElement elem, String format) {
        if (elem.isJsonArray) {
            return elem.asJsonArray.join("[",",","]")[it.toFormattedString(format)]
        } else if (elem.isJsonPrimitive) {
            val primi = elem.asJsonPrimitive
            if (primi.isString) {
                return primi.toString
            } else {
                val Number number = if (primi.isNumber) {
                    primi.asNumber
                } else if (primi.isBoolean) {
                    Integer.valueOf(if (primi.asBoolean) 1 else 0) as Number
                }
                try {
                    return String.format(format, number.doubleValue)
                } catch (Exception e1) {
                    try {
                        return String.format(format, number.longValue)
                    } catch (Exception e2) {
                        // Formatting not possible
                    }
                }
            }
        }
        return elem.toString
    }

    private def List<DataPoolEntry> getSelectedVariables() {
        if (viewer !== null && viewer.selection !== null && viewer.selection instanceof StructuredSelection) {
            val sel = viewer.selection as StructuredSelection
            return sel.iterator.toList
        }
    }

    /**
     * Checks whether an element has a user value (only for Variables / NDimensionalArrayElements).
     * 
     * @param element The element in the cell
     * @return true if the element has a user value
     */
    protected def boolean hasUserValue(DataPoolEntry element) {
        return userValues.containsKey(element.name)
    }

    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            updateUI[
                switch (e.operation) {
                    case START,
                    case STEP:
                        dataPool = e.context.dataPool
                    case STOP: {
                        dataPool = null
                        userValues.clear
                    }
                    default: { // nothing
                    }
                }

                viewer.refresh
                updateButtonEnabling(ctx, e)
            ]
        } else if (e instanceof TraceFinishedEvent) {
            updateUI[
                MessageDialog.openInformation(instance.site.shell, "Trace finished",
                    "The current Trace reached its last tick.")
            ]
        } else if (e instanceof TraceMismatchEvent && menuCheckTrace.checked) {
            updateUI[
                ErrorDialog.openError(instance.site.shell, "Trace Mismatch", "Program output differs from trace",
                    new Status(IStatus.ERROR, "Trace Mismatch", (e as TraceMismatchEvent).toString))
            ]
        }
    }

    def updateButtonEnabling(SimulationContext context, SimulationControlEvent event) {
        simulationControlButtons.update(context, event)
        simulationModeMenu.update(context, event)
        menuLoadTrace.enabled = currentSimulation !== null
        menuSaveTrace.enabled = currentSimulation !== null && !currentSimulation.history.empty
        menuResetAllUserValues.enabled = currentSimulation !== null
        menuResetSelectedUserValue.enabled = currentSimulation !== null
        filter.updateMenu(context, event)
        // refresh
        updateToolbar
    }
    
    def updateToolbar() {
        instance.viewSite.actionBars.updateActionBars
    }

    override getName() {
        this.class.simpleName
    }

    def static bringToTopIfOpen() {
        val window = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
        if (window !== null) {
            val page = window.getActivePage()
            val viewRef = page.findViewReference(DataPoolView.VIEW_ID)
            if (viewRef !== null) {
                page.bringToTop(viewRef.getPart(true))
            }
        }
    }

}
