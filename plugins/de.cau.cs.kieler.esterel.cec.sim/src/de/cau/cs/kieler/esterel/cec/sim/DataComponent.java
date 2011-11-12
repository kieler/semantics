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
import java.util.LinkedList;

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
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.esterel.cec.CEC;
import de.cau.cs.kieler.core.kexpressions.Input;
import de.cau.cs.kieler.kies.esterel.Module;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.kies.esterel.Program;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

/**
 * @author ctr, cmot
 * 
 */
public class DataComponent extends JSONObjectSimulationDataComponent {

    private static final String ESTEREL_LANGUAGE = "de.cau.cs.kieler.esterel.Esterel";

    private Program myModel = null;
    private Process process = null;
    private PrintWriter toEsterel = null;
    private BufferedReader fromEsterel = null;
    private BufferedReader error = null;
 
    private File strlFile = null;
    private File dataFile = null;
    private File simFile = null;

    private LinkedList<String> outputs = null;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {

    }

    /**
     * {@inheritDoc}
     */
    public JSONObject doStep(final JSONObject jSONObject) throws KiemExecutionException {
        if (process == null) {
            throw new KiemExecutionException("No esterel simulation is running", true, null);
        }
        JSONObject out = null;
        try {

            toEsterel.write(jSONObject.toString() + "\n");
            toEsterel.flush();
            while (error.ready()) {
                System.out.print(error.read());
            }

            String receivedMessage = fromEsterel.readLine();

            // print and delete debug information
            out = new JSONObject(receivedMessage);
            for (String o : outputs) {
                if (!out.has(o)) {
                    out.accumulate(o, JSONSignalValues.newValue(false));
                }
            }
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
    public KiemProperty[] doProvideProperties() {
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
        boolean ok = true;

        if (strlFile != null && strlFile.exists()) {
            ok &= strlFile.delete();
        }
        if (dataFile != null && dataFile.exists()) {
            ok &= dataFile.delete();
        }
        if (simFile != null && simFile.exists()) {
            ok &= simFile.delete();
        }
        strlFile = null;
        dataFile = null;
        simFile = null;

        if (ok) {
            throw new KiemInitializationException("Could not delete temp files", false, null);
        }
    }

    @Override
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
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

                        /** parse Esterel code to retrieve IO */
                        public IParseResult exec(final XtextResource state) throws Exception {
                            return state.getParseResult();
                        }
                    };
                    IParseResult result = xtextEditor.getDocument().readOnly(work);

                    myModel = (Program) result.getRootASTElement();
                }
            }

            if (myModel == null) {
                throw new KiemInitializationException(
                        "Cannot simulate active editor using the CEC", true, null);
            }

            FileEditorInput input = (FileEditorInput) editor.getEditorInput();

            // compile Esterel to C
            URL output = CEC.run(input.getURI()).toURL();
            strlFile = new File(output.getPath());
            // generate data.c
            URL data = generateData();
            dataFile = new File(data.getPath());

            // compile C code
            Bundle bundle = Platform.getBundle("de.cau.cs.kieler.esterel.cec.sim");

            URL bundleLocation = FileLocator.toFileURL(FileLocator.find(bundle, new Path(
                    "simulation"), null));

            File executable = File.createTempFile("sim", "");
            simFile = executable;
            String compiler = (getProperties()[0]).getValue();
            String compile = compiler + " " + output.getPath() + " " + data.getPath() + " "
                    + bundleLocation.getPath() + "cJSON.c " + "-I " + bundleLocation.getPath()
                    + " " + "-lm -o " + executable;
            process = Runtime.getRuntime().exec(compile);
            InputStream stderr = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            StringBuilder errorString = new StringBuilder();
            while ((line = br.readLine()) != null) {
                errorString.append("\n" + line);

            }

            int exitValue = process.waitFor();

            if (exitValue != 0) {
                throw new KiemInitializationException("could not compile", true, new Exception(
                        errorString.toString()));
            }

            // run
            process = Runtime.getRuntime().exec(executable.getPath());

            toEsterel = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
            fromEsterel = new BufferedReader(new InputStreamReader(process.getInputStream()));
            error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        } catch (IOException e) {
            throw new KiemInitializationException("Error compiling Esterel file", true, e);
        } catch (InterruptedException e) {
            throw new KiemInitializationException("Error running Esterel file", true, e);
        }
        outputs = new LinkedList<String>();
        JSONObject res = new JSONObject();
        try {
            if (myModel != null) {
                for (Module mod : myModel.getModules()) {
                    for (InterfaceSignalDecl sig : mod.getInterface().getIntSignalDecls()) {
                        if (sig instanceof Input) {
                            for (Signal s : sig.getSignals()) {
                                res.accumulate(s.getName(), JSONSignalValues.newValue(true));
                            }
                        }
                        if (sig instanceof Output) {
                            for (Signal s : sig.getSignals()) {
                                res.accumulate(s.getName(), JSONSignalValues.newValue(true));
                                outputs.add(s.getName());
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
            wg.invokeWorkflow(data.getPath());
            return data.toURI().toURL();
        } catch (IOException e) {
            throw new KiemInitializationException("Error creating data file", true, e);

        }
    }
}
