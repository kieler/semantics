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
package de.cau.cs.kieler.sccharts.launchconfig.ui

import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.viewers.IStructuredContentProvider
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.Viewer
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import java.util.ArrayList
import com.google.common.collect.Lists
import java.util.List
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.DirectoryDialog
import org.eclipse.ui.dialogs.ContainerSelectionDialog
import org.eclipse.core.runtime.IPath
import javax.security.auth.login.Configuration.Parameters

/**
 * @author aas
 * 
 */
class SCTCompilationTab extends AbstractLaunchConfigurationTab {

    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createSCTFilesComponent(comp)
        createOutputFileComponent(comp)
        createOutputFileTemplateComponent(comp)
        createWrapperCodeComponent(comp)
    }

    private def createSCTFilesComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "SCT files", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        val list = new ListViewer(comp, SWT.SINGLE);
        list.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        list.setContentProvider(new IStructuredContentProvider() {

            override Object[] getElements(Object inputElement) {
                if (inputElement != null) {
                    return (inputElement as List).toArray
                } else {
                    return #[].toArray
                }
            }

            override void dispose() {
            }

            override inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            }

        });

        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val resource = (element as IResource)
                if (resource != null)
                    return resource.name
                else
                    return ""
            }
        });

        val bcomp = SWTFactory.createComposite(comp, comp.getFont(), 1, 3, GridData.HORIZONTAL_ALIGN_END, 0, 0)
        val add = createPushButton(bcomp, "Add...", null)
        add.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new ResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), "")
                    dialog.open()

                    val results = dialog.result
                    if (results != null) {
                        val List currentInput = list.input as List
                        val newInput = new ArrayList()
                        if (currentInput != null)
                            newInput.addAll(currentInput)
                        for (var i = 0; i < results.length; i++) {
                            val resource = results.get(i) as IResource
                            newInput.add(resource)
                        }
                        list.input = newInput
                    }

                }
            }
        )

        val remove = createPushButton(bcomp, "Remove", null)
        remove.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                if (list.list.selectionIndex != -1) {
                    list.list.remove(list.list.selectionIndex)
                }
            }
        })

        list.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                println("new selection " + selection)
            }
        });
    }

    private def createOutputFileComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Output file", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 1, 3, GridData.FILL_BOTH, 0, 0)

        val languageComp = SWTFactory.createComposite(comp, parent.getFont(), 8, 3, GridData.HORIZONTAL_ALIGN_BEGINNING,
            0, 0)
        SWTFactory.createLabel(languageComp, "Language", 4)
        SWTFactory.createCombo(languageComp, SWT.DROP_DOWN, 3, #["Java", "C"])

        val fileComp = SWTFactory.createComposite(comp, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)
        val text = SWTFactory.createSingleText(fileComp, 4)

        val browse = createPushButton(fileComp, "Browse...", null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        text.setText(result);
                    }
                }

            }
        )
    }

    private def createOutputFileTemplateComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Output file template", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        val text = SWTFactory.createSingleText(comp, 4)

        val browse = createPushButton(comp, "Browse...", null)
        browse.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        text.setText(result);
                    }
                }

            }
        )
    }

    private def createWrapperCodeComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Wrapper code generation", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 8, 3, GridData.FILL_BOTH, 0, 0)

        SWTFactory.createLabel(comp, "Input file", 3)
        val inputFile = SWTFactory.createSingleText(comp, 4)
        val browseInputFile = createPushButton(comp, "Browse...", null)
        browseInputFile.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        inputFile.setText(result);
                    }
                }

            }
        )

        SWTFactory.createLabel(comp, "Output file", 3)
        val outputFile = SWTFactory.createSingleText(comp, 4)
        val browseOutputFile = createPushButton(comp, "Browse...", null)
        browseOutputFile.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        outputFile.setText(result);
                    }
                }

            }
        )

        SWTFactory.createLabel(comp, "Annotation snippets directory", 3)
        val snippetsDir = SWTFactory.createSingleText(comp, 4)
        val browseSnippetsDir = createPushButton(comp, "Browse...", null)
        browseSnippetsDir.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new ContainerSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(),
                        false, "");

                    dialog.open();
                    val results = dialog.getResult()
                    if ((results != null) && (results.length > 0) && (results.get(0) instanceof IPath)) {
                        val path = results.get(0) as IPath;
                        val containerName = path.toOSString();
                        snippetsDir.setText(containerName);
                    }
                }

            }
        )
        
    }

    override getName() {
        return "SCT compilation"
    }

    override initializeFrom(ILaunchConfiguration configuration) {
    }

    override performApply(ILaunchConfigurationWorkingCopy configuration) {
    }

    override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }

}