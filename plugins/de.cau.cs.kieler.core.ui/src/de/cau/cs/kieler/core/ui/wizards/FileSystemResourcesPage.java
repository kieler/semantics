/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.core.ui.wizards;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import de.cau.cs.kieler.core.ui.Messages;
import de.cau.cs.kieler.core.ui.util.ComboHistoryHandler;


/**
 * A wizard page that allows the user to choose files to import from the file system.
 * Optionally, a target group may allow the user to choose a target folder in the
 * workspace to import to. Files can be filtered using regular expressions.
 * 
 * <p>The settings made on this page can be saved if the wizard has an instance of
 * {@code IDialogSettings} set on it. If it has not, settings are neither saved nor
 * loaded.</p>
 * 
 * @author cds
 * @kieler.rating yellow 2010-03-14
 *      reviewed by haf, msp, pkl
 */
public class FileSystemResourcesPage extends ResourceTreeAndListPage {
    
    /**
     * Provides the folder tree to the resource selection group.
     * 
     * @author cds
     */
    private static class FolderContentProvider implements ITreeContentProvider {
        /**
         * {@inheritDoc}
         */
        public void dispose() {
            // Nothing to be done here
        }
        
        /**
         * {@inheritDoc}
         */
        public void inputChanged(final Viewer viewer, final Object oldInput,
                final Object newInput) {
        }
        
        /**
         * {@inheritDoc}
         */
        public Object[] getElements(final Object inputElement) {
            if (inputElement instanceof ExtendedFileSystemElement) {
                return getChildren(inputElement);
            } else {
                return new Object[0];
            }
        }
        
        /**
         * {@inheritDoc}
         */
        public Object[] getChildren(final Object parentElement) {
            if (parentElement instanceof ExtendedFileSystemElement) {
                ExtendedFileSystemElement folderElement = (ExtendedFileSystemElement) parentElement;
                
                // Check if we have already visited this element
                if (!folderElement.isVisited()) {
                    // Check if the element is an input element
                    if (folderElement.isInputElement()) {
                        File folder = folderElement.getFile();
                        
                        new ExtendedFileSystemElement(folder, folderElement);
                    } else {
                        File folder = folderElement.getFile();
                        File[] items = folder.listFiles();
                        
                        if (items != null) {
                            for (File item : items) {
                                new ExtendedFileSystemElement(item, folderElement);
                            }
                        }
                    }
                    
                    // We have now visited this element
                    folderElement.visit();
                }

                return folderElement.getFolders().getChildren();
            } else {
                return new Object[0];
            }
        }
        
        /**
         * {@inheritDoc}
         */
        public Object getParent(final Object element) {
            if (element instanceof ExtendedFileSystemElement) {
                return ((ExtendedFileSystemElement) element).getParent();
            } else {
                return null;
            }
        }
        
        /**
         * {@inheritDoc}
         */
        public boolean hasChildren(final Object element) {
            if (element instanceof ExtendedFileSystemElement) {
                // Check if we already know if this element has children
                ExtendedFileSystemElement folder = (ExtendedFileSystemElement) element;
                
                if (folder.isVisited()) {
                    return folder.isDirectory() && folder.getFolders().size() > 0;
                }
            }
            
            // For performance reason, every folder has children until we know better
            return true;
        }
    }
    
    
    /**
     * Provides the file list to the resource selection group. Only Ptolemy2 diagram
     * files are provided.
     * 
     * @author cds
     */
    private static class FileContentProvider implements ITreeContentProvider {
        /**
         * {@inheritDoc}
         */
        public void dispose() {
            // Nothing to be done here.
        }

        /**
         * {@inheritDoc}
         */
        public void inputChanged(final Viewer viewer, final Object oldInput,
                final Object newInput) {
            
            // Nothing to be done here
        }

        /**
         * {@inheritDoc}
         */
        public Object[] getElements(final Object inputElement) {
            if (inputElement instanceof ExtendedFileSystemElement) {
                ExtendedFileSystemElement folderElement = (ExtendedFileSystemElement) inputElement;
                
                // Check if we have already visited this element
                if (!folderElement.isVisited()) {
                    File folder = folderElement.getFile();
                    File[] items = folder.listFiles();
                    
                    if (items != null) {
                        for (File item : items) {
                            new ExtendedFileSystemElement(item, folderElement);
                        }
                    }
                    
                    // We have now visited this element
                    folderElement.visit();
                }

                return folderElement.getFiles().getChildren();
            } else {
                return new Object[0];
            }
        }

        /**
         * {@inheritDoc}
         */
        public Object[] getChildren(final Object parentElement) {
            return new Object[0];
        }

        /**
         * {@inheritDoc}
         */
        public Object getParent(final Object element) {
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public boolean hasChildren(final Object element) {
            return false;
        }
        
    }
    
    
    // CONSTANTS
    /**
     * Key of the source directory history setting.
     */
    private static final String SETT_SOURCE_DIR_HISTORY = ".sourceDir.history"; //$NON-NLS-1$
    
    /**
     * Key of the target directory history setting.
     */
    private static final String SETT_TARGET_DIR_HISTORY = ".targetDir.history"; //$NON-NLS-1$
    
    /**
     * Size of the history of combo boxes.
     */
    private static final int HISTORY_SIZE = 15;
    
    // VARIABLES
    /**
     * Whether the target group should be shown.
     */
    private boolean showTargetGroup = false;
    
    /**
     * Allowed file name pattern.
     */
    private Pattern filterPattern = null;
    
    // UI WIDGETS
    private ComboHistoryHandler sourceComboHistoryManager;
    private ComboHistoryHandler targetComboHistoryManager;
    private DirectoryDialog directoryDialog;
    
    
    /**
     * Constructs a new instance with the given name that doesn't filter out any
     * files.
     * 
     * @param pageName name of the page. Used as part of the IDs the dialog
     *                 settings are saved as.
     * @param showTargetGroup if {@code true}, a target group is created
     *                        where the user can select a folder in the
     *                        workspace to import to.
     */
    public FileSystemResourcesPage(final String pageName, final boolean showTargetGroup) {
        super(pageName);
        
        setTitle(Messages.FileSystemResourcesPage_title);
        setMessage(Messages.FileSystemResourcesPage_message);
        
        this.showTargetGroup = showTargetGroup;
        
        // Initially, this page is incomplete
        setPageComplete(false);
    }
    
    /**
     * Constructs a new instance with the given name, using a regular expression as
     * its file name filter.
     * 
     * @param pageName name of the page. Used as part of the IDs the dialog
     *                 settings are saved as.
     * @param showTargetGroup if {@code true}, a target group is created
     *                        where the user can select a folder in the
     *                        workspace to import to.
     * @param fileNamePattern file name pattern, specified as a regular
     *                        expression.
     */
    public FileSystemResourcesPage(final String pageName, final boolean showTargetGroup,
            final String fileNamePattern) {
        
        this(pageName, showTargetGroup);
        
        // Save file name pattern, if any
        filterPattern = Pattern.compile(fileNamePattern);
    }

    
    /**
     * Constructs a new instance with the given name, using a regular expression as
     * its file name filter.
     * 
     * @param pageName name of the page. Used as part of the IDs the dialog
     *                 settings are saved as.
     * @param showTargetGroup if {@code true}, a target group is created
     *                        where the user can select a folder in the
     *                        workspace to import to.
     * @param fileExtensions a list of file extensions, either with or without preceding
     *                       dot, that determines the files that will be shown to the
     *                       user.
     */
    public FileSystemResourcesPage(final String pageName, final boolean showTargetGroup,
            final String[] fileExtensions) {

        this(pageName, showTargetGroup);
        
        if (fileExtensions.length > 0) {
            StringBuffer buffer = new StringBuffer(".*\\.(?:");
            
            // Add all file extensions to the pattern
            for (String extension : fileExtensions) {
                if (extension.startsWith(".")) {
                    buffer.append("(?:");
                    buffer.append(extension.substring(1));
                    buffer.append(")|");
                } else {
                    buffer.append("(?:");
                    buffer.append(extension);
                    buffer.append(")|");
                }
            }
            
            // Remove the last | character and close the expression
            buffer.deleteCharAt(buffer.length() - 1);
            buffer.append(")");
            
            filterPattern = Pattern.compile(buffer.toString());
        }
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Result Extraction
    
    /**
     * Returns the selected files. This is a potentially long-running operation.
     * 
     * @param monitor progress monitor. May be {@code null}.
     * @return the list of selected files.
     */
    public List<File> getFiles(final IProgressMonitor monitor) {
        Collection<Object> selection = getSelectedElements(monitor);
        List<File> files = new ArrayList<File>(selection.size());
        
        // Extract the files from all selection elements
        for (Object o : selection) {
            ExtendedFileSystemElement element = (ExtendedFileSystemElement) o;
            files.add(element.getFile());
        }
        
        return files;
    }
    
    /**
     * Returns the target container path entered by the user. The container might
     * not exist yet.
     * 
     * @return the container to import to.
     */
    public IPath getTargetContainerPath() {
        String s = getTargetGroupCombo().getText();
        IPath path = new Path(s);
        
        if (s.length() > 0) {
            path = path.makeAbsolute();
        }
        
        return path;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Resources Group
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected ITreeContentProvider getResourceTreeContentProvider() {
        return new FolderContentProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ViewerFilter[] getResourceListFilters() {
        if (filterPattern != null) {
            return new ViewerFilter[] {new ViewerFilter() {
                @Override
                public boolean select(final Viewer viewer, final Object parentElement,
                        final Object element) {
                    
                    Matcher matcher = filterPattern.matcher(
                            ((ExtendedFileSystemElement) element).getFile().getName());
                    return matcher.matches();
                }
            } };
        } else {
            return new ViewerFilter[0];
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ITreeContentProvider getResourceListContentProvider() {
        return new FileContentProvider();
    }
    

    ///////////////////////////////////////////////////////////////////////////////
    // Source Group
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Composite createSourceGroup(final Composite parent) {
        // The default source group is fine for us
        Composite sourceGroup = createDefaultSourceGroup(parent,
                Messages.FileSystemResourcesPage_sourceGroup_text,
                Messages.FileSystemResourcesPage_sourceGroup_browse);
        
        sourceComboHistoryManager = new ComboHistoryHandler(getSourceGroupCombo(), HISTORY_SIZE);
        
        getSourceGroupCombo().addFocusListener(new FocusAdapter() {
            /**
             * {@inheritDoc}
             */
            @Override
            public void focusLost(final FocusEvent e) {
                // Manage history
                sourceComboHistoryManager.recordAndDisplay(getSourceGroupCombo().getText());
            }
        });
        
        // Prepare the directory dialog used by the browse button
        directoryDialog = new DirectoryDialog(parent.getShell(), SWT.SAVE | SWT.SHEET);
        directoryDialog.setText(Messages.FileSystemResourcesPage_selectDirectoryDialog_title);
        directoryDialog.setMessage(Messages.FileSystemResourcesPage_selectDirectoryDialog_message);
        
        return sourceGroup;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void applyNewSource(final String text) {
        applyNewRootDir(text, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doBrowseSource() {
        applyNewRootDir(directoryDialog.open(), true);
    }
    
    /**
     * Tries to apply the given directory as the new root directory. Also adds
     * it to the combo box's history.
     * 
     * @param newDir the new root directory.
     * @param displayInCombo {@code true} if the directory was not entered into the combo box, but
     *                       through the browse dialog. In that case we need to record and display
     *                       the new directory in the combo box history.
     */
    private void applyNewRootDir(final String newDir, final boolean displayInCombo) {
        if (newDir == null || newDir.trim().length() == 0) {
            return;
        }

        // Check if this is a directory
        File folder = new File(newDir);
        if (folder.exists() && folder.isDirectory()) {
            // Create a new ExtendedFileSystemElement
            ExtendedFileSystemElement newRoot = new ExtendedFileSystemElement(folder, true);
            
            if (displayInCombo) {
                // Update the combo box history and set its text
                sourceComboHistoryManager.recordAndDisplay(newDir);
            }
            
            setResourceTreeInput(newRoot);
        } else {
            setResourceTreeInput(null);
        }
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Target Group

    /**
     * {@inheritDoc}
     */
    @Override
    protected Composite createTargetGroup(final Composite parent) {
        if (!showTargetGroup) {
            return null;
        }
        
        // The default target group is fine for us
        Composite targetGroup = createDefaultTargetGroup(parent,
                Messages.FileSystemResourcesPage_targetGroup_text,
                Messages.FileSystemResourcesPage_targetGroup_browse);
        
        targetComboHistoryManager = new ComboHistoryHandler(getTargetGroupCombo(), HISTORY_SIZE);
        
        getTargetGroupCombo().addFocusListener(new FocusAdapter() {
            /**
             * {@inheritDoc}
             */
            @Override
            public void focusLost(final FocusEvent e) {
                // Manage history
                targetComboHistoryManager.recordAndDisplay(getTargetGroupCombo().getText());
            }
        });
        
        return targetGroup;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doBrowseTarget() {
        // Find the current container, if any
        IPath currentPath = getTargetContainerPath();
        IContainer currentContainer = null;
        
        if (currentPath != null) {
            IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
            IResource resource = workspaceRoot.findMember(currentPath);
            
            if (resource instanceof IContainer) {
                currentContainer = (IContainer) resource;
            }
        }
        
        // Find a new container
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(
                getShell(),
                currentContainer,
                true,
                Messages.FileSystemResourcesPage_containerSelectionDialog_message);
        dialog.setTitle(Messages.FileSystemResourcesPage_containerSelectionDialog_title);
        dialog.showClosedProjects(false);
        
        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();
            
            if (result != null && result.length == 1) {
                IPath newPath = (IPath) result[0];
                targetComboHistoryManager.recordAndDisplay(newPath.makeRelative().toString());
            }
        }
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Options Group

    /**
     * {@inheritDoc}
     */
    @Override
    protected Composite createOptionsGroup(final Composite parent) {
        // No options group
        return null;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Validation

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean doValidate() {
        super.doValidate();
        
        // The user has to select at least something
        if (!isAnythingSelected()) {
            setErrorMessage(Messages.FileSystemResourcesPage_errors_noFileSelected);
            return false;
        }
        
        // The user may have to select a target
        if (showTargetGroup) {
            if (getTargetGroupCombo().getText().trim().length() == 0) {
                setErrorMessage(Messages.FileSystemResourcesPage_errors_noTargetSelected);
                return false;
            }
        }
        
        return true;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    // Dialog Settings

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveDialogSettings() {
        IDialogSettings dialogSettings = getDialogSettings();
        if (dialogSettings == null) {
            // The dialog settings have not been set on the wizard
            return;
        }
        
        sourceComboHistoryManager.saveHistory(dialogSettings,
                getName() + SETT_SOURCE_DIR_HISTORY);
        
        if (showTargetGroup) {
            targetComboHistoryManager.saveHistory(dialogSettings,
                    getName() + SETT_TARGET_DIR_HISTORY);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void restoreDialogSettings() {
        IDialogSettings dialogSettings = getDialogSettings();
        if (dialogSettings == null) {
            // The dialog settings have not been set on the wizard
            return;
        }
        
        sourceComboHistoryManager.restoreHistory(dialogSettings,
                getName() + SETT_SOURCE_DIR_HISTORY);
        
        if (showTargetGroup) {
            targetComboHistoryManager.restoreHistory(dialogSettings,
                    getName() + SETT_TARGET_DIR_HISTORY);
        }
    }
}
