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
package de.cau.cs.kieler.sccharts.launchconfig.common.ui

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.sccharts.launchconfig.common.CommandData
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
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
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.DirectoryDialog
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ContainerSelectionDialog
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.ide.IDE

import static de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil.*

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
     * Flag to indicate that a text field should be created without any buttons.
     */
    public static val NONE = 0
    /**
     * Flag to indicate that a text field should be created with a button to open a project selection dialog.
     */
    public static val PROJECT_BUTTON = 1 << 0
    /**
     * Flag to indicate that a text field should be created with a button to open a resource selection dialog.
     */
    public static val RESOURCE_BUTTON = 1 << 1
    /**
     * Flag to indicate that a text field should be created with a button to open a container selection dialog.
     */
    public static val CONTAINER_BUTTON = 1 << 2
    /**
     * Flag to indicate that a text field should be created with a button to open a variable selection dialog.
     */
    public static val VARIABLE_BUTTON = 1 << 3
    /**
     * Flag to indicate that a text field should be created with a button to open a file selection dialog of the file system.
     */
    public static val FILE_SYSTEM_FILE_BUTTON = 1 << 4
    /**
     * Flag to indicate that a text field should be created with a button to open a folder selection dialog of the file system.
     */
    public static val FILE_SYSTEM_DIRECTORY_BUTTON = 1 << 5

    /**
     * Creates a new group for controls.
     * @return the new group.
     */
    static def createGroup(Composite parent, String text, int columns) {
        createGroup(parent, text, columns, GridData.FILL_HORIZONTAL)
    }

    /**
     * Creates a new group for controls.
     * @return the new group.
     */
    static def createGroup(Composite parent, String text, int columns, int fill) {
        return SWTFactory.createGroup(parent, text, columns, 1, fill)
    }

    /**
     * Creates a new group for controls.
     * @return the new group.
     */
    static def createComposite(Composite parent, int columns) {
        return createComposite(parent, columns, GridData.FILL_HORIZONTAL)
    }

    /**
     * Creates a new container for controls.
     * @return the new composite.
     */
    static def createComposite(Composite parent, int columns, int fill) {
        return SWTFactory.createComposite(parent, parent.font, columns, 1, fill, 0, 0)
    }

    /**
     * @see createTextField(Composite, String, int, IProjectHolder)
     */
    static def createTextField(Composite parent, String label, int buttonFlags) {
        createTextField(parent, label, buttonFlags, null)
    }

    /**
     * Creates a new text field with a label to describe it and buttons to modify it.
     * The label is created before the text field.
     * The buttons are created after the text field. 
     * 
     * @param parent The parent composite
     * @param label The label's text describing what this text field is for or null if there should not be a label.
     * @param buttonFlags A bitmask of the buttons that should be created to ease the modification of the text field.
     * @param projectHolder A class which holds a project reference to dynamically set the root of some dialogs (e.g. a resource selection dialog).
     * 
     * @return the new text field.
     */
    static def createTextField(Composite parent, String label, int buttonFlags, IProjectHolder projectHolder) {
        // Label
        if (label != null) {
            SWTFactory.createLabel(parent, label, 1)
        }

        // Text
        val text = SWTFactory.createSingleText(parent, 1)

        // Create buttons
        // Check if there should be more than one button.
        // (x & (x-1)) turns the rightmost 1 in x to 0.
        val moreThanOneButton = (buttonFlags.bitwiseAnd(buttonFlags - 1)) > 0
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

        if (isFlagSet(buttonFlags, UIUtil.PROJECT_BUTTON))
            createBrowseProjectButton(parent, text, browseProjectLabel)

        if (isFlagSet(buttonFlags, UIUtil.RESOURCE_BUTTON))
            createBrowseResourceButton(parent, text, browseResourceLabel, projectHolder)

        if (isFlagSet(buttonFlags, UIUtil.CONTAINER_BUTTON))
            createBrowseContainerButton(parent, text, browseContainerLabel, projectHolder)

        if (isFlagSet(buttonFlags, UIUtil.FILE_SYSTEM_FILE_BUTTON))
            createBrowseFileSystemButton(parent, text, browseFileSystemFileLabel, true)

        if (isFlagSet(buttonFlags, UIUtil.FILE_SYSTEM_DIRECTORY_BUTTON))
            createBrowseFileSystemButton(parent, text, browseFileSystemDirectoryLabel, false)

        if (isFlagSet(buttonFlags, UIUtil.VARIABLE_BUTTON))
            createBrowseVariableButton(parent, text, browseVariableLabel)

        return text
    }

    /**
     * Creates a button which opens a file or directory dialog and sets the text field's value to the selection.
     * @return the new push button. 
     */
    static def createBrowseFileSystemButton(Composite parent, Text text, String label, boolean isFileDialog) {
        val browse = SWTFactory.createPushButton(parent, label, null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {

                    var String result
                    if (isFileDialog) {
                        val dialog = new FileDialog(parent.shell, SWT.OPEN);
                        result = dialog.open()
                    } else {
                        val dialog = new DirectoryDialog(parent.shell, SWT.OPEN);
                        result = dialog.open
                    }
                    if (result != null && result != "") {
                        text.text = result
                    }
                }

            }
        )
    }

    /**
     * Creates a button which opens a project selection dialog and sets the text field's value to the selection.
     * @return the new push button. 
     */
    static def createBrowseProjectButton(Composite parent, Text text, String label) {
        val browse = SWTFactory.createPushButton(parent, label, null)
        browse.addSelectionListener(
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
        return browse
    }

    /**
     * Creates a button which opens a resource selection dialog and sets the text field's value to the selection.
     * @return the new push button. 
     */
    static def createBrowseResourceButton(Composite parent, Text text, String label, IProjectHolder projectHolder) {
        val browse = SWTFactory.createPushButton(parent, label, null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val rootElement = if (projectHolder == null && projectHolder.project != null)
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
        return browse
    }

    /**
     * Creates a button which opens a container dialog and sets the text field's value to the selection.
     * @return the new push button. 
     */
    static def createBrowseContainerButton(Composite parent, Text text, String label, IProjectHolder projectHolder) {
        val browse = SWTFactory.createPushButton(parent, label, null)
        browse.addSelectionListener(
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
        return browse
    }

    /**
     * Creates a button which opens a variable selection dialog and inserts the selection to the text field.
     * @return the new push button. 
     */
    static def createBrowseVariableButton(Composite parent, Text text, String label) {
        val browse = SWTFactory.createPushButton(parent, label, null)
        browse.addSelectionListener(new SelectionListener() {

            override void widgetSelected(SelectionEvent e) {
                val dialog = new StringVariableSelectionDialog(parent.shell)
                dialog.open()
                val variable = dialog.getVariableExpression()
                if (variable != null) {
                    text.insert(variable)
                }
            }

            override void widgetDefaultSelected(SelectionEvent e) {
            }
        })
        return browse
    }

    /**
     * Creates a combobox with the KiCo transformations for code generation.
     * @return a new combobox. 
     */
    static def createKiCoTargetsCombo(Composite parent) {
        // ComboViewer
        val combo = new ComboViewer(parent, SWT.DEFAULT)

        // Fetch possible targets from KiCo
        var Set<Transformation> transformations
        val feature = KielerCompiler.getFeature(CodeGenerationFeatures.TARGET_ID)
        if (feature != null) {
            transformations = feature.expandingTransformations
        }

        // Fill combo
        combo.contentProvider = ArrayContentProvider.instance
        combo.input = transformations

        // Select first element as default 
        if (transformations != null && transformations.size > 0) {
            combo.selection = new StructuredSelection(transformations.get(0))
        }

        // Label provider
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
     * Creates a combobox with the environments.
     * @return the new combobox.
     */
    static def createEnvironmentsCombo(Composite parent, List<EnvironmentData> environments) {
        // Combo
        val combo = new ComboViewer(parent, SWT.DEFAULT)
        combo.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Content provider
        combo.setContentProvider(ArrayContentProvider.instance)
        combo.input = environments

        if (!environments.isEmpty)
            combo.selection = new StructuredSelection(environments.get(0))

        // Label provider
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
     * @return the created table viewer 
     */
    static def createCommandTable(Composite parent, boolean checkboxes) {
        // Table
        val table = if (checkboxes)
                new Table(parent, SWT.CHECK.bitwiseOr(SWT.BORDER))
            else
                new Table(parent, SWT.BORDER)
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setLayoutData(new GridData(GridData.FILL_BOTH));

        // Viewer
        var TableViewer viewer
        if (checkboxes) {
            val checkViewer = new CheckboxTableViewer(table)
            viewer = checkViewer

            // Listener
            checkViewer.addCheckStateListener(new ICheckStateListener() {
                override checkStateChanged(CheckStateChangedEvent event) {
                    val comm = event.element as CommandData
                    comm.isEnabled = String.valueOf(!event.checked)
                }
            })

            // State provider
            checkViewer.checkStateProvider = new ICheckStateProvider() {

                override isChecked(Object element) {
                    val comm = element as CommandData
                    return Boolean.valueOf(comm.isEnabled)
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

        // Columns
        val nameColumn = createTableColumn(viewer, "Name", 150)
        nameColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                val c = element as CommandData
                return c.name;
            }
        };

        val commandColumn = createTableColumn(viewer, "Command", 300)
        commandColumn.labelProvider = new ColumnLabelProvider() {
            override String getText(Object element) {
                val c = element as CommandData
                return c.command;
            }
        };

        // Content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()

        return viewer
    }

    /**
     * Creates a column for a table viewer with the given title and width.
     * @return the created column.
     */
    static def createTableColumn(TableViewer viewer, String title, int width) {
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
     */
    static def createUpButton(Composite parent, ContentViewer viewer) {
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
     */
    static def createDownButton(Composite parent, ContentViewer viewer) {
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
     */
    static def createRemoveButton(Composite parent, ContentViewer viewer) {
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
     * Creates a placeholder.
     */
    static def createSpace(Composite parent) {
        createSpace(parent, 1)
    }

    /**
     * Creates a placeholder spanning over several columns in the parent's grid layout.
     */
    static def createSpace(Composite parent, int columnsToBeEmpty) {
        SWTFactory.createHorizontalSpacer(parent, columnsToBeEmpty)
    }

    /**
     * Creates a button.
     * @return a new push button.
     */
    static def createButton(Composite parent, String label) {
        return SWTFactory.createPushButton(parent, label, null)
    }

    /**
     * Creates a label.
     * @return a new label.
     */
    static def createLabel(Composite parent, String label) {
        return SWTFactory.createLabel(parent, label, 1)
    }

    /**
     * @return true if the flag in the bitmask is set.<br />
     *         false otherwise.
     */
    private static def boolean isFlagSet(int bitmask, int flag) {
        return bitmask.bitwiseAnd(flag) > 0
    }
    
    /**
     * @return bitmask where a bit is set if one of the input integers has this bit set.
     */
    public static def getBitmask(int... bits){
        return bits.fold(0)[a,b | a.bitwiseOr(b)]
    }

    /**
     * Enable or disable all controls in the list and children recursive.
     */
    public static def enableControls(List<Control> controls, boolean value) {
        controls.forEach [
            enableControlAndChildrenRecursive(it, value)
        ]
    }

    /**
     * Enable or disable all controls in the list and the controls on the same level recursive.
     * A control is on the same level as an other control if both have the same parent.
     */
    public static def enableControlsOnSameLevel(List<Control> controls, boolean value) {

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
     */
    public static def openFileInEditor(IFile file) {
        val wb = PlatformUI.getWorkbench();
        val win = wb.getActiveWorkbenchWindow();
        val page = win.getActivePage();
        IDE.openEditor(page, file)
    }
}