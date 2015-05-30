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

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.SCTCompilationData
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.util.ArrayList
import java.util.List
import java.util.Set
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
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
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ContainerSelectionDialog
import org.eclipse.ui.dialogs.ResourceSelectionDialog

/**
 * @author aas
 * 
 */
class SCTCompilationTab extends AbstractLaunchConfigurationTab {

    private var ListViewer list

    private var ComboViewer targetLanguage
    private var Text targetPath
    private var Button browseTargetPath

    private var Text targetTemplate
    private var Button browseTargetTemplate

    private var Text wrapperCodeTemplate
    private var Button browseWrapperCodeTemplate
    private var Text wrapperCodeTarget
    private var Button browseWrapperCodeTarget
    private var Text wrapperCodeSnippets
    private var Button browseWrapperCodeSnippets

    private var SCTCompilationData currentData

    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)
 
        comp.setLayout(new GridLayout(1, true))
        comp.setFont(parent.getFont())

        createSCTFilesComponent(comp)
        createTargetComponent(comp)
        createTargetTemplateComponent(comp)
        createWrapperCodeComponent(comp)

        // Disable controls
        enableControls(false)
    }

    private def createSCTFilesComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "SCT files", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_HORIZONTAL, 0, 0)

        // List for SCT files
        list = new ListViewer(comp, SWT.DEFAULT)
        list.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Content provider
        list.setContentProvider(ArrayContentProvider.instance);

        // Label provider
        list.setLabelProvider(new LabelProvider() {
            override String getText(Object element) {
                val data = (element as SCTCompilationData)
                if (data != null)
                    return data.name
                else
                    return ""
            }
        });

        // Selection event
        list.addSelectionChangedListener(new ISelectionChangedListener() {
            override void selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                currentData = selection.firstElement as SCTCompilationData
                updateControls(currentData)
            }
        });

        // Buttons
        val bcomp = SWTFactory.createComposite(comp, comp.getFont(), 1, 3, GridData.HORIZONTAL_ALIGN_END, 0, 0)

        // Add Button
        val add = createPushButton(bcomp, "Add...", null)
        add.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new ResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), "Select SCT files that should be compiled.")
                    dialog.open()

                    val results = dialog.result
                    if (results != null) {
                        val List<SCTCompilationData> currentInput = list.input as List<SCTCompilationData>
                        val newInput = new ArrayList()
                        if (currentInput != null)
                            newInput.addAll(currentInput)

                        // Add resources to the gui list
                        for (var i = 0; i < results.length; i++) {
                            val resource = results.get(i) as IResource
                            val path = resource.location.toOSString
                            val name = resource.name

                            // The ResourceSelectionDialog does not provide filter funcionality so we do this here manually
                            var isOK = resource.fileExtension.toLowerCase == "sct"
                            for (SCTCompilationData d : currentInput) {
                                if (d.path == path)
                                    isOK = false
                            }

                            // Add if not filtered
                            if (isOK)
                                newInput.add(new SCTCompilationData(path, name))
                            else
                                println("Resource '" + resource.name + "' is no SCT file or already in list!")
                        }
                        list.input = newInput
                    }

                }
            }
        )

        // Remove Button
        val remove = createPushButton(bcomp, "Remove", null)
        remove.addSelectionListener(new SelectionAdapter() {
            override void widgetSelected(SelectionEvent e) {
                val currentInput = list.input as List<SCTCompilationData>
                if (currentInput != null) {
                    val newInput = newArrayList()
                    currentInput.forEach [
                        if (it != currentData)
                            newInput += it
                    ]
                    list.input = newInput
                    list.selection = new StructuredSelection()

                }
            }
        })
    }

    private def createTargetComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Output file", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 1, 3, GridData.FILL_BOTH, 0, 0)

        // Target language
        val languageComp = SWTFactory.createComposite(comp, parent.getFont(), 8, 3, GridData.HORIZONTAL_ALIGN_BEGINNING,
            0, 0)
        SWTFactory.createLabel(languageComp, "Language", 5)
        
        // Create ComboViewer
        targetLanguage = new ComboViewer(comp, SWT.DEFAULT)
        
        // Fetch possible targets from KiCo
        var Set<Transformation> transformations
        val feature = KielerCompiler.getFeature(CodeGenerationFeatures.TARGET_ID)
        println(feature)
        if(feature != null){
            transformations = feature.expandingTransformations
        }
        
        // Fill combo
        targetLanguage.contentProvider = ArrayContentProvider.instance
        targetLanguage.input = transformations
        if(transformations != null && transformations.size > 0){
            targetLanguage.selection = new StructuredSelection(transformations.get(0))
        }
        
        // Label provider
        targetLanguage.labelProvider = new LabelProvider() {
            override String getText(Object element) {
                val data = (element as Transformation)
                if (data != null)
                    return data.name
                else
                    return ""
            }
        }
        
        // Selection listener
        targetLanguage.addSelectionChangedListener(new ISelectionChangedListener{
            
            override selectionChanged(SelectionChangedEvent event) {
                val selection = event.selection as IStructuredSelection
                if (selection != null){
                    val trans = selection.firstElement as Transformation
                    if(trans != null){
                        currentData.targetLanguage = trans.id
                        updateLaunchConfigurationDialog();    
                    }
                }
            }
            
        })

        // Target path
        val fileComp = SWTFactory.createComposite(comp, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)
        targetPath = SWTFactory.createSingleText(fileComp, 4)
        targetPath.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                currentData.targetPath = targetPath.text
                updateLaunchConfigurationDialog();
            }
        })

        // Browse
        browseTargetPath = createPushButton(fileComp, "Browse...", null)
        browseTargetPath.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        targetPath.setText(result);
                    }
                }

            }
        )
    }

    private def createTargetTemplateComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Output file template", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 5, 3, GridData.FILL_BOTH, 0, 0)

        // Output file template
        targetTemplate = SWTFactory.createSingleText(comp, 4)
        targetTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                currentData.targetTemplate = targetTemplate.text
                updateLaunchConfigurationDialog();
            }
        })

        // Browse
        browseTargetTemplate = createPushButton(comp, "Browse...", null)
        browseTargetTemplate.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        targetTemplate.setText(result);
                    }
                }

            }
        )
    }

    private def createWrapperCodeComponent(Composite parent) {
        val group = SWTFactory.createGroup(parent, "Wrapper code generation", 1, 2, GridData.FILL_HORIZONTAL)
        val comp = SWTFactory.createComposite(group, parent.getFont(), 8, 3, GridData.FILL_BOTH, 0, 0)

        // Input file
        SWTFactory.createLabel(comp, "Input file", 3)
        wrapperCodeTemplate = SWTFactory.createSingleText(comp, 4)
        wrapperCodeTemplate.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                currentData.wrapperCodeTemplate = wrapperCodeTemplate.text
                updateLaunchConfigurationDialog();
            }
        })

        browseWrapperCodeTemplate = createPushButton(comp, "Browse...", null)
        browseWrapperCodeTemplate.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        wrapperCodeTemplate.setText(result);
                    }
                }

            }
        )

        // Output file
        SWTFactory.createLabel(comp, "Output file", 3)
        wrapperCodeTarget = SWTFactory.createSingleText(comp, 4)
        wrapperCodeTarget.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                currentData.wrapperCodeTargetPath = wrapperCodeTarget.text
                updateLaunchConfigurationDialog();
            }
        })

        browseWrapperCodeTarget = createPushButton(comp, "Browse...", null)
        browseWrapperCodeTarget.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new FileDialog(parent.shell, SWT.SAVE)
                    val result = dialog.open()
                    if (result != null) {
                        wrapperCodeTarget.setText(result);
                    }
                }

            }
        )

        // Directory with snippet definitions
        SWTFactory.createLabel(comp, "Annotation snippets directory", 3)
        wrapperCodeSnippets = SWTFactory.createSingleText(comp, 4)
        wrapperCodeSnippets.addModifyListener(new ModifyListener() {
            override modifyText(ModifyEvent e) {
                currentData.wrapperCodeSnippetsDirectory = wrapperCodeSnippets.text
                updateLaunchConfigurationDialog();
            }
        })

        browseWrapperCodeSnippets = createPushButton(comp, "Browse...", null)
        browseWrapperCodeSnippets.addSelectionListener(
            new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    val dialog = new ContainerSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(),
                        false, "");

                    dialog.open();
                    val results = dialog.getResult()
                    if ((results != null) && (results.length > 0) && (results.get(0) instanceof IPath)) {
                        val path = results.get(0) as IPath;
                        val containerName = path.toOSString();
                        wrapperCodeSnippets.setText(containerName);
                    }
                }

            }
        )

    }

    override getName() {
        return "SCT Compilation"
    }

    override initializeFrom(ILaunchConfiguration configuration) {
        list.input = SCTCompilationData.loadAllFromConfiguration(configuration)
    }
    
    override activated(ILaunchConfigurationWorkingCopy workingCopy) {
        super.activated(workingCopy)
        currentData= null
        enableControls(false)
    }

    override performApply(ILaunchConfigurationWorkingCopy configuration) {
        val datas = list.input as List<SCTCompilationData>
        if (datas != null && !datas.isEmpty) {
            val List<String> sctFiles = newArrayList()
                
            datas.forEach [
                sctFiles += it.path
                configuration.setAttribute(it.path, it.attributeMap)
            ]
            configuration.setAttribute(LaunchConfiguration.ATTR_SCT_FILES, sctFiles)
        }
    }

    override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }

    private def updateControls(SCTCompilationData data) {
        enableControls(data != null)
        if (data != null) {
            // Target language
            if(targetLanguage.input != null){
                for(transformation : targetLanguage.input as Iterable<Transformation>){
                    if(transformation.id == data.targetLanguage){
                        targetLanguage.selection = new StructuredSelection(transformation)
                    }
                }
            }

            targetPath.text = data.targetPath
            targetTemplate.text = data.targetTemplate

            // Wrapper code
            wrapperCodeTemplate.text = data.wrapperCodeTemplate
            wrapperCodeTarget.text = data.wrapperCodeTargetPath
            wrapperCodeSnippets.text = data.wrapperCodeSnippetsDirectory
        }
    }

    private def enableControls(boolean enable) {
        val List<Control> controls = #[targetLanguage.combo, targetPath, targetTemplate, wrapperCodeTemplate, wrapperCodeTarget,
            wrapperCodeSnippets, browseTargetPath, browseTargetTemplate, browseWrapperCodeSnippets,
            browseWrapperCodeTarget, browseWrapperCodeTemplate]
        controls.forEach[it.enabled = enable]
    }

}