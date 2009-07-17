
package de.cau.cs.kieler.synccharts.dsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import de.cau.cs.kieler.synccharts.dsl.ScdslEditorPlugin;

public class NewScdslFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return ScdslEditorPlugin.getDefault().getUtilities();
	}
}
