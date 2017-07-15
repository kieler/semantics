/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.simulation.ui.launch

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.ui.UIUtil
import de.cau.cs.kieler.simulation.launch.SimulationLaunchConfig
import java.util.List
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.EditingSupport
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TextCellEditor
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.jface.viewers.ArrayContentProvider

class SimulationMainTab  extends AbstractLaunchConfigurationTab {
    
    private var List<String> files = newArrayList
    private var TableViewer viewer
    
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new GridLayout(2, false))
        comp.setFont(parent.getFont())
        
        createTable(comp)
        createButtons(comp)
    }
    
    private def void createButtons(Composite parent) {
        val group = new Composite(parent, SWT.NONE)
        group.setLayout(new GridLayout(1, true))
        
        val addButton = new Button(group, SWT.PUSH)
        addButton.text = "Add File"
        addButton.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                files.add("/PROJECT_NAME/FILE_PATH")
                viewer.refresh
            }
        })
        
        val removeButton = new Button(group, SWT.PUSH)
        removeButton.text = "Remove"
        removeButton.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                val sel = viewer.structuredSelection
                if(sel != null && sel.firstElement != null) {
                    files.remove(sel.firstElement)
                    viewer.refresh
                }
            }
        })
    }
    
    private def void createTable(Composite parent) {
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setLayoutData(new GridData(GridData.FILL_BOTH))

        // Create viewer
        viewer = new TableViewer(table)
        viewer.contentProvider = ArrayContentProvider.instance
        
        // Create columns
        val fileColumn = UIUtil.createTableColumn(viewer, "File", 200)
        fileColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                return element.toString;
            }
        };
        
        // Add editing support
        fileColumn.editingSupport = new EditingSupport(viewer) {
            override protected canEdit(Object element) {
                return true
            }
            
            override protected getCellEditor(Object element) {
                return new TextCellEditor(viewer.table)
            }
            
            override protected getValue(Object element) {
                return element as String
            }
            
            override protected setValue(Object element, Object value) {
                val oldIndex = files.indexOf(element as String)
                if(oldIndex > -1) {
                    files.remove(oldIndex)
                    files.add(oldIndex, value as String)
                    viewer.refresh
                    updateLaunchConfigurationDialog
                }
            }
        }
        
        // Set input
        viewer.input = files
    }
    
    override getName() {
        return "Main"
    }
    
    override initializeFrom(ILaunchConfiguration configuration) {
        files.clear
        val filePaths = configuration.getAttribute(SimulationLaunchConfig.FILES_ATTR, #[])
        for(file : filePaths) {
            files.add(file)
        }
        viewer.refresh
    }
    
    override performApply(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(SimulationLaunchConfig.FILES_ATTR, files)
        // Check the user input for consistency
        checkConsistency()
    }
    
    override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }
    
    /**
     * Checks if the current input makes sense and set an error message accordingly.
     * 
     * @return true if the input is valid. false otherwise
     */
    private def boolean checkConsistency() {
        errorMessage = checkErrors() 
        return errorMessage == null
    }
    
    /**
     * Checks if the current input makes sense and returns an error message accordingly.
     * @return an appropriate error message or null if there is no error. 
     */
    private def String checkErrors() {
        // All files must exist in the workspace
        for(filePath : files) {
            val file = PromPlugin.findFile(filePath)
            if(file == null) {
                return "File '"+filePath+"' does not exist in the workspace.\nPlease provide the full path of the file (e.g. /PROJECT/FOLDER/FILE.txt)"
            }
        }
        return null
    }
}