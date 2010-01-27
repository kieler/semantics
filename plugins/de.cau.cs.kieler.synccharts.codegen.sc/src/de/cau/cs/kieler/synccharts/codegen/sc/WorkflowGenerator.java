package de.cau.cs.kieler.synccharts.codegen.sc;

import java.io.File;
import java.util.Random;

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

    private EObject myModel = null;
    private String outPath = null;
    private String uriString = null;
    private IEditorPart editor = null;
    private URI uri = null;

    private static String part2Location(final IEditorPart editor) {
        String out = null;

        FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");

        return out;
    }

    private static String randomString() {
        String allowedChars = "0123456789abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        int max = allowedChars.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            int value = random.nextInt(max);
            buffer.append(allowedChars.charAt(value));
        }
        return buffer.toString();
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

    public void invokeWorkflow(final boolean sim) {
        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(uriString);
        emfReader.setModelSlot("model");

        // Meta model
        EmfMetaModel metaModel = new EmfMetaModel(SyncchartsPackage.eINSTANCE);

        if (sim) {
            outPath = System.getProperty("java.io.tmpdir") + File.separator + randomString()
                    + File.separator;
            // for debugging un-comment the following line
            //outPath = "/home/tam/scdebug/";
            outPath = "." + File.separator + "scDebug" + File.separator;
        }

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);

        // Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel);
        generator.addOutlet(outlet);

        if (sim) {
            generator.setExpand("template::SimCodegen::main FOR model");
        } else {
            generator.setExpand("template::Codegen::main FOR model");
        }

        Workflow workflow = new Workflow();

        workflow.addComponent(emfReader);
        workflow.addComponent(generator);

        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new IssuesImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();

        workflow.invoke(wfx, monitor, issues);

        StringBuffer issue = new StringBuffer(generator.getLogMessage() + "\n");
        for (MWEDiagnostic s : issues.getIssues()) {
            issue.append(s + "\n");
        }
        for (MWEDiagnostic s : issues.getErrors()) {
            issue.append(s + "\n");
        }
        for (MWEDiagnostic s : issues.getWarnings()) {
            issue.append(s + "\n");
        }
        for (MWEDiagnostic s : issues.getInfos()) {
            issue.append(s + "\n");
        }
        StatusManager.getManager().handle(
                new Status(IStatus.WARNING, Activator.PLUGIN_ID, issue.toString(), null),
                StatusManager.LOG);
    }

    public EObject getModel() {
        return myModel;
    }

    public URI getURI() {
        return uri;
    }

    public String getOutPath() {
        return outPath;
    }

    public String getFileName() {
        String out = "";
        out = uri.lastSegment().replace("." + uri.fileExtension(), "");
        return out;
    }

}
