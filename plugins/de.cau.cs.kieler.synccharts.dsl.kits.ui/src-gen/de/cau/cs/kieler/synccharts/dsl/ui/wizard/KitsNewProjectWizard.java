package de.cau.cs.kieler.synccharts.dsl.ui.wizard;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.core.wizard.IProjectInfo;
import org.eclipse.xtext.ui.core.wizard.XtextNewProjectWizard;
import de.cau.cs.kieler.core.ui.*;

public class KitsNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	public KitsNewProjectWizard() {
		super();
		setWindowTitle("New Kits Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("Kits Project");
		mainPage.setDescription("Create a new Kits project.");		
		addPage(mainPage);
	}

	
	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		de.cau.cs.kieler.synccharts.dsl.ui.wizard.KitsProjectInfo projectInfo = new de.cau.cs.kieler.synccharts.dsl.ui.wizard.KitsProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
