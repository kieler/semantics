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
package de.cau.cs.kieler.kex.ui.wizards.importing;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

/**
 * This class is one of the to {@link WizardPage}s of the kex import wizard. Users of the wizardpage
 * set the destination location of the imported example and have some options to change.
 * 
 * @author pkl
 * 
 */
@SuppressWarnings("restriction")
public class ImportDestPage extends WizardResourceImportPage {

    private static final String INIT_PROJECT = "kieler_examples";

    private Button openImports;
    private Button autoLayout;

    /**
     * Creates a new {@link ImportDestPage}, which extends the {@link WizardResourceImportPage}.
     * 
     * @param name
     *            , String
     * @param selection
     *            , {@link IStructuredSelection}
     */
    protected ImportDestPage(final String name, final IStructuredSelection selection) {
        super(name, selection);
        setTitle("Options");
        super.setDescription(Messages.getString("importDestPageDescription"));
    }

    @Override
    protected ITreeContentProvider getFolderProvider() {
        return null;
    }

    @Override
    protected ITreeContentProvider getFileProvider() {
        return null;
    }

    @Override
    protected void createSourceGroup(final Composite parent) {
        // no sources
    }

    @Override
    protected void createOptionsGroupButtons(final Group optionsGroup) {
        openImports = new Button(optionsGroup, SWT.CHECK);
        openImports.setText(Messages.getString("openExamples"));
        openImports.setSelection(true);
        openImports.addSelectionListener(new SelectionListener() {

            public void widgetSelected(final SelectionEvent e) {
                autoLayout.setEnabled(openImports());
            }

            public void widgetDefaultSelected(final SelectionEvent e) {
                widgetSelected(e);
            }
        });
        autoLayout = new Button(optionsGroup, SWT.CHECK);
        autoLayout.setText(Messages.getString("layoutExamples"));
        autoLayout.setSelection(true);

    }

    /**
     * Creates the import location group with label, textfield and button.
     * 
     * @param parent
     *            , {@link Composite}
     */
    @Override
    public void createControl(final Composite parent) {
        super.createControl(parent);
        
        // Make sure that there's a default project to import to
        if (super.getContainerFullPath() == null) {
            super.setContainerFieldValue(INIT_PROJECT);
            super.setPageComplete(true);
        }
    }

    /**
     * getter for resource path.
     * 
     * @return {@link IPath}
     */
    @Override
    public IPath getResourcePath() {
        return super.getResourcePath().makeAbsolute();

    }

    @Override
    protected void updateWidgetEnablements() {
        setPageComplete(determinePageCompletion());
    }

    @Override
    protected boolean determinePageCompletion() {
        return validateSourceGroup() && myValidateDestinationGroup() && validateOptionsGroup();
    }

    private boolean myValidateDestinationGroup() {
        IPath containerPath = getContainerFullPath();
        if (containerPath == null || containerPath.toPortableString().trim().isEmpty()) {
            setMessage(IDEWorkbenchMessages.WizardImportPage_specifyFolder);
            return false;
        }

        // If the container exist, validate it
        IContainer container = getSpecifiedContainer();
        if (container == null) {
            // If it exists but is not valid then abort
            if (IDEWorkbenchPlugin.getPluginWorkspace().getRoot().exists(getContainerFullPath())) {
                return false;
            }

            // if it is does not exist be sure the project does
            IWorkspace workspace = IDEWorkbenchPlugin.getPluginWorkspace();
            IPath projectPath = containerPath.removeLastSegments(containerPath.segmentCount() - 1);
            if (workspace.getRoot().exists(projectPath)) {
                return true;
            }
            setMessage(IDEWorkbenchMessages.WizardImportPage_projectNotExist,
                    IMessageProvider.WARNING);
            return true;
        }
        if (!container.isAccessible()) {
            setMessage(IDEWorkbenchMessages.WizardImportPage_folderMustExist,
                    IMessageProvider.WARNING);
            return false;
        }
        if (container.getLocationURI() == null) {
            if (container.isLinked()) {
                setErrorMessage(IDEWorkbenchMessages.WizardImportPage_undefinedPathVariable);
            } else {
                setErrorMessage(IDEWorkbenchMessages.WizardImportPage_containerNotExist);
            }
            return false;
        }

        if (sourceConflictsWithDestination(containerPath)) {
            setErrorMessage(getSourceConflictMessage());
            return false;
        }

        if (container instanceof IWorkspaceRoot) {
            setMessage(IDEWorkbenchMessages.WizardImportPage_specifyProject,
                    IMessageProvider.WARNING);
            return false;
        }
        setMessage(Messages.getString("importDestPageDescription"));
        return true;

    }

    /**
     * Checks if the openImports button is selected.
     * 
     * @return boolean
     */
    public boolean openImports() {
        return openImports.getSelection();
    }

    /**
     * Checks if the autoLayout field is selected.
     * 
     * @return {@code true} if auto layout should be performed after the import.
     */
    public boolean autoLayout() {
        return openImports() && autoLayout.getSelection();
    }
}
