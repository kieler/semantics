package de.cau.cs.kieler.synccharts.codegen.quartz;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class WorkflowGenerator {

    EObject myModel = null;
    String outPath = null;
    String uriString = null;
    IEditorPart editor = null;
    URI uri = null;

    private String part2Location(IEditorPart editor) {
        String out = null;

        FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");

        return out;
    }

    public WorkflowGenerator() {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();

        editor = activePage.getActiveEditor();
        outPath = part2Location(editor);
        uriString = null;
        if (editor instanceof DiagramEditor) {
            DiagramEditor diagramEditor = (DiagramEditor) editor;
            View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
            myModel = (EObject) notationElement.getElement();
            uri = myModel.eResource().getURI();
            uriString = uri.toString();
        }
    }

    public void invokeWorkflow() {
        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(uriString);
        emfReader.setModelSlot("model");

        // Meta model
        EmfMetaModel metaModel = new EmfMetaModel(SyncchartsPackage.eINSTANCE);

        // outPath =part2location( uri.path(); //"/home/ctr/";

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);
        outlet.setOverwrite(true);

        // Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel);
        generator.addOutlet(outlet);

        generator.setExpand("template::quartz::main FOR model");

        Workflow workflow = new Workflow();

        workflow.addComponent(emfReader);
        workflow.addComponent(generator);

        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new IssuesImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();
        try {
            workflow.invoke(wfx, monitor, issues);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        int status = IStatus.OK;
        StringBuffer issue = new StringBuffer(generator.getLogMessage() + "\n");
        if (issues.hasErrors()) {
            status = IStatus.ERROR;
        } else if (issues.hasWarnings()) {
            status = IStatus.WARNING;
        } else if (issues.hasInfos()) {
            status = IStatus.INFO;
        }
        for (MWEDiagnostic s : issues.getIssues()) {
            issue.append(s + "\n");
        }
        StatusManager.getManager().handle(
                new Status(status, Activator.PLUGIN_ID, issue.toString(), null), StatusManager.LOG);
    
 
    }

    /*public EObject getModel() {
        return myModel;
    }

    public URI getURI() {
        return uri;
    }

    public String getOutPath() {
        return outPath;
    }*/
}
