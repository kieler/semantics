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
 */
package de.cau.cs.kieler.sim.krep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;

import com.google.inject.Injector;

import de.cau.cs.kieler.krep.editors.klp.KlpStandaloneSetup;
import de.cau.cs.kieler.krep.editors.klp.klp.KLP;
import de.cau.cs.kieler.krep.evalbench.comm.CommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.JNIConnection;
import de.cau.cs.kieler.krep.evalbench.comm.KepProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.KrepProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KepAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KlpAssembler;
import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * Integrates the KReP execution into KIELER.
 * 
 * @author ctr
 * 
 */
public final class DataComponent extends JSONObjectDataComponent {

    private JNIConnection connection = null;
    private CommunicationProtocol protocol = null;
    private IAssembler assembler = null;

    private AssemblerView viewer = null;

    @Override
    public JSONObject step(final JSONObject data) throws KiemExecutionException {
        JSONObject res = new JSONObject();
        LinkedList<Signal> inputs = assembler.getInputs();
        LinkedList<Signal> outputs = assembler.getOutputs();
        int[] trace;
        try {
            for (Signal s : inputs) {
                s.setPresent(data.has(s.getName())
                        && (JSONSignalValues.isPresent(data.get(s.getName()))));
            }
            protocol.tick(inputs.size() + outputs.size(), inputs, outputs);
            trace = protocol.getExecutionTrace();
            viewer.markTrace(trace);
        } catch (CommunicationException e) {
            throw new KiemExecutionException(
                    "Communication error performing tick", true, e);
        } catch (JSONException e) {
            throw new KiemExecutionException("Error in Data exchange", true, e);
        }
        try {
            for (Signal s : outputs) {
                res.accumulate(s.getName(), JSONSignalValues.newValue(s
                        .getPresent()));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void initialize() throws KiemInitializationException {
        IWorkbenchPage page = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();
        for (IViewReference view : page.getViewReferences()) {
            if (view.getId().equals(AssemblerView.VIEW_ID)) {
                this.viewer = (AssemblerView) (view.getView(true));
            }
        }
        if (viewer != null) {
            viewer.setAssembler(assembler);
        }
    }

    @Override
    public boolean isObserver() {
        return true;
    }

    @Override
    public boolean isProducer() {
        return true;
    }

    @Override
    public void wrapup() throws KiemInitializationException {
        connection.dispose();
        connection = null;
        assembler = null;
        protocol = null;
        viewer = null;
    }

    @Override
    public KiemProperty[] provideProperties() {
        LinkedList<KiemProperty> properties = new LinkedList<KiemProperty>();
        String[] items = { "KEP", "KLP" };
        properties.add(new KiemProperty("Processor",
                new KiemPropertyTypeChoice(items), items[0]));
        KiemProperty fp = new KiemProperty("strl2kasm",
                new KiemPropertyTypeFile());
        fp.setValue("/home/esterel/bin/strl2kasm");
        properties.add(fp);

        return properties.toArray(new KiemProperty[properties.size()]);
    }

    @Override
    public String[] provideInterfaceKeys() throws KiemInitializationException {
        LinkedList<String> signals = new LinkedList<String>();
        connection = new JNIConnection();

        try {

            IWorkbenchPage page = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage();
            IEditorPart editor = page.getActiveEditor();

            if (editor.getEditorInput().exists()
                    && editor.getEditorInput() instanceof FileEditorInput) {
                FileEditorInput input = (FileEditorInput) editor
                        .getEditorInput();
                IFile file = input.getFile();
                String name = editor.getEditorInput().getName();
                if (file.getFileExtension().equals("klp")) {
                    connection.initialize(ICommunicationProtocol.P_KREP);
                    protocol = new KrepProtocol(connection);
                    assembler = new KlpAssembler();
                    InputStream in = file.getContents();

                    Injector injector = new KlpStandaloneSetup()
                            .createInjectorAndDoEMFRegistration();
                    IAntlrParser parser = injector
                            .getInstance(IAntlrParser.class);
                    IParseResult parseResult = parser.parse(in);
                    if (!parseResult.getParseErrors().isEmpty()) {
                        throw new KiemInitializationException("Parse error",
                                true, null);
                    }
                    KLP model = (KLP) parseResult.getRootASTElement();
                   // ((KlpAssembler) assembler).assemble("huhu", model);
                } else if (file.getFileExtension().equals("kasm")) {
                    connection.initialize(ICommunicationProtocol.P_KEP);
                    protocol = new KepProtocol(connection);

                    KepAssembler kep = new KepAssembler();
                    assembler = kep;
                    InputStream in = file.getContents();
                    Reader reader = new BufferedReader(
                            new InputStreamReader(in));
                    kep.assemble(name, reader);
                } else if (file.getFileExtension().equals("strl")) {
                    try {
                        String strl2kasm = getProperties()[1].getValue();
                        String workspace = file.getWorkspace().getRoot()
                                .getLocation().toOSString();
                        connection.initialize(ICommunicationProtocol.P_KEP);
                        protocol = new KepProtocol(connection);

                        KepAssembler kep = new KepAssembler();
                        assembler = kep;

                        IPath kasm = file.getFullPath().removeFileExtension()
                                .addFileExtension("kasm");

                        Runtime.getRuntime().exec(strl2kasm + " " + name, null,
                                new File(workspace + file.getFullPath().removeLastSegments(1)));
                        InputStream in = new FileInputStream(file
                                .getWorkspace().getRoot().getLocation()
                                .toOSString()
                                + kasm.toString());
                        Reader reader = new BufferedReader(
                                new InputStreamReader(in));
                        kep.assemble(name, reader);
                    } catch (IOException e) {
                        throw new KiemInitializationException(
                                "Assembler file not found", true, e);
                    }
                }
            }

            if (assembler == null) {
                if (getProperties()[0].getValue().equals("KLP")) {
                    connection.initialize(ICommunicationProtocol.P_KREP);
                    protocol = new KrepProtocol(connection);
                    assembler = new KlpAssembler();
                } else {
                    connection.initialize(ICommunicationProtocol.P_KEP);
                    protocol = new KepProtocol(connection);
                    assembler = new KepAssembler();
                }
                FileReader in = new FileReader(getProperties()[1].getValue());
                if (in != null) {
                    assembler.assemble(getProperties()[1].getValue(), in);
                }
            }

        } catch (FileNotFoundException e) {
            assembler = null;
            throw new KiemInitializationException("Cannot find assembler file",
                    true, e);
        } catch (ParseException e) {
            assembler = null;
            throw new KiemInitializationException(
                    "Cannot parse assembler file", true, e);
        } catch (CommunicationException e) {
            assembler = null;
            throw new KiemInitializationException("Connection failed", true, e);
        } catch (CoreException e) {
            throw new KiemInitializationException("Core exception", true, e);
        }
        if (assembler != null) {
            try {
                protocol.loadProgram(assembler, null);
            } catch (CommunicationException e) {
                e.printStackTrace();
                throw new KiemInitializationException("Communication Error",
                        true, e);
            } catch (LoadException e) {
                e.printStackTrace();
                throw new KiemInitializationException("Cannot load program",
                        true, e);
            }
            if (assembler != null) {
                for (Signal s : assembler.getInputs()) {
                    signals.add(s.getName());
                }
                for (Signal s : assembler.getOutputs()) {
                    signals.add(s.getName());
                }
            }
        }
        return signals.toArray(new String[signals.size()]);
    }

}
