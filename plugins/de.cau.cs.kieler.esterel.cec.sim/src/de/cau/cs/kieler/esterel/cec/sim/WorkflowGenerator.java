package de.cau.cs.kieler.esterel.cec.sim;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
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
import org.eclipse.xtext.concurrent.IUnitOfWork;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.core.editor.XtextEditor;
import org.eclipse.xtext.ui.core.editor.model.XtextDocument;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.Program;

public class WorkflowGenerator {

    private Program myModel = null;
    private static String outPath = null;
    private String uriString = null;
    private IEditorPart editor = null;
    private URI uri = null;

    /**
     * The constructor sets the location in the KIELER workspace to save the sc files if you just
     * generate sc code without simulation. It also sets the variables for the EMF reader.
     */
    public WorkflowGenerator() {
        // location for the sc file in the KIELER workspace
        IParseResult result = null;
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
        editor = activePage.getActiveEditor();
        outPath = part2Location(editor);
        uriString = null;
        if (editor instanceof XtextEditor) {
            XtextEditor xtextEditor = (XtextEditor) editor;

            if (xtextEditor.getDocument() instanceof XtextDocument) {
                IUnitOfWork<IParseResult, XtextResource> work = new IUnitOfWork<IParseResult, XtextResource>() {

                    public IParseResult exec(XtextResource state) throws Exception {
                        return state.getParseResult();
                    }
                };
                result = xtextEditor.getDocument().readOnly(work);

                 myModel = (Program) result.getRootASTElement();
                 uri = myModel.eResource().getURI();
                 uriString = uri.toString();
            }
        }
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
        uri = URI.createURI(uriString);
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(uri, true);

        Module model = (Module) resource.getContents().get(0);
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
    public void invokeWorkflow(final String path, final String name) {
        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(uriString);
        emfReader.setModelSlot("model");

        // Meta model
        EmfMetaModel metaModel = new EmfMetaModel(EsterelPackage.eINSTANCE);

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(path);
        //outlet.setName(name);
        //GlobalVar file = new GlobalVar(); 
        
        // Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel);
        generator.addOutlet(outlet);

        generator.setExpand("de::cau::cs::kieler::esterel::cec::sim::templates::Data::main FOR model");

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
