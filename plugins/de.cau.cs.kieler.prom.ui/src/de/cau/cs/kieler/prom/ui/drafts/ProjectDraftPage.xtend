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
package de.cau.cs.kieler.prom.ui.drafts

import de.cau.cs.kieler.prom.ExtensionLookupUtil
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.data.FileData
import de.cau.cs.kieler.prom.drafts.ProjectDraftData
import de.cau.cs.kieler.prom.drafts.PromProjectDrafts
import de.cau.cs.kieler.prom.ui.UIExtensionLookupUtil
import de.cau.cs.kieler.prom.ui.UIUtil
import java.util.ArrayList
import java.util.EnumSet
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ICellModifier
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
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
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.TabFolder
import org.eclipse.swt.widgets.TabItem
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.TableItem
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage

/**
 * Implementation of the preferences page for project drafts.
 * Contains controls to create, remove, update and show the project drafts in the plugin's preference store.
 * 
 * @author aas
 */
class ProjectDraftPage extends PreferencePage implements IWorkbenchPreferencePage {

    /**
     * The workbench from the init(...) method.
     */
    private var IWorkbench workbench
    
    /**
     * The preferences store which contains the project drafts.
     * This is the plugin's preference store.
     */
    private var IPreferenceStore store

    /**
     * The list control to show the project drafts.
     */
    private var TableViewer list

    /**
     * The currently selected ProjectDraftData of the list
     * or null if there is no project draft selected.
     */
    private var ProjectDraftData currentData

    /**
     * The tab folder which contains the tabs with
     * the controls to modify the values of the selected project drafts.
     */
    private var TabFolder tabFolder

    /**
     * The input field for the project drafts name.
     */
    private var Text name
    
    /**
     * The combobox with the associated project wizard class name of the project draft.
     * The combobox is filled with the extensions of 'org.eclipse.ui.newWizards' that create projects.
     */
    private var ComboViewer associatedProjectWizard
    
    /**
     * The input field for the default model file of the project draft.
     */
    private var Text modelFile

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

        createTable(comp)
        createTabFolder(comp)

        loadSettings()

        updateEnabled()

        return comp
    }

    /**
     * Creates the tab folder and tabs with the controls
     * to show and modify the data of the currently selected project draft.
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
     * Creates the tab with the controls of the general settings.
     * 
     * @param folder The TabFolder where the tab will be added to  
     */
    private def Composite createGeneralTab(TabFolder folder){
        val comp = createTab(folder, "General")
        
        createNameComponent(comp)
        createWizardComponent(comp)
        createModelFileComponent(comp)
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
     * Creates the controls for the name.
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
        name.toolTipText = "Unique name of the project draft"
    }
    
    /**
     * Creates the controls for the associated project wizard.
     */
    private def void createWizardComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project wizard", 2)
        
        // Create ComboViewer
        val combo = new ComboViewer(group, SWT.DEFAULT)
        associatedProjectWizard = combo
        associatedProjectWizard.combo.toolTipText = "Project wizard to run when creating a new project"
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        val input = UIExtensionLookupUtil.getWizardConfigurationElements(true)
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
                    val className = getSelectedClassNameInCombobox(associatedProjectWizard)
                    currentData.associatedProjectWizardClass = className
                    associatedProjectWizard.combo.toolTipText = "Project wizard to run when creating a new project\n"
                                                              + className
                    checkConsistency()
               }
            }
        })
        
    }
    
    /**
     * Creates the controls for the model file.
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
     * Creates the list with project drafts and buttons to modify the list.
     * 
     * @param parent The parent composite 
     */
    private def void createTable(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project Drafts", 2)

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
                val d = element as ProjectDraftData
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
                currentData = selection.firstElement as ProjectDraftData
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
                val env = new ProjectDraftData("New Project Draft")
                
                // Get first project wizard in combo box
                val input = associatedProjectWizard.input as ArrayList<IConfigurationElement> 
                if(!input.isEmpty)
                    env.associatedProjectWizardClass = input.get(0).getAttribute("class")
                
                // Add project draft to list
                val inputArray = (list.input as ArrayList<ProjectDraftData>)
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
        
        // Add drag and drop support to change order of items
        UIUtil.addDragAndDropSupportToChangeOrder(list)
    }

    /**
     * Updates the value of all controls with the values from the project draft.
     * 
     * @param data The project draft to be displayed in the controls
     */
    private def void updateControls(ProjectDraftData data) {
        var String warning = null;
        if(data != null) {
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
            
            // Update initial resources
            initialResources.input = data.initialResources
        }
        setMessage(warning, WARNING);
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
        store = PromPlugin.preferenceStore
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
        list.input = PromProjectDrafts.getAllDefaults()
        checkConsistency()
        super.performDefaults()
    }
    
    /**
     * Loads the relevant data for this page from the preference store. 
     */
    private def void loadSettings(){
        if(ProjectDraftData.isPreferenceStoreEmpty(store))
            list.input = PromProjectDrafts.getAllDefaults()
        else
            list.input = ProjectDraftData.loadAllFromPreferenceStore(store)
    }
    
    /**
     * Saves the relevant data from this page from the preference store. 
     */
    private def void saveSettings(){
        val drafts = list.input as ArrayList<ProjectDraftData> 
        ProjectDraftData.saveAllToPreferenceStore(store, drafts)
    }
    
    /**
     * Checks the input for consistency and sets an error message if necessary.
     * 
     * @return true if the input is valid.<br />
     *         false otherwise. 
     */
    private def boolean checkConsistency(){
        errorMessage = checkErrors()
        setMessage(checkWarnings(), WARNING)
        return errorMessage == null
    }

    /**
     * Checks the input for consistency and returns an appropriate error message.
     * 
     * @return A string with an error message or null if the input is valid.
     */
    private def String checkErrors(){
        val drafts = list.input as ArrayList<ProjectDraftData>
        
        for(d : drafts){
            // Check for unique names
            for(d2 : drafts){
                if(d != d2 && d.name == d2.name){
                    return "Names must be unique."
                }    
            }
            
            // Check for a non empty name
            if(d.name == "")
                return "Name must not be empty."
            
            // Check for no comma in names
            if(d.name.contains(","))
                return "Names must not contain a comma."
        }
        
        return null
    }
    
    /**
     * Checks the input for consistency and returns an appropriate warning message.
     * 
     * @return A string with a warning message or null if the input is valid.
     */
    private def String checkWarnings(){
        val env = currentData
        // Nothing to check
        if (env == null)
            return null
        
        // Check project wizard is installed.
        var projectWizardFound = false
        if (associatedProjectWizard.input != null) {
            for (obj : associatedProjectWizard.input as ArrayList<IConfigurationElement>) {
                if (obj.getAttribute("class") == env.associatedProjectWizardClass) {
                    projectWizardFound = true
                }
            }
        }
        if (!projectWizardFound) {
            return "The project wizard "+env.associatedProjectWizardClass +" could not be found."
        }
        return null
    }
    
    /**
     * Enables the controls of the tab folder if an project draft is selected.
     * Disables the controls otherwise.
     */
    private def void updateEnabled(){
        val controls = tabFolder.tabList
        for(control : controls)
            UIUtil.enableControls(controls, currentData != null)
    }
}