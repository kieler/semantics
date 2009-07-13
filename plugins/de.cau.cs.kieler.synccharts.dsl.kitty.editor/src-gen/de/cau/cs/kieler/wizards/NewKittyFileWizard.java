
package de.cau.cs.kieler.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import de.cau.cs.kieler.KittyEditorPlugin;

public class NewKittyFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return KittyEditorPlugin.getDefault().getUtilities();
	}
}
