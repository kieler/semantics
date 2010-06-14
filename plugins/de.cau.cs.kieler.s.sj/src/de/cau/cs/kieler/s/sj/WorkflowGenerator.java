package de.cau.cs.kieler.s.sj;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVar;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.s.codegen.AbstractWorkflowGenerator;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.s.SPackage;

public class WorkflowGenerator extends AbstractWorkflowGenerator {

    private IEditorPart editor = null;

    /**
     * The constructor sets the location in the KIELER workspace to save the sc
     * files if you just generate sc code without simulation. It also sets the
     * variables for the EMF reader.
     */
    public WorkflowGenerator() {
        super();
    }

    /**
     * The constructor to use a given diagram (as *.kixs file) for generating
     * code.
     * 
     * @param fileLocation
     *            the location of the given diagram file
     */
    public WorkflowGenerator(final String fileLocation) {
        super(fileLocation);
    }

    /**
     * Invocation of the workflow. Prepares the environment for generating code.
     * 
     * @param sim
     *            is false if you just want to generate code and true if you
     *            want to generate code and simulate it
     * @param path
     *            the path where the generated files should be written
     */
    @Override
    public void invokeWorkflow(final boolean sim, final String path) {
        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(uriString);
        emfReader.setModelSlot("model");

        // name of the file (from root state)
        String filename = ((Program) myModel).getName();

        // Meta model
        EmfMetaModel metaModel = new EmfMetaModel(SPackage.eINSTANCE);

        if (sim) {
            outPath = path;
        }

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);

        // Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel);
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
            Status status = new Status(issueValue, S2SJPlugin.PLUGIN_ID, issue
                    .toString(), null);
            StatusManager.getManager().handle(status, StatusManager.LOG);
        }

        File file;
        if (sim) {
            file = new File(outPath + "sim.c");
            File dataFile = new File(outPath + "sim_data.c");
        } else {
            file = new File(outPath + filename + ".c");
        }
        file.setExecutable(true);
    }

    private static String part2Location(final IEditorPart editor) {
        String out = null;

        FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");

        return out;
    }
}
