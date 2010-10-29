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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;

/**
 * @author uru
 * 
 */
public class InitialTransformationAction implements IActionDelegate {

    private IFile currentFile;

    Resource resource;

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
            final URI kixsURI = URI.createPlatformResourceURI(currentFile.getFullPath()
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

            // create corresponding syncchart
            final URI kidsURI = URI.createPlatformResourceURI(currentFile.getFullPath()
                    .removeFileExtension().addFileExtension("kids").toString(), false);
            final URI kixsURI = URI.createPlatformResourceURI(currentFile.getFullPath()
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

    // private List<IFile> getSelectedFilesOfEvent(final ExecutionEvent event) {
    // LinkedList<IFile> files = new LinkedList<IFile>();
    // Object object = event.getApplicationContext();
    // if (object instanceof EvaluationContext) {
    // EvaluationContext evalContext = (EvaluationContext) object;
    // // get list of selected files
    // Object defVar = evalContext.getDefaultVariable();
    // if (defVar instanceof Iterable<?>) {
    // Iterable<?> iterable = (Iterable<?>) defVar;
    // Iterator<?> iter = iterable.iterator();
    // while (iter.hasNext()) {
    // Object o = iter.next();
    // if (o instanceof IFile) {
    // files.add((IFile) o);
    // }
    // }
    // }
    // }
    // return files;
    // }
}
