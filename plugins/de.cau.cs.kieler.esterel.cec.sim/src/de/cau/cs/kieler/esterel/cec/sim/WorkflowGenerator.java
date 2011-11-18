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
package de.cau.cs.kieler.esterel.cec.sim;

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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.kies.esterel.Program;

/**
 * Generate interface code (A_data.c) for an Esterel module A.strl.
 * 
 * @author ctr
 * 
 */
public class WorkflowGenerator {

    private Program myModel = null;
    private String uriString = null;
    private URI uri = null;

    /**
     * The constructor sets the location in the KIELER workspace to save the sc files if you just
     * generate sc code without simulation. It also sets the variables for the EMF reader.
     */
    public WorkflowGenerator(IEditorPart editor) {
        IParseResult result = null;
        uriString = null;
        if (editor instanceof XtextEditor) {
            XtextEditor xtextEditor = (XtextEditor) editor;

            if (xtextEditor.getDocument() instanceof XtextDocument) {
                IUnitOfWork<IParseResult, XtextResource> work = new IUnitOfWork<IParseResult, XtextResource>() {

                    public IParseResult exec(final XtextResource state) throws Exception {
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
     * Invocation of the workflow. Prepares the environment for generating code.
     * 
     * @param path
     *            the path where the generated files should be written
     */
    public void invokeWorkflow(final String path) {
        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(uriString);
        emfReader.setModelSlot("model");

        // Meta model
        EmfMetaModel metaModel = new EmfMetaModel(EsterelPackage.eINSTANCE);

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(path);

        // Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel);
        generator.addOutlet(outlet);

        generator
                .setExpand("de::cau::cs::kieler::esterel::cec::sim::templates::Data::main FOR model");

        //Workflow workflow = new Workflow();

       // workflow.addComponent(emfReader);
        //workflow.addComponent(generator);

        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new IssuesImpl();
        NullProgressMonitor monitor = new NullProgressMonitor();

        emfReader.invoke(wfx, monitor, issues);
        generator.invoke(wfx, monitor, issues);

        //workflow.invoke(wfx, monitor, issues);

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
