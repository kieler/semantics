/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.codegen.esterel;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * @author ctr
 * 
 *         Workflow to generate Esterel from SyncCharts.
 */
public class WorkflowGenerator {

    private EObject myModel = null;
    private String outPath = null;
    private String uriString = null;
    private IEditorPart editor = null;
    private URI uri = null;

    // The following code requests the input model from the
    // currently opened editor. This is not what we want.
    //
    // private String part2Location(final IEditorPart ed) {
    // String out = null;
    //
    // final FileEditorInput uri2 = (FileEditorInput) ed.getEditorInput();
    // final String outName = uri2.getName();
    // out = uri2.getURI().getRawPath().replace(outName, "");
    //
    // return out;
    // }

    public String getAbsoultePath(final URI uri) {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        IPath path = new Path(uri.toPlatformString(false));
        IFile file = myWorkspaceRoot.getFile(path);

        IPath fullPath = file.getLocation();

        // If we have spaces, try it like this...
        if (fullPath == null && file instanceof org.eclipse.core.internal.resources.Resource) {
            org.eclipse.core.internal.resources.Resource resource = (org.eclipse.core.internal.resources.Resource) file;
            fullPath = resource.getLocalManager().locationFor(resource);
        }

        // Ensure it is absolute
        fullPath.makeAbsolute();

        java.io.File javaFile = fullPath.toFile();

        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath();
            return fileString;
        }

        // Something went wrong, we could not resolve the file location
        return null;
    }

    /**
     * Start the Esterel code generation for the active editor.
     */
    public void invokeWorkflow() {
        final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
        URI input = URI.createURI("");
        URI output = URI.createURI("");

        // get input model from currently selected file in Explorer
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        File file = (File) ((TreeSelection) selection).getFirstElement();
        input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

        // EObject myModel = (EObject) notationElement.getElement();
        // URI uri = myModel.eResource().getURI();

        // get output model from input model
        output = URI.createURI(input.toString());
        output = output.trimFragment();

        final EPackage p1 = SyncchartsPackage.eINSTANCE;
        final EPackage p2 = KExpressionsPackage.eINSTANCE;
        final EPackage p3 = AnnotationsPackage.eINSTANCE;

        editor = activePage.getActiveEditor();

        uriString = getAbsoultePath(input);
        
        int index = uriString.lastIndexOf(System.getProperty("file.separator"));
        
        outPath = uriString;
        if (index != -1) {
           outPath = uriString.substring(0, index+1); // part2Location(editor);
        } 
        // if (editor instanceof DiagramEditor) {
        // final DiagramEditor diagramEditor = (DiagramEditor) editor;
        // final View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
        // myModel = (EObject) notationElement.getElement();
        // uri = myModel.eResource().getURI();
        // uriString = uri.toString();
        // }

        // EMF reader
        final Reader emfReader = new Reader();
        emfReader.setUri("file://"+ uriString);
        emfReader.setModelSlot("model");

        // Meta model
        final EmfMetaModel metaModel1 = new EmfMetaModel(p1);
        final EmfMetaModel metaModel2 = new EmfMetaModel(p2);
        final EmfMetaModel metaModel3 = new EmfMetaModel(p3);

        // outPath =part2location( uri.path(); //"/home/ctr/";

        // Outlet
        final Outlet outlet = new Outlet();
        outlet.setPath(outPath);
        outlet.setOverwrite(true);

        // Generator
        final Generator esterelGenerator = new Generator();
        esterelGenerator.addMetaModel(metaModel1);
        esterelGenerator.addMetaModel(metaModel2);
        esterelGenerator.addMetaModel(metaModel3);
        esterelGenerator.addOutlet(outlet);

        esterelGenerator.setExpand("esterel::main FOR model");

        final WorkflowContext wfx = new WorkflowContextDefaultImpl();
        final Issues issues = new IssuesImpl();
        final NullProgressMonitor monitor = new NullProgressMonitor();
        try {
            emfReader.invoke(wfx, monitor, issues);
            esterelGenerator.invoke(wfx, monitor, issues);
        } catch (final Exception e) {
            e.printStackTrace();
        } catch (final Throwable t) {
            t.printStackTrace();
        }
        int status = IStatus.OK;
        final StringBuffer issue = new StringBuffer(esterelGenerator.getLogMessage() + "\n");
        if (issues.hasErrors()) {
            status = IStatus.ERROR;
        } else if (issues.hasWarnings()) {
            status = IStatus.WARNING;
        } else if (issues.hasInfos()) {
            status = IStatus.INFO;
        }
        for (final MWEDiagnostic s : issues.getIssues()) {
            issue.append(s + "\n");
        }

        StatusManager.getManager().handle(
                new Status(status, EsterelPlugin.PLUGIN_ID, issue.toString(), null),
                StatusManager.LOG);

    }
}
