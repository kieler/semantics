package de.cau.cs.kieler.kev.extension.elevator;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
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

	public static final String ELEVATOR = "elevator";
	public static final String FLAP = "flap";
	public static final String RAILWAY = "railway";
	
	public static final String CONTROLLERID = "ExampleChooseEditor";
	
	@Override
	protected void createFieldEditors() {
		String[][] namesAndIds = { {"Elevator", ELEVATOR} , {"High-Lift Flap or Watertank", FLAP} /*, {"Railway", RAILWAY}*/ };
		this.addField(new ComboFieldEditor(CONTROLLERID,"Choose Example", namesAndIds, getFieldEditorParent()));
	}

	public void init(IWorkbench workbench) {
		// set the preference store
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(preferenceStore);
	}

}
