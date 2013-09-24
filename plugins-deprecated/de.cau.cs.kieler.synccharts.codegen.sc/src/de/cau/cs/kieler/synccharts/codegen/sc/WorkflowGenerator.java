/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 *
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.codegen.sc;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVar;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * 
 * The WorkflowGenerator starts the Xpand process of generating code. Variables will be set to
 * define the out path of the generated files and the model for which to generate code.
 * 
 * @kieler.rating 2010-06-14 yellow
 * @author tam
 */
@SuppressWarnings("restriction")
public class WorkflowGenerator {

    private EObject myModel = null;
    private static String outPath = null;
    private String uriString = null;
    private IEditorPart editor = null;
    private URI uri = null;

    /**
     * The constructor sets the location in the KIELER workspace to save the sc files if you just
     * generate sc code without simulation. It also sets the variables for the EMF reader.
     * 
     * @param uri
     *            the uri
     * @return the out path from ui
     */
    // public WorkflowGenerator() {
    // location for the sc file in the KIELER workspace

    // changes by cmot:
    // Its not possible to do this here because we are NOT in the UI thread.
    // Therefore we have to wait for the UI thread to continue.

    // IWorkbenchPage activePage = PlatformUI.getWorkbench()
    // .getActiveWorkbenchWindow().getActivePage();
    // editor = activePage.getActiveEditor();
    // outPath = part2Location(editor);
    // uriString = null;
    // if (editor instanceof DiagramEditor) {
    // DiagramEditor diagramEditor = (DiagramEditor) editor;
    // checkForDirtyDiagram(diagramEditor);
    // View notationElement = ((View) diagramEditor.getDiagramEditPart()
    // .getModel());
    // myModel = notationElement.getElement();
    // uri = myModel.eResource().getURI();
    // uriString = uri.toString();
    // }
    // }

    public static String getAbsoultePath(final URI uri) {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        IPath path = new Path(uri.toPlatformString(false).replace("%20", " "));
        IFile file = myWorkspaceRoot.getFile(path);

        IPath fullPath = file.getLocation();

        // If we have spaces, try it like this...
        if (fullPath == null && file instanceof org.eclipse.core.internal.resources.Resource) {
            org.eclipse.core.internal.resources.Resource resource
            = (org.eclipse.core.internal.resources.Resource) file;
            fullPath = resource.getLocalManager().locationFor(resource);
        }

        // Ensure it is absolute
        fullPath.makeAbsolute();

        java.io.File javaFile = fullPath.toFile();

        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath().replace(" ", "%20");
            return fileString;
        }

        // Something went wrong, we could not resolve the file location
        return null;
    }

    /**
     * Gets the out path from ui.
     *
     * @return the out path from ui
     */
    public String getOutPathFromUI() {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
        editor = activePage.getActiveEditor();
        return part2Location(editor);
    }

    /**
     * The constructor to use a given diagram (as *.kixs file) for generating code.
     * 
     * @param fileLocation
     *            the location of the given diagram file
     */
    public WorkflowGenerator(final String fileLocation) {
        // location for the sc file in the KIELER workspace
        uriString = fileLocation;
        uri = URI.createURI("file://" + uriString);
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(uri, true);
        Region rootRegion = (Region) resource.getContents().get(0);
        myModel = rootRegion;
    }

    /**
     * The constructor to use a given diagram (as *.kixs file) for generating code.
     * 
     * @param fileLocation
     *            the location of the given diagram file
     */
    public WorkflowGenerator(final URI fileLocation) {
        uri = fileLocation;
        uriString = fileLocation.toString();
        // location for the sc file in the KIELER workspace
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(fileLocation, true);
        Region rootRegion = (Region) resource.getContents().get(0);
        myModel = rootRegion;
    }

    /**
     * Invocation of the workflow. Prepares the environment for generating code.
     * 
     * @param sim
     *            is false if you just want to generate code and true if you want to generate code
     *            and simulate it
     * @param path
     *            the path where the generated files should be written
     */
    public void invokeWorkflow(final boolean sim, final String path) {
        // Meta model
        EmfMetaModel metaModel1 = new EmfMetaModel(KExpressionsPackage.eINSTANCE);
        EmfMetaModel metaModel2 = new EmfMetaModel(SyncchartsPackage.eINSTANCE);

        // FIXME: This is a really hacky way to set the path ... consider this for
        // reimplementation. Better use two different workflows at all!
        if (sim) {
            outPath = path;
        } else {
            URI output = URI.createURI("");
            URI input = URI.createURI("");

            // get input model from currently selected file in Explorer
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();
            org.eclipse.core.internal.resources.File file 
            = (org.eclipse.core.internal.resources.File) ((TreeSelection) selection)
                    .getFirstElement();
            input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

            // get output model from input model
            output = URI.createURI(input.toString());
            output = output.trimFragment();

            uriString = getAbsoultePath(input);

            int index = uriString.lastIndexOf(System.getProperty("file.separator"));

            outPath = uriString;
            if (index != -1) {
                outPath = uriString.substring(0, index + 1); // part2Location(editor);
            }

            uriString = "file://" + uriString;
        }

        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(uriString);
        emfReader.setModelSlot("model");

        // name of the file (from root state)
        String filename = ((Region) myModel).getStates().get(0).getId();

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);

        // Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel2);
        generator.addMetaModel(metaModel1);
        generator.addOutlet(outlet);

        GlobalVar varName = new GlobalVar();
        varName.setName("name");
        varName.setValue(filename);

        GlobalVar varSim = new GlobalVar();
        varSim.setName("sim");
        if (sim) {
            varSim.setValue(true);
            generator.setExpand("templates::SimCodegen::main FOR model");
        } else {
            varSim.setValue(false);
            generator.setExpand("templates::Codegen::main FOR model");
        }
        generator.addGlobalVar(varSim);
        generator.addGlobalVar(varName);

        // There is no alternative for using the Workflow Class
        Workflow workflow = new Workflow();

        workflow.addComponent(emfReader);
        workflow.addComponent(generator);

        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new IssuesImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();

        workflow.invoke(wfx, monitor, issues);

        StringBuffer issue = new StringBuffer(generator.getLogMessage() + "\n");
        int issueValue = IStatus.OK;
        for (MWEDiagnostic s : issues.getIssues()) {
            issue.append(s + "\n");
            issueValue = IStatus.INFO;
        }
        for (MWEDiagnostic s : issues.getInfos()) {
            issue.append(s + "\n");
            issueValue = IStatus.INFO;
        }
        for (MWEDiagnostic s : issues.getWarnings()) {
            issue.append(s + "\n");
            issueValue = IStatus.WARNING;
        }
        for (MWEDiagnostic s : issues.getErrors()) {
            issue.append(s + "\n");
            issueValue = IStatus.ERROR;
        }
        if (issueValue > IStatus.OK) {
            Status status = new Status(issueValue, Activator.PLUGIN_ID, issue.toString(), null);
            StatusManager.getManager().handle(status, StatusManager.LOG);
        }

        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e2) {
            e2.printStackTrace();
        }

        File file;
        if (sim) {
            file = new File(outPath + "sim.c");
            File dataFile = new File(outPath + "sim_data.c");
            beautifyFiles(dataFile);
        } else {
            file = new File(outPath + filename + ".c");
        }
        file.setExecutable(true);
        beautifyFiles(file);
        PriorityOptimizer pO = new PriorityOptimizer(file);
        try {
            pO.optimize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
     * Starts the beautifyer.
     */
    private static void beautifyFiles(final File file) {
        Beautifier simBeautifier = new Beautifier(file, file);
        try {
            simBeautifier.bueatify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Returns the location string of a given IEditorPart.
     */
    private static String part2Location(final IEditorPart editor) {
        String out = null;

        FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");

        return out;
    }

    /**
     * Returns the model.
     * 
     * @return model
     */
    public EObject getModel() {
        return myModel;
    }

    /**
     * Returns the uri.
     * 
     * @return uri
     */
    public URI getURI() {
        return uri;
    }

    /**
     * Returns the name of the file.
     * 
     * @return filename
     */
    public String getFileName() {
        String out = "";
        out = uri.lastSegment().replace("." + uri.fileExtension(), "");
        return out;
    }

}
