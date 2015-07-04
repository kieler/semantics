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
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfigPlugin
import de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration
import de.cau.cs.kieler.sccharts.launchconfig.common.ExtensionLookupUtil
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.net.URL
import org.apache.commons.io.FileUtils
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.FileLocator
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
import org.eclipse.core.resources.IFile
import org.eclipse.xtext.util.StringInputStream

/**
 * @author aas
 * 
 */
class SCChartsProjectWizard extends Wizard implements IWorkbenchWizard {

    private var IWorkbench workbench
    private var IStructuredSelection selection

    private var IProject[] projectsBeforeWizard
    private var IProject newlyCreatedProject

    private var MainPage mainPage
    private var SCTFileCreationPage sctFilePage

    override createPageControls(Composite pageContainer) {
        super.createPageControls(pageContainer)

        // Add page changing listener 
        val dialog = container as WizardDialog
        dialog.addPageChangingListener(new IPageChangingListener() {

            override handlePageChanging(PageChangingEvent event) {
                // From main to file creation
                // -> Start other wizard
                if (event.currentPage == mainPage && event.targetPage == sctFilePage) {
                    startWizard(mainPage.getEnvironmentWizardClassName())

                    sctFilePage.refreshResources
                    sctFilePage.fileName = ""

                    // Don't continue to next page if the other wizard was canceled 
                    event.doit = (newlyCreatedProject != null)
                }

                // From file creation to main
                // -> Remove created project
                if (event.currentPage == sctFilePage && event.targetPage == mainPage) {
                    newlyCreatedProject.delete(true, true, null)
                    newlyCreatedProject = null
                }
            }
        })
    }

    override addPages() {
        mainPage = new MainPage("SCChart Project");
        addPage(mainPage);

        sctFilePage = new SCTFileCreationPage("SCCharts File", selection)
        addPage(sctFilePage)
    }

    override canFinish() {
        return container.currentPage == sctFilePage
    }

    override performFinish() {
        // Create sct file 
        if (sctFilePage.isOk()) {

            sctFilePage.performFinish()
        }

        // Create main file of environment
        val env = mainPage.getSelectedEnvironment()
        if (env != null) {
            if (env.mainFile != "" && env.mainFileOrigin != "") {

                var InputStream mainFileOriginInput = null
                if (env.mainFileOrigin != "") {
                    if (env.mainFileOrigin.trim().startsWith("platform:")) {
                        val url = new URL(env.mainFileOrigin);
                        mainFileOriginInput = url.openStream
                    } else {
                        mainFileOriginInput = new FileInputStream(env.mainFileOrigin)
                    }
                }

                val mainFile = newlyCreatedProject.getFile(env.mainFile)
                mainFile.create(mainFileOriginInput, false, null)
                mainFileOriginInput.close()
            }
        }

        // Copy templates to new project
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

        // Add environment to project properties
        newlyCreatedProject.setPersistentProperty(LaunchConfigPlugin.ENVIRIONMENT_QUALIFIER, env.name)

        return true;
    }

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

    override init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench
        this.selection = selection

        windowTitle = "New SCCharts Project"
        helpAvailable = false

        projectsBeforeWizard = ResourcesPlugin.workspace.root.projects
    }

    private def startWizard(String fullyQualifiedClassName) {
        val wizard = ExtensionLookupUtil.getWizard(fullyQualifiedClassName)
        if (wizard != null) {
            // Open the wizard
            wizard.init(workbench, selection)
            val dialog = new WizardDialog(shell, wizard)
            dialog.open()

            // Check if and which project has been created 
            // and add information of the sccharts wizard to it.
            newlyCreatedProject = findNewlyCreatedProject()
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
}