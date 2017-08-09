/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.railsl.ui.wizards

import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage
import java.net.URI
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import de.cau.cs.kieler.railsl.ui.natures.RailSLNature
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IFolder

/**
 * @author stu121235
 *
 */
class NewRailSLProjectWizard extends Wizard implements INewWizard {
    
    private var WizardNewProjectCreationPage page
    
    private val WINDOW_TITLE = "RailSL Project Wizard" 
    private val PAGE_TITLE = "New RailSL Project"
    private val PAGE_DESCRIPTION = "Create a new RailSL project with everything you need."
    
    private static val FOLDERS = #{"kieler-gen", "assets"}
    
    public new() {
        setWindowTitle(WINDOW_TITLE);
    }
    
    override performFinish() {
        var URI location = null
        if (!page.useDefaults) {
            location = page.locationURI
        }
        
        createProject(page.projectName, location)
        
        true
    }
    
    override init(IWorkbench workbench, IStructuredSelection selection) {
    }
    
    public override void addPages() {
        super.addPages
 
        page = new WizardNewProjectCreationPage(WINDOW_TITLE);
        page.setTitle(PAGE_TITLE);
        page.setDescription(PAGE_DESCRIPTION);
 
        addPage(page);
    }
    
    static def IProject createProject(String projectName, URI location) {
        var IProject project = createBaseProject(projectName, location)
        
        try {
            addNature(project)
            
            addToProjectStructure(project, FOLDERS)
            
            
        } catch (CoreException e) {
            e.printStackTrace
            project = null
        }
        
        return project
    }
    
    static def void createFolder(IFolder folder) throws CoreException {
        val parent = folder.parent
        if (parent instanceof IFolder) {
            createFolder(parent as IFolder)
        }
        if (!folder.exists) {
            folder.create(false, true, null)
        }
    }
    
    static def void addToProjectStructure(IProject project, String[] paths) throws CoreException {
        for (path : paths) {
            val folder = project.getFolder(path)
            folder.createFolder
        }
    }
    
    static def IProject createBaseProject(String projectName, URI location) {
        var IProject newProject = ResourcesPlugin.workspace.root.getProject(projectName)
        var projectLocation = location
        
        if (!newProject.exists) {
            val description = newProject.workspace.newProjectDescription(projectName)
            if (location != null && newProject.workspace.root.locationURI.equals(projectLocation)) {
                projectLocation = null
            }
            description.locationURI = projectLocation
            try {
                newProject.create(description, null)
                if (!newProject.isOpen) {
                    newProject.open(null)
                }
            } catch (CoreException e) {
                e.printStackTrace
            }
        }
        
        newProject
    }
    
    static def void addNature(IProject project) {
        if (!project.hasNature(RailSLNature::NATURE_ID)) {
            val description = project.description
            val prevNatures = description.natureIds
            val numOfNatures = prevNatures.length
            
            val String[] newNatures = ArrayLiterals.newArrayOfSize(numOfNatures + 1)
            
            System.arraycopy(prevNatures, 0, newNatures, 0, numOfNatures)
            newNatures.set(numOfNatures, RailSLNature::NATURE_ID)
            description.natureIds = newNatures
            
            project.setDescription(description, null)
        }
    }
    
}