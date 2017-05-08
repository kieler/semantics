/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.views

import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Variable
import java.util.List
import org.eclipse.jface.action.Action
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.part.ViewPart
import de.cau.cs.kieler.simulation.core.Model

/**
 * @author aas
 *
 */
class DataPoolView extends ViewPart {
    
    public static var DataPoolView instance
    
    var TableViewer viewer
    var Action dummyAction
    
    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
     override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
         
        // Create viewer.
        viewer = createDataPoolTable(parent);

        // Create menu and toolbars.
        createActions();
        createMenu();
        createToolbar();
    }
    
    override setFocus() {
    }
    
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
     * Create the actions of toolbars and menus.
     */
    public def void createActions() {
        dummyAction = new Action("Dummy Action") {
            override run() {
                println("dummy action")
            }
        }
    }
    
    /**
     * Create menu.
     */
    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
        mgr.add(dummyAction);
    }
    
    /**
     * Create toolbar.
     */
    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager();
        mgr.add(dummyAction);
    }
    
    private def TableViewer createDataPoolTable(Composite parent) {
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setLayoutData(new GridData(GridData.FILL_BOTH));

        // Create viewer
        val viewer = new TableViewer(table)
        
        // Create columns
        val checkColumn = createTableColumn(viewer, "Variable", 120)
        checkColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable)
                    return element.name
                else if(element instanceof Model) 
                    return "-----" + element.name + "-----"
            }
        };
        val nameColumn = createTableColumn(viewer, "Value", 80)
        nameColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable)
                    return element.value.toString
                else if(element instanceof Model) 
                    return "----------"
            }
        };
        val inputColumn = createTableColumn(viewer, "Input", 80)
        inputColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable)
                    return String.valueOf(element.isInput)
                else if(element instanceof Model) 
                    return "----------"
            }
        };
        val outputColumn = createTableColumn(viewer, "Output", 80)
        outputColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable)
                    return String.valueOf(element.isOutput)
                else if(element instanceof Model) 
                    return "----------"
            }
        };

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
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
        val viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
        val column = viewerColumn.getColumn()
        column.setText(title);
        column.setWidth(width);
        column.setResizable(true);
        column.setMoveable(false);
        return viewerColumn
    }
    
}