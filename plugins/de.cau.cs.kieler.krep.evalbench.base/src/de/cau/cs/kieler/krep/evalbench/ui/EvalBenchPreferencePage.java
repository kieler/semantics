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
import de.cau.cs.kieler.krep.evalbench.program.*;

/**
 * Preference page for general EvalBench preferences.
 * 
 * @author msp, ctr
 */
public class EvalBenchPreferencePage extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

    /** Preference name for the default communication protocol */
    public final static String PROTOCOL_TYPE = "EvalBench.protocol";

    /** Preference name for the KEP type */
    public final static String KEP_TYPE = "EvalBench.kep_type";

    /** Preference name for the external assembler program */
    public final static String EXTERNAL_ASSEMBLER = "EvalBench.external_assembler";

     
    /**
     * Sets up the preference page;
     */
    public EvalBenchPreferencePage() {
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
	// create field editor for the default communication protocol
	String[][] labels = new String[][] {
		{ "KIEL Esterel Processor Protocol",
			ICommunicationProtocol.P_KEP },
		{ "KIEL Reactive Processor Protocol",
			ICommunicationProtocol.P_KREP } };
	FieldEditor fieldEditor = new RadioGroupFieldEditor(PROTOCOL_TYPE,
		"Default communication protocol:", 1, labels,
		getFieldEditorParent());
	addField(fieldEditor);

	// create field editor for the KEP type:
	labels = new String[][] { { "Esterel KEP", KasmAssembler.S_KEPE },
		{ "VHDL KEP", KasmAssembler.S_KEPV } };
	fieldEditor = new RadioGroupFieldEditor(KEP_TYPE, "KEP type to use:",
		1, labels, getFieldEditorParent());
	addField(fieldEditor);

	// create field editor for the external assembler program
	//fieldEditor = new StringFieldEditor(EXTERNAL_ASSEMBLER,
	//	"External command for kasm to lst conversion:",
	//	getFieldEditorParent());
	//addField(fieldEditor);

	
	
	adjustGridLayout();
    }

}
