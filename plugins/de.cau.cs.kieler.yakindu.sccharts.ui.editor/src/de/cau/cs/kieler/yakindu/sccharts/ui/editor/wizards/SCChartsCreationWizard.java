package de.cau.cs.kieler.yakindu.sccharts.ui.editor.wizards;

import org.yakindu.sct.ui.editor.wizards.CreationWizard;
import org.yakindu.sct.ui.editor.wizards.CreationWizardPage;

public class SCChartsCreationWizard extends CreationWizard {
	public static final String ID = "de.cau.cs.kieler.yakindu.sccharts.ui.editor.SCChartsCreationWizard";

	@Override
	public void addPages() {
		modelFilePage = new CreationWizardPage("DiagramModelFile",
				getSelection(), "scc");
		modelFilePage.setTitle("SCCharts Diagram");
		modelFilePage
				.setDescription("Create a new SCCharts Diagram File");
		addPage(modelFilePage);
	}

}
