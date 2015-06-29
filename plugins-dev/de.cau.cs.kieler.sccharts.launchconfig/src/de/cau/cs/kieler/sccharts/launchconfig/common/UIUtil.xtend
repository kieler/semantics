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
package de.cau.cs.kieler.sccharts.launchconfig.common

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.StringVariableSelectionDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ContainerSelectionDialog
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/**
 * @author aas
 * 
 */
class UIUtil {

    public static val NONE = 0
    public static val PROJECT_BUTTON = 1 << 0
    public static val RESOURCE_BUTTON = 1 << 1
    public static val CONTAINER_BUTTON = 1 << 2
    public static val VARIABLE_BUTTON = 1 << 3
    public static val FILE_SYSTEM_FILE_BUTTON = 1 << 4

    static def createGroup(Composite parent, String text, int columns) {
        createGroup(parent, text, columns, GridData.FILL_HORIZONTAL)
    }

    static def createGroup(Composite parent, String text, int columns, int fill) {
        return SWTFactory.createGroup(parent, text, columns, 1, fill)
    }

    static def createComposite(Composite parent, int columns) {
        return createComposite(parent, columns, GridData.FILL_HORIZONTAL)
    }

    static def createComposite(Composite parent, int columns, int fill) {
        return SWTFactory.createComposite(parent, parent.font, columns, 1, fill, 0, 0)
    }

    static def createTextField(Composite parent, String label, int buttonFlags) {
        createTextField(parent, label, buttonFlags, null)
    }

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
        var browseVariableLabel = "Variables..."
        if (!moreThanOneButton) {
            browseProjectLabel = "Browse..."
            browseResourceLabel = "Browse..."
            browseContainerLabel = "Browse..."
        }

        if (isFlagSet(buttonFlags, UIUtil.PROJECT_BUTTON))
            createBrowseProjectButton(parent, text, browseProjectLabel)

        if (isFlagSet(buttonFlags, UIUtil.RESOURCE_BUTTON))
            createBrowseResourceButton(parent, text, browseResourceLabel, projectHolder)

        if (isFlagSet(buttonFlags, UIUtil.CONTAINER_BUTTON))
            createBrowseContainerButton(parent, text, browseContainerLabel, projectHolder)

        if (isFlagSet(buttonFlags, UIUtil.VARIABLE_BUTTON))
            createBrowseVariableButton(parent, text, browseVariableLabel)

        return text
    }

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

    static def createKiCoTargetsCombo(Composite parent){
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

    static def createSpace(Composite parent) {
        createSpace(parent, 1)
    }

    static def createSpace(Composite parent, int columnsToBeEmpty) {
        SWTFactory.createHorizontalSpacer(parent, columnsToBeEmpty)
    }

    static def createButton(Composite parent, String label) {
        return SWTFactory.createPushButton(parent, label, null)
    }

    private static def boolean isFlagSet(int bitmask, int flag) {
        return bitmask.bitwiseAnd(flag) > 0
    }

}

interface IProjectHolder {
    def IProject getProject()
}