package de.cau.cs.kieler.yakindu.synccharts.ui.editor.editor;

import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.ui.IActionBars;

public class SyncChartsDiagramActionBarContributor extends
DiagramActionBarContributor {

	@Override
	protected String getEditorId() {
		return SyncChartsDiagramEditor.ID;
	}

	@Override
	protected Class<SyncChartsDiagramEditor> getEditorClass() {
		return SyncChartsDiagramEditor.class;
	}

	@Override
	public void init(IActionBars bars) {
		super.init(bars);
		bars.setGlobalActionHandler(GlobalActionId.SAVE, null);
	}
}
