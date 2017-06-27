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
import de.cau.cs.kieler.prom.ui.console.PromConsole
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.SimulationEvent
import de.cau.cs.kieler.simulation.core.SimulationEventType
import de.cau.cs.kieler.simulation.core.SimulationListener
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import java.util.ArrayList
import java.util.List
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.Separator
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport
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

/**
 * @author aas
 *
 */
class DataPoolView extends ViewPart {
    
    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"
    
    public static var DataPoolView instance
    
    public static val simulationListener = createSimulationListener
    
    var TableViewer viewer
    
    var TableViewerColumn variableColumn
    var TableViewerColumn valueColumn
    var TableViewerColumn userValueColumn
    var TableViewerColumn historyColumn
    var TableViewerColumn inputColumn
    var TableViewerColumn outputColumn
    
    var TickInfoContribution tickInfo
    
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
        createMenu();
        createToolbar();

        // Add key listeners for fast controls
        addKeyListeners()
    }
    
    /**
     * {@inheritDoc}
     */
    override setFocus() {
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
            viewer.input = null
        } else {
            val List<Object> inputs = newArrayList()
            for(m : pool.models) {
                inputs += m
                for(v : m.variables) {
                    inputs += v
                }
            }
            viewer.input = inputs
        }
    }
    
    /**
     * Create menu.
     */
    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
        mgr.add(new ToggleColumnVisibleAction(historyColumn));
        mgr.add(new ToggleColumnVisibleAction(inputColumn));
        mgr.add(new ToggleColumnVisibleAction(outputColumn));
    }
    
    /**
     * Create toolbar.
     */
    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager();
        
        tickInfo = new TickInfoContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.tickInfo")
        mgr.add(tickInfo)
        mgr.add(new SimulationDelayContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.delay"))
        
        mgr.add(new Action("Reset All"){
            override run(){
                for(i : viewer.input as ArrayList<Object>) {
                    if(i instanceof Variable) {
                        val variable = i as Variable
                        variable.userValue = null
                    } 
                }
                // Refresh the viewer by applying "new" input
                viewer.input = viewer.input
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
                val dialog = new MessageDialog(viewer.control.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
    }
    
    private def void addKeyListeners() {
        // Step through simulation via ARROW_RIGHT.
        viewer.control.addKeyListener(new KeyAdapter() {
            override keyPressed(KeyEvent e) {
                val manager = SimulationManager.instance
                if(e.keyCode == SWT.ARROW_RIGHT) {
                    if(manager != null) {
                        PromConsole.print("Step macro tick")
                        manager.stepMacroTick()
                    }
                }
            }
        })
    }
    
    private def TableViewer createTable(Composite parent) {
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        // Create viewer
        val viewer = new TableViewer(table)
        // Support objects that are "equal" yet two different objects in memory.
        viewer.comparer = new IdentityComparer()
        
        // Create columns
        variableColumn = createTableColumn(viewer, "Variable", 120, true)
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
        valueColumn = createTableColumn(viewer, "Current Value", 100, true)
        valueColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                 if(element instanceof Variable) {
                    return element.value?.toString
                }
                return ""
            }
        };
        userValueColumn = createTableColumn(viewer, "User Value", 100, true)
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
        historyColumn = createTableColumn(viewer, "History", 200, true)
        historyColumn.labelProvider = new HistoryColumnLabelProvider()
        
        inputColumn = createTableColumn(viewer, "Is Input", 80, false)
        inputColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable)
                    return String.valueOf(element.isInput)
                return ""
            }
        };
        outputColumn = createTableColumn(viewer, "Is Output", 80, false)
        outputColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable)
                    return String.valueOf(element.isOutput)
                return ""
            }
        };

        // Fancy tooltips
        ColumnViewerToolTipSupport.enableFor(viewer)

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
        // Make cells editable
        userValueColumn.editingSupport = new ValueColumnEditingSupport(viewer)
        
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
    public static def TableViewerColumn createTableColumn(TableViewer viewer, String title, int width, boolean visible) {
        val viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
        val column = viewerColumn.getColumn()
        column.setText(title);
        column.setMoveable(true);
        
        if(visible) {
            column.width = width
            column.resizable = true
        } else {
            column.width = 0
            column.resizable = false
        }
        return viewerColumn
    }
    
    private def void updateStatusBar(SimulationEvent e) {
        val bars = getViewSite().getActionBars();
        if(bars != null) {
            val statusLineManager = bars.getStatusLineManager()
            var String txt = null
            if(e.type != SimulationEventType.STOP) {
                txt = "Tick #"+SimulationManager.instance.currentMacroTickNumber
                if(SimulationManager.instance.positionInHistory > 0) {
                    txt += " (-" + SimulationManager.instance.positionInHistory + ")"
                }
            }
            statusLineManager.setMessage(txt);
            tickInfo?.label?.setText(Strings.nullToEmpty(txt))
        }
    }
    
    private static def SimulationListener createSimulationListener() {
        val listener = new SimulationListener() {
            override update(SimulationEvent e) {
                // Execute in UI thread
                Display.getDefault().asyncExec(new Runnable() {
                    override void run() {
                        // Update status line
                        DataPoolView.instance?.updateStatusBar(e)
                        // Set pool data
                        DataPoolView.instance?.setDataPool(SimulationManager.instance?.currentPool)
                    }
                });
            }
        }
        return listener
    }
}