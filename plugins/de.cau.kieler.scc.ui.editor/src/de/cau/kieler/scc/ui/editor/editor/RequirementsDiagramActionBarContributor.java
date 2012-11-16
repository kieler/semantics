package de.cau.kieler.scc.ui.editor.editor;

import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.ui.IActionBars;

public class RequirementsDiagramActionBarContributor extends
		DiagramActionBarContributor {

	@Override
	protected String getEditorId() {
		return RequirementsDiagramEditor.ID;
	}

	@Override
	protected Class<RequirementsDiagramEditor> getEditorClass() {
		return RequirementsDiagramEditor.class;
	}

	@Override
	public void init(IActionBars bars) {
		super.init(bars);
		// workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=346648
		bars.setGlobalActionHandler(GlobalActionId.SAVE, null);
	}
}
