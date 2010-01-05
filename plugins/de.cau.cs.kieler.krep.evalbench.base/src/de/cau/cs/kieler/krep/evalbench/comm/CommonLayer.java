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

import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.trace.IO;
import de.cau.cs.kieler.krep.evalbench.trace.Tick;

/**
 * Data layer common to all interface parts; connects the UI to specific protocols.
 * 
 * @author msp, ctr
 */
public class CommonLayer {

    /** Identifier of serial connection type. */
    public static final String SERIAL_CON = "serial";

    /** Identifier of TCP/IP connection type. */
    public static final String TCPIP_CON = "tcpip";

    /** Identifier of java native interface connection. */
    public static final String JNI_CON = "jni";

    /** List of connection names for supported connections. */
    public static final String[] CON_NAMES = { "JNI", "Serial", "TCP/IP" };

    /** The KEP protocol used with the current connection. */
    private KepProtocol kepProtocol;

    /** The KReP protocol used with the current connection. */
    private KrepProtocol krepProtocol;

    /** The currently used communication protocol. */
    private ICommunicationProtocol currentProtocol = null;

    /** The currently used connection protocol. */
    private IConnectionProtocol currentConnection;

    /** Serial port names available for connection. */
    private String[] serialPorts;

    /** Internal tick counter. */
    private int tickCount;

    /** Message to be displayed on the status line. */
    private String statusMessage;

    private IAssembler currentProgram = null;

    /**
     * Displays a message in the connection view, if available. If no connection view is available
     * and <code>errorTitle</code> is not <code>null</code>, an error message box is displayed.
     * 
     * @param errorTitle
     *            title to use for the error message box, or <code>null</code> if no message box
     *            should be shown
     * @param message
     *            message to display
     * @param exception
     *            exception to display in the error message box
     */
    private static void logConnection(final String errorTitle, final String message,
            final Exception exception) {

        // TODO: log
        // IViewPart connectionView = workbenchPage.findView(ConnectionView.VIEW_ID);
        // if (connectionView != null) {
        // if (exception != null) {
        // ((ConnectionView) connectionView).getViewer().append(
        // message + ":\n" + exception.getMessage() + "\n");
        // } else {
        // ((ConnectionView) connectionView).getViewer().append(message + "\n");
        // }
        // } else if (errorTitle != null) {
        // displayError("Connection Failure", message, exception);
        // }
    }

    /**
     * Establish connection to a a reactive processor.
     * 
     * @param connectionType
     *            the type of the connection: JNI, TCPIP or RS232
     * @param protocolType
     *            protocol of the reactive processor: KEP or KLP. For JNI, this also defines which
     *            processor to start.
     * @param portName
     *            name of the serial port for RS232 connection
     * @param hostName
     *            name of the host for TCP/IP connection
     * @param portNumber
     *            number of the port for TCP/IP connection
     */
    public final void connect(final String connectionType, final String protocolType,
            final String portName, final String hostName, final int portNumber) {
        // close the previous connection
        if (currentConnection != null) {
            currentConnection.dispose();
            currentConnection = null;
        }

        // select the proper connection type
        String message = "";
        boolean error = false;

        if (connectionType.equals(SERIAL_CON)) {
            try {
                currentConnection = new RxtxSerialConnection();
                String initResult = currentConnection.initialize(portName, 0);
            } catch (CommunicationException e) {
                logConnection("Initialization Error",
                        "Initialization of serial connection failed.", e);
                error = true;
            }
        } else if (connectionType.equals(TCPIP_CON)) {
            try {
                currentConnection = new SocketConnection();
                String initResult = currentConnection.initialize(hostName, portNumber);
                // show initialization result in connection view
                message = "Initialized TCP/IP connection:\n" + initResult;
            } catch (CommunicationException e) {
                logConnection("Initialization Error",
                        "Initialization of TCP/IP connection failed.", e);
                error = true;
            }
        } else if (connectionType.equals(JNI_CON)) {
            try {
                JNIConnection jni = new JNIConnection();
                currentConnection = jni;
                String initResult = jni.initialize(protocolType);
                // show initialization result in connection view
                message = "Initialized JNI connection:\n" + initResult;
            } catch (Exception e) {
                logConnection("Initialization Error", "Initialization of JNI connection failed.", e);
                error = true;
            }
        } else {
            logConnection("Error in loaded preferences",
                    "The loaded preferences contained an invalid connection type identifier.", null);
            error = true;
        }

        if (error) {
            currentConnection = null;
        } else {
            // create communication protocol instances
            kepProtocol = new KepProtocol(currentConnection);
            krepProtocol = new KrepProtocol(currentConnection);
            // select proper protocol

            if (protocolType.equals(ICommunicationProtocol.P_KEP)) {
                currentProtocol = kepProtocol;
            } else if (protocolType.equals(ICommunicationProtocol.P_KREP)) {
                currentProtocol = krepProtocol;
            } else {
                currentProtocol = null;
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
        // IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
        // preferenceStore.setDefault(EvalBenchPreferencePage.PROTOCOL_TYPE,
        // ICommunicationProtocol.P_KEP);
        // preferenceStore.setDefault(EvalBenchPreferencePage.KEP_TYPE, KasmAssembler.S_KEPE);
        // preferenceStore.setDefault(EvalBenchPreferencePage.EXTERNAL_ASSEMBLER,
        // KasmAssembler.KASM2KLST);
        // preferenceStore.setDefault(ConnectionPreferencePage.CONNECTION_TYPE, JNI_CON);
        // if (serialPorts.length != 0) {
        // preferenceStore.setDefault(ConnectionPreferencePage.SERIAL_PORT_NAME, serialPorts[0]);
        // }
        // preferenceStore.setDefault(ConnectionPreferencePage.HOST_NAME, DEFAULT_HOST);
        // preferenceStore.setDefault(ConnectionPreferencePage.PORT_NUMBER, DEFAULT_PORT);
        //
        //  
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
     * Execute the <i>verify communication</i> command and display results in the connection view.
     * 
     * @return true if the connection works correctly
     */
    public boolean checkConnection() {
        try {
            return currentProtocol.verifyCommunication();
        } catch (CommunicationException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }

    }

    /**
     * Get target information for the currently connected processor. and display it in the target
     * view.
     * 
     * @return target information
     */
    public String getTargetInfo() {
        String targetMessage;
        try {
            // get target info through the current communication protocol
            targetMessage = currentProtocol.getTargetInfo();
        } catch (CommunicationException e) {
            targetMessage = "Could not get target information, Error in received return string.";
        } catch (NullPointerException e) {
            targetMessage = "Could not get target information, Connection was not initialized yet.";
        }
        // send target information to target view
        return targetMessage;
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
    public void loadProgram(final IAssembler program, final IProgressMonitor monitor)
            throws CommunicationException, LoadException {
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
            logConnection("Connection Failure", "Load program command failed", e);
            throw new CommunicationException(e.getMessage());
        } catch (NullPointerException e) {
            logConnection("No Connection", "Connection was not initialized yet", e);
            throw new CommunicationException("no connection");
        }
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
            logConnection("No Connection", "Connection was not initialized yet", e);
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
            inputs = t.getInputs();
            outputs = currentProgram.getOutputs();
            // perform tick and exchange signal status
            int n = currentProgram.getInputs().size() + currentProgram.getOutputs().size();
            int tickLength = currentProtocol.tick(n, inputs, outputs);
            for (Signal s : outputs) {
                if (s.getPresent()) {
                    out.add(IO.OUTPUT, s);
                }
            }
            out.setRT(tickLength);

            // get execution trace
            final int[] addresses = currentProtocol.getExecutionTrace();

            // update status message
            statusMessage = "Program tick " + tickCount + " performed, length " + tickLength;
            // increase internal tick counter
            tickCount++;
        } catch (CommunicationException e) {
            logConnection("Connection Failure", "Tick command failed", e);
            out = null;
        } catch (NullPointerException e) {
            logConnection("No Connection", "Connection was not initialized yet", e);
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
            logConnection("Connection Failure", "Continuous run command failed", e);
        } catch (NullPointerException e) {
            logConnection("No Connection", "Connection was not initialized yet", e);
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
            logConnection("Connection Failure", "Stop continuous command failed", e);
        } catch (NullPointerException e) {
            logConnection("No Connection", "Connection was not initialized yet", e);
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


}
