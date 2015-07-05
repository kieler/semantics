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

import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.UIUtil
import java.util.ArrayList
import java.util.Set
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.TabFolder
import org.eclipse.swt.widgets.TabItem
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage
import de.cau.cs.kieler.sccharts.launchconfig.common.ExtensionLookupUtil
import org.eclipse.core.runtime.IConfigurationElement
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import org.eclipse.core.runtime.preferences.ConfigurationScope
import org.eclipse.jface.preference.PreferenceStore
import org.eclipse.jface.preference.IPreferenceStore
import java.util.Collection
import java.util.Collections

/**
 * @author aas
 * 
 */
class SCChartsEnvironmentsPage extends PreferencePage implements IWorkbenchPreferencePage {

    private var IWorkbench workbench
    private var IPreferenceStore store

    private var ListViewer list

    private var EnvironmentData currentData

    private var Text name
    
    private var ComboViewer targetLanguage
    private var Text targetFileExtension
    private var Text targetTemplate
    
    private var Text wrapperCodeTemplate
    private var Text wrapperCodeTarget
    private var Text wrapperCodeSnippets
    private var Text wrapperCodeSnippetsOrigin
    
    private var Text compileCommand
    private var Text deployCommand
    private var Text runCommand
    
    private var ComboViewer relatedProjectWizard
    private var Text mainFile
    private var Text mainFileOrigin

    override protected createContents(Composite parent) {
        val comp = new Composite(parent, SWT.NONE)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        createEnvironmentsComponent(comp)
        createTabFolder(comp)

        loadSettings()    

        return comp
    }

    override init(IWorkbench workbench) {
        this.workbench = workbench
        store = LaunchConfigPlugin.getDefault().preferenceStore
    }

    override performOk() {
        if(checkConsistency()){
            saveSettings()
            return true
        }
        return false
    }
    
    override performDefaults(){
        list.input = Initializer.getDefaultEnvironments()
        checkConsistency()
        super.performDefaults()
    }
    
    private def loadSettings(){
        list.input = EnvironmentData.loadAllFromPreferenceStore(store)
    }
    
    private def saveSettings(){
        val environments = list.input as ArrayList<EnvironmentData> 
        EnvironmentData.saveAllToPreferenceStore(store, environments)
    }
    
    private def boolean checkConsistency(){
        errorMessage = checkErrors()
        return errorMessage == null
    }

    private def checkErrors(){
        val environments = list.input as ArrayList<EnvironmentData>
        
        
        for(env : environments){
            // Unique names
            for(env2 : environments){
                if(env != env2&& env.name == env2.name){
                    return "Environment names must be unique."
                }    
            }
            
            // No empty name
            if(env.name == "")
                return "Environment name must not be empty."
            
            // No comma in a name
            if(env.name.contains(","))
                return "Environment names must not contain a comma."
                
            // Check that files exist
            
        }
        
        return null
    }

    private def createTabFolder(Composite parent) {
        val comp = UIUtil.createComposite(parent, 1, GridData.FILL_HORIZONTAL.bitwiseOr((GridData.FILL_VERTICAL)))

        // Create tab group
        val folder = new TabFolder(comp, SWT.NONE)
        folder.setLayout(new GridLayout())
        val gd = new GridData(GridData.FILL_BOTH)
        gd.heightHint = 300
        folder.setLayoutData(gd)
        
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
        val group = UIUtil.createGroup(parent, "Name", 1)
        
        name = UIUtil.createTextField(group, null, UIUtil.NONE)
        name.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null)
                    currentData.name = name.text
                    
                list.refresh()
                checkConsistency()
            }
        })
    }
    
    def createWizardComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project Wizard", 2)
        
        // ComboViewer
        val combo = new ComboViewer(group, SWT.DEFAULT)
        relatedProjectWizard = combo
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        val input = ExtensionLookupUtil.getWizardConfigurationElements(true)
        combo.input = input

        // Select first element as default 
        if (input != null && input.size > 0) {
            combo.selection = new StructuredSelection(input.get(0))
        }

        // Label provider
        combo.labelProvider = new LabelProvider() {
            override String getText(Object element) {
                val data = (element as IConfigurationElement)
                if (data != null)
                    return data.getAttribute("name")
                else
                    return ""
            }
        }
        
        // Selection event
        combo.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                if(currentData != null){
                    currentData.relatedProjectWizardClass = getSelectedProjectWizardClass()
                    checkConsistency()
               }
            }
        })
    }
    
    def createMainFileComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Main file", 2)
        
        mainFile = UIUtil.createTextField(group, "Main file", UIUtil.NONE)
        mainFile.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.mainFile = mainFile.text
                    checkConsistency()
                }
            }
        })
        
        UIUtil.createLabel(group, "Main file origin")
        val comp = UIUtil.createComposite(group, 2)
        
        mainFileOrigin = UIUtil.createTextField(comp, null, UIUtil.FILE_SYSTEM_FILE_BUTTON)
        mainFileOrigin.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.mainFileOrigin = mainFileOrigin.text
                    checkConsistency()    
                }
            }
        })
    }

    private def createSCTCompilationTab(TabFolder folder){
        val comp = createTab(folder, "SCT compilation")
        
        createCompilationComponent(comp)
        createWrapperCodeComponent(comp)
    }
    
    def createCompilationComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "SCT compilation", 2)
        
        SWTFactory.createLabel(group, "Language", 1)
        targetLanguage = UIUtil.createKiCoTargetsCombo(group)
        targetLanguage.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                if(currentData != null){
                    val selection = targetLanguage.selection as IStructuredSelection
                    if (selection != null) {
                        val trans = selection.firstElement as Transformation
                        if (trans != null) {
                            currentData.targetLanguage = trans.id
                            checkConsistency()
                        }
                    }
               }
            }
        })
        
        targetFileExtension = UIUtil.createTextField(group, "File Extension", UIUtil.NONE)
        targetFileExtension.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.targetFileExtension = targetFileExtension.text
                    checkConsistency()                    
                }
            }
        })
        
        targetTemplate =  UIUtil.createTextField(group, "Output template", UIUtil.NONE)
        targetTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.targetTemplate = targetTemplate.text
                    checkConsistency()    
                }
            }
        })
    }
    
    def createWrapperCodeComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Wrapper code generation", 2)
        
        wrapperCodeTemplate = UIUtil.createTextField(group, "Input file", UIUtil.NONE)
        wrapperCodeTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.wrapperCodeTemplate = wrapperCodeTemplate.text
                    checkConsistency()
                }
            }
        })
        
        wrapperCodeTarget = UIUtil.createTextField(group, "Output file", UIUtil.NONE)
        wrapperCodeTarget.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.wrapperCodeTarget = wrapperCodeTarget.text
                    checkConsistency()    
                }
            }
        })
        
        wrapperCodeSnippets = UIUtil.createTextField(group, "Snippets directory", UIUtil.NONE)
        wrapperCodeSnippets.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.wrapperCodeSnippetsDirectory = wrapperCodeSnippets.text
                    checkConsistency()
                }
            }
        })
        
        
        UIUtil.createLabel(group, "Snippets origin")
        val comp = UIUtil.createComposite(group, 2)
        
        wrapperCodeSnippetsOrigin = UIUtil.createTextField(comp, null, UIUtil.FILE_SYSTEM_DIRECTORY_BUTTON)
        wrapperCodeSnippetsOrigin.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.wrapperCodeSnippetsOrigin = wrapperCodeSnippetsOrigin.text
                    checkConsistency()    
                }
            }
        })
        
    }

    private def createExecuteTab(TabFolder folder){
        val comp = createTab(folder, "Execute")
        
        createExecuteComponent(comp)
    }
    
    def createExecuteComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Execution", 3)
        
        compileCommand = UIUtil.createTextField(group, "Compile command", UIUtil.VARIABLE_BUTTON)
        compileCommand.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.compileCommand = compileCommand.text
                    checkConsistency()    
                }
            }
        })
        
        deployCommand = UIUtil.createTextField(group, "Deploy command", UIUtil.VARIABLE_BUTTON)
        deployCommand.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.deployCommand = deployCommand.text
                    checkConsistency()    
                }
            }
        })
        
        runCommand = UIUtil.createTextField(group, "Run command", UIUtil.VARIABLE_BUTTON)
        runCommand.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.runCommand = runCommand.text
                    checkConsistency()    
                }
            }
        })
    }

    private def createEnvironmentsComponent(Composite parent) {
        val comp = UIUtil.createGroup(parent, "Environments", 2)

        // List
        list = new ListViewer(comp, SWT.DEFAULT)
        list.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Content provider
        list.setContentProvider(ArrayContentProvider.instance)
        list.input = new ArrayList<EnvironmentData>()
        
        // Label provider
        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as EnvironmentData)
                if (data != null)
                    return data.name
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
                checkConsistency()
            }
        })

        // Buttons
        val bcomp = UIUtil.createComposite(comp, 1, GridData.HORIZONTAL_ALIGN_END)
        val addButton = UIUtil.createButton(bcomp, "Add")
        addButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                val env = new EnvironmentData("New Environment")
                env.targetLanguage = getSelectedTargetLanguageId()
                
                // Get first project wizard in combo box
                val input = relatedProjectWizard.input as ArrayList<IConfigurationElement> 
                if(!input.isEmpty)
                    env.relatedProjectWizardClass = input.get(0).getAttribute("class")
                
                // Add environment to list
                val inputArray = (list.input as ArrayList<EnvironmentData>)
                inputArray.add(env)
                list.refresh()
                checkConsistency()
            }
        })
        val removeButton = UIUtil.createButton(bcomp, "Remove")
        removeButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                val inputArray = (list.input as ArrayList<EnvironmentData>)
                inputArray.remove(currentData)
                list.refresh()
                list.selection = new StructuredSelection()
                checkConsistency()
            }
        })
        
        // Up / Down
        val upButton =  UIUtil.createButton(bcomp, "Up")
        upButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                val inputArray = (list.input as ArrayList<EnvironmentData>)
                val index = inputArray.indexOf(currentData)
                if(index > 0){
                    Collections.swap(inputArray, index, index-1)
                    list.refresh()
                }
            }
        })
        
        val downButton =  UIUtil.createButton(bcomp, "Down")
        downButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                val inputArray = (list.input as ArrayList<EnvironmentData>)
                val index = inputArray.indexOf(currentData)
                if(index > -1 && index < inputArray.size-1){
                    Collections.swap(inputArray, index, index+1)
                    list.refresh()
                }
            }
        })
    }

    private def updateControls(EnvironmentData data) {
        if(data != null){
            name.text = data.name
            
            if (targetLanguage.input != null) {
                for (transformation : targetLanguage.input as Set<Transformation>) {
                    if (transformation.id == data.targetLanguage) {
                        targetLanguage.selection = new StructuredSelection(transformation)
                    }
                }
            }
            targetFileExtension.text = data.targetFileExtension
            targetTemplate.text = data.targetTemplate
            
            wrapperCodeTemplate.text = data.wrapperCodeTemplate
            wrapperCodeTarget.text = data.wrapperCodeTarget
            wrapperCodeSnippets.text = data.wrapperCodeSnippetsDirectory
            wrapperCodeSnippetsOrigin.text = data.wrapperCodeSnippetsOrigin
            
            compileCommand.text = data.compileCommand
            deployCommand.text = data.deployCommand
            runCommand.text = data.runCommand
            
            if (relatedProjectWizard.input != null) {
                for (obj : relatedProjectWizard.input as ArrayList<IConfigurationElement>) {
                    if (obj.getAttribute("class") == data.relatedProjectWizardClass) {
                        relatedProjectWizard.selection = new StructuredSelection(obj)
                    }
                }
            }
            
            mainFile.text = data.mainFile
            mainFileOrigin.text = data.mainFileOrigin
        }
    }
    
    private def getSelectedTargetLanguageId(){
        if (targetLanguage.input != null) {
            for (transformation : targetLanguage.input as Set<Transformation>) {
                return transformation.id
            }
        }
        return ""
    }
    
    private def getSelectedProjectWizardClass(){
        val selection = relatedProjectWizard.selection as IStructuredSelection
        if (selection != null) {
            val obj = selection.firstElement as IConfigurationElement
            if (obj != null) {
                return obj.getAttribute("class")
            }
        }
        return ""
    }
    
}