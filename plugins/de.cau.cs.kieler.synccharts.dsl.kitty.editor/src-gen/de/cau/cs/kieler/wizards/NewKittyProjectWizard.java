package de.cau.cs.kieler.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import de.cau.cs.kieler.KittyEditorPlugin;

public class NewKittyProjectWizard extends AbstractNewProjectWizard {

	public NewKittyProjectWizard() {
		super();
		setLangName("kitty");
		setGeneratorProjectName("de.cau.cs.kieler.synccharts.dsl.kitty.generator");
		setDslProjectName("de.cau.cs.kieler.synccharts.dsl.kitty");
		setFileExtension("kitty");
		setPackageName("de/cau/cs/kieler/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return KittyEditorPlugin.getDefault().getUtilities();
	}
}

