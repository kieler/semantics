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

import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.NDimensionalArrayElement
import de.cau.cs.kieler.simulation.core.Variable
import java.util.Collections
import java.util.List
import org.eclipse.core.runtime.Assert
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.CellEditor
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.events.FocusAdapter
import org.eclipse.swt.events.FocusEvent
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table

/**
 * @author aas
 *
 */
class ArrayCellEditor extends CellEditor {
    
    var TableViewer viewer;
    
    var TableViewerColumn indexColumn
    var TableViewerColumn valueColumn
    var TableViewerColumn userValueColumn
    var TableViewerColumn historyColumn
    
    var NDimensionalArray array
    
    var Composite parent
    
    var int alignment
    
    var Variable variable
    
    /**
     * Default ArrayCellEditor style
     */
    private static final int defaultStyle = SWT.NONE;
    
    /**
     * Creates a new array cell editor parented under the given control.
     *
     * @param parent the parent control
     * @param style the style bits
     */
    new(Composite parent, int style) {
        super(parent, style);
    }
    
    /**
     * Creates a new array cell editor parented under the given control.
     *
     * @param parent the parent control
     */
    new(Composite parent) {
        this(parent, defaultStyle);
    }
    
    override protected createControl(Composite parent) {
        this.parent = parent.parent
        viewer = createTable(parent)
        viewer.control.addFocusListener(new FocusAdapter() {
            override focusLost(FocusEvent e) {
                ArrayCellEditor.this.focusLost();
            }
        });
        
        return viewer.control
    }
    
    override getLayoutData() {
        val result = new LayoutData();
        if (control != null) {
            val preferredSize = control.computeSize(SWT.DEFAULT, SWT.DEFAULT, true)
            result.minimumWidth = preferredSize.x;
            val parentHeight = (parent.size.y*0.6f) as int
            result.minimumHeight = Math.min(preferredSize.y, parentHeight);
            
            result.verticalAlignment = alignment
        }
        return result
    }
    
    override protected doGetValue() {
        return array
    }
    
    override protected doSetFocus() {
        viewer.control.setFocus
    }
    
    override protected focusLost() {
        // Do nothing
    }
    
    override protected dependsOnExternalFocusListener() {
        return false
    }
    
    override protected doSetValue(Object value) {
        Assert.isTrue(value != null && (value instanceof NDimensionalArray))
        array = (value as NDimensionalArray).clone
        // Find the variable in the parent, that is changed by this cell editor 
        val parentInput = control.getData("parentInput")
        val parentInputList = parentInput as List<Object>
        if(parentInputList != null) {
            variable = parentInputList.findFirst[it instanceof Variable
                                       && ((it as Variable).value == value
                                           || (it as Variable).userValue == value)] as Variable
        }
        
        // Find good alignment based on position of the variable to be changed in parent input
        // (Variable at beginning of list -> top alignment,
        // at end of list -> bottom alignment,
        // in middle of list -> center alignment)
        alignment = SWT.TOP
        if(variable != null && !parentInputList.isNullOrEmpty) {
            val pos = parentInputList.indexOf(variable)
            if(pos > 10) 
                alignment = SWT.BOTTOM
            else if(pos > 5)
                alignment = SWT.CENTER
        }

        // Set input        
        viewer.input = array.elements
    }
    
    private def TableViewer createTable(Composite parent) {
        val style = getStyle().bitwiseOr(SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        val table = new Table(parent, style)
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setSize(500,500)
        
        // Create viewer
        viewer = new TableViewer(table)
        
        // Create columns
        indexColumn = DataPoolView.createTableColumn(viewer, "Index", 50, true)
        indexColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof NDimensionalArrayElement) {
                    // Combine all indices into one string separated with comma
                    val indexCSV = element.index.map[it.toString].reduce[p1, p2| p1 +","+ p2] 
                    if(element.isDirty) {
                        return "*" + indexCSV    
                    } else {
                        return indexCSV
                    }
                }
            }
        };
        valueColumn = DataPoolView.createTableColumn(viewer, "Current Value", 100, true)
        valueColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof NDimensionalArrayElement) {
                    return element.value?.toString
                }
                return ""
            }
        };
        userValueColumn = DataPoolView.createTableColumn(viewer, "User Value", 100, true)
        userValueColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof NDimensionalArrayElement) {
                    if(element.isDirty) {
                        return element.userValue.toString
                    }
                }
                return ""
            }
        };
        historyColumn = DataPoolView.createTableColumn(viewer, "History", 200, true)
        historyColumn.labelProvider = new HistoryColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof NDimensionalArrayElement) {
                    val history = element.getArrayElementHistory
                    return createHistoryText(history)
                }
                return ""
            }
            
            override Image getToolTipImage(Object element) {
                if(img != null) {
                    img.dispose()
                    img = null
                }
                if(element instanceof NDimensionalArrayElement) {
                    val history = element.getArrayElementHistory
                    img = createHistoryGraph(history)
                }
                return img
            }
            
            private def List<Object> getArrayElementHistory(NDimensionalArrayElement element) {
                if(variable != null) {
                    val history = variable.history
                    if(!history.isNullOrEmpty) {
                        val index = element.index
                        val historyOfThisElement = history.map[(it.value as NDimensionalArray).get(index)]
                        return historyOfThisElement
                    }
                }
                return Collections.EMPTY_LIST
            }
        };
        
        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
        // Make cells editable
        userValueColumn.editingSupport = new ValueColumnEditingSupport(viewer)
        
        return viewer
    }
}