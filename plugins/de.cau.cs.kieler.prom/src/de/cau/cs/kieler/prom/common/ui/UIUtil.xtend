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
package de.cau.cs.kieler.prom.common.ui

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.prom.common.CommandData
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.util.ArrayList
import java.util.Collections
import java.util.EnumSet
import java.util.List
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IPath
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.StringVariableSelectionDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.CheckStateChangedEvent
import org.eclipse.jface.viewers.CheckboxTableViewer
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ContentViewer
import org.eclipse.jface.viewers.ICheckStateListener
import org.eclipse.jface.viewers.ICheckStateProvider
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.DirectoryDialog
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Group
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ContainerSelectionDialog
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.ide.IDE

import static de.cau.cs.kieler.prom.common.ui.UIUtil.*

/**
 * Factory class to create SWT widgets
 * and util class for general purpose UI actions such as enabling/disabling controls.
 * If the same controls are created multiple times (e.g. an input with a browse button or a ComboViewer for KiCo transformations)
 * it might be worthy to put it in UIUtil.
 * 
 * @author aas
 */
class UIUtil {

    /**
     * Enumeration to specify with which buttons a text field should be created.
     */ 
    enum Buttons{
        /**
         * Flag to indicate that a text field should be created without any buttons.
         */
        NONE,
        
        /**
        * Flag to indicate that a text field should be created with a button to open a project selection dialog.
        */
        PROJECT_BUTTON,
        
        /**
        * Flag to indicate that a text field should be created with a button to open a resource selection dialog.
        */
        RESOURCE_BUTTON,
        
        /**
        * Flag to indicate that a text field should be created with a button to open a container selection dialog.
        */
        CONTAINER_BUTTON,
        
        /**
        * Flag to indicate that a text field should be created with a button to open a variable selection dialog.
        */
        VARIABLE_BUTTON,
        
        /**
        * Flag to indicate that a text field should be created with a button to open a file selection dialog of the file system.
        */
        FILE_SYSTEM_FILE_BUTTON,
        
        /**
        * Flag to indicate that a text field should be created with a button to open a folder selection dialog of the file system.
        */
        FILE_SYSTEM_DIRECTORY_BUTTON
    }
    
    enum KiCoLaunchTargetDirectoryOptions {
        /**
         * Value to indicate that the default directory should be used as target
         */
        KIELER_GEN,
        /**
         * Value to indicate that output should be saved in the same folder as the input files
         */
        SAME_AS_INPUT
    }
    
    /**
     * Creates a new container for controls.
     * 
     * @param parent The parent composite
     * @param text The label of the group
     * @param columns The columns that this container should provide in each line
     * @return the new group.
     */
    public static def Group createGroup(Composite parent, String text, int columns) {
        createGroup(parent, text, columns, GridData.FILL_HORIZONTAL)
    }

    /**
     * Creates a new container for controls.
     * 
     * @param parent The parent container
     * @param text The label of the group
     * @param columns The columns that this container should provide in each line
     * @param fill Bitmask for the style of the group 
     * @return the new group.
     */
    public static def Group createGroup(Composite parent, String text, int columns, int fill) {
        return SWTFactory.createGroup(parent, text, columns, 1, fill)
    }

    /**
     * Creates a new container for controls.
     * 
     * @param parent The parent container
     * @param columns The columns that this container should provide in each line
     * @return the new composite.
     */
    public static def Composite createComposite(Composite parent, int columns) {
        return createComposite(parent, columns, GridData.FILL_HORIZONTAL)
    }

    /**
     * Creates a new container for controls.
     * 
     * @param parent The parent container
     * @param columns The columns that this container should provide in each line
     * @param fill Bitmask for the style of the group 
     * @return the new composite.
     */
    public static def Composite createComposite(Composite parent, int columns, int fill) {
        return SWTFactory.createComposite(parent, parent.font, columns, 1, fill, 0, 0)
    }

    /**
     * @see createTextField(Composite, String, EnumSet, IProjectHolder)
     */
    public static def Text createTextField(Composite parent, String label, EnumSet<Buttons> buttonFlags) {
        createTextField(parent, label, buttonFlags, null)
    }

    /**
     * Creates a new text field with a label to describe it and buttons to modify it.
     * The label is created before the text field.
     * The buttons are created after the text field. 
     * 
     * @param parent The parent composite
     * @param label The label's text describing what this text field is for or null if there should not be a label
     * @param buttonFlags Flags of the buttons that should be created to ease the modification of the text field
     * @param projectHolder A class which holds a project reference to dynamically set the root of some dialogs (e.g. a resource selection dialog)
     * @return the new text field.
     */
    public static def Text createTextField(Composite parent, String label, EnumSet<Buttons> buttonFlags, IProjectHolder projectHolder) {
        // Create label
        if (label != null) {
            SWTFactory.createLabel(parent, label, 1)
        }

        // Create text field
        val text = SWTFactory.createSingleText(parent, 1)

        // Create buttons
        val moreThanOneButton = buttonFlags.size > 0
        var browseProjectLabel = "Browse Projects..."
        var browseResourceLabel = "Browse Resources..."
        var browseContainerLabel = "Browse Folders..."
        var browseFileSystemFileLabel = "Browse File System..."
        var browseFileSystemDirectoryLabel = "Browse File System..."
        var browseVariableLabel = "Variables..."
        if (!moreThanOneButton) {
            browseProjectLabel = "Browse..."
            browseResourceLabel = "Browse..."
            browseContainerLabel = "Browse..."
            browseFileSystemFileLabel = "Browse..."
            browseFileSystemDirectoryLabel = "Browse..."
        }

        if (buttonFlags.contains(Buttons.PROJECT_BUTTON))
            createBrowseProjectButton(parent, text, browseProjectLabel)

        if (buttonFlags.contains(Buttons.RESOURCE_BUTTON))
            createBrowseResourceButton(parent, text, browseResourceLabel, projectHolder)

        if (buttonFlags.contains(Buttons.CONTAINER_BUTTON))
            createBrowseContainerButton(parent, text, browseContainerLabel, projectHolder)

        if (buttonFlags.contains(Buttons.FILE_SYSTEM_FILE_BUTTON))
            createBrowseFileSystemButton(parent, text, browseFileSystemFileLabel, true)

        if (buttonFlags.contains(Buttons.FILE_SYSTEM_DIRECTORY_BUTTON))
            createBrowseFileSystemButton(parent, text, browseFileSystemDirectoryLabel, false)

        if (buttonFlags.contains(Buttons.VARIABLE_BUTTON))
            createBrowseVariableButton(parent, text, browseVariableLabel)

        return text
    }

    /**
     * Creates a button which opens a file or directory dialog and sets the text field's value to the selection.
     * 
     * @param parent The parent container
     * @param text The text field this button will modify
     * @param label The text of the button
     * @param isFileDialog A flag to specify if a FileDialog should be opened (flag is true) or a DirectoryDialog (flag is false)
     * @return the new push button. 
     */
    public static def Button createBrowseFileSystemButton(Composite parent, Text text, String label, boolean isFileDialog) {
        val button = SWTFactory.createPushButton(parent, label, null)
        button.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {

                    // FileDialog and DirectoryDialog do not inherit the same open method.
                    // Thus we have to call it dependent on what has been created.
                    var String result
                    if (isFileDialog) {
                        val dialog = new FileDialog(parent.shell, SWT.OPEN);
                        result = dialog.open()
                    } else {
                        val dialog = new DirectoryDialog(parent.shell, SWT.OPEN);
                        result = dialog.open()
                    }
                    if (result != null && result != "") {
                        text.text = result
                    }
                }

            }
        )
        return button
    }

    /**
     * Creates a button which opens a project selection dialog and sets the text field's value to the selection.
     * 
     * @param parent The parent container
     * @param text The text field this button will modify
     * @param label The button's text
     * @return the new push button. 
     */
    public static def Button createBrowseProjectButton(Composite parent, Text text, String label) {
        val button = SWTFactory.createPushButton(parent, label, null)
        button.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {

                    // Create a dialog with all projects in the workspace as possible selections.
                    val dialog = new ElementListSelectionDialog(parent.shell, new LabelProvider() {
                        override String getText(Object element) {
                            val data = (element as IProject)
                            if (data != null)
                                return data.name
                            else
                                return ""
                        }
                    })
                    dialog.title = "Project Selection"

                    // Set the selectable elements of the dialog.
                    // A project may be closed
                    // so we use only open (accessible) projects as possible selection.
                    dialog.elements = ResourcesPlugin.workspace.root.projects.filter[it.isAccessible]
                    dialog.open()

                    // Get result from dialog
                    val results = dialog.result
                    if (results != null && !results.isEmpty) {
                        val result = results.get(0) as IProject
                        text.text = result.name
                    }
                }

            }
        )
        return button
    }

    /**
     * Creates a button which opens a resource selection dialog and sets the text field's value to the selection.
     * 
     * @param parent The parent container
     * @param text The text field this button will modify
     * @param label The button's text
     * @param projectHolder A class which holds a project reference to dynamically set the root of resource dialog
     * @return the new push button. 
     */
    public static def Button createBrowseResourceButton(Composite parent, Text text, String label, IProjectHolder projectHolder) {
        val button = SWTFactory.createPushButton(parent, label, null)
        button.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val rootElement = if (projectHolder != null && projectHolder.project != null)
                            projectHolder.project
                        else
                            ResourcesPlugin.getWorkspace().getRoot()

                    val dialog = new ResourceSelectionDialog(parent.shell, rootElement, "")
                    dialog.open()

                    val results = dialog.result
                    if (results != null && results.size > 0) {
                        val result = results.get(0) as IResource
                        text.setText(result.projectRelativePath.toOSString)
                    }
                }

            }
        )
        return button
    }

    /**
     * Creates a button which opens a container dialog and sets the text field's value to the selection.
     * 
     * @param parent The parent container
     * @param text The text field this button will modify
     * @param label The button's text
     * @param projectHolder A class which holds a project reference to dynamically set the root of resource dialog
     * @return the new push button. 
     */
    public static def Button createBrowseContainerButton(Composite parent, Text text, String label, IProjectHolder projectHolder) {
        val button = SWTFactory.createPushButton(parent, label, null)
        button.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val rootElement = if (projectHolder != null && projectHolder.project != null)
                            projectHolder.project
                        else
                            ResourcesPlugin.getWorkspace().getRoot()

                    val dialog = new ContainerSelectionDialog(parent.shell, rootElement, false, "")
                    dialog.open()

                    val results = dialog.getResult()
                    if ((results != null) && (results.length > 0) && (results.get(0) instanceof IPath)) {
                        val result = results.get(0) as IPath
                        val relativeResult = result.makeRelativeTo(rootElement.fullPath)
                        text.setText(relativeResult.toOSString)
                    }
                }
            }
        )
        return button
    }

    /**
     * Creates a button which opens a variable selection dialog and inserts the selection to the text field.
     * 
     * @param parent The parent container
     * @param text The text field this button will modify
     * @param label The button's text
     * @return the new push button. 
     */
    public static def Button createBrowseVariableButton(Composite parent, Text text, String label) {
        val button = SWTFactory.createPushButton(parent, label, null)
        button.addSelectionListener(new SelectionAdapter() {

            override void widgetSelected(SelectionEvent e) {
                val dialog = new StringVariableSelectionDialog(parent.shell)
                dialog.open()
                val variable = dialog.getVariableExpression()
                if (variable != null) {
                    text.insert(variable)
                }
            }
        })
        return button
    }

    /**
     * Creates a combobox with the KiCo transformations for code generation.
     * 
     * @param parent The parent container
     * @return a new combobox. 
     */
    public static def createKiCoTargetsCombo(Composite parent) {
        // Create ComboViewer
        val combo = new ComboViewer(parent, SWT.DEFAULT)

        // Fetch possible targets from KiCo
        var Set<Transformation> transformations
        val feature = KielerCompiler.getFeature(CodeGenerationFeatures.TARGET_ID)
        
        if (feature != null)
            transformations = feature.expandingTransformations
        
        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        combo.input = transformations

        // Select first element as default 
        if (transformations != null && transformations.size > 0) {
            combo.selection = new StructuredSelection(transformations.get(0))
        }

        // Create label provider
        combo.labelProvider = new LabelProvider() {
            override String getText(Object element) {
                val data = (element as Transformation)
                if (data != null)
                    return data.name
                else
                    return ""
            }
        }

        return combo
    }

    /**
     * Creates a radio group to set the target directory for compilation results.
     * 
     * @param parent The parent composite
     */
    public static def List<Button> createTargetDirectoryButtons(Composite parent) {
        val group = UIUtil.createComposite(parent, 3)
        
        createLabel(group, "Target directory")
        val button1 = SWTFactory.createRadioButton(group, LaunchConfiguration.BUILD_DIRECTORY)
        button1.data = KiCoLaunchTargetDirectoryOptions.KIELER_GEN
        button1.toolTipText = "Save compilation output to the "+LaunchConfiguration.BUILD_DIRECTORY+" directory."
         
        val button2 = SWTFactory.createRadioButton(group, "Same as input files")
        button2.data = KiCoLaunchTargetDirectoryOptions.SAME_AS_INPUT
        button2.toolTipText = "Save compilation output in the same folder as the corresponding input files."
        return #[button1, button2]
    }
    
    
    /**
     * Creates the combo viewer with configuration elements that define launch shortcuts.
     * 
     * @param parent The parent composite
     */
    public static def ComboViewer createLaunchShortcutCombo(Composite parent){
        val viewer = new ComboViewer(parent, SWT.DEFAULT)
        viewer.combo.toolTipText = "Launch shortcut that is started after the KiCo Compilation"
        
        // Fill combo
        viewer.contentProvider = ArrayContentProvider.instance
        
        val ArrayList<Object> input = new ArrayList<Object>()
        input.add(StructuredSelection.EMPTY)
        input.addAll(ExtensionLookupUtil.getLaunchShortcutConfigurationElements())
        viewer.input = input
        
        // Debug log, which launch shortcuts are currently installed 
//        for (e : ExtensionLookupUtil.getLaunchShortcutConfigurationElements()){
//            println(e.getAttribute("class"))
//        }

        // Select first element as default 
        viewer.selection = new StructuredSelection(StructuredSelection.EMPTY)

        // Create label provider
        viewer.labelProvider = new LabelProvider() {
            override String getText(Object element) {
                if(element != null && element instanceof IConfigurationElement)
                    return (element as IConfigurationElement).getAttribute("label")
                else
                    return ""
            }
        }
        return viewer       
    }
    
    /**
     * Creates a combobox with the environments.
     * 
     * @param parent The parent composite
     * @parem environments A list with the environments which can be selected via this combobox
     * @return the new combobox.
     */
    public static def ComboViewer createEnvironmentsCombo(Composite parent, List<EnvironmentData> environments) {
        // Create combo
        val combo = new ComboViewer(parent, SWT.DEFAULT)
        combo.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Create content provider
        combo.setContentProvider(ArrayContentProvider.instance)
        combo.input = environments

        if (!environments.isEmpty)
            combo.selection = new StructuredSelection(environments.get(0))

        // Create label provider
        combo.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as EnvironmentData)
                if (data != null)
                    return data.name
                else
                    return ""
            }
        })

        return combo
    }

    /**
     * Creates a table viewer for command data objects optionally with or without checkboxes.
     * 
     * @param parent The parent composite
     * @param checkboxes Flag to specify if the table should have checkboxes to enable / disable commands
     * @return the created table viewer 
     */
    public static def TableViewer createCommandTable(Composite parent, boolean checkboxes) {
        // Create table
        val table = if (checkboxes)
                new Table(parent, SWT.CHECK.bitwiseOr(SWT.BORDER).bitwiseOr(SWT.FULL_SELECTION))
            else
                new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setLayoutData(new GridData(GridData.FILL_BOTH));

        // Create viewer
        var TableViewer viewer
        if (checkboxes) {
            val checkViewer = new CheckboxTableViewer(table)
            viewer = checkViewer

            // Create listener
            checkViewer.addCheckStateListener(new ICheckStateListener() {
                override checkStateChanged(CheckStateChangedEvent event) {
                    val comm = event.element as CommandData
                    comm.enabled = !comm.isEnabled
                    
                    // On Windows and Mac, we have to refresh the content provider to make the change visible
                    checkViewer.refresh();
                }
            })

            // Create state provider
            checkViewer.checkStateProvider = new ICheckStateProvider() {

                override isChecked(Object element) {
                    val comm = element as CommandData
                    return comm.isEnabled
                }

                override isGrayed(Object element) {
                    return false
                }
            }

            // Checked column
            val checkColumn = createTableColumn(viewer, "Execute", 75)
            checkColumn.labelProvider = new ColumnLabelProvider() {
                override String getText(Object element) {
                    return "";
                }
            };
        } else {
            viewer = new TableViewer(table)
        }

        // Create columns
        val nameColumn = createTableColumn(viewer, "Name", 75)
        nameColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                val c = element as CommandData
                return c.name;
            }
        };

        val commandColumn = createTableColumn(viewer, "Command", 150)
        commandColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                val c = element as CommandData
                return c.command;
            }
        };

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()

        return viewer
    }

    /**
     * Creates a column for a table viewer with the given title and width.
     * 
     * @param viewer The TableViewer this column is added to
     * @param title The title for this column
     * @param width The width of this column
     * @return the created column.
     */
    public static def TableViewerColumn createTableColumn(TableViewer viewer, String title, int width) {
        val viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
        val column = viewerColumn.getColumn()
        column.setText(title);
        column.setWidth(width);
        column.setResizable(true);
        column.setMoveable(false);
        return viewerColumn
    }
    
    /**
     * Creates a button to move an element in a content viewer,
     * which uses an ArrayList as content, one element up.
     * 
     * @param parent The parent composite
     * @param viewer A ContentViewer with an ArrayList as input
     * @return the created button
     */
    public static def Button createUpButton(Composite parent, ContentViewer viewer) {
        val button = UIUtil.createButton(parent, "Up")
        button.addSelectionListener(new SelectionAdapter() {

            override widgetSelected(SelectionEvent e) {
                val inputArray = viewer.input as ArrayList<Object>
                val selection = viewer.selection as StructuredSelection
                if (selection != null) {
                    val index = inputArray.indexOf(selection.firstElement)
                    if (index > 0) {
                        Collections.swap(inputArray, index, index - 1)
                        viewer.refresh()
                    }
                }

            }
        })
        return button
    }

    /**
     * Creates a button to move an element in a content viewer,
     * which uses an ArrayList as content, one element down.
     * 
     * @param parent The parent composite
     * @param viewer A ContentViewer with an ArrayList as input
     * @return the created button
     */
    public static def Button createDownButton(Composite parent, ContentViewer viewer) {
        val button = createButton(parent, "Down")
        button.addSelectionListener(new SelectionAdapter() {

            override widgetSelected(SelectionEvent e) {
                val inputArray = viewer.input as ArrayList<Object>
                val selection = viewer.selection as StructuredSelection
                if (selection != null) {
                    val index = inputArray.indexOf(selection.firstElement)
                    if (index > -1 && index < inputArray.size - 1) {
                        Collections.swap(inputArray, index, index + 1)
                        viewer.refresh()
                    }
                }
            }
        })
        return button
    }

    /**
     * Creates a button to remove an element in a content viewer,
     * which uses an ArrayList as content.
     * 
     * @param parent The parent composite
     * @param viewer A ContentViewer with an ArrayList as input
     * @return the created button
     */
    public static def Button createRemoveButton(Composite parent, ContentViewer viewer) {
        val button = UIUtil.createButton(parent, "Remove")
        button.addSelectionListener(new SelectionAdapter() {

            override widgetSelected(SelectionEvent e) {
                val inputArray = viewer.input as ArrayList<Object>
                val selection = viewer.selection as StructuredSelection
                if (selection != null) {
                    inputArray.remove(selection.firstElement)
                    viewer.refresh()
                    viewer.selection = new StructuredSelection()
                }

            }
        })
        return button
    }

    /**
     * Creates a placeholder spanning over several columns in the parent's grid layout.
     * 
     * @param parent The parent composite
     * @param columnsToBeEmpty The number of columns which should be empty
     */
    public static def void createSpace(Composite parent, int columnsToBeEmpty) {
        SWTFactory.createHorizontalSpacer(parent, columnsToBeEmpty)
    }

    /**
     * Creates a checkbox.
     * 
     * @param parent The parent composite
     * @param label The label
     * @param checked The initial state of the Checkbox
     */
    public static def Button createCheckButton(Composite parent, String label, boolean checked) {
        return SWTFactory.createCheckButton(parent, label, null, checked, 1)
    }
    
    /**
     * Creates a button.
     * 
     * @param parent The parent composite
     * @param label The button's text
     * @return a new push button.
     */
    public static def Button createButton(Composite parent, String label) {
        return SWTFactory.createPushButton(parent, label, null)
    }

    /**
     * Creates a label.
     * 
     * @param parent The parent composite
     * @param label The label's text
     * @return a new label.
     */
    public static def Label createLabel(Composite parent, String label) {
        return SWTFactory.createLabel(parent, label, 1)
    }

    /**
     * Enable or disable all controls in the list and children recursive.
     * 
     * @param controls The list of controls to enable / disable
     * @param value The value of the enabled state which should be applied
     */
    public static def void enableControls(List<Control> controls, boolean value) {
        controls.forEach [
            enableControlAndChildrenRecursive(it, value)
        ]
    }

    /**
     * Enable or disable all controls in the list and the controls on the same level recursive.
     * A control is on the same level as an other control if both have the same parent.
     * 
     * @param controls The list of controls to enable / disable
     * @param value The value of the enabled state which should be applied
     */
    public static def void enableControlsOnSameLevel(List<Control> controls, boolean value) {

        controls.forEach [
            // We want to enable all controls on the same level as this control
            // (e.g. browse buttons for a text field).
            // Thus we set the field for all children of this control's parent.            
            it.parent.children.forEach [
                enableControlAndChildrenRecursive(it, value)
            ]
        ]
    }

    /**
     * Enable or disable a control and possible children recursive.
     * 
     * @param controls The list of controls to enable / disable
     * @param value The value of the enabled state which should be applied
     */
    public static def void enableControlAndChildrenRecursive(Control control, boolean value) {
        control.enabled = value
        if (control instanceof Composite) {
            control.children.forEach [
                enableControlAndChildrenRecursive(it, value)
            ]
        }
    }

    /**
     * Opens a file in an eclipse editor.
     * 
     * @param file The file to be opened
     */
    public static def void openFileInEditor(IFile file) {
        val wb = PlatformUI.getWorkbench();
        val win = wb.getActiveWorkbenchWindow();
        val page = win.getActivePage();
        IDE.openEditor(page, file)
    }
}