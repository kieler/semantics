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
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import de.cau.cs.kieler.sccharts.launchconfig.common.CommandData
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.ExtensionLookupUtil
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Set
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.TabFolder
import org.eclipse.swt.widgets.TabItem
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage

/**
 * Implementation of the preferences page for SCCharts environments.
 * Contains controls to create,remove,update and show the environments in the plugin's preference store.  
 * 
 * @author aas
 * 
 */
class EnvironmentsPage extends PreferencePage implements IWorkbenchPreferencePage {

    /**
     * The workbench set in the init(...) method.
     */
    private var IWorkbench workbench
    
    /**
     * The preferences store which contains the SCCharts environments.
     * This is the plugin's preference store.
     */
    private var IPreferenceStore store

    /**
     * The list control to show the environments.
     */
    private var ListViewer list

    /**
     * The currently selected EnvironmentData of the list
     * or null if there is no environment selected.
     */
    private var EnvironmentData currentData

    /**
     * The tab folder which contains the tabs with
     * the controls to modify the values of the selected environment.
     */
    private var TabFolder tabFolder

    /**
     * The input field for the environment name.
     */
    private var Text name
    
    /**
     * The combobox to choose the selected target language.
     * It is filled with the target features supported by KiCo.
     */
    private var ComboViewer targetLanguage
    /**
     * The input field for the file extension
     * of the selected target language (e.g. '.java' for Java Code).
     */
    private var Text targetFileExtension
    /**
     * The input field for an optional template used when saving the KiCo compiled output.
     */
    private var Text targetTemplate
    
    /**
     * The input field for the wrapper code template.
     * The wrapper code will be inserted in this template (e.g. a project's main file).
     */
    private var Text wrapperCodeTemplate
    /**
     * The input field for the directory which contains the wrapper code snippet definitions.
     */
    private var Text wrapperCodeSnippets
    /**
     * The input field for a directory which contains the inital data of the wrapper code snippet directory when creating a new project.
     * This might either be a file system path or a URL with the platform protocol provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/directory/with/snippets').
     */
    private var Text wrapperCodeSnippetsOrigin
    
    
    CommandData currentCommandData
    
    TableViewer viewer
    
    Text commandName
    
    Text command
    
    /**
     * The combobox with the related project wizard class name of the environment.
     * The combobox is filled with the extensions of 'org.eclipse.ui.newWizards' that create projects.
     */
    private var ComboViewer relatedProjectWizard
    /**
     * The input field for the default main file of the environment.
     */
    private var Text mainFile
    /**
     * The input field for a path to the file which contains the default contents
     * of a newly created main file of the environment.
     */
    private var Text mainFileOrigin

    /**
     * {@inheritDoc}
     */
    override protected createContents(Composite parent) {
        val comp = new Composite(parent, SWT.NONE)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        createEnvironmentsComponent(comp)
        createTabFolder(comp)

        loadSettings()    

        updateEnabled()

        return comp
    }

    /**
     * Creates the tab folder and tabs with the controls
     * to show and modify the data of the currently selected environment.
     */
    private def createTabFolder(Composite parent) {
        val comp = UIUtil.createComposite(parent, 1, GridData.FILL_HORIZONTAL.bitwiseOr((GridData.FILL_VERTICAL)))

        // Create tab group
        tabFolder = new TabFolder(comp, SWT.NONE)
        tabFolder.setLayout(new GridLayout())
        val gd = new GridData(GridData.FILL_BOTH)
        // Without this height hint the tab folder sets its height to the sum of the heights of all pages.
        // This is to much. A better value would be correct the maximum of the heights of all pages.
        gd.heightHint = 300
        tabFolder.setLayoutData(gd)
        
        // Create tabs
        createGeneralTab(tabFolder)
        createSCTCompilationTab(tabFolder)
        createExecuteTab(tabFolder)
    }
    
    /**
     * Creates a tab in the tab folder with the given title.
     * @return A composite which should contain the widgets of the tab. 
     */
    private def createTab(TabFolder folder, String title){
        val tab = new TabItem(folder, SWT.NONE)
        tab.setText(title)

        val comp = new Composite(folder, SWT.NONE)
        comp.setLayout(new GridLayout())
        tab.control = comp
        
        return comp
    }

    /**
     * Creates the tab with the controls of the general settings of the current environment.  
     */
    private def createGeneralTab(TabFolder folder){
        val comp = createTab(folder, "General")
        
        createNameComponent(comp)
        createWizardComponent(comp)
        createMainFileComponent(comp)
    }
    
    /**
     * Creates the controls for the name of the current environment.
     */
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
    
    /**
     * Creates the controls for the related project wizard of the current environment.
     */
    def createWizardComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project wizard", 2)
        
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
    
    /**
     * Creates the controls for the main file of the current environment.
     */
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

    /**
     * Creates the tab with the controls to set the environment's fields regarding the compilation of sct files.
     */
    private def createSCTCompilationTab(TabFolder folder){
        val comp = createTab(folder, "SCT Compilation")
        
        createCompilationComponent(comp)
        createWrapperCodeComponent(comp)
    }

    /**
     * Creates the controls to set the target language, file extension and template.
     */
    def createCompilationComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Compilation", 2)
        
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
        
        targetFileExtension = UIUtil.createTextField(group, "File extension", UIUtil.NONE)
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
    
    /**
     * Creates the input controls for wrapper code generation.
     */
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

    /**
     * Creates the execute tab.
     */
    private def createExecuteTab(TabFolder folder){
        val comp = createTab(folder, "Execute")
        
        createCommandTableComponent(comp)
        createCommandNameComponent(comp)
        createCommandComponent(comp)
    }
    
    /**
     * Creates the controls to set the compile, deploy and run commands.
     */
    def createCommandTableComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Commands", 2)
        
        // Viewer
        viewer = UIUtil.createCommandTable(group, false)
        viewer.addSelectionChangedListener(new ISelectionChangedListener(){
            
            override selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                if(selection != null){
                    currentCommandData = selection.firstElement as CommandData
                    
                    if(currentCommandData != null) {
                        commandName.text = currentCommandData.name
                        command.text = currentCommandData.command
                    }
                } else {
                    currentCommandData = null
                }
            }
        })
        
        // Buttons
        val bcomp = UIUtil.createComposite(group, 1)
        
        // Add Button
        val addButton = UIUtil.createButton(bcomp, "Add")
        addButton.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                val comm = new CommandData("New Command", 'echo "hello world"')
                val inputArray = viewer.input as ArrayList<CommandData>
                inputArray.add(comm)
                viewer.refresh()
                viewer.selection = new StructuredSelection(comm)
            }
        })
        
        // Remove Button
        UIUtil.createRemoveButton(bcomp, viewer)
        
        // Up Button
        UIUtil.createUpButton(bcomp, viewer)
        
        // Down Button
        UIUtil.createDownButton(bcomp, viewer)
    }
    
    private def createCommandNameComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Name", 1)
        
        commandName = UIUtil.createTextField(group, null, UIUtil.NONE)
        commandName.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(commandName != null){
                    currentCommandData.name = commandName.text
                    viewer.refresh()   
                }
            }
        })
    }
    
    private def createCommandComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Command", 2)
        
        // Text
        command = UIUtil.createTextField(group, null, 0)
        command.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(command != null){
                    currentCommandData.command = command.text
                    viewer.refresh()
                }
            }
        })
        
        UIUtil.createBrowseVariableButton(group, commandName, "Variables...")
    }
    
    /**
     * Creates the list with environments and buttons to modify the list. 
     */
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
                updateEnabled()
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

    /**
     * Updates the value of all controls with the values from the environment.
     */
    private def updateControls(EnvironmentData data) {
        if(data != null){
            // Name
            name.text = data.name
            
            // Related project wizard
            if (relatedProjectWizard.input != null) {
                for (obj : relatedProjectWizard.input as ArrayList<IConfigurationElement>) {
                    if (obj.getAttribute("class") == data.relatedProjectWizardClass) {
                        relatedProjectWizard.selection = new StructuredSelection(obj)
                    }
                }
            }
            
            // Main file
            mainFile.text = data.mainFile
            mainFileOrigin.text = data.mainFileOrigin
            
            // Target
            if (targetLanguage.input != null) {
                for (transformation : targetLanguage.input as Set<Transformation>) {
                    if (transformation.id == data.targetLanguage) {
                        targetLanguage.selection = new StructuredSelection(transformation)
                    }
                }
            }
            targetFileExtension.text = data.targetFileExtension
            targetTemplate.text = data.targetTemplate
            
            // Wrapper code
            wrapperCodeTemplate.text = data.wrapperCodeTemplate
            wrapperCodeSnippets.text = data.wrapperCodeSnippetsDirectory
            wrapperCodeSnippetsOrigin.text = data.wrapperCodeSnippetsOrigin
            
            // Commands
            viewer.input = data.commands
        }
    }
    
    /**
     * @return The target language id from the KiCo transformation
     * which is currently selected in the target language combobox.
     */
    private def getSelectedTargetLanguageId(){
        if (targetLanguage.input != null) {
            for (transformation : targetLanguage.input as Set<Transformation>) {
                return transformation.id
            }
        }
        return ""
    }
    
    /**
     * @return The class name of the extension point configuration
     * which is currently selected in the related project wizard combobox.  
     */
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
    
    /**
     * Implementation of IWorkbenchPreferencePage.
     * Saves the reference to the workbench and the used preference store.
     */
    override init(IWorkbench workbench) {
        this.workbench = workbench
        store = LaunchConfigPlugin.getDefault().preferenceStore
    }

    /**
     * Checks the user input for consistency and saves it if applicable.
     * The method is executed when the OK or Apply button is clicked.
     * 
     * @return true if the input is valid and the dialog may be closed by eclipse.<br />
     *         false otherwise.
     */
    override performOk() {
        if(checkConsistency()){
            saveSettings()
            return true
        }
        return false
    }
    
    /**
     * Reverts the preferences values to the default values from the initializer.
     * The method is run if the 'Restore Defaults' button is clicked.
     */
    override performDefaults(){
        list.input = Initializer.getDefaultEnvironments()
        checkConsistency()
        super.performDefaults()
    }
    
    /**
     * Loads the relevant data for this page from the preference store. 
     */
    private def loadSettings(){
        if(EnvironmentData.isPreferencesStoreEmpty(store))
            list.input = Initializer.defaultEnvironments
        else
            list.input = EnvironmentData.loadAllFromPreferenceStore(store)
    }
    
    /**
     * Saves the relevant data from this page from the preference store. 
     */
    private def saveSettings(){
        val environments = list.input as ArrayList<EnvironmentData> 
        EnvironmentData.saveAllToPreferenceStore(store, environments)
    }
    
    /**
     * Checks the input for consistency and sets an error message if necessary.
     * @return true if the input is valid.<br />
     *         false otherwise. 
     */
    private def boolean checkConsistency(){
        errorMessage = checkErrors()
        return errorMessage == null
    }

    /**
     * Checks the input for consistency and returns an appropriate error message.
     * @return A string with an error message or null if the input is valid.
     */
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
    
    /**
     * Enables the controls of the tab folder if an environment is selected.
     * Disables the controls otherwise.
     */
    private def updateEnabled(){
        val controls = tabFolder.tabList
        for(control : controls)
            UIUtil.enableControls(controls, currentData != null)
    }
}