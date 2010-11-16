/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformation.action;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.cau.cs.kieler.core.expressions.ExpressionsFactory;
import de.cau.cs.kieler.core.expressions.TextualCode;
import de.cau.cs.kieler.esterel.transformation.util.TransformationUtil;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;

/**
 * @author uru
 * 
 */
public class InitialTransformationAction implements IActionDelegate {

    private IInputValidator kixsValidator = new KixsInputValidator();
    private IFile currentFile;
    private IFile kixsFile;

    private Resource resource;

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {
        createSyncchartDiagram();
        doInitialEsterelTransformation();
        refreshEditPolicies();
        try {
            resource.save(null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action, final ISelection selection) {
        action.setEnabled(false);
        if (!(selection instanceof IStructuredSelection) || selection.isEmpty()) {
            return;
        }
        currentFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
        action.setEnabled(true);
    }

    protected void doInitialEsterelTransformation() {
        try {
            final URI strlURI = URI.createPlatformResourceURI(currentFile.getFullPath().toString(),
                    true);
            // System.out.println(currentFile.getLocationURI().getPath() + "  "+
            // currentFile.getFullPath().toString());

            ResourceSet resourceSet = new ResourceSetImpl();
            final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath()
                    .removeFileExtension().addFileExtension("kixs").toString(), false);

            State rootState;

            System.out.println("Creating initial SyncCharts contents.");
            resource = resourceSet.getResource(kixsURI, true);
            SyncchartsFactory sf = SyncchartsFactory.eINSTANCE;
            Region rootRegion = (Region) resource.getContents().get(0);
            rootState = sf.createState();
            rootState.setId("rsstate");
            rootRegion.getStates().add(rootState);
            rootState.setLabel("EsterelState");
            rootState.setType(StateType.TEXTUAL);

            System.out.println("Parsing Esterel Source Code.");
            // ResourceSet resourceSet = new ResourceSetImpl();
            Resource xtextResource = resourceSet.getResource(strlURI, true);
            EObject esterelModule = xtextResource.getContents().get(0);

            System.out.println("Reading Esterel Source Code - Setting Body Contents.");
            TextualCode code = ExpressionsFactory.eINSTANCE.createTextualCode();
            rootState.getBodyText().add(code);
            code.setCode(TransformationUtil.getSerializedString(esterelModule));

            System.out.println("Attaching Esterel Model to SyncChart");
            rootState.setBodyReference(esterelModule);

            // Region r = SyncchartsFactory.eINSTANCE.createRegion();
            // rootState.getRegions().add(r);
            // rootState.getRegions().remove(r);
            // xtextResource.save(null);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void createSyncchartDiagram() {
        try {

            // access workspace
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            IWorkspaceRoot myWorkspaceRoot = workspace.getRoot();

            // get a file relative to Workspace
            IPath myPath = currentFile.getFullPath().removeFileExtension().addFileExtension("kixs");
            IFile myFile = myWorkspaceRoot.getFile(myPath);

            if (myFile.exists()) {
                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                String currentName = currentFile.getName();
                currentName = currentName.substring(0, currentName.lastIndexOf(".") + 1) + "kixs";
                InputDialog inputdiag = new InputDialog(shell, "Existing File.",
                        "File already exists. Overwrite or pick a new name.", currentName,
                        kixsValidator);
                if (inputdiag.open() == InputDialog.OK) {
                    String newName = inputdiag.getValue();
                    IPath newPath = new Path(currentFile.getFullPath().removeLastSegments(1)
                            .append(newName).toString());
                    kixsFile = myWorkspaceRoot.getFile(newPath);
                }
            } else {
                kixsFile = myWorkspaceRoot.getFile(myPath);
            }

            // create corresponding syncchart
            final URI kidsURI = URI.createPlatformResourceURI(kixsFile.getFullPath()
                    .removeFileExtension().addFileExtension("kids").toString(), false);
            final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath()
                    .removeFileExtension().addFileExtension("kixs").toString(), false);

            System.out.println("Creating new SyncCharts Diagram.");
            IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
                protected void execute(final IProgressMonitor monitor) throws CoreException,
                        InterruptedException {
                    Resource diagram = SyncchartsDiagramEditorUtil.createDiagram(kidsURI, kixsURI,
                            monitor);
                    try {
                        diagram.save(null);
                        SyncchartsDiagramEditorUtil.openDiagram(diagram);
                    } catch (Exception e) {
                        System.out.println(e);
                        e.printStackTrace();
                    }

                }
            };
            op.run(null);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void refreshEditPolicies() {
        // update edit policies, so GMF will generate diagram elements
        // for model elements which have been generated during the
        // transformation.
        IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage().getActiveEditor();
        if (activeEditor instanceof IDiagramWorkbenchPart) {
            EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor).getDiagramEditPart()
                    .getModel()).getElement();
            List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(obj);
            for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
                CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
                System.out.println(nextEditPolicy.toString());
                nextEditPolicy.refresh();
            }
            IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                    .getDiagramGraphicalViewer();
            graphViewer.flush();
        }
    }

    /**
     * @return the currentFile
     */
    public IFile getCurrentFile() {
        return currentFile;
    }

    /**
     * assures that string inputs have the file extention ".kixs".
     * 
     * @author uru
     * 
     */
    class KixsInputValidator implements IInputValidator {
        /**
         * {@inheritDoc}
         */
        public String isValid(final String newText) {
            int i = newText.lastIndexOf(".");
            String fileExt = newText.substring(i + 1, newText.length());
            if (fileExt.equals("kixs")) {
                return null;
            } else {
                return "File extention has to be .kixs";
            }
        }
    }
}
