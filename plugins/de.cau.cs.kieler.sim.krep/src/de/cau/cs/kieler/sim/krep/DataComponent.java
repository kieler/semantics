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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.cau.cs.kieler.dataflow.diagram.part.DataflowDiagramEditor;
import de.cau.cs.kieler.krep.compiler.main.Ec2klp;
import de.cau.cs.kieler.krep.editors.klp.KlpStandaloneSetup;
import de.cau.cs.kieler.krep.editors.klp.klp.KLP;
import de.cau.cs.kieler.krep.evalbench.comm.CommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationListener;
import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.IConnectionProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.JNIConnection;
import de.cau.cs.kieler.krep.evalbench.comm.KepProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.KrepProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.RxtxSerialConnection;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.comm.SocketConnection;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KepAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KlpAssembler;
import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;
import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeString;
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

    private IConnectionProtocol connection = null;
    private CommunicationProtocol protocol = null;
    private IAssembler assembler = null;

    private AssemblerView viewer = null;
    private ConnectionView krepView = null;

    private final int propertyConnection = 0;
    private final int propertyPort = 1;
    private final int propertyHost = 2;
    private final int propertyCom = 3;
    private final int propertyLog = 4;

    private final String ID_JNI = "JNI";
    private final String ID_RS232 = "RS 232";
    private final String ID_TCPIP = "TCP/IP";

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
            if (reactionTime > assembler.getTickLen()) {
                res.accumulate("TickWarn", JSONSignalValues.newValue(true));
            }

            trace = protocol.getExecutionTrace();
            for (int i = 0; i < trace.length; i++) {
                trace[i] = assembler.adr2row(trace[i]);
            }
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
        if (connection != null) {
            connection.dispose();
        }
        connection = null;
        assembler = null;
        viewer = null;
    }

    @Override
    public KiemProperty[] provideProperties() {
        LinkedList<KiemProperty> properties = new LinkedList<KiemProperty>();

        String[] serialPorts = RxtxSerialConnection.getSerialPorts();

        String[] items;
        if (serialPorts.length == 0) {
            items = new String[] { ID_JNI, ID_TCPIP };
        } else {
            items = new String[] { ID_JNI, ID_TCPIP, ID_RS232 };
        }
        properties.add(new KiemProperty("Connection", new KiemPropertyTypeChoice(items), items[0]));

        KiemProperty p = new KiemProperty("Port", new KiemPropertyTypeString());
        p.setValue("1234");
        properties.add(p);

        p = new KiemProperty("Host", new KiemPropertyTypeString());
        p.setValue("localhost");
        properties.add(p);

        if (serialPorts.length > 0) {
            p = new KiemProperty("RS232 port", new KiemPropertyTypeChoice(serialPorts));
            properties.add(p);
        }

        p = new KiemProperty("logFile", new KiemPropertyTypeFile());
        p.setValue("klp.esi");
        properties.add(p);

        return properties.toArray(new KiemProperty[properties.size()]);
    }

    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        try {
            viewer = (AssemblerView) (page.showView(AssemblerView.VIEW_ID));
        } catch (PartInitException e) {
            throw new KiemInitializationException("Cannot show assembler view", true, e);
        }

        try {
            krepView = (ConnectionView) (page.showView(ConnectionView.VIEW_ID, null,
                    IWorkbenchPage.VIEW_VISIBLE));
        } catch (PartInitException e) {
            throw new KiemInitializationException("Cannot show target view", true, e);
        }
        JSONObject signals = new JSONObject();
        // connection.setLogFile(getProperties()[propertyLog].getValue());
        try {
            IEditorPart editor = page.getActiveEditor();
            if (editor.getEditorInput().exists()
                    && editor.getEditorInput() instanceof FileEditorInput) {
                FileEditorInput input = (FileEditorInput) editor.getEditorInput();
                IFile file = input.getFile();
                String name = editor.getEditorInput().getName();
                if (editor instanceof DataflowDiagramEditor) {
                    data2klp(name, file);
                } else if (file.getFileExtension().equals("klp")) {
                    klp2klp(name, file);
                } else if (file.getFileExtension().equals("kasm")) {
                    kasm2kep(name, file);
                } else if (file.getFileExtension().equals("strl")) {
                    strl2kep(name, file);
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
            if (krepView != null) {
                protocol.addCommunicationListener(krepView);
            }

            try {
                if (viewer != null) {
                    viewer.setAssembler(assembler);
                }
                if (krepView != null) {
                    krepView.show(protocol.getTargetInfo());
                }

                protocol.loadProgram(assembler, null);
                int[] trace = protocol.getExecutionTrace();
                viewer.markTrace(trace);
                for (Signal s : assembler.getInputs()) {
                    signals.accumulate(s.getName(), JSONSignalValues.newValue(s.getValue(), s
                            .getPresent()));
                }
                for (Signal s : assembler.getOutputs()) {
                    signals.accumulate(s.getName(), JSONSignalValues.newValue(s.getValue(), s
                            .getPresent()));
                }
            } catch (CommunicationException e) {
                throw new KiemInitializationException("Communication Error", false, e);
            } catch (LoadException e) {
                throw new KiemInitializationException("Cannot load program", false, e);
            } catch (JSONException e) {
                throw new KiemInitializationException("JSON error", false, e);
            }
        } else {
            throw new KiemInitializationException(
                    "Active editor cannot be executed on a reactive processor.", false, null);
        }

        return signals;
    }

    /**
     * @param protocolType
     * @return
     * @throws KiemInitializationException
     */
    private IConnectionProtocol connect(final String protocolType)
            throws KiemInitializationException {
        String type = this.getProperties()[propertyConnection].getValue();
        try {
            if (type.equals(ID_JNI)) {
                return new JNIConnection(protocolType);

            } else if (type.equals(ID_TCPIP)) {

                String device = getProperties()[propertyHost].getValue();
                int port = Integer.parseInt(getProperties()[propertyPort].getValue());
                return new SocketConnection(device, port);
            } else if (type.equals(ID_RS232)) {
                String device = getProperties()[propertyCom].getValue();
                return new RxtxSerialConnection(device);
            }
        } catch (CommunicationException e) {
            throw new KiemInitializationException("Could not establish connection", true, e);
        }
        throw new KiemInitializationException("Unknown connection protocol" + type, true, null);
    }

    /**
     * @param name
     * @param file
     * @throws CommunicationException
     * @throws IOException
     * @throws KiemInitializationException
     * @throws FileNotFoundException
     * @throws ParseException
     */
    private void data2klp(final String name, final IFile file) throws CommunicationException,
            IOException, KiemInitializationException, ParseException {
        String workspace = file.getWorkspace().getRoot().getLocation().toOSString();

        /*
         * DataflowDiagramEditor dEditor = (DataflowDiagramEditor) editor; View notationElement =
         * ((View) dEditor.getDiagramEditPart().getModel()); EObject myModel = (EObject)
         * notationElement.getElement();
         */
        LustreGenerator gen = new LustreGenerator();
        String lus = gen.generateLus() + "Dummy.lus";

        String lus2ec = "/home/esterel/bin/lus2ec";

        connection = connect(ICommunicationProtocol.P_KREP);
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

        InputStream in = new FileInputStream(path + "/MAIN.ec");
        Ec2klp ec2klp = new Ec2klp();
        String ec = ec2klp.compile("Dummy", in);
        ByteArrayInputStream klp = new ByteArrayInputStream(ec.getBytes());

        Injector injector = new KlpStandaloneSetup().createInjectorAndDoEMFRegistration();
        IAntlrParser parser = injector.getInstance(IAntlrParser.class);
        IParseResult parseResult = parser.parse(klp);
        if (!parseResult.getParseErrors().isEmpty()) {
            throw new KiemInitializationException(parseResult.getParseErrors().toString(), false,
                    null);
        }
        KLP model = (KLP) parseResult.getRootASTElement();
        klpAsm.assemble(name, model);
    }

    /**
     * @param file
     * @throws CommunicationException
     * @throws CoreException
     * @throws KiemInitializationException
     * @throws ParseException
     */
    private void klp2klp(final String name, final IFile file) throws CommunicationException,
            CoreException, KiemInitializationException, ParseException {
        connection = connect(ICommunicationProtocol.P_KREP);
        protocol = new KrepProtocol(connection);
        assembler = new KlpAssembler();
        InputStream in = file.getContents();

        Injector injector = new KlpStandaloneSetup().createInjectorAndDoEMFRegistration();
        IAntlrParser parser = injector.getInstance(IAntlrParser.class);
        IParseResult parseResult = parser.parse(in);
        if (!parseResult.getParseErrors().isEmpty()) {
            throw new KiemInitializationException("Parse error", true, null);
        }
        KLP model = (KLP) parseResult.getRootASTElement();
        ((KlpAssembler) assembler).assemble(file.getName(), model);
    }

    /**
     * @param name
     * @param file
     * @throws CommunicationException
     * @throws CoreException
     * @throws ParseException
     * @throws KiemInitializationException
     */
    private void kasm2kep(final String name, final IFile file) throws CommunicationException,
            CoreException, ParseException, KiemInitializationException {
        connection = connect(ICommunicationProtocol.P_KEP);
        protocol = new KepProtocol(connection);

        KepAssembler kep = new KepAssembler();
        assembler = kep;
        InputStream in = file.getContents();
        // Reader reader = new BufferedReader(new InputStreamReader(in));
        kep.assemble(name, in);
    }

    /**
     * @param file
     * @throws CoreException
     * @throws KiemInitializationException
     * @throws IOException
     * @throws ParseException
     * @throws CommunicationException
     */
    private void strl2kep(final String name, final IFile file) throws CoreException,
            KiemInitializationException, IOException, ParseException, CommunicationException {
        InputStream strl = file.getContents();
        Bundle[] fragments = Platform.getFragments(Activator.getDefault().getBundle());

        InputStream kasm = null;

        if (fragments.length != 1) {
            throw new KiemInitializationException("strl2kasm compiler not found", false, null);
        }
        Bundle compiler = fragments[0];
        // String path = compiler.getLocation();
        String path = FileLocator.toFileURL(FileLocator.find(compiler, new Path(""), null))
                .getPath();

        Process p = Runtime.getRuntime().exec(path + "cec-strlxml");
        // Process p = Runtime.getRuntime().exec();
        InputStream xml = p.getInputStream();
        InputStream stderr = p.getErrorStream();
        OutputStream stdin = p.getOutputStream();

        while (strl.available() > 0) {
            int r = strl.read();
            stdin.write(r);
        }
        stdin.close();
        try {
            p.waitFor();
            if (p.exitValue() != 0) {
                checkErrors(stderr);
            }
            StringBuffer debug = new StringBuffer(
                    "===========================XML==================================");

            // expand modules
            p = Runtime.getRuntime().exec(path + "cec-expandmodules");
            InputStream exp = p.getInputStream();
            stdin = p.getOutputStream();
            stderr = p.getErrorStream();

            while (xml.available() > 0) {
                int r = xml.read();
                stdin.write(r);
                debug.append(Character.toChars(r));
            }
            Activator.debug(debug.toString());
            stdin.close();
            p.waitFor();
            if (p.exitValue() != 0) {
                checkErrors(stderr);
            }

            // dismantle
            p = Runtime.getRuntime().exec(new String[] { path + "cec-kepdismantle" }); // , "-d ALL"
            // });
            InputStream dis = p.getInputStream();
            stdin = p.getOutputStream();
            stderr = p.getErrorStream();

            debug = new StringBuffer(
                    "===========================EXP==================================");

            while (exp.available() > 0) {
                int r = exp.read();
                stdin.write(r);
                debug.append(Character.toChars(r));
            }
            Activator.debug(debug.toString());
            stdin.close();
            p.waitFor();
            if (p.exitValue() != 0) {
                checkErrors(stderr);
            }

            // to KEP
            p = Runtime.getRuntime().exec(new String[] { path + "cec-astkep", "-o" });
            // TODO: add -o for optimizations. Oops, must be independent of OS.
            InputStream k = p.getInputStream();
            stdin = p.getOutputStream();
            stderr = p.getErrorStream();
            debug = new StringBuffer(
                    "===========================DIS==================================");

            while (dis.available() > 0) {
                int r = dis.read();
                stdin.write(r);
                debug.append(Character.toChars(r));
            }
            Activator.debug(debug.toString());
            stdin.close();
            p.waitFor();
            if (p.exitValue() != 0) {
                checkErrors(stderr);
            }

            // to kasm
            p = Runtime.getRuntime().exec(path + "cec-xmlkasm");
            kasm = p.getInputStream();
            stdin = p.getOutputStream();
            stderr = p.getErrorStream();
            while (k.available() > 0) {
                stdin.write(k.read());
            }
            stdin.close();
            p.waitFor();
            if (p.exitValue() != 0) {
                checkErrors(stderr);
            }
        } catch (InterruptedException e) {
            throw new ParseException(e.getMessage());
        }
        connection = connect(ICommunicationProtocol.P_KEP);
        protocol = new KepProtocol(connection);

        KepAssembler kep = new KepAssembler();
        assembler = kep;

        // Reader reader = new BufferedReader(new InputStreamReader(kasm));
        kep.assemble(name, kasm);
    }

    /**
     * @param stderr
     * @throws IOException
     * @throws KiemInitializationException
     */
    private void checkErrors(final InputStream stderr) throws IOException,
            KiemInitializationException {
        if (stderr.available() > 0) {
            StringBuffer s = new StringBuffer();
            while (stderr.available() > 0) {
                s.append(Character.toChars(stderr.read()));
            }
            throw new KiemInitializationException("Parse Error: " + s.toString(), false, null);
        }
    }
}
