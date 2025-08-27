/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.ui.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.intro.impl.IntroPlugin;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.kex.controller.ExampleManager;
import de.cau.cs.kieler.kex.model.Example;
import de.cau.cs.kieler.kex.model.SourceType;
import de.cau.cs.kieler.kex.ui.KEXUIPlugin;


/**
 * This class contains the contents to run a quick start example.
 * 
 * @author pkl
 */
public class QuickStartAction implements IIntroAction {

    /**
     * Executes a quick start. Filters from the given parameters the sourcetype
     * and prompt depending on that a import. The welcomepage will closed
     * automatically.
     * 
     * @param site
     *            , {@link IIntroSite}
     * @param params
     *            , {@link Properties}
     */
    @SuppressWarnings("restriction")
    public final void run(final IIntroSite site, final Properties params) {
        String sourceType = params.getProperty("sourceType");
        SourceType sourcetype = null;
        try {
            sourcetype = SourceType.valueOf(sourceType);
        } catch (IllegalArgumentException i) {
            showError("Could not identify sourcetype.", i.getMessage());
            return;
        }
        if (sourceType == null) {
            showError("Introtag Error", "Missing property sourceType.");
            return;
        }

        String exampleId = params.getProperty("exampleId");
        if (exampleId == null) {
            showError("Introtag Error", "Missing property exampleTitle.");
            return;
        }

        String projectName = params.getProperty("projectName");
        if (projectName == null) {
            showError("Introtag Error", "Missing property projectName.");
        }

        if (projectName == null) {
            showError("Introtag Error", "Missing property projectName.");
        }

        Example quickStarter = null;
        try {
            quickStarter = ExampleManager.get().getExample(sourcetype, exampleId);
        } catch (RuntimeException e) {
            showError("Example loading error", e.getMessage());
            return;
        }
        if (quickStarter == null) {
            showError("Example loading error", "Could not find example with id " + exampleId);
            return;
        }
        ArrayList<Example> examples = new ArrayList<Example>();
        examples.add(quickStarter);

        IPath projectPath = getUniqueProjectPath(projectName, site.getShell());
        if (projectPath == null) {
            return;
        }
        
        ExampleManager.get().generateProject(projectPath);
        IntroPlugin.closeIntro();
        try {
            List<String> directOpens = ExampleManager.get().importExamples(projectPath, examples, false);
            postfix(directOpens, params.getProperty("autoLayout") != null);
        } catch (Exception e) {
            StatusManager.getManager().handle(
                    new Status(IStatus.ERROR, KEXUIPlugin.PLUGIN_ID, "Problem at importing example", e),
                    StatusManager.SHOW);
        }
    }
    
    /**
     * Takes the given project name and turns it into a project path, making sure that the resulting
     * path does not exist yet. If it does, the user is asked to provide another name.
     * 
     * @param projectName the project name.
     * @param shell the window to use as parent for dialogs.
     * @return the unique project path or {@code null} if the path already exists and the user decided
     *         to cancel.
     */
    private IPath getUniqueProjectPath(final String projectName, final Shell shell) {
        String currentProjectName = projectName;
        IPath projectPath = Path.fromPortableString(currentProjectName);
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        
        while (root.exists(projectPath)) {
            // Prompt the user for a new path
            InputDialog dialog = new InputDialog(
                    shell,
                    "Project Exists",
                    "A project with this name already exists. Please enter a new name or cancel.",
                    currentProjectName,
                    null);
            
            if (dialog.open() == Dialog.OK) {
                // Choose the user's project name
                currentProjectName = dialog.getValue();
                projectPath = Path.fromPortableString(currentProjectName);
            } else {
                // Cancel
                return null;
            }
        }
        
        return projectPath;
    }

    /**
     * Opens up a error dialog with given title and message.
     * 
     * @param title
     *            , String
     * @param message
     *            , String
     */
    private void showError(final String title, final String message) {
        IWorkbench wb = PlatformUI.getWorkbench();
        IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
        MessageDialog.openError(win.getShell(), title, message);
    }

    /**
     * Refreshes the workspace and opens up the direct open files with an
     * editor.
     * 
     * @param directOpens
     * @param autoLayout
     *            , set if direct opening models should be layout.
     */
    private void postfix(final List<String> directOpens,
            final boolean autoLayout) {
        // refresh workspace
        IContainer element = ResourcesPlugin.getWorkspace().getRoot();
        try {
            if (element != null) {
                element.refreshLocal(IContainer.DEPTH_INFINITE, null);
            }
        } catch (CoreException e1) {
            // do nothing
        }

        // open directopen files in editor.
        if (directOpens != null) {
            IWorkbenchWindow win = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow();
            IWorkbenchPage page = win.getActivePage();
            for (String path : directOpens) {
                IFile[] files = ResourcesPlugin
                        .getWorkspace()
                        .getRoot()
                        .findFilesForLocationURI(URIUtil.toURI(path),
                                IResource.FILE);
                if (files.length == 1) {
                    IEditorDescriptor defaultEditor = PlatformUI.getWorkbench()
                            .getEditorRegistry()
                            .getDefaultEditor(files[0].getName());
                    if (defaultEditor == null) {
                        defaultEditor = PlatformUI
                                .getWorkbench()
                                .getEditorRegistry()
                                .findEditor(
                                        IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
                    }
                    try {
                        IEditorPart editorPart = page.openEditor(new FileEditorInput(files[0]),
                                defaultEditor.getId());
                    } catch (PartInitException e) {
                        IStatus status = new Status(IStatus.WARNING,
                                KEXUIPlugin.PLUGIN_ID,
                                "Could not open editor.", e);
                        StatusManager.getManager().handle(status,
                                StatusManager.SHOW);
                        continue;
                    }
                }
            }
        }

    }
}
