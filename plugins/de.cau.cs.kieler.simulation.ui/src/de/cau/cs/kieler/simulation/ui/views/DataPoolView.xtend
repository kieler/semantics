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
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.prom.ui.UIUtil
import de.cau.cs.kieler.prom.ui.views.LabelContribution
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
import de.cau.cs.kieler.simulation.ui.SimulationUiPlugin
import de.cau.cs.kieler.simulation.ui.toolbar.SubTicksEnabledPropertyTester
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.jface.action.Action
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
import org.eclipse.swt.SWT
import org.eclipse.swt.events.KeyAdapter
import org.eclipse.swt.events.KeyEvent
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Displays the data of a running simulation.
 * 
 * @author aas
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
     * Determines if the "step sub tick" button in the toolbar is visible or not.
     */
    @Accessors(PUBLIC_GETTER)
    static var boolean subTicksEnabled
    
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
     * A filter for the table to control which items are visible, e.g., to search for items
     */    
    private var DataPoolFilter filter
    
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
        SimulationManager.addListener(simulationListener)
        
        // Create viewer.
        viewer = createTable(parent);
        
        // Create menu and toolbars.
        createMenu
        createToolbar
        
        // Add key listeners for fast controls
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
        if(pool == null) {
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
     * Creates the menu.
     */
    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
        mgr.add(new ToggleColumnVisibleAction(historyColumn));
        mgr.add(new ToggleColumnVisibleAction(inputOutputColumn));
        mgr.add(new Action("Show/Hide Internal Variables") {
            override run() {
                filter.internalVariables = !filter.internalVariables
                viewer.refresh
            }
        });
        mgr.add(new Action("Show/Hide Other Variables") {
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
        mgr.add(new Separator())
        mgr.add(new Action("Enable Sub Ticks") {
            override run() {
                subTicksEnabled = !subTicksEnabled
                if(subTicksEnabled) {
                    setText("Disable Sub Ticks")
                } else {
                    setText("Enable Sub Ticks")
                }
                
                // Trigger re-evaluation of the property tester
                // that controls the visibility of the toolbar button
                SubTicksEnabledPropertyTester.update
            }
        })
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
        mgr.add(new SearchFieldContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.searchField"))
        mgr.add(new Separator())
        mgr.add(new SimulationDelayContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.desiredPause"))
        mgr.add(new Separator())
        mgr.add(new SaveSimulationAction("Save Data Pool History", "saveFile.png") {
            override getFileExtension() {
                return ".sim"
            }
            
            override getFileContent(List<DataPool> history) {
                // Turn data pools to json objects
                var String content = ""
                for(pool : history) {
                    content += pool.toJson+"\n"
                }
                return content
            }
        });
        mgr.add(new SaveSimulationAction("Save Eso Trace", "saveEsoFile.png") {
            override getFileExtension() {
                return ".eso"
            }
            
            override getFileContent(List<DataPool> history) {
                // Turn models of data pool history to eso file
                var String content = ""
                content += "! reset;\n"
                for(pool : history) {
                    for(v : pool.allVariables) {
                        if(v.isInput && v.isPresent) {
                            content += v.name
                            if(v.value instanceof Integer) {
                                content += "("+v.value+")"
                            }
                            content += " "
                        }
                    }
                    content += "\n"
                    content += "% Output: "
                    for(v : pool.allVariables) {
                        if(v.isOutput && v.isPresent) {
                            content += v.name
                            if(v.value instanceof Integer) {
                                content += "("+v.value+")"
                            }
                            content += " "
                        }
                    }
                    content += "\n;\n"
                }
                return content
            }
        });
        mgr.add(new OpenSimulationAction("Open Data Pool", "openFile.png"));
        mgr.add(new Separator())
        mgr.add(new Action("Reset All"){
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
        mgr.add(new Action("Reset Selection"){
            override run(){
                val variable = viewer.structuredSelection.firstElement as Variable
                if(variable != null) {
                    variable.userValue = null
                    viewer.update(variable, null)
                } 
            }
        });
        mgr.add(new Separator())
        mgr.add(new DataPoolViewToolbarAction("Show Controls", "help.png") {
            override run() {
                val title = "Controls for the Data Pool View"
                val message = "Right Arrow : Step simulation macro tick\n"
                            + "Ctrl + Right Arrow: Step in simulation history forward\n"
                            + "Ctrl + Left Arrow: Step in simulation history back\n"
                val dialog = new MessageDialog(viewer.control.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
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
                        if(manager != null) {
                            PromConsole.print("Step History Forward")
                            manager.stepHistoryForward()
                        }
                    } else if(e.keyCode == SWT.ARROW_LEFT) {
                        if(manager != null) {
                            PromConsole.print("Step History Back")
                            manager.stepHistoryBack()
                        }
                    }
                } else {
                    // No CTRL + RIGHT: Step Macro Tick
                    if(e.keyCode == SWT.ARROW_RIGHT) {
                        if(manager != null) {
                            PromConsole.print("Step Macro Tick")
                            manager.stepMacroTick()
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
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
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
                    if(mismatch != null) {
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
                        if(inputOutputImage == null) {
                            inputOutputImage = inputOutputImageDescriptor.createImage    
                        }
                        return inputOutputImage
                    } else if (element.isInput) {
                        if(inputImage == null) {
                            inputImage = inputImageDescriptor.createImage    
                        }
                        return inputImage
                    } else if (element.isOutput) {
                        if(outputImage == null) {
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
        val focusCellManager = new TableViewerFocusCellManager(viewer, new FocusCellOwnerDrawHighlighter(viewer));
        val activationSupport = new ColumnViewerEditorActivationStrategy(viewer)
        activationSupport.enableEditorActivationWithKeyboard = true
        TableViewerEditor.create(viewer, focusCellManager, activationSupport, 
            ColumnViewerEditor.TABBING_HORIZONTAL.bitwiseOr(
            ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR).bitwiseOr(
            ColumnViewerEditor.TABBING_VERTICAL).bitwiseOr(
            ColumnViewerEditor.KEYBOARD_ACTIVATION))
            
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
    private def void setStatusLineText(String value) {
        val bars = getViewSite().getActionBars();
        if(bars != null) {
            val statusLineManager = bars.getStatusLineManager()
            statusLineManager.setMessage(value);
        }
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
        val listener = new SimulationAdapter() {
            var DataPoolView dataPoolView
            
            /**
             * {@inheritDoc}
             */
            override update(SimulationEvent e) {
                dataPoolView = DataPoolView.instance
                if(dataPoolView == null) {
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
                PromUIPlugin.asyncExecInUI[
                    dataPoolView.setStatusLineText(e.message)    
                ]
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