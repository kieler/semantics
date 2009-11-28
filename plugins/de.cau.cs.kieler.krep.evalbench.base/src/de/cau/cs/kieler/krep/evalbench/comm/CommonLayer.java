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

package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KasmAssembler;
import de.cau.cs.kieler.krep.evalbench.trace.IO;
import de.cau.cs.kieler.krep.evalbench.trace.Tick;
import de.cau.cs.kieler.krep.evalbench.ui.ConnectionPreferencePage;
import de.cau.cs.kieler.krep.evalbench.ui.EvalBenchPreferencePage;
import de.cau.cs.kieler.krep.evalbench.ui.editors.AssemblerEditor;
import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;
import de.cau.cs.kieler.krep.evalbench.ui.views.TargetView;

/**
 * Data layer common to all interface parts; connects the UI to specific
 * protocols.
 * 
 * @author msp
 */
public class CommonLayer implements IPartListener {

    /** Identifier of serial connection type. */
    public static final String SERIAL_CON = "serial";

    /** Identifier of TCP/IP connection type. */
    public static final String TCPIP_CON = "tcpip";

    /**
     * Identifier of java native interface connection.
     */
    public static final String JNI_CON = "jni";

    /** List of connection names for supported connections. */
    public static final String[] CON_NAMES = { "JNI", "Serial", "TCP/IP" };

    /** Default host name to use. */
    private static final String DEFAULT_HOST = "localhost";

    /** Default TCP/IP port to use. */
    private static final int DEFAULT_PORT = 19777;

    /** The KEP protocol used with the current connection. */
    private KepProtocol kepProtocol;

    /** The KReP protocol used with the current connection. */
    private KrepProtocol krepProtocol;

    /** The currently used communication protocol. */
    private ICommunicationProtocol currentProtocol = null;

    /** The currently used communication protocol type. */
    private String currentProtocolType;

    /** The currently used connection protocol. */
    private IConnectionProtocol currentConnection;

    /** List of signal listeners. */
    private LinkedList<ISignalListener> signalListeners;

    /** The currently synchronized assembler editor. */
    private AssemblerEditor currentEditor = null;

    /** Serial port names available for connection. */
    private String[] serialPorts;

    /** Internal tick counter. */
    private int tickCount;

    /** Message to be displayed on the status line. */
    private String statusMessage;

    private IAssembler currentProgram = null;

    /**
     * Display an error message box.
     * 
     * @param title
     *            title of the message box
     * @param message
     *            message to be displayed
     * @param exception
     *            exception that caused the error box to be displayed
     */
    private static void displayError(final String title, final String message,
            final Exception exception) {
        MessageView.print(title + ": " + message);
    }

    /**
     * Displays a message in the connection view, if available. If no connection
     * view is available and <code>errorTitle</code> is not <code>null</code>,
     * an error message box is displayed.
     * 
     * @param errorTitle
     *            title to use for the error message box, or <code>null</code>
     *            if no message box should be shown
     * @param message
     *            message to display
     * @param exception
     *            exception to display in the error message box
     * @return the connection view, or <code>null</code> if none is available
     */
    private static ConnectionView logConnection(final String errorTitle,
            final String message, final Exception exception) {
        IWorkbench workbench = PlatformUI.getWorkbench();
        IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
        if (window == null) {
            return null;
        }
        IWorkbenchPage workbenchPage = window.getActivePage();
        IViewPart connectionView = workbenchPage
                .findView(ConnectionView.VIEW_ID);
        if (connectionView != null) {
            if (exception != null) {
                ((ConnectionView) connectionView).getViewer().append(
                        message + ":\n" + exception.getMessage() + "\n");
            } else {
                ((ConnectionView) connectionView).getViewer().append(
                        message + "\n");
            }
        } else if (errorTitle != null) {
            displayError("Connection Failure", message, exception);
        }
        return (ConnectionView) connectionView;
    }

    /**
     * Builds up the common layer.
     */
    public CommonLayer() {
        // create list of signal listeners
        signalListeners = new LinkedList<ISignalListener>();
    }

    /**
     * Reads connection settings from the preference store and connects to the
     * set up device.
     */
    public final void connect() {
        // close the previous connection
        if (currentConnection != null) {
            currentConnection.dispose();
            currentConnection = null;
        }

        IPreferenceStore preferenceStore = Activator.getDefault()
                .getPreferenceStore();
        // select the proper connection type
        String connectionType = preferenceStore
                .getString(ConnectionPreferencePage.CONNECTION_TYPE);
        String message = "";
        boolean error = false;

        if (connectionType.equals(SERIAL_CON)) {
            try {
                currentConnection = new RxtxSerialConnection();
                String portName = preferenceStore
                        .getString(ConnectionPreferencePage.SERIAL_PORT_NAME);
                String initResult = currentConnection.initialize(portName, 0);
                // show initialization result in connection view
                message = "Initialized serial connection:\n" + initResult;
            } catch (CommunicationException e) {
                logConnection("Initialization Error",
                        "Initialization of serial connection failed.", e);
                error = true;
            }
        } else if (connectionType.equals(TCPIP_CON)) {
            try {
                currentConnection = new SocketConnection();
                String hostName = preferenceStore
                        .getString(ConnectionPreferencePage.HOST_NAME);
                int portNumber = preferenceStore
                        .getInt(ConnectionPreferencePage.PORT_NUMBER);
                String initResult = currentConnection.initialize(hostName,
                        portNumber);
                // show initialization result in connection view
                message = "Initialized TCP/IP connection:\n" + initResult;
            } catch (CommunicationException e) {
                logConnection("Initialization Error",
                        "Initialization of TCP/IP connection failed.", e);
                error = true;
            }
        } else if (connectionType.equals(JNI_CON)) {
            try {
                currentConnection = new JNIConnection();
                String initResult = currentConnection.initialize("", 0);
                // show initialization result in connection view
                message = "Initialized JNI connection:\n" + initResult;
            } catch (Exception e) {
                logConnection("Initialization Error",
                        "Initialization of JNI connection failed.", e);
                error = true;
            }
        } else {
            displayError(
                    "Error in loaded preferences",
                    "The loaded preferences contained an invalid connection type identifier.",
                    null);
            error = true;
        }

        if (error) {
            currentConnection = null;
        } else {
            // create communication protocol instances
            kepProtocol = new KepProtocol(currentConnection);
            krepProtocol = new KrepProtocol(currentConnection);
            // select proper protocol
            if (currentProtocolType == null) {
                currentProtocolType = preferenceStore
                        .getString(EvalBenchPreferencePage.PROTOCOL_TYPE);
            }
            if (currentProtocolType.equals(ICommunicationProtocol.P_KEP)) {
                currentProtocol = kepProtocol;
            } else if (currentProtocolType
                    .equals(ICommunicationProtocol.P_KREP)) {
                currentProtocol = krepProtocol;
            } else {
                currentProtocol = null;
            }
            // send message to connection view
            ConnectionView connectionView = logConnection(null, message, null);
            if (connectionView != null) {
                kepProtocol.addCommunicationListener(connectionView);
                krepProtocol.addCommunicationListener(connectionView);
            }
            // reset tick counter
            tickCount = 0;
        }
    }

    /**
     * Initializes the common layer.
     */
    public final void initialize() {
        // retrieve available serial ports
        serialPorts = RxtxSerialConnection.getSerialPorts();

        // set up plugin preferences
        IPreferenceStore preferenceStore = Activator.getDefault()
                .getPreferenceStore();
        preferenceStore.setDefault(EvalBenchPreferencePage.PROTOCOL_TYPE,
                ICommunicationProtocol.P_KEP);
        preferenceStore.setDefault(EvalBenchPreferencePage.KEP_TYPE,
                KasmAssembler.S_KEPE);
        preferenceStore.setDefault(EvalBenchPreferencePage.EXTERNAL_ASSEMBLER,
                KasmAssembler.KASM2KLST);
        preferenceStore.setDefault(ConnectionPreferencePage.CONNECTION_TYPE,
                JNI_CON);
        if (serialPorts.length != 0) {
            preferenceStore.setDefault(
                    ConnectionPreferencePage.SERIAL_PORT_NAME, serialPorts[0]);
        }
        preferenceStore.setDefault(ConnectionPreferencePage.HOST_NAME,
                DEFAULT_HOST);
        preferenceStore.setDefault(ConnectionPreferencePage.PORT_NUMBER,
                DEFAULT_PORT);

        // look for extensions of the tick manager extension point
        IConfigurationElement[] configElements = Platform
                .getExtensionRegistry().getConfigurationElementsFor(
                        AbstractTickManager.EXTENSION_ID);
        for (int i = 0; i < configElements.length; i++) {
            try {
                // create a new instance of the implementing class
                AbstractTickManager manager = (AbstractTickManager) configElements[i]
                        .createExecutableExtension("class");
                // add manager to the list of signal listeners
                addSignalListener(manager);
            } catch (Exception e) {
                displayError(
                        "Error initializing extension",
                        "The configuration element "
                                + configElements[i].getName()
                                + " could not be initialized for the extension point "
                                + AbstractTickManager.EXTENSION_ID, e);
            }
        }
    }

    /**
     * Disposes the common layer.
     */
    public final void dispose() {
        if (currentConnection != null) {
            currentConnection.dispose();
        }
    }

    /**
     * Adds a new signal listener that is notified of tick events.
     * 
     * @param listener
     *            listener to be added
     */
    public final void addSignalListener(final ISignalListener listener) {
        signalListeners.add(listener);
    }

    /**
     * Removes a given signal listener.
     * 
     * @param listener
     *            listener to be removed
     */
    public void removeSignalListener(final ISignalListener listener) {
        signalListeners.remove(listener);
    }

    /**
     * Execute the <i>verify communication</i> command and display results in
     * the connection view.
     */
    public void checkConnection() {
        // runWithProgress(new IRunnableWithProgress() {
        // // public void run(IProgressMonitor monitor) {
        // monitor.beginTask("Check connection", IProgressMonitor.UNKNOWN);
        try {
            String result = currentProtocol.verifyCommunication();
            logConnection(null, result, null);
        } catch (CommunicationException e) {
            logConnection("Connection Failure",
                    "Error in received return string", e);
        } catch (NullPointerException e) {
            logConnection("No Connection",
                    "Connection was not initialized yet", e);
        }
        // monitor.done();
        // }
        // });
    }

    /**
     * Get target information and display it in the target view.
     */
    public void getTargetInfo() {
        // runWithProgress(new IRunnableWithProgress() {
        // public void run(IProgressMonitor monitor) {
        // monitor.beginTask("Get target information",
        // IProgressMonitor.UNKNOWN);
        // find active target view
        IWorkbenchPage workbenchPage = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();
        IViewPart targetView = workbenchPage.findView(TargetView.VIEW_ID);
        String targetMessage;
        try {
            // get target info through the current communication protocol
            targetMessage = currentProtocol.getTargetInfo();
        } catch (CommunicationException e) {
            logConnection("Connection Failure",
                    "Error in received return string", e);
            targetMessage = "Could not get target information, see Connection View.";
        } catch (NullPointerException e) {
            logConnection("No Connection",
                    "Connection was not initialized yet", e);
            targetMessage = "Could not get target information, see Connection View.";
        }
        // send target information to target view
        if (targetView != null) {
            ((TargetView) targetView).getViewer().setText(targetMessage);
        }
        // monitor.done();
        // }
        // });
    }

    /**
     * Load program onto target and synchronize with that program.
     * 
     * @param program
     *            program to load on the processor
     * @param monitor
     *            process monitor to show how the download proceeds or null
     * @throws CommunicationException
     *             thrown when any communication error occurred *
     * @throws LoadException
     *             thrown when program can not be loaded onto the processor
     */
    public void loadProgram(final IAssembler program,
            final IProgressMonitor monitor) throws CommunicationException,
            LoadException {
        try {
            currentProtocol.comment("load  " + program.getName());
            currentProgram = program;
            boolean success = currentProtocol.loadProgram(program, monitor);
            if (success) {
                logConnection(null, "Program was loaded successfully.", null);
                // return true;
            } else {
                logConnection(null, "Loading of selected program failed.", null);
                throw new CommunicationException("download failed");
            }
        } catch (CommunicationException e) {
            logConnection("Connection Failure", "Load program command failed",
                    e);
            throw new CommunicationException(e.getMessage());
        } catch (NullPointerException e) {
            logConnection("No Connection",
                    "Connection was not initialized yet", e);
            throw new CommunicationException("no connection");
        }
    }

    /**
     * Load currently displayed program onto target and synchronize with that
     * program.
     * 
     * @param monitor
     *            process monitor to show how the download proceeds or null
     * @throws CommunicationException
     *             thrown when any communication error occurred
     * @throws LoadException
     *             thrown when processor cannot execute this program
     */
    public void loadProgram(final IProgressMonitor monitor)
            throws CommunicationException, LoadException {
        loadProgram(currentEditor.getAssembler(), monitor);
    }

    /**
     * Perform a program reset for the current program.
     * 
     * @throws CommunicationException
     *             thrown when any communication error occurred
     */
    public void reset() throws CommunicationException {
        try {
            currentProtocol.resetStatus();
            statusMessage = "Program reset performed";
            tickCount = 0;
        } catch (NullPointerException e) {
            logConnection("No Connection",
                    "Connection was not initialized yet", e);
            throw new CommunicationException("No Connection");
        }
    }

    /**
     * Perform a tick by reading inputs and displaying outputs.
     * 
     * @param t
     *            tick from with the inputs are read
     * @return Tick that contains the new outputs
     */
    public Tick step(final Tick t) {
        Tick out = new Tick();
        try {
            LinkedList<Signal> inputs;
            LinkedList<Signal> outputs;
            if (t == null) {
                inputs = currentEditor.getInputs();
            } else {
                inputs = t.getInputs();
            }
            outputs = currentProgram.getOutputs();
            // perform tick and exchange signal status
            int n = currentProgram.getInputs().size()
                    + currentProgram.getOutputs().size();
            int tickLength = currentProtocol.tick(n, inputs, outputs);
            for (Signal s : outputs) {
                if (s.getPresent()) {
                    out.add(IO.OUTPUT, s);
                }
            }
            out.setRT(tickLength);
            // notify signal listeners
            Iterator<ISignalListener> iterator = signalListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().tickPerformed(inputs, outputs);
            }
            // get execution trace
            final int[] addresses = currentProtocol.getExecutionTrace();
            // show the executed instructions in the assembler editor
            if (currentEditor != null) {
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        currentEditor.setSelectedRows(addresses);
                    }
                });
            }
            // update status message
            statusMessage = "Program tick " + tickCount + " performed, length "
                    + tickLength;
            // increase internal tick counter
            tickCount++;
        } catch (CommunicationException e) {
            logConnection("Connection Failure", "Tick command failed", e);
            out = null;
        } catch (NullPointerException e) {
            logConnection("No Connection",
                    "Connection was not initialized yet", e);
            out = null;
        }
        return out;
    }

    /**
     * Switch to continuous mode, where external inputs and outputs are used.
     */
    public void continuousRun() {
        try {
            currentProtocol.continuousRun();
            statusMessage = "Continuous run mode activated";
        } catch (CommunicationException e) {
            logConnection("Connection Failure",
                    "Continuous run command failed", e);
        } catch (NullPointerException e) {
            logConnection("No Connection",
                    "Connection was not initialized yet", e);
        }
    }

    /**
     * Stop continuous mode and return to single tick mode.
     */
    public void stopContinuous() {
        try {
            currentProtocol.stopContinuous();
            statusMessage = "Continuous run mode stopped";
        } catch (CommunicationException e) {
            logConnection("Connection Failure",
                    "Stop continuous command failed", e);
        } catch (NullPointerException e) {
            logConnection("No Connection",
                    "Connection was not initialized yet", e);
        }
    }

    /**
     * Gets the list of serial port names.
     * 
     * @return the serial port names
     */
    public String[] getSerialPorts() {
        return serialPorts;
    }

    /**
     * Gets the currently active input editor.
     * 
     * @return the active input editor
     */
    public AssemblerEditor getActiveAssemblerEditor() {
        return currentEditor;
    }

    /**
     * Gets the last status message.
     * 
     * @return the status message
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Updates the signal views of the evaluation bench.
     */
//    public void updateSignalViews() {
//        if (currentEditor != null) {
//            IWorkbenchPage workbenchPage = PlatformUI.getWorkbench()
//                    .getActiveWorkbenchWindow().getActivePage();
//            // find and update input view
//            IViewPart inputView = workbenchPage.findView(InputView.VIEW_ID);
//            if (inputView != null) {
//                ((InputView) inputView).setInput(currentEditor.getInputs());
//            }
//            // find and update output view
//            IViewPart outputView = workbenchPage.findView(OutputView.VIEW_ID);
//            if (outputView != null) {
//                ((OutputView) outputView).setInput(currentEditor.getOutputs());
//            }
//        }
//    }

    /**
     * {@inheritDoc}
     * 
     * @see
     * org.eclipse.ui.IPartListener#partBroughtToTop(org.eclipse.ui.IWorkbenchPart
     * )
     */
        public void partBroughtToTop(final IWorkbenchPart part) {
        if (part instanceof AssemblerEditor) {
            // set current editor to the activated editor part
            currentEditor = (AssemblerEditor) part;
              // select proper protocol
            currentProtocolType = currentEditor.getProtocolType();
            if (currentProtocolType.equals(ICommunicationProtocol.P_KEP)) {
                currentProtocol = kepProtocol;
            } else if (currentProtocolType
                    .equals(ICommunicationProtocol.P_KREP)) {
                currentProtocol = krepProtocol;
            }
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see
     * org.eclipse.ui.IPartListener#partOpened(org.eclipse.ui.IWorkbenchPart)
     */
    public void partOpened(final IWorkbenchPart part) {
//        if (part instanceof AssemblerEditor) {
//            // activate editor specific actions
//            IWorkbenchPage workbenchPage = PlatformUI.getWorkbench()
//                    .getActiveWorkbenchWindow().getActivePage();
//            IViewPart inputView = workbenchPage.findView(InputView.VIEW_ID);
//            if (inputView != null) {
//                ((InputView) inputView).setActionsEnabled(true);
//            }
//            IViewPart connectionView = workbenchPage
//                    .findView(ConnectionView.VIEW_ID);
//            if (connectionView != null) {
//                ((ConnectionView) connectionView).setActionsEnabled(true);
//            }
//        } else if (part instanceof ConnectionView) {
//            if (kepProtocol != null) {
//                kepProtocol.addCommunicationListener((ConnectionView) part);
//            }
//            if (krepProtocol != null) {
//                krepProtocol.addCommunicationListener((ConnectionView) part);
//            }
//        } else if (part instanceof OutputView) {
//            addSignalListener((OutputView) part);
//            if (currentEditor != null) {
//                ((OutputView) part).setInput(currentEditor.getOutputs());
//            }
//        } else if (part instanceof InputView && currentEditor != null) {
//            ((InputView) part).setInput(currentEditor.getInputs());
//        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see
     * org.eclipse.ui.IPartListener#partClosed(org.eclipse.ui.IWorkbenchPart)
     */
    public void partClosed(final IWorkbenchPart part) {
        if (part instanceof AssemblerEditor) {
            if (part.equals(currentEditor)) {
                // remove reference to the closed editor part
                currentEditor = null;
                // refresh input, output and connection views
                IWorkbenchPage workbenchPage = PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getActivePage();
                if (workbenchPage != null) {
                     IViewPart connectionView = workbenchPage
                            .findView(ConnectionView.VIEW_ID);
                    if (connectionView != null) {
                        ((ConnectionView) connectionView)
                                .setActionsEnabled(false);
                    }
                }
                // select default protocol
                IPreferenceStore preferenceStore = Activator.getDefault()
                        .getPreferenceStore();
                currentProtocolType = preferenceStore
                        .getString(EvalBenchPreferencePage.PROTOCOL_TYPE);
                if (currentProtocolType.equals(ICommunicationProtocol.P_KEP)) {
                    currentProtocol = kepProtocol;
                } else if (currentProtocolType
                        .equals(ICommunicationProtocol.P_KREP)) {
                    currentProtocol = krepProtocol;
                }
            }
        } else if (part instanceof ConnectionView) {
            if (kepProtocol != null) {
                kepProtocol.removeCommunicationListener((ConnectionView) part);
            }
            if (krepProtocol != null) {
                krepProtocol.removeCommunicationListener((ConnectionView) part);
            }
        } 
    }

    /**
     * {@inheritDoc}
     * 
     * @see
     * org.eclipse.ui.IPartListener#partActivated(org.eclipse.ui.IWorkbenchPart)
     */
    public void partActivated(final IWorkbenchPart part) {
        // Nothing to do
    }

    /**
     * {@inheritDoc}
     * 
     * @see
     * org.eclipse.ui.IPartListener#partDeactivated(org.eclipse.ui.IWorkbenchPart
     * )
     */
    public void partDeactivated(final IWorkbenchPart part) {
        // Nothing to do
    }

}
