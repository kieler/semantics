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
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.TextualCode;
import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
 de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;

/**
 * @author uru
 * 
 */
public class InitialTransformationAction implements IActionDelegate {

    private IInputValidator kixsValidator = new KixsInputValidator();
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
        
//        times = "";
//        injector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
//        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
//        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
//        URI uri = URI.createFileURI("test/test.strl"); // uri of your resource, may be fictional
//
//        long start = System.currentTimeMillis();
//        final XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
//        rs.getResources().add(resource);
//
//        // we are sure f exists, as we read the path automatically
//        File f = new File( strlFile.getRawLocation().toOSString());
//        FileInputStream fis;
//        try {
//            fis = new FileInputStream(f);
//
//            resource.load(fis, null);
//        } catch (Exception e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//        EcoreUtil.resolveAll(resource);
//        long end = System.currentTimeMillis();
//        times += f.getName() + " Parse: " + (end - start) + "ms";
//
//        start = System.currentTimeMillis();
//        // serialize
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        final OutputStreamWriter osw = new OutputStreamWriter(baos);
//
//        Runnable r = new Runnable() {
//
//            public void run() {
//                // TODO Auto-generated method stub
//                try {
//                    Program p = (Program) resource.getContents().get(0);
//                    Module m1 = p.getModules().get(0);
//                    
////                    TreeIterator<EObject> it = m1.eAllContents();
////                    while(it.hasNext()) {
////                        EObject e = it.next();
////                        e.eAdapters().clear();
////                        if(e instanceof MinimalEObjectImpl.Container){
////                            MinimalEObjectImpl.Container cont = (MinimalEObjectImpl.Container) e;
////                            
////                        }
////                        int i = 0;
////                    }
//                    Serializer serializerUtil = injector.getInstance(Serializer.class);
//                    serializerUtil.serialize(p, osw,
//                            SaveOptions.defaultOptions());
//                    // System.out.println("Serialized result: " + baos.toString());
//                } catch (Exception ex) {
//                    //ex.printStackTrace();
//                    System.out.println("SERIALIZE ERROR");
//                }
//            }
//        };
//        Thread t = new Thread(r);
//        t.start();
//        try {
//            t.join(20000);
//            end = System.currentTimeMillis();
//            if (t.isAlive()) {
//                t.suspend();
//                times += " Serialize: exceeded time limit\n";
//            } else {
//                times += " Serialize: " + (end - start) + "ms\n";
//            }
//
//        } catch (Exception e) {
//            System.out.println("Some Thread error");
//        }
//        
//        System.out.println(times);
//
//        if (1 == 1) {
//            return;
//        }

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
                            createSyncchartDiagram();
                            long opened = System.currentTimeMillis();
                            System.out.println("Opened: " + opened);
                            uiMonitor.worked(40);
                            doInitialEsterelTransformation();
                            long esterel = System.currentTimeMillis();
                            System.out.println("Esterel: " + esterel);
                            uiMonitor.worked(60);
                            refreshEditPolicies();
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

    /**
     * Fill the root esterel elements into the syncchart.
     */
    private void doInitialEsterelTransformation() {
        try {
            ResourceSet resourceSet = new ResourceSetImpl();
            final URI strlURI = URI.createPlatformResourceURI(strlFile.getFullPath().toString(),
                    true);
            final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(),
                    false);

            // setup initial syncchart with one state in the global region
            Resource resource = resourceSet.getResource(kixsURI, true);
            SyncchartsFactory sf = SyncchartsFactory.eINSTANCE;
            Region rootRegion = (Region) resource.getContents().get(0);
            State rootState = sf.createState();
            rootState.setId("rsstate");
            rootRegion.getStates().add(rootState);
            rootState.setLabel("EsterelState");
            rootState.setType(StateType.TEXTUAL);

            // get the esterel code and add it as body reference
            Resource xtextResource = resourceSet.getResource(strlURI, true);
            EObject esterelModule = xtextResource.getContents().get(0);
            rootState.setBodyReference(esterelModule);

            // parse the esterel code and display as textual code
            TextualCode code = KExpressionsFactory.eINSTANCE.createTextualCode();
            rootState.getBodyText().add(code);
            code.setCode(TransformationUtil.getSerializedString(esterelModule));

            // save the resource
            resource.save(null);

        } catch (Exception e) {
            e.printStackTrace();
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Problem parsing the Esterel file.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * Creates a new SyncChart.
     */
    private void createSyncchartDiagram() {
        try {
            if (kixsFile.exists()) {
                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                String currentName = strlFile.getName();
                currentName = currentName.substring(0, currentName.lastIndexOf(".") + 1) + "kixs";
                InputDialog inputdiag = new InputDialog(shell, "Existing File.",
                        "File already exists. Overwrite or choose a new name.", currentName,
                        kixsValidator);
                if (inputdiag.open() == InputDialog.OK) {
                    String newName = inputdiag.getValue();
                    IPath newPath = new Path(strlFile.getFullPath().removeLastSegments(1)
                            .append(newName).toString());
                    kixsFile = workspaceRoot.getFile(newPath);
                }
            }

            // create corresponding syncchart
            final URI kidsURI = URI.createPlatformResourceURI(kidsFile.getFullPath().toString(),
                    false);
            final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(),
                    false);

            System.out.println("Creating new SyncCharts Diagram.");

            // create a new SyncCharts Diagram.
            final IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
                protected void execute(final IProgressMonitor monitor) throws CoreException,
                        InterruptedException {
                    Resource diagram = SyncchartsDiagramEditorUtil.createDiagram(kidsURI, kixsURI,
                            monitor);
                    try {
                        diagram.save(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            // run
            op.run(null);

        } catch (Exception e) {
            e.printStackTrace();
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Problem creating a new SyncChartsDiagram.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
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
