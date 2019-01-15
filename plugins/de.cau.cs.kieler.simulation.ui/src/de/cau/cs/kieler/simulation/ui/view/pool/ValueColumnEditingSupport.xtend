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
import com.google.gson.JsonParseException
import com.google.gson.JsonParser
import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.ui.SimulationUIPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.viewers.CheckboxCellEditor
import org.eclipse.jface.viewers.EditingSupport
import org.eclipse.jface.viewers.ICellEditorValidator
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TextCellEditor
import org.eclipse.ui.statushandlers.StatusManager

/**
 * Editing support for Variables and NDimensionalArrayElements.
 * Depending on the type of the value of the variable, a cell editor is choosen.
 * 
 * @author aas
 *
 */
class ValueColumnEditingSupport extends EditingSupport implements ICellEditorValidator {
    
    extension JsonParser = new JsonParser
    
    /**
     * The viewer
     */
    private var TableViewer viewer
    
    /**
     * The view
     */
    private val DataPoolView view
    
    /**
     * Constructor
     * 
     * @param viewer The viewer
     */
    new(TableViewer viewer, DataPoolView view) {
        super(viewer);
        this.viewer = viewer;
        this.view = view
    }
    
    /**
     * {@inheritDoc}
     */
    override protected canEdit(Object element) {
        return true
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getCellEditor(Object element) {
        if (element instanceof DataPoolEntry) {
            if (element.rawValue.isJsonPrimitive && element.rawValue.asJsonPrimitive.isBoolean) {
                return new CheckboxCellEditor(viewer.table)
            } else {
                val editor = new TextCellEditor(viewer.table) {
                    
                    override protected valueChanged(boolean oldValidState, boolean newValidState) {
                        if (newValidState) {
                            element.parseAndStoreValue(this.value)
                        }
                    }
                    
                }
                editor.validator = this;
                return editor
            }
        }
        
        return null
    }
    
    /**
     * Returns the value of the element that should be edited in the cell editor.
     * If the element is dirty, then the user value is returned.
     * 
     * @return the value that should be edited in the cell editor
     */
    override protected getValue(Object element) {
        if (element instanceof DataPoolEntry) {
            if (element.rawValue.isJsonPrimitive && element.rawValue.asJsonPrimitive.isBoolean) {
                if (view.hasUserValue(element)) {
                    return view.userValues.get(element.name).asBoolean
                } else {
                    return element.rawValue.asBoolean
                }
            } else {
                if (view.hasUserValue(element)) {
                    return view.userValues.get(element.name).toString
                } else {
                    return element.rawValue.toString
                }
            }
        }

        return null
    }
    
    /**
     * Applies a new value to the element.
     * 
     * @param element The element that is edited
     * @param value The new value
     */
    override protected setValue(Object element, Object value) {
        if (element instanceof DataPoolEntry) {
            element.parseAndStoreValue(value)
        }

        // Update this element
        viewer.refresh(element)
    }
    
    private def parseAndStoreValue(DataPoolEntry entry, Object value) {
        var JsonElement json
        try {
            json = value.toString.parse
        } catch (Exception e) {
            StatusManager.getManager().handle(new Status(IStatus.ERROR,
                SimulationUIPlugin.PLUGIN_ID, "Error parsing user value.\nInvalid JSON.", e), StatusManager.SHOW)
        }
        if (json !== null) {
            view.userValues.put(entry.name, json)
        }
    }
    
    override isValid(Object value) {
        if (value !== null) {
            try {
                value.toString.parse
            } catch (JsonParseException e) {
                return e.message
            }
        }
        return null
    }
    
}
