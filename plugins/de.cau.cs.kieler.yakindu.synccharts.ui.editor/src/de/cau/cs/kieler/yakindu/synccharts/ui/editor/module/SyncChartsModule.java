package de.cau.cs.kieler.yakindu.synccharts.ui.editor.module;

import org.yakindu.sct.ui.editor.editor.guice.IMetaModelTypeFactory;
import org.yakindu.sct.ui.editor.providers.ISCTPaletteFactory;

import de.cau.cs.kieler.yakindu.synccharts.ui.editor.factory.SyncChartsMetaModelTypeFactory;
import de.cau.cs.kieler.yakindu.synccharts.ui.editor.factory.SyncChartsPaletteFactory;
import de.cau.cs.kieler.yakindu.ui.editor.module.SyncModule;

public class SyncChartsModule extends SyncModule {

	@Override
	protected String getContributorId() {
		return "de.cau.cs.kieler.yakindu.synccharts.ui.editor.SyncChartsDiagramEditor";
	}

	@Override
	protected Class<? extends IMetaModelTypeFactory> getMetaModelTypeFactory() {
		return SyncChartsMetaModelTypeFactory.class;
	}

	@Override
	protected Class<? extends ISCTPaletteFactory> getPaletteFactory() {
		return SyncChartsPaletteFactory.class;
	}

	@Override
	protected String getFileExtension() {
		return "ysc";
	}

}
