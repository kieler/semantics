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
package de.cau.cs.kieler.prom.projectwizard

import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.filewizard.AdvancedNewFileCreationPage
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.io.File
import java.io.InputStream
import org.apache.commons.io.FileUtils
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
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.dialogs.PageChangingEvent
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchWizard

/**
 * Wizard implementation wich creates a project
 * and optionally initializes a model file and a main file by using enviroments.
 * Shows a main page to set the environment and snippets to be imported.
 * Then the related project wizard of the environment is run.
 * Afterwards there are pages to create a new model file and main file in the newly created project.
 * 
 * @author aas
 */
class PromProjectWizard extends Wizard implements IWorkbenchWizard {

    /**
     * The workbench set in the init(...) method.
     */
    protected var IWorkbench workbench
    /**
     * The selection set in the init(...) method.
     */
    protected var IStructuredSelection selection



    /**
     * The projects in the workspace before the related wizard of the environment was run.
     */
    protected var IProject[] projectsBeforeWizard
    
    /**
     * The project created by the wizard of the environment.
     */
    protected var IProject newlyCreatedProject


    
    /**
     * The main page of the wizard.
     * It is the first page.
     */
    protected var MainPage mainPage
    
    /**
     * The page to create a model file (e.g. for sct or esterel).
     */
    protected var AdvancedNewFileCreationPage modelFilePage
    
    /**
     * The page to create a main file with wrapper code to run the model.
     */
    protected var AdvancedNewFileCreationPage mainFilePage

    /**
     * @{inheritDoc}
     */
    override addPages() {
        mainPage = new MainPage("");
        addPage(mainPage);

        modelFilePage = createModelFileCreationPage()
        modelFilePage.openOnCreation = true
        addPage(modelFilePage)
        
        mainFilePage = createMainFileCreationPage()
        mainFilePage.openOnCreation = false
        addPage(mainFilePage)
    }

    /**
     * Creates the page to specify if and where the model file should be created.
     * 
     * @return the created page
     */
    protected def AdvancedNewFileCreationPage createModelFileCreationPage() {
        return new AdvancedNewFileCreationPage("Model File", selection, true)
    }
    
    /**
     * Creates the page to specify if and where the main file for wrapper code should be created.
     * 
     * @return the created page
     */
    protected def AdvancedNewFileCreationPage createMainFileCreationPage() {
        return new AdvancedNewFileCreationPage("Main File", selection, true)
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
                // From main page to model file creation
                // -> Start other wizard
                if (event.currentPage == mainPage && event.targetPage == modelFilePage) {
                    startWizard(mainPage.getEnvironmentWizardClassName())

                    // Update following pages
                    if(newlyCreatedProject != null){
                        event.doit = true
                        
                        // Fill following pages with data from the newly created project
                        modelFilePage.recreate()
                        modelFilePage.setContainerFullPath(new Path(newlyCreatedProject.name))
    
                        mainFilePage.recreate()
                        mainFilePage.setContainerFullPath(new Path(newlyCreatedProject.name))
                        
                        // Initialize pages with data from the environment's main file
                        val env = mainPage.selectedEnvironment
                        if(env.mainFile != ""){
                            val file = new File(env.mainFile)
                            mainFilePage.fileName = file.name
                            mainFilePage.initialContentsURL = env.mainFileOrigin
                            
                            // Set container for pages to directory of main file
                            val fileDir = file.parent
                            if(fileDir != null){
                                val sourceDirectory = new Path(newlyCreatedProject.name+File.separator+fileDir)
                                modelFilePage.setContainerFullPath(sourceDirectory)
                                mainFilePage.setContainerFullPath(sourceDirectory)
                            }
                        }
                    } else {
                        // Don't continue to next page if the other wizard was canceled 
                        event.doit = false
                    }
                    
                // From file creation to main
                // -> Remove created project
                } else if (event.currentPage == modelFilePage && event.targetPage == mainPage) {
                    deleteCreatedProject()
                }
            }
        })
    }

    /**
     * Returns true if the wizard can successfully be finished.
     * 
     * @return true if the current page is the model file creation page or the main file creation page
     *         and both pages are complete.
     */
    override canFinish() {
        return (container.currentPage == modelFilePage || container.currentPage == mainFilePage)
                && modelFilePage.isPageComplete
                && mainFilePage.isPageComplete
    }

    /**
     * Closes the wizard after creating the specified files
     * and copying the selected wrapper code snippets to the new project.
     * The used environment and main file is saved in the newly created project's properties.
     * 
     * @return true if everything finished successful
     */
    override performFinish() {
        // Create model file
        val isModelFileOk = createModelFile()
        // Create main file
        val isMainFileOk = createMainFile()
        // Copy templates to new project
        val isSnippetDirectoryOk = initializeSnippetDirectory()
        // Add some data to properties of new project
        val isProjectPropertiesOk = initializeProjectProperties()
        
        // If everything finished successful, the wizard can finish successful
        return isModelFileOk && isMainFileOk && isSnippetDirectoryOk && isProjectPropertiesOk;
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
    protected def void deleteCreatedProject(){
        if(newlyCreatedProject != null){
            newlyCreatedProject.delete(true, true, null)
            newlyCreatedProject = null
        }
    }

    /**
     * Creates the model file if the corresponding page has valid data.
     * 
     * @return true if the creation ended sucessfully. false otherwise.
     */
    protected def boolean createModelFile(){
        try {
            return modelFilePage.performFinish()
            
        } catch (Exception e) {
            MessageDialog.openError(shell, "Error", "The model file '"+modelFilePage.fileName+"' could not be created.\n"
                + "Check the container path and file name.");

            return false
        }
    }
    
    /**
     * Creates the main file if the corresponding page has valid data
     * and possibly initializes it with the contents of the used environment's main file origin.
     * 
     * @return true if the creation ended sucessfully. false otherwise.
     */
    protected def boolean createMainFile() {
        try {
            return mainFilePage.performFinish()
            
        } catch(Exception e) {
            MessageDialog.openError(shell, "Error", "The default content for the main file could not be loaded from\n"
                + "'"+mainFilePage.initialContentsURL+"'.\n"
                + "Check the environment settings in the preferences.");
            
            return false;
        }
    }

    /**
     * Creates the snippet directory of the used environment
     * and initializes it with the snippets from the selected environments of the main page.
     * 
     * @return true if it ended sucessfully. false otherwise.
     */
    protected def boolean initializeSnippetDirectory(){
        val env = mainPage.getSelectedEnvironment()
        
        // If the snippet directory of the environment is an absolute path,
        // we do not copy anything to the new project to initialize it.
        if(env.wrapperCodeSnippetsDirectory ==  "" || new File(env.wrapperCodeSnippetsDirectory).isAbsolute)
            return true;
        
        // Get environments of which the wrapper code snippets should be imported.
        val wrapperEnvironments = mainPage.getSelectedWrapperCodeEnvironments()
        for (wrapperEnv : wrapperEnvironments) {

            try {
                if (wrapperEnv.wrapperCodeSnippetsOrigin.trim().startsWith("platform:")) {
                    // Fill folder with files from plug-in
                    val snippetsDirectory = newlyCreatedProject.getFolder(wrapperEnv.wrapperCodeSnippetsDirectory)
                    initializeSnippetsFromDirectoryOfPlatformURL(snippetsDirectory, wrapperEnv.wrapperCodeSnippetsOrigin)
                    
                } else {
                    val source = new File(wrapperEnv.wrapperCodeSnippetsOrigin)
                    val target = new File(newlyCreatedProject.location + File.separator + wrapperEnv.wrapperCodeSnippetsDirectory)
                    
                    FileUtils.copyDirectory(source, target)
                }
                
            } catch (Exception e) {
                MessageDialog.openError(shell, "Error", "The default content for the snippet directory could not be loaded from\n"
                            + "'"+wrapperEnv.wrapperCodeSnippetsOrigin+"'.\n"
                            + "Check the environment settings in the preferences.");
                            
                return false
            }
        }
        
        return true;
    }

    /**
     * Sets the used environment and possibly created main file
     * to the properties of the newly created project.
     * This data is used by the launch configuration shortcut, to use as reasonable defaults.
     * 
     * @return true if it ended sucessfully. false otherwise.
     */
    protected def boolean initializeProjectProperties(){
        // Used environment name
        val env = mainPage.getSelectedEnvironment()
        newlyCreatedProject.setPersistentProperty(PromPlugin.ENVIRIONMENT_QUALIFIER, env.name)
        
        // Created main file
        if (mainFilePage.newFile != null){
            newlyCreatedProject.setPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER, mainFilePage.newFile.projectRelativePath.toOSString)
        }
        
        return true
    }

    /**
     * Creates a resource and all needed parent folders in a project.
     * The created resource is initialized with the inputs of the stream.
     * 
     * @param resource The resource handle to be created
     * @param stream Input stream with initial content for the resource
     */
    protected def void createResource(IResource resource, InputStream stream) throws CoreException {
        if (resource == null || resource.exists())
            return;

        if (!resource.getParent().exists())
            createResource(resource.getParent(), stream);

        switch(resource.getType()){
            case IResource.FILE:
                (resource as IFile).create(stream, true, null)
            case IResource.FOLDER:
                (resource as IFolder).create(IResource.NONE, true, null)
            case IResource.PROJECT: {
                (resource as IProject).create(null)
                (resource as IProject).open(null)
            }
        }
    }

    /**
     * Copies the contents of the resources from the platform url
     * to the snippet directory of the newly created project.
     * 
     * @param snippetsFolder The folder to be created and initialized
     * @param url URL to a plugin's directory with initial content for snippets
     */
    protected def void initializeSnippetsFromDirectoryOfPlatformURL(IFolder snippetsFolder, String url) throws Exception {
        // URL should be in form 'platform:/plugin/org.myplugin.bla/path/to/template/directory'

        val uriWithUnifiedSegmentSeparator = url.trim().replace("\\", "/")
        if (uriWithUnifiedSegmentSeparator.startsWith("platform:/plugin/")) {
            // Remove 'platform:/plugin/'
            val path = uriWithUnifiedSegmentSeparator.substring(17)

            // First segment is the bundle name,
            // followed by the path of the snippet directory.
            val index = path.indexOf("/")
            if (index > 0 && path.length > index + 1) {
                val bundleName = path.substring(0, index)
                val snippetDir = path.substring(index + 1)

                // Load bundle / plugin
                val bundle = Platform.getBundle(bundleName);

                // Copy files from bundle which are in sub directories of the snippet directory.
                val entries = bundle.findEntries(snippetDir, "*.*", true)
                if (entries != null) {
                    for (var e = entries; e.hasMoreElements();) {
                        val entry = e.nextElement
                        val fileUrl = FileLocator.toFileURL(entry)

                        // Get path from file relative to template path.
                        // The file must contain the template path because it is a file in this directory.
                        val i = fileUrl.toString.indexOf(snippetDir) + snippetDir.length
                        var relativePath = fileUrl.toString.substring(i)
                        if (relativePath.startsWith("/"))
                            relativePath = relativePath.substring(1)

                        // Create file in project with content of file from url
                        val stream = fileUrl.openStream()
                        val file = snippetsFolder.getFile(relativePath)
                        createResource(file, stream)
                        stream.close()
                    }
                } else {
                    throw new Exception("The directory '"+snippetDir+"'\n"
                        + "of the plugin '"+bundleName+"' does not exist or is empty.")
                }
            }
        }
    }

    /**
     * Compares the current projects with the projects
     * which existed before the environment's related project wizard has been opened.
     * 
     * @return the project that has been created since this wizard has been opened.
     */
    protected def IProject findNewlyCreatedProject() {
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
     * 
     * @param workbench The workbench
     * @param selection The selection
     */
    override init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench
        this.selection = selection

        windowTitle = "New Project"
        helpAvailable = false

        projectsBeforeWizard = ResourcesPlugin.workspace.root.projects
    }

    /**
     * Initializes and opens a project wizard which implemented by the fully qualified class name.
     * After the wizard has been finished the newly created project is set and initialized.
     * If there is no project wizard with the fully qualified class name,
     * the newly created project is set to null.
     * 
     * @param fullyQualifiedClassName The fully qualified class name
     */
    private def void startWizard(String fullyQualifiedClassName) {
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
     * Add resources to the newly created project.
     */
    private def void initializeNewProject(){
        if (newlyCreatedProject != null) {
            // Create folder for generated files
            val sourceFolder = newlyCreatedProject.getFolder(LaunchConfiguration.BUILD_DIRECTORY);
            sourceFolder.create(false, true, null);

            // Add folder to java class path if it is a java project
            if (newlyCreatedProject.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(newlyCreatedProject);
                addFolderToJavaClasspath(javaProject, sourceFolder)
            }
        }
    }
    
    /**
     * Adds a folder of a java project to the build path source folders.
     * 
     * @param javaProject The java project
     * @param sourceFolder The source folder to be added
     */
    private def void addFolderToJavaClasspath(IJavaProject javaProject, IFolder sourceFolder) {
        val root = javaProject.getPackageFragmentRoot(sourceFolder);
        val oldEntries = javaProject.getRawClasspath();
        val newEntries = newArrayOfSize(oldEntries.length + 1);
        System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
        newEntries.set(oldEntries.length, JavaCore.newSourceEntry(root.getPath()));
        javaProject.setRawClasspath(newEntries, null);
    }
}