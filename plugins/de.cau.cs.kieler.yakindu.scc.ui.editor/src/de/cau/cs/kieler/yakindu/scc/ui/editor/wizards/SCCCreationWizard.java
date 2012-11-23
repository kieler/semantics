package de.cau.cs.kieler.yakindu.scc.ui.editor.wizards;

import org.yakindu.sct.ui.editor.wizards.CreationWizard;
import org.yakindu.sct.ui.editor.wizards.CreationWizardPage;

public class SCCCreationWizard extends CreationWizard {
	public static final String ID = "de.cau.cs.kieler.yakindu.scc.ui.editor.SCCCreationWizard";

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
