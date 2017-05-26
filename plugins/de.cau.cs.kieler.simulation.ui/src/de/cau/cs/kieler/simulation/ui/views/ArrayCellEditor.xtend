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

import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.NDimensionalArrayElement
import de.cau.cs.kieler.simulation.core.Variable
import java.util.List
import org.eclipse.core.runtime.Assert
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.CellEditor
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.events.FocusAdapter
import org.eclipse.swt.events.FocusEvent
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import java.util.HashMap

/**
 * @author aas
 *
 */
class ArrayCellEditor extends CellEditor {
    
    var TableViewer viewer;
    
    var TableViewerColumn indexColumn
    var TableViewerColumn valueColumn
    
    var NDimensionalArray array
    
    var Composite parent
    
    var int alignment
    
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
        viewer.input = array.elements
        
        // Find good alignment base on position in parent input
        alignment = SWT.TOP
        val parentInput = control.getData("parentInput")
        if(parentInput != null) {
            val list = parentInput as List<Object>
            val variable = list.findFirst[it instanceof Variable
                                          && ((it as Variable).value == value
                                               || (it as Variable).userValue == value)]
            val pos = list.indexOf(variable)
            if(pos > 10) 
                alignment = SWT.BOTTOM
            else if(pos > 5)
                alignment = SWT.CENTER
        }
    }
    
    private def TableViewer createTable(Composite parent) {
        val style = getStyle().bitwiseOr(SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION).bitwiseOr(SWT.SHADOW_ETCHED_OUT))
        val table = new Table(parent, style)
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setSize(500,500)
        
        // Create viewer
        viewer = new TableViewer(table)
        
        // Create columns
        indexColumn = DataPoolView.createTableColumn(viewer, "Index", 60, true)
        indexColumn.labelProvider = new DataPoolViewerColumn() {
            override String getText(Object element) {
                if(element instanceof NDimensionalArrayElement) {
                    return element.index.map[it.toString].reduce[p1, p2| p1 +","+ p2]
                }
            }
        };
        valueColumn = DataPoolView.createTableColumn(viewer, "Value", 120, true)
        valueColumn.labelProvider = new DataPoolViewerColumn() {
            override String getText(Object element) {
                if(element instanceof NDimensionalArrayElement) {
                    return element.value.toString
                }
                return ""
            }
        };

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
        // Make cells editable
        valueColumn.editingSupport = new ValueColumnEditingSupport(viewer)
        
        return viewer
    }
}