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
package de.cau.cs.kieler.krep.evalbench.ui;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.krep.evalbench.ui.Activator;

/**
 * Preference page for connections.
 * 
 * @author msp, ctr
 */
public class ConnectionPreferencePage extends FieldEditorPreferencePage implements
        IWorkbenchPreferencePage {

    /** Preference name for the type of connection. */
    public static final String CONNECTION_TYPE = "EvalBench.Connection.connection";

    /** Preference name for the serial port name. */
    public static final String SERIAL_PORT_NAME = "EvalBench.Connection.serial_port";

    /** Preference name for the host name. */
    public static final String HOST_NAME = "EvalBench.Connection.host";

    /** Preference name for the port number. */
    public static final String PORT_NUMBER = "EvalBench.Connection.port_number";

    /** Shall we show the connection in the Connection view? */
    public static final String LOG = "EvalBench.Connection.log";
    /** Log-file for JNI connection. */
    public static final String JNI_LOG_FILE = "EvalBench.Connection.logfile#";

    /**
     * Sets up the preference page.
     */
    public ConnectionPreferencePage() {
        super(FieldEditorPreferencePage.GRID);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(final IWorkbench workbench) {
        // set the preference store
        IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
        setPreferenceStore(preferenceStore);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors ()
     */
    @Override
    protected void createFieldEditors() {
        // create field editor for connection type
        FieldEditor fieldEditor;// = new RadioGroupFieldEditor(CONNECTION_TYPE, "Connection type:", 1,
          FileFieldEditor file = new FileFieldEditor(JNI_LOG_FILE, "Communication log File",
                getFieldEditorParent());
        String[] extensions = { "*.esi", "*.eso", "*" };
        file.setFileExtensions(extensions);
        addField(file);

        fieldEditor = new BooleanFieldEditor(LOG, "Log connection:", getFieldEditorParent());
        addField(fieldEditor);

        adjustGridLayout();
    }

}
