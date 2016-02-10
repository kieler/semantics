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

import com.google.common.base.Strings
import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.ui.UIUtil
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration
import java.io.File
import java.io.InputStream
import org.apache.commons.io.FileUtils
import org.apache.commons.io.FilenameUtils
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Platform
import org.eclipse.jdt.core.IJavaProject
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
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.core.runtime.QualifiedName

/**op
 * Wizard implementation wich creates a project
 * and optionally initializes it by using enviroments.
 * Shows a main page to set the environment and with which files the new project should be initialized.
 * Then the related project wizard of the environment is run.
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
     * The projects in the workspace before the related wizard of the environment was run.
     */
    protected var IProject[] projectsBeforeWizard
    
    /**
     * The project created by the wizard of the environment.
     */
    protected var IProject newlyCreatedProject



    /**
     * The directory path of an initial model file for the new project
     */
    protected var String modelFileDirectory
    
    /**
     * The base file name of an initial model file for the new project
     */
     protected var String modelFileNameWithoutExtension
     
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
     * Dummy page to have the next button available.
     * Anyhow, this page is never reached.
     */
    protected var DummyPage secondPage

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
     * Opens the related wizard and initializes the newly created project of this wizard.
     * 
     * @return true if everything finished successful
     */
    override performFinish() {
        // Start other wizard
        startWizard(mainPage.getEnvironmentWizardClassName())
        
        // Continue only if project has been created
        if(newlyCreatedProject != null) {
            // Create model file
            val isModelFileOk = createModelFile()
            // Create main file
            val isMainFileOk = createMainFile()
            // Copy templates to new project
            val isSnippetDirectoryOk = initializeSnippetDirectory()
            // Add some data to properties of new project
            val isProjectPropertiesOk = initializeProjectProperties()
            
            // If everything finished successful, the wizard can finish successful
            val isOK = isModelFileOk && isMainFileOk && isSnippetDirectoryOk && isProjectPropertiesOk
            
            if(!isOK)
                deleteCreatedProject
            
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
        
        try {
            // Infere parent directory of file
            // from main file directory
            if(Strings.isNullOrEmpty(modelFileDirectory)){
                modelFileDirectory = ""
                val env = mainPage.selectedEnvironment
                if(env.mainFile != ""){
                    val file = new File(env.mainFile)
                    val fileDir = file.parent
                    if(fileDir != null)
                        modelFileDirectory = fileDir + File.separator
                }
            }
            
            // Infere file name from project name
            if(Strings.isNullOrEmpty(modelFileNameWithoutExtension)) {
                modelFileNameWithoutExtension = newlyCreatedProject.name
                // We use only alphanumeric characters of the project name
                modelFileNameWithoutExtension = modelFileNameWithoutExtension.replaceAll("[^\\w]", "")
                // the file name may not begin with a number
                modelFileNameWithoutExtension = modelFileNameWithoutExtension.replaceAll("^\\d*", "")
            }
            
            // Open initial content stream
            var InputStream initialContentStream = null
            if(!Strings.isNullOrEmpty(modelFileInitialContentURL)){
                initialContentStream = PromPlugin.getInputStream(modelFileInitialContentURL, #{"${name}" -> modelFileNameWithoutExtension})
            }
            
            // Create file
            val fileHandle = newlyCreatedProject.getFile(modelFileDirectory + modelFileNameWithoutExtension + modelFileExtension)
            createResource(fileHandle, initialContentStream)
            UIUtil.openFileInEditor(fileHandle)
            
            return true
            
        } catch (Exception e) {
            MessageDialog.openError(shell, "Error", "The model file '"+modelFileNameWithoutExtension+"' could not be created.\n"
                + "Please check the environment settings in the preferences and enter a valid file path.");

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
        // If the file should not be created, we are done immediately
        if(!mainPage.isCreateMainFile)
            return true
        
        val env = mainPage.selectedEnvironment
        try {
            if(!Strings.isNullOrEmpty(env.mainFile)){
                val resolvedMainFilePath = VariablesPlugin.getDefault().stringVariableManager.performStringSubstitution(env.mainFile)
                
                // Prepare initial content
                var InputStream initialContentStream = null
                if(!Strings.isNullOrEmpty(env.mainFileOrigin)){
                    val fileName = new File(resolvedMainFilePath).name
                    val fileNameWithoutExtension = FilenameUtils.removeExtension(fileName)
                    initialContentStream = PromPlugin.getInputStream(env.mainFileOrigin, #{"${file_name}" -> fileNameWithoutExtension})
                }
                
                // Create resource
                val fileHanlde = newlyCreatedProject.getFile(resolvedMainFilePath)
                createResource(fileHanlde, initialContentStream)
                
                // Remember created main file in project properties
                newlyCreatedProject.setPersistentProperty(PromPlugin.MAIN_FILE_QUALIFIER, resolvedMainFilePath)
            }
            
            return true
            
        } catch(Exception e) {
            MessageDialog.openError(shell, "Error", "The default content for the main file could not be loaded from\n"
                + "'"+env.mainFileOrigin+"'.\n"
                + "Please check the environment settings in the preferences and enter a valid file path.");
            
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
        // If the directory should not be initialized, we are done immediately
        if(!mainPage.isImportSnippets)
            return true
            
        val env = mainPage.getSelectedEnvironment()
        
        // If the snippet directory of the environment is an absolute path,
        // we do not copy anything to the new project to initialize it.
        if(env.wrapperCodeSnippetsDirectory ==  "" || new File(env.wrapperCodeSnippetsDirectory).isAbsolute)
            return true;
        
        // Get environments of which the wrapper code snippets should be imported.
        val wrapperEnv = mainPage.getSelectedEnvironment()
        if(wrapperEnv != null) {

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
                            + "Please check the environment settings in the preferences and enter a valid directory path.");
                            
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
        // Remember name of used environment.
        val env = mainPage.getSelectedEnvironment()
        newlyCreatedProject.setPersistentProperty(PromPlugin.ENVIRIONMENT_QUALIFIER, env.name)
        
        // The main file property is set in createMainFile().
        
        // Add Xtext nature to project (e.g. for SCCharts with cross-references)
        newlyCreatedProject.addNature("org.eclipse.xtext.ui.shared.xtextNature")
        
        return true
    }

    /**
     * Adds a nature to a project if the nature if not yet present.
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
            case IResource.FILE : {
                if(stream != null) {
                    (resource as IFile).create(stream, true, null)
                    stream.close()
                } else {
                    val stringStream = new StringInputStream("")
                    (resource as IFile).create(stringStream, true, null)
                    stringStream.close()
                }
            }
            case IResource.FOLDER :
                (resource as IFolder).create(IResource.NONE, true, null)
            case IResource.PROJECT : {
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

                        // Calculate the relative path of the file
                        // in the target snippet directory.
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
    
    private static class DummyPage extends WizardPage {
        
        protected new(String pageName) {
            super(pageName)
        }
        
        override createControl(Composite parent) {
            val comp = UIUtil.createComposite(parent, 1)
            control = comp
        }
    }
}