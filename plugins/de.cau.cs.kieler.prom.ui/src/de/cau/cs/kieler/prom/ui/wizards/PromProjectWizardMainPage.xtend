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
package de.cau.cs.kieler.prom.ui.wizards

import de.cau.cs.kieler.prom.drafts.ProjectDraftData
import de.cau.cs.kieler.prom.drafts.PromProjectDrafts
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.prom.ui.UIUtil
import java.util.List
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite

/**
 * The main page for the project wizard.
 * It contains a control to select the project draft to use.
 * 
 * @author aas
 */
class PromProjectWizardMainPage extends WizardPage {

    /**
     * The project drafts loaded from this plugins preference store.
     */
    private List<ProjectDraftData> drafts

    /**
     * The combobox with the project drafts.
     */
    private ComboViewer draftsCombo

    /**
     * Checkbox to specify if a model file (e.g. SCT) should be created and initialized.
     */
    private Button createModelFileCheckbox
    
    /**
     * Checkbox to specify the initial resources of the project draft that should be created.
     */
    private Button createInitialResourcesCheckbox
    
    /**
     * Creates a new instance of this class with the given page name as title.
     * 
     * @param pageName The title for the page
     */
    new(String pageName) {
        super(pageName)

        title = pageName
        description = "Select the Project Draft to be used."
    }

    /**
     * {@inheritDoc}
     */
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        loadProjectDrafts()

        createProjectDraftComponent(comp)
        createProjectInitializationComponent(comp)
        
        pageComplete = true
    }

    /**
     * Loads the project drafts from this plugin's preference store. 
     */
    private def void loadProjectDrafts() {
        val store = PromUIPlugin.^default.preferenceStore

        // It might be that on a new installation there are no project drafts initialized.
        // So we do it here manually.
        if (ProjectDraftData.isPreferenceStoreEmpty(store))
            PromProjectDrafts.initializeDefaults()

        // Load project drafts from store
        drafts = ProjectDraftData.loadAllFromPreferenceStore(store)
    }

    /**
     * Creates a group with the project drafts combobox.
     * 
     * @param parent The parent compisite
     */
    private def void createProjectDraftComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project Draft", 1)

        draftsCombo = UIUtil.createProjectDraftCombo(group, drafts)

        // Information label
        UIUtil.createLabel(group, "A Project Draft specifies the following project wizard\n" +
            "and is used to initialize resources.\nThey are configured in the preferences.")
    }

    /**
     * Creates a group with checkboxes to specify the items that should be initialized.
     * 
     * @param parent The parent composite
     */
    private def void createProjectInitializationComponent(Composite parent) {
        val group = UIUtil.createGroup(parent, "Project initialization", 1)
        
        // Create model file components     
        createModelFileCheckbox = UIUtil.createCheckButton(group, "Create model file", true);
        createModelFileCheckbox.toolTipText = "Specify if the project should contain an initialized model file."

        // Initial resources components
        createInitialResourcesCheckbox = UIUtil.createCheckButton(group, "Create initial resources", true);
        createInitialResourcesCheckbox.toolTipText = "Initial resources specified in the Project Draft"
            + " will be imported to the new project."
    }
    
    /**
     * @return the selected project draft in the combobox.
     */
    public def ProjectDraftData getSelectedProjectDraft() {
        val selection = draftsCombo.getSelection();
        if (!selection.isEmpty()) {
            val structuredSelection = selection as IStructuredSelection
            return structuredSelection.getFirstElement() as ProjectDraftData
        } else {
            return null
        }
    }

    /**
     * @return the associated project wizard class name of the selected project draft in the combobox<br />
     *         or an empty string if there is no project draft selected. 
     */
    public def String getWizardClassName() {
        val env = getSelectedProjectDraft()
        if (env != null) {
            return env.associatedProjectWizardClass
        } else {
            return ""
        }
    }
    
    /**
     * Returns weather a model file should be created.
     * 
     * @return the selection state of the respective checkbox
     */
    public def boolean isCreateModelFile(){
        return createModelFileCheckbox.selection
    }

    /**
     * Returns weather the initial resources should be created. 
     * 
     * @return the selection state of the respective checkbox
     */
    public def boolean isCreateInitialResources(){
        return createInitialResourcesCheckbox.selection
    }
}