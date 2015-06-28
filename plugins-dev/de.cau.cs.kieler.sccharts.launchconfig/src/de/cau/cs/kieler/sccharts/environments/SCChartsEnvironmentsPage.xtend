/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.environments

import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.SCTCompilationData
import de.cau.cs.kieler.sccharts.launchconfig.common.UIUtil
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.TabFolder
import org.eclipse.swt.widgets.TabItem
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage

/**
 * @author aas
 * 
 */
class SCChartsEnvironmentsPage extends PreferencePage implements IWorkbenchPreferencePage {

    private IWorkbench workbench

    private var ListViewer list

    private var EnvironmentData currentData

    override protected createContents(Composite parent) {
        val comp = new Composite(parent, SWT.NONE)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        createEnvironmentsComponent(comp)
        createTabFolder(comp)

        return comp
    }

    override init(IWorkbench workbench) {
        this.workbench = workbench
    }

    override performApply() {
        println("Applying stuff...")
        errorMessage = "Alles Käse!"
    }

    private def createTabFolder(Composite parent) {
        val comp = UIUtil.createComposite(parent, 1, GridData.FILL_HORIZONTAL.bitwiseOr((GridData.FILL_VERTICAL)))

        // Create tab group
        val folder = new TabFolder(comp, SWT.NONE)
        folder.setLayout(new GridLayout())
        folder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true))

        // Create tabs
        createGeneralTab(folder)
        createSCTCompilationTab(folder)
        createExecuteTab(folder)
    }
    
    private def createTab(TabFolder folder, String title){
        val tab = new TabItem(folder, SWT.NONE)
        tab.setText(title)

        val comp = new Composite(folder, SWT.NONE)
        comp.setLayout(new GridLayout())
        comp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true))
        tab.control = comp
        
        return comp
    }

    private def createGeneralTab(TabFolder folder){
        val comp = createTab(folder, "General")
        
        createNameComponent(comp)
        createWizardComponent(comp)
        createMainFileComponent(comp)
    }
    
    private def createNameComponent(Composite parent){
        
    }
    
    def createWizardComponent(Composite parent) {
    }
    
    def createMainFileComponent(Composite parent) {
    }

    private def createSCTCompilationTab(TabFolder folder){
        val comp = createTab(folder, "SCT compilation")
        
        createCompilationComponent(comp)
        createWrapperCodeComponent(comp)
    }
    
    def createCompilationComponent(Composite parent) {
    }
    
    def createWrapperCodeComponent(Composite parent) {
    }

    private def createExecuteTab(TabFolder folder){
        val comp = createTab(folder, "Execute")
        
        createExecuteComponent(comp)
    }
    
    def createExecuteComponent(Composite parent) {
    }

    private def createEnvironmentsComponent(Composite parent) {
        val comp = UIUtil.createGroup(parent, "Environments", 2)

        // List for SCT files
        list = new ListViewer(comp, SWT.DEFAULT)
        list.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Content provider
        list.setContentProvider(ArrayContentProvider.instance)

        // Label provider
        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as SCTCompilationData)
                if (data != null)
                    return data.projectRelativePath
                else
                    return ""
            }
        })

        // Selection event
        // Updates the currentData reference.
        list.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                currentData = selection.firstElement as EnvironmentData
                updateControls(currentData)
            }
        })

        // Buttons
        val bcomp = UIUtil.createComposite(comp, 1, GridData.HORIZONTAL_ALIGN_END)
        val addButton = SWTFactory.createPushButton(bcomp, "Add", null)
        val removeButton = SWTFactory.createPushButton(bcomp, "Remove", null)
    }

    private def updateControls(EnvironmentData data) {
    }
}