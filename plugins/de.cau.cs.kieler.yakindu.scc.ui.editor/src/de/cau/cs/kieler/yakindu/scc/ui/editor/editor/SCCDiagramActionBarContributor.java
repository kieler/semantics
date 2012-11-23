package de.cau.cs.kieler.yakindu.scc.ui.editor.editor;

import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.ui.IActionBars;

public class SCCDiagramActionBarContributor extends DiagramActionBarContributor {

	@Override
	protected String getEditorId() {
		return SCCDiagramEditor.ID;
	}

	@Override
	protected Class<SCCDiagramEditor> getEditorClass() {
		return SCCDiagramEditor.class;
	}

	@Override
	public void init(IActionBars bars) {
		super.init(bars);
		bars.setGlobalActionHandler(GlobalActionId.SAVE, null);
	}
}
