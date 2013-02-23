package de.cau.cs.kieler.yakindu.sccharts.ui.editor.module;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.yakindu.sct.ui.editor.editor.guice.IMetaModelTypeFactory;
import org.yakindu.sct.ui.editor.module.SCTModule;
import org.yakindu.sct.ui.editor.providers.ISCTPaletteFactory;
import org.yakindu.sct.ui.editor.wizards.IDiagramInitializer;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory.KielerDiagramInitializer;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory.KielerMetaModelTypeFactory;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory.KielerPaletteFactory;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts.SyncRegionNameEditPart;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts.SyncStateEditPart;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts.SyncStateNameEditPart;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts.SyncTransitionEditPart;

public class KielerModule extends SCTModule {

	@Override
	protected String getContributorId() {
		return "de.cau.cs.kieler.yakindu.sccharts.ui.editor.SCChartsDiagramEditor";
	}

	@Override
	protected Class<? extends IGraphicalEditPart> getTransitionEditPart() {
		return SyncTransitionEditPart.class;
	}

	@Override
	protected Class<? extends IGraphicalEditPart> getStateEditPart() {
		return SyncStateEditPart.class;
	}

	@Override
	protected Class<? extends IGraphicalEditPart> getRegionNameEditPart() {
		return SyncRegionNameEditPart.class;
	}
	
	@Override
	protected Class<? extends IGraphicalEditPart> getStateNameEditPart() {
		return SyncStateNameEditPart.class;
	}
	
	@Override
	protected Class<? extends IMetaModelTypeFactory> getMetaModelTypeFactory() {
		return KielerMetaModelTypeFactory.class;
	}

	@Override
	protected Class<? extends ISCTPaletteFactory> getPaletteFactory() {
		return KielerPaletteFactory.class;
	}

	@Override
	protected Class<? extends IDiagramInitializer> getDiagramInitializer() {
		return KielerDiagramInitializer.class;
	}

	@Override
	protected String getFileExtension() {
		return "scc";
	}

}
