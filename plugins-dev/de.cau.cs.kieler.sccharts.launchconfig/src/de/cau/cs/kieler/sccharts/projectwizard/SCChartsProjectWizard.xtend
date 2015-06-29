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

import de.cau.cs.kieler.sccharts.filewizard.SCTFileCreationPage
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.common.ExtensionLookupUtil
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.IWizardPage
import org.eclipse.jface.wizard.Wizard
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchWizard

/**
 * @author aas
 * 
 */
class SCChartsProjectWizard extends Wizard implements IWorkbenchWizard {

    private var IWorkbench workbench
    private var IStructuredSelection selection
    private var IProject[] projectsBeforeWizard

    override addPages() {
        val mainPage = new MainPage("SCChart Project");
        addPage(mainPage);
        
        val sctFilePage = new SCTFileCreationPage("SCCharts File", selection) 
        addPage(sctFilePage)
    }

    override performFinish() {
        println("Finish him!")
        try {
//            startWizard("org.eclipse.jdt.internal.ui.wizards.JavaProjectWizard")
            startWizard("org.lejos.nxt.ldt.wizard.NewNXTProject")

            // Check if and which project has been created 
            // and add information of the sccharts wizard to it.
            val project = getNewlyCreatedProject()
            if (project != null) {
                // Create folder for sct generated files
                val sourceFolder = project.getFolder(LaunchConfiguration.BUILD_DIRECTORY);
                sourceFolder.create(false, true, null);

                // Add folder to java class path if it is a java project
                if (project.hasNature(JavaCore.NATURE_ID)) {
                    val javaProject = JavaCore.create(project);
                    addFolderToJavaClasspath(javaProject, sourceFolder)
                }
            }

        } catch (Exception e) {
            e.printStackTrace()
        }
        return true;
    }

    private def addFolderToJavaClasspath(IJavaProject javaProject, IFolder sourceFolder) {
        val root = javaProject.getPackageFragmentRoot(sourceFolder);
        val oldEntries = javaProject.getRawClasspath();
        val newEntries = newArrayOfSize(oldEntries.length + 1);
        System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
        newEntries.set(oldEntries.length, JavaCore.newSourceEntry(root.getPath()));
        javaProject.setRawClasspath(newEntries, null);
    }

    /**
     * Return the project that has been created since this wizard has been opened.
     * 
     */
    private def IProject getNewlyCreatedProject() {
        // The other project wizard does not return any information about what has been created.
        // So we compare list of current projects with projects from before the wizard was run.
        // Return project that is not in the list of old projects.
        for (project : ResourcesPlugin.workspace.root.projects) {
            if (!projectsBeforeWizard.contains(project)) {
                return project
            }
        }
    }

    override init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench
        this.selection = selection
        
        windowTitle = "New SCCharts Project"
        helpAvailable = false

        projectsBeforeWizard = ResourcesPlugin.workspace.root.projects
    }

    override getNextPage(IWizardPage page){
        println("Getting next page. Current page is "+page.title)
        return super.getNextPage(page)
    }

    private def startWizard(String fullyQualifiedClassName) {
        val wizard = ExtensionLookupUtil.getWizard(fullyQualifiedClassName)
        if (wizard != null) {
            // Open the wizard
            wizard.init(workbench, selection)
            val dialog = new WizardDialog(shell, wizard)
            dialog.open()
        }
    }
}