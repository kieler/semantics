package de.cau.cs.kieler.krep.evalbench.ui;


import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.comm.*;
import de.cau.cs.kieler.krep.evalbench.program.*;

/**
 * Preference page for general EvalBench preferences.
 * 
 * @author msp, ctr
 */
public class VerifyPreferencePage extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

    /** Path to the benchmark for automatic verification */
    public final static String BENCHMARK_PATH = "EvalBench.benchmark_path";

    /**
     * Regular expression to express, which files in the Benchmark path are
     * actual benchmarks
     */
    public final static String BENCHMARK_FILES = "Evalbench.benchmark_files";

    /** Shall signal names be case sensitive? */
    public final static String CASE_SENSITIVE = "Evalbench.case_sensitive";

    /** file to safe verification results */
    public final static String VERIFY_LOG = "Evalbench.verify_log";

    /** continue  Verification even after a failure occurred */ 
    public final static String IGNORE_INVALID = "Evalbench.ignore_invalid";
    
    
    /**
     * Sets up the preference page;
     */
    public VerifyPreferencePage() {
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
	
	FieldEditor fieldEditor = new DirectoryFieldEditor(BENCHMARK_PATH,
		"Path the benchmarks:",  getFieldEditorParent());
	addField(fieldEditor);

	fieldEditor = new StringFieldEditor(BENCHMARK_FILES,
		"Regular expression to describe benchmark directories:",
		getFieldEditorParent());
	addField(fieldEditor);

	fieldEditor = new BooleanFieldEditor(CASE_SENSITIVE,
		"signals are case sensitve", getFieldEditorParent());
	addField(fieldEditor);
	
	FileFieldEditor log = new FileFieldEditor(VERIFY_LOG, 
		"log File for verification results", getFieldEditorParent());
	String[] extensions= { "*.log"};
	log.setFileExtensions(extensions);
	addField(fieldEditor);
	
	fieldEditor = new BooleanFieldEditor(IGNORE_INVALID, 
		"continue verify run after mismatch as detected", getFieldEditorParent());
	addField(fieldEditor);
	
	adjustGridLayout();
    }

}
