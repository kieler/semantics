package de.cau.cs.kieler.synccharts.dsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import de.cau.cs.kieler.synccharts.dsl.ScdslEditorPlugin;

public class NewScdslProjectWizard extends AbstractNewProjectWizard {

	public NewScdslProjectWizard() {
		super();
		setLangName("scdsl");
		setGeneratorProjectName("de.cau.cs.kieler.synccharts.dsl.generator");
		setDslProjectName("de.cau.cs.kieler.synccharts.dsl");
		setFileExtension("scdsl");
		setPackageName("de/cau/cs/kieler/synccharts/dsl/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return ScdslEditorPlugin.getDefault().getUtilities();
	}
}

