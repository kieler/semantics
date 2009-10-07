/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.ui;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.comm.*;

/**
 * Preference page for connections.
 * 
 * @author msp
 */
public class ConnectionPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	/** Preference name for the type of connection */
	public final static String CONNECTION_TYPE = "EvalBench.Connection.connection";

	/** Preference name for the serial port name */
	public final static String SERIAL_PORT_NAME = "EvalBench.Connection.serial_port";

	/** Preference name for the host name */
	public final static String HOST_NAME = "EvalBench.Connection.host";

	/** Preference name for the port number */
	public final static String PORT_NUMBER = "EvalBench.Connection.port_number";

	/** The greatest valid port number */
	private final static int MAX_PORT_NUMBER = 65535;
	/** Shall we show the connection in the Connection view */
	public final static String LOG = "EvalBench.Connection.log";
	/** Log-file for JNI connection */
	public final static String JNI_LOG_FILE = "EvalBench.Connection.logfile#";

	/**
	 * Sets up the preference page.
	 */
	public ConnectionPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		// set the preference store
		IPreferenceStore preferenceStore = Activator.getDefault()
				.getPreferenceStore();
		setPreferenceStore(preferenceStore);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors
	 * ()
	 */
	@Override
	protected void createFieldEditors() {
		// create field editor for connection type
		String[][] labels = new String[][] { { "JNI", CommonLayer.JNI_CON },
				{ "Serial port", CommonLayer.SERIAL_CON },
				{ "TCP/IP", CommonLayer.TCPIP_CON } };
		FieldEditor fieldEditor = new RadioGroupFieldEditor(CONNECTION_TYPE,
				"Connection type:", 1, labels, getFieldEditorParent());
		addField(fieldEditor);

		// create field editor for serial port name
		String[] serialPorts = Activator.commonLayer.getSerialPorts();
		labels = new String[serialPorts.length][2];
		for (int i = 0; i < serialPorts.length; i++) {
			labels[i] = new String[] { serialPorts[i], serialPorts[i] };
		}
		fieldEditor = new ComboFieldEditor(SERIAL_PORT_NAME,
				"Serial port name:", labels, getFieldEditorParent());
		addField(fieldEditor);

		// create field editor for host name
		fieldEditor = new StringFieldEditor(HOST_NAME, "Host name:",
				getFieldEditorParent());
		addField(fieldEditor);

		// create field editor for port number
		fieldEditor = new IntegerFieldEditor(PORT_NUMBER, "Port number:",
				getFieldEditorParent());
		((IntegerFieldEditor) fieldEditor).setValidRange(0, MAX_PORT_NUMBER);
		addField(fieldEditor);

		FileFieldEditor file = new FileFieldEditor(JNI_LOG_FILE,
				"Communication log File", getFieldEditorParent());
		String[] extensions = { "*.esi", "*.eso", "*" };
		file.setFileExtensions(extensions);
		addField(file);

		fieldEditor = new BooleanFieldEditor(LOG, "Log connection:",
				getFieldEditorParent());
		addField(fieldEditor);

		adjustGridLayout();
	}

}
