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
package de.cau.cs.kieler.prom.environments.ui

import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.prom.common.CommandData
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.common.FileData
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.ui.UIUtil
import de.cau.cs.kieler.prom.environments.PromEnvironmentsInitializer
import de.cau.cs.kieler.prom.launchconfig.KiCoLaunchConfig
import java.util.ArrayList
import java.util.EnumSet
import java.util.Set
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ICellModifier
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TextCellEditor
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.TabFolder
import org.eclipse.swt.widgets.TabItem
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.TableItem
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
    private var TableViewer list

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
    private var Button useCompileChain
    private var Text compileChain
    /**
     * The input field for the file extension
     * of the selected target language (e.g. '.java' for Java Code).
     */
    private var Text targetLanguageFileExtension
    /**
     * The input field for an optional template used when saving the KiCo compiled output.
     */
    private var Text targetTemplate
    
    /**
     * The radio button for the default target directory.
     */
    private var Button targetDirectoryKielerGen
    /**
     * The radio button to specify
     * that output files should be saved to the same directory as input files.
     */
    private var Button targetDirectorySameAsInput
    
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
     * The control to display all shell commands for the currently selected environment.
     */
    private TableViewer viewer
    
    /**
     * Combobox with all available launch shortcuts.
     */
    private var ComboViewer launchShortcuts
    
    
    /**
     * The combobox with the associated project wizard class name of the environment.
     * The combobox is filled with the extensions of 'org.eclipse.ui.newWizards' that create projects.
     */
    private var ComboViewer associatedProjectWizard
    /**
     * The input field for the default model file of the environment.
     */
    private var Text modelFile
    /**
     * The input field for the default main file of the environment.
     */
    private var Text mainFile

    /**
     * The table of resources that should be created at project setup.
     */
    private var TableViewer initialResources

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
        createModelFileComponent(comp)
        createMainFileComponent(comp)
        createInitialResourcesComponent(comp)
        
        return comp
    }
    
    /**
     * Creates the controls to add remove and modify the resources to be created at project setup.
     * 
     * @param folder The TabFolder where the tab will be added to  
     */
    private def TableViewer createInitialResourcesComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Initial Resources", 2)
        
        val table = new Table(group, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        // Create viewer
        val viewer = new TableViewer(table)
        initialResources = viewer
        
        // Create columns
        val pathColumn = UIUtil.createTableColumn(viewer, "Project relative path", 150)
        pathColumn.labelProvider = new ColumnLabelProvider() {
            override String getToolTipText(Object element) {
                return "The project relative path of the resource to be created."
            }
            override String getText(Object element) {
                val d = element as FileData
                return d.projectRelativePath;
            }
        };
        val originColumn = UIUtil.createTableColumn(viewer, "Origin", 200)
        originColumn.labelProvider = new ColumnLabelProvider() {
            override String getToolTipText(Object element) {
                return "The template of the file or folder to be created.\n"
                    + "This is either a file system path\n"
                    + "or an URL using the platform scheme provided by eclipse."
            }
            override String getText(Object element) {
                val d = element as FileData
                return d.origin;
            }
        };

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
        // Create editable cells
        val pathEditor = new TextCellEditor(table);
        val originEditor = new TextCellEditor(table);

        // Assign the cell editors to the viewer 
        viewer.setCellEditors(#[pathEditor, originEditor]);
        viewer.columnProperties = #["path", "origin"]
        viewer.setCellModifier(new ICellModifier{
            
            def int getColumnIndex(String property) {
                switch(property) {
                    case "path" : return 0
                    default : return 1
                }
            }
            override canModify(Object element, String property) {
                return true
            }
            override getValue(Object element, String property) {
                val columnIndex = getColumnIndex(property)
                val data = element as FileData
                switch (columnIndex) {
                    case 0 : return data.projectRelativePath
                    case 1 : return data.origin
                }
                return null
            }
            override modify(Object element, String property, Object value) {
                val columnIndex = getColumnIndex(property)
                val item = element as TableItem
                val data = item.data as FileData
                switch (columnIndex) {
                    case 0 : data.projectRelativePath = value as String
                    case 1 : data.origin = value as String
                }
                viewer.refresh()
            }
        })
        
        // Create buttons
        val bcomp = UIUtil.createComposite(group, 1)
        
        // Create add button
        val addButton = UIUtil.createButton(bcomp, "Add")
        addButton.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                val data = new FileData("src/MyFile.txt")
                val inputArray = viewer.input as ArrayList<FileData>
                inputArray.add(data)
                viewer.refresh()
                viewer.selection = new StructuredSelection(data)
                
                checkConsistency()
            }
        })
        addButton.toolTipText = "Add a file or folder to be created at project setup."
        
        // Create remove button
        UIUtil.createRemoveButton(bcomp, viewer)
        
        // Create up button
        UIUtil.createUpButton(bcomp, viewer)
        
        // Create down button
        UIUtil.createDownButton(bcomp, viewer)
        
        return viewer
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
     * Creates the controls for the associated project wizard of the current environment.
     */
    private def void createWizardComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project wizard", 2)
        
        // Create ComboViewer
        val combo = new ComboViewer(group, SWT.DEFAULT)
        associatedProjectWizard = combo
        associatedProjectWizard.combo.toolTipText = "Project wizard to run when creating a new project"
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        val input = ExtensionLookupUtil.getWizardConfigurationElements(true)
        combo.input = input

//        Debug log, which wizards are currently installed 
//        for (e : ExtensionLookupUtil.getWizardConfigurationElements(true)){
//            println(e.getAttribute("class"))
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
                    currentData.associatedProjectWizardClass = getSelectedClassNameInCombobox(associatedProjectWizard)
                    checkConsistency()
               }
            }
        })
        
    }
    
    /**
     * Creates the controls for the model file of the current environment.
     */
    private def void createModelFileComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Model file", 2)
        
        // Create main file text field
        modelFile = UIUtil.createTextField(group, "Model file", EnumSet.of(UIUtil.Buttons.NONE))
        modelFile.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.modelFile = modelFile.text
                    checkConsistency()
                }
            }
        })
        modelFile.toolTipText = "Project relative path to the initial model file of the project.\n"
            + "The file is created on project setup.\n"
            + "The path may contain placeholders such as ${project_name}."
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
                    currentData.launchData.mainFile = mainFile.text
                    checkConsistency()
                }
            }
        })
        mainFile.toolTipText = "Project relative path to the initial main file of the project.\n"
            + "The file is created on project setup.\n"
            + "The path may contain placeholders such as ${project_name}."
    }

    /**
     * Creates the tab with the controls to set the environment's fields regarding the compilation of files.
     * 
     * @param folder The TabFolder where the tab will be added to
     */
    private def Composite createCompilationTab(TabFolder folder){
        val comp = createTab(folder, "Compilation")
        
        createTargetComponent(comp)
        createWrapperCodeComponent(comp)
        
        return comp
    }

    /**
     * Creates the controls to set the target language, file extension and template.
     * 
     * @param parent The parent composite
     */
    private def void createTargetComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Compilation", 2)
        
        // Create checkbox
        useCompileChain = UIUtil.createCheckButton(group, "Use compile chain", false)
        // Toggle enabled state
        useCompileChain.addSelectionListener(new SelectionAdapter {
            override widgetSelected(SelectionEvent e) {
                compileChain.enabled = useCompileChain.selection
                targetLanguage.combo.enabled = !useCompileChain.selection
                
                if(currentData != null) {
                    if(useCompileChain.selection) {
                        currentData.launchData.targetLanguage = compileChain.text
                        checkConsistency()
                    } else {
                        val selection = targetLanguage.selection as IStructuredSelection
                        if (selection != null) {
                            val trans = selection.firstElement as Transformation
                            if (trans != null) {
                                currentData.launchData.targetLanguage = trans.id
                                checkConsistency()
                            }
                        }
                    }
                }
            }
        })
        
        // Add space
        UIUtil.createSpace(group, 1)
        
        // Create target language control
        SWTFactory.createLabel(group, "Target", 1)
        targetLanguage = UIUtil.createKiCoTargetsCombo(group)
        targetLanguage.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                if(currentData != null && !useCompileChain.selection){
                    val selection = targetLanguage.selection as IStructuredSelection
                    if (selection != null) {
                        val trans = selection.firstElement as Transformation
                        if (trans != null) {
                            currentData.launchData.targetLanguage = trans.id
                            checkConsistency()
                        }
                    }
               }
            }
        })
        targetLanguage.combo.toolTipText = "Target transformation of the KIELER Compiler"

        // Create compile chain control
        compileChain = UIUtil.createTextField(group, "Compile chain")
        compileChain.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null && useCompileChain.selection){
                    currentData.launchData.targetLanguage = compileChain.text
                    checkConsistency()
                }
            }
        })
        compileChain.enabled = false
        
        // Create target language file extension control
        targetLanguageFileExtension = UIUtil.createTextField(group, "File extension", EnumSet.of(UIUtil.Buttons.NONE))
        targetLanguageFileExtension.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.launchData.targetLanguageFileExtension = targetLanguageFileExtension.text
                    checkConsistency()                    
                }
            }
        })
        targetLanguageFileExtension.toolTipText = "File extension for the target language (e.g. '.java' for Java)"
        
        // Create target template control
        targetTemplate =  UIUtil.createTextField(group, "Output template", EnumSet.of(UIUtil.Buttons.NONE))
        targetTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.launchData.targetTemplate = targetTemplate.text
                    checkConsistency()    
                }
            }
        })
        targetTemplate.toolTipText = "Path to a template file for the compiled output.\n"
        + "Use ${" + KiCoLaunchConfig.COMPILED_CODE_PLACEHOLDER + "} in the template file as placeholder."
        
        // Create target directory control
        val comp = UIUtil.createComposite(group, 3)
        val gd = comp.layoutData as GridData
        gd.horizontalSpan = 2
        
        val buttons = UIUtil.createTargetDirectoryButtons(comp)
        for(button : buttons) {
            if(button.data == UIUtil.KiCoLaunchTargetDirectoryOptions.KIELER_GEN) {
                targetDirectoryKielerGen = button
            } else if(button.data == UIUtil.KiCoLaunchTargetDirectoryOptions.SAME_AS_INPUT) {
                targetDirectorySameAsInput = button
            }
        }
        targetDirectoryKielerGen.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                if(currentData != null){
                    currentData.launchData.targetDirectory = KiCoLaunchConfig.BUILD_DIRECTORY
                    checkConsistency()
                }
            }
        })
        targetDirectorySameAsInput.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                if(currentData != null){
                    currentData.launchData.targetDirectory = ""
                    checkConsistency()
                }
            }
        })
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
                    currentData.launchData.wrapperCodeTemplate = wrapperCodeTemplate.text
                    checkConsistency()
                }
            }
        })
        wrapperCodeTemplate.toolTipText = "Path to a template of a file, which will contain wrapper code.\n.\n"
            + "The path may contain placeholders such as ${" + KiCoLaunchConfig.MAIN_FILE_NAME_VARIABLE + "}."
        
        // Create snippets directory control
        wrapperCodeSnippets = UIUtil.createTextField(group, "Snippets directory", EnumSet.of(UIUtil.Buttons.NONE))
        wrapperCodeSnippets.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                if(currentData != null){
                    currentData.launchData.wrapperCodeSnippetDirectory = wrapperCodeSnippets.text
                    checkConsistency()
                }
            }
        })
        wrapperCodeSnippets.toolTipText = "Directory path containing wrapper code snippets"
    }

    /**
     * Creates the execute tab.
     * 
     * @param folder The TabFolder where the tab will be added to
     */
    private def Composite createExecuteTab(TabFolder folder){
        val comp = createTab(folder, "Execute")
        
        createCommandTableComponent(comp)
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
        viewer = UIUtil.createCommandTable(group)
        
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
     * Creates the combo viewer with configuration elements that define launch shortcuts.
     * 
     * @param parent The parent composite
     */
    private def void createAssociatedLaunchShortcutComponent(Composite parent){
        val group = UIUtil.createGroup(parent, "Associated Launch Shortcut", 2)
        
        // Debug log, which launch shortcuts are currently installed
//        for (e : ExtensionLookupUtil.launchShortcutConfigurationElements){
//            println(e.getAttribute("class"))
//        }
        
        launchShortcuts = UIUtil.createLaunchShortcutCombo(group)
        // Selection event
        launchShortcuts.addSelectionChangedListener(new ISelectionChangedListener {

            override selectionChanged(SelectionChangedEvent event) {
                currentData.launchData.associatedLaunchShortcut = getSelectedClassNameInCombobox(launchShortcuts)
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
        val group = UIUtil.createGroup(parent, "Environments", 2)

        // Create table
        val table = new Table(group, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(false);
        val gd = new GridData(GridData.FILL_BOTH)
        gd.heightHint = 80
        gd.minimumHeight = 60
        gd.minimumWidth = 200
        table.setLayoutData(gd);
        // Create viewer
        val viewer = new TableViewer(table)
        list = viewer
        // Create columns
        val pathColumn = UIUtil.createTableColumn(viewer, "Name", 200)
        pathColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                val d = element as EnvironmentData
                return d.name;
            }
        };
        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
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
       
        // Create buttons
        val bcomp = UIUtil.createComposite(group, 1, GridData.HORIZONTAL_ALIGN_END)
        // Create add button
        val addButton = UIUtil.createButton(bcomp, "Add")
        addButton.addSelectionListener(new SelectionAdapter(){
            override widgetSelected(SelectionEvent e) {
                val env = new EnvironmentData("New Environment")
                env.launchData.targetLanguage = getSelectedTargetLanguageId()
                
                // Get first project wizard in combo box
                val input = associatedProjectWizard.input as ArrayList<IConfigurationElement> 
                if(!input.isEmpty)
                    env.associatedProjectWizardClass = input.get(0).getAttribute("class")
                
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
            
            // Update project wizard
            if (associatedProjectWizard.input != null) {
                for (obj : associatedProjectWizard.input as ArrayList<IConfigurationElement>) {
                    if (obj.getAttribute("class") == data.associatedProjectWizardClass) {
                        associatedProjectWizard.selection = new StructuredSelection(obj)
                    }
                }
            }
            
            // Update model file
            modelFile.text = data.modelFile
            
            // Update main file
            mainFile.text = data.launchData.mainFile
            
            // Update initial resources
            initialResources.input = data.initialResources
            
            // Update target language / compile chain
            var isCompileChain = true
            if (targetLanguage.input != null) {
                for (transformation : targetLanguage.input as Set<Transformation>) {
                    if (transformation.id == data.launchData.targetLanguage) {
                        targetLanguage.selection = new StructuredSelection(transformation)
                        isCompileChain = false
                    }
                }
            }
            if(isCompileChain) {
                compileChain.text = data.launchData.targetLanguage
            }
            useCompileChain.selection = isCompileChain
            compileChain.enabled = isCompileChain
            targetLanguage.combo.enabled = !isCompileChain
            
            targetLanguageFileExtension.text = data.launchData.targetLanguageFileExtension
            targetTemplate.text = data.launchData.targetTemplate
            if(data.launchData.targetDirectory.isNullOrEmpty()) {
                targetDirectoryKielerGen.selection = false
                targetDirectorySameAsInput.selection = true
            } else {
                targetDirectoryKielerGen.selection = true
                targetDirectorySameAsInput.selection = false
            }
            
            // Update wrapper code
            wrapperCodeTemplate.text = data.launchData.wrapperCodeTemplate
            wrapperCodeSnippets.text = data.launchData.wrapperCodeSnippetDirectory
            
            // Update commands
            viewer.input = data.launchData.commands
            
            // Select associated launch shortcut in combo viewer
            var selectionFound=false
            for(o : launchShortcuts.input as ArrayList<Object>){
                if(o instanceof IConfigurationElement){
                    if(o.getAttribute(ExtensionLookupUtil.CLASS_ATTRIBUTE_NAME) == data.launchData.associatedLaunchShortcut) {
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
    override void performDefaults() {
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
            
        if(currentData != null) {
            if(useCompileChain.selection) {
                targetLanguage.combo.enabled = false
            } else {
                compileChain.enabled = false
            }
        }
    }
}