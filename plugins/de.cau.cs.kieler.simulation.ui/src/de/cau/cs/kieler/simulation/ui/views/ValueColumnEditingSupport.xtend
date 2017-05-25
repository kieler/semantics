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

import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.jface.viewers.CheckboxCellEditor
import org.eclipse.jface.viewers.EditingSupport
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TextCellEditor
import de.cau.cs.kieler.simulation.core.NDimensionalArrayElement
import de.cau.cs.kieler.simulation.core.NDimensionalArray

/**
 * @author aas
 *
 */
class ValueColumnEditingSupport extends EditingSupport {
    private var TableViewer viewer

    new(TableViewer viewer) {
        super(viewer);
        this.viewer = viewer;
    }
    
    override protected canEdit(Object element) {
        return true
    }
    
    override protected getCellEditor(Object element) {
        var Object value 
        if(element instanceof Variable) {
            value = element.value
        } else if(element instanceof NDimensionalArrayElement){
            value = element.value
        }
        if (value != null) {
            if(value instanceof String) {
                return new TextCellEditor(viewer.table)
            } else if(value instanceof Boolean) {
                return new CheckboxCellEditor(viewer.table)
            } else if(value instanceof Float
                      || value instanceof Double
                      || value instanceof Integer){
                return new TextCellEditor(viewer.table)
            } else if(value instanceof NDimensionalArray) {
                return new ArrayCellEditor(viewer.table)
            }
        }
        return null
    }
    
    override protected getValue(Object element) {
        var Object value  
        if(element instanceof Variable) {
            value = if(element.isDirty) element.userValue else element.value
        } else if(element instanceof NDimensionalArrayElement) {
            value = element.value
        }
        
        if(value != null) {
           if(value instanceof String) {
                return value
            } else if(value instanceof Boolean) {
                return value
            } else if(value instanceof Float
                      || value instanceof Double
                      || value instanceof Integer){
                return value.toString
            } else if(value instanceof NDimensionalArray) {
                return value
            }
        }
        return null 
    }
    
    override protected setValue(Object element, Object value) {
        try {
            if(element instanceof Variable){
                if(element.value instanceof Float) {
                    element.userValue = Float.valueOf(value.toString)    
                } else if(element.value instanceof Double) {
                    element.userValue = Double.valueOf(value.toString)    
                } else if(element.value instanceof Integer) {
                    element.userValue = Integer.valueOf(value.toString)
                } else {
                    element.userValue = value
                }
            } else if(element instanceof NDimensionalArrayElement) {
                if(element.value instanceof Float) {
                    element.value = Float.valueOf(value.toString)    
                } else if(element.value instanceof Double) {
                    element.value = Double.valueOf(value.toString)
                } else if(element.value instanceof Integer) {
                    element.value = Integer.valueOf(value.toString)
                } else {
                    element.value = value
                }
            }
//            println("New value:"+element.value)
        } catch (NumberFormatException e) {
            throw new Exception("Can't set value of "+element+ " to "+value, e)
        }
        viewer.update(element, null);
    }
}