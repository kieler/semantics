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

import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.simulation.ui.SimulationUIPlugin
import java.util.List
import java.util.regex.PatternSyntaxException
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.MenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.viewers.Viewer
import org.eclipse.jface.viewers.ViewerFilter
import org.eclipse.swt.SWT
import org.eclipse.swt.events.DisposeEvent
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.layout.RowLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.widgets.Display

/**
 * Class that impelments the filter for the data pool view.
 * 
 * @author aas
 *
 */
class DataPoolFilter extends ViewerFilter {

    private var Text searchField
    private var Color searchFieldFg
    
    @Accessors
    private var Composite viewComposite
       
    private val propertyFilter = <String, Boolean>newHashMap

    // Menu
    private var IMenuManager filterMenu
    private var IAction searchEntry
    private var IAction inputEntry
    private var IAction outputEntry   
    private var IAction internalEntry
    private var IAction internalSelectAll
    private var IAction internalDeselectAll
    private var List<IAction> internalEntries = newArrayList
    
    
    new() {
        propertyFilter.put("input", true)
        propertyFilter.put("output", true)
        
        filterMenu = new MenuManager("Variable Filters")
        
        searchEntry = new Action("Toggle Search Filter", IAction.AS_PUSH_BUTTON){
            override run() {
                toggleSearch
            }
        }  
        filterMenu.add(searchEntry)
       
        filterMenu.add(new Separator)      
        
        inputEntry = new Action("Input", IAction.AS_CHECK_BOX){
            override run() {
                propertyFilter.put("input", checked)
                refreshTable
            }
        }
        inputEntry.checked = true
        filterMenu.add(inputEntry)
        
        outputEntry = new Action("Output", IAction.AS_CHECK_BOX){
            override run() {
                propertyFilter.put("output", checked)
                refreshTable
            }
        }
        outputEntry.checked = true
        filterMenu.add(outputEntry)
        
        internalEntry = new Action("Internal", IAction.AS_CHECK_BOX){
            override run() {
                for (action : internalEntries) {
                    action.enabled = checked
                    refreshTable
                }
            }
        }
        internalEntry.checked = false
        filterMenu.add(internalEntry)
        
        filterMenu.add(new Separator)
        
        internalSelectAll = new Action("Selecet All", IAction.AS_PUSH_BUTTON){
            override run() {
                for (internal : internalEntries) {
                    propertyFilter.put(internal.id, true)
                    internal.checked = true
                }
                refreshTable
            }
        }
        filterMenu.add(internalSelectAll)
        
        internalDeselectAll = new Action("Deselecet All", IAction.AS_PUSH_BUTTON){
            override run() {
                for (internal : internalEntries) {
                    propertyFilter.put(internal.id, false)
                    internal.checked = false
                }
                refreshTable
            }
        }  
        filterMenu.add(internalDeselectAll)
    }
    
    /**
     * Determines if an element should be visible in the data pool view.
     * Per default only inputs and outputs are shown,
     * except if internal variables should be shown as well. 
     * 
     * Only elements are visible that match the searchString.
     * 
     * @param viewer The viewer
     * @param parentElement the parentElement (in case of a tree viewer)
     * @param element The element of which the visibility is determined
     * @return true if the element should be shown in the view. false otherwise
     */
    override boolean select(Viewer viewer, Object parentElement, Object element) {
        if(element instanceof DataPoolEntry) {
            var boolean visible = if (internalEntry.checked) {
                element.combinedProperties.empty || element.combinedProperties.findFirst[propertyFilter.get(it.toLowerCase)?:false] !== null
            } else {
                element.input && inputEntry.checked || element.output && outputEntry.checked
            }
            
            // Filter with (regex) search term
            if(searchField !== null && !searchField.text.isNullOrEmpty) {
                var matches = true
                try {
                    matches = element.name.matches(".*("+searchField.text+").*")
                    searchField.foreground = searchFieldFg
                } catch (PatternSyntaxException e) {
                    val display = Display.getCurrent()
                    searchField.foreground = display.getSystemColor(SWT.COLOR_RED)
                }
                visible = visible && matches
            }
            return visible
        }
        return true
    }
    
    def addMenuContributions(IMenuManager manager) {
        manager.add(filterMenu)
    }
    
    def toggleSearch() {
        if (searchField === null) {
            val table = DataPoolView?.instance?.viewer?.table
            if (table !== null) {
                val container = new Composite(DataPoolView.instance.viewer.table, SWT.NONE)
                container.setLayout(new RowLayout())
    
                // cleanup on dispose
                container.addDisposeListener(new DisposeListener() {
        
                    override void widgetDisposed(DisposeEvent e) {
                        searchField?.dispose()
                    }
                })
                
                searchField = new Text(container, SWT.SINGLE.bitwiseOr(SWT.BORDER).bitwiseOr(SWT.SEARCH).bitwiseOr(SWT.ICON_SEARCH).bitwiseOr(SWT.ICON_CANCEL))
                searchField.text = "XXXXXXXXXXXXXXXXXXX"
                searchField.toolTipText = "Filter for Variable Names"
                searchFieldFg = searchField.foreground
            
                searchField.addModifyListener(new ModifyListener(){
                    override modifyText(ModifyEvent e) {
                        refreshTable
                    }
                })
                
                // update composite
                container.pack()
                container.layout(true, true)
                container.setLocation(table.size.x - container.size.x, 0)
                viewComposite.layout(true, true)
                searchField.text = ""
            }
        } else if (!searchField.isDisposed) {
            searchField.parent.dispose
            searchField = null
        }
    }
    
    def refreshTable() {
        if (DataPoolView.instance !== null) {
            DataPoolView.instance.viewer.refresh
        }
    }
    
    def updateMenu(SimulationContext context, SimulationControlEvent event) {
        if (context !== null && event instanceof SimulationControlEvent && (event as SimulationControlEvent).operation == SimulationOperation.START) {
            for (action : internalEntries) {
                filterMenu.remove(action.id)
            }
            internalEntries.clear
            
            val properties = context.dataPool.entries.entrySet.map[value.combinedProperties].flatten.filter[!"input".equals(it.toLowerCase) && !"output".equals(it.toLowerCase)].toSet
            for (property : properties) {
                val key = property.toLowerCase
                if (!propertyFilter.containsKey(key)) {
                    propertyFilter.put(key, true)
                }
                val action = new Action(property, IAction.AS_CHECK_BOX){
                    override run() {
                        propertyFilter.put(key, checked)
                        refreshTable
                    }
                }
                action.id = key
                action.checked = propertyFilter.get(key)?:true
                action.enabled = internalEntry.checked
                filterMenu.add(action)
                internalEntries += action
            }
        }
    }
    
}
