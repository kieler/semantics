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
package de.cau.cs.kieler.esterel.cec.sim;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.core.editor.XtextEditor;
import org.eclipse.xtext.ui.core.editor.model.XtextDocument;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.esterel.cec.CEC;
import de.cau.cs.kieler.esterel.esterel.Input;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.Output;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.esterel.Signal;
import de.cau.cs.kieler.esterel.esterel.SignalDecl;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.automated.AbstractAutomatedProducer;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;

/**
 * @author ctr
 * 
 */
public class DataComponent extends AbstractAutomatedProducer {

    private static final String ESTEREL_LANGUAGE = "de.cau.cs.kieler.esterel.Esterel";

    private Program myModel;
    private Process process = null;
    private PrintWriter toEsterel;
    private BufferedReader fromEsterel;
    private BufferedReader error;
    private String outPath;
    private boolean validation;
    private String fileLocation;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {

    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        if (process == null) {
            throw new KiemExecutionException("No esterel simulation is running", true, null);
        }
        JSONObject out = null;
        try {

            // InputStream input = new InputStream();

            toEsterel.write(jSONObject.toString() + "\n");
            toEsterel.flush();
            while (error.ready()) {
                System.out.print(error.read());
            }

            String receivedMessage = fromEsterel.readLine();
            // print and delete debug information

            out = new JSONObject(receivedMessage);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            process.destroy();
        } catch (JSONException e) {
            e.printStackTrace();
            process.destroy();
        }
        return out;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    @Override
    public KiemProperty[] provideProperties() {
        final int nProperties = 1;
        KiemProperty[] properties = new KiemProperty[nProperties];
        KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
        properties[0] = new KiemProperty("compiler", compilerFile, "gcc");

        return properties;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        if (process != null) {
            process.destroy();
        }
        // TODO: delete files

    }

    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        try {
            // get active editor
            IWorkbench workbench = PlatformUI.getWorkbench();
            IWorkbenchPage page = null;
            if (workbench != null) {
                IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
                if (window != null) {
                    page = window.getActivePage();
                }
            }
            if (page == null) {
                throw new KiemInitializationException("Cannot get active page", true, null);
            }

            IEditorPart editor = page.getActiveEditor();
            if (editor == null) {
                throw new KiemInitializationException("No active editor selected!", true, null);
            }

            if (editor instanceof XtextEditor) {
                XtextEditor xtextEditor = (XtextEditor) editor;

                if (xtextEditor.getDocument() instanceof XtextDocument
                        && xtextEditor.getLanguageName().equals(ESTEREL_LANGUAGE)) {
                    IUnitOfWork<IParseResult, XtextResource> work = new IUnitOfWork<IParseResult, XtextResource>() {

                        public IParseResult exec(XtextResource state) throws Exception {
                            return state.getParseResult();
                        }
                    };
                    IParseResult result = xtextEditor.getDocument().readOnly(work);

                    myModel = (Program) result.getRootASTElement();
                }
            }

            if (!editor.getEditorInput().exists()
                    || !(editor.getEditorInput() instanceof FileEditorInput)) {
                throw new KiemInitializationException("Cannot simulate active editor", true, null);
            }

            FileEditorInput input = (FileEditorInput) editor.getEditorInput();

            // compile Esterel to C
            URL output = CEC.run(input.getURI()).toURL();

            // generate data.c
            URL data = generateData();

            // compile C code
            Bundle bundle = Platform.getBundle("de.cau.cs.kieler.synccharts.codegen.sc");

            URL bundleLocation = FileLocator.toFileURL(FileLocator.find(bundle, new Path(
                    "simulation"), null));

            File executable = File.createTempFile("sim", "");
            String compiler = (getProperties()[0]).getValue();
            String compile = compiler + " " + output.getPath() + " " + data.getPath() + " "
                    + bundleLocation.getPath() + "cJSON.c " + "-I " + bundleLocation.getPath()
                    + " " + "-lm -o " + executable;
            process = Runtime.getRuntime().exec(compile);
            InputStream stderr = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            String errorString = "";
            while ((line = br.readLine()) != null) {
                errorString += "\n" + line;

            }

            int exitValue = process.waitFor();

            if (exitValue != 0) {
                throw new KiemInitializationException("could not compile", true, new Exception(
                        errorString));
            }

            // run
            process = Runtime.getRuntime().exec(executable.getPath());

            toEsterel = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
            fromEsterel = new BufferedReader(new InputStreamReader(process.getInputStream()));
            error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        } catch (IOException e) {
            throw new KiemInitializationException("Error compiling Esterel file", true, e);
        } catch (KielerException e) {
            throw new KiemInitializationException("Error compiling Esterel file", true, e);
        } catch (InterruptedException e) {
            throw new KiemInitializationException("Error running Esterel file", true, e);
        }
        JSONObject res = new JSONObject();
        try {
            if (myModel != null) {
                for (Module mod : myModel.getModule()) {
                    for (SignalDecl sig : mod.getModInt().getIntSignalDecl()) {
                        if (sig instanceof Input || sig instanceof Output) {
                            for (Signal s : sig.getSignal()) {
                                res.accumulate(s.getName(), JSONSignalValues.newValue(true));
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            // ignore
        }
        return res;
    }

    /**
     * @return
     * @throws KiemInitializationException
     */
    private URL generateData() throws KiemInitializationException {
        File data;
        try {
            data = File.createTempFile("data", ".c");

            WorkflowGenerator wg = new WorkflowGenerator();
            wg.invokeWorkflow(data.getPath(), data.getName());
            return data.toURI().toURL();
        } catch (IOException e) {
            throw new KiemInitializationException("Error creating data file", true, e);

        }
    }

    public List<KiemProperty> produceInformation() {
        return null;
    }

    public String[] getSupportedExtensions() {
        String[] test = { "strl" };
        return test;
    }

    public void setParameters(List<KiemProperty> properties) throws KiemInitializationException {
        validation = true;
        for (KiemProperty p : properties) {
            if (p.getKey().equals(MODEL_FILE)) {
                fileLocation = p.getValue();
            }
        }
    }

    public int wantsMoreRuns() {
        return 0;
    }

    public int wantsMoreSteps() {
        return 0;
    }
}
