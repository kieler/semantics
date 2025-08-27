/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sccharts.timing.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.sccharts.timing.Activator;

/**
 * The interactive timing analysis preference page.
 * 
 * @author ima
 * 
 */
public class TimingAnalysisPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{


	    /** identifier of the preference page. */
	    public static final String ID = "de.cau.cs.kieler.sccharts.tsccharts.preferences";

	    /**
	     * Creates an interactive timing analysis preference page.
	     */
    public TimingAnalysisPreferencePage() {
        super(GRID);
        setDescription("Activates the interactive timing analysis user options in the sidebar.\n"
                + "Sets the locations of the timing analysis tool and "
                + "the compiler used by the timing analysis tool.\n"
                + "In each case insert the absolute path of the folder that contains the tool.\n"
                + "If you want to test without an attached timing analysis file, check "
                + "box: Test interactive timing analysis without analysis tool.\n"
                + "For manual testing you have to provide a response file per hand and "
                + "insert its file name below.\n");
    }

	    /**
	     * {@inheritDoc}
	     */
	    @Override
    public void createFieldEditors() {
        addField(new BooleanFieldEditor("interactiveTimingAnalysisSidebar",
                "Display user options in sidebar", getFieldEditorParent()));
        addField(new BooleanFieldEditor("manualTimingTest", "Test interactive timing analysis "
                + "without analysis tool.", getFieldEditorParent()));
        addField(new StringFieldEditor("ktaPath", "Path to kta tool executable (may leave blank for"
                + " manual testing):",
                getFieldEditorParent()));
        addField(new StringFieldEditor("mipsel-mcb32-elf-gccPath",
                "Path to mipsel-mcb32-elf-gcc \ncompiler executable (may leave blank for"
                + " manual testing):", getFieldEditorParent()));

    }
	    
	    

	    /**
	     * {@inheritDoc}
	     */
	    public void init(final IWorkbench workbench) {
	    	setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    }
	}
	

