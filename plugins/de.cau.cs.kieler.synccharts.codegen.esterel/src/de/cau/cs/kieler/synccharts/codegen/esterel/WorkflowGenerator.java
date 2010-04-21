package de.cau.cs.kieler.synccharts.codegen.esterel;

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

/**
 * @author ctr
 * 
 * Workflow to generate Esterel from SyncCharts.
 */
public class WorkflowGenerator {

    EObject myModel = null;
    String outPath = null;
    String uriString = null;
    IEditorPart editor = null;
    URI uri = null;

    private String part2Location(final IEditorPart editor) {
        String out = null;

        final FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        final String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");

        return out;
    }

    /**
     * Start the Esterel code generation for the active editor. 
     */
    public void invokeWorkflow() {
        final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();

        editor = activePage.getActiveEditor();
        outPath = part2Location(editor);
        uriString = null;
        if (editor instanceof DiagramEditor) {
            final DiagramEditor diagramEditor = (DiagramEditor) editor;
            final View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
            myModel = (EObject) notationElement.getElement();
            uri = myModel.eResource().getURI();
            uriString = uri.toString();
        }
        // EMF reader
        final Reader emfReader = new Reader();
        emfReader.setUri(uriString);
        emfReader.setModelSlot("model");

        // Meta model
        final EmfMetaModel metaModel = new EmfMetaModel(SyncchartsPackage.eINSTANCE);

        // outPath =part2location( uri.path(); //"/home/ctr/";

        // Outlet
        final Outlet outlet = new Outlet();
        outlet.setPath(outPath);
        outlet.setOverwrite(true);

        // Generator

        final Generator esterelGenerator = new Generator();
        esterelGenerator.addMetaModel(metaModel);
        esterelGenerator.addOutlet(outlet);

        esterelGenerator.setExpand("templates::esterel::main FOR model");

       // final WorkflowComponent workflow = new Workflow();

       // workflow.addComponent(emfReader);
        //workflow.addComponent(esterelGenerator);

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
                new Status(status, Activator.PLUGIN_ID, issue.toString(), null), StatusManager.LOG);

    }
}
