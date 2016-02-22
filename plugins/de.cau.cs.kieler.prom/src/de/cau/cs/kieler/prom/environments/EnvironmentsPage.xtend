/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.environments

import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.prom.common.CommandData
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.ui.UIUtil
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.util.ArrayList
import java.util.EnumSet
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
 * Implementation of the preferences page for environments.
 * Contains controls to create, remove, update and show the environments in the plugin's preference store.
 * Environments contain defaults to create, initialize and launch a project.  
 * 
 * @author aas
 */
class EnvironmentsPage extends PreferencePage implements IWorkbenchPreferencePage {

    /**
     * The workbench from the init(...) method.
     */
    private var IWorkbench workbench
    
    /**
     * The preferences store which contains the environments.
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
     * The input field for a directory which contains the inital data
     * of the wrapper code snippet directory when creating a new project.
     * This might either be a file system path or a URL with the platform protocol provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/directory/with/snippets').
     */
    private var Text wrapperCodeSnippetsOrigin
    
    
    /**
     * The control to display all shell commands for the currently selected environment.
     */
    private TableViewer viewer
    /**
     * The currently selected command from the table viewer or null if there is no selection.
     */
    private CommandData currentCommandData
    /**
     * The input field for the name of the currently selected command.
     */
    private Text commandName
    /**
     * The input field for the shell command to be executed.
     */
    private Text command
    
    /**
     * Combobox with all available launch shortcuts.
     */
    private var ComboViewer launchShortcuts
    
    
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
     * of a newly created main file.
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
     * 
     * @param parent The parent composite
     */
    private def void createTabFolder(Composite parent) {
        val comp = UIUtil.createComposite(parent, 1, GridData.FILL_HORIZONTAL.bitwiseOr((GridData.FILL_VERTICAL)))

        // Create tab group
        tabFolder = new TabFolder(comp, SWT.NONE)
        tabFolder.setLayout(new GridLayout())
        val gd = new GridData(GridData.FILL_BOTH)
        // Without this height hint the tab folder sets its height to the sum of the heights of all pages.
        // This is to much. A better value would be the maximum of the heights of all pages.
        gd.heightHint = 380
        tabFolder.setLayoutData(gd)
        
        // Create tabs
        createGeneralTab(tabFolder)
        createCompilationTab(tabFolder)
        createExecuteTab(tabFolder)
    }
    
    /**
     * Creates a tab in the tab folder with the given title.
     * 
     * @param folder The TabFolder to add a tab to
     * @param title The title for the new tab
     * @return A composite which should contain the widgets of the tab. 
     */
    private def Composite createTab(TabFolder folder, String title){
        val tab = new TabItem(folder, SWT.NONE)
        tab.setText(title)

        val comp = new Composite(folder, SWT.NONE)
        comp.setLayout(new GridLayout())
        tab.control = comp
        
        return comp
    }

    /**
     * Creates the tab with the controls of the general settings of the current environment.
     * 
     * @param folder The TabFolder where the tab will be added to  
     */
    private def Composite createGeneralTab(TabFolder folder){
        val comp = createTab(folder, "General")
        
        createNameComponent(comp)
        createWizardComponent(comp)
        createMainFileComponent(comp)
        
        return comp
    }
    
    /**
     * Creates the controls for the name of the current environment.
     */
    private def void createNameComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Name", 1)
        
        name = UIUtil.createTextField(group, null, EnumSet.of(UIUtil.Buttons.NONE))
        name.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null)
                    currentData.name = name.text
                    
                list.refresh()
                checkConsistency()
            }
        })
        name.toolTipText = "Unique name of the environment"
    }
    
    /**
     * Creates the controls for the related project wizard of the current environment.
     */
    private def void createWizardComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project wizard", 2)
        
        // Create ComboViewer
        val combo = new ComboViewer(group, SWT.DEFAULT)
        relatedProjectWizard = combo
        relatedProjectWizard.combo.toolTipText = "Project wizard to run when creating a new project"
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        val input = ExtensionLookupUtil.getWizardConfigurationElements(true)
        combo.input = input

//        Debug log, which wizards are currently installed 
//        for (e : ExtensionLookupUtil.getWizardConfigurationElements(true)){
//            System.err.println(e.getAttribute("class"))
//        }
        
        // Select first element as default 
        if (input != null && input.size > 0) {
            combo.selection = new StructuredSelection(input.get(0))
        }

        // Create label provider
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
                    currentData.relatedProjectWizardClass = getSelectedClassNameInCombobox(relatedProjectWizard)
                    checkConsistency()
               }
            }
        })
        
    }
    
    /**
     * Creates the controls for the main file of the current environment.
     */
    private def void createMainFileComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Main file", 2)
        
        // Create main file text field
        mainFile = UIUtil.createTextField(group, "Main file", EnumSet.of(UIUtil.Buttons.NONE))
        mainFile.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.mainFile = mainFile.text
                    checkConsistency()
                }
            }
        })
        mainFile.toolTipText = "Project relative path to main file of the project.\n"
            + "The file is created on project setup.\n"
            + "The path may contain placeholders such as ${project_name}."
        
        // Create main file origin text field
        UIUtil.createLabel(group, "Main file origin")
        val comp = UIUtil.createComposite(group, 2)
        
        mainFileOrigin = UIUtil.createTextField(comp, null, EnumSet.of(UIUtil.Buttons.FILE_SYSTEM_FILE_BUTTON))
        mainFileOrigin.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.mainFileOrigin = mainFileOrigin.text
                    checkConsistency()    
                }
            }
        })
        mainFileOrigin.toolTipText = "Absolute path to resource (file system or platform) with default content for main file"
    }

    /**
     * Creates the tab with the controls to set the environment's fields regarding the compilation of files.
     * 
     * @param folder The TabFolder where the tab will be added to
     */
    private def Composite createCompilationTab(TabFolder folder){
        val comp = createTab(folder, "Compilation")
        
        createCompilationComponent(comp)
        createWrapperCodeComponent(comp)
        
        return comp
    }

    /**
     * Creates the controls to set the target language, file extension and template.
     * 
     * @param parent The parent composite
     */
    private def void createCompilationComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Compilation", 2)
        
        // Create language control
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
        targetLanguage.combo.toolTipText = "Target transformation of the KIELER Compiler"
        
        // Create file extension control
        targetFileExtension = UIUtil.createTextField(group, "File extension", EnumSet.of(UIUtil.Buttons.NONE))
        targetFileExtension.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.targetFileExtension = targetFileExtension.text
                    checkConsistency()                    
                }
            }
        })
        targetFileExtension.toolTipText = "File extension for the target language (e.g. '.java' for Java)"
        
        // Create template control
        targetTemplate =  UIUtil.createTextField(group, "Output template", EnumSet.of(UIUtil.Buttons.NONE))
        targetTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.targetTemplate = targetTemplate.text
                    checkConsistency()    
                }
            }
        })
        targetTemplate.toolTipText = "Path to a template file for the compiled output.\n"
        + "Use ${" + LaunchConfiguration.COMPILED_CODE_PLACEHOLDER + "} in the template file as placeholder."
    }
    
    /**
     * Creates the input controls for wrapper code generation.
     * 
     * @param parent The parent composite
     */
    private def void createWrapperCodeComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Wrapper code generation", 2)
        
        // Create input template control
        wrapperCodeTemplate = UIUtil.createTextField(group, "Input file", EnumSet.of(UIUtil.Buttons.NONE))
        wrapperCodeTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.wrapperCodeTemplate = wrapperCodeTemplate.text
                    checkConsistency()
                }
            }
        })
        wrapperCodeTemplate.toolTipText = "Path to a template of a file, which will contain wrapper code.\n.\n"
            + "The path may contain placeholders such as ${" + LaunchConfiguration.MAIN_FILE_NAME_VARIABLE + "}."
        
        // Create snippets directory control
        wrapperCodeSnippets = UIUtil.createTextField(group, "Snippets directory", EnumSet.of(UIUtil.Buttons.NONE))
        wrapperCodeSnippets.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.wrapperCodeSnippetsDirectory = wrapperCodeSnippets.text
                    checkConsistency()
                }
            }
        })
        wrapperCodeSnippets.toolTipText = "Directory path containing wrapper code snippets"
        
        // Create snippets origin control
        UIUtil.createLabel(group, "Snippets origin")
        val comp = UIUtil.createComposite(group, 2)
        
        wrapperCodeSnippetsOrigin = UIUtil.createTextField(comp, null, EnumSet.of(UIUtil.Buttons.FILE_SYSTEM_DIRECTORY_BUTTON))
        wrapperCodeSnippetsOrigin.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.wrapperCodeSnippetsOrigin = wrapperCodeSnippetsOrigin.text
                    checkConsistency()
                }
            }
        })
        wrapperCodeSnippetsOrigin.toolTipText = "Directory path (file system or platform) with defaul content\n"
            + "for a snippet directory when creating a new project"
    }

    /**
     * Creates the execute tab.
     * 
     * @param folder The TabFolder where the tab will be added to
     */
    private def Composite createExecuteTab(TabFolder folder){
        val comp = createTab(folder, "Execute")
        
        createCommandTableComponent(comp)
        createCommandNameComponent(comp)
        createCommandComponent(comp)
        createAssociatedLaunchShortcutComponent(comp)
        
        return comp
    }
    
    /**
     * Creates the controls to set the compile, deploy and run commands.
     * 
     * @param parent The parent composite
     */
    private def void createCommandTableComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Commands", 2)
        
        // Create viewer
        viewer = UIUtil.createCommandTable(group, true)
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
        
        // Create buttons
        val bcomp = UIUtil.createComposite(group, 1)
        
        // Create add button
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
        addButton.toolTipText = "Add a shell command to be run after compilation and wrapper code generation"
        
        // Create remove Button
        UIUtil.createRemoveButton(bcomp, viewer)
        
        // Create up Button
        UIUtil.createUpButton(bcomp, viewer)
        
        // Create down Button
        UIUtil.createDownButton(bcomp, viewer)
    }
    
    /**
     * Creates the control to set the user defined name of the currently selected command.
     * 
     * @param parent The parent composite
     */
    private def void createCommandNameComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Name", 1)
        
        commandName = UIUtil.createTextField(group, null, EnumSet.of(UIUtil.Buttons.NONE))
        commandName.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(commandName != null){
                    currentCommandData.name = commandName.text
                    viewer.refresh()   
                }
            }
        })
        commandName.toolTipText = "User defined name for the selected command"
    }
    
    /**
     * Creates the control to set the shell command.
     * 
     * @param parent The parent composite
     */
    private def void createCommandComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Command", 2)
        
        command = UIUtil.createTextField(group, null, EnumSet.of(UIUtil.Buttons.NONE))
        command.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(command != null){
                    currentCommandData.command = command.text
                    viewer.refresh()
                }
            }
        })
        command.toolTipText = "Shell command to be executed when the preceding commands finished successfully."
        
        UIUtil.createBrowseVariableButton(group, commandName, "Variables...")
    }
    
    /**
     * Creates the combo viewer with configuration elements that define launch shortcuts.
     * 
     * @param parent The parent composite
     */
    private def void createAssociatedLaunchShortcutComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Associated Launch Shortcut", 2)
        
        val combo = new ComboViewer(group, SWT.DEFAULT)
        launchShortcuts = combo
        launchShortcuts.combo.toolTipText = "Launch shortcut that is started after the KiCo Compilation"
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        
        val ArrayList<Object> input = new ArrayList<Object>()
        input.add(StructuredSelection.EMPTY)
        input.addAll(ExtensionLookupUtil.getLaunchShortcutConfigurationElements())
        combo.input = input
        
        //Debug log, which launch shortcuts are currently installed 
//        for (e : ExtensionLookupUtil.getLaunchShortcutConfigurationElements()){
//            System.err.println(e.getAttribute("class"))
//        }

        // Select first element as default 
        combo.selection = new StructuredSelection(StructuredSelection.EMPTY)

        // Create label provider
        combo.labelProvider = new LabelProvider() {
            override String getText(Object element) {
                if(element != null && element instanceof IConfigurationElement)
                    return (element as IConfigurationElement).getAttribute("label")
                else
                    return ""
            }
        }
        
        // Selection event
        combo.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                currentData.associatedLaunchShortcut = getSelectedClassNameInCombobox(launchShortcuts)
                checkConsistency()
            }
        })        
    }
    
    /**
     * Creates the list with environments and buttons to modify the list.
     * 
     * @param parent The parent composite 
     */
    private def void createEnvironmentsComponent(Composite parent) {
        val comp = UIUtil.createGroup(parent, "Environments", 2)

        // Create list
        list = new ListViewer(comp, SWT.DEFAULT)
        list.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Create content provider
        list.setContentProvider(ArrayContentProvider.instance)
        list.input = new ArrayList<EnvironmentData>()
        
        // Create label provider
        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as EnvironmentData)
                if (data != null)
                    return data.name
                else
                    return ""
            }
        })

        // Create selection event
        list.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                currentData = selection.firstElement as EnvironmentData
                updateControls(currentData)
                updateEnabled()
                checkConsistency()
            }
        })
        
        // Create add button
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
        
        // Create remove button
        val removeButton = UIUtil.createRemoveButton(bcomp, list)
        removeButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                checkConsistency()
            }
        })
        
        // Create up button
        UIUtil.createUpButton(bcomp, list)
        
        // Create down button 
        UIUtil.createDownButton(bcomp, list)
    }

    /**
     * Updates the value of all controls with the values from the environment.
     * 
     * @param data The environment to be displayed in the controls
     */
    private def void updateControls(EnvironmentData data) {
        if(data != null){
            // Update name
            name.text = data.name
            
            // Update related project wizard
            if (relatedProjectWizard.input != null) {
                for (obj : relatedProjectWizard.input as ArrayList<IConfigurationElement>) {
                    if (obj.getAttribute("class") == data.relatedProjectWizardClass) {
                        relatedProjectWizard.selection = new StructuredSelection(obj)
                    }
                }
            }
            
            // Update main file
            mainFile.text = data.mainFile
            mainFileOrigin.text = data.mainFileOrigin
            
            // Update target
            if (targetLanguage.input != null) {
                for (transformation : targetLanguage.input as Set<Transformation>) {
                    if (transformation.id == data.targetLanguage) {
                        targetLanguage.selection = new StructuredSelection(transformation)
                    }
                }
            }
            targetFileExtension.text = data.targetFileExtension
            targetTemplate.text = data.targetTemplate
            
            // Update wrapper code
            wrapperCodeTemplate.text = data.wrapperCodeTemplate
            wrapperCodeSnippets.text = data.wrapperCodeSnippetsDirectory
            wrapperCodeSnippetsOrigin.text = data.wrapperCodeSnippetsOrigin
            
            // Update commands
            viewer.input = data.commands
            
            // Select associated launch shortcut in combo viewer
            var selectionFound=false
            for(o : launchShortcuts.input as ArrayList<Object>){
                if(o instanceof IConfigurationElement){
                    if(o.getAttribute(ExtensionLookupUtil.CLASS_ATTRIBUTE_NAME) == data.associatedLaunchShortcut) {
                        launchShortcuts.selection = new StructuredSelection(o)
                        selectionFound= true
                    }
                }
            }
            if(!selectionFound)
                launchShortcuts.selection = new StructuredSelection(StructuredSelection.EMPTY)
        }
    }
    
    /**
     * Fetches the selected target transformation id of the language combobox.
     * 
     * @return The target language id from the KiCo transformation
     * which is currently selected in the target language combobox
     */
    private def String getSelectedTargetLanguageId(){
        if (targetLanguage.input != null) {
            for (transformation : targetLanguage.input as Set<Transformation>) {
                return transformation.id
            }
        }
        return ""
    }
    
    /**
     * Fetches the fully qualified class name from an IConfigurationElement
     * that is the selected entry in a combobox.
     * 
     * @return The class name of the extension point configuration
     * which is currently selected in the related combobox.  
     */
    private def String getSelectedClassNameInCombobox(ComboViewer viewer){
        val selection = viewer.selection as IStructuredSelection
        if (selection != null) {
            if(selection.firstElement != null && selection.firstElement instanceof IConfigurationElement){
                return (selection.firstElement as IConfigurationElement).getAttribute(ExtensionLookupUtil.CLASS_ATTRIBUTE_NAME)
            }
        }
        return ""
    }
    
    /**
     * Implementation of IWorkbenchPreferencePage.
     * Saves the reference to the workbench and the used preference store.
     * 
     * @param workbench The workbench
     */
    override void init(IWorkbench workbench) {
        this.workbench = workbench
        store = PromPlugin.getDefault().preferenceStore
    }

    /**
     * Checks the user input for consistency and saves it if applicable.
     * The method is executed when the OK or Apply button is clicked.
     * 
     * @return true if the input is valid and the dialog may be closed by eclipse.<br />
     *         false otherwise.
     */
    override boolean performOk() {
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
    override void performDefaults(){
        list.input = PromEnvironmentsInitializer.getAllDefaultEnvironments()
        checkConsistency()
        super.performDefaults()
    }
    
    /**
     * Loads the relevant data for this page from the preference store. 
     */
    private def void loadSettings(){
        if(EnvironmentData.isPreferenceStoreEmpty(store))
            list.input = PromEnvironmentsInitializer.getAllDefaultEnvironments()
        else
            list.input = EnvironmentData.loadAllFromPreferenceStore(store)
    }
    
    /**
     * Saves the relevant data from this page from the preference store. 
     */
    private def void saveSettings(){
        val environments = list.input as ArrayList<EnvironmentData> 
        EnvironmentData.saveAllToPreferenceStore(store, environments)
    }
    
    /**
     * Checks the input for consistency and sets an error message if necessary.
     * 
     * @return true if the input is valid.<br />
     *         false otherwise. 
     */
    private def boolean checkConsistency(){
        errorMessage = checkErrors()
        return errorMessage == null
    }

    /**
     * Checks the input for consistency and returns an appropriate error message.
     * 
     * @return A string with an error message or null if the input is valid.
     */
    private def String checkErrors(){
        val environments = list.input as ArrayList<EnvironmentData>
        
        for(env : environments){
            // Check for unique names
            for(env2 : environments){
                if(env != env2&& env.name == env2.name){
                    return "Environment names must be unique."
                }    
            }
            
            // Check for a non empty name
            if(env.name == "")
                return "Environment name must not be empty."
            
            // Check for no comma in names
            if(env.name.contains(","))
                return "Environment names must not contain a comma."
        }
        
        return null
    }
    
    /**
     * Enables the controls of the tab folder if an environment is selected.
     * Disables the controls otherwise.
     */
    private def void updateEnabled(){
        val controls = tabFolder.tabList
        for(control : controls)
            UIUtil.enableControls(controls, currentData != null)
    }
}