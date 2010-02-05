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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.cau.cs.kieler.dataflow.codegen.LustreGenerator;
import de.cau.cs.kieler.dataflow.diagram.part.DataflowDiagramEditor;
import de.cau.cs.kieler.krep.compiler.main.Ec2klp;
import de.cau.cs.kieler.krep.editors.klp.KlpStandaloneSetup;
import de.cau.cs.kieler.krep.editors.klp.klp.KLP;
import de.cau.cs.kieler.krep.evalbench.comm.CommunicationProtocol;
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
import de.cau.cs.kieler.sim.kiem.IAutomatedProducer;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeString;

/**
 * Integrates the KReP execution into KIELER.
 * 
 * @author ctr
 * 
 */
public final class DataComponent extends JSONObjectDataComponent implements
        IAutomatedProducer {

    private IConnectionProtocol connection = null;
    private CommunicationProtocol protocol = null;
    private IAssembler assembler = null;

    private AssemblerView viewer = null;
    private ConnectionView krepView = null;
    private IPath modelFile = null;

    // WCRT
    private int maxRT = Integer.MIN_VALUE;
    private int minRT = Integer.MAX_VALUE;
    private int rt = 0;
    private int steps = 1;

    /*
     * number of the properties in the property array. This is established in provideProperties
     * method and used in the connect method.
     */
    private static final int PROP_CONNECTION_TYPE = 0;
    private static final int PROP_LOG_FILE = 1;
    private static final int PROP_PORT = 2;
    private static final int PROP_HOST = 3;
    /* Should be the last, since the SERIAL port property is not always available! */
    private static final int PROP_SERIAL_PORT = 4;

    /** Identifier to connect via java native interface. */
    private static final String ID_JNI = "JNI";
    /** Identifier to connect via the serial port. */
    private static final String ID_RS232 = "RS 232";
    /** Identifier to connect via a TCP/IP connection. */
    private static final String ID_TCPIP = "TCP/IP";

    /** timeout when running CEC processes in ms. */
    private static final int CEC_TIMEOUT = 100;
    /** frequency to check whether new output is generated. */
    private static final int CEC_STEP = 100;

    @Override
    public String getDataComponentId() {
        return "krep";
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject data) throws KiemExecutionException {
        JSONObject res = new JSONObject();
        LinkedList<Signal> inputs = assembler.getInputs();
        LinkedList<Signal> outputs = new LinkedList<Signal>();
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
            int reactionTime = protocol.tick(inputs.size() + outputs.size(),
                    inputs, outputs);
            if (reactionTime > maxRT) {
                maxRT = reactionTime;
            }
            if (reactionTime < minRT) {
                minRT = reactionTime;
            }
            rt += reactionTime;
            steps++;
            res.accumulate("Reaction Time", reactionTime);
            if (reactionTime > assembler.getTickLen()) {
                res.accumulate("TickWarn", JSONSignalValues.newValue(true));
            }

            trace = protocol.getExecutionTrace();
            for (int i = 0; i < trace.length; i++) {
                trace[i] = assembler.adr2row(trace[i]);
            }
            if (viewer != null) {
                viewer.markTrace(trace);
            }
        } catch (CommunicationException e) {
            throw new KiemExecutionException(
                    "Communication error performing tick", true, e);
        } catch (JSONException e) {
            throw new KiemExecutionException("Error in Data exchange", true, e);
        }
        try {
            for (Signal s : outputs) {
                if (s.isValued()) {
                    res.accumulate(s.getName(), JSONSignalValues.newValue(s
                            .getValue(), s.getPresent()));
                } else {
                    res.accumulate(s.getName(), JSONSignalValues.newValue(s
                            .getPresent()));
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
        properties.add(new KiemProperty("Connection",
                new KiemPropertyTypeChoice(items), items[0]));

        KiemProperty p = new KiemProperty("logFile", new KiemPropertyTypeFile());
        p.setValue("klp.esi");
        properties.add(p);

        p = new KiemProperty("Port", new KiemPropertyTypeString());
        p.setValue("1234");
        properties.add(p);

        p = new KiemProperty("Host", new KiemPropertyTypeString());
        p.setValue("localhost");
        properties.add(p);

        if (serialPorts.length > 0) {
            p = new KiemProperty("RS232 port", new KiemPropertyTypeChoice(
                    serialPorts));
            properties.add(p);
        }

        return properties.toArray(new KiemProperty[properties.size()]);
    }

    @Override
    public JSONObject provideInitialVariables()
            throws KiemInitializationException {
        IWorkbench workbench = PlatformUI.getWorkbench();
        IWorkbenchPage page = null;
        if (workbench != null) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
            if (window != null) {
                page = window.getActivePage();
                if (page != null) {

                    try {
                        viewer = (AssemblerView) (page
                                .showView(AssemblerView.VIEW_ID));
                    } catch (PartInitException e) {
                        throw new KiemInitializationException(
                                "Cannot show assembler view", true, e);
                    }

                    try {
                        krepView = (ConnectionView) (page.showView(
                                ConnectionView.VIEW_ID, null,
                                IWorkbenchPage.VIEW_VISIBLE));
                    } catch (PartInitException e) {
                        throw new KiemInitializationException(
                                "Cannot show target view", true, e);
                    }
                }
            }
        }
        JSONObject signals = new JSONObject();

        try {
            if (modelFile != null) {
                IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(
                        modelFile);
                String name = modelFile.removeLastSegments(1).lastSegment();
                if (file.getFileExtension().equals("klp")) {
                    klp2klp(name, file);
                } else if (file.getFileExtension().equals("kasm")) {
                    kasm2kep(name, file);
                } else if (file.getFileExtension().equals("strl")) {
                    strl2kep(name, file);
                }
            } else if (page != null) {
                // take active editor
                IEditorPart editor = page.getActiveEditor();
                if (editor.getEditorInput().exists()
                        && editor.getEditorInput() instanceof FileEditorInput) {
                    FileEditorInput input = (FileEditorInput) editor
                            .getEditorInput();
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
            }
        } catch (IOException e) {
            throw new KiemInitializationException("Assembler file not found",
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
                if (viewer != null) {
                    viewer.markTrace(trace);
                }
                for (Signal s : assembler.getInputs()) {
                    signals.accumulate(s.getName(), JSONSignalValues.newValue(s
                            .getValue(), s.getPresent()));
                }
                for (Signal s : assembler.getOutputs()) {
                    signals.accumulate(s.getName(), JSONSignalValues.newValue(s
                            .getValue(), s.getPresent()));
                }
            } catch (CommunicationException e) {
                throw new KiemInitializationException("Communication Error",
                        false, e);
            } catch (LoadException e) {
                throw new KiemInitializationException("Cannot load program",
                        false, e);
            } catch (JSONException e) {
                throw new KiemInitializationException("JSON error", false, e);
            }
        } else {
            throw new KiemInitializationException(
                    "Active editor cannot be executed on a reactive processor.",
                    false, null);
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
        String type = this.getProperties()[PROP_CONNECTION_TYPE].getValue();
        try {
            if (type.equals(ID_JNI)) {
                String logFile = this.getProperties()[PROP_LOG_FILE].getValue();
                return new JNIConnection(protocolType, logFile);
            } else if (type.equals(ID_TCPIP)) {

                String device = getProperties()[PROP_HOST].getValue();
                int port = Integer.parseInt(getProperties()[PROP_PORT]
                        .getValue());
                return new SocketConnection(device, port);
            } else if (type.equals(ID_RS232)) {
                String device = getProperties()[PROP_SERIAL_PORT].getValue();
                return new RxtxSerialConnection(device);
            }
        } catch (CommunicationException e) {
            throw new KiemInitializationException(
                    "Could not establish connection", true, e);
        }
        throw new KiemInitializationException("Unknown connection protocol"
                + type, true, null);
    }

    /**
     * @param name
     *            human readable name of the file
     * @param file
     *            the dataflow diagram that is executed
     * @throws IOException
     * @throws KiemInitializationException
     * @throws FileNotFoundException
     * @throws ParseException
     */
    private void data2klp(final String name, final IFile file)
            throws IOException, KiemInitializationException, ParseException {
        String workspace = file.getWorkspace().getRoot().getLocation()
                .toOSString();

        LustreGenerator gen = new LustreGenerator();
        String lus = gen.generateLus() + "Dummy.lus";

        String lus2ec = "lus2ec";

        connection = connect(ICommunicationProtocol.P_KREP);
        protocol = new KrepProtocol(connection);
        KlpAssembler klpAsm = new KlpAssembler();

        assembler = klpAsm;

        File path = new File(workspace
                + file.getFullPath().removeLastSegments(1));

        String cmd = lus2ec + " " + lus + " MAIN";
        String[] env = new String[] { "PATH=/usr/bin/:/home/esterel/bin" };
        Process p = Runtime.getRuntime().exec(cmd, env, path);
        Reader out = new BufferedReader(new InputStreamReader(p
                .getErrorStream()));
        StringBuffer s = new StringBuffer();
        while (out.ready()) {
            s.append(Character.toChars(out.read()));
        }
        if (s.length() > 0) {
            throw new KiemInitializationException(s.toString(), false, null);
        }

        InputStream in = new FileInputStream(path + "/MAIN.ec");
        Ec2klp ec2klp = new Ec2klp();
        String ec = ec2klp.compile("Dummy", in, true);
        ByteArrayInputStream klp = new ByteArrayInputStream(ec.getBytes());

        Injector injector = new KlpStandaloneSetup()
                .createInjectorAndDoEMFRegistration();
        IAntlrParser parser = injector.getInstance(IAntlrParser.class);
        IParseResult parseResult = parser.parse(klp);
        if (!parseResult.getParseErrors().isEmpty()) {
            throw new KiemInitializationException(parseResult.getParseErrors()
                    .toString(), false, null);
        }
        KLP model = (KLP) parseResult.getRootASTElement();
        klpAsm.assemble(name, model);
    }

    /**
     * @param name
     *            human readable name of the file
     * @param file
     *            the KLP assembler file that is executed
     * @throws CommunicationException
     * @throws CoreException
     * @throws KiemInitializationException
     * @throws ParseException
     */
    private void klp2klp(final String name, final IFile file)
            throws CommunicationException, CoreException,
            KiemInitializationException, ParseException {
        connection = connect(ICommunicationProtocol.P_KREP);
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
    }

    /**
     * @param name
     *            human readable name of the file
     * @param file
     *            the KEP assembler file that is executed
     * @throws CoreException
     * @throws ParseException
     * @throws KiemInitializationException
     */
    private void kasm2kep(final String name, final IFile file)
            throws CoreException, ParseException, KiemInitializationException {
        connection = connect(ICommunicationProtocol.P_KEP);
        protocol = new KepProtocol(connection);

        KepAssembler kep = new KepAssembler();
        assembler = kep;
        InputStream in = file.getContents();
        kep.assemble(name, in);
    }

    /**
     * @param name
     *            human readable name of the file
     * @param file
     *            the Esterel file that is executed
     * @throws KiemInitializationException
     * @throws ParseException
     *             thrown if the compilation fails
     */
    private void strl2kep(final String name, final IFile file)
            throws KiemInitializationException, ParseException {
        InputStream strl;
        try {
            strl = file.getContents();
        } catch (CoreException e) {
            throw new KiemInitializationException("cannot load file", true, e);
        }
        Bundle[] fragments = Platform.getFragments(Activator.getDefault()
                .getBundle());

        if (fragments.length != 1) {
            throw new KiemInitializationException(
                    "strl2kasm compiler not found", false, null);
        }
        Bundle compiler = fragments[0];

        String path;
        try {
            path = FileLocator.toFileURL(
                    FileLocator.find(compiler, new Path(""), null)).getPath();
        } catch (IOException e) {
            throw new KiemInitializationException("cannot load file", true, e);
        }

        InputStream xml = cecRun("strl2xml", path + "cec-strlxml", strl);
        InputStream exp = cecRun("expandModules", path + "cec-expandmodules",
                xml);
        InputStream dis = cecRun("dismantle", path + "cec-kepdismantle ", exp); // "-d ALL"
        InputStream kep = cecRun("generateCKAG", path + "cec-astkep -o", dis);
        // TODO: add -o for optimizations. Oops, must be independent of OS.
        InputStream kasm = cecRun("writeKASM", path + "cec-xmlkasm", kep);

        connection = connect(ICommunicationProtocol.P_KEP);
        protocol = new KepProtocol(connection);

        KepAssembler asm = new KepAssembler();
        assembler = asm;

        asm.assemble(name, kasm);
    }

    /**
     * Run a cec process with a timeout.
     * 
     * @param name
     *            human readable name of the process
     * @param cmd
     *            command that is actually executed
     * @param input
     *            the stdin that is feed to the executed program
     * @return the output that was generated by the program
     * 
     * @throw KiemInitializationException if the compilation is not successful
     */
    private InputStream cecRun(final String name, final String cmd,
            final InputStream input) throws KiemInitializationException {

        Process p;
        try {
            p = Runtime.getRuntime().exec(cmd);

            ByteArrayOutputStream output = new ByteArrayOutputStream();

            InputStream stdout = p.getInputStream();
            InputStream stderr = p.getErrorStream();
            OutputStream stdin = p.getOutputStream();
            StringBuffer debug = new StringBuffer(name + ":\n");

            while (input.available() > 0) {
                int r = input.read();
                stdin.write(r);
                debug.append(Character.toChars(r));
            }
            Activator.debug(debug.toString());
            stdin.close();

            int time = 0;
            while (time < CEC_TIMEOUT) {
                if (stdout.available() > 0) {
                    output.write(stdout.read());
                    time = 0;
                } else {
                    try {
                        Thread.sleep(CEC_TIMEOUT / CEC_STEP);
                    } catch (InterruptedException e) {
                        // silently ignore
                    }
                    time += CEC_TIMEOUT / CEC_STEP;
                }
            }
            try {
                StringBuffer err = new StringBuffer();
                while (stderr.available() > 0) {
                    err.append(Character.toChars(stderr.read()));
                }
                stdin.close();
                stdout.close();
                stderr.close();
                try {
                    Thread.sleep(CEC_TIMEOUT);
                } catch (InterruptedException e) {
                    // silently ignore
                }
                if (p.exitValue() != 0 && err.length() > 0) {
                    throw new KiemInitializationException("Parse Error: "
                            + err.toString(), false, null);
                }
            } finally {
                p.destroy();
            }

            if (p.exitValue() != 0) {
                throw new KiemInitializationException("error in " + name, true,
                        null);
            }
            return new ByteArrayInputStream(output.toByteArray());
        } catch (IOException e1) {
            throw new KiemInitializationException("error compiling file "
                    + name, true, e1);
        }

    }

    /**
     * {@inheritDoc}
     */
    public List<KiemProperty> produceInformation() {
        List<KiemProperty> res = new LinkedList<KiemProperty>();
        res.add(new KiemProperty("Est. Reaction Time", assembler.getTickLen()));
        res.add(new KiemProperty("Reaction Time", "{" + minRT + "/ "
                + (steps == 0 ? 0 : rt / steps) + "/" + maxRT + "}"));
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public void setParameters(final List<KiemProperty> properties) {
        String model = null;
        for (KiemProperty p : properties) {
            if (p.getKey().equals(MODEL_FILE)) {
                model = p.getValue();
            }
        }
        if (model != null) {
            modelFile = Path.fromOSString(model);
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean wantsAnotherRun() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean wantsNextStep() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreRuns() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreSteps() {
        return 0;
    }

}
