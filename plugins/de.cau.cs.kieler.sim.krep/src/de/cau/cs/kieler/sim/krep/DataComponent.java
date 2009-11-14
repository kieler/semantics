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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
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

import de.cau.cs.kieler.dataflow.diagram.part.DataflowDiagramEditor;
import de.cau.cs.kieler.krep.compiler.main.Ec2klp;
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

import de.cau.cs.kieler.dataflow.codegen.LustreGenerator;

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

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject data) throws KiemExecutionException {
        JSONObject res = new JSONObject();
        LinkedList<Signal> inputs = assembler.getInputs();
        LinkedList<Signal> outputs = assembler.getOutputs();
        int[] trace;
        try {
            for (Signal s : inputs) {
                if (data.has(s.getName())) {
                    Object obj = data.get(s.getName());
                    s.setPresent(JSONSignalValues.isPresent(obj));
                    Object val = JSONSignalValues.getSignalValue(obj);
                    if (s.isValued() && val != null) {
                        s.setValue(val);
                    }
                }
            }
            int reactionTime = protocol.tick(inputs.size() + outputs.size(), inputs, outputs);
            res.accumulate("Reaction Time", reactionTime);
            trace = protocol.getExecutionTrace();
            viewer.markTrace(trace);
        } catch (CommunicationException e) {
            throw new KiemExecutionException("Communication error performing tick", true, e);
        } catch (JSONException e) {
            throw new KiemExecutionException("Error in Data exchange", true, e);
        }
        try {
            for (Signal s : outputs) {

                if (s.isValued()) {
                    res.accumulate(s.getName(), JSONSignalValues.newValue(s.getValue(), s
                            .getPresent()));
                } else {
                    res.accumulate(s.getName(), JSONSignalValues.newValue(s.getPresent()));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        for (IViewReference view : page.getViewReferences()) {
            if (view.getId().equals(AssemblerView.VIEW_ID)) {
                this.viewer = (AssemblerView) (view.getView(true));
            }
        }
        if (viewer != null) {
            viewer.setAssembler(assembler);
        }
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

    /**
     * {@inheritDoc}
     */
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
        properties.add(new KiemProperty("Processor", new KiemPropertyTypeChoice(items), items[0]));
        KiemProperty fp = new KiemProperty("strl2kasm", new KiemPropertyTypeFile());
        fp.setValue("/home/esterel/bin/strl2kasm");
        properties.add(fp);

        return properties.toArray(new KiemProperty[properties.size()]);
    }

    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject signals = new JSONObject();
        connection = new JNIConnection();

        try {

            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage();
            IEditorPart editor = page.getActiveEditor();

            if (editor.getEditorInput().exists()
                    && editor.getEditorInput() instanceof FileEditorInput) {
                FileEditorInput input = (FileEditorInput) editor.getEditorInput();
                IFile file = input.getFile();
                String name = editor.getEditorInput().getName();
                if (editor instanceof DataflowDiagramEditor) {
                    String workspace = file.getWorkspace().getRoot().getLocation().toOSString();

                    /*
                     * DataflowDiagramEditor dEditor = (DataflowDiagramEditor) editor; View
                     * notationElement = ((View) dEditor.getDiagramEditPart().getModel()); EObject
                     * myModel = (EObject) notationElement.getElement();
                     */
                    LustreGenerator gen = new LustreGenerator();
                    String lus = gen.generateLus() + "Dummy.lus";

                    String lus2ec = "/home/esterel/bin/lus2ec";

                    connection.initialize(ICommunicationProtocol.P_KREP);
                    protocol = new KrepProtocol(connection);
                    KlpAssembler klpAsm = new KlpAssembler();

                    assembler = klpAsm;

                    File path = new File(workspace + file.getFullPath().removeLastSegments(1));

                    String cmd = lus2ec + " " + lus + " MAIN";
                    String[] env = new String[] { "PATH=/usr/bin/:/home/esterel/bin" };
                    Process p = Runtime.getRuntime().exec(cmd, env, path);
                    Reader out = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                    StringBuffer s = new StringBuffer();
                    while (out.ready()) {
                        s.append(Character.toChars(out.read()));
                    }
                    if (s.length() > 0) {
                        throw new KiemInitializationException(s.toString(), false, null);
                    }
                    System.out.println(s.toString());

                    InputStream in = new FileInputStream(path + "/MAIN.ec");
                    Ec2klp ec2klp = new Ec2klp();
                    String ec = ec2klp.compile("Dummy", in);
                    ByteArrayInputStream klp = new ByteArrayInputStream(ec.getBytes());

                    Injector injector = new KlpStandaloneSetup()
                            .createInjectorAndDoEMFRegistration();
                    IAntlrParser parser = injector.getInstance(IAntlrParser.class);
                    IParseResult parseResult = parser.parse(klp);
                    if (!parseResult.getParseErrors().isEmpty()) {
                        System.out.println(parseResult.getParseErrors().toString());
                        // syntax errors occured - handle them properly
                    }
                    KLP model = (KLP) parseResult.getRootASTElement();
                    klpAsm.assemble(name, model);

                } else if (file.getFileExtension().equals("klp")) {
                    connection.initialize(ICommunicationProtocol.P_KREP);
                    protocol = new KrepProtocol(connection);
                    assembler = new KlpAssembler();
                    InputStream in = file.getContents();

                    Injector injector = new KlpStandaloneSetup()
                            .createInjectorAndDoEMFRegistration();
                    IAntlrParser parser = injector.getInstance(IAntlrParser.class);
                    IParseResult parseResult = parser.parse(in);
                    if (!parseResult.getParseErrors().isEmpty()) {
                        throw new KiemInitializationException("Parse error", true, null);
                    }
                    KLP model = (KLP) parseResult.getRootASTElement();
                    ((KlpAssembler) assembler).assemble(file.getName(), model);
                } else if (file.getFileExtension().equals("kasm")) {
                    connection.initialize(ICommunicationProtocol.P_KEP);
                    protocol = new KepProtocol(connection);

                    KepAssembler kep = new KepAssembler();
                    assembler = kep;
                    InputStream in = file.getContents();
                    Reader reader = new BufferedReader(new InputStreamReader(in));
                    kep.assemble(name, reader);
                } else if (file.getFileExtension().equals("strl")) {

                    String strl2kasm = getProperties()[1].getValue();
                    String workspace = file.getWorkspace().getRoot().getLocation().toOSString();
                    connection.initialize(ICommunicationProtocol.P_KEP);
                    protocol = new KepProtocol(connection);

                    KepAssembler kep = new KepAssembler();
                    assembler = kep;

                    IPath kasm = file.getFullPath().removeFileExtension().addFileExtension("kasm");

                    Runtime.getRuntime().exec(strl2kasm + " " + name, null,
                            new File(workspace + file.getFullPath().removeLastSegments(1)));
                    InputStream in = new FileInputStream(file.getWorkspace().getRoot()
                            .getLocation().toOSString()
                            + kasm.toString());
                    Reader reader = new BufferedReader(new InputStreamReader(in));
                    kep.assemble(name, reader);

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
        } catch (IOException e) {
            throw new KiemInitializationException("Assembler file not found", true, e);
        } catch (ParseException e) {
            assembler = null;
            throw new KiemInitializationException("Cannot parse assembler file", true, e);
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
                throw new KiemInitializationException("Communication Error", true, e);
            } catch (LoadException e) {
                e.printStackTrace();
                throw new KiemInitializationException("Cannot load program", true, e);
            }
            if (assembler != null) {
                try {
                    for (Signal s : assembler.getInputs()) {

                        signals.accumulate(s.getName(), JSONSignalValues.newValue(s.getValue(), s
                                .getPresent()));
                    }
                    for (Signal s : assembler.getOutputs()) {
                        signals.accumulate(s.getName(), JSONSignalValues.newValue(s.getValue(), s
                                .getPresent()));
                    }
                } catch (JSONException e) {
                   throw new KiemInitializationException("JSON error", false, e); 
                }
            }
        }
        return signals;
    }
}
