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

import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.common.ExtensionLookupUtil
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.net.URL
import org.apache.commons.io.FileUtils
import org.apache.commons.io.IOUtils
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jface.dialogs.IPageChangingListener
import org.eclipse.jface.dialogs.PageChangingEvent
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchWizard
import org.osgi.framework.Bundle

/**
 * Wizard implementation for a new SCChart project.
 * Shows a main page to set the environment and snippets to be imported.
 * Then the related project wizard of the environment is run.
 * Afterwards there is a page to create a new sct file and main file in the newly created project.
 * 
 * @author aas
 * 
 */
class SCChartsProjectWizard extends Wizard implements IWorkbenchWizard {

    /**
     * The workbench set in the init(...) method.
     */
    private var IWorkbench workbench
    /**
     * The selection set in the init(...) method.
     */
    private var IStructuredSelection selection



    /**
     * The project in the workspace before the related wizard of the environment was run.
     */
    private var IProject[] projectsBeforeWizard
    
    /**
     * The project created by the related wizard of the environment.
     */
    private var IProject newlyCreatedProject


    
    /**
     * The file created with data from the main file creation page.
     */    
    private var IFile createdMainFile

    /**
     * The main page of the wizard.
     * It is the first page.
     */
    private var MainPage mainPage
    
    /**
     * The page to create a sct file in the newly created project.
     */
    private var OptionalSCTFileCreationPage sctFilePage
    
    /**
     * The page to create a main file for the newly created project.
     */
    private var OptionalMainFileCreationPage mainFilePage

    /**
     * @{inheritDoc}
     */
    override addPages() {
        mainPage = new MainPage("SCChart Project");
        addPage(mainPage);

        sctFilePage = new OptionalSCTFileCreationPage("SCCharts File", selection)
        addPage(sctFilePage)
        
        mainFilePage = new OptionalMainFileCreationPage("Main File", selection)
        addPage(mainFilePage)
    }

    /**
     * {@inheritDoc}
     */    
    override createPageControls(Composite pageContainer) {
        super.createPageControls(pageContainer)

        // Add page changing listener 
        val dialog = container as WizardDialog
        dialog.addPageChangingListener(new IPageChangingListener() {

            override handlePageChanging(PageChangingEvent event) {
                // From main page to sct file creation
                // -> Start other wizard
                if (event.currentPage == mainPage && event.targetPage == sctFilePage) {
                    startWizard(mainPage.getEnvironmentWizardClassName())

                    if(newlyCreatedProject != null){
                        event.doit = true
                        
                        // Fill following pages with data from the newly created project
                        sctFilePage.recreate()
                        sctFilePage.setContainerFullPath(new Path(newlyCreatedProject.name))
    
                        mainFilePage.recreate()
                        mainFilePage.setContainerFullPath(new Path(newlyCreatedProject.name))
                        
                        // Initialize pages with data from the environment's main file
                        val env = mainPage.selectedEnvironment
                        if(env.mainFile != ""){
                            val file = new File(env.mainFile)
                            mainFilePage.fileName = file.name
                            
                            // Set container for pages to directory of main file
                            val fileDir = file.parent
                            if(fileDir != null){
                                val sourceDirectory = new Path(newlyCreatedProject.name+"/"+fileDir)
                                sctFilePage.setContainerFullPath(sourceDirectory)
                                mainFilePage.setContainerFullPath(sourceDirectory)
                            }
                        }
                    } else {
                        // Don't continue to next page if the other wizard was canceled 
                        event.doit = false
                    }
                    
                // From file creation to main
                // -> Remove created project
                } else if (event.currentPage == sctFilePage && event.targetPage == mainPage) {
                    deleteCreatedProject()
                }
            }
        })
    }

    /**
     * Returns true if the wizard can successfully be finished.
     * @return true if the current page is the sct file creation page and this page is complete<br />
     *         or the current page is the main file creation page and this page is complete.
     */
    override canFinish() {
        return ((container.currentPage == sctFilePage) && sctFilePage.isPageComplete)
                || ((container.currentPage == mainFilePage) && mainFilePage.isPageComplete)
    }

    /**
     * Closes the wizard after creating the specified files
     * and copying the selected wrapper code snippets to the new project.
     * The used environment and main file is saved in the newly created project's properties.
     */
    override performFinish() {
        // Create sct file from sct page settings
        createSCTFile()
        // Create main file
        createMainFile()
        // Copy templates to new project
        initializeSnippetDirectory()
        // Add some data to properties of new project
        initializeProjectProperties()
        
        return true;
    }
    
    /**
     * {@inheritDoc}
     */
    override performCancel(){
        deleteCreatedProject()
        return true
    }
    
    /**
     * Deletes the newly created project.
     */
    private def deleteCreatedProject(){
        if(newlyCreatedProject != null){
            newlyCreatedProject.delete(true, true, null)
            newlyCreatedProject = null
        }
    }
    
    /**
     * Creates the sct file if the corresponding page has valid data.
     */
    private def createSCTFile(){
        if (sctFilePage.isOk()) {
            sctFilePage.performFinish()
        }
    }
    
    /**
     * Creates the main file if the corresponding page has valid data
     * and possibly initializes it with the contents of the used environment's main file origin.
     */
    private def createMainFile() {
        if (mainFilePage.isOk()) {
            // Create file
            createdMainFile = mainFilePage.createNewFile()
            
            // Fill with content from environment main file origin
            val env = mainPage.getSelectedEnvironment()
            if(env != null && env.mainFileOrigin != "" && createdMainFile != null){
                var InputStream mainFileOriginInput = null
                if (env.mainFileOrigin.trim().startsWith("platform:")) {
                    val url = new URL(env.mainFileOrigin);
                    mainFileOriginInput = url.openStream
                } else {
                    mainFileOriginInput = new FileInputStream(env.mainFileOrigin)
                }
                
                val out = new FileOutputStream(createdMainFile.location.toOSString);
                IOUtils.copy(mainFileOriginInput, out);
                mainFileOriginInput.close();
                out.close();
            }
        }
    }

    /**
     * Creates the snippet directory of the used environment
     * and initializes it with the snippets from the selected environments of the main page.
     */
    private def initializeSnippetDirectory(){
        val env = mainPage.getSelectedEnvironment()
        
        // If the snippet directory of the environment is an absolute path,
        // we do not copy anything to the new project to initialize it.
        if(env.wrapperCodeSnippetsDirectory ==  "" || new File(env.wrapperCodeSnippetsDirectory).isAbsolute)
            return;
        
        // Get environments of which the wrapper code snippets should be imported.
        val wrapperEnvironments = mainPage.getSelectedWrapperCodeEnvironments()
        for (wrapperEnv : wrapperEnvironments) {

            if (wrapperEnv.wrapperCodeSnippetsOrigin.trim().startsWith("platform:")) {
                // Fill folder with files from plug-in
                val snippetsDirectory = newlyCreatedProject.getFolder(wrapperEnv.wrapperCodeSnippetsDirectory)
                initializeSnippetsFromDirectoryOfPlatformURL(snippetsDirectory, wrapperEnv.wrapperCodeSnippetsOrigin)
            } else {
                val source = new File(wrapperEnv.wrapperCodeSnippetsOrigin)
                val target = new File(newlyCreatedProject.location + "/" + wrapperEnv.wrapperCodeSnippetsDirectory)
                FileUtils.copyDirectory(source, target)
            }
        }
    }

    /**
     * Sets the used environment and possibly created main file
     * to the properties of the newly created project.
     * This data is used by the SCCharts launch config shortcut to use as reasonable defaults.
     */
    private def initializeProjectProperties(){
        // Used environment name
        val env = mainPage.getSelectedEnvironment()
        newlyCreatedProject.setPersistentProperty(LaunchConfigPlugin.ENVIRIONMENT_QUALIFIER, env.name)
        
        // Created main file
        if (createdMainFile != null){
            newlyCreatedProject.setPersistentProperty(LaunchConfigPlugin.MAIN_FILE_QUALIFIER, createdMainFile.projectRelativePath.toOSString)
        }
    }

    /**
     * Creates a resource and all needed parent folders in a project.
     * The created resource is initialized with the inputs of the stream. 
     */
    private def void createResource(IResource resource, InputStream stream) throws CoreException {
        if (resource == null || resource.exists())
            return;

        if (!resource.getParent().exists())
            createResource(resource.getParent(), stream);

        val type = resource.getType()
        if (type == IResource.FILE)
            (resource as IFile).create(stream, true, null)
        else if (type == IResource.FOLDER)
            (resource as IFolder).create(IResource.NONE, true, null)
        else if (type == IResource.PROJECT) {
            (resource as IProject).create(null)
            (resource as IProject).open(null)
        }
    }

    /**
     * Copies the contents of the resources from the platform url
     * to the snippet directory of the newly created project. 
     */
    private def initializeSnippetsFromDirectoryOfPlatformURL(IFolder snippetsFolder, String url) {
        // URL should be in form 'platform:/plugin/org.myplugin.bla/path/to/template/directory'

        val uriWithUnifiedSegmentSeparator = url.trim().replace("\\", "/")
        if (uriWithUnifiedSegmentSeparator.startsWith("platform:/plugin/")) {
            // Remove 'platform:/plugin/'
            val path = uriWithUnifiedSegmentSeparator.substring(17)

            // First segment is the bundle name
            val index = path.indexOf("/")
            if (index > 0 && path.length > index + 1) {
                val bundleName = path.substring(0, index)
                val templatePath = path.substring(index + 1)

                // Load bundle / plugin
                var Bundle bundle
                try {
                    bundle = Platform.getBundle(bundleName);
                } catch (Exception e) {
                    e.printStackTrace()
                    return;
                }

                // Copy files from bundle which are in sub directories of the template path.
                val entries = bundle.findEntries(templatePath, "*.*", true)
                if (entries != null) {
                    for (var e = entries; e.hasMoreElements();) {
                        val entry = e.nextElement
                        val fileUrl = FileLocator.toFileURL(entry)

                        // Get path from file relative to template path.
                        // The file must contain the template path because it is a file in this directory.
                        val i = fileUrl.toString.indexOf(templatePath) + templatePath.length
                        var relativePath = fileUrl.toString.substring(i)
                        if (relativePath.startsWith("/"))
                            relativePath = relativePath.substring(1)

                        // Create file in project with content of file from url
                        val stream = fileUrl.openStream()
                        val file = snippetsFolder.getFile(relativePath)
                        createResource(file, stream)
                        stream.close()
                    }
                }
            }
        }
    }

    /**
     * Adds a folder resource of a java project to the project's build path source folders.
     */
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
     */
    private def IProject findNewlyCreatedProject() {
        // The other project wizard does not return any information about what has been created.
        // -> Compare the list of current projects with projects from before the wizard was run.
        // Return project that is not in the list of old projects.
        for (project : ResourcesPlugin.workspace.root.projects) {
            if (!projectsBeforeWizard.contains(project)) {
                return project
            }
        }
    }

    /**
     * Implementation of IWorkbenchWizard. 
     */
    override init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench
        this.selection = selection

        windowTitle = "New SCCharts Project"
        helpAvailable = false

        projectsBeforeWizard = ResourcesPlugin.workspace.root.projects
    }

    /**
     * Initializes and opens a project wizard which implemented by the fully qualified class name.
     * After the wizard has been finished the newly created project is set and initialized.
     * If there is no project wizard with the fully qualified class name,
     * the newly created project is set to null.
     */
    private def startWizard(String fullyQualifiedClassName) {
        val wizard = ExtensionLookupUtil.getWizard(fullyQualifiedClassName)
        if (wizard != null) {
            // Open the wizard.
            wizard.init(workbench, selection)
            val dialog = new WizardDialog(shell, wizard)
            dialog.open()

            // Find new project.
            newlyCreatedProject = findNewlyCreatedProject()
            
            // Initialize new project.
            initializeNewProject()
        } else {
            newlyCreatedProject = null
        }
    }
    
    /**
     * Add resources for an SCCharts project to the newly created project.
     */
    private def initializeNewProject(){
        if (newlyCreatedProject != null) {
            // Create folder for sct generated files
            val sourceFolder = newlyCreatedProject.getFolder(LaunchConfiguration.BUILD_DIRECTORY);
            sourceFolder.create(false, true, null);

            // Add folder to java class path if it is a java project
            if (newlyCreatedProject.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(newlyCreatedProject);
                addFolderToJavaClasspath(javaProject, sourceFolder)
            }
        }
    }
}