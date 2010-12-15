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
package de.cau.cs.kieler.kies.transformation.action;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Injector;

import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * @author uru
 * 
 */
public class InitialTransformationAction implements IActionDelegate {

    private IFile strlFile;
    private IFile kixsFile;
    private IFile kidsFile;
    private IWorkspaceRoot workspaceRoot;

    private Injector injector;

    private String times = "";

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {

        // times = "";
        // injector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
        // XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        // IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        // URI uri = URI.createFileURI("test/test.strl"); // uri of your resource, may be fictional
        //
        // long start = System.currentTimeMillis();
        // final XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        // rs.getResources().add(resource);
        //
        // // we are sure f exists, as we read the path automatically
        // File f = new File( strlFile.getRawLocation().toOSString());
        // FileInputStream fis;
        // try {
        // fis = new FileInputStream(f);
        //
        // resource.load(fis, null);
        // } catch (Exception e1) {
        // // TODO Auto-generated catch block
        // e1.printStackTrace();
        // }
        // EcoreUtil.resolveAll(resource);
        // long end = System.currentTimeMillis();
        // times += f.getName() + " Parse: " + (end - start) + "ms";
        //
        // start = System.currentTimeMillis();
        // // serialize
        // ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // final OutputStreamWriter osw = new OutputStreamWriter(baos);
        //
        // Runnable r = new Runnable() {
        //
        // public void run() {
        // // TODO Auto-generated method stub
        // try {
        // Program p = (Program) resource.getContents().get(0);
        // Module m1 = p.getModules().get(0);
        //
        // // TreeIterator<EObject> it = m1.eAllContents();
        // // while(it.hasNext()) {
        // // EObject e = it.next();
        // // e.eAdapters().clear();
        // // if(e instanceof MinimalEObjectImpl.Container){
        // // MinimalEObjectImpl.Container cont = (MinimalEObjectImpl.Container) e;
        // //
        // // }
        // // int i = 0;
        // // }
        // Serializer serializerUtil = injector.getInstance(Serializer.class);
        // serializerUtil.serialize(p, osw,
        // SaveOptions.defaultOptions());
        // // System.out.println("Serialized result: " + baos.toString());
        // } catch (Exception ex) {
        // //ex.printStackTrace();
        // System.out.println("SERIALIZE ERROR");
        // }
        // }
        // };
        // Thread t = new Thread(r);
        // t.start();
        // try {
        // t.join(20000);
        // end = System.currentTimeMillis();
        // if (t.isAlive()) {
        // t.suspend();
        // times += " Serialize: exceeded time limit\n";
        // } else {
        // times += " Serialize: " + (end - start) + "ms\n";
        // }
        //
        // } catch (Exception e) {
        // System.out.println("Some Thread error");
        // }
        //
        // System.out.println(times);
        //
        // if (1 == 1) {
        // return;
        // }

        if (strlFile == null || !strlFile.exists()) {
            return;
        }

        try {

            // start with a progress dialog as parsing and opening might take some time
            PlatformUI.getWorkbench().getProgressService()
                    .run(false, true, new IRunnableWithProgress() {
                        public void run(final IProgressMonitor uiMonitor) {

                            // CHECKSTYLEOFF MagicNumber
                            // used some numbers to estimate work done
                            uiMonitor.beginTask("Initial Transformation", 100);
                            // access workspace
                            IWorkspace workspace = ResourcesPlugin.getWorkspace();
                            workspaceRoot = workspace.getRoot();

                            // get files relative to Workspace
                            IPath kidsPath = strlFile.getFullPath().removeFileExtension()
                                    .addFileExtension("kids");
                            IPath kixsPath = strlFile.getFullPath().removeFileExtension()
                                    .addFileExtension("kixs");
                            kidsFile = workspaceRoot.getFile(kidsPath);
                            kixsFile = workspaceRoot.getFile(kixsPath);

                            System.out.println(strlFile.toString());
                            // create all the elements
                            long start = System.currentTimeMillis();
                            System.out.println("Start: " + start);
                            TransformationUtil.createSyncchartDiagram(kixsFile, strlFile.getName());
                            long opened = System.currentTimeMillis();
                            System.out.println("Opened: " + opened);
                            uiMonitor.worked(40);
                            TransformationUtil.doInitialEsterelTransformation(strlFile, kixsFile);
                            long esterel = System.currentTimeMillis();
                            System.out.println("Esterel: " + esterel);
                            uiMonitor.worked(60);
                            TransformationUtil.refreshEditPolicies();
                            long refresh = System.currentTimeMillis();
                            System.out.println("Refresh: " + refresh);
                            uiMonitor.worked(90);
                            // CHECKSTYLEON MagicNumber

                            // open the editor with the kids file
                            IWorkbenchPage page = PlatformUI.getWorkbench()
                                    .getActiveWorkbenchWindow().getActivePage();
                            try {
                                page.openEditor(new FileEditorInput(kidsFile),
                                        SyncchartsDiagramEditor.ID);
                            } catch (PartInitException e) {
                                e.printStackTrace();
                                Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                                        "Problem opening the SyncCharts Diagram.", e);
                                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                            }

                            long showing = System.currentTimeMillis();
                            System.out.println("Showing: " + showing);
                            long total = showing - start;
                            System.out
                                    .println("Total: " + total + " Sek: " + (total / 1000f) + "s");
                        }
                    });
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
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
        strlFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
        action.setEnabled(true);
    }

    /**
     * @return the currentFile
     */
    public IFile getCurrentFile() {
        return strlFile;
    }

}
