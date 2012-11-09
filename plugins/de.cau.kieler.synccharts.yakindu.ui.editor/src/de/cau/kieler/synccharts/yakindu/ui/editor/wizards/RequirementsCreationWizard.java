package de.cau.kieler.synccharts.yakindu.ui.editor.wizards;

import org.yakindu.sct.ui.editor.wizards.CreationWizard;
import org.yakindu.sct.ui.editor.wizards.CreationWizardPage;

public class RequirementsCreationWizard extends CreationWizard {
	public static final String ID = "de.cau.kieler.synccharts.yakindu.ui.editor.wizards.RequirementsCreationWizard";

	@Override
	public void addPages() {
		modelFilePage = new CreationWizardPage("DiagramModelFile",
				getSelection(), "kids");
		modelFilePage.setTitle("Synccharts Diagram (Yakindu Editor)");
		modelFilePage
				.setDescription("Create a new SyncCharts Diagram File");
		addPage(modelFilePage);
	}
}
