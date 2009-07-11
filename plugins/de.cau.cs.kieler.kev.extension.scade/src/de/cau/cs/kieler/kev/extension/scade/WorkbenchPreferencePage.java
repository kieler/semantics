package de.cau.cs.kieler.kev.extension.scade;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This is a simple example preferences page. It extends the FieldEditorPreferencePage,
 * which provides very easy setup of standard values (boolean, String, Combos, Lists, 
 * Paths, Colors, etc.)
 * @author Hauke Fuhrmann, haf
 *
 */

public class WorkbenchPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{

	public static final String HOST_EDITOR = "scade_host";
	public static final String PORT_EDITOR = "scade_port";
	public static final String PROFILE_EDITOR = "scade_profile";
	public static final String ROOT_EDITOR = "scade_root";
	public static final String OUTPUTPATH_EDITOR = "scade_output";
	public static final String INPUTPATH_EDITOR = "scade_input";
	
	@Override
	protected void createFieldEditors() {
		this.setMessage("Enter configuration preferences for your SCADE connection!");
		//String[][] namesAndIds = { {"Elevator", ELEVATOR} , {"High-Lift Flap or Watertank", FLAP} /*, {"Railway", RAILWAY}*/ };
		//this.addField(new ComboFieldEditor(CONTROLLERID,"Choose Example", namesAndIds, getFieldEditorParent()));
		this.addField(new StringFieldEditor(HOST_EDITOR, "Host IP Address",StringFieldEditor.UNLIMITED,StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
		this.addField(new IntegerFieldEditor(PORT_EDITOR, "Port Number", getFieldEditorParent()));
		this.addField(new StringFieldEditor(PROFILE_EDITOR, "CodeGen Profile",StringFieldEditor.UNLIMITED,StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
		this.addField(new StringFieldEditor(ROOT_EDITOR, "Root Operator",StringFieldEditor.UNLIMITED,StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
		this.addField(new StringFieldEditor(OUTPUTPATH_EDITOR, "Output Path",StringFieldEditor.UNLIMITED,StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
		this.addField(new StringFieldEditor(INPUTPATH_EDITOR, "Output Path",StringFieldEditor.UNLIMITED,StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
//		StringFieldEditor fe = new StringFieldEditor(OUTPUTPATH_EDITOR, "Output Path",StringFieldEditor.UNLIMITED,StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
				
	}

	public void init(IWorkbench workbench) {
		// set the preference store
		IPreferenceStore preferenceStore = KevScadePlugin.getDefault().getPreferenceStore();
		setPreferenceStore(preferenceStore);
	}

}
