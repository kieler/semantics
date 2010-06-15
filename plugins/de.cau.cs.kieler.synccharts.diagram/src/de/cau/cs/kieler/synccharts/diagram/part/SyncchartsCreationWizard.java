package de.cau.cs.kieler.synccharts.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class SyncchartsCreationWizard extends Wizard implements INewWizard {

    /**
     * @generated
     */
    private IWorkbench workbench;

    /**
     * @generated
     */
    protected IStructuredSelection selection;

    /**
     * @generated
     */
    protected SyncchartsCreationWizardPage diagramModelFilePage;

    /**
     * @generated
     */
    protected SyncchartsCreationWizardPage domainModelFilePage;

    /**
     * @generated
     */
    protected Resource diagram;

    /**
     * @generated
     */
    private boolean openNewlyCreatedDiagramEditor = true;

    /**
     * @generated
     */
    public IWorkbench getWorkbench() {
        return workbench;
    }

    /**
     * @generated
     */
    public IStructuredSelection getSelection() {
        return selection;
    }

    /**
     * @generated
     */
    public final Resource getDiagram() {
        return diagram;
    }

    /**
     * @generated
     */
    public final boolean isOpenNewlyCreatedDiagramEditor() {
        return openNewlyCreatedDiagramEditor;
    }

    /**
     * @generated
     */
    public void setOpenNewlyCreatedDiagramEditor(
            boolean openNewlyCreatedDiagramEditor) {
        this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
    }

    /**
     * @generated
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench;
        this.selection = selection;
        setWindowTitle(Messages.SyncchartsCreationWizardTitle);
        setDefaultPageImageDescriptor(SyncchartsDiagramEditorPlugin
                .getBundledImageDescriptor("icons/wizban/NewSyncchartsWizard.gif")); //$NON-NLS-1$
        setNeedsProgressMonitor(true);
    }

    /**
     * @generated
     */
    public void addPages() {
        diagramModelFilePage = new SyncchartsCreationWizardPage(
                "DiagramModelFile", getSelection(), "kids"); //$NON-NLS-1$ //$NON-NLS-2$
        diagramModelFilePage
                .setTitle(Messages.SyncchartsCreationWizard_DiagramModelFilePageTitle);
        diagramModelFilePage
                .setDescription(Messages.SyncchartsCreationWizard_DiagramModelFilePageDescription);
        addPage(diagramModelFilePage);

        domainModelFilePage = new SyncchartsCreationWizardPage(
                "DomainModelFile", getSelection(), "kixs") { //$NON-NLS-1$ //$NON-NLS-2$

            public void setVisible(boolean visible) {
                if (visible) {
                    String fileName = diagramModelFilePage.getFileName();
                    fileName = fileName.substring(0, fileName.length()
                            - ".kids".length()); //$NON-NLS-1$
                    setFileName(SyncchartsDiagramEditorUtil.getUniqueFileName(
                            getContainerFullPath(), fileName, "kixs")); //$NON-NLS-1$
                }
                super.setVisible(visible);
            }
        };
        domainModelFilePage
                .setTitle(Messages.SyncchartsCreationWizard_DomainModelFilePageTitle);
        domainModelFilePage
                .setDescription(Messages.SyncchartsCreationWizard_DomainModelFilePageDescription);
        addPage(domainModelFilePage);
    }

    /**
     * @generated
     */
    public boolean performFinish() {

        if (domainModelFilePage.getFileName().matches("default\\d*.\\w*")) {
            String name = diagramModelFilePage.getFileName();
            domainModelFilePage.setFileName(name.substring(0, name.length()
                    - diagramModelFilePage.getExtension().length())
                    + domainModelFilePage.getExtension());
        }

        IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

            protected void execute(IProgressMonitor monitor)
                    throws CoreException, InterruptedException {
                diagram = SyncchartsDiagramEditorUtil.createDiagram(
                        diagramModelFilePage.getURI(), domainModelFilePage
                                .getURI(), monitor);
                if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
                    try {
                        SyncchartsDiagramEditorUtil.openDiagram(diagram);
                    } catch (PartInitException e) {
                        ErrorDialog
                                .openError(
                                        getContainer().getShell(),
                                        Messages.SyncchartsCreationWizardOpenEditorError,
                                        null, e.getStatus());
                    }
                }
            }
        };
        try {
            getContainer().run(false, true, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof CoreException) {
                ErrorDialog.openError(getContainer().getShell(),
                        Messages.SyncchartsCreationWizardCreationError, null,
                        ((CoreException) e.getTargetException()).getStatus());
            } else {
                SyncchartsDiagramEditorPlugin.getInstance().logError(
                        "Error creating diagram", e.getTargetException()); //$NON-NLS-1$
            }
            return false;
        }
        return diagram != null;
    }
}
