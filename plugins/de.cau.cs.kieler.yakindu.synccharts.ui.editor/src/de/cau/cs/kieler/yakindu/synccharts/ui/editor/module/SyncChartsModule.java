package de.cau.cs.kieler.yakindu.synccharts.ui.editor.module;

import de.cau.cs.kieler.yakindu.ui.editor.module.KielerModule;


public class SyncChartsModule extends KielerModule {

	@Override
	protected String getContributorId() {
		return "de.cau.cs.kieler.yakindu.synccharts.ui.editor.SyncChartsDiagramEditor";
	}

	@Override
	protected String getFileExtension() {
		return "ysc";
	}

}
