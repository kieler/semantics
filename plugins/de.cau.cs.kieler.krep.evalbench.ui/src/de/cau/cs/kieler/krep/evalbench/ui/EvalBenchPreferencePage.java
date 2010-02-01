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
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;

/**
 * Preference page for general EvalBench preferences. These preferences are only used by the Verify
 * view, for other executions the preferences are set in the execution manager. This preference page
 * is obsolete as soon as the execution manager is extended by a feature for automatic verification.
 * 
 * @author msp, ctr
 * 
 * @kieler.rating 2010-02-01 proposed yellow ctr
 */
public class EvalBenchPreferencePage extends FieldEditorPreferencePage implements
        IWorkbenchPreferencePage {

    /** Preference name for the default communication protocol. */
    public static final String PROTOCOL_TYPE = "EvalBench.protocol";

    /** Preference name for the KEP type. */
    public static final String KEP_TYPE = "EvalBench.kep_type";

    /** Preference name for the external assembler program. */
    public static final String EXTERNAL_ASSEMBLER = "EvalBench.external_assembler";

    /** Log-file for JNI connection. */
    public static final String LOG_FILE = "EvalBench.Connection.logfile#";

    /** Path to the benchmark for automatic verification. */
    public static final String BENCHMARK_PATH = "EvalBench.benchmark_path";

    /** Regular expression to express, which files in the Benchmark path are actual benchmarks. */
    public static final String BENCHMARK_FILES = "Evalbench.benchmark_files";

    /** Shall signal names be case sensitive? */
    public static final String CASE_SENSITIVE = "Evalbench.case_sensitive";

    /** file to safe verification results. */
    public static final String VERIFY_LOG = "Evalbench.verify_log";

    /** continue Verification even after a failure occurred. */
    public static final String IGNORE_INVALID = "Evalbench.ignore_invalid";

    /**
     * Sets up the preference page.
     */
    public EvalBenchPreferencePage() {
        super(FieldEditorPreferencePage.GRID);
        setDescription("This is the preference page for the Communication with a reactive processor. "
                + "These preferences are only used by the Verify  view, "
                + "for other executions the preferences are set in the execution manager. "
                + "This preference page is obsolete as soon as the execution manager "
                + "is extended by a verification component.");
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
     */
    @Override
    protected void createFieldEditors() {

        String[][] labels = new String[][] {
                { "KIEL Esterel Processor Protocol", ICommunicationProtocol.P_KEP },
                { "KIEL Reactive Processor Protocol", ICommunicationProtocol.P_KREP } };
        FieldEditor fieldEditor = new RadioGroupFieldEditor(PROTOCOL_TYPE,
                "Default communication protocol:", 1, labels, getFieldEditorParent());
        addField(fieldEditor);

        // Connection
        FileFieldEditor file = new FileFieldEditor(LOG_FILE, "Communication log File",
                getFieldEditorParent());
        String[] extensions = { "*.esi", "*.eso", "*" };
        file.setFileExtensions(extensions);
        addField(file);

        // Verify
        fieldEditor = new DirectoryFieldEditor(BENCHMARK_PATH, "Path the benchmarks:",
                getFieldEditorParent());
        addField(fieldEditor);

        fieldEditor = new StringFieldEditor(BENCHMARK_FILES,
                "Regular expression to describe benchmark directories:", getFieldEditorParent());
        addField(fieldEditor);

        fieldEditor = new BooleanFieldEditor(CASE_SENSITIVE, "signals are case sensitve",
                getFieldEditorParent());
        addField(fieldEditor);

        FileFieldEditor log = new FileFieldEditor(VERIFY_LOG, "log File for verification results",
                getFieldEditorParent());
        String[] logExtensions = { "*.log" };
        log.setFileExtensions(logExtensions);
        addField(fieldEditor);

        fieldEditor = new BooleanFieldEditor(IGNORE_INVALID,
                "continue verify run after mismatch as detected", getFieldEditorParent());
        addField(fieldEditor);

        adjustGridLayout();
    }

}
