package de.cau.cs.kieler.yakindu.synccharts.ui.editor.wizards;

import org.yakindu.sct.ui.editor.wizards.CreationWizard;
import org.yakindu.sct.ui.editor.wizards.CreationWizardPage;

public class SyncChartsCreationWizard extends CreationWizard {
	public static final String ID = "de.cau.cs.kieler.yakindu.synccharts.ui.editor.wizards.SyncChartsCreationWizard";

	@Override
	public void addPages() {
		modelFilePage = new CreationWizardPage("DiagramModelFile",
				getSelection(), "sync");
		modelFilePage.setTitle("SyncCharts Diagram");
		modelFilePage
				.setDescription("Create a new SyncCharts Diagram File");
		addPage(modelFilePage);
	}

}
