package de.cau.cs.kieler.cview.ui;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/** 
 * A message dialog showing a warning concerning large syntheses which might take
 * longer than expected and effects interactivity. The user can disable this warning in the menu.
 * 
 * @author cmot
 *
 */
public class LargeSynthesisWarning extends MessageDialog {

	
	protected LargeSynthesisWarning(Shell parentShell, int numOfFiles) {
		super(parentShell, "Huge Analysis Warning", null, warningMessage(numOfFiles), MessageDialog.QUESTION, 0, "Yes", "No");
    }
	
	/** 
	 * The warning message displayed
	 * @param numOfFiles the number of files
	 * 
	 * @return The warning message
	 */
	private static String warningMessage(int numOfFiles) {
		String retVal = "";
		
		retVal = "You are trying to start a new analysis. This analysis will be computed with " 
					+ numOfFiles + " files and folders.\n\nAre you sure that you want to continue?";
		
		return retVal;
	}
	
	@Override
    protected Control createDialogArea(final Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);

        return composite;
	}
	
}
