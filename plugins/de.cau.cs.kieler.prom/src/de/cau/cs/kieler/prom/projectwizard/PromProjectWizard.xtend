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
import de.cau.cs.kieler.prom.common.ui.UIUtil
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.Status
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.xtext.util.StringInputStream
import de.cau.cs.kieler.prom.builder.KiCoNature

/**op
 * Wizard implementation wich creates a project
 * and optionally initializes it by using enviroments.
 * Shows a main page to set the environment and with which files the new project should be initialized.
 * Then the associated project wizard of the environment is run.
 * 
 * @author aas
 */
class PromProjectWizard extends Wizard implements INewWizard {

    /**
     * The workbench set in the init(...) method.
     */
    protected var IWorkbench workbench
    /**
     * The selection set in the init(...) method.
     */
    protected var IStructuredSelection selection



    /**
     * The projects in the workspace before the associated wizard of the environment was run.
     */
    protected var IProject[] projectsBeforeWizard
    
    /**
     * The project created by the wizard of the environment.
     */
    protected var IProject newlyCreatedProject

     /**
     * The file extension (e.g. '.sct') of an initial model file for the new project
     */
    protected var String modelFileExtension
    
    /**
     * An platform URL or file path with initial contents for a model file for the new project
     */
    protected var String modelFileInitialContentURL


    
    /**
     * The main page of the wizard.
     * It is the first page.
     */
    protected var MainPage mainPage
    

    /**
     * The main file that has been created as part of this wizard
     */
    private IFile createdMainFile;


    /**
     * @{inheritDoc}
     */
    override addPages() {
        mainPage = new MainPage("");
        addPage(mainPage);
    }

    /**
     * {@inheritDoc}
     */
    override canFinish() {
        return true
    }

    /**
     * Opens the associated wizard and initializes the newly created project of this wizard.
     * 
     * @return true if everything finished successful
     */
    override performFinish() {
        // Start other wizard
        startWizard(mainPage.getEnvironmentWizardClassName())
        
        // Continue only if project has been created
        if(newlyCreatedProject != null) {
            // Create main file.
            // Create model file
            val isModelFileOk = createModelFile()
            // Create initial resources
            val isResourceCreationOk = createInitialResources()
            // Add some data to properties of new project
            val isProjectPropertiesOk = initializeProjectProperties()
            
            // If everything finished successful, the wizard can finish successful
            val isOK = isModelFileOk
                       && isResourceCreationOk
                       && isProjectPropertiesOk
            if(!isOK) {
                deleteCreatedProject()
            }
            
            return isOK
            
        } else {
            return false
        }
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
        // If the file should not be created, we are done immediately
        if(!mainPage.isCreateModelFile)
            return true
        
        // Load path of model file
        val modelFilePath = getModelFilePath()
        val modelFilePathWithoutExtension = new Path(modelFilePath).removeFileExtension
        val modelFileNameWithoutExtension = modelFilePathWithoutExtension.lastSegment
 
        try {
            // Open initial content stream
            var InputStream initialContentStream = null
            if(!modelFileInitialContentURL.isNullOrEmpty()){
                initialContentStream = PromPlugin.getInputStream(modelFileInitialContentURL, #{"${name}" -> modelFileNameWithoutExtension})
            }
            
            // Create file
            val fileHandle = newlyCreatedProject.getFile(modelFilePathWithoutExtension + modelFileExtension)
            PromPlugin.createResource(fileHandle, initialContentStream)
            UIUtil.openFileInEditor(fileHandle)

            return true
            
        } catch (Exception e) {
            MessageDialog.openError(shell, "Error", "The model file '"+modelFilePathWithoutExtension+"' could not be created.\n"
                + "Please check the environment settings in the preferences and enter a valid file path.");

            return false
        }
    }
    
    /**
     * Returns the model file path from the environment if it is not empty.
     * Otherwise a suited value is infered from the project name.
     * 
     * @return the path without file extension for the model file  
     */
    private def String getModelFilePath() {
        val env = mainPage.selectedEnvironment
        var resolvedPath = ""
        try {
            resolvedPath = PromPlugin.performStringSubstitution(env.modelFile, newlyCreatedProject)
        } catch (CoreException ce) {
            MessageDialog.openError(shell, "Error", ce.message)
            return "Model"
        }
        
        var modelFilePathWithoutExtension = resolvedPath
        if(modelFilePathWithoutExtension.isNullOrEmpty()) {
            // Infere parent directory of file from main file directory.
            // Therefore the main file has to be created before the model file.
            var modelFileDirectory = ""
            if(createdMainFile != null && createdMainFile.exists()){
                modelFileDirectory = createdMainFile.parent.projectRelativePath.toOSString + File.separator
            }
            
            // Infere file name from project name
            var modelFileNameWithoutExtension = newlyCreatedProject.name
            // We use only alphanumeric characters of the project name
            modelFileNameWithoutExtension = modelFileNameWithoutExtension.replaceAll("[^\\w]", "")
            // the file name may not begin with a number
            modelFileNameWithoutExtension = modelFileNameWithoutExtension.replaceAll("^\\d*", "")
            
            // Cobine directory and name of file
            modelFilePathWithoutExtension = modelFileDirectory + modelFileNameWithoutExtension
        }
        return modelFilePathWithoutExtension
    }
    
    /**
     * Creates the initial resources defined in the environment.
     * 
     * @return true if the creation ended sucessfully. false otherwise.
     */
    protected def boolean createInitialResources() {
        // If the resources should not be created, we are done immediately
        if(!mainPage.isCreateInitialResources)
            return true
        
        val env = mainPage.selectedEnvironment
        for(data : env.initialResources) {
            var resolvedProjectRelativePath = data.projectRelativePath
            try {
                if(!data.projectRelativePath.trim.isNullOrEmpty) {
                    try {
                        resolvedProjectRelativePath = PromPlugin.performStringSubstitution(data.projectRelativePath.trim, newlyCreatedProject)
                    } catch (CoreException ce) {
                        MessageDialog.openError(shell, "Error", ce.message)
                        return false
                    }
                    val path = new Path(resolvedProjectRelativePath)
                    val isFile = (path.fileExtension != null)
                    
                    if(isFile) {
                        // Create file
                        initializeFile(resolvedProjectRelativePath, data.origin)
                    } else {
                        // Create folder
                        initializeFolder(resolvedProjectRelativePath, data.origin)
                    }
                }
            } catch (Exception e) {
                e.printStackTrace()                
                
                var msg = "Could not initialize '" + resolvedProjectRelativePath +"'\n" 
                    + "with '" + data.origin + "'.\n"
                    + "Please make sure that all paths are valid."
                
                // Log error
                val bundle = Platform.getBundle(PromPlugin.ID)
                val log = Platform.getLog(bundle)
                log.log(new Status(Status.ERROR, PromPlugin.ID, msg, e))
                
                // Open dialog
                MessageDialog.openError(shell, "Error", msg)
                
                return false
            }
        }
        return true
    }
    
    /**
     * Creates a file in the new project with the content from the origin,
     * or an empty file if the origin is null or empty
     * 
     * @param projectRelativePath The project relative path of the resource to create
     * @param origin Optional path to initial content for the new file
     */
    private def void initializeFile(String projectRelativePath, String origin) {
        val resource = newlyCreatedProject.getFile(projectRelativePath)
       // Create empty file
       if(origin.trim.isNullOrEmpty) {
           PromPlugin.createResource(resource, null)
       } else {
           // Create file with initial content from origin
           val initialContentStream = PromPlugin.getInputStream(origin, null)
           PromPlugin.createResource(resource, initialContentStream)
       }
    }

    /**
     * Creates a folder in the new project with the content from the origin,
     * or an empty folder if the origin is null or empty
     * 
     * @param projectRelativePath The project relative path of the resource to create
     * @param origin Optional path to initial content for the new folder
     */
    private def void initializeFolder(String projectRelativePath, String origin) {
        if (origin.trim.startsWith("platform:")) {
            // Fill folder with files from plugin
            val newFolder = newlyCreatedProject.getFolder(projectRelativePath)
            initializeFolderViaPlatformURL(newFolder, origin)
        } else if(!origin.isNullOrEmpty) {
            // Copy directory from file system
            val source = new File(origin)
            val target = new File(newlyCreatedProject.location + File.separator + projectRelativePath)
            
            copyFolder(source, target)
        } else {
            // Create empty directory
            val newFolder = newlyCreatedProject.getFolder(projectRelativePath)
            PromPlugin.createResource(newFolder, null);
        }
    }

    /**
     * Copy the contents of a folder recursively.
     * 
     * @param src The source folder
     * @param dest The destination folder
     */
    def static private void copyFolder(File src, File dest) {
        // Checks
        if(src == null || dest == null)
            return;
        if(!src.isDirectory())
            return;
        if(dest.exists()){
            if(!dest.isDirectory()){
//                System.out.println("destination not a folder " + dest);
                return;
            }
        } else {
            dest.mkdirs();
        }
    
        if(src.listFiles() == null || src.listFiles().length == 0)
            return;
        
        for(File file : src.listFiles()){
            val fileDest = new File(dest, file.getName())
//            println(file.getAbsolutePath()+" --> "+fileDest.getAbsolutePath())
            if(file.isDirectory()){
                copyFolder(file, fileDest)
            }else if(!fileDest.exists()){
                try {
                    Files.copy(file.toPath(), fileDest.toPath())
                } catch (IOException e) {
                    e.printStackTrace()
                }
            }
        }
    }

    /**
     * Sets the used environment and possibly created main file
     * to the properties of the newly created project.
     * This data is used by the launch configuration shortcut, to use as reasonable defaults.
     * 
     * @return true if it ended sucessfully. false otherwise.
     */
    protected def boolean initializeProjectProperties() {
        // Remember name of used environment.
        val env = mainPage.getSelectedEnvironment()
        newlyCreatedProject.setPersistentProperty(PromPlugin.ENVIRIONMENT_QUALIFIER, env.name)
        
        // Remember created main file in project properties
        if(!env.launchData.mainFile.isNullOrEmpty) {
            var resolvedMainFilePath = ""
            try {
                resolvedMainFilePath = PromPlugin.performStringSubstitution(env.launchData.mainFile, newlyCreatedProject)
            } catch (CoreException ce) {
                MessageDialog.openError(shell, "Error", ce.message)
                return false
            }
            newlyCreatedProject.setPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER, resolvedMainFilePath)
        }
        
        // Add Xtext nature to project (e.g. for SCCharts with cross-references)
        newlyCreatedProject.addNature("org.eclipse.xtext.ui.shared.xtextNature")
        // Add KiCo nature to project (e.g. for builder)
        newlyCreatedProject.addNature(KiCoNature.NATURE_ID)
        
        return true
    }

    /**
     * Adds a nature to a project if the nature is not yet present.
     * 
     * @param project The project to add the nature to
     * @param newNature The nature that should be added
     */
    protected def void addNature(IProject project, String newNature) {
        if(!project.hasNature(newNature)) {
            try {
                // Get current natures of project
                val description = project.getDescription();
                val natures = description.getNatureIds();
                // Extend array of current natures and add new nature
                val newNatures = newArrayOfSize(natures.length + 1);
                System.arraycopy(natures, 0, newNatures, 0, natures.length);
                newNatures.set(natures.length, newNature);
                description.setNatureIds(newNatures);
                project.setDescription(description, null);
             } catch (CoreException e) {
                throw new Exception("Failed to add nature " + newNature + " to project " + project.name, e)
             }
         }
    }

    /**
     * Copies the contents of the resources from the platform url
     * to the folder of the newly created project.
     * 
     * @param newFolder The folder to be created and initialized
     * @param url URL to a plugin's directory with initial content for snippets
     */
    protected def void initializeFolderViaPlatformURL(IFolder newFolder, String url) throws Exception {
        // URL should be in form 'platform:/plugin/org.myplugin.bla/path/to/template/directory'

        val uriWithUnifiedSegmentSeparator = url.trim().replace("\\", "/")
        if (uriWithUnifiedSegmentSeparator.startsWith("platform:/plugin/")) {
            // Remove 'platform:/plugin/'
            val path = uriWithUnifiedSegmentSeparator.substring(17)

            // First segment is the bundle name,
            // followed by the path of the directory.
            val index = path.indexOf("/")
            if (index > 0 && path.length > index + 1) {
                val bundleName = path.substring(0, index)
                val dir = path.substring(index + 1)

                // Load bundle / plugin
                val bundle = Platform.getBundle(bundleName);

                // Copy files from bundle which are in the directory.
                val entries = bundle.findEntries(dir, "*.*", true)
                if (entries != null) {
                    for (var e = entries; e.hasMoreElements();) {
                        val entry = e.nextElement
                        val fileUrl = FileLocator.toFileURL(entry)

                        // Calculate the relative path of the file
                        // in the target snippet directory.
                        val i = fileUrl.toString.indexOf(dir) + dir.length
                        var relativePath = fileUrl.toString.substring(i)
                        if (relativePath.startsWith("/"))
                            relativePath = relativePath.substring(1)

                        // Create file in project with content of file from url
                        val stream = fileUrl.openStream()
                        val file = newFolder.getFile(relativePath)
                        PromPlugin.createResource(file, stream)
                        stream.close()
                    }
                } else {
                    throw new Exception("The directory '"+dir+"'\n"
                        + "of the plugin '"+bundleName+"' does not exist or is empty.")
                }
            }
        }
    }

    /**
     * Compares the current projects with the projects
     * which existed before the environment's associated project wizard has been opened.
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
            
            // Output an error message
            MessageDialog.openError(shell, "Project Wizard Not Found", "The project wizard '"+fullyQualifiedClassName+"'\n"
                + "of the selected environment could not be loaded.\n"
                + "Please install all required plugins."
            )
        }
    }
    
    /**
     * Add resources to the newly created project.
     */
    private def void initializeNewProject(){
        if (newlyCreatedProject != null) {
            createBuildDirectory()
        }
    }
    
    /**
     * Creates the output folder for compiled files
     */
    private def void createBuildDirectory() {
        val env = mainPage.selectedEnvironment
        val targetDirectory = env.launchData.targetDirectory
        if(!targetDirectory.isNullOrEmpty()) {
            // Create folder for generated files
            val sourceFolder = newlyCreatedProject.getFolder(targetDirectory);
            sourceFolder.create(false, true, null);
            
            // Add folder to java class path if it is a java project
            if (newlyCreatedProject.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(newlyCreatedProject);
                PromPlugin.addFolderToJavaClasspath(javaProject, sourceFolder)
            }
        }
    }
}