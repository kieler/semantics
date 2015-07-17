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
package de.cau.cs.kieler.sccharts.projectwizard

import de.cau.cs.kieler.sccharts.environments.Initializer
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil
import java.util.ArrayList
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label

/**
 * The main page for an SCCharts project wizard containing a control to select the environment to use
 * and the wrapper code snippets to copy to the new project.
 * 
 * @author aas
 * 
 */
class MainPage extends WizardPage {

    /**
     * The environments loaded from this plugins preference store.
     */
    var ArrayList<EnvironmentData> environments

    /**
     * The combobox with the environments.
     */
    var ComboViewer environmentsCombo

    /**
     * The multiselect list with all environments.
     * The wrapper code snippets from the selected environments in this list
     * will be copied to the newly created project. 
     */
    var ListViewer list

    protected new(String pageName) {
        super(pageName)

        title = pageName
        description = "Set the environment for the project."
    }

    /**
     * {@inheritDoc}
     */
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        loadEnvironments()

        createEnvironmentsComponent(comp)
        createWrapperCodeSnippetsComponent(comp)

        pageComplete = true
    }

    /**
     * Loads the environments from this plugin's preference store. 
     */
    private def loadEnvironments() {
        val store = LaunchConfigPlugin.^default.preferenceStore

        // It might be that on a new installation there are no environments initialized.
        // So we do it here manually.
        if (EnvironmentData.isPreferencesStoreEmpty(store))
            new Initializer().initializeDefaultPreferences()

        // Load environments from store
        environments = EnvironmentData.loadAllFromPreferenceStore(store)
    }

    /**
     * Creates a group with the environments combobox.
     */
    private def createEnvironmentsComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Environment", 1)

        environmentsCombo = UIUtil.createEnvironmentsCombo(group, environments)

        // Information label
        UIUtil.createLabel(group, "The environment specifies the following project wizard\n" +
            "and is used to initialize launches and resources.")
    }

    /**
     * Creates a group with the list of environments
     * to specify which wrapper code snippets should be created.
     */
    private def createWrapperCodeSnippetsComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Import wrapper code snippets", 1)

        // List
        list = new ListViewer(group, SWT.BORDER.bitwiseOr(SWT.MULTI).bitwiseOr(SWT.V_SCROLL))
        list.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))

        // Content provider
        list.setContentProvider(ArrayContentProvider.instance)
        val input = new ArrayList<EnvironmentData>()
        for (env : environments) {
            if (env.wrapperCodeSnippetsDirectory != "" && env.wrapperCodeSnippetsOrigin != "")
                input += env
        }
        list.input = input

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

        // Information label
        UIUtil.createLabel(group, "Wrapper code snippets of the selected environments\n" +
            "are copied to the new project to use them for wrapper code generation.")
    }

    /**
     * @return the selected environments in the list.
     */
    public def ArrayList<EnvironmentData> getSelectedWrapperCodeEnvironments() {
        val output = new ArrayList<EnvironmentData>()
        val selection = list.selection as StructuredSelection
        for (element : selection.toArray) {
            if (element instanceof EnvironmentData)
                output += element as EnvironmentData
        }
        return output
    }

    /**
     * @return the selected environment in the combobox.
     */
    public def EnvironmentData getSelectedEnvironment() {
        val selection = environmentsCombo.getSelection();
        if (!selection.isEmpty()) {
            val structuredSelection = selection as IStructuredSelection
            return structuredSelection.getFirstElement() as EnvironmentData
        } else {
            return null
        }
    }

    /**
     * @return the related project wizard class name of the selected environment in the combobox<br />
     *         or an empty string if there is no environment selected. 
     */
    public def String getEnvironmentWizardClassName() {
        val env = getSelectedEnvironment()
        if (env != null) {
            return env.relatedProjectWizardClass
        } else {
            return ""

        }
    }

}