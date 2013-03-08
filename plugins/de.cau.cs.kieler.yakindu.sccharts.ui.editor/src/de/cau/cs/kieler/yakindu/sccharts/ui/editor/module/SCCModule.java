package de.cau.cs.kieler.yakindu.sccharts.ui.editor.module;

import org.yakindu.sct.ui.editor.editor.guice.IMetaModelTypeFactory;
import org.yakindu.sct.ui.editor.providers.ISCTPaletteFactory;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory.SCCMetaModelTypeFactory;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory.SCCPaletteFactory;
import de.cau.cs.kieler.yakindu.ui.editor.module.SyncModule;

public class SCCModule extends SyncModule {

	@Override
	protected String getContributorId() {
		return "de.cau.cs.kieler.yakindu.sccharts.ui.editor.SCChartsDiagramEditor";
	}

	@Override
	protected Class<? extends IMetaModelTypeFactory> getMetaModelTypeFactory() {
		return SCCMetaModelTypeFactory.class;
	}

	@Override
	protected Class<? extends ISCTPaletteFactory> getPaletteFactory() {
		return SCCPaletteFactory.class;
	}

	@Override
	protected String getFileExtension() {
		return "scc";
	}

}
